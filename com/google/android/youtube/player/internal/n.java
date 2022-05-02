package com.google.android.youtube.player.internal;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;

public final class n extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    private final ProgressBar f9657a;
    private final TextView b;

    public n(Context context) {
        super(context, (AttributeSet) null, z.c(context));
        m mVar = new m(context);
        setBackgroundColor(-16777216);
        ProgressBar progressBar = new ProgressBar(context);
        this.f9657a = progressBar;
        progressBar.setVisibility(8);
        addView(this.f9657a, new FrameLayout.LayoutParams(-2, -2, 17));
        int i = (int) ((context.getResources().getDisplayMetrics().density * 10.0f) + 0.5f);
        TextView textView = new TextView(context);
        this.b = textView;
        textView.setTextAppearance(context, 16973894);
        this.b.setTextColor(-1);
        this.b.setVisibility(8);
        this.b.setPadding(i, i, i, i);
        this.b.setGravity(17);
        this.b.setText(mVar.f11019a);
        addView(this.b, new FrameLayout.LayoutParams(-2, -2, 17));
    }

    public final void a() {
        this.f9657a.setVisibility(8);
        this.b.setVisibility(8);
    }

    public final void b() {
        this.f9657a.setVisibility(0);
        this.b.setVisibility(8);
    }

    public final void c() {
        this.f9657a.setVisibility(8);
        this.b.setVisibility(0);
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        float f;
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        if (!(mode == 1073741824 && mode2 == 1073741824)) {
            if (mode == 1073741824 || (mode == Integer.MIN_VALUE && mode2 == 0)) {
                size2 = (int) (((float) size) / 1.777f);
            } else {
                if (mode2 == 1073741824 || (mode2 == Integer.MIN_VALUE && mode == 0)) {
                    f = (float) size2;
                } else if (mode == Integer.MIN_VALUE && mode2 == Integer.MIN_VALUE) {
                    f = (float) size2;
                    float f2 = ((float) size) / 1.777f;
                    if (f >= f2) {
                        size2 = (int) f2;
                    }
                } else {
                    size = 0;
                    size2 = 0;
                }
                size = (int) (f * 1.777f);
            }
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(resolveSize(size, i), 1073741824), View.MeasureSpec.makeMeasureSpec(resolveSize(size2, i2), 1073741824));
    }
}
