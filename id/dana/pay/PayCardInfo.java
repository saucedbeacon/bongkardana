package id.dana.pay;

import android.os.Parcel;
import android.os.Parcelable;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

public class PayCardInfo implements Parcelable {
    public static final Parcelable.Creator<PayCardInfo> CREATOR = new Parcelable.Creator<PayCardInfo>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new PayCardInfo[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new PayCardInfo(parcel);
        }
    };
    public String FastBitmap$CoordinateSystem;
    public String IsOverlapping;
    public String equals;
    public String getMax;
    public String getMin;
    public boolean hashCode;
    public String isInside;
    public String length;
    public int setMax;
    public String setMin;
    public String toFloatRange;
    public String toIntRange;
    public String toString;

    public int describeContents() {
        return 0;
    }

    public PayCardInfo() {
    }

    protected PayCardInfo(Parcel parcel) {
        this.getMax = parcel.readString();
        this.setMin = parcel.readString();
        this.setMax = parcel.readInt();
        this.getMin = parcel.readString();
        this.length = parcel.readString();
        this.toIntRange = parcel.readString();
        this.IsOverlapping = parcel.readString();
        this.toFloatRange = parcel.readString();
        this.isInside = parcel.readString();
        this.FastBitmap$CoordinateSystem = parcel.readString();
        this.toString = parcel.readString();
        this.hashCode = parcel.readByte() != 0;
        this.equals = parcel.readString();
    }

    public final void getMin(String str) {
        int length2 = str != null ? str.length() : 0;
        int max = dispatchOnCancelled.setMax(length2);
        if (length2 != max) {
            onCanceled oncanceled = new onCanceled(length2, max, 1);
            onCancelLoad.setMax(1221233623, oncanceled);
            onCancelLoad.getMin(1221233623, oncanceled);
        }
        this.length = str;
    }

    public final boolean getMax() {
        return this.hashCode;
    }

    public final boolean setMax() {
        return "DIRECT_DEBIT_CREDIT_CARD".equals(this.FastBitmap$CoordinateSystem) || "DIRECT_DEBIT_DEBIT_CARD".equals(this.FastBitmap$CoordinateSystem);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.getMax);
        parcel.writeString(this.setMin);
        parcel.writeInt(this.setMax);
        parcel.writeString(this.getMin);
        parcel.writeString(this.length);
        parcel.writeString(this.toIntRange);
        parcel.writeString(this.IsOverlapping);
        parcel.writeString(this.toFloatRange);
        parcel.writeString(this.isInside);
        parcel.writeString(this.FastBitmap$CoordinateSystem);
        parcel.writeString(this.toString);
        parcel.writeByte(this.hashCode ? (byte) 1 : 0);
        parcel.writeString(this.equals);
    }
}
