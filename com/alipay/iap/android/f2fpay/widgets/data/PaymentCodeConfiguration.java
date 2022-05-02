package com.alipay.iap.android.f2fpay.widgets.data;

import android.os.Parcel;
import android.os.Parcelable;

public class PaymentCodeConfiguration implements Parcelable {
    public static final Parcelable.Creator<PaymentCodeConfiguration> CREATOR = new Parcelable.Creator<PaymentCodeConfiguration>() {
        public final PaymentCodeConfiguration createFromParcel(Parcel parcel) {
            return new PaymentCodeConfiguration(parcel);
        }

        public final PaymentCodeConfiguration[] newArray(int i) {
            return new PaymentCodeConfiguration[i];
        }
    };
    public int backgroundColor = 0;
    public int paymentCodeColor = -16777216;

    public PaymentCodeConfiguration() {
    }

    protected PaymentCodeConfiguration(Parcel parcel) {
        this.paymentCodeColor = parcel.readInt();
        this.backgroundColor = parcel.readInt();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.paymentCodeColor);
        parcel.writeInt(this.backgroundColor);
    }
}
