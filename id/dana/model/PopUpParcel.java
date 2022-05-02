package id.dana.model;

import android.os.Parcelable;
import com.google.auto.value.AutoValue;

@AutoValue
public abstract class PopUpParcel implements Parcelable {
    public abstract int getMax();

    public abstract int getMin();

    public abstract String length();

    public abstract int setMax();

    public abstract int setMin();
}
