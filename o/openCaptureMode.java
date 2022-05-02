package o;

import dagger.internal.InjectedFieldSignature;
import id.dana.richview.promoclaim.PromoClaimView;
import o.openRecordMode;

public final class openCaptureMode implements getBindingAdapter<PromoClaimView> {
    @InjectedFieldSignature("id.dana.richview.promoclaim.PromoClaimView.presenter")
    public static void getMax(PromoClaimView promoClaimView, openRecordMode.setMin setmin) {
        promoClaimView.presenter = setmin;
    }
}
