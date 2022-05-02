package com.alipay.imobile.network.quake.a;

import com.j256.ormlite.stmt.query.SimpleComparison;

public class a implements Cloneable {

    /* renamed from: a  reason: collision with root package name */
    private final String f9347a;
    private final String b;

    public a(String str, String str2) {
        if (str != null) {
            this.f9347a = str;
            this.b = str2;
            return;
        }
        throw new IllegalArgumentException("Name may not be null");
    }

    private static int a(int i, int i2) {
        return (i * 37) + i2;
    }

    public static int a(int i, Object obj) {
        return a(i, obj != null ? obj.hashCode() : 0);
    }

    public String a() {
        return this.f9347a;
    }

    public String b() {
        return this.b;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f9347a.equals(aVar.f9347a)) {
                String str = this.b;
                String str2 = aVar.b;
                return str != null ? str.equals(str2) : str2 == null;
            }
        }
    }

    public int hashCode() {
        return a(a(17, (Object) this.f9347a), (Object) this.b);
    }

    public String toString() {
        int length = this.f9347a.length();
        String str = this.b;
        if (str != null) {
            length += str.length() + 1;
        }
        b bVar = new b(length);
        bVar.a(this.f9347a);
        if (this.b != null) {
            bVar.a(SimpleComparison.EQUAL_TO_OPERATION);
            bVar.a(this.b);
        }
        return bVar.toString();
    }
}
