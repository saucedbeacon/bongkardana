package com.alipay.imobile.network.quake.a;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    private char[] f9348a;
    private int b;

    public b(int i) {
        if (i >= 0) {
            this.f9348a = new char[i];
            return;
        }
        throw new IllegalArgumentException("Buffer capacity may not be negative");
    }

    private void a(int i) {
        char[] cArr = new char[Math.max(this.f9348a.length << 1, i)];
        System.arraycopy(this.f9348a, 0, cArr, 0, this.b);
        this.f9348a = cArr;
    }

    public final void a(String str) {
        if (str == null) {
            str = "null";
        }
        int length = str.length();
        int i = this.b + length;
        if (i > this.f9348a.length) {
            a(i);
        }
        str.getChars(0, length, this.f9348a, this.b);
        this.b = i;
    }

    public final String toString() {
        return new String(this.f9348a, 0, this.b);
    }
}
