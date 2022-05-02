package o;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import java.io.File;

@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class setChildFrame {
    private static volatile setTrackResource IsOverlapping = null;
    private static setTrackTintList equals = null;
    private static boolean getMax = false;
    private static long[] getMin = null;
    private static setSwitchMinWidth isInside = null;
    public static boolean length = false;
    private static String[] setMax;
    private static int setMin;
    private static int toFloatRange;
    private static volatile setTrackDrawable toIntRange;

    public static void getMin(String str) {
        if (getMax) {
            int i = setMin;
            if (i == 20) {
                toFloatRange++;
                return;
            }
            setMax[i] = str;
            getMin[i] = System.nanoTime();
            StyleableRes.setMax(str);
            setMin++;
        }
    }

    public static float length(String str) {
        int i = toFloatRange;
        if (i > 0) {
            toFloatRange = i - 1;
            return 0.0f;
        } else if (!getMax) {
            return 0.0f;
        } else {
            int i2 = setMin - 1;
            setMin = i2;
            if (i2 == -1) {
                throw new IllegalStateException("Can't end trace section. There are none.");
            } else if (str.equals(setMax[i2])) {
                StyleableRes.getMin();
                return ((float) (System.nanoTime() - getMin[setMin])) / 1000000.0f;
            } else {
                StringBuilder sb = new StringBuilder("Unbalanced trace call ");
                sb.append(str);
                sb.append(". Expected ");
                sb.append(setMax[setMin]);
                sb.append(".");
                throw new IllegalStateException(sb.toString());
            }
        }
    }

    @NonNull
    public static setTrackDrawable setMin(@NonNull Context context) {
        setTrackDrawable settrackdrawable;
        setTrackDrawable settrackdrawable2 = toIntRange;
        if (settrackdrawable2 != null) {
            return settrackdrawable2;
        }
        synchronized (setTrackDrawable.class) {
            settrackdrawable = toIntRange;
            if (settrackdrawable == null) {
                settrackdrawable = new setTrackDrawable(setMax(context), equals != null ? equals : new getThumbTextPadding());
                toIntRange = settrackdrawable;
            }
        }
        return settrackdrawable;
    }

    @NonNull
    private static setTrackResource setMax(@NonNull Context context) {
        setTrackResource settrackresource;
        final Context applicationContext = context.getApplicationContext();
        setTrackResource settrackresource2 = IsOverlapping;
        if (settrackresource2 != null) {
            return settrackresource2;
        }
        synchronized (setTrackResource.class) {
            settrackresource = IsOverlapping;
            if (settrackresource == null) {
                settrackresource = new setTrackResource(isInside != null ? isInside : new setSwitchMinWidth() {
                    @NonNull
                    public final File getMax() {
                        return new File(applicationContext.getCacheDir(), "lottie_network_cache");
                    }
                });
                IsOverlapping = settrackresource;
            }
        }
        return settrackresource;
    }
}
