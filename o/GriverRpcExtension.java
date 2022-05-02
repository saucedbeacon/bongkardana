package o;

import android.text.TextUtils;

public class GriverRpcExtension {
    private String paymentCode;
    private String totp;

    public boolean isCodeEmpty() {
        return TextUtils.isEmpty(this.paymentCode) && TextUtils.isEmpty(this.totp);
    }

    public String getPaymentCode() {
        return this.paymentCode;
    }

    public void setPaymentCode(String str) {
        this.paymentCode = str;
    }

    public String getTotp() {
        return this.totp;
    }

    public void setTotp(String str) {
        this.totp = str;
    }
}
