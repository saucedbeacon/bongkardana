package com.alibaba.ariver.app.api.activity;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

public class StartClientBundle implements Parcelable {
    public static final Parcelable.Creator<StartClientBundle> CREATOR = new Parcelable.Creator<StartClientBundle>() {
        public final StartClientBundle createFromParcel(Parcel parcel) {
            return new StartClientBundle(parcel);
        }

        public final StartClientBundle[] newArray(int i) {
            return new StartClientBundle[i];
        }
    };
    public String appId;
    public String appType;
    public boolean needWaitIpc;
    public Bundle sceneParams;
    public StartAction startAction;
    public Bundle startParams;
    public long startToken;

    public int describeContents() {
        return 0;
    }

    public StartClientBundle() {
    }

    protected StartClientBundle(Parcel parcel) {
        Class<StartClientBundle> cls = StartClientBundle.class;
        this.appId = parcel.readString();
        this.appType = parcel.readString();
        this.startToken = parcel.readLong();
        this.startAction = StartAction.valueOf(parcel.readString());
        this.needWaitIpc = parcel.readByte() != 0;
        this.startParams = parcel.readBundle(cls.getClassLoader());
        this.sceneParams = parcel.readBundle(cls.getClassLoader());
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.appId);
        parcel.writeString(this.appType);
        parcel.writeLong(this.startToken);
        parcel.writeString(this.startAction.name());
        parcel.writeByte(this.needWaitIpc ? (byte) 1 : 0);
        parcel.writeBundle(this.startParams);
        parcel.writeBundle(this.sceneParams);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("StartClientBundle{appId=");
        sb.append(this.appId);
        sb.append(", appType=");
        sb.append(this.appType);
        sb.append(", startToken=");
        sb.append(this.startToken);
        sb.append(", needWaitIpc=");
        sb.append(this.needWaitIpc);
        sb.append(", startAction=");
        sb.append(this.startAction);
        sb.append(", startParams=");
        sb.append(this.startParams);
        sb.append(", sceneParams=");
        sb.append(this.sceneParams);
        sb.append('}');
        return sb.toString();
    }
}
