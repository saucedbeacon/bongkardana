package com.alipay.biometrics.ui.widget;

import android.app.Dialog;
import android.content.Context;
import com.alipay.android.phone.mobilecommon.biometric.bio.R;

public class LoadingProgressDialog extends Dialog {
    public LoadingProgressDialog(Context context) {
        this(context, R.style.LoadingDialog);
    }

    public LoadingProgressDialog(Context context, int i) {
        super(context, i);
        setContentView(R.layout.bio_dialog_loading_layout);
        getWindow().getAttributes().gravity = 17;
    }
}
