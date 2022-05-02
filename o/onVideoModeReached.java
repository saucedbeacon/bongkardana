package o;

import id.dana.richview.PaymentCardsView;

public final class onVideoModeReached implements Runnable {
    private final PaymentCardsView setMax;

    public onVideoModeReached(PaymentCardsView paymentCardsView) {
        this.setMax = paymentCardsView;
    }

    public final void run() {
        PaymentCardsView.length(this.setMax);
    }
}
