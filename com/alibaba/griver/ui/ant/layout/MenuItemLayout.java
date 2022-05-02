package com.alibaba.griver.ui.ant.layout;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import com.alibaba.griver.ui.R;
import com.alibaba.griver.ui.ant.text.AUTextView;

public class MenuItemLayout extends AULinearLayout {

    /* renamed from: a  reason: collision with root package name */
    private AUTextView f10560a;

    public MenuItemLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        LayoutInflater.from(context).inflate(R.layout.griver_ui_menu_item_layout, this, true);
    }

    public MenuItemLayout(Context context) {
        super(context);
        LayoutInflater.from(context).inflate(R.layout.griver_ui_menu_item_layout, this, true);
        this.f10560a = (AUTextView) findViewById(R.id.tv_menu_name);
    }

    public MenuItemLayout(Context context, int i) {
        this(context);
        if (i > 0) {
            AUTextView aUTextView = this.f10560a;
            aUTextView.setPadding(i, aUTextView.getPaddingTop(), i, this.f10560a.getPaddingBottom());
        }
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
    }

    public void setText(String str) {
        this.f10560a.setText(str);
    }

    public int getTextWidth() {
        return getWidth();
    }

    public void setTextColor(ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.f10560a.setTextColor(colorStateList);
        }
    }

    public void setTextBold(boolean z) {
        this.f10560a.getPaint().setFakeBoldText(z);
    }

    public void setInitTextColor(int i) {
        this.f10560a.setTextColor(i);
    }

    public void setTextSize(float f) {
        this.f10560a.setTextSize(0, f);
    }
}
