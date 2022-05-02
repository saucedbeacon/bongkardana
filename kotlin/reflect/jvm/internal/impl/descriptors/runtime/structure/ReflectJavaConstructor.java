package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaConstructor;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaValueParameter;
import org.jetbrains.annotations.NotNull;

public final class ReflectJavaConstructor extends ReflectJavaMember implements JavaConstructor {
    @NotNull
    private final Constructor<?> member;

    public ReflectJavaConstructor(@NotNull Constructor<?> constructor) {
        Intrinsics.checkNotNullParameter(constructor, "member");
        this.member = constructor;
    }

    @NotNull
    public final Constructor<?> getMember() {
        return this.member;
    }

    @NotNull
    public final List<JavaValueParameter> getValueParameters() {
        Type[] genericParameterTypes = getMember().getGenericParameterTypes();
        Intrinsics.checkNotNullExpressionValue(genericParameterTypes, "types");
        if (genericParameterTypes.length == 0) {
            return CollectionsKt.emptyList();
        }
        Class<?> declaringClass = getMember().getDeclaringClass();
        if (declaringClass.getDeclaringClass() != null && !Modifier.isStatic(declaringClass.getModifiers())) {
            genericParameterTypes = (Type[]) ArraysKt.copyOfRange((T[]) genericParameterTypes, 1, genericParameterTypes.length);
        }
        Annotation[][] parameterAnnotations = getMember().getParameterAnnotations();
        Object[] objArr = (Object[]) parameterAnnotations;
        if (objArr.length >= genericParameterTypes.length) {
            if (objArr.length > genericParameterTypes.length) {
                Intrinsics.checkNotNullExpressionValue(parameterAnnotations, "annotations");
                parameterAnnotations = (Annotation[][]) ArraysKt.copyOfRange((T[]) objArr, objArr.length - genericParameterTypes.length, objArr.length);
            }
            Intrinsics.checkNotNullExpressionValue(genericParameterTypes, "realTypes");
            Intrinsics.checkNotNullExpressionValue(parameterAnnotations, "realAnnotations");
            return getValueParameters(genericParameterTypes, parameterAnnotations, getMember().isVarArgs());
        }
        throw new IllegalStateException(Intrinsics.stringPlus("Illegal generic signature: ", getMember()));
    }

    @NotNull
    public final List<ReflectJavaTypeParameter> getTypeParameters() {
        TypeVariable[] typeParameters = getMember().getTypeParameters();
        Intrinsics.checkNotNullExpressionValue(typeParameters, "member.typeParameters");
        Object[] objArr = (Object[]) typeParameters;
        Collection arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            arrayList.add(new ReflectJavaTypeParameter((TypeVariable) obj));
        }
        return (List) arrayList;
    }
}
