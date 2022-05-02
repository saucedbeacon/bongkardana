package com.yarolegovich.discretescrollview;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;
import o.onItemsAdded;
import o.onItemsRemoved;
import o.onSmoothScrollerStopped;
import o.stopSmoothScroller;

public class DiscreteScrollView extends RecyclerView {
    public static final int NO_POSITION = -1;
    private static final int length = DSVOrientation.HORIZONTAL.ordinal();
    /* access modifiers changed from: private */
    public boolean getMax;
    /* access modifiers changed from: private */
    public List<setMin> getMin;
    /* access modifiers changed from: private */
    public onItemsAdded setMax;
    /* access modifiers changed from: private */
    public List<getMax> setMin;

    public interface getMax<T extends RecyclerView.valueOf> {
        void setMin(int i);
    }

    public interface length<T extends RecyclerView.valueOf> {
    }

    public interface setMin<T extends RecyclerView.valueOf> {
    }

    public DiscreteScrollView(Context context) {
        super(context);
        length((AttributeSet) null);
    }

    public DiscreteScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        length(attributeSet);
    }

    public DiscreteScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        length(attributeSet);
    }

    private void length(AttributeSet attributeSet) {
        this.setMin = new ArrayList();
        this.getMin = new ArrayList();
        int i = length;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, onItemsRemoved.setMin.valueOf);
            i = obtainStyledAttributes.getInt(onItemsRemoved.setMin.invoke, length);
            obtainStyledAttributes.recycle();
        }
        this.getMax = getOverScrollMode() != 2;
        onItemsAdded onitemsadded = new onItemsAdded(getContext(), new setMax(this, (byte) 0), DSVOrientation.values()[i]);
        this.setMax = onitemsadded;
        setLayoutManager(onitemsadded);
    }

    public void setLayoutManager(RecyclerView.IsOverlapping isOverlapping) {
        if (isOverlapping instanceof onItemsAdded) {
            super.setLayoutManager(isOverlapping);
            return;
        }
        throw new IllegalArgumentException(getContext().getString(onItemsRemoved.setMax.dsv_ex_msg_dont_set_lm));
    }

    public boolean fling(int i, int i2) {
        int max = dispatchOnCancelled.setMax(i);
        if (i != max) {
            onCanceled oncanceled = new onCanceled(i, max, 1);
            onCancelLoad.setMax(849371944, oncanceled);
            onCancelLoad.getMin(849371944, oncanceled);
        }
        boolean fling = super.fling(i, i2);
        if (fling) {
            this.setMax.getMax(i, i2);
        } else {
            this.setMax.setMin();
        }
        return fling;
    }

    @Nullable
    public RecyclerView.valueOf getViewHolder(int i) {
        View findViewByPosition = this.setMax.findViewByPosition(i);
        if (findViewByPosition != null) {
            return getChildViewHolder(findViewByPosition);
        }
        return null;
    }

    public int getCurrentItem() {
        return this.setMax.getMax();
    }

    public void setItemTransformer(stopSmoothScroller stopsmoothscroller) {
        this.setMax.valueOf = stopsmoothscroller;
    }

    public void setItemTransitionTimeMillis(@IntRange(from = 10) int i) {
        int max = dispatchOnCancelled.setMax(i);
        if (i != max) {
            onCanceled oncanceled = new onCanceled(i, max, 1);
            onCancelLoad.setMax(-631208742, oncanceled);
            onCancelLoad.getMin(-631208742, oncanceled);
        }
        this.setMax.Mean$Arithmetic = i;
    }

    public void setSlideOnFling(boolean z) {
        this.setMax.invokeSuspend = z;
    }

    public void setSlideOnFlingThreshold(int i) {
        int max = dispatchOnCancelled.setMax(i);
        if (i != max) {
            onCanceled oncanceled = new onCanceled(i, max, 1);
            onCancelLoad.setMax(-1607531034, oncanceled);
            onCancelLoad.getMin(-1607531034, oncanceled);
        }
        this.setMax.Grayscale$Algorithm = i;
    }

    public void setOrientation(DSVOrientation dSVOrientation) {
        onItemsAdded onitemsadded = this.setMax;
        onitemsadded.values = dSVOrientation.createHelper();
        onitemsadded.invoke.length.removeAllViews();
        onitemsadded.invoke.length.requestLayout();
    }

    public void setOffscreenItems(int i) {
        this.setMax.setMin(i);
    }

    public void setClampTransformProgressAfter(@IntRange(from = 1) int i) {
        if (i > 1) {
            this.setMax.getMin(i);
            return;
        }
        throw new IllegalArgumentException("must be >= 1");
    }

    public void setOverScrollEnabled(boolean z) {
        this.getMax = z;
        setOverScrollMode(2);
    }

    public void addScrollStateChangeListener(@NonNull getMax<?> getmax) {
        this.setMin.add(getmax);
    }

    public void addScrollListener(@NonNull length<?> length2) {
        addScrollStateChangeListener(new onSmoothScrollerStopped(length2));
    }

    public void addOnItemChangedListener(@NonNull setMin<?> setmin) {
        this.getMin.add(setmin);
    }

    public void removeScrollStateChangeListener(@NonNull getMax<?> getmax) {
        this.setMin.remove(getmax);
    }

    public void removeScrollListener(@NonNull length<?> length2) {
        removeScrollStateChangeListener(new onSmoothScrollerStopped(length2));
    }

    public void removeItemChangedListener(@NonNull setMin<?> setmin) {
        this.getMin.remove(setmin);
    }

    class setMax implements onItemsAdded.getMin {
        private setMax() {
        }

        /* synthetic */ setMax(DiscreteScrollView discreteScrollView, byte b) {
            this();
        }

        public final void length(boolean z) {
            if (DiscreteScrollView.this.getMax) {
                DiscreteScrollView.this.setOverScrollMode(z ? 0 : 2);
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:3:0x000d, code lost:
            r0 = com.yarolegovich.discretescrollview.DiscreteScrollView.access$300(r3.setMax).getMax();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void getMax() {
            /*
                r3 = this;
                com.yarolegovich.discretescrollview.DiscreteScrollView r0 = com.yarolegovich.discretescrollview.DiscreteScrollView.this
                java.util.List r0 = r0.setMin
                boolean r0 = r0.isEmpty()
                if (r0 == 0) goto L_0x000d
                return
            L_0x000d:
                com.yarolegovich.discretescrollview.DiscreteScrollView r0 = com.yarolegovich.discretescrollview.DiscreteScrollView.this
                o.onItemsAdded r0 = r0.setMax
                int r0 = r0.getMax()
                com.yarolegovich.discretescrollview.DiscreteScrollView r1 = com.yarolegovich.discretescrollview.DiscreteScrollView.this
                androidx.recyclerview.widget.RecyclerView$valueOf r1 = r1.getViewHolder(r0)
                if (r1 == 0) goto L_0x0024
                com.yarolegovich.discretescrollview.DiscreteScrollView r2 = com.yarolegovich.discretescrollview.DiscreteScrollView.this
                com.yarolegovich.discretescrollview.DiscreteScrollView.access$400(r2, r1, r0)
            L_0x0024:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yarolegovich.discretescrollview.DiscreteScrollView.setMax.getMax():void");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:5:0x0019, code lost:
            r0 = com.yarolegovich.discretescrollview.DiscreteScrollView.access$300(r3.setMax).getMax();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void setMin() {
            /*
                r3 = this;
                com.yarolegovich.discretescrollview.DiscreteScrollView r0 = com.yarolegovich.discretescrollview.DiscreteScrollView.this
                java.util.List r0 = r0.getMin
                boolean r0 = r0.isEmpty()
                if (r0 == 0) goto L_0x0019
                com.yarolegovich.discretescrollview.DiscreteScrollView r0 = com.yarolegovich.discretescrollview.DiscreteScrollView.this
                java.util.List r0 = r0.setMin
                boolean r0 = r0.isEmpty()
                if (r0 == 0) goto L_0x0019
                return
            L_0x0019:
                com.yarolegovich.discretescrollview.DiscreteScrollView r0 = com.yarolegovich.discretescrollview.DiscreteScrollView.this
                o.onItemsAdded r0 = r0.setMax
                int r0 = r0.getMax()
                com.yarolegovich.discretescrollview.DiscreteScrollView r1 = com.yarolegovich.discretescrollview.DiscreteScrollView.this
                androidx.recyclerview.widget.RecyclerView$valueOf r1 = r1.getViewHolder(r0)
                if (r1 == 0) goto L_0x0035
                com.yarolegovich.discretescrollview.DiscreteScrollView r2 = com.yarolegovich.discretescrollview.DiscreteScrollView.this
                com.yarolegovich.discretescrollview.DiscreteScrollView.access$600(r2, r1, r0)
                com.yarolegovich.discretescrollview.DiscreteScrollView r2 = com.yarolegovich.discretescrollview.DiscreteScrollView.this
                com.yarolegovich.discretescrollview.DiscreteScrollView.access$700(r2, r1, r0)
            L_0x0035:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yarolegovich.discretescrollview.DiscreteScrollView.setMax.setMin():void");
        }

        public final void getMin(float f) {
            int currentItem;
            int min;
            if (!DiscreteScrollView.this.setMin.isEmpty() && (currentItem = DiscreteScrollView.this.getCurrentItem()) != (min = DiscreteScrollView.this.setMax.getMin())) {
                DiscreteScrollView discreteScrollView = DiscreteScrollView.this;
                DiscreteScrollView.access$800(discreteScrollView, f, currentItem, min, discreteScrollView.getViewHolder(currentItem), DiscreteScrollView.this.getViewHolder(min));
            }
        }

        public final void setMax() {
            DiscreteScrollView.this.post(new Runnable() {
                public final void run() {
                    DiscreteScrollView.access$900(DiscreteScrollView.this);
                }
            });
        }

        public final void getMin() {
            DiscreteScrollView.access$900(DiscreteScrollView.this);
        }
    }

    static /* synthetic */ void access$400(DiscreteScrollView discreteScrollView, RecyclerView.valueOf valueof, int i) {
        Iterator<getMax> it = discreteScrollView.setMin.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    static /* synthetic */ void access$600(DiscreteScrollView discreteScrollView, RecyclerView.valueOf valueof, int i) {
        Iterator<getMax> it = discreteScrollView.setMin.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    static /* synthetic */ void access$700(DiscreteScrollView discreteScrollView, RecyclerView.valueOf valueof, int i) {
        Iterator<setMin> it = discreteScrollView.getMin.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    static /* synthetic */ void access$800(DiscreteScrollView discreteScrollView, float f, int i, int i2, RecyclerView.valueOf valueof, RecyclerView.valueOf valueof2) {
        for (getMax min : discreteScrollView.setMin) {
            min.setMin(i);
        }
    }

    static /* synthetic */ void access$900(DiscreteScrollView discreteScrollView) {
        if (!discreteScrollView.getMin.isEmpty()) {
            discreteScrollView.getViewHolder(discreteScrollView.setMax.getMax());
            Iterator<setMin> it = discreteScrollView.getMin.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }
}
