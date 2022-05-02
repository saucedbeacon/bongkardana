package com.google.android.youtube.player.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.android.youtube.player.YouTubeApiServiceUtil;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.internal.c;
import com.google.android.youtube.player.internal.i;
import com.google.android.youtube.player.internal.t;
import java.util.ArrayList;

public abstract class r<T extends IInterface> implements t {

    /* renamed from: a  reason: collision with root package name */
    final Handler f9658a;
    private final Context b;
    /* access modifiers changed from: private */
    public T c;
    /* access modifiers changed from: private */
    public ArrayList<t.a> d;
    private final ArrayList<t.a> e = new ArrayList<>();
    private boolean f = false;
    private ArrayList<t.b> g;
    private boolean h = false;
    /* access modifiers changed from: private */
    public final ArrayList<b<?>> i = new ArrayList<>();
    private ServiceConnection j;
    /* access modifiers changed from: private */
    public boolean k = false;

    /* renamed from: com.google.android.youtube.player.internal.r$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f9659a;

        static {
            int[] iArr = new int[YouTubeInitializationResult.values().length];
            f9659a = iArr;
            try {
                iArr[YouTubeInitializationResult.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    final class a extends Handler {
        a() {
        }

        public final void handleMessage(Message message) {
            if (message.what == 3) {
                r.this.a((YouTubeInitializationResult) message.obj);
            } else if (message.what == 4) {
                synchronized (r.this.d) {
                    if (r.this.k && r.this.f() && r.this.d.contains(message.obj)) {
                        ((t.a) message.obj).a();
                    }
                }
            } else if (message.what == 2 && !r.this.f()) {
            } else {
                if (message.what == 2 || message.what == 1) {
                    ((b) message.obj).a();
                }
            }
        }
    }

    protected abstract class b<TListener> {
        private TListener b;

        public b(TListener tlistener) {
            this.b = tlistener;
            synchronized (r.this.i) {
                r.this.i.add(this);
            }
        }

        public final void a() {
            TListener tlistener;
            synchronized (this) {
                tlistener = this.b;
            }
            a(tlistener);
        }

        /* access modifiers changed from: protected */
        public abstract void a(TListener tlistener);

