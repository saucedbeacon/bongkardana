package com.rd.draw.data;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

public class PositionSavedState extends View.BaseSavedState {
    public static final Parcelable.Creator<PositionSavedState> CREATOR = new Parcelable.Creator<PositionSavedState>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new PositionSavedState[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new PositionSavedState(parcel, (byte) 0);
        }
    };
    public int getMin;
    public int length;
    public int setMax;

    /* synthetic */ PositionSavedState(Parcel parcel, byte b) {
        this(parcel);
    }

    public PositionSavedState(Parcelable parcelable) {
        super(parcelable);
    }

    private PositionSavedState(Parcel parcel) {
        super(parcel);
        this.getMin = parcel.readInt();
        this.setMax = parcel.readInt();
        this.length = parcel.readInt();
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.getMin);
        parcel.writeInt(this.setMax);
        parcel.writeInt(this.length);
    }
}
