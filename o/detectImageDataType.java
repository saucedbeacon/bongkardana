package o;

import id.dana.sendmoney.bank.other.OtherBankAccountView;

public final class detectImageDataType implements RedDotDrawable {
    private final OtherBankAccountView length;

    public detectImageDataType(OtherBankAccountView otherBankAccountView) {
        this.length = otherBankAccountView;
    }

    public final Object apply(Object obj) {
        return Boolean.valueOf(this.length.length((CharSequence) obj));
    }
}
