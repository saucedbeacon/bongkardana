package o;

import android.text.TextUtils;
import id.dana.sendmoney.bank.other.OtherBankAccountView;

public final class APCenterCropMode implements RedDotDrawable {
    private final OtherBankAccountView getMin;

    public APCenterCropMode(OtherBankAccountView otherBankAccountView) {
        this.getMin = otherBankAccountView;
    }

    public final Object apply(Object obj) {
        return Boolean.valueOf(!TextUtils.isEmpty(this.getMin.etSenderNameInput.getText().toString()));
    }
}
