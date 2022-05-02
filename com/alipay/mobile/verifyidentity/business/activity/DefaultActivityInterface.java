package com.alipay.mobile.verifyidentity.business.activity;

import android.content.Context;
import android.view.View;
import com.alipay.mobile.verifyidentity.base.message.ProductConstants;

public class DefaultActivityInterface implements ActivityInterface {
    public int bodyTitleAlign() {
        return -1;
    }

    public String bodyTitleColor() {
        return null;
    }

    public int bodyTitleFont() {
        return -1;
    }

    public int footLinkButtonAlign() {
        return -1;
    }

    public String footLinkButtonBackgroundColor() {
        return null;
    }

    public String footLinkButtonColor() {
        return null;
    }

    public String footLinkButtonDisableColor() {
        return null;
    }

    public int footLinkButtonFont() {
        return -1;
    }

    public int formSubTitleAlign() {
        return -1;
    }

    public String formSubTitleColor() {
        return null;
    }

    public int formSubTitleFont() {
        return -1;
    }

    public int formTitleAlign() {
        return -1;
    }

    public String formTitleColor() {
        return null;
    }

    public int formTitleFont() {
        return -1;
    }

    public String navBigColor() {
        return null;
    }

    public String navTitleColor() {
        return null;
    }

    public int navTitleFont() {
        return -1;
    }

    public int navTitleHeight() {
        return 0;
    }

    public int otpBottomTextSize() {
        return 14;
    }

    public boolean otpClickSubmit() {
        return true;
    }

    public int otpCountTextSize() {
        return 14;
    }

    public boolean otpHaveMiddleText() {
        return true;
    }

    public int otpInputStyle() {
        return ProductConstants.OTP.INPUT_STYLE;
    }

    public int otpMiddleTextSize() {
        return 14;
    }

    public int otpResendStyle() {
        return 1011;
    }

    public int otpTopTitleTextSize() {
        return 14;
    }

    public View passwordStype(Context context) {
        return null;
    }

    public String statusBarBgStrColor() {
        return null;
    }

    public String vcodeColor() {
        return null;
    }

    public String vcodeFocusColor() {
        return null;
    }

    public int vcodeFont() {
        return -1;
    }
}
