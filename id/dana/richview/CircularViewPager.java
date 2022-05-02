package id.dana.richview;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.View;
import androidx.viewpager.widget.ViewPager;
import id.dana.richview.CircularViewPager;
import o.GriverCaptureActivity;
import o.resetInternal;
import o.setExpandActivityOverflowButtonDrawable;

public class CircularViewPager extends ViewPager {
    /* access modifiers changed from: private */
    public int FastBitmap$CoordinateSystem = 0;
    private final int IsOverlapping = ((int) (Resources.getSystem().getDisplayMetrics().density * 322.0f));
    protected float aspectRatio;
    protected boolean autoScroll;
    /* access modifiers changed from: private */
    public setMin equals;
    /* access modifiers changed from: private */
    public int getMax;
    /* access modifiers changed from: private */
    public int getMin;
    /* access modifiers changed from: private */
    public boolean hashCode = false;
    protected boolean infinite = true;
    private Runnable isInside = new Runnable(this) {
        private final CircularViewPager setMin;

        {
            this.setMin = r1;
        }

        public final void run() {
            CircularViewPager.length(this.setMin);
        }
    };
    protected float itemAspectRatio;
    private boolean length;
    private boolean setMax;
    private int setMin = 1500;
    /* access modifiers changed from: private */
    public boolean toDoubleRange = true;
    /* access modifiers changed from: private */
    public getMax toFloatRange;
    private final Handler toIntRange = new Handler();
    /* access modifiers changed from: private */
    public int toString = 0;
    protected boolean wrapContent = true;

    public interface getMax {
        void getMax();

        void getMax(boolean z);
    }

    public interface setMin {
        void getMax(int i);
    }

    public CircularViewPager(Context context) {
        super(context);
        init();
    }

