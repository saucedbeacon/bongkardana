package o;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.os.Build;
import androidx.annotation.CallSuper;
import androidx.annotation.FloatRange;
import androidx.annotation.Nullable;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.content.Mask;
import com.airbnb.lottie.model.layer.Layer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import o.setInputType;

public abstract class onKeyPreIme implements removeTabAt, setInputType.getMin, getMaxWidth {
    private final Paint FastBitmap$CoordinateSystem;
    private final RectF Grayscale$Algorithm;
    @Nullable
    private onKeyPreIme ICustomTabsCallback;
    private final Matrix IsOverlapping = new Matrix();
    private final RectF Mean$Arithmetic;
    @Nullable
    private Paint b;
    private List<onKeyPreIme> create;
    private final Paint equals;
    private boolean getCause;
    final LottieDrawable getMax;
    @Nullable
    setOnQueryTextListener getMin;
    private final RectF hashCode;
    private final RectF invoke;
    @Nullable
    private setOnSearchClickListener invokeSuspend;
    final setSubmitButtonEnabled isInside;
    final Layer length;
    @Nullable
    private onKeyPreIme onNavigationEvent;
    public final List<setInputType<?, ?>> setMax;
    final Matrix setMin;
    private final Paint toDoubleRange;
    boolean toFloatRange;
    private final Path toIntRange = new Path();
    private final Paint toString;
    private final String valueOf;
    private final Paint values;

    /* access modifiers changed from: package-private */
    public abstract void getMin(Canvas canvas, Matrix matrix, int i);

    /* access modifiers changed from: package-private */
    public void length(setMaxWidth setmaxwidth, int i, List<setMaxWidth> list, setMaxWidth setmaxwidth2) {
    }

    public final void setMax(List<animateToTab> list, List<animateToTab> list2) {
    }

    onKeyPreIme(LottieDrawable lottieDrawable, Layer layer) {
        boolean z = true;
        this.equals = new clearSelection(1);
        this.toString = new clearSelection(PorterDuff.Mode.DST_IN, (byte) 0);
        this.toDoubleRange = new clearSelection(PorterDuff.Mode.DST_OUT, (byte) 0);
        this.values = new clearSelection(1);
        this.FastBitmap$CoordinateSystem = new clearSelection(PorterDuff.Mode.CLEAR);
        this.hashCode = new RectF();
        this.Mean$Arithmetic = new RectF();
        this.invoke = new RectF();
        this.Grayscale$Algorithm = new RectF();
        this.setMin = new Matrix();
        this.setMax = new ArrayList();
        this.toFloatRange = true;
        this.getMax = lottieDrawable;
        this.length = layer;
        StringBuilder sb = new StringBuilder();
        sb.append(layer.getMin);
        sb.append("#draw");
        this.valueOf = sb.toString();
        if (layer.ICustomTabsCallback == Layer.MatteType.INVERT) {
            this.values.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        } else {
            this.values.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        }
        setSubmitButtonEnabled setsubmitbuttonenabled = new setSubmitButtonEnabled(layer.IsOverlapping);
        this.isInside = setsubmitbuttonenabled;
        setsubmitbuttonenabled.length((setInputType.getMin) this);
        if (layer.toFloatRange != null && !layer.toFloatRange.isEmpty()) {
            setOnSearchClickListener setonsearchclicklistener = new setOnSearchClickListener(layer.toFloatRange);
            this.invokeSuspend = setonsearchclicklistener;
            for (setInputType<enoughToFilter, Path> setinputtype : setonsearchclicklistener.setMin) {
                setinputtype.getMin.add(this);
            }
            for (setInputType next : this.invokeSuspend.getMin) {
                if (next != null) {
                    this.setMax.add(next);
                }
                next.getMin.add(this);
            }
        }
        if (!this.length.invokeSuspend.isEmpty()) {
            setOnQueryTextListener setonquerytextlistener = new setOnQueryTextListener(this.length.invokeSuspend);
            this.getMin = setonquerytextlistener;
            setonquerytextlistener.setMin = true;
            this.getMin.getMin.add(new setInputType.getMin() {
                public final void setMax() {
                    onKeyPreIme onkeypreime = onKeyPreIme.this;
                    boolean z = onkeypreime.getMin.isInside() == 1.0f;
                    if (z != onkeypreime.toFloatRange) {
                        onkeypreime.toFloatRange = z;
                        onkeypreime.getMax.invalidateSelf();
                    }
                }
            });
            z = ((Float) this.getMin.equals()).floatValue() != 1.0f ? false : z;
            if (z != this.toFloatRange) {
                this.toFloatRange = z;
                this.getMax.invalidateSelf();
            }
            setOnQueryTextListener setonquerytextlistener2 = this.getMin;
            if (setonquerytextlistener2 != null) {
                this.setMax.add(setonquerytextlistener2);
            }
        } else if (true != this.toFloatRange) {
            this.toFloatRange = true;
            this.getMax.invalidateSelf();
        }
    }

