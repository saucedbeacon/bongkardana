package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaValueParameter;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class ReflectJavaValueParameter extends ReflectJavaElement implements JavaValueParameter {
    private final boolean isVararg;
    @NotNull
    private final Annotation[] reflectAnnotations;
    @Nullable
    private final String reflectName;
    @NotNull
    private final ReflectJavaType type;

    public final boolean isDeprecatedInJavaDoc() {
        return false;
    }

    @NotNull
    public final ReflectJavaType getType() {
        return this.type;
    }

    public final boolean isVararg() {
        return this.isVararg;
    }

    public ReflectJavaValueParameter(@NotNull ReflectJavaType reflectJavaType, @NotNull Annotation[] annotationArr, @Nullable String str, boolean z) {
        Intrinsics.checkNotNullParameter(reflectJavaType, "type");
        Intrinsics.checkNotNullParameter(annotationArr, "reflectAnnotations");
        this.type = reflectJavaType;
        this.reflectAnnotations = annotationArr;
        this.reflectName = str;
        this.isVararg = z;
    }

    @NotNull
    public final List<ReflectJavaAnnotation> getAnnotations() {
        return ReflectJavaAnnotationOwnerKt.getAnnotations(this.reflectAnnotations);
    }

    @Nullable
    public final ReflectJavaAnnotation findAnnotation(@NotNull FqName fqName) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        return ReflectJavaAnnotationOwnerKt.findAnnotation(this.reflectAnnotations, fqName);
    }

    @Nullable
    public final Name getName() {
        String str = this.reflectName;
        if (str == null) {
            return null;
        }
        return Name.guessByFirstCharacter(str);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getName());
        sb.append(": ");
        sb.append(isVararg() ? "vararg " : "");
        sb.append(getName());
        sb.append(": ");
        sb.append(getType());
        return sb.toString();
    }
}
