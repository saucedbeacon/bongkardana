package o;

import android.graphics.Rect;

public class updateAnchorFromChildren extends onAnchorReady {
    private static final String setMin = updateAnchorFromChildren.class.getSimpleName();

    /* access modifiers changed from: protected */
    public final float getMin(setStackFromEnd setstackfromend, setStackFromEnd setstackfromend2) {
        if (setstackfromend.getMax <= 0 || setstackfromend.setMax <= 0) {
            return 0.0f;
        }
        float f = (((float) setstackfromend.getMax) * 1.0f) / ((float) setstackfromend2.getMax);
        if (f < 1.0f) {
            f = 1.0f / f;
        }
        float f2 = (((float) setstackfromend.setMax) * 1.0f) / ((float) setstackfromend2.setMax);
        if (f2 < 1.0f) {
            f2 = 1.0f / f2;
        }
        float f3 = (1.0f / f) / f2;
        float f4 = ((((float) setstackfromend.getMax) * 1.0f) / ((float) setstackfromend.setMax)) / ((((float) setstackfromend2.getMax) * 1.0f) / ((float) setstackfromend2.setMax));
        if (f4 < 1.0f) {
            f4 = 1.0f / f4;
        }
        return f3 * (((1.0f / f4) / f4) / f4);
    }

    public final Rect length(setStackFromEnd setstackfromend, setStackFromEnd setstackfromend2) {
        return new Rect(0, 0, setstackfromend2.getMax, setstackfromend2.setMax);
    }
}
