package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.FragmentManager;
import java.util.ArrayList;

@SuppressLint({"BanParcelableUsage"})
final class FragmentManagerState implements Parcelable {
    public static final Parcelable.Creator<FragmentManagerState> CREATOR = new Parcelable.Creator<FragmentManagerState>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new FragmentManagerState[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new FragmentManagerState(parcel);
        }
    };
    ArrayList<FragmentManager.LaunchedFragmentInfo> IsOverlapping;
    String getMax = null;
    BackStackState[] getMin;
    ArrayList<Bundle> isInside = new ArrayList<>();
    int length;
    ArrayList<String> setMax;
    ArrayList<FragmentState> setMin;
    ArrayList<String> toFloatRange = new ArrayList<>();

    public final int describeContents() {
        return 0;
    }

    public FragmentManagerState() {
    }

    public FragmentManagerState(Parcel parcel) {
        this.setMin = parcel.createTypedArrayList(FragmentState.CREATOR);
        this.setMax = parcel.createStringArrayList();
        this.getMin = (BackStackState[]) parcel.createTypedArray(BackStackState.CREATOR);
        this.length = parcel.readInt();
        this.getMax = parcel.readString();
        this.toFloatRange = parcel.createStringArrayList();
        this.isInside = parcel.createTypedArrayList(Bundle.CREATOR);
        this.IsOverlapping = parcel.createTypedArrayList(FragmentManager.LaunchedFragmentInfo.CREATOR);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.setMin);
        parcel.writeStringList(this.setMax);
        parcel.writeTypedArray(this.getMin, i);
        parcel.writeInt(this.length);
        parcel.writeString(this.getMax);
        parcel.writeStringList(this.toFloatRange);
        parcel.writeTypedList(this.isInside);
        parcel.writeTypedList(this.IsOverlapping);
    }
}
