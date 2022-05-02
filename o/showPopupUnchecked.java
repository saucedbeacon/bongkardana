package o;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.adapter.FragmentStateAdapter$2;
import androidx.viewpager2.adapter.FragmentStateAdapter$5;
import androidx.viewpager2.adapter.FragmentStateAdapter$FragmentMaxLifecycleEnforcer$3;
import androidx.viewpager2.widget.ViewPager2;
import o.PlaybackStateCompat;
import o.getMinimumHeight;

public abstract class showPopupUnchecked extends RecyclerView.Adapter<showPopup> implements isShowingPopup {
    private final PlaybackStateCompat.ShuffleMode<Integer> IsOverlapping;
    private boolean equals;
    final FragmentManager getMax;
    final PlaybackStateCompat.ShuffleMode<Fragment> getMin;
    private setMin isInside;
    boolean length;
    private final PlaybackStateCompat.ShuffleMode<Fragment.SavedState> setMax;
    final Lifecycle setMin;

    public long getItemId(int i) {
        return (long) i;
    }

    @NonNull
    public abstract Fragment getMin(int i);

    public /* bridge */ /* synthetic */ boolean onFailedToRecycleView(@NonNull RecyclerView.valueOf valueof) {
        return true;
    }

    public /* synthetic */ void onBindViewHolder(@NonNull RecyclerView.valueOf valueof, int i) {
        final showPopup showpopup = (showPopup) valueof;
        long itemId = showpopup.getItemId();
        int id2 = ((FrameLayout) showpopup.itemView).getId();
        Long min = setMin(id2);
        if (!(min == null || min.longValue() == itemId)) {
            setMax(min.longValue());
            this.IsOverlapping.getMin(min.longValue());
        }
        this.IsOverlapping.setMax(itemId, Integer.valueOf(id2));
        long itemId2 = getItemId(i);
        if (!this.getMin.setMin(itemId2)) {
            Fragment min2 = getMin(i);
            min2.setInitialSavedState(this.setMax.getMax(itemId2, null));
            this.getMin.setMax(itemId2, min2);
        }
        final FrameLayout frameLayout = (FrameLayout) showpopup.itemView;
        if (ViewCompat.ICustomTabsService(frameLayout)) {
            if (frameLayout.getParent() == null) {
                frameLayout.addOnLayoutChangeListener(new View.OnLayoutChangeListener() {
                    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                        if (frameLayout.getParent() != null) {
                            frameLayout.removeOnLayoutChangeListener(this);
                            showPopupUnchecked.this.getMax(showpopup);
                        }
                    }
                });
            } else {
                throw new IllegalStateException("Design assumption violated.");
            }
        }
        setMin();
    }

    public /* synthetic */ void onViewAttachedToWindow(@NonNull RecyclerView.valueOf valueof) {
        getMax((showPopup) valueof);
        setMin();
    }

    public /* synthetic */ void onViewRecycled(@NonNull RecyclerView.valueOf valueof) {
        Long min = setMin(((FrameLayout) ((showPopup) valueof).itemView).getId());
        if (min != null) {
            setMax(min.longValue());
            this.IsOverlapping.getMin(min.longValue());
        }
    }

    public showPopupUnchecked(@NonNull Fragment fragment) {
        this(fragment.getChildFragmentManager(), fragment.getLifecycle());
    }

    private showPopupUnchecked(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        this.getMin = new PlaybackStateCompat.ShuffleMode<>();
        this.setMax = new PlaybackStateCompat.ShuffleMode<>();
        this.IsOverlapping = new PlaybackStateCompat.ShuffleMode<>();
        this.length = false;
        this.equals = false;
        this.getMax = fragmentManager;
        this.setMin = lifecycle;
        super.setHasStableIds(true);
    }

    @CallSuper
    public void onAttachedToRecyclerView(@NonNull RecyclerView recyclerView) {
        if (this.isInside == null) {
            setMin setmin = new setMin();
            this.isInside = setmin;
            setmin.setMin = setMin.length(recyclerView);
            setmin.length = new ViewPager2.getMax() {
                public final void onPageScrollStateChanged(int i) {
                    setMin.this.getMax(false);
                }

                public final void onPageSelected(int i) {
                    setMin.this.getMax(false);
                }
            };
            setmin.setMin.registerOnPageChangeCallback(setmin.length);
            setmin.getMax = new getMin() {
                public final void onChanged() {
                    setMin.this.getMax(true);
                }
            };
            showPopupUnchecked.this.registerAdapterDataObserver(setmin.getMax);
            setmin.setMax = new FragmentStateAdapter$FragmentMaxLifecycleEnforcer$3(setmin);
            showPopupUnchecked.this.setMin.setMax(setmin.setMax);
            return;
        }
        throw new IllegalArgumentException();
    }

    @CallSuper
    public void onDetachedFromRecyclerView(@NonNull RecyclerView recyclerView) {
        setMin setmin = this.isInside;
        setMin.length(recyclerView).unregisterOnPageChangeCallback(setmin.length);
        showPopupUnchecked.this.unregisterAdapterDataObserver(setmin.getMax);
        showPopupUnchecked.this.setMin.length(setmin.setMax);
        setmin.setMin = null;
        this.isInside = null;
    }

    /* access modifiers changed from: package-private */
    public final void setMin() {
        if (this.equals && !getMin()) {
            MediaSessionCompat$Token<Long> mediaSessionCompat$Token = new MediaSessionCompat$Token<>();
            int i = 0;
            int i2 = 0;
            while (true) {
                PlaybackStateCompat.ShuffleMode<Fragment> shuffleMode = this.getMin;
                if (shuffleMode.getMin) {
                    shuffleMode.getMin();
                }
                if (i2 >= shuffleMode.length) {
                    break;
                }
                PlaybackStateCompat.ShuffleMode<Fragment> shuffleMode2 = this.getMin;
                if (shuffleMode2.getMin) {
                    shuffleMode2.getMin();
                }
                long j = shuffleMode2.setMax[i2];
                if (!length(j)) {
                    mediaSessionCompat$Token.add(Long.valueOf(j));
                    this.IsOverlapping.getMin(j);
                }
                i2++;
            }
            if (!this.length) {
                this.equals = false;
                while (true) {
                    PlaybackStateCompat.ShuffleMode<Fragment> shuffleMode3 = this.getMin;
                    if (shuffleMode3.getMin) {
                        shuffleMode3.getMin();
                    }
                    if (i >= shuffleMode3.length) {
                        break;
                    }
                    PlaybackStateCompat.ShuffleMode<Fragment> shuffleMode4 = this.getMin;
                    if (shuffleMode4.getMin) {
                        shuffleMode4.getMin();
                    }
                    long j2 = shuffleMode4.setMax[i];
                    if (!setMin(j2)) {
                        mediaSessionCompat$Token.add(Long.valueOf(j2));
                    }
                    i++;
                }
            }
            for (Long longValue : mediaSessionCompat$Token) {
                setMax(longValue.longValue());
            }
        }
    }

    private boolean setMin(long j) {
        View view;
        if (this.IsOverlapping.setMin(j)) {
            return true;
        }
        Fragment max = this.getMin.getMax(j, null);
        if (max == null || (view = max.getView()) == null || view.getParent() == null) {
            return false;
        }
        return true;
    }

    private Long setMin(int i) {
        Long l = null;
        int i2 = 0;
        while (true) {
            PlaybackStateCompat.ShuffleMode<Integer> shuffleMode = this.IsOverlapping;
            if (shuffleMode.getMin) {
                shuffleMode.getMin();
            }
            if (i2 >= shuffleMode.length) {
                return l;
            }
            PlaybackStateCompat.ShuffleMode<Integer> shuffleMode2 = this.IsOverlapping;
            if (shuffleMode2.getMin) {
                shuffleMode2.getMin();
            }
            if (((Integer) shuffleMode2.setMin[i2]).intValue() == i) {
                if (l == null) {
                    l = Long.valueOf(this.IsOverlapping.setMin(i2));
                } else {
                    throw new IllegalStateException("Design assumption violated: a ViewHolder can only be bound to one item at a time.");
                }
            }
            i2++;
        }
    }

    public final void getMax(@NonNull showPopup showpopup) {
        final Fragment max = this.getMin.getMax(showpopup.getItemId(), null);
        if (max != null) {
            final FrameLayout frameLayout = (FrameLayout) showpopup.itemView;
            View view = max.getView();
            if (!max.isAdded() && view != null) {
                throw new IllegalStateException("Design assumption violated.");
            } else if (max.isAdded() && view == null) {
                this.getMax.equals.setMin.add(new getMinimumHeight.length(new FragmentManager.setMax() {
                    public final void getMin(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment, @NonNull View view) {
                        if (fragment == max) {
                            getMinimumHeight getminimumheight = fragmentManager.equals;
                            synchronized (getminimumheight.setMin) {
                                int i = 0;
                                int size = getminimumheight.setMin.size();
                                while (true) {
                                    if (i >= size) {
                                        break;
                                    } else if (getminimumheight.setMin.get(i).setMin == this) {
                                        getminimumheight.setMin.remove(i);
                                        break;
                                    } else {
                                        i++;
                                    }
                                }
                            }
                            showPopupUnchecked.setMin(view, frameLayout);
                        }
                    }
                }));
            } else if (!max.isAdded() || view.getParent() == null) {
                if (max.isAdded()) {
                    setMin(view, frameLayout);
                } else if (!getMin()) {
                    this.getMax.equals.setMin.add(new getMinimumHeight.length(new FragmentManager.setMax() {
                        public final void getMin(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment, @NonNull View view) {
                            if (fragment == max) {
                                getMinimumHeight getminimumheight = fragmentManager.equals;
                                synchronized (getminimumheight.setMin) {
                                    int i = 0;
                                    int size = getminimumheight.setMin.size();
                                    while (true) {
                                        if (i >= size) {
                                            break;
                                        } else if (getminimumheight.setMin.get(i).setMin == this) {
                                            getminimumheight.setMin.remove(i);
                                            break;
                                        } else {
                                            i++;
                                        }
                                    }
                                }
                                showPopupUnchecked.setMin(view, frameLayout);
                            }
                        }
                    }));
                    setColorFilter setcolorfilter = new setColorFilter(this.getMax);
                    StringBuilder sb = new StringBuilder("f");
                    sb.append(showpopup.getItemId());
                    setcolorfilter.length(0, max, sb.toString(), 1);
                    setcolorfilter.getMax(max, Lifecycle.State.STARTED).setMax();
                    this.isInside.getMax(false);
                } else if (!this.getMax.setMin()) {
                    this.setMin.setMax(new FragmentStateAdapter$2(this, showpopup));
                }
            } else if (view.getParent() != frameLayout) {
                setMin(view, frameLayout);
            }
        } else {
            throw new IllegalStateException("Design assumption violated.");
        }
    }

    static void setMin(@NonNull View view, @NonNull FrameLayout frameLayout) {
        if (frameLayout.getChildCount() > 1) {
            throw new IllegalStateException("Design assumption violated.");
        } else if (view.getParent() != frameLayout) {
            if (frameLayout.getChildCount() > 0) {
                frameLayout.removeAllViews();
            }
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            frameLayout.addView(view);
        }
    }

    private void setMax(long j) {
        ViewParent parent;
        Fragment max = this.getMin.getMax(j, null);
        if (max != null) {
            if (!(max.getView() == null || (parent = max.getView().getParent()) == null)) {
                ((FrameLayout) parent).removeAllViews();
            }
            if (!length(j)) {
                this.setMax.getMin(j);
            }
            if (!max.isAdded()) {
                this.getMin.getMin(j);
            } else if (getMin()) {
                this.equals = true;
            } else {
                if (max.isAdded() && length(j)) {
                    this.setMax.setMax(j, this.getMax.toFloatRange(max));
                }
                new setColorFilter(this.getMax).length(max).setMax();
                this.getMin.getMin(j);
            }
        }
    }

    public final boolean getMin() {
        return this.getMax.IsOverlapping();
    }

    private boolean length(long j) {
        return j >= 0 && j < ((long) getItemCount());
    }

    public final void setHasStableIds(boolean z) {
        throw new UnsupportedOperationException("Stable Ids are required for the adapter to function properly, and the adapter takes care of setting the flag.");
    }

    @NonNull
    public final Parcelable getMax() {
        Bundle bundle = new Bundle(this.getMin.length() + this.setMax.length());
        for (int i = 0; i < this.getMin.length(); i++) {
            long min = this.getMin.setMin(i);
            Fragment max = this.getMin.getMax(min, null);
            if (max != null && max.isAdded()) {
                StringBuilder sb = new StringBuilder();
                sb.append("f#");
                sb.append(min);
                this.getMax.getMin(bundle, sb.toString(), max);
            }
        }
        for (int i2 = 0; i2 < this.setMax.length(); i2++) {
            long min2 = this.setMax.setMin(i2);
            if (length(min2)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("s#");
                sb2.append(min2);
                bundle.putParcelable(sb2.toString(), this.setMax.getMax(min2, null));
            }
        }
        return bundle;
    }

    public final void getMax(@NonNull Parcelable parcelable) {
        if (!this.setMax.getMax() || !this.getMin.getMax()) {
            throw new IllegalStateException("Expected the adapter to be 'fresh' while restoring state.");
        }
        Bundle bundle = (Bundle) parcelable;
        if (bundle.getClassLoader() == null) {
            bundle.setClassLoader(getClass().getClassLoader());
        }
        for (String str : bundle.keySet()) {
            if (length(str, "f#")) {
                this.getMin.setMax(Long.parseLong(str.substring(2)), this.getMax.getMin(bundle, str));
            } else if (length(str, "s#")) {
                long parseLong = Long.parseLong(str.substring(2));
                Fragment.SavedState savedState = (Fragment.SavedState) bundle.getParcelable(str);
                if (length(parseLong)) {
                    this.setMax.setMax(parseLong, savedState);
                }
            } else {
                throw new IllegalArgumentException("Unexpected key in savedState: ".concat(String.valueOf(str)));
            }
        }
        if (!this.getMin.getMax()) {
            this.equals = true;
            this.length = true;
            setMin();
            Handler handler = new Handler(Looper.getMainLooper());
            AnonymousClass1 r0 = new Runnable() {
                public final void run() {
                    showPopupUnchecked.this.length = false;
                    showPopupUnchecked.this.setMin();
                }
            };
            this.setMin.setMax(new FragmentStateAdapter$5(this, handler, r0));
            handler.postDelayed(r0, 10000);
        }
    }

    private static boolean length(@NonNull String str, @NonNull String str2) {
        return str.startsWith(str2) && str.length() > str2.length();
    }

    public class setMin {
        private long equals = -1;
        RecyclerView.setMin getMax;
        ViewPager2.getMax length;
        setPopupCallback setMax;
        ViewPager2 setMin;

        setMin() {
        }

        public final void getMax(boolean z) {
            int currentItem;
            if (!showPopupUnchecked.this.getMin() && this.setMin.getScrollState() == 0 && !showPopupUnchecked.this.getMin.getMax() && showPopupUnchecked.this.getItemCount() != 0 && (currentItem = this.setMin.getCurrentItem()) < showPopupUnchecked.this.getItemCount()) {
                long itemId = showPopupUnchecked.this.getItemId(currentItem);
                if (itemId != this.equals || z) {
                    Fragment fragment = null;
                    Fragment max = showPopupUnchecked.this.getMin.getMax(itemId, null);
                    if (max != null && max.isAdded()) {
                        this.equals = itemId;
                        setColorFilter setcolorfilter = new setColorFilter(showPopupUnchecked.this.getMax);
                        int i = 0;
                        while (true) {
                            PlaybackStateCompat.ShuffleMode<Fragment> shuffleMode = showPopupUnchecked.this.getMin;
                            if (shuffleMode.getMin) {
                                shuffleMode.getMin();
                            }
                            if (i >= shuffleMode.length) {
                                break;
                            }
                            PlaybackStateCompat.ShuffleMode<Fragment> shuffleMode2 = showPopupUnchecked.this.getMin;
                            if (shuffleMode2.getMin) {
                                shuffleMode2.getMin();
                            }
                            long j = shuffleMode2.setMax[i];
                            PlaybackStateCompat.ShuffleMode<Fragment> shuffleMode3 = showPopupUnchecked.this.getMin;
                            if (shuffleMode3.getMin) {
                                shuffleMode3.getMin();
                            }
                            Fragment fragment2 = (Fragment) shuffleMode3.setMin[i];
                            if (fragment2.isAdded()) {
                                if (j != this.equals) {
                                    setcolorfilter.getMax(fragment2, Lifecycle.State.STARTED);
                                } else {
                                    fragment = fragment2;
                                }
                                fragment2.setMenuVisibility(j == this.equals);
                            }
                            i++;
                        }
                        if (fragment != null) {
                            setcolorfilter.getMax(fragment, Lifecycle.State.RESUMED);
                        }
                        if (!setcolorfilter.toIntRange()) {
                            setcolorfilter.setMax();
                        }
                    }
                }
            }
        }

        @NonNull
        static ViewPager2 length(@NonNull RecyclerView recyclerView) {
            ViewParent parent = recyclerView.getParent();
            if (parent instanceof ViewPager2) {
                return (ViewPager2) parent;
            }
            throw new IllegalStateException("Expected ViewPager2 instance. Got: ".concat(String.valueOf(parent)));
        }
    }

    static abstract class getMin extends RecyclerView.setMin {
        private getMin() {
        }

        /* synthetic */ getMin(byte b) {
            this();
        }

        public final void onItemRangeChanged(int i, int i2) {
            onChanged();
        }

        public final void onItemRangeChanged(int i, int i2, @Nullable Object obj) {
            onChanged();
        }

        public final void onItemRangeInserted(int i, int i2) {
            onChanged();
        }

        public final void onItemRangeRemoved(int i, int i2) {
            onChanged();
        }

        public final void onItemRangeMoved(int i, int i2, int i3) {
            onChanged();
        }
    }

    @NonNull
    public /* synthetic */ RecyclerView.valueOf onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return showPopup.getMin(viewGroup);
    }
}
