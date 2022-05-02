package com.alipay.mobile.verifyidentity.business.securitycommon.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.ColorInt;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimerTask;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

public class WheelView extends View {
    private static final int ACTION_CLICK = 1;
    private static final int ACTION_DRAG = 3;
    private static final int ACTION_FLING = 2;
    public static final int DIVIDER_ALPHA = 220;
    public static final int DIVIDER_COLOR = -8139290;
    public static final float DIVIDER_THICK = 2.0f;
    public static final int ITEM_OFF_SET = 3;
    private static final float ITEM_PADDING = 13.0f;
    public static final float LINE_SPACE_MULTIPLIER = 2.0f;
    private static final float SCALE_CONTENT = 0.8f;
    public static final int TEXT_COLOR_FOCUS = -16611122;
    public static final int TEXT_COLOR_NORMAL = -4473925;
    public static final int TEXT_PADDING = -1;
    public static final int TEXT_SIZE = 16;
    private static final int VELOCITY_FLING = 5;
    private float centerContentOffset;
    private DividerConfig dividerConfig;
    private int drawCenterContentStart;
    private int drawOutContentStart;
    private float firstLineY;
    private GestureDetector gestureDetector;
    private int gravity;
    /* access modifiers changed from: private */
    public MessageHandler handler;
    /* access modifiers changed from: private */
    public int initPosition;
    /* access modifiers changed from: private */
    public boolean isLoop;
    /* access modifiers changed from: private */
    public float itemHeight;
    /* access modifiers changed from: private */
    public List<WheelItem> items;
    private String label;
    private float lineSpaceMultiplier;
    private ScheduledFuture<?> mFuture;
    private int maxTextHeight;
    private int maxTextWidth;
    private int measuredHeight;
    private int measuredWidth;
    private int offset;
    /* access modifiers changed from: private */
    public OnItemSelectListener onItemSelectListener;
    /* access modifiers changed from: private */
    public OnWheelListener onWheelListener;
    private boolean onlyShowCenterLabel;
    private Paint paintCenterText;
    private Paint paintIndicator;
    private Paint paintOuterText;
    private Paint paintShadow;
    private int preCurrentIndex;
    private float previousY;
    private int radius;
    private float secondLineY;
    /* access modifiers changed from: private */
    public int selectedIndex;
    private long startTime;
    private int textColorCenter;
    private int textColorOuter;
    private int textPadding;
    private int textSize;
    private boolean textSizeAutoFit;
    private int textSkewXOffset;
    /* access modifiers changed from: private */
    public float totalScrollY;
    private Typeface typeface;
    private boolean useWeight;
    private int visibleItemCount;
    private int widthMeasureSpec;

    @Deprecated
    public static class LineConfig extends DividerConfig {
    }

    public interface OnItemSelectListener {
        void onSelected(int i);
    }

    @Deprecated
    public interface OnWheelListener {
        void onSelected(boolean z, int i, String str);
    }

    @Deprecated
    public interface OnWheelViewListener extends OnWheelListener {
    }

    public WheelView(Context context) {
        this(context, (AttributeSet) null);
    }

