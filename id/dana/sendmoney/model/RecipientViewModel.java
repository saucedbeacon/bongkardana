package id.dana.sendmoney.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import o.PhotoSelectListener;
import o.changeMenuMode;

public class RecipientViewModel extends PhotoSelectListener implements Parcelable {
    public static final Parcelable.Creator<RecipientViewModel> CREATOR = new Parcelable.Creator<RecipientViewModel>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new RecipientViewModel[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new RecipientViewModel(parcel);
        }
    };
    public static final changeMenuMode.setMin<RecipientViewModel> toString = new changeMenuMode.setMin<RecipientViewModel>() {
        public final /* synthetic */ boolean getMax(@NonNull Object obj, @NonNull Object obj2) {
            return length((RecipientViewModel) obj, (RecipientViewModel) obj2);
        }

        public final /* bridge */ /* synthetic */ boolean setMax(@NonNull Object obj, @NonNull Object obj2) {
            return setMax((RecipientViewModel) obj, (RecipientViewModel) obj2);
        }

        private static boolean setMax(@NonNull RecipientViewModel recipientViewModel, @NonNull RecipientViewModel recipientViewModel2) {
            return recipientViewModel.toString().equals(recipientViewModel2.toString());
        }

        private static boolean length(@NonNull RecipientViewModel recipientViewModel, @NonNull RecipientViewModel recipientViewModel2) {
            return recipientViewModel.toString().equals(recipientViewModel2.toString());
        }
    };
    private boolean invoke;
    public int values;

    public int describeContents() {
        return 0;
    }

    public RecipientViewModel(int i) {
        this.values = i;
    }

    public RecipientViewModel(int i, String str) {
        this.values = i;
        this.isInside = str;
    }

    protected RecipientViewModel(Parcel parcel) {
        this.values = parcel.readInt();
        this.invoke = ((Boolean) parcel.readValue(Boolean.class.getClassLoader())).booleanValue();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(getMin());
        parcel.writeString(length());
        parcel.writeString(getMax());
        parcel.writeString(this.isInside);
        parcel.writeString(this.setMin);
        parcel.writeString(setMax());
        parcel.writeString(this.equals);
        parcel.writeString(this.toIntRange);
        parcel.writeString(this.toFloatRange);
        parcel.writeString(this.length);
        parcel.writeLong(this.setMax);
        parcel.writeString(toIntRange());
        parcel.writeInt(this.FastBitmap$CoordinateSystem);
        parcel.writeInt(this.values);
        parcel.writeValue(Boolean.valueOf(this.invoke));
    }
}
