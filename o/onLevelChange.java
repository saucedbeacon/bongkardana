package o;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import java.util.ArrayList;

@Deprecated
public abstract class onLevelChange extends setExpandActivityOverflowButtonDrawable {
    private boolean IsOverlapping;
    private final FragmentManager getMax;
    private ArrayList<Fragment.SavedState> getMin;
    private final int length;
    private invalidateDrawable setMax;
    private ArrayList<Fragment> setMin;
    private Fragment toIntRange;

    @NonNull
    public abstract Fragment getMax(int i);

    @Deprecated
    public onLevelChange(@NonNull FragmentManager fragmentManager) {
        this(fragmentManager, 0);
    }

    public onLevelChange(@NonNull FragmentManager fragmentManager, int i) {
        this.setMax = null;
        this.getMin = new ArrayList<>();
        this.setMin = new ArrayList<>();
        this.toIntRange = null;
        this.getMax = fragmentManager;
        this.length = i;
    }

    public void startUpdate(@NonNull ViewGroup viewGroup) {
        if (viewGroup.getId() == -1) {
            StringBuilder sb = new StringBuilder("ViewPager with adapter ");
            sb.append(this);
            sb.append(" requires a view id");
            throw new IllegalStateException(sb.toString());
        }
    }

    @NonNull
    public Object instantiateItem(@NonNull ViewGroup viewGroup, int i) {
        Fragment.SavedState savedState;
        Fragment fragment;
        if (this.setMin.size() > i && (fragment = this.setMin.get(i)) != null) {
            return fragment;
        }
        if (this.setMax == null) {
            this.setMax = new setColorFilter(this.getMax);
        }
        Fragment max = getMax(i);
        if (this.getMin.size() > i && (savedState = this.getMin.get(i)) != null) {
            max.setInitialSavedState(savedState);
        }
        while (this.setMin.size() <= i) {
            this.setMin.add((Object) null);
        }
        max.setMenuVisibility(false);
        if (this.length == 0) {
            max.setUserVisibleHint(false);
        }
        this.setMin.set(i, max);
        this.setMax.length(viewGroup.getId(), max, (String) null, 1);
        if (this.length == 1) {
            this.setMax.getMax(max, Lifecycle.State.STARTED);
        }
        return max;
    }

    public void destroyItem(@NonNull ViewGroup viewGroup, int i, @NonNull Object obj) {
        Fragment fragment = (Fragment) obj;
        if (this.setMax == null) {
            this.setMax = new setColorFilter(this.getMax);
        }
        while (this.getMin.size() <= i) {
            this.getMin.add((Object) null);
        }
        this.getMin.set(i, fragment.isAdded() ? this.getMax.toFloatRange(fragment) : null);
        this.setMin.set(i, (Object) null);
        this.setMax.length(fragment);
        if (fragment.equals(this.toIntRange)) {
            this.toIntRange = null;
        }
    }

    public void setPrimaryItem(@NonNull ViewGroup viewGroup, int i, @NonNull Object obj) {
        Fragment fragment = (Fragment) obj;
        Fragment fragment2 = this.toIntRange;
        if (fragment != fragment2) {
            if (fragment2 != null) {
                fragment2.setMenuVisibility(false);
                if (this.length == 1) {
                    if (this.setMax == null) {
                        this.setMax = new setColorFilter(this.getMax);
                    }
                    this.setMax.getMax(this.toIntRange, Lifecycle.State.STARTED);
                } else {
                    this.toIntRange.setUserVisibleHint(false);
                }
            }
            fragment.setMenuVisibility(true);
            if (this.length == 1) {
                if (this.setMax == null) {
                    this.setMax = new setColorFilter(this.getMax);
                }
                this.setMax.getMax(fragment, Lifecycle.State.RESUMED);
            } else {
                fragment.setUserVisibleHint(true);
            }
            this.toIntRange = fragment;
        }
    }

    /* JADX INFO: finally extract failed */
    public void finishUpdate(@NonNull ViewGroup viewGroup) {
        invalidateDrawable invalidatedrawable = this.setMax;
        if (invalidatedrawable != null) {
            if (!this.IsOverlapping) {
                try {
                    this.IsOverlapping = true;
                    invalidatedrawable.getMin();
                    this.IsOverlapping = false;
                } catch (Throwable th) {
                    this.IsOverlapping = false;
                    throw th;
                }
            }
            this.setMax = null;
        }
    }

    public boolean isViewFromObject(@NonNull View view, @NonNull Object obj) {
        return ((Fragment) obj).getView() == view;
    }

    @Nullable
    public Parcelable saveState() {
        Bundle bundle;
        if (this.getMin.size() > 0) {
            bundle = new Bundle();
            Fragment.SavedState[] savedStateArr = new Fragment.SavedState[this.getMin.size()];
            this.getMin.toArray(savedStateArr);
            bundle.putParcelableArray("states", savedStateArr);
        } else {
            bundle = null;
        }
        for (int i = 0; i < this.setMin.size(); i++) {
            Fragment fragment = this.setMin.get(i);
            if (fragment != null && fragment.isAdded()) {
                if (bundle == null) {
                    bundle = new Bundle();
                }
                this.getMax.getMin(bundle, "f".concat(String.valueOf(i)), fragment);
            }
        }
        return bundle;
    }

    public void restoreState(@Nullable Parcelable parcelable, @Nullable ClassLoader classLoader) {
        if (parcelable != null) {
            Bundle bundle = (Bundle) parcelable;
            bundle.setClassLoader(classLoader);
            Parcelable[] parcelableArray = bundle.getParcelableArray("states");
            this.getMin.clear();
            this.setMin.clear();
            if (parcelableArray != null) {
                for (Parcelable parcelable2 : parcelableArray) {
                    this.getMin.add((Fragment.SavedState) parcelable2);
                }
            }
            for (String str : bundle.keySet()) {
                if (str.startsWith("f")) {
                    int parseInt = Integer.parseInt(str.substring(1));
                    Fragment min = this.getMax.getMin(bundle, str);
                    if (min != null) {
                        while (this.setMin.size() <= parseInt) {
                            this.setMin.add((Object) null);
                        }
                        min.setMenuVisibility(false);
                        this.setMin.set(parseInt, min);
                    }
                }
            }
        }
    }
}
