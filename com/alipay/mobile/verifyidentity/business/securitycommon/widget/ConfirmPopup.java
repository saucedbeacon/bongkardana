package com.alipay.mobile.verifyidentity.business.securitycommon.widget;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import com.alipay.mobile.verifyidentity.business.securitywidget.R;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

public abstract class ConfirmPopup<V extends View> extends BasicPopup<View> {
    protected int backgroundColor = -1;
    protected TextView cancelButton;
    protected CharSequence cancelText = "";
    protected int cancelTextColor = -13388315;
    protected int cancelTextSize = 0;
    protected boolean cancelVisible = true;
    protected View centerView;
    protected int contentLeftAndRightPadding = 0;
    protected int contentTopAndBottomPadding = 0;
    protected View footerView;
    protected View headerView;
    protected int pressedTextColor = -16611122;
    protected TextView submitButton;
    protected CharSequence submitText = "";
    protected int submitTextColor = -13388315;
    protected int submitTextSize = 0;
    protected CharSequence titleText = "";
    protected int titleTextColor = -16777216;
    protected int titleTextSize = 0;
    protected View titleView;
    protected int topBackgroundColor = -1;
    protected int topHeight = 40;
    protected int topLineColor = -13388315;
    protected int topLineHeightPixels = 1;
    protected boolean topLineVisible = true;
    protected int topPadding = 15;

    /* access modifiers changed from: protected */
    @NonNull
    public abstract V makeCenterView();

    /* access modifiers changed from: protected */
    public void onCancel() {
    }

    /* access modifiers changed from: protected */
    public void onSubmit() {
    }

    public ConfirmPopup(Activity activity) {
        super(activity);
        this.cancelText = activity.getString(R.string.pickerview_cancel);
        this.submitText = activity.getString(R.string.set_security_confirm);
    }

    public void setTopLineColor(@ColorInt int i) {
        this.topLineColor = i;
    }

    public void setTopLineHeight(int i) {
        this.topLineHeightPixels = i;
    }

    public void setTopBackgroundColor(@ColorInt int i) {
        this.topBackgroundColor = i;
    }

    public void setTopHeight(@IntRange(from = 10, to = 80) int i) {
        this.topHeight = i;
    }

    public void setTopPadding(int i) {
        this.topPadding = i;
    }

    public void setTopLineVisible(boolean z) {
        this.topLineVisible = z;
    }

    public void setContentPadding(int i, int i2) {
        int max = dispatchOnCancelled.setMax(i);
        if (i != max) {
            onCanceled oncanceled = new onCanceled(i, max, 1);
            onCancelLoad.setMax(1944084384, oncanceled);
            onCancelLoad.getMin(1944084384, oncanceled);
        }
        this.contentLeftAndRightPadding = i;
        this.contentTopAndBottomPadding = i2;
    }

    public void setCancelVisible(boolean z) {
        TextView textView = this.cancelButton;
        if (textView != null) {
            textView.setVisibility(z ? 0 : 8);
        } else {
            this.cancelVisible = z;
        }
    }

    public void setCancelText(CharSequence charSequence) {
        TextView textView = this.cancelButton;
        if (textView != null) {
            textView.setText(charSequence);
        } else {
            this.cancelText = charSequence;
        }
    }

    public void setCancelText(@StringRes int i) {
        setCancelText((CharSequence) this.activity.getString(i));
    }

    public void setSubmitText(CharSequence charSequence) {
        TextView textView = this.submitButton;
        if (textView != null) {
            textView.setText(charSequence);
        } else {
            this.submitText = charSequence;
        }
    }

    public void setSubmitText(@StringRes int i) {
        setSubmitText((CharSequence) this.activity.getString(i));
    }

    public void setTitleText(CharSequence charSequence) {
        View view = this.titleView;
        if (view == null || !(view instanceof TextView)) {
            this.titleText = charSequence;
        } else {
            ((TextView) view).setText(charSequence);
        }
    }

    public void setTitleText(@StringRes int i) {
        setTitleText((CharSequence) this.activity.getString(i));
    }

    public void setCancelTextColor(@ColorInt int i) {
        TextView textView = this.cancelButton;
        if (textView != null) {
            textView.setTextColor(i);
        } else {
            this.cancelTextColor = i;
        }
    }

    public void setSubmitTextColor(@ColorInt int i) {
        TextView textView = this.submitButton;
        if (textView != null) {
            textView.setTextColor(i);
        } else {
            this.submitTextColor = i;
        }
    }

    public void setTitleTextColor(@ColorInt int i) {
        View view = this.titleView;
        if (view == null || !(view instanceof TextView)) {
            this.titleTextColor = i;
        } else {
            ((TextView) view).setTextColor(i);
        }
    }

    public void setPressedTextColor(int i) {
        this.pressedTextColor = i;
    }

    public void setCancelTextSize(@IntRange(from = 10, to = 40) int i) {
        this.cancelTextSize = i;
    }

    public void setSubmitTextSize(@IntRange(from = 10, to = 40) int i) {
        this.submitTextSize = i;
    }

    public void setTitleTextSize(@IntRange(from = 10, to = 40) int i) {
        this.titleTextSize = i;
    }

    public void setBackgroundColor(@ColorInt int i) {
        this.backgroundColor = i;
    }

    public void setTitleView(View view) {
        this.titleView = view;
    }

    public View getTitleView() {
        View view = this.titleView;
        if (view != null) {
            return view;
        }
        throw new NullPointerException("please call show at first");
    }

