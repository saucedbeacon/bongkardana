package androidx.startup;

import android.content.ComponentName;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import java.util.HashSet;
import o.onStopNestedScroll;
import o.onWindowSystemUiVisibilityChanged;
import o.setOverlayMode;
import o.setShowingForActionMode;

@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class InitializationProvider extends ContentProvider {
    public final boolean onCreate() {
        Context context = getContext();
        if (context != null) {
            setOverlayMode max = setOverlayMode.setMax(context);
            try {
                if (Build.VERSION.SDK_INT >= 18) {
                    onStopNestedScroll.getMin("Startup");
                }
                Bundle bundle = max.setMax.getPackageManager().getProviderInfo(new ComponentName(max.setMax.getPackageName(), InitializationProvider.class.getName()), 128).metaData;
                String string = max.setMax.getString(onWindowSystemUiVisibilityChanged.setMin.androidx_startup);
                if (bundle != null) {
                    HashSet hashSet = new HashSet();
                    for (String str : bundle.keySet()) {
                        if (string.equals(bundle.getString(str, (String) null))) {
                            Class<?> cls = Class.forName(str);
                            if (setShowingForActionMode.class.isAssignableFrom(cls)) {
                                max.getMax.add(cls);
                                max.getMax(cls, hashSet);
                            }
                        }
                    }
                }
                if (Build.VERSION.SDK_INT < 18) {
                    return true;
                }
                onStopNestedScroll.length();
                return true;
            } catch (PackageManager.NameNotFoundException | ClassNotFoundException e) {
                throw new StartupException(e);
            } catch (Throwable th) {
                if (Build.VERSION.SDK_INT >= 18) {
                    onStopNestedScroll.length();
                }
                throw th;
            }
        } else {
            throw new StartupException("Context cannot be null");
        }
    }

    @Nullable
    public final Cursor query(@NonNull Uri uri, @Nullable String[] strArr, @Nullable String str, @Nullable String[] strArr2, @Nullable String str2) {
        throw new IllegalStateException("Not allowed.");
    }

    @Nullable
    public final String getType(@NonNull Uri uri) {
        throw new IllegalStateException("Not allowed.");
    }

    @Nullable
    public final Uri insert(@NonNull Uri uri, @Nullable ContentValues contentValues) {
        throw new IllegalStateException("Not allowed.");
    }

    public final int delete(@NonNull Uri uri, @Nullable String str, @Nullable String[] strArr) {
        throw new IllegalStateException("Not allowed.");
    }

    public final int update(@NonNull Uri uri, @Nullable ContentValues contentValues, @Nullable String str, @Nullable String[] strArr) {
        throw new IllegalStateException("Not allowed.");
    }
}
