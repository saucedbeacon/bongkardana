package id.dana.sendmoney.model;

import android.os.Parcel;
import android.os.Parcelable;
import id.dana.model.CurrencyAmountModel;

public class CouponPayMethodInfoModel implements Parcelable {
    public static final Parcelable.Creator<CouponPayMethodInfoModel> CREATOR = new Parcelable.Creator<CouponPayMethodInfoModel>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new CouponPayMethodInfoModel[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new CouponPayMethodInfoModel(parcel, (byte) 0);
        }
    };
    public int equals;
    public CurrencyAmountModel getMax;
    public String getMin;
    public boolean length;
    public String setMax;
    public boolean setMin;
    private String toIntRange;

    public int describeContents() {
        return 0;
    }

    /* synthetic */ CouponPayMethodInfoModel(Parcel parcel, byte b) {
        this(parcel);
    }

    public CouponPayMethodInfoModel() {
    }

    private CouponPayMethodInfoModel(Parcel parcel) {
        this.getMin = parcel.readString();
        this.setMax = parcel.readString();
        this.toIntRange = parcel.readString();
        this.setMin = ((Boolean) parcel.readValue(Boolean.class.getClassLoader())).booleanValue();
        this.length = ((Boolean) parcel.readValue(Boolean.class.getClassLoader())).booleanValue();
        this.getMax = (CurrencyAmountModel) parcel.readParcelable(CurrencyAmountModel.class.getClassLoader());
        this.equals = parcel.readInt();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.getMin);
        parcel.writeString(this.setMax);
        parcel.writeString(this.toIntRange);
        parcel.writeValue(Boolean.valueOf(this.setMin));
        parcel.writeValue(Boolean.valueOf(this.length));
        parcel.writeParcelable(this.getMax, i);
        parcel.writeInt(this.equals);
    }

    public final boolean length() {
        return this.setMin;
    }

    public final boolean getMax() {
        return this.length;
    }
}
