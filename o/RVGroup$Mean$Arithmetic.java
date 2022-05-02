package o;

import com.alipayplus.mobile.component.domain.model.result.BaseRpcResult;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "it", "Lcom/alipayplus/mobile/component/domain/model/result/BaseRpcResult;", "apply", "(Lcom/alipayplus/mobile/component/domain/model/result/BaseRpcResult;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 4, 2})
final class RVGroup$Mean$Arithmetic<T, R> implements RedDotDrawable<BaseRpcResult, Boolean> {
    public static final RVGroup$Mean$Arithmetic setMax = new RVGroup$Mean$Arithmetic();

    RVGroup$Mean$Arithmetic() {
    }

    public final /* synthetic */ Object apply(Object obj) {
        BaseRpcResult baseRpcResult = (BaseRpcResult) obj;
        Intrinsics.checkNotNullParameter(baseRpcResult, "it");
        return Boolean.valueOf(baseRpcResult.success);
    }
}
