package kotlin.reflect.jvm.internal.impl.descriptors;

import org.jetbrains.annotations.NotNull;

public interface DeclarationDescriptorNonRoot extends DeclarationDescriptorWithSource {
    @NotNull
    DeclarationDescriptor getContainingDeclaration();
}
