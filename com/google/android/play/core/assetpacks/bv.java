package com.google.android.play.core.assetpacks;

final class bv extends RuntimeException {

    /* renamed from: a  reason: collision with root package name */
    final int f10876a;

    bv(String str) {
        super(str);
        this.f10876a = -1;
    }

    bv(String str, int i) {
        super(str);
        this.f10876a = i;
    }

    bv(String str, Exception exc) {
        super(str, exc);
        this.f10876a = -1;
    }

    bv(String str, Exception exc, int i) {
        super(str, exc);
        this.f10876a = i;
    }
}
