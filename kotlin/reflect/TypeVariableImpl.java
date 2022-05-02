package kotlin.reflect;

import java.lang.annotation.Annotation;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.ExperimentalStdlibApi;
import kotlin.Metadata;
import kotlin.NotImplementedError;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u001b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0013\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0002J\u0011\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0002\u0010\u000eJ%\u0010\u000f\u001a\u0004\u0018\u0001H\u0010\"\b\b\u0000\u0010\u0010*\u00020\r2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\u00100\u0012¢\u0006\u0002\u0010\u0013J\u0011\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0002\u0010\u000eJ\u0013\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\fH\u0016¢\u0006\u0002\u0010\u0017J\u0011\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0002\u0010\u000eJ\b\u0010\u0019\u001a\u00020\u0002H\u0016J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u001bH\u0016J\b\u0010\u001d\u001a\u00020\u001eH\u0016J\b\u0010\u001f\u001a\u00020\u001bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lkotlin/reflect/TypeVariableImpl;", "Ljava/lang/reflect/TypeVariable;", "Ljava/lang/reflect/GenericDeclaration;", "Lkotlin/reflect/TypeImpl;", "typeParameter", "Lkotlin/reflect/KTypeParameter;", "(Lkotlin/reflect/KTypeParameter;)V", "equals", "", "other", "", "getAnnotatedBounds", "", "", "()[Ljava/lang/annotation/Annotation;", "getAnnotation", "T", "annotationClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;", "getAnnotations", "getBounds", "Ljava/lang/reflect/Type;", "()[Ljava/lang/reflect/Type;", "getDeclaredAnnotations", "getGenericDeclaration", "getName", "", "getTypeName", "hashCode", "", "toString", "kotlin-stdlib"}, k = 1, mv = {1, 4, 1})
@ExperimentalStdlibApi
final class TypeVariableImpl implements TypeVariable<GenericDeclaration>, TypeImpl {
    private final KTypeParameter typeParameter;

    @NotNull
    public final Annotation[] getAnnotatedBounds() {
        return new Annotation[0];
    }

    @Nullable
    public final <T extends Annotation> T getAnnotation(@NotNull Class<T> cls) {
        Intrinsics.checkNotNullParameter(cls, "annotationClass");
        return null;
    }

    @NotNull
    public final Annotation[] getAnnotations() {
        return new Annotation[0];
    }

    @NotNull
    public final Annotation[] getDeclaredAnnotations() {
        return new Annotation[0];
    }

    public TypeVariableImpl(@NotNull KTypeParameter kTypeParameter) {
        Intrinsics.checkNotNullParameter(kTypeParameter, "typeParameter");
        this.typeParameter = kTypeParameter;
    }

    @NotNull
    public final String getName() {
        return this.typeParameter.getName();
    }

    @NotNull
    public final GenericDeclaration getGenericDeclaration() {
        StringBuilder sb = new StringBuilder("getGenericDeclaration() is not yet supported for type variables created from KType: ");
        sb.append(this.typeParameter);
        throw new NotImplementedError("An operation is not implemented: ".concat(String.valueOf(sb.toString())));
    }

    @NotNull
    public final Type[] getBounds() {
        Iterable<KType> upperBounds = this.typeParameter.getUpperBounds();
        Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(upperBounds, 10));
        for (KType access$computeJavaType : upperBounds) {
            arrayList.add(TypesJVMKt.computeJavaType(access$computeJavaType, true));
        }
        Object[] array = ((List) arrayList).toArray(new Type[0]);
        if (array != null) {
            return (Type[]) array;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    @NotNull
    public final String getTypeName() {
        return getName();
    }

    public final boolean equals(@Nullable Object obj) {
        if (!(obj instanceof TypeVariable)) {
            return false;
        }
        TypeVariable typeVariable = (TypeVariable) obj;
        return Intrinsics.areEqual((Object) getName(), (Object) typeVariable.getName()) && Intrinsics.areEqual((Object) getGenericDeclaration(), (Object) typeVariable.getGenericDeclaration());
    }

    public final int hashCode() {
        return getName().hashCode() ^ getGenericDeclaration().hashCode();
    }

    @NotNull
    public final String toString() {
        return getTypeName();
    }
}
