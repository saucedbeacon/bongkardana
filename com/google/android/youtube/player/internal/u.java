package com.google.android.youtube.player.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public interface u extends IInterface {

    public static abstract class a extends Binder implements u {

        /* renamed from: com.google.android.youtube.player.internal.u$a$a  reason: collision with other inner class name */
        static class C0026a implements u {

            /* renamed from: a  reason: collision with root package name */
            private IBinder f9666a;

            C0026a(IBinder iBinder) {
                this.f9666a = iBinder;
            }

            public final IBinder asBinder() {
                return this.f9666a;
            }
        }

        public a() {
            attachInterface(this, "com.google.android.youtube.player.internal.dynamic.IObjectWrapper");
        }

        public static u a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.youtube.player.internal.dynamic.IObjectWrapper");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof u)) ? new C0026a(iBinder) : (u) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            parcel2.writeString("com.google.android.youtube.player.internal.dynamic.IObjectWrapper");
            return true;
        }
    }
}
