package o;

import com.alipayplus.mobile.component.domain.model.result.BaseRpcResult;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lid/dana/domain/otp/model/VerifyOtpRiskResponse;", "kotlin.jvm.PlatformType", "it", "Lcom/alipayplus/mobile/component/domain/model/result/BaseRpcResult;", "apply"}, k = 3, mv = {1, 4, 2})
final class loop$FastBitmap$CoordinateSystem<T, R> implements RedDotDrawable<BaseRpcResult, filterBundle> {
    public static final loop$FastBitmap$CoordinateSystem setMax = new loop$FastBitmap$CoordinateSystem();

    loop$FastBitmap$CoordinateSystem() {
    }

    public final /* synthetic */ Object apply(Object obj) {
        BaseRpcResult baseRpcResult = (BaseRpcResult) obj;
        Intrinsics.checkNotNullParameter(baseRpcResult, "it");
        boolean z = baseRpcResult.success;
        String str = baseRpcResult.errorCode;
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        String str3 = baseRpcResult.errorMessage;
        if (str3 != null) {
            str2 = str3;
        }
        return new filterBundle(z, str, str2);
    }
}
