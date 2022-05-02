package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Member;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibility;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaAnnotationOwner;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaModifierListOwner;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMember;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaValueParameter;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.name.SpecialNames;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public abstract class ReflectJavaMember extends ReflectJavaElement implements ReflectJavaAnnotationOwner, ReflectJavaModifierListOwner, JavaMember {
    @NotNull
    public abstract Member getMember();

    @Nullable
    public ReflectJavaAnnotation findAnnotation(@NotNull FqName fqName) {
        return ReflectJavaAnnotationOwner.DefaultImpls.findAnnotation(this, fqName);
    }

    @NotNull
    public List<ReflectJavaAnnotation> getAnnotations() {
        return ReflectJavaAnnotationOwner.DefaultImpls.getAnnotations(this);
    }

    @NotNull
    public Visibility getVisibility() {
        return ReflectJavaModifierListOwner.DefaultImpls.getVisibility(this);
    }

    public boolean isAbstract() {
        return ReflectJavaModifierListOwner.DefaultImpls.isAbstract(this);
    }

    public boolean isDeprecatedInJavaDoc() {
        return ReflectJavaAnnotationOwner.DefaultImpls.isDeprecatedInJavaDoc(this);
    }

    public boolean isFinal() {
        return ReflectJavaModifierListOwner.DefaultImpls.isFinal(this);
    }

    public boolean isStatic() {
        return ReflectJavaModifierListOwner.DefaultImpls.isStatic(this);
    }

    @NotNull
    public AnnotatedElement getElement() {
        return (AnnotatedElement) getMember();
    }

    public int getModifiers() {
        return getMember().getModifiers();
    }

    @NotNull
    public Name getName() {
        String name = getMember().getName();
        Name identifier = name == null ? null : Name.identifier(name);
        if (identifier != null) {
            return identifier;
        }
        Name name2 = SpecialNames.NO_NAME_PROVIDED;
        Intrinsics.checkNotNullExpressionValue(name2, "NO_NAME_PROVIDED");
        return name2;
    }

    @NotNull
    public ReflectJavaClass getContainingClass() {
        Class<?> declaringClass = getMember().getDeclaringClass();
        Intrinsics.checkNotNullExpressionValue(declaringClass, "member.declaringClass");
        return new ReflectJavaClass(declaringClass);
    }

    /* access modifiers changed from: protected */
    @NotNull
    public final List<JavaValueParameter> getValueParameters(@NotNull Type[] typeArr, @NotNull Annotation[][] annotationArr, boolean z) {
        Integer num;
        String str;
        Intrinsics.checkNotNullParameter(typeArr, "parameterTypes");
        Intrinsics.checkNotNullParameter(annotationArr, "parameterAnnotations");
        ArrayList arrayList = new ArrayList(typeArr.length);
        List<String> loadParameterNames = Java8ParameterNamesLoader.INSTANCE.loadParameterNames(getMember());
        if (loadParameterNames == null) {
            num = null;
        } else {
            num = Integer.valueOf(loadParameterNames.size());
        }
        int intValue = num == null ? 0 : num.intValue() - typeArr.length;
        int length = typeArr.length - 1;
        if (length >= 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                ReflectJavaType create = ReflectJavaType.Factory.create(typeArr[i]);
                if (loadParameterNames == null) {
                    str = null;
                } else {
                    str = (String) CollectionsKt.getOrNull(loadParameterNames, i + intValue);
                    if (str == null) {
                        StringBuilder sb = new StringBuilder("No parameter with index ");
                        sb.append(i);
                        sb.append('+');
                        sb.append(intValue);
                        sb.append(" (name=");
                        sb.append(getName());
                        sb.append(" type=");
                        sb.append(create);
                        sb.append(") in ");
                        sb.append(loadParameterNames);
                        sb.append("@ReflectJavaMember");
                        throw new IllegalStateException(sb.toString().toString());
                    }
                }
                arrayList.add(new ReflectJavaValueParameter(create, annotationArr[i], str, z && i == ArraysKt.getLastIndex((T[]) typeArr)));
                if (i2 > length) {
                    break;
                }
                i = i2;
            }
        }
        return arrayList;
    }

    public boolean equals(@Nullable Object obj) {
        return (obj instanceof ReflectJavaMember) && Intrinsics.areEqual((Object) getMember(), (Object) ((ReflectJavaMember) obj).getMember());
    }

    public int hashCode() {
        return getMember().hashCode();
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getName());
        sb.append(": ");
        sb.append(getMember());
        return sb.toString();
    }
}
