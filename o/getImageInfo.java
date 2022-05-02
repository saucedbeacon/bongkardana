package o;

import android.text.TextUtils;

public final class getImageInfo implements RedDotDrawable {
    public static final getImageInfo getMax = new getImageInfo();

    public final Object apply(Object obj) {
        return Boolean.valueOf(!TextUtils.isEmpty((CharSequence) obj));
    }
}
