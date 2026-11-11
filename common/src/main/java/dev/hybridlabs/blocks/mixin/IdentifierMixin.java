package dev.hybridlabs.blocks.mixin;

import net.minecraft.resources.Identifier;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.Objects;

@Mixin(Identifier.class)
public class IdentifierMixin {
    @Mutable
    @Shadow
    @Final
    private String namespace;

    @Inject(method = "<init>(Ljava/lang/String;Ljava/lang/String;)V", at = @At("TAIL"))
    private void onInit(String namespace, String path, CallbackInfo ci) {
        // because DFU can suck my-
        if (Objects.equals(namespace, "hybrid-blocks")) {
            this.namespace = "hybrid_blocks";
        }
    }
}