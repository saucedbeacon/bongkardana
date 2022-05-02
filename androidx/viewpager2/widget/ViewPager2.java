package androidx.viewpager2.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$Mean$Arithmetic;
import com.google.android.material.badge.BadgeDrawable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import o.ActionMenuView;
import o.getDataModel;
import o.getListPopupWindow;
import o.isShowingPopup;
import o.onItemsChanged;
import o.onSupportActionModeFinished;
import o.setInitialActivityCount;
import o.setProvider;
import o.setSupportProgressBarIndeterminateVisibility;

public final class ViewPager2 extends ViewGroup {
    public static final int OFFSCREEN_PAGE_LIMIT_DEFAULT = -1;
    public static final int ORIENTATION_HORIZONTAL = 0;
    public static final int ORIENTATION_VERTICAL = 1;
    public static final int SCROLL_STATE_DRAGGING = 1;
    public static final int SCROLL_STATE_IDLE = 0;
    public static final int SCROLL_STATE_SETTLING = 2;
    static boolean sFeatureEnhancedA11yEnabled = true;
    private boolean FastBitmap$CoordinateSystem = false;
    private int IsOverlapping = -1;
    private onItemsChanged equals;
    private LinearLayoutManager getMax;
    private RecyclerView.setMin getMin = new setMax() {
        public final void onChanged() {
            ViewPager2.this.mCurrentItemDirty = true;
            ViewPager2.this.mScrollEventAdapter.toIntRange = true;
        }
    };
    private boolean hashCode = true;
    private getDataModel isInside;
    private setProvider length = new setProvider();
    length mAccessibilityProvider;
    int mCurrentItem;
    boolean mCurrentItemDirty = false;
    public RecyclerView mRecyclerView;
    setInitialActivityCount mScrollEventAdapter;
    private final Rect setMax = new Rect();
    private final Rect setMin = new Rect();
    private int toDoubleRange = -1;
    private Parcelable toFloatRange;
    private setProvider toIntRange;
    private getListPopupWindow toString;
    private RecyclerView.ItemAnimator values = null;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @IntRange(from = 1)
    @Retention(RetentionPolicy.SOURCE)
    public @interface OffscreenPageLimit {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    public @interface Orientation {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    public @interface ScrollState {
    }

    public static abstract class getMax {
        public void onPageScrollStateChanged(int i) {
        }

        public void onPageScrolled(int i, float f, @Px int i2) {
        }

        public void onPageSelected(int i) {
        }
    }

    public interface toFloatRange {
    }

    public ViewPager2(@NonNull Context context) {
        super(context);
        length(context, (AttributeSet) null);
    }

    public ViewPager2(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        length(context, attributeSet);
    }

    public ViewPager2(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        length(context, attributeSet);
    }

    @RequiresApi(21)
    public ViewPager2(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        length(context, attributeSet);
    }

    private void length(Context context, AttributeSet attributeSet) {
        this.mAccessibilityProvider = sFeatureEnhancedA11yEnabled ? new IsOverlapping() : new getMin();
        toIntRange tointrange = new toIntRange(context);
        this.mRecyclerView = tointrange;
        tointrange.setId(ViewCompat.getMin());
        this.mRecyclerView.setDescendantFocusability(131072);
        setMin setmin = new setMin(context);
        this.getMax = setmin;
        this.mRecyclerView.setLayoutManager(setmin);
        this.mRecyclerView.setScrollingTouchSlop(1);
        setMin(context, attributeSet);
        this.mRecyclerView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.mRecyclerView.addOnChildAttachStateChangeListener(new RecyclerView.isInside() {
            public final void getMin(@NonNull View view) {
                RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
                if (layoutParams.width != -1 || layoutParams.height != -1) {
                    throw new IllegalStateException("Pages must fill the whole ViewPager2 (use match_parent)");
                }
            }
        });
        setInitialActivityCount setinitialactivitycount = new setInitialActivityCount(this);
        this.mScrollEventAdapter = setinitialactivitycount;
        this.isInside = new getDataModel(this, setinitialactivitycount, this.mRecyclerView);
        equals equals2 = new equals();
        this.equals = equals2;
        equals2.setMax(this.mRecyclerView);
        this.mRecyclerView.addOnScrollListener(this.mScrollEventAdapter);
        setProvider setprovider = new setProvider();
        this.toIntRange = setprovider;
        this.mScrollEventAdapter.setMax = setprovider;
        AnonymousClass4 r3 = new getMax() {
            public final void onPageSelected(int i) {
                if (ViewPager2.this.mCurrentItem != i) {
                    ViewPager2.this.mCurrentItem = i;
                    ViewPager2.this.mAccessibilityProvider.getMax();
                }
            }

            public final void onPageScrollStateChanged(int i) {
                if (i == 0) {
                    ViewPager2.this.updateCurrentItem();
                }
            }
        };
        AnonymousClass5 r4 = new getMax() {
            public final void onPageSelected(int i) {
                ViewPager2.this.clearFocus();
                if (ViewPager2.this.hasFocus()) {
                    ViewPager2.this.mRecyclerView.requestFocus(2);
                }
            }
        };
        this.toIntRange.setMin.add(r3);
        this.toIntRange.setMin.add(r4);
        this.mAccessibilityProvider.getMin(this.mRecyclerView);
        this.toIntRange.setMin.add(this.length);
        getListPopupWindow getlistpopupwindow = new getListPopupWindow(this.getMax);
        this.toString = getlistpopupwindow;
        this.toIntRange.setMin.add(getlistpopupwindow);
        RecyclerView recyclerView = this.mRecyclerView;
        attachViewToParent(recyclerView, 0, recyclerView.getLayoutParams());
    }

    @RequiresApi(23)
    public final CharSequence getAccessibilityClassName() {
        if (this.mAccessibilityProvider.getMin()) {
            return this.mAccessibilityProvider.setMax();
        }
        return super.getAccessibilityClassName();
    }

    private void setMin(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ActionMenuView.LayoutParams.getMin.IsOverlapping);
        if (Build.VERSION.SDK_INT >= 29) {
            saveAttributeDataForStyleable(context, ActionMenuView.LayoutParams.getMin.IsOverlapping, attributeSet, obtainStyledAttributes, 0, 0);
        }
        try {
            setOrientation(obtainStyledAttributes.getInt(ActionMenuView.LayoutParams.getMin.equals, 0));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* access modifiers changed from: protected */
    @Nullable
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.setMax = this.mRecyclerView.getId();
        int i = this.IsOverlapping;
        if (i == -1) {
            i = this.mCurrentItem;
        }
        savedState.setMin = i;
        Parcelable parcelable = this.toFloatRange;
        if (parcelable != null) {
            savedState.length = parcelable;
        } else {
            RecyclerView.Adapter adapter = this.mRecyclerView.getAdapter();
            if (adapter instanceof isShowingPopup) {
                savedState.length = ((isShowingPopup) adapter).getMax();
            }
        }
        return savedState;
    }

    /* access modifiers changed from: protected */
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.IsOverlapping = savedState.setMin;
        this.toFloatRange = savedState.length;
    }

    private void length() {
        RecyclerView.Adapter adapter;
        if (this.IsOverlapping != -1 && (adapter = getAdapter()) != null) {
            Parcelable parcelable = this.toFloatRange;
            if (parcelable != null) {
                if (adapter instanceof isShowingPopup) {
                    ((isShowingPopup) adapter).getMax(parcelable);
                }
                this.toFloatRange = null;
            }
            int max = Math.max(0, Math.min(this.IsOverlapping, adapter.getItemCount() - 1));
            this.mCurrentItem = max;
            this.IsOverlapping = -1;
            this.mRecyclerView.scrollToPosition(max);
            this.mAccessibilityProvider.length();
        }
    }

    /* access modifiers changed from: protected */
    public final void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        Parcelable parcelable = sparseArray.get(getId());
        if (parcelable instanceof SavedState) {
            int i = ((SavedState) parcelable).setMax;
            sparseArray.put(this.mRecyclerView.getId(), sparseArray.get(i));
            sparseArray.remove(i);
        }
        super.dispatchRestoreInstanceState(sparseArray);
        length();
    }

