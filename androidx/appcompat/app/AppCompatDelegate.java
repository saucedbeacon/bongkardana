package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.CallSuper;
import androidx.annotation.IdRes;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.appcompat.widget.Toolbar;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import o.ITrustedWebActivityService;
import o.IconCompatParcelizer;
import o.MediaSessionCompat$Token;
import o.getSmallIconBitmap;
import o.playFromMediaId;

public abstract class AppCompatDelegate {
    private static int getMax = -100;
    private static final MediaSessionCompat$Token<WeakReference<AppCompatDelegate>> getMin = new MediaSessionCompat$Token<>();
    private static final Object length = new Object();

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    public @interface NightMode {
    }

    public int IsOverlapping() {
        return -100;
    }

    public abstract void equals();

    @Nullable
    public abstract IconCompatParcelizer getMax(@NonNull IconCompatParcelizer.getMin getmin);

    public abstract void getMax();

    @Deprecated
    public void getMax(Context context) {
    }

    public abstract MenuInflater getMin();

    public abstract void getMin(Configuration configuration);

    public abstract void getMin(Bundle bundle);

    public abstract void getMin(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void getMin(@Nullable Toolbar toolbar);

    public abstract boolean getMin(int i);

    public abstract void isInside();

    public abstract void length();

    public abstract void length(@LayoutRes int i);

    public abstract void length(Bundle bundle);

    @Nullable
    public abstract <T extends View> T setMax(@IdRes int i);

    @Nullable
    public abstract ActionBar setMax();

    public abstract void setMax(Bundle bundle);

    public abstract void setMax(View view);

    public abstract void setMin();

    public void setMin(@StyleRes int i) {
    }

    public abstract void setMin(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void setMin(@Nullable CharSequence charSequence);

    @Nullable
    public abstract ITrustedWebActivityService.setMin toFloatRange();

    public abstract void toIntRange();

    @NonNull
    public static AppCompatDelegate setMin(@NonNull Activity activity, @Nullable getSmallIconBitmap getsmalliconbitmap) {
        return new AppCompatDelegateImpl(activity, getsmalliconbitmap);
    }

    @NonNull
    public static AppCompatDelegate getMin(@NonNull Dialog dialog, @Nullable getSmallIconBitmap getsmalliconbitmap) {
        return new AppCompatDelegateImpl(dialog, getsmalliconbitmap);
    }

    AppCompatDelegate() {
    }

    @CallSuper
    @NonNull
    public Context getMin(@NonNull Context context) {
        getMax(context);
        return context;
    }

    public static int values() {
        return getMax;
    }

    public static void getMin(boolean z) {
        playFromMediaId.setMax(z);
    }

    static void getMax(@NonNull AppCompatDelegate appCompatDelegate) {
        synchronized (length) {
            getMin(appCompatDelegate);
            getMin.add(new WeakReference(appCompatDelegate));
        }
    }

    static void length(@NonNull AppCompatDelegate appCompatDelegate) {
        synchronized (length) {
            getMin(appCompatDelegate);
        }
    }

    private static void getMin(@NonNull AppCompatDelegate appCompatDelegate) {
        synchronized (length) {
            Iterator<WeakReference<AppCompatDelegate>> it = getMin.iterator();
            while (it.hasNext()) {
                AppCompatDelegate appCompatDelegate2 = (AppCompatDelegate) it.next().get();
                if (appCompatDelegate2 == appCompatDelegate || appCompatDelegate2 == null) {
                    it.remove();
                }
            }
        }
    }
}
