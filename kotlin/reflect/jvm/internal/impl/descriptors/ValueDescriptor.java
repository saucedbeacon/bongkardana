package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import org.jetbrains.annotations.NotNull;

public interface ValueDescriptor extends CallableDescriptor {
    @NotNull
    DeclarationDescriptor getContainingDeclaration();

    @NotNull
    KotlinType getType();
}
