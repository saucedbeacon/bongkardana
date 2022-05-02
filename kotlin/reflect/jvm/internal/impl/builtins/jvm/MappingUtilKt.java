package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin._Assertions;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructorSubstitution;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import org.jetbrains.annotations.NotNull;

public final class MappingUtilKt {
    @NotNull
    public static final TypeConstructorSubstitution createMappedTypeParametersSubstitution(@NotNull ClassDescriptor classDescriptor, @NotNull ClassDescriptor classDescriptor2) {
        Intrinsics.checkNotNullParameter(classDescriptor, "from");
        Intrinsics.checkNotNullParameter(classDescriptor2, "to");
        boolean z = classDescriptor.getDeclaredTypeParameters().size() == classDescriptor2.getDeclaredTypeParameters().size();
        if (!_Assertions.ENABLED || z) {
            TypeConstructorSubstitution.Companion companion = TypeConstructorSubstitution.Companion;
            List<TypeParameterDescriptor> declaredTypeParameters = classDescriptor.getDeclaredTypeParameters();
            Intrinsics.checkNotNullExpressionValue(declaredTypeParameters, "from.declaredTypeParameters");
            Iterable<TypeParameterDescriptor> iterable = declaredTypeParameters;
            Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
            for (TypeParameterDescriptor typeConstructor : iterable) {
                arrayList.add(typeConstructor.getTypeConstructor());
            }
            Iterable iterable2 = (List) arrayList;
            List<TypeParameterDescriptor> declaredTypeParameters2 = classDescriptor2.getDeclaredTypeParameters();
            Intrinsics.checkNotNullExpressionValue(declaredTypeParameters2, "to.declaredTypeParameters");
            Iterable<TypeParameterDescriptor> iterable3 = declaredTypeParameters2;
            Collection arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable3, 10));
            for (TypeParameterDescriptor defaultType : iterable3) {
                SimpleType defaultType2 = defaultType.getDefaultType();
                Intrinsics.checkNotNullExpressionValue(defaultType2, "it.defaultType");
                arrayList2.add(TypeUtilsKt.asTypeProjection(defaultType2));
            }
            return TypeConstructorSubstitution.Companion.createByConstructorsMap$default(companion, MapsKt.toMap(CollectionsKt.zip(iterable2, (List) arrayList2)), false, 2, (Object) null);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(classDescriptor);
        sb.append(" and ");
        sb.append(classDescriptor2);
        sb.append(" should have same number of type parameters, but ");
        sb.append(classDescriptor.getDeclaredTypeParameters().size());
        sb.append(" / ");
        sb.append(classDescriptor2.getDeclaredTypeParameters().size());
        sb.append(" found");
        throw new AssertionError(sb.toString());
    }
}
