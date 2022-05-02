package com.alibaba.griver.ui.ant.dialog;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.alibaba.griver.base.common.utils.DensityUtil;
import com.alibaba.griver.ui.R;

public class APAlertDialog extends AUBasicDialog {

    /* renamed from: a  reason: collision with root package name */
    private Context f9103a;
    private LayoutInflater b;
    private View c;
    private Button d;
    private Button e;
    /* access modifiers changed from: private */
    public View.OnClickListener f;
    /* access modifiers changed from: private */
    public View.OnClickListener g;
    private RelativeLayout h;
    private LinearLayout i;
    private TextView j;
    private RelativeLayout k;
    private String l;
    private String m;
    private String n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f9104o;

    public View getContentView() {
        return null;
    }

    public APAlertDialog(Context context, String str, String str2, String str3) {
        this(context, str, str2, str3, true);
    }

    public APAlertDialog(Context context, String str, String str2, String str3, boolean z) {
        super(context, R.style.griver_dialog_with_no_title_style_trans_bg);
        this.f9103a = context;
        this.l = str;
        this.m = str2;
        this.n = str3;
        this.f9104o = z;
        this.b = LayoutInflater.from(context);
        this.f9104o = z;
        a();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    private void a() {
        View inflate = this.b.inflate(R.layout.griver_ui_alert_dialog, (ViewGroup) null);
        this.c = inflate;
        this.e = (Button) inflate.findViewById(R.id.btn_positive);
        this.d = (Button) inflate.findViewById(R.id.btn_negative);
        this.j = (TextView) inflate.findViewById(R.id.title);
        this.i = (LinearLayout) inflate.findViewById(R.id.button_ll);
        this.h = (RelativeLayout) inflate.findViewById(R.id.dialog_bg);
        this.k = (RelativeLayout) inflate.findViewById(R.id.container);
        this.j.setText(this.l);
        setCanceledOnTouchOutside(this.f9104o);
        b();
        initContentView();
    }

    public void initContentView() {
        View contentView = getContentView();
        if (contentView != null) {
            getContainerView().addView(contentView);
        }
    }

    private void b() {
        this.d.setText(this.n);
        if (TextUtils.isEmpty(this.n)) {
            this.d.setVisibility(4);
        }
        this.d.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                APAlertDialog.this.cancel();
                if (APAlertDialog.this.g != null) {
                    APAlertDialog.this.g.onClick(view);
                }
            }
        });
        this.e.setText(this.m);
        if (TextUtils.isEmpty(this.m)) {
            this.e.setVisibility(4);
        }
        this.e.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                APAlertDialog.this.dismiss();
                if (APAlertDialog.this.f != null) {
                    APAlertDialog.this.f.onClick(view);
                }
            }
        });
    }

    public void show() {
        super.show();
        setContentView(this.c);
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        DisplayMetrics displayMetrics = this.f9103a.getResources().getDisplayMetrics();
        attributes.width = (displayMetrics.widthPixels > displayMetrics.heightPixels ? displayMetrics.heightPixels : displayMetrics.widthPixels) - DensityUtil.dip2px(this.f9103a, 80.0f);
        getWindow().setBackgroundDrawable(this.f9103a.getResources().getDrawable(R.color.griver_transparent));
        getWindow().setAttributes(attributes);
    }

    public void setPositiveListener(View.OnClickListener onClickListener) {
        this.f = onClickListener;
    }

    public void setNegativeListener(View.OnClickListener onClickListener) {
        this.g = onClickListener;
    }

    public TextView getTitleView() {
        return this.j;
    }

    public RelativeLayout getContainerView() {
        return this.k;
    }
}
