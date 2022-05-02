package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaType;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifier;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifierType;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaType;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class ReflectJavaClassifierType extends ReflectJavaType implements JavaClassifierType {
    @NotNull
    private final JavaClassifier classifier;
    @NotNull
    private final Type reflectType;

    @Nullable
    public final JavaAnnotation findAnnotation(@NotNull FqName fqName) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        return null;
    }

    public final boolean isDeprecatedInJavaDoc() {
        return false;
    }

    public ReflectJavaClassifierType(@NotNull Type type) {
        JavaClassifier javaClassifier;
        Intrinsics.checkNotNullParameter(type, "reflectType");
        this.reflectType = type;
        Type reflectType2 = getReflectType();
        if (reflectType2 instanceof Class) {
            javaClassifier = new ReflectJavaClass((Class) reflectType2);
        } else if (reflectType2 instanceof TypeVariable) {
            javaClassifier = new ReflectJavaTypeParameter((TypeVariable) reflectType2);
        } else if (reflectType2 instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) reflectType2).getRawType();
            if (rawType != null) {
                javaClassifier = new ReflectJavaClass((Class) rawType);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.Class<*>");
            }
        } else {
            StringBuilder sb = new StringBuilder("Not a classifier type (");
            sb.append(reflectType2.getClass());
            sb.append("): ");
            sb.append(reflectType2);
            throw new IllegalStateException(sb.toString());
        }
        this.classifier = javaClassifier;
    }

    @NotNull
    public final Type getReflectType() {
        return this.reflectType;
    }

    @NotNull
    public final JavaClassifier getClassifier() {
        return this.classifier;
    }

    @NotNull
    public final String getClassifierQualifiedName() {
        throw new UnsupportedOperationException(Intrinsics.stringPlus("Type not found: ", getReflectType()));
    }

    @NotNull
    public final String getPresentableText() {
        return getReflectType().toString();
    }

    public final boolean isRaw() {
        Type reflectType2 = getReflectType();
        if (reflectType2 instanceof Class) {
            TypeVariable[] typeParameters = ((Class) reflectType2).getTypeParameters();
            Intrinsics.checkNotNullExpressionValue(typeParameters, "getTypeParameters()");
            if (!(((Object[]) typeParameters).length == 0)) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    public final List<JavaType> getTypeArguments() {
        Iterable<Type> parameterizedTypeArguments = ReflectClassUtilKt.getParameterizedTypeArguments(getReflectType());
        ReflectJavaType.Factory factory = ReflectJavaType.Factory;
        Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(parameterizedTypeArguments, 10));
        for (Type create : parameterizedTypeArguments) {
            arrayList.add(factory.create(create));
        }
        return (List) arrayList;
    }

    @NotNull
    public final Collection<JavaAnnotation> getAnnotations() {
        return CollectionsKt.emptyList();
    }
}
