package o;

import android.os.Parcelable;

public interface hasFlexibleChildInBothOrientations {
    Object fromParcelable(Parcelable parcelable);

    Parcelable toParcelable(Object obj);
}
