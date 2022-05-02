package com.github.mikephil.charting.charts;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.ContentValues;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Environment;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.RequiresApi;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.listener.ChartTouchListener;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import o.DrawerLayout;
import o.EmojiAppCompatTextView;
import o.addFocusables;
import o.checkDrawerViewAbsoluteGravity;
import o.closeDrawers;
import o.createFragmentContainer;
import o.findVisibleDrawer;
import o.getTargetFragment;
import o.onAttach;
import o.openDrawer;
import o.removeDrawerListener;
import o.setArguments;
import o.setDrawerLockMode;
import o.setDrawerShadow;
import o.setScrimColor;
import o.setStyle;
import o.setTargetFragment;
import o.setValue;
import o.showNow;

public abstract class Chart<T extends checkDrawerViewAbsoluteGravity<? extends EmojiAppCompatTextView<? extends Entry>>> extends ViewGroup implements setValue {
    public static final String LOG_TAG = "MPAndroidChart";
    public static final int PAINT_CENTER_TEXT = 14;
    public static final int PAINT_DESCRIPTION = 11;
    public static final int PAINT_GRID_BACKGROUND = 4;
    public static final int PAINT_HOLE = 13;
    public static final int PAINT_INFO = 7;
    public static final int PAINT_LEGEND_LABEL = 18;
    private boolean IsOverlapping = false;
    private float equals = 0.0f;
    private String getMax = "No chart data available.";
    private float getMin = 0.9f;
    private boolean isInside = false;
    private setStyle length;
    protected setDrawerShadow mAnimator;
    protected ChartTouchListener mChartTouchListener;
    protected T mData = null;
    protected openDrawer mDefaultValueFormatter = new openDrawer(0);
    protected Paint mDescPaint;
    protected setDrawerLockMode mDescription;
    protected boolean mDrawMarkers = true;
    protected boolean mHighLightPerTapEnabled = true;
    protected DrawerLayout.SavedState mHighlighter;
    protected addFocusables[] mIndicesToHighlight;
    protected Paint mInfoPaint;
    protected ArrayList<Runnable> mJobs = new ArrayList<>();
    protected Legend mLegend;
    protected onAttach mLegendRenderer;
    protected boolean mLogEnabled = false;
    protected removeDrawerListener mMarker;
    protected float mMaxHighlightDistance = 0.0f;
    protected createFragmentContainer mRenderer;
    protected showNow mSelectionListener;
    protected boolean mTouchEnabled = true;
    protected setTargetFragment mViewPortHandler = new setTargetFragment();
    protected XAxis mXAxis;
    private boolean setMax = true;
    private float setMin = 0.0f;
    private float toFloatRange = 0.0f;
    private float toIntRange = 0.0f;

    /* access modifiers changed from: protected */
    public abstract void calcMinMax();

    /* access modifiers changed from: protected */
    public abstract void calculateOffsets();

    public abstract void notifyDataSetChanged();

    public Chart(Context context) {
        super(context);
        init();
    }

    public Chart(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    public Chart(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init();
    }

    /* access modifiers changed from: protected */
    public void init() {
        setWillNotDraw(false);
        this.mAnimator = new setDrawerShadow(new ValueAnimator.AnimatorUpdateListener() {
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                Chart.this.postInvalidate();
            }
        });
        getTargetFragment.length(getContext());
        this.mMaxHighlightDistance = getTargetFragment.setMax(500.0f);
        this.mDescription = new setDrawerLockMode();
        Legend legend = new Legend();
        this.mLegend = legend;
        this.mLegendRenderer = new onAttach(this.mViewPortHandler, legend);
        this.mXAxis = new XAxis();
        this.mDescPaint = new Paint(1);
        Paint paint = new Paint(1);
        this.mInfoPaint = paint;
        paint.setColor(Color.rgb(247, 189, 51));
        this.mInfoPaint.setTextAlign(Paint.Align.CENTER);
        this.mInfoPaint.setTextSize(getTargetFragment.setMax(12.0f));
    }

