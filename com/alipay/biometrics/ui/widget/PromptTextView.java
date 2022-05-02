package com.alipay.biometrics.ui.widget;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Color;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.animation.LinearInterpolator;
import android.widget.TextView;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

public class PromptTextView extends TextView {
    int mAnimationInterval = 1000;
    int mProcessColor = Color.parseColor("#108ee9");
    int mStepIndex;
    ValueAnimator mValueAnimator;

    public PromptTextView(Context context) {
        super(context);
    }

    public PromptTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PromptTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void setProcessColor(int i) {
        int max = dispatchOnCancelled.setMax(i);
        if (i != max) {
            onCanceled oncanceled = new onCanceled(i, max, 1);
            onCancelLoad.setMax(324458888, oncanceled);
            onCancelLoad.getMin(324458888, oncanceled);
        }
        this.mProcessColor = i;
    }

    public void setAnimationInterval(int i) {
        this.mAnimationInterval = i;
    }

    public void startAnimation(int i) {
        int length = getText().length();
        if (i > length) {
            i = length;
        }
        ValueAnimator valueAnimator = this.mValueAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{this.mStepIndex, i});
        this.mValueAnimator = ofInt;
        ofInt.setDuration((long) this.mAnimationInterval);
        this.mValueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                valueAnimator.getAnimatedValue();
                if (PromptTextView.this.mStepIndex != ((Integer) valueAnimator.getAnimatedValue()).intValue()) {
                    PromptTextView.this.setTextSpan(((Integer) valueAnimator.getAnimatedValue()).intValue());
                }
                PromptTextView.this.mStepIndex = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            }
        });
        this.mValueAnimator.setInterpolator(new LinearInterpolator());
        this.mValueAnimator.start();
    }

    public void resetAnimation() {
        this.mStepIndex = 0;
        ValueAnimator valueAnimator = this.mValueAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        setTextSpan(0);
    }

    public void cancelAnimation() {
        this.mValueAnimator.cancel();
    }

    public void setTextSpan(int i) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(getText().toString());
        spannableStringBuilder.setSpan(new ForegroundColorSpan(this.mProcessColor), 0, i, 33);
        setText(spannableStringBuilder);
    }
}
