package o;

import android.graphics.Rect;

public class smoothScrollToPosition extends onAnchorReady {
    private static final String setMax = smoothScrollToPosition.class.getSimpleName();

    /* access modifiers changed from: protected */
    public final float getMin(setStackFromEnd setstackfromend, setStackFromEnd setstackfromend2) {
        if (setstackfromend.getMax <= 0 || setstackfromend.setMax <= 0) {
            return 0.0f;
        }
        setStackFromEnd min = setstackfromend.setMin(setstackfromend2);
        float f = (((float) min.getMax) * 1.0f) / ((float) setstackfromend.getMax);
        if (f > 1.0f) {
            f = (float) Math.pow((double) (1.0f / f), 1.1d);
        }
        float f2 = ((((float) min.getMax) * 1.0f) / ((float) setstackfromend2.getMax)) + ((((float) min.setMax) * 1.0f) / ((float) setstackfromend2.setMax));
        return f * ((1.0f / f2) / f2);
    }

    public final Rect length(setStackFromEnd setstackfromend, setStackFromEnd setstackfromend2) {
        setStackFromEnd min = setstackfromend.setMin(setstackfromend2);
        int i = (min.getMax - setstackfromend2.getMax) / 2;
        int i2 = (min.setMax - setstackfromend2.setMax) / 2;
        return new Rect(-i, -i2, min.getMax - i, min.setMax - i2);
    }
}
