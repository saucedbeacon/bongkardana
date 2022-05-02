package o;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import androidx.annotation.GuardedBy;
import androidx.annotation.VisibleForTesting;
import java.io.File;

public final class addView {
    private static volatile addView getMax;
    private static final File length = new File("/proc/self/fd");
    private final int getMin;
    @GuardedBy("this")
    private int isInside;
    private final int setMax;
    private final boolean setMin = setMax();
    @GuardedBy("this")
    private boolean toIntRange = true;

    public static addView setMin() {
        if (getMax == null) {
            synchronized (addView.class) {
                if (getMax == null) {
                    getMax = new addView();
                }
            }
        }
        return getMax;
    }

    @VisibleForTesting
    addView() {
        if (Build.VERSION.SDK_INT >= 28) {
            this.getMin = 20000;
            this.setMax = 0;
            return;
        }
        this.getMin = 700;
        this.setMax = 128;
    }

    public final boolean setMax(int i, int i2, boolean z, boolean z2) {
        int i3;
        if (!z || !this.setMin || Build.VERSION.SDK_INT < 26 || z2 || i < (i3 = this.setMax) || i2 < i3 || !getMin()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    @TargetApi(26)
    public final boolean getMin(int i, int i2, BitmapFactory.Options options, boolean z, boolean z2) {
        boolean max = setMax(i, i2, z, z2);
        if (max) {
            options.inPreferredConfig = Bitmap.Config.HARDWARE;
            options.inMutable = false;
        }
        return max;
    }

    private static boolean setMax() {
        if (Build.MODEL == null || Build.MODEL.length() < 7) {
            return true;
        }
        String substring = Build.MODEL.substring(0, 7);
        char c = 65535;
        switch (substring.hashCode()) {
            case -1398613787:
                if (substring.equals("SM-A520")) {
                    c = 6;
                    break;
                }
                break;
            case -1398431166:
                if (substring.equals("SM-G930")) {
                    c = 5;
                    break;
                }
                break;
            case -1398431161:
                if (substring.equals("SM-G935")) {
                    c = 4;
                    break;
                }
                break;
            case -1398431073:
                if (substring.equals("SM-G960")) {
                    c = 2;
                    break;
                }
                break;
            case -1398431068:
                if (substring.equals("SM-G965")) {
                    c = 3;
                    break;
                }
                break;
            case -1398343746:
                if (substring.equals("SM-J720")) {
                    c = 1;
                    break;
                }
                break;
            case -1398222624:
                if (substring.equals("SM-N935")) {
                    c = 0;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                if (Build.VERSION.SDK_INT != 26) {
                    return true;
                }
                return false;
            default:
                return true;
        }
    }

    private synchronized boolean getMin() {
        boolean z = true;
        int i = this.isInside + 1;
        this.isInside = i;
        if (i >= 50) {
            this.isInside = 0;
            if (length.list().length >= this.getMin) {
                z = false;
            }
            this.toIntRange = z;
        }
        return this.toIntRange;
    }
}
