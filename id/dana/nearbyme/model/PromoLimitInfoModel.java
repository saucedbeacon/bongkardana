package id.dana.nearbyme.model;

import android.os.Parcel;
import android.os.Parcelable;

public class PromoLimitInfoModel implements Parcelable {
    public static final Parcelable.Creator<PromoLimitInfoModel> CREATOR = new Parcelable.Creator<PromoLimitInfoModel>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new PromoLimitInfoModel[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new PromoLimitInfoModel(parcel);
        }
    };
    public String getMax;
    public String length;
    public String setMin;

    public int describeContents() {
        return 0;
    }

    protected PromoLimitInfoModel(Parcel parcel) {
        this.length = parcel.readString();
        this.getMax = parcel.readString();
        this.setMin = parcel.readString();
    }

    public PromoLimitInfoModel() {
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.length);
        parcel.writeString(this.getMax);
        parcel.writeString(this.setMin);
    }
}
