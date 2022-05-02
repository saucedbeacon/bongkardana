package com.alibaba.ariver.kernel.ipc.uniform;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.alibaba.ariver.kernel.common.utils.RVLogger;

public class IPCResult implements Parcelable {
    public static final Parcelable.Creator<IPCResult> CREATOR = new Parcelable.Creator<IPCResult>() {
        public final IPCResult createFromParcel(Parcel parcel) {
            return new IPCResult(parcel);
        }

        public final IPCResult[] newArray(int i) {
            return new IPCResult[i];
        }
    };
    public static final byte SER_TYPE_PARCELABLE = 2;
    public static final byte SER_TYPE_SERIALIZE = 1;
    public Parcelable parcelable;
    public int resultCode;
    public String resultMsg;
    public String resultType;
    public byte[] resultValue;
    public byte serType;

    public int describeContents() {
        return 0;
    }

    public IPCResult() {
        this.resultCode = 0;
        this.resultMsg = "";
        this.serType = 1;
    }

    public IPCResult(Parcel parcel) {
        this.resultCode = 0;
        this.resultMsg = "";
        readFromParcel(parcel);
    }

    public void writeToParcel(Parcel parcel, int i) {
        try {
            parcel.writeByte(this.serType);
            parcel.writeInt(this.resultCode);
            parcel.writeString(this.resultMsg);
            if (TextUtils.isEmpty(this.resultType)) {
                String name = Void.TYPE.getName();
                this.resultType = name;
                parcel.writeString(name);
                return;
            }
            parcel.writeString(this.resultType);
            if (this.serType == 2) {
                parcel.writeParcelable(this.parcelable, i);
                return;
            }
            if (this.resultValue == null) {
                this.resultValue = new byte[0];
            }
            parcel.writeByteArray(this.resultValue);
        } catch (Exception e) {
            RVLogger.e("IPCResult", "writeToParcel exception", e);
        }
    }

    public void readFromParcel(Parcel parcel) {
        try {
            this.serType = parcel.readByte();
            this.resultCode = parcel.readInt();
            this.resultMsg = parcel.readString();
            String readString = parcel.readString();
            this.resultType = readString;
            if (!TextUtils.equals(readString, Void.TYPE.getName())) {
                if (this.serType == 2) {
                    this.parcelable = parcel.readParcelable(getClass().getClassLoader());
                } else {
                    this.resultValue = parcel.createByteArray();
                }
            }
        } catch (Exception e) {
            RVLogger.e("IPCResult", "readFromParcel exception", e);
        }
    }
}
