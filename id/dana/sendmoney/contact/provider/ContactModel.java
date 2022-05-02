package id.dana.sendmoney.contact.provider;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import o.changeMenuMode;
import o.isOriginHasAppInfo;

public class ContactModel implements Parcelable {
    public static final Parcelable.Creator<ContactModel> CREATOR = new Parcelable.Creator<ContactModel>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new ContactModel[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new ContactModel(parcel);
        }
    };
    public static final changeMenuMode.setMin<ContactModel> setMin = new changeMenuMode.setMin<ContactModel>() {
        public final /* synthetic */ boolean getMax(@NonNull Object obj, @NonNull Object obj2) {
            return getMin((ContactModel) obj, (ContactModel) obj2);
        }

        public final /* synthetic */ boolean setMax(@NonNull Object obj, @NonNull Object obj2) {
            return getMax((ContactModel) obj, (ContactModel) obj2);
        }

        private static boolean getMax(@NonNull ContactModel contactModel, @NonNull ContactModel contactModel2) {
            return contactModel.toString().equals(contactModel2.toString());
        }

        private static boolean getMin(@NonNull ContactModel contactModel, @NonNull ContactModel contactModel2) {
            return contactModel.toString().equals(contactModel2.toString());
        }
    };
    public String IsOverlapping;
    private int equals;
    public int getMax;
    public String getMin;
    public String isInside;
    public String length;
    public String setMax;
    public String toFloatRange;

    public int describeContents() {
        return 0;
    }

    public ContactModel(int i, String str, String str2, String str3, byte b) {
        this.getMax = i;
        this.length = str;
        this.setMax = str2;
        this.toFloatRange = str3;
        this.IsOverlapping = null;
        this.isInside = null;
        this.equals = 3;
    }

    public ContactModel(int i, String str, String str2, String str3) {
        this.getMax = i;
        this.toFloatRange = str;
        this.IsOverlapping = str2;
        this.isInside = str3;
        this.equals = 3;
    }

    public ContactModel() {
        this.equals = 6;
    }

    protected ContactModel(Parcel parcel) {
        this.getMax = parcel.readInt();
        this.getMin = parcel.readString();
        this.length = parcel.readString();
        this.setMax = parcel.readString();
        this.toFloatRange = parcel.readString();
        this.IsOverlapping = parcel.readString();
        this.isInside = parcel.readString();
        this.equals = parcel.readInt();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.getMax);
        parcel.writeString(this.getMin);
        parcel.writeString(this.length);
        parcel.writeString(this.setMax);
        parcel.writeString(this.toFloatRange);
        parcel.writeString(this.IsOverlapping);
        parcel.writeString(this.isInside);
        parcel.writeInt(this.equals);
    }

    public int hashCode() {
        return toString().hashCode();
    }

    public boolean equals(@Nullable Object obj) {
        return obj != null && toString().equals(obj.toString());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ContactModel{contactId=");
        sb.append(this.getMax);
        sb.append(", displayName='");
        sb.append(this.length);
        sb.append('\'');
        sb.append(", displayPhoto='");
        sb.append(this.setMax);
        sb.append('\'');
        sb.append(", phoneNumber='");
        sb.append(isOriginHasAppInfo.getClearPhoneNumber(this.toFloatRange));
        sb.append('\'');
        sb.append(", viewType=");
        sb.append(this.equals);
        sb.append('}');
        return sb.toString();
    }
}
