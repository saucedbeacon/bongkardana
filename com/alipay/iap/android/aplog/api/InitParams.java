package com.alipay.iap.android.aplog.api;

import android.os.Parcel;
import android.os.Parcelable;

public class InitParams implements Parcelable {
    public static final Parcelable.Creator<InitParams> CREATOR = new Parcelable.Creator<InitParams>() {
        public final InitParams createFromParcel(Parcel parcel) {
            return new InitParams(parcel);
        }

        public final InitParams[] newArray(int i) {
            return new InitParams[i];
        }
    };
    public String appId;
    public String configHost;
    public String host;
    public boolean isDebugable;
    public String productId;
    public String publicKey;
    public String userId;

    public int describeContents() {
        return 0;
    }

    public InitParams() {
    }

    protected InitParams(Parcel parcel) {
        this.host = parcel.readString();
        this.configHost = parcel.readString();
        this.isDebugable = parcel.readByte() != 0;
        this.productId = parcel.readString();
        this.userId = parcel.readString();
        this.appId = parcel.readString();
        this.publicKey = parcel.readString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.host);
        parcel.writeString(this.configHost);
        parcel.writeByte(this.isDebugable ? (byte) 1 : 0);
        parcel.writeString(this.productId);
        parcel.writeString(this.userId);
        parcel.writeString(this.appId);
        parcel.writeString(this.publicKey);
    }
}
