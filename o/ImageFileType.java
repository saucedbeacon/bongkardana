package o;

import id.dana.sendmoney.bank.other.OtherBankAccountView;

public final class ImageFileType implements RedDotManager {
    private final OtherBankAccountView getMax;

    public ImageFileType(OtherBankAccountView otherBankAccountView) {
        this.getMax = otherBankAccountView;
    }

    public final void accept(Object obj) {
        this.getMax.getMax((Boolean) obj);
    }
}
