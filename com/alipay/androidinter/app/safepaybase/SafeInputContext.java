package com.alipay.androidinter.app.safepaybase;

import android.app.Activity;
import android.view.View;
import android.widget.EditText;
import com.alipay.androidinter.app.safepaybase.util.ResUtils;
import com.alipay.androidinter.app.safepaybase.widget.SafeInputWidget;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

public class SafeInputContext {
    private SafeInputWidget inputWidget = null;

    public SafeInputContext(Activity activity, boolean z, int i) {
        ResUtils.setUiContext(activity);
        this.inputWidget = new SafeInputWidget(activity, z, i);
    }

    public void setOnConfirmListener(OnConfirmListener onConfirmListener) {
        this.inputWidget.setUserConfirmListener(onConfirmListener);
    }

    public void setNeedConfirmButton(boolean z) {
        this.inputWidget.setNeedComfirm(z);
    }

    public void setOnFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.inputWidget.setOnFocusChangeListener(onFocusChangeListener);
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.inputWidget.setOnClickListener(onClickListener);
    }

    public void setRsaPublicKey(String str) {
        int length = str != null ? str.length() : 0;
        int max = dispatchOnCancelled.setMax(length);
        if (length != max) {
            onCanceled oncanceled = new onCanceled(length, max, 1);
            onCancelLoad.setMax(1585570806, oncanceled);
            onCancelLoad.getMin(1585570806, oncanceled);
        }
        this.inputWidget.setRsaPublicKey(str);
    }

    public void setEncryptRandomStringAndType(String str, EncryptRandomType encryptRandomType) {
        this.inputWidget.setEncryptRandomStringAndType(str, encryptRandomType);
    }

    public String getEditContent() {
        return this.inputWidget.getEditContent();
    }

    public EditText getEditText() {
        return this.inputWidget.getEditText();
    }

    public View getContentView() {
        return this.inputWidget.getContentView();
    }

    public void clearText() {
        this.inputWidget.clearText();
    }

    public void setOkButtonText(String str) {
        this.inputWidget.setOkButtonText(str);
    }
}
