package id.dana.splitbill.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import id.dana.model.CurrencyAmountModel;
import o.isOriginHasAppInfo;

public class SplitBillPayerModel implements Parcelable {
    public static final Parcelable.Creator<SplitBillPayerModel> CREATOR = new Parcelable.Creator<SplitBillPayerModel>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new SplitBillPayerModel[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new SplitBillPayerModel(parcel);
        }
    };
    public int IsOverlapping;
    public CurrencyAmountModel equals;
    public String getMax;
    public String getMin;
    public String hashCode;
    public boolean isInside;
    public String length;
    public String setMax;
    public String setMin;
    public boolean toFloatRange;
    public boolean toIntRange;

    public static class length {
        public boolean IsOverlapping;
        public boolean equals;
        public String getMax;
        public String getMin;
        public String hashCode;
        public String isInside;
        public CurrencyAmountModel length;
        public String setMax;
        public String setMin;
        public int toFloatRange;
        public boolean toIntRange;
    }

    public int describeContents() {
        return 0;
    }

    public SplitBillPayerModel() {
    }

    protected SplitBillPayerModel(Parcel parcel) {
        this.setMin = parcel.readString();
        this.getMin = parcel.readString();
        this.setMax = parcel.readString();
        this.length = parcel.readString();
        this.getMax = parcel.readString();
        this.equals = (CurrencyAmountModel) parcel.readParcelable(CurrencyAmountModel.class.getClassLoader());
        this.IsOverlapping = parcel.readInt();
        boolean z = true;
        this.toFloatRange = parcel.readByte() != 0;
        this.toIntRange = parcel.readByte() != 0;
        this.isInside = parcel.readByte() == 0 ? false : z;
        this.hashCode = parcel.readString();
    }

    public final boolean getMax() {
        return this.toFloatRange;
    }

    public final boolean setMin() {
        return this.toIntRange;
    }

    public int hashCode() {
        return toString().hashCode();
    }

    public boolean equals(@Nullable Object obj) {
        String str;
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SplitBillPayerModel) || (str = ((SplitBillPayerModel) obj).getMax) == null || this.getMax == null) {
            return false;
        }
        return isOriginHasAppInfo.getClearPhoneNumber(str).equals(isOriginHasAppInfo.getClearPhoneNumber(this.getMax));
    }

    public final boolean getMin() {
        return this.isInside;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.setMin);
        parcel.writeString(this.getMin);
        parcel.writeString(this.setMax);
        parcel.writeString(this.length);
        parcel.writeString(this.getMax);
        parcel.writeParcelable(this.equals, i);
        parcel.writeInt(this.IsOverlapping);
        parcel.writeByte(this.toFloatRange ? (byte) 1 : 0);
        parcel.writeByte(this.toIntRange ? (byte) 1 : 0);
        parcel.writeByte(this.isInside ? (byte) 1 : 0);
        parcel.writeString(this.hashCode);
    }

    public static boolean setMax(CurrencyAmountModel currencyAmountModel) {
        return currencyAmountModel != null && !TextUtils.isEmpty(currencyAmountModel.getMax);
    }
}
