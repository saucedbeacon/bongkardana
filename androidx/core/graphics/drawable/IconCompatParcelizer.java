package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.os.Parcelable;
import androidx.annotation.RestrictTo;
import androidx.versionedparcelable.VersionedParcel;

@RestrictTo({RestrictTo.Scope.LIBRARY})
public class IconCompatParcelizer {
    public static IconCompat read(VersionedParcel versionedParcel) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.setMax = versionedParcel.getMin(iconCompat.setMax, 1);
        iconCompat.length = versionedParcel.setMax(iconCompat.length);
        iconCompat.getMax = versionedParcel.setMax(iconCompat.getMax, 3);
        iconCompat.setMin = versionedParcel.getMin(iconCompat.setMin, 4);
        iconCompat.isInside = versionedParcel.getMin(iconCompat.isInside, 5);
        iconCompat.equals = (ColorStateList) versionedParcel.setMax(iconCompat.equals, 6);
        iconCompat.IsOverlapping = versionedParcel.length(iconCompat.IsOverlapping, 7);
        iconCompat.FastBitmap$CoordinateSystem = versionedParcel.length(iconCompat.FastBitmap$CoordinateSystem, 8);
        iconCompat.IsOverlapping();
        return iconCompat;
    }

    public static void write(IconCompat iconCompat, VersionedParcel versionedParcel) {
        iconCompat.setMax(false);
        if (-1 != iconCompat.setMax) {
            versionedParcel.getMax(iconCompat.setMax, 1);
        }
        if (iconCompat.length != null) {
            versionedParcel.getMax(iconCompat.length);
        }
        if (iconCompat.getMax != null) {
            versionedParcel.getMax(iconCompat.getMax, 3);
        }
        if (iconCompat.setMin != 0) {
            versionedParcel.getMax(iconCompat.setMin, 4);
        }
        if (iconCompat.isInside != 0) {
            versionedParcel.getMax(iconCompat.isInside, 5);
        }
        if (iconCompat.equals != null) {
            versionedParcel.getMax((Parcelable) iconCompat.equals, 6);
        }
        if (iconCompat.IsOverlapping != null) {
            versionedParcel.getMin(iconCompat.IsOverlapping, 7);
        }
        if (iconCompat.FastBitmap$CoordinateSystem != null) {
            versionedParcel.getMin(iconCompat.FastBitmap$CoordinateSystem, 8);
        }
    }
}
