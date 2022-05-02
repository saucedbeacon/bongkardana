package id.dana.sendmoney.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import id.dana.model.CurrencyAmountModel;
import java.util.ArrayList;
import java.util.List;

public class VoucherModel implements Parcelable {
    public static final Parcelable.Creator<VoucherModel> CREATOR = new Parcelable.Creator<VoucherModel>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new VoucherModel[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new VoucherModel(parcel, (byte) 0);
        }
    };
    public boolean FastBitmap$CoordinateSystem;
    public long IsOverlapping;
    public long equals;
    public String getMax;
    public String getMin;
    public int hashCode;
    public long isInside;
    public CurrencyAmountModel length;
    public CurrencyAmountModel setMax;
    public String setMin;
    public boolean toDoubleRange;
    public long toFloatRange;
    public long toIntRange;
    public List<CouponPayMethodInfoModel> toString;

    public int describeContents() {
        return 0;
    }

    /* synthetic */ VoucherModel(Parcel parcel, byte b) {
        this(parcel);
    }

    public VoucherModel() {
    }

    private VoucherModel(Parcel parcel) {
        this.setMin = parcel.readString();
        this.getMax = parcel.readString();
        this.length = (CurrencyAmountModel) parcel.readParcelable(CurrencyAmountModel.class.getClassLoader());
        this.setMax = (CurrencyAmountModel) parcel.readParcelable(CurrencyAmountModel.class.getClassLoader());
        this.getMin = parcel.readString();
        this.equals = parcel.readLong();
        this.toFloatRange = parcel.readLong();
        this.IsOverlapping = parcel.readLong();
        this.isInside = parcel.readLong();
        this.toIntRange = parcel.readLong();
        this.FastBitmap$CoordinateSystem = ((Boolean) parcel.readValue(Boolean.class.getClassLoader())).booleanValue();
        this.toDoubleRange = ((Boolean) parcel.readValue(Boolean.class.getClassLoader())).booleanValue();
        this.hashCode = parcel.readInt();
        ArrayList arrayList = new ArrayList();
        this.toString = arrayList;
        parcel.readList(arrayList, CouponPayMethodInfoModel.class.getClassLoader());
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.setMin);
        parcel.writeString(this.getMax);
        parcel.writeParcelable(this.length, i);
        parcel.writeParcelable(this.setMax, i);
        parcel.writeString(this.getMin);
        parcel.writeLong(this.equals);
        parcel.writeLong(this.toFloatRange);
        parcel.writeLong(this.IsOverlapping);
        parcel.writeLong(this.isInside);
        parcel.writeLong(this.toIntRange);
        parcel.writeValue(Boolean.valueOf(this.FastBitmap$CoordinateSystem));
        parcel.writeValue(Boolean.valueOf(this.toDoubleRange));
        parcel.writeInt(this.hashCode);
        parcel.writeList(this.toString);
    }

    public final boolean length(String str) {
        if (TextUtils.isEmpty(this.setMin)) {
            return true;
        }
        for (CouponPayMethodInfoModel next : this.toString) {
            if (next.getMax() && next.length() && next.getMin.equals(str)) {
                return true;
            }
        }
        return false;
    }

    public final boolean setMin() {
        return this.FastBitmap$CoordinateSystem;
    }

    public final boolean length() {
        return this.toDoubleRange;
    }

    public final boolean getMax(String str) {
        for (CouponPayMethodInfoModel next : this.toString) {
            if (next.getMax() && next.getMin.equals(str)) {
                return true;
            }
        }
        return false;
    }
}
