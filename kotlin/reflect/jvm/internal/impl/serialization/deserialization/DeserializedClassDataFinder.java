package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderKt;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class DeserializedClassDataFinder implements ClassDataFinder {
    @NotNull
    private final PackageFragmentProvider packageFragmentProvider;

    public DeserializedClassDataFinder(@NotNull PackageFragmentProvider packageFragmentProvider2) {
        Intrinsics.checkNotNullParameter(packageFragmentProvider2, "packageFragmentProvider");
        this.packageFragmentProvider = packageFragmentProvider2;
    }

    @Nullable
    public final ClassData findClassData(@NotNull ClassId classId) {
        ClassData findClassData;
        Intrinsics.checkNotNullParameter(classId, "classId");
        PackageFragmentProvider packageFragmentProvider2 = this.packageFragmentProvider;
        FqName packageFqName = classId.getPackageFqName();
        Intrinsics.checkNotNullExpressionValue(packageFqName, "classId.packageFqName");
        for (PackageFragmentDescriptor next : PackageFragmentProviderKt.packageFragments(packageFragmentProvider2, packageFqName)) {
            if ((next instanceof DeserializedPackageFragment) && (findClassData = ((DeserializedPackageFragment) next).getClassDataFinder().findClassData(classId)) != null) {
                return findClassData;
            }
        }
        return null;
    }
}
