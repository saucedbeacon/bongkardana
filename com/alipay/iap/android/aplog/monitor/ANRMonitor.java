package com.alipay.iap.android.aplog.monitor;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Printer;
import com.alipay.iap.android.aplog.core.LoggerFactory;
import com.alipay.iap.android.aplog.monitor.base.MainLooperLogger;
import com.alipay.iap.android.aplog.monitor.sampler.AllThreadsSampler;
import com.alipay.iap.android.aplog.monitor.sampler.CpuSampler;
import com.alipay.iap.android.aplog.monitor.sampler.MainStackSampler;
import com.alipay.iap.android.aplog.monitor.util.APMUtil;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public abstract class ANRMonitor implements Printer {
    static int g = -1;

    /* renamed from: a  reason: collision with root package name */
    String f10651a;
    long b = 0;
    final MainStackSampler c;
    final AllThreadsSampler d;
    final CpuSampler e;
    TimeOuter f;
    private boolean h = false;
    private boolean i = false;
    private long j = -1;
    private SharedPreferences k = null;
    private int l = -1;

    /* access modifiers changed from: package-private */
    public abstract void a(Map<String, String> map);

    /* access modifiers changed from: package-private */
    public abstract String b();

    /* access modifiers changed from: package-private */
    public abstract String c();

    /* access modifiers changed from: package-private */
    public abstract void c(long j2, long j3);

    private void h() {
        if (this.k == null) {
            this.k = APMUtil.a(LoggerFactory.getLogContext().getApplicationContext());
        }
    }

    /* access modifiers changed from: package-private */
    public void a() {
        synchronized (ANRMonitor.class) {
            try {
                h();
                if (((long) this.l) == -1) {
                    this.l = this.k.getInt(b(), 0);
                }
                this.l++;
                this.k.edit().putInt(b(), this.l).apply();
            } catch (Exception e2) {
                LoggerFactory.getTraceLogger().error("ANRMonitor", (Throwable) e2);
            }
        }
    }

    private int i() {
        int i2;
        synchronized (ANRMonitor.class) {
            try {
                h();
                if (((long) this.l) == -1) {
                    this.l = this.k.getInt(b(), 0);
                }
                i2 = this.l;
            } catch (Exception e2) {
                LoggerFactory.getTraceLogger().error("ANRMonitor", (Throwable) e2);
                return 10;
            } catch (Throwable th) {
                throw th;
            }
        }
        return i2;
    }

    /* access modifiers changed from: package-private */
    public boolean d() {
        try {
            long currentTimeMillis = System.currentTimeMillis();
            h();
            if (this.j == -1) {
                this.j = this.k.getLong(c(), -1);
            }
            if (this.j == -1) {
                this.j = currentTimeMillis;
                this.k.edit().putLong(c(), this.j).apply();
            }
            if (Math.abs(currentTimeMillis - this.j) > TimeUnit.DAYS.toMillis(1)) {
                this.j = currentTimeMillis;
                this.k.edit().putLong(c(), this.j).apply();
                j();
                return true;
            } else if (i() < 10) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e2) {
            LoggerFactory.getTraceLogger().error("ANRMonitor", (Throwable) e2);
            return false;
        }
    }

    private void j() {
        synchronized (ANRMonitor.class) {
            try {
                h();
                this.l = 0;
                this.k.edit().putInt(b(), this.l).apply();
            } catch (Exception e2) {
                LoggerFactory.getTraceLogger().error("ANRMonitor", (Throwable) e2);
            }
        }
    }

    public ANRMonitor(long j2, String str) {
        this.f10651a = str;
        long j3 = j2 / 5;
        this.c = new MainStackSampler(j3);
        this.d = new AllThreadsSampler((j2 * 2) / 5);
        this.e = new CpuSampler(j3);
        LoggerFactory.getTraceLogger().info("ANRMonitor", "new ANRMonitor");
    }

    public void println(String str) {
        if (this.h) {
            if (TextUtils.isEmpty(str)) {
                if (this.i) {
                    this.i = false;
                    l();
                }
            } else if (str.startsWith(">>>")) {
                if (this.i) {
                    this.i = false;
                    l();
                }
                if (!this.i) {
                    TimeOuter timeOuter = this.f;
                    long currentTimeMillis = System.currentTimeMillis();
                    timeOuter.b = currentTimeMillis;
                    this.b = currentTimeMillis;
                    this.i = true;
                    k();
                }
            } else if (this.i) {
                this.i = false;
                l();
            }
        }
    }

    public void e() {
        LoggerFactory.getTraceLogger().info("ANRMonitor", "start");
        if (!d()) {
            LoggerFactory.getTraceLogger().info("ANRMonitor", "already upload max");
        } else if (this.h) {
            LoggerFactory.getTraceLogger().info("ANRMonitor", "already started");
            MainLooperLogger.a().a(this);
        } else {
            this.h = true;
            MainLooperLogger.a().a(this);
        }
    }

    /* access modifiers changed from: package-private */
    public String a(long j2, long j3) {
        String c2 = this.c.c(j2, j3);
        return TextUtils.isEmpty(c2) ? "null" : c2;
    }

    /* access modifiers changed from: package-private */
    public String f() {
        return this.c.d();
    }

    /* access modifiers changed from: package-private */
    public void b(long j2, long j3) {
        this.c.d(j2, j3);
    }

    /* access modifiers changed from: package-private */
    public void g() {
        LoggerFactory.getTraceLogger().info("ANRMonitor", "stop");
        if (!this.h) {
            LoggerFactory.getTraceLogger().info("ANRMonitor", "already stopped");
            return;
        }
        this.h = false;
        MainLooperLogger.a().b(this);
        l();
        this.b = 0;
        this.f.b = 0;
        this.i = false;
    }

    private void k() {
        this.c.a();
        this.d.a();
        this.e.a();
        this.f.b();
    }

    private void l() {
        this.f.c();
        this.d.b();
        this.e.b();
        this.c.b();
    }
}
