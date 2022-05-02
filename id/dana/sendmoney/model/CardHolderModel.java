package id.dana.sendmoney.model;

import android.os.Parcel;
import android.os.Parcelable;

public class CardHolderModel implements Parcelable {
    public static final Parcelable.Creator<CardHolderModel> CREATOR = new Parcelable.Creator<CardHolderModel>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new CardHolderModel[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new CardHolderModel(parcel);
        }
    };
    public String length;
    public String setMin;

    public int describeContents() {
        return 0;
    }

    public CardHolderModel(String str, String str2) {
        this.setMin = str;
        this.length = str2;
    }

    protected CardHolderModel(Parcel parcel) {
        this.setMin = parcel.readString();
        this.length = parcel.readString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.setMin);
        parcel.writeString(this.length);
    }
}