    public void setData(T t) {
        this.mData = t;
        this.IsOverlapping = false;
        if (t != null) {
            setupDefaultFormatter(t.setMax(), t.getMin());
            for (EmojiAppCompatTextView emojiAppCompatTextView : this.mData.toIntRange()) {
                if (emojiAppCompatTextView.equals() || emojiAppCompatTextView.toFloatRange() == this.mDefaultValueFormatter) {
                    emojiAppCompatTextView.setMax((closeDrawers) this.mDefaultValueFormatter);
                }
            }
            notifyDataSetChanged();
        }
    }

    public void clear() {
        this.mData = null;
        this.IsOverlapping = false;
        this.mIndicesToHighlight = null;
        this.mChartTouchListener.getMin((addFocusables) null);
        invalidate();
    }

    public void clearValues() {
        this.mData.IsOverlapping();
        invalidate();
    }

    public boolean isEmpty() {
        T t = this.mData;
        if (t != null && t.isInside() > 0) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public void setupDefaultFormatter(float f, float f2) {
        float f3;
        T t = this.mData;
        if (t == null || t.isInside() < 2) {
            f3 = Math.max(Math.abs(f), Math.abs(f2));
        } else {
            f3 = Math.abs(f2 - f);
        }
        this.mDefaultValueFormatter.setMax(getTargetFragment.length(f3));
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        if (this.mData == null) {
            if (!TextUtils.isEmpty(this.getMax)) {
                setArguments center = getCenter();
                canvas.drawText(this.getMax, center.length, center.getMin, this.mInfoPaint);
            }
        } else if (!this.IsOverlapping) {
            calculateOffsets();
            this.IsOverlapping = true;
        }
    }

    /* access modifiers changed from: protected */
    public void drawDescription(Canvas canvas) {
        float f;
        float f2;
        setDrawerLockMode setdrawerlockmode = this.mDescription;
        if (setdrawerlockmode != null && setdrawerlockmode.create()) {
            setArguments setarguments = this.mDescription.getMin;
            this.mDescPaint.setTypeface(this.mDescription.getCause());
            this.mDescPaint.setTextSize(this.mDescription.onNavigationEvent());
            this.mDescPaint.setColor(this.mDescription.ICustomTabsCallback());
            this.mDescPaint.setTextAlign(this.mDescription.setMin);
            if (setarguments == null) {
                f2 = (((float) getWidth()) - this.mViewPortHandler.length()) - this.mDescription.invokeSuspend();
                f = (((float) getHeight()) - this.mViewPortHandler.getMin()) - this.mDescription.Mean$Arithmetic();
            } else {
                float f3 = setarguments.length;
                f = setarguments.getMin;
                f2 = f3;
            }
            canvas.drawText(this.mDescription.getMax, f2, f, this.mDescPaint);
        }
    }

    public float getMaxHighlightDistance() {
        return this.mMaxHighlightDistance;
    }

    public void setMaxHighlightDistance(float f) {
        this.mMaxHighlightDistance = getTargetFragment.setMax(f);
    }

    public addFocusables[] getHighlighted() {
        return this.mIndicesToHighlight;
    }

    public boolean isHighlightPerTapEnabled() {
        return this.mHighLightPerTapEnabled;
    }

    public void setHighlightPerTapEnabled(boolean z) {
        this.mHighLightPerTapEnabled = z;
    }

    public boolean valuesToHighlight() {
        addFocusables[] addfocusablesArr = this.mIndicesToHighlight;
        return (addfocusablesArr == null || addfocusablesArr.length <= 0 || addfocusablesArr[0] == null) ? false : true;
    }

    /* access modifiers changed from: protected */
    public void setLastHighlighted(addFocusables[] addfocusablesArr) {
        if (addfocusablesArr == null || addfocusablesArr.length <= 0 || addfocusablesArr[0] == null) {
            this.mChartTouchListener.getMin((addFocusables) null);
        } else {
            this.mChartTouchListener.getMin(addfocusablesArr[0]);
        }
    }

    public void highlightValues(addFocusables[] addfocusablesArr) {
        this.mIndicesToHighlight = addfocusablesArr;
        setLastHighlighted(addfocusablesArr);
        invalidate();
    }

    public void highlightValue(float f, int i) {
        highlightValue(f, i, true);
    }

    public void highlightValue(float f, float f2, int i) {
        highlightValue(f, f2, i, true);
    }

    public void highlightValue(float f, int i, boolean z) {
        highlightValue(f, Float.NaN, i, z);
    }

    public void highlightValue(float f, float f2, int i, boolean z) {
        if (i < 0 || i >= this.mData.setMin()) {
            highlightValue((addFocusables) null, z);
        } else {
            highlightValue(new addFocusables(f, f2, i), z);
        }
    }

    public void highlightValue(addFocusables addfocusables) {
        highlightValue(addfocusables, false);
    }

    public void highlightValue(addFocusables addfocusables, boolean z) {
        Entry entry = null;
        if (addfocusables == null) {
            this.mIndicesToHighlight = null;
        } else {
            Entry max = this.mData.setMax(addfocusables);
            if (max == null) {
                this.mIndicesToHighlight = null;
            } else {
                this.mIndicesToHighlight = new addFocusables[]{addfocusables};
            }
            entry = max;
        }
        setLastHighlighted(this.mIndicesToHighlight);
        if (z && this.mSelectionListener != null && valuesToHighlight()) {
            this.mSelectionListener.getMin(entry);
        }
        invalidate();
    }

    public addFocusables getHighlightByTouchPoint(float f, float f2) {
        if (this.mData == null) {
            return null;
        }
        return getHighlighter().setMax(f, f2);
    }

    public void setOnTouchListener(ChartTouchListener chartTouchListener) {
        this.mChartTouchListener = chartTouchListener;
    }

    public ChartTouchListener getOnTouchListener() {
        return this.mChartTouchListener;
    }

    /* access modifiers changed from: protected */
    public void drawMarkers(Canvas canvas) {
        if (this.mMarker != null && isDrawMarkersEnabled() && valuesToHighlight()) {
            int i = 0;
            while (true) {
                addFocusables[] addfocusablesArr = this.mIndicesToHighlight;
                if (i < addfocusablesArr.length) {
                    addFocusables addfocusables = addfocusablesArr[i];
                    EmojiAppCompatTextView min = this.mData.setMin(addfocusables.equals);
                    Entry max = this.mData.setMax(this.mIndicesToHighlight[i]);
                    int min2 = min.getMin(max);
                    if (max != null && ((float) min2) <= ((float) min.ICustomTabsCallback()) * this.mAnimator.getMin()) {
                        float[] markerPosition = getMarkerPosition(addfocusables);
                        if (this.mViewPortHandler.setMax(markerPosition[0], markerPosition[1])) {
                            this.mMarker.refreshContent(max, addfocusables);
                            this.mMarker.draw(canvas, markerPosition[0], markerPosition[1]);
                        }
                    }
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    public setDrawerShadow getAnimator() {
        return this.mAnimator;
    }

    public boolean isDragDecelerationEnabled() {
        return this.setMax;
    }

    public void setDragDecelerationEnabled(boolean z) {
        this.setMax = z;
    }

    public float getDragDecelerationFrictionCoef() {
        return this.getMin;
    }

    public void setDragDecelerationFrictionCoef(float f) {
        if (f < 0.0f) {
            f = 0.0f;
        }
        if (f >= 1.0f) {
            f = 0.999f;
        }
        this.getMin = f;
    }

    @RequiresApi(11)
    public void animateXY(int i, int i2, setScrimColor.setMin setmin, setScrimColor.setMin setmin2) {
        this.mAnimator.getMax(i, i2, setmin, setmin2);
    }

    @RequiresApi(11)
    public void animateXY(int i, int i2, setScrimColor.setMin setmin) {
        setDrawerShadow setdrawershadow = this.mAnimator;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(setdrawershadow, "phaseX", new float[]{0.0f, 1.0f});
        ofFloat.setInterpolator(setmin);
        ofFloat.setDuration((long) i);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(setdrawershadow, "phaseY", new float[]{0.0f, 1.0f});
        ofFloat2.setInterpolator(setmin);
        ofFloat2.setDuration((long) i2);
        if (i > i2) {
            ofFloat.addUpdateListener(setdrawershadow.setMax);
        } else {
            ofFloat2.addUpdateListener(setdrawershadow.setMax);
        }
        ofFloat.start();
        ofFloat2.start();
    }

    @RequiresApi(11)
    public void animateX(int i, setScrimColor.setMin setmin) {
        this.mAnimator.getMin(i, setmin);
    }

    @RequiresApi(11)
    public void animateY(int i, setScrimColor.setMin setmin) {
        this.mAnimator.getMax(i, setmin);
    }

    @RequiresApi(11)
    public void animateX(int i) {
        this.mAnimator.getMin(i, setScrimColor.getMax);
    }

    @RequiresApi(11)
    public void animateY(int i) {
        this.mAnimator.getMax(i, setScrimColor.getMax);
    }

    @RequiresApi(11)
    public void animateXY(int i, int i2) {
        setDrawerShadow setdrawershadow = this.mAnimator;
        setScrimColor.setMin setmin = setScrimColor.getMax;
        setdrawershadow.getMax(i, i2, setmin, setmin);
    }

    public XAxis getXAxis() {
        return this.mXAxis;
    }

    public closeDrawers getDefaultValueFormatter() {
        return this.mDefaultValueFormatter;
    }

    public void setOnChartValueSelectedListener(showNow shownow) {
        this.mSelectionListener = shownow;
    }

    public void setOnChartGestureListener(setStyle setstyle) {
        this.length = setstyle;
    }

    public setStyle getOnChartGestureListener() {
        return this.length;
    }

    public float getYMax() {
        return this.mData.getMin();
    }

    public float getYMin() {
        return this.mData.setMax();
    }

    public float getXChartMax() {
        return this.mXAxis.onMessageChannelReady;
    }

    public float getXChartMin() {
        return this.mXAxis.onPostMessage;
    }

    public float getXRange() {
        return this.mXAxis.extraCallbackWithResult;
    }

    public setArguments getCenter() {
        return setArguments.getMax(((float) getWidth()) / 2.0f, ((float) getHeight()) / 2.0f);
    }

    public setArguments getCenterOffsets() {
        return this.mViewPortHandler.FastBitmap$CoordinateSystem();
    }

    public void setExtraOffsets(float f, float f2, float f3, float f4) {
        setExtraLeftOffset(f);
        setExtraTopOffset(f2);
        setExtraRightOffset(f3);
        setExtraBottomOffset(f4);
    }

    public void setExtraTopOffset(float f) {
        this.setMin = getTargetFragment.setMax(f);
    }

    public float getExtraTopOffset() {
        return this.setMin;
    }

    public void setExtraRightOffset(float f) {
        this.toFloatRange = getTargetFragment.setMax(f);
    }

    public float getExtraRightOffset() {
        return this.toFloatRange;
    }

    public void setExtraBottomOffset(float f) {
        this.equals = getTargetFragment.setMax(f);
    }

    public float getExtraBottomOffset() {
        return this.equals;
    }

    public void setExtraLeftOffset(float f) {
        this.toIntRange = getTargetFragment.setMax(f);
    }

    public float getExtraLeftOffset() {
        return this.toIntRange;
    }

    public void setLogEnabled(boolean z) {
        this.mLogEnabled = z;
    }

    public boolean isLogEnabled() {
        return this.mLogEnabled;
    }

    public void setNoDataText(String str) {
        this.getMax = str;
    }

    public void setNoDataTextColor(int i) {
        this.mInfoPaint.setColor(i);
    }

    public void setNoDataTextTypeface(Typeface typeface) {
        this.mInfoPaint.setTypeface(typeface);
    }

    public void setTouchEnabled(boolean z) {
        this.mTouchEnabled = z;
    }

    public void setMarker(removeDrawerListener removedrawerlistener) {
        this.mMarker = removedrawerlistener;
    }

    public removeDrawerListener getMarker() {
        return this.mMarker;
    }

    @Deprecated
    public void setMarkerView(removeDrawerListener removedrawerlistener) {
        setMarker(removedrawerlistener);
    }

    @Deprecated
    public removeDrawerListener getMarkerView() {
        return getMarker();
    }

    public void setDescription(setDrawerLockMode setdrawerlockmode) {
        this.mDescription = setdrawerlockmode;
    }

    public setDrawerLockMode getDescription() {
        return this.mDescription;
    }

    public Legend getLegend() {
        return this.mLegend;
    }

    public onAttach getLegendRenderer() {
        return this.mLegendRenderer;
    }

    public RectF getContentRect() {
        return this.mViewPortHandler.toDoubleRange();
    }

    public void disableScroll() {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
    }

    public void enableScroll() {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
    }

    public void setPaint(Paint paint, int i) {
        if (i == 7) {
            this.mInfoPaint = paint;
        } else if (i == 11) {
            this.mDescPaint = paint;
        }
    }

    public Paint getPaint(int i) {
        if (i == 7) {
            return this.mInfoPaint;
        }
        if (i != 11) {
            return null;
        }
        return this.mDescPaint;
    }

    @Deprecated
    public boolean isDrawMarkerViewsEnabled() {
        return isDrawMarkersEnabled();
    }

    @Deprecated
    public void setDrawMarkerViews(boolean z) {
        setDrawMarkers(z);
    }

    public boolean isDrawMarkersEnabled() {
        return this.mDrawMarkers;
    }

    public void setDrawMarkers(boolean z) {
        this.mDrawMarkers = z;
    }

    public T getData() {
        return this.mData;
    }

    public setTargetFragment getViewPortHandler() {
        return this.mViewPortHandler;
    }

    public createFragmentContainer getRenderer() {
        return this.mRenderer;
    }

    public void setRenderer(createFragmentContainer createfragmentcontainer) {
        if (createfragmentcontainer != null) {
            this.mRenderer = createfragmentcontainer;
        }
    }

    public DrawerLayout.SavedState getHighlighter() {
        return this.mHighlighter;
    }

    public void setHighlighter(findVisibleDrawer findvisibledrawer) {
        this.mHighlighter = findvisibledrawer;
    }

    public setArguments getCenterOfView() {
        return getCenter();
    }

    public Bitmap getChartBitmap() {
        Bitmap createBitmap = Bitmap.createBitmap(getWidth(), getHeight(), Bitmap.Config.RGB_565);
        Canvas canvas = new Canvas(createBitmap);
        Drawable background = getBackground();
        if (background != null) {
            background.draw(canvas);
        } else {
            canvas.drawColor(-1);
        }
        draw(canvas);
        return createBitmap;
    }

    public boolean saveToPath(String str, String str2) {
        Bitmap chartBitmap = getChartBitmap();
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(Environment.getExternalStorageDirectory().getPath());
            sb.append(str2);
            sb.append("/");
            sb.append(str);
            sb.append(".png");
            FileOutputStream fileOutputStream = new FileOutputStream(sb.toString());
            chartBitmap.compress(Bitmap.CompressFormat.PNG, 40, fileOutputStream);
            fileOutputStream.close();
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public boolean saveToGallery(String str, String str2, String str3, Bitmap.CompressFormat compressFormat, int i) {
        if (i < 0 || i > 100) {
            i = 50;
        }
        long currentTimeMillis = System.currentTimeMillis();
        File externalStorageDirectory = Environment.getExternalStorageDirectory();
        StringBuilder sb = new StringBuilder();
        sb.append(externalStorageDirectory.getAbsolutePath());
        sb.append("/DCIM/");
        sb.append(str2);
        File file = new File(sb.toString());
        if (!file.exists() && !file.mkdirs()) {
            return false;
        }
        int i2 = AnonymousClass2.setMax[compressFormat.ordinal()];
        String str4 = "image/png";
        if (i2 != 1) {
            if (i2 != 2) {
                if (!str.endsWith(".jpg") && !str.endsWith(".jpeg")) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(str);
                    sb2.append(".jpg");
                    str = sb2.toString();
                }
                str4 = "image/jpeg";
            } else {
                if (!str.endsWith(".webp")) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(str);
                    sb3.append(".webp");
                    str = sb3.toString();
                }
                str4 = "image/webp";
            }
        } else if (!str.endsWith(".png")) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(str);
            sb4.append(".png");
            str = sb4.toString();
        }
        StringBuilder sb5 = new StringBuilder();
        sb5.append(file.getAbsolutePath());
        sb5.append("/");
        sb5.append(str);
        String obj = sb5.toString();
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(obj);
            getChartBitmap().compress(compressFormat, i, fileOutputStream);
            fileOutputStream.flush();
            fileOutputStream.close();
            long length2 = new File(obj).length();
            ContentValues contentValues = new ContentValues(8);
            contentValues.put("title", str);
            contentValues.put("_display_name", str);
            contentValues.put("date_added", Long.valueOf(currentTimeMillis));
            contentValues.put("mime_type", str4);
            contentValues.put("description", str3);
            contentValues.put("orientation", 0);
            contentValues.put("_data", obj);
            contentValues.put("_size", Long.valueOf(length2));
            if (getContext().getContentResolver().insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues) != null) {
                return true;
            }
            return false;
        } catch (IOException unused) {
        }
    }

    /* renamed from: com.github.mikephil.charting.charts.Chart$2  reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] setMax;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                android.graphics.Bitmap$CompressFormat[] r0 = android.graphics.Bitmap.CompressFormat.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                setMax = r0
                android.graphics.Bitmap$CompressFormat r1 = android.graphics.Bitmap.CompressFormat.PNG     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = setMax     // Catch:{ NoSuchFieldError -> 0x001d }
                android.graphics.Bitmap$CompressFormat r1 = android.graphics.Bitmap.CompressFormat.WEBP     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = setMax     // Catch:{ NoSuchFieldError -> 0x0028 }
                android.graphics.Bitmap$CompressFormat r1 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.github.mikephil.charting.charts.Chart.AnonymousClass2.<clinit>():void");
        }
    }

    public boolean saveToGallery(String str, int i) {
        return saveToGallery(str, "", "MPAndroidChart-Library Save", Bitmap.CompressFormat.PNG, i);
    }

    public boolean saveToGallery(String str) {
        return saveToGallery(str, "", "MPAndroidChart-Library Save", Bitmap.CompressFormat.PNG, 40);
    }

    public void removeViewportJob(Runnable runnable) {
        this.mJobs.remove(runnable);
    }

    public void clearAllViewportJobs() {
        this.mJobs.clear();
    }

    public void addViewportJob(Runnable runnable) {
        if (this.mViewPortHandler.getMax()) {
            post(runnable);
        } else {
            this.mJobs.add(runnable);
        }
    }

    public ArrayList<Runnable> getJobs() {
        return this.mJobs;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        for (int i5 = 0; i5 < getChildCount(); i5++) {
            getChildAt(i5).layout(i, i2, i3, i4);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int max = (int) getTargetFragment.setMax(50.0f);
        setMeasuredDimension(Math.max(getSuggestedMinimumWidth(), resolveSize(max, i)), Math.max(getSuggestedMinimumHeight(), resolveSize(max, i2)));
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        if (i > 0 && i2 > 0 && i < 10000 && i2 < 10000) {
            this.mViewPortHandler.length((float) i, (float) i2);
        }
        notifyDataSetChanged();
        Iterator<Runnable> it = this.mJobs.iterator();
        while (it.hasNext()) {
            post(it.next());
        }
        this.mJobs.clear();
        super.onSizeChanged(i, i2, i3, i4);
    }

    public void setHardwareAccelerationEnabled(boolean z) {
        if (z) {
            setLayerType(2, (Paint) null);
        } else {
            setLayerType(1, (Paint) null);
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.isInside) {
            length(this);
        }
    }

    private void length(View view) {
        if (view.getBackground() != null) {
            view.getBackground().setCallback((Drawable.Callback) null);
        }
        if (view instanceof ViewGroup) {
            int i = 0;
            while (true) {
                ViewGroup viewGroup = (ViewGroup) view;
                if (i < viewGroup.getChildCount()) {
                    length(viewGroup.getChildAt(i));
                    i++;
                } else {
                    viewGroup.removeAllViews();
                    return;
                }
            }
        }
    }

    public void setUnbindEnabled(boolean z) {
        this.isInside = z;
    }

    /* access modifiers changed from: protected */
    public float[] getMarkerPosition(addFocusables addfocusables) {
        return new float[]{addfocusables.isInside, addfocusables.IsOverlapping};
    }
}
