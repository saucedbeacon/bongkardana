package com.google.android.youtube.player.internal;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public interface i extends IInterface {

    public static abstract class a extends Binder implements i {

        /* renamed from: com.google.android.youtube.player.internal.i$a$a  reason: collision with other inner class name */
        static class C0022a implements i {

            /* renamed from: a  reason: collision with root package name */
            private IBinder f9653a;

            C0022a(IBinder iBinder) {
                this.f9653a = iBinder;
            }

            public final void a(c cVar, int i, String str, String str2, String str3, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IServiceBroker");
                    obtain.writeStrongBinder(cVar != null ? cVar.asBinder() : null);
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeString(str3);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f9653a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final IBinder asBinder() {
                return this.f9653a;
            }
        }

        public static i a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.youtube.player.internal.IServiceBroker");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof i)) ? new C0022a(iBinder) : (i) queryLocalInterface;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v4, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v3, resolved type: android.os.Bundle} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTransact(int r10, android.os.Parcel r11, android.os.Parcel r12, int r13) throws android.os.RemoteException {
            /*
                r9 = this;
                java.lang.String r0 = "com.google.android.youtube.player.internal.IServiceBroker"
                r1 = 1
                if (r10 == r1) goto L_0x0013
                r2 = 1598968902(0x5f4e5446, float:1.4867585E19)
                if (r10 == r2) goto L_0x000f
                boolean r10 = super.onTransact(r10, r11, r12, r13)
                return r10
            L_0x000f:
                r12.writeString(r0)
                return r1
            L_0x0013:
                r11.enforceInterface(r0)
                android.os.IBinder r10 = r11.readStrongBinder()
                r13 = 0
                if (r10 != 0) goto L_0x001f
                r3 = r13
                goto L_0x0034
            L_0x001f:
                java.lang.String r0 = "com.google.android.youtube.player.internal.IConnectionCallbacks"
                android.os.IInterface r0 = r10.queryLocalInterface(r0)
                if (r0 == 0) goto L_0x002e
                boolean r2 = r0 instanceof com.google.android.youtube.player.internal.c
                if (r2 == 0) goto L_0x002e
                com.google.android.youtube.player.internal.c r0 = (com.google.android.youtube.player.internal.c) r0
                goto L_0x0033
            L_0x002e:
                com.google.android.youtube.player.internal.c$a$a r0 = new com.google.android.youtube.player.internal.c$a$a
                r0.<init>(r10)
            L_0x0033:
                r3 = r0
            L_0x0034:
                int r4 = r11.readInt()
                java.lang.String r5 = r11.readString()
                java.lang.String r6 = r11.readString()
                java.lang.String r7 = r11.readString()
                int r10 = r11.readInt()
                if (r10 == 0) goto L_0x0053
                android.os.Parcelable$Creator r10 = android.os.Bundle.CREATOR
                java.lang.Object r10 = r10.createFromParcel(r11)
                r13 = r10
                android.os.Bundle r13 = (android.os.Bundle) r13
            L_0x0053:
                r8 = r13
                r2 = r9
                r2.a(r3, r4, r5, r6, r7, r8)
                r12.writeNoException()
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.youtube.player.internal.i.a.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
        }
    }

    void a(c cVar, int i, String str, String str2, String str3, Bundle bundle) throws RemoteException;
}
