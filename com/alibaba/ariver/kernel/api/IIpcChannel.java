package com.alibaba.ariver.kernel.api;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.alibaba.ariver.kernel.ipc.IpcMessage;

public interface IIpcChannel extends IInterface {
    boolean isFinishing();

    void sendMessage(IpcMessage ipcMessage);

    public static abstract class Stub extends Binder implements IIpcChannel {
        static final int TRANSACTION_isFinishing = 2;
        static final int TRANSACTION_sendMessage = 1;

        public IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, "com.alibaba.ariver.kernel.api.IIpcChannel");
        }

        public static IIpcChannel asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.alibaba.ariver.kernel.api.IIpcChannel");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof IIpcChannel)) {
                return new Proxy(iBinder);
            }
            return (IIpcChannel) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                parcel.enforceInterface("com.alibaba.ariver.kernel.api.IIpcChannel");
                sendMessage(parcel.readInt() != 0 ? IpcMessage.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            } else if (i == 2) {
                parcel.enforceInterface("com.alibaba.ariver.kernel.api.IIpcChannel");
                boolean isFinishing = isFinishing();
                parcel2.writeNoException();
                parcel2.writeInt(isFinishing ? 1 : 0);
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.alibaba.ariver.kernel.api.IIpcChannel");
                return true;
            }
        }

        static class Proxy implements IIpcChannel {

            /* renamed from: a  reason: collision with root package name */
            private IBinder f9007a;

            public String getInterfaceDescriptor() {
                return "com.alibaba.ariver.kernel.api.IIpcChannel";
            }

            Proxy(IBinder iBinder) {
                this.f9007a = iBinder;
            }

            public IBinder asBinder() {
                return this.f9007a;
            }

            public void sendMessage(IpcMessage ipcMessage) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.alibaba.ariver.kernel.api.IIpcChannel");
                    if (ipcMessage != null) {
                        obtain.writeInt(1);
                        ipcMessage.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f9007a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public boolean isFinishing() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.alibaba.ariver.kernel.api.IIpcChannel");
                    boolean z = false;
                    this.f9007a.transact(2, obtain, obtain2, 0);
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
        }
    }
}