    /* JADX INFO: finally extract failed */
    public CircularViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, resetInternal.getMin.newSession, 0, 0);
        try {
            this.infinite = obtainStyledAttributes.getBoolean(2, false);
            this.autoScroll = obtainStyledAttributes.getBoolean(0, false);
            this.wrapContent = obtainStyledAttributes.getBoolean(6, true);
            this.setMin = obtainStyledAttributes.getInt(4, 1500);
            this.aspectRatio = obtainStyledAttributes.getFloat(5, 0.0f);
            this.itemAspectRatio = obtainStyledAttributes.getFloat(3, 0.0f);
            this.length = obtainStyledAttributes.getBoolean(1, false);
            this.setMax = this.autoScroll;
            obtainStyledAttributes.recycle();
            init();
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* access modifiers changed from: protected */
    public void init() {
        addOnPageChangeListener(new ViewPager.setMax() {
            float setMax;

            public final void onPageScrolled(int i, float f, int i2) {
                if (CircularViewPager.this.equals != null) {
                    boolean unused = CircularViewPager.this.toDoubleRange = length(i, f);
                    if (f == 0.0f) {
                        this.setMax = (float) i;
                    }
                    CircularViewPager circularViewPager = CircularViewPager.this;
                    int selectingIndicatorPosition = circularViewPager.getSelectingIndicatorPosition(circularViewPager.toDoubleRange);
                    float access$200 = CircularViewPager.access$200(CircularViewPager.this, i, f);
                    if (access$200 != 0.0f && access$200 <= 1.0f) {
                        CircularViewPager.access$300(CircularViewPager.this, selectingIndicatorPosition, access$200);
                    }
                }
            }

            public final void onPageSelected(int i) {
                CircularViewPager circularViewPager = CircularViewPager.this;
                int unused = circularViewPager.getMin = circularViewPager.getMax;
                int unused2 = CircularViewPager.this.getMax = i;
                if (CircularViewPager.this.equals != null) {
                    CircularViewPager.this.equals.getMax(CircularViewPager.this.getIndicatorPosition());
                }
                if (CircularViewPager.this.toFloatRange != null) {
                    CircularViewPager.this.toFloatRange.getMax();
                }
                CircularViewPager.access$700(CircularViewPager.this);
            }

            public final void onPageScrollStateChanged(int i) {
                boolean z = true;
                if (!CircularViewPager.this.hashCode && CircularViewPager.this.FastBitmap$CoordinateSystem == 2 && i == 1 && CircularViewPager.this.equals != null) {
                    setMin unused = CircularViewPager.this.equals;
                    CircularViewPager circularViewPager = CircularViewPager.this;
                    circularViewPager.getSelectingIndicatorPosition(circularViewPager.toDoubleRange);
                }
                if (!(i == 2 || i == 1)) {
                    z = false;
                }
                if (CircularViewPager.this.toFloatRange != null) {
                    CircularViewPager.this.toFloatRange.getMax(z);
                }
                CircularViewPager circularViewPager2 = CircularViewPager.this;
                int unused2 = circularViewPager2.toString = circularViewPager2.FastBitmap$CoordinateSystem;
                int unused3 = CircularViewPager.this.FastBitmap$CoordinateSystem = i;
                CircularViewPager.access$1100(CircularViewPager.this, i);
            }

            private boolean length(int i, float f) {
                return ((float) i) + f >= this.setMax;
            }
        });
        if (this.infinite) {
            setCurrentItem(1, false);
        }
    }

    public void setAdapter(setExpandActivityOverflowButtonDrawable setexpandactivityoverflowbuttondrawable) {
        super.setAdapter(setexpandactivityoverflowbuttondrawable);
        if (this.infinite) {
            setCurrentItem(1, false);
        }
    }

    public void onMeasure(int i, int i2) {
        int mode;
        int size = View.MeasureSpec.getSize(i);
        if (this.aspectRatio > 0.0f) {
            int round = Math.round(((float) View.MeasureSpec.getSize(i)) / this.aspectRatio);
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(round, 1073741824);
            float f = this.itemAspectRatio;
            if ((f > 0.0f && f != this.aspectRatio) || (this.itemAspectRatio > 0.0f && getAdapter().getCount() > 1)) {
                super.onMeasure(i, i2);
                int makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec((size - getPaddingLeft()) - getPaddingRight(), 1073741824);
                for (int i3 = 0; i3 < getChildCount(); i3++) {
                    View childAt = getChildAt(i3);
                    childAt.measure(makeMeasureSpec3, View.MeasureSpec.makeMeasureSpec(0, 0));
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (measuredHeight > 0 && measuredHeight > round) {
                        double floor = Math.floor((double) (((float) round) * (((float) measuredWidth) / ((float) measuredHeight))));
                        double d = (double) size;
                        Double.isNaN(d);
                        int round2 = (int) Math.round((d - floor) / 2.0d);
                        setPadding(round2, getPaddingTop(), round2, getPaddingBottom());
                        makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec((size - getPaddingLeft()) - getPaddingRight(), 1073741824);
                        childAt.measure(makeMeasureSpec3, View.MeasureSpec.makeMeasureSpec(0, 0));
                    }
                }
            }
            super.onMeasure(makeMeasureSpec, makeMeasureSpec2);
            return;
        }
        if (this.wrapContent && ((mode = View.MeasureSpec.getMode(i2)) == 0 || mode == Integer.MIN_VALUE)) {
            super.onMeasure(i, i2);
            int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
            if (this.length) {
                paddingLeft = this.IsOverlapping;
                int i4 = (size - paddingLeft) / 2;
                setPadding(i4, getPaddingTop(), i4, getPaddingBottom());
            }
            int makeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824);
            int i5 = 0;
            for (int i6 = 0; i6 < getChildCount(); i6++) {
                View childAt2 = getChildAt(i6);
                childAt2.measure(makeMeasureSpec4, View.MeasureSpec.makeMeasureSpec(0, 0));
                int measuredHeight2 = childAt2.getMeasuredHeight();
                if (measuredHeight2 > i5) {
                    i5 = measuredHeight2;
                }
            }
            i2 = View.MeasureSpec.makeMeasureSpec(i5 + getPaddingTop() + getPaddingBottom(), 1073741824);
        }
        super.onMeasure(i, i2);
    }

    public void resumeAutoScroll() {
        this.setMax = true;
        this.toIntRange.postDelayed(this.isInside, (long) this.setMin);
    }

    public void pauseAutoScroll() {
        this.setMax = false;
        this.toIntRange.removeCallbacks(this.isInside);
    }

    public int getIndicatorPosition() {
        int i;
        if (!this.infinite || !(getAdapter() instanceof GriverCaptureActivity.AnonymousClass1)) {
            return this.getMax;
        }
        int i2 = this.getMax;
        if (i2 == 0) {
            i = ((GriverCaptureActivity.AnonymousClass1) getAdapter()).getMin();
        } else if (i2 == ((GriverCaptureActivity.AnonymousClass1) getAdapter()).length() + 1) {
            return 0;
        } else {
            i = this.getMax;
        }
        return i - 1;
    }

    public int getSelectingIndicatorPosition(boolean z) {
        int i = this.FastBitmap$CoordinateSystem;
        if (i == 2 || i == 0 || (this.toString == 2 && i == 1)) {
            return getIndicatorPosition();
        }
        int i2 = z ? 1 : -1;
        if (!this.infinite) {
            return this.getMax + i2;
        }
        if (!(getAdapter() instanceof GriverCaptureActivity.AnonymousClass1)) {
            return this.getMax + i2;
        }
        if (setMin(z)) {
            return ((GriverCaptureActivity.AnonymousClass1) getAdapter()).length() - 1;
        }
        if (this.getMax != ((GriverCaptureActivity.AnonymousClass1) getAdapter()).length() || !z) {
            return (this.getMax + i2) - 1;
        }
        return 0;
    }

    private boolean setMin(boolean z) {
        return this.getMax == 1 && !z;
    }

    public int getIndicatorCount() {
        if (getAdapter() instanceof GriverCaptureActivity.AnonymousClass1) {
            return ((GriverCaptureActivity.AnonymousClass1) getAdapter()).getMin();
        }
        return getAdapter().getCount();
    }

    public void reset() {
        boolean z = this.infinite;
        this.getMax = z ? 1 : 0;
        setCurrentItem(z, false);
    }

    public void setIndicatorSmart(boolean z) {
        this.hashCode = z;
    }

    public void setIndicatorPageChangeListener(setMin setmin) {
        this.equals = setmin;
    }

    public void setCircularViewPagerListener(getMax getmax) {
        this.toFloatRange = getmax;
    }

    public void setIntervalAutoScroll(int i) {
        this.setMin = i;
        pauseAutoScroll();
        resumeAutoScroll();
    }

    static /* synthetic */ float access$200(CircularViewPager circularViewPager, int i, float f) {
        if (circularViewPager.FastBitmap$CoordinateSystem != 2 || Math.abs(circularViewPager.getMax - circularViewPager.getMin) <= 1) {
            return circularViewPager.toDoubleRange ? f : 1.0f - f;
        }
        int abs = Math.abs(circularViewPager.getMax - circularViewPager.getMin);
        if (circularViewPager.toDoubleRange) {
            float f2 = (float) (i - circularViewPager.getMin);
            float f3 = (float) abs;
            return (f2 / f3) + (f / f3);
        }
        float f4 = (float) abs;
        return (((float) (circularViewPager.getMin - (i + 1))) / f4) + ((1.0f - f) / f4);
    }

    static /* synthetic */ void access$300(CircularViewPager circularViewPager, int i, float f) {
        if (!circularViewPager.hashCode || circularViewPager.FastBitmap$CoordinateSystem == 1) {
        }
    }

    static /* synthetic */ void access$700(CircularViewPager circularViewPager) {
        if (circularViewPager.setMax) {
            circularViewPager.toIntRange.removeCallbacks(circularViewPager.isInside);
            circularViewPager.toIntRange.postDelayed(circularViewPager.isInside, (long) circularViewPager.setMin);
        }
    }

    static /* synthetic */ void access$1100(CircularViewPager circularViewPager, int i) {
        int count;
        if (i == 0) {
            if (circularViewPager.infinite) {
                if (circularViewPager.getAdapter() != null && (count = circularViewPager.getAdapter().getCount()) >= 2) {
                    int currentItem = circularViewPager.getCurrentItem();
                    if (currentItem == 0) {
                        circularViewPager.setCurrentItem(count - 2, false);
                    } else if (currentItem == count - 1) {
                        circularViewPager.setCurrentItem(1, false);
                    }
                } else {
                    return;
                }
            }
            if (circularViewPager.equals != null) {
                circularViewPager.getIndicatorPosition();
            }
        }
    }

    public static /* synthetic */ void length(CircularViewPager circularViewPager) {
        if (circularViewPager.getAdapter() != null && circularViewPager.autoScroll && circularViewPager.getAdapter().getCount() >= 2) {
            if (circularViewPager.infinite || circularViewPager.getAdapter().getCount() - 1 != circularViewPager.getMax) {
                circularViewPager.getMax++;
            } else {
                circularViewPager.getMax = 0;
            }
            circularViewPager.setCurrentItem(circularViewPager.getMax, true);
        }
    }
}
