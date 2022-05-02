package o;

import android.os.Parcel;
import android.os.Parcelable;
import o.setInitialSavedState;

public class setArguments extends setInitialSavedState.setMax {
    private static setInitialSavedState<setArguments> getMax;
    public static final Parcelable.Creator<setArguments> setMin = new Parcelable.Creator<setArguments>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new setArguments[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            setArguments setarguments = new setArguments(0.0f, 0.0f);
            setarguments.length = parcel.readFloat();
            setarguments.getMin = parcel.readFloat();
            return setarguments;
        }
    };
    public float getMin;
    public float length;

    static {
        setInitialSavedState<setArguments> max = setInitialSavedState.getMax(32, new setArguments(0.0f, 0.0f));
        getMax = max;
        max.setMax = 0.5f;
    }

    public setArguments() {
    }

    public setArguments(float f, float f2) {
        this.length = f;
        this.getMin = f2;
    }

    public static setArguments getMax(float f, float f2) {
        setArguments max = getMax.setMax();
        max.length = f;
        max.getMin = f2;
        return max;
    }

    public static setArguments length() {
        return getMax.setMax();
    }

    public static setArguments setMax(setArguments setarguments) {
        setArguments max = getMax.setMax();
        max.length = setarguments.length;
        max.getMin = setarguments.getMin;
        return max;
    }

    public static void setMin(setArguments setarguments) {
        getMax.getMax(setarguments);
    }

    /* access modifiers changed from: protected */
    public final setInitialSavedState.setMax setMin() {
        return new setArguments(0.0f, 0.0f);
    }
}
