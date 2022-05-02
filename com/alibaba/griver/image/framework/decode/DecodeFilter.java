package com.alibaba.griver.image.framework.decode;

public class DecodeFilter {
    public int format = -1;
    public int height = -1;
    public int width = -1;

    public boolean checkFilter(int i, int i2, int i3) {
        return a() && this.format == i && i2 >= this.width && i3 >= this.height;
    }

    private boolean a() {
        return this.format >= 0 && this.width > 0 && this.height > 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("DecodeFilter{fm=");
        sb.append(this.format);
        sb.append(", w=");
        sb.append(this.width);
        sb.append(", h=");
        sb.append(this.height);
        sb.append('}');
        return sb.toString();
    }
}
