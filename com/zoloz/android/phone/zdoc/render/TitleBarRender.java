package com.zoloz.android.phone.zdoc.render;

import android.annotation.TargetApi;
import android.view.View;
import com.zoloz.android.phone.zdoc.R;
import com.zoloz.android.phone.zdoc.R2;
import com.zoloz.android.phone.zdoc.utils.HotReloadDrawable;
import zoloz.ap.com.toolkit.R2;
import zoloz.ap.com.toolkit.ui.TitleBar;

public class TitleBarRender extends BaseRender {
    private TitleBar mTitleBar;

    public TitleBarRender(View view) {
        super(view);
        this.mTitleBar = (TitleBar) view;
    }

    public void render() {
        super.render();
        renderBack();
    }

    @TargetApi(16)
    public void renderBg() {
        if (this.view.getResources().getBoolean(R.bool.title_bar_with_line)) {
            this.mTitleBar.setBackground(HotReloadDrawable.titlebar_bg());
        } else {
            this.mTitleBar.setBackground(HotReloadDrawable.titlebar_bg_without_line());
        }
    }

    public void renderBack() {
        this.mTitleBar.setBackDrawable(R2.drawable.title_bar_back());
    }

    public void renderLabel() {
        this.mTitleBar.setText(R2.string.zdoc_title());
    }

    public void renderColor() {
        this.mTitleBar.setTextColor(R2.color.title_color());
    }
}
