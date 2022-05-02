package com.google.android.youtube.player.internal;

import android.content.res.Configuration;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.view.KeyEvent;
import com.google.android.youtube.player.internal.u;
import java.util.List;

public interface d extends IInterface {

    public static abstract class a extends Binder implements d {

        /* renamed from: com.google.android.youtube.player.internal.d$a$a  reason: collision with other inner class name */
        static class C0017a implements d {

            /* renamed from: a  reason: collision with root package name */
            private IBinder f9648a;

            C0017a(IBinder iBinder) {
                this.f9648a = iBinder;
            }

            public final void a() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    this.f9648a.transact(8, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final void a(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    obtain.writeInt(i);
                    this.f9648a.transact(17, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final void a(Configuration configuration) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    if (configuration != null) {
                        obtain.writeInt(1);
                        configuration.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f9648a.transact(32, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final void a(e eVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    obtain.writeStrongBinder(eVar != null ? eVar.asBinder() : null);
                    this.f9648a.transact(26, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final void a(f fVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    obtain.writeStrongBinder(fVar != null ? fVar.asBinder() : null);
                    this.f9648a.transact(29, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final void a(g gVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    obtain.writeStrongBinder(gVar != null ? gVar.asBinder() : null);
                    this.f9648a.transact(28, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final void a(h hVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    obtain.writeStrongBinder(hVar != null ? hVar.asBinder() : null);
                    this.f9648a.transact(27, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final void a(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    obtain.writeString(str);
                    this.f9648a.transact(23, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final void a(String str, int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    this.f9648a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final void a(String str, int i, int i2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    this.f9648a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final void a(List<String> list, int i, int i2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    obtain.writeStringList(list);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    this.f9648a.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final void a(boolean z) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    obtain.writeInt(z ? 1 : 0);
                    this.f9648a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final boolean a(int i, KeyEvent keyEvent) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    obtain.writeInt(i);
                    boolean z = true;
                    if (keyEvent != null) {
                        obtain.writeInt(1);
                        keyEvent.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f9648a.transact(41, obtain, obtain2, 0);
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

            public final boolean a(Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    boolean z = true;
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f9648a.transact(40, obtain, obtain2, 0);
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

            public final IBinder asBinder() {
                return this.f9648a;
            }

            public final void b() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    this.f9648a.transact(9, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final void b(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    obtain.writeInt(i);
                    this.f9648a.transact(18, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final void b(String str, int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    this.f9648a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final void b(String str, int i, int i2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    this.f9648a.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final void b(List<String> list, int i, int i2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    obtain.writeStringList(list);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    this.f9648a.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final void b(boolean z) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    obtain.writeInt(z ? 1 : 0);
                    this.f9648a.transact(19, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final boolean b(int i, KeyEvent keyEvent) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    obtain.writeInt(i);
                    boolean z = true;
                    if (keyEvent != null) {
                        obtain.writeInt(1);
                        keyEvent.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f9648a.transact(42, obtain, obtain2, 0);
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

            public final void c(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    obtain.writeInt(i);
                    this.f9648a.transact(20, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final void c(boolean z) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    obtain.writeInt(z ? 1 : 0);
                    this.f9648a.transact(24, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final boolean c() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    boolean z = false;
                    this.f9648a.transact(10, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final void d(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    obtain.writeInt(i);
                    this.f9648a.transact(22, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final void d(boolean z) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    obtain.writeInt(z ? 1 : 0);
                    this.f9648a.transact(25, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final boolean d() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    boolean z = false;
                    this.f9648a.transact(11, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final void e(boolean z) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    obtain.writeInt(z ? 1 : 0);
                    this.f9648a.transact(37, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final boolean e() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    boolean z = false;
                    this.f9648a.transact(12, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final void f() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    this.f9648a.transact(13, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final void g() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    this.f9648a.transact(14, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final int h() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    this.f9648a.transact(15, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final int i() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    this.f9648a.transact(16, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final int j() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    this.f9648a.transact(21, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final void k() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    this.f9648a.transact(30, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final void l() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    this.f9648a.transact(31, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final void m() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    this.f9648a.transact(33, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final void n() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    this.f9648a.transact(34, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final void o() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    this.f9648a.transact(35, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final void p() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    this.f9648a.transact(36, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final void q() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    this.f9648a.transact(38, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final Bundle r() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    this.f9648a.transact(39, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final u s() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    this.f9648a.transact(43, obtain, obtain2, 0);
                    obtain2.readException();
                    return u.a.a(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public static d a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.youtube.player.internal.IEmbeddedPlayer");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof d)) ? new C0017a(iBinder) : (d) queryLocalInterface;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v17, resolved type: android.content.res.Configuration} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v20, resolved type: android.os.Bundle} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v23, resolved type: android.view.KeyEvent} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v26, resolved type: android.view.KeyEvent} */
        /* JADX WARNING: type inference failed for: r3v0 */
        /* JADX WARNING: type inference failed for: r3v1, types: [com.google.android.youtube.player.internal.e] */
        /* JADX WARNING: type inference failed for: r3v5, types: [com.google.android.youtube.player.internal.h] */
        /* JADX WARNING: type inference failed for: r3v9, types: [com.google.android.youtube.player.internal.g] */
        /* JADX WARNING: type inference failed for: r3v13, types: [com.google.android.youtube.player.internal.f] */
        /* JADX WARNING: type inference failed for: r3v29, types: [android.os.IBinder] */
        /* JADX WARNING: type inference failed for: r3v31 */
        /* JADX WARNING: type inference failed for: r3v32 */
        /* JADX WARNING: type inference failed for: r3v33 */
        /* JADX WARNING: type inference failed for: r3v34 */
        /* JADX WARNING: type inference failed for: r3v35 */
        /* JADX WARNING: type inference failed for: r3v36 */
        /* JADX WARNING: type inference failed for: r3v37 */
        /* JADX WARNING: type inference failed for: r3v38 */
        /* JADX WARNING: type inference failed for: r3v39 */
        /* JADX WARNING: type inference failed for: r3v40 */
        /* JADX WARNING: type inference failed for: r3v41 */
        /* JADX WARNING: type inference failed for: r3v42 */
        /* JADX WARNING: type inference failed for: r3v43 */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTransact(int r5, android.os.Parcel r6, android.os.Parcel r7, int r8) throws android.os.RemoteException {
            /*
                r4 = this;
                r0 = 1598968902(0x5f4e5446, float:1.4867585E19)
                java.lang.String r1 = "com.google.android.youtube.player.internal.IEmbeddedPlayer"
                r2 = 1
                if (r5 == r0) goto L_0x0326
                r0 = 0
                r3 = 0
                switch(r5) {
                    case 1: goto L_0x0315;
                    case 2: goto L_0x0303;
                    case 3: goto L_0x02f1;
                    case 4: goto L_0x02db;
                    case 5: goto L_0x02c5;
                    case 6: goto L_0x02af;
                    case 7: goto L_0x0299;
                    case 8: goto L_0x028f;
                    case 9: goto L_0x0285;
                    case 10: goto L_0x0277;
                    case 11: goto L_0x0269;
                    case 12: goto L_0x025b;
                    case 13: goto L_0x0251;
                    case 14: goto L_0x0247;
                    case 15: goto L_0x0239;
                    case 16: goto L_0x022b;
                    case 17: goto L_0x021d;
                    case 18: goto L_0x020f;
                    case 19: goto L_0x01fe;
                    case 20: goto L_0x01f0;
                    case 21: goto L_0x01e2;
                    case 22: goto L_0x01d4;
                    case 23: goto L_0x01c6;
                    case 24: goto L_0x01b5;
                    case 25: goto L_0x01a4;
                    case 26: goto L_0x017e;
                    case 27: goto L_0x0158;
                    case 28: goto L_0x0132;
                    case 29: goto L_0x010c;
                    case 30: goto L_0x0102;
                    case 31: goto L_0x00f8;
                    case 32: goto L_0x00df;
                    case 33: goto L_0x00d5;
                    case 34: goto L_0x00cb;
                    case 35: goto L_0x00c1;
                    case 36: goto L_0x00b7;
                    case 37: goto L_0x00a6;
                    case 38: goto L_0x009c;
                    case 39: goto L_0x0085;
                    case 40: goto L_0x0068;
                    case 41: goto L_0x0047;
                    case 42: goto L_0x0026;
                    case 43: goto L_0x0012;
                    default: goto L_0x000d;
                }
            L_0x000d:
                boolean r5 = super.onTransact(r5, r6, r7, r8)
                return r5
            L_0x0012:
                r6.enforceInterface(r1)
                com.google.android.youtube.player.internal.u r5 = r4.s()
                r7.writeNoException()
                if (r5 == 0) goto L_0x0022
                android.os.IBinder r3 = r5.asBinder()
            L_0x0022:
                r7.writeStrongBinder(r3)
                return r2
            L_0x0026:
                r6.enforceInterface(r1)
                int r5 = r6.readInt()
                int r8 = r6.readInt()
                if (r8 == 0) goto L_0x003c
                android.os.Parcelable$Creator r8 = android.view.KeyEvent.CREATOR
                java.lang.Object r6 = r8.createFromParcel(r6)
                r3 = r6
                android.view.KeyEvent r3 = (android.view.KeyEvent) r3
            L_0x003c:
                boolean r5 = r4.b((int) r5, (android.view.KeyEvent) r3)
                r7.writeNoException()
                r7.writeInt(r5)
                return r2
            L_0x0047:
                r6.enforceInterface(r1)
                int r5 = r6.readInt()
                int r8 = r6.readInt()
                if (r8 == 0) goto L_0x005d
                android.os.Parcelable$Creator r8 = android.view.KeyEvent.CREATOR
                java.lang.Object r6 = r8.createFromParcel(r6)
                r3 = r6
                android.view.KeyEvent r3 = (android.view.KeyEvent) r3
            L_0x005d:
                boolean r5 = r4.a((int) r5, (android.view.KeyEvent) r3)
                r7.writeNoException()
                r7.writeInt(r5)
                return r2
            L_0x0068:
                r6.enforceInterface(r1)
                int r5 = r6.readInt()
                if (r5 == 0) goto L_0x007a
                android.os.Parcelable$Creator r5 = android.os.Bundle.CREATOR
                java.lang.Object r5 = r5.createFromParcel(r6)
                r3 = r5
                android.os.Bundle r3 = (android.os.Bundle) r3
            L_0x007a:
                boolean r5 = r4.a((android.os.Bundle) r3)
                r7.writeNoException()
                r7.writeInt(r5)
                return r2
            L_0x0085:
                r6.enforceInterface(r1)
                android.os.Bundle r5 = r4.r()
                r7.writeNoException()
                if (r5 == 0) goto L_0x0098
                r7.writeInt(r2)
                r5.writeToParcel(r7, r2)
                goto L_0x009b
            L_0x0098:
                r7.writeInt(r0)
            L_0x009b:
                return r2
            L_0x009c:
                r6.enforceInterface(r1)
                r4.q()
                r7.writeNoException()
                return r2
            L_0x00a6:
                r6.enforceInterface(r1)
                int r5 = r6.readInt()
                if (r5 == 0) goto L_0x00b0
                r0 = 1
            L_0x00b0:
                r4.e(r0)
                r7.writeNoException()
                return r2
            L_0x00b7:
                r6.enforceInterface(r1)
                r4.p()
                r7.writeNoException()
                return r2
            L_0x00c1:
                r6.enforceInterface(r1)
                r4.o()
                r7.writeNoException()
                return r2
            L_0x00cb:
                r6.enforceInterface(r1)
                r4.n()
                r7.writeNoException()
                return r2
            L_0x00d5:
                r6.enforceInterface(r1)
                r4.m()
                r7.writeNoException()
                return r2
            L_0x00df:
                r6.enforceInterface(r1)
                int r5 = r6.readInt()
                if (r5 == 0) goto L_0x00f1
                android.os.Parcelable$Creator r5 = android.content.res.Configuration.CREATOR
                java.lang.Object r5 = r5.createFromParcel(r6)
                r3 = r5
                android.content.res.Configuration r3 = (android.content.res.Configuration) r3
            L_0x00f1:
                r4.a((android.content.res.Configuration) r3)
                r7.writeNoException()
                return r2
            L_0x00f8:
                r6.enforceInterface(r1)
                r4.l()
                r7.writeNoException()
                return r2
            L_0x0102:
                r6.enforceInterface(r1)
                r4.k()
                r7.writeNoException()
                return r2
            L_0x010c:
                r6.enforceInterface(r1)
                android.os.IBinder r5 = r6.readStrongBinder()
                if (r5 != 0) goto L_0x0116
                goto L_0x012b
            L_0x0116:
                java.lang.String r6 = "com.google.android.youtube.player.internal.IPlaybackEventListener"
                android.os.IInterface r6 = r5.queryLocalInterface(r6)
                if (r6 == 0) goto L_0x0126
                boolean r8 = r6 instanceof com.google.android.youtube.player.internal.f
                if (r8 == 0) goto L_0x0126
                r3 = r6
                com.google.android.youtube.player.internal.f r3 = (com.google.android.youtube.player.internal.f) r3
                goto L_0x012b
            L_0x0126:
                com.google.android.youtube.player.internal.f$a$a r3 = new com.google.android.youtube.player.internal.f$a$a
                r3.<init>(r5)
            L_0x012b:
                r4.a((com.google.android.youtube.player.internal.f) r3)
                r7.writeNoException()
                return r2
            L_0x0132:
                r6.enforceInterface(r1)
                android.os.IBinder r5 = r6.readStrongBinder()
                if (r5 != 0) goto L_0x013c
                goto L_0x0151
            L_0x013c:
                java.lang.String r6 = "com.google.android.youtube.player.internal.IPlayerStateChangeListener"
                android.os.IInterface r6 = r5.queryLocalInterface(r6)
                if (r6 == 0) goto L_0x014c
                boolean r8 = r6 instanceof com.google.android.youtube.player.internal.g
                if (r8 == 0) goto L_0x014c
                r3 = r6
                com.google.android.youtube.player.internal.g r3 = (com.google.android.youtube.player.internal.g) r3
                goto L_0x0151
            L_0x014c:
                com.google.android.youtube.player.internal.g$a$a r3 = new com.google.android.youtube.player.internal.g$a$a
                r3.<init>(r5)
            L_0x0151:
                r4.a((com.google.android.youtube.player.internal.g) r3)
                r7.writeNoException()
                return r2
            L_0x0158:
                r6.enforceInterface(r1)
                android.os.IBinder r5 = r6.readStrongBinder()
                if (r5 != 0) goto L_0x0162
                goto L_0x0177
            L_0x0162:
                java.lang.String r6 = "com.google.android.youtube.player.internal.IPlaylistEventListener"
                android.os.IInterface r6 = r5.queryLocalInterface(r6)
                if (r6 == 0) goto L_0x0172
                boolean r8 = r6 instanceof com.google.android.youtube.player.internal.h
                if (r8 == 0) goto L_0x0172
                r3 = r6
                com.google.android.youtube.player.internal.h r3 = (com.google.android.youtube.player.internal.h) r3
                goto L_0x0177
            L_0x0172:
                com.google.android.youtube.player.internal.h$a$a r3 = new com.google.android.youtube.player.internal.h$a$a
                r3.<init>(r5)
            L_0x0177:
                r4.a((com.google.android.youtube.player.internal.h) r3)
                r7.writeNoException()
                return r2
            L_0x017e:
                r6.enforceInterface(r1)
                android.os.IBinder r5 = r6.readStrongBinder()
                if (r5 != 0) goto L_0x0188
                goto L_0x019d
            L_0x0188:
                java.lang.String r6 = "com.google.android.youtube.player.internal.IOnFullscreenListener"
                android.os.IInterface r6 = r5.queryLocalInterface(r6)
                if (r6 == 0) goto L_0x0198
                boolean r8 = r6 instanceof com.google.android.youtube.player.internal.e
                if (r8 == 0) goto L_0x0198
                r3 = r6
                com.google.android.youtube.player.internal.e r3 = (com.google.android.youtube.player.internal.e) r3
                goto L_0x019d
            L_0x0198:
                com.google.android.youtube.player.internal.e$a$a r3 = new com.google.android.youtube.player.internal.e$a$a
                r3.<init>(r5)
            L_0x019d:
                r4.a((com.google.android.youtube.player.internal.e) r3)
                r7.writeNoException()
                return r2
            L_0x01a4:
                r6.enforceInterface(r1)
                int r5 = r6.readInt()
                if (r5 == 0) goto L_0x01ae
                r0 = 1
            L_0x01ae:
                r4.d((boolean) r0)
                r7.writeNoException()
                return r2
            L_0x01b5:
                r6.enforceInterface(r1)
                int r5 = r6.readInt()
                if (r5 == 0) goto L_0x01bf
                r0 = 1
            L_0x01bf:
                r4.c((boolean) r0)
                r7.writeNoException()
                return r2
            L_0x01c6:
                r6.enforceInterface(r1)
                java.lang.String r5 = r6.readString()
                r4.a((java.lang.String) r5)
                r7.writeNoException()
                return r2
            L_0x01d4:
                r6.enforceInterface(r1)
                int r5 = r6.readInt()
                r4.d((int) r5)
                r7.writeNoException()
                return r2
            L_0x01e2:
                r6.enforceInterface(r1)
                int r5 = r4.j()
                r7.writeNoException()
                r7.writeInt(r5)
                return r2
            L_0x01f0:
                r6.enforceInterface(r1)
                int r5 = r6.readInt()
                r4.c((int) r5)
                r7.writeNoException()
                return r2
            L_0x01fe:
                r6.enforceInterface(r1)
                int r5 = r6.readInt()
                if (r5 == 0) goto L_0x0208
                r0 = 1
            L_0x0208:
                r4.b((boolean) r0)
                r7.writeNoException()
                return r2
            L_0x020f:
                r6.enforceInterface(r1)
                int r5 = r6.readInt()
                r4.b((int) r5)
                r7.writeNoException()
                return r2
            L_0x021d:
                r6.enforceInterface(r1)
                int r5 = r6.readInt()
                r4.a((int) r5)
                r7.writeNoException()
                return r2
            L_0x022b:
                r6.enforceInterface(r1)
                int r5 = r4.i()
                r7.writeNoException()
                r7.writeInt(r5)
                return r2
            L_0x0239:
                r6.enforceInterface(r1)
                int r5 = r4.h()
                r7.writeNoException()
                r7.writeInt(r5)
                return r2
            L_0x0247:
                r6.enforceInterface(r1)
                r4.g()
                r7.writeNoException()
                return r2
            L_0x0251:
                r6.enforceInterface(r1)
                r4.f()
                r7.writeNoException()
                return r2
            L_0x025b:
                r6.enforceInterface(r1)
                boolean r5 = r4.e()
                r7.writeNoException()
                r7.writeInt(r5)
                return r2
            L_0x0269:
                r6.enforceInterface(r1)
                boolean r5 = r4.d()
                r7.writeNoException()
                r7.writeInt(r5)
                return r2
            L_0x0277:
                r6.enforceInterface(r1)
                boolean r5 = r4.c()
                r7.writeNoException()
                r7.writeInt(r5)
                return r2
            L_0x0285:
                r6.enforceInterface(r1)
                r4.b()
                r7.writeNoException()
                return r2
            L_0x028f:
                r6.enforceInterface(r1)
                r4.a()
                r7.writeNoException()
                return r2
            L_0x0299:
                r6.enforceInterface(r1)
                java.util.ArrayList r5 = r6.createStringArrayList()
                int r8 = r6.readInt()
                int r6 = r6.readInt()
                r4.b((java.util.List<java.lang.String>) r5, (int) r8, (int) r6)
                r7.writeNoException()
                return r2
            L_0x02af:
                r6.enforceInterface(r1)
                java.util.ArrayList r5 = r6.createStringArrayList()
                int r8 = r6.readInt()
                int r6 = r6.readInt()
                r4.a((java.util.List<java.lang.String>) r5, (int) r8, (int) r6)
                r7.writeNoException()
                return r2
            L_0x02c5:
                r6.enforceInterface(r1)
                java.lang.String r5 = r6.readString()
                int r8 = r6.readInt()
                int r6 = r6.readInt()
                r4.b((java.lang.String) r5, (int) r8, (int) r6)
                r7.writeNoException()
                return r2
            L_0x02db:
                r6.enforceInterface(r1)
                java.lang.String r5 = r6.readString()
                int r8 = r6.readInt()
                int r6 = r6.readInt()
                r4.a((java.lang.String) r5, (int) r8, (int) r6)
                r7.writeNoException()
                return r2
            L_0x02f1:
                r6.enforceInterface(r1)
                java.lang.String r5 = r6.readString()
                int r6 = r6.readInt()
                r4.b((java.lang.String) r5, (int) r6)
                r7.writeNoException()
                return r2
            L_0x0303:
                r6.enforceInterface(r1)
                java.lang.String r5 = r6.readString()
                int r6 = r6.readInt()
                r4.a((java.lang.String) r5, (int) r6)
                r7.writeNoException()
                return r2
            L_0x0315:
                r6.enforceInterface(r1)
                int r5 = r6.readInt()
                if (r5 == 0) goto L_0x031f
                r0 = 1
            L_0x031f:
                r4.a((boolean) r0)
                r7.writeNoException()
                return r2
            L_0x0326:
                r7.writeString(r1)
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.youtube.player.internal.d.a.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
        }
    }

    void a() throws RemoteException;

    void a(int i) throws RemoteException;

    void a(Configuration configuration) throws RemoteException;

    void a(e eVar) throws RemoteException;

    void a(f fVar) throws RemoteException;

    void a(g gVar) throws RemoteException;

    void a(h hVar) throws RemoteException;

    void a(String str) throws RemoteException;

    void a(String str, int i) throws RemoteException;

    void a(String str, int i, int i2) throws RemoteException;

    void a(List<String> list, int i, int i2) throws RemoteException;

    void a(boolean z) throws RemoteException;

    boolean a(int i, KeyEvent keyEvent) throws RemoteException;

    boolean a(Bundle bundle) throws RemoteException;

    void b() throws RemoteException;

    void b(int i) throws RemoteException;

    void b(String str, int i) throws RemoteException;

    void b(String str, int i, int i2) throws RemoteException;

    void b(List<String> list, int i, int i2) throws RemoteException;

    void b(boolean z) throws RemoteException;

    boolean b(int i, KeyEvent keyEvent) throws RemoteException;

    void c(int i) throws RemoteException;

    void c(boolean z) throws RemoteException;

    boolean c() throws RemoteException;

    void d(int i) throws RemoteException;

    void d(boolean z) throws RemoteException;

    boolean d() throws RemoteException;

    void e(boolean z) throws RemoteException;

    boolean e() throws RemoteException;

    void f() throws RemoteException;

    void g() throws RemoteException;

    int h() throws RemoteException;

    int i() throws RemoteException;

    int j() throws RemoteException;

    void k() throws RemoteException;

    void l() throws RemoteException;

    void m() throws RemoteException;

    void n() throws RemoteException;

    void o() throws RemoteException;

    void p() throws RemoteException;

    void q() throws RemoteException;

    Bundle r() throws RemoteException;

    u s() throws RemoteException;
}
