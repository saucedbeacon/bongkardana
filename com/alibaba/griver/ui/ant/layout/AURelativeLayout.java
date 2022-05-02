package com.alibaba.griver.ui.ant.layout;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import com.alibaba.griver.ui.ant.api.AUViewInterface;
import com.alibaba.griver.ui.ant.helper.AUViewEventHelper;
import com.alibaba.griver.ui.ant.utils.AUAttrsUtils;
import com.alibaba.griver.ui.ant.utils.AUScreenUtils;

public class AURelativeLayout extends RelativeLayout implements AUViewInterface {

    /* renamed from: a  reason: collision with root package name */
    private AttributeSet f10558a;
    private Boolean b;

    public AURelativeLayout(Context context) {
        super(context);
    }

    public AURelativeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f10558a = attributeSet;
        if (AUScreenUtils.checkApFlag(context, attributeSet, this)) {
            AUAttrsUtils.adptApPadding(this, context);
            AUAttrsUtils.adptApMinMax(this, context);
        }
    }

    public AURelativeLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f10558a = attributeSet;
        if (AUScreenUtils.checkApFlag(context, attributeSet, this)) {
            AUAttrsUtils.adptApPadding(this, context);
            AUAttrsUtils.adptApMinMax(this, context);
        }
    }

    public RelativeLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        if (!AUScreenUtils.checkApFlag(getContext(), attributeSet, this)) {
            return super.generateLayoutParams(attributeSet);
        }
        if (getLayoutParams() != null && (getLayoutParams() instanceof GridLayoutManager.LayoutParams) && getSuggestedMinimumHeight() > 0 && getLayoutParams().height < getSuggestedMinimumHeight()) {
            getLayoutParams().height = getSuggestedMinimumHeight();
        }
        int[] viewSizeAndMargin = AUAttrsUtils.getViewSizeAndMargin(getContext(), AUAttrsUtils.handleAttrs(attributeSet));
        RelativeLayout.LayoutParams generateLayoutParams = super.generateLayoutParams(attributeSet);
        AUAttrsUtils.replaceLayoutParam(getContext(), generateLayoutParams, viewSizeAndMargin);
        return generateLayoutParams;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        try {
            if (getLayoutParams() == null) {
                setMeasuredDimension(getDefaultSize(getSuggestedMinimumWidth(), i), getDefaultSize(getSuggestedMinimumHeight(), i2));
            } else {
                super.onMeasure(i, i2);
            }
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder("APRelativeLayout:");
            sb.append(getId());
            StringBuffer stringBuffer = new StringBuffer(sb.toString());
            int childCount = getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (childAt != null) {
                    StringBuilder sb2 = new StringBuilder("|");
                    sb2.append(childAt.getId());
                    stringBuffer.append(sb2.toString());
                }
            }
            throw new IllegalStateException(stringBuffer.toString(), e);
        }
    }

    public void addView(View view) {
        a(view);
        super.addView(view);
    }

    private void a(View view) {
        if (view instanceof AUViewInterface) {
            AUViewInterface aUViewInterface = (AUViewInterface) view;
            if (aUViewInterface.isAP() == null) {
                aUViewInterface.setAP(isAP());
            }
        }
    }

    public void addView(View view, int i) {
        a(view);
        super.addView(view, i);
    }

    public void addView(View view, int i, int i2) {
        a(view);
        super.addView(view, i, i2);
    }

    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        a(view);
        super.addView(view, layoutParams);
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        a(view);
        super.addView(view, i, layoutParams);
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        super.setOnClickListener(AUViewEventHelper.wrapClickListener(onClickListener));
    }

    public Boolean isAP() {
        return this.b;
    }

    public void setAP(Boolean bool) {
        this.b = bool;
    }
}
