package com.github.mikephil.charting.data;

import android.os.Parcel;
import android.os.ParcelFormatException;
import android.os.Parcelable;
import o.dispatchOnDrawerSlide;
import o.getTargetFragment;

public class Entry extends dispatchOnDrawerSlide implements Parcelable {
    public static final Parcelable.Creator<Entry> CREATOR = new Parcelable.Creator<Entry>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new Entry[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new Entry(parcel);
        }
    };
    private float setMin;

    public int describeContents() {
        return 0;
    }

    public Entry() {
        this.setMin = 0.0f;
    }

    public Entry(byte b) {
        super(0.0f);
        this.setMin = 0.0f;
        this.setMin = 1.0f;
    }

    public Entry(float f, float f2, Object obj) {
        super(f2, obj);
        this.setMin = 0.0f;
        this.setMin = f;
    }

    public float length() {
        return this.setMin;
    }

    public void getMax(float f) {
        this.setMin = f;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Entry, x: ");
        sb.append(this.setMin);
        sb.append(" y: ");
        sb.append(getMin());
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.setMin);
        parcel.writeFloat(getMin());
        if (this.getMax == null) {
            parcel.writeInt(0);
        } else if (this.getMax instanceof Parcelable) {
            parcel.writeInt(1);
            parcel.writeParcelable((Parcelable) this.getMax, i);
        } else {
            throw new ParcelFormatException("Cannot parcel an Entry with non-parcelable data");
        }
    }

    protected Entry(Parcel parcel) {
        this.setMin = 0.0f;
        this.setMin = parcel.readFloat();
        length(parcel.readFloat());
        if (parcel.readInt() == 1) {
            this.getMax = parcel.readParcelable(Object.class.getClassLoader());
        }
    }

    public final boolean getMax(Entry entry) {
        if (entry != null && entry.getMax == this.getMax && Math.abs(entry.setMin - this.setMin) <= getTargetFragment.setMin && Math.abs(entry.getMin() - getMin()) <= getTargetFragment.setMin) {
            return true;
        }
        return false;
    }
}
