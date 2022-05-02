package id.dana.nearbyme.model;

import android.os.Parcel;
import android.os.Parcelable;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

public class ContactAddressModel implements Parcelable {
    public static final Parcelable.Creator<ContactAddressModel> CREATOR = new Parcelable.Creator<ContactAddressModel>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new ContactAddressModel[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new ContactAddressModel(parcel);
        }
    };
    public String FastBitmap$CoordinateSystem;
    public boolean IsOverlapping;
    public String equals;
    public String getMax;
    public String getMin;
    public String isInside;
    public String length;
    public String setMax;
    public String setMin;
    private String toDoubleRange;
    public String toFloatRange;
    public boolean toIntRange;

    public int describeContents() {
        return 0;
    }

    public ContactAddressModel() {
    }

    protected ContactAddressModel(Parcel parcel) {
        this.setMin = parcel.readString();
        this.length = parcel.readString();
        this.toDoubleRange = parcel.readString();
        this.getMin = parcel.readString();
        this.getMax = parcel.readString();
        this.setMax = parcel.readString();
        this.isInside = parcel.readString();
        boolean z = true;
        this.IsOverlapping = parcel.readByte() != 0;
        this.equals = parcel.readString();
        this.toFloatRange = parcel.readString();
        this.toIntRange = parcel.readByte() == 0 ? false : z;
        this.FastBitmap$CoordinateSystem = parcel.readString();
    }

    public final void setMin(String str) {
        int length2 = str != null ? str.length() : 0;
        int max = dispatchOnCancelled.setMax(length2);
        if (length2 != max) {
            onCanceled oncanceled = new onCanceled(length2, max, 1);
            onCancelLoad.setMax(-1528403417, oncanceled);
            onCancelLoad.getMin(-1528403417, oncanceled);
        }
        this.toDoubleRange = str;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.setMin);
        parcel.writeString(this.length);
        parcel.writeString(this.toDoubleRange);
        parcel.writeString(this.getMin);
        parcel.writeString(this.getMax);
        parcel.writeString(this.setMax);
        parcel.writeString(this.isInside);
        parcel.writeByte(this.IsOverlapping ? (byte) 1 : 0);
        parcel.writeString(this.equals);
        parcel.writeString(this.toFloatRange);
        parcel.writeByte(this.toIntRange ? (byte) 1 : 0);
        parcel.writeString(this.FastBitmap$CoordinateSystem);
    }
}
