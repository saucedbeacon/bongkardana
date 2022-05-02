package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import o.close;
import o.getNonActionItems;
import o.performShortcut;

public class LinearLayoutManager extends RecyclerView.IsOverlapping implements RecyclerView.values.length {
    static final boolean DEBUG = false;
    public static final int HORIZONTAL = 0;
    public static final int INVALID_OFFSET = Integer.MIN_VALUE;
    private static final float MAX_SCROLL_FACTOR = 0.33333334f;
    private static final String TAG = "LinearLayoutManager";
    public static final int VERTICAL = 1;
    final getMin mAnchorInfo;
    private int mInitialPrefetchItemCount;
    private boolean mLastStackFromEnd;
    private final length mLayoutChunkResult;
    private setMin mLayoutState;
    int mOrientation;
    close mOrientationHelper;
    SavedState mPendingSavedState;
    int mPendingScrollPosition;
    int mPendingScrollPositionOffset;
    private boolean mRecycleChildrenOnDetach;
    private int[] mReusableIntPair;
    private boolean mReverseLayout;
    boolean mShouldReverseLayout;
    private boolean mSmoothScrollbarEnabled;
    private boolean mStackFromEnd;

    public boolean isAutoMeasureEnabled() {
        return true;
    }

    /* access modifiers changed from: package-private */
    public void onAnchorReady(RecyclerView.toDoubleRange todoublerange, RecyclerView$Mean$Arithmetic recyclerView$Mean$Arithmetic, getMin getmin, int i) {
    }

    public LinearLayoutManager(Context context) {
        this(context, 1, false);
    }

    public LinearLayoutManager(Context context, int i, boolean z) {
        this.mOrientation = 1;
        this.mReverseLayout = false;
        this.mShouldReverseLayout = false;
        this.mStackFromEnd = false;
        this.mSmoothScrollbarEnabled = true;
        this.mPendingScrollPosition = -1;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        this.mPendingSavedState = null;
        this.mAnchorInfo = new getMin();
        this.mLayoutChunkResult = new length();
        this.mInitialPrefetchItemCount = 2;
        this.mReusableIntPair = new int[2];
        setOrientation(i);
        setReverseLayout(z);
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.mOrientation = 1;
        this.mReverseLayout = false;
        this.mShouldReverseLayout = false;
        this.mStackFromEnd = false;
        this.mSmoothScrollbarEnabled = true;
        this.mPendingScrollPosition = -1;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        this.mPendingSavedState = null;
        this.mAnchorInfo = new getMin();
        this.mLayoutChunkResult = new length();
        this.mInitialPrefetchItemCount = 2;
        this.mReusableIntPair = new int[2];
        RecyclerView.IsOverlapping.setMax properties = getProperties(context, attributeSet, i, i2);
        setOrientation(properties.setMax);
        setReverseLayout(properties.setMin);
        setStackFromEnd(properties.length);
    }

    public RecyclerView.LayoutParams generateDefaultLayoutParams() {
        return new RecyclerView.LayoutParams(-2, -2);
    }

    public boolean getRecycleChildrenOnDetach() {
        return this.mRecycleChildrenOnDetach;
    }

    public void setRecycleChildrenOnDetach(boolean z) {
        this.mRecycleChildrenOnDetach = z;
    }

    public void onDetachedFromWindow(RecyclerView recyclerView, RecyclerView.toDoubleRange todoublerange) {
        super.onDetachedFromWindow(recyclerView, todoublerange);
        if (this.mRecycleChildrenOnDetach) {
            removeAndRecycleAllViews(todoublerange);
            todoublerange.getMin.clear();
            todoublerange.length();
        }
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (getChildCount() > 0) {
            accessibilityEvent.setFromIndex(findFirstVisibleItemPosition());
            accessibilityEvent.setToIndex(findLastVisibleItemPosition());
        }
    }

