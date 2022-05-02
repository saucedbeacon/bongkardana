package id.co.bri.sdk;

import android.os.Parcel;
import android.os.Parcelable;

public class BrizziHistoryObject implements Parcelable {
    public static final Parcelable.Creator<BrizziHistoryObject> CREATOR = new setMax();
    public String equals;
    public String getMax;
    public String getMin;
    public String length;
    public String setMax;
    public String setMin;
    public String toFloatRange;
    public String toIntRange;

    public BrizziHistoryObject() {
    }

    private BrizziHistoryObject(Parcel parcel) {
        this.setMax = parcel.readString();
        this.getMin = parcel.readString();
        this.length = parcel.readString();
        this.getMax = parcel.readString();
        this.setMin = parcel.readString();
        this.toIntRange = parcel.readString();
        this.equals = parcel.readString();
        this.toFloatRange = parcel.readString();
    }

    /* synthetic */ BrizziHistoryObject(Parcel parcel, byte b) {
        this(parcel);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.setMax);
        parcel.writeString(this.getMin);
        parcel.writeString(this.length);
        parcel.writeString(this.getMax);
        parcel.writeString(this.setMin);
        parcel.writeString(this.toIntRange);
        parcel.writeString(this.equals);
        parcel.writeString(this.toFloatRange);
    }

    static class setMax implements Parcelable.Creator<BrizziHistoryObject> {
        setMax() {
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new BrizziHistoryObject[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new BrizziHistoryObject(parcel, (byte) 0);
        }
    }
}
