package com.alibaba.ariver.kernel.common.runnable;

import com.alibaba.ariver.kernel.common.utils.RVLogger;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;

public class OneShotRunnable implements Runnable {
    static boolean sUseWeakRef = false;

    /* renamed from: a  reason: collision with root package name */
    private String f10114a;
    private WeakReference<Runnable> b;
    private Runnable c;
    private AtomicBoolean d;

    public OneShotRunnable(Runnable runnable) {
        this("EMPTY", runnable);
    }

    public OneShotRunnable(String str, Runnable runnable) {
        this.d = new AtomicBoolean(false);
        this.f10114a = str;
        if (sUseWeakRef) {
            this.b = new WeakReference<>(runnable);
        } else {
            this.c = runnable;
        }
    }

    public void run() {
        if (this.d.getAndSet(true)) {
            StringBuilder sb = new StringBuilder("OneShotRunnable [");
            sb.append(this.f10114a);
            sb.append("] already executed!");
            RVLogger.d("AriverKernel:OneShotRunnable", sb.toString());
        } else if (sUseWeakRef) {
            WeakReference<Runnable> weakReference = this.b;
            if (weakReference != null) {
                Runnable runnable = weakReference.get();
                if (runnable != null) {
                    runnable.run();
                } else {
                    StringBuilder sb2 = new StringBuilder("OneShotRunnable [");
                    sb2.append(this.f10114a);
                    sb2.append("] already recycled!");
                    RVLogger.d("AriverKernel:OneShotRunnable", sb2.toString());
                }
                this.b = null;
            }
        } else {
            Runnable runnable2 = this.c;
            if (runnable2 != null) {
                runnable2.run();
                this.c = null;
            }
        }
    }
}
