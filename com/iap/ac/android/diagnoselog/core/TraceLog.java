package com.iap.ac.android.diagnoselog.core;

import android.os.Process;
import java.text.SimpleDateFormat;
import java.util.Locale;

public class TraceLog {

    /* renamed from: a  reason: collision with root package name */
    public String f9703a;
    public String b;
    public String c;
    public Throwable d;
    public int e;
    public String f;
    public String g;
    public SimpleDateFormat h = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS", Locale.getDefault());

    public TraceLog(String str, String str2, String str3, Throwable th) {
        this.f9703a = str;
        this.b = str2;
        this.c = str3;
        this.d = th;
        this.e = Process.myTid();
        this.f = Thread.currentThread().getName();
        this.g = DiagnoseLogContext.b().c();
    }
}
