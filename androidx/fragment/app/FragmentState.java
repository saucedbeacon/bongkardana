package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;

@SuppressLint({"BanParcelableUsage"})
public final class FragmentState implements Parcelable {
    public static final Parcelable.Creator<FragmentState> CREATOR = new Parcelable.Creator<FragmentState>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new FragmentState[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new FragmentState(parcel);
        }
    };
    public final boolean FastBitmap$CoordinateSystem;
    public final Bundle IsOverlapping;
    public final String equals;
    public final String getMax;
    public final String getMin;
    public final boolean isInside;
    public final int length;
    public final int setMax;
    public final boolean setMin;
    public Bundle toDoubleRange;
    public final boolean toFloatRange;
    public final boolean toIntRange;
    public final int toString;

    public final int describeContents() {
        return 0;
    }

    FragmentState(Fragment fragment) {
        this.getMin = fragment.getClass().getName();
        this.getMax = fragment.mWho;
        this.setMin = fragment.mFromLayout;
        this.setMax = fragment.mFragmentId;
        this.length = fragment.mContainerId;
        this.equals = fragment.mTag;
        this.toFloatRange = fragment.mRetainInstance;
        this.isInside = fragment.mRemoving;
        this.toIntRange = fragment.mDetached;
        this.IsOverlapping = fragment.mArguments;
        this.FastBitmap$CoordinateSystem = fragment.mHidden;
        this.toString = fragment.mMaxState.ordinal();
    }

    FragmentState(Parcel parcel) {
        this.getMin = parcel.readString();
        this.getMax = parcel.readString();
        boolean z = true;
        this.setMin = parcel.readInt() != 0;
        this.setMax = parcel.readInt();
        this.length = parcel.readInt();
        this.equals = parcel.readString();
        this.toFloatRange = parcel.readInt() != 0;
        this.isInside = parcel.readInt() != 0;
        this.toIntRange = parcel.readInt() != 0;
        this.IsOverlapping = parcel.readBundle();
        this.FastBitmap$CoordinateSystem = parcel.readInt() == 0 ? false : z;
        this.toDoubleRange = parcel.readBundle();
        this.toString = parcel.readInt();
    }

    @NonNull
    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.getMin);
        sb.append(" (");
        sb.append(this.getMax);
        sb.append(")}:");
        if (this.setMin) {
            sb.append(" fromLayout");
        }
        if (this.length != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.length));
        }
        String str = this.equals;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(this.equals);
        }
        if (this.toFloatRange) {
            sb.append(" retainInstance");
        }
        if (this.isInside) {
            sb.append(" removing");
        }
        if (this.toIntRange) {
            sb.append(" detached");
        }
        if (this.FastBitmap$CoordinateSystem) {
            sb.append(" hidden");
        }
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.getMin);
        parcel.writeString(this.getMax);
        parcel.writeInt(this.setMin ? 1 : 0);
        parcel.writeInt(this.setMax);
        parcel.writeInt(this.length);
        parcel.writeString(this.equals);
        parcel.writeInt(this.toFloatRange ? 1 : 0);
        parcel.writeInt(this.isInside ? 1 : 0);
        parcel.writeInt(this.toIntRange ? 1 : 0);
        parcel.writeBundle(this.IsOverlapping);
        parcel.writeInt(this.FastBitmap$CoordinateSystem ? 1 : 0);
        parcel.writeBundle(this.toDoubleRange);
        parcel.writeInt(this.toString);
    }
}
