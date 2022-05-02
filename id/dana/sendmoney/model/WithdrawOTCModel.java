package id.dana.sendmoney.model;

import android.os.Parcel;
import android.os.Parcelable;

public class WithdrawOTCModel implements Parcelable {
    public static final Parcelable.Creator<WithdrawOTCModel> CREATOR = new Parcelable.Creator<WithdrawOTCModel>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new WithdrawOTCModel[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new WithdrawOTCModel(parcel, (byte) 0);
        }
    };
    public String IsOverlapping;
    public String getMax;
    public String getMin;
    public String length;
    public String setMax;
    public String setMin;
    public String toFloatRange;
    public String toIntRange;

    public int describeContents() {
        return 0;
    }

    /* synthetic */ WithdrawOTCModel(Parcel parcel, byte b) {
        this(parcel);
    }

    public WithdrawOTCModel() {
    }

    private WithdrawOTCModel(Parcel parcel) {
        this.getMin = parcel.readString();
        this.setMax = parcel.readString();
        this.toIntRange = parcel.readString();
        this.IsOverlapping = parcel.readString();
        this.toFloatRange = parcel.readString();
        this.setMin = parcel.readString();
        this.getMax = parcel.readString();
        this.length = parcel.readString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.getMin);
        parcel.writeString(this.toIntRange);
        parcel.writeString(this.setMax);
        parcel.writeString(this.IsOverlapping);
        parcel.writeString(this.toFloatRange);
        parcel.writeString(this.setMin);
        parcel.writeString(this.getMax);
        parcel.writeString(this.length);
    }
}
