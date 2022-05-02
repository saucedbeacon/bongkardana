package com.zoloz.android.phone.zdoc.render;

import android.view.View;
import com.zoloz.android.phone.zdoc.R2;
import com.zoloz.android.phone.zdoc.ui.BaseMaskView;

public class MaskViewRender extends BaseRender {
    private final BaseMaskView maskView;

    /* access modifiers changed from: protected */
    public void renderBg() {
    }

    /* access modifiers changed from: protected */
    public void renderLabel() {
    }

    public MaskViewRender(View view) {
        super(view);
        this.maskView = (BaseMaskView) view;
    }

    /* access modifiers changed from: protected */
    public void renderColor() {
        this.maskView.setLineColor(R2.color.zdoc_line_color());
        this.maskView.setMaskColor(R2.color.zdoc_frame_bg_color());
    }
}
