package o;

import id.dana.sendmoney.bank.other.OtherBankAccountView;

public final class isProgressive implements RedDotManager {
    private final OtherBankAccountView setMax;

    public isProgressive(OtherBankAccountView otherBankAccountView) {
        this.setMax = otherBankAccountView;
    }

    public final void accept(Object obj) {
        this.setMax.btnConfirm.setEnabled(((Boolean) obj).booleanValue());
    }
}
