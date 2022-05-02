package com.yalantis.ucrop.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;

public class AspectRatio implements Parcelable {
    public static final Parcelable.Creator<AspectRatio> CREATOR = new Parcelable.Creator<AspectRatio>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new AspectRatio[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new AspectRatio(parcel);
        }
    };
    @Nullable
    public final String getMin;
    public final float length;
    public final float setMax;

    public int describeContents() {
        return 0;
    }

    public AspectRatio(@Nullable String str, float f, float f2) {
        this.getMin = str;
        this.length = f;
        this.setMax = f2;
    }

    protected AspectRatio(Parcel parcel) {
        this.getMin = parcel.readString();
        this.length = parcel.readFloat();
        this.setMax = parcel.readFloat();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.getMin);
        parcel.writeFloat(this.length);
        parcel.writeFloat(this.setMax);
    }
}
