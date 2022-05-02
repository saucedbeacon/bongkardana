package com.alibaba.griver.core.a;

import android.content.ServiceConnection;
import java.util.Observable;

public class a extends Observable {

    /* renamed from: a  reason: collision with root package name */
    private int f9180a;
    private int b;
    private int c;
    private long d = -1;
    private String e;
    private ServiceConnection f;

    public int a() {
        return this.f9180a;
    }

    public void a(int i) {
        this.f9180a = i;
    }

    public int b() {
        return this.b;
    }

    public void b(int i) {
        this.b = i;
    }

    public int c() {
        return this.c;
    }

    public void c(int i) {
        this.c = i;
    }

    public long d() {
        return this.d;
    }

    public void a(long j) {
        this.d = j;
    }

    public String e() {
        return this.e;
    }

    public void a(String str) {
        this.e = str;
    }

    public void a(ServiceConnection serviceConnection) {
        this.f = serviceConnection;
    }

    public void f() {
        this.b = -1;
        this.d = -1;
        this.e = null;
        this.c = 0;
    }
}
