package com.github.mikephil.charting.charts;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.Entry;
import o.BackStackState;
import o.EmojiAppCompatButton;
import o.EmojiCompat$ReplaceStrategy;
import o.EmojiTextView;
import o.addFocusables;
import o.dismissAllowingStateLoss;
import o.dispatchOnDrawerClosed;
import o.findVisibleDrawer;
import o.getActivity;
import o.getDialog;
import o.getTargetFragment;
import o.getViewLifecycleOwner;
import o.isStateSaved;
import o.onUpdateExtractingViews;
import o.restoreViewState;
import o.setArguments;
import o.setEmojiReplaceStrategy;

@SuppressLint({"RtlHardcoded"})
public abstract class BarLineChartBase<T extends dispatchOnDrawerClosed<? extends EmojiAppCompatButton<? extends Entry>>> extends Chart<T> implements EmojiCompat$ReplaceStrategy {
    private long IsOverlapping = 0;
    private boolean equals = false;
    private boolean getMax = true;
    private boolean getMin = true;
    private long length = 0;
    protected boolean mAutoScaleMinMaxEnabled = false;
    protected YAxis mAxisLeft;
    protected restoreViewState mAxisRendererLeft;
    protected restoreViewState mAxisRendererRight;
    protected YAxis mAxisRight;
    protected Paint mBorderPaint;
    protected boolean mClipValuesToContent = false;
    protected boolean mDoubleTapToZoomEnabled = true;
    protected boolean mDrawBorders = false;
    protected boolean mDrawGridBackground = false;
    protected dismissAllowingStateLoss mDrawListener;
    protected Matrix mFitScreenMatrixBuffer = new Matrix();
    protected float[] mGetPositionBuffer = new float[2];
    protected Paint mGridBackgroundPaint;
    protected boolean mHighlightPerDragEnabled = true;
    protected boolean mKeepPositionOnRotation = false;
    protected getActivity mLeftAxisTransformer;
    protected int mMaxVisibleCount = 100;
    protected float mMinOffset = 15.0f;
    protected float[] mOnSizeChangedBuffer = new float[2];
    protected boolean mPinchZoomEnabled = false;
    protected getActivity mRightAxisTransformer;
    protected getViewLifecycleOwner mXAxisRenderer;
    protected Matrix mZoomMatrixBuffer = new Matrix();
    protected isStateSaved posForGetHighestVisibleX = isStateSaved.getMin(0.0d, 0.0d);
    protected isStateSaved posForGetLowestVisibleX = isStateSaved.getMin(0.0d, 0.0d);
    private boolean setMax = true;
    private boolean setMin = true;
    private RectF toFloatRange = new RectF();

    public /* bridge */ /* synthetic */ dispatchOnDrawerClosed getData() {
        return (dispatchOnDrawerClosed) super.getData();
    }

