package com.zoloz.android.phone.zdoc.ui;

import android.content.Context;
import android.graphics.RectF;
import android.util.AttributeSet;
import com.alipay.mobile.security.bio.utils.DisplayUtil;
import com.zoloz.android.phone.zdoc.ui.BaseMaskView;
import java.util.List;

public class EmptyMaskView extends BaseMaskView {
    /* access modifiers changed from: protected */
    public List<BaseMaskView.AbsMaskDrawer> getCoverDrawer(int i, int i2) {
        return null;
    }

    /* access modifiers changed from: protected */
    public List<BaseMaskView.AbsMaskDrawer> getFrameDrawer(int i, int i2) {
        return null;
    }

    public EmptyMaskView(Context context) {
        super(context);
    }

    public EmptyMaskView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public EmptyMaskView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* access modifiers changed from: protected */
    public RectF calcCaptureRect(int i, int i2) {
        return new RectF(0.0f, (float) DisplayUtil.dip2px(getContext(), 48.0f), (float) i, (float) (i2 - getInvisibleHeight()));
    }

    public int getTipsBottomMargin() {
        return (int) (((float) getHeight()) * 0.85f);
    }
}
