package androidx.gridlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.LogPrinter;
import android.util.Pair;
import android.util.Printer;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.ViewCompat;
import androidx.legacy.widget.Space;
import com.j256.ormlite.stmt.query.SimpleComparison;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import o.DrawerArrowDrawable$ArrowDirection;
import o.onPostResume;

public class GridLayout extends ViewGroup {
    public static final int ALIGN_BOUNDS = 0;
    public static final int ALIGN_MARGINS = 1;
    public static final getMin BASELINE = new getMin() {
        /* access modifiers changed from: package-private */
        public final int getMax(View view, int i) {
            return 0;
        }

        /* access modifiers changed from: package-private */
        public final String setMin() {
            return "BASELINE";
        }

        public final int setMin(View view, int i, int i2) {
            if (view.getVisibility() == 8) {
                return 0;
            }
            int baseline = view.getBaseline();
            if (baseline == -1) {
                return Integer.MIN_VALUE;
            }
            return baseline;
        }

        public final setMax length() {
            return new setMax() {
                private int setMax;

                /* access modifiers changed from: protected */
                public final void getMin() {
                    super.getMin();
                    this.setMax = Integer.MIN_VALUE;
                }

                /* access modifiers changed from: protected */
                public final void getMin(int i, int i2) {
                    super.getMin(i, i2);
                    this.setMax = Math.max(this.setMax, i + i2);
                }

                /* access modifiers changed from: protected */
                public final int getMax(boolean z) {
                    return Math.max(super.getMax(z), this.setMax);
                }

                /* access modifiers changed from: protected */
                public final int getMin(GridLayout gridLayout, View view, getMin getmin, int i, boolean z) {
                    return Math.max(0, super.getMin(gridLayout, view, getmin, i, z));
                }
            };
        }
    };
    public static final getMin BOTTOM;
    static final int CAN_STRETCH = 2;
    public static final getMin CENTER = new getMin() {
        /* access modifiers changed from: package-private */
        public final int getMax(View view, int i) {
            return i >> 1;
        }

        public final int setMin(View view, int i, int i2) {
            return i >> 1;
        }

        /* access modifiers changed from: package-private */
        public final String setMin() {
            return "CENTER";
        }
    };
    static final int DEFAULT_CONTAINER_MARGIN = 0;
    static final boolean DEFAULT_ORDER_PRESERVED = true;
    public static final getMin END;
    public static final getMin FILL = new getMin() {
        /* access modifiers changed from: package-private */
        public final int getMax(View view, int i) {
            return 0;
        }

        public final int setMin(int i, int i2) {
            return i2;
        }

        public final int setMin(View view, int i, int i2) {
            return Integer.MIN_VALUE;
        }

        /* access modifiers changed from: package-private */
        public final String setMin() {
            return "FILL";
        }
    };
    public static final int HORIZONTAL = 0;
    static final int INFLEXIBLE = 0;
    private static final int IsOverlapping = DrawerArrowDrawable$ArrowDirection.getMin.values;
    public static final getMin LEFT;
    static final Printer LOG_PRINTER = new LogPrinter(3, GridLayout.class.getName());
    static final int MAX_SIZE = 100000;
    static final Printer NO_PRINTER = new Printer() {
        public final void println(String str) {
        }
    };
    public static final getMin RIGHT;
    public static final getMin START;
    public static final getMin TOP;
    public static final int UNDEFINED = Integer.MIN_VALUE;
    static final getMin UNDEFINED_ALIGNMENT = new getMin() {
        /* access modifiers changed from: package-private */
        public final int getMax(View view, int i) {
            return Integer.MIN_VALUE;
        }

        public final int setMin(View view, int i, int i2) {
            return Integer.MIN_VALUE;
        }

        /* access modifiers changed from: package-private */
        public final String setMin() {
            return "UNDEFINED";
        }
    };
    static final int UNINITIALIZED_HASH = 0;
    public static final int VERTICAL = 1;
    private static final getMin equals = new getMin() {
        /* access modifiers changed from: package-private */
        public final int getMax(View view, int i) {
            return 0;
        }

        public final int setMin(View view, int i, int i2) {
            return 0;
        }

        /* access modifiers changed from: package-private */
        public final String setMin() {
            return "LEADING";
        }
    };
    private static final int getMax = DrawerArrowDrawable$ArrowDirection.getMin.IsOverlapping;
    private static final int getMin = DrawerArrowDrawable$ArrowDirection.getMin.toDoubleRange;
    private static final int isInside = DrawerArrowDrawable$ArrowDirection.getMin.FastBitmap$CoordinateSystem;
    private static final int length = DrawerArrowDrawable$ArrowDirection.getMin.toString;
    private static final int setMax = DrawerArrowDrawable$ArrowDirection.getMin.toFloatRange;
    private static final int setMin = DrawerArrowDrawable$ArrowDirection.getMin.hashCode;
    private static final getMin toFloatRange;
    int mAlignmentMode;
    int mDefaultGap;
    final setMin mHorizontalAxis;
    int mLastLayoutParamsHashCode;
    int mOrientation;
    Printer mPrinter;
    boolean mUseDefaultMargins;
    final setMin mVerticalAxis;

    static boolean canStretch(int i) {
        return (i & 2) != 0;
    }

    static {
        final AnonymousClass1 r0 = new getMin() {
            /* access modifiers changed from: package-private */
            public final int getMax(View view, int i) {
                return i;
            }

            public final int setMin(View view, int i, int i2) {
                return i;
            }

            /* access modifiers changed from: package-private */
            public final String setMin() {
                return "TRAILING";
            }
        };
        toFloatRange = r0;
        final getMin getmin = equals;
        TOP = getmin;
        BOTTOM = r0;
        START = getmin;
        END = r0;
        LEFT = new getMin() {
            /* access modifiers changed from: package-private */
            public final int getMax(View view, int i) {
                boolean z = true;
                if (ViewCompat.IsOverlapping(view) != 1) {
                    z = false;
                }
                return (!z ? r0 : r1).getMax(view, i);
            }

            public final int setMin(View view, int i, int i2) {
                boolean z = true;
                if (ViewCompat.IsOverlapping(view) != 1) {
                    z = false;
                }
                return (!z ? r0 : r1).setMin(view, i, i2);
            }

            /* access modifiers changed from: package-private */
            public final String setMin() {
                StringBuilder sb = new StringBuilder("SWITCHING[L:");
                sb.append(r0.setMin());
                sb.append(", R:");
                sb.append(r1.setMin());
                sb.append("]");
                return sb.toString();
            }
        };
        final getMin getmin2 = END;
        final getMin getmin3 = START;
        RIGHT = new getMin() {
            /* access modifiers changed from: package-private */
            public final int getMax(View view, int i) {
                boolean z = true;
                if (ViewCompat.IsOverlapping(view) != 1) {
                    z = false;
                }
                return (!z ? getmin2 : getmin3).getMax(view, i);
            }

            public final int setMin(View view, int i, int i2) {
                boolean z = true;
                if (ViewCompat.IsOverlapping(view) != 1) {
                    z = false;
                }
                return (!z ? getmin2 : getmin3).setMin(view, i, i2);
            }

            /* access modifiers changed from: package-private */
            public final String setMin() {
                StringBuilder sb = new StringBuilder("SWITCHING[L:");
                sb.append(getmin2.setMin());
                sb.append(", R:");
                sb.append(getmin3.setMin());
                sb.append("]");
                return sb.toString();
            }
        };
    }

