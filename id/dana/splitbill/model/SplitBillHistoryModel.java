package id.dana.splitbill.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

public class SplitBillHistoryModel implements Parcelable {
    public static final Parcelable.Creator<SplitBillHistoryModel> CREATOR = new Parcelable.Creator<SplitBillHistoryModel>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new SplitBillHistoryModel[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new SplitBillHistoryModel(parcel, (byte) 0);
        }
    };
    private long equals;
    public String getMax;
    public String getMin;
    public String length;
    public String setMax;
    public List<PayerModel> setMin;
    public String toFloatRange;

    public int describeContents() {
        return 0;
    }

    /* synthetic */ SplitBillHistoryModel(Parcel parcel, byte b) {
        this(parcel);
    }

    public SplitBillHistoryModel() {
    }

    private SplitBillHistoryModel(Parcel parcel) {
        this.getMax = parcel.readString();
        this.equals = parcel.readLong();
        this.getMin = parcel.readString();
        ArrayList arrayList = new ArrayList();
        this.setMin = arrayList;
        parcel.readList(arrayList, PayerModel.class.getClassLoader());
        this.length = parcel.readString();
        this.setMax = parcel.readString();
        this.toFloatRange = parcel.readString();
    }

    public final List<PayerModel> setMax() {
        ArrayList arrayList = new ArrayList();
        for (PayerModel next : this.setMin) {
            if ("IN_PROGRESS".equals(next.IsOverlapping)) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.getMax);
        parcel.writeLong(this.equals);
        parcel.writeString(this.getMin);
        parcel.writeList(this.setMin);
        parcel.writeString(this.length);
        parcel.writeString(this.setMax);
        parcel.writeString(this.toFloatRange);
    }
}
