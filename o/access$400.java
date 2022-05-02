package o;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.util.Log;
import id.dana.danah5.akulaku.AkuEventParamsKey;

public final class access$400 {
    private final Context getMax;
    public final int length;
    public final int setMax;
    public final int setMin;

    interface length {
        int getMax();

        int getMin();
    }

    public access$400(getMin getmin) {
        int i;
        this.getMax = getmin.setMax;
        if (setMax(getmin.getMax)) {
            i = getmin.toFloatRange / 2;
        } else {
            i = getmin.toFloatRange;
        }
        this.setMax = i;
        ActivityManager activityManager = getmin.getMax;
        float f = getmin.isInside;
        float f2 = getmin.IsOverlapping;
        int round = Math.round(((float) (activityManager.getMemoryClass() * 1024 * 1024)) * (setMax(activityManager) ? f2 : f));
        float min = (float) (getmin.setMin.getMin() * getmin.setMin.getMax() * 4);
        int round2 = Math.round(getmin.equals * min);
        int round3 = Math.round(min * getmin.length);
        int i2 = round - this.setMax;
        if (round3 + round2 <= i2) {
            this.length = round3;
            this.setMin = round2;
        } else {
            float f3 = ((float) i2) / (getmin.equals + getmin.length);
            this.length = Math.round(getmin.length * f3);
            this.setMin = Math.round(f3 * getmin.equals);
        }
        if (Log.isLoggable("MemorySizeCalculator", 3)) {
            Formatter.formatFileSize(this.getMax, (long) this.length);
            Formatter.formatFileSize(this.getMax, (long) this.setMin);
            Formatter.formatFileSize(this.getMax, (long) this.setMax);
            Formatter.formatFileSize(this.getMax, (long) round);
            getmin.getMax.getMemoryClass();
            setMax(getmin.getMax);
        }
    }

    @TargetApi(19)
    static boolean setMax(ActivityManager activityManager) {
        if (Build.VERSION.SDK_INT >= 19) {
            return activityManager.isLowRamDevice();
        }
        return true;
    }

    public static final class getMin {
        static final int getMin = (Build.VERSION.SDK_INT < 26 ? 4 : 1);
        float IsOverlapping = 0.33f;
        float equals = ((float) getMin);
        ActivityManager getMax;
        float isInside = 0.4f;
        float length = 2.0f;
        final Context setMax;
        length setMin;
        int toFloatRange = 4194304;

        public getMin(Context context) {
            this.setMax = context;
            this.getMax = (ActivityManager) context.getSystemService(AkuEventParamsKey.KEY_ACTIVITY);
            this.setMin = new setMin(context.getResources().getDisplayMetrics());
            if (Build.VERSION.SDK_INT >= 26 && access$400.setMax(this.getMax)) {
                this.equals = 0.0f;
            }
        }
    }

    static final class setMin implements length {
        private final DisplayMetrics setMax;

        setMin(DisplayMetrics displayMetrics) {
            this.setMax = displayMetrics;
        }

        public final int getMin() {
            return this.setMax.widthPixels;
        }

        public final int getMax() {
            return this.setMax.heightPixels;
        }
    }
}
