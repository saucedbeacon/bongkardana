package id.dana.referral.model;

import android.os.Parcel;
import android.os.Parcelable;

public class MyReferralConsult implements Parcelable {
    public static final Parcelable.Creator<MyReferralConsult> CREATOR = new Parcelable.Creator<MyReferralConsult>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new MyReferralConsult[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new MyReferralConsult(parcel);
        }
    };
    public String getMin;
    public String length;
    public ReferralCampaignInfo setMax;
    public ReferralCampaignInfo setMin;

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.getMin);
        parcel.writeString(this.length);
        parcel.writeParcelable(this.setMin, i);
        parcel.writeParcelable(this.setMax, i);
    }

    public MyReferralConsult() {
    }

    protected MyReferralConsult(Parcel parcel) {
        this.getMin = parcel.readString();
        this.length = parcel.readString();
        this.setMin = (ReferralCampaignInfo) parcel.readParcelable(ReferralCampaignInfo.class.getClassLoader());
        this.setMax = (ReferralCampaignInfo) parcel.readParcelable(ReferralCampaignInfo.class.getClassLoader());
    }
}
