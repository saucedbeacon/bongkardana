package o;

import com.alipay.iap.android.f2fpay.client.callback.IF2FPayResultCallback;
import com.alipay.iap.android.f2fpay.client.pay.F2FPayResult;
import o.TitleBarRightButtonView;

final class getMimeType implements IF2FPayResultCallback {
    private final TitleBarRightButtonView.AnonymousClass2 getMin;
    private final getStream length;

    public getMimeType(getStream getstream, TitleBarRightButtonView.AnonymousClass2 r2) {
        this.length = getstream;
        this.getMin = r2;
    }

    public final void onPayResultArrived(F2FPayResult f2FPayResult) {
        this.length.lambda$getPaymentResult$4(this.getMin, f2FPayResult);
    }
}
