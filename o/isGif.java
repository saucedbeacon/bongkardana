package o;

import id.dana.sendmoney.bank.other.OtherBankAccountView;

public final class isGif implements RedDotDrawable {
    private final OtherBankAccountView getMax;

    public isGif(OtherBankAccountView otherBankAccountView) {
        this.getMax = otherBankAccountView;
    }

    public final Object apply(Object obj) {
        return OtherBankAccountView.getMax(this.getMax, (Boolean) obj);
    }
}
