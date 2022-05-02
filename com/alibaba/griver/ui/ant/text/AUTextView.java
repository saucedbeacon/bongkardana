package com.alibaba.griver.ui.ant.text;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.StyleSpan;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import com.alibaba.griver.base.common.logger.GriverLogger;
import com.alibaba.griver.base.common.utils.DensityUtil;
import com.alibaba.griver.ui.R;
import com.alibaba.griver.ui.ant.api.AUAttrsConstant;
import com.alibaba.griver.ui.ant.api.AUViewInterface;
import com.alibaba.griver.ui.ant.api.OnParseEmotionListener;
import com.alibaba.griver.ui.ant.helper.AUViewEventHelper;
import com.alibaba.griver.ui.ant.utils.AUAttrsUtils;
import com.alibaba.griver.ui.ant.utils.AUScreenAdaptTool;
import com.alibaba.griver.ui.ant.utils.AUScreenUtils;

public class AUTextView extends TextView implements AUViewInterface {

    /* renamed from: a  reason: collision with root package name */
    private static OnParseEmotionListener f10566a;
    private boolean b;
    private boolean c;
    private int d;
    private boolean e;
    private float f;
    private int g;
    private boolean h;
    private int i;
    private String j;
    private AttributeSet k;
    private float l;
    private int m;
    private int n;

    /* renamed from: o  reason: collision with root package name */
    private int f10567o;
    private int p;
    private OnTextViewTextChangeListener q;
    private OnVisibilityChangeListener r;
    private Boolean s;

    public interface OnTextViewTextChangeListener {
        void onTextViewTextChange(TextView textView, String str);
    }

    public interface OnVisibilityChangeListener {
        void onChange(int i);
    }

    private void a() {
    }

    public AUTextView(Context context) {
        super(context);
        this.d = 0;
        this.e = false;
        this.i = 9999;
        this.l = 1.0f;
        this.f = getTextSize();
        a();
    }

