package com.alipay.iap.android.f2fpay.widgets.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;
import com.alipay.iap.android.f2fpay.R;
import com.alipay.iap.android.f2fpay.widgets.a.a;

public class F2FPayRefreshButton extends TextView {

    /* renamed from: a  reason: collision with root package name */
    private String f10686a;
    private String b;

    public F2FPayRefreshButton(Context context) {
        super(context);
        a(context);
    }

    public F2FPayRefreshButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context);
    }

    public F2FPayRefreshButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(context);
    }

    private void a(Context context) {
        setGravity(17);
        setTextColor(-10653294);
        setTextSizeInDip(14);
        int a2 = a.a(getResources(), 10.0f);
        setPadding(a2, a2, a2, a2);
        setTypeface(getTypeface(), 1);
        setAutoRefreshSeconds(30);
        setFailureText(context.getString(R.string.iap_f2fpay_mediator_code_refresh_fialure));
        changeToCompleteState();
    }

    public void changeToCompleteState() {
        setText(this.f10686a);
    }

    public void changeToFailureState() {
        setText(this.b);
    }

    public void setAutoRefreshSeconds(int i) {
        setRefreshText(getContext().getString(R.string.iap_f2fpay_mediator_code_refresh_tip, new Object[]{Integer.valueOf(i)}));
    }

    public void setFailureText(String str) {
        this.b = str;
    }

    public void setRefreshText(String str) {
        this.f10686a = str;
    }

    public void setTextSizeInDip(int i) {
        setTextSize(1, (float) i);
    }
}
