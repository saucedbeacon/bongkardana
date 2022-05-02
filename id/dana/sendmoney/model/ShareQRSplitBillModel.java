package id.dana.sendmoney.model;

import android.os.Parcel;
import android.os.Parcelable;

public class ShareQRSplitBillModel implements Parcelable {
    public static final Parcelable.Creator<ShareQRSplitBillModel> CREATOR = new Parcelable.Creator<ShareQRSplitBillModel>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new ShareQRSplitBillModel[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new ShareQRSplitBillModel(parcel, (byte) 0);
        }
    };
    public String getMax;
    private String length;
    private String setMax;
    public String setMin;

    public static class length {
        public String getMax;
        public String getMin;
        public String length;
        public String setMin;
    }

    public int describeContents() {
        return 0;
    }

    /* synthetic */ ShareQRSplitBillModel(Parcel parcel, byte b) {
        this(parcel);
    }

    public /* synthetic */ ShareQRSplitBillModel(length length2, byte b) {
        this(length2);
    }

    private ShareQRSplitBillModel(length length2) {
        this.setMin = length2.length;
        this.setMax = length2.getMax;
        this.length = length2.setMin;
        this.getMax = length2.getMin;
    }

    private ShareQRSplitBillModel(Parcel parcel) {
        this.setMin = parcel.readString();
        this.setMax = parcel.readString();
        this.length = parcel.readString();
        this.getMax = parcel.readString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.setMin);
        parcel.writeString(this.setMax);
        parcel.writeString(this.length);
        parcel.writeString(this.getMax);
    }
}
