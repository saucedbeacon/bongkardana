package com.alipay.iap.android.aplog.monitor.base;

import android.os.Looper;
import android.util.Printer;
import java.util.ArrayList;
import java.util.List;

public class MainLooperLogger implements Printer {

    /* renamed from: a  reason: collision with root package name */
    private static MainLooperLogger f10656a;
    private List<Printer> b = new ArrayList();
    private boolean c = false;
    private List<Printer> d = new ArrayList();

    public static MainLooperLogger a() {
        if (f10656a == null) {
            synchronized (MainLooperLogger.class) {
                if (f10656a == null) {
                    f10656a = new MainLooperLogger();
                }
            }
        }
        return f10656a;
    }

    private MainLooperLogger() {
    }

    public void a(Printer printer) {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            if (!this.b.contains(printer)) {
                this.c = true;
                this.b.add(printer);
            }
            if (this.b.size() > 0) {
                Looper.getMainLooper().setMessageLogging(this);
                return;
            }
            return;
        }
        throw new RuntimeException("calling addMessageLogging not in main thread.");
    }

    public void b(Printer printer) {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            if (this.b.contains(printer)) {
                this.c = true;
            }
            this.b.remove(printer);
            if (this.b.size() <= 0) {
                Looper.getMainLooper().setMessageLogging((Printer) null);
                return;
            }
            return;
        }
        throw new RuntimeException("calling removeMessageLogging not in main thread.");
    }

    public void println(String str) {
        if (this.c) {
            this.d.clear();
            this.d.addAll(this.b);
            this.c = false;
        }
        for (int i = 0; i < this.d.size(); i++) {
            Printer printer = this.d.get(i);
            if (printer != null) {
                printer.println(str);
            }
        }
    }
}
