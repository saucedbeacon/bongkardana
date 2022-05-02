package com.google.android.youtube.player.internal;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.youtube.player.YouTubeThumbnailView;
import com.google.android.youtube.player.internal.j;

public final class p extends a {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final Handler f11020a = new Handler(Looper.getMainLooper());
    private b b;
    private k c;
    /* access modifiers changed from: private */
    public boolean d;
    /* access modifiers changed from: private */
    public boolean e;

    final class a extends j.a {
        private a() {
        }

        /* synthetic */ a(p pVar, byte b) {
            this();
        }

        public final void a(Bitmap bitmap, String str, boolean z, boolean z2) {
            final boolean z3 = z;
            final boolean z4 = z2;
            final Bitmap bitmap2 = bitmap;
            final String str2 = str;
            p.this.f11020a.post(new Runnable() {
                public final void run() {
                    boolean unused = p.this.d = z3;
                    boolean unused2 = p.this.e = z4;
                    p.this.a(bitmap2, str2);
                }
            });
        }

        public final void a(final String str, final boolean z, final boolean z2) {
            p.this.f11020a.post(new Runnable() {
                public final void run() {
                    boolean unused = p.this.d = z;
                    boolean unused2 = p.this.e = z2;
                    p.this.b(str);
                }
            });
        }
    }

    public p(b bVar, YouTubeThumbnailView youTubeThumbnailView) {
        super(youTubeThumbnailView);
        this.b = (b) ab.a(bVar, (Object) "connectionClient cannot be null");
        this.c = bVar.a((j) new a(this, (byte) 0));
    }

    public final void a(String str) {
        try {
            this.c.a(str);
        } catch (RemoteException e2) {
            throw new IllegalStateException(e2);
        }
    }

    public final void a(String str, int i) {
        try {
            this.c.a(str, i);
        } catch (RemoteException e2) {
            throw new IllegalStateException(e2);
        }
    }

    /* access modifiers changed from: protected */
    public final boolean a() {
        return super.a() && this.c != null;
    }

    public final void c() {
        try {
            this.c.a();
        } catch (RemoteException e2) {
            throw new IllegalStateException(e2);
        }
    }

    public final void d() {
        try {
            this.c.b();
        } catch (RemoteException e2) {
            throw new IllegalStateException(e2);
        }
    }

    public final void e() {
        try {
            this.c.c();
        } catch (RemoteException e2) {
            throw new IllegalStateException(e2);
        }
    }

    public final boolean f() {
        return this.e;
    }

    public final boolean g() {
        return this.d;
    }

    public final void h() {
        try {
            this.c.d();
        } catch (RemoteException unused) {
        }
        this.b.d();
        this.c = null;
        this.b = null;
    }
}
