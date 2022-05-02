package o;

import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import o.invalidateDrawable;

@Deprecated
public abstract class getIntrinsicHeight extends setExpandActivityOverflowButtonDrawable {
    private final int getMax;
    private Fragment getMin;
    private final FragmentManager length;
    private invalidateDrawable setMax;
    private boolean setMin;

    @NonNull
    public abstract Fragment length(int i);

    public void restoreState(@Nullable Parcelable parcelable, @Nullable ClassLoader classLoader) {
    }

    @Nullable
    public Parcelable saveState() {
        return null;
    }

    @Deprecated
    public getIntrinsicHeight(@NonNull FragmentManager fragmentManager) {
        this(fragmentManager, (byte) 0);
    }

    private getIntrinsicHeight(@NonNull FragmentManager fragmentManager, byte b) {
        this.setMax = null;
        this.getMin = null;
        this.length = fragmentManager;
        this.getMax = 0;
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
        if (this.setMax == null) {
            this.setMax = new setColorFilter(this.length);
        }
        long j = (long) i;
        int id2 = viewGroup.getId();
        StringBuilder sb = new StringBuilder("android:switcher:");
        sb.append(id2);
        sb.append(":");
        sb.append(j);
        Fragment findFragmentByTag = this.length.findFragmentByTag(sb.toString());
        if (findFragmentByTag != null) {
            this.setMax.getMin(new invalidateDrawable.length(7, findFragmentByTag));
        } else {
            findFragmentByTag = length(i);
            invalidateDrawable invalidatedrawable = this.setMax;
            int id3 = viewGroup.getId();
            int id4 = viewGroup.getId();
            StringBuilder sb2 = new StringBuilder("android:switcher:");
            sb2.append(id4);
            sb2.append(":");
            sb2.append(j);
            invalidatedrawable.length(id3, findFragmentByTag, sb2.toString(), 1);
        }
        if (findFragmentByTag != this.getMin) {
            findFragmentByTag.setMenuVisibility(false);
            if (this.getMax == 1) {
                this.setMax.getMax(findFragmentByTag, Lifecycle.State.STARTED);
            } else {
                findFragmentByTag.setUserVisibleHint(false);
            }
        }
        return findFragmentByTag;
    }

    public void destroyItem(@NonNull ViewGroup viewGroup, int i, @NonNull Object obj) {
        Fragment fragment = (Fragment) obj;
        if (this.setMax == null) {
            this.setMax = new setColorFilter(this.length);
        }
        this.setMax.getMin(fragment);
        if (fragment.equals(this.getMin)) {
            this.getMin = null;
        }
    }

    public void setPrimaryItem(@NonNull ViewGroup viewGroup, int i, @NonNull Object obj) {
        Fragment fragment = (Fragment) obj;
        Fragment fragment2 = this.getMin;
        if (fragment != fragment2) {
            if (fragment2 != null) {
                fragment2.setMenuVisibility(false);
                if (this.getMax == 1) {
                    if (this.setMax == null) {
                        this.setMax = new setColorFilter(this.length);
                    }
                    this.setMax.getMax(this.getMin, Lifecycle.State.STARTED);
                } else {
                    this.getMin.setUserVisibleHint(false);
                }
            }
            fragment.setMenuVisibility(true);
            if (this.getMax == 1) {
                if (this.setMax == null) {
                    this.setMax = new setColorFilter(this.length);
                }
                this.setMax.getMax(fragment, Lifecycle.State.RESUMED);
            } else {
                fragment.setUserVisibleHint(true);
            }
            this.getMin = fragment;
        }
    }

    /* JADX INFO: finally extract failed */
    public void finishUpdate(@NonNull ViewGroup viewGroup) {
        invalidateDrawable invalidatedrawable = this.setMax;
        if (invalidatedrawable != null) {
            if (!this.setMin) {
                try {
                    this.setMin = true;
                    invalidatedrawable.getMin();
                    this.setMin = false;
                } catch (Throwable th) {
                    this.setMin = false;
                    throw th;
                }
            }
            this.setMax = null;
        }
    }

    public boolean isViewFromObject(@NonNull View view, @NonNull Object obj) {
        return ((Fragment) obj).getView() == view;
    }
}
