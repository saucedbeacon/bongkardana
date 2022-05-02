package id.dana.richview.boundcard.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import id.dana.domain.payasset.model.Institution;
import java.util.ArrayList;
import java.util.List;
import o.CaptureServiceImpl;

public class BoundCard implements Parcelable {
    public static final Parcelable.Creator<BoundCard> CREATOR = new Parcelable.Creator<BoundCard>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new BoundCard[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new BoundCard(parcel);
        }
    };
    public String FastBitmap$CoordinateSystem;
    private String Grayscale$Algorithm;
    private String ICustomTabsCallback;
    public String IsOverlapping;
    public boolean Mean$Arithmetic;
    public String equals;
    private String getCause;
    public String getMax;
    public String getMin;
    public boolean hashCode;
    private Double invoke;
    public String invokeSuspend;
    public String isInside;
    public String length;
    private Double onNavigationEvent;
    public String setMax;
    public String setMin;
    public String toDoubleRange;
    public String toFloatRange;
    public Boolean toIntRange;
    public String toString;
    private String valueOf;
    public List<CaptureServiceImpl.CaptureSession> values;

    public int describeContents() {
        return 0;
    }

    public BoundCard() {
    }

    protected BoundCard(Parcel parcel) {
        this.setMax = parcel.readString();
        this.length = parcel.readString();
        this.getMax = parcel.readString();
        this.setMin = parcel.readString();
        this.getMin = parcel.readString();
        this.toIntRange = (Boolean) parcel.readValue(Boolean.class.getClassLoader());
        this.equals = parcel.readString();
        this.toFloatRange = parcel.readString();
        this.IsOverlapping = parcel.readString();
        this.isInside = parcel.readString();
        this.toString = parcel.readString();
        this.toDoubleRange = parcel.readString();
        ArrayList arrayList = new ArrayList();
        this.values = arrayList;
        parcel.readList(arrayList, CaptureServiceImpl.CaptureSession.class.getClassLoader());
        this.FastBitmap$CoordinateSystem = parcel.readString();
        this.Grayscale$Algorithm = parcel.readString();
        this.valueOf = parcel.readString();
        this.invoke = (Double) parcel.readValue(Double.class.getClassLoader());
        this.ICustomTabsCallback = parcel.readString();
        this.onNavigationEvent = (Double) parcel.readValue(Double.class.getClassLoader());
        this.getCause = parcel.readString();
    }

    public final String getMax() {
        if (this.toFloatRange.length() < 2) {
            return this.toFloatRange;
        }
        String str = this.toFloatRange;
        return str.substring(str.length() - 2);
    }

    public final boolean setMin() {
        return "BALANCE".equals(this.FastBitmap$CoordinateSystem);
    }

    public final boolean getMin() {
        return "DIRECT_DEBIT_CREDIT_CARD".equals(this.FastBitmap$CoordinateSystem) || "DIRECT_DEBIT_DEBIT_CARD".equals(this.FastBitmap$CoordinateSystem);
    }

    public final boolean toIntRange() {
        return Institution.BCA_ONEKLIK.equalsIgnoreCase(this.IsOverlapping);
    }

    public final boolean equals() {
        return this.hashCode;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.setMax);
        parcel.writeString(this.length);
        parcel.writeString(this.getMax);
        parcel.writeString(this.setMin);
        parcel.writeString(this.getMin);
        parcel.writeValue(this.toIntRange);
        parcel.writeString(this.equals);
        parcel.writeString(this.toFloatRange);
        parcel.writeString(this.IsOverlapping);
        parcel.writeString(this.isInside);
        parcel.writeString(this.toString);
        parcel.writeString(this.toDoubleRange);
        parcel.writeList(this.values);
        parcel.writeString(this.FastBitmap$CoordinateSystem);
        parcel.writeString(this.Grayscale$Algorithm);
        parcel.writeString(this.valueOf);
        parcel.writeValue(this.invoke);
        parcel.writeString(this.ICustomTabsCallback);
        parcel.writeValue(this.onNavigationEvent);
        parcel.writeString(this.getCause);
    }

    public final boolean toFloatRange() {
        return this.Mean$Arithmetic;
    }

    public final boolean length() {
        return "ADD_CARD".equalsIgnoreCase(this.setMin);
    }

    public final boolean setMax() {
        return !TextUtils.isEmpty(this.setMin) || "DEBIT_CARD".equals(this.setMax);
    }
}
