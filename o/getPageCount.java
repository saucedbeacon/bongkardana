package o;

import id.dana.data.h5event.sendmoney.CheckoutFinishEntity;
import o.TitleBarRightButtonView;

public class getPageCount implements GriverHttpRequestAPIExtension {
    public TitleBarRightButtonView.AnonymousClass1<Boolean> getCheckoutH5Event() {
        return TitleBarRightButtonView.AnonymousClass1.defer(getCurrentIndex.setMin);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void lambda$getCheckoutH5Event$0(TitleBarRightButtonView.AnonymousClass2 r0, CheckoutFinishEntity checkoutFinishEntity) {
        if (checkoutFinishEntity != null) {
            r0.onNext(Boolean.valueOf(checkoutFinishEntity.getApiSuccess()));
            r0.onComplete();
            return;
        }
        r0.onError(new NullPointerException());
    }
}
