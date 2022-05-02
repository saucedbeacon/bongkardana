package kotlin.reflect.jvm.internal.impl.load.java.structure;

import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import org.jetbrains.annotations.NotNull;

public final class JavaLoadingKt {
    public static final boolean isObjectMethodInInterface(@NotNull JavaMember javaMember) {
        Intrinsics.checkNotNullParameter(javaMember, "<this>");
        return javaMember.getContainingClass().isInterface() && (javaMember instanceof JavaMethod) && isObjectMethod((JavaMethod) javaMember);
    }

    private static final boolean isObjectMethod(JavaMethod javaMethod) {
        String asString = javaMethod.getName().asString();
        int hashCode = asString.hashCode();
        if (hashCode != -1776922004) {
            if (hashCode != -1295482945) {
                if (hashCode != 147696667 || !asString.equals("hashCode")) {
                    return false;
                }
            } else if (!asString.equals("equals")) {
                return false;
            } else {
                return isMethodWithOneObjectParameter(javaMethod);
            }
        } else if (!asString.equals("toString")) {
            return false;
        }
        return javaMethod.getValueParameters().isEmpty();
    }

    private static final boolean isMethodWithOneObjectParameter(JavaMethod javaMethod) {
        FqName fqName;
        JavaValueParameter javaValueParameter = (JavaValueParameter) CollectionsKt.singleOrNull(javaMethod.getValueParameters());
        JavaClassifierType javaClassifierType = null;
        JavaType type = javaValueParameter == null ? null : javaValueParameter.getType();
        if (type instanceof JavaClassifierType) {
            javaClassifierType = (JavaClassifierType) type;
        }
        if (javaClassifierType == null) {
            return false;
        }
        JavaClassifier classifier = javaClassifierType.getClassifier();
        if (!(classifier instanceof JavaClass) || (fqName = ((JavaClass) classifier).getFqName()) == null || !Intrinsics.areEqual((Object) fqName.asString(), (Object) "java.lang.Object")) {
            return false;
        }
        return true;
    }
}
