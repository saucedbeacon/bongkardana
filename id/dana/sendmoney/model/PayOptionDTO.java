package id.dana.sendmoney.model;

import android.os.Parcel;
import android.os.Parcelable;
import id.dana.model.CurrencyAmountModel;

public class PayOptionDTO implements Parcelable {
    public static final Parcelable.Creator<PayOptionDTO> CREATOR = new Parcelable.Creator<PayOptionDTO>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new PayOptionDTO[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new PayOptionDTO(parcel);
        }
    };
    public CurrencyAmountModel getMax;
    public CurrencyAmountModel length;
    public String setMax;
    public String setMin;

    public int describeContents() {
        return 0;
    }

    protected PayOptionDTO(Parcel parcel) {
        this.setMin = parcel.readString();
        this.length = (CurrencyAmountModel) parcel.readParcelable(CurrencyAmountModel.class.getClassLoader());
        this.getMax = (CurrencyAmountModel) parcel.readParcelable(CurrencyAmountModel.class.getClassLoader());
        this.setMax = parcel.readString();
    }

    public PayOptionDTO() {
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.setMin);
        parcel.writeParcelable(this.length, i);
        parcel.writeParcelable(this.getMax, i);
        parcel.writeString(this.setMax);
    }
}
