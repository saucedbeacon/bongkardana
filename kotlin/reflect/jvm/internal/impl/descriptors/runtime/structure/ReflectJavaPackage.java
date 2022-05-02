package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaPackage;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class ReflectJavaPackage extends ReflectJavaElement implements JavaPackage {
    @NotNull
    private final FqName fqName;

    @Nullable
    public final JavaAnnotation findAnnotation(@NotNull FqName fqName2) {
        Intrinsics.checkNotNullParameter(fqName2, "fqName");
        return null;
    }

    public final boolean isDeprecatedInJavaDoc() {
        return false;
    }

    public ReflectJavaPackage(@NotNull FqName fqName2) {
        Intrinsics.checkNotNullParameter(fqName2, "fqName");
        this.fqName = fqName2;
    }

    @NotNull
    public final FqName getFqName() {
        return this.fqName;
    }

    @NotNull
    public final Collection<JavaClass> getClasses(@NotNull Function1<? super Name, Boolean> function1) {
        Intrinsics.checkNotNullParameter(function1, "nameFilter");
        return CollectionsKt.emptyList();
    }

    @NotNull
    public final Collection<JavaPackage> getSubPackages() {
        return CollectionsKt.emptyList();
    }

    @NotNull
    public final List<JavaAnnotation> getAnnotations() {
        return CollectionsKt.emptyList();
    }

    public final boolean equals(@Nullable Object obj) {
        return (obj instanceof ReflectJavaPackage) && Intrinsics.areEqual((Object) getFqName(), (Object) ((ReflectJavaPackage) obj).getFqName());
    }

    public final int hashCode() {
        return getFqName().hashCode();
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getName());
        sb.append(": ");
        sb.append(getFqName());
        return sb.toString();
    }
}
