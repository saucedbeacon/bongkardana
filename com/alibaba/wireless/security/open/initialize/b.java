package com.alibaba.wireless.security.open.initialize;

import android.content.Context;
import com.alibaba.wireless.security.framework.ISGPluginManager;
import com.alibaba.wireless.security.framework.d;
import com.alibaba.wireless.security.framework.utils.a;
import com.alibaba.wireless.security.open.SecException;
import com.alibaba.wireless.security.open.initialize.IInitializeComponent;
import java.util.HashSet;
import java.util.Set;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

public class b {

    /* renamed from: a  reason: collision with root package name */
    boolean f9224a = false;
    private Set<IInitializeComponent.IInitFinishListener> b = new HashSet();
    private Object c = new Object();
    private String d = null;
    private ISGPluginManager e = null;

    public b() {
    }

    public b(String str) {
        this.d = str;
    }

    private void a(boolean z) {
        for (IInitializeComponent.IInitFinishListener next : this.b) {
            if (z) {
                next.onSuccess();
            } else {
                next.onError();
            }
        }
    }

    private void b() {
        for (IInitializeComponent.IInitFinishListener next : this.b) {
            if (next instanceof IInitializeComponent.IInitFinishListenerV2) {
                ((IInitializeComponent.IInitFinishListenerV2) next).onStart();
            }
        }
    }

    /* access modifiers changed from: private */
    public void c() {
        synchronized (this.c) {
            for (IInitializeComponent.IInitFinishListener onError : this.b) {
                onError.onError();
            }
        }
    }

    public int a(Context context, String str, boolean z, boolean z2) throws SecException {
        Context context2 = null;
        Context applicationContext = context != null ? context.getApplicationContext() : null;
        if (applicationContext != null) {
            int length = str != null ? str.length() : 0;
            int min = dispatchOnCancelled.setMin(applicationContext, length);
            if (length != min) {
                onCanceled oncanceled = new onCanceled(length, min, 8);
                onCancelLoad.setMax(-5732335, oncanceled);
                onCancelLoad.getMin(-5732335, oncanceled);
            }
        }
        if (context != null) {
            context2 = context.getApplicationContext();
        }
        if (context2 != null) {
            int length2 = str != null ? str.length() : 0;
            int min2 = dispatchOnCancelled.getMin(context2, length2);
            if (length2 != min2) {
                onCanceled oncanceled2 = new onCanceled(length2, min2, 32);
                onCancelLoad.setMax(-5732335, oncanceled2);
                onCancelLoad.getMin(-5732335, oncanceled2);
            }
        }
        synchronized (this.c) {
            if (!this.f9224a) {
                b();
                if (context != null) {
                    long b2 = a.b();
                    d dVar = new d();
                    dVar.a(context, this.d, str, z, new Object[0]);
                    dVar.getPluginInfo(dVar.getMainPluginName());
                    a.a("main", "getInstance", "", b2);
                    this.e = dVar;
                    this.f9224a = true;
                    a(true);
                } else {
                    throw new SecException(101);
                }
            }
        }
        return this.f9224a ? 0 : 1;
    }

    public ISGPluginManager a() {
        return this.e;
    }

    public void a(IInitializeComponent.IInitFinishListener iInitFinishListener) throws SecException {
        if (iInitFinishListener != null) {
            synchronized (this.c) {
                this.b.add(iInitFinishListener);
            }
        }
    }

    public boolean a(Context context) throws SecException {
        return true;
    }

    public void b(Context context, String str, boolean z, boolean z2) throws SecException {
        if (context != null) {
            final Context context2 = context;
            final String str2 = str;
            final boolean z3 = z;
            final boolean z4 = z2;
            new Thread(new Runnable() {
                public void run() {
                    try {
                        b.this.a(context2, str2, z3, z4);
                    } catch (SecException unused) {
                        b.this.c();
                    }
                }
            }).start();
            return;
        }
        throw new SecException(101);
    }

    public void b(IInitializeComponent.IInitFinishListener iInitFinishListener) throws SecException {
        if (iInitFinishListener != null) {
            synchronized (this.c) {
                this.b.remove(iInitFinishListener);
            }
        }
    }
}
