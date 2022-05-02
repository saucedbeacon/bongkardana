package com.alipay.iap.android.f2fpay.widgets.data;

import android.graphics.Typeface;
import android.os.Parcel;
import android.os.Parcelable;

public class BarCodeConfiguration extends PaymentCodeConfiguration {
    public static final Parcelable.Creator<BarCodeConfiguration> CREATOR = new Parcelable.Creator<BarCodeConfiguration>() {
        public final BarCodeConfiguration createFromParcel(Parcel parcel) {
            return new BarCodeConfiguration(parcel);
        }

        public final BarCodeConfiguration[] newArray(int i) {
            return new BarCodeConfiguration[i];
        }
    };
    public int gapBetweenBarcodeAndNumber;
    public int groupGap;
    public int hintColor;
    public boolean isDisplayTextOfPaymentCode;
    public int perGroupLengthOfText;
    public int textColor;
    public int textSize;
    public Typeface textTypeface;

    public BarCodeConfiguration() {
        this.hintColor = -592136;
        this.textTypeface = Typeface.DEFAULT_BOLD;
        this.isDisplayTextOfPaymentCode = true;
        this.perGroupLengthOfText = 4;
        this.textColor = -16185079;
    }

    protected BarCodeConfiguration(Parcel parcel) {
        super(parcel);
        this.hintColor = -592136;
        this.textTypeface = Typeface.DEFAULT_BOLD;
        boolean z = true;
        this.isDisplayTextOfPaymentCode = true;
        this.perGroupLengthOfText = 4;
        this.textColor = -16185079;
        this.hintColor = parcel.readInt();
        this.isDisplayTextOfPaymentCode = parcel.readByte() == 0 ? false : z;
        this.gapBetweenBarcodeAndNumber = parcel.readInt();
        this.perGroupLengthOfText = parcel.readInt();
        this.groupGap = parcel.readInt();
        this.textSize = parcel.readInt();
        this.textColor = parcel.readInt();
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.hintColor);
        parcel.writeByte(this.isDisplayTextOfPaymentCode ? (byte) 1 : 0);
        parcel.writeInt(this.gapBetweenBarcodeAndNumber);
        parcel.writeInt(this.perGroupLengthOfText);
        parcel.writeInt(this.groupGap);
        parcel.writeInt(this.textSize);
        parcel.writeInt(this.textColor);
    }
}
