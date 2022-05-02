package com.alipay.mobile.verifyidentity.business.activity;

import android.content.Context;
import android.view.View;

public interface ActivityInterface {
    int bodyTitleAlign();

    String bodyTitleColor();

    int bodyTitleFont();

    int footLinkButtonAlign();

    String footLinkButtonBackgroundColor();

    String footLinkButtonColor();

    String footLinkButtonDisableColor();

    int footLinkButtonFont();

    int formSubTitleAlign();

    String formSubTitleColor();

    int formSubTitleFont();

    int formTitleAlign();

    String formTitleColor();

    int formTitleFont();

    String navBigColor();

    String navTitleColor();

    int navTitleFont();

    int navTitleHeight();

    int otpBottomTextSize();

    boolean otpClickSubmit();

    int otpCountTextSize();

    boolean otpHaveMiddleText();

    int otpInputStyle();

    int otpMiddleTextSize();

    int otpResendStyle();

    int otpTopTitleTextSize();

    View passwordStype(Context context);

    String statusBarBgStrColor();

    String vcodeColor();

    String vcodeFocusColor();

    int vcodeFont();
}
