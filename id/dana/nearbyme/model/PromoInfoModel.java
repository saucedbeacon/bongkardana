package id.dana.nearbyme.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import id.dana.model.CurrencyAmountModel;
import java.util.List;

public class PromoInfoModel implements Parcelable {
    public static final Parcelable.Creator<PromoInfoModel> CREATOR = new Parcelable.Creator<PromoInfoModel>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new PromoInfoModel[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new PromoInfoModel(parcel);
        }
    };
    public long IsOverlapping;
    public List<String> equals;
    public String getMax;
    public String getMin;
    public CurrencyAmountModel isInside;
    public String length;
    public String setMax;
    public String setMin;
    public List<PromoLimitInfoModel> toDoubleRange;
    public long toFloatRange;
    public CurrencyAmountModel toIntRange;

    public int describeContents() {
        return 0;
    }

    public PromoInfoModel() {
    }

    protected PromoInfoModel(Parcel parcel) {
        this.setMin = parcel.readString();
        this.length = parcel.readString();
        this.getMax = parcel.readString();
        this.getMin = parcel.readString();
        this.setMax = parcel.readString();
        this.equals = parcel.createStringArrayList();
        this.isInside = (CurrencyAmountModel) parcel.readParcelable(CurrencyAmountModel.class.getClassLoader());
        this.IsOverlapping = parcel.readLong();
        this.toFloatRange = parcel.readLong();
        this.toIntRange = (CurrencyAmountModel) parcel.readParcelable(CurrencyAmountModel.class.getClassLoader());
        this.toDoubleRange = parcel.createTypedArrayList(PromoLimitInfoModel.CREATOR);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.setMin);
        parcel.writeString(this.length);
        parcel.writeString(this.getMax);
        parcel.writeString(this.getMin);
        parcel.writeString(this.setMax);
        parcel.writeStringList(this.equals);
        parcel.writeParcelable(this.isInside, i);
        parcel.writeLong(this.IsOverlapping);
        parcel.writeLong(this.toFloatRange);
        parcel.writeParcelable(this.toIntRange, i);
        parcel.writeTypedList(this.toDoubleRange);
    }

    public final boolean setMin() {
        return TextUtils.isEmpty(this.toIntRange.getMax) && TextUtils.isEmpty(this.toIntRange.length);
    }

    public final boolean getMax() {
        return TextUtils.isEmpty(this.isInside.getMax) && TextUtils.isEmpty(this.isInside.length);
    }

    public final boolean getMin() {
        return !TextUtils.isEmpty(this.setMax) && !TextUtils.isEmpty(this.length) && this.setMax.equalsIgnoreCase("AMOUNT_MAX");
    }
}
