package o;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import androidx.annotation.DrawableRes;
import androidx.annotation.Nullable;

public final class setId {
    private static volatile boolean getMax = true;

    public static Drawable getMin(Context context, Context context2, @DrawableRes int i) {
        return getMax(context, context2, i, (Resources.Theme) null);
    }

    public static Drawable length(Context context, @DrawableRes int i, @Nullable Resources.Theme theme) {
        return getMax(context, context, i, theme);
    }

    private static Drawable getMax(Context context, Context context2, @DrawableRes int i, @Nullable Resources.Theme theme) {
        try {
            if (getMax) {
                return cancelAll.getMin(theme != null ? new MediaBrowserCompat$MediaItem(context2, theme) : context2, i);
            }
        } catch (NoClassDefFoundError unused) {
            getMax = false;
        } catch (IllegalStateException e) {
            if (!context.getPackageName().equals(context2.getPackageName())) {
                return IntRange.length(context2, i);
            }
            throw e;
        } catch (Resources.NotFoundException unused2) {
        }
        if (theme == null) {
            theme = context2.getTheme();
        }
        return OptIn.getMax(context2.getResources(), i, theme);
    }
}
