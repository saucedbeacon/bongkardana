package o;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.fragment.app.FragmentActivity;
import com.bumptech.glide.Glide;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public final class getContent implements Handler.Callback {
    private static final getMax toIntRange = new getMax() {
        @NonNull
        public final setHorizontalGap length(@NonNull Glide glide, @NonNull Group group, @NonNull getEmptyVisibility getemptyvisibility, @NonNull Context context) {
            return new setHorizontalGap(glide, group, getemptyvisibility, context);
        }
    };
    private final Handler IsOverlapping;
    private final Bundle equals = new Bundle();
    @VisibleForTesting
    final Map<FragmentManager, Placeholder> getMax = new HashMap();
    public final PlaybackStateCompat<View, Fragment> getMin = new PlaybackStateCompat<>();
    private final getMax isInside;
    public final PlaybackStateCompat<View, androidx.fragment.app.Fragment> length = new PlaybackStateCompat<>();
    private volatile setHorizontalGap setMax;
    @VisibleForTesting
    final Map<androidx.fragment.app.FragmentManager, acquireTempRect> setMin = new HashMap();

    public interface getMax {
        @NonNull
        setHorizontalGap length(@NonNull Glide glide, @NonNull Group group, @NonNull getEmptyVisibility getemptyvisibility, @NonNull Context context);
    }

    public getContent(@Nullable getMax getmax) {
        this.isInside = getmax == null ? toIntRange : getmax;
        this.IsOverlapping = new Handler(Looper.getMainLooper(), this);
    }

    @NonNull
    private setHorizontalGap setMin(@NonNull Context context) {
        if (this.setMax == null) {
            synchronized (this) {
                if (this.setMax == null) {
                    this.setMax = this.isInside.length(Glide.setMax(context.getApplicationContext()), new markHierarchyDirty(), new setGuidelineEnd(), context.getApplicationContext());
                }
            }
        }
        return this.setMax;
    }

    @NonNull
    public final setHorizontalGap length(@NonNull Context context) {
        while (context != null) {
            if (getDependents.getMax() && !(context instanceof Application)) {
                if (context instanceof FragmentActivity) {
                    return setMax((FragmentActivity) context);
                }
                if (context instanceof Activity) {
                    return setMax((Activity) context);
                }
                if (context instanceof ContextWrapper) {
                    ContextWrapper contextWrapper = (ContextWrapper) context;
                    if (contextWrapper.getBaseContext().getApplicationContext() != null) {
                        context = contextWrapper.getBaseContext();
                    }
                }
            }
            return setMin(context);
        }
        throw new IllegalArgumentException("You cannot start a load on a null Context");
    }

    @NonNull
    public final setHorizontalGap setMax(@NonNull FragmentActivity fragmentActivity) {
        if (getDependents.setMin()) {
            return length(fragmentActivity.getApplicationContext());
        }
        if (Build.VERSION.SDK_INT < 17 || !fragmentActivity.isDestroyed()) {
            return setMax(fragmentActivity, fragmentActivity.getSupportFragmentManager(), (androidx.fragment.app.Fragment) null, getMin(fragmentActivity));
        }
        throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
    }

    @NonNull
    public final setHorizontalGap setMin(@NonNull androidx.fragment.app.Fragment fragment) {
        if (fragment.getContext() == null) {
            throw new NullPointerException("You cannot start a load on a fragment before it is attached or after it is destroyed");
        } else if (getDependents.setMin()) {
            return length(fragment.getContext().getApplicationContext());
        } else {
            return setMax(fragment.getContext(), fragment.getChildFragmentManager(), fragment, fragment.isVisible());
        }
    }

    @NonNull
    public final setHorizontalGap setMax(@NonNull Activity activity) {
        if (getDependents.setMin()) {
            return length(activity.getApplicationContext());
        }
        if (Build.VERSION.SDK_INT < 17 || !activity.isDestroyed()) {
            return setMin(activity, activity.getFragmentManager(), (Fragment) null, getMin(activity));
        }
        throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
    }

    public static void length(@Nullable Collection<androidx.fragment.app.Fragment> collection, @NonNull Map<View, androidx.fragment.app.Fragment> map) {
        if (collection != null) {
            for (androidx.fragment.app.Fragment next : collection) {
                if (!(next == null || next.getView() == null)) {
                    map.put(next.getView(), next);
                    length((Collection<androidx.fragment.app.Fragment>) next.getChildFragmentManager().getMin.getMin(), map);
                }
            }
        }
    }

    @TargetApi(26)
    @Deprecated
    public final void length(@NonNull FragmentManager fragmentManager, @NonNull PlaybackStateCompat<View, Fragment> playbackStateCompat) {
        if (Build.VERSION.SDK_INT >= 26) {
            for (Fragment next : fragmentManager.getFragments()) {
                if (next.getView() != null) {
                    playbackStateCompat.put(next.getView(), next);
                    length(next.getChildFragmentManager(), playbackStateCompat);
                }
            }
            return;
        }
        int i = 0;
        while (true) {
            int i2 = i + 1;
            this.equals.putInt("key", i);
            Fragment fragment = null;
            try {
                fragment = fragmentManager.getFragment(this.equals, "key");
            } catch (Exception unused) {
            }
            if (fragment != null) {
                if (fragment.getView() != null) {
                    playbackStateCompat.put(fragment.getView(), fragment);
                    if (Build.VERSION.SDK_INT >= 17) {
                        length(fragment.getChildFragmentManager(), playbackStateCompat);
                    }
                }
                i = i2;
            } else {
                return;
            }
        }
    }

    @Nullable
    public static Activity setMax(@NonNull Context context) {
        while (!(context instanceof Activity)) {
            if (!(context instanceof ContextWrapper)) {
                return null;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return (Activity) context;
    }

    /* access modifiers changed from: package-private */
    @NonNull
    public final Placeholder setMin(@NonNull FragmentManager fragmentManager, @Nullable Fragment fragment, boolean z) {
        Placeholder placeholder = (Placeholder) fragmentManager.findFragmentByTag("com.bumptech.glide.manager");
        if (placeholder == null && (placeholder = this.getMax.get(fragmentManager)) == null) {
            placeholder = new Placeholder();
            placeholder.getMin = fragment;
            if (!(fragment == null || fragment.getActivity() == null)) {
                placeholder.setMax(fragment.getActivity());
            }
            if (z) {
                placeholder.setMax.setMin();
            }
            this.getMax.put(fragmentManager, placeholder);
            fragmentManager.beginTransaction().add(placeholder, "com.bumptech.glide.manager").commitAllowingStateLoss();
            this.IsOverlapping.obtainMessage(1, fragmentManager).sendToTarget();
        }
        return placeholder;
    }

    @NonNull
    @Deprecated
    public final setHorizontalGap setMin(@NonNull Context context, @NonNull FragmentManager fragmentManager, @Nullable Fragment fragment, boolean z) {
        Placeholder min = setMin(fragmentManager, fragment, z);
        setHorizontalGap sethorizontalgap = min.getMax;
        if (sethorizontalgap != null) {
            return sethorizontalgap;
        }
        setHorizontalGap length2 = this.isInside.length(Glide.setMax(context), min.setMax, min.setMin, context);
        min.getMax = length2;
        return length2;
    }

    /* access modifiers changed from: package-private */
    @NonNull
    public final acquireTempRect getMax(@NonNull androidx.fragment.app.FragmentManager fragmentManager, @Nullable androidx.fragment.app.Fragment fragment, boolean z) {
        acquireTempRect acquiretemprect = (acquireTempRect) fragmentManager.findFragmentByTag("com.bumptech.glide.manager");
        if (acquiretemprect == null && (acquiretemprect = this.setMin.get(fragmentManager)) == null) {
            acquiretemprect = new acquireTempRect();
            acquiretemprect.setMin = fragment;
            if (!(fragment == null || fragment.getContext() == null)) {
                androidx.fragment.app.Fragment fragment2 = fragment;
                while (fragment2.getParentFragment() != null) {
                    fragment2 = fragment2.getParentFragment();
                }
                androidx.fragment.app.FragmentManager fragmentManager2 = fragment2.getFragmentManager();
                if (fragmentManager2 != null) {
                    acquiretemprect.getMax(fragment.getContext(), fragmentManager2);
                }
            }
            if (z) {
                acquiretemprect.getMin.setMin();
            }
            this.setMin.put(fragmentManager, acquiretemprect);
            setColorFilter setcolorfilter = new setColorFilter(fragmentManager);
            setcolorfilter.length(0, acquiretemprect, "com.bumptech.glide.manager", 1);
            setcolorfilter.length();
            this.IsOverlapping.obtainMessage(2, fragmentManager).sendToTarget();
        }
        return acquiretemprect;
    }

    @NonNull
    private setHorizontalGap setMax(@NonNull Context context, @NonNull androidx.fragment.app.FragmentManager fragmentManager, @Nullable androidx.fragment.app.Fragment fragment, boolean z) {
        acquireTempRect max = getMax(fragmentManager, fragment, z);
        setHorizontalGap sethorizontalgap = max.length;
        if (sethorizontalgap != null) {
            return sethorizontalgap;
        }
        setHorizontalGap length2 = this.isInside.length(Glide.setMax(context), max.getMin, max.setMax, context);
        max.length = length2;
        return length2;
    }

    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            this.getMax.remove((FragmentManager) message.obj);
            return true;
        } else if (i != 2) {
            return false;
        } else {
            this.setMin.remove((androidx.fragment.app.FragmentManager) message.obj);
            return true;
        }
    }

    static boolean getMin(Context context) {
        Activity activity = null;
        if (context instanceof Activity) {
            activity = (Activity) context;
        } else if (context instanceof ContextWrapper) {
            Context context2 = ((ContextWrapper) context).getBaseContext();
            while (true) {
                if (!(context2 instanceof Activity)) {
                    if (!(context2 instanceof ContextWrapper)) {
                        break;
                    }
                    context2 = ((ContextWrapper) context2).getBaseContext();
                } else {
                    activity = (Activity) context2;
                    break;
                }
            }
        }
        return activity == null || !activity.isFinishing();
    }
}
