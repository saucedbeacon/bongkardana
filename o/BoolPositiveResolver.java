package o;

import com.alipay.iap.android.f2fpay.client.callback.IF2FPayResultCallback;
import com.alipay.iap.android.f2fpay.client.pay.F2FPayResult;

final class BoolPositiveResolver implements IF2FPayResultCallback {
    private final IComponent getMin;

    public BoolPositiveResolver(IComponent iComponent) {
        this.getMin = iComponent;
    }

    public final void onPayResultArrived(F2FPayResult f2FPayResult) {
        this.getMin.onNext(f2FPayResult);
    }
}