    public WheelView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.onlyShowCenterLabel = true;
        this.items = new ArrayList();
        this.textSkewXOffset = 0;
        this.textSize = 16;
        this.typeface = Typeface.DEFAULT;
        this.textColorOuter = -4473925;
        this.textColorCenter = -16611122;
        this.dividerConfig = new DividerConfig();
        this.lineSpaceMultiplier = 2.0f;
        this.textPadding = -1;
        this.isLoop = true;
        this.totalScrollY = 0.0f;
        this.initPosition = -1;
        this.visibleItemCount = 7;
        this.offset = 0;
        this.previousY = 0.0f;
        this.startTime = 0;
        this.gravity = 17;
        this.drawCenterContentStart = 0;
        this.drawOutContentStart = 0;
        this.useWeight = false;
        this.textSizeAutoFit = true;
        float f = getResources().getDisplayMetrics().density;
        if (f < 1.0f) {
            this.centerContentOffset = 2.4f;
        } else if (1.0f <= f && f < 2.0f) {
            this.centerContentOffset = 3.6f;
        } else if (1.0f <= f && f < 2.0f) {
            this.centerContentOffset = 4.5f;
        } else if (2.0f <= f && f < 3.0f) {
            this.centerContentOffset = 6.0f;
        } else if (f >= 3.0f) {
            this.centerContentOffset = f * 2.5f;
        }
        judgeLineSpace();
        initView(context);
    }

    public final void setVisibleItemCount(int i) {
        if (i % 2 == 0) {
            throw new IllegalArgumentException("must be odd");
        } else if (i != this.visibleItemCount) {
            this.visibleItemCount = i;
        }
    }

    public final void setCycleDisable(boolean z) {
        this.isLoop = !z;
    }

    public final void setOffset(@IntRange(from = 1, to = 5) int i) {
        if (i <= 0 || i > 5) {
            throw new IllegalArgumentException("must between 1 and 5");
        }
        int i2 = (i * 2) + 1;
        if (i % 2 != 0) {
            i--;
        }
        setVisibleItemCount(i2 + i);
    }

    public final int getSelectedIndex() {
        return this.selectedIndex;
    }

    public final void setSelectedIndex(int i) {
        List<WheelItem> list = this.items;
        if (list != null && !list.isEmpty()) {
            int size = this.items.size();
            if (i == 0 || (i > 0 && i < size && i != this.selectedIndex)) {
                this.initPosition = i;
                this.totalScrollY = 0.0f;
                this.offset = 0;
                invalidate();
            }
        }
    }

    public final void setOnItemSelectListener(OnItemSelectListener onItemSelectListener2) {
        this.onItemSelectListener = onItemSelectListener2;
    }

    @Deprecated
    public final void setOnWheelListener(OnWheelListener onWheelListener2) {
        this.onWheelListener = onWheelListener2;
    }

    public final void setItems(List<?> list) {
        this.items.clear();
        for (Object next : list) {
            if (next instanceof WheelItem) {
                this.items.add((WheelItem) next);
            } else if ((next instanceof CharSequence) || (next instanceof Number)) {
                this.items.add(new StringItem(next.toString()));
            } else {
                StringBuilder sb = new StringBuilder("please implements ");
                sb.append(WheelItem.class.getName());
                throw new IllegalArgumentException(sb.toString());
            }
        }
        remeasure();
        invalidate();
    }

    public final void setItems(List<?> list, int i) {
        int max = dispatchOnCancelled.setMax(i);
        if (i != max) {
            onCanceled oncanceled = new onCanceled(i, max, 1);
            onCancelLoad.setMax(1579913508, oncanceled);
            onCancelLoad.getMin(1579913508, oncanceled);
        }
        setItems(list);
        setSelectedIndex(i);
    }

    public final void setItems(String[] strArr) {
        setItems((List<?>) Arrays.asList(strArr));
    }

    public final void setItems(List<String> list, String str) {
        int indexOf = list.indexOf(str);
        if (indexOf == -1) {
            indexOf = 0;
        }
        setItems((List<?>) list, indexOf);
    }

    public final void setItems(String[] strArr, int i) {
        setItems((List<?>) Arrays.asList(strArr), i);
    }

    public final void setItems(String[] strArr, String str) {
        setItems((List<String>) Arrays.asList(strArr), str);
    }

    public final void setLabel(String str, boolean z) {
        this.label = str;
        this.onlyShowCenterLabel = z;
    }

    public final void setLabel(String str) {
        setLabel(str, true);
    }

    public final void setGravity(int i) {
        this.gravity = i;
    }

    public void setTextColor(@ColorInt int i, @ColorInt int i2) {
        this.textColorOuter = i;
        this.textColorCenter = i2;
        this.paintOuterText.setColor(i);
        this.paintCenterText.setColor(i2);
    }

    public void setTextColor(@ColorInt int i) {
        this.textColorOuter = i;
        this.textColorCenter = i;
        this.paintOuterText.setColor(i);
        this.paintCenterText.setColor(i);
    }

    public final void setTypeface(Typeface typeface2) {
        this.typeface = typeface2;
        this.paintOuterText.setTypeface(typeface2);
        this.paintCenterText.setTypeface(this.typeface);
    }

    public final void setTextSize(float f) {
        if (f > 0.0f) {
            int i = (int) (getContext().getResources().getDisplayMetrics().density * f);
            this.textSize = i;
            this.paintOuterText.setTextSize((float) i);
            this.paintCenterText.setTextSize((float) this.textSize);
        }
    }

    public void setTextSkewXOffset(int i) {
        int max = dispatchOnCancelled.setMax(i);
        if (i != max) {
            onCanceled oncanceled = new onCanceled(i, max, 1);
            onCancelLoad.setMax(95161585, oncanceled);
            onCancelLoad.getMin(95161585, oncanceled);
        }
        this.textSkewXOffset = i;
        if (i != 0) {
            this.paintCenterText.setTextScaleX(1.0f);
        }
    }

    public void setDividerColor(@ColorInt int i) {
        this.dividerConfig.setColor(i);
        this.paintIndicator.setColor(i);
    }

    @Deprecated
    public void setLineConfig(DividerConfig dividerConfig2) {
        setDividerConfig(dividerConfig2);
    }

    public void setDividerConfig(DividerConfig dividerConfig2) {
        if (dividerConfig2 == null) {
            this.dividerConfig.setVisible(false);
            this.dividerConfig.setShadowVisible(false);
            return;
        }
        this.dividerConfig = dividerConfig2;
        this.paintIndicator.setColor(dividerConfig2.color);
        this.paintIndicator.setStrokeWidth(dividerConfig2.thick);
        this.paintIndicator.setAlpha(dividerConfig2.alpha);
        this.paintShadow.setColor(dividerConfig2.shadowColor);
        this.paintShadow.setAlpha(dividerConfig2.shadowAlpha);
    }

    public final void setLineSpaceMultiplier(@FloatRange(from = 2.0d, to = 4.0d) float f) {
        this.lineSpaceMultiplier = f;
        judgeLineSpace();
    }

    @Deprecated
    public void setPadding(int i) {
        setTextPadding(i);
    }

    public void setTextPadding(int i) {
        this.textPadding = ConvertUtils.toPx(getContext(), (float) i);
    }

    public void setUseWeight(boolean z) {
        this.useWeight = z;
    }

    public void setTextSizeAutoFit(boolean z) {
        this.textSizeAutoFit = z;
    }

    private void judgeLineSpace() {
        float f = this.lineSpaceMultiplier;
        if (f < 1.5f) {
            this.lineSpaceMultiplier = 1.5f;
        } else if (f > 4.0f) {
            this.lineSpaceMultiplier = 4.0f;
        }
    }

    private void initView(Context context) {
        this.handler = new MessageHandler(this);
        GestureDetector gestureDetector2 = new GestureDetector(context, new GestureDetector.SimpleOnGestureListener() {
            public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                WheelView.this.scrollBy(f2);
                return true;
            }
        });
        this.gestureDetector = gestureDetector2;
        gestureDetector2.setIsLongpressEnabled(false);
        initPaints();
        initDataForIDE();
    }

    private void initPaints() {
        Paint paint = new Paint();
        this.paintOuterText = paint;
        paint.setAntiAlias(true);
        this.paintOuterText.setColor(this.textColorOuter);
        this.paintOuterText.setTypeface(this.typeface);
        this.paintOuterText.setTextSize((float) this.textSize);
        Paint paint2 = new Paint();
        this.paintCenterText = paint2;
        paint2.setAntiAlias(true);
        this.paintCenterText.setColor(Color.parseColor("#000000"));
        this.paintCenterText.setTextScaleX(1.0f);
        this.paintCenterText.setTypeface(this.typeface);
        this.paintCenterText.setTextSize((float) this.textSize);
        Paint paint3 = new Paint();
        this.paintIndicator = paint3;
        paint3.setAntiAlias(true);
        this.paintIndicator.setColor(this.dividerConfig.color);
        this.paintIndicator.setStrokeWidth(this.dividerConfig.thick);
        this.paintIndicator.setAlpha(this.dividerConfig.alpha);
        Paint paint4 = new Paint();
        this.paintShadow = paint4;
        paint4.setAntiAlias(true);
        this.paintShadow.setColor(this.dividerConfig.shadowColor);
        this.paintShadow.setAlpha(this.dividerConfig.shadowAlpha);
        setLayerType(1, (Paint) null);
    }

    private void initDataForIDE() {
        if (isInEditMode()) {
            setItems(new String[]{"李玉江", "男", "贵州", "穿青人"});
        }
    }

    private void remeasure() {
        if (this.items != null) {
            measureTextWidthHeight();
            int i = (int) (this.itemHeight * ((float) (this.visibleItemCount - 1)));
            double d = (double) (i * 2);
            Double.isNaN(d);
            this.measuredHeight = (int) (d / 3.141592653589793d);
            double d2 = (double) i;
            Double.isNaN(d2);
            this.radius = (int) (d2 / 3.141592653589793d);
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (this.useWeight) {
                this.measuredWidth = View.MeasureSpec.getSize(this.widthMeasureSpec);
            } else if (layoutParams == null || layoutParams.width <= 0) {
                this.measuredWidth = this.maxTextWidth;
                if (this.textPadding < 0) {
                    this.textPadding = ConvertUtils.toPx(getContext(), ITEM_PADDING);
                }
                this.measuredWidth += this.textPadding * 2;
                if (!TextUtils.isEmpty(this.label)) {
                    this.measuredWidth += obtainTextWidth(this.paintCenterText, this.label);
                }
            } else {
                this.measuredWidth = layoutParams.width;
            }
            int i2 = this.measuredHeight;
            float f = this.itemHeight;
            this.firstLineY = (((float) i2) - f) / 2.0f;
            this.secondLineY = (((float) i2) + f) / 2.0f;
            if (this.initPosition == -1) {
                if (this.isLoop) {
                    this.initPosition = (this.items.size() + 1) / 2;
                } else {
                    this.initPosition = 0;
                }
            }
            this.preCurrentIndex = this.initPosition;
        }
    }

    private void measureTextWidthHeight() {
        Rect rect = new Rect();
        for (int i = 0; i < this.items.size(); i++) {
            String obtainContentText = obtainContentText(this.items.get(i));
            this.paintCenterText.getTextBounds(obtainContentText, 0, obtainContentText.length(), rect);
            int width = rect.width();
            if (width > this.maxTextWidth) {
                this.maxTextWidth = width;
            }
            this.paintCenterText.getTextBounds("测试", 0, 2, rect);
            this.maxTextHeight = rect.height() + 2;
        }
        this.itemHeight = this.lineSpaceMultiplier * ((float) this.maxTextHeight);
    }

    /* access modifiers changed from: private */
    public void smoothScroll(int i) {
        cancelFuture();
        if (i == 2 || i == 3) {
            float f = this.totalScrollY;
            float f2 = this.itemHeight;
            int i2 = (int) (((f % f2) + f2) % f2);
            this.offset = i2;
            if (((float) i2) > f2 / 2.0f) {
                this.offset = (int) (f2 - ((float) i2));
            } else {
                this.offset = -i2;
            }
        }
        this.mFuture = Executors.newSingleThreadScheduledExecutor().scheduleWithFixedDelay(new SmoothScrollTimerTask(this, this.offset), 0, 10, TimeUnit.MILLISECONDS);
    }

    /* access modifiers changed from: private */
    public void scrollBy(float f) {
        cancelFuture();
        this.mFuture = Executors.newSingleThreadScheduledExecutor().scheduleWithFixedDelay(new InertiaTimerTask(this, f), 0, 5, TimeUnit.MILLISECONDS);
    }

    /* access modifiers changed from: private */
    public void cancelFuture() {
        ScheduledFuture<?> scheduledFuture = this.mFuture;
        if (scheduledFuture != null && !scheduledFuture.isCancelled()) {
            this.mFuture.cancel(true);
            this.mFuture = null;
        }
    }

    /* access modifiers changed from: private */
    public void itemSelectedCallback() {
        if (this.onItemSelectListener != null || this.onWheelListener != null) {
            postDelayed(new Runnable() {
                public void run() {
                    if (WheelView.this.onItemSelectListener != null) {
                        WheelView.this.onItemSelectListener.onSelected(WheelView.this.selectedIndex);
                    }
                    if (WheelView.this.onWheelListener != null) {
                        WheelView.this.onWheelListener.onSelected(true, WheelView.this.selectedIndex, ((WheelItem) WheelView.this.items.get(WheelView.this.selectedIndex)).getName());
                    }
                }
            }, 200);
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        String str;
        Canvas canvas2 = canvas;
        List<WheelItem> list = this.items;
        if (list != null && list.size() != 0) {
            String[] strArr = new String[this.visibleItemCount];
            int size = this.initPosition + (((int) (this.totalScrollY / this.itemHeight)) % this.items.size());
            this.preCurrentIndex = size;
            if (!this.isLoop) {
                if (size < 0) {
                    this.preCurrentIndex = 0;
                }
                if (this.preCurrentIndex > this.items.size() - 1) {
                    this.preCurrentIndex = this.items.size() - 1;
                }
            } else {
                if (size < 0) {
                    this.preCurrentIndex = this.items.size() + this.preCurrentIndex;
                }
                if (this.preCurrentIndex > this.items.size() - 1) {
                    this.preCurrentIndex -= this.items.size();
                }
            }
            float f = this.totalScrollY % this.itemHeight;
            int i = 0;
            while (true) {
                int i2 = this.visibleItemCount;
                if (i >= i2) {
                    break;
                }
                int i3 = this.preCurrentIndex - ((i2 / 2) - i);
                if (this.isLoop) {
                    i3 = getLoopMappingIndex(i3);
                } else {
                    if (i3 < 0) {
                        strArr[i] = "";
                    } else if (i3 > this.items.size() - 1) {
                        strArr[i] = "";
                    }
                    i++;
                }
                strArr[i] = this.items.get(i3).getName();
                i++;
            }
            if (this.dividerConfig.visible) {
                float f2 = this.dividerConfig.ratio;
                int i4 = this.measuredWidth;
                float f3 = this.firstLineY;
                float f4 = 1.0f - f2;
                canvas.drawLine(((float) i4) * f2, f3, ((float) i4) * f4, f3, this.paintIndicator);
                int i5 = this.measuredWidth;
                float f5 = this.secondLineY;
                canvas.drawLine(((float) i5) * f2, f5, ((float) i5) * f4, f5, this.paintIndicator);
            }
            if (this.dividerConfig.shadowVisible) {
                this.paintShadow.setColor(this.dividerConfig.shadowColor);
                this.paintShadow.setAlpha(this.dividerConfig.shadowAlpha);
                canvas.drawRect(0.0f, this.firstLineY, (float) this.measuredWidth, this.secondLineY, this.paintShadow);
            }
            for (int i6 = 0; i6 < this.visibleItemCount; i6++) {
                canvas.save();
                double d = (double) (((this.itemHeight * ((float) i6)) - f) / ((float) this.radius));
                Double.isNaN(d);
                float f6 = (float) (90.0d - ((d / 3.141592653589793d) * 180.0d));
                if (f6 >= 90.0f || f6 <= -90.0f) {
                    canvas.restore();
                } else {
                    String obtainContentText = obtainContentText(strArr[i6]);
                    if (this.onlyShowCenterLabel || TextUtils.isEmpty(this.label) || TextUtils.isEmpty(obtainContentText)) {
                        str = obtainContentText;
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append(obtainContentText);
                        sb.append(this.label);
                        str = sb.toString();
                    }
                    if (this.textSizeAutoFit) {
                        remeasureTextSize(str);
                        this.gravity = 17;
                    } else {
                        this.gravity = 8388611;
                    }
                    measuredCenterContentStart(str);
                    measuredOutContentStart(str);
                    double d2 = (double) this.radius;
                    double cos = Math.cos(d);
                    String str2 = obtainContentText;
                    double d3 = (double) this.radius;
                    Double.isNaN(d3);
                    Double.isNaN(d2);
                    double sin = Math.sin(d);
                    double d4 = (double) this.maxTextHeight;
                    Double.isNaN(d4);
                    float f7 = (float) ((d2 - (cos * d3)) - ((sin * d4) / 2.0d));
                    canvas2.translate(0.0f, f7);
                    float f8 = this.firstLineY;
                    if (f7 > f8 || ((float) this.maxTextHeight) + f7 < f8) {
                        float f9 = this.secondLineY;
                        if (f7 > f9 || ((float) this.maxTextHeight) + f7 < f9) {
                            if (f7 >= this.firstLineY) {
                                int i7 = this.maxTextHeight;
                                if (((float) i7) + f7 <= this.secondLineY) {
                                    canvas2.clipRect(0, 0, this.measuredWidth, i7);
                                    float f10 = ((float) this.maxTextHeight) - this.centerContentOffset;
                                    Iterator<WheelItem> it = this.items.iterator();
                                    int i8 = 0;
                                    while (true) {
                                        if (!it.hasNext()) {
                                            break;
                                        }
                                        String str3 = str2;
                                        if (it.next().getName().equals(str3)) {
                                            this.selectedIndex = i8;
                                            break;
                                        } else {
                                            i8++;
                                            str2 = str3;
                                        }
                                    }
                                    if (this.onlyShowCenterLabel && !TextUtils.isEmpty(this.label)) {
                                        StringBuilder sb2 = new StringBuilder();
                                        sb2.append(str);
                                        sb2.append(this.label);
                                        str = sb2.toString();
                                    }
                                    canvas2.drawText(str, (float) this.drawCenterContentStart, f10, this.paintCenterText);
                                    canvas.restore();
                                    this.paintCenterText.setTextSize((float) this.textSize);
                                }
                            }
                            canvas.save();
                            canvas2.clipRect(0.0f, 0.0f, (float) this.measuredWidth, this.itemHeight);
                            canvas2.scale(1.0f, ((float) Math.sin(d)) * SCALE_CONTENT);
                            float pow = (float) Math.pow((double) (Math.abs(f6) / 90.0f), 2.2d);
                            int i9 = this.textSkewXOffset;
                            if (i9 != 0) {
                                Paint paint = this.paintOuterText;
                                int i10 = -1;
                                int i11 = i9 > 0 ? 1 : -1;
                                if (f6 <= 0.0f) {
                                    i10 = 1;
                                }
                                paint.setTextSkewX(((float) (i11 * i10)) * 0.5f * pow);
                                this.paintOuterText.setAlpha((int) ((1.0f - pow) * 255.0f));
                            }
                            canvas2.drawText(str, ((float) this.drawOutContentStart) + (((float) this.textSkewXOffset) * pow), (float) this.maxTextHeight, this.paintOuterText);
                            canvas.restore();
                            canvas.restore();
                            this.paintCenterText.setTextSize((float) this.textSize);
                        } else {
                            canvas.save();
                            canvas2.clipRect(0.0f, 0.0f, (float) this.measuredWidth, this.secondLineY - f7);
                            canvas2.scale(1.0f, ((float) Math.sin(d)) * 1.0f);
                            canvas2.drawText(str, (float) this.drawCenterContentStart, ((float) this.maxTextHeight) - this.centerContentOffset, this.paintCenterText);
                            canvas.restore();
                            canvas.save();
                            canvas2.clipRect(0.0f, this.secondLineY - f7, (float) this.measuredWidth, (float) ((int) this.itemHeight));
                            canvas2.scale(1.0f, ((float) Math.sin(d)) * SCALE_CONTENT);
                            canvas2.drawText(str, (float) this.drawOutContentStart, (float) this.maxTextHeight, this.paintOuterText);
                            canvas.restore();
                        }
                    } else {
                        canvas.save();
                        canvas2.clipRect(0.0f, 0.0f, (float) this.measuredWidth, this.firstLineY - f7);
                        canvas2.scale(1.0f, ((float) Math.sin(d)) * SCALE_CONTENT);
                        canvas2.drawText(str, (float) this.drawOutContentStart, (float) this.maxTextHeight, this.paintOuterText);
                        canvas.restore();
                        canvas.save();
                        canvas2.clipRect(0.0f, this.firstLineY - f7, (float) this.measuredWidth, (float) ((int) this.itemHeight));
                        canvas2.scale(1.0f, ((float) Math.sin(d)) * 1.0f);
                        canvas2.drawText(str, (float) this.drawCenterContentStart, ((float) this.maxTextHeight) - this.centerContentOffset, this.paintCenterText);
                        canvas.restore();
                    }
                    canvas.restore();
                    this.paintCenterText.setTextSize((float) this.textSize);
                }
            }
        }
    }

    private void remeasureTextSize(String str) {
        int length = str != null ? str.length() : 0;
        int max = dispatchOnCancelled.setMax(length);
        if (length != max) {
            onCanceled oncanceled = new onCanceled(length, max, 1);
            onCancelLoad.setMax(-1264360307, oncanceled);
            onCancelLoad.getMin(-1264360307, oncanceled);
        }
        Rect rect = new Rect();
        this.paintCenterText.getTextBounds(str, 0, str.length(), rect);
        int i = this.textSize;
        for (int width = rect.width(); width > this.measuredWidth; width = rect.width()) {
            i--;
            this.paintCenterText.setTextSize((float) i);
            this.paintCenterText.getTextBounds(str, 0, str.length(), rect);
        }
        this.paintOuterText.setTextSize((float) i);
    }

    private int getLoopMappingIndex(int i) {
        if (i < 0) {
            return getLoopMappingIndex(i + this.items.size());
        }
        return i > this.items.size() + -1 ? getLoopMappingIndex(i - this.items.size()) : i;
    }

    private String obtainContentText(Object obj) {
        if (obj == null) {
            return "";
        }
        if (obj instanceof WheelItem) {
            return ((WheelItem) obj).getName();
        }
        if (!(obj instanceof Integer)) {
            return obj.toString();
        }
        return String.format(Locale.getDefault(), TimeModel.ZERO_LEADING_NUMBER_FORMAT, new Object[]{Integer.valueOf(((Integer) obj).intValue())});
    }

    private void measuredCenterContentStart(String str) {
        Rect rect = new Rect();
        this.paintCenterText.getTextBounds(str, 0, str.length(), rect);
        int i = this.gravity;
        if (i == 3) {
            this.drawCenterContentStart = ConvertUtils.toPx(getContext(), 8.0f);
        } else if (i == 5) {
            this.drawCenterContentStart = (this.measuredWidth - rect.width()) - ((int) this.centerContentOffset);
        } else if (i == 17) {
            double width = (double) (this.measuredWidth - rect.width());
            Double.isNaN(width);
            this.drawCenterContentStart = (int) (width * 0.5d);
        }
    }

    private void measuredOutContentStart(String str) {
        Rect rect = new Rect();
        this.paintOuterText.getTextBounds(str, 0, str.length(), rect);
        int i = this.gravity;
        if (i == 3) {
            this.drawOutContentStart = ConvertUtils.toPx(getContext(), 8.0f);
        } else if (i == 5) {
            this.drawOutContentStart = (this.measuredWidth - rect.width()) - ((int) this.centerContentOffset);
        } else if (i == 17) {
            double width = (double) (this.measuredWidth - rect.width());
            Double.isNaN(width);
            this.drawOutContentStart = (int) (width * 0.5d);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        this.widthMeasureSpec = i;
        remeasure();
        setMeasuredDimension(this.measuredWidth, this.measuredHeight);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean onTouchEvent = this.gestureDetector.onTouchEvent(motionEvent);
        ViewParent parent = getParent();
        int action = motionEvent.getAction();
        if (action == 0) {
            this.startTime = System.currentTimeMillis();
            cancelFuture();
            this.previousY = motionEvent.getRawY();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        } else if (action != 2) {
            if (!onTouchEvent) {
                float y = motionEvent.getY();
                int i = this.radius;
                double acos = Math.acos((double) ((((float) i) - y) / ((float) i)));
                double d = (double) this.radius;
                Double.isNaN(d);
                double d2 = acos * d;
                float f = this.itemHeight;
                double d3 = (double) (f / 2.0f);
                Double.isNaN(d3);
                double d4 = d2 + d3;
                double d5 = (double) f;
                Double.isNaN(d5);
                this.offset = (int) ((((float) (((int) (d4 / d5)) - (this.visibleItemCount / 2))) * f) - (((this.totalScrollY % f) + f) % f));
                if (System.currentTimeMillis() - this.startTime > 120) {
                    smoothScroll(3);
                } else {
                    smoothScroll(1);
                }
            }
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(false);
            }
        } else {
            float rawY = this.previousY - motionEvent.getRawY();
            this.previousY = motionEvent.getRawY();
            this.totalScrollY += rawY;
            if (!this.isLoop) {
                float f2 = ((float) (-this.initPosition)) * this.itemHeight;
                float f3 = this.itemHeight;
                float size = ((float) ((this.items.size() - 1) - this.initPosition)) * f3;
                float f4 = this.totalScrollY;
                double d6 = (double) f4;
                double d7 = (double) f3;
                Double.isNaN(d7);
                Double.isNaN(d6);
                if (d6 - (d7 * 0.25d) < ((double) f2)) {
                    f2 = f4 - rawY;
                } else {
                    double d8 = (double) f4;
                    double d9 = (double) f3;
                    Double.isNaN(d9);
                    Double.isNaN(d8);
                    if (d8 + (d9 * 0.25d) > ((double) size)) {
                        size = f4 - rawY;
                    }
                }
                float f5 = this.totalScrollY;
                if (f5 < f2) {
                    this.totalScrollY = (float) ((int) f2);
                } else if (f5 > size) {
                    this.totalScrollY = (float) ((int) size);
                }
            }
        }
        if (motionEvent.getAction() != 0) {
            invalidate();
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public int getItemCount() {
        List<WheelItem> list = this.items;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    private int obtainTextWidth(Paint paint, String str) {
        if (str == null || str.length() <= 0) {
            return 0;
        }
        int length = str.length();
        float[] fArr = new float[length];
        paint.getTextWidths(str, fArr);
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            i += (int) Math.ceil((double) fArr[i2]);
        }
        return i;
    }

    public static class DividerConfig {
        public static final float FILL = 0.0f;
        public static final float WRAP = 1.0f;
        protected int alpha = WheelView.DIVIDER_ALPHA;
        protected int color = -8139290;
        protected float ratio = 0.1f;
        protected int shadowAlpha = 100;
        protected int shadowColor = -4473925;
        protected boolean shadowVisible = false;
        protected float thick = 2.0f;
        protected boolean visible = true;

        public DividerConfig() {
        }

        public DividerConfig(@FloatRange(from = 0.0d, to = 1.0d) float f) {
            this.ratio = f;
        }

        public DividerConfig setVisible(boolean z) {
            this.visible = z;
            return this;
        }

        public DividerConfig setShadowVisible(boolean z) {
            this.shadowVisible = z;
            if (z && this.color == -8139290) {
                this.color = this.shadowColor;
                this.alpha = 255;
            }
            return this;
        }

        public DividerConfig setShadowColor(@ColorInt int i) {
            this.shadowVisible = true;
            this.shadowColor = i;
            return this;
        }

        public DividerConfig setShadowAlpha(@IntRange(from = 1, to = 255) int i) {
            this.shadowAlpha = i;
            return this;
        }

        public DividerConfig setColor(@ColorInt int i) {
            this.color = i;
            return this;
        }

        public DividerConfig setAlpha(@IntRange(from = 1, to = 255) int i) {
            this.alpha = i;
            return this;
        }

        public DividerConfig setRatio(@FloatRange(from = 0.0d, to = 1.0d) float f) {
            this.ratio = f;
            return this;
        }

        public DividerConfig setThick(float f) {
            this.thick = f;
            return this;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("visible=");
            sb.append(this.visible);
            sb.append(",color=");
            sb.append(this.color);
            sb.append(",alpha=");
            sb.append(this.alpha);
            sb.append(",thick=");
            sb.append(this.thick);
            return sb.toString();
        }
    }

    static class StringItem implements WheelItem {
        private String name;

        private StringItem(String str) {
            this.name = str;
        }

        public String getName() {
            return this.name;
        }
    }

    static class MessageHandler extends Handler {
        static final int WHAT_INVALIDATE = 1000;
        static final int WHAT_ITEM_SELECTED = 3000;
        static final int WHAT_SMOOTH_SCROLL = 2000;
        final WheelView view;

        MessageHandler(WheelView wheelView) {
            this.view = wheelView;
        }

        public final void handleMessage(Message message) {
            int i = message.what;
            if (i == 1000) {
                this.view.invalidate();
            } else if (i == 2000) {
                this.view.smoothScroll(2);
            } else if (i == 3000) {
                this.view.itemSelectedCallback();
            }
        }
    }

    static class SmoothScrollTimerTask extends TimerTask {
        int offset;
        int realOffset = 0;
        int realTotalOffset = Integer.MAX_VALUE;
        final WheelView view;

        SmoothScrollTimerTask(WheelView wheelView, int i) {
            this.view = wheelView;
            this.offset = i;
        }

        public void run() {
            if (this.realTotalOffset == Integer.MAX_VALUE) {
                this.realTotalOffset = this.offset;
            }
            int i = this.realTotalOffset;
            int i2 = (int) (((float) i) * 0.1f);
            this.realOffset = i2;
            if (i2 == 0) {
                if (i < 0) {
                    this.realOffset = -1;
                } else {
                    this.realOffset = 1;
                }
            }
            if (Math.abs(this.realTotalOffset) <= 1) {
                this.view.cancelFuture();
                this.view.handler.sendEmptyMessage(3000);
                return;
            }
            WheelView wheelView = this.view;
            float unused = wheelView.totalScrollY = wheelView.totalScrollY + ((float) this.realOffset);
            if (!this.view.isLoop) {
                float access$1200 = this.view.itemHeight;
                float f = ((float) (-this.view.initPosition)) * access$1200;
                float itemCount = ((float) ((this.view.getItemCount() - 1) - this.view.initPosition)) * access$1200;
                if (this.view.totalScrollY <= f || this.view.totalScrollY >= itemCount) {
                    WheelView wheelView2 = this.view;
                    float unused2 = wheelView2.totalScrollY = wheelView2.totalScrollY - ((float) this.realOffset);
                    this.view.cancelFuture();
                    this.view.handler.sendEmptyMessage(3000);
                    return;
                }
            }
            this.view.handler.sendEmptyMessage(1000);
            this.realTotalOffset -= this.realOffset;
        }
    }

    static class InertiaTimerTask extends TimerTask {

        /* renamed from: a  reason: collision with root package name */
        float f10724a = 2.14748365E9f;
        final float velocityY;
        final WheelView view;

        InertiaTimerTask(WheelView wheelView, float f) {
            this.view = wheelView;
            this.velocityY = f;
        }

        public final void run() {
            if (this.f10724a == 2.14748365E9f) {
                if (Math.abs(this.velocityY) <= 2000.0f) {
                    this.f10724a = this.velocityY;
                } else if (this.velocityY > 0.0f) {
                    this.f10724a = 2000.0f;
                } else {
                    this.f10724a = -2000.0f;
                }
            }
            if (Math.abs(this.f10724a) < 0.0f || Math.abs(this.f10724a) > 20.0f) {
                WheelView wheelView = this.view;
                float f = (float) ((int) ((this.f10724a * 10.0f) / 1000.0f));
                float unused = wheelView.totalScrollY = wheelView.totalScrollY - f;
                if (!this.view.isLoop) {
                    float access$1200 = this.view.itemHeight;
                    float f2 = ((float) (-this.view.initPosition)) * access$1200;
                    float itemCount = ((float) ((this.view.getItemCount() - 1) - this.view.initPosition)) * access$1200;
                    double access$1000 = (double) this.view.totalScrollY;
                    double d = (double) access$1200;
                    Double.isNaN(d);
                    double d2 = d * 0.25d;
                    Double.isNaN(access$1000);
                    if (access$1000 - d2 < ((double) f2)) {
                        f2 = this.view.totalScrollY + f;
                    } else {
                        double access$10002 = (double) this.view.totalScrollY;
                        Double.isNaN(access$10002);
                        if (access$10002 + d2 > ((double) itemCount)) {
                            itemCount = this.view.totalScrollY + f;
                        }
                    }
                    if (this.view.totalScrollY <= f2) {
                        this.f10724a = 40.0f;
                        float unused2 = this.view.totalScrollY = (float) ((int) f2);
                    } else if (this.view.totalScrollY >= itemCount) {
                        float unused3 = this.view.totalScrollY = (float) ((int) itemCount);
                        this.f10724a = -40.0f;
                    }
                }
                float f3 = this.f10724a;
                if (f3 < 0.0f) {
                    this.f10724a = f3 + 20.0f;
                } else {
                    this.f10724a = f3 - 20.0f;
                }
                this.view.handler.sendEmptyMessage(1000);
                return;
            }
            this.view.cancelFuture();
            this.view.handler.sendEmptyMessage(2000);
        }
    }
}
