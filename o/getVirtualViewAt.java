package o;

import android.graphics.drawable.Drawable;

public abstract class getVirtualViewAt extends Drawable {
    public abstract boolean getMin(getVirtualViewAt getvirtualviewat);

    public static boolean getMin(getVirtualViewAt getvirtualviewat, getVirtualViewAt getvirtualviewat2) {
        if (getvirtualviewat == null) {
            return getvirtualviewat2 == null;
        }
        if (getvirtualviewat2 == null) {
            return true;
        }
        return getvirtualviewat.getMin(getvirtualviewat2);
    }
}
