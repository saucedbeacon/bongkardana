package com.google.android.flexbox;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import com.google.android.exoplayer2.C;
import com.google.android.flexbox.FlexboxHelper;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

public class FlexboxLayout extends ViewGroup implements FlexContainer {
    public static final int SHOW_DIVIDER_BEGINNING = 1;
    public static final int SHOW_DIVIDER_END = 4;
    public static final int SHOW_DIVIDER_MIDDLE = 2;
    public static final int SHOW_DIVIDER_NONE = 0;
    private int mAlignContent;
    private int mAlignItems;
    @Nullable
    private Drawable mDividerDrawableHorizontal;
    @Nullable
    private Drawable mDividerDrawableVertical;
    private int mDividerHorizontalHeight;
    private int mDividerVerticalWidth;
    private int mFlexDirection;
    private List<FlexLine> mFlexLines;
    private FlexboxHelper.FlexLinesResult mFlexLinesResult;
    private int mFlexWrap;
    private FlexboxHelper mFlexboxHelper;
    private int mJustifyContent;
    private int mMaxLine;
    private SparseIntArray mOrderCache;
    private int[] mReorderedIndices;
    private int mShowDividerHorizontal;
    private int mShowDividerVertical;

    @Retention(RetentionPolicy.SOURCE)
    public @interface DividerMode {
    }

    public int getDecorationLengthCrossAxis(View view) {
        return 0;
    }

    public void updateViewCache(int i, View view) {
    }