    /* access modifiers changed from: package-private */
    public void length(boolean z) {
        if (z && this.b == null) {
            this.b = new clearSelection();
        }
        this.getCause = z;
    }

    /* access modifiers changed from: package-private */
    public final void getMin(@Nullable onKeyPreIme onkeypreime) {
        this.onNavigationEvent = onkeypreime;
    }

    /* access modifiers changed from: package-private */
    public final boolean getMax() {
        return this.onNavigationEvent != null;
    }

    /* access modifiers changed from: package-private */
    public final void setMin(@Nullable onKeyPreIme onkeypreime) {
        this.ICustomTabsCallback = onkeypreime;
    }

    @CallSuper
    public void setMin(RectF rectF, Matrix matrix, boolean z) {
        this.hashCode.set(0.0f, 0.0f, 0.0f, 0.0f);
        toFloatRange();
        this.setMin.set(matrix);
        if (z) {
            List<onKeyPreIme> list = this.create;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.setMin.preConcat(this.create.get(size).isInside.length());
                }
            } else {
                onKeyPreIme onkeypreime = this.ICustomTabsCallback;
                if (onkeypreime != null) {
                    this.setMin.preConcat(onkeypreime.isInside.length());
                }
            }
        }
        this.setMin.preConcat(this.isInside.length());
    }

    public final void setMax(Canvas canvas, Matrix matrix, int i) {
        float f;
        Paint paint;
        Canvas canvas2 = canvas;
        Matrix matrix2 = matrix;
        setChildFrame.getMin(this.valueOf);
        if (!this.toFloatRange || this.length.setMax()) {
            setChildFrame.length(this.valueOf);
            return;
        }
        toFloatRange();
        setChildFrame.getMin("Layer#parentMatrix");
        this.IsOverlapping.reset();
        this.IsOverlapping.set(matrix2);
        int i2 = 1;
        for (int size = this.create.size() - 1; size >= 0; size--) {
            this.IsOverlapping.preConcat(this.create.get(size).isInside.length());
        }
        setChildFrame.length("Layer#parentMatrix");
        int intValue = (int) ((((((float) i) / 255.0f) * ((float) (this.isInside.setMax == null ? 100 : this.isInside.setMax.equals().intValue()))) / 100.0f) * 255.0f);
        if (getMax() || length()) {
            setChildFrame.getMin("Layer#computeBounds");
            setMin(this.hashCode, this.IsOverlapping, false);
            RectF rectF = this.hashCode;
            if (getMax() && this.length.ICustomTabsCallback != Layer.MatteType.INVERT) {
                this.invoke.set(0.0f, 0.0f, 0.0f, 0.0f);
                this.onNavigationEvent.setMin(this.invoke, matrix2, true);
                if (!rectF.intersect(this.invoke)) {
                    rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
                }
            }
            this.IsOverlapping.preConcat(this.isInside.length());
            RectF rectF2 = this.hashCode;
            Matrix matrix3 = this.IsOverlapping;
            this.Mean$Arithmetic.set(0.0f, 0.0f, 0.0f, 0.0f);
            int i3 = 3;
            int i4 = 2;
            if (length()) {
                int size2 = this.invokeSuspend.setMax.size();
                int i5 = 0;
                while (true) {
                    if (i5 < size2) {
                        Mask mask = this.invokeSuspend.setMax.get(i5);
                        this.toIntRange.set((Path) this.invokeSuspend.setMin.get(i5).equals());
                        this.toIntRange.transform(matrix3);
                        int i6 = AnonymousClass2.getMax[mask.length.ordinal()];
                        if (i6 == i2 || i6 == i4 || ((i6 == i3 || i6 == 4) && mask.getMin())) {
                            break;
                        }
                        this.toIntRange.computeBounds(this.Grayscale$Algorithm, false);
                        if (i5 == 0) {
                            this.Mean$Arithmetic.set(this.Grayscale$Algorithm);
                        } else {
                            RectF rectF3 = this.Mean$Arithmetic;
                            rectF3.set(Math.min(rectF3.left, this.Grayscale$Algorithm.left), Math.min(this.Mean$Arithmetic.top, this.Grayscale$Algorithm.top), Math.max(this.Mean$Arithmetic.right, this.Grayscale$Algorithm.right), Math.max(this.Mean$Arithmetic.bottom, this.Grayscale$Algorithm.bottom));
                        }
                        i5++;
                        i2 = 1;
                        i3 = 3;
                        i4 = 2;
                    } else if (!rectF2.intersect(this.Mean$Arithmetic)) {
                        f = 0.0f;
                        rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
                    }
                }
            }
            f = 0.0f;
            if (!this.hashCode.intersect(f, f, (float) canvas.getWidth(), (float) canvas.getHeight())) {
                this.hashCode.set(f, f, f, f);
            }
            setChildFrame.length("Layer#computeBounds");
            if (this.hashCode.width() >= 1.0f && this.hashCode.height() >= 1.0f) {
                setChildFrame.getMin("Layer#saveLayer");
                this.equals.setAlpha(255);
                setTitleMarginStart.length(canvas2, this.hashCode, this.equals);
                setChildFrame.length("Layer#saveLayer");
                setMax(canvas);
                setChildFrame.getMin("Layer#drawLayer");
                getMin(canvas2, this.IsOverlapping, intValue);
                setChildFrame.length("Layer#drawLayer");
                if (length()) {
                    Matrix matrix4 = this.IsOverlapping;
                    setChildFrame.getMin("Layer#saveLayer");
                    setTitleMarginStart.setMin(canvas2, this.hashCode, this.toString, 19);
                    if (Build.VERSION.SDK_INT < 28) {
                        setMax(canvas);
                    }
                    setChildFrame.length("Layer#saveLayer");
                    for (int i7 = 0; i7 < this.invokeSuspend.setMax.size(); i7++) {
                        Mask mask2 = this.invokeSuspend.setMax.get(i7);
                        setInputType setinputtype = this.invokeSuspend.setMin.get(i7);
                        setInputType setinputtype2 = this.invokeSuspend.getMin.get(i7);
                        int i8 = AnonymousClass2.getMax[mask2.length.ordinal()];
                        if (i8 != 1) {
                            if (i8 == 2) {
                                if (i7 == 0) {
                                    this.equals.setColor(-16777216);
                                    this.equals.setAlpha(255);
                                    canvas2.drawRect(this.hashCode, this.equals);
                                }
                                if (mask2.getMin()) {
                                    setTitleMarginStart.length(canvas2, this.hashCode, this.toDoubleRange);
                                    canvas2.drawRect(this.hashCode, this.equals);
                                    this.toDoubleRange.setAlpha((int) (((float) ((Integer) setinputtype2.equals()).intValue()) * 2.55f));
                                    this.toIntRange.set((Path) setinputtype.equals());
                                    this.toIntRange.transform(matrix4);
                                    canvas2.drawPath(this.toIntRange, this.toDoubleRange);
                                    canvas.restore();
                                } else {
                                    this.toIntRange.set((Path) setinputtype.equals());
                                    this.toIntRange.transform(matrix4);
                                    canvas2.drawPath(this.toIntRange, this.toDoubleRange);
                                }
                            } else if (i8 != 3) {
                                if (i8 == 4) {
                                    if (mask2.getMin()) {
                                        setTitleMarginStart.length(canvas2, this.hashCode, this.equals);
                                        canvas2.drawRect(this.hashCode, this.equals);
                                        this.toIntRange.set((Path) setinputtype.equals());
                                        this.toIntRange.transform(matrix4);
                                        this.equals.setAlpha((int) (((float) ((Integer) setinputtype2.equals()).intValue()) * 2.55f));
                                        canvas2.drawPath(this.toIntRange, this.toDoubleRange);
                                        canvas.restore();
                                    } else {
                                        this.toIntRange.set((Path) setinputtype.equals());
                                        this.toIntRange.transform(matrix4);
                                        this.equals.setAlpha((int) (((float) ((Integer) setinputtype2.equals()).intValue()) * 2.55f));
                                        canvas2.drawPath(this.toIntRange, this.equals);
                                    }
                                }
                            } else if (mask2.getMin()) {
                                setTitleMarginStart.length(canvas2, this.hashCode, this.toString);
                                canvas2.drawRect(this.hashCode, this.equals);
                                this.toDoubleRange.setAlpha((int) (((float) ((Integer) setinputtype2.equals()).intValue()) * 2.55f));
                                this.toIntRange.set((Path) setinputtype.equals());
                                this.toIntRange.transform(matrix4);
                                canvas2.drawPath(this.toIntRange, this.toDoubleRange);
                                canvas.restore();
                            } else {
                                setTitleMarginStart.length(canvas2, this.hashCode, this.toString);
                                this.toIntRange.set((Path) setinputtype.equals());
                                this.toIntRange.transform(matrix4);
                                this.equals.setAlpha((int) (((float) ((Integer) setinputtype2.equals()).intValue()) * 2.55f));
                                canvas2.drawPath(this.toIntRange, this.equals);
                                canvas.restore();
                            }
                        } else if (getMin()) {
                            this.equals.setAlpha(255);
                            canvas2.drawRect(this.hashCode, this.equals);
                        }
                    }
                    setChildFrame.getMin("Layer#restoreLayer");
                    canvas.restore();
                    setChildFrame.length("Layer#restoreLayer");
                }
                if (getMax()) {
                    setChildFrame.getMin("Layer#drawMatte");
                    setChildFrame.getMin("Layer#saveLayer");
                    setTitleMarginStart.setMin(canvas2, this.hashCode, this.values, 19);
                    setChildFrame.length("Layer#saveLayer");
                    setMax(canvas);
                    this.onNavigationEvent.setMax(canvas2, matrix2, intValue);
                    setChildFrame.getMin("Layer#restoreLayer");
                    canvas.restore();
                    setChildFrame.length("Layer#restoreLayer");
                    setChildFrame.length("Layer#drawMatte");
                }
                setChildFrame.getMin("Layer#restoreLayer");
                canvas.restore();
                setChildFrame.length("Layer#restoreLayer");
            }
            if (this.getCause && (paint = this.b) != null) {
                paint.setStyle(Paint.Style.STROKE);
                this.b.setColor(-251901);
                this.b.setStrokeWidth(4.0f);
                canvas2.drawRect(this.hashCode, this.b);
                this.b.setStyle(Paint.Style.FILL);
                this.b.setColor(1357638635);
                canvas2.drawRect(this.hashCode, this.b);
            }
            this.getMax.length.setMin.getMin(this.length.getMin, setChildFrame.length(this.valueOf));
            return;
        }
        this.IsOverlapping.preConcat(this.isInside.length());
        setChildFrame.getMin("Layer#drawLayer");
        getMin(canvas2, this.IsOverlapping, intValue);
        setChildFrame.length("Layer#drawLayer");
        this.getMax.length.setMin.getMin(this.length.getMin, setChildFrame.length(this.valueOf));
    }

    private void setMax(Canvas canvas) {
        setChildFrame.getMin("Layer#clearLayer");
        canvas.drawRect(this.hashCode.left - 1.0f, this.hashCode.top - 1.0f, this.hashCode.right + 1.0f, this.hashCode.bottom + 1.0f, this.FastBitmap$CoordinateSystem);
        setChildFrame.length("Layer#clearLayer");
    }

    /* renamed from: o.onKeyPreIme$2  reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] getMax;
        static final /* synthetic */ int[] length;

        /* JADX WARNING: Can't wrap try/catch for region: R(23:0|(2:1|2)|3|(2:5|6)|7|9|10|11|(2:13|14)|15|17|18|19|20|21|22|23|24|25|26|27|28|(3:29|30|32)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(27:0|1|2|3|(2:5|6)|7|9|10|11|13|14|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|32) */
        /* JADX WARNING: Can't wrap try/catch for region: R(28:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|32) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0044 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x004e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0058 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0062 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x006d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0078 */
        static {
            /*
                com.airbnb.lottie.model.content.Mask$MaskMode[] r0 = com.airbnb.lottie.model.content.Mask.MaskMode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                getMax = r0
                r1 = 1
                com.airbnb.lottie.model.content.Mask$MaskMode r2 = com.airbnb.lottie.model.content.Mask.MaskMode.MASK_MODE_NONE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = getMax     // Catch:{ NoSuchFieldError -> 0x001d }
                com.airbnb.lottie.model.content.Mask$MaskMode r3 = com.airbnb.lottie.model.content.Mask.MaskMode.MASK_MODE_SUBTRACT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = getMax     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.airbnb.lottie.model.content.Mask$MaskMode r4 = com.airbnb.lottie.model.content.Mask.MaskMode.MASK_MODE_INTERSECT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                r3 = 4
                int[] r4 = getMax     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.airbnb.lottie.model.content.Mask$MaskMode r5 = com.airbnb.lottie.model.content.Mask.MaskMode.MASK_MODE_ADD     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                com.airbnb.lottie.model.layer.Layer$LayerType[] r4 = com.airbnb.lottie.model.layer.Layer.LayerType.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                length = r4
                com.airbnb.lottie.model.layer.Layer$LayerType r5 = com.airbnb.lottie.model.layer.Layer.LayerType.SHAPE     // Catch:{ NoSuchFieldError -> 0x0044 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0044 }
                r4[r5] = r1     // Catch:{ NoSuchFieldError -> 0x0044 }
            L_0x0044:
                int[] r1 = length     // Catch:{ NoSuchFieldError -> 0x004e }
                com.airbnb.lottie.model.layer.Layer$LayerType r4 = com.airbnb.lottie.model.layer.Layer.LayerType.PRE_COMP     // Catch:{ NoSuchFieldError -> 0x004e }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x004e }
                r1[r4] = r0     // Catch:{ NoSuchFieldError -> 0x004e }
            L_0x004e:
                int[] r0 = length     // Catch:{ NoSuchFieldError -> 0x0058 }
                com.airbnb.lottie.model.layer.Layer$LayerType r1 = com.airbnb.lottie.model.layer.Layer.LayerType.SOLID     // Catch:{ NoSuchFieldError -> 0x0058 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0058 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0058 }
            L_0x0058:
                int[] r0 = length     // Catch:{ NoSuchFieldError -> 0x0062 }
                com.airbnb.lottie.model.layer.Layer$LayerType r1 = com.airbnb.lottie.model.layer.Layer.LayerType.IMAGE     // Catch:{ NoSuchFieldError -> 0x0062 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0062 }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x0062 }
            L_0x0062:
                int[] r0 = length     // Catch:{ NoSuchFieldError -> 0x006d }
                com.airbnb.lottie.model.layer.Layer$LayerType r1 = com.airbnb.lottie.model.layer.Layer.LayerType.NULL     // Catch:{ NoSuchFieldError -> 0x006d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006d }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006d }
            L_0x006d:
                int[] r0 = length     // Catch:{ NoSuchFieldError -> 0x0078 }
                com.airbnb.lottie.model.layer.Layer$LayerType r1 = com.airbnb.lottie.model.layer.Layer.LayerType.TEXT     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = length     // Catch:{ NoSuchFieldError -> 0x0083 }
                com.airbnb.lottie.model.layer.Layer$LayerType r1 = com.airbnb.lottie.model.layer.Layer.LayerType.UNKNOWN     // Catch:{ NoSuchFieldError -> 0x0083 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0083 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0083 }
            L_0x0083:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o.onKeyPreIme.AnonymousClass2.<clinit>():void");
        }
    }

    private boolean getMin() {
        if (this.invokeSuspend.setMin.isEmpty()) {
            return false;
        }
        for (int i = 0; i < this.invokeSuspend.setMax.size(); i++) {
            if (this.invokeSuspend.setMax.get(i).length != Mask.MaskMode.MASK_MODE_NONE) {
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public final boolean length() {
        setOnSearchClickListener setonsearchclicklistener = this.invokeSuspend;
        return setonsearchclicklistener != null && !setonsearchclicklistener.setMin.isEmpty();
    }

    /* access modifiers changed from: package-private */
    public void getMax(@FloatRange(from = 0.0d, to = 1.0d) float f) {
        setSubmitButtonEnabled setsubmitbuttonenabled = this.isInside;
        if (setsubmitbuttonenabled.setMax != null) {
            setsubmitbuttonenabled.setMax.setMax(f);
        }
        if (setsubmitbuttonenabled.toFloatRange != null) {
            setsubmitbuttonenabled.toFloatRange.setMax(f);
        }
        if (setsubmitbuttonenabled.IsOverlapping != null) {
            setsubmitbuttonenabled.IsOverlapping.setMax(f);
        }
        if (setsubmitbuttonenabled.getMax != null) {
            setsubmitbuttonenabled.getMax.setMax(f);
        }
        if (setsubmitbuttonenabled.getMin != null) {
            setsubmitbuttonenabled.getMin.setMax(f);
        }
        if (setsubmitbuttonenabled.length != null) {
            setsubmitbuttonenabled.length.setMax(f);
        }
        if (setsubmitbuttonenabled.setMin != null) {
            setsubmitbuttonenabled.setMin.setMax(f);
        }
        if (setsubmitbuttonenabled.isInside != null) {
            setsubmitbuttonenabled.isInside.setMax(f);
        }
        if (setsubmitbuttonenabled.equals != null) {
            setsubmitbuttonenabled.equals.setMax(f);
        }
        if (this.invokeSuspend != null) {
            for (int i = 0; i < this.invokeSuspend.setMin.size(); i++) {
                this.invokeSuspend.setMin.get(i).setMax(f);
            }
        }
        setOnQueryTextListener setonquerytextlistener = this.getMin;
        if (setonquerytextlistener != null) {
            setonquerytextlistener.setMax(f);
        }
        onKeyPreIme onkeypreime = this.onNavigationEvent;
        if (onkeypreime != null) {
            onkeypreime.getMax(f);
        }
        for (int i2 = 0; i2 < this.setMax.size(); i2++) {
            this.setMax.get(i2).setMax(f);
        }
    }

    private void toFloatRange() {
        if (this.create == null) {
            if (this.ICustomTabsCallback == null) {
                this.create = Collections.emptyList();
                return;
            }
            this.create = new ArrayList();
            for (onKeyPreIme onkeypreime = this.ICustomTabsCallback; onkeypreime != null; onkeypreime = onkeypreime.ICustomTabsCallback) {
                this.create.add(onkeypreime);
            }
        }
    }

    public final String setMin() {
        return this.length.getMin;
    }

    public final void setMax(setMaxWidth setmaxwidth, int i, List<setMaxWidth> list, setMaxWidth setmaxwidth2) {
        onKeyPreIme onkeypreime = this.onNavigationEvent;
        if (onkeypreime != null) {
            setMaxWidth max = setmaxwidth2.setMax(onkeypreime.length.getMin);
            if (setmaxwidth.length(this.onNavigationEvent.length.getMin, i)) {
                onKeyPreIme onkeypreime2 = this.onNavigationEvent;
                setMaxWidth setmaxwidth3 = new setMaxWidth(max);
                setmaxwidth3.getMin = onkeypreime2;
                list.add(setmaxwidth3);
            }
            if (setmaxwidth.setMax(this.length.getMin, i)) {
                this.onNavigationEvent.length(setmaxwidth, setmaxwidth.setMin(this.onNavigationEvent.length.getMin, i) + i, list, max);
            }
        }
        if (setmaxwidth.getMax(this.length.getMin, i)) {
            if (!"__container".equals(this.length.getMin)) {
                setmaxwidth2 = setmaxwidth2.setMax(this.length.getMin);
                if (setmaxwidth.length(this.length.getMin, i)) {
                    setMaxWidth setmaxwidth4 = new setMaxWidth(setmaxwidth2);
                    setmaxwidth4.getMin = this;
                    list.add(setmaxwidth4);
                }
            }
            if (setmaxwidth.setMax(this.length.getMin, i)) {
                length(setmaxwidth, i + setmaxwidth.setMin(this.length.getMin, i), list, setmaxwidth2);
            }
        }
    }

    @CallSuper
    public <T> void length(T t, @Nullable setTitleMarginBottom<T> settitlemarginbottom) {
        this.isInside.setMin(t, settitlemarginbottom);
    }

    public final void setMax() {
        this.getMax.invalidateSelf();
    }
}
