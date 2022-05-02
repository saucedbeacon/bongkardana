package com.alibaba.griver.ui.titlebar;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import androidx.annotation.AttrRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.alibaba.griver.ui.R;

public class H5TitleBarFrameLayout extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    private ColorDrawable f10630a = null;
    private boolean b = true;

    public H5TitleBarFrameLayout(@NonNull Context context) {
        super(context);
        a();
    }

    public H5TitleBarFrameLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }

    public H5TitleBarFrameLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i) {
        super(context, attributeSet, i);
        a();
    }

    private void a() {
        ColorDrawable colorDrawable = new ColorDrawable(getResources().getColor(R.color.griver_nav_bar));
        this.f10630a = colorDrawable;
        setBackgroundDrawable(colorDrawable);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
    }

    public ColorDrawable getContentBgView() {
        return this.f10630a;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        return this.b;
    }

    public void setPreventTouchEvent(boolean z) {
        this.b = z;
    }
}