    public BarLineChartBase(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public BarLineChartBase(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public BarLineChartBase(Context context) {
        super(context);
    }

    /* access modifiers changed from: protected */
    public void init() {
        super.init();
        this.mAxisLeft = new YAxis(YAxis.AxisDependency.LEFT);
        this.mAxisRight = new YAxis(YAxis.AxisDependency.RIGHT);
        this.mLeftAxisTransformer = new getActivity(this.mViewPortHandler);
        this.mRightAxisTransformer = new getActivity(this.mViewPortHandler);
        this.mAxisRendererLeft = new restoreViewState(this.mViewPortHandler, this.mAxisLeft, this.mLeftAxisTransformer);
        this.mAxisRendererRight = new restoreViewState(this.mViewPortHandler, this.mAxisRight, this.mRightAxisTransformer);
        this.mXAxisRenderer = new getViewLifecycleOwner(this.mViewPortHandler, this.mXAxis, this.mLeftAxisTransformer);
        setHighlighter(new findVisibleDrawer(this));
        this.mChartTouchListener = new getDialog(this, this.mViewPortHandler.Mean$Arithmetic());
        Paint paint = new Paint();
        this.mGridBackgroundPaint = paint;
        paint.setStyle(Paint.Style.FILL);
        this.mGridBackgroundPaint.setColor(Color.rgb(240, 240, 240));
        Paint paint2 = new Paint();
        this.mBorderPaint = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        this.mBorderPaint.setColor(-16777216);
        this.mBorderPaint.setStrokeWidth(getTargetFragment.setMax(1.0f));
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.mData != null) {
            long currentTimeMillis = System.currentTimeMillis();
            drawGridBackground(canvas);
            if (this.mAutoScaleMinMaxEnabled) {
                autoScale();
            }
            if (this.mAxisLeft.create()) {
                this.mAxisRendererLeft.getMax(this.mAxisLeft.onPostMessage, this.mAxisLeft.onMessageChannelReady, this.mAxisLeft.extraCallbackWithResult());
            }
            if (this.mAxisRight.create()) {
                this.mAxisRendererRight.getMax(this.mAxisRight.onPostMessage, this.mAxisRight.onMessageChannelReady, this.mAxisRight.extraCallbackWithResult());
            }
            if (this.mXAxis.create()) {
                this.mXAxisRenderer.getMax(this.mXAxis.onPostMessage, this.mXAxis.onMessageChannelReady, false);
            }
            this.mXAxisRenderer.length(canvas);
            this.mAxisRendererLeft.getMax(canvas);
            this.mAxisRendererRight.getMax(canvas);
            if (this.mXAxis.FastBitmap$CoordinateSystem()) {
                this.mXAxisRenderer.getMin(canvas);
            }
            if (this.mAxisLeft.FastBitmap$CoordinateSystem()) {
                this.mAxisRendererLeft.length(canvas);
            }
            if (this.mAxisRight.FastBitmap$CoordinateSystem()) {
                this.mAxisRendererRight.length(canvas);
            }
            if (this.mXAxis.create() && this.mXAxis.toFloatRange()) {
                this.mXAxisRenderer.setMin(canvas);
            }
            if (this.mAxisLeft.create() && this.mAxisLeft.toFloatRange()) {
                this.mAxisRendererLeft.setMax(canvas);
            }
            if (this.mAxisRight.create() && this.mAxisRight.toFloatRange()) {
                this.mAxisRendererRight.setMax(canvas);
            }
            int save = canvas.save();
            canvas.clipRect(this.mViewPortHandler.toDoubleRange());
            this.mRenderer.getMax(canvas);
            if (!this.mXAxis.FastBitmap$CoordinateSystem()) {
                this.mXAxisRenderer.getMin(canvas);
            }
            if (!this.mAxisLeft.FastBitmap$CoordinateSystem()) {
                this.mAxisRendererLeft.length(canvas);
            }
            if (!this.mAxisRight.FastBitmap$CoordinateSystem()) {
                this.mAxisRendererRight.length(canvas);
            }
            if (valuesToHighlight()) {
                this.mRenderer.setMax(canvas, this.mIndicesToHighlight);
            }
            canvas.restoreToCount(save);
            this.mRenderer.setMin(canvas);
            if (this.mXAxis.create() && !this.mXAxis.toFloatRange()) {
                this.mXAxisRenderer.setMin(canvas);
            }
            if (this.mAxisLeft.create() && !this.mAxisLeft.toFloatRange()) {
                this.mAxisRendererLeft.setMax(canvas);
            }
            if (this.mAxisRight.create() && !this.mAxisRight.toFloatRange()) {
                this.mAxisRendererRight.setMax(canvas);
            }
            this.mXAxisRenderer.getMax(canvas);
            this.mAxisRendererLeft.setMin(canvas);
            this.mAxisRendererRight.setMin(canvas);
            if (isClipValuesToContentEnabled()) {
                int save2 = canvas.save();
                canvas.clipRect(this.mViewPortHandler.toDoubleRange());
                this.mRenderer.setMax(canvas);
                canvas.restoreToCount(save2);
            } else {
                this.mRenderer.setMax(canvas);
            }
            this.mLegendRenderer.setMax(canvas);
            drawDescription(canvas);
            drawMarkers(canvas);
            if (this.mLogEnabled) {
                this.length += System.currentTimeMillis() - currentTimeMillis;
                this.IsOverlapping++;
            }
        }
    }

    public void resetTracking() {
        this.length = 0;
        this.IsOverlapping = 0;
    }

    /* access modifiers changed from: protected */
    public void prepareValuePxMatrix() {
        this.mRightAxisTransformer.getMin(this.mXAxis.onPostMessage, this.mXAxis.extraCallbackWithResult, this.mAxisRight.extraCallbackWithResult, this.mAxisRight.onPostMessage);
        this.mLeftAxisTransformer.getMin(this.mXAxis.onPostMessage, this.mXAxis.extraCallbackWithResult, this.mAxisLeft.extraCallbackWithResult, this.mAxisLeft.onPostMessage);
    }

    /* access modifiers changed from: protected */
    public void prepareOffsetMatrix() {
        this.mRightAxisTransformer.getMax(this.mAxisRight.extraCallbackWithResult());
        this.mLeftAxisTransformer.getMax(this.mAxisLeft.extraCallbackWithResult());
    }

    public void notifyDataSetChanged() {
        if (this.mData != null) {
            if (this.mRenderer != null) {
                this.mRenderer.setMax();
            }
            calcMinMax();
            this.mAxisRendererLeft.getMax(this.mAxisLeft.onPostMessage, this.mAxisLeft.onMessageChannelReady, this.mAxisLeft.extraCallbackWithResult());
            this.mAxisRendererRight.getMax(this.mAxisRight.onPostMessage, this.mAxisRight.onMessageChannelReady, this.mAxisRight.extraCallbackWithResult());
            this.mXAxisRenderer.getMax(this.mXAxis.onPostMessage, this.mXAxis.onMessageChannelReady, false);
            if (this.mLegend != null) {
                this.mLegendRenderer.getMax(this.mData);
            }
            calculateOffsets();
        }
    }

    /* access modifiers changed from: protected */
    public void autoScale() {
        ((dispatchOnDrawerClosed) this.mData).getMin(getLowestVisibleX(), getHighestVisibleX());
        this.mXAxis.setMax(((dispatchOnDrawerClosed) this.mData).toFloatRange(), ((dispatchOnDrawerClosed) this.mData).equals());
        if (this.mAxisLeft.create()) {
            this.mAxisLeft.setMax(((dispatchOnDrawerClosed) this.mData).length(YAxis.AxisDependency.LEFT), ((dispatchOnDrawerClosed) this.mData).getMin(YAxis.AxisDependency.LEFT));
        }
        if (this.mAxisRight.create()) {
            this.mAxisRight.setMax(((dispatchOnDrawerClosed) this.mData).length(YAxis.AxisDependency.RIGHT), ((dispatchOnDrawerClosed) this.mData).getMin(YAxis.AxisDependency.RIGHT));
        }
        calculateOffsets();
    }

    /* access modifiers changed from: protected */
    public void calcMinMax() {
        this.mXAxis.setMax(((dispatchOnDrawerClosed) this.mData).toFloatRange(), ((dispatchOnDrawerClosed) this.mData).equals());
        this.mAxisLeft.setMax(((dispatchOnDrawerClosed) this.mData).length(YAxis.AxisDependency.LEFT), ((dispatchOnDrawerClosed) this.mData).getMin(YAxis.AxisDependency.LEFT));
        this.mAxisRight.setMax(((dispatchOnDrawerClosed) this.mData).length(YAxis.AxisDependency.RIGHT), ((dispatchOnDrawerClosed) this.mData).getMin(YAxis.AxisDependency.RIGHT));
    }

    /* access modifiers changed from: protected */
    public void calculateLegendOffsets(RectF rectF) {
        rectF.left = 0.0f;
        rectF.right = 0.0f;
        rectF.top = 0.0f;
        rectF.bottom = 0.0f;
        if (this.mLegend != null && this.mLegend.create() && !this.mLegend.setMax()) {
            int i = AnonymousClass1.setMin[this.mLegend.length.ordinal()];
            if (i == 1) {
                int i2 = AnonymousClass1.getMax[this.mLegend.getMax.ordinal()];
                if (i2 == 1) {
                    rectF.left += Math.min(this.mLegend.Grayscale$Algorithm, this.mViewPortHandler.invoke() * this.mLegend.FastBitmap$CoordinateSystem) + this.mLegend.invokeSuspend();
                } else if (i2 == 2) {
                    rectF.right += Math.min(this.mLegend.Grayscale$Algorithm, this.mViewPortHandler.invoke() * this.mLegend.FastBitmap$CoordinateSystem) + this.mLegend.invokeSuspend();
                } else if (i2 == 3) {
                    int i3 = AnonymousClass1.length[this.mLegend.getMin.ordinal()];
                    if (i3 == 1) {
                        rectF.top += Math.min(this.mLegend.invokeSuspend, this.mViewPortHandler.Grayscale$Algorithm() * this.mLegend.FastBitmap$CoordinateSystem) + this.mLegend.Mean$Arithmetic();
                    } else if (i3 == 2) {
                        rectF.bottom += Math.min(this.mLegend.invokeSuspend, this.mViewPortHandler.Grayscale$Algorithm() * this.mLegend.FastBitmap$CoordinateSystem) + this.mLegend.Mean$Arithmetic();
                    }
                }
            } else if (i == 2) {
                int i4 = AnonymousClass1.length[this.mLegend.getMin.ordinal()];
                if (i4 == 1) {
                    rectF.top += Math.min(this.mLegend.invokeSuspend, this.mViewPortHandler.Grayscale$Algorithm() * this.mLegend.FastBitmap$CoordinateSystem) + this.mLegend.Mean$Arithmetic();
                } else if (i4 == 2) {
                    rectF.bottom += Math.min(this.mLegend.invokeSuspend, this.mViewPortHandler.Grayscale$Algorithm() * this.mLegend.FastBitmap$CoordinateSystem) + this.mLegend.Mean$Arithmetic();
                }
            }
        }
    }

    /* renamed from: com.github.mikephil.charting.charts.BarLineChartBase$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] getMax;
        static final /* synthetic */ int[] length;
        static final /* synthetic */ int[] setMin;

        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|(2:1|2)|3|(2:5|6)|7|9|10|11|12|(2:13|14)|15|17|18|19|20|22) */
        /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x002e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0038 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0054 */
        static {
            /*
                com.github.mikephil.charting.components.Legend$LegendOrientation[] r0 = com.github.mikephil.charting.components.Legend.LegendOrientation.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                setMin = r0
                r1 = 1
                com.github.mikephil.charting.components.Legend$LegendOrientation r2 = com.github.mikephil.charting.components.Legend.LegendOrientation.VERTICAL     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = setMin     // Catch:{ NoSuchFieldError -> 0x001d }
                com.github.mikephil.charting.components.Legend$LegendOrientation r3 = com.github.mikephil.charting.components.Legend.LegendOrientation.HORIZONTAL     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                com.github.mikephil.charting.components.Legend$LegendHorizontalAlignment[] r2 = com.github.mikephil.charting.components.Legend.LegendHorizontalAlignment.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                getMax = r2
                com.github.mikephil.charting.components.Legend$LegendHorizontalAlignment r3 = com.github.mikephil.charting.components.Legend.LegendHorizontalAlignment.LEFT     // Catch:{ NoSuchFieldError -> 0x002e }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x002e }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x002e }
            L_0x002e:
                int[] r2 = getMax     // Catch:{ NoSuchFieldError -> 0x0038 }
                com.github.mikephil.charting.components.Legend$LegendHorizontalAlignment r3 = com.github.mikephil.charting.components.Legend.LegendHorizontalAlignment.RIGHT     // Catch:{ NoSuchFieldError -> 0x0038 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0038 }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0038 }
            L_0x0038:
                int[] r2 = getMax     // Catch:{ NoSuchFieldError -> 0x0043 }
                com.github.mikephil.charting.components.Legend$LegendHorizontalAlignment r3 = com.github.mikephil.charting.components.Legend.LegendHorizontalAlignment.CENTER     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r4 = 3
                r2[r3] = r4     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                com.github.mikephil.charting.components.Legend$LegendVerticalAlignment[] r2 = com.github.mikephil.charting.components.Legend.LegendVerticalAlignment.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                length = r2
                com.github.mikephil.charting.components.Legend$LegendVerticalAlignment r3 = com.github.mikephil.charting.components.Legend.LegendVerticalAlignment.TOP     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r1 = length     // Catch:{ NoSuchFieldError -> 0x005e }
                com.github.mikephil.charting.components.Legend$LegendVerticalAlignment r2 = com.github.mikephil.charting.components.Legend.LegendVerticalAlignment.BOTTOM     // Catch:{ NoSuchFieldError -> 0x005e }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x005e }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x005e }
            L_0x005e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.github.mikephil.charting.charts.BarLineChartBase.AnonymousClass1.<clinit>():void");
        }
    }

    public void calculateOffsets() {
        if (!this.equals) {
            calculateLegendOffsets(this.toFloatRange);
            float f = this.toFloatRange.left + 0.0f;
            float f2 = this.toFloatRange.top + 0.0f;
            float f3 = this.toFloatRange.right + 0.0f;
            float f4 = this.toFloatRange.bottom + 0.0f;
            if (this.mAxisLeft.onTransact()) {
                f += this.mAxisLeft.getMin(this.mAxisRendererLeft.setMax());
            }
            if (this.mAxisRight.onTransact()) {
                f3 += this.mAxisRight.getMin(this.mAxisRendererRight.setMax());
            }
            if (this.mXAxis.create() && this.mXAxis.length()) {
                float Mean$Arithmetic = ((float) this.mXAxis.ICustomTabsCallback$Stub$Proxy) + this.mXAxis.Mean$Arithmetic();
                if (this.mXAxis.newSession == XAxis.XAxisPosition.BOTTOM) {
                    f4 += Mean$Arithmetic;
                } else {
                    if (this.mXAxis.newSession != XAxis.XAxisPosition.TOP) {
                        if (this.mXAxis.newSession == XAxis.XAxisPosition.BOTH_SIDED) {
                            f4 += Mean$Arithmetic;
                        }
                    }
                    f2 += Mean$Arithmetic;
                }
            }
            float extraTopOffset = f2 + getExtraTopOffset();
            float extraRightOffset = f3 + getExtraRightOffset();
            float extraBottomOffset = f4 + getExtraBottomOffset();
            float extraLeftOffset = f + getExtraLeftOffset();
            float max = getTargetFragment.setMax(this.mMinOffset);
            this.mViewPortHandler.getMin(Math.max(max, extraLeftOffset), Math.max(max, extraTopOffset), Math.max(max, extraRightOffset), Math.max(max, extraBottomOffset));
            if (this.mLogEnabled) {
                this.mViewPortHandler.toDoubleRange();
            }
        }
        prepareOffsetMatrix();
        prepareValuePxMatrix();
    }

    /* access modifiers changed from: protected */
    public void drawGridBackground(Canvas canvas) {
        if (this.mDrawGridBackground) {
            canvas.drawRect(this.mViewPortHandler.toDoubleRange(), this.mGridBackgroundPaint);
        }
        if (this.mDrawBorders) {
            canvas.drawRect(this.mViewPortHandler.toDoubleRange(), this.mBorderPaint);
        }
    }

    public getActivity getTransformer(YAxis.AxisDependency axisDependency) {
        if (axisDependency == YAxis.AxisDependency.LEFT) {
            return this.mLeftAxisTransformer;
        }
        return this.mRightAxisTransformer;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        if (this.mChartTouchListener == null || this.mData == null || !this.mTouchEnabled) {
            return false;
        }
        return this.mChartTouchListener.onTouch(this, motionEvent);
    }

    public void computeScroll() {
        if (this.mChartTouchListener instanceof getDialog) {
            ((getDialog) this.mChartTouchListener).setMin();
        }
    }

    public void zoomIn() {
        setArguments FastBitmap$CoordinateSystem = this.mViewPortHandler.FastBitmap$CoordinateSystem();
        this.mViewPortHandler.getMin(FastBitmap$CoordinateSystem.length, -FastBitmap$CoordinateSystem.getMin, this.mZoomMatrixBuffer);
        this.mViewPortHandler.getMin(this.mZoomMatrixBuffer, (View) this, false);
        setArguments.setMin(FastBitmap$CoordinateSystem);
        calculateOffsets();
        postInvalidate();
    }

    public void zoomOut() {
        setArguments FastBitmap$CoordinateSystem = this.mViewPortHandler.FastBitmap$CoordinateSystem();
        this.mViewPortHandler.length(FastBitmap$CoordinateSystem.length, -FastBitmap$CoordinateSystem.getMin, this.mZoomMatrixBuffer);
        this.mViewPortHandler.getMin(this.mZoomMatrixBuffer, (View) this, false);
        setArguments.setMin(FastBitmap$CoordinateSystem);
        calculateOffsets();
        postInvalidate();
    }

    public void resetZoom() {
        this.mViewPortHandler.length(this.mZoomMatrixBuffer);
        this.mViewPortHandler.getMin(this.mZoomMatrixBuffer, (View) this, false);
        calculateOffsets();
        postInvalidate();
    }

    public void zoom(float f, float f2, float f3, float f4) {
        this.mViewPortHandler.length(f, f2, f3, -f4, this.mZoomMatrixBuffer);
        this.mViewPortHandler.getMin(this.mZoomMatrixBuffer, (View) this, false);
        calculateOffsets();
        postInvalidate();
    }

    public void zoom(float f, float f2, float f3, float f4, YAxis.AxisDependency axisDependency) {
        addViewportJob(EmojiTextView.getMax(this.mViewPortHandler, f, f2, f3, f4, getTransformer(axisDependency), axisDependency, this));
    }

    public void zoomToCenter(float f, float f2) {
        setArguments centerOffsets = getCenterOffsets();
        Matrix matrix = this.mZoomMatrixBuffer;
        this.mViewPortHandler.length(f, f2, centerOffsets.length, -centerOffsets.getMin, matrix);
        this.mViewPortHandler.getMin(matrix, (View) this, false);
    }

    @TargetApi(11)
    public void zoomAndCenterAnimated(float f, float f2, float f3, float f4, YAxis.AxisDependency axisDependency, long j) {
        YAxis.AxisDependency axisDependency2 = axisDependency;
        isStateSaved valuesByTouchPoint = getValuesByTouchPoint(this.mViewPortHandler.isInside(), this.mViewPortHandler.toIntRange(), axisDependency2);
        addViewportJob(onUpdateExtractingViews.getMax(this.mViewPortHandler, this, getTransformer(axisDependency2), getAxis(axisDependency2), this.mXAxis.extraCallbackWithResult, f, f2, this.mViewPortHandler.getMin, this.mViewPortHandler.IsOverlapping, j));
        isStateSaved.getMax(valuesByTouchPoint);
    }

    public void fitScreen() {
        Matrix matrix = this.mFitScreenMatrixBuffer;
        this.mViewPortHandler.setMin(matrix);
        this.mViewPortHandler.getMin(matrix, (View) this, false);
        calculateOffsets();
        postInvalidate();
    }

    public void setScaleMinima(float f, float f2) {
        this.mViewPortHandler.getMax(f);
        this.mViewPortHandler.getMin(f2);
    }

    public void setVisibleXRangeMaximum(float f) {
        this.mViewPortHandler.getMax(this.mXAxis.extraCallbackWithResult / f);
    }

    public void setVisibleXRangeMinimum(float f) {
        this.mViewPortHandler.length(this.mXAxis.extraCallbackWithResult / f);
    }

    public void setVisibleXRange(float f, float f2) {
        this.mViewPortHandler.setMin(this.mXAxis.extraCallbackWithResult / f, this.mXAxis.extraCallbackWithResult / f2);
    }

    public void setVisibleYRangeMaximum(float f, YAxis.AxisDependency axisDependency) {
        this.mViewPortHandler.getMin(getAxisRange(axisDependency) / f);
    }

    public void setVisibleYRangeMinimum(float f, YAxis.AxisDependency axisDependency) {
        this.mViewPortHandler.setMin(getAxisRange(axisDependency) / f);
    }

    public void setVisibleYRange(float f, float f2, YAxis.AxisDependency axisDependency) {
        this.mViewPortHandler.getMax(getAxisRange(axisDependency) / f, getAxisRange(axisDependency) / f2);
    }

    public void moveViewToX(float f) {
        addViewportJob(BackStackState.getMin(this.mViewPortHandler, f, 0.0f, getTransformer(YAxis.AxisDependency.LEFT), this));
    }

    public void moveViewTo(float f, float f2, YAxis.AxisDependency axisDependency) {
        addViewportJob(BackStackState.getMin(this.mViewPortHandler, f, f2 + ((getAxisRange(axisDependency) / this.mViewPortHandler.IsOverlapping) / 2.0f), getTransformer(axisDependency), this));
    }

    @TargetApi(11)
    public void moveViewToAnimated(float f, float f2, YAxis.AxisDependency axisDependency, long j) {
        YAxis.AxisDependency axisDependency2 = axisDependency;
        isStateSaved valuesByTouchPoint = getValuesByTouchPoint(this.mViewPortHandler.isInside(), this.mViewPortHandler.toIntRange(), axisDependency);
        float axisRange = getAxisRange(axisDependency) / this.mViewPortHandler.IsOverlapping;
        addViewportJob(setEmojiReplaceStrategy.setMax(this.mViewPortHandler, f, f2 + (axisRange / 2.0f), getTransformer(axisDependency), this, (float) valuesByTouchPoint.length, (float) valuesByTouchPoint.getMin, j));
        isStateSaved.getMax(valuesByTouchPoint);
    }

    public void centerViewToY(float f, YAxis.AxisDependency axisDependency) {
        addViewportJob(BackStackState.getMin(this.mViewPortHandler, 0.0f, f + ((getAxisRange(axisDependency) / this.mViewPortHandler.IsOverlapping) / 2.0f), getTransformer(axisDependency), this));
    }

    public void centerViewTo(float f, float f2, YAxis.AxisDependency axisDependency) {
        float axisRange = getAxisRange(axisDependency) / this.mViewPortHandler.IsOverlapping;
        addViewportJob(BackStackState.getMin(this.mViewPortHandler, f - ((getXAxis().extraCallbackWithResult / this.mViewPortHandler.getMin) / 2.0f), f2 + (axisRange / 2.0f), getTransformer(axisDependency), this));
    }

    @TargetApi(11)
    public void centerViewToAnimated(float f, float f2, YAxis.AxisDependency axisDependency, long j) {
        YAxis.AxisDependency axisDependency2 = axisDependency;
        isStateSaved valuesByTouchPoint = getValuesByTouchPoint(this.mViewPortHandler.isInside(), this.mViewPortHandler.toIntRange(), axisDependency);
        float axisRange = getAxisRange(axisDependency) / this.mViewPortHandler.IsOverlapping;
        float f3 = getXAxis().extraCallbackWithResult / this.mViewPortHandler.getMin;
        addViewportJob(setEmojiReplaceStrategy.setMax(this.mViewPortHandler, f - (f3 / 2.0f), f2 + (axisRange / 2.0f), getTransformer(axisDependency), this, (float) valuesByTouchPoint.length, (float) valuesByTouchPoint.getMin, j));
        isStateSaved.getMax(valuesByTouchPoint);
    }

    public void setViewPortOffsets(float f, float f2, float f3, float f4) {
        this.equals = true;
        final float f5 = f;
        final float f6 = f2;
        final float f7 = f3;
        final float f8 = f4;
        post(new Runnable() {
            public final void run() {
                BarLineChartBase.this.mViewPortHandler.getMin(f5, f6, f7, f8);
                BarLineChartBase.this.prepareOffsetMatrix();
                BarLineChartBase.this.prepareValuePxMatrix();
            }
        });
    }

    public void resetViewPortOffsets() {
        this.equals = false;
        calculateOffsets();
    }

    /* access modifiers changed from: protected */
    public float getAxisRange(YAxis.AxisDependency axisDependency) {
        if (axisDependency == YAxis.AxisDependency.LEFT) {
            return this.mAxisLeft.extraCallbackWithResult;
        }
        return this.mAxisRight.extraCallbackWithResult;
    }

    public void setOnDrawListener(dismissAllowingStateLoss dismissallowingstateloss) {
        this.mDrawListener = dismissallowingstateloss;
    }

    public dismissAllowingStateLoss getDrawListener() {
        return this.mDrawListener;
    }

    public setArguments getPosition(Entry entry, YAxis.AxisDependency axisDependency) {
        if (entry == null) {
            return null;
        }
        this.mGetPositionBuffer[0] = entry.length();
        this.mGetPositionBuffer[1] = entry.getMin();
        getTransformer(axisDependency).length(this.mGetPositionBuffer);
        float[] fArr = this.mGetPositionBuffer;
        return setArguments.getMax(fArr[0], fArr[1]);
    }

    public void setMaxVisibleValueCount(int i) {
        this.mMaxVisibleCount = i;
    }

    public int getMaxVisibleCount() {
        return this.mMaxVisibleCount;
    }

    public void setHighlightPerDragEnabled(boolean z) {
        this.mHighlightPerDragEnabled = z;
    }

    public boolean isHighlightPerDragEnabled() {
        return this.mHighlightPerDragEnabled;
    }

    public void setGridBackgroundColor(int i) {
        this.mGridBackgroundPaint.setColor(i);
    }

    public void setDragEnabled(boolean z) {
        this.setMin = z;
        this.getMax = z;
    }

    public boolean isDragEnabled() {
        return this.setMin || this.getMax;
    }

    public void setDragXEnabled(boolean z) {
        this.setMin = z;
    }

    public boolean isDragXEnabled() {
        return this.setMin;
    }

    public void setDragYEnabled(boolean z) {
        this.getMax = z;
    }

    public boolean isDragYEnabled() {
        return this.getMax;
    }

    public void setScaleEnabled(boolean z) {
        this.getMin = z;
        this.setMax = z;
    }

    public void setScaleXEnabled(boolean z) {
        this.getMin = z;
    }

    public void setScaleYEnabled(boolean z) {
        this.setMax = z;
    }

    public boolean isScaleXEnabled() {
        return this.getMin;
    }

    public boolean isScaleYEnabled() {
        return this.setMax;
    }

    public void setDoubleTapToZoomEnabled(boolean z) {
        this.mDoubleTapToZoomEnabled = z;
    }

    public boolean isDoubleTapToZoomEnabled() {
        return this.mDoubleTapToZoomEnabled;
    }

    public void setDrawGridBackground(boolean z) {
        this.mDrawGridBackground = z;
    }

    public void setDrawBorders(boolean z) {
        this.mDrawBorders = z;
    }

    public boolean isDrawBordersEnabled() {
        return this.mDrawBorders;
    }

    public void setClipValuesToContent(boolean z) {
        this.mClipValuesToContent = z;
    }

    public boolean isClipValuesToContentEnabled() {
        return this.mClipValuesToContent;
    }

    public void setBorderWidth(float f) {
        this.mBorderPaint.setStrokeWidth(getTargetFragment.setMax(f));
    }

    public void setBorderColor(int i) {
        this.mBorderPaint.setColor(i);
    }

    public float getMinOffset() {
        return this.mMinOffset;
    }

    public void setMinOffset(float f) {
        this.mMinOffset = f;
    }

    public boolean isKeepPositionOnRotation() {
        return this.mKeepPositionOnRotation;
    }

    public void setKeepPositionOnRotation(boolean z) {
        this.mKeepPositionOnRotation = z;
    }

    public isStateSaved getValuesByTouchPoint(float f, float f2, YAxis.AxisDependency axisDependency) {
        isStateSaved min = isStateSaved.getMin(0.0d, 0.0d);
        getValuesByTouchPoint(f, f2, axisDependency, min);
        return min;
    }

    public void getValuesByTouchPoint(float f, float f2, YAxis.AxisDependency axisDependency, isStateSaved isstatesaved) {
        getTransformer(axisDependency).length(f, f2, isstatesaved);
    }

    public isStateSaved getPixelForValues(float f, float f2, YAxis.AxisDependency axisDependency) {
        return getTransformer(axisDependency).getMax(f, f2);
    }

    public Entry getEntryByTouchPoint(float f, float f2) {
        addFocusables highlightByTouchPoint = getHighlightByTouchPoint(f, f2);
        if (highlightByTouchPoint != null) {
            return ((dispatchOnDrawerClosed) this.mData).setMax(highlightByTouchPoint);
        }
        return null;
    }

    public EmojiAppCompatButton getDataSetByTouchPoint(float f, float f2) {
        addFocusables highlightByTouchPoint = getHighlightByTouchPoint(f, f2);
        if (highlightByTouchPoint != null) {
            return (EmojiAppCompatButton) ((dispatchOnDrawerClosed) this.mData).setMin(highlightByTouchPoint.equals);
        }
        return null;
    }

    public float getLowestVisibleX() {
        getTransformer(YAxis.AxisDependency.LEFT).length(this.mViewPortHandler.isInside(), this.mViewPortHandler.toFloatRange(), this.posForGetLowestVisibleX);
        return (float) Math.max((double) this.mXAxis.onPostMessage, this.posForGetLowestVisibleX.length);
    }

    public float getHighestVisibleX() {
        getTransformer(YAxis.AxisDependency.LEFT).length(this.mViewPortHandler.equals(), this.mViewPortHandler.toFloatRange(), this.posForGetHighestVisibleX);
        return (float) Math.min((double) this.mXAxis.onMessageChannelReady, this.posForGetHighestVisibleX.length);
    }

    public float getVisibleXRange() {
        return Math.abs(getHighestVisibleX() - getLowestVisibleX());
    }

    public float getScaleX() {
        if (this.mViewPortHandler == null) {
            return 1.0f;
        }
        return this.mViewPortHandler.getMin;
    }

    public float getScaleY() {
        if (this.mViewPortHandler == null) {
            return 1.0f;
        }
        return this.mViewPortHandler.IsOverlapping;
    }

    public boolean isFullyZoomedOut() {
        return this.mViewPortHandler.invokeSuspend();
    }

    public YAxis getAxisLeft() {
        return this.mAxisLeft;
    }

    public YAxis getAxisRight() {
        return this.mAxisRight;
    }

    public YAxis getAxis(YAxis.AxisDependency axisDependency) {
        if (axisDependency == YAxis.AxisDependency.LEFT) {
            return this.mAxisLeft;
        }
        return this.mAxisRight;
    }

    public boolean isInverted(YAxis.AxisDependency axisDependency) {
        return getAxis(axisDependency).extraCallbackWithResult();
    }

    public void setPinchZoom(boolean z) {
        this.mPinchZoomEnabled = z;
    }

    public boolean isPinchZoomEnabled() {
        return this.mPinchZoomEnabled;
    }

    public void setDragOffsetX(float f) {
        this.mViewPortHandler.isInside = getTargetFragment.setMax(f);
    }

    public void setDragOffsetY(float f) {
        this.mViewPortHandler.toFloatRange = getTargetFragment.setMax(f);
    }

    public boolean hasNoDragOffset() {
        return this.mViewPortHandler.onNavigationEvent();
    }

    public getViewLifecycleOwner getRendererXAxis() {
        return this.mXAxisRenderer;
    }

    public void setXAxisRenderer(getViewLifecycleOwner getviewlifecycleowner) {
        this.mXAxisRenderer = getviewlifecycleowner;
    }

    public restoreViewState getRendererLeftYAxis() {
        return this.mAxisRendererLeft;
    }

    public void setRendererLeftYAxis(restoreViewState restoreviewstate) {
        this.mAxisRendererLeft = restoreviewstate;
    }

    public restoreViewState getRendererRightYAxis() {
        return this.mAxisRendererRight;
    }

    public void setRendererRightYAxis(restoreViewState restoreviewstate) {
        this.mAxisRendererRight = restoreviewstate;
    }

    public float getYChartMax() {
        return Math.max(this.mAxisLeft.onMessageChannelReady, this.mAxisRight.onMessageChannelReady);
    }

    public float getYChartMin() {
        return Math.min(this.mAxisLeft.onPostMessage, this.mAxisRight.onPostMessage);
    }

    public boolean isAnyAxisInverted() {
        if (!this.mAxisLeft.extraCallbackWithResult() && !this.mAxisRight.extraCallbackWithResult()) {
            return false;
        }
        return true;
    }

    public void setAutoScaleMinMaxEnabled(boolean z) {
        this.mAutoScaleMinMaxEnabled = z;
    }

    public boolean isAutoScaleMinMaxEnabled() {
        return this.mAutoScaleMinMaxEnabled;
    }

    public void setPaint(Paint paint, int i) {
        super.setPaint(paint, i);
        if (i == 4) {
            this.mGridBackgroundPaint = paint;
        }
    }

    public Paint getPaint(int i) {
        Paint paint = super.getPaint(i);
        if (paint != null) {
            return paint;
        }
        if (i != 4) {
            return null;
        }
        return this.mGridBackgroundPaint;
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        float[] fArr = this.mOnSizeChangedBuffer;
        fArr[1] = 0.0f;
        fArr[0] = 0.0f;
        if (this.mKeepPositionOnRotation) {
            fArr[0] = this.mViewPortHandler.isInside();
            this.mOnSizeChangedBuffer[1] = this.mViewPortHandler.toIntRange();
            getTransformer(YAxis.AxisDependency.LEFT).setMax(this.mOnSizeChangedBuffer);
        }
        super.onSizeChanged(i, i2, i3, i4);
        if (this.mKeepPositionOnRotation) {
            getTransformer(YAxis.AxisDependency.LEFT).length(this.mOnSizeChangedBuffer);
            this.mViewPortHandler.getMin(this.mOnSizeChangedBuffer, this);
            return;
        }
        this.mViewPortHandler.getMin(this.mViewPortHandler.Mean$Arithmetic(), (View) this, true);
    }
}
