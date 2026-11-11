package dev.hybridlabs.blocks.platform.registration;

import net.minecraft.core.Holder;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.Identifier;

import java.util.function.Supplier;

/**
 * Represents a lazy wrapper for registry object.
 *
 * @param <T> the type of the object
 */
public interface RegistryObject<T> extends Supplier<T> {

    ResourceKey<T> getResourceKey();

    Identifier getId();

    @Override
    T get();

    Holder<T> asHolder();
}