package id.dana.nearbyme.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

public class MerchantSubcategoryModel implements Parcelable {
    public static final Parcelable.Creator<MerchantSubcategoryModel> CREATOR = new Parcelable.Creator<MerchantSubcategoryModel>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new MerchantSubcategoryModel[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new MerchantSubcategoryModel(parcel);
        }
    };
    public String getMin;
    public String setMax;
    public List<String> setMin = new ArrayList();

    public int describeContents() {
        return 0;
    }

    public MerchantSubcategoryModel() {
    }

    public MerchantSubcategoryModel(Parcel parcel) {
        this.setMax = parcel.readString();
        this.getMin = parcel.readString();
        this.setMin = parcel.createStringArrayList();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.setMax);
        parcel.writeString(this.getMin);
        parcel.writeStringList(this.setMin);
    }
}
