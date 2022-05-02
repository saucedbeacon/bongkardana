package o;

import id.dana.richview.bank.AutoCompleteBankView;
import id.dana.sendmoney.bank.other.OtherBankAccountView;
import java.util.List;

public final class detectImageFileType implements AutoCompleteBankView.getMax {
    private final OtherBankAccountView length;

    public detectImageFileType(OtherBankAccountView otherBankAccountView) {
        this.length = otherBankAccountView;
    }

    public final void setMin(List list) {
        OtherBankAccountView.setMin(this.length, list);
    }
}
