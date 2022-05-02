package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;

public class ParcelableVolumeInfo implements Parcelable {
    public static final Parcelable.Creator<ParcelableVolumeInfo> CREATOR = new Parcelable.Creator<ParcelableVolumeInfo>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new ParcelableVolumeInfo[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new ParcelableVolumeInfo(parcel);
        }
    };
    public int getMax;
    public int getMin;
    public int length;
    public int setMax;
    public int setMin;

    public int describeContents() {
        return 0;
    }

    public ParcelableVolumeInfo(int i, int i2, int i3, int i4, int i5) {
        this.length = i;
        this.setMin = i2;
        this.setMax = i3;
        this.getMax = i4;
        this.getMin = i5;
    }

    public ParcelableVolumeInfo(Parcel parcel) {
        this.length = parcel.readInt();
        this.setMax = parcel.readInt();
        this.getMax = parcel.readInt();
        this.getMin = parcel.readInt();
        this.setMin = parcel.readInt();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.length);
        parcel.writeInt(this.setMax);
        parcel.writeInt(this.getMax);
        parcel.writeInt(this.getMin);
        parcel.writeInt(this.setMin);
    }
}
