package com.alipay.iap.android.f2fpay.client.pay;

import android.os.Parcel;
import android.os.Parcelable;

public class F2FPayResult implements Parcelable {
    public static final Parcelable.Creator<F2FPayResult> CREATOR = new Parcelable.Creator<F2FPayResult>() {
        public final F2FPayResult createFromParcel(Parcel parcel) {
            return new F2FPayResult(parcel);
        }

        public final F2FPayResult[] newArray(int i) {
            return new F2FPayResult[i];
        }
    };
    public F2fPayOrderInfo orderInfo;
    public Object originalOrderInfo;
    public F2FPayResultStatus status;

    public F2FPayResult() {
    }

    protected F2FPayResult(Parcel parcel) {
        this.status = F2FPayResultStatus.valueOf(parcel.readString());
        this.orderInfo = (F2fPayOrderInfo) parcel.readParcelable(F2fPayOrderInfo.class.getClassLoader());
    }

    public F2FPayResult(F2FPayResultStatus f2FPayResultStatus, F2fPayOrderInfo f2fPayOrderInfo) {
        this.status = f2FPayResultStatus;
        this.orderInfo = f2fPayOrderInfo;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.status.name());
        parcel.writeParcelable(this.orderInfo, i);
    }
}
