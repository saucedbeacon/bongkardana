package com.google.android.play.core.splitcompat;

import java.util.Set;

final class o implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Set f9616a;
    final /* synthetic */ SplitCompat b;

    o(SplitCompat splitCompat, Set set) {
        this.b = splitCompat;
        this.f9616a = set;
    }

    public final void run() {
        try {
            for (String f : this.f9616a) {
                this.b.b.f(f);
            }
        } catch (Exception unused) {
        }
    }
}
