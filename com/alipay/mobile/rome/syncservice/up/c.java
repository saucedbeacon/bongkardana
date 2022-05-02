package com.alipay.mobile.rome.syncservice.up;

final class c {

    /* renamed from: a  reason: collision with root package name */
    public volatile int f9504a;
    public volatile int b = 0;

    public c(int i) {
        this.f9504a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && this.f9504a == ((c) obj).f9504a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[sequence=");
        sb.append(this.f9504a);
        sb.append(", retryTimes=");
        sb.append(this.b);
        sb.append("]");
        return sb.toString();
    }

    public final int hashCode() {
        return this.f9504a + 629;
    }
}
