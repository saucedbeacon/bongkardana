package id.dana.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Date;
import java.util.List;

public class CdpContentModel implements Parcelable {
    public static final Parcelable.Creator<CdpContentModel> CREATOR = new Parcelable.Creator<CdpContentModel>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new CdpContentModel[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new CdpContentModel(parcel);
        }
    };
    public String FastBitmap$CoordinateSystem;
    public String Grayscale$Algorithm;
    public String ICustomTabsCallback;
    public Date IsOverlapping;
    public String Mean$Arithmetic;
    public String b;
    public List<CdpContentModel> create;
    public String equals;
    public String getCause;
    public String getMax;
    public String getMin;
    public String hashCode;
    public String invoke;
    public String invokeSuspend;
    public Date isInside;
    public String length;
    public String onMessageChannelReady;
    public String onNavigationEvent;
    public String setMax;
    public String setMin;
    public String toDoubleRange;
    public Date toFloatRange;
    public Date toIntRange;
    public int toString;
    public String valueOf;
    public String values;

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.length);
        parcel.writeString(this.getMin);
        parcel.writeString(this.getMax);
        parcel.writeString(this.setMin);
        parcel.writeString(this.setMax);
        Date date = this.IsOverlapping;
        long j = -1;
        parcel.writeLong(date != null ? date.getTime() : -1);
        parcel.writeString(this.equals);
        Date date2 = this.isInside;
        parcel.writeLong(date2 != null ? date2.getTime() : -1);
        Date date3 = this.toIntRange;
        parcel.writeLong(date3 != null ? date3.getTime() : -1);
        Date date4 = this.toFloatRange;
        if (date4 != null) {
            j = date4.getTime();
        }
        parcel.writeLong(j);
        parcel.writeString(this.values);
        parcel.writeInt(this.toString);
        parcel.writeString(this.toDoubleRange);
        parcel.writeString(this.FastBitmap$CoordinateSystem);
        parcel.writeString(this.hashCode);
        parcel.writeString(this.invokeSuspend);
        parcel.writeString(this.invoke);
        parcel.writeString(this.Mean$Arithmetic);
        parcel.writeString(this.Grayscale$Algorithm);
        parcel.writeString(this.valueOf);
        parcel.writeString(this.getCause);
        parcel.writeString(this.ICustomTabsCallback);
        parcel.writeString(this.b);
        parcel.writeString(this.onNavigationEvent);
        parcel.writeTypedList(this.create);
        parcel.writeString(this.onMessageChannelReady);
    }

    public CdpContentModel() {
    }

    protected CdpContentModel(Parcel parcel) {
        Date date;
        Date date2;
        Date date3;
        this.length = parcel.readString();
        this.getMin = parcel.readString();
        this.getMax = parcel.readString();
        this.setMin = parcel.readString();
        this.setMax = parcel.readString();
        long readLong = parcel.readLong();
        Date date4 = null;
        if (readLong == -1) {
            date = null;
        } else {
            date = new Date(readLong);
        }
        this.IsOverlapping = date;
        this.equals = parcel.readString();
        long readLong2 = parcel.readLong();
        if (readLong2 == -1) {
            date2 = null;
        } else {
            date2 = new Date(readLong2);
        }
        this.isInside = date2;
        long readLong3 = parcel.readLong();
        if (readLong3 == -1) {
            date3 = null;
        } else {
            date3 = new Date(readLong3);
        }
        this.toIntRange = date3;
        long readLong4 = parcel.readLong();
        this.toFloatRange = readLong4 != -1 ? new Date(readLong4) : date4;
        this.values = parcel.readString();
        this.toString = parcel.readInt();
        this.toDoubleRange = parcel.readString();
        this.FastBitmap$CoordinateSystem = parcel.readString();
        this.hashCode = parcel.readString();
        this.invokeSuspend = parcel.readString();
        this.invoke = parcel.readString();
        this.Mean$Arithmetic = parcel.readString();
        this.Grayscale$Algorithm = parcel.readString();
        this.valueOf = parcel.readString();
        this.getCause = parcel.readString();
        this.ICustomTabsCallback = parcel.readString();
        this.b = parcel.readString();
        this.onNavigationEvent = parcel.readString();
        this.create = parcel.createTypedArrayList(CREATOR);
        this.onMessageChannelReady = parcel.readString();
    }
}
