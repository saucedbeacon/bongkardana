package com.zhuinden.simplestack;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import com.zhuinden.statebundle.StateBundle;

public class ParcelledState implements Parcelable {
    public static final Parcelable.Creator<ParcelledState> CREATOR = new Parcelable.Creator<ParcelledState>() {
        public final ParcelledState createFromParcel(Parcel parcel) {
            return new ParcelledState(parcel);
        }

        public final ParcelledState[] newArray(int i) {
            return new ParcelledState[i];
        }
    };
    public StateBundle bundle;
    public Parcelable parcelableKey;
    public SparseArray<Parcelable> viewHierarchyState;

    public int describeContents() {
        return 0;
    }

    public ParcelledState() {
    }

    protected ParcelledState(Parcel parcel) {
        this.parcelableKey = parcel.readParcelable(getClass().getClassLoader());
        this.viewHierarchyState = parcel.readSparseArray(getClass().getClassLoader());
        if (parcel.readByte() > 0) {
            this.bundle = (StateBundle) parcel.readParcelable(getClass().getClassLoader());
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.parcelableKey, i);
        parcel.writeSparseArray(this.viewHierarchyState);
        parcel.writeByte(this.bundle != null ? (byte) 1 : 0);
        StateBundle stateBundle = this.bundle;
        if (stateBundle != null) {
            parcel.writeParcelable(stateBundle, 0);
        }
    }
}
