package o;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.util.AttributeSet;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import java.io.IOException;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public interface RequiresPermission {
    void getMin(Drawable drawable);

    Drawable setMin();

    final class Write extends Drawable.ConstantState {
        ColorStateList getMax = null;
        PorterDuff.Mode getMin = conditional.getMax;
        int length;
        Drawable.ConstantState setMin;

        Write(@Nullable Write write) {
            if (write != null) {
                this.length = write.length;
                this.setMin = write.setMin;
                this.getMax = write.getMax;
                this.getMin = write.getMin;
            }
        }

        @NonNull
        public final Drawable newDrawable() {
            return newDrawable((Resources) null);
        }

        @NonNull
        public final Drawable newDrawable(@Nullable Resources resources) {
            if (Build.VERSION.SDK_INT >= 21) {
                return new RestrictTo(this, resources);
            }
            return new conditional(this, resources);
        }

        public final int getChangingConfigurations() {
            int i = this.length;
            Drawable.ConstantState constantState = this.setMin;
            return i | (constantState != null ? constantState.getChangingConfigurations() : 0);
        }

        /* access modifiers changed from: package-private */
        public final boolean getMin() {
            return this.setMin != null;
        }
    }

    public final class Read {
        private static boolean getMin;
        private static boolean length;
        private static Method setMax;
        private static Method setMin;

        @Deprecated
        public static void getMin(@NonNull Drawable drawable) {
            drawable.jumpToCurrentState();
        }

        public static void getMin(@NonNull Drawable drawable, boolean z) {
            if (Build.VERSION.SDK_INT >= 19) {
                drawable.setAutoMirrored(z);
            }
        }

        public static boolean setMin(@NonNull Drawable drawable) {
            if (Build.VERSION.SDK_INT >= 19) {
                return drawable.isAutoMirrored();
            }
            return false;
        }

        public static void getMax(@NonNull Drawable drawable, float f, float f2) {
            if (Build.VERSION.SDK_INT >= 21) {
                drawable.setHotspot(f, f2);
            }
        }

        public static void setMin(@NonNull Drawable drawable, int i, int i2, int i3, int i4) {
            if (Build.VERSION.SDK_INT >= 21) {
                drawable.setHotspotBounds(i, i2, i3, i4);
            }
        }

        public static void getMin(@NonNull Drawable drawable, @ColorInt int i) {
            if (Build.VERSION.SDK_INT >= 21) {
                drawable.setTint(i);
            } else if (drawable instanceof allOf) {
                ((allOf) drawable).setTint(i);
            }
        }

        public static void setMin(@NonNull Drawable drawable, @Nullable ColorStateList colorStateList) {
            if (Build.VERSION.SDK_INT >= 21) {
                drawable.setTintList(colorStateList);
            } else if (drawable instanceof allOf) {
                ((allOf) drawable).setTintList(colorStateList);
            }
        }

        public static void setMin(@NonNull Drawable drawable, @NonNull PorterDuff.Mode mode) {
            if (Build.VERSION.SDK_INT >= 21) {
                drawable.setTintMode(mode);
            } else if (drawable instanceof allOf) {
                ((allOf) drawable).setTintMode(mode);
            }
        }

        public static int length(@NonNull Drawable drawable) {
            if (Build.VERSION.SDK_INT >= 19) {
                return drawable.getAlpha();
            }
            return 0;
        }

        public static void getMax(@NonNull Drawable drawable, @NonNull Resources.Theme theme) {
            if (Build.VERSION.SDK_INT >= 21) {
                drawable.applyTheme(theme);
            }
        }

        public static boolean getMax(@NonNull Drawable drawable) {
            if (Build.VERSION.SDK_INT >= 21) {
                return drawable.canApplyTheme();
            }
            return false;
        }

        public static ColorFilter setMax(@NonNull Drawable drawable) {
            if (Build.VERSION.SDK_INT >= 21) {
                return drawable.getColorFilter();
            }
            return null;
        }

        public static void IsOverlapping(@NonNull Drawable drawable) {
            DrawableContainer.DrawableContainerState drawableContainerState;
            while (Build.VERSION.SDK_INT < 23 && Build.VERSION.SDK_INT >= 21) {
                drawable.clearColorFilter();
                if (drawable instanceof InsetDrawable) {
                    drawable = ((InsetDrawable) drawable).getDrawable();
                } else if (drawable instanceof RequiresPermission) {
                    drawable = ((RequiresPermission) drawable).setMin();
                } else if ((drawable instanceof DrawableContainer) && (drawableContainerState = (DrawableContainer.DrawableContainerState) ((DrawableContainer) drawable).getConstantState()) != null) {
                    int childCount = drawableContainerState.getChildCount();
                    for (int i = 0; i < childCount; i++) {
                        Drawable child = drawableContainerState.getChild(i);
                        if (child != null) {
                            IsOverlapping(child);
                        }
                    }
                    return;
                } else {
                    return;
                }
            }
            drawable.clearColorFilter();
        }

        public static void getMin(@NonNull Drawable drawable, @NonNull Resources resources, @NonNull XmlPullParser xmlPullParser, @NonNull AttributeSet attributeSet, @Nullable Resources.Theme theme) throws XmlPullParserException, IOException {
            if (Build.VERSION.SDK_INT >= 21) {
                drawable.inflate(resources, xmlPullParser, attributeSet, theme);
            } else {
                drawable.inflate(resources, xmlPullParser, attributeSet);
            }
        }

        public static Drawable toIntRange(@NonNull Drawable drawable) {
            if (Build.VERSION.SDK_INT >= 23) {
                return drawable;
            }
            return Build.VERSION.SDK_INT >= 21 ? !(drawable instanceof allOf) ? new RestrictTo(drawable) : drawable : !(drawable instanceof allOf) ? new conditional(drawable) : drawable;
        }

        public static <T extends Drawable> T toFloatRange(@NonNull Drawable drawable) {
            return drawable instanceof RequiresPermission ? ((RequiresPermission) drawable).setMin() : drawable;
        }

        public static boolean setMax(@NonNull Drawable drawable, int i) {
            if (Build.VERSION.SDK_INT >= 23) {
                return drawable.setLayoutDirection(i);
            }
            if (Build.VERSION.SDK_INT >= 17) {
                if (!length) {
                    Class<Drawable> cls = Drawable.class;
                    try {
                        Method declaredMethod = cls.getDeclaredMethod("setLayoutDirection", new Class[]{Integer.TYPE});
                        setMin = declaredMethod;
                        declaredMethod.setAccessible(true);
                    } catch (NoSuchMethodException unused) {
                    }
                    length = true;
                }
                Method method = setMin;
                if (method != null) {
                    try {
                        method.invoke(drawable, new Object[]{Integer.valueOf(i)});
                        return true;
                    } catch (Exception unused2) {
                        setMin = null;
                    }
                }
            }
            return false;
        }

        public static int isInside(@NonNull Drawable drawable) {
            if (Build.VERSION.SDK_INT >= 23) {
                return drawable.getLayoutDirection();
            }
            if (Build.VERSION.SDK_INT >= 17) {
                if (!getMin) {
                    try {
                        Method declaredMethod = Drawable.class.getDeclaredMethod("getLayoutDirection", new Class[0]);
                        setMax = declaredMethod;
                        declaredMethod.setAccessible(true);
                    } catch (NoSuchMethodException unused) {
                    }
                    getMin = true;
                }
                Method method = setMax;
                if (method != null) {
                    try {
                        return ((Integer) method.invoke(drawable, new Object[0])).intValue();
                    } catch (Exception unused2) {
                        setMax = null;
                    }
                }
            }
            return 0;
        }
    }
}
