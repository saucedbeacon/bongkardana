package com.alipay.iap.android.common.syncintegration.api;

import android.os.Parcel;
import android.os.Parcelable;

public class IAPSyncMessage implements Parcelable {
    public static final Parcelable.Creator<IAPSyncMessage> CREATOR = new Parcelable.Creator<IAPSyncMessage>() {
        public final IAPSyncMessage createFromParcel(Parcel parcel) {
            return new IAPSyncMessage(parcel);
        }

        public final IAPSyncMessage[] newArray(int i) {
            return new IAPSyncMessage[i];
        }
    };
    public String biz;
    public boolean hasMore;
    public String messageId;
    public String msgData;
    public String userId;

    public int describeContents() {
        return 0;
    }

    public IAPSyncMessage() {
    }

    protected IAPSyncMessage(Parcel parcel) {
        this.biz = parcel.readString();
        this.hasMore = parcel.readByte() != 0;
        this.messageId = parcel.readString();
        this.msgData = parcel.readString();
        this.userId = parcel.readString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.biz);
        parcel.writeByte(this.hasMore ? (byte) 1 : 0);
        parcel.writeString(this.messageId);
        parcel.writeString(this.msgData);
        parcel.writeString(this.userId);
    }
}
