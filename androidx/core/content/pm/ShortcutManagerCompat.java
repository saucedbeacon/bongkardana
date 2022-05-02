package androidx.core.content.pm;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ShortcutManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.core.graphics.drawable.IconCompat;
import java.io.InputStream;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o.IntegerRes;
import o.Keep;
import o.LongDef;

public class ShortcutManagerCompat {
    private static volatile LongDef<?> length;
    private static volatile List<IntegerRes> setMin;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    public @interface ShortcutMatchFlags {
    }

    private ShortcutManagerCompat() {
    }

    public static boolean setMax(@NonNull Context context, @NonNull List<Keep> list) {
        if (Build.VERSION.SDK_INT <= 29) {
            setMin(context, list);
        }
        if (Build.VERSION.SDK_INT >= 25) {
            ArrayList arrayList = new ArrayList();
            for (Keep max : list) {
                arrayList.add(max.setMax());
            }
            if (!((ShortcutManager) context.getSystemService(ShortcutManager.class)).addDynamicShortcuts(arrayList)) {
                return false;
            }
        }
        length(context).setMax(list);
        Iterator<IntegerRes> it = getMax(context).iterator();
        while (it.hasNext()) {
            it.next();
        }
        return true;
    }

    @VisibleForTesting
    static boolean getMin(@NonNull Context context, @NonNull Keep keep) {
        Bitmap decodeStream;
        IconCompat iconCompat;
        if (keep.toFloatRange == null) {
            return false;
        }
        int i = keep.toFloatRange.setMax;
        if (i != 6 && i != 4) {
            return true;
        }
        InputStream min = keep.toFloatRange.getMin(context);
        if (min == null || (decodeStream = BitmapFactory.decodeStream(min)) == null) {
            return false;
        }
        if (i == 6) {
            iconCompat = IconCompat.getMax(decodeStream);
        } else {
            iconCompat = IconCompat.length(decodeStream);
        }
        keep.toFloatRange = iconCompat;
        return true;
    }

    @VisibleForTesting
    static void setMin(@NonNull Context context, @NonNull List<Keep> list) {
        for (Keep keep : new ArrayList(list)) {
            if (!getMin(context, keep)) {
                list.remove(keep);
            }
        }
    }

    public static void setMax(@NonNull Context context) {
        if (Build.VERSION.SDK_INT >= 25) {
            ((ShortcutManager) context.getSystemService(ShortcutManager.class)).removeAllDynamicShortcuts();
        }
        length(context).length();
        Iterator<IntegerRes> it = getMax(context).iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    private static LongDef<?> length(Context context) {
        if (length == null) {
            if (Build.VERSION.SDK_INT >= 23) {
                try {
                    length = (LongDef) Class.forName("androidx.sharetarget.ShortcutInfoCompatSaverImpl", false, ShortcutManagerCompat.class.getClassLoader()).getMethod("getInstance", new Class[]{Context.class}).invoke((Object) null, new Object[]{context});
                } catch (Exception unused) {
                }
            }
            if (length == null) {
                length = new LongDef.setMin();
            }
        }
        return length;
    }

    private static List<IntegerRes> getMax(Context context) {
        Bundle bundle;
        String string;
        if (setMin == null) {
            ArrayList arrayList = new ArrayList();
            if (Build.VERSION.SDK_INT >= 21) {
                PackageManager packageManager = context.getPackageManager();
                Intent intent = new Intent("androidx.core.content.pm.SHORTCUT_LISTENER");
                intent.setPackage(context.getPackageName());
                for (ResolveInfo resolveInfo : packageManager.queryIntentActivities(intent, 128)) {
                    ActivityInfo activityInfo = resolveInfo.activityInfo;
                    if (!(activityInfo == null || (bundle = activityInfo.metaData) == null || (string = bundle.getString("androidx.core.content.pm.shortcut_listener_impl")) == null)) {
                        try {
                            arrayList.add((IntegerRes) Class.forName(string, false, ShortcutManagerCompat.class.getClassLoader()).getMethod("getInstance", new Class[]{Context.class}).invoke((Object) null, new Object[]{context}));
                        } catch (Exception unused) {
                        }
                    }
                }
            }
            if (setMin == null) {
                setMin = arrayList;
            }
        }
        return setMin;
    }
}
