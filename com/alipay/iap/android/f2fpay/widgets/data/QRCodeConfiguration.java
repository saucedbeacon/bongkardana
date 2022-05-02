package com.alipay.iap.android.f2fpay.widgets.data;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;

public class QRCodeConfiguration extends PaymentCodeConfiguration {
    public static final Parcelable.Creator<QRCodeConfiguration> CREATOR = new Parcelable.Creator<QRCodeConfiguration>() {
        public final QRCodeConfiguration createFromParcel(Parcel parcel) {
            return new QRCodeConfiguration(parcel);
        }

        public final QRCodeConfiguration[] newArray(int i) {
            return new QRCodeConfiguration[i];
        }
    };
    public Bitmap logo;
    public boolean showMargin = true;

    public QRCodeConfiguration() {
    }

    protected QRCodeConfiguration(Parcel parcel) {
        super(parcel);
        boolean z = true;
        this.logo = (Bitmap) parcel.readParcelable(Bitmap.class.getClassLoader());
        this.showMargin = parcel.readByte() == 0 ? false : z;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.logo, i);
        parcel.writeByte(this.showMargin ? (byte) 1 : 0);
    }
}
