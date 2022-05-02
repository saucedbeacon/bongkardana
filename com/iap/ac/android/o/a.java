package com.iap.ac.android.o;

import com.iap.ac.android.biz.common.callback.MultiLanguageCallback;

public final class a implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ MultiLanguageCallback f11060a;
    public final /* synthetic */ Object b;

    public a(MultiLanguageCallback multiLanguageCallback, Object obj) {
        this.f11060a = multiLanguageCallback;
        this.b = obj;
    }

    public final void run() {
        this.f11060a.onResult(this.b);
    }
}
