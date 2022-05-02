package com.appsflyer.internal;

public final class x {

    /* renamed from: ˊ  reason: contains not printable characters */
    private e f8803;

    /* renamed from: ˋ  reason: contains not printable characters */
    public boolean f8804;

    /* renamed from: ॱ  reason: contains not printable characters */
    public String f8805;

    x(e eVar, String str, boolean z) {
        this.f8803 = eVar;
        this.f8805 = str;
        this.f8804 = z;
    }

    public final String toString() {
        return String.format("%s,%s", new Object[]{this.f8805, Boolean.valueOf(this.f8804)});
    }

    enum e {
        GOOGLE(0),
        AMAZON(1);
        

        /* renamed from: ॱ  reason: contains not printable characters */
        private int f8809;

        private e(int i) {
            this.f8809 = i;
        }

        public final String toString() {
            return String.valueOf(this.f8809);
        }
    }
}
