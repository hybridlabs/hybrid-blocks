package dev.hybridlabs.blocks.mixin;

import dev.hybridlabs.blocks.*;
import net.minecraft.resources.*;
import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;

import java.util.*;
import java.util.stream.*;

@Mixin(Identifier.class)
public class IdentifierMixin {
    private static final Set<String> DYE_COLORS = Set.of(
        "white", "orange", "magenta", "light_blue", "yellow", "lime", "pink",
        "gray", "light_gray", "cyan", "purple", "blue", "brown", "green", "red", "black"
    );

    /**
     * Vanilla 26.3 added wool and concrete slabs and stairs, so ours were removed. This remaps
     * every removed identifier onto its vanilla counterpart, which upgrades stored block states,
     * items and any other DFU reference the mod's old ids appear in. The paths are identical,
     * only the namespace changes.
     */
    private static final Set<String> REMOVED_PATHS_TO_VANILLA = DYE_COLORS.stream()
        .flatMap(color -> java.util.stream.Stream.of(
            color + "_wool_stairs", color + "_wool_slab",
            color + "_concrete_stairs", color + "_concrete_slab"
        ))
        .collect(Collectors.toUnmodifiableSet());

    @Mutable
    @Shadow
    @Final
    private String namespace;

    @Inject(method = "<init>(Ljava/lang/String;Ljava/lang/String;)V", at = @At("TAIL"))
    private void onInit(String namespace, String path, CallbackInfo ci) {
        // because DFU can suck my-
        if (Objects.equals(namespace, "hybrid-blocks")) {
            namespace = Constants.MOD_ID;
        }

        if (Objects.equals(namespace, Constants.MOD_ID) && REMOVED_PATHS_TO_VANILLA.contains(path)) {
            this.namespace = Identifier.DEFAULT_NAMESPACE;
        }
    }
}
