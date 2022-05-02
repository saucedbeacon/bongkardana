package o;

import android.annotation.SuppressLint;
import android.graphics.Insets;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ScaleDrawable;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import id.dana.lib.gcontainer.app.bridge.subapp.CloseSubAppEvent;
import java.lang.reflect.Field;
import o.INotificationSideChannel;
import o.RequiresPermission;

@SuppressLint({"RestrictedAPI"})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public final class adjustVolume {
    private static final int[] getMin = {16842912};
    private static Class<?> length;
    private static final int[] setMax = new int[0];
    public static final Rect setMin = new Rect();

    static {
        if (Build.VERSION.SDK_INT >= 18) {
            try {
                length = Class.forName("android.graphics.Insets");
            } catch (ClassNotFoundException unused) {
            }
        }
    }

    public static Rect getMin(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 29) {
            Insets opticalInsets = drawable.getOpticalInsets();
            Rect rect = new Rect();
            rect.left = opticalInsets.left;
            rect.right = opticalInsets.right;
            rect.top = opticalInsets.top;
            rect.bottom = opticalInsets.bottom;
            return rect;
        }
        if (length != null) {
            try {
                Drawable floatRange = RequiresPermission.Read.toFloatRange(drawable);
                Object invoke = floatRange.getClass().getMethod("getOpticalInsets", new Class[0]).invoke(floatRange, new Object[0]);
                if (invoke != null) {
                    Rect rect2 = new Rect();
                    for (Field field : length.getFields()) {
                        String name = field.getName();
                        char c = 65535;
                        switch (name.hashCode()) {
                            case -1383228885:
                                if (name.equals("bottom")) {
                                    c = 3;
                                    break;
                                }
                                break;
                            case 115029:
                                if (name.equals(CloseSubAppEvent.TOP)) {
                                    c = 1;
                                    break;
                                }
                                break;
                            case 3317767:
                                if (name.equals(TtmlNode.LEFT)) {
                                    c = 0;
                                    break;
                                }
                                break;
                            case 108511772:
                                if (name.equals(TtmlNode.RIGHT)) {
                                    c = 2;
                                    break;
                                }
                                break;
                        }
                        if (c == 0) {
                            rect2.left = field.getInt(invoke);
                        } else if (c == 1) {
                            rect2.top = field.getInt(invoke);
                        } else if (c == 2) {
                            rect2.right = field.getInt(invoke);
                        } else if (c == 3) {
                            rect2.bottom = field.getInt(invoke);
                        }
                    }
                    return rect2;
                }
            } catch (Exception unused) {
            }
        }
        return setMin;
    }

    static void length(@NonNull Drawable drawable) {
        if (Build.VERSION.SDK_INT == 21 && "android.graphics.drawable.VectorDrawable".equals(drawable.getClass().getName())) {
            int[] state = drawable.getState();
            if (state == null || state.length == 0) {
                drawable.setState(getMin);
            } else {
                drawable.setState(setMax);
            }
            drawable.setState(state);
        }
    }

    public static boolean setMin(@NonNull Drawable drawable) {
        while (true) {
            if (Build.VERSION.SDK_INT < 15 && (drawable instanceof InsetDrawable)) {
                return false;
            }
            if (Build.VERSION.SDK_INT < 15 && (drawable instanceof GradientDrawable)) {
                return false;
            }
            if (Build.VERSION.SDK_INT < 17 && (drawable instanceof LayerDrawable)) {
                return false;
            }
            if (drawable instanceof DrawableContainer) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (!(constantState instanceof DrawableContainer.DrawableContainerState)) {
                    return true;
                }
                for (Drawable min : ((DrawableContainer.DrawableContainerState) constantState).getChildren()) {
                    if (!setMin(min)) {
                        return false;
                    }
                }
                return true;
            } else if (drawable instanceof RequiresPermission) {
                drawable = ((RequiresPermission) drawable).setMin();
            } else if (drawable instanceof INotificationSideChannel.Stub) {
                drawable = ((INotificationSideChannel.Stub) drawable).getWrappedDrawable();
            } else if (!(drawable instanceof ScaleDrawable)) {
                return true;
            } else {
                drawable = ((ScaleDrawable) drawable).getDrawable();
            }
        }
    }

    public static PorterDuff.Mode setMin(int i, PorterDuff.Mode mode) {
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }
}
