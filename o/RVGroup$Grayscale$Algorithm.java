package o;

import com.alipayplus.mobile.component.domain.model.result.BaseRpcResult;
import id.dana.data.base.NetworkException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.TitleBarRightButtonView;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lio/reactivex/ObservableSource;", "Lcom/alipayplus/mobile/component/domain/model/result/BaseRpcResult;", "kotlin.jvm.PlatformType", "throwable", "", "apply"}, k = 3, mv = {1, 4, 2})
final class RVGroup$Grayscale$Algorithm<T, R> implements RedDotDrawable<Throwable, TitleBarRightButtonView.AnonymousClass4<? extends BaseRpcResult>> {
    public static final RVGroup$Grayscale$Algorithm setMax = new RVGroup$Grayscale$Algorithm();

    RVGroup$Grayscale$Algorithm() {
    }

    public final /* synthetic */ Object apply(Object obj) {
        Throwable th = (Throwable) obj;
        Intrinsics.checkNotNullParameter(th, "throwable");
        if (th instanceof NetworkException) {
            NetworkException networkException = (NetworkException) th;
            if (Intrinsics.areEqual((Object) networkException.getErrorCode(), (Object) "AE15001958019001")) {
                BaseRpcResult baseRpcResult = new BaseRpcResult();
                baseRpcResult.errorCode = networkException.getErrorCode();
                baseRpcResult.errorMessage = th.getMessage();
                baseRpcResult.success = true;
                return TitleBarRightButtonView.AnonymousClass1.just(baseRpcResult);
            }
        }
        throw th;
    }
}
