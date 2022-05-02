package com.facebook.litho.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.facebook.litho.ComponentTree;
import com.facebook.litho.LithoView;
import java.util.List;
import javax.annotation.Nullable;
import o.OperationCanceledException;
import o.ensureProcessorRunningLocked;

public class SectionsRecyclerView extends SwipeRefreshLayout implements OperationCanceledException {
    private final LithoView getMax;
    private boolean length = false;
    private final RecyclerView setMax;

    public SectionsRecyclerView(Context context, RecyclerView recyclerView) {
        super(context);
        this.setMax = recyclerView;
        recyclerView.setChildDrawingOrderCallback(new RecyclerView.length() {
            public final int getMax(int i, int i2) {
                return (i - 1) - i2;
            }
        });
        this.setMax.setItemViewCacheSize(0);
        addView(this.setMax);
        LithoView lithoView = new LithoView(new ensureProcessorRunningLocked(getContext()), (AttributeSet) null);
        this.getMax = lithoView;
        lithoView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        addView(this.getMax);
    }

    public RecyclerView getRecyclerView() {
        return this.setMax;
    }

    public void setStickyComponent(ComponentTree componentTree) {
        if (componentTree.getLithoView() != null) {
            componentTree.getLithoView().startTemporaryDetach();
        }
        this.getMax.setComponentTree(componentTree);
        measureChild(this.getMax, View.MeasureSpec.makeMeasureSpec(getWidth(), 1073741824), 0);
    }

    public LithoView getStickyHeader() {
        return this.getMax;
    }

    public void setStickyHeaderVerticalOffset(int i) {
        this.getMax.setTranslationY((float) i);
    }

    public void showStickyHeader() {
        this.getMax.setVisibility(0);
        this.getMax.performIncrementalMount();
    }

    public void hideStickyHeader() {
        this.getMax.unmountAllItems();
        this.getMax.setVisibility(8);
    }

    public boolean isStickyHeaderHidden() {
        return this.getMax.getVisibility() == 8;
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        measureChild(this.getMax, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), 0);
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.getMax.getVisibility() != 8) {
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            LithoView lithoView = this.getMax;
            lithoView.layout(paddingLeft, paddingTop, lithoView.getMeasuredWidth() + paddingLeft, this.getMax.getMeasuredHeight() + paddingTop);
        }
    }

    @Nullable
    static SectionsRecyclerView getParentRecycler(RecyclerView recyclerView) {
        if (recyclerView.getParent() instanceof SectionsRecyclerView) {
            return (SectionsRecyclerView) recyclerView.getParent();
        }
        return null;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.length = true;
    }

    public boolean isLayoutRequested() {
        if (getParent() != null) {
            return getParent().isLayoutRequested() || super.isLayoutRequested();
        }
        return super.isLayoutRequested();
    }

    /* access modifiers changed from: package-private */
    public boolean hasBeenDetachedFromWindow() {
        return this.length;
    }

    /* access modifiers changed from: package-private */
    public void setHasBeenDetachedFromWindow(boolean z) {
        this.length = z;
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (getParent() != null && !isNestedScrollingEnabled()) {
            getParent().requestDisallowInterceptTouchEvent(z);
        }
    }

    public void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.setMax.setOnTouchListener(onTouchListener);
    }

    public void obtainLithoViewChildren(List<LithoView> list) {
        int childCount = this.setMax.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = this.setMax.getChildAt(i);
            if (childAt instanceof LithoView) {
                list.add((LithoView) childAt);
            }
        }
    }
}
