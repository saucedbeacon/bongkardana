package com.alipay;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.Typeface;
import android.text.TextUtils;
import com.alipay.mobile.verifyidentity.uitools.CustomUiInterface;
import com.alipay.mobile.verifyidentity.uitools.dialog.CommonDialog;
import com.alipay.mobile.verifyidentity.uitools.dialog.ModalInterface;
import com.alipay.mobile.verifyidentity.uitools.dialog.SubmittingDialog;
import com.alipay.mobile.verifyidentity.uitools.toast.CenterToast;
import com.alipay.mobile.verifyidentity.uitools.toast.TipToast;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

public class CustomUiImpl implements CustomUiInterface {
    public Typeface bodyContentTextType() {
        return null;
    }

    public Typeface bodyTitleTextType() {
        return null;
    }

    public Typeface titleTextType() {
        return null;
    }

    public boolean showTipToast(Activity activity, int i, String str) {
        TipToast tipToast = new TipToast(activity);
        tipToast.setStatus(i);
        tipToast.setMessage(str);
        tipToast.show();
        return true;
    }

    public boolean showCenterToast(Activity activity, String str) {
        int length = str != null ? str.length() : 0;
        int max = dispatchOnCancelled.setMax(length);
        if (length != max) {
            onCanceled oncanceled = new onCanceled(length, max, 1);
            onCancelLoad.setMax(425609011, oncanceled);
            onCancelLoad.getMin(425609011, oncanceled);
        }
        CenterToast centerToast = new CenterToast(activity);
        centerToast.setMessage(str);
        centerToast.show();
        return true;
    }

    public boolean showCenterToast(Activity activity, String str, int i) {
        CenterToast centerToast = new CenterToast(activity);
        centerToast.setMessage(str);
        centerToast.setDuration(i);
        centerToast.show();
        return true;
    }

    public boolean showCenterToast(Activity activity, String str, int i, int i2) {
        CenterToast centerToast = new CenterToast(activity);
        centerToast.setMessage(str);
        centerToast.setDuration(i);
        centerToast.show();
        return true;
    }

    public Dialog createLoadingDialog(Activity activity) {
        return new SubmittingDialog(activity);
    }

    public boolean showCommonDialog(Activity activity, String str, String str2, int i, boolean z, ModalInterface modalInterface) {
        CommonDialog commonDialog = new CommonDialog(activity, false, (DialogInterface.OnCancelListener) null);
        commonDialog.setModalInterface(modalInterface);
        if (!TextUtils.isEmpty(str)) {
            commonDialog.setTitle(str);
        }
        if (i == 1002) {
            commonDialog.setCancelText("Enter password");
        }
        commonDialog.setMessage(str2);
        commonDialog.setCancelable(z);
        commonDialog.show();
        return true;
    }
}
