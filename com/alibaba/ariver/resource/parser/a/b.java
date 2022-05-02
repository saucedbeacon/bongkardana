package com.alibaba.ariver.resource.parser.a;

import java.io.File;

public class b {

    /* renamed from: a  reason: collision with root package name */
    protected File f10190a;
    private d b;

    private b() {
        this.f10190a = null;
        this.b = new d();
    }

    b(byte[] bArr) {
        this();
        a(bArr);
    }

    public String a() {
        String obj = this.b.f10192a.toString();
        if (this.b.f10193o == null || this.b.f10193o.toString().equals("")) {
            return obj;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.b.f10193o.toString());
        sb.append("/");
        sb.append(obj);
        return sb.toString();
    }

    public long b() {
        return this.b.e;
    }

    public boolean c() {
        File file = this.f10190a;
        if (file != null) {
            return file.isDirectory();
        }
        d dVar = this.b;
        if (dVar == null) {
            return false;
        }
        if (dVar.h != 53 && !this.b.f10192a.toString().endsWith("/")) {
            return false;
        }
        return true;
    }

    public void a(byte[] bArr) {
        this.b.f10192a = d.a(bArr, 0, 100);
        this.b.b = (int) a.a(bArr, 100, 8);
        this.b.c = (int) a.a(bArr, 108, 8);
        this.b.d = (int) a.a(bArr, 116, 8);
        this.b.e = a.a(bArr, 124, 12);
        this.b.f = a.a(bArr, 136, 12);
        this.b.g = (int) a.a(bArr, 148, 8);
        this.b.h = bArr[156];
        this.b.i = d.a(bArr, 157, 100);
        this.b.j = d.a(bArr, 257, 8);
        this.b.k = d.a(bArr, 265, 32);
        this.b.l = d.a(bArr, 297, 32);
        this.b.m = (int) a.a(bArr, 329, 8);
        this.b.n = (int) a.a(bArr, 337, 8);
        this.b.f10193o = d.a(bArr, 345, 155);
    }
}
