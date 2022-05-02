package com.alipay.mobile.verifyidentity.uitools;

import android.app.Activity;
import android.app.Dialog;
import android.graphics.Typeface;
import com.alipay.mobile.verifyidentity.uitools.dialog.ModalInterface;

public interface CustomUiInterface {
    Typeface bodyContentTextType();

    Typeface bodyTitleTextType();

    Dialog createLoadingDialog(Activity activity);

    boolean showCenterToast(Activity activity, String str);

    boolean showCenterToast(Activity activity, String str, int i);

    boolean showCenterToast(Activity activity, String str, int i, int i2);

    boolean showCommonDialog(Activity activity, String str, String str2, int i, boolean z, ModalInterface modalInterface);

    boolean showTipToast(Activity activity, int i, String str);

    Typeface titleTextType();
}
