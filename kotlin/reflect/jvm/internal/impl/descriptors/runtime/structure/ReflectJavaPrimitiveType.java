package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.util.Collection;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaPrimitiveType;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class ReflectJavaPrimitiveType extends ReflectJavaType implements JavaPrimitiveType {
    @NotNull
    private final Collection<JavaAnnotation> annotations = CollectionsKt.emptyList();
    private final boolean isDeprecatedInJavaDoc;
    @NotNull
    private final Class<?> reflectType;

    public ReflectJavaPrimitiveType(@NotNull Class<?> cls) {
        Intrinsics.checkNotNullParameter(cls, "reflectType");
        this.reflectType = cls;
    }

    /* access modifiers changed from: protected */
    @NotNull
    public final Class<?> getReflectType() {
        return this.reflectType;
    }

    @Nullable
    public final PrimitiveType getType() {
        if (Intrinsics.areEqual((Object) getReflectType(), (Object) Void.TYPE)) {
            return null;
        }
        return JvmPrimitiveType.get(getReflectType().getName()).getPrimitiveType();
    }

    @NotNull
    public final Collection<JavaAnnotation> getAnnotations() {
        return this.annotations;
    }

    public final boolean isDeprecatedInJavaDoc() {
        return this.isDeprecatedInJavaDoc;
    }
}
