package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import java.util.Locale;

public final class setInitialActivityCount extends RecyclerView.toIntRange {
    public int IsOverlapping;
    @NonNull
    private final ViewPager2 equals;
    public int getMax;
    public setMin getMin = new setMin();
    private boolean hashCode;
    @NonNull
    private final RecyclerView isInside;
    int length;
    public ViewPager2.getMax setMax;
    public int setMin;
    public boolean toFloatRange;
    public boolean toIntRange;
    @NonNull
    private final LinearLayoutManager toString;
    private boolean values;

    public setInitialActivityCount(@NonNull ViewPager2 viewPager2) {
        this.equals = viewPager2;
        RecyclerView recyclerView = viewPager2.mRecyclerView;
        this.isInside = recyclerView;
        this.toString = (LinearLayoutManager) recyclerView.getLayoutManager();
        setMin();
    }

    /* access modifiers changed from: package-private */
    public final void setMin() {
        this.setMin = 0;
        this.getMax = 0;
        setMin setmin = this.getMin;
        setmin.length = -1;
        setmin.getMax = 0.0f;
        setmin.setMax = 0;
        this.length = -1;
        this.IsOverlapping = -1;
        this.hashCode = false;
        this.values = false;
        this.toFloatRange = false;
        this.toIntRange = false;
    }

