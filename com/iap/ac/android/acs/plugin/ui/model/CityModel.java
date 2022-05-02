package com.iap.ac.android.acs.plugin.ui.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;

public class CityModel implements Parcelable {
    public static final Parcelable.Creator<CityModel> CREATOR = new Parcelable.Creator<CityModel>() {
        public final CityModel createFromParcel(Parcel parcel) {
            CityModel cityModel = new CityModel();
            cityModel.code = parcel.readString();
            cityModel.name = parcel.readString();
            return cityModel;
        }

        public final CityModel[] newArray(int i) {
            return new CityModel[i];
        }
    };
    public String code;
    public String name;

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.code);
        parcel.writeString(this.name);
    }

    @NonNull
    public String toString() {
        StringBuilder sb = new StringBuilder("CityModel{code='");
        sb.append(this.code);
        sb.append('\'');
        sb.append(", name='");
        sb.append(this.name);
        sb.append('\'');
        sb.append('}');
        return sb.toString();
    }
}
