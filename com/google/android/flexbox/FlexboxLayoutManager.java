package com.google.android.flexbox;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$Mean$Arithmetic;
import com.google.android.flexbox.FlexboxHelper;
import java.util.ArrayList;
import java.util.List;
import o.close;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;
import o.performShortcut;

public class FlexboxLayoutManager extends RecyclerView.IsOverlapping implements FlexContainer, RecyclerView.values.length {
    static final /* synthetic */ boolean $assertionsDisabled = (!FlexboxLayoutManager.class.desiredAssertionStatus());
    private static final boolean DEBUG = false;
    private static final String TAG = "FlexboxLayoutManager";
    private static final Rect TEMP_RECT = new Rect();
    private int mAlignItems;
    private AnchorInfo mAnchorInfo;
    private final Context mContext;
    private int mDirtyPosition;
    /* access modifiers changed from: private */
    public int mFlexDirection;
    /* access modifiers changed from: private */
    public List<FlexLine> mFlexLines;
    private FlexboxHelper.FlexLinesResult mFlexLinesResult;
    /* access modifiers changed from: private */
    public int mFlexWrap;
    /* access modifiers changed from: private */
    public final FlexboxHelper mFlexboxHelper;
    private boolean mFromBottomToTop;
    /* access modifiers changed from: private */
    public boolean mIsRtl;
    private int mJustifyContent;
    private int mLastHeight;
    private int mLastWidth;
    private LayoutState mLayoutState;
    private int mMaxLine;
    /* access modifiers changed from: private */
    public close mOrientationHelper;
    private View mParent;
    private SavedState mPendingSavedState;
    private int mPendingScrollPosition;
    private int mPendingScrollPositionOffset;
    private boolean mRecycleChildrenOnDetach;
    private RecyclerView.toDoubleRange mRecycler;
    private RecyclerView$Mean$Arithmetic mState;
    /* access modifiers changed from: private */
    public close mSubOrientationHelper;
    private SparseArray<View> mViewCache;

    public int getAlignContent() {
        return 5;
    }

    public void onNewFlexLineAdded(FlexLine flexLine) {
    }

    public FlexboxLayoutManager(Context context) {
        this(context, 0, 1);
    }

    public FlexboxLayoutManager(Context context, int i) {
        this(context, i, 1);
    }

    public FlexboxLayoutManager(Context context, int i, int i2) {
        this.mMaxLine = -1;
        this.mFlexLines = new ArrayList();
        this.mFlexboxHelper = new FlexboxHelper(this);
        this.mAnchorInfo = new AnchorInfo();
        this.mPendingScrollPosition = -1;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        this.mLastWidth = Integer.MIN_VALUE;
        this.mLastHeight = Integer.MIN_VALUE;
        this.mViewCache = new SparseArray<>();
        this.mDirtyPosition = -1;
        this.mFlexLinesResult = new FlexboxHelper.FlexLinesResult();
        setFlexDirection(i);
        setFlexWrap(i2);
        setAlignItems(4);
        setAutoMeasureEnabled(true);
        this.mContext = context;
    }

