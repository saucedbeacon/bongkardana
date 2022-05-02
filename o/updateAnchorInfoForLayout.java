package o;

import android.graphics.Rect;

public class updateAnchorInfoForLayout extends onAnchorReady {
    private static final String length = updateAnchorInfoForLayout.class.getSimpleName();

    /* access modifiers changed from: protected */
    public final float getMin(setStackFromEnd setstackfromend, setStackFromEnd setstackfromend2) {
        if (setstackfromend.getMax <= 0 || setstackfromend.setMax <= 0) {
            return 0.0f;
        }
        setStackFromEnd max = setstackfromend.setMax(setstackfromend2);
        float f = (((float) max.getMax) * 1.0f) / ((float) setstackfromend.getMax);
        if (f > 1.0f) {
            f = (float) Math.pow((double) (1.0f / f), 1.1d);
        }
        float f2 = ((((float) setstackfromend2.getMax) * 1.0f) / ((float) max.getMax)) * ((((float) setstackfromend2.setMax) * 1.0f) / ((float) max.setMax));
        return f * (((1.0f / f2) / f2) / f2);
    }

    public final Rect length(setStackFromEnd setstackfromend, setStackFromEnd setstackfromend2) {
        setStackFromEnd max = setstackfromend.setMax(setstackfromend2);
        int i = (max.getMax - setstackfromend2.getMax) / 2;
        int i2 = (max.setMax - setstackfromend2.setMax) / 2;
        return new Rect(-i, -i2, max.getMax - i, max.setMax - i2);
    }
}
