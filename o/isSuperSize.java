package o;

import id.dana.sendmoney.bank.other.OtherBankAccountView;

public final class isSuperSize implements RedDotManager {
    private final OtherBankAccountView getMax;

    public isSuperSize(OtherBankAccountView otherBankAccountView) {
        this.getMax = otherBankAccountView;
    }

    public final void accept(Object obj) {
        OtherBankAccountView.getMax(this.getMax, ((Boolean) obj).booleanValue());
    }
}
