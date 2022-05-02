package com.alibaba.ariver.kernel.api.remote;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public interface IRemoteCaller extends IInterface {
    RemoteCallResult remoteCall(RemoteCallArgs remoteCallArgs);

    public static abstract class Stub extends Binder implements IRemoteCaller {
        private static final String DESCRIPTOR = "com.alibaba.ariver.kernel.api.remote.IRemoteCaller";
        static final int TRANSACTION_remoteCall = 1;

        public IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static IRemoteCaller asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (queryLocalInterface == null || !(queryLocalInterface instanceof IRemoteCaller)) {
                return new Proxy(iBinder);
            }
            return (IRemoteCaller) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                parcel.enforceInterface(DESCRIPTOR);
                RemoteCallResult remoteCall = remoteCall(parcel.readInt() != 0 ? RemoteCallArgs.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                if (remoteCall != null) {
                    parcel2.writeInt(1);
                    remoteCall.writeToParcel(parcel2, 1);
                } else {
                    parcel2.writeInt(0);
                }
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString(DESCRIPTOR);
                return true;
            }
        }

        static class Proxy implements IRemoteCaller {

            /* renamed from: a  reason: collision with root package name */
            private IBinder f10083a;

            public String getInterfaceDescriptor() {
                return Stub.DESCRIPTOR;
            }

            Proxy(IBinder iBinder) {
                this.f10083a = iBinder;
            }

            public IBinder asBinder() {
                return this.f10083a;
            }

            public RemoteCallResult remoteCall(RemoteCallArgs remoteCallArgs) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (remoteCallArgs != null) {
                        obtain.writeInt(1);
                        remoteCallArgs.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f10083a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? RemoteCallResult.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }
    }
}
