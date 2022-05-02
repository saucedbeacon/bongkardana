package o;

import android.graphics.Bitmap;
import android.graphics.Typeface;

public abstract class hasDependencies {
    public boolean isFormatSupported(String str) {
        return false;
    }

    public Typeface resolveFont(String str, int i, String str2) {
        return null;
    }

    public Bitmap resolveImage(String str) {
        return null;
    }
}
