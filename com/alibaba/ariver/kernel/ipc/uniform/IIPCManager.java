package com.alibaba.ariver.kernel.ipc.uniform;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public interface IIPCManager extends IInterface {
    IPCResult call(IPCParameter iPCParameter);

    public static abstract class Stub extends Binder implements IIPCManager {
        static final int TRANSACTION_call = 1;

        public IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, "com.alibaba.ariver.kernel.ipc.uniform.IIPCManager");
        }

        public static IIPCManager asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.alibaba.ariver.kernel.ipc.uniform.IIPCManager");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof IIPCManager)) {
                return new Proxy(iBinder);
            }
            return (IIPCManager) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                parcel.enforceInterface("com.alibaba.ariver.kernel.ipc.uniform.IIPCManager");
                IPCResult call = call(parcel.readInt() != 0 ? IPCParameter.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                if (call != null) {
                    parcel2.writeInt(1);
                    call.writeToParcel(parcel2, 1);
                } else {
                    parcel2.writeInt(0);
                }
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.alibaba.ariver.kernel.ipc.uniform.IIPCManager");
                return true;
            }
        }

        static class Proxy implements IIPCManager {

            /* renamed from: a  reason: collision with root package name */
            private IBinder f9152a;

            public String getInterfaceDescriptor() {
                return "com.alibaba.ariver.kernel.ipc.uniform.IIPCManager";
            }

            Proxy(IBinder iBinder) {
                this.f9152a = iBinder;
            }

            public IBinder asBinder() {
                return this.f9152a;
            }

            public IPCResult call(IPCParameter iPCParameter) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.alibaba.ariver.kernel.ipc.uniform.IIPCManager");
                    if (iPCParameter != null) {
                        obtain.writeInt(1);
                        iPCParameter.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f9152a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? IPCResult.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }
    }
}
