package id.dana.splitbill.model;

import android.os.Parcel;
import android.os.Parcelable;
import id.dana.model.CurrencyAmountModel;

public class PayerModel implements Parcelable {
    public static final Parcelable.Creator<PayerModel> CREATOR = new Parcelable.Creator<PayerModel>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new PayerModel[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new PayerModel(parcel, (byte) 0);
        }
    };
    public String IsOverlapping;
    public boolean equals;
    public String getMax;
    public String getMin;
    public boolean isInside;
    public String length;
    public CurrencyAmountModel setMax;
    public String setMin;
    public boolean toFloatRange;

    public int describeContents() {
        return 0;
    }

    /* synthetic */ PayerModel(Parcel parcel, byte b) {
        this(parcel);
    }

    public PayerModel(String str, CurrencyAmountModel currencyAmountModel, String str2, String str3, String str4) {
        this.length = str;
        this.setMax = currencyAmountModel;
        this.setMin = str2;
        this.getMin = str3;
        this.getMax = str4;
    }

    public PayerModel(String str, CurrencyAmountModel currencyAmountModel, String str2, String str3, String str4, String str5) {
        this.length = str;
        this.setMax = currencyAmountModel;
        this.setMin = str2;
        this.getMin = str3;
        this.getMax = str4;
        this.IsOverlapping = str5;
    }

    private PayerModel(Parcel parcel) {
        this.length = parcel.readString();
        this.setMax = (CurrencyAmountModel) parcel.readParcelable(CurrencyAmountModel.class.getClassLoader());
        this.setMin = parcel.readString();
        this.getMin = parcel.readString();
        this.getMax = parcel.readString();
        boolean z = false;
        this.toFloatRange = parcel.readInt() == 1;
        this.isInside = parcel.readInt() == 1 ? true : z;
        this.IsOverlapping = parcel.readString();
    }

    public final boolean length() {
        return this.equals;
    }

    public final boolean getMax() {
        return this.isInside;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.length);
        parcel.writeParcelable(this.setMax, i);
        parcel.writeString(this.setMin);
        parcel.writeString(this.getMin);
        parcel.writeString(this.getMax);
        parcel.writeInt(this.toFloatRange ? 1 : 0);
        parcel.writeInt(this.isInside ? 1 : 0);
        parcel.writeString(this.IsOverlapping);
    }
}
