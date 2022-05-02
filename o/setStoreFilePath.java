package o;

import android.text.TextUtils;

public final class setStoreFilePath implements RedDotDrawable {
    public static final setStoreFilePath setMax = new setStoreFilePath();

    public final Object apply(Object obj) {
        return Boolean.valueOf(!TextUtils.isEmpty((CharSequence) obj));
    }
}
