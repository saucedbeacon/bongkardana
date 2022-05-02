package o;

import android.graphics.BlendMode;
import android.graphics.BlendModeColorFilter;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.graphics.BlendModeCompat;
import o.Nullable;

public class MenuRes {
    @Nullable
    public static ColorFilter getMin(int i, @NonNull BlendModeCompat blendModeCompat) {
        PorterDuff.Mode mode;
        BlendMode blendMode;
        if (Build.VERSION.SDK_INT >= 29) {
            switch (Nullable.AnonymousClass4.setMax[blendModeCompat.ordinal()]) {
                case 1:
                    blendMode = BlendMode.CLEAR;
                    break;
                case 2:
                    blendMode = BlendMode.SRC;
                    break;
                case 3:
                    blendMode = BlendMode.DST;
                    break;
                case 4:
                    blendMode = BlendMode.SRC_OVER;
                    break;
                case 5:
                    blendMode = BlendMode.DST_OVER;
                    break;
                case 6:
                    blendMode = BlendMode.SRC_IN;
                    break;
                case 7:
                    blendMode = BlendMode.DST_IN;
                    break;
                case 8:
                    blendMode = BlendMode.SRC_OUT;
                    break;
                case 9:
                    blendMode = BlendMode.DST_OUT;
                    break;
                case 10:
                    blendMode = BlendMode.SRC_ATOP;
                    break;
                case 11:
                    blendMode = BlendMode.DST_ATOP;
                    break;
                case 12:
                    blendMode = BlendMode.XOR;
                    break;
                case 13:
                    blendMode = BlendMode.PLUS;
                    break;
                case 14:
                    blendMode = BlendMode.MODULATE;
                    break;
                case 15:
                    blendMode = BlendMode.SCREEN;
                    break;
                case 16:
                    blendMode = BlendMode.OVERLAY;
                    break;
                case 17:
                    blendMode = BlendMode.DARKEN;
                    break;
                case 18:
                    blendMode = BlendMode.LIGHTEN;
                    break;
                case 19:
                    blendMode = BlendMode.COLOR_DODGE;
                    break;
                case 20:
                    blendMode = BlendMode.COLOR_BURN;
                    break;
                case 21:
                    blendMode = BlendMode.HARD_LIGHT;
                    break;
                case 22:
                    blendMode = BlendMode.SOFT_LIGHT;
                    break;
                case 23:
                    blendMode = BlendMode.DIFFERENCE;
                    break;
                case 24:
                    blendMode = BlendMode.EXCLUSION;
                    break;
                case 25:
                    blendMode = BlendMode.MULTIPLY;
                    break;
                case 26:
                    blendMode = BlendMode.HUE;
                    break;
                case 27:
                    blendMode = BlendMode.SATURATION;
                    break;
                case 28:
                    blendMode = BlendMode.COLOR;
                    break;
                case 29:
                    blendMode = BlendMode.LUMINOSITY;
                    break;
                default:
                    blendMode = null;
                    break;
            }
            if (blendMode != null) {
                return new BlendModeColorFilter(i, blendMode);
            }
            return null;
        }
        if (blendModeCompat != null) {
            switch (Nullable.AnonymousClass4.setMax[blendModeCompat.ordinal()]) {
                case 1:
                    mode = PorterDuff.Mode.CLEAR;
                    break;
                case 2:
                    mode = PorterDuff.Mode.SRC;
                    break;
                case 3:
                    mode = PorterDuff.Mode.DST;
                    break;
                case 4:
                    mode = PorterDuff.Mode.SRC_OVER;
                    break;
                case 5:
                    mode = PorterDuff.Mode.DST_OVER;
                    break;
                case 6:
                    mode = PorterDuff.Mode.SRC_IN;
                    break;
                case 7:
                    mode = PorterDuff.Mode.DST_IN;
                    break;
                case 8:
                    mode = PorterDuff.Mode.SRC_OUT;
                    break;
                case 9:
                    mode = PorterDuff.Mode.DST_OUT;
                    break;
                case 10:
                    mode = PorterDuff.Mode.SRC_ATOP;
                    break;
                case 11:
                    mode = PorterDuff.Mode.DST_ATOP;
                    break;
                case 12:
                    mode = PorterDuff.Mode.XOR;
                    break;
                case 13:
                    mode = PorterDuff.Mode.ADD;
                    break;
                case 14:
                    mode = PorterDuff.Mode.MULTIPLY;
                    break;
                case 15:
                    mode = PorterDuff.Mode.SCREEN;
                    break;
                case 16:
                    mode = PorterDuff.Mode.OVERLAY;
                    break;
                case 17:
                    mode = PorterDuff.Mode.DARKEN;
                    break;
                case 18:
                    mode = PorterDuff.Mode.LIGHTEN;
                    break;
            }
        }
        mode = null;
        if (mode != null) {
            return new PorterDuffColorFilter(i, mode);
        }
        return null;
    }
}
