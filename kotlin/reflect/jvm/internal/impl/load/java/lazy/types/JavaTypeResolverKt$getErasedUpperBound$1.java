package kotlin.reflect.jvm.internal.impl.load.java.lazy.types;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.types.ErrorUtils;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import org.jetbrains.annotations.NotNull;

final class JavaTypeResolverKt$getErasedUpperBound$1 extends Lambda implements Function0<SimpleType> {
    final /* synthetic */ TypeParameterDescriptor $this_getErasedUpperBound;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    JavaTypeResolverKt$getErasedUpperBound$1(TypeParameterDescriptor typeParameterDescriptor) {
        super(0);
        this.$this_getErasedUpperBound = typeParameterDescriptor;
    }

    @NotNull
    public final SimpleType invoke() {
        StringBuilder sb = new StringBuilder("Can't compute erased upper bound of type parameter `");
        sb.append(this.$this_getErasedUpperBound);
        sb.append('`');
        SimpleType createErrorType = ErrorUtils.createErrorType(sb.toString());
        Intrinsics.checkNotNullExpressionValue(createErrorType, "createErrorType(\"Can't compute erased upper bound of type parameter `$this`\")");
        return createErrorType;
    }
}
