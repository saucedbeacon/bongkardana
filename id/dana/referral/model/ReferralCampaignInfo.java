package id.dana.referral.model;

import android.os.Parcel;
import android.os.Parcelable;
import id.dana.model.CurrencyAmountModel;

public class ReferralCampaignInfo implements Parcelable {
    public static final Parcelable.Creator<ReferralCampaignInfo> CREATOR = new Parcelable.Creator<ReferralCampaignInfo>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new ReferralCampaignInfo[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new ReferralCampaignInfo(parcel);
        }
    };
    public String getMax;
    public CurrencyAmountModel getMin;
    public String length;
    public boolean setMax;

    public int describeContents() {
        return 0;
    }

    public ReferralCampaignInfo() {
    }

    public final boolean setMax() {
        return this.setMax;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.setMax ? (byte) 1 : 0);
        parcel.writeParcelable(this.getMin, i);
        parcel.writeString(this.getMax);
        parcel.writeString(this.length);
    }

    protected ReferralCampaignInfo(Parcel parcel) {
        this.setMax = parcel.readByte() != 0;
        this.getMin = (CurrencyAmountModel) parcel.readParcelable(CurrencyAmountModel.class.getClassLoader());
        this.getMax = parcel.readString();
        this.length = parcel.readString();
    }
}
