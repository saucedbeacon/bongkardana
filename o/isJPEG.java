package o;

import id.dana.sendmoney.bank.other.OtherBankAccountView;

public final class isJPEG implements RedDotDrawable {
    private final OtherBankAccountView getMax;

    public isJPEG(OtherBankAccountView otherBankAccountView) {
        this.getMax = otherBankAccountView;
    }

    public final Object apply(Object obj) {
        return Boolean.valueOf(OtherBankAccountView.setMax((CharSequence) obj));
    }
}
