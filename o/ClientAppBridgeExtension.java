package o;

import android.text.TextPaint;
import androidx.annotation.NonNull;

public final class ClientAppBridgeExtension {
    public static int calculateMultiline(@NonNull String str, int i, int i2, int i3) {
        float f;
        TextPaint textPaint = new TextPaint();
        String str2 = "\t";
        if (!str.contains(str2)) {
            str2 = " ";
        }
        float measureText = textPaint.measureText(str2);
        int i4 = i;
        for (String str3 : str.split(str2)) {
            if (!str3.equals("")) {
                float measureText2 = textPaint.measureText(str3);
                if (((float) ((750 - i4) - i3)) >= measureText2) {
                    f = (float) i4;
                } else {
                    i2 = (int) (((float) i2) + (textPaint.descent() - textPaint.ascent()));
                    f = (float) i;
                }
                i4 = (int) (f + measureText2 + measureText);
            }
        }
        return i2;
    }
}
