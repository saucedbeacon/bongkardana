package com.andrognito.flashbar.view;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.provider.Settings;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import com.ap.zoloz.hummer.biz.HummerConstants;
import id.dana.richview.CurrencyTextView;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.dispatchOnCancelled;
import o.getCollapseContentDescription;
import o.onCancelLoad;
import o.onCanceled;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0013\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u001c\u0018\u00002\u00020\u0001:\u0002_`B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\u0006\u0010)\u001a\u00020\tJ\u0006\u0010*\u001a\u00020\tJ\u0006\u0010+\u001a\u00020\tJ\u0006\u0010,\u001a\u00020\u000bJ\u0006\u0010-\u001a\u00020\tJ\u0006\u0010.\u001a\u00020\tJ\u0006\u0010/\u001a\u00020\u000bJ\u0010\u00100\u001a\u0002012\u0006\u00102\u001a\u000203H\u0014J\u0018\u00104\u001a\u0002012\u0006\u00105\u001a\u00020\t2\u0006\u00106\u001a\u00020\tH\u0014J\u0010\u00107\u001a\u0002012\u0006\u00108\u001a\u000209H\u0016J\n\u0010:\u001a\u0004\u0018\u000109H\u0016J(\u0010;\u001a\u0002012\u0006\u0010<\u001a\u00020\t2\u0006\u0010=\u001a\u00020\t2\u0006\u0010>\u001a\u00020\t2\u0006\u0010?\u001a\u00020\tH\u0014J\u0018\u0010@\u001a\u0002012\u0006\u0010A\u001a\u00020\u00012\u0006\u0010B\u001a\u00020\tH\u0014J\u0010\u0010C\u001a\u0002012\u0006\u0010D\u001a\u00020EH\u0002J\u0006\u0010F\u001a\u000201J\b\u0010G\u001a\u000201H\u0002J\u0010\u0010G\u001a\u0002012\u0006\u0010H\u001a\u00020\u000bH\u0002J\b\u0010I\u001a\u000201H\u0003J\u000e\u0010J\u001a\u0002012\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010K\u001a\u0002012\u0006\u0010\u0014\u001a\u00020\tJ\u000e\u0010L\u001a\u0002012\u0006\u0010M\u001a\u00020\u0016J\u000e\u0010N\u001a\u0002012\u0006\u0010\u0019\u001a\u00020\tJ\u000e\u0010O\u001a\u0002012\u0006\u0010P\u001a\u00020\u000bJ\u000e\u0010Q\u001a\u0002012\u0006\u0010R\u001a\u00020\rJ\u000e\u0010S\u001a\u0002012\u0006\u0010P\u001a\u00020\u000bJ\u000e\u0010T\u001a\u0002012\u0006\u0010\"\u001a\u00020\tJ\u000e\u0010U\u001a\u0002012\u0006\u0010$\u001a\u00020\tJ\u000e\u0010V\u001a\u0002012\u0006\u0010&\u001a\u00020\u000bJ\u0018\u0010W\u001a\u0002012\u0006\u0010X\u001a\u00020\t2\u0006\u0010Y\u001a\u00020\tH\u0002J\b\u0010Z\u001a\u000201H\u0002J\u0006\u0010[\u001a\u000201J\u0006\u0010\\\u001a\u000201J\u0010\u0010]\u001a\u0002012\u0006\u0010^\u001a\u00020\u001dH\u0002R\u000e\u0010\b\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\tXD¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\tXD¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u001dXD¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u001dX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0011X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\u0013X\u000e¢\u0006\u0002\n\u0000¨\u0006a"}, d2 = {"Lcom/andrognito/flashbar/view/FbProgress;", "Landroid/view/View;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "(Landroid/content/Context;)V", "barColor", "", "barExtraLength", "", "barGrowingFromFront", "", "barLength", "barMaxLength", "barPaint", "Landroid/graphics/Paint;", "barSpinCycleTime", "", "barWidth", "callback", "Lcom/andrognito/flashbar/view/FbProgress$ProgressCallback;", "circleBounds", "Landroid/graphics/RectF;", "circleRadius", "fillRadius", "isSpinning", "lastTimeAnimated", "", "linearProgress", "pauseGrowingTime", "pausedTimeWithoutGrowing", "progress", "rimColor", "rimPaint", "rimWidth", "shouldAnimate", "spinSpeed", "targetProgress", "timeStartGrowing", "getBarColor", "getBarWidth", "getCircleRadius", "getProgress", "getRimColor", "getRimWidth", "getSpinSpeed", "onDraw", "", "canvas", "Landroid/graphics/Canvas;", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "onRestoreInstanceState", "state", "Landroid/os/Parcelable;", "onSaveInstanceState", "onSizeChanged", "w", "h", "oldW", "oldH", "onVisibilityChanged", "changedView", "visibility", "parseAttributes", "a", "Landroid/content/res/TypedArray;", "resetCount", "runCallback", "value", "setAnimationEnabled", "setBarColor", "setBarWidth", "setCallback", "progressCallback", "setCircleRadius", "setInstantProgress", "update", "setLinearProgress", "isLinear", "setProgress", "setRimColor", "setRimWidth", "setSpinSpeed", "setupBounds", "layoutWidth", "layoutHeight", "setupPaints", "spin", "stopSpinning", "updateBarLength", "deltaTimeInMilliSeconds", "ProgressCallback", "WheelSavedState", "flashbar_release"}, k = 1, mv = {1, 1, 10})
public final class FbProgress extends View {
    private final Paint FastBitmap$CoordinateSystem = new Paint();
    private RectF Grayscale$Algorithm = new RectF();
    private boolean ICustomTabsCallback;
    private int IsOverlapping = 4;
    private final Paint Mean$Arithmetic = new Paint();
    private float b;
    private boolean create;
    private double equals = 460.0d;
    private length getCause;
    private final int getMax = 270;
    private final long getMin = 200;
    private int hashCode = FlexItem.MAX_SIZE;
    private long invoke;
    private boolean invokeSuspend;
    private boolean isInside;
    private int length = 28;
    private HashMap onMessageChannelReady;
    private float onNavigationEvent;
    private int setMax = 4;
    private final int setMin = 16;
    private boolean toDoubleRange = true;
    private float toFloatRange;
    private double toIntRange;
    private int toString = -1442840576;
    private float valueOf = 230.0f;
    private long values;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/andrognito/flashbar/view/FbProgress$ProgressCallback;", "", "onProgressUpdate", "", "progress", "", "flashbar_release"}, k = 1, mv = {1, 1, 10})
    public interface length {
    }

    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.onMessageChannelReady;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public final View _$_findCachedViewById(int i) {
        if (this.onMessageChannelReady == null) {
            this.onMessageChannelReady = new HashMap();
        }
        View view = (View) this.onMessageChannelReady.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.onMessageChannelReady.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FbProgress(@NotNull Context context, @NotNull AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkParameterIsNotNull(context, HummerConstants.CONTEXT);
        Intrinsics.checkParameterIsNotNull(attributeSet, "attrs");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, getCollapseContentDescription.equals.valueOf);
        Intrinsics.checkExpressionValueIsNotNull(obtainStyledAttributes, "context.obtainStyledAttr…, R.styleable.FbProgress)");
        Context context2 = getContext();
        Intrinsics.checkExpressionValueIsNotNull(context2, HummerConstants.CONTEXT);
        Resources resources = context2.getResources();
        Intrinsics.checkExpressionValueIsNotNull(resources, "context.resources");
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        this.setMax = (int) TypedValue.applyDimension(1, (float) this.setMax, displayMetrics);
        this.IsOverlapping = (int) TypedValue.applyDimension(1, (float) this.IsOverlapping, displayMetrics);
        this.length = (int) TypedValue.applyDimension(1, (float) this.length, displayMetrics);
        this.length = (int) obtainStyledAttributes.getDimension(getCollapseContentDescription.equals.create, (float) this.length);
        this.isInside = obtainStyledAttributes.getBoolean(getCollapseContentDescription.equals.getCause, false);
        this.setMax = (int) obtainStyledAttributes.getDimension(getCollapseContentDescription.equals.b, (float) this.setMax);
        this.IsOverlapping = (int) obtainStyledAttributes.getDimension(getCollapseContentDescription.equals.extraCallbackWithResult, (float) this.IsOverlapping);
        this.valueOf = obtainStyledAttributes.getFloat(getCollapseContentDescription.equals.onMessageChannelReady, this.valueOf / 360.0f) * 360.0f;
        this.equals = (double) obtainStyledAttributes.getInt(getCollapseContentDescription.equals.Grayscale$Algorithm, (int) this.equals);
        this.toString = obtainStyledAttributes.getColor(getCollapseContentDescription.equals.invokeSuspend, this.toString);
        this.hashCode = obtainStyledAttributes.getColor(getCollapseContentDescription.equals.onPostMessage, this.hashCode);
        this.invokeSuspend = obtainStyledAttributes.getBoolean(getCollapseContentDescription.equals.ICustomTabsCallback, false);
        if (obtainStyledAttributes.getBoolean(getCollapseContentDescription.equals.onNavigationEvent, false)) {
            spin();
        }
        obtainStyledAttributes.recycle();
        setMax();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FbProgress(@NotNull Context context) {
        super(context);
        Intrinsics.checkParameterIsNotNull(context, HummerConstants.CONTEXT);
        setMax();
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int paddingLeft = this.length + getPaddingLeft() + getPaddingRight();
        int paddingTop = this.length + getPaddingTop() + getPaddingBottom();
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode == 1073741824) {
            paddingLeft = size;
        } else if (mode == Integer.MIN_VALUE) {
            paddingLeft = Math.min(paddingLeft, size);
        }
        if (mode2 == 1073741824 || mode == 1073741824) {
            paddingTop = size2;
        } else if (mode2 == Integer.MIN_VALUE) {
            paddingTop = Math.min(paddingTop, size2);
        }
        setMeasuredDimension(paddingLeft, paddingTop);
    }

    /* access modifiers changed from: protected */
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int max = dispatchOnCancelled.setMax(i);
        if (i != max) {
            onCanceled oncanceled = new onCanceled(i, max, 1);
            onCancelLoad.setMax(-457930859, oncanceled);
            onCancelLoad.getMin(-457930859, oncanceled);
        }
        super.onSizeChanged(i, i2, i3, i4);
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        if (!this.isInside) {
            int i5 = (i - paddingLeft) - paddingRight;
            int min = Math.min(Math.min(i5, (i2 - paddingBottom) - paddingTop), (this.length * 2) - (this.setMax * 2));
            int i6 = ((i5 - min) / 2) + paddingLeft;
            int i7 = ((((i2 - paddingTop) - paddingBottom) - min) / 2) + paddingTop;
            int i8 = this.setMax;
            this.Grayscale$Algorithm = new RectF((float) (i6 + i8), (float) (i7 + i8), (float) ((i6 + min) - i8), (float) ((i7 + min) - i8));
        } else {
            int i9 = this.setMax;
            this.Grayscale$Algorithm = new RectF((float) (paddingLeft + i9), (float) (paddingTop + i9), (float) ((i - paddingRight) - i9), (float) ((i2 - paddingBottom) - i9));
        }
        setMin();
        invalidate();
    }

    /* access modifiers changed from: protected */
    public final void onDraw(@NotNull Canvas canvas) {
        float f;
        length length2;
        float f2;
        float f3;
        Intrinsics.checkParameterIsNotNull(canvas, "canvas");
        super.onDraw(canvas);
        canvas.drawArc(this.Grayscale$Algorithm, 360.0f, 360.0f, false, this.Mean$Arithmetic);
        if (this.ICustomTabsCallback) {
            boolean z = true;
            if (this.create) {
                long uptimeMillis = SystemClock.uptimeMillis() - this.invoke;
                float f4 = (((float) uptimeMillis) * this.valueOf) / 1000.0f;
                long j = this.values;
                if (j >= this.getMin) {
                    double d = this.toIntRange;
                    double d2 = (double) uptimeMillis;
                    Double.isNaN(d2);
                    double d3 = d + d2;
                    this.toIntRange = d3;
                    double d4 = this.equals;
                    if (d3 > d4) {
                        this.toIntRange = d3 - d4;
                        this.values = 0;
                        this.toDoubleRange = !this.toDoubleRange;
                    }
                    float cos = (((float) Math.cos(((this.toIntRange / this.equals) + 1.0d) * 3.141592653589793d)) / 2.0f) + 0.5f;
                    float f5 = (float) (this.getMax - this.setMin);
                    if (this.toDoubleRange) {
                        this.toFloatRange = cos * f5;
                    } else {
                        float f6 = f5 * (1.0f - cos);
                        this.b += this.toFloatRange - f6;
                        this.toFloatRange = f6;
                    }
                } else {
                    this.values = j + uptimeMillis;
                }
                float f7 = this.b + f4;
                this.b = f7;
                if (f7 > 360.0f) {
                    this.b = f7 - 360.0f;
                    length length3 = this.getCause;
                    if (length3 != null && length3 == null) {
                        Intrinsics.throwNpe();
                    }
                }
                this.invoke = SystemClock.uptimeMillis();
                float f8 = this.b - 90.0f;
                float f9 = ((float) this.setMin) + this.toFloatRange;
                if (isInEditMode()) {
                    f3 = 0.0f;
                    f2 = 135.0f;
                } else {
                    f3 = f8;
                    f2 = f9;
                }
                canvas.drawArc(this.Grayscale$Algorithm, f3, f2, false, this.FastBitmap$CoordinateSystem);
            } else {
                float f10 = this.b;
                if (f10 != this.onNavigationEvent) {
                    this.b = Math.min(this.b + ((((float) (SystemClock.uptimeMillis() - this.invoke)) / 1000.0f) * this.valueOf), this.onNavigationEvent);
                    this.invoke = SystemClock.uptimeMillis();
                } else {
                    z = false;
                }
                if (!(f10 == this.b || (length2 = this.getCause) == null || length2 != null)) {
                    Intrinsics.throwNpe();
                }
                float f11 = this.b;
                if (!this.invokeSuspend) {
                    f = ((float) (1.0d - Math.pow((double) (1.0f - (f11 / 360.0f)), 4.0d))) * 360.0f;
                    f11 = ((float) (1.0d - Math.pow((double) (1.0f - (this.b / 360.0f)), 2.0d))) * 360.0f;
                } else {
                    f = 0.0f;
                }
                canvas.drawArc(this.Grayscale$Algorithm, f - 90.0f, isInEditMode() ? 360.0f : f11, false, this.FastBitmap$CoordinateSystem);
            }
            if (z) {
                invalidate();
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onVisibilityChanged(@NotNull View view, int i) {
        Intrinsics.checkParameterIsNotNull(view, "changedView");
        super.onVisibilityChanged(view, i);
        if (i == 0) {
            this.invoke = SystemClock.uptimeMillis();
        }
    }

    @Nullable
    public final Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        Intrinsics.checkExpressionValueIsNotNull(onSaveInstanceState, "superState");
        WheelSavedState wheelSavedState = new WheelSavedState(onSaveInstanceState);
        wheelSavedState.setMax = this.b;
        wheelSavedState.getMin = this.onNavigationEvent;
        wheelSavedState.setMin = this.create;
        wheelSavedState.getMax = this.valueOf;
        wheelSavedState.length = this.setMax;
        wheelSavedState.equals = this.toString;
        wheelSavedState.toFloatRange = this.IsOverlapping;
        wheelSavedState.isInside = this.hashCode;
        wheelSavedState.toIntRange = this.length;
        wheelSavedState.IsOverlapping = this.invokeSuspend;
        wheelSavedState.values = this.isInside;
        return wheelSavedState;
    }

    public final void onRestoreInstanceState(@NotNull Parcelable parcelable) {
        Intrinsics.checkParameterIsNotNull(parcelable, "state");
        if (!(parcelable instanceof WheelSavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        WheelSavedState wheelSavedState = (WheelSavedState) parcelable;
        super.onRestoreInstanceState(wheelSavedState.getSuperState());
        this.b = wheelSavedState.setMax;
        this.onNavigationEvent = wheelSavedState.getMin;
        this.create = wheelSavedState.getMin();
        this.valueOf = wheelSavedState.getMax;
        this.setMax = wheelSavedState.length;
        this.toString = wheelSavedState.equals;
        this.IsOverlapping = wheelSavedState.toFloatRange;
        this.hashCode = wheelSavedState.isInside;
        this.length = wheelSavedState.toIntRange;
        this.invokeSuspend = wheelSavedState.getMax();
        this.isInside = wheelSavedState.setMax();
        this.invoke = SystemClock.uptimeMillis();
    }

    public final void resetCount() {
        this.b = 0.0f;
        this.onNavigationEvent = 0.0f;
        invalidate();
    }

    public final void stopSpinning() {
        this.create = false;
        this.b = 0.0f;
        this.onNavigationEvent = 0.0f;
        invalidate();
    }

    public final void spin() {
        this.invoke = SystemClock.uptimeMillis();
        this.create = true;
        invalidate();
    }

    public final void setInstantProgress(float f) {
        if (this.create) {
            this.b = 0.0f;
            this.create = false;
        }
        if (f > 1.0f) {
            f -= 1.0f;
        } else if (f < 0.0f) {
            f = 0.0f;
        }
        if (f != this.onNavigationEvent) {
            float min = Math.min(f * 360.0f, 360.0f);
            this.onNavigationEvent = min;
            this.b = min;
            this.invoke = SystemClock.uptimeMillis();
            invalidate();
        }
    }

    public final float getProgress() {
        if (this.create) {
            return -1.0f;
        }
        return this.b / 360.0f;
    }

    public final void setProgress(float f) {
        if (this.create) {
            this.b = 0.0f;
            this.create = false;
            length length2 = this.getCause;
            if (length2 != null && length2 == null) {
                Intrinsics.throwNpe();
            }
        }
        if (f > 1.0f) {
            f -= 1.0f;
        } else if (f < 0.0f) {
            f = 0.0f;
        }
        float f2 = this.onNavigationEvent;
        if (f != f2) {
            if (this.b == f2) {
                this.invoke = SystemClock.uptimeMillis();
            }
            this.onNavigationEvent = Math.min(f * 360.0f, 360.0f);
            invalidate();
        }
    }

    public final void setLinearProgress(boolean z) {
        this.invokeSuspend = z;
        if (!this.create) {
            invalidate();
        }
    }

    public final int getCircleRadius() {
        return this.length;
    }

    public final void setCircleRadius(int i) {
        this.length = i;
        if (!this.create) {
            invalidate();
        }
    }

    public final int getBarWidth() {
        return this.setMax;
    }

    public final void setBarWidth(int i) {
        this.setMax = i;
        if (!this.create) {
            invalidate();
        }
    }

    public final int getBarColor() {
        return this.toString;
    }

    public final void setBarColor(int i) {
        this.toString = i;
        setMin();
        if (!this.create) {
            invalidate();
        }
    }

    public final int getRimColor() {
        return this.hashCode;
    }

    public final void setRimColor(int i) {
        int max = dispatchOnCancelled.setMax(i);
        if (i != max) {
            onCanceled oncanceled = new onCanceled(i, max, 1);
            onCancelLoad.setMax(468476593, oncanceled);
            onCancelLoad.getMin(468476593, oncanceled);
        }
        this.hashCode = i;
        setMin();
        if (!this.create) {
            invalidate();
        }
    }

    public final float getSpinSpeed() {
        return this.valueOf / 360.0f;
    }

    public final void setSpinSpeed(float f) {
        this.valueOf = f * 360.0f;
    }

    public final int getRimWidth() {
        return this.IsOverlapping;
    }

    public final void setRimWidth(int i) {
        this.IsOverlapping = i;
        if (!this.create) {
            invalidate();
        }
    }

    public final void setCallback(@NotNull length length2) {
        Intrinsics.checkParameterIsNotNull(length2, "progressCallback");
        this.getCause = length2;
        if (!this.create && length2 != null && length2 == null) {
            Intrinsics.throwNpe();
        }
    }

    @TargetApi(17)
    private final void setMax() {
        float f;
        if (Build.VERSION.SDK_INT >= 17) {
            Context context = getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, HummerConstants.CONTEXT);
            f = Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f);
        } else {
            Context context2 = getContext();
            Intrinsics.checkExpressionValueIsNotNull(context2, HummerConstants.CONTEXT);
            f = Settings.System.getFloat(context2.getContentResolver(), "animator_duration_scale", 1.0f);
        }
        this.ICustomTabsCallback = f != 0.0f;
    }

    private final void setMin() {
        this.FastBitmap$CoordinateSystem.setColor(this.toString);
        this.FastBitmap$CoordinateSystem.setAntiAlias(true);
        this.FastBitmap$CoordinateSystem.setStyle(Paint.Style.STROKE);
        this.FastBitmap$CoordinateSystem.setStrokeWidth((float) this.setMax);
        this.Mean$Arithmetic.setColor(this.hashCode);
        this.Mean$Arithmetic.setAntiAlias(true);
        this.Mean$Arithmetic.setStyle(Paint.Style.STROKE);
        this.Mean$Arithmetic.setStrokeWidth((float) this.IsOverlapping);
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0007\n\u0002\b\u0011\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 52\u00020\u0001:\u00015B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u000f\b\u0012\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0018\u00101\u001a\u0002022\u0006\u00103\u001a\u00020\u00062\u0006\u00104\u001a\u00020\tH\u0016R\u001a\u0010\b\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u000b\"\u0004\b\u0010\u0010\rR\u001a\u0010\u0011\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000b\"\u0004\b\u0013\u0010\rR\u001a\u0010\u0014\u001a\u00020\u0015X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u00020\u0015X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0017\"\u0004\b\u001b\u0010\u0019R\u001a\u0010\u001c\u001a\u00020\u0015X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0017\"\u0004\b\u001e\u0010\u0019R\u001a\u0010\u001f\u001a\u00020 X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001a\u0010%\u001a\u00020 X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\"\"\u0004\b'\u0010$R\u001a\u0010(\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u000b\"\u0004\b*\u0010\rR\u001a\u0010+\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u000b\"\u0004\b-\u0010\rR\u001a\u0010.\u001a\u00020 X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\"\"\u0004\b0\u0010$¨\u00066"}, d2 = {"Lcom/andrognito/flashbar/view/FbProgress$WheelSavedState;", "Landroid/view/View$BaseSavedState;", "superState", "Landroid/os/Parcelable;", "(Landroid/os/Parcelable;)V", "in", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "barColor", "", "getBarColor", "()I", "setBarColor", "(I)V", "barWidth", "getBarWidth", "setBarWidth", "circleRadius", "getCircleRadius", "setCircleRadius", "fillRadius", "", "getFillRadius", "()Z", "setFillRadius", "(Z)V", "isSpinning", "setSpinning", "linearProgress", "getLinearProgress", "setLinearProgress", "mProgress", "", "getMProgress", "()F", "setMProgress", "(F)V", "mTargetProgress", "getMTargetProgress", "setMTargetProgress", "rimColor", "getRimColor", "setRimColor", "rimWidth", "getRimWidth", "setRimWidth", "spinSpeed", "getSpinSpeed", "setSpinSpeed", "writeToParcel", "", "out", "flags", "Companion", "flashbar_release"}, k = 1, mv = {1, 1, 10})
    public static final class WheelSavedState extends View.BaseSavedState {
        @NotNull
        private static final Parcelable.Creator<WheelSavedState> CREATOR = new getMax();
        public static final setMax toString = new setMax((byte) 0);
        boolean IsOverlapping;
        int equals;
        float getMax;
        float getMin;
        int isInside;
        int length;
        float setMax;
        boolean setMin;
        int toFloatRange;
        int toIntRange;
        boolean values;

        public /* synthetic */ WheelSavedState(@NotNull Parcel parcel, byte b) {
            this(parcel);
        }

        public final boolean getMin() {
            return this.setMin;
        }

        public final boolean getMax() {
            return this.IsOverlapping;
        }

        public final boolean setMax() {
            return this.values;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public WheelSavedState(@NotNull Parcelable parcelable) {
            super(parcelable);
            Intrinsics.checkParameterIsNotNull(parcelable, "superState");
        }

        private WheelSavedState(Parcel parcel) {
            super(parcel);
            this.setMax = parcel.readFloat();
            this.getMin = parcel.readFloat();
            boolean z = true;
            this.setMin = parcel.readByte() != 0;
            this.getMax = parcel.readFloat();
            this.length = parcel.readInt();
            this.equals = parcel.readInt();
            this.toFloatRange = parcel.readInt();
            this.isInside = parcel.readInt();
            this.toIntRange = parcel.readInt();
            this.IsOverlapping = parcel.readByte() != 0;
            this.values = parcel.readByte() == 0 ? false : z;
        }

        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkParameterIsNotNull(parcel, "out");
            super.writeToParcel(parcel, i);
            parcel.writeFloat(this.setMax);
            parcel.writeFloat(this.getMin);
            parcel.writeByte(this.setMin ? (byte) 1 : 0);
            parcel.writeFloat(this.getMax);
            parcel.writeInt(this.length);
            parcel.writeInt(this.equals);
            parcel.writeInt(this.toFloatRange);
            parcel.writeInt(this.isInside);
            parcel.writeInt(this.toIntRange);
            parcel.writeByte(this.IsOverlapping ? (byte) 1 : 0);
            parcel.writeByte(this.values ? (byte) 1 : 0);
        }

        @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/andrognito/flashbar/view/FbProgress$WheelSavedState$Companion;", "", "()V", "CREATOR", "Landroid/os/Parcelable$Creator;", "Lcom/andrognito/flashbar/view/FbProgress$WheelSavedState;", "getCREATOR", "()Landroid/os/Parcelable$Creator;", "flashbar_release"}, k = 1, mv = {1, 1, 10})
        public static final class setMax {
            private setMax() {
            }

            public /* synthetic */ setMax(byte b) {
                this();
            }
        }

        @Metadata(bv = {1, 0, 2}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001b\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u000b¨\u0006\f"}, d2 = {"com/andrognito/flashbar/view/FbProgress$WheelSavedState$Companion$CREATOR$1", "Landroid/os/Parcelable$Creator;", "Lcom/andrognito/flashbar/view/FbProgress$WheelSavedState;", "()V", "createFromParcel", "in", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lcom/andrognito/flashbar/view/FbProgress$WheelSavedState;", "flashbar_release"}, k = 1, mv = {1, 1, 10})
        public static final class getMax implements Parcelable.Creator<WheelSavedState> {
            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            }

            getMax() {
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                Intrinsics.checkParameterIsNotNull(parcel, CurrencyTextView.DEFAULT_LANGUAGE_CODE);
                return new WheelSavedState(parcel, (byte) 0);
            }
        }
    }
}