    static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() {
            public final /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return Build.VERSION.SDK_INT >= 24 ? new SavedState(parcel, classLoader) : new SavedState(parcel);
            }

            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new SavedState[i];
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return Build.VERSION.SDK_INT >= 24 ? new SavedState(parcel, (ClassLoader) null) : new SavedState(parcel);
            }
        };
        Parcelable length;
        int setMax;
        int setMin;

        @RequiresApi(24)
        SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.setMax = parcel.readInt();
            this.setMin = parcel.readInt();
            this.length = parcel.readParcelable(classLoader);
        }

        SavedState(Parcel parcel) {
            super(parcel);
            this.setMax = parcel.readInt();
            this.setMin = parcel.readInt();
            this.length = parcel.readParcelable((ClassLoader) null);
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.setMax);
            parcel.writeInt(this.setMin);
            parcel.writeParcelable(this.length, i);
        }
    }

    public final void setAdapter(@Nullable RecyclerView.Adapter adapter) {
        RecyclerView.Adapter adapter2 = this.mRecyclerView.getAdapter();
        this.mAccessibilityProvider.setMax((RecyclerView.Adapter<?>) adapter2);
        if (adapter2 != null) {
            adapter2.unregisterAdapterDataObserver(this.getMin);
        }
        this.mRecyclerView.setAdapter(adapter);
        this.mCurrentItem = 0;
        length();
        this.mAccessibilityProvider.getMin((RecyclerView.Adapter<?>) adapter);
        if (adapter != null) {
            adapter.registerAdapterDataObserver(this.getMin);
        }
    }

    @Nullable
    public final RecyclerView.Adapter getAdapter() {
        return this.mRecyclerView.getAdapter();
    }

    public final void onViewAdded(View view) {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" does not support direct child views");
        throw new IllegalStateException(sb.toString());
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        measureChild(this.mRecyclerView, i, i2);
        int measuredWidth = this.mRecyclerView.getMeasuredWidth();
        int measuredHeight = this.mRecyclerView.getMeasuredHeight();
        int measuredState = this.mRecyclerView.getMeasuredState();
        int paddingLeft = measuredWidth + getPaddingLeft() + getPaddingRight();
        int paddingTop = measuredHeight + getPaddingTop() + getPaddingBottom();
        setMeasuredDimension(resolveSizeAndState(Math.max(paddingLeft, getSuggestedMinimumWidth()), i, measuredState), resolveSizeAndState(Math.max(paddingTop, getSuggestedMinimumHeight()), i2, measuredState << 16));
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = this.mRecyclerView.getMeasuredWidth();
        int measuredHeight = this.mRecyclerView.getMeasuredHeight();
        this.setMin.left = getPaddingLeft();
        this.setMin.right = (i3 - i) - getPaddingRight();
        this.setMin.top = getPaddingTop();
        this.setMin.bottom = (i4 - i2) - getPaddingBottom();
        Gravity.apply(BadgeDrawable.TOP_START, measuredWidth, measuredHeight, this.setMin, this.setMax);
        this.mRecyclerView.layout(this.setMax.left, this.setMax.top, this.setMax.right, this.setMax.bottom);
        if (this.mCurrentItemDirty) {
            updateCurrentItem();
        }
    }

    /* access modifiers changed from: package-private */
    public final void updateCurrentItem() {
        onItemsChanged onitemschanged = this.equals;
        if (onitemschanged != null) {
            View max = onitemschanged.getMax(this.getMax);
            if (max != null) {
                int position = this.getMax.getPosition(max);
                if (position != this.mCurrentItem && getScrollState() == 0) {
                    this.toIntRange.onPageSelected(position);
                }
                this.mCurrentItemDirty = false;
                return;
            }
            return;
        }
        throw new IllegalStateException("Design assumption violated.");
    }

    /* access modifiers changed from: package-private */
    public final int getPageSize() {
        int height;
        int paddingBottom;
        RecyclerView recyclerView = this.mRecyclerView;
        if (getOrientation() == 0) {
            height = recyclerView.getWidth() - recyclerView.getPaddingLeft();
            paddingBottom = recyclerView.getPaddingRight();
        } else {
            height = recyclerView.getHeight() - recyclerView.getPaddingTop();
            paddingBottom = recyclerView.getPaddingBottom();
        }
        return height - paddingBottom;
    }

    public final void setOrientation(int i) {
        this.getMax.setOrientation(i);
        this.mAccessibilityProvider.setMin();
    }

    public final int getOrientation() {
        return this.getMax.getOrientation();
    }

    public final boolean isRtl() {
        return this.getMax.getLayoutDirection() == 1;
    }

    public final void setCurrentItem(int i) {
        setCurrentItem(i, true);
    }

    public final void setCurrentItem(int i, boolean z) {
        if (!isFakeDragging()) {
            setCurrentItemInternal(i, z);
            return;
        }
        throw new IllegalStateException("Cannot change current item when ViewPager2 is fake dragging");
    }

    /* access modifiers changed from: package-private */
    public final void setCurrentItemInternal(int i, boolean z) {
        RecyclerView.Adapter adapter = getAdapter();
        boolean z2 = false;
        if (adapter == null) {
            if (this.IsOverlapping != -1) {
                this.IsOverlapping = Math.max(i, 0);
            }
        } else if (adapter.getItemCount() > 0) {
            int min = Math.min(Math.max(i, 0), adapter.getItemCount() - 1);
            if (min == this.mCurrentItem && this.mScrollEventAdapter.setMax()) {
                return;
            }
            if (min != this.mCurrentItem || !z) {
                double d = (double) this.mCurrentItem;
                this.mCurrentItem = min;
                this.mAccessibilityProvider.getMax();
                if (!this.mScrollEventAdapter.setMax()) {
                    setInitialActivityCount setinitialactivitycount = this.mScrollEventAdapter;
                    setinitialactivitycount.getMax();
                    double d2 = (double) setinitialactivitycount.getMin.length;
                    double d3 = (double) setinitialactivitycount.getMin.getMax;
                    Double.isNaN(d2);
                    Double.isNaN(d3);
                    d = d2 + d3;
                }
                setInitialActivityCount setinitialactivitycount2 = this.mScrollEventAdapter;
                setinitialactivitycount2.setMin = z ? 2 : 3;
                setinitialactivitycount2.toFloatRange = false;
                if (setinitialactivitycount2.IsOverlapping != min) {
                    z2 = true;
                }
                setinitialactivitycount2.IsOverlapping = min;
                setinitialactivitycount2.setMax(2);
                if (z2 && setinitialactivitycount2.setMax != null) {
                    setinitialactivitycount2.setMax.onPageSelected(min);
                }
                if (!z) {
                    this.mRecyclerView.scrollToPosition(min);
                    return;
                }
                double d4 = (double) min;
                Double.isNaN(d4);
                if (Math.abs(d4 - d) > 3.0d) {
                    this.mRecyclerView.scrollToPosition(d4 > d ? min - 3 : min + 3);
                    RecyclerView recyclerView = this.mRecyclerView;
                    recyclerView.post(new isInside(min, recyclerView));
                    return;
                }
                this.mRecyclerView.smoothScrollToPosition(min);
            }
        }
    }

    public final int getCurrentItem() {
        return this.mCurrentItem;
    }

    public final int getScrollState() {
        return this.mScrollEventAdapter.getMax;
    }

    public final boolean beginFakeDrag() {
        return this.isInside.setMax();
    }

    public final boolean fakeDragBy(@Px @SuppressLint({"SupportAnnotationUsage"}) float f) {
        return this.isInside.setMin(f);
    }

    public final boolean endFakeDrag() {
        return this.isInside.getMax();
    }

    public final boolean isFakeDragging() {
        return this.isInside.setMin();
    }

    public final void snapToPage() {
        View max = this.equals.getMax(this.getMax);
        if (max != null) {
            int[] min = this.equals.setMin(this.getMax, max);
            if (min[0] != 0 || min[1] != 0) {
                this.mRecyclerView.smoothScrollBy(min[0], min[1]);
            }
        }
    }

    public final void setUserInputEnabled(boolean z) {
        this.hashCode = z;
        this.mAccessibilityProvider.IsOverlapping();
    }

    public final boolean isUserInputEnabled() {
        return this.hashCode;
    }

    public final void setOffscreenPageLimit(int i) {
        if (i > 0 || i == -1) {
            this.toDoubleRange = i;
            this.mRecyclerView.requestLayout();
            return;
        }
        throw new IllegalArgumentException("Offscreen page limit must be OFFSCREEN_PAGE_LIMIT_DEFAULT or a number > 0");
    }

    public final int getOffscreenPageLimit() {
        return this.toDoubleRange;
    }

    public final boolean canScrollHorizontally(int i) {
        return this.mRecyclerView.canScrollHorizontally(i);
    }

    public final boolean canScrollVertically(int i) {
        return this.mRecyclerView.canScrollVertically(i);
    }

    public final void registerOnPageChangeCallback(@NonNull getMax getmax) {
        this.length.setMin.add(getmax);
    }

    public final void unregisterOnPageChangeCallback(@NonNull getMax getmax) {
        this.length.setMin.remove(getmax);
    }

    public final void setPageTransformer(@Nullable toFloatRange tofloatrange) {
        if (tofloatrange != null) {
            if (!this.FastBitmap$CoordinateSystem) {
                this.values = this.mRecyclerView.getItemAnimator();
                this.FastBitmap$CoordinateSystem = true;
            }
            this.mRecyclerView.setItemAnimator((RecyclerView.ItemAnimator) null);
        } else if (this.FastBitmap$CoordinateSystem) {
            this.mRecyclerView.setItemAnimator(this.values);
            this.values = null;
            this.FastBitmap$CoordinateSystem = false;
        }
        if (tofloatrange != this.toString.setMin) {
            this.toString.setMin = tofloatrange;
            requestTransform();
        }
    }

    public final void requestTransform() {
        if (this.toString.setMin != null) {
            setInitialActivityCount setinitialactivitycount = this.mScrollEventAdapter;
            setinitialactivitycount.getMax();
            double d = (double) setinitialactivitycount.getMin.length;
            double d2 = (double) setinitialactivitycount.getMin.getMax;
            Double.isNaN(d);
            Double.isNaN(d2);
            double d3 = d + d2;
            int i = (int) d3;
            double d4 = (double) i;
            Double.isNaN(d4);
            float f = (float) (d3 - d4);
            this.toString.onPageScrolled(i, f, Math.round(((float) getPageSize()) * f));
        }
    }

    @RequiresApi(17)
    public final void setLayoutDirection(int i) {
        super.setLayoutDirection(i);
        this.mAccessibilityProvider.toIntRange();
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.mAccessibilityProvider.length(accessibilityNodeInfo);
    }

    @RequiresApi(16)
    public final boolean performAccessibilityAction(int i, Bundle bundle) {
        if (this.mAccessibilityProvider.length(i)) {
            return this.mAccessibilityProvider.getMin(i);
        }
        return super.performAccessibilityAction(i, bundle);
    }

    class toIntRange extends RecyclerView {
        toIntRange(@NonNull Context context) {
            super(context);
        }

        @RequiresApi(23)
        public final CharSequence getAccessibilityClassName() {
            if (ViewPager2.this.mAccessibilityProvider.toFloatRange()) {
                return ViewPager2.this.mAccessibilityProvider.isInside();
            }
            return super.getAccessibilityClassName();
        }

        public final void onInitializeAccessibilityEvent(@NonNull AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setFromIndex(ViewPager2.this.mCurrentItem);
            accessibilityEvent.setToIndex(ViewPager2.this.mCurrentItem);
            ViewPager2.this.mAccessibilityProvider.getMax(accessibilityEvent);
        }

        @SuppressLint({"ClickableViewAccessibility"})
        public final boolean onTouchEvent(MotionEvent motionEvent) {
            return ViewPager2.this.isUserInputEnabled() && super.onTouchEvent(motionEvent);
        }

        public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            return ViewPager2.this.isUserInputEnabled() && super.onInterceptTouchEvent(motionEvent);
        }
    }

    class setMin extends LinearLayoutManager {
        public final boolean requestChildRectangleOnScreen(@NonNull RecyclerView recyclerView, @NonNull View view, @NonNull Rect rect, boolean z, boolean z2) {
            return false;
        }

        setMin(Context context) {
            super(context);
        }

        public final boolean performAccessibilityAction(@NonNull RecyclerView.toDoubleRange todoublerange, @NonNull RecyclerView$Mean$Arithmetic recyclerView$Mean$Arithmetic, int i, @Nullable Bundle bundle) {
            if (ViewPager2.this.mAccessibilityProvider.getMax(i)) {
                return ViewPager2.this.mAccessibilityProvider.setMax(i);
            }
            return super.performAccessibilityAction(todoublerange, recyclerView$Mean$Arithmetic, i, bundle);
        }

        public final void onInitializeAccessibilityNodeInfo(@NonNull RecyclerView.toDoubleRange todoublerange, @NonNull RecyclerView$Mean$Arithmetic recyclerView$Mean$Arithmetic, @NonNull onSupportActionModeFinished onsupportactionmodefinished) {
            super.onInitializeAccessibilityNodeInfo(todoublerange, recyclerView$Mean$Arithmetic, onsupportactionmodefinished);
            ViewPager2.this.mAccessibilityProvider.getMax(onsupportactionmodefinished);
        }

        public final void calculateExtraLayoutSpace(@NonNull RecyclerView$Mean$Arithmetic recyclerView$Mean$Arithmetic, @NonNull int[] iArr) {
            int offscreenPageLimit = ViewPager2.this.getOffscreenPageLimit();
            if (offscreenPageLimit == -1) {
                super.calculateExtraLayoutSpace(recyclerView$Mean$Arithmetic, iArr);
                return;
            }
            int pageSize = ViewPager2.this.getPageSize() * offscreenPageLimit;
            iArr[0] = pageSize;
            iArr[1] = pageSize;
        }
    }

    class equals extends onItemsChanged {
        equals() {
        }

        @Nullable
        public final View getMax(RecyclerView.IsOverlapping isOverlapping) {
            if (ViewPager2.this.isFakeDragging()) {
                return null;
            }
            return super.getMax(isOverlapping);
        }
    }

    static class isInside implements Runnable {
        private final int getMax;
        private final RecyclerView length;

        isInside(int i, RecyclerView recyclerView) {
            this.getMax = i;
            this.length = recyclerView;
        }

        public final void run() {
            this.length.smoothScrollToPosition(this.getMax);
        }
    }

    public final void addItemDecoration(@NonNull RecyclerView.getMax getmax) {
        this.mRecyclerView.addItemDecoration(getmax);
    }

    public final void addItemDecoration(@NonNull RecyclerView.getMax getmax, int i) {
        this.mRecyclerView.addItemDecoration(getmax, i);
    }

    @NonNull
    public final RecyclerView.getMax getItemDecorationAt(int i) {
        return this.mRecyclerView.getItemDecorationAt(i);
    }

    public final int getItemDecorationCount() {
        return this.mRecyclerView.getItemDecorationCount();
    }

    public final void invalidateItemDecorations() {
        this.mRecyclerView.invalidateItemDecorations();
    }

    public final void removeItemDecorationAt(int i) {
        this.mRecyclerView.removeItemDecorationAt(i);
    }

    public final void removeItemDecoration(@NonNull RecyclerView.getMax getmax) {
        this.mRecyclerView.removeItemDecoration(getmax);
    }

    abstract class length {
        /* access modifiers changed from: package-private */
        public void IsOverlapping() {
        }

        /* access modifiers changed from: package-private */
        public void getMax() {
        }

        /* access modifiers changed from: package-private */
        public void getMax(@NonNull AccessibilityEvent accessibilityEvent) {
        }

        /* access modifiers changed from: package-private */
        public void getMax(@NonNull onSupportActionModeFinished onsupportactionmodefinished) {
        }

        /* access modifiers changed from: package-private */
        public boolean getMax(int i) {
            return false;
        }

        /* access modifiers changed from: package-private */
        public void getMin(@Nullable RecyclerView.Adapter<?> adapter) {
        }

        /* access modifiers changed from: package-private */
        public void getMin(@NonNull RecyclerView recyclerView) {
        }

        /* access modifiers changed from: package-private */
        public boolean getMin() {
            return false;
        }

        /* access modifiers changed from: package-private */
        public void length() {
        }

        /* access modifiers changed from: package-private */
        public void length(AccessibilityNodeInfo accessibilityNodeInfo) {
        }

        /* access modifiers changed from: package-private */
        public boolean length(int i) {
            return false;
        }

        /* access modifiers changed from: package-private */
        public void setMax(@Nullable RecyclerView.Adapter<?> adapter) {
        }

        /* access modifiers changed from: package-private */
        public void setMin() {
        }

        /* access modifiers changed from: package-private */
        public boolean toFloatRange() {
            return false;
        }

        /* access modifiers changed from: package-private */
        public void toIntRange() {
        }

        private length() {
        }

        /* synthetic */ length(ViewPager2 viewPager2, byte b) {
            this();
        }

        /* access modifiers changed from: package-private */
        public String setMax() {
            throw new IllegalStateException("Not implemented.");
        }

        /* access modifiers changed from: package-private */
        public boolean getMin(int i) {
            throw new IllegalStateException("Not implemented.");
        }

        /* access modifiers changed from: package-private */
        public boolean setMax(int i) {
            throw new IllegalStateException("Not implemented.");
        }

        /* access modifiers changed from: package-private */
        public CharSequence isInside() {
            throw new IllegalStateException("Not implemented.");
        }
    }

    class getMin extends length {
        public final boolean toFloatRange() {
            return true;
        }

        getMin() {
            super(ViewPager2.this, (byte) 0);
        }

        public final boolean getMax(int i) {
            return (i == 8192 || i == 4096) && !ViewPager2.this.isUserInputEnabled();
        }

        public final boolean setMax(int i) {
            if (getMax(i)) {
                return false;
            }
            throw new IllegalStateException();
        }

        public final void getMax(@NonNull onSupportActionModeFinished onsupportactionmodefinished) {
            if (!ViewPager2.this.isUserInputEnabled()) {
                onsupportactionmodefinished.setMax(onSupportActionModeFinished.setMax.toDoubleRange);
                onsupportactionmodefinished.setMax(onSupportActionModeFinished.setMax.values);
                onsupportactionmodefinished.values(false);
            }
        }

        public final CharSequence isInside() {
            if (toFloatRange()) {
                return "androidx.viewpager.widget.ViewPager";
            }
            throw new IllegalStateException();
        }
    }

    class IsOverlapping extends length {
        private final setSupportProgressBarIndeterminateVisibility getMin = new setSupportProgressBarIndeterminateVisibility() {
            public final boolean perform(@NonNull View view, @Nullable setSupportProgressBarIndeterminateVisibility.setMax setmax) {
                IsOverlapping isOverlapping = IsOverlapping.this;
                int currentItem = ((ViewPager2) view).getCurrentItem() + 1;
                if (ViewPager2.this.isUserInputEnabled()) {
                    ViewPager2.this.setCurrentItemInternal(currentItem, true);
                }
                return true;
            }
        };
        private RecyclerView.setMin setMax;
        private final setSupportProgressBarIndeterminateVisibility setMin = new setSupportProgressBarIndeterminateVisibility() {
            public final boolean perform(@NonNull View view, @Nullable setSupportProgressBarIndeterminateVisibility.setMax setmax) {
                IsOverlapping isOverlapping = IsOverlapping.this;
                int currentItem = ((ViewPager2) view).getCurrentItem() - 1;
                if (ViewPager2.this.isUserInputEnabled()) {
                    ViewPager2.this.setCurrentItemInternal(currentItem, true);
                }
                return true;
            }
        };

        public final boolean getMin() {
            return true;
        }

        public final boolean length(int i) {
            return i == 8192 || i == 4096;
        }

        IsOverlapping() {
            super(ViewPager2.this, (byte) 0);
        }

        public final void getMin(@NonNull RecyclerView recyclerView) {
            ViewCompat.setMin((View) recyclerView, 2);
            this.setMax = new setMax() {
                public final void onChanged() {
                    IsOverlapping.this.equals();
                }
            };
            if (ViewCompat.isInside(ViewPager2.this) == 0) {
                ViewCompat.setMin((View) ViewPager2.this, 1);
            }
        }

        public final String setMax() {
            if (getMin()) {
                return "androidx.viewpager.widget.ViewPager";
            }
            throw new IllegalStateException();
        }

        public final void length() {
            equals();
        }

        public final void getMin(@Nullable RecyclerView.Adapter<?> adapter) {
            equals();
            if (adapter != null) {
                adapter.registerAdapterDataObserver(this.setMax);
            }
        }

        public final void setMax(@Nullable RecyclerView.Adapter<?> adapter) {
            if (adapter != null) {
                adapter.unregisterAdapterDataObserver(this.setMax);
            }
        }

        public final void setMin() {
            equals();
        }

        public final void getMax() {
            equals();
        }

        public final void IsOverlapping() {
            equals();
            if (Build.VERSION.SDK_INT < 21) {
                ViewPager2.this.sendAccessibilityEvent(2048);
            }
        }

        public final void toIntRange() {
            equals();
        }

        public final boolean getMin(int i) {
            int i2;
            if (length(i)) {
                if (i == 8192) {
                    i2 = ViewPager2.this.getCurrentItem() - 1;
                } else {
                    i2 = ViewPager2.this.getCurrentItem() + 1;
                }
                if (ViewPager2.this.isUserInputEnabled()) {
                    ViewPager2.this.setCurrentItemInternal(i2, true);
                }
                return true;
            }
            throw new IllegalStateException();
        }

        public final void getMax(@NonNull AccessibilityEvent accessibilityEvent) {
            accessibilityEvent.setSource(ViewPager2.this);
            if (getMin()) {
                accessibilityEvent.setClassName("androidx.viewpager.widget.ViewPager");
                return;
            }
            throw new IllegalStateException();
        }

        /* access modifiers changed from: package-private */
        public final void equals() {
            int itemCount;
            ViewPager2 viewPager2 = ViewPager2.this;
            int i = 16908360;
            ViewCompat.getMin((View) viewPager2, 16908360);
            ViewCompat.getMin((View) viewPager2, 16908361);
            ViewCompat.getMin((View) viewPager2, 16908358);
            ViewCompat.getMin((View) viewPager2, 16908359);
            if (ViewPager2.this.getAdapter() != null && (itemCount = ViewPager2.this.getAdapter().getItemCount()) != 0 && ViewPager2.this.isUserInputEnabled()) {
                if (ViewPager2.this.getOrientation() == 0) {
                    boolean isRtl = ViewPager2.this.isRtl();
                    int i2 = isRtl ? 16908360 : 16908361;
                    if (isRtl) {
                        i = 16908361;
                    }
                    if (ViewPager2.this.mCurrentItem < itemCount - 1) {
                        ViewCompat.getMin(viewPager2, new onSupportActionModeFinished.setMax(i2, (CharSequence) null), (CharSequence) null, this.getMin);
                    }
                    if (ViewPager2.this.mCurrentItem > 0) {
                        ViewCompat.getMin(viewPager2, new onSupportActionModeFinished.setMax(i, (CharSequence) null), (CharSequence) null, this.setMin);
                        return;
                    }
                    return;
                }
                if (ViewPager2.this.mCurrentItem < itemCount - 1) {
                    ViewCompat.getMin(viewPager2, new onSupportActionModeFinished.setMax(16908359, (CharSequence) null), (CharSequence) null, this.getMin);
                }
                if (ViewPager2.this.mCurrentItem > 0) {
                    ViewCompat.getMin(viewPager2, new onSupportActionModeFinished.setMax(16908358, (CharSequence) null), (CharSequence) null, this.setMin);
                }
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:16:0x0054  */
        /* JADX WARNING: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void length(android.view.accessibility.AccessibilityNodeInfo r6) {
            /*
                r5 = this;
                androidx.viewpager2.widget.ViewPager2 r0 = androidx.viewpager2.widget.ViewPager2.this
                androidx.recyclerview.widget.RecyclerView$Adapter r0 = r0.getAdapter()
                r1 = 1
                r2 = 0
                if (r0 == 0) goto L_0x002a
                androidx.viewpager2.widget.ViewPager2 r0 = androidx.viewpager2.widget.ViewPager2.this
                int r0 = r0.getOrientation()
                if (r0 != r1) goto L_0x001d
                androidx.viewpager2.widget.ViewPager2 r0 = androidx.viewpager2.widget.ViewPager2.this
                androidx.recyclerview.widget.RecyclerView$Adapter r0 = r0.getAdapter()
                int r0 = r0.getItemCount()
                goto L_0x002b
            L_0x001d:
                androidx.viewpager2.widget.ViewPager2 r0 = androidx.viewpager2.widget.ViewPager2.this
                androidx.recyclerview.widget.RecyclerView$Adapter r0 = r0.getAdapter()
                int r0 = r0.getItemCount()
                r3 = r0
                r0 = 0
                goto L_0x002c
            L_0x002a:
                r0 = 0
            L_0x002b:
                r3 = 0
            L_0x002c:
                o.onSupportActionModeFinished r4 = o.onSupportActionModeFinished.getMin((android.view.accessibility.AccessibilityNodeInfo) r6)
                o.onSupportActionModeFinished$getMax r0 = o.onSupportActionModeFinished.getMax.length(r0, r3, r2, r2)
                r4.getMin((java.lang.Object) r0)
                int r0 = android.os.Build.VERSION.SDK_INT
                r2 = 16
                if (r0 < r2) goto L_0x006f
                androidx.viewpager2.widget.ViewPager2 r0 = androidx.viewpager2.widget.ViewPager2.this
                androidx.recyclerview.widget.RecyclerView$Adapter r0 = r0.getAdapter()
                if (r0 == 0) goto L_0x006f
                int r0 = r0.getItemCount()
                if (r0 == 0) goto L_0x006f
                androidx.viewpager2.widget.ViewPager2 r2 = androidx.viewpager2.widget.ViewPager2.this
                boolean r2 = r2.isUserInputEnabled()
                if (r2 != 0) goto L_0x0054
                goto L_0x006f
            L_0x0054:
                androidx.viewpager2.widget.ViewPager2 r2 = androidx.viewpager2.widget.ViewPager2.this
                int r2 = r2.mCurrentItem
                if (r2 <= 0) goto L_0x005f
                r2 = 8192(0x2000, float:1.14794E-41)
                r6.addAction(r2)
            L_0x005f:
                androidx.viewpager2.widget.ViewPager2 r2 = androidx.viewpager2.widget.ViewPager2.this
                int r2 = r2.mCurrentItem
                int r0 = r0 - r1
                if (r2 >= r0) goto L_0x006b
                r0 = 4096(0x1000, float:5.74E-42)
                r6.addAction(r0)
            L_0x006b:
                r6.setScrollable(r1)
            L_0x006f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager2.widget.ViewPager2.IsOverlapping.length(android.view.accessibility.AccessibilityNodeInfo):void");
        }
    }

    static abstract class setMax extends RecyclerView.setMin {
        private setMax() {
        }

        /* synthetic */ setMax(byte b) {
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
}
