package com.google.android.play.core.splitcompat;

final class n implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ SplitCompat f9615a;

    n(SplitCompat splitCompat) {
        this.f9615a = splitCompat;
    }

    public final void run() {
        try {
            this.f9615a.b.a();
        } catch (Exception unused) {
        }
    }
}
