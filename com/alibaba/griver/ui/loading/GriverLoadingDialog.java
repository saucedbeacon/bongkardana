package com.alibaba.griver.ui.loading;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.alibaba.griver.ui.R;

public class GriverLoadingDialog extends Dialog {

    /* renamed from: a  reason: collision with root package name */
    private ProgressBar f10586a;
    private TextView b;
    private String c;
    private Context d;

    public GriverLoadingDialog(Context context) {
        this(context, R.style.griver_loading_style);
    }

    public GriverLoadingDialog(Context context, int i) {
        super(context, i);
        this.d = context;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        View inflate = LayoutInflater.from(this.d).inflate(R.layout.griver_ui_loading_dialog, (ViewGroup) null);
        this.f10586a = (ProgressBar) inflate.findViewById(R.id.h5_loading_progress);
        this.b = (TextView) inflate.findViewById(R.id.h5_loading_message);
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        attributes.alpha = 0.99f;
        getWindow().setAttributes(attributes);
        setContentView(inflate);
        this.f10586a.setVisibility(0);
        setCancelable(true);
        setOnCancelListener((DialogInterface.OnCancelListener) null);
        this.f10586a.setIndeterminate(false);
        setCanceledOnTouchOutside(false);
        a();
        super.onCreate(bundle);
    }

    public void setMessage(String str) {
        this.c = str;
        if (this.b != null) {
            a();
        }
    }

    private void a() {
        this.b.setText(this.c);
        if (TextUtils.isEmpty(this.c)) {
            this.b.setVisibility(8);
        } else {
            this.b.setVisibility(0);
        }
    }
}
