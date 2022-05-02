package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import org.jetbrains.annotations.NotNull;

public interface PackageViewDescriptor extends DeclarationDescriptor {
    @NotNull
    FqName getFqName();

    @NotNull
    List<PackageFragmentDescriptor> getFragments();

    @NotNull
    MemberScope getMemberScope();

    @NotNull
    ModuleDescriptor getModule();

    boolean isEmpty();

    public static final class DefaultImpls {
        public static boolean isEmpty(@NotNull PackageViewDescriptor packageViewDescriptor) {
            Intrinsics.checkNotNullParameter(packageViewDescriptor, "this");
            return packageViewDescriptor.getFragments().isEmpty();
        }
    }
}
