package id.dana.splitbill.model;

import android.os.Parcel;
import android.os.Parcelable;
import id.dana.model.CurrencyAmountModel;
import java.util.ArrayList;
import java.util.List;

public class SplitBillModel implements Parcelable {
    public static final Parcelable.Creator<SplitBillModel> CREATOR = new Parcelable.Creator<SplitBillModel>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new SplitBillModel[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new SplitBillModel(parcel, (byte) 0);
        }
    };
    public String IsOverlapping;
    public PayerModel equals;
    public int getMax;
    public CurrencyAmountModel getMin;
    public String isInside;
    public int length;
    public String setMax;
    public List<PayerModel> setMin;
    public PayerModel toIntRange;

    public int describeContents() {
        return 0;
    }

    /* synthetic */ SplitBillModel(Parcel parcel, byte b) {
        this(parcel);
    }

    public SplitBillModel() {
    }

    private SplitBillModel(Parcel parcel) {
        this.setMin = new ArrayList();
        this.setMax = parcel.readString();
        this.getMin = (CurrencyAmountModel) parcel.readParcelable(CurrencyAmountModel.class.getClassLoader());
        this.getMax = parcel.readInt();
        this.length = parcel.readInt();
        parcel.readTypedList(this.setMin, PayerModel.CREATOR);
        this.equals = (PayerModel) parcel.readParcelable(PayerModel.class.getClassLoader());
        this.toIntRange = (PayerModel) parcel.readParcelable(PayerModel.class.getClassLoader());
        this.IsOverlapping = parcel.readString();
        this.isInside = parcel.readString();
    }

    public final boolean getMin() {
        return this.getMax == this.length;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.setMax);
        parcel.writeParcelable(this.getMin, i);
        parcel.writeInt(this.getMax);
        parcel.writeInt(this.length);
        parcel.writeTypedList(this.setMin);
        parcel.writeParcelable(this.equals, i);
        parcel.writeParcelable(this.toIntRange, i);
        parcel.writeString(this.IsOverlapping);
        parcel.writeString(this.isInside);
    }
}
