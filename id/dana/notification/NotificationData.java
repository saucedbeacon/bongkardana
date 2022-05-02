package id.dana.notification;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.HashMap;

public class NotificationData implements Parcelable {
    public static final Parcelable.Creator<NotificationData> CREATOR = new Parcelable.Creator<NotificationData>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new NotificationData[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new NotificationData(parcel);
        }
    };
    public HashMap<String, String> FastBitmap$CoordinateSystem;
    public String IsOverlapping;
    public String equals;
    public String getMax;
    public String getMin;
    public String hashCode;
    public String isInside;
    public String length;
    public String setMax;
    public String setMin;
    public String toDoubleRange;
    public String toFloatRange;
    public String toIntRange;
    public String toString;
    private String values;

    public int describeContents() {
        return 0;
    }

    public NotificationData() {
    }

    protected NotificationData(Parcel parcel) {
        this.setMax = parcel.readString();
        this.getMin = parcel.readString();
        this.setMin = parcel.readString();
        this.length = parcel.readString();
        this.getMax = parcel.readString();
        this.toFloatRange = parcel.readString();
        this.IsOverlapping = parcel.readString();
        this.isInside = parcel.readString();
        this.toIntRange = parcel.readString();
        this.equals = parcel.readString();
        this.hashCode = parcel.readString();
        this.toDoubleRange = parcel.readString();
        this.toString = parcel.readString();
        this.values = parcel.readString();
        this.FastBitmap$CoordinateSystem = parcel.readHashMap(HashMap.class.getClassLoader());
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.setMax);
        parcel.writeString(this.getMin);
        parcel.writeString(this.setMin);
        parcel.writeString(this.length);
        parcel.writeString(this.getMax);
        parcel.writeString(this.toFloatRange);
        parcel.writeString(this.IsOverlapping);
        parcel.writeString(this.isInside);
        parcel.writeString(this.toIntRange);
        parcel.writeString(this.equals);
        parcel.writeString(this.hashCode);
        parcel.writeString(this.toDoubleRange);
        parcel.writeString(this.toString);
        parcel.writeString(this.values);
        parcel.writeMap(this.FastBitmap$CoordinateSystem);
    }

    public final boolean getMax() {
        return !TextUtils.isEmpty(this.toFloatRange) && this.toFloatRange.equals("lazada");
    }
}