    public FlexboxLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    public FlexboxLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FlexboxLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mMaxLine = -1;
        this.mFlexboxHelper = new FlexboxHelper(this);
        this.mFlexLines = new ArrayList();
        this.mFlexLinesResult = new FlexboxHelper.FlexLinesResult();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.FlexboxLayout, i, 0);
        this.mFlexDirection = obtainStyledAttributes.getInt(R.styleable.FlexboxLayout_flexDirection, 0);
        this.mFlexWrap = obtainStyledAttributes.getInt(R.styleable.FlexboxLayout_flexWrap, 0);
        this.mJustifyContent = obtainStyledAttributes.getInt(R.styleable.FlexboxLayout_justifyContent, 0);
        this.mAlignItems = obtainStyledAttributes.getInt(R.styleable.FlexboxLayout_alignItems, 0);
        this.mAlignContent = obtainStyledAttributes.getInt(R.styleable.FlexboxLayout_alignContent, 0);
        this.mMaxLine = obtainStyledAttributes.getInt(R.styleable.FlexboxLayout_maxLine, -1);
        Drawable drawable = obtainStyledAttributes.getDrawable(R.styleable.FlexboxLayout_dividerDrawable);
        if (drawable != null) {
            setDividerDrawableHorizontal(drawable);
            setDividerDrawableVertical(drawable);
        }
        Drawable drawable2 = obtainStyledAttributes.getDrawable(R.styleable.FlexboxLayout_dividerDrawableHorizontal);
        if (drawable2 != null) {
            setDividerDrawableHorizontal(drawable2);
        }
        Drawable drawable3 = obtainStyledAttributes.getDrawable(R.styleable.FlexboxLayout_dividerDrawableVertical);
        if (drawable3 != null) {
            setDividerDrawableVertical(drawable3);
        }
        int i2 = obtainStyledAttributes.getInt(R.styleable.FlexboxLayout_showDivider, 0);
        if (i2 != 0) {
            this.mShowDividerVertical = i2;
            this.mShowDividerHorizontal = i2;
        }
        int i3 = obtainStyledAttributes.getInt(R.styleable.FlexboxLayout_showDividerVertical, 0);
        if (i3 != 0) {
            this.mShowDividerVertical = i3;
        }
        int i4 = obtainStyledAttributes.getInt(R.styleable.FlexboxLayout_showDividerHorizontal, 0);
        if (i4 != 0) {
            this.mShowDividerHorizontal = i4;
        }
        obtainStyledAttributes.recycle();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        if (this.mOrderCache == null) {
            this.mOrderCache = new SparseIntArray(getChildCount());
        }
        if (this.mFlexboxHelper.isOrderChangedFromLastMeasurement(this.mOrderCache)) {
            this.mReorderedIndices = this.mFlexboxHelper.createReorderedIndices(this.mOrderCache);
        }
        int i3 = this.mFlexDirection;
        if (i3 == 0 || i3 == 1) {
            measureHorizontal(i, i2);
        } else if (i3 == 2 || i3 == 3) {
            measureVertical(i, i2);
        } else {
            StringBuilder sb = new StringBuilder("Invalid value for the flex direction is set: ");
            sb.append(this.mFlexDirection);
            throw new IllegalStateException(sb.toString());
        }
    }

    public int getFlexItemCount() {
        return getChildCount();
    }

    public View getFlexItemAt(int i) {
        return getChildAt(i);
    }

    public View getReorderedChildAt(int i) {
        if (i < 0) {
            return null;
        }
        int[] iArr = this.mReorderedIndices;
        if (i >= iArr.length) {
            return null;
        }
        return getChildAt(iArr[i]);
    }

    public View getReorderedFlexItemAt(int i) {
        return getReorderedChildAt(i);
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (this.mOrderCache == null) {
            this.mOrderCache = new SparseIntArray(getChildCount());
        }
        this.mReorderedIndices = this.mFlexboxHelper.createReorderedIndices(view, i, layoutParams, this.mOrderCache);
        super.addView(view, i, layoutParams);
    }

    private void measureHorizontal(int i, int i2) {
        this.mFlexLines.clear();
        this.mFlexLinesResult.reset();
        this.mFlexboxHelper.calculateHorizontalFlexLines(this.mFlexLinesResult, i, i2);
        this.mFlexLines = this.mFlexLinesResult.mFlexLines;
        this.mFlexboxHelper.determineMainSize(i, i2);
        if (this.mAlignItems == 3) {
            for (FlexLine next : this.mFlexLines) {
                int i3 = Integer.MIN_VALUE;
                for (int i4 = 0; i4 < next.mItemCount; i4++) {
                    View reorderedChildAt = getReorderedChildAt(next.mFirstIndex + i4);
                    if (!(reorderedChildAt == null || reorderedChildAt.getVisibility() == 8)) {
                        LayoutParams layoutParams = (LayoutParams) reorderedChildAt.getLayoutParams();
                        if (this.mFlexWrap != 2) {
                            i3 = Math.max(i3, reorderedChildAt.getMeasuredHeight() + Math.max(next.mMaxBaseline - reorderedChildAt.getBaseline(), layoutParams.topMargin) + layoutParams.bottomMargin);
                        } else {
                            i3 = Math.max(i3, reorderedChildAt.getMeasuredHeight() + layoutParams.topMargin + Math.max((next.mMaxBaseline - reorderedChildAt.getMeasuredHeight()) + reorderedChildAt.getBaseline(), layoutParams.bottomMargin));
                        }
                    }
                }
                next.mCrossSize = i3;
            }
        }
        this.mFlexboxHelper.determineCrossSize(i, i2, getPaddingTop() + getPaddingBottom());
        this.mFlexboxHelper.stretchViews();
        setMeasuredDimensionForFlex(this.mFlexDirection, i, i2, this.mFlexLinesResult.mChildState);
    }

    private void measureVertical(int i, int i2) {
        this.mFlexLines.clear();
        this.mFlexLinesResult.reset();
        this.mFlexboxHelper.calculateVerticalFlexLines(this.mFlexLinesResult, i, i2);
        this.mFlexLines = this.mFlexLinesResult.mFlexLines;
        this.mFlexboxHelper.determineMainSize(i, i2);
        this.mFlexboxHelper.determineCrossSize(i, i2, getPaddingLeft() + getPaddingRight());
        this.mFlexboxHelper.stretchViews();
        setMeasuredDimensionForFlex(this.mFlexDirection, i, i2, this.mFlexLinesResult.mChildState);
    }

    private void setMeasuredDimensionForFlex(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        if (i == 0 || i == 1) {
            i5 = getSumOfCrossSize() + getPaddingTop() + getPaddingBottom();
            i6 = getLargestMainSize();
        } else if (i == 2 || i == 3) {
            i5 = getLargestMainSize();
            i6 = getSumOfCrossSize() + getPaddingLeft() + getPaddingRight();
        } else {
            throw new IllegalArgumentException("Invalid flex direction: ".concat(String.valueOf(i)));
        }
        if (mode == Integer.MIN_VALUE) {
            if (size < i6) {
                i4 = View.combineMeasuredStates(i4, C.DEFAULT_MUXED_BUFFER_SIZE);
            } else {
                size = i6;
            }
            i7 = View.resolveSizeAndState(size, i2, i4);
        } else if (mode == 0) {
            i7 = View.resolveSizeAndState(i6, i2, i4);
        } else if (mode == 1073741824) {
            if (size < i6) {
                i4 = View.combineMeasuredStates(i4, C.DEFAULT_MUXED_BUFFER_SIZE);
            }
            i7 = View.resolveSizeAndState(size, i2, i4);
        } else {
            throw new IllegalStateException("Unknown width mode is set: ".concat(String.valueOf(mode)));
        }
        if (mode2 == Integer.MIN_VALUE) {
            if (size2 < i5) {
                i4 = View.combineMeasuredStates(i4, 256);
            } else {
                size2 = i5;
            }
            i8 = View.resolveSizeAndState(size2, i3, i4);
        } else if (mode2 == 0) {
            i8 = View.resolveSizeAndState(i5, i3, i4);
        } else if (mode2 == 1073741824) {
            if (size2 < i5) {
                i4 = View.combineMeasuredStates(i4, 256);
            }
            i8 = View.resolveSizeAndState(size2, i3, i4);
        } else {
            throw new IllegalStateException("Unknown height mode is set: ".concat(String.valueOf(mode2)));
        }
        setMeasuredDimension(i7, i8);
    }

    public int getLargestMainSize() {
        int i = Integer.MIN_VALUE;
        for (FlexLine flexLine : this.mFlexLines) {
            i = Math.max(i, flexLine.mMainSize);
        }
        return i;
    }

    public int getSumOfCrossSize() {
        int i;
        int i2;
        int size = this.mFlexLines.size();
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            FlexLine flexLine = this.mFlexLines.get(i4);
            if (hasDividerBeforeFlexLine(i4)) {
                if (isMainAxisDirectionHorizontal()) {
                    i2 = this.mDividerHorizontalHeight;
                } else {
                    i2 = this.mDividerVerticalWidth;
                }
                i3 += i2;
            }
            if (hasEndDividerAfterFlexLine(i4)) {
                if (isMainAxisDirectionHorizontal()) {
                    i = this.mDividerHorizontalHeight;
                } else {
                    i = this.mDividerVerticalWidth;
                }
                i3 += i;
            }
            i3 += flexLine.mCrossSize;
        }
        return i3;
    }

    public boolean isMainAxisDirectionHorizontal() {
        int i = this.mFlexDirection;
        return i == 0 || i == 1;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int IsOverlapping = ViewCompat.IsOverlapping(this);
        int i5 = this.mFlexDirection;
        boolean z2 = false;
        if (i5 == 0) {
            layoutHorizontal(IsOverlapping == 1, i, i2, i3, i4);
        } else if (i5 == 1) {
            layoutHorizontal(IsOverlapping != 1, i, i2, i3, i4);
        } else if (i5 == 2) {
            if (IsOverlapping == 1) {
                z2 = true;
            }
            layoutVertical(this.mFlexWrap == 2 ? !z2 : z2, false, i, i2, i3, i4);
        } else if (i5 == 3) {
            if (IsOverlapping == 1) {
                z2 = true;
            }
            layoutVertical(this.mFlexWrap == 2 ? !z2 : z2, true, i, i2, i3, i4);
        } else {
            StringBuilder sb = new StringBuilder("Invalid flex direction is set: ");
            sb.append(this.mFlexDirection);
            throw new IllegalStateException(sb.toString());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0122  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x017f  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x01e2  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x01ef  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void layoutHorizontal(boolean r29, int r30, int r31, int r32, int r33) {
        /*
            r28 = this;
            r0 = r28
            int r1 = r28.getPaddingLeft()
            int r2 = r28.getPaddingRight()
            int r3 = r33 - r31
            int r4 = r32 - r30
            int r5 = r28.getPaddingBottom()
            int r3 = r3 - r5
            int r5 = r28.getPaddingTop()
            java.util.List<com.google.android.flexbox.FlexLine> r6 = r0.mFlexLines
            int r6 = r6.size()
            r8 = 0
        L_0x001e:
            if (r8 >= r6) goto L_0x021e
            java.util.List<com.google.android.flexbox.FlexLine> r9 = r0.mFlexLines
            java.lang.Object r9 = r9.get(r8)
            com.google.android.flexbox.FlexLine r9 = (com.google.android.flexbox.FlexLine) r9
            boolean r10 = r0.hasDividerBeforeFlexLine(r8)
            if (r10 == 0) goto L_0x0032
            int r10 = r0.mDividerHorizontalHeight
            int r3 = r3 - r10
            int r5 = r5 + r10
        L_0x0032:
            int r10 = r0.mJustifyContent
            r15 = 4
            r14 = 2
            r11 = 0
            r13 = 1
            if (r10 == 0) goto L_0x00c5
            if (r10 == r13) goto L_0x00bb
            r12 = 1073741824(0x40000000, float:2.0)
            if (r10 == r14) goto L_0x00a7
            r7 = 3
            if (r10 == r7) goto L_0x008f
            if (r10 == r15) goto L_0x0076
            r7 = 5
            if (r10 != r7) goto L_0x0060
            int r7 = r9.getItemCountNotGone()
            if (r7 == 0) goto L_0x0058
            int r10 = r9.mMainSize
            int r10 = r4 - r10
            float r10 = (float) r10
            int r7 = r7 + 1
            float r7 = (float) r7
            float r10 = r10 / r7
            goto L_0x0059
        L_0x0058:
            r10 = 0
        L_0x0059:
            float r7 = (float) r1
            float r7 = r7 + r10
            int r12 = r4 - r2
            float r12 = (float) r12
            float r12 = r12 - r10
            goto L_0x00ca
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
            int r7 = r9.getItemCountNotGone()
            if (r7 == 0) goto L_0x0084
            int r10 = r9.mMainSize
            int r10 = r4 - r10
            float r10 = (float) r10
            float r7 = (float) r7
            float r10 = r10 / r7
            goto L_0x0085
        L_0x0084:
            r10 = 0
        L_0x0085:
            float r7 = (float) r1
            float r12 = r10 / r12
            float r7 = r7 + r12
            int r14 = r4 - r2
            float r14 = (float) r14
            float r12 = r14 - r12
            goto L_0x00ca
        L_0x008f:
            float r7 = (float) r1
            int r10 = r9.getItemCountNotGone()
            if (r10 == r13) goto L_0x009a
            int r10 = r10 + -1
            float r10 = (float) r10
            goto L_0x009c
        L_0x009a:
            r10 = 1065353216(0x3f800000, float:1.0)
        L_0x009c:
            int r12 = r9.mMainSize
            int r12 = r4 - r12
            float r12 = (float) r12
            float r10 = r12 / r10
            int r12 = r4 - r2
            float r12 = (float) r12
            goto L_0x00ca
        L_0x00a7:
            float r7 = (float) r1
            int r10 = r9.mMainSize
            int r10 = r4 - r10
            float r10 = (float) r10
            float r10 = r10 / r12
            float r7 = r7 + r10
            int r10 = r4 - r2
            float r10 = (float) r10
            int r14 = r9.mMainSize
            int r14 = r4 - r14
            float r14 = (float) r14
            float r14 = r14 / r12
            float r12 = r10 - r14
            goto L_0x00c9
        L_0x00bb:
            int r7 = r9.mMainSize
            int r7 = r4 - r7
            int r7 = r7 + r2
            float r7 = (float) r7
            int r10 = r9.mMainSize
            int r10 = r10 - r1
            goto L_0x00c8
        L_0x00c5:
            float r7 = (float) r1
            int r10 = r4 - r2
        L_0x00c8:
            float r12 = (float) r10
        L_0x00c9:
            r10 = 0
        L_0x00ca:
            float r17 = java.lang.Math.max(r10, r11)
            r14 = 0
        L_0x00cf:
            int r10 = r9.mItemCount
            if (r14 >= r10) goto L_0x0210
            int r10 = r9.mFirstIndex
            int r10 = r10 + r14
            android.view.View r18 = r0.getReorderedChildAt(r10)
            if (r18 == 0) goto L_0x01fe
            int r11 = r18.getVisibility()
            r15 = 8
            if (r11 == r15) goto L_0x01fe
            android.view.ViewGroup$LayoutParams r11 = r18.getLayoutParams()
            r15 = r11
            com.google.android.flexbox.FlexboxLayout$LayoutParams r15 = (com.google.android.flexbox.FlexboxLayout.LayoutParams) r15
            int r11 = r15.leftMargin
            float r11 = (float) r11
            float r7 = r7 + r11
            int r11 = r15.rightMargin
            float r11 = (float) r11
            float r12 = r12 - r11
            boolean r10 = r0.hasDividerBeforeChildAtAlongMainAxis(r10, r14)
            if (r10 == 0) goto L_0x0103
            int r10 = r0.mDividerVerticalWidth
            float r11 = (float) r10
            float r7 = r7 + r11
            float r12 = r12 - r11
            r20 = r10
            r19 = r12
            goto L_0x0107
        L_0x0103:
            r19 = r12
            r20 = 0
        L_0x0107:
            int r10 = r9.mItemCount
            int r10 = r10 - r13
            if (r14 != r10) goto L_0x0119
            int r10 = r0.mShowDividerVertical
            r16 = 4
            r10 = r10 & 4
            if (r10 <= 0) goto L_0x011b
            int r10 = r0.mDividerVerticalWidth
            r21 = r10
            goto L_0x011d
        L_0x0119:
            r16 = 4
        L_0x011b:
            r21 = 0
        L_0x011d:
            int r10 = r0.mFlexWrap
            r12 = 2
            if (r10 != r12) goto L_0x017f
            if (r29 == 0) goto L_0x0155
            com.google.android.flexbox.FlexboxHelper r10 = r0.mFlexboxHelper
            int r11 = java.lang.Math.round(r19)
            int r22 = r18.getMeasuredWidth()
            int r22 = r11 - r22
            int r11 = r18.getMeasuredHeight()
            int r23 = r3 - r11
            int r24 = java.lang.Math.round(r19)
            r11 = r18
            r25 = 2
            r12 = r9
            r26 = 1
            r13 = r22
            r22 = r14
            r14 = r23
            r23 = r1
            r1 = r15
            r27 = 4
            r15 = r24
            r16 = r3
            r10.layoutSingleChildHorizontal(r11, r12, r13, r14, r15, r16)
            goto L_0x01c7
        L_0x0155:
            r23 = r1
            r22 = r14
            r1 = r15
            r25 = 2
            r26 = 1
            r27 = 4
            com.google.android.flexbox.FlexboxHelper r10 = r0.mFlexboxHelper
            int r13 = java.lang.Math.round(r7)
            int r11 = r18.getMeasuredHeight()
            int r14 = r3 - r11
            int r11 = java.lang.Math.round(r7)
            int r12 = r18.getMeasuredWidth()
            int r15 = r11 + r12
            r11 = r18
            r12 = r9
            r16 = r3
            r10.layoutSingleChildHorizontal(r11, r12, r13, r14, r15, r16)
            goto L_0x01c7
        L_0x017f:
            r23 = r1
            r22 = r14
            r1 = r15
            r25 = 2
            r26 = 1
            r27 = 4
            if (r29 == 0) goto L_0x01aa
            com.google.android.flexbox.FlexboxHelper r10 = r0.mFlexboxHelper
            int r11 = java.lang.Math.round(r19)
            int r12 = r18.getMeasuredWidth()
            int r13 = r11 - r12
            int r15 = java.lang.Math.round(r19)
            int r11 = r18.getMeasuredHeight()
            int r16 = r5 + r11
            r11 = r18
            r12 = r9
            r14 = r5
            r10.layoutSingleChildHorizontal(r11, r12, r13, r14, r15, r16)
            goto L_0x01c7
        L_0x01aa:
            com.google.android.flexbox.FlexboxHelper r10 = r0.mFlexboxHelper
            int r13 = java.lang.Math.round(r7)
            int r11 = java.lang.Math.round(r7)
            int r12 = r18.getMeasuredWidth()
            int r15 = r11 + r12
            int r11 = r18.getMeasuredHeight()
            int r16 = r5 + r11
            r11 = r18
            r12 = r9
            r14 = r5
            r10.layoutSingleChildHorizontal(r11, r12, r13, r14, r15, r16)
        L_0x01c7:
            int r10 = r18.getMeasuredWidth()
            float r10 = (float) r10
            float r10 = r10 + r17
            int r11 = r1.rightMargin
            float r11 = (float) r11
            float r10 = r10 + r11
            float r7 = r7 + r10
            int r10 = r18.getMeasuredWidth()
            float r10 = (float) r10
            float r10 = r10 + r17
            int r1 = r1.leftMargin
            float r1 = (float) r1
            float r10 = r10 + r1
            float r19 = r19 - r10
            if (r29 == 0) goto L_0x01ef
            r13 = 0
            r15 = 0
            r10 = r9
            r11 = r18
            r12 = r21
            r14 = r20
            r10.updatePositionFromView(r11, r12, r13, r14, r15)
            goto L_0x01fb
        L_0x01ef:
            r13 = 0
            r15 = 0
            r10 = r9
            r11 = r18
            r12 = r20
            r14 = r21
            r10.updatePositionFromView(r11, r12, r13, r14, r15)
        L_0x01fb:
            r12 = r19
            goto L_0x0208
        L_0x01fe:
            r23 = r1
            r22 = r14
            r25 = 2
            r26 = 1
            r27 = 4
        L_0x0208:
            int r14 = r22 + 1
            r1 = r23
            r13 = 1
            r15 = 4
            goto L_0x00cf
        L_0x0210:
            r23 = r1
            int r1 = r9.mCrossSize
            int r5 = r5 + r1
            int r1 = r9.mCrossSize
            int r3 = r3 - r1
            int r8 = r8 + 1
            r1 = r23
            goto L_0x001e
        L_0x021e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayout.layoutHorizontal(boolean, int, int, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0123  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x017c  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x01df  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x01ec  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void layoutVertical(boolean r30, boolean r31, int r32, int r33, int r34, int r35) {
        /*
            r29 = this;
            r0 = r29
            int r1 = r29.getPaddingTop()
            int r2 = r29.getPaddingBottom()
            int r3 = r29.getPaddingRight()
            int r4 = r29.getPaddingLeft()
            int r5 = r34 - r32
            int r6 = r35 - r33
            int r5 = r5 - r3
            java.util.List<com.google.android.flexbox.FlexLine> r3 = r0.mFlexLines
            int r3 = r3.size()
            r8 = 0
        L_0x001e:
            if (r8 >= r3) goto L_0x0213
            java.util.List<com.google.android.flexbox.FlexLine> r9 = r0.mFlexLines
            java.lang.Object r9 = r9.get(r8)
            com.google.android.flexbox.FlexLine r9 = (com.google.android.flexbox.FlexLine) r9
            boolean r10 = r0.hasDividerBeforeFlexLine(r8)
            if (r10 == 0) goto L_0x0032
            int r10 = r0.mDividerVerticalWidth
            int r4 = r4 + r10
            int r5 = r5 - r10
        L_0x0032:
            int r10 = r0.mJustifyContent
            r15 = 4
            r11 = 0
            r14 = 1
            if (r10 == 0) goto L_0x00c4
            if (r10 == r14) goto L_0x00ba
            r12 = 2
            r13 = 1073741824(0x40000000, float:2.0)
            if (r10 == r12) goto L_0x00a6
            r12 = 3
            if (r10 == r12) goto L_0x008f
            if (r10 == r15) goto L_0x0076
            r12 = 5
            if (r10 != r12) goto L_0x0060
            int r10 = r9.getItemCountNotGone()
            if (r10 == 0) goto L_0x0058
            int r12 = r9.mMainSize
            int r12 = r6 - r12
            float r12 = (float) r12
            int r10 = r10 + 1
            float r10 = (float) r10
            float r12 = r12 / r10
            goto L_0x0059
        L_0x0058:
            r12 = 0
        L_0x0059:
            float r10 = (float) r1
            float r10 = r10 + r12
            int r13 = r6 - r2
            float r13 = (float) r13
            float r13 = r13 - r12
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
            int r10 = r9.getItemCountNotGone()
            if (r10 == 0) goto L_0x0084
            int r12 = r9.mMainSize
            int r12 = r6 - r12
            float r12 = (float) r12
            float r10 = (float) r10
            float r12 = r12 / r10
            goto L_0x0085
        L_0x0084:
            r12 = 0
        L_0x0085:
            float r10 = (float) r1
            float r13 = r12 / r13
            float r10 = r10 + r13
            int r7 = r6 - r2
            float r7 = (float) r7
            float r13 = r7 - r13
            goto L_0x00c9
        L_0x008f:
            float r10 = (float) r1
            int r7 = r9.getItemCountNotGone()
            if (r7 == r14) goto L_0x009a
            int r7 = r7 + -1
            float r7 = (float) r7
            goto L_0x009c
        L_0x009a:
            r7 = 1065353216(0x3f800000, float:1.0)
        L_0x009c:
            int r12 = r9.mMainSize
            int r12 = r6 - r12
            float r12 = (float) r12
            float r12 = r12 / r7
            int r7 = r6 - r2
            float r13 = (float) r7
            goto L_0x00c9
        L_0x00a6:
            float r7 = (float) r1
            int r10 = r9.mMainSize
            int r10 = r6 - r10
            float r10 = (float) r10
            float r10 = r10 / r13
            float r10 = r10 + r7
            int r7 = r6 - r2
            float r7 = (float) r7
            int r12 = r9.mMainSize
            int r12 = r6 - r12
            float r12 = (float) r12
            float r12 = r12 / r13
            float r13 = r7 - r12
            goto L_0x00c8
        L_0x00ba:
            int r7 = r9.mMainSize
            int r7 = r6 - r7
            int r7 = r7 + r2
            float r10 = (float) r7
            int r7 = r9.mMainSize
            int r7 = r7 - r1
            goto L_0x00c7
        L_0x00c4:
            float r10 = (float) r1
            int r7 = r6 - r2
        L_0x00c7:
            float r13 = (float) r7
        L_0x00c8:
            r12 = 0
        L_0x00c9:
            float r7 = java.lang.Math.max(r12, r11)
            r12 = 0
        L_0x00ce:
            int r11 = r9.mItemCount
            if (r12 >= r11) goto L_0x0209
            int r11 = r9.mFirstIndex
            int r11 = r11 + r12
            android.view.View r18 = r0.getReorderedChildAt(r11)
            if (r18 == 0) goto L_0x01fd
            int r15 = r18.getVisibility()
            r14 = 8
            if (r15 == r14) goto L_0x01fd
            android.view.ViewGroup$LayoutParams r14 = r18.getLayoutParams()
            r15 = r14
            com.google.android.flexbox.FlexboxLayout$LayoutParams r15 = (com.google.android.flexbox.FlexboxLayout.LayoutParams) r15
            int r14 = r15.topMargin
            float r14 = (float) r14
            float r10 = r10 + r14
            int r14 = r15.bottomMargin
            float r14 = (float) r14
            float r13 = r13 - r14
            boolean r11 = r0.hasDividerBeforeChildAtAlongMainAxis(r11, r12)
            if (r11 == 0) goto L_0x0104
            int r11 = r0.mDividerHorizontalHeight
            float r14 = (float) r11
            float r10 = r10 + r14
            float r13 = r13 - r14
            r19 = r10
            r21 = r11
            r20 = r13
            goto L_0x010a
        L_0x0104:
            r19 = r10
            r20 = r13
            r21 = 0
        L_0x010a:
            int r10 = r9.mItemCount
            r14 = 1
            int r10 = r10 - r14
            if (r12 != r10) goto L_0x011d
            int r10 = r0.mShowDividerHorizontal
            r16 = 4
            r10 = r10 & 4
            if (r10 <= 0) goto L_0x011f
            int r10 = r0.mDividerHorizontalHeight
            r22 = r10
            goto L_0x0121
        L_0x011d:
            r16 = 4
        L_0x011f:
            r22 = 0
        L_0x0121:
            if (r30 == 0) goto L_0x017c
            if (r31 == 0) goto L_0x0154
            com.google.android.flexbox.FlexboxHelper r10 = r0.mFlexboxHelper
            r13 = 1
            int r11 = r18.getMeasuredWidth()
            int r17 = r5 - r11
            int r11 = java.lang.Math.round(r20)
            int r23 = r18.getMeasuredHeight()
            int r23 = r11 - r23
            int r24 = java.lang.Math.round(r20)
            r11 = r18
            r25 = r12
            r12 = r9
            r26 = 1
            r14 = r17
            r27 = r15
            r28 = 4
            r15 = r23
            r16 = r5
            r17 = r24
            r10.layoutSingleChildVertical(r11, r12, r13, r14, r15, r16, r17)
            goto L_0x01c3
        L_0x0154:
            r25 = r12
            r27 = r15
            r26 = 1
            r28 = 4
            com.google.android.flexbox.FlexboxHelper r10 = r0.mFlexboxHelper
            r13 = 1
            int r11 = r18.getMeasuredWidth()
            int r14 = r5 - r11
            int r15 = java.lang.Math.round(r19)
            int r11 = java.lang.Math.round(r19)
            int r12 = r18.getMeasuredHeight()
            int r17 = r11 + r12
            r11 = r18
            r12 = r9
            r16 = r5
            r10.layoutSingleChildVertical(r11, r12, r13, r14, r15, r16, r17)
            goto L_0x01c3
        L_0x017c:
            r25 = r12
            r27 = r15
            r26 = 1
            r28 = 4
            if (r31 == 0) goto L_0x01a5
            com.google.android.flexbox.FlexboxHelper r10 = r0.mFlexboxHelper
            r13 = 0
            int r11 = java.lang.Math.round(r20)
            int r12 = r18.getMeasuredHeight()
            int r15 = r11 - r12
            int r11 = r18.getMeasuredWidth()
            int r16 = r4 + r11
            int r17 = java.lang.Math.round(r20)
            r11 = r18
            r12 = r9
            r14 = r4
            r10.layoutSingleChildVertical(r11, r12, r13, r14, r15, r16, r17)
            goto L_0x01c3
        L_0x01a5:
            com.google.android.flexbox.FlexboxHelper r10 = r0.mFlexboxHelper
            r13 = 0
            int r15 = java.lang.Math.round(r19)
            int r11 = r18.getMeasuredWidth()
            int r16 = r4 + r11
            int r11 = java.lang.Math.round(r19)
            int r12 = r18.getMeasuredHeight()
            int r17 = r11 + r12
            r11 = r18
            r12 = r9
            r14 = r4
            r10.layoutSingleChildVertical(r11, r12, r13, r14, r15, r16, r17)
        L_0x01c3:
            int r10 = r18.getMeasuredHeight()
            float r10 = (float) r10
            float r10 = r10 + r7
            r14 = r27
            int r11 = r14.bottomMargin
            float r11 = (float) r11
            float r10 = r10 + r11
            float r19 = r19 + r10
            int r10 = r18.getMeasuredHeight()
            float r10 = (float) r10
            float r10 = r10 + r7
            int r11 = r14.topMargin
            float r11 = (float) r11
            float r10 = r10 + r11
            float r20 = r20 - r10
            if (r31 == 0) goto L_0x01ec
            r12 = 0
            r14 = 0
            r10 = r9
            r11 = r18
            r13 = r22
            r15 = r21
            r10.updatePositionFromView(r11, r12, r13, r14, r15)
            goto L_0x01f8
        L_0x01ec:
            r12 = 0
            r14 = 0
            r10 = r9
            r11 = r18
            r13 = r21
            r15 = r22
            r10.updatePositionFromView(r11, r12, r13, r14, r15)
        L_0x01f8:
            r10 = r19
            r13 = r20
            goto L_0x0203
        L_0x01fd:
            r25 = r12
            r26 = 1
            r28 = 4
        L_0x0203:
            int r12 = r25 + 1
            r14 = 1
            r15 = 4
            goto L_0x00ce
        L_0x0209:
            int r7 = r9.mCrossSize
            int r4 = r4 + r7
            int r7 = r9.mCrossSize
            int r5 = r5 - r7
            int r8 = r8 + 1
            goto L_0x001e
        L_0x0213:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayout.layoutVertical(boolean, boolean, int, int, int, int):void");
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        if (this.mDividerDrawableVertical != null || this.mDividerDrawableHorizontal != null) {
            if (this.mShowDividerHorizontal != 0 || this.mShowDividerVertical != 0) {
                int IsOverlapping = ViewCompat.IsOverlapping(this);
                int i = this.mFlexDirection;
                boolean z = false;
                boolean z2 = true;
                if (i == 0) {
                    boolean z3 = IsOverlapping == 1;
                    if (this.mFlexWrap == 2) {
                        z = true;
                    }
                    drawDividersHorizontal(canvas, z3, z);
                } else if (i == 1) {
                    boolean z4 = IsOverlapping != 1;
                    if (this.mFlexWrap == 2) {
                        z = true;
                    }
                    drawDividersHorizontal(canvas, z4, z);
                } else if (i == 2) {
                    if (IsOverlapping != 1) {
                        z2 = false;
                    }
                    if (this.mFlexWrap == 2) {
                        z2 = !z2;
                    }
                    drawDividersVertical(canvas, z2, false);
                } else if (i == 3) {
                    if (IsOverlapping == 1) {
                        z = true;
                    }
                    if (this.mFlexWrap == 2) {
                        z = !z;
                    }
                    drawDividersVertical(canvas, z, true);
                }
            }
        }
    }

    private void drawDividersHorizontal(Canvas canvas, boolean z, boolean z2) {
        int i;
        int i2;
        int i3;
        int i4;
        int paddingLeft = getPaddingLeft();
        int max = Math.max(0, (getWidth() - getPaddingRight()) - paddingLeft);
        int size = this.mFlexLines.size();
        for (int i5 = 0; i5 < size; i5++) {
            FlexLine flexLine = this.mFlexLines.get(i5);
            for (int i6 = 0; i6 < flexLine.mItemCount; i6++) {
                int i7 = flexLine.mFirstIndex + i6;
                View reorderedChildAt = getReorderedChildAt(i7);
                if (!(reorderedChildAt == null || reorderedChildAt.getVisibility() == 8)) {
                    LayoutParams layoutParams = (LayoutParams) reorderedChildAt.getLayoutParams();
                    if (hasDividerBeforeChildAtAlongMainAxis(i7, i6)) {
                        if (z) {
                            i4 = reorderedChildAt.getRight() + layoutParams.rightMargin;
                        } else {
                            i4 = (reorderedChildAt.getLeft() - layoutParams.leftMargin) - this.mDividerVerticalWidth;
                        }
                        drawVerticalDivider(canvas, i4, flexLine.mTop, flexLine.mCrossSize);
                    }
                    if (i6 == flexLine.mItemCount - 1 && (this.mShowDividerVertical & 4) > 0) {
                        if (z) {
                            i3 = (reorderedChildAt.getLeft() - layoutParams.leftMargin) - this.mDividerVerticalWidth;
                        } else {
                            i3 = reorderedChildAt.getRight() + layoutParams.rightMargin;
                        }
                        drawVerticalDivider(canvas, i3, flexLine.mTop, flexLine.mCrossSize);
                    }
                }
            }
            if (hasDividerBeforeFlexLine(i5)) {
                if (z2) {
                    i2 = flexLine.mBottom;
                } else {
                    i2 = flexLine.mTop - this.mDividerHorizontalHeight;
                }
                drawHorizontalDivider(canvas, paddingLeft, i2, max);
            }
            if (hasEndDividerAfterFlexLine(i5) && (this.mShowDividerHorizontal & 4) > 0) {
                if (z2) {
                    i = flexLine.mTop - this.mDividerHorizontalHeight;
                } else {
                    i = flexLine.mBottom;
                }
                drawHorizontalDivider(canvas, paddingLeft, i, max);
            }
        }
    }

    private void drawDividersVertical(Canvas canvas, boolean z, boolean z2) {
        int i;
        int i2;
        int i3;
        int i4;
        int paddingTop = getPaddingTop();
        int max = Math.max(0, (getHeight() - getPaddingBottom()) - paddingTop);
        int size = this.mFlexLines.size();
        for (int i5 = 0; i5 < size; i5++) {
            FlexLine flexLine = this.mFlexLines.get(i5);
            for (int i6 = 0; i6 < flexLine.mItemCount; i6++) {
                int i7 = flexLine.mFirstIndex + i6;
                View reorderedChildAt = getReorderedChildAt(i7);
                if (!(reorderedChildAt == null || reorderedChildAt.getVisibility() == 8)) {
                    LayoutParams layoutParams = (LayoutParams) reorderedChildAt.getLayoutParams();
                    if (hasDividerBeforeChildAtAlongMainAxis(i7, i6)) {
                        if (z2) {
                            i4 = reorderedChildAt.getBottom() + layoutParams.bottomMargin;
                        } else {
                            i4 = (reorderedChildAt.getTop() - layoutParams.topMargin) - this.mDividerHorizontalHeight;
                        }
                        drawHorizontalDivider(canvas, flexLine.mLeft, i4, flexLine.mCrossSize);
                    }
                    if (i6 == flexLine.mItemCount - 1 && (this.mShowDividerHorizontal & 4) > 0) {
                        if (z2) {
                            i3 = (reorderedChildAt.getTop() - layoutParams.topMargin) - this.mDividerHorizontalHeight;
                        } else {
                            i3 = reorderedChildAt.getBottom() + layoutParams.bottomMargin;
                        }
                        drawHorizontalDivider(canvas, flexLine.mLeft, i3, flexLine.mCrossSize);
                    }
                }
            }
            if (hasDividerBeforeFlexLine(i5)) {
                if (z) {
                    i2 = flexLine.mRight;
                } else {
                    i2 = flexLine.mLeft - this.mDividerVerticalWidth;
                }
                drawVerticalDivider(canvas, i2, paddingTop, max);
            }
            if (hasEndDividerAfterFlexLine(i5) && (this.mShowDividerVertical & 4) > 0) {
                if (z) {
                    i = flexLine.mLeft - this.mDividerVerticalWidth;
                } else {
                    i = flexLine.mRight;
                }
                drawVerticalDivider(canvas, i, paddingTop, max);
            }
        }
    }

    private void drawVerticalDivider(Canvas canvas, int i, int i2, int i3) {
        Drawable drawable = this.mDividerDrawableVertical;
        if (drawable != null) {
            drawable.setBounds(i, i2, this.mDividerVerticalWidth + i, i3 + i2);
            this.mDividerDrawableVertical.draw(canvas);
        }
    }

    private void drawHorizontalDivider(Canvas canvas, int i, int i2, int i3) {
        Drawable drawable = this.mDividerDrawableHorizontal;
        if (drawable != null) {
            drawable.setBounds(i, i2, i3 + i, this.mDividerHorizontalHeight + i2);
            this.mDividerDrawableHorizontal.draw(canvas);
        }
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LayoutParams) {
            return new LayoutParams((LayoutParams) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new LayoutParams(layoutParams);
    }

    public int getFlexDirection() {
        return this.mFlexDirection;
    }

    public void setFlexDirection(int i) {
        if (this.mFlexDirection != i) {
            this.mFlexDirection = i;
            requestLayout();
        }
    }

    public int getFlexWrap() {
        return this.mFlexWrap;
    }

    public void setFlexWrap(int i) {
        if (this.mFlexWrap != i) {
            this.mFlexWrap = i;
            requestLayout();
        }
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
        if (this.mAlignItems != i) {
            this.mAlignItems = i;
            requestLayout();
        }
    }

    public int getAlignContent() {
        return this.mAlignContent;
    }

    public void setAlignContent(int i) {
        if (this.mAlignContent != i) {
            this.mAlignContent = i;
            requestLayout();
        }
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
        for (FlexLine next : this.mFlexLines) {
            if (next.getItemCountNotGone() != 0) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public int getDecorationLengthMainAxis(View view, int i, int i2) {
        int i3;
        int i4 = 0;
        if (isMainAxisDirectionHorizontal()) {
            if (hasDividerBeforeChildAtAlongMainAxis(i, i2)) {
                i4 = 0 + this.mDividerVerticalWidth;
            }
            if ((this.mShowDividerVertical & 4) <= 0) {
                return i4;
            }
            i3 = this.mDividerVerticalWidth;
        } else {
            if (hasDividerBeforeChildAtAlongMainAxis(i, i2)) {
                i4 = 0 + this.mDividerHorizontalHeight;
            }
            if ((this.mShowDividerHorizontal & 4) <= 0) {
                return i4;
            }
            i3 = this.mDividerHorizontalHeight;
        }
        return i4 + i3;
    }

    public void onNewFlexLineAdded(FlexLine flexLine) {
        if (isMainAxisDirectionHorizontal()) {
            if ((this.mShowDividerVertical & 4) > 0) {
                flexLine.mMainSize += this.mDividerVerticalWidth;
                flexLine.mDividerLengthInMainSize += this.mDividerVerticalWidth;
            }
        } else if ((this.mShowDividerHorizontal & 4) > 0) {
            flexLine.mMainSize += this.mDividerHorizontalHeight;
            flexLine.mDividerLengthInMainSize += this.mDividerHorizontalHeight;
        }
    }

    public int getChildWidthMeasureSpec(int i, int i2, int i3) {
        return getChildMeasureSpec(i, i2, i3);
    }

    public int getChildHeightMeasureSpec(int i, int i2, int i3) {
        return getChildMeasureSpec(i, i2, i3);
    }

    public void onNewFlexItemAdded(View view, int i, int i2, FlexLine flexLine) {
        if (!hasDividerBeforeChildAtAlongMainAxis(i, i2)) {
            return;
        }
        if (isMainAxisDirectionHorizontal()) {
            flexLine.mMainSize += this.mDividerVerticalWidth;
            flexLine.mDividerLengthInMainSize += this.mDividerVerticalWidth;
            return;
        }
        flexLine.mMainSize += this.mDividerHorizontalHeight;
        flexLine.mDividerLengthInMainSize += this.mDividerHorizontalHeight;
    }

    public void setFlexLines(List<FlexLine> list) {
        this.mFlexLines = list;
    }

    public List<FlexLine> getFlexLinesInternal() {
        return this.mFlexLines;
    }

    @Nullable
    public Drawable getDividerDrawableHorizontal() {
        return this.mDividerDrawableHorizontal;
    }

    @Nullable
    public Drawable getDividerDrawableVertical() {
        return this.mDividerDrawableVertical;
    }

    public void setDividerDrawable(Drawable drawable) {
        setDividerDrawableHorizontal(drawable);
        setDividerDrawableVertical(drawable);
    }

    public void setDividerDrawableHorizontal(@Nullable Drawable drawable) {
        if (drawable != this.mDividerDrawableHorizontal) {
            this.mDividerDrawableHorizontal = drawable;
            if (drawable != null) {
                this.mDividerHorizontalHeight = drawable.getIntrinsicHeight();
            } else {
                this.mDividerHorizontalHeight = 0;
            }
            setWillNotDrawFlag();
            requestLayout();
        }
    }

    public void setDividerDrawableVertical(@Nullable Drawable drawable) {
        if (drawable != this.mDividerDrawableVertical) {
            this.mDividerDrawableVertical = drawable;
            if (drawable != null) {
                this.mDividerVerticalWidth = drawable.getIntrinsicWidth();
            } else {
                this.mDividerVerticalWidth = 0;
            }
            setWillNotDrawFlag();
            requestLayout();
        }
    }

    public int getShowDividerVertical() {
        return this.mShowDividerVertical;
    }

    public int getShowDividerHorizontal() {
        return this.mShowDividerHorizontal;
    }

    public void setShowDivider(int i) {
        setShowDividerVertical(i);
        setShowDividerHorizontal(i);
    }

    public void setShowDividerVertical(int i) {
        if (i != this.mShowDividerVertical) {
            this.mShowDividerVertical = i;
            requestLayout();
        }
    }

    public void setShowDividerHorizontal(int i) {
        if (i != this.mShowDividerHorizontal) {
            this.mShowDividerHorizontal = i;
            requestLayout();
        }
    }

    private void setWillNotDrawFlag() {
        if (this.mDividerDrawableHorizontal == null && this.mDividerDrawableVertical == null) {
            setWillNotDraw(true);
        } else {
            setWillNotDraw(false);
        }
    }

    private boolean hasDividerBeforeChildAtAlongMainAxis(int i, int i2) {
        return allViewsAreGoneBefore(i, i2) ? isMainAxisDirectionHorizontal() ? (this.mShowDividerVertical & 1) != 0 : (this.mShowDividerHorizontal & 1) != 0 : isMainAxisDirectionHorizontal() ? (this.mShowDividerVertical & 2) != 0 : (this.mShowDividerHorizontal & 2) != 0;
    }

    private boolean allViewsAreGoneBefore(int i, int i2) {
        for (int i3 = 1; i3 <= i2; i3++) {
            View reorderedChildAt = getReorderedChildAt(i - i3);
            if (reorderedChildAt != null && reorderedChildAt.getVisibility() != 8) {
                return false;
            }
        }
        return true;
    }

    private boolean hasDividerBeforeFlexLine(int i) {
        if (i >= 0 && i < this.mFlexLines.size()) {
            if (allFlexLinesAreDummyBefore(i)) {
                if (isMainAxisDirectionHorizontal()) {
                    if ((this.mShowDividerHorizontal & 1) != 0) {
                        return true;
                    }
                    return false;
                } else if ((this.mShowDividerVertical & 1) != 0) {
                    return true;
                } else {
                    return false;
                }
            } else if (isMainAxisDirectionHorizontal()) {
                if ((this.mShowDividerHorizontal & 2) != 0) {
                    return true;
                }
                return false;
            } else if ((this.mShowDividerVertical & 2) != 0) {
                return true;
            }
        }
        return false;
    }

    private boolean allFlexLinesAreDummyBefore(int i) {
        int max = dispatchOnCancelled.setMax(i);
        if (i != max) {
            onCanceled oncanceled = new onCanceled(i, max, 1);
            onCancelLoad.setMax(204185318, oncanceled);
            onCancelLoad.getMin(204185318, oncanceled);
        }
        for (int i2 = 0; i2 < i; i2++) {
            if (this.mFlexLines.get(i2).getItemCountNotGone() > 0) {
                return false;
            }
        }
        return true;
    }

    private boolean hasEndDividerAfterFlexLine(int i) {
        if (i >= 0 && i < this.mFlexLines.size()) {
            for (int i2 = i + 1; i2 < this.mFlexLines.size(); i2++) {
                if (this.mFlexLines.get(i2).getItemCountNotGone() > 0) {
                    return false;
                }
            }
            if (isMainAxisDirectionHorizontal()) {
                return (this.mShowDividerHorizontal & 4) != 0;
            }
            if ((this.mShowDividerVertical & 4) != 0) {
                return true;
            }
        }
        return false;
    }

    public static class LayoutParams extends ViewGroup.MarginLayoutParams implements FlexItem {
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
        private int mMinHeight = -1;
        private int mMinWidth = -1;
        private int mOrder = 1;
        private boolean mWrapBefore;

        public int describeContents() {
            return 0;
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.FlexboxLayout_Layout);
            this.mOrder = obtainStyledAttributes.getInt(R.styleable.FlexboxLayout_Layout_layout_order, 1);
            this.mFlexGrow = obtainStyledAttributes.getFloat(R.styleable.FlexboxLayout_Layout_layout_flexGrow, 0.0f);
            this.mFlexShrink = obtainStyledAttributes.getFloat(R.styleable.FlexboxLayout_Layout_layout_flexShrink, 1.0f);
            this.mAlignSelf = obtainStyledAttributes.getInt(R.styleable.FlexboxLayout_Layout_layout_alignSelf, -1);
            this.mFlexBasisPercent = obtainStyledAttributes.getFraction(R.styleable.FlexboxLayout_Layout_layout_flexBasisPercent, 1, 1, -1.0f);
            this.mMinWidth = obtainStyledAttributes.getDimensionPixelSize(R.styleable.FlexboxLayout_Layout_layout_minWidth, -1);
            this.mMinHeight = obtainStyledAttributes.getDimensionPixelSize(R.styleable.FlexboxLayout_Layout_layout_minHeight, -1);
            this.mMaxWidth = obtainStyledAttributes.getDimensionPixelSize(R.styleable.FlexboxLayout_Layout_layout_maxWidth, FlexItem.MAX_SIZE);
            this.mMaxHeight = obtainStyledAttributes.getDimensionPixelSize(R.styleable.FlexboxLayout_Layout_layout_maxHeight, FlexItem.MAX_SIZE);
            this.mWrapBefore = obtainStyledAttributes.getBoolean(R.styleable.FlexboxLayout_Layout_layout_wrapBefore, false);
            obtainStyledAttributes.recycle();
        }

        public LayoutParams(LayoutParams layoutParams) {
            super(layoutParams);
            this.mOrder = layoutParams.mOrder;
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

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(int i, int i2) {
            super(new ViewGroup.LayoutParams(i, i2));
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
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

        public int getOrder() {
            return this.mOrder;
        }

        public void setOrder(int i) {
            this.mOrder = i;
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

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.mOrder);
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

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        protected LayoutParams(Parcel parcel) {
            super(0, 0);
            boolean z = false;
            this.mOrder = parcel.readInt();
            this.mFlexGrow = parcel.readFloat();
            this.mFlexShrink = parcel.readFloat();
            this.mAlignSelf = parcel.readInt();
            this.mFlexBasisPercent = parcel.readFloat();
            this.mMinWidth = parcel.readInt();
            this.mMinHeight = parcel.readInt();
            this.mMaxWidth = parcel.readInt();
            this.mMaxHeight = parcel.readInt();
            this.mWrapBefore = parcel.readByte() != 0 ? true : z;
            this.bottomMargin = parcel.readInt();
            this.leftMargin = parcel.readInt();
            this.rightMargin = parcel.readInt();
            this.topMargin = parcel.readInt();
            this.height = parcel.readInt();
            this.width = parcel.readInt();
        }
    }
}
