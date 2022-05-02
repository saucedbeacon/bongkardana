package kotlin.reflect.jvm.internal.impl.renderer;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import org.jetbrains.annotations.NotNull;

final class DescriptorRendererImpl$appendTypeProjections$1 extends Lambda implements Function1<TypeProjection, CharSequence> {
    final /* synthetic */ DescriptorRendererImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    DescriptorRendererImpl$appendTypeProjections$1(DescriptorRendererImpl descriptorRendererImpl) {
        super(1);
        this.this$0 = descriptorRendererImpl;
    }

    @NotNull
    public final CharSequence invoke(@NotNull TypeProjection typeProjection) {
        String str;
        Intrinsics.checkNotNullParameter(typeProjection, "it");
        if (typeProjection.isStarProjection()) {
            str = "*";
        } else {
            DescriptorRendererImpl descriptorRendererImpl = this.this$0;
            KotlinType type = typeProjection.getType();
            Intrinsics.checkNotNullExpressionValue(type, "it.type");
            String renderType = descriptorRendererImpl.renderType(type);
            if (typeProjection.getProjectionKind() == Variance.INVARIANT) {
                str = renderType;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append(typeProjection.getProjectionKind());
                sb.append(' ');
                sb.append(renderType);
                str = sb.toString();
            }
        }
        return str;
    }
}