    public FlexboxLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.mMaxLine = -1;
        this.mFlexLines = new ArrayList();
        this.mFlexboxHelper = new FlexboxHelper(this);
        this.mAnchorInfo = new AnchorInfo();
        this.mPendingScrollPosition = -1;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        this.mLastWidth = Integer.MIN_VALUE;
        this.mLastHeight = Integer.MIN_VALUE;
        this.mViewCache = new SparseArray<>();
        this.mDirtyPosition = -1;
        this.mFlexLinesResult = new FlexboxHelper.FlexLinesResult();
        RecyclerView.IsOverlapping.setMax properties = getProperties(context, attributeSet, i, i2);
        int i3 = properties.setMax;
        if (i3 != 0) {
            if (i3 == 1) {
                if (properties.setMin) {
                    setFlexDirection(3);
                } else {
                    setFlexDirection(2);
                }
            }
        } else if (properties.setMin) {
            setFlexDirection(1);
        } else {
            setFlexDirection(0);
        }
        setFlexWrap(1);
        setAlignItems(4);
        setAutoMeasureEnabled(true);
        this.mContext = context;
    }

    public int getFlexDirection() {
        return this.mFlexDirection;
    }

    public void setFlexDirection(int i) {
        if (this.mFlexDirection != i) {
            removeAllViews();
            this.mFlexDirection = i;
            this.mOrientationHelper = null;
            this.mSubOrientationHelper = null;
            clearFlexLines();
            requestLayout();
        }
    }

    public int getFlexWrap() {
        return this.mFlexWrap;
    }

    public void setFlexWrap(int i) {
        if (i != 2) {
            int i2 = this.mFlexWrap;
            if (i2 != i) {
                if (i2 == 0 || i == 0) {
                    removeAllViews();
                    clearFlexLines();
                }
                this.mFlexWrap = i;
                this.mOrientationHelper = null;
                this.mSubOrientationHelper = null;
                requestLayout();
                return;
            }
            return;
        }
        throw new UnsupportedOperationException("wrap_reverse is not supported in FlexboxLayoutManager");
    }

    public int getJustifyContent() {
        return this.mJustifyContent;
    }

    public void setJustifyContent(int i) {
        if (this.mJustifyContent != i) {
            this.mJustifyContent = i;
            requestLayout();
        }
    }

    public int getAlignItems() {
        return this.mAlignItems;
    }

    public void setAlignItems(int i) {
        int i2 = this.mAlignItems;
        if (i2 != i) {
            if (i2 == 4 || i == 4) {
                removeAllViews();
                clearFlexLines();
            }
            this.mAlignItems = i;
            requestLayout();
        }
    }

    public void setAlignContent(int i) {
        throw new UnsupportedOperationException("Setting the alignContent in the FlexboxLayoutManager is not supported. Use FlexboxLayout if you need to use this attribute.");
    }

    public int getMaxLine() {
        return this.mMaxLine;
    }

    public void setMaxLine(int i) {
        if (this.mMaxLine != i) {
            this.mMaxLine = i;
            requestLayout();
        }
    }

    public List<FlexLine> getFlexLines() {
        ArrayList arrayList = new ArrayList(this.mFlexLines.size());
        int size = this.mFlexLines.size();
        for (int i = 0; i < size; i++) {
            FlexLine flexLine = this.mFlexLines.get(i);
            if (flexLine.getItemCount() != 0) {
                arrayList.add(flexLine);
            }
        }
        return arrayList;
    }

    public int getDecorationLengthMainAxis(View view, int i, int i2) {
        int topDecorationHeight;
        int bottomDecorationHeight;
        if (isMainAxisDirectionHorizontal()) {
            topDecorationHeight = getLeftDecorationWidth(view);
            bottomDecorationHeight = getRightDecorationWidth(view);
        } else {
            topDecorationHeight = getTopDecorationHeight(view);
            bottomDecorationHeight = getBottomDecorationHeight(view);
        }
        return topDecorationHeight + bottomDecorationHeight;
    }

    public int getDecorationLengthCrossAxis(View view) {
        int leftDecorationWidth;
        int rightDecorationWidth;
        if (isMainAxisDirectionHorizontal()) {
            leftDecorationWidth = getTopDecorationHeight(view);
            rightDecorationWidth = getBottomDecorationHeight(view);
        } else {
            leftDecorationWidth = getLeftDecorationWidth(view);
            rightDecorationWidth = getRightDecorationWidth(view);
        }
        return leftDecorationWidth + rightDecorationWidth;
    }

    public void onNewFlexItemAdded(View view, int i, int i2, FlexLine flexLine) {
        calculateItemDecorationsForChild(view, TEMP_RECT);
        if (isMainAxisDirectionHorizontal()) {
            int leftDecorationWidth = getLeftDecorationWidth(view) + getRightDecorationWidth(view);
            flexLine.mMainSize += leftDecorationWidth;
            flexLine.mDividerLengthInMainSize += leftDecorationWidth;
            return;
        }
        int topDecorationHeight = getTopDecorationHeight(view) + getBottomDecorationHeight(view);
        flexLine.mMainSize += topDecorationHeight;
        flexLine.mDividerLengthInMainSize += topDecorationHeight;
    }

    public int getFlexItemCount() {
        RecyclerView$Mean$Arithmetic recyclerView$Mean$Arithmetic = this.mState;
        if (recyclerView$Mean$Arithmetic.equals) {
            return recyclerView$Mean$Arithmetic.setMax - recyclerView$Mean$Arithmetic.getMax;
        }
        return recyclerView$Mean$Arithmetic.setMin;
    }

    public View getFlexItemAt(int i) {
        View view = this.mViewCache.get(i);
        if (view != null) {
            return view;
        }
        return this.mRecycler.setMax(i);
    }

    public View getReorderedFlexItemAt(int i) {
        return getFlexItemAt(i);
    }

    public int getChildWidthMeasureSpec(int i, int i2, int i3) {
        return getChildMeasureSpec(getWidth(), getWidthMode(), i2, i3, canScrollHorizontally());
    }

    public int getChildHeightMeasureSpec(int i, int i2, int i3) {
        return getChildMeasureSpec(getHeight(), getHeightMode(), i2, i3, canScrollVertically());
    }

    public int getLargestMainSize() {
        if (this.mFlexLines.size() == 0) {
            return 0;
        }
        int i = Integer.MIN_VALUE;
        int size = this.mFlexLines.size();
        for (int i2 = 0; i2 < size; i2++) {
            i = Math.max(i, this.mFlexLines.get(i2).mMainSize);
        }
        return i;
    }

    public int getSumOfCrossSize() {
        int size = this.mFlexLines.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += this.mFlexLines.get(i2).mCrossSize;
        }
        return i;
    }

    public void setFlexLines(List<FlexLine> list) {
        this.mFlexLines = list;
    }

    public List<FlexLine> getFlexLinesInternal() {
        return this.mFlexLines;
    }

    public void updateViewCache(int i, View view) {
        this.mViewCache.put(i, view);
    }

    public PointF computeScrollVectorForPosition(int i) {
        if (getChildCount() == 0) {
            return null;
        }
        int i2 = i < getPosition(getChildAt(0)) ? -1 : 1;
        if (isMainAxisDirectionHorizontal()) {
            return new PointF(0.0f, (float) i2);
        }
        return new PointF((float) i2, 0.0f);
    }

    public RecyclerView.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-2, -2);
    }

    public RecyclerView.LayoutParams generateLayoutParams(Context context, AttributeSet attributeSet) {
        return new LayoutParams(context, attributeSet);
    }

    public boolean checkLayoutParams(RecyclerView.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    public void onAdapterChanged(RecyclerView.Adapter adapter, RecyclerView.Adapter adapter2) {
        removeAllViews();
    }

    public Parcelable onSaveInstanceState() {
        if (this.mPendingSavedState != null) {
            return new SavedState(this.mPendingSavedState);
        }
        SavedState savedState = new SavedState();
        if (getChildCount() > 0) {
            View childClosestToStart = getChildClosestToStart();
            int unused = savedState.mAnchorPosition = getPosition(childClosestToStart);
            int unused2 = savedState.mAnchorOffset = this.mOrientationHelper.getMax(childClosestToStart) - this.mOrientationHelper.getMin();
        } else {
            savedState.invalidateAnchor();
        }
        return savedState;
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            this.mPendingSavedState = (SavedState) parcelable;
            requestLayout();
        }
    }

    public void onItemsAdded(@NonNull RecyclerView recyclerView, int i, int i2) {
        super.onItemsAdded(recyclerView, i, i2);
        updateDirtyPosition(i);
    }

    public void onItemsUpdated(@NonNull RecyclerView recyclerView, int i, int i2, Object obj) {
        super.onItemsUpdated(recyclerView, i, i2, obj);
        updateDirtyPosition(i);
    }

    public void onItemsUpdated(@NonNull RecyclerView recyclerView, int i, int i2) {
        int max = dispatchOnCancelled.setMax(i);
        if (i != max) {
            onCanceled oncanceled = new onCanceled(i, max, 1);
            onCancelLoad.setMax(-1286417319, oncanceled);
            onCancelLoad.getMin(-1286417319, oncanceled);
        }
        super.onItemsUpdated(recyclerView, i, i2);
        updateDirtyPosition(i);
    }

    public void onItemsRemoved(@NonNull RecyclerView recyclerView, int i, int i2) {
        super.onItemsRemoved(recyclerView, i, i2);
        updateDirtyPosition(i);
    }

    public void onItemsMoved(@NonNull RecyclerView recyclerView, int i, int i2, int i3) {
        super.onItemsMoved(recyclerView, i, i2, i3);
        updateDirtyPosition(Math.min(i, i2));
    }

    private void updateDirtyPosition(int i) {
        if (i < findLastVisibleItemPosition()) {
            int childCount = getChildCount();
            this.mFlexboxHelper.ensureMeasureSpecCache(childCount);
            this.mFlexboxHelper.ensureMeasuredSizeCache(childCount);
            this.mFlexboxHelper.ensureIndexToFlexLine(childCount);
            if (!$assertionsDisabled && this.mFlexboxHelper.mIndexToFlexLine == null) {
                throw new AssertionError();
            } else if (i < this.mFlexboxHelper.mIndexToFlexLine.length) {
                this.mDirtyPosition = i;
                View childClosestToStart = getChildClosestToStart();
                if (childClosestToStart != null) {
                    this.mPendingScrollPosition = getPosition(childClosestToStart);
                    if (isMainAxisDirectionHorizontal() || !this.mIsRtl) {
                        this.mPendingScrollPositionOffset = this.mOrientationHelper.getMax(childClosestToStart) - this.mOrientationHelper.getMin();
                    } else {
                        this.mPendingScrollPositionOffset = this.mOrientationHelper.setMax(childClosestToStart) + this.mOrientationHelper.length();
                    }
                }
            }
        }
    }

    public void onLayoutChildren(RecyclerView.toDoubleRange todoublerange, RecyclerView$Mean$Arithmetic recyclerView$Mean$Arithmetic) {
        int i;
        int i2;
        int i3;
        this.mRecycler = todoublerange;
        this.mState = recyclerView$Mean$Arithmetic;
        if (recyclerView$Mean$Arithmetic.equals) {
            i = recyclerView$Mean$Arithmetic.setMax - recyclerView$Mean$Arithmetic.getMax;
        } else {
            i = recyclerView$Mean$Arithmetic.setMin;
        }
        if (i != 0 || !recyclerView$Mean$Arithmetic.setMax()) {
            resolveLayoutDirection();
            ensureOrientationHelper();
            ensureLayoutState();
            this.mFlexboxHelper.ensureMeasureSpecCache(i);
            this.mFlexboxHelper.ensureMeasuredSizeCache(i);
            this.mFlexboxHelper.ensureIndexToFlexLine(i);
            boolean unused = this.mLayoutState.mShouldRecycle = false;
            SavedState savedState = this.mPendingSavedState;
            if (savedState != null && savedState.hasValidAnchor(i)) {
                this.mPendingScrollPosition = this.mPendingSavedState.mAnchorPosition;
            }
            if (!(this.mAnchorInfo.mValid && this.mPendingScrollPosition == -1 && this.mPendingSavedState == null)) {
                this.mAnchorInfo.reset();
                updateAnchorInfoForLayout(recyclerView$Mean$Arithmetic, this.mAnchorInfo);
                boolean unused2 = this.mAnchorInfo.mValid = true;
            }
            detachAndScrapAttachedViews(todoublerange);
            if (this.mAnchorInfo.mLayoutFromEnd) {
                updateLayoutStateToFillStart(this.mAnchorInfo, false, true);
            } else {
                updateLayoutStateToFillEnd(this.mAnchorInfo, false, true);
            }
            updateFlexLines(i);
            if (this.mAnchorInfo.mLayoutFromEnd) {
                fill(todoublerange, recyclerView$Mean$Arithmetic, this.mLayoutState);
                i3 = this.mLayoutState.mOffset;
                updateLayoutStateToFillEnd(this.mAnchorInfo, true, false);
                fill(todoublerange, recyclerView$Mean$Arithmetic, this.mLayoutState);
                i2 = this.mLayoutState.mOffset;
            } else {
                fill(todoublerange, recyclerView$Mean$Arithmetic, this.mLayoutState);
                i2 = this.mLayoutState.mOffset;
                updateLayoutStateToFillStart(this.mAnchorInfo, true, false);
                fill(todoublerange, recyclerView$Mean$Arithmetic, this.mLayoutState);
                i3 = this.mLayoutState.mOffset;
            }
            if (getChildCount() <= 0) {
                return;
            }
            if (this.mAnchorInfo.mLayoutFromEnd) {
                fixLayoutStartGap(i3 + fixLayoutEndGap(i2, todoublerange, recyclerView$Mean$Arithmetic, true), todoublerange, recyclerView$Mean$Arithmetic, false);
            } else {
                fixLayoutEndGap(i2 + fixLayoutStartGap(i3, todoublerange, recyclerView$Mean$Arithmetic, true), todoublerange, recyclerView$Mean$Arithmetic, false);
            }
        }
    }

    private int fixLayoutStartGap(int i, RecyclerView.toDoubleRange todoublerange, RecyclerView$Mean$Arithmetic recyclerView$Mean$Arithmetic, boolean z) {
        int i2;
        int min;
        if (isMainAxisDirectionHorizontal() || !this.mIsRtl) {
            int min2 = i - this.mOrientationHelper.getMin();
            if (min2 <= 0) {
                return 0;
            }
            i2 = -handleScrollingMainOrientation(min2, todoublerange, recyclerView$Mean$Arithmetic);
        } else {
            int max = this.mOrientationHelper.setMax() - i;
            if (max <= 0) {
                return 0;
            }
            i2 = handleScrollingMainOrientation(-max, todoublerange, recyclerView$Mean$Arithmetic);
        }
        int i3 = i + i2;
        if (!z || (min = i3 - this.mOrientationHelper.getMin()) <= 0) {
            return i2;
        }
        this.mOrientationHelper.getMin(-min);
        return i2 - min;
    }

    private int fixLayoutEndGap(int i, RecyclerView.toDoubleRange todoublerange, RecyclerView$Mean$Arithmetic recyclerView$Mean$Arithmetic, boolean z) {
        int i2;
        int max;
        if (!isMainAxisDirectionHorizontal() && this.mIsRtl) {
            int min = i - this.mOrientationHelper.getMin();
            if (min <= 0) {
                return 0;
            }
            i2 = handleScrollingMainOrientation(min, todoublerange, recyclerView$Mean$Arithmetic);
        } else {
            int max2 = this.mOrientationHelper.setMax() - i;
            if (max2 <= 0) {
                return 0;
            }
            i2 = -handleScrollingMainOrientation(-max2, todoublerange, recyclerView$Mean$Arithmetic);
        }
        int i3 = i + i2;
        if (!z || (max = this.mOrientationHelper.setMax() - i3) <= 0) {
            return i2;
        }
        this.mOrientationHelper.getMin(max);
        return max + i2;
    }

    private void updateFlexLines(int i) {
        int i2;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getWidth(), getWidthMode());
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getHeight(), getHeightMode());
        int width = getWidth();
        int height = getHeight();
        boolean z = true;
        if (isMainAxisDirectionHorizontal()) {
            int i3 = this.mLastWidth;
            if (i3 == Integer.MIN_VALUE || i3 == width) {
                z = false;
            }
            if (this.mLayoutState.mInfinite) {
                i2 = this.mContext.getResources().getDisplayMetrics().heightPixels;
            } else {
                i2 = this.mLayoutState.mAvailable;
            }
        } else {
            int i4 = this.mLastHeight;
            if (i4 == Integer.MIN_VALUE || i4 == height) {
                z = false;
            }
            if (this.mLayoutState.mInfinite) {
                i2 = this.mContext.getResources().getDisplayMetrics().widthPixels;
            } else {
                i2 = this.mLayoutState.mAvailable;
            }
        }
        int i5 = i2;
        this.mLastWidth = width;
        this.mLastHeight = height;
        if (this.mDirtyPosition != -1 || (this.mPendingScrollPosition == -1 && !z)) {
            int i6 = this.mDirtyPosition;
            int min = i6 != -1 ? Math.min(i6, this.mAnchorInfo.mPosition) : this.mAnchorInfo.mPosition;
            this.mFlexLinesResult.reset();
            if (isMainAxisDirectionHorizontal()) {
                if (this.mFlexLines.size() > 0) {
                    this.mFlexboxHelper.clearFlexLines(this.mFlexLines, min);
                    this.mFlexboxHelper.calculateFlexLines(this.mFlexLinesResult, makeMeasureSpec, makeMeasureSpec2, i5, min, this.mAnchorInfo.mPosition, this.mFlexLines);
                } else {
                    this.mFlexboxHelper.ensureIndexToFlexLine(i);
                    this.mFlexboxHelper.calculateHorizontalFlexLines(this.mFlexLinesResult, makeMeasureSpec, makeMeasureSpec2, i5, 0, this.mFlexLines);
                }
            } else if (this.mFlexLines.size() > 0) {
                this.mFlexboxHelper.clearFlexLines(this.mFlexLines, min);
                this.mFlexboxHelper.calculateFlexLines(this.mFlexLinesResult, makeMeasureSpec2, makeMeasureSpec, i5, min, this.mAnchorInfo.mPosition, this.mFlexLines);
            } else {
                this.mFlexboxHelper.ensureIndexToFlexLine(i);
                this.mFlexboxHelper.calculateVerticalFlexLines(this.mFlexLinesResult, makeMeasureSpec, makeMeasureSpec2, i5, 0, this.mFlexLines);
            }
            this.mFlexLines = this.mFlexLinesResult.mFlexLines;
            this.mFlexboxHelper.determineMainSize(makeMeasureSpec, makeMeasureSpec2, min);
            this.mFlexboxHelper.stretchViews(min);
        } else if (!this.mAnchorInfo.mLayoutFromEnd) {
            this.mFlexLines.clear();
            if ($assertionsDisabled || this.mFlexboxHelper.mIndexToFlexLine != null) {
                this.mFlexLinesResult.reset();
                if (isMainAxisDirectionHorizontal()) {
                    this.mFlexboxHelper.calculateHorizontalFlexLinesToIndex(this.mFlexLinesResult, makeMeasureSpec, makeMeasureSpec2, i5, this.mAnchorInfo.mPosition, this.mFlexLines);
                } else {
                    this.mFlexboxHelper.calculateVerticalFlexLinesToIndex(this.mFlexLinesResult, makeMeasureSpec, makeMeasureSpec2, i5, this.mAnchorInfo.mPosition, this.mFlexLines);
                }
                this.mFlexLines = this.mFlexLinesResult.mFlexLines;
                this.mFlexboxHelper.determineMainSize(makeMeasureSpec, makeMeasureSpec2);
                this.mFlexboxHelper.stretchViews();
                int unused = this.mAnchorInfo.mFlexLinePosition = this.mFlexboxHelper.mIndexToFlexLine[this.mAnchorInfo.mPosition];
                int unused2 = this.mLayoutState.mFlexLinePosition = this.mAnchorInfo.mFlexLinePosition;
                return;
            }
            throw new AssertionError();
        }
    }

    public void onLayoutCompleted(RecyclerView$Mean$Arithmetic recyclerView$Mean$Arithmetic) {
        super.onLayoutCompleted(recyclerView$Mean$Arithmetic);
        this.mPendingSavedState = null;
        this.mPendingScrollPosition = -1;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        this.mDirtyPosition = -1;
        this.mAnchorInfo.reset();
        this.mViewCache.clear();
    }

    /* access modifiers changed from: package-private */
    public boolean isLayoutRtl() {
        return this.mIsRtl;
    }

    private void resolveLayoutDirection() {
        int layoutDirection = getLayoutDirection();
        int i = this.mFlexDirection;
        boolean z = false;
        if (i == 0) {
            this.mIsRtl = layoutDirection == 1;
            if (this.mFlexWrap == 2) {
                z = true;
            }
            this.mFromBottomToTop = z;
        } else if (i == 1) {
            this.mIsRtl = layoutDirection != 1;
            if (this.mFlexWrap == 2) {
                z = true;
            }
            this.mFromBottomToTop = z;
        } else if (i == 2) {
            boolean z2 = layoutDirection == 1;
            this.mIsRtl = z2;
            if (this.mFlexWrap == 2) {
                this.mIsRtl = !z2;
            }
            this.mFromBottomToTop = false;
        } else if (i != 3) {
            this.mIsRtl = false;
            this.mFromBottomToTop = false;
        } else {
            if (layoutDirection == 1) {
                z = true;
            }
            this.mIsRtl = z;
            if (this.mFlexWrap == 2) {
                this.mIsRtl = !z;
            }
            this.mFromBottomToTop = true;
        }
    }

    private void updateAnchorInfoForLayout(RecyclerView$Mean$Arithmetic recyclerView$Mean$Arithmetic, AnchorInfo anchorInfo) {
        if (!updateAnchorFromPendingState(recyclerView$Mean$Arithmetic, anchorInfo, this.mPendingSavedState) && !updateAnchorFromChildren(recyclerView$Mean$Arithmetic, anchorInfo)) {
            anchorInfo.assignCoordinateFromPadding();
            int unused = anchorInfo.mPosition = 0;
            int unused2 = anchorInfo.mFlexLinePosition = 0;
        }
    }

    private boolean updateAnchorFromPendingState(RecyclerView$Mean$Arithmetic recyclerView$Mean$Arithmetic, AnchorInfo anchorInfo, SavedState savedState) {
        int i;
        int i2;
        int i3;
        int i4;
        if ($assertionsDisabled || this.mFlexboxHelper.mIndexToFlexLine != null) {
            boolean z = false;
            if (!recyclerView$Mean$Arithmetic.setMax() && (i = this.mPendingScrollPosition) != -1) {
                if (i >= 0) {
                    if (recyclerView$Mean$Arithmetic.equals) {
                        i2 = recyclerView$Mean$Arithmetic.setMax - recyclerView$Mean$Arithmetic.getMax;
                    } else {
                        i2 = recyclerView$Mean$Arithmetic.setMin;
                    }
                    if (i < i2) {
                        int unused = anchorInfo.mPosition = this.mPendingScrollPosition;
                        int unused2 = anchorInfo.mFlexLinePosition = this.mFlexboxHelper.mIndexToFlexLine[anchorInfo.mPosition];
                        SavedState savedState2 = this.mPendingSavedState;
                        if (savedState2 != null) {
                            if (recyclerView$Mean$Arithmetic.equals) {
                                i4 = recyclerView$Mean$Arithmetic.setMax - recyclerView$Mean$Arithmetic.getMax;
                            } else {
                                i4 = recyclerView$Mean$Arithmetic.setMin;
                            }
                            if (savedState2.hasValidAnchor(i4)) {
                                int unused3 = anchorInfo.mCoordinate = this.mOrientationHelper.getMin() + savedState.mAnchorOffset;
                                boolean unused4 = anchorInfo.mAssignedFromSavedState = true;
                                int unused5 = anchorInfo.mFlexLinePosition = -1;
                                return true;
                            }
                        }
                        if (this.mPendingScrollPositionOffset == Integer.MIN_VALUE) {
                            View findViewByPosition = findViewByPosition(this.mPendingScrollPosition);
                            if (findViewByPosition == null) {
                                if (getChildCount() > 0) {
                                    if (this.mPendingScrollPosition < getPosition(getChildAt(0))) {
                                        z = true;
                                    }
                                    boolean unused6 = anchorInfo.mLayoutFromEnd = z;
                                }
                                anchorInfo.assignCoordinateFromPadding();
                            } else if (this.mOrientationHelper.setMin(findViewByPosition) > this.mOrientationHelper.setMin()) {
                                anchorInfo.assignCoordinateFromPadding();
                                return true;
                            } else if (this.mOrientationHelper.getMax(findViewByPosition) - this.mOrientationHelper.getMin() < 0) {
                                int unused7 = anchorInfo.mCoordinate = this.mOrientationHelper.getMin();
                                boolean unused8 = anchorInfo.mLayoutFromEnd = false;
                                return true;
                            } else if (this.mOrientationHelper.setMax() - this.mOrientationHelper.setMax(findViewByPosition) < 0) {
                                int unused9 = anchorInfo.mCoordinate = this.mOrientationHelper.setMax();
                                boolean unused10 = anchorInfo.mLayoutFromEnd = true;
                                return true;
                            } else {
                                if (anchorInfo.mLayoutFromEnd) {
                                    int max = this.mOrientationHelper.setMax(findViewByPosition);
                                    close close = this.mOrientationHelper;
                                    if (Integer.MIN_VALUE != close.getMin) {
                                        z = close.setMin() - close.getMin;
                                    }
                                    i3 = max + (z ? 1 : 0);
                                } else {
                                    i3 = this.mOrientationHelper.getMax(findViewByPosition);
                                }
                                int unused11 = anchorInfo.mCoordinate = i3;
                            }
                            return true;
                        }
                        if (isMainAxisDirectionHorizontal() || !this.mIsRtl) {
                            int unused12 = anchorInfo.mCoordinate = this.mOrientationHelper.getMin() + this.mPendingScrollPositionOffset;
                        } else {
                            int unused13 = anchorInfo.mCoordinate = this.mPendingScrollPositionOffset - this.mOrientationHelper.length();
                        }
                        return true;
                    }
                }
                this.mPendingScrollPosition = -1;
                this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
            }
            return false;
        }
        throw new AssertionError();
    }

    private boolean updateAnchorFromChildren(RecyclerView$Mean$Arithmetic recyclerView$Mean$Arithmetic, AnchorInfo anchorInfo) {
        View view;
        int i;
        int i2;
        int i3;
        boolean z = false;
        if (getChildCount() == 0) {
            return false;
        }
        if (anchorInfo.mLayoutFromEnd) {
            if (recyclerView$Mean$Arithmetic.equals) {
                i3 = recyclerView$Mean$Arithmetic.setMax - recyclerView$Mean$Arithmetic.getMax;
            } else {
                i3 = recyclerView$Mean$Arithmetic.setMin;
            }
            view = findLastReferenceChild(i3);
        } else {
            if (recyclerView$Mean$Arithmetic.equals) {
                i2 = recyclerView$Mean$Arithmetic.setMax - recyclerView$Mean$Arithmetic.getMax;
            } else {
                i2 = recyclerView$Mean$Arithmetic.setMin;
            }
            view = findFirstReferenceChild(i2);
        }
        if (view == null) {
            return false;
        }
        anchorInfo.assignFromView(view);
        if (!recyclerView$Mean$Arithmetic.setMax() && supportsPredictiveItemAnimations()) {
            if (this.mOrientationHelper.getMax(view) >= this.mOrientationHelper.setMax() || this.mOrientationHelper.setMax(view) < this.mOrientationHelper.getMin()) {
                z = true;
            }
            if (z) {
                if (anchorInfo.mLayoutFromEnd) {
                    i = this.mOrientationHelper.setMax();
                } else {
                    i = this.mOrientationHelper.getMin();
                }
                int unused = anchorInfo.mCoordinate = i;
            }
        }
        return true;
    }

    private View findFirstReferenceChild(int i) {
        int i2;
        if ($assertionsDisabled || this.mFlexboxHelper.mIndexToFlexLine != null) {
            View findReferenceChild = findReferenceChild(0, getChildCount(), i);
            if (findReferenceChild == null || (i2 = this.mFlexboxHelper.mIndexToFlexLine[getPosition(findReferenceChild)]) == -1) {
                return null;
            }
            return findFirstReferenceViewInLine(findReferenceChild, this.mFlexLines.get(i2));
        }
        throw new AssertionError();
    }

    private View findLastReferenceChild(int i) {
        if ($assertionsDisabled || this.mFlexboxHelper.mIndexToFlexLine != null) {
            View findReferenceChild = findReferenceChild(getChildCount() - 1, -1, i);
            if (findReferenceChild == null) {
                return null;
            }
            return findLastReferenceViewInLine(findReferenceChild, this.mFlexLines.get(this.mFlexboxHelper.mIndexToFlexLine[getPosition(findReferenceChild)]));
        }
        throw new AssertionError();
    }

    private View findReferenceChild(int i, int i2, int i3) {
        ensureOrientationHelper();
        ensureLayoutState();
        int min = this.mOrientationHelper.getMin();
        int max = this.mOrientationHelper.setMax();
        int i4 = i2 > i ? 1 : -1;
        View view = null;
        View view2 = null;
        while (i != i2) {
            View childAt = getChildAt(i);
            int position = getPosition(childAt);
            if (position >= 0 && position < i3) {
                if (((RecyclerView.LayoutParams) childAt.getLayoutParams()).isItemRemoved()) {
                    if (view2 == null) {
                        view2 = childAt;
                    }
                } else if (this.mOrientationHelper.getMax(childAt) >= min && this.mOrientationHelper.setMax(childAt) <= max) {
                    return childAt;
                } else {
                    if (view == null) {
                        view = childAt;
                    }
                }
            }
            i += i4;
        }
        return view != null ? view : view2;
    }

    private View getChildClosestToStart() {
        return getChildAt(0);
    }

    private int fill(RecyclerView.toDoubleRange todoublerange, RecyclerView$Mean$Arithmetic recyclerView$Mean$Arithmetic, LayoutState layoutState) {
        if (layoutState.mScrollingOffset != Integer.MIN_VALUE) {
            if (layoutState.mAvailable < 0) {
                int unused = layoutState.mScrollingOffset = layoutState.mScrollingOffset + layoutState.mAvailable;
            }
            recycleByLayoutState(todoublerange, layoutState);
        }
        int access$1200 = layoutState.mAvailable;
        int access$12002 = layoutState.mAvailable;
        int i = 0;
        boolean isMainAxisDirectionHorizontal = isMainAxisDirectionHorizontal();
        while (true) {
            if ((access$12002 > 0 || this.mLayoutState.mInfinite) && layoutState.hasMore(recyclerView$Mean$Arithmetic, this.mFlexLines)) {
                FlexLine flexLine = this.mFlexLines.get(layoutState.mFlexLinePosition);
                int unused2 = layoutState.mPosition = flexLine.mFirstIndex;
                i += layoutFlexLine(flexLine, layoutState);
                if (isMainAxisDirectionHorizontal || !this.mIsRtl) {
                    int unused3 = layoutState.mOffset = layoutState.mOffset + (flexLine.getCrossSize() * layoutState.mLayoutDirection);
                } else {
                    int unused4 = layoutState.mOffset = layoutState.mOffset - (flexLine.getCrossSize() * layoutState.mLayoutDirection);
                }
                access$12002 -= flexLine.getCrossSize();
            }
        }
        int unused5 = layoutState.mAvailable = layoutState.mAvailable - i;
        if (layoutState.mScrollingOffset != Integer.MIN_VALUE) {
            int unused6 = layoutState.mScrollingOffset = layoutState.mScrollingOffset + i;
            if (layoutState.mAvailable < 0) {
                int unused7 = layoutState.mScrollingOffset = layoutState.mScrollingOffset + layoutState.mAvailable;
            }
            recycleByLayoutState(todoublerange, layoutState);
        }
        return access$1200 - layoutState.mAvailable;
    }

    private void recycleByLayoutState(RecyclerView.toDoubleRange todoublerange, LayoutState layoutState) {
        if (layoutState.mShouldRecycle) {
            if (layoutState.mLayoutDirection == -1) {
                recycleFlexLinesFromEnd(todoublerange, layoutState);
            } else {
                recycleFlexLinesFromStart(todoublerange, layoutState);
            }
        }
    }

    private void recycleFlexLinesFromStart(RecyclerView.toDoubleRange todoublerange, LayoutState layoutState) {
        if (layoutState.mScrollingOffset >= 0) {
            if ($assertionsDisabled || this.mFlexboxHelper.mIndexToFlexLine != null) {
                int childCount = getChildCount();
                if (childCount != 0) {
                    int i = this.mFlexboxHelper.mIndexToFlexLine[getPosition(getChildAt(0))];
                    int i2 = -1;
                    if (i != -1) {
                        FlexLine flexLine = this.mFlexLines.get(i);
                        int i3 = 0;
                        while (true) {
                            if (i3 >= childCount) {
                                break;
                            }
                            View childAt = getChildAt(i3);
                            if (!canViewBeRecycledFromStart(childAt, layoutState.mScrollingOffset)) {
                                break;
                            }
                            if (flexLine.mLastIndex == getPosition(childAt)) {
                                if (i >= this.mFlexLines.size() - 1) {
                                    i2 = i3;
                                    break;
                                }
                                i += layoutState.mLayoutDirection;
                                flexLine = this.mFlexLines.get(i);
                                i2 = i3;
                            }
                            i3++;
                        }
                        recycleChildren(todoublerange, 0, i2);
                        return;
                    }
                    return;
                }
                return;
            }
            throw new AssertionError();
        }
    }

    private boolean canViewBeRecycledFromStart(View view, int i) {
        return (isMainAxisDirectionHorizontal() || !this.mIsRtl) ? this.mOrientationHelper.setMax(view) <= i : this.mOrientationHelper.getMax() - this.mOrientationHelper.getMax(view) <= i;
    }

    private void recycleFlexLinesFromEnd(RecyclerView.toDoubleRange todoublerange, LayoutState layoutState) {
        if (layoutState.mScrollingOffset >= 0) {
            if ($assertionsDisabled || this.mFlexboxHelper.mIndexToFlexLine != null) {
                this.mOrientationHelper.getMax();
                int unused = layoutState.mScrollingOffset;
                int childCount = getChildCount();
                if (childCount != 0) {
                    int i = childCount - 1;
                    int i2 = this.mFlexboxHelper.mIndexToFlexLine[getPosition(getChildAt(i))];
                    if (i2 != -1) {
                        FlexLine flexLine = this.mFlexLines.get(i2);
                        int i3 = i;
                        while (true) {
                            if (i3 < 0) {
                                break;
                            }
                            View childAt = getChildAt(i3);
                            if (!canViewBeRecycledFromEnd(childAt, layoutState.mScrollingOffset)) {
                                break;
                            }
                            if (flexLine.mFirstIndex == getPosition(childAt)) {
                                if (i2 <= 0) {
                                    childCount = i3;
                                    break;
                                }
                                i2 += layoutState.mLayoutDirection;
                                flexLine = this.mFlexLines.get(i2);
                                childCount = i3;
                            }
                            i3--;
                        }
                        recycleChildren(todoublerange, childCount, i);
                        return;
                    }
                    return;
                }
                return;
            }
            throw new AssertionError();
        }
    }

    private boolean canViewBeRecycledFromEnd(View view, int i) {
        return (isMainAxisDirectionHorizontal() || !this.mIsRtl) ? this.mOrientationHelper.getMax(view) >= this.mOrientationHelper.getMax() - i : this.mOrientationHelper.setMax(view) <= i;
    }

    private void recycleChildren(RecyclerView.toDoubleRange todoublerange, int i, int i2) {
        while (i2 >= i) {
            removeAndRecycleViewAt(i2, todoublerange);
            i2--;
        }
    }

    private int layoutFlexLine(FlexLine flexLine, LayoutState layoutState) {
        if (isMainAxisDirectionHorizontal()) {
            return layoutFlexLineMainAxisHorizontal(flexLine, layoutState);
        }
        return layoutFlexLineMainAxisVertical(flexLine, layoutState);
    }

    /* JADX WARNING: Removed duplicated region for block: B:44:0x00e7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int layoutFlexLineMainAxisHorizontal(com.google.android.flexbox.FlexLine r22, com.google.android.flexbox.FlexboxLayoutManager.LayoutState r23) {
        /*
            r21 = this;
            r0 = r21
            r8 = r22
            boolean r1 = $assertionsDisabled
            if (r1 != 0) goto L_0x0015
            com.google.android.flexbox.FlexboxHelper r1 = r0.mFlexboxHelper
            long[] r1 = r1.mMeasureSpecCache
            if (r1 == 0) goto L_0x000f
            goto L_0x0015
        L_0x000f:
            java.lang.AssertionError r1 = new java.lang.AssertionError
            r1.<init>()
            throw r1
        L_0x0015:
            int r1 = r21.getPaddingLeft()
            int r2 = r21.getPaddingRight()
            int r3 = r21.getWidth()
            int r4 = r23.mOffset
            int r5 = r23.mLayoutDirection
            r6 = -1
            if (r5 != r6) goto L_0x002f
            int r5 = r8.mCrossSize
            int r4 = r4 - r5
        L_0x002f:
            r9 = r4
            int r10 = r23.mPosition
            int r4 = r0.mJustifyContent
            r5 = 0
            r11 = 1
            if (r4 == 0) goto L_0x00c5
            if (r4 == r11) goto L_0x00b5
            r6 = 2
            r7 = 1073741824(0x40000000, float:2.0)
            if (r4 == r6) goto L_0x00a3
            r6 = 3
            if (r4 == r6) goto L_0x008d
            r6 = 4
            if (r4 == r6) goto L_0x0076
            r6 = 5
            if (r4 != r6) goto L_0x0060
            int r4 = r8.mItemCount
            if (r4 == 0) goto L_0x0059
            int r4 = r8.mMainSize
            int r4 = r3 - r4
            float r4 = (float) r4
            int r6 = r8.mItemCount
            int r6 = r6 + r11
            float r6 = (float) r6
            float r4 = r4 / r6
            goto L_0x005a
        L_0x0059:
            r4 = 0
        L_0x005a:
            float r1 = (float) r1
            float r1 = r1 + r4
            int r3 = r3 - r2
            float r2 = (float) r3
            float r2 = r2 - r4
            goto L_0x00c9
        L_0x0060:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Invalid justifyContent is set: "
            r2.<init>(r3)
            int r3 = r0.mJustifyContent
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x0076:
            int r4 = r8.mItemCount
            if (r4 == 0) goto L_0x0084
            int r4 = r8.mMainSize
            int r4 = r3 - r4
            float r4 = (float) r4
            int r6 = r8.mItemCount
            float r6 = (float) r6
            float r4 = r4 / r6
            goto L_0x0085
        L_0x0084:
            r4 = 0
        L_0x0085:
            float r1 = (float) r1
            float r6 = r4 / r7
            float r1 = r1 + r6
            int r3 = r3 - r2
            float r2 = (float) r3
            float r2 = r2 - r6
            goto L_0x00c9
        L_0x008d:
            float r1 = (float) r1
            int r4 = r8.mItemCount
            if (r4 == r11) goto L_0x0097
            int r4 = r8.mItemCount
            int r4 = r4 - r11
            float r4 = (float) r4
            goto L_0x0099
        L_0x0097:
            r4 = 1065353216(0x3f800000, float:1.0)
        L_0x0099:
            int r6 = r8.mMainSize
            int r6 = r3 - r6
            float r6 = (float) r6
            float r4 = r6 / r4
            int r3 = r3 - r2
            float r2 = (float) r3
            goto L_0x00c9
        L_0x00a3:
            float r1 = (float) r1
            int r4 = r8.mMainSize
            int r4 = r3 - r4
            float r4 = (float) r4
            float r4 = r4 / r7
            float r1 = r1 + r4
            int r2 = r3 - r2
            float r2 = (float) r2
            int r4 = r8.mMainSize
            int r3 = r3 - r4
            float r3 = (float) r3
            float r3 = r3 / r7
            float r2 = r2 - r3
            goto L_0x00c8
        L_0x00b5:
            int r4 = r8.mMainSize
            int r3 = r3 - r4
            int r3 = r3 + r2
            float r2 = (float) r3
            int r3 = r8.mMainSize
            int r3 = r3 - r1
            float r1 = (float) r3
            r4 = 0
            r20 = r2
            r2 = r1
            r1 = r20
            goto L_0x00c9
        L_0x00c5:
            float r1 = (float) r1
            int r3 = r3 - r2
            float r2 = (float) r3
        L_0x00c8:
            r4 = 0
        L_0x00c9:
            com.google.android.flexbox.FlexboxLayoutManager$AnchorInfo r3 = r0.mAnchorInfo
            int r3 = r3.mPerpendicularCoordinate
            float r3 = (float) r3
            float r1 = r1 - r3
            com.google.android.flexbox.FlexboxLayoutManager$AnchorInfo r3 = r0.mAnchorInfo
            int r3 = r3.mPerpendicularCoordinate
            float r3 = (float) r3
            float r2 = r2 - r3
            float r12 = java.lang.Math.max(r4, r5)
            r3 = 0
            int r13 = r22.getItemCount()
            r14 = r10
        L_0x00e3:
            int r4 = r10 + r13
            if (r14 >= r4) goto L_0x01b0
            android.view.View r15 = r0.getFlexItemAt(r14)
            if (r15 == 0) goto L_0x01ab
            int r4 = r23.mLayoutDirection
            if (r4 != r11) goto L_0x00fc
            android.graphics.Rect r4 = TEMP_RECT
            r0.calculateItemDecorationsForChild(r15, r4)
            r0.addView(r15)
            goto L_0x0106
        L_0x00fc:
            android.graphics.Rect r4 = TEMP_RECT
            r0.calculateItemDecorationsForChild(r15, r4)
            r0.addView(r15, r3)
            int r3 = r3 + 1
        L_0x0106:
            r16 = r3
            com.google.android.flexbox.FlexboxHelper r3 = r0.mFlexboxHelper
            long[] r3 = r3.mMeasureSpecCache
            r4 = r3[r14]
            com.google.android.flexbox.FlexboxHelper r3 = r0.mFlexboxHelper
            int r3 = r3.extractLowerInt(r4)
            com.google.android.flexbox.FlexboxHelper r6 = r0.mFlexboxHelper
            int r4 = r6.extractHigherInt(r4)
            android.view.ViewGroup$LayoutParams r5 = r15.getLayoutParams()
            r7 = r5
            com.google.android.flexbox.FlexboxLayoutManager$LayoutParams r7 = (com.google.android.flexbox.FlexboxLayoutManager.LayoutParams) r7
            boolean r5 = r0.shouldMeasureChild(r15, r3, r4, r7)
            if (r5 == 0) goto L_0x012a
            r15.measure(r3, r4)
        L_0x012a:
            int r3 = r7.leftMargin
            int r4 = r0.getLeftDecorationWidth(r15)
            int r3 = r3 + r4
            float r3 = (float) r3
            float r17 = r1 + r3
            int r1 = r7.rightMargin
            int r3 = r0.getRightDecorationWidth(r15)
            int r1 = r1 + r3
            float r1 = (float) r1
            float r18 = r2 - r1
            int r1 = r0.getTopDecorationHeight(r15)
            int r5 = r9 + r1
            boolean r1 = r0.mIsRtl
            if (r1 == 0) goto L_0x0168
            com.google.android.flexbox.FlexboxHelper r1 = r0.mFlexboxHelper
            int r2 = java.lang.Math.round(r18)
            int r3 = r15.getMeasuredWidth()
            int r4 = r2 - r3
            int r6 = java.lang.Math.round(r18)
            int r2 = r15.getMeasuredHeight()
            int r19 = r5 + r2
            r2 = r15
            r3 = r22
            r11 = r7
            r7 = r19
            r1.layoutSingleChildHorizontal(r2, r3, r4, r5, r6, r7)
            goto L_0x0185
        L_0x0168:
            r11 = r7
            com.google.android.flexbox.FlexboxHelper r1 = r0.mFlexboxHelper
            int r4 = java.lang.Math.round(r17)
            int r2 = java.lang.Math.round(r17)
            int r3 = r15.getMeasuredWidth()
            int r6 = r2 + r3
            int r2 = r15.getMeasuredHeight()
            int r7 = r5 + r2
            r2 = r15
            r3 = r22
            r1.layoutSingleChildHorizontal(r2, r3, r4, r5, r6, r7)
        L_0x0185:
            int r1 = r15.getMeasuredWidth()
            int r2 = r11.rightMargin
            int r1 = r1 + r2
            int r2 = r0.getRightDecorationWidth(r15)
            int r1 = r1 + r2
            float r1 = (float) r1
            float r1 = r1 + r12
            float r17 = r17 + r1
            int r1 = r15.getMeasuredWidth()
            int r2 = r11.leftMargin
            int r1 = r1 + r2
            int r2 = r0.getLeftDecorationWidth(r15)
            int r1 = r1 + r2
            float r1 = (float) r1
            float r1 = r1 + r12
            float r18 = r18 - r1
            r3 = r16
            r1 = r17
            r2 = r18
        L_0x01ab:
            int r14 = r14 + 1
            r11 = 1
            goto L_0x00e3
        L_0x01b0:
            int r1 = r23.mFlexLinePosition
            com.google.android.flexbox.FlexboxLayoutManager$LayoutState r2 = r0.mLayoutState
            int r2 = r2.mLayoutDirection
            int r1 = r1 + r2
            r2 = r23
            int unused = r2.mFlexLinePosition = r1
            int r1 = r22.getCrossSize()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayoutManager.layoutFlexLineMainAxisHorizontal(com.google.android.flexbox.FlexLine, com.google.android.flexbox.FlexboxLayoutManager$LayoutState):int");
    }

    /* JADX WARNING: Removed duplicated region for block: B:44:0x00ef  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int layoutFlexLineMainAxisVertical(com.google.android.flexbox.FlexLine r26, com.google.android.flexbox.FlexboxLayoutManager.LayoutState r27) {
        /*
            r25 = this;
            r0 = r25
            r9 = r26
            boolean r1 = $assertionsDisabled
            if (r1 != 0) goto L_0x0015
            com.google.android.flexbox.FlexboxHelper r1 = r0.mFlexboxHelper
            long[] r1 = r1.mMeasureSpecCache
            if (r1 == 0) goto L_0x000f
            goto L_0x0015
        L_0x000f:
            java.lang.AssertionError r1 = new java.lang.AssertionError
            r1.<init>()
            throw r1
        L_0x0015:
            int r1 = r25.getPaddingTop()
            int r2 = r25.getPaddingBottom()
            int r3 = r25.getHeight()
            int r4 = r27.mOffset
            int r5 = r27.mOffset
            int r6 = r27.mLayoutDirection
            r7 = -1
            if (r6 != r7) goto L_0x0036
            int r6 = r9.mCrossSize
            int r4 = r4 - r6
            int r6 = r9.mCrossSize
            int r5 = r5 + r6
        L_0x0036:
            r10 = r4
            r11 = r5
            int r12 = r27.mPosition
            int r4 = r0.mJustifyContent
            r5 = 0
            r13 = 1
            if (r4 == 0) goto L_0x00cd
            if (r4 == r13) goto L_0x00bd
            r6 = 2
            r7 = 1073741824(0x40000000, float:2.0)
            if (r4 == r6) goto L_0x00ab
            r6 = 3
            if (r4 == r6) goto L_0x0095
            r6 = 4
            if (r4 == r6) goto L_0x007e
            r6 = 5
            if (r4 != r6) goto L_0x0068
            int r4 = r9.mItemCount
            if (r4 == 0) goto L_0x0061
            int r4 = r9.mMainSize
            int r4 = r3 - r4
            float r4 = (float) r4
            int r6 = r9.mItemCount
            int r6 = r6 + r13
            float r6 = (float) r6
            float r4 = r4 / r6
            goto L_0x0062
        L_0x0061:
            r4 = 0
        L_0x0062:
            float r1 = (float) r1
            float r1 = r1 + r4
            int r3 = r3 - r2
            float r2 = (float) r3
            float r2 = r2 - r4
            goto L_0x00d1
        L_0x0068:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Invalid justifyContent is set: "
            r2.<init>(r3)
            int r3 = r0.mJustifyContent
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x007e:
            int r4 = r9.mItemCount
            if (r4 == 0) goto L_0x008c
            int r4 = r9.mMainSize
            int r4 = r3 - r4
            float r4 = (float) r4
            int r6 = r9.mItemCount
            float r6 = (float) r6
            float r4 = r4 / r6
            goto L_0x008d
        L_0x008c:
            r4 = 0
        L_0x008d:
            float r1 = (float) r1
            float r6 = r4 / r7
            float r1 = r1 + r6
            int r3 = r3 - r2
            float r2 = (float) r3
            float r2 = r2 - r6
            goto L_0x00d1
        L_0x0095:
            float r1 = (float) r1
            int r4 = r9.mItemCount
            if (r4 == r13) goto L_0x009f
            int r4 = r9.mItemCount
            int r4 = r4 - r13
            float r4 = (float) r4
            goto L_0x00a1
        L_0x009f:
            r4 = 1065353216(0x3f800000, float:1.0)
        L_0x00a1:
            int r6 = r9.mMainSize
            int r6 = r3 - r6
            float r6 = (float) r6
            float r4 = r6 / r4
            int r3 = r3 - r2
            float r2 = (float) r3
            goto L_0x00d1
        L_0x00ab:
            float r1 = (float) r1
            int r4 = r9.mMainSize
            int r4 = r3 - r4
            float r4 = (float) r4
            float r4 = r4 / r7
            float r1 = r1 + r4
            int r2 = r3 - r2
            float r2 = (float) r2
            int r4 = r9.mMainSize
            int r3 = r3 - r4
            float r3 = (float) r3
            float r3 = r3 / r7
            float r2 = r2 - r3
            goto L_0x00d0
        L_0x00bd:
            int r4 = r9.mMainSize
            int r3 = r3 - r4
            int r3 = r3 + r2
            float r2 = (float) r3
            int r3 = r9.mMainSize
            int r3 = r3 - r1
            float r1 = (float) r3
            r4 = 0
            r24 = r2
            r2 = r1
            r1 = r24
            goto L_0x00d1
        L_0x00cd:
            float r1 = (float) r1
            int r3 = r3 - r2
            float r2 = (float) r3
        L_0x00d0:
            r4 = 0
        L_0x00d1:
            com.google.android.flexbox.FlexboxLayoutManager$AnchorInfo r3 = r0.mAnchorInfo
            int r3 = r3.mPerpendicularCoordinate
            float r3 = (float) r3
            float r1 = r1 - r3
            com.google.android.flexbox.FlexboxLayoutManager$AnchorInfo r3 = r0.mAnchorInfo
            int r3 = r3.mPerpendicularCoordinate
            float r3 = (float) r3
            float r2 = r2 - r3
            float r14 = java.lang.Math.max(r4, r5)
            r3 = 0
            int r15 = r26.getItemCount()
            r8 = r12
        L_0x00eb:
            int r4 = r12 + r15
            if (r8 >= r4) goto L_0x0221
            android.view.View r7 = r0.getFlexItemAt(r8)
            if (r7 == 0) goto L_0x0218
            com.google.android.flexbox.FlexboxHelper r4 = r0.mFlexboxHelper
            long[] r4 = r4.mMeasureSpecCache
            r5 = r4[r8]
            com.google.android.flexbox.FlexboxHelper r4 = r0.mFlexboxHelper
            int r4 = r4.extractLowerInt(r5)
            com.google.android.flexbox.FlexboxHelper r13 = r0.mFlexboxHelper
            int r5 = r13.extractHigherInt(r5)
            android.view.ViewGroup$LayoutParams r6 = r7.getLayoutParams()
            r13 = r6
            com.google.android.flexbox.FlexboxLayoutManager$LayoutParams r13 = (com.google.android.flexbox.FlexboxLayoutManager.LayoutParams) r13
            boolean r6 = r0.shouldMeasureChild(r7, r4, r5, r13)
            if (r6 == 0) goto L_0x0117
            r7.measure(r4, r5)
        L_0x0117:
            int r4 = r13.topMargin
            int r5 = r0.getTopDecorationHeight(r7)
            int r4 = r4 + r5
            float r4 = (float) r4
            float r17 = r1 + r4
            int r1 = r13.rightMargin
            int r4 = r0.getBottomDecorationHeight(r7)
            int r1 = r1 + r4
            float r1 = (float) r1
            float r18 = r2 - r1
            int r1 = r27.mLayoutDirection
            r6 = 1
            if (r1 != r6) goto L_0x013b
            android.graphics.Rect r1 = TEMP_RECT
            r0.calculateItemDecorationsForChild(r7, r1)
            r0.addView(r7)
            goto L_0x0145
        L_0x013b:
            android.graphics.Rect r1 = TEMP_RECT
            r0.calculateItemDecorationsForChild(r7, r1)
            r0.addView(r7, r3)
            int r3 = r3 + 1
        L_0x0145:
            r16 = r3
            int r1 = r0.getLeftDecorationWidth(r7)
            int r5 = r10 + r1
            int r1 = r0.getRightDecorationWidth(r7)
            int r19 = r11 - r1
            boolean r4 = r0.mIsRtl
            if (r4 == 0) goto L_0x01aa
            boolean r1 = r0.mFromBottomToTop
            if (r1 == 0) goto L_0x0184
            com.google.android.flexbox.FlexboxHelper r1 = r0.mFlexboxHelper
            int r2 = r7.getMeasuredWidth()
            int r5 = r19 - r2
            int r2 = java.lang.Math.round(r18)
            int r3 = r7.getMeasuredHeight()
            int r20 = r2 - r3
            int r21 = java.lang.Math.round(r18)
            r2 = r7
            r3 = r26
            r22 = 1
            r6 = r20
            r20 = r7
            r7 = r19
            r23 = r8
            r8 = r21
            r1.layoutSingleChildVertical(r2, r3, r4, r5, r6, r7, r8)
            goto L_0x01ef
        L_0x0184:
            r20 = r7
            r23 = r8
            r22 = 1
            com.google.android.flexbox.FlexboxHelper r1 = r0.mFlexboxHelper
            int r2 = r20.getMeasuredWidth()
            int r5 = r19 - r2
            int r6 = java.lang.Math.round(r17)
            int r2 = java.lang.Math.round(r17)
            int r3 = r20.getMeasuredHeight()
            int r8 = r2 + r3
            r2 = r20
            r3 = r26
            r7 = r19
            r1.layoutSingleChildVertical(r2, r3, r4, r5, r6, r7, r8)
            goto L_0x01ef
        L_0x01aa:
            r20 = r7
            r23 = r8
            r22 = 1
            boolean r1 = r0.mFromBottomToTop
            if (r1 == 0) goto L_0x01d2
            com.google.android.flexbox.FlexboxHelper r1 = r0.mFlexboxHelper
            int r2 = java.lang.Math.round(r18)
            int r3 = r20.getMeasuredHeight()
            int r6 = r2 - r3
            int r2 = r20.getMeasuredWidth()
            int r7 = r5 + r2
            int r8 = java.lang.Math.round(r18)
            r2 = r20
            r3 = r26
            r1.layoutSingleChildVertical(r2, r3, r4, r5, r6, r7, r8)
            goto L_0x01ef
        L_0x01d2:
            com.google.android.flexbox.FlexboxHelper r1 = r0.mFlexboxHelper
            int r6 = java.lang.Math.round(r17)
            int r2 = r20.getMeasuredWidth()
            int r7 = r5 + r2
            int r2 = java.lang.Math.round(r17)
            int r3 = r20.getMeasuredHeight()
            int r8 = r2 + r3
            r2 = r20
            r3 = r26
            r1.layoutSingleChildVertical(r2, r3, r4, r5, r6, r7, r8)
        L_0x01ef:
            int r1 = r20.getMeasuredHeight()
            int r2 = r13.topMargin
            int r1 = r1 + r2
            r2 = r20
            int r3 = r0.getBottomDecorationHeight(r2)
            int r1 = r1 + r3
            float r1 = (float) r1
            float r1 = r1 + r14
            float r17 = r17 + r1
            int r1 = r2.getMeasuredHeight()
            int r3 = r13.bottomMargin
            int r1 = r1 + r3
            int r2 = r0.getTopDecorationHeight(r2)
            int r1 = r1 + r2
            float r1 = (float) r1
            float r1 = r1 + r14
            float r18 = r18 - r1
            r3 = r16
            r1 = r17
            r2 = r18
            goto L_0x021c
        L_0x0218:
            r23 = r8
            r22 = 1
        L_0x021c:
            int r8 = r23 + 1
            r13 = 1
            goto L_0x00eb
        L_0x0221:
            int r1 = r27.mFlexLinePosition
            com.google.android.flexbox.FlexboxLayoutManager$LayoutState r2 = r0.mLayoutState
            int r2 = r2.mLayoutDirection
            int r1 = r1 + r2
            r2 = r27
            int unused = r2.mFlexLinePosition = r1
            int r1 = r26.getCrossSize()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayoutManager.layoutFlexLineMainAxisVertical(com.google.android.flexbox.FlexLine, com.google.android.flexbox.FlexboxLayoutManager$LayoutState):int");
    }

    public boolean isMainAxisDirectionHorizontal() {
        int i = this.mFlexDirection;
        return i == 0 || i == 1;
    }

    private void updateLayoutStateToFillEnd(AnchorInfo anchorInfo, boolean z, boolean z2) {
        if (z2) {
            resolveInfiniteAmount();
        } else {
            boolean unused = this.mLayoutState.mInfinite = false;
        }
        if (isMainAxisDirectionHorizontal() || !this.mIsRtl) {
            int unused2 = this.mLayoutState.mAvailable = this.mOrientationHelper.setMax() - anchorInfo.mCoordinate;
        } else {
            int unused3 = this.mLayoutState.mAvailable = anchorInfo.mCoordinate - getPaddingRight();
        }
        int unused4 = this.mLayoutState.mPosition = anchorInfo.mPosition;
        int unused5 = this.mLayoutState.mItemDirection = 1;
        int unused6 = this.mLayoutState.mLayoutDirection = 1;
        int unused7 = this.mLayoutState.mOffset = anchorInfo.mCoordinate;
        int unused8 = this.mLayoutState.mScrollingOffset = Integer.MIN_VALUE;
        int unused9 = this.mLayoutState.mFlexLinePosition = anchorInfo.mFlexLinePosition;
        if (z && this.mFlexLines.size() > 1 && anchorInfo.mFlexLinePosition >= 0 && anchorInfo.mFlexLinePosition < this.mFlexLines.size() - 1) {
            LayoutState.access$1508(this.mLayoutState);
            LayoutState layoutState = this.mLayoutState;
            int unused10 = layoutState.mPosition = layoutState.mPosition + this.mFlexLines.get(anchorInfo.mFlexLinePosition).getItemCount();
        }
    }

    private void updateLayoutStateToFillStart(AnchorInfo anchorInfo, boolean z, boolean z2) {
        if (z2) {
            resolveInfiniteAmount();
        } else {
            boolean unused = this.mLayoutState.mInfinite = false;
        }
        if (isMainAxisDirectionHorizontal() || !this.mIsRtl) {
            int unused2 = this.mLayoutState.mAvailable = anchorInfo.mCoordinate - this.mOrientationHelper.getMin();
        } else {
            int unused3 = this.mLayoutState.mAvailable = (this.mParent.getWidth() - anchorInfo.mCoordinate) - this.mOrientationHelper.getMin();
        }
        int unused4 = this.mLayoutState.mPosition = anchorInfo.mPosition;
        int unused5 = this.mLayoutState.mItemDirection = 1;
        int unused6 = this.mLayoutState.mLayoutDirection = -1;
        int unused7 = this.mLayoutState.mOffset = anchorInfo.mCoordinate;
        int unused8 = this.mLayoutState.mScrollingOffset = Integer.MIN_VALUE;
        int unused9 = this.mLayoutState.mFlexLinePosition = anchorInfo.mFlexLinePosition;
        if (z && anchorInfo.mFlexLinePosition > 0 && this.mFlexLines.size() > anchorInfo.mFlexLinePosition) {
            LayoutState.access$1510(this.mLayoutState);
            LayoutState layoutState = this.mLayoutState;
            int unused10 = layoutState.mPosition = layoutState.mPosition - this.mFlexLines.get(anchorInfo.mFlexLinePosition).getItemCount();
        }
    }

    private void resolveInfiniteAmount() {
        int i;
        if (isMainAxisDirectionHorizontal()) {
            i = getHeightMode();
        } else {
            i = getWidthMode();
        }
        boolean unused = this.mLayoutState.mInfinite = i == 0 || i == Integer.MIN_VALUE;
    }

    private void ensureOrientationHelper() {
        if (this.mOrientationHelper == null) {
            if (isMainAxisDirectionHorizontal()) {
                if (this.mFlexWrap != 0) {
                    this.mOrientationHelper = close.setMax((RecyclerView.IsOverlapping) this);
                    this.mSubOrientationHelper = close.getMax((RecyclerView.IsOverlapping) this);
                    return;
                }
            } else if (this.mFlexWrap == 0) {
                this.mOrientationHelper = close.setMax((RecyclerView.IsOverlapping) this);
                this.mSubOrientationHelper = close.getMax((RecyclerView.IsOverlapping) this);
                return;
            }
            this.mOrientationHelper = close.getMax((RecyclerView.IsOverlapping) this);
            this.mSubOrientationHelper = close.setMax((RecyclerView.IsOverlapping) this);
        }
    }

    private void ensureLayoutState() {
        if (this.mLayoutState == null) {
            this.mLayoutState = new LayoutState();
        }
    }

    public void scrollToPosition(int i) {
        this.mPendingScrollPosition = i;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        SavedState savedState = this.mPendingSavedState;
        if (savedState != null) {
            savedState.invalidateAnchor();
        }
        requestLayout();
    }

    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView$Mean$Arithmetic recyclerView$Mean$Arithmetic, int i) {
        performShortcut performshortcut = new performShortcut(recyclerView.getContext());
        performshortcut.setTargetPosition(i);
        startSmoothScroll(performshortcut);
    }

    public boolean getRecycleChildrenOnDetach() {
        return this.mRecycleChildrenOnDetach;
    }

    public void setRecycleChildrenOnDetach(boolean z) {
        this.mRecycleChildrenOnDetach = z;
    }

    public void onAttachedToWindow(RecyclerView recyclerView) {
        super.onAttachedToWindow(recyclerView);
        this.mParent = (View) recyclerView.getParent();
    }

    public void onDetachedFromWindow(RecyclerView recyclerView, RecyclerView.toDoubleRange todoublerange) {
        super.onDetachedFromWindow(recyclerView, todoublerange);
        if (this.mRecycleChildrenOnDetach) {
            removeAndRecycleAllViews(todoublerange);
            todoublerange.getMin.clear();
            todoublerange.length();
        }
    }

    public boolean canScrollHorizontally() {
        if (this.mFlexWrap == 0) {
            return isMainAxisDirectionHorizontal();
        }
        if (!isMainAxisDirectionHorizontal()) {
            return true;
        }
        int width = getWidth();
        View view = this.mParent;
        return width > (view != null ? view.getWidth() : 0);
    }

    public boolean canScrollVertically() {
        if (this.mFlexWrap == 0) {
            return !isMainAxisDirectionHorizontal();
        }
        if (!isMainAxisDirectionHorizontal()) {
            int height = getHeight();
            View view = this.mParent;
            return height > (view != null ? view.getHeight() : 0);
        }
    }

    public int scrollHorizontallyBy(int i, RecyclerView.toDoubleRange todoublerange, RecyclerView$Mean$Arithmetic recyclerView$Mean$Arithmetic) {
        if (!isMainAxisDirectionHorizontal() || (this.mFlexWrap == 0 && isMainAxisDirectionHorizontal())) {
            int handleScrollingMainOrientation = handleScrollingMainOrientation(i, todoublerange, recyclerView$Mean$Arithmetic);
            this.mViewCache.clear();
            return handleScrollingMainOrientation;
        }
        int handleScrollingSubOrientation = handleScrollingSubOrientation(i);
        AnchorInfo anchorInfo = this.mAnchorInfo;
        int unused = anchorInfo.mPerpendicularCoordinate = anchorInfo.mPerpendicularCoordinate + handleScrollingSubOrientation;
        this.mSubOrientationHelper.getMin(-handleScrollingSubOrientation);
        return handleScrollingSubOrientation;
    }

    public int scrollVerticallyBy(int i, RecyclerView.toDoubleRange todoublerange, RecyclerView$Mean$Arithmetic recyclerView$Mean$Arithmetic) {
        if (isMainAxisDirectionHorizontal() || (this.mFlexWrap == 0 && !isMainAxisDirectionHorizontal())) {
            int handleScrollingMainOrientation = handleScrollingMainOrientation(i, todoublerange, recyclerView$Mean$Arithmetic);
            this.mViewCache.clear();
            return handleScrollingMainOrientation;
        }
        int handleScrollingSubOrientation = handleScrollingSubOrientation(i);
        AnchorInfo anchorInfo = this.mAnchorInfo;
        int unused = anchorInfo.mPerpendicularCoordinate = anchorInfo.mPerpendicularCoordinate + handleScrollingSubOrientation;
        this.mSubOrientationHelper.getMin(-handleScrollingSubOrientation);
        return handleScrollingSubOrientation;
    }

    private int handleScrollingMainOrientation(int i, RecyclerView.toDoubleRange todoublerange, RecyclerView$Mean$Arithmetic recyclerView$Mean$Arithmetic) {
        if (getChildCount() == 0 || i == 0) {
            return 0;
        }
        ensureOrientationHelper();
        int i2 = 1;
        boolean unused = this.mLayoutState.mShouldRecycle = true;
        boolean z = !isMainAxisDirectionHorizontal() && this.mIsRtl;
        if (!z ? i <= 0 : i >= 0) {
            i2 = -1;
        }
        int abs = Math.abs(i);
        updateLayoutState(i2, abs);
        int access$2000 = this.mLayoutState.mScrollingOffset + fill(todoublerange, recyclerView$Mean$Arithmetic, this.mLayoutState);
        if (access$2000 < 0) {
            return 0;
        }
        if (z) {
            if (abs > access$2000) {
                i = (-i2) * access$2000;
            }
        } else if (abs > access$2000) {
            i = i2 * access$2000;
        }
        this.mOrientationHelper.getMin(-i);
        int unused2 = this.mLayoutState.mLastScrollDelta = i;
        return i;
    }

    private int handleScrollingSubOrientation(int i) {
        int access$2400;
        boolean z = false;
        if (getChildCount() == 0 || i == 0) {
            return 0;
        }
        ensureOrientationHelper();
        boolean isMainAxisDirectionHorizontal = isMainAxisDirectionHorizontal();
        View view = this.mParent;
        int width = isMainAxisDirectionHorizontal ? view.getWidth() : view.getHeight();
        int width2 = isMainAxisDirectionHorizontal ? getWidth() : getHeight();
        if (getLayoutDirection() == 1) {
            z = true;
        }
        if (z) {
            int abs = Math.abs(i);
            if (i < 0) {
                access$2400 = Math.min((width2 + this.mAnchorInfo.mPerpendicularCoordinate) - width, abs);
            } else if (this.mAnchorInfo.mPerpendicularCoordinate + i <= 0) {
                return i;
            } else {
                access$2400 = this.mAnchorInfo.mPerpendicularCoordinate;
            }
        } else if (i > 0) {
            return Math.min((width2 - this.mAnchorInfo.mPerpendicularCoordinate) - width, i);
        } else {
            if (this.mAnchorInfo.mPerpendicularCoordinate + i >= 0) {
                return i;
            }
            access$2400 = this.mAnchorInfo.mPerpendicularCoordinate;
        }
        return -access$2400;
    }

    private void updateLayoutState(int i, int i2) {
        if ($assertionsDisabled || this.mFlexboxHelper.mIndexToFlexLine != null) {
            int unused = this.mLayoutState.mLayoutDirection = i;
            boolean isMainAxisDirectionHorizontal = isMainAxisDirectionHorizontal();
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getWidth(), getWidthMode());
            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getHeight(), getHeightMode());
            int i3 = 0;
            boolean z = !isMainAxisDirectionHorizontal && this.mIsRtl;
            if (i == 1) {
                View childAt = getChildAt(getChildCount() - 1);
                int unused2 = this.mLayoutState.mOffset = this.mOrientationHelper.setMax(childAt);
                int position = getPosition(childAt);
                View findLastReferenceViewInLine = findLastReferenceViewInLine(childAt, this.mFlexLines.get(this.mFlexboxHelper.mIndexToFlexLine[position]));
                int unused3 = this.mLayoutState.mItemDirection = 1;
                LayoutState layoutState = this.mLayoutState;
                int unused4 = layoutState.mPosition = position + layoutState.mItemDirection;
                if (this.mFlexboxHelper.mIndexToFlexLine.length <= this.mLayoutState.mPosition) {
                    int unused5 = this.mLayoutState.mFlexLinePosition = -1;
                } else {
                    int unused6 = this.mLayoutState.mFlexLinePosition = this.mFlexboxHelper.mIndexToFlexLine[this.mLayoutState.mPosition];
                }
                if (z) {
                    int unused7 = this.mLayoutState.mOffset = this.mOrientationHelper.getMax(findLastReferenceViewInLine);
                    int unused8 = this.mLayoutState.mScrollingOffset = (-this.mOrientationHelper.getMax(findLastReferenceViewInLine)) + this.mOrientationHelper.getMin();
                    LayoutState layoutState2 = this.mLayoutState;
                    if (layoutState2.mScrollingOffset >= 0) {
                        i3 = this.mLayoutState.mScrollingOffset;
                    }
                    int unused9 = layoutState2.mScrollingOffset = i3;
                } else {
                    int unused10 = this.mLayoutState.mOffset = this.mOrientationHelper.setMax(findLastReferenceViewInLine);
                    int unused11 = this.mLayoutState.mScrollingOffset = this.mOrientationHelper.setMax(findLastReferenceViewInLine) - this.mOrientationHelper.setMax();
                }
                if ((this.mLayoutState.mFlexLinePosition == -1 || this.mLayoutState.mFlexLinePosition > this.mFlexLines.size() - 1) && this.mLayoutState.mPosition <= getFlexItemCount()) {
                    int access$2000 = i2 - this.mLayoutState.mScrollingOffset;
                    this.mFlexLinesResult.reset();
                    if (access$2000 > 0) {
                        if (isMainAxisDirectionHorizontal) {
                            this.mFlexboxHelper.calculateHorizontalFlexLines(this.mFlexLinesResult, makeMeasureSpec, makeMeasureSpec2, access$2000, this.mLayoutState.mPosition, this.mFlexLines);
                        } else {
                            this.mFlexboxHelper.calculateVerticalFlexLines(this.mFlexLinesResult, makeMeasureSpec, makeMeasureSpec2, access$2000, this.mLayoutState.mPosition, this.mFlexLines);
                        }
                        this.mFlexboxHelper.determineMainSize(makeMeasureSpec, makeMeasureSpec2, this.mLayoutState.mPosition);
                        this.mFlexboxHelper.stretchViews(this.mLayoutState.mPosition);
                    }
                }
            } else {
                View childAt2 = getChildAt(0);
                int unused12 = this.mLayoutState.mOffset = this.mOrientationHelper.getMax(childAt2);
                int position2 = getPosition(childAt2);
                View findFirstReferenceViewInLine = findFirstReferenceViewInLine(childAt2, this.mFlexLines.get(this.mFlexboxHelper.mIndexToFlexLine[position2]));
                int unused13 = this.mLayoutState.mItemDirection = 1;
                int i4 = this.mFlexboxHelper.mIndexToFlexLine[position2];
                if (i4 == -1) {
                    i4 = 0;
                }
                if (i4 > 0) {
                    int unused14 = this.mLayoutState.mPosition = position2 - this.mFlexLines.get(i4 - 1).getItemCount();
                } else {
                    int unused15 = this.mLayoutState.mPosition = -1;
                }
                int unused16 = this.mLayoutState.mFlexLinePosition = i4 > 0 ? i4 - 1 : 0;
                if (z) {
                    int unused17 = this.mLayoutState.mOffset = this.mOrientationHelper.setMax(findFirstReferenceViewInLine);
                    int unused18 = this.mLayoutState.mScrollingOffset = this.mOrientationHelper.setMax(findFirstReferenceViewInLine) - this.mOrientationHelper.setMax();
                    LayoutState layoutState3 = this.mLayoutState;
                    if (layoutState3.mScrollingOffset >= 0) {
                        i3 = this.mLayoutState.mScrollingOffset;
                    }
                    int unused19 = layoutState3.mScrollingOffset = i3;
                } else {
                    int unused20 = this.mLayoutState.mOffset = this.mOrientationHelper.getMax(findFirstReferenceViewInLine);
                    int unused21 = this.mLayoutState.mScrollingOffset = (-this.mOrientationHelper.getMax(findFirstReferenceViewInLine)) + this.mOrientationHelper.getMin();
                }
            }
            LayoutState layoutState4 = this.mLayoutState;
            int unused22 = layoutState4.mAvailable = i2 - layoutState4.mScrollingOffset;
            return;
        }
        throw new AssertionError();
    }

    private View findFirstReferenceViewInLine(View view, FlexLine flexLine) {
        boolean isMainAxisDirectionHorizontal = isMainAxisDirectionHorizontal();
        int i = flexLine.mItemCount;
        for (int i2 = 1; i2 < i; i2++) {
            View childAt = getChildAt(i2);
            if (!(childAt == null || childAt.getVisibility() == 8)) {
                if (!this.mIsRtl || isMainAxisDirectionHorizontal) {
                    if (this.mOrientationHelper.getMax(view) <= this.mOrientationHelper.getMax(childAt)) {
                    }
                } else if (this.mOrientationHelper.setMax(view) >= this.mOrientationHelper.setMax(childAt)) {
                }
                view = childAt;
            }
        }
        return view;
    }

    private View findLastReferenceViewInLine(View view, FlexLine flexLine) {
        boolean isMainAxisDirectionHorizontal = isMainAxisDirectionHorizontal();
        int childCount = (getChildCount() - flexLine.mItemCount) - 1;
        for (int childCount2 = getChildCount() - 2; childCount2 > childCount; childCount2--) {
            View childAt = getChildAt(childCount2);
            if (!(childAt == null || childAt.getVisibility() == 8)) {
                if (!this.mIsRtl || isMainAxisDirectionHorizontal) {
                    if (this.mOrientationHelper.setMax(view) >= this.mOrientationHelper.setMax(childAt)) {
                    }
                } else if (this.mOrientationHelper.getMax(view) <= this.mOrientationHelper.getMax(childAt)) {
                }
                view = childAt;
            }
        }
        return view;
    }

    public int computeHorizontalScrollExtent(RecyclerView$Mean$Arithmetic recyclerView$Mean$Arithmetic) {
        return computeScrollExtent(recyclerView$Mean$Arithmetic);
    }

    public int computeVerticalScrollExtent(RecyclerView$Mean$Arithmetic recyclerView$Mean$Arithmetic) {
        return computeScrollExtent(recyclerView$Mean$Arithmetic);
    }

    private int computeScrollExtent(RecyclerView$Mean$Arithmetic recyclerView$Mean$Arithmetic) {
        int i;
        int i2;
        if (getChildCount() == 0) {
            return 0;
        }
        if (recyclerView$Mean$Arithmetic.equals) {
            i = recyclerView$Mean$Arithmetic.setMax - recyclerView$Mean$Arithmetic.getMax;
        } else {
            i = recyclerView$Mean$Arithmetic.setMin;
        }
        ensureOrientationHelper();
        View findFirstReferenceChild = findFirstReferenceChild(i);
        View findLastReferenceChild = findLastReferenceChild(i);
        if (recyclerView$Mean$Arithmetic.equals) {
            i2 = recyclerView$Mean$Arithmetic.setMax - recyclerView$Mean$Arithmetic.getMax;
        } else {
            i2 = recyclerView$Mean$Arithmetic.setMin;
        }
        if (i2 == 0 || findFirstReferenceChild == null || findLastReferenceChild == null) {
            return 0;
        }
        return Math.min(this.mOrientationHelper.setMin(), this.mOrientationHelper.setMax(findLastReferenceChild) - this.mOrientationHelper.getMax(findFirstReferenceChild));
    }

    public int computeHorizontalScrollOffset(RecyclerView$Mean$Arithmetic recyclerView$Mean$Arithmetic) {
        return computeScrollOffset(recyclerView$Mean$Arithmetic);
    }

    public int computeVerticalScrollOffset(RecyclerView$Mean$Arithmetic recyclerView$Mean$Arithmetic) {
        return computeScrollOffset(recyclerView$Mean$Arithmetic);
    }

    private int computeScrollOffset(RecyclerView$Mean$Arithmetic recyclerView$Mean$Arithmetic) {
        int i;
        int i2;
        if (getChildCount() == 0) {
            return 0;
        }
        if (recyclerView$Mean$Arithmetic.equals) {
            i = recyclerView$Mean$Arithmetic.setMax - recyclerView$Mean$Arithmetic.getMax;
        } else {
            i = recyclerView$Mean$Arithmetic.setMin;
        }
        View findFirstReferenceChild = findFirstReferenceChild(i);
        View findLastReferenceChild = findLastReferenceChild(i);
        if (recyclerView$Mean$Arithmetic.equals) {
            i2 = recyclerView$Mean$Arithmetic.setMax - recyclerView$Mean$Arithmetic.getMax;
        } else {
            i2 = recyclerView$Mean$Arithmetic.setMin;
        }
        if (!(i2 == 0 || findFirstReferenceChild == null || findLastReferenceChild == null)) {
            if ($assertionsDisabled || this.mFlexboxHelper.mIndexToFlexLine != null) {
                int position = getPosition(findFirstReferenceChild);
                int position2 = getPosition(findLastReferenceChild);
                int abs = Math.abs(this.mOrientationHelper.setMax(findLastReferenceChild) - this.mOrientationHelper.getMax(findFirstReferenceChild));
                int i3 = this.mFlexboxHelper.mIndexToFlexLine[position];
                if (!(i3 == 0 || i3 == -1)) {
                    return Math.round((((float) i3) * (((float) abs) / ((float) ((this.mFlexboxHelper.mIndexToFlexLine[position2] - i3) + 1)))) + ((float) (this.mOrientationHelper.getMin() - this.mOrientationHelper.getMax(findFirstReferenceChild))));
                }
            } else {
                throw new AssertionError();
            }
        }
        return 0;
    }

    public int computeHorizontalScrollRange(RecyclerView$Mean$Arithmetic recyclerView$Mean$Arithmetic) {
        return computeScrollRange(recyclerView$Mean$Arithmetic);
    }

    public int computeVerticalScrollRange(RecyclerView$Mean$Arithmetic recyclerView$Mean$Arithmetic) {
        return computeScrollRange(recyclerView$Mean$Arithmetic);
    }

    private int computeScrollRange(RecyclerView$Mean$Arithmetic recyclerView$Mean$Arithmetic) {
        int i;
        int i2;
        int i3;
        if (getChildCount() == 0) {
            return 0;
        }
        if (recyclerView$Mean$Arithmetic.equals) {
            i = recyclerView$Mean$Arithmetic.setMax - recyclerView$Mean$Arithmetic.getMax;
        } else {
            i = recyclerView$Mean$Arithmetic.setMin;
        }
        View findFirstReferenceChild = findFirstReferenceChild(i);
        View findLastReferenceChild = findLastReferenceChild(i);
        if (recyclerView$Mean$Arithmetic.equals) {
            i2 = recyclerView$Mean$Arithmetic.setMax - recyclerView$Mean$Arithmetic.getMax;
        } else {
            i2 = recyclerView$Mean$Arithmetic.setMin;
        }
        if (i2 == 0 || findFirstReferenceChild == null || findLastReferenceChild == null) {
            return 0;
        }
        if ($assertionsDisabled || this.mFlexboxHelper.mIndexToFlexLine != null) {
            int findFirstVisibleItemPosition = findFirstVisibleItemPosition();
            float abs = ((float) Math.abs(this.mOrientationHelper.setMax(findLastReferenceChild) - this.mOrientationHelper.getMax(findFirstReferenceChild))) / ((float) ((findLastVisibleItemPosition() - findFirstVisibleItemPosition) + 1));
            if (recyclerView$Mean$Arithmetic.equals) {
                i3 = recyclerView$Mean$Arithmetic.setMax - recyclerView$Mean$Arithmetic.getMax;
            } else {
                i3 = recyclerView$Mean$Arithmetic.setMin;
            }
            return (int) (abs * ((float) i3));
        }
        throw new AssertionError();
    }

    private boolean shouldMeasureChild(View view, int i, int i2, RecyclerView.LayoutParams layoutParams) {
        return view.isLayoutRequested() || !isMeasurementCacheEnabled() || !isMeasurementUpToDate(view.getWidth(), i, layoutParams.width) || !isMeasurementUpToDate(view.getHeight(), i2, layoutParams.height);
    }

    private static boolean isMeasurementUpToDate(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (i3 > 0 && i != i3) {
            return false;
        }
        if (mode == Integer.MIN_VALUE) {
            return size >= i;
        }
        if (mode != 0) {
            return mode == 1073741824 && size == i;
        }
        return true;
    }

    private void clearFlexLines() {
        this.mFlexLines.clear();
        this.mAnchorInfo.reset();
        int unused = this.mAnchorInfo.mPerpendicularCoordinate = 0;
    }

    private int getChildLeft(View view) {
        return getDecoratedLeft(view) - ((RecyclerView.LayoutParams) view.getLayoutParams()).leftMargin;
    }

    private int getChildRight(View view) {
        return getDecoratedRight(view) + ((RecyclerView.LayoutParams) view.getLayoutParams()).rightMargin;
    }

    private int getChildTop(View view) {
        return getDecoratedTop(view) - ((RecyclerView.LayoutParams) view.getLayoutParams()).topMargin;
    }

    private int getChildBottom(View view) {
        return getDecoratedBottom(view) + ((RecyclerView.LayoutParams) view.getLayoutParams()).bottomMargin;
    }

    private boolean isViewVisible(View view, boolean z) {
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int width = getWidth() - getPaddingRight();
        int height = getHeight() - getPaddingBottom();
        int childLeft = getChildLeft(view);
        int childTop = getChildTop(view);
        int childRight = getChildRight(view);
        int childBottom = getChildBottom(view);
        return z ? (paddingLeft <= childLeft && width >= childRight) && (paddingTop <= childTop && height >= childBottom) : (childLeft >= width || childRight >= paddingLeft) && (childTop >= height || childBottom >= paddingTop);
    }

    public int findFirstVisibleItemPosition() {
        View findOneVisibleChild = findOneVisibleChild(0, getChildCount(), false);
        if (findOneVisibleChild == null) {
            return -1;
        }
        return getPosition(findOneVisibleChild);
    }

    public int findFirstCompletelyVisibleItemPosition() {
        View findOneVisibleChild = findOneVisibleChild(0, getChildCount(), true);
        if (findOneVisibleChild == null) {
            return -1;
        }
        return getPosition(findOneVisibleChild);
    }

    public int findLastVisibleItemPosition() {
        View findOneVisibleChild = findOneVisibleChild(getChildCount() - 1, -1, false);
        if (findOneVisibleChild == null) {
            return -1;
        }
        return getPosition(findOneVisibleChild);
    }

    public int findLastCompletelyVisibleItemPosition() {
        View findOneVisibleChild = findOneVisibleChild(getChildCount() - 1, -1, true);
        if (findOneVisibleChild == null) {
            return -1;
        }
        return getPosition(findOneVisibleChild);
    }

    private View findOneVisibleChild(int i, int i2, boolean z) {
        int i3 = i2 > i ? 1 : -1;
        while (i != i2) {
            View childAt = getChildAt(i);
            if (isViewVisible(childAt, z)) {
                return childAt;
            }
            i += i3;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public int getPositionToFlexLineIndex(int i) {
        if ($assertionsDisabled || this.mFlexboxHelper.mIndexToFlexLine != null) {
            return this.mFlexboxHelper.mIndexToFlexLine[i];
        }
        throw new AssertionError();
    }

    public static class LayoutParams extends RecyclerView.LayoutParams implements FlexItem {
        public static final Parcelable.Creator<LayoutParams> CREATOR = new Parcelable.Creator<LayoutParams>() {
            public final LayoutParams createFromParcel(Parcel parcel) {
                return new LayoutParams(parcel);
            }

            public final LayoutParams[] newArray(int i) {
                return new LayoutParams[i];
            }
        };
        private int mAlignSelf = -1;
        private float mFlexBasisPercent = -1.0f;
        private float mFlexGrow = 0.0f;
        private float mFlexShrink = 1.0f;
        private int mMaxHeight = FlexItem.MAX_SIZE;
        private int mMaxWidth = FlexItem.MAX_SIZE;
        private int mMinHeight;
        private int mMinWidth;
        private boolean mWrapBefore;

        public int describeContents() {
            return 0;
        }

        public int getOrder() {
            return 1;
        }

        public int getWidth() {
            return this.width;
        }

        public void setWidth(int i) {
            this.width = i;
        }

        public int getHeight() {
            return this.height;
        }

        public void setHeight(int i) {
            this.height = i;
        }

        public float getFlexGrow() {
            return this.mFlexGrow;
        }

        public void setFlexGrow(float f) {
            this.mFlexGrow = f;
        }

        public float getFlexShrink() {
            return this.mFlexShrink;
        }

        public void setFlexShrink(float f) {
            this.mFlexShrink = f;
        }

        public int getAlignSelf() {
            return this.mAlignSelf;
        }

        public void setAlignSelf(int i) {
            this.mAlignSelf = i;
        }

        public int getMinWidth() {
            return this.mMinWidth;
        }

        public void setMinWidth(int i) {
            this.mMinWidth = i;
        }

        public int getMinHeight() {
            return this.mMinHeight;
        }

        public void setMinHeight(int i) {
            this.mMinHeight = i;
        }

        public int getMaxWidth() {
            return this.mMaxWidth;
        }

        public void setMaxWidth(int i) {
            this.mMaxWidth = i;
        }

        public int getMaxHeight() {
            return this.mMaxHeight;
        }

        public void setMaxHeight(int i) {
            this.mMaxHeight = i;
        }

        public boolean isWrapBefore() {
            return this.mWrapBefore;
        }

        public void setWrapBefore(boolean z) {
            this.mWrapBefore = z;
        }

        public float getFlexBasisPercent() {
            return this.mFlexBasisPercent;
        }

        public void setFlexBasisPercent(float f) {
            this.mFlexBasisPercent = f;
        }

        public int getMarginLeft() {
            return this.leftMargin;
        }

        public int getMarginTop() {
            return this.topMargin;
        }

        public int getMarginRight() {
            return this.rightMargin;
        }

        public int getMarginBottom() {
            return this.bottomMargin;
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(RecyclerView.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(LayoutParams layoutParams) {
            super((RecyclerView.LayoutParams) layoutParams);
            this.mFlexGrow = layoutParams.mFlexGrow;
            this.mFlexShrink = layoutParams.mFlexShrink;
            this.mAlignSelf = layoutParams.mAlignSelf;
            this.mFlexBasisPercent = layoutParams.mFlexBasisPercent;
            this.mMinWidth = layoutParams.mMinWidth;
            this.mMinHeight = layoutParams.mMinHeight;
            this.mMaxWidth = layoutParams.mMaxWidth;
            this.mMaxHeight = layoutParams.mMaxHeight;
            this.mWrapBefore = layoutParams.mWrapBefore;
        }

        public void setOrder(int i) {
            throw new UnsupportedOperationException("Setting the order in the FlexboxLayoutManager is not supported. Use FlexboxLayout if you need to reorder using the attribute.");
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeFloat(this.mFlexGrow);
            parcel.writeFloat(this.mFlexShrink);
            parcel.writeInt(this.mAlignSelf);
            parcel.writeFloat(this.mFlexBasisPercent);
            parcel.writeInt(this.mMinWidth);
            parcel.writeInt(this.mMinHeight);
            parcel.writeInt(this.mMaxWidth);
            parcel.writeInt(this.mMaxHeight);
            parcel.writeByte(this.mWrapBefore ? (byte) 1 : 0);
            parcel.writeInt(this.bottomMargin);
            parcel.writeInt(this.leftMargin);
            parcel.writeInt(this.rightMargin);
            parcel.writeInt(this.topMargin);
            parcel.writeInt(this.height);
            parcel.writeInt(this.width);
        }

        protected LayoutParams(Parcel parcel) {
            super(-2, -2);
            this.mFlexGrow = parcel.readFloat();
            this.mFlexShrink = parcel.readFloat();
            this.mAlignSelf = parcel.readInt();
            this.mFlexBasisPercent = parcel.readFloat();
            this.mMinWidth = parcel.readInt();
            this.mMinHeight = parcel.readInt();
            this.mMaxWidth = parcel.readInt();
            this.mMaxHeight = parcel.readInt();
            this.mWrapBefore = parcel.readByte() != 0;
            this.bottomMargin = parcel.readInt();
            this.leftMargin = parcel.readInt();
            this.rightMargin = parcel.readInt();
            this.topMargin = parcel.readInt();
            this.height = parcel.readInt();
            this.width = parcel.readInt();
        }
    }

    class AnchorInfo {
        static final /* synthetic */ boolean $assertionsDisabled = (!FlexboxLayoutManager.class.desiredAssertionStatus());
        /* access modifiers changed from: private */
        public boolean mAssignedFromSavedState;
        /* access modifiers changed from: private */
        public int mCoordinate;
        /* access modifiers changed from: private */
        public int mFlexLinePosition;
        /* access modifiers changed from: private */
        public boolean mLayoutFromEnd;
        /* access modifiers changed from: private */
        public int mPerpendicularCoordinate;
        /* access modifiers changed from: private */
        public int mPosition;
        /* access modifiers changed from: private */
        public boolean mValid;

        private AnchorInfo() {
            this.mPerpendicularCoordinate = 0;
        }

        /* access modifiers changed from: private */
        public void reset() {
            this.mPosition = -1;
            this.mFlexLinePosition = -1;
            this.mCoordinate = Integer.MIN_VALUE;
            boolean z = false;
            this.mValid = false;
            this.mAssignedFromSavedState = false;
            if (FlexboxLayoutManager.this.isMainAxisDirectionHorizontal()) {
                if (FlexboxLayoutManager.this.mFlexWrap == 0) {
                    if (FlexboxLayoutManager.this.mFlexDirection == 1) {
                        z = true;
                    }
                    this.mLayoutFromEnd = z;
                    return;
                }
                if (FlexboxLayoutManager.this.mFlexWrap == 2) {
                    z = true;
                }
                this.mLayoutFromEnd = z;
            } else if (FlexboxLayoutManager.this.mFlexWrap == 0) {
                if (FlexboxLayoutManager.this.mFlexDirection == 3) {
                    z = true;
                }
                this.mLayoutFromEnd = z;
            } else {
                if (FlexboxLayoutManager.this.mFlexWrap == 2) {
                    z = true;
                }
                this.mLayoutFromEnd = z;
            }
        }

        /* access modifiers changed from: private */
        public void assignCoordinateFromPadding() {
            int i;
            int i2;
            if (FlexboxLayoutManager.this.isMainAxisDirectionHorizontal() || !FlexboxLayoutManager.this.mIsRtl) {
                if (this.mLayoutFromEnd) {
                    i = FlexboxLayoutManager.this.mOrientationHelper.setMax();
                } else {
                    i = FlexboxLayoutManager.this.mOrientationHelper.getMin();
                }
                this.mCoordinate = i;
                return;
            }
            if (this.mLayoutFromEnd) {
                i2 = FlexboxLayoutManager.this.mOrientationHelper.setMax();
            } else {
                i2 = FlexboxLayoutManager.this.getWidth() - FlexboxLayoutManager.this.mOrientationHelper.getMin();
            }
            this.mCoordinate = i2;
        }

        /* access modifiers changed from: private */
        public void assignFromView(View view) {
            close close;
            if (FlexboxLayoutManager.this.mFlexWrap == 0) {
                close = FlexboxLayoutManager.this.mSubOrientationHelper;
            } else {
                close = FlexboxLayoutManager.this.mOrientationHelper;
            }
            int i = 0;
            if (FlexboxLayoutManager.this.isMainAxisDirectionHorizontal() || !FlexboxLayoutManager.this.mIsRtl) {
                if (this.mLayoutFromEnd) {
                    this.mCoordinate = close.setMax(view) + (Integer.MIN_VALUE == close.getMin ? 0 : close.setMin() - close.getMin);
                } else {
                    this.mCoordinate = close.getMax(view);
                }
            } else if (this.mLayoutFromEnd) {
                this.mCoordinate = close.getMax(view) + (Integer.MIN_VALUE == close.getMin ? 0 : close.setMin() - close.getMin);
            } else {
                this.mCoordinate = close.setMax(view);
            }
            this.mPosition = FlexboxLayoutManager.this.getPosition(view);
            this.mAssignedFromSavedState = false;
            if ($assertionsDisabled || FlexboxLayoutManager.this.mFlexboxHelper.mIndexToFlexLine != null) {
                int[] iArr = FlexboxLayoutManager.this.mFlexboxHelper.mIndexToFlexLine;
                int i2 = this.mPosition;
                if (i2 == -1) {
                    i2 = 0;
                }
                int i3 = iArr[i2];
                if (i3 != -1) {
                    i = i3;
                }
                this.mFlexLinePosition = i;
                if (FlexboxLayoutManager.this.mFlexLines.size() > this.mFlexLinePosition) {
                    this.mPosition = ((FlexLine) FlexboxLayoutManager.this.mFlexLines.get(this.mFlexLinePosition)).mFirstIndex;
                    return;
                }
                return;
            }
            throw new AssertionError();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("AnchorInfo{mPosition=");
            sb.append(this.mPosition);
            sb.append(", mFlexLinePosition=");
            sb.append(this.mFlexLinePosition);
            sb.append(", mCoordinate=");
            sb.append(this.mCoordinate);
            sb.append(", mPerpendicularCoordinate=");
            sb.append(this.mPerpendicularCoordinate);
            sb.append(", mLayoutFromEnd=");
            sb.append(this.mLayoutFromEnd);
            sb.append(", mValid=");
            sb.append(this.mValid);
            sb.append(", mAssignedFromSavedState=");
            sb.append(this.mAssignedFromSavedState);
            sb.append('}');
            return sb.toString();
        }
    }

    static class LayoutState {
        private static final int ITEM_DIRECTION_TAIL = 1;
        private static final int LAYOUT_END = 1;
        private static final int LAYOUT_START = -1;
        private static final int SCROLLING_OFFSET_NaN = Integer.MIN_VALUE;
        /* access modifiers changed from: private */
        public int mAvailable;
        /* access modifiers changed from: private */
        public int mFlexLinePosition;
        /* access modifiers changed from: private */
        public boolean mInfinite;
        /* access modifiers changed from: private */
        public int mItemDirection;
        /* access modifiers changed from: private */
        public int mLastScrollDelta;
        /* access modifiers changed from: private */
        public int mLayoutDirection;
        /* access modifiers changed from: private */
        public int mOffset;
        /* access modifiers changed from: private */
        public int mPosition;
        /* access modifiers changed from: private */
        public int mScrollingOffset;
        /* access modifiers changed from: private */
        public boolean mShouldRecycle;

        private LayoutState() {
            this.mItemDirection = 1;
            this.mLayoutDirection = 1;
        }

        static /* synthetic */ int access$1508(LayoutState layoutState) {
            int i = layoutState.mFlexLinePosition;
            layoutState.mFlexLinePosition = i + 1;
            return i;
        }

        static /* synthetic */ int access$1510(LayoutState layoutState) {
            int i = layoutState.mFlexLinePosition;
            layoutState.mFlexLinePosition = i - 1;
            return i;
        }

        /* access modifiers changed from: private */
        /* JADX WARNING: Code restructure failed: missing block: B:7:0x0012, code lost:
            r3 = r2.mFlexLinePosition;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean hasMore(androidx.recyclerview.widget.RecyclerView$Mean$Arithmetic r3, java.util.List<com.google.android.flexbox.FlexLine> r4) {
            /*
                r2 = this;
                int r0 = r2.mPosition
                if (r0 < 0) goto L_0x001e
                boolean r1 = r3.equals
                if (r1 == 0) goto L_0x000e
                int r1 = r3.setMax
                int r3 = r3.getMax
                int r1 = r1 - r3
                goto L_0x0010
            L_0x000e:
                int r1 = r3.setMin
            L_0x0010:
                if (r0 >= r1) goto L_0x001e
                int r3 = r2.mFlexLinePosition
                if (r3 < 0) goto L_0x001e
                int r4 = r4.size()
                if (r3 >= r4) goto L_0x001e
                r3 = 1
                return r3
            L_0x001e:
                r3 = 0
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayoutManager.LayoutState.hasMore(androidx.recyclerview.widget.RecyclerView$Mean$Arithmetic, java.util.List):boolean");
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("LayoutState{mAvailable=");
            sb.append(this.mAvailable);
            sb.append(", mFlexLinePosition=");
            sb.append(this.mFlexLinePosition);
            sb.append(", mPosition=");
            sb.append(this.mPosition);
            sb.append(", mOffset=");
            sb.append(this.mOffset);
            sb.append(", mScrollingOffset=");
            sb.append(this.mScrollingOffset);
            sb.append(", mLastScrollDelta=");
            sb.append(this.mLastScrollDelta);
            sb.append(", mItemDirection=");
            sb.append(this.mItemDirection);
            sb.append(", mLayoutDirection=");
            sb.append(this.mLayoutDirection);
            sb.append('}');
            return sb.toString();
        }
    }

    static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() {
            public final SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            public final SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        };
        /* access modifiers changed from: private */
        public int mAnchorOffset;
        /* access modifiers changed from: private */
        public int mAnchorPosition;

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.mAnchorPosition);
            parcel.writeInt(this.mAnchorOffset);
        }

        SavedState() {
        }

        private SavedState(Parcel parcel) {
            this.mAnchorPosition = parcel.readInt();
            this.mAnchorOffset = parcel.readInt();
        }

        private SavedState(SavedState savedState) {
            this.mAnchorPosition = savedState.mAnchorPosition;
            this.mAnchorOffset = savedState.mAnchorOffset;
        }

        /* access modifiers changed from: private */
        public void invalidateAnchor() {
            this.mAnchorPosition = -1;
        }

        /* access modifiers changed from: private */
        public boolean hasValidAnchor(int i) {
            int i2 = this.mAnchorPosition;
            return i2 >= 0 && i2 < i;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("SavedState{mAnchorPosition=");
            sb.append(this.mAnchorPosition);
            sb.append(", mAnchorOffset=");
            sb.append(this.mAnchorOffset);
            sb.append('}');
            return sb.toString();
        }
    }
}
