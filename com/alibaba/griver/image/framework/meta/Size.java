package com.alibaba.griver.image.framework.meta;

public class Size {

    /* renamed from: a  reason: collision with root package name */
    private final int f10479a;
    private final int b;

    public Size(int i, int i2) {
        this.f10479a = i;
        this.b = i2;
    }

    public int getWidth() {
        return this.f10479a;
    }

    public int getHeight() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof Size) {
            Size size = (Size) obj;
            return this.f10479a == size.f10479a && this.b == size.b;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f10479a);
        sb.append("x");
        sb.append(this.b);
        return sb.toString();
    }

    public int hashCode() {
        int i = this.b;
        int i2 = this.f10479a;
        return i ^ ((i2 >>> 16) | (i2 << 16));
    }
}
