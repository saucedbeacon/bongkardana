package id.dana.plugin.bca.oneklik.registration.model;

import android.os.Parcel;
import android.os.Parcelable;

public class RegistrationBcaXCOModel implements Parcelable {
    public static final Parcelable.Creator<RegistrationBcaXCOModel> CREATOR = new Parcelable.Creator<RegistrationBcaXCOModel>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new RegistrationBcaXCOModel[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new RegistrationBcaXCOModel(parcel);
        }
    };
    public String getMax;
    public String getMin;
    public String isInside;
    public String length;
    public String setMax;
    public String setMin;
    private String toIntRange;

    public RegistrationBcaXCOModel() {
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.getMax);
        parcel.writeString(this.setMax);
        parcel.writeString(this.getMin);
        parcel.writeString(this.setMin);
        parcel.writeString(this.length);
        parcel.writeString(this.toIntRange);
        parcel.writeString(this.isInside);
    }

    protected RegistrationBcaXCOModel(Parcel parcel) {
        this.getMax = parcel.readString();
        this.setMax = parcel.readString();
        this.getMin = parcel.readString();
        this.setMin = parcel.readString();
        this.length = parcel.readString();
        this.toIntRange = parcel.readString();
        this.isInside = parcel.readString();
    }
}