    public AUTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = 0;
        this.e = false;
        this.i = 9999;
        this.l = 1.0f;
        a(context, attributeSet);
        if (AUScreenUtils.checkApFlag(context, attributeSet, this)) {
            AUAttrsUtils.adptApPadding(this, context);
        }
    }

    public AUTextView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.d = 0;
        this.e = false;
        this.i = 9999;
        this.l = 1.0f;
        a(context, attributeSet);
        if (AUScreenUtils.checkApFlag(context, attributeSet, this)) {
            AUAttrsUtils.adptApPadding(this, context);
        }
    }

    public void setOnVisibilityChangeListener(OnVisibilityChangeListener onVisibilityChangeListener) {
        this.r = onVisibilityChangeListener;
    }

    public void setTextSize(int i2, float f2) {
        if (AUScreenUtils.checkApFlag(getContext(), this.k, this) && i2 == 1) {
            f2 = (float) AUScreenAdaptTool.getApFromDp(getContext(), f2);
            i2 = 0;
        }
        if (this.e) {
            super.setTextSize(i2, f2);
            this.f = getTextSize();
            a();
            return;
        }
        float applyDimension = TypedValue.applyDimension(i2, f2, getResources().getDisplayMetrics());
        this.f = applyDimension;
        super.setTextSize(0, this.l * applyDimension);
    }

    private void a(Context context, AttributeSet attributeSet) {
        this.k = attributeSet;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.griveremojiAttr);
            this.j = attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", AUAttrsConstant.VIEW_HEIGHT);
            this.b = obtainStyledAttributes.getBoolean(R.styleable.griveremojiAttr_supportEmoji, false);
            this.c = obtainStyledAttributes.getBoolean(R.styleable.griveremojiAttr_supportEmotion, false);
            this.d = obtainStyledAttributes.getDimensionPixelSize(R.styleable.griveremojiAttr_emojiSize, 0);
            obtainStyledAttributes.recycle();
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, R.styleable.griverTextAttr);
            this.e = obtainStyledAttributes2.getBoolean(R.styleable.griverTextAttr_dynamicTextSize, false);
            obtainStyledAttributes2.recycle();
            setApTextSize(attributeSet);
            this.f = getTextSize();
            a();
            this.n = getPaddingTop();
            this.m = getPaddingBottom();
            this.f10567o = getPaddingLeft();
            this.p = getPaddingRight();
            if (AUScreenUtils.checkApFlag(context, attributeSet, this)) {
                AUAttrsUtils.adptApPadding(this, context);
            }
        }
    }

    private void setApTextSize(AttributeSet attributeSet) {
        int i2;
        if (AUScreenUtils.checkApFlag(getContext(), attributeSet, this)) {
            String str = (String) AUAttrsUtils.handleAttrs(attributeSet).get(AUAttrsConstant.TV_TEXTSIZE);
            if (TextUtils.isEmpty(str)) {
                i2 = AUScreenAdaptTool.getApFromPx(getContext(), getTextSize());
            } else {
                i2 = AUScreenAdaptTool.getApFromAttrsStr(getContext(), str);
            }
            super.setTextSize(0, (float) i2);
        }
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        super.setOnClickListener(AUViewEventHelper.wrapClickListener(onClickListener));
    }

    private void a(int i2) {
        if (i2 >= 0) {
            CharSequence text = getText();
            CharSequence ellipsize = TextUtils.ellipsize(text, getPaint(), (float) i2, getEllipsize());
            if (!TextUtils.equals(ellipsize, text)) {
                if (text.length() > ellipsize.length()) {
                    b(i2);
                }
                setText(ellipsize);
            }
        }
    }

    public void onMeasure(int i2, int i3) {
        if ((this.b || this.c) && isSingleLine() && AUAttrsConstant.WRAP_CONTENT.equals(this.j)) {
            super.onMeasure(i2, View.MeasureSpec.makeMeasureSpec(((int) (getTextSize() + DensityUtil.getTextSize((float) AUScreenAdaptTool.getApFromDp(getContext(), 6.0f), 1))) + getPaddingTop() + getPaddingBottom(), 1073741824));
            return;
        }
        super.onMeasure(i2, i3);
    }

    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        super.onLayout(z, i2, i3, i4, i5);
        a();
        if (((this.b && this.g > 0) || (this.c && this.h)) && getEllipsize() != null && isSingleLine()) {
            int leftPaddingOffset = ((i4 - i2) - getLeftPaddingOffset()) - getRightPaddingOffset();
            int i6 = this.i;
            if (i6 != 9999) {
                leftPaddingOffset = Math.max(leftPaddingOffset, i6);
            }
            a(leftPaddingOffset);
        }
    }

    private void b(int i2) {
        int i3 = this.i;
        if (i3 == 9999) {
            this.i = i2;
        } else {
            this.i = Math.max(i2, i3);
        }
    }

    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        SpannableStringBuilder spannableStringBuilder;
        OnParseEmotionListener onParseEmotionListener;
        if ((this.b || this.c) && charSequence != null) {
            if (this.b) {
                spannableStringBuilder = new SpannableStringBuilder(charSequence);
            } else {
                spannableStringBuilder = new SpannableStringBuilder(charSequence);
            }
            if (this.c && (onParseEmotionListener = f10566a) != null) {
                this.h = onParseEmotionListener.parser(getContext(), spannableStringBuilder, charSequence, getEmojiSize());
            }
            if ((this.g <= 0 && !this.h) || getEllipsize() == null) {
                super.setText(spannableStringBuilder, bufferType);
            } else if (isSingleLine()) {
                a((CharSequence) spannableStringBuilder, bufferType);
            } else {
                super.setText(spannableStringBuilder, bufferType);
            }
            OnTextViewTextChangeListener onTextViewTextChangeListener = this.q;
            if (onTextViewTextChangeListener != null && charSequence != null) {
                onTextViewTextChangeListener.onTextViewTextChange(this, spannableStringBuilder.toString());
                return;
            }
            return;
        }
        super.setText(charSequence, bufferType);
        OnTextViewTextChangeListener onTextViewTextChangeListener2 = this.q;
        if (onTextViewTextChangeListener2 != null && charSequence != null) {
            onTextViewTextChangeListener2.onTextViewTextChange(this, charSequence.toString());
        }
    }

    private void a(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(TextUtils.ellipsize(charSequence, getPaint(), (float) this.i, getEllipsize()), bufferType);
    }

    public boolean isSingleLine() {
        return getMaxLines() == 1;
    }

    public void setAutoSplitText(String str) {
        setText(str);
        getViewTreeObserver().addOnGlobalLayoutListener(new OnTvGlobalLayoutListener());
    }

    public void setBoldAutoSplitText(String str) {
        if (str == null) {
            str = "";
        }
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 0);
        setText(spannableString);
        getViewTreeObserver().addOnGlobalLayoutListener(new OnTvGlobalLayoutListener());
    }

    public int getEmojiSize() {
        int i2 = this.d;
        return i2 <= 0 ? ((int) getTextSize()) + AUScreenAdaptTool.getApFromDp(getContext(), 2.0f) : i2;
    }

    public void setVisibility(int i2) {
        super.setVisibility(i2);
        OnVisibilityChangeListener onVisibilityChangeListener = this.r;
        if (onVisibilityChangeListener != null) {
            onVisibilityChangeListener.onChange(i2);
        }
    }

    public Boolean isAP() {
        return this.s;
    }

    public void setAP(Boolean bool) {
        this.s = bool;
    }

    public void setTextSize(float f2) {
        if (this.e) {
            super.setTextSize(f2);
            return;
        }
        this.f = TypedValue.applyDimension(2, f2, getResources().getDisplayMetrics());
        super.setTextSize(f2 * this.l);
    }

    public void setPadding(int i2, int i3, int i4, int i5) {
        this.f10567o = i2;
        this.n = i3;
        this.p = i4;
        this.m = i5;
        if (!this.e) {
            float f2 = this.l;
            super.setPadding((int) (((float) i2) * f2), (int) (((float) i3) * f2), (int) (((float) i4) * f2), (int) (((float) i5) * f2));
            return;
        }
        super.setPadding(i2, i3, i4, i5);
    }

    class OnTvGlobalLayoutListener implements ViewTreeObserver.OnGlobalLayoutListener {
        private OnTvGlobalLayoutListener() {
        }

        public void onGlobalLayout() {
            try {
                AUTextView.this.getViewTreeObserver().removeGlobalOnLayoutListener(this);
            } catch (Throwable th) {
                GriverLogger.e("commonui", th.toString());
            }
        }
    }
}
