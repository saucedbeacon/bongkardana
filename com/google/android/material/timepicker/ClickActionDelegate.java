package com.google.android.material.timepicker;

import android.content.Context;
import android.view.View;
import o.onSupportActionModeFinished;
import o.setOnCancelListener;

class ClickActionDelegate extends setOnCancelListener {
    private final onSupportActionModeFinished.setMax clickAction;

    public ClickActionDelegate(Context context, int i) {
        this.clickAction = new onSupportActionModeFinished.setMax(16, context.getString(i));
    }

    public void onInitializeAccessibilityNodeInfo(View view, onSupportActionModeFinished onsupportactionmodefinished) {
        super.onInitializeAccessibilityNodeInfo(view, onsupportactionmodefinished);
        onsupportactionmodefinished.setMin(this.clickAction);
    }
}
