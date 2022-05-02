package o;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ru.tinkoff.scrollingpagerindicator.ScrollingPagerIndicator;

public final class shouldWrite implements ScrollingPagerIndicator.getMax<RecyclerView> {
    private final boolean equals;
    private RecyclerView.toIntRange getMax;
    private LinearLayoutManager getMin;
    private final int isInside;
    /* access modifiers changed from: private */
    public RecyclerView.Adapter<?> length;
    private RecyclerView setMax;
    private ScrollingPagerIndicator setMin;
    private RecyclerView.setMin toFloatRange;
    private int toIntRange;

    public final /* synthetic */ void length(@NonNull final ScrollingPagerIndicator scrollingPagerIndicator, @NonNull Object obj) {
        RecyclerView recyclerView = (RecyclerView) obj;
        if (recyclerView.getLayoutManager() instanceof LinearLayoutManager) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
            this.getMin = linearLayoutManager;
            if (linearLayoutManager.getOrientation() == 0) {
                this.setMax = recyclerView;
                this.length = recyclerView.getAdapter();
                this.setMin = scrollingPagerIndicator;
                AnonymousClass4 r3 = new RecyclerView.setMin() {
                    public final void onChanged() {
                        scrollingPagerIndicator.setDotCount(shouldWrite.this.length.getItemCount());
                        shouldWrite.this.getMax();
                    }

                    public final void onItemRangeChanged(int i, int i2) {
                        onChanged();
                    }

                    public final void onItemRangeChanged(int i, int i2, Object obj) {
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
                };
                this.toFloatRange = r3;
                this.length.registerAdapterDataObserver(r3);
                scrollingPagerIndicator.setDotCount(this.length.getItemCount());
                getMax();
                AnonymousClass5 r32 = new RecyclerView.toIntRange() {
                    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
                        int min;
                        int max = dispatchOnCancelled.setMax(i);
                        if (i != max) {
                            onCanceled oncanceled = new onCanceled(i, max, 1);
                            onCancelLoad.setMax(13197493, oncanceled);
                            onCancelLoad.getMin(13197493, oncanceled);
                        }
                        if (i == 0 && shouldWrite.this.setMax() && (min = shouldWrite.this.getMin()) != -1) {
                            scrollingPagerIndicator.setDotCount(shouldWrite.this.length.getItemCount());
                            if (min < shouldWrite.this.length.getItemCount()) {
                                scrollingPagerIndicator.setCurrentPosition(min);
                            }
                        }
                    }

                    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
                        shouldWrite.this.getMax();
                    }
                };
                this.getMax = r32;
                this.setMax.addOnScrollListener(r32);
                return;
            }
            throw new IllegalStateException("Only HORIZONTAL orientation is supported");
        }
        throw new IllegalStateException("Only LinearLayoutManager is supported");
    }

    public shouldWrite() {
        this.isInside = 0;
        this.equals = true;
    }

    public shouldWrite(int i) {
        this.isInside = i;
        this.equals = false;
    }

    public final void length() {
        this.length.unregisterAdapterDataObserver(this.toFloatRange);
        this.setMax.removeOnScrollListener(this.getMax);
        this.toIntRange = 0;
    }

    /* access modifiers changed from: private */
    public int getMin() {
        float f;
        float f2;
        float f3;
        RecyclerView.valueOf findContainingViewHolder;
        for (int i = 0; i < this.setMax.getChildCount(); i++) {
            View childAt = this.setMax.getChildAt(i);
            float x = childAt.getX();
            if (this.equals) {
                f = (((float) this.setMax.getMeasuredWidth()) - setMin()) / 2.0f;
            } else {
                f = (float) this.isInside;
            }
            if (x >= f) {
                float x2 = childAt.getX() + ((float) childAt.getMeasuredWidth());
                if (this.equals) {
                    f3 = (((float) this.setMax.getMeasuredWidth()) - setMin()) / 2.0f;
                    f2 = setMin();
                } else {
                    f3 = (float) this.isInside;
                    f2 = setMin();
                }
                if (!(x2 > f3 + f2 || (findContainingViewHolder = this.setMax.findContainingViewHolder(childAt)) == null || findContainingViewHolder.getAdapterPosition() == -1)) {
                    return findContainingViewHolder.getAdapterPosition();
                }
            }
        }
        return -1;
    }

    /* access modifiers changed from: private */
    public boolean setMax() {
        return getMin() != -1;
    }

    private float setMin() {
        int i;
        if (this.toIntRange == 0) {
            int i2 = 0;
            while (true) {
                if (i2 >= this.setMax.getChildCount()) {
                    break;
                }
                View childAt = this.setMax.getChildAt(i2);
                if (childAt.getMeasuredWidth() != 0) {
                    i = childAt.getMeasuredWidth();
                    this.toIntRange = i;
                    break;
                }
                i2++;
            }
        }
        i = this.toIntRange;
        return (float) i;
    }

    /* access modifiers changed from: private */
    public void getMax() {
        int childAdapterPosition;
        float f;
        float f2;
        int childCount = this.getMin.getChildCount();
        View view = null;
        if (childCount != 0) {
            int i = Integer.MAX_VALUE;
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = this.getMin.getChildAt(i2);
                int x = (int) childAt.getX();
                if (childAt.getMeasuredWidth() + x < i) {
                    float measuredWidth = (float) (childAt.getMeasuredWidth() + x);
                    if (this.equals) {
                        f2 = (((float) this.setMax.getMeasuredWidth()) - setMin()) / 2.0f;
                    } else {
                        f2 = (float) this.isInside;
                    }
                    if (measuredWidth > f2) {
                        view = childAt;
                        i = x;
                    }
                }
            }
        }
        if (view != null && (childAdapterPosition = this.setMax.getChildAdapterPosition(view)) != -1) {
            int itemCount = this.length.getItemCount();
            if (childAdapterPosition >= itemCount && itemCount != 0) {
                childAdapterPosition %= itemCount;
            }
            if (this.equals) {
                f = (((float) this.setMax.getMeasuredWidth()) - setMin()) / 2.0f;
            } else {
                f = (float) this.isInside;
            }
            float x2 = (f - view.getX()) / ((float) view.getMeasuredWidth());
            if (x2 >= 0.0f && x2 <= 1.0f && childAdapterPosition < itemCount) {
                this.setMin.onPageScrolled(childAdapterPosition, x2);
            }
        }
    }
}
