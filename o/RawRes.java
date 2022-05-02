package o;

import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import androidx.annotation.NonNull;

public final class RawRes {
    private static final ThreadLocal<setNegativeButton<Rect, Rect>> length = new ThreadLocal<>();

    public static boolean setMax(@NonNull Paint paint, @NonNull String str) {
        if (Build.VERSION.SDK_INT >= 23) {
            return paint.hasGlyph(str);
        }
        int length2 = str.length();
        if (length2 == 1 && Character.isWhitespace(str.charAt(0))) {
            return true;
        }
        float measureText = paint.measureText("󟿽");
        float measureText2 = paint.measureText("m");
        float measureText3 = paint.measureText(str);
        float f = 0.0f;
        if (measureText3 == 0.0f) {
            return false;
        }
        if (str.codePointCount(0, str.length()) > 1) {
            if (measureText3 > measureText2 * 2.0f) {
                return false;
            }
            int i = 0;
            while (i < length2) {
                int charCount = Character.charCount(str.codePointAt(i)) + i;
                f += paint.measureText(str, i, charCount);
                i = charCount;
            }
            if (measureText3 >= f) {
                return false;
            }
        }
        if (measureText3 != measureText) {
            return true;
        }
        setNegativeButton<Rect, Rect> length3 = length();
        paint.getTextBounds("󟿽", 0, 2, (Rect) length3.setMax);
        paint.getTextBounds(str, 0, length2, (Rect) length3.getMin);
        return !((Rect) length3.setMax).equals(length3.getMin);
    }

    private static setNegativeButton<Rect, Rect> length() {
        setNegativeButton<Rect, Rect> setnegativebutton = length.get();
        if (setnegativebutton == null) {
            setNegativeButton<Rect, Rect> setnegativebutton2 = new setNegativeButton<>(new Rect(), new Rect());
            length.set(setnegativebutton2);
            return setnegativebutton2;
        }
        ((Rect) setnegativebutton.setMax).setEmpty();
        ((Rect) setnegativebutton.getMin).setEmpty();
        return setnegativebutton;
    }
}
