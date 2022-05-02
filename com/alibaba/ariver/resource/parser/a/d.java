package com.alibaba.ariver.resource.parser.a;

public class d {

    /* renamed from: a  reason: collision with root package name */
    public StringBuffer f10192a = new StringBuffer();
    public int b;
    public int c;
    public int d;
    public long e;
    public long f;
    public int g;
    public byte h;
    public StringBuffer i = new StringBuffer();
    public StringBuffer j = new StringBuffer("ustar");
    public StringBuffer k;
    public StringBuffer l;
    public int m;
    public int n;

    /* renamed from: o  reason: collision with root package name */
    public StringBuffer f10193o;

    public d() {
        String property = System.getProperty("user.name", "");
        property = property.length() > 31 ? property.substring(0, 31) : property;
        this.c = 0;
        this.d = 0;
        this.k = new StringBuffer(property);
        this.l = new StringBuffer("");
        this.f10193o = new StringBuffer();
    }

    public static StringBuffer a(byte[] bArr, int i2, int i3) {
        StringBuffer stringBuffer = new StringBuffer(i3);
        int i4 = i3 + i2;
        while (i2 < i4 && bArr[i2] != 0) {
            stringBuffer.append((char) bArr[i2]);
            i2++;
        }
        return stringBuffer;
    }
}
