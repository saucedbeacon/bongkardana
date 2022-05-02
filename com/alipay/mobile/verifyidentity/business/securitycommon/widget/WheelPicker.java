package com.alipay.mobile.verifyidentity.business.securitycommon.widget;

import android.app.Activity;
import android.graphics.Typeface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.Nullable;
import com.alipay.mobile.verifyidentity.business.securitycommon.widget.WheelView;

public abstract class WheelPicker extends ConfirmPopup<View> {
    protected boolean cycleDisable = true;
    protected WheelView.DividerConfig dividerConfig = new WheelView.DividerConfig();
    protected int labelTextColor = -16611122;
    protected float lineSpaceMultiplier = 2.0f;
    protected int offset = 3;
    protected int textColorFocus = -16611122;
    protected int textColorNormal = -4473925;
    protected int textPadding = -1;
    protected int textSize = 16;
    protected boolean textSizeAutoFit = true;
    protected Typeface typeface = Typeface.DEFAULT;
    protected boolean useWeight = true;

    public WheelPicker(Activity activity) {
        super(activity);
    }

    public final void setLineSpaceMultiplier(@FloatRange(from = 2.0d, to = 4.0d) float f) {
        this.lineSpaceMultiplier = f;
    }

    @Deprecated
    public void setPadding(int i) {
        this.textPadding = i;
    }

    public void setTextPadding(int i) {
        this.textPadding = i;
    }

    public void setTextSize(int i) {
        this.textSize = i;
    }

    public void setTextColor(@ColorInt int i, @ColorInt int i2) {
        this.textColorFocus = i;
        this.textColorNormal = i2;
    }

    public void setTextColor(@ColorInt int i) {
        this.textColorFocus = i;
    }

    public void setLabelTextColor(int i) {
        this.labelTextColor = i;
    }

    public void setShadowVisible(boolean z) {
        if (this.dividerConfig == null) {
            this.dividerConfig = new WheelView.DividerConfig();
        }
        this.dividerConfig.setShadowVisible(z);
    }

    public void setShadowColor(@ColorInt int i) {
        setShadowColor(i, 100);
    }

    public void setShadowColor(@ColorInt int i, @IntRange(from = 1, to = 255) int i2) {
        if (this.dividerConfig == null) {
            this.dividerConfig = new WheelView.DividerConfig();
        }
        this.dividerConfig.setShadowColor(i);
        this.dividerConfig.setShadowAlpha(i2);
    }

    public void setDividerVisible(boolean z) {
        if (this.dividerConfig == null) {
            this.dividerConfig = new WheelView.DividerConfig();
        }
        this.dividerConfig.setVisible(z);
    }

    @Deprecated
    public void setLineVisible(boolean z) {
        setDividerVisible(z);
    }

    @Deprecated
    public void setLineColor(@ColorInt int i) {
        setDividerColor(i);
    }

    public void setDividerColor(@ColorInt int i) {
        if (this.dividerConfig == null) {
            this.dividerConfig = new WheelView.DividerConfig();
        }
        this.dividerConfig.setVisible(true);
        this.dividerConfig.setColor(i);
    }

    public void setDividerRatio(float f) {
        if (this.dividerConfig == null) {
            this.dividerConfig = new WheelView.DividerConfig();
        }
        this.dividerConfig.setRatio(f);
    }

    public void setDividerConfig(@Nullable WheelView.DividerConfig dividerConfig2) {
        if (dividerConfig2 == null) {
            WheelView.DividerConfig dividerConfig3 = new WheelView.DividerConfig();
            this.dividerConfig = dividerConfig3;
            dividerConfig3.setVisible(false);
            this.dividerConfig.setShadowVisible(false);
            return;
        }
        this.dividerConfig = dividerConfig2;
    }

    @Deprecated
    public void setLineConfig(WheelView.DividerConfig dividerConfig2) {
        setDividerConfig(dividerConfig2);
    }

    public void setOffset(@IntRange(from = 1, to = 5) int i) {
        this.offset = i;
    }

    public void setCycleDisable(boolean z) {
        this.cycleDisable = z;
    }

    public void setUseWeight(boolean z) {
        this.useWeight = z;
    }

    public void setTextSizeAutoFit(boolean z) {
        this.textSizeAutoFit = z;
    }

    public View getContentView() {
        if (this.centerView == null) {
            this.centerView = makeCenterView();
        }
        return this.centerView;
    }

    /* access modifiers changed from: protected */
    public WheelView createWheelView() {
        WheelView wheelView = new WheelView(this.activity);
        wheelView.setLineSpaceMultiplier(this.lineSpaceMultiplier);
        wheelView.setTextPadding(this.textPadding);
        wheelView.setTextSize((float) this.textSize);
        wheelView.setTypeface(this.typeface);
        wheelView.setTextColor(this.textColorNormal, this.textColorFocus);
        wheelView.setDividerConfig(this.dividerConfig);
        wheelView.setOffset(this.offset);
        wheelView.setCycleDisable(this.cycleDisable);
        wheelView.setUseWeight(this.useWeight);
        wheelView.setTextSizeAutoFit(this.textSizeAutoFit);
        return wheelView;
    }

    /* access modifiers changed from: protected */
    public TextView createLabelView() {
        TextView textView = new TextView(this.activity);
        textView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        textView.setTextColor(this.labelTextColor);
        textView.setTextSize((float) this.textSize);
        return textView;
    }
}
