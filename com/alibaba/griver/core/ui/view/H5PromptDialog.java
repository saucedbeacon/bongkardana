package com.alibaba.griver.core.ui.view;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.alibaba.griver.core.R;

public class H5PromptDialog extends Dialog {

    /* renamed from: a  reason: collision with root package name */
    private Context f10373a;
    private LayoutInflater b;
    private View c;
    private Button d;
    private Button e;
    /* access modifiers changed from: private */
    public EditText f;
    private LinearLayout g;
    private TextView h;
    private TextView i;
    private String j;
    private String k;
    /* access modifiers changed from: private */
    public OnClickPositiveListener l;
    /* access modifiers changed from: private */
    public OnClickNegativeListener m;
    private RelativeLayout n;

    /* renamed from: o  reason: collision with root package name */
    private String f10374o;
    private String p;
    private boolean q;

    public interface OnClickNegativeListener {
        void onClick();
    }

    public interface OnClickPositiveListener {
        void onClick(String str);
    }

    public H5PromptDialog(Context context, String str, String str2, String str3, String str4) {
        this(context, str, str2, str3, str4, false);
    }

    public H5PromptDialog(Context context, String str, String str2, String str3, String str4, boolean z) {
        super(context, R.style.griver_core_prompt_noTitleTransBgDialogStyle);
        this.q = false;
        this.f10373a = context;
        this.j = str;
        this.k = str2;
        this.f10374o = str3;
        this.p = str4;
        this.q = z;
        LayoutInflater from = LayoutInflater.from(context);
        this.b = from;
        View inflate = from.inflate(R.layout.griver_core_prompt_input_dialog, (ViewGroup) null);
        this.c = inflate;
        this.e = (Button) inflate.findViewById(R.id.ensure);
        this.d = (Button) inflate.findViewById(R.id.cancel);
        this.h = (TextView) inflate.findViewById(R.id.title);
        this.i = (TextView) inflate.findViewById(R.id.message);
        this.f = (EditText) inflate.findViewById(R.id.inputContent);
        this.g = (LinearLayout) inflate.findViewById(R.id.bottom_ll);
        this.n = (RelativeLayout) inflate.findViewById(R.id.dialog_bg);
        if (TextUtils.isEmpty(this.k)) {
            this.i.setVisibility(8);
        } else {
            this.i.setText(this.k);
            this.i.setVisibility(0);
        }
        if (TextUtils.isEmpty(this.j)) {
            this.h.setVisibility(8);
        } else {
            this.h.setVisibility(0);
            this.h.setText(this.j);
        }
        setCanceledOnTouchOutside(this.q);
        a();
    }

    private static int a(Context context) {
        return ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getWidth();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    public EditText getInputContent() {
        return this.f;
    }

    private void a() {
        if (!TextUtils.isEmpty(this.p) || !TextUtils.isEmpty(this.f10374o)) {
            this.g.setVisibility(0);
            this.d.setText(this.p);
            this.d.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    H5PromptDialog.this.cancel();
                    if (H5PromptDialog.this.m != null) {
                        H5PromptDialog.this.m.onClick();
                    }
                }
            });
            this.e.setText(this.f10374o);
            this.e.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    H5PromptDialog.this.dismiss();
                    if (H5PromptDialog.this.l == null) {
                        return;
                    }
                    if (H5PromptDialog.this.f.getText() != null) {
                        H5PromptDialog.this.l.onClick(H5PromptDialog.this.f.getText().toString());
                    } else {
                        H5PromptDialog.this.l.onClick((String) null);
                    }
                }
            });
            return;
        }
        this.g.setVisibility(8);
    }

    public void show() {
        super.show();
        setContentView(this.c);
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        attributes.width = a(this.f10373a) - (this.f10373a.getResources().getDimensionPixelSize(R.dimen.griver_core_prompt_height) * 2);
        getWindow().setAttributes(attributes);
    }

    public Button getCancelBtn() {
        return this.d;
    }

    public Button getEnsureBtn() {
        return this.e;
    }

    public TextView getTitle() {
        return this.h;
    }

    public TextView getMsg() {
        return this.i;
    }

    public LinearLayout getBottomLayout() {
        return this.g;
    }

    public RelativeLayout getDialogBg() {
        return this.n;
    }

    public void setPositiveListener(OnClickPositiveListener onClickPositiveListener) {
        this.l = onClickPositiveListener;
    }

    public void setNegativeListener(OnClickNegativeListener onClickNegativeListener) {
        this.m = onClickNegativeListener;
    }
}
