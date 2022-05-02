package com.alibaba.griver.ui.blur;

import android.graphics.Bitmap;

public class StackBlurManager {
    static final int EXECUTOR_THREADS = 2;

    /* renamed from: a  reason: collision with root package name */
    private final Bitmap f10577a;
    private final BlurProcess b = new JavaBlurProcess();
    private Bitmap c;

    public StackBlurManager(Bitmap bitmap) {
        this.f10577a = bitmap;
    }

    public Bitmap process(int i) {
        Bitmap blur = this.b.blur(this.f10577a, (float) i);
        this.c = blur;
        return blur;
    }
}
