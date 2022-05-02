package kotlin.reflect.jvm.internal.impl.load.java.lazy.types;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import org.jetbrains.annotations.NotNull;

final class JavaTypeResolver$computeArguments$1$erasedUpperBound$1 extends Lambda implements Function0<KotlinType> {
    final /* synthetic */ JavaTypeAttributes $attr;
    final /* synthetic */ TypeConstructor $constructor;
    final /* synthetic */ TypeParameterDescriptor $parameter;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    JavaTypeResolver$computeArguments$1$erasedUpperBound$1(TypeParameterDescriptor typeParameterDescriptor, JavaTypeAttributes javaTypeAttributes, TypeConstructor typeConstructor) {
        super(0);
        this.$parameter = typeParameterDescriptor;
        this.$attr = javaTypeAttributes;
        this.$constructor = typeConstructor;
    }

    @NotNull
    public final KotlinType invoke() {
        TypeParameterDescriptor typeParameterDescriptor = this.$parameter;
        Intrinsics.checkNotNullExpressionValue(typeParameterDescriptor, "parameter");
        TypeParameterDescriptor upperBoundOfTypeParameter = this.$attr.getUpperBoundOfTypeParameter();
        final TypeConstructor typeConstructor = this.$constructor;
        return JavaTypeResolverKt.getErasedUpperBound(typeParameterDescriptor, upperBoundOfTypeParameter, new Function0<KotlinType>() {
            @NotNull
            public final KotlinType invoke() {
                ClassifierDescriptor declarationDescriptor = typeConstructor.getDeclarationDescriptor();
                Intrinsics.checkNotNull(declarationDescriptor);
                SimpleType defaultType = declarationDescriptor.getDefaultType();
                Intrinsics.checkNotNullExpressionValue(defaultType, "constructor.declarationDescriptor!!.defaultType");
                return TypeUtilsKt.replaceArgumentsWithStarProjections(defaultType);
            }
        });
    }
}
