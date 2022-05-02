package id.dana.model;

import android.os.Parcel;
import android.os.Parcelable;

final class AutoValue_PopUpParcel extends C$AutoValue_PopUpParcel {
    public static final Parcelable.Creator<AutoValue_PopUpParcel> CREATOR = new Parcelable.Creator<AutoValue_PopUpParcel>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new AutoValue_PopUpParcel[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new AutoValue_PopUpParcel(parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
        }
    };

    public final int describeContents() {
        return 0;
    }

    AutoValue_PopUpParcel(String str, int i, int i2, int i3, int i4) {
        super(str, i, i2, i3, i4);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(length());
        parcel.writeInt(setMin());
        parcel.writeInt(getMax());
        parcel.writeInt(getMin());
        parcel.writeInt(setMax());
    }
}
