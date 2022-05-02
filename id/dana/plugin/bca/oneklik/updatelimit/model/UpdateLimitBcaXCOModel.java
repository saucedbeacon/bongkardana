package id.dana.plugin.bca.oneklik.updatelimit.model;

import android.os.Parcel;
import android.os.Parcelable;

public class UpdateLimitBcaXCOModel implements Parcelable {
    public static final Parcelable.Creator<UpdateLimitBcaXCOModel> CREATOR = new Parcelable.Creator<UpdateLimitBcaXCOModel>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new UpdateLimitBcaXCOModel[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new UpdateLimitBcaXCOModel(parcel);
        }
    };
    public String equals;
    public String getMax;
    public String getMin;
    public String length;
    public String setMax;
    public String setMin;
    public String toFloatRange;

    public UpdateLimitBcaXCOModel() {
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.setMin);
        parcel.writeString(this.getMax);
        parcel.writeString(this.getMin);
        parcel.writeString(this.length);
        parcel.writeString(this.setMax);
        parcel.writeString(this.toFloatRange);
        parcel.writeString(this.equals);
    }

    protected UpdateLimitBcaXCOModel(Parcel parcel) {
        this.setMin = parcel.readString();
        this.getMax = parcel.readString();
        this.getMin = parcel.readString();
        this.length = parcel.readString();
        this.setMax = parcel.readString();
        this.toFloatRange = parcel.readString();
        this.equals = parcel.readString();
    }
}