    public TextView getCancelButton() {
        TextView textView = this.cancelButton;
        if (textView != null) {
            return textView;
        }
        throw new NullPointerException("please call show at first");
    }

    public TextView getSubmitButton() {
        TextView textView = this.submitButton;
        if (textView != null) {
            return textView;
        }
        throw new NullPointerException("please call show at first");
    }

    public void setHeaderView(View view) {
        this.headerView = view;
    }

    public void setFooterView(View view) {
        this.footerView = view;
    }

    /* access modifiers changed from: protected */
    public final View makeContentView() {
        LinearLayout linearLayout = new LinearLayout(this.activity);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        linearLayout.setBackgroundColor(this.backgroundColor);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        linearLayout.setPadding(0, 0, 0, 0);
        linearLayout.setClipToPadding(false);
        View makeHeaderView = makeHeaderView();
        if (makeHeaderView != null) {
            linearLayout.addView(makeHeaderView);
        }
        if (this.topLineVisible) {
            View view = new View(this.activity);
            view.setLayoutParams(new LinearLayout.LayoutParams(-1, this.topLineHeightPixels));
            view.setBackgroundColor(this.topLineColor);
            linearLayout.addView(view);
        }
        if (this.centerView == null) {
            this.centerView = makeCenterView();
        }
        int px = this.contentLeftAndRightPadding > 0 ? ConvertUtils.toPx(this.activity, (float) this.contentLeftAndRightPadding) : 0;
        int px2 = this.contentTopAndBottomPadding > 0 ? ConvertUtils.toPx(this.activity, (float) this.contentTopAndBottomPadding) : 0;
        this.centerView.setPadding(px, px2, px, px2);
        ViewGroup viewGroup = (ViewGroup) this.centerView.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(this.centerView);
        }
        linearLayout.addView(this.centerView, new LinearLayout.LayoutParams(-1, 0, 1.0f));
        View makeFooterView = makeFooterView();
        if (makeFooterView != null) {
            linearLayout.addView(makeFooterView);
        }
        return linearLayout;
    }

    /* access modifiers changed from: protected */
    @Nullable
    public View makeHeaderView() {
        View view = this.headerView;
        if (view != null) {
            return view;
        }
        RelativeLayout relativeLayout = new RelativeLayout(this.activity);
        relativeLayout.setLayoutParams(new RelativeLayout.LayoutParams(-1, ConvertUtils.toPx(this.activity, (float) this.topHeight)));
        relativeLayout.setBackgroundColor(this.topBackgroundColor);
        relativeLayout.setGravity(16);
        TextView textView = new TextView(this.activity);
        this.cancelButton = textView;
        textView.setVisibility(this.cancelVisible ? 0 : 8);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -1);
        layoutParams.addRule(9, -1);
        layoutParams.addRule(15, -1);
        this.cancelButton.setLayoutParams(layoutParams);
        this.cancelButton.setBackgroundColor(0);
        this.cancelButton.setGravity(17);
        int px = ConvertUtils.toPx(this.activity, (float) this.topPadding);
        this.cancelButton.setPadding(px, 0, px, 0);
        if (!TextUtils.isEmpty(this.cancelText)) {
            this.cancelButton.setText(this.cancelText);
        }
        this.cancelButton.setTextColor(ConvertUtils.toColorStateList(this.cancelTextColor, this.pressedTextColor));
        int i = this.cancelTextSize;
        if (i != 0) {
            this.cancelButton.setTextSize((float) i);
        }
        this.cancelButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                ConfirmPopup.this.dismiss();
                ConfirmPopup.this.onCancel();
            }
        });
        relativeLayout.addView(this.cancelButton);
        if (this.titleView == null) {
            TextView textView2 = new TextView(this.activity);
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
            int px2 = ConvertUtils.toPx(this.activity, (float) this.topPadding);
            layoutParams2.leftMargin = px2;
            layoutParams2.rightMargin = px2;
            layoutParams2.addRule(14, -1);
            layoutParams2.addRule(15, -1);
            textView2.setLayoutParams(layoutParams2);
            textView2.setGravity(17);
            if (!TextUtils.isEmpty(this.titleText)) {
                textView2.setText(this.titleText);
            }
            textView2.setTextColor(this.titleTextColor);
            int i2 = this.titleTextSize;
            if (i2 != 0) {
                textView2.setTextSize((float) i2);
            }
            this.titleView = textView2;
        }
        relativeLayout.addView(this.titleView);
        this.submitButton = new TextView(this.activity);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -1);
        layoutParams3.addRule(11, -1);
        layoutParams3.addRule(15, -1);
        this.submitButton.setLayoutParams(layoutParams3);
        this.submitButton.setBackgroundColor(0);
        this.submitButton.setGravity(17);
        this.submitButton.setPadding(px, 0, px, 0);
        if (!TextUtils.isEmpty(this.submitText)) {
            this.submitButton.setText(this.submitText);
        }
        this.submitButton.setTextColor(ConvertUtils.toColorStateList(this.submitTextColor, this.pressedTextColor));
        int i3 = this.submitTextSize;
        if (i3 != 0) {
            this.submitButton.setTextSize((float) i3);
        }
        this.submitButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                ConfirmPopup.this.dismiss();
                ConfirmPopup.this.onSubmit();
            }
        });
        relativeLayout.addView(this.submitButton);
        return relativeLayout;
    }

    /* access modifiers changed from: protected */
    @Nullable
    public View makeFooterView() {
        View view = this.footerView;
        if (view != null) {
            return view;
        }
        return null;
    }
}
