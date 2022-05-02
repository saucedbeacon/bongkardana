package o;

import id.dana.richview.PaymentCardsView;

public final class onCameraFacingChanged implements Runnable {
    private final PaymentCardsView getMax;

    public onCameraFacingChanged(PaymentCardsView paymentCardsView) {
        this.getMax = paymentCardsView;
    }

    public final void run() {
        this.getMax.bcvPaymentMethod.startExpandingAnimation();
    }
}