    public GridLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mHorizontalAxis = new setMin(true);
        this.mVerticalAxis = new setMin(false);
        this.mOrientation = 0;
        this.mUseDefaultMargins = false;
        this.mAlignmentMode = 1;
        this.mLastLayoutParamsHashCode = 0;
        this.mPrinter = LOG_PRINTER;
        this.mDefaultGap = context.getResources().getDimensionPixelOffset(DrawerArrowDrawable$ArrowDirection.setMax.setMax);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, DrawerArrowDrawable$ArrowDirection.getMin.equals);
        try {
            setRowCount(obtainStyledAttributes.getInt(setMin, Integer.MIN_VALUE));
            setColumnCount(obtainStyledAttributes.getInt(setMax, Integer.MIN_VALUE));
            setOrientation(obtainStyledAttributes.getInt(length, 0));
            setUseDefaultMargins(obtainStyledAttributes.getBoolean(getMin, false));
            setAlignmentMode(obtainStyledAttributes.getInt(getMax, 1));
            setRowOrderPreserved(obtainStyledAttributes.getBoolean(IsOverlapping, true));
            setColumnOrderPreserved(obtainStyledAttributes.getBoolean(isInside, true));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public GridLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public GridLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    public int getOrientation() {
        return this.mOrientation;
    }

    public void setOrientation(int i) {
        if (this.mOrientation != i) {
            this.mOrientation = i;
            setMin();
            requestLayout();
        }
    }

    public int getRowCount() {
        setMin setmin = this.mVerticalAxis;
        return Math.max(setmin.setMin, setmin.setMax());
    }

    public void setRowCount(int i) {
        this.mVerticalAxis.getMax(i);
        setMin();
        requestLayout();
    }

    public int getColumnCount() {
        setMin setmin = this.mHorizontalAxis;
        return Math.max(setmin.setMin, setmin.setMax());
    }

    public void setColumnCount(int i) {
        this.mHorizontalAxis.getMax(i);
        setMin();
        requestLayout();
    }

    public boolean getUseDefaultMargins() {
        return this.mUseDefaultMargins;
    }

    public void setUseDefaultMargins(boolean z) {
        this.mUseDefaultMargins = z;
        requestLayout();
    }

    public int getAlignmentMode() {
        return this.mAlignmentMode;
    }

    public void setAlignmentMode(int i) {
        this.mAlignmentMode = i;
        requestLayout();
    }

    public boolean isRowOrderPreserved() {
        return this.mVerticalAxis.getMax();
    }

    public void setRowOrderPreserved(boolean z) {
        setMin setmin = this.mVerticalAxis;
        setmin.valueOf = z;
        setmin.toIntRange();
        setMin();
        requestLayout();
    }

    public boolean isColumnOrderPreserved() {
        return this.mHorizontalAxis.getMax();
    }

    public void setColumnOrderPreserved(boolean z) {
        setMin setmin = this.mHorizontalAxis;
        setmin.valueOf = z;
        setmin.toIntRange();
        setMin();
        requestLayout();
    }

    public Printer getPrinter() {
        return this.mPrinter;
    }

    public void setPrinter(Printer printer) {
        if (printer == null) {
            printer = NO_PRINTER;
        }
        this.mPrinter = printer;
    }

    static int max2(int[] iArr, int i) {
        for (int max : iArr) {
            i = Math.max(i, max);
        }
        return i;
    }

    static <T> T[] append(T[] tArr, T[] tArr2) {
        T[] tArr3 = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), tArr.length + tArr2.length);
        System.arraycopy(tArr, 0, tArr3, 0, tArr.length);
        System.arraycopy(tArr2, 0, tArr3, tArr.length, tArr2.length);
        return tArr3;
    }

    static getMin getAlignment(int i, boolean z) {
        int i2 = (i & (z ? 7 : 112)) >> (z ? 0 : 4);
        if (i2 == 1) {
            return CENTER;
        }
        if (i2 == 3) {
            return z ? LEFT : TOP;
        }
        if (i2 == 5) {
            return z ? RIGHT : BOTTOM;
        }
        if (i2 == 7) {
            return FILL;
        }
        if (i2 == 8388611) {
            return START;
        }
        if (i2 != 8388613) {
            return UNDEFINED_ALIGNMENT;
        }
        return END;
    }

    /* access modifiers changed from: package-private */
    public int getMargin1(View view, boolean z, boolean z2) {
        int i;
        LayoutParams layoutParams = getLayoutParams(view);
        if (z) {
            i = z2 ? layoutParams.leftMargin : layoutParams.rightMargin;
        } else {
            i = z2 ? layoutParams.topMargin : layoutParams.bottomMargin;
        }
        if (i != Integer.MIN_VALUE) {
            return i;
        }
        if (!this.mUseDefaultMargins) {
            return 0;
        }
        toIntRange tointrange = z ? layoutParams.length : layoutParams.getMin;
        setMin setmin = z ? this.mHorizontalAxis : this.mVerticalAxis;
        equals equals2 = tointrange.getMin;
        if (z && setMax()) {
            z2 = !z2;
        }
        if (z2) {
            int i2 = equals2.length;
        } else {
            setmin.setMax();
        }
        if (view.getClass() == Space.class || view.getClass() == android.widget.Space.class) {
            return 0;
        }
        return this.mDefaultGap / 2;
    }

    private boolean setMax() {
        return ViewCompat.IsOverlapping(this) == 1;
    }

    private int getMax(View view, boolean z, boolean z2) {
        setMin setmin;
        int[] iArr;
        if (this.mAlignmentMode == 1) {
            return getMargin1(view, z, z2);
        }
        if (z) {
            setmin = this.mHorizontalAxis;
        } else {
            setmin = this.mVerticalAxis;
        }
        if (z2) {
            if (setmin.toIntRange == null) {
                setmin.toIntRange = new int[(Math.max(setmin.setMin, setmin.setMax()) + 1)];
            }
            if (!setmin.equals) {
                setmin.getMax(true);
                setmin.equals = true;
            }
            iArr = setmin.toIntRange;
        } else {
            if (setmin.toString == null) {
                setmin.toString = new int[(Math.max(setmin.setMin, setmin.setMax()) + 1)];
            }
            if (!setmin.hashCode) {
                setmin.getMax(false);
                setmin.hashCode = true;
            }
            iArr = setmin.toString;
        }
        LayoutParams layoutParams = getLayoutParams(view);
        equals equals2 = (z ? layoutParams.length : layoutParams.getMin).getMin;
        return iArr[z2 ? equals2.length : equals2.setMax];
    }

    private static boolean getMin(int[] iArr, int i, int i2, int i3) {
        if (i3 > iArr.length) {
            return false;
        }
        while (i2 < i3) {
            if (iArr[i2] > i) {
                return false;
            }
            i2++;
        }
        return true;
    }

    private static void getMin(LayoutParams layoutParams, int i, int i2, int i3, int i4) {
        equals equals2 = new equals(i, i2 + i);
        toIntRange tointrange = layoutParams.getMin;
        layoutParams.getMin = new toIntRange(tointrange.length, equals2, tointrange.setMax, tointrange.setMin);
        equals equals3 = new equals(i3, i4 + i3);
        toIntRange tointrange2 = layoutParams.length;
        layoutParams.length = new toIntRange(tointrange2.length, equals3, tointrange2.setMax, tointrange2.setMin);
    }

    private void setMin() {
        this.mLastLayoutParamsHashCode = 0;
        setMin setmin = this.mHorizontalAxis;
        if (setmin != null) {
            setmin.toIntRange();
        }
        setMin setmin2 = this.mVerticalAxis;
        if (setmin2 != null) {
            setmin2.toIntRange();
        }
        setMin setmin3 = this.mHorizontalAxis;
        if (setmin3 != null && this.mVerticalAxis != null) {
            setmin3.toFloatRange();
            this.mVerticalAxis.toFloatRange();
        }
    }

    /* access modifiers changed from: package-private */
    public final LayoutParams getLayoutParams(View view) {
        return (LayoutParams) view.getLayoutParams();
    }

    static void handleInvalidParams(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(". ");
        throw new IllegalArgumentException(sb.toString());
    }

    private void getMin(LayoutParams layoutParams, boolean z) {
        String str = z ? "column" : "row";
        equals equals2 = (z ? layoutParams.length : layoutParams.getMin).getMin;
        if (equals2.length != Integer.MIN_VALUE && equals2.length < 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" indices must be positive");
            handleInvalidParams(sb.toString());
        }
        int i = (z ? this.mHorizontalAxis : this.mVerticalAxis).setMin;
        if (i != Integer.MIN_VALUE) {
            if (equals2.setMax > i) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" indices (start + span) mustn't exceed the ");
                sb2.append(str);
                sb2.append(" count");
                handleInvalidParams(sb2.toString());
            }
            if (equals2.setMax - equals2.length > i) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" span mustn't exceed the ");
                sb3.append(str);
                sb3.append(" count");
                handleInvalidParams(sb3.toString());
            }
        }
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (!(layoutParams instanceof LayoutParams)) {
            return false;
        }
        LayoutParams layoutParams2 = (LayoutParams) layoutParams;
        getMin(layoutParams2, true);
        getMin(layoutParams2, false);
        return true;
    }

    /* access modifiers changed from: protected */
    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams();
    }

    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    public LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LayoutParams) {
            return new LayoutParams((LayoutParams) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new LayoutParams(layoutParams);
    }

    private int getMin() {
        int childCount = getChildCount();
        int i = 1;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                i = (i * 31) + ((LayoutParams) childAt.getLayoutParams()).hashCode();
            }
        }
        return i;
    }

    private void getMax() {
        while (true) {
            int i = this.mLastLayoutParamsHashCode;
            if (i == 0) {
                boolean z = this.mOrientation == 0;
                setMin setmin = z ? this.mHorizontalAxis : this.mVerticalAxis;
                int i2 = setmin.setMin != Integer.MIN_VALUE ? setmin.setMin : 0;
                int[] iArr = new int[i2];
                int childCount = getChildCount();
                int i3 = 0;
                int i4 = 0;
                for (int i5 = 0; i5 < childCount; i5++) {
                    LayoutParams layoutParams = (LayoutParams) getChildAt(i5).getLayoutParams();
                    toIntRange tointrange = z ? layoutParams.getMin : layoutParams.length;
                    equals equals2 = tointrange.getMin;
                    boolean z2 = tointrange.length;
                    int i6 = equals2.setMax - equals2.length;
                    if (z2) {
                        i3 = equals2.length;
                    }
                    toIntRange tointrange2 = z ? layoutParams.length : layoutParams.getMin;
                    equals equals3 = tointrange2.getMin;
                    boolean z3 = tointrange2.length;
                    int i7 = equals3.setMax - equals3.length;
                    if (i2 != 0) {
                        i7 = Math.min(i7, i2 - (z3 ? Math.min(equals3.length, i2) : 0));
                    }
                    if (z3) {
                        i4 = equals3.length;
                    }
                    if (i2 != 0) {
                        if (!z2 || !z3) {
                            while (true) {
                                int i8 = i4 + i7;
                                if (getMin(iArr, i3, i4, i8)) {
                                    break;
                                } else if (z3) {
                                    i3++;
                                } else if (i8 <= i2) {
                                    i4++;
                                } else {
                                    i3++;
                                    i4 = 0;
                                }
                            }
                        }
                        Arrays.fill(iArr, Math.min(i4, i2), Math.min(i4 + i7, i2), i3 + i6);
                    }
                    if (z) {
                        getMin(layoutParams, i3, i6, i4, i7);
                    } else {
                        getMin(layoutParams, i4, i7, i3, i6);
                    }
                    i4 += i7;
                }
                this.mLastLayoutParamsHashCode = getMin();
                return;
            } else if (i != getMin()) {
                this.mPrinter.println("The fields of some layout parameters were modified in between layout operations. Check the javadoc for GridLayout.LayoutParams#rowSpec.");
                setMin();
            } else {
                return;
            }
        }
    }

    private void length(int i, int i2, boolean z) {
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = getLayoutParams(childAt);
                if (z) {
                    getMin(childAt, i, i2, layoutParams.width, layoutParams.height);
                } else {
                    boolean z2 = this.mOrientation == 0;
                    toIntRange tointrange = z2 ? layoutParams.length : layoutParams.getMin;
                    if (tointrange.length(z2) == FILL) {
                        equals equals2 = tointrange.getMin;
                        int[] length2 = (z2 ? this.mHorizontalAxis : this.mVerticalAxis).length();
                        int max = (length2[equals2.setMax] - length2[equals2.length]) - (getMax(childAt, z2, true) + getMax(childAt, z2, false));
                        if (z2) {
                            getMin(childAt, i, i2, max, layoutParams.height);
                        } else {
                            getMin(childAt, i, i2, layoutParams.width, max);
                        }
                    }
                }
            }
        }
    }

    static int adjust(int i, int i2) {
        return View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2 + i), View.MeasureSpec.getMode(i));
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        getMax();
        setMin setmin = this.mHorizontalAxis;
        if (!(setmin == null || this.mVerticalAxis == null)) {
            setmin.toFloatRange();
            this.mVerticalAxis.toFloatRange();
        }
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int adjust = adjust(i, -paddingLeft);
        int adjust2 = adjust(i2, -paddingTop);
        length(adjust, adjust2, true);
        if (this.mOrientation == 0) {
            i3 = this.mHorizontalAxis.length(adjust);
            length(adjust, adjust2, false);
            i4 = this.mVerticalAxis.length(adjust2);
        } else {
            int length2 = this.mVerticalAxis.length(adjust2);
            length(adjust, adjust2, false);
            int i5 = length2;
            i3 = this.mHorizontalAxis.length(adjust);
            i4 = i5;
        }
        setMeasuredDimension(View.resolveSizeAndState(Math.max(i3 + paddingLeft, getSuggestedMinimumWidth()), i, 0), View.resolveSizeAndState(Math.max(i4 + paddingTop, getSuggestedMinimumHeight()), i2, 0));
    }

    /* access modifiers changed from: package-private */
    public final int getMeasurementIncludingMargin(View view, boolean z) {
        int i;
        if (view.getVisibility() == 8) {
            return 0;
        }
        if (z) {
            i = view.getMeasuredWidth();
        } else {
            i = view.getMeasuredHeight();
        }
        return i + getMax(view, z, true) + getMax(view, z, false);
    }

    public void requestLayout() {
        super.requestLayout();
        setMin();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int[] iArr;
        View view;
        GridLayout gridLayout = this;
        getMax();
        int i5 = i3 - i;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        setMin setmin = gridLayout.mHorizontalAxis;
        int i6 = (i5 - paddingLeft) - paddingRight;
        setmin.create.setMin = i6;
        setmin.onNavigationEvent.setMin = -i6;
        boolean z2 = false;
        setmin.invoke = false;
        setmin.length();
        setMin setmin2 = gridLayout.mVerticalAxis;
        int i7 = ((i4 - i2) - paddingTop) - paddingBottom;
        setmin2.create.setMin = i7;
        setmin2.onNavigationEvent.setMin = -i7;
        setmin2.invoke = false;
        setmin2.length();
        int[] length2 = gridLayout.mHorizontalAxis.length();
        int[] length3 = gridLayout.mVerticalAxis.length();
        int childCount = getChildCount();
        int i8 = 0;
        while (i8 < childCount) {
            View childAt = gridLayout.getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = gridLayout.getLayoutParams(childAt);
                toIntRange tointrange = layoutParams.length;
                toIntRange tointrange2 = layoutParams.getMin;
                equals equals2 = tointrange.getMin;
                equals equals3 = tointrange2.getMin;
                int i9 = length2[equals2.length];
                int i10 = length3[equals3.length];
                int i11 = length2[equals2.setMax] - i9;
                int i12 = length3[equals3.setMax] - i10;
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                getMin length4 = tointrange.length(true);
                getMin length5 = tointrange2.length(z2);
                IsOverlapping<toIntRange, setMax> min = gridLayout.mHorizontalAxis.setMin();
                setMax setmax = (setMax) min.length[min.setMin[i8]];
                IsOverlapping<toIntRange, setMax> min2 = gridLayout.mVerticalAxis.setMin();
                int i13 = measuredHeight;
                setMax setmax2 = (setMax) min2.length[min2.setMin[i8]];
                iArr = length2;
                int max = length4.getMax(childAt, i11 - setmax.getMax(true));
                getMin getmin = length4;
                int max2 = length5.getMax(childAt, i12 - setmax2.getMax(true));
                int max3 = gridLayout.getMax(childAt, true, true);
                int max4 = gridLayout.getMax(childAt, false, true);
                int max5 = gridLayout.getMax(childAt, true, false);
                int i14 = max3 + max5;
                int max6 = max4 + gridLayout.getMax(childAt, false, false);
                getMin getmin2 = length5;
                setMax setmax3 = setmax;
                getMin getmin3 = getmin;
                int i15 = i13;
                View view2 = childAt;
                int min3 = setmax3.getMin(this, childAt, getmin, measuredWidth + i14, true);
                int i16 = i15;
                getMin getmin4 = getmin2;
                int min4 = setmax2.getMin(this, view2, getmin4, i16 + max6, false);
                int min5 = getmin.setMin(measuredWidth, i11 - i14);
                int min6 = getmin4.setMin(i16, i12 - max6);
                int i17 = i9 + max + min3;
                int i18 = !setMax() ? paddingLeft + max3 + i17 : (((i5 - min5) - paddingRight) - max5) - i17;
                int i19 = paddingTop + i10 + max2 + min4 + max4;
                if (min5 == view2.getMeasuredWidth() && min6 == view2.getMeasuredHeight()) {
                    view = view2;
                } else {
                    view = view2;
                    view.measure(View.MeasureSpec.makeMeasureSpec(min5, 1073741824), View.MeasureSpec.makeMeasureSpec(min6, 1073741824));
                }
                view.layout(i18, i19, min5 + i18, min6 + i19);
            } else {
                iArr = length2;
            }
            i8++;
            z2 = false;
            gridLayout = this;
            length2 = iArr;
        }
    }

    final class setMin {
        static final /* synthetic */ boolean getCause = (!GridLayout.class.desiredAssertionStatus());
        public boolean FastBitmap$CoordinateSystem = false;
        public int[] Grayscale$Algorithm;
        public boolean IsOverlapping = false;
        public boolean Mean$Arithmetic;
        private int b = Integer.MIN_VALUE;
        toFloatRange create = new toFloatRange(0);
        public boolean equals = false;
        IsOverlapping<toIntRange, setMax> getMax;
        public boolean getMin = false;
        public boolean hashCode = false;
        public boolean invoke = false;
        public boolean invokeSuspend = false;
        IsOverlapping<equals, toFloatRange> isInside;
        public final boolean length;
        toFloatRange onNavigationEvent = new toFloatRange(-100000);
        IsOverlapping<equals, toFloatRange> setMax;
        public int setMin = Integer.MIN_VALUE;
        public length[] toDoubleRange;
        public boolean toFloatRange = false;
        public int[] toIntRange;
        public int[] toString;
        boolean valueOf = true;
        public int[] values;

        setMin(boolean z) {
            this.length = z;
        }

        /* access modifiers changed from: package-private */
        public final int setMax() {
            int i = Integer.MIN_VALUE;
            if (this.b == Integer.MIN_VALUE) {
                int childCount = GridLayout.this.getChildCount();
                int i2 = -1;
                for (int i3 = 0; i3 < childCount; i3++) {
                    LayoutParams layoutParams = GridLayout.this.getLayoutParams(GridLayout.this.getChildAt(i3));
                    equals equals2 = (this.length ? layoutParams.length : layoutParams.getMin).getMin;
                    i2 = Math.max(Math.max(Math.max(i2, equals2.length), equals2.setMax), equals2.setMax - equals2.length);
                }
                if (i2 != -1) {
                    i = i2;
                }
                this.b = Math.max(0, i);
            }
            return this.b;
        }

        public final int getMin() {
            return Math.max(this.setMin, setMax());
        }

        public final void getMax(int i) {
            if (i != Integer.MIN_VALUE && i < setMax()) {
                StringBuilder sb = new StringBuilder();
                sb.append(this.length ? "column" : "row");
                sb.append("Count must be greater than or equal to the maximum of all grid indices (and spans) defined in the LayoutParams of each child");
                GridLayout.handleInvalidParams(sb.toString());
            }
            this.setMin = i;
        }

        public final boolean getMax() {
            return this.valueOf;
        }

        private IsOverlapping<toIntRange, setMax> isInside() {
            getMax<K, V> of = getMax.of(toIntRange.class, setMax.class);
            int childCount = GridLayout.this.getChildCount();
            for (int i = 0; i < childCount; i++) {
                LayoutParams layoutParams = GridLayout.this.getLayoutParams(GridLayout.this.getChildAt(i));
                toIntRange tointrange = this.length ? layoutParams.length : layoutParams.getMin;
                of.put(tointrange, tointrange.length(this.length).length());
            }
            return of.pack();
        }

        private void equals() {
            int i;
            setMax[] setmaxArr = (setMax[]) this.getMax.length;
            for (setMax min : setmaxArr) {
                min.getMin();
            }
            int childCount = GridLayout.this.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = GridLayout.this.getChildAt(i2);
                LayoutParams layoutParams = GridLayout.this.getLayoutParams(childAt);
                toIntRange tointrange = this.length ? layoutParams.length : layoutParams.getMin;
                int measurementIncludingMargin = GridLayout.this.getMeasurementIncludingMargin(childAt, this.length);
                if (tointrange.setMin == 0.0f) {
                    i = 0;
                } else {
                    if (this.Grayscale$Algorithm == null) {
                        this.Grayscale$Algorithm = new int[GridLayout.this.getChildCount()];
                    }
                    i = this.Grayscale$Algorithm[i2];
                }
                int i3 = measurementIncludingMargin + i;
                IsOverlapping<toIntRange, setMax> isOverlapping = this.getMax;
                ((setMax) isOverlapping.length[isOverlapping.setMin[i2]]).setMax(GridLayout.this, childAt, tointrange, this, i3);
            }
        }

        public final IsOverlapping<toIntRange, setMax> setMin() {
            if (this.getMax == null) {
                this.getMax = isInside();
            }
            if (!this.getMin) {
                equals();
                this.getMin = true;
            }
            return this.getMax;
        }

        private IsOverlapping<equals, toFloatRange> length(boolean z) {
            equals equals2;
            getMax<K, V> of = getMax.of(equals.class, toFloatRange.class);
            toIntRange[] tointrangeArr = (toIntRange[]) setMin().getMin;
            int length2 = tointrangeArr.length;
            for (int i = 0; i < length2; i++) {
                if (z) {
                    equals2 = tointrangeArr[i].getMin;
                } else {
                    equals equals3 = tointrangeArr[i].getMin;
                    equals2 = new equals(equals3.setMax, equals3.length);
                }
                of.put(equals2, new toFloatRange());
            }
            return of.pack();
        }

        private void length(IsOverlapping<equals, toFloatRange> isOverlapping, boolean z) {
            toFloatRange[] tofloatrangeArr = (toFloatRange[]) isOverlapping.length;
            for (toFloatRange tofloatrange : tofloatrangeArr) {
                tofloatrange.setMin = Integer.MIN_VALUE;
            }
            setMax[] setmaxArr = (setMax[]) setMin().length;
            for (int i = 0; i < setmaxArr.length; i++) {
                int max = setmaxArr[i].getMax(z);
                toFloatRange tofloatrange2 = (toFloatRange) isOverlapping.length[isOverlapping.setMin[i]];
                int i2 = tofloatrange2.setMin;
                if (!z) {
                    max = -max;
                }
                tofloatrange2.setMin = Math.max(i2, max);
            }
        }

        private IsOverlapping<equals, toFloatRange> IsOverlapping() {
            if (this.setMax == null) {
                this.setMax = length(true);
            }
            if (!this.IsOverlapping) {
                length(this.setMax, true);
                this.IsOverlapping = true;
            }
            return this.setMax;
        }

        private IsOverlapping<equals, toFloatRange> FastBitmap$CoordinateSystem() {
            if (this.isInside == null) {
                this.isInside = length(false);
            }
            if (!this.toFloatRange) {
                length(this.isInside, false);
                this.toFloatRange = true;
            }
            return this.isInside;
        }

        private static void length(List<length> list, equals equals2, toFloatRange tofloatrange) {
            length(list, equals2, tofloatrange, true);
        }

        private length[] length(List<length> list) {
            final length[] lengthArr = (length[]) list.toArray(new length[list.size()]);
            AnonymousClass1 r0 = new Object() {
                static final /* synthetic */ boolean setMin = (!GridLayout.class.desiredAssertionStatus());
                length[] getMax;
                int[] getMin = new int[(setMin.this.getMin() + 1)];
                length[][] length;
                int setMax;

                {
                    length[] lengthArr = lengthArr;
                    length[] lengthArr2 = new length[lengthArr.length];
                    this.getMax = lengthArr2;
                    this.setMax = lengthArr2.length - 1;
                    this.length = setMin.this.getMin(lengthArr);
                }

                /* access modifiers changed from: package-private */
                public final void getMin(int i) {
                    int[] iArr = this.getMin;
                    int i2 = iArr[i];
                    if (i2 == 0) {
                        iArr[i] = 1;
                        for (length length2 : this.length[i]) {
                            getMin(length2.setMin.setMax);
                            length[] lengthArr = this.getMax;
                            int i3 = this.setMax;
                            this.setMax = i3 - 1;
                            lengthArr[i3] = length2;
                        }
                        this.getMin[i] = 2;
                    } else if (i2 == 1 && !setMin) {
                        throw new AssertionError();
                    }
                }
            };
            int length2 = r0.length.length;
            for (int i = 0; i < length2; i++) {
                r0.getMin(i);
            }
            if (AnonymousClass1.setMin || r0.setMax == -1) {
                return r0.getMax;
            }
            throw new AssertionError();
        }

        private static void setMin(List<length> list, IsOverlapping<equals, toFloatRange> isOverlapping) {
            for (int i = 0; i < ((equals[]) isOverlapping.getMin).length; i++) {
                length(list, ((equals[]) isOverlapping.getMin)[i], ((toFloatRange[]) isOverlapping.length)[i], false);
            }
        }

        private void toDoubleRange() {
            IsOverlapping();
            FastBitmap$CoordinateSystem();
        }

        private length[] values() {
            if (this.toDoubleRange == null) {
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                setMin(arrayList, IsOverlapping());
                setMin(arrayList2, FastBitmap$CoordinateSystem());
                if (this.valueOf) {
                    int i = 0;
                    while (i < getMin()) {
                        int i2 = i + 1;
                        length((List<length>) arrayList, new equals(i, i2), new toFloatRange(0));
                        i = i2;
                    }
                }
                int min = getMin();
                length(arrayList, new equals(0, min), this.create, false);
                length(arrayList2, new equals(min, 0), this.onNavigationEvent, false);
                this.toDoubleRange = (length[]) GridLayout.append(length((List<length>) arrayList), length((List<length>) arrayList2));
            }
            if (!this.FastBitmap$CoordinateSystem) {
                toDoubleRange();
                this.FastBitmap$CoordinateSystem = true;
            }
            return this.toDoubleRange;
        }

        private static boolean getMax(int[] iArr, length length2) {
            if (!length2.setMax) {
                return false;
            }
            equals equals2 = length2.setMin;
            int i = equals2.length;
            int i2 = equals2.setMax;
            int i3 = iArr[i] + length2.getMin.setMin;
            if (i3 <= iArr[i2]) {
                return false;
            }
            iArr[i2] = i3;
            return true;
        }

        private String getMax(List<length> list) {
            StringBuilder sb;
            String str = this.length ? "x" : "y";
            StringBuilder sb2 = new StringBuilder();
            boolean z = true;
            for (length next : list) {
                if (z) {
                    z = false;
                } else {
                    sb2.append(", ");
                }
                int i = next.setMin.length;
                int i2 = next.setMin.setMax;
                int i3 = next.getMin.setMin;
                if (i < i2) {
                    sb.append(str);
                    sb.append(i2);
                    sb.append("-");
                    sb.append(str);
                    sb.append(i);
                    sb.append(SimpleComparison.GREATER_THAN_EQUAL_TO_OPERATION);
                } else {
                    sb = new StringBuilder();
                    sb.append(str);
                    sb.append(i);
                    sb.append("-");
                    sb.append(str);
                    sb.append(i2);
                    sb.append(SimpleComparison.LESS_THAN_EQUAL_TO_OPERATION);
                    i3 = -i3;
                }
                sb.append(i3);
                sb2.append(sb.toString());
            }
            return sb2.toString();
        }

        private boolean length(length[] lengthArr, int[] iArr) {
            return length(lengthArr, iArr, true);
        }

        private boolean length(length[] lengthArr, int[] iArr, boolean z) {
            String str = this.length ? "horizontal" : "vertical";
            int max = Math.max(this.setMin, setMax()) + 1;
            boolean[] zArr = null;
            for (int i = 0; i < lengthArr.length; i++) {
                Arrays.fill(iArr, 0);
                for (int i2 = 0; i2 < max; i2++) {
                    boolean z2 = false;
                    for (length max2 : lengthArr) {
                        z2 |= getMax(iArr, max2);
                    }
                    if (!z2) {
                        if (zArr != null) {
                            ArrayList arrayList = new ArrayList();
                            ArrayList arrayList2 = new ArrayList();
                            for (int i3 = 0; i3 < lengthArr.length; i3++) {
                                length length2 = lengthArr[i3];
                                if (zArr[i3]) {
                                    arrayList.add(length2);
                                }
                                if (!length2.setMax) {
                                    arrayList2.add(length2);
                                }
                            }
                            Printer printer = GridLayout.this.mPrinter;
                            StringBuilder sb = new StringBuilder();
                            sb.append(str);
                            sb.append(" constraints: ");
                            sb.append(getMax((List<length>) arrayList));
                            sb.append(" are inconsistent; permanently removing: ");
                            sb.append(getMax((List<length>) arrayList2));
                            sb.append(". ");
                            printer.println(sb.toString());
                        }
                        return true;
                    }
                }
                if (!z) {
                    return false;
                }
                boolean[] zArr2 = new boolean[lengthArr.length];
                for (int i4 = 0; i4 < max; i4++) {
                    int length3 = lengthArr.length;
                    for (int i5 = 0; i5 < length3; i5++) {
                        zArr2[i5] = zArr2[i5] | getMax(iArr, lengthArr[i5]);
                    }
                }
                if (i == 0) {
                    zArr = zArr2;
                }
                int i6 = 0;
                while (true) {
                    if (i6 >= lengthArr.length) {
                        break;
                    }
                    if (zArr2[i6]) {
                        length length4 = lengthArr[i6];
                        if (length4.setMin.length >= length4.setMin.setMax) {
                            length4.setMax = false;
                            break;
                        }
                    }
                    i6++;
                }
            }
            return true;
        }

        /* access modifiers changed from: package-private */
        public final void getMax(boolean z) {
            int[] iArr = z ? this.toIntRange : this.toString;
            int childCount = GridLayout.this.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = GridLayout.this.getChildAt(i);
                if (childAt.getVisibility() != 8) {
                    LayoutParams layoutParams = GridLayout.this.getLayoutParams(childAt);
                    equals equals2 = (this.length ? layoutParams.length : layoutParams.getMin).getMin;
                    int i2 = z ? equals2.length : equals2.setMax;
                    iArr[i2] = Math.max(iArr[i2], GridLayout.this.getMargin1(childAt, this.length, z));
                }
            }
        }

        private boolean length(int[] iArr) {
            return length(values(), iArr);
        }

        private boolean Mean$Arithmetic() {
            int childCount = GridLayout.this.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = GridLayout.this.getChildAt(i);
                if (childAt.getVisibility() != 8) {
                    LayoutParams layoutParams = GridLayout.this.getLayoutParams(childAt);
                    if ((this.length ? layoutParams.length : layoutParams.getMin).setMin != 0.0f) {
                        return true;
                    }
                }
            }
            return false;
        }

        private boolean valueOf() {
            if (!this.invokeSuspend) {
                this.Mean$Arithmetic = Mean$Arithmetic();
                this.invokeSuspend = true;
            }
            return this.Mean$Arithmetic;
        }

        private void length(int i, float f) {
            Arrays.fill(this.Grayscale$Algorithm, 0);
            int childCount = GridLayout.this.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = GridLayout.this.getChildAt(i2);
                if (childAt.getVisibility() != 8) {
                    LayoutParams layoutParams = GridLayout.this.getLayoutParams(childAt);
                    float f2 = (this.length ? layoutParams.length : layoutParams.getMin).setMin;
                    if (f2 != 0.0f) {
                        int round = Math.round((((float) i) * f2) / f);
                        this.Grayscale$Algorithm[i2] = round;
                        i -= round;
                        f -= f2;
                    }
                }
            }
        }

        private void setMin(int[] iArr) {
            if (!valueOf()) {
                length(iArr);
            } else {
                if (this.Grayscale$Algorithm == null) {
                    this.Grayscale$Algorithm = new int[GridLayout.this.getChildCount()];
                }
                Arrays.fill(this.Grayscale$Algorithm, 0);
                length(iArr);
                boolean z = true;
                int childCount = (this.create.setMin * GridLayout.this.getChildCount()) + 1;
                if (childCount >= 2) {
                    float f = 0.0f;
                    int childCount2 = GridLayout.this.getChildCount();
                    for (int i = 0; i < childCount2; i++) {
                        View childAt = GridLayout.this.getChildAt(i);
                        if (childAt.getVisibility() != 8) {
                            LayoutParams layoutParams = GridLayout.this.getLayoutParams(childAt);
                            f += (this.length ? layoutParams.length : layoutParams.getMin).setMin;
                        }
                    }
                    int i2 = -1;
                    int i3 = 0;
                    while (i3 < childCount) {
                        int i4 = (int) ((((long) i3) + ((long) childCount)) / 2);
                        toFloatRange();
                        length(i4, f);
                        boolean length2 = length(values(), iArr, false);
                        if (length2) {
                            i3 = i4 + 1;
                            i2 = i4;
                        } else {
                            childCount = i4;
                        }
                        z = length2;
                    }
                    if (i2 > 0 && !z) {
                        toFloatRange();
                        length(i2, f);
                        length(iArr);
                    }
                }
            }
            if (!this.valueOf) {
                int i5 = iArr[0];
                int length3 = iArr.length;
                for (int i6 = 0; i6 < length3; i6++) {
                    iArr[i6] = iArr[i6] - i5;
                }
            }
        }

        public final int[] length() {
            if (this.values == null) {
                this.values = new int[(Math.max(this.setMin, setMax()) + 1)];
            }
            if (!this.invoke) {
                setMin(this.values);
                this.invoke = true;
            }
            return this.values;
        }

        public final int length(int i) {
            int mode = View.MeasureSpec.getMode(i);
            int size = View.MeasureSpec.getSize(i);
            if (mode == Integer.MIN_VALUE) {
                return getMax(0, size);
            }
            if (mode == 0) {
                return getMax(0, 100000);
            }
            if (mode == 1073741824) {
                return getMax(size, size);
            }
            if (getCause) {
                return 0;
            }
            throw new AssertionError();
        }

        public final void toIntRange() {
            this.b = Integer.MIN_VALUE;
            this.getMax = null;
            this.setMax = null;
            this.isInside = null;
            this.toIntRange = null;
            this.toString = null;
            this.toDoubleRange = null;
            this.values = null;
            this.Grayscale$Algorithm = null;
            this.invokeSuspend = false;
            toFloatRange();
        }

        public final void toFloatRange() {
            this.getMin = false;
            this.IsOverlapping = false;
            this.toFloatRange = false;
            this.equals = false;
            this.hashCode = false;
            this.FastBitmap$CoordinateSystem = false;
            this.invoke = false;
        }

        private static void length(List<length> list, equals equals2, toFloatRange tofloatrange, boolean z) {
            if (equals2.setMax - equals2.length != 0) {
                if (z) {
                    for (length length2 : list) {
                        if (length2.setMin.equals(equals2)) {
                            return;
                        }
                    }
                }
                list.add(new length(equals2, tofloatrange));
            }
        }

        /* access modifiers changed from: package-private */
        public final length[][] getMin(length[] lengthArr) {
            int max = Math.max(this.setMin, setMax()) + 1;
            length[][] lengthArr2 = new length[max][];
            int[] iArr = new int[max];
            for (length length2 : lengthArr) {
                int i = length2.setMin.length;
                iArr[i] = iArr[i] + 1;
            }
            for (int i2 = 0; i2 < max; i2++) {
                lengthArr2[i2] = new length[iArr[i2]];
            }
            Arrays.fill(iArr, 0);
            for (length length3 : lengthArr) {
                int i3 = length3.setMin.length;
                length[] lengthArr3 = lengthArr2[i3];
                int i4 = iArr[i3];
                iArr[i3] = i4 + 1;
                lengthArr3[i4] = length3;
            }
            return lengthArr2;
        }

        private int getMax(int i, int i2) {
            this.create.setMin = i;
            this.onNavigationEvent.setMin = -i2;
            this.invoke = false;
            return length()[Math.max(this.setMin, setMax())];
        }
    }

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {
        private static final int FastBitmap$CoordinateSystem = DrawerArrowDrawable$ArrowDirection.getMin.create;
        private static final int IsOverlapping = DrawerArrowDrawable$ArrowDirection.getMin.invokeSuspend;
        private static final int equals = DrawerArrowDrawable$ArrowDirection.getMin.onNavigationEvent;
        private static final int getMax;
        private static final int hashCode = DrawerArrowDrawable$ArrowDirection.getMin.ICustomTabsCallback;
        private static final int invokeSuspend = DrawerArrowDrawable$ArrowDirection.getMin.getCause;
        private static final int isInside = DrawerArrowDrawable$ArrowDirection.getMin.Grayscale$Algorithm;
        private static final int setMax = DrawerArrowDrawable$ArrowDirection.getMin.valueOf;
        private static final equals setMin;
        private static final int toDoubleRange = DrawerArrowDrawable$ArrowDirection.getMin.onMessageChannelReady;
        private static final int toFloatRange = DrawerArrowDrawable$ArrowDirection.getMin.b;
        private static final int toIntRange = DrawerArrowDrawable$ArrowDirection.getMin.invoke;
        private static final int toString = DrawerArrowDrawable$ArrowDirection.getMin.onPostMessage;
        private static final int values = DrawerArrowDrawable$ArrowDirection.getMin.extraCallbackWithResult;
        public toIntRange getMin;
        public toIntRange length;

        static {
            equals equals2 = new equals(Integer.MIN_VALUE, -2147483647);
            setMin = equals2;
            getMax = equals2.setMax - equals2.length;
        }

        private LayoutParams(toIntRange tointrange, toIntRange tointrange2, byte b) {
            super(-2, -2);
            this.getMin = toIntRange.getMax;
            this.length = toIntRange.getMax;
            setMargins(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
            this.getMin = tointrange;
            this.length = tointrange2;
        }

        public LayoutParams(toIntRange tointrange, toIntRange tointrange2) {
            this(tointrange, tointrange2, (byte) 0);
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public LayoutParams() {
            /*
                r1 = this;
                androidx.gridlayout.widget.GridLayout$toIntRange r0 = androidx.gridlayout.widget.GridLayout.toIntRange.getMax
                r1.<init>((androidx.gridlayout.widget.GridLayout.toIntRange) r0, (androidx.gridlayout.widget.GridLayout.toIntRange) r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.gridlayout.widget.GridLayout.LayoutParams.<init>():void");
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.getMin = toIntRange.getMax;
            this.length = toIntRange.getMax;
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.getMin = toIntRange.getMax;
            this.length = toIntRange.getMax;
        }

        public LayoutParams(LayoutParams layoutParams) {
            super(layoutParams);
            this.getMin = toIntRange.getMax;
            this.length = toIntRange.getMax;
            this.getMin = layoutParams.getMin;
            this.length = layoutParams.length;
        }

        /* JADX INFO: finally extract failed */
        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.getMin = toIntRange.getMax;
            this.length = toIntRange.getMax;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, DrawerArrowDrawable$ArrowDirection.getMin.Mean$Arithmetic);
            try {
                int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(setMax, Integer.MIN_VALUE);
                this.leftMargin = obtainStyledAttributes.getDimensionPixelSize(IsOverlapping, dimensionPixelSize);
                this.topMargin = obtainStyledAttributes.getDimensionPixelSize(toIntRange, dimensionPixelSize);
                this.rightMargin = obtainStyledAttributes.getDimensionPixelSize(isInside, dimensionPixelSize);
                this.bottomMargin = obtainStyledAttributes.getDimensionPixelSize(toFloatRange, dimensionPixelSize);
                obtainStyledAttributes.recycle();
                TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, DrawerArrowDrawable$ArrowDirection.getMin.Mean$Arithmetic);
                try {
                    int i = obtainStyledAttributes2.getInt(invokeSuspend, 0);
                    this.length = GridLayout.spec(obtainStyledAttributes2.getInt(equals, Integer.MIN_VALUE), obtainStyledAttributes2.getInt(hashCode, getMax), GridLayout.getAlignment(i, true), obtainStyledAttributes2.getFloat(FastBitmap$CoordinateSystem, 0.0f));
                    this.getMin = GridLayout.spec(obtainStyledAttributes2.getInt(toDoubleRange, Integer.MIN_VALUE), obtainStyledAttributes2.getInt(values, getMax), GridLayout.getAlignment(i, false), obtainStyledAttributes2.getFloat(toString, 0.0f));
                } finally {
                    obtainStyledAttributes2.recycle();
                }
            } catch (Throwable th) {
                obtainStyledAttributes.recycle();
                throw th;
            }
        }

        /* access modifiers changed from: protected */
        public void setBaseAttributes(TypedArray typedArray, int i, int i2) {
            this.width = typedArray.getLayoutDimension(i, -2);
            this.height = typedArray.getLayoutDimension(i2, -2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            LayoutParams layoutParams = (LayoutParams) obj;
            return this.length.equals(layoutParams.length) && this.getMin.equals(layoutParams.getMin);
        }

        public int hashCode() {
            return (this.getMin.hashCode() * 31) + this.length.hashCode();
        }
    }

    static final class length {
        public final toFloatRange getMin;
        public boolean setMax = true;
        public final equals setMin;

        public length(equals equals, toFloatRange tofloatrange) {
            this.setMin = equals;
            this.getMin = tofloatrange;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.setMin);
            sb.append(" ");
            sb.append(!this.setMax ? "+>" : "->");
            sb.append(" ");
            sb.append(this.getMin);
            return sb.toString();
        }
    }

    static final class toFloatRange {
        public int setMin;

        public toFloatRange() {
            this.setMin = Integer.MIN_VALUE;
        }

        public toFloatRange(int i) {
            this.setMin = i;
        }

        public final String toString() {
            return Integer.toString(this.setMin);
        }
    }

    static final class getMax<K, V> extends ArrayList<Pair<K, V>> {
        private final Class<K> keyType;
        private final Class<V> valueType;

        private getMax(Class<K> cls, Class<V> cls2) {
            this.keyType = cls;
            this.valueType = cls2;
        }

        public static <K, V> getMax<K, V> of(Class<K> cls, Class<V> cls2) {
            return new getMax<>(cls, cls2);
        }

        public final void put(K k, V v) {
            add(Pair.create(k, v));
        }

        public final IsOverlapping<K, V> pack() {
            int size = size();
            Object[] objArr = (Object[]) Array.newInstance(this.keyType, size);
            Object[] objArr2 = (Object[]) Array.newInstance(this.valueType, size);
            for (int i = 0; i < size; i++) {
                objArr[i] = ((Pair) get(i)).first;
                objArr2[i] = ((Pair) get(i)).second;
            }
            return new IsOverlapping<>(objArr, objArr2);
        }
    }

    static final class IsOverlapping<K, V> {
        public final K[] getMin;
        public final V[] length;
        public final int[] setMin;

        IsOverlapping(K[] kArr, V[] vArr) {
            int[] length2 = length(kArr);
            this.setMin = length2;
            this.getMin = setMin(kArr, length2);
            this.length = setMin(vArr, this.setMin);
        }

        private static <K> int[] length(K[] kArr) {
            int length2 = kArr.length;
            int[] iArr = new int[length2];
            HashMap hashMap = new HashMap();
            for (int i = 0; i < length2; i++) {
                K k = kArr[i];
                Integer num = (Integer) hashMap.get(k);
                if (num == null) {
                    num = Integer.valueOf(hashMap.size());
                    hashMap.put(k, num);
                }
                iArr[i] = num.intValue();
            }
            return iArr;
        }

        private static <K> K[] setMin(K[] kArr, int[] iArr) {
            int length2 = kArr.length;
            K[] kArr2 = (Object[]) Array.newInstance(kArr.getClass().getComponentType(), GridLayout.max2(iArr, -1) + 1);
            for (int i = 0; i < length2; i++) {
                kArr2[iArr[i]] = kArr[i];
            }
            return kArr2;
        }
    }

    static class setMax {
        public int getMin;
        public int length;
        public int setMin;

        setMax() {
            getMin();
        }

        /* access modifiers changed from: protected */
        public void getMin() {
            this.length = Integer.MIN_VALUE;
            this.setMin = Integer.MIN_VALUE;
            this.getMin = 2;
        }

        /* access modifiers changed from: protected */
        public void getMin(int i, int i2) {
            this.length = Math.max(this.length, i);
            this.setMin = Math.max(this.setMin, i2);
        }

        /* access modifiers changed from: protected */
        public int getMax(boolean z) {
            if (z || !GridLayout.canStretch(this.getMin)) {
                return this.length + this.setMin;
            }
            return 100000;
        }

        /* access modifiers changed from: protected */
        public int getMin(GridLayout gridLayout, View view, getMin getmin, int i, boolean z) {
            return this.length - getmin.setMin(view, i, onPostResume.getMin(gridLayout));
        }

        /* access modifiers changed from: protected */
        public final void setMax(GridLayout gridLayout, View view, toIntRange tointrange, setMin setmin, int i) {
            this.getMin &= (tointrange.setMax == GridLayout.UNDEFINED_ALIGNMENT && tointrange.setMin == 0.0f) ? 0 : 2;
            int min = tointrange.length(setmin.length).setMin(view, i, onPostResume.getMin(gridLayout));
            getMin(min, i - min);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("Bounds{before=");
            sb.append(this.length);
            sb.append(", after=");
            sb.append(this.setMin);
            sb.append('}');
            return sb.toString();
        }
    }

    static final class equals {
        public final int length;
        public final int setMax;

        public equals(int i, int i2) {
            this.length = i;
            this.setMax = i2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            equals equals = (equals) obj;
            return this.setMax == equals.setMax && this.length == equals.length;
        }

        public final int hashCode() {
            return (this.length * 31) + this.setMax;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("[");
            sb.append(this.length);
            sb.append(", ");
            sb.append(this.setMax);
            sb.append("]");
            return sb.toString();
        }
    }

    public static class toIntRange {
        static final toIntRange getMax = GridLayout.spec(Integer.MIN_VALUE);
        final equals getMin;
        final boolean length;
        final getMin setMax;
        final float setMin;

        toIntRange(boolean z, equals equals, getMin getmin, float f) {
            this.length = z;
            this.getMin = equals;
            this.setMax = getmin;
            this.setMin = f;
        }

        toIntRange(boolean z, int i, int i2, getMin getmin, float f) {
            this(z, new equals(i, i2 + i), getmin, f);
        }

        public final getMin length(boolean z) {
            if (this.setMax != GridLayout.UNDEFINED_ALIGNMENT) {
                return this.setMax;
            }
            if (this.setMin == 0.0f) {
                return z ? GridLayout.START : GridLayout.BASELINE;
            }
            return GridLayout.FILL;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            toIntRange tointrange = (toIntRange) obj;
            return this.setMax.equals(tointrange.setMax) && this.getMin.equals(tointrange.getMin);
        }

        public int hashCode() {
            return (this.getMin.hashCode() * 31) + this.setMax.hashCode();
        }
    }

    public static toIntRange spec(int i, int i2, getMin getmin, float f) {
        return new toIntRange(i != Integer.MIN_VALUE, i, i2, getmin, f);
    }

    public static toIntRange spec(int i, getMin getmin, float f) {
        return spec(i, 1, getmin, f);
    }

    public static toIntRange spec(int i, int i2, float f) {
        return spec(i, i2, UNDEFINED_ALIGNMENT, f);
    }

    public static toIntRange spec(int i, float f) {
        return spec(i, 1, f);
    }

    public static toIntRange spec(int i, int i2, getMin getmin) {
        return spec(i, i2, getmin, 0.0f);
    }

    public static toIntRange spec(int i, getMin getmin) {
        return spec(i, 1, getmin);
    }

    public static toIntRange spec(int i, int i2) {
        return spec(i, i2, UNDEFINED_ALIGNMENT);
    }

    public static toIntRange spec(int i) {
        return spec(i, 1);
    }

    public static abstract class getMin {
        /* access modifiers changed from: package-private */
        public abstract int getMax(View view, int i);

        /* access modifiers changed from: package-private */
        public int setMin(int i, int i2) {
            return i;
        }

        /* access modifiers changed from: package-private */
        public abstract int setMin(View view, int i, int i2);

        /* access modifiers changed from: package-private */
        public abstract String setMin();

        getMin() {
        }

        /* access modifiers changed from: package-private */
        public setMax length() {
            return new setMax();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("Alignment:");
            sb.append(setMin());
            return sb.toString();
        }
    }

    private void getMin(View view, int i, int i2, int i3, int i4) {
        view.measure(getChildMeasureSpec(i, getMax(view, true, true) + getMax(view, true, false), i3), getChildMeasureSpec(i2, getMax(view, false, true) + getMax(view, false, false), i4));
    }
}
