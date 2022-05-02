package com.alibaba.griver.ui.ant;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.SpannableString;
import android.text.style.AbsoluteSizeSpan;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import com.alibaba.griver.ui.R;
import com.alibaba.griver.ui.ant.api.AntUI;
import com.alibaba.griver.ui.ant.dialog.AUEmptyGoneTextView;
import com.alibaba.griver.ui.ant.layout.AULinearLayout;
import com.alibaba.griver.ui.ant.text.AUTextView;
import com.alibaba.griver.ui.ant.theme.AUAbsTheme;

public class AULoadingView extends AULinearLayout implements AntUI {

    /* renamed from: a  reason: collision with root package name */
    private AUTextView f10530a;
    private AUEmptyGoneTextView b;

    public void initAttrStyle(Context context, AttributeSet attributeSet, TypedArray typedArray) {
    }

    public void initContent(Context context, AttributeSet attributeSet, TypedArray typedArray) {
    }

    public void initStyleByTheme(Context context) {
    }

    public void upDateTheme(Context context, AUAbsTheme aUAbsTheme) {
    }

    public AULoadingView(Context context) {
        super(context);
        a(context, (AttributeSet) null);
    }

    public AULoadingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context, attributeSet);
    }

    public AULoadingView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(context, attributeSet);
    }

    private void a(Context context, AttributeSet attributeSet) {
        init(context, (AttributeSet) null, (TypedArray) null);
        if (attributeSet != null) {
            initContent(context, (AttributeSet) null, (TypedArray) null);
            initStyleByTheme(context);
            initAttrStyle(context, (AttributeSet) null, (TypedArray) null);
            return;
        }
        initStyleByTheme(context);
    }

    public void init(Context context, AttributeSet attributeSet, TypedArray typedArray) {
        LayoutInflater.from(context).inflate(R.layout.griver_ui_loading_view, this, true);
        this.f10530a = (AUTextView) findViewById(R.id.progress_current_text);
        this.b = (AUEmptyGoneTextView) findViewById(R.id.progress_loading_text);
    }

    public void setCurrentProgress(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(i);
        sb.append("%");
        SpannableString spannableString = new SpannableString(sb.toString());
        spannableString.setSpan(new AbsoluteSizeSpan(6, true), spannableString.length() - 1, spannableString.length(), 33);
        this.f10530a.setText(spannableString);
    }

    public void setLoadingText(String str) {
        this.b.setText(str);
    }
}
