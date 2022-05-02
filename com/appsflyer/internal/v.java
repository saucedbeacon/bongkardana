package com.appsflyer.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import java.io.IOException;
import java.util.concurrent.LinkedBlockingQueue;

final class v {
    v() {
    }

    /* renamed from: ˎ  reason: contains not printable characters */
    static c m1287(Context context) throws Exception {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            try {
                context.getPackageManager().getPackageInfo("com.android.vending", 0);
                d dVar = new d((byte) 0);
                Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                intent.setPackage("com.google.android.gms");
                try {
                    if (!context.bindService(intent, dVar, 1)) {
                        if (context != null) {
                            context.unbindService(dVar);
                        }
                        throw new IOException("Google Play connection failed");
                    } else if (!dVar.f8781) {
                        dVar.f8781 = true;
                        e eVar = new e(dVar.f8780.take());
                        c cVar = new c(eVar.m1289(), eVar.m1288());
                        if (context != null) {
                            context.unbindService(dVar);
                        }
                        return cVar;
                    } else {
                        throw new IllegalStateException();
                    }
                } catch (Exception e2) {
                    throw e2;
                } catch (Throwable th) {
                    if (context != null) {
                        context.unbindService(dVar);
                    }
                    throw th;
                }
            } catch (Exception e3) {
                throw e3;
            }
        } else {
            throw new IllegalStateException("Cannot be called from the main thread");
        }
    }

    static final class c {

        /* renamed from: ˊ  reason: contains not printable characters */
        final boolean f8778;

        /* renamed from: ˎ  reason: contains not printable characters */
        final String f8779;

        c(String str, boolean z) {
            this.f8779 = str;
            this.f8778 = z;
        }
    }

    static final class d implements ServiceConnection {

        /* renamed from: ˋ  reason: contains not printable characters */
        final LinkedBlockingQueue<IBinder> f8780;

        /* renamed from: ॱ  reason: contains not printable characters */
        boolean f8781;

        public final void onServiceDisconnected(ComponentName componentName) {
        }

        private d() {
            this.f8780 = new LinkedBlockingQueue<>(1);
            this.f8781 = false;
        }

        /* synthetic */ d(byte b) {
            this();
        }

        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                this.f8780.put(iBinder);
            } catch (InterruptedException unused) {
            }
        }
    }

    static final class e implements IInterface {

        /* renamed from: ॱ  reason: contains not printable characters */
        private IBinder f8782;

        e(IBinder iBinder) {
            this.f8782 = iBinder;
        }

        public final IBinder asBinder() {
            return this.f8782;
        }

        /* renamed from: ˏ  reason: contains not printable characters */
        public final String m1289() throws RemoteException {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                this.f8782.transact(1, obtain, obtain2, 0);
                obtain2.readException();
                return obtain2.readString();
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: ˋ  reason: contains not printable characters */
        public final boolean m1288() throws RemoteException {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                boolean z = true;
                obtain.writeInt(1);
                this.f8782.transact(2, obtain, obtain2, 0);
                obtain2.readException();
                if (obtain2.readInt() == 0) {
                    z = false;
                }
                return z;
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }
    }
}
