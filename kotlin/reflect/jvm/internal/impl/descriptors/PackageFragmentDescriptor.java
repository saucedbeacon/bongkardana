package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import org.jetbrains.annotations.NotNull;

public interface PackageFragmentDescriptor extends ClassOrPackageFragmentDescriptor {
    @NotNull
    ModuleDescriptor getContainingDeclaration();

    @NotNull
    FqName getFqName();

    @NotNull
    MemberScope getMemberScope();
}
