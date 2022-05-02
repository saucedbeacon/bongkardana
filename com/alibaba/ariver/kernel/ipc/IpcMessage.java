package com.alibaba.ariver.kernel.ipc;

import android.os.Message;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.alibaba.ariver.kernel.RVConstants;
import com.alibaba.ariver.kernel.common.utils.RVLogger;

public class IpcMessage implements Parcelable {
    public static final Parcelable.Creator<IpcMessage> CREATOR = new Parcelable.Creator<IpcMessage>() {
        public final IpcMessage createFromParcel(Parcel parcel) {
            return new IpcMessage(parcel);
        }

        public final IpcMessage[] newArray(int i) {
            return new IpcMessage[i];
        }
    };
    public String biz;
    public Message bizMsg;
    public String clientId;
    public int lpid;
    public int pid;

    public int describeContents() {
        return 0;
    }

    /* JADX INFO: finally extract failed */
    public static byte[] marshall(IpcMessage ipcMessage) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeValue(ipcMessage);
            byte[] marshall = obtain.marshall();
            obtain.recycle();
            return marshall;
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder("IpcMsg marshall error ");
            sb.append(Log.getStackTraceString(e));
            RVLogger.e(RVConstants.TAG, sb.toString());
            obtain.recycle();
            return null;
        } catch (Throwable th) {
            obtain.recycle();
            throw th;
        }
    }

    public static IpcMessage unmarshall(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        try {
            obtain.unmarshall(bArr, 0, bArr.length);
            obtain.setDataPosition(0);
            IpcMessage ipcMessage = (IpcMessage) obtain.readValue(IpcMessage.class.getClassLoader());
            obtain.recycle();
            return ipcMessage;
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder("IpcMsg unmarshall error ");
            sb.append(Log.getStackTraceString(e));
            RVLogger.e(RVConstants.TAG, sb.toString());
            obtain.recycle();
            return null;
        } catch (Throwable th) {
            obtain.recycle();
            throw th;
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.pid);
        parcel.writeInt(this.lpid);
        parcel.writeString(this.clientId);
        parcel.writeString(this.biz);
        parcel.writeParcelable(this.bizMsg, i);
    }

    public IpcMessage() {
    }

    protected IpcMessage(Parcel parcel) {
        this.pid = parcel.readInt();
        this.lpid = parcel.readInt();
        this.clientId = parcel.readString();
        this.biz = parcel.readString();
        this.bizMsg = (Message) parcel.readParcelable(Message.class.getClassLoader());
    }
}