    public final void onScrollStateChanged(@NonNull RecyclerView recyclerView, int i) {
        boolean z = true;
        if (!(this.setMin == 1 && this.getMax == 1) && i == 1) {
            setMin(false);
        } else if (!IsOverlapping() || i != 2) {
            if (IsOverlapping() && i == 0) {
                getMax();
                if (!this.values) {
                    if (this.getMin.length != -1) {
                        int i2 = this.getMin.length;
                        ViewPager2.getMax getmax = this.setMax;
                        if (getmax != null) {
                            getmax.onPageScrolled(i2, 0.0f, 0);
                        }
                    }
                } else if (this.getMin.setMax != 0) {
                    z = false;
                } else if (this.length != this.getMin.length) {
                    int i3 = this.getMin.length;
                    ViewPager2.getMax getmax2 = this.setMax;
                    if (getmax2 != null) {
                        getmax2.onPageSelected(i3);
                    }
                }
                if (z) {
                    setMax(0);
                    setMin();
                }
            }
            if (this.setMin == 2 && i == 0 && this.toIntRange) {
                getMax();
                if (this.getMin.setMax == 0) {
                    if (this.IsOverlapping != this.getMin.length) {
                        int i4 = this.getMin.length == -1 ? 0 : this.getMin.length;
                        ViewPager2.getMax getmax3 = this.setMax;
                        if (getmax3 != null) {
                            getmax3.onPageSelected(i4);
                        }
                    }
                    setMax(0);
                    setMin();
                }
            }
        } else if (this.values) {
            setMax(2);
            this.hashCode = true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001d, code lost:
        if ((r6 < 0) == r4.equals.isRtl()) goto L_0x0022;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0031  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onScrolled(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView r5, int r6, int r7) {
        /*
            r4 = this;
            r5 = 1
            r4.values = r5
            r4.getMax()
            boolean r0 = r4.hashCode
            r1 = -1
            r2 = 0
            if (r0 == 0) goto L_0x0043
            r4.hashCode = r2
            if (r7 > 0) goto L_0x0022
            if (r7 != 0) goto L_0x0020
            if (r6 >= 0) goto L_0x0016
            r6 = 1
            goto L_0x0017
        L_0x0016:
            r6 = 0
        L_0x0017:
            androidx.viewpager2.widget.ViewPager2 r7 = r4.equals
            boolean r7 = r7.isRtl()
            if (r6 != r7) goto L_0x0020
            goto L_0x0022
        L_0x0020:
            r6 = 0
            goto L_0x0023
        L_0x0022:
            r6 = 1
        L_0x0023:
            if (r6 == 0) goto L_0x0031
            o.setInitialActivityCount$setMin r6 = r4.getMin
            int r6 = r6.setMax
            if (r6 == 0) goto L_0x0031
            o.setInitialActivityCount$setMin r6 = r4.getMin
            int r6 = r6.length
            int r6 = r6 + r5
            goto L_0x0035
        L_0x0031:
            o.setInitialActivityCount$setMin r6 = r4.getMin
            int r6 = r6.length
        L_0x0035:
            r4.IsOverlapping = r6
            int r7 = r4.length
            if (r7 == r6) goto L_0x0055
            androidx.viewpager2.widget.ViewPager2$getMax r7 = r4.setMax
            if (r7 == 0) goto L_0x0055
            r7.onPageSelected(r6)
            goto L_0x0055
        L_0x0043:
            int r6 = r4.setMin
            if (r6 != 0) goto L_0x0055
            o.setInitialActivityCount$setMin r6 = r4.getMin
            int r6 = r6.length
            if (r6 != r1) goto L_0x004e
            r6 = 0
        L_0x004e:
            androidx.viewpager2.widget.ViewPager2$getMax r7 = r4.setMax
            if (r7 == 0) goto L_0x0055
            r7.onPageSelected(r6)
        L_0x0055:
            o.setInitialActivityCount$setMin r6 = r4.getMin
            int r6 = r6.length
            if (r6 != r1) goto L_0x005d
            r6 = 0
            goto L_0x0061
        L_0x005d:
            o.setInitialActivityCount$setMin r6 = r4.getMin
            int r6 = r6.length
        L_0x0061:
            o.setInitialActivityCount$setMin r7 = r4.getMin
            float r7 = r7.getMax
            o.setInitialActivityCount$setMin r0 = r4.getMin
            int r0 = r0.setMax
            androidx.viewpager2.widget.ViewPager2$getMax r3 = r4.setMax
            if (r3 == 0) goto L_0x0070
            r3.onPageScrolled(r6, r7, r0)
        L_0x0070:
            o.setInitialActivityCount$setMin r6 = r4.getMin
            int r6 = r6.length
            int r7 = r4.IsOverlapping
            if (r6 == r7) goto L_0x007a
            if (r7 != r1) goto L_0x008a
        L_0x007a:
            o.setInitialActivityCount$setMin r6 = r4.getMin
            int r6 = r6.setMax
            if (r6 != 0) goto L_0x008a
            int r6 = r4.getMax
            if (r6 == r5) goto L_0x008a
            r4.setMax(r2)
            r4.setMin()
        L_0x008a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setInitialActivityCount.onScrolled(androidx.recyclerview.widget.RecyclerView, int, int):void");
    }

    public final void getMax() {
        int i;
        setMin setmin = this.getMin;
        setmin.length = this.toString.findFirstVisibleItemPosition();
        float f = 0.0f;
        if (setmin.length == -1) {
            setmin.length = -1;
            setmin.getMax = 0.0f;
            setmin.setMax = 0;
            return;
        }
        View findViewByPosition = this.toString.findViewByPosition(setmin.length);
        if (findViewByPosition == null) {
            setmin.length = -1;
            setmin.getMax = 0.0f;
            setmin.setMax = 0;
            return;
        }
        int leftDecorationWidth = this.toString.getLeftDecorationWidth(findViewByPosition);
        int rightDecorationWidth = this.toString.getRightDecorationWidth(findViewByPosition);
        int topDecorationHeight = this.toString.getTopDecorationHeight(findViewByPosition);
        int bottomDecorationHeight = this.toString.getBottomDecorationHeight(findViewByPosition);
        ViewGroup.LayoutParams layoutParams = findViewByPosition.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            leftDecorationWidth += marginLayoutParams.leftMargin;
            rightDecorationWidth += marginLayoutParams.rightMargin;
            topDecorationHeight += marginLayoutParams.topMargin;
            bottomDecorationHeight += marginLayoutParams.bottomMargin;
        }
        int height = findViewByPosition.getHeight() + topDecorationHeight + bottomDecorationHeight;
        int width = findViewByPosition.getWidth() + leftDecorationWidth + rightDecorationWidth;
        if (this.toString.getOrientation() == 0) {
            i = (findViewByPosition.getLeft() - leftDecorationWidth) - this.isInside.getPaddingLeft();
            if (this.equals.isRtl()) {
                i = -i;
            }
            height = width;
        } else {
            i = (findViewByPosition.getTop() - topDecorationHeight) - this.isInside.getPaddingTop();
        }
        setmin.setMax = -i;
        if (setmin.setMax >= 0) {
            if (height != 0) {
                f = ((float) setmin.setMax) / ((float) height);
            }
            setmin.getMax = f;
        } else if (new dismissPopup(this.toString).setMin()) {
            throw new IllegalStateException("Page(s) contain a ViewGroup with a LayoutTransition (or animateLayoutChanges=\"true\"), which interferes with the scrolling animation. Make sure to call getLayoutTransition().setAnimateParentHierarchy(false) on all ViewGroups with a LayoutTransition before an animation is started.");
        } else {
            throw new IllegalStateException(String.format(Locale.US, "Page can only be offset by a positive amount, not by %d", new Object[]{Integer.valueOf(setmin.setMax)}));
        }
    }

    /* access modifiers changed from: package-private */
    public final void setMin(boolean z) {
        this.toFloatRange = z;
        this.setMin = z ? 4 : 1;
        int i = this.IsOverlapping;
        if (i != -1) {
            this.length = i;
            this.IsOverlapping = -1;
        } else if (this.length == -1) {
            this.length = this.toString.findFirstVisibleItemPosition();
        }
        setMax(1);
    }

    public final boolean setMax() {
        return this.getMax == 0;
    }

    /* access modifiers changed from: package-private */
    public final boolean getMin() {
        return this.getMax == 1;
    }

    /* access modifiers changed from: package-private */
    public final boolean length() {
        return this.toFloatRange;
    }

    private boolean IsOverlapping() {
        int i = this.setMin;
        return i == 1 || i == 4;
    }

    public final void setMax(int i) {
        if ((this.setMin != 3 || this.getMax != 0) && this.getMax != i) {
            this.getMax = i;
            ViewPager2.getMax getmax = this.setMax;
            if (getmax != null) {
                getmax.onPageScrollStateChanged(i);
            }
        }
    }

    public static final class setMin {
        public float getMax;
        public int length;
        int setMax;

        setMin() {
        }
    }
}