        public final void b() {
            synchronized (this) {
                this.b = null;
            }
        }
    }

    protected final class c extends b<Boolean> {
        public final YouTubeInitializationResult b;
        public final IBinder c;

        public c(String str, IBinder iBinder) {
            super(Boolean.TRUE);
            this.b = r.b(str);
            this.c = iBinder;
        }

        /* access modifiers changed from: protected */
        public final /* synthetic */ void a(Object obj) {
            if (((Boolean) obj) == null) {
                return;
            }
            if (AnonymousClass1.f9659a[this.b.ordinal()] != 1) {
                r.this.a(this.b);
                return;
            }
            try {
                if (r.this.b().equals(this.c.getInterfaceDescriptor())) {
                    IInterface unused = r.this.c = r.this.a(this.c);
                    if (r.this.c != null) {
                        r.this.g();
                        return;
                    }
                }
            } catch (RemoteException unused2) {
            }
            r.this.a();
            r.this.a(YouTubeInitializationResult.INTERNAL_ERROR);
        }
    }

    protected final class d extends c.a {
        protected d() {
        }

        public final void a(String str, IBinder iBinder) {
            r.this.f9658a.sendMessage(r.this.f9658a.obtainMessage(1, new c(str, iBinder)));
        }
    }

    final class e implements ServiceConnection {
        e() {
        }

        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            r.this.b(iBinder);
        }

        public final void onServiceDisconnected(ComponentName componentName) {
            IInterface unused = r.this.c = null;
            r.this.h();
        }
    }

    protected r(Context context, t.a aVar, t.b bVar) {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            this.b = (Context) ab.a(context);
            ArrayList<t.a> arrayList = new ArrayList<>();
            this.d = arrayList;
            arrayList.add(ab.a(aVar));
            ArrayList<t.b> arrayList2 = new ArrayList<>();
            this.g = arrayList2;
            arrayList2.add(ab.a(bVar));
            this.f9658a = new a();
            return;
        }
        throw new IllegalStateException("Clients must be created on the UI thread.");
    }

    /* access modifiers changed from: private */
    public void a() {
        ServiceConnection serviceConnection = this.j;
        if (serviceConnection != null) {
            try {
                this.b.unbindService(serviceConnection);
            } catch (IllegalArgumentException unused) {
            }
        }
        this.c = null;
        this.j = null;
    }

    /* access modifiers changed from: private */
    public static YouTubeInitializationResult b(String str) {
        try {
            return YouTubeInitializationResult.valueOf(str);
        } catch (IllegalArgumentException unused) {
            return YouTubeInitializationResult.UNKNOWN_ERROR;
        } catch (NullPointerException unused2) {
            return YouTubeInitializationResult.UNKNOWN_ERROR;
        }
    }

    /* access modifiers changed from: protected */
    public abstract T a(IBinder iBinder);

    /* access modifiers changed from: protected */
    public final void a(YouTubeInitializationResult youTubeInitializationResult) {
        this.f9658a.removeMessages(4);
        synchronized (this.g) {
            this.h = true;
            ArrayList<t.b> arrayList = this.g;
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                if (this.k) {
                    if (this.g.contains(arrayList.get(i2))) {
                        arrayList.get(i2).a(youTubeInitializationResult);
                    }
                    i2++;
                } else {
                    return;
                }
            }
            this.h = false;
        }
    }

    /* access modifiers changed from: protected */
    public abstract void a(i iVar, d dVar) throws RemoteException;

    /* access modifiers changed from: protected */
    public abstract String b();

    /* access modifiers changed from: protected */
    public final void b(IBinder iBinder) {
        try {
            a(i.a.a(iBinder), new d());
        } catch (RemoteException unused) {
        }
    }

    /* access modifiers changed from: protected */
    public abstract String c();

    public void d() {
        h();
        this.k = false;
        synchronized (this.i) {
            int size = this.i.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.i.get(i2).b();
            }
            this.i.clear();
        }
        a();
    }

    public final void e() {
        this.k = true;
        YouTubeInitializationResult isYouTubeApiServiceAvailable = YouTubeApiServiceUtil.isYouTubeApiServiceAvailable(this.b);
        if (isYouTubeApiServiceAvailable != YouTubeInitializationResult.SUCCESS) {
            Handler handler = this.f9658a;
            handler.sendMessage(handler.obtainMessage(3, isYouTubeApiServiceAvailable));
            return;
        }
        Intent intent = new Intent(c()).setPackage(z.a(this.b));
        if (this.j != null) {
            a();
        }
        e eVar = new e();
        this.j = eVar;
        if (!this.b.bindService(intent, eVar, TsExtractor.TS_STREAM_TYPE_AC3)) {
            Handler handler2 = this.f9658a;
            handler2.sendMessage(handler2.obtainMessage(3, YouTubeInitializationResult.ERROR_CONNECTING_TO_SERVICE));
        }
    }

    public final boolean f() {
        return this.c != null;
    }

    /* access modifiers changed from: protected */
    public final void g() {
        synchronized (this.d) {
            boolean z = true;
            ab.a(!this.f);
            this.f9658a.removeMessages(4);
            this.f = true;
            if (this.e.size() != 0) {
                z = false;
            }
            ab.a(z);
            ArrayList<t.a> arrayList = this.d;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size && this.k && f(); i2++) {
                if (!this.e.contains(arrayList.get(i2))) {
                    arrayList.get(i2).a();
                }
            }
            this.e.clear();
            this.f = false;
        }
    }

    /* access modifiers changed from: protected */
    public final void h() {
        this.f9658a.removeMessages(4);
        synchronized (this.d) {
            this.f = true;
            ArrayList<t.a> arrayList = this.d;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size && this.k; i2++) {
                if (this.d.contains(arrayList.get(i2))) {
                    arrayList.get(i2).b();
                }
            }
            this.f = false;
        }
    }

    /* access modifiers changed from: protected */
    public final void i() {
        if (!f()) {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }

    /* access modifiers changed from: protected */
    public final T j() {
        i();
        return this.c;
    }
}
