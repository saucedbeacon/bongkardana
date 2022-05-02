package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.lifecycle.Lifecycle;
import java.util.ArrayList;
import o.invalidateDrawable;
import o.setColorFilter;
import o.unscheduleDrawable;

@SuppressLint({"BanParcelableUsage"})
final class BackStackState implements Parcelable {
    public static final Parcelable.Creator<BackStackState> CREATOR = new Parcelable.Creator<BackStackState>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new BackStackState[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new BackStackState(parcel);
        }
    };
    final int IsOverlapping;
    final int equals;
    final int[] getMax;
    final int[] getMin;
    final ArrayList<String> hashCode;
    final int isInside;
    final int length;
    final int[] setMax;
    final ArrayList<String> setMin;
    final ArrayList<String> toDoubleRange;
    final CharSequence toFloatRange;
    final String toIntRange;
    final boolean toString;
    final CharSequence values;

    public final int describeContents() {
        return 0;
    }

    public BackStackState(setColorFilter setcolorfilter) {
        int size = setcolorfilter.getMin.size();
        this.getMax = new int[(size * 5)];
        if (setcolorfilter.IsOverlapping) {
            this.setMin = new ArrayList<>(size);
            this.setMax = new int[size];
            this.getMin = new int[size];
            int i = 0;
            int i2 = 0;
            while (i < size) {
                invalidateDrawable.length length2 = (invalidateDrawable.length) setcolorfilter.getMin.get(i);
                int i3 = i2 + 1;
                this.getMax[i2] = length2.setMin;
                this.setMin.add(length2.getMin != null ? length2.getMin.mWho : null);
                int i4 = i3 + 1;
                this.getMax[i3] = length2.getMax;
                int i5 = i4 + 1;
                this.getMax[i4] = length2.setMax;
                int i6 = i5 + 1;
                this.getMax[i5] = length2.length;
                this.getMax[i6] = length2.toIntRange;
                this.setMax[i] = length2.equals.ordinal();
                this.getMin[i] = length2.isInside.ordinal();
                i++;
                i2 = i6 + 1;
            }
            this.length = setcolorfilter.toFloatRange;
            this.toIntRange = setcolorfilter.toString;
            this.equals = setcolorfilter.length;
            this.IsOverlapping = setcolorfilter.toDoubleRange;
            this.toFloatRange = setcolorfilter.FastBitmap$CoordinateSystem;
            this.isInside = setcolorfilter.values;
            this.values = setcolorfilter.invoke;
            this.hashCode = setcolorfilter.Mean$Arithmetic;
            this.toDoubleRange = setcolorfilter.invokeSuspend;
            this.toString = setcolorfilter.Grayscale$Algorithm;
            return;
        }
        throw new IllegalStateException("Not on back stack");
    }

    public BackStackState(Parcel parcel) {
        this.getMax = parcel.createIntArray();
        this.setMin = parcel.createStringArrayList();
        this.setMax = parcel.createIntArray();
        this.getMin = parcel.createIntArray();
        this.length = parcel.readInt();
        this.toIntRange = parcel.readString();
        this.equals = parcel.readInt();
        this.IsOverlapping = parcel.readInt();
        this.toFloatRange = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.isInside = parcel.readInt();
        this.values = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.hashCode = parcel.createStringArrayList();
        this.toDoubleRange = parcel.createStringArrayList();
        this.toString = parcel.readInt() != 0;
    }

    public final setColorFilter setMin(FragmentManager fragmentManager) {
        setColorFilter setcolorfilter = new setColorFilter(fragmentManager);
        int i = 0;
        int i2 = 0;
        while (i < this.getMax.length) {
            invalidateDrawable.length length2 = new invalidateDrawable.length();
            int i3 = i + 1;
            length2.setMin = this.getMax[i];
            FragmentManager.getMin(2);
            String str = this.setMin.get(i2);
            Fragment fragment = null;
            if (str != null) {
                unscheduleDrawable unscheduledrawable = fragmentManager.getMin.length.get(str);
                if (unscheduledrawable != null) {
                    fragment = unscheduledrawable.getMax;
                }
                length2.getMin = fragment;
            } else {
                length2.getMin = null;
            }
            length2.equals = Lifecycle.State.values()[this.setMax[i2]];
            length2.isInside = Lifecycle.State.values()[this.getMin[i2]];
            int i4 = i3 + 1;
            length2.getMax = this.getMax[i3];
            int i5 = i4 + 1;
            length2.setMax = this.getMax[i4];
            int i6 = i5 + 1;
            length2.length = this.getMax[i5];
            length2.toIntRange = this.getMax[i6];
            setcolorfilter.setMax = length2.getMax;
            setcolorfilter.isInside = length2.setMax;
            setcolorfilter.equals = length2.length;
            setcolorfilter.toIntRange = length2.toIntRange;
            setcolorfilter.getMin(length2);
            i2++;
            i = i6 + 1;
        }
        setcolorfilter.toFloatRange = this.length;
        setcolorfilter.toString = this.toIntRange;
        setcolorfilter.length = this.equals;
        setcolorfilter.IsOverlapping = true;
        setcolorfilter.toDoubleRange = this.IsOverlapping;
        setcolorfilter.FastBitmap$CoordinateSystem = this.toFloatRange;
        setcolorfilter.values = this.isInside;
        setcolorfilter.invoke = this.values;
        setcolorfilter.Mean$Arithmetic = this.hashCode;
        setcolorfilter.invokeSuspend = this.toDoubleRange;
        setcolorfilter.Grayscale$Algorithm = this.toString;
        setcolorfilter.getMin(1);
        return setcolorfilter;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.getMax);
        parcel.writeStringList(this.setMin);
        parcel.writeIntArray(this.setMax);
        parcel.writeIntArray(this.getMin);
        parcel.writeInt(this.length);
        parcel.writeString(this.toIntRange);
        parcel.writeInt(this.equals);
        parcel.writeInt(this.IsOverlapping);
        TextUtils.writeToParcel(this.toFloatRange, parcel, 0);
        parcel.writeInt(this.isInside);
        TextUtils.writeToParcel(this.values, parcel, 0);
        parcel.writeStringList(this.hashCode);
        parcel.writeStringList(this.toDoubleRange);
        parcel.writeInt(this.toString ? 1 : 0);
    }
}