    public Parcelable onSaveInstanceState() {
        if (this.mPendingSavedState != null) {
            return new SavedState(this.mPendingSavedState);
        }
        SavedState savedState = new SavedState();
        if (getChildCount() > 0) {
            ensureLayoutState();
            boolean z = this.mLastStackFromEnd ^ this.mShouldReverseLayout;
            savedState.length = z;
            if (z) {
                View childClosestToEnd = getChildClosestToEnd();
                savedState.setMin = this.mOrientationHelper.setMax() - this.mOrientationHelper.setMax(childClosestToEnd);
                savedState.setMax = getPosition(childClosestToEnd);
            } else {
                View childClosestToStart = getChildClosestToStart();
                savedState.setMax = getPosition(childClosestToStart);
                savedState.setMin = this.mOrientationHelper.getMax(childClosestToStart) - this.mOrientationHelper.getMin();
            }
        } else {
            savedState.setMax = -1;
        }
        return savedState;
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.mPendingSavedState = savedState;
            if (this.mPendingScrollPosition != -1) {
                savedState.setMax = -1;
            }
            requestLayout();
        }
    }

    public boolean canScrollHorizontally() {
        return this.mOrientation == 0;
    }

    public boolean canScrollVertically() {
        return this.mOrientation == 1;
    }

    public void setStackFromEnd(boolean z) {
        assertNotInLayoutOrScroll((String) null);
        if (this.mStackFromEnd != z) {
            this.mStackFromEnd = z;
            requestLayout();
        }
    }

    public boolean getStackFromEnd() {
        return this.mStackFromEnd;
    }

    public int getOrientation() {
        return this.mOrientation;
    }

    public void setOrientation(int i) {
        if (i == 0 || i == 1) {
            assertNotInLayoutOrScroll((String) null);
            if (i != this.mOrientation || this.mOrientationHelper == null) {
                close min = close.setMin(this, i);
                this.mOrientationHelper = min;
                this.mAnchorInfo.setMin = min;
                this.mOrientation = i;
                requestLayout();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("invalid orientation:".concat(String.valueOf(i)));
    }

    private void resolveShouldLayoutReverse() {
        boolean z = true;
        if (this.mOrientation == 1 || !isLayoutRTL()) {
            z = this.mReverseLayout;
        } else if (this.mReverseLayout) {
            z = false;
        }
        this.mShouldReverseLayout = z;
    }

    public boolean getReverseLayout() {
        return this.mReverseLayout;
    }

    public void setReverseLayout(boolean z) {
        assertNotInLayoutOrScroll((String) null);
        if (z != this.mReverseLayout) {
            this.mReverseLayout = z;
            requestLayout();
        }
    }

    public View findViewByPosition(int i) {
        int childCount = getChildCount();
        if (childCount == 0) {
            return null;
        }
        int position = i - getPosition(getChildAt(0));
        if (position >= 0 && position < childCount) {
            View childAt = getChildAt(position);
            if (getPosition(childAt) == i) {
                return childAt;
            }
        }
        return super.findViewByPosition(i);
    }

    /* access modifiers changed from: protected */
    @Deprecated
    public int getExtraLayoutSpace(RecyclerView$Mean$Arithmetic recyclerView$Mean$Arithmetic) {
        if (recyclerView$Mean$Arithmetic.getMin()) {
            return this.mOrientationHelper.setMin();
        }
        return 0;
    }

    public void calculateExtraLayoutSpace(@NonNull RecyclerView$Mean$Arithmetic recyclerView$Mean$Arithmetic, @NonNull int[] iArr) {
        int i;
        int extraLayoutSpace = getExtraLayoutSpace(recyclerView$Mean$Arithmetic);
        if (this.mLayoutState.IsOverlapping == -1) {
            i = 0;
        } else {
            i = extraLayoutSpace;
            extraLayoutSpace = 0;
        }
        iArr[0] = extraLayoutSpace;
        iArr[1] = i;
    }

    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView$Mean$Arithmetic recyclerView$Mean$Arithmetic, int i) {
        performShortcut performshortcut = new performShortcut(recyclerView.getContext());
        performshortcut.setTargetPosition(i);
        startSmoothScroll(performshortcut);
    }

    public PointF computeScrollVectorForPosition(int i) {
        if (getChildCount() == 0) {
            return null;
        }
        boolean z = false;
        int i2 = 1;
        if (i < getPosition(getChildAt(0))) {
            z = true;
        }
        if (z != this.mShouldReverseLayout) {
            i2 = -1;
        }
        if (this.mOrientation == 0) {
            return new PointF((float) i2, 0.0f);
        }
        return new PointF(0.0f, (float) i2);
    }

    public void onLayoutChildren(RecyclerView.toDoubleRange todoublerange, RecyclerView$Mean$Arithmetic recyclerView$Mean$Arithmetic) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        View findViewByPosition;
        int i7;
        int i8;
        int i9;
        if (!(this.mPendingSavedState == null && this.mPendingScrollPosition == -1)) {
            if (recyclerView$Mean$Arithmetic.equals) {
                i9 = recyclerView$Mean$Arithmetic.setMax - recyclerView$Mean$Arithmetic.getMax;
            } else {
                i9 = recyclerView$Mean$Arithmetic.setMin;
            }
            if (i9 == 0) {
                removeAndRecycleAllViews(todoublerange);
                return;
            }
        }
        SavedState savedState = this.mPendingSavedState;
        if (savedState != null && savedState.length()) {
            this.mPendingScrollPosition = this.mPendingSavedState.setMax;
        }
        ensureLayoutState();
        this.mLayoutState.getMin = false;
        resolveShouldLayoutReverse();
        View focusedChild = getFocusedChild();
        if (!this.mAnchorInfo.length || this.mPendingScrollPosition != -1 || this.mPendingSavedState != null) {
            getMin getmin = this.mAnchorInfo;
            getmin.getMax = -1;
            getmin.getMin = Integer.MIN_VALUE;
            getmin.setMax = false;
            getmin.length = false;
            this.mAnchorInfo.setMax = this.mShouldReverseLayout ^ this.mStackFromEnd;
            updateAnchorInfoForLayout(todoublerange, recyclerView$Mean$Arithmetic, this.mAnchorInfo);
            this.mAnchorInfo.length = true;
        } else if (focusedChild != null && (this.mOrientationHelper.getMax(focusedChild) >= this.mOrientationHelper.setMax() || this.mOrientationHelper.setMax(focusedChild) <= this.mOrientationHelper.getMin())) {
            this.mAnchorInfo.setMin(focusedChild, getPosition(focusedChild));
        }
        setMin setmin = this.mLayoutState;
        setmin.IsOverlapping = setmin.values >= 0 ? 1 : -1;
        int[] iArr = this.mReusableIntPair;
        iArr[0] = 0;
        iArr[1] = 0;
        calculateExtraLayoutSpace(recyclerView$Mean$Arithmetic, iArr);
        int max = Math.max(0, this.mReusableIntPair[0]) + this.mOrientationHelper.getMin();
        int max2 = Math.max(0, this.mReusableIntPair[1]) + this.mOrientationHelper.length();
        if (!(!recyclerView$Mean$Arithmetic.setMax() || (i6 = this.mPendingScrollPosition) == -1 || this.mPendingScrollPositionOffset == Integer.MIN_VALUE || (findViewByPosition = findViewByPosition(i6)) == null)) {
            if (this.mShouldReverseLayout) {
                i7 = this.mOrientationHelper.setMax() - this.mOrientationHelper.setMax(findViewByPosition);
                i8 = this.mPendingScrollPositionOffset;
            } else {
                i8 = this.mOrientationHelper.getMax(findViewByPosition) - this.mOrientationHelper.getMin();
                i7 = this.mPendingScrollPositionOffset;
            }
            int i10 = i7 - i8;
            if (i10 > 0) {
                max += i10;
            } else {
                max2 -= i10;
            }
        }
        onAnchorReady(todoublerange, recyclerView$Mean$Arithmetic, this.mAnchorInfo, (!this.mAnchorInfo.setMax ? !this.mShouldReverseLayout : this.mShouldReverseLayout) ? 1 : -1);
        detachAndScrapAttachedViews(todoublerange);
        this.mLayoutState.toString = resolveIsInfinite();
        this.mLayoutState.toFloatRange = recyclerView$Mean$Arithmetic.setMax();
        this.mLayoutState.equals = 0;
        if (this.mAnchorInfo.setMax) {
            updateLayoutStateToFillStart(this.mAnchorInfo);
            this.mLayoutState.isInside = max;
            fill(todoublerange, this.mLayoutState, recyclerView$Mean$Arithmetic, false);
            i2 = this.mLayoutState.setMax;
            int i11 = this.mLayoutState.setMin;
            if (this.mLayoutState.length > 0) {
                max2 += this.mLayoutState.length;
            }
            updateLayoutStateToFillEnd(this.mAnchorInfo);
            this.mLayoutState.isInside = max2;
            this.mLayoutState.setMin += this.mLayoutState.getMax;
            fill(todoublerange, this.mLayoutState, recyclerView$Mean$Arithmetic, false);
            i = this.mLayoutState.setMax;
            if (this.mLayoutState.length > 0) {
                int i12 = this.mLayoutState.length;
                updateLayoutStateToFillStart(i11, i2);
                this.mLayoutState.isInside = i12;
                fill(todoublerange, this.mLayoutState, recyclerView$Mean$Arithmetic, false);
                i2 = this.mLayoutState.setMax;
            }
        } else {
            updateLayoutStateToFillEnd(this.mAnchorInfo);
            this.mLayoutState.isInside = max2;
            fill(todoublerange, this.mLayoutState, recyclerView$Mean$Arithmetic, false);
            i = this.mLayoutState.setMax;
            int i13 = this.mLayoutState.setMin;
            if (this.mLayoutState.length > 0) {
                max += this.mLayoutState.length;
            }
            updateLayoutStateToFillStart(this.mAnchorInfo);
            this.mLayoutState.isInside = max;
            this.mLayoutState.setMin += this.mLayoutState.getMax;
            fill(todoublerange, this.mLayoutState, recyclerView$Mean$Arithmetic, false);
            i2 = this.mLayoutState.setMax;
            if (this.mLayoutState.length > 0) {
                int i14 = this.mLayoutState.length;
                updateLayoutStateToFillEnd(i13, i);
                this.mLayoutState.isInside = i14;
                fill(todoublerange, this.mLayoutState, recyclerView$Mean$Arithmetic, false);
                i = this.mLayoutState.setMax;
            }
        }
        if (getChildCount() > 0) {
            if (this.mShouldReverseLayout ^ this.mStackFromEnd) {
                int fixLayoutEndGap = fixLayoutEndGap(i, todoublerange, recyclerView$Mean$Arithmetic, true);
                i5 = i2 + fixLayoutEndGap;
                i4 = i + fixLayoutEndGap;
                i3 = fixLayoutStartGap(i5, todoublerange, recyclerView$Mean$Arithmetic, false);
            } else {
                int fixLayoutStartGap = fixLayoutStartGap(i2, todoublerange, recyclerView$Mean$Arithmetic, true);
                i5 = i2 + fixLayoutStartGap;
                i4 = i + fixLayoutStartGap;
                i3 = fixLayoutEndGap(i4, todoublerange, recyclerView$Mean$Arithmetic, false);
            }
            i2 = i5 + i3;
            i = i4 + i3;
        }
        layoutForPredictiveAnimations(todoublerange, recyclerView$Mean$Arithmetic, i2, i);
        if (!recyclerView$Mean$Arithmetic.setMax()) {
            close close = this.mOrientationHelper;
            close.getMin = close.setMin();
        } else {
            getMin getmin2 = this.mAnchorInfo;
            getmin2.getMax = -1;
            getmin2.getMin = Integer.MIN_VALUE;
            getmin2.setMax = false;
            getmin2.length = false;
        }
        this.mLastStackFromEnd = this.mStackFromEnd;
    }

    public void onLayoutCompleted(RecyclerView$Mean$Arithmetic recyclerView$Mean$Arithmetic) {
        super.onLayoutCompleted(recyclerView$Mean$Arithmetic);
        this.mPendingSavedState = null;
        this.mPendingScrollPosition = -1;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        getMin getmin = this.mAnchorInfo;
        getmin.getMax = -1;
        getmin.getMin = Integer.MIN_VALUE;
        getmin.setMax = false;
        getmin.length = false;
    }

    private void layoutForPredictiveAnimations(RecyclerView.toDoubleRange todoublerange, RecyclerView$Mean$Arithmetic recyclerView$Mean$Arithmetic, int i, int i2) {
        RecyclerView.toDoubleRange todoublerange2 = todoublerange;
        RecyclerView$Mean$Arithmetic recyclerView$Mean$Arithmetic2 = recyclerView$Mean$Arithmetic;
        if (recyclerView$Mean$Arithmetic.getMax() && getChildCount() != 0 && !recyclerView$Mean$Arithmetic.setMax() && supportsPredictiveItemAnimations()) {
            List<RecyclerView.valueOf> list = todoublerange2.setMax;
            int size = list.size();
            int position = getPosition(getChildAt(0));
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < size; i5++) {
                RecyclerView.valueOf valueof = list.get(i5);
                if (!valueof.isRemoved()) {
                    char c = 1;
                    if ((valueof.getLayoutPosition() < position) != this.mShouldReverseLayout) {
                        c = 65535;
                    }
                    if (c == 65535) {
                        i3 += this.mOrientationHelper.setMin(valueof.itemView);
                    } else {
                        i4 += this.mOrientationHelper.setMin(valueof.itemView);
                    }
                }
            }
            this.mLayoutState.hashCode = list;
            if (i3 > 0) {
                updateLayoutStateToFillStart(getPosition(getChildClosestToStart()), i);
                this.mLayoutState.isInside = i3;
                this.mLayoutState.length = 0;
                setMin setmin = this.mLayoutState;
                View min = setmin.getMin((View) null);
                if (min == null) {
                    setmin.setMin = -1;
                } else {
                    setmin.setMin = ((RecyclerView.LayoutParams) min.getLayoutParams()).getViewLayoutPosition();
                }
                fill(todoublerange2, this.mLayoutState, recyclerView$Mean$Arithmetic2, false);
            }
            if (i4 > 0) {
                updateLayoutStateToFillEnd(getPosition(getChildClosestToEnd()), i2);
                this.mLayoutState.isInside = i4;
                this.mLayoutState.length = 0;
                setMin setmin2 = this.mLayoutState;
                View min2 = setmin2.getMin((View) null);
                if (min2 == null) {
                    setmin2.setMin = -1;
                } else {
                    setmin2.setMin = ((RecyclerView.LayoutParams) min2.getLayoutParams()).getViewLayoutPosition();
                }
                fill(todoublerange2, this.mLayoutState, recyclerView$Mean$Arithmetic2, false);
            }
            this.mLayoutState.hashCode = null;
        }
    }

    private void updateAnchorInfoForLayout(RecyclerView.toDoubleRange todoublerange, RecyclerView$Mean$Arithmetic recyclerView$Mean$Arithmetic, getMin getmin) {
        int i;
        int i2;
        int i3;
        if (!updateAnchorFromPendingData(recyclerView$Mean$Arithmetic, getmin) && !updateAnchorFromChildren(todoublerange, recyclerView$Mean$Arithmetic, getmin)) {
            if (getmin.setMax) {
                i = getmin.setMin.setMax();
            } else {
                i = getmin.setMin.getMin();
            }
            getmin.getMin = i;
            if (this.mStackFromEnd) {
                if (recyclerView$Mean$Arithmetic.equals) {
                    i3 = recyclerView$Mean$Arithmetic.setMax - recyclerView$Mean$Arithmetic.getMax;
                } else {
                    i3 = recyclerView$Mean$Arithmetic.setMin;
                }
                i2 = i3 - 1;
            } else {
                i2 = 0;
            }
            getmin.getMax = i2;
        }
    }

    private boolean updateAnchorFromChildren(RecyclerView.toDoubleRange todoublerange, RecyclerView$Mean$Arithmetic recyclerView$Mean$Arithmetic, getMin getmin) {
        View findReferenceChild;
        boolean z = false;
        if (getChildCount() == 0) {
            return false;
        }
        View focusedChild = getFocusedChild();
        if (focusedChild != null && getMin.length(focusedChild, recyclerView$Mean$Arithmetic)) {
            getmin.setMin(focusedChild, getPosition(focusedChild));
            return true;
        } else if (this.mLastStackFromEnd != this.mStackFromEnd || (findReferenceChild = findReferenceChild(todoublerange, recyclerView$Mean$Arithmetic, getmin.setMax, this.mStackFromEnd)) == null) {
            return false;
        } else {
            getmin.getMax(findReferenceChild, getPosition(findReferenceChild));
            if (!recyclerView$Mean$Arithmetic.setMax() && supportsPredictiveItemAnimations()) {
                int max = this.mOrientationHelper.getMax(findReferenceChild);
                int max2 = this.mOrientationHelper.setMax(findReferenceChild);
                int min = this.mOrientationHelper.getMin();
                int max3 = this.mOrientationHelper.setMax();
                boolean z2 = max2 <= min && max < min;
                if (max >= max3 && max2 > max3) {
                    z = true;
                }
                if (z2 || z) {
                    if (getmin.setMax) {
                        min = max3;
                    }
                    getmin.getMin = min;
                }
            }
            return true;
        }
    }

    private boolean updateAnchorFromPendingData(RecyclerView$Mean$Arithmetic recyclerView$Mean$Arithmetic, getMin getmin) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z = false;
        if (!recyclerView$Mean$Arithmetic.setMax() && (i = this.mPendingScrollPosition) != -1) {
            if (i >= 0) {
                if (recyclerView$Mean$Arithmetic.equals) {
                    i2 = recyclerView$Mean$Arithmetic.setMax - recyclerView$Mean$Arithmetic.getMax;
                } else {
                    i2 = recyclerView$Mean$Arithmetic.setMin;
                }
                if (i < i2) {
                    getmin.getMax = this.mPendingScrollPosition;
                    SavedState savedState = this.mPendingSavedState;
                    if (savedState != null && savedState.length()) {
                        getmin.setMax = this.mPendingSavedState.length;
                        if (getmin.setMax) {
                            getmin.getMin = this.mOrientationHelper.setMax() - this.mPendingSavedState.setMin;
                        } else {
                            getmin.getMin = this.mOrientationHelper.getMin() + this.mPendingSavedState.setMin;
                        }
                        return true;
                    } else if (this.mPendingScrollPositionOffset == Integer.MIN_VALUE) {
                        View findViewByPosition = findViewByPosition(this.mPendingScrollPosition);
                        if (findViewByPosition == null) {
                            if (getChildCount() > 0) {
                                if ((this.mPendingScrollPosition < getPosition(getChildAt(0))) == this.mShouldReverseLayout) {
                                    z = true;
                                }
                                getmin.setMax = z;
                            }
                            if (getmin.setMax) {
                                i3 = getmin.setMin.setMax();
                            } else {
                                i3 = getmin.setMin.getMin();
                            }
                            getmin.getMin = i3;
                        } else if (this.mOrientationHelper.setMin(findViewByPosition) > this.mOrientationHelper.setMin()) {
                            if (getmin.setMax) {
                                i5 = getmin.setMin.setMax();
                            } else {
                                i5 = getmin.setMin.getMin();
                            }
                            getmin.getMin = i5;
                            return true;
                        } else if (this.mOrientationHelper.getMax(findViewByPosition) - this.mOrientationHelper.getMin() < 0) {
                            getmin.getMin = this.mOrientationHelper.getMin();
                            getmin.setMax = false;
                            return true;
                        } else if (this.mOrientationHelper.setMax() - this.mOrientationHelper.setMax(findViewByPosition) < 0) {
                            getmin.getMin = this.mOrientationHelper.setMax();
                            getmin.setMax = true;
                            return true;
                        } else {
                            if (getmin.setMax) {
                                int max = this.mOrientationHelper.setMax(findViewByPosition);
                                close close = this.mOrientationHelper;
                                if (Integer.MIN_VALUE != close.getMin) {
                                    z = close.setMin() - close.getMin;
                                }
                                i4 = max + (z ? 1 : 0);
                            } else {
                                i4 = this.mOrientationHelper.getMax(findViewByPosition);
                            }
                            getmin.getMin = i4;
                        }
                        return true;
                    } else {
                        getmin.setMax = this.mShouldReverseLayout;
                        if (this.mShouldReverseLayout) {
                            getmin.getMin = this.mOrientationHelper.setMax() - this.mPendingScrollPositionOffset;
                        } else {
                            getmin.getMin = this.mOrientationHelper.getMin() + this.mPendingScrollPositionOffset;
                        }
                        return true;
                    }
                }
            }
            this.mPendingScrollPosition = -1;
            this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        }
        return false;
    }

    private int fixLayoutEndGap(int i, RecyclerView.toDoubleRange todoublerange, RecyclerView$Mean$Arithmetic recyclerView$Mean$Arithmetic, boolean z) {
        int max;
        int max2 = this.mOrientationHelper.setMax() - i;
        if (max2 <= 0) {
            return 0;
        }
        int i2 = -scrollBy(-max2, todoublerange, recyclerView$Mean$Arithmetic);
        int i3 = i + i2;
        if (!z || (max = this.mOrientationHelper.setMax() - i3) <= 0) {
            return i2;
        }
        this.mOrientationHelper.getMin(max);
        return max + i2;
    }

    private int fixLayoutStartGap(int i, RecyclerView.toDoubleRange todoublerange, RecyclerView$Mean$Arithmetic recyclerView$Mean$Arithmetic, boolean z) {
        int min;
        int min2 = i - this.mOrientationHelper.getMin();
        if (min2 <= 0) {
            return 0;
        }
        int i2 = -scrollBy(min2, todoublerange, recyclerView$Mean$Arithmetic);
        int i3 = i + i2;
        if (!z || (min = i3 - this.mOrientationHelper.getMin()) <= 0) {
            return i2;
        }
        this.mOrientationHelper.getMin(-min);
        return i2 - min;
    }

    private void updateLayoutStateToFillEnd(getMin getmin) {
        updateLayoutStateToFillEnd(getmin.getMax, getmin.getMin);
    }

    private void updateLayoutStateToFillEnd(int i, int i2) {
        this.mLayoutState.length = this.mOrientationHelper.setMax() - i2;
        this.mLayoutState.getMax = this.mShouldReverseLayout ? -1 : 1;
        this.mLayoutState.setMin = i;
        this.mLayoutState.IsOverlapping = 1;
        this.mLayoutState.setMax = i2;
        this.mLayoutState.toIntRange = Integer.MIN_VALUE;
    }

    private void updateLayoutStateToFillStart(getMin getmin) {
        updateLayoutStateToFillStart(getmin.getMax, getmin.getMin);
    }

    private void updateLayoutStateToFillStart(int i, int i2) {
        this.mLayoutState.length = i2 - this.mOrientationHelper.getMin();
        this.mLayoutState.setMin = i;
        this.mLayoutState.getMax = this.mShouldReverseLayout ? 1 : -1;
        this.mLayoutState.IsOverlapping = -1;
        this.mLayoutState.setMax = i2;
        this.mLayoutState.toIntRange = Integer.MIN_VALUE;
    }

    /* access modifiers changed from: protected */
    public boolean isLayoutRTL() {
        return getLayoutDirection() == 1;
    }

    /* access modifiers changed from: package-private */
    public void ensureLayoutState() {
        if (this.mLayoutState == null) {
            this.mLayoutState = createLayoutState();
        }
    }

    /* access modifiers changed from: package-private */
    public setMin createLayoutState() {
        return new setMin();
    }

    public void scrollToPosition(int i) {
        this.mPendingScrollPosition = i;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        SavedState savedState = this.mPendingSavedState;
        if (savedState != null) {
            savedState.setMax = -1;
        }
        requestLayout();
    }

    public void scrollToPositionWithOffset(int i, int i2) {
        this.mPendingScrollPosition = i;
        this.mPendingScrollPositionOffset = i2;
        SavedState savedState = this.mPendingSavedState;
        if (savedState != null) {
            savedState.setMax = -1;
        }
        requestLayout();
    }

    public int scrollHorizontallyBy(int i, RecyclerView.toDoubleRange todoublerange, RecyclerView$Mean$Arithmetic recyclerView$Mean$Arithmetic) {
        if (this.mOrientation == 1) {
            return 0;
        }
        return scrollBy(i, todoublerange, recyclerView$Mean$Arithmetic);
    }

    public int scrollVerticallyBy(int i, RecyclerView.toDoubleRange todoublerange, RecyclerView$Mean$Arithmetic recyclerView$Mean$Arithmetic) {
        if (this.mOrientation == 0) {
            return 0;
        }
        return scrollBy(i, todoublerange, recyclerView$Mean$Arithmetic);
    }

    public int computeHorizontalScrollOffset(RecyclerView$Mean$Arithmetic recyclerView$Mean$Arithmetic) {
        return computeScrollOffset(recyclerView$Mean$Arithmetic);
    }

    public int computeVerticalScrollOffset(RecyclerView$Mean$Arithmetic recyclerView$Mean$Arithmetic) {
        return computeScrollOffset(recyclerView$Mean$Arithmetic);
    }

    public int computeHorizontalScrollExtent(RecyclerView$Mean$Arithmetic recyclerView$Mean$Arithmetic) {
        return computeScrollExtent(recyclerView$Mean$Arithmetic);
    }

    public int computeVerticalScrollExtent(RecyclerView$Mean$Arithmetic recyclerView$Mean$Arithmetic) {
        return computeScrollExtent(recyclerView$Mean$Arithmetic);
    }

    public int computeHorizontalScrollRange(RecyclerView$Mean$Arithmetic recyclerView$Mean$Arithmetic) {
        return computeScrollRange(recyclerView$Mean$Arithmetic);
    }

    public int computeVerticalScrollRange(RecyclerView$Mean$Arithmetic recyclerView$Mean$Arithmetic) {
        return computeScrollRange(recyclerView$Mean$Arithmetic);
    }

    private int computeScrollOffset(RecyclerView$Mean$Arithmetic recyclerView$Mean$Arithmetic) {
        if (getChildCount() == 0) {
            return 0;
        }
        ensureLayoutState();
        close close = this.mOrientationHelper;
        View findFirstVisibleChildClosestToStart = findFirstVisibleChildClosestToStart(!this.mSmoothScrollbarEnabled, true);
        return getNonActionItems.setMax(recyclerView$Mean$Arithmetic, close, findFirstVisibleChildClosestToStart, findFirstVisibleChildClosestToEnd(!this.mSmoothScrollbarEnabled, true), this, this.mSmoothScrollbarEnabled, this.mShouldReverseLayout);
    }

    private int computeScrollExtent(RecyclerView$Mean$Arithmetic recyclerView$Mean$Arithmetic) {
        if (getChildCount() == 0) {
            return 0;
        }
        ensureLayoutState();
        close close = this.mOrientationHelper;
        View findFirstVisibleChildClosestToStart = findFirstVisibleChildClosestToStart(!this.mSmoothScrollbarEnabled, true);
        return getNonActionItems.getMax(recyclerView$Mean$Arithmetic, close, findFirstVisibleChildClosestToStart, findFirstVisibleChildClosestToEnd(!this.mSmoothScrollbarEnabled, true), this, this.mSmoothScrollbarEnabled);
    }

    private int computeScrollRange(RecyclerView$Mean$Arithmetic recyclerView$Mean$Arithmetic) {
        if (getChildCount() == 0) {
            return 0;
        }
        ensureLayoutState();
        close close = this.mOrientationHelper;
        View findFirstVisibleChildClosestToStart = findFirstVisibleChildClosestToStart(!this.mSmoothScrollbarEnabled, true);
        return getNonActionItems.length(recyclerView$Mean$Arithmetic, close, findFirstVisibleChildClosestToStart, findFirstVisibleChildClosestToEnd(!this.mSmoothScrollbarEnabled, true), this, this.mSmoothScrollbarEnabled);
    }

    public void setSmoothScrollbarEnabled(boolean z) {
        this.mSmoothScrollbarEnabled = z;
    }

    public boolean isSmoothScrollbarEnabled() {
        return this.mSmoothScrollbarEnabled;
    }

    private void updateLayoutState(int i, int i2, boolean z, RecyclerView$Mean$Arithmetic recyclerView$Mean$Arithmetic) {
        int i3;
        this.mLayoutState.toString = resolveIsInfinite();
        this.mLayoutState.IsOverlapping = i;
        int[] iArr = this.mReusableIntPair;
        boolean z2 = false;
        iArr[0] = 0;
        int i4 = 1;
        iArr[1] = 0;
        calculateExtraLayoutSpace(recyclerView$Mean$Arithmetic, iArr);
        int max = Math.max(0, this.mReusableIntPair[0]);
        int max2 = Math.max(0, this.mReusableIntPair[1]);
        if (i == 1) {
            z2 = true;
        }
        this.mLayoutState.isInside = z2 ? max2 : max;
        setMin setmin = this.mLayoutState;
        if (!z2) {
            max = max2;
        }
        setmin.equals = max;
        if (z2) {
            this.mLayoutState.isInside += this.mOrientationHelper.length();
            View childClosestToEnd = getChildClosestToEnd();
            setMin setmin2 = this.mLayoutState;
            if (this.mShouldReverseLayout) {
                i4 = -1;
            }
            setmin2.getMax = i4;
            this.mLayoutState.setMin = getPosition(childClosestToEnd) + this.mLayoutState.getMax;
            this.mLayoutState.setMax = this.mOrientationHelper.setMax(childClosestToEnd);
            i3 = this.mOrientationHelper.setMax(childClosestToEnd) - this.mOrientationHelper.setMax();
        } else {
            View childClosestToStart = getChildClosestToStart();
            this.mLayoutState.isInside += this.mOrientationHelper.getMin();
            setMin setmin3 = this.mLayoutState;
            if (!this.mShouldReverseLayout) {
                i4 = -1;
            }
            setmin3.getMax = i4;
            this.mLayoutState.setMin = getPosition(childClosestToStart) + this.mLayoutState.getMax;
            this.mLayoutState.setMax = this.mOrientationHelper.getMax(childClosestToStart);
            i3 = (-this.mOrientationHelper.getMax(childClosestToStart)) + this.mOrientationHelper.getMin();
        }
        this.mLayoutState.length = i2;
        if (z) {
            this.mLayoutState.length -= i3;
        }
        this.mLayoutState.toIntRange = i3;
    }

    /* access modifiers changed from: package-private */
    public boolean resolveIsInfinite() {
        return this.mOrientationHelper.toFloatRange() == 0 && this.mOrientationHelper.getMax() == 0;
    }

    /* access modifiers changed from: package-private */
    public void collectPrefetchPositionsForLayoutState(RecyclerView$Mean$Arithmetic recyclerView$Mean$Arithmetic, setMin setmin, RecyclerView.IsOverlapping.getMax getmax) {
        int i;
        int i2 = setmin.setMin;
        if (i2 >= 0) {
            if (recyclerView$Mean$Arithmetic.equals) {
                i = recyclerView$Mean$Arithmetic.setMax - recyclerView$Mean$Arithmetic.getMax;
            } else {
                i = recyclerView$Mean$Arithmetic.setMin;
            }
            if (i2 < i) {
                getmax.length(i2, Math.max(0, setmin.toIntRange));
            }
        }
    }

    public void collectInitialPrefetchPositions(int i, RecyclerView.IsOverlapping.getMax getmax) {
        int i2;
        boolean z;
        SavedState savedState = this.mPendingSavedState;
        int i3 = -1;
        if (savedState == null || !savedState.length()) {
            resolveShouldLayoutReverse();
            z = this.mShouldReverseLayout;
            i2 = this.mPendingScrollPosition;
            if (i2 == -1) {
                i2 = z ? i - 1 : 0;
            }
        } else {
            z = this.mPendingSavedState.length;
            i2 = this.mPendingSavedState.setMax;
        }
        if (!z) {
            i3 = 1;
        }
        for (int i4 = 0; i4 < this.mInitialPrefetchItemCount && i2 >= 0 && i2 < i; i4++) {
            getmax.length(i2, 0);
            i2 += i3;
        }
    }

    public void setInitialPrefetchItemCount(int i) {
        this.mInitialPrefetchItemCount = i;
    }

    public int getInitialPrefetchItemCount() {
        return this.mInitialPrefetchItemCount;
    }

    public void collectAdjacentPrefetchPositions(int i, int i2, RecyclerView$Mean$Arithmetic recyclerView$Mean$Arithmetic, RecyclerView.IsOverlapping.getMax getmax) {
        if (this.mOrientation != 0) {
            i = i2;
        }
        if (getChildCount() != 0 && i != 0) {
            ensureLayoutState();
            updateLayoutState(i > 0 ? 1 : -1, Math.abs(i), true, recyclerView$Mean$Arithmetic);
            collectPrefetchPositionsForLayoutState(recyclerView$Mean$Arithmetic, this.mLayoutState, getmax);
        }
    }

    /* access modifiers changed from: package-private */
    public int scrollBy(int i, RecyclerView.toDoubleRange todoublerange, RecyclerView$Mean$Arithmetic recyclerView$Mean$Arithmetic) {
        if (getChildCount() == 0 || i == 0) {
            return 0;
        }
        ensureLayoutState();
        this.mLayoutState.getMin = true;
        int i2 = i > 0 ? 1 : -1;
        int abs = Math.abs(i);
        updateLayoutState(i2, abs, true, recyclerView$Mean$Arithmetic);
        int fill = this.mLayoutState.toIntRange + fill(todoublerange, this.mLayoutState, recyclerView$Mean$Arithmetic, false);
        if (fill < 0) {
            return 0;
        }
        if (abs > fill) {
            i = i2 * fill;
        }
        this.mOrientationHelper.getMin(-i);
        this.mLayoutState.values = i;
        return i;
    }

    public void assertNotInLayoutOrScroll(String str) {
        if (this.mPendingSavedState == null) {
            super.assertNotInLayoutOrScroll(str);
        }
    }

    private void recycleChildren(RecyclerView.toDoubleRange todoublerange, int i, int i2) {
        if (i != i2) {
            if (i2 > i) {
                for (int i3 = i2 - 1; i3 >= i; i3--) {
                    removeAndRecycleViewAt(i3, todoublerange);
                }
                return;
            }
            while (i > i2) {
                removeAndRecycleViewAt(i, todoublerange);
                i--;
            }
        }
    }

    private void recycleViewsFromStart(RecyclerView.toDoubleRange todoublerange, int i, int i2) {
        if (i >= 0) {
            int i3 = i - i2;
            int childCount = getChildCount();
            if (this.mShouldReverseLayout) {
                int i4 = childCount - 1;
                for (int i5 = i4; i5 >= 0; i5--) {
                    View childAt = getChildAt(i5);
                    if (this.mOrientationHelper.setMax(childAt) > i3 || this.mOrientationHelper.getMin(childAt) > i3) {
                        recycleChildren(todoublerange, i4, i5);
                        return;
                    }
                }
                return;
            }
            for (int i6 = 0; i6 < childCount; i6++) {
                View childAt2 = getChildAt(i6);
                if (this.mOrientationHelper.setMax(childAt2) > i3 || this.mOrientationHelper.getMin(childAt2) > i3) {
                    recycleChildren(todoublerange, 0, i6);
                    return;
                }
            }
        }
    }

    private void recycleViewsFromEnd(RecyclerView.toDoubleRange todoublerange, int i, int i2) {
        int childCount = getChildCount();
        if (i >= 0) {
            int max = (this.mOrientationHelper.getMax() - i) + i2;
            if (this.mShouldReverseLayout) {
                for (int i3 = 0; i3 < childCount; i3++) {
                    View childAt = getChildAt(i3);
                    if (this.mOrientationHelper.getMax(childAt) < max || this.mOrientationHelper.length(childAt) < max) {
                        recycleChildren(todoublerange, 0, i3);
                        return;
                    }
                }
                return;
            }
            int i4 = childCount - 1;
            for (int i5 = i4; i5 >= 0; i5--) {
                View childAt2 = getChildAt(i5);
                if (this.mOrientationHelper.getMax(childAt2) < max || this.mOrientationHelper.length(childAt2) < max) {
                    recycleChildren(todoublerange, i4, i5);
                    return;
                }
            }
        }
    }

    private void recycleByLayoutState(RecyclerView.toDoubleRange todoublerange, setMin setmin) {
        if (setmin.getMin && !setmin.toString) {
            int i = setmin.toIntRange;
            int i2 = setmin.equals;
            if (setmin.IsOverlapping == -1) {
                recycleViewsFromEnd(todoublerange, i, i2);
            } else {
                recycleViewsFromStart(todoublerange, i, i2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public int fill(RecyclerView.toDoubleRange todoublerange, setMin setmin, RecyclerView$Mean$Arithmetic recyclerView$Mean$Arithmetic, boolean z) {
        int i = setmin.length;
        if (setmin.toIntRange != Integer.MIN_VALUE) {
            if (setmin.length < 0) {
                setmin.toIntRange += setmin.length;
            }
            recycleByLayoutState(todoublerange, setmin);
        }
        int i2 = setmin.length + setmin.isInside;
        length length2 = this.mLayoutChunkResult;
        while (true) {
            if ((!setmin.toString && i2 <= 0) || !setmin.setMax(recyclerView$Mean$Arithmetic)) {
                break;
            }
            length2.length = 0;
            length2.setMax = false;
            length2.getMax = false;
            length2.getMin = false;
            layoutChunk(todoublerange, recyclerView$Mean$Arithmetic, setmin, length2);
            if (length2.setMax) {
                break;
            }
            setmin.setMax += length2.length * setmin.IsOverlapping;
            if (!length2.getMax || setmin.hashCode != null || !recyclerView$Mean$Arithmetic.setMax()) {
                setmin.length -= length2.length;
                i2 -= length2.length;
            }
            if (setmin.toIntRange != Integer.MIN_VALUE) {
                setmin.toIntRange += length2.length;
                if (setmin.length < 0) {
                    setmin.toIntRange += setmin.length;
                }
                recycleByLayoutState(todoublerange, setmin);
            }
            if (z && length2.getMin) {
                break;
            }
        }
        return i - setmin.length;
    }

    /* access modifiers changed from: package-private */
    public void layoutChunk(RecyclerView.toDoubleRange todoublerange, RecyclerView$Mean$Arithmetic recyclerView$Mean$Arithmetic, setMin setmin, length length2) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        View min = setmin.getMin(todoublerange);
        if (min == null) {
            length2.setMax = true;
            return;
        }
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) min.getLayoutParams();
        if (setmin.hashCode == null) {
            if (this.mShouldReverseLayout == (setmin.IsOverlapping == -1)) {
                addView(min);
            } else {
                addView(min, 0);
            }
        } else {
            if (this.mShouldReverseLayout == (setmin.IsOverlapping == -1)) {
                addDisappearingView(min);
            } else {
                addDisappearingView(min, 0);
            }
        }
        measureChildWithMargins(min, 0, 0);
        length2.length = this.mOrientationHelper.setMin(min);
        if (this.mOrientation == 1) {
            if (isLayoutRTL()) {
                i5 = getWidth() - getPaddingRight();
                i4 = i5 - this.mOrientationHelper.toFloatRange(min);
            } else {
                i4 = getPaddingLeft();
                i5 = this.mOrientationHelper.toFloatRange(min) + i4;
            }
            if (setmin.IsOverlapping == -1) {
                int i6 = setmin.setMax;
                i3 = setmin.setMax - length2.length;
                i2 = i5;
                i = i6;
            } else {
                int i7 = setmin.setMax;
                i = setmin.setMax + length2.length;
                i2 = i5;
                i3 = i7;
            }
        } else {
            int paddingTop = getPaddingTop();
            int floatRange = this.mOrientationHelper.toFloatRange(min) + paddingTop;
            if (setmin.IsOverlapping == -1) {
                i3 = paddingTop;
                i2 = setmin.setMax;
                i = floatRange;
                i4 = setmin.setMax - length2.length;
            } else {
                int i8 = setmin.setMax;
                i2 = setmin.setMax + length2.length;
                i3 = paddingTop;
                i = floatRange;
                i4 = i8;
            }
        }
        layoutDecoratedWithMargins(min, i4, i3, i2, i);
        if (layoutParams.isItemRemoved() || layoutParams.isItemChanged()) {
            length2.getMax = true;
        }
        length2.getMin = min.hasFocusable();
    }

    /* access modifiers changed from: package-private */
    public boolean shouldMeasureTwice() {
        return (getHeightMode() == 1073741824 || getWidthMode() == 1073741824 || !hasFlexibleChildInBothOrientations()) ? false : true;
    }

    /* access modifiers changed from: package-private */
    public int convertFocusDirectionToLayoutDirection(int i) {
        return i != 1 ? i != 2 ? i != 17 ? i != 33 ? i != 66 ? (i == 130 && this.mOrientation == 1) ? 1 : Integer.MIN_VALUE : this.mOrientation == 0 ? 1 : Integer.MIN_VALUE : this.mOrientation == 1 ? -1 : Integer.MIN_VALUE : this.mOrientation == 0 ? -1 : Integer.MIN_VALUE : (this.mOrientation != 1 && isLayoutRTL()) ? -1 : 1 : (this.mOrientation != 1 && isLayoutRTL()) ? 1 : -1;
    }

    private View getChildClosestToStart() {
        return getChildAt(this.mShouldReverseLayout ? getChildCount() - 1 : 0);
    }

    private View getChildClosestToEnd() {
        return getChildAt(this.mShouldReverseLayout ? 0 : getChildCount() - 1);
    }

    /* access modifiers changed from: package-private */
    public View findFirstVisibleChildClosestToStart(boolean z, boolean z2) {
        if (this.mShouldReverseLayout) {
            return findOneVisibleChild(getChildCount() - 1, -1, z, z2);
        }
        return findOneVisibleChild(0, getChildCount(), z, z2);
    }

    /* access modifiers changed from: package-private */
    public View findFirstVisibleChildClosestToEnd(boolean z, boolean z2) {
        if (this.mShouldReverseLayout) {
            return findOneVisibleChild(0, getChildCount(), z, z2);
        }
        return findOneVisibleChild(getChildCount() - 1, -1, z, z2);
    }

    /* access modifiers changed from: package-private */
    public View findReferenceChild(RecyclerView.toDoubleRange todoublerange, RecyclerView$Mean$Arithmetic recyclerView$Mean$Arithmetic, boolean z, boolean z2) {
        int i;
        int i2;
        int i3;
        RecyclerView$Mean$Arithmetic recyclerView$Mean$Arithmetic2 = recyclerView$Mean$Arithmetic;
        ensureLayoutState();
        int childCount = getChildCount();
        int i4 = -1;
        if (z2) {
            i2 = getChildCount() - 1;
            i = -1;
        } else {
            i4 = childCount;
            i2 = 0;
            i = 1;
        }
        if (recyclerView$Mean$Arithmetic2.equals) {
            i3 = recyclerView$Mean$Arithmetic2.setMax - recyclerView$Mean$Arithmetic2.getMax;
        } else {
            i3 = recyclerView$Mean$Arithmetic2.setMin;
        }
        int min = this.mOrientationHelper.getMin();
        int max = this.mOrientationHelper.setMax();
        View view = null;
        View view2 = null;
        View view3 = null;
        while (i2 != i4) {
            View childAt = getChildAt(i2);
            int position = getPosition(childAt);
            int max2 = this.mOrientationHelper.getMax(childAt);
            int max3 = this.mOrientationHelper.setMax(childAt);
            if (position >= 0 && position < i3) {
                if (!((RecyclerView.LayoutParams) childAt.getLayoutParams()).isItemRemoved()) {
                    boolean z3 = max3 <= min && max2 < min;
                    boolean z4 = max2 >= max && max3 > max;
                    if (!z3 && !z4) {
                        return childAt;
                    }
                    if (z) {
                        if (!z4) {
                            if (view != null) {
                            }
                            view = childAt;
                        }
                    } else if (!z3) {
                        if (view != null) {
                        }
                        view = childAt;
                    }
                    view2 = childAt;
                } else if (view3 == null) {
                    view3 = childAt;
                }
            }
            i2 += i;
        }
        if (view != null) {
            return view;
        }
        return view2 != null ? view2 : view3;
    }

    private View findPartiallyOrCompletelyInvisibleChildClosestToEnd() {
        if (this.mShouldReverseLayout) {
            return findFirstPartiallyOrCompletelyInvisibleChild();
        }
        return findLastPartiallyOrCompletelyInvisibleChild();
    }

    private View findPartiallyOrCompletelyInvisibleChildClosestToStart() {
        if (this.mShouldReverseLayout) {
            return findLastPartiallyOrCompletelyInvisibleChild();
        }
        return findFirstPartiallyOrCompletelyInvisibleChild();
    }

    private View findFirstPartiallyOrCompletelyInvisibleChild() {
        return findOnePartiallyOrCompletelyInvisibleChild(0, getChildCount());
    }

    private View findLastPartiallyOrCompletelyInvisibleChild() {
        return findOnePartiallyOrCompletelyInvisibleChild(getChildCount() - 1, -1);
    }

    public int findFirstVisibleItemPosition() {
        View findOneVisibleChild = findOneVisibleChild(0, getChildCount(), false, true);
        if (findOneVisibleChild == null) {
            return -1;
        }
        return getPosition(findOneVisibleChild);
    }

    public int findFirstCompletelyVisibleItemPosition() {
        View findOneVisibleChild = findOneVisibleChild(0, getChildCount(), true, false);
        if (findOneVisibleChild == null) {
            return -1;
        }
        return getPosition(findOneVisibleChild);
    }

    public int findLastVisibleItemPosition() {
        View findOneVisibleChild = findOneVisibleChild(getChildCount() - 1, -1, false, true);
        if (findOneVisibleChild == null) {
            return -1;
        }
        return getPosition(findOneVisibleChild);
    }

    public int findLastCompletelyVisibleItemPosition() {
        View findOneVisibleChild = findOneVisibleChild(getChildCount() - 1, -1, true, false);
        if (findOneVisibleChild == null) {
            return -1;
        }
        return getPosition(findOneVisibleChild);
    }

    /* access modifiers changed from: package-private */
    public View findOneVisibleChild(int i, int i2, boolean z, boolean z2) {
        ensureLayoutState();
        int i3 = 320;
        int i4 = z ? 24579 : 320;
        if (!z2) {
            i3 = 0;
        }
        if (this.mOrientation == 0) {
            return this.mHorizontalBoundCheck.setMax(i, i2, i4, i3);
        }
        return this.mVerticalBoundCheck.setMax(i, i2, i4, i3);
    }

    /* access modifiers changed from: package-private */
    public View findOnePartiallyOrCompletelyInvisibleChild(int i, int i2) {
        int i3;
        int i4;
        ensureLayoutState();
        if ((i2 > i ? 1 : i2 < i ? (char) 65535 : 0) == 0) {
            return getChildAt(i);
        }
        if (this.mOrientationHelper.getMax(getChildAt(i)) < this.mOrientationHelper.getMin()) {
            i4 = 16644;
            i3 = 16388;
        } else {
            i4 = 4161;
            i3 = 4097;
        }
        if (this.mOrientation == 0) {
            return this.mHorizontalBoundCheck.setMax(i, i2, i4, i3);
        }
        return this.mVerticalBoundCheck.setMax(i, i2, i4, i3);
    }

    public View onFocusSearchFailed(View view, int i, RecyclerView.toDoubleRange todoublerange, RecyclerView$Mean$Arithmetic recyclerView$Mean$Arithmetic) {
        int convertFocusDirectionToLayoutDirection;
        View view2;
        View view3;
        resolveShouldLayoutReverse();
        if (getChildCount() == 0 || (convertFocusDirectionToLayoutDirection = convertFocusDirectionToLayoutDirection(i)) == Integer.MIN_VALUE) {
            return null;
        }
        ensureLayoutState();
        updateLayoutState(convertFocusDirectionToLayoutDirection, (int) (((float) this.mOrientationHelper.setMin()) * MAX_SCROLL_FACTOR), false, recyclerView$Mean$Arithmetic);
        this.mLayoutState.toIntRange = Integer.MIN_VALUE;
        this.mLayoutState.getMin = false;
        fill(todoublerange, this.mLayoutState, recyclerView$Mean$Arithmetic, true);
        if (convertFocusDirectionToLayoutDirection == -1) {
            view2 = findPartiallyOrCompletelyInvisibleChildClosestToStart();
        } else {
            view2 = findPartiallyOrCompletelyInvisibleChildClosestToEnd();
        }
        if (convertFocusDirectionToLayoutDirection == -1) {
            view3 = getChildClosestToStart();
        } else {
            view3 = getChildClosestToEnd();
        }
        if (!view3.hasFocusable()) {
            return view2;
        }
        if (view2 == null) {
            return null;
        }
        return view3;
    }

    private void logChildren() {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            getPosition(childAt);
            this.mOrientationHelper.getMax(childAt);
        }
    }

    /* access modifiers changed from: package-private */
    public void validateChildOrder() {
        getChildCount();
        if (getChildCount() > 0) {
            boolean z = false;
            int position = getPosition(getChildAt(0));
            int max = this.mOrientationHelper.getMax(getChildAt(0));
            if (this.mShouldReverseLayout) {
                int i = 1;
                while (i < getChildCount()) {
                    View childAt = getChildAt(i);
                    int position2 = getPosition(childAt);
                    int max2 = this.mOrientationHelper.getMax(childAt);
                    if (position2 < position) {
                        logChildren();
                        StringBuilder sb = new StringBuilder("detected invalid position. loc invalid? ");
                        if (max2 < max) {
                            z = true;
                        }
                        sb.append(z);
                        throw new RuntimeException(sb.toString());
                    } else if (max2 <= max) {
                        i++;
                    } else {
                        logChildren();
                        throw new RuntimeException("detected invalid location");
                    }
                }
                return;
            }
            int i2 = 1;
            while (i2 < getChildCount()) {
                View childAt2 = getChildAt(i2);
                int position3 = getPosition(childAt2);
                int max3 = this.mOrientationHelper.getMax(childAt2);
                if (position3 < position) {
                    logChildren();
                    StringBuilder sb2 = new StringBuilder("detected invalid position. loc invalid? ");
                    if (max3 < max) {
                        z = true;
                    }
                    sb2.append(z);
                    throw new RuntimeException(sb2.toString());
                } else if (max3 >= max) {
                    i2++;
                } else {
                    logChildren();
                    throw new RuntimeException("detected invalid location");
                }
            }
        }
    }

    public boolean supportsPredictiveItemAnimations() {
        return this.mPendingSavedState == null && this.mLastStackFromEnd == this.mStackFromEnd;
    }

    public void prepareForDrop(@NonNull View view, @NonNull View view2, int i, int i2) {
        assertNotInLayoutOrScroll("Cannot drop a view during a scroll or layout calculation");
        ensureLayoutState();
        resolveShouldLayoutReverse();
        int position = getPosition(view);
        int position2 = getPosition(view2);
        char c = position < position2 ? (char) 1 : 65535;
        if (this.mShouldReverseLayout) {
            if (c == 1) {
                scrollToPositionWithOffset(position2, this.mOrientationHelper.setMax() - (this.mOrientationHelper.getMax(view2) + this.mOrientationHelper.setMin(view)));
            } else {
                scrollToPositionWithOffset(position2, this.mOrientationHelper.setMax() - this.mOrientationHelper.setMax(view2));
            }
        } else if (c == 65535) {
            scrollToPositionWithOffset(position2, this.mOrientationHelper.getMax(view2));
        } else {
            scrollToPositionWithOffset(position2, this.mOrientationHelper.setMax(view2) - this.mOrientationHelper.setMin(view));
        }
    }

    static class setMin {
        int IsOverlapping;
        int equals = 0;
        int getMax;
        boolean getMin = true;
        List<RecyclerView.valueOf> hashCode = null;
        int isInside = 0;
        int length;
        int setMax;
        int setMin;
        boolean toFloatRange = false;
        int toIntRange;
        boolean toString;
        int values;

        setMin() {
        }

        /* access modifiers changed from: package-private */
        public final boolean setMax(RecyclerView$Mean$Arithmetic recyclerView$Mean$Arithmetic) {
            int i;
            int i2 = this.setMin;
            if (i2 < 0) {
                return false;
            }
            if (recyclerView$Mean$Arithmetic.equals) {
                i = recyclerView$Mean$Arithmetic.setMax - recyclerView$Mean$Arithmetic.getMax;
            } else {
                i = recyclerView$Mean$Arithmetic.setMin;
            }
            return i2 < i;
        }

        /* access modifiers changed from: package-private */
        public final View getMin(RecyclerView.toDoubleRange todoublerange) {
            if (this.hashCode != null) {
                return getMin();
            }
            View max = todoublerange.getMax(this.setMin);
            this.setMin += this.getMax;
            return max;
        }

        private View getMin() {
            int size = this.hashCode.size();
            int i = 0;
            while (i < size) {
                View view = this.hashCode.get(i).itemView;
                RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
                if (layoutParams.isItemRemoved() || this.setMin != layoutParams.getViewLayoutPosition()) {
                    i++;
                } else {
                    View min = getMin(view);
                    if (min == null) {
                        this.setMin = -1;
                    } else {
                        this.setMin = ((RecyclerView.LayoutParams) min.getLayoutParams()).getViewLayoutPosition();
                    }
                    return view;
                }
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        public final View getMin(View view) {
            int viewLayoutPosition;
            int size = this.hashCode.size();
            View view2 = null;
            int i = Integer.MAX_VALUE;
            for (int i2 = 0; i2 < size; i2++) {
                View view3 = this.hashCode.get(i2).itemView;
                RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view3.getLayoutParams();
                if (view3 != view && !layoutParams.isItemRemoved() && (viewLayoutPosition = (layoutParams.getViewLayoutPosition() - this.setMin) * this.getMax) >= 0 && viewLayoutPosition < i) {
                    view2 = view3;
                    if (viewLayoutPosition == 0) {
                        break;
                    }
                    i = viewLayoutPosition;
                }
            }
            return view2;
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() {
            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new SavedState[i];
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }
        };
        boolean length;
        int setMax;
        int setMin;

        public int describeContents() {
            return 0;
        }

        public SavedState() {
        }

        SavedState(Parcel parcel) {
            this.setMax = parcel.readInt();
            this.setMin = parcel.readInt();
            this.length = parcel.readInt() != 1 ? false : true;
        }

        public SavedState(SavedState savedState) {
            this.setMax = savedState.setMax;
            this.setMin = savedState.setMin;
            this.length = savedState.length;
        }

        /* access modifiers changed from: package-private */
        public final boolean length() {
            return this.setMax >= 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.setMax);
            parcel.writeInt(this.setMin);
            parcel.writeInt(this.length ? 1 : 0);
        }
    }

    static class getMin {
        int getMax = -1;
        int getMin = Integer.MIN_VALUE;
        boolean length = false;
        boolean setMax = false;
        close setMin;

        getMin() {
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("AnchorInfo{mPosition=");
            sb.append(this.getMax);
            sb.append(", mCoordinate=");
            sb.append(this.getMin);
            sb.append(", mLayoutFromEnd=");
            sb.append(this.setMax);
            sb.append(", mValid=");
            sb.append(this.length);
            sb.append('}');
            return sb.toString();
        }

        static boolean length(View view, RecyclerView$Mean$Arithmetic recyclerView$Mean$Arithmetic) {
            int i;
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
            if (layoutParams.isItemRemoved() || layoutParams.getViewLayoutPosition() < 0) {
                return false;
            }
            int viewLayoutPosition = layoutParams.getViewLayoutPosition();
            if (recyclerView$Mean$Arithmetic.equals) {
                i = recyclerView$Mean$Arithmetic.setMax - recyclerView$Mean$Arithmetic.getMax;
            } else {
                i = recyclerView$Mean$Arithmetic.setMin;
            }
            return viewLayoutPosition < i;
        }

        public final void setMin(View view, int i) {
            close close = this.setMin;
            int min = Integer.MIN_VALUE == close.getMin ? 0 : close.setMin() - close.getMin;
            if (min >= 0) {
                getMax(view, i);
                return;
            }
            this.getMax = i;
            if (this.setMax) {
                int max = (this.setMin.setMax() - min) - this.setMin.setMax(view);
                this.getMin = this.setMin.setMax() - max;
                if (max > 0) {
                    int min2 = this.getMin - this.setMin.setMin(view);
                    int min3 = this.setMin.getMin();
                    int min4 = min2 - (min3 + Math.min(this.setMin.getMax(view) - min3, 0));
                    if (min4 < 0) {
                        this.getMin += Math.min(max, -min4);
                        return;
                    }
                    return;
                }
                return;
            }
            int max2 = this.setMin.getMax(view);
            int min5 = max2 - this.setMin.getMin();
            this.getMin = max2;
            if (min5 > 0) {
                int max3 = (this.setMin.setMax() - Math.min(0, (this.setMin.setMax() - min) - this.setMin.setMax(view))) - (max2 + this.setMin.setMin(view));
                if (max3 < 0) {
                    this.getMin -= Math.min(min5, -max3);
                }
            }
        }

        public final void getMax(View view, int i) {
            if (this.setMax) {
                int max = this.setMin.setMax(view);
                close close = this.setMin;
                this.getMin = max + (Integer.MIN_VALUE == close.getMin ? 0 : close.setMin() - close.getMin);
            } else {
                this.getMin = this.setMin.getMax(view);
            }
            this.getMax = i;
        }
    }

    protected static class length {
        public boolean getMax;
        public boolean getMin;
        public int length;
        public boolean setMax;

        protected length() {
        }
    }
}
