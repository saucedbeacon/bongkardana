package o;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.graphics.drawable.Drawable;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineDataSet;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import o.getShowsDialog;

public final class onHasView extends onDismiss {
    protected Path FastBitmap$CoordinateSystem = new Path();
    private HashMap<EmojiAppCompatTextView, length> Mean$Arithmetic = new HashMap<>();
    protected WeakReference<Bitmap> getMax;
    protected Canvas getMin;
    protected Path hashCode = new Path();
    private float[] invoke = new float[2];
    protected Bitmap.Config length = Bitmap.Config.ARGB_8888;
    protected Paint setMax;
    protected EmojiMetadata$HasGlyph setMin;
    private float[] toDoubleRange = new float[4];
    protected Path values = new Path();

    public final void setMax() {
    }

    public onHasView(EmojiMetadata$HasGlyph emojiMetadata$HasGlyph, setDrawerShadow setdrawershadow, setTargetFragment settargetfragment) {
        super(setdrawershadow, settargetfragment);
        this.setMin = emojiMetadata$HasGlyph;
        Paint paint = new Paint(1);
        this.setMax = paint;
        paint.setStyle(Paint.Style.FILL);
        this.setMax.setColor(-1);
    }

    public final void getMax(Canvas canvas) {
        int invoke2 = (int) this.invokeSuspend.invoke();
        int Grayscale$Algorithm = (int) this.invokeSuspend.Grayscale$Algorithm();
        WeakReference<Bitmap> weakReference = this.getMax;
        Bitmap bitmap = weakReference == null ? null : weakReference.get();
        if (!(bitmap != null && bitmap.getWidth() == invoke2 && bitmap.getHeight() == Grayscale$Algorithm)) {
            if (invoke2 > 0 && Grayscale$Algorithm > 0) {
                bitmap = Bitmap.createBitmap(invoke2, Grayscale$Algorithm, this.length);
                this.getMax = new WeakReference<>(bitmap);
                this.getMin = new Canvas(bitmap);
            } else {
                return;
            }
        }
        bitmap.eraseColor(0);
        for (setMaxEmojiCount setmaxemojicount : this.setMin.getLineData().toIntRange()) {
            if (setmaxemojicount.b() && setmaxemojicount.ICustomTabsCallback() > 0) {
                this.toFloatRange.setStrokeWidth(setmaxemojicount.mayLaunchUrl());
                this.toFloatRange.setPathEffect(setmaxemojicount.asInterface());
                int i = AnonymousClass1.getMax[setmaxemojicount.extraCallback().ordinal()];
                if (i == 3) {
                    setMax(setmaxemojicount);
                } else if (i != 4) {
                    setMin(canvas, setmaxemojicount);
                } else {
                    getMax(setmaxemojicount);
                }
                this.toFloatRange.setPathEffect((PathEffect) null);
            }
        }
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, this.toFloatRange);
    }

    /* renamed from: o.onHasView$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] getMax;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.github.mikephil.charting.data.LineDataSet$Mode[] r0 = com.github.mikephil.charting.data.LineDataSet.Mode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                getMax = r0
                com.github.mikephil.charting.data.LineDataSet$Mode r1 = com.github.mikephil.charting.data.LineDataSet.Mode.LINEAR     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = getMax     // Catch:{ NoSuchFieldError -> 0x001d }
                com.github.mikephil.charting.data.LineDataSet$Mode r1 = com.github.mikephil.charting.data.LineDataSet.Mode.STEPPED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = getMax     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.github.mikephil.charting.data.LineDataSet$Mode r1 = com.github.mikephil.charting.data.LineDataSet.Mode.CUBIC_BEZIER     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = getMax     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.github.mikephil.charting.data.LineDataSet$Mode r1 = com.github.mikephil.charting.data.LineDataSet.Mode.HORIZONTAL_BEZIER     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o.onHasView.AnonymousClass1.<clinit>():void");
        }
    }

    private void getMax(setMaxEmojiCount setmaxemojicount) {
        float length2 = this.equals.length();
        getActivity transformer = this.setMin.getTransformer(setmaxemojicount.getCause());
        this.isInside.getMax(this.setMin, setmaxemojicount);
        this.values.reset();
        if (this.isInside.length > 0) {
            Entry intRange = setmaxemojicount.toIntRange(this.isInside.setMin);
            this.values.moveTo(intRange.length(), intRange.getMin() * length2);
            int i = this.isInside.setMin + 1;
            while (i <= this.isInside.length + this.isInside.setMin) {
                Entry intRange2 = setmaxemojicount.toIntRange(i);
                float length3 = intRange.length() + ((intRange2.length() - intRange.length()) / 2.0f);
                this.values.cubicTo(length3, intRange.getMin() * length2, length3, intRange2.getMin() * length2, intRange2.length(), intRange2.getMin() * length2);
                i++;
                intRange = intRange2;
            }
        }
        if (setmaxemojicount.newSessionWithExtras()) {
            this.hashCode.reset();
            this.hashCode.addPath(this.values);
            setMin(this.getMin, setmaxemojicount, this.hashCode, transformer, this.isInside);
        }
        this.toFloatRange.setColor(setmaxemojicount.length());
        this.toFloatRange.setStyle(Paint.Style.STROKE);
        transformer.setMin(this.values);
        this.getMin.drawPath(this.values, this.toFloatRange);
        this.toFloatRange.setPathEffect((PathEffect) null);
    }

    private void setMax(setMaxEmojiCount setmaxemojicount) {
        setMaxEmojiCount setmaxemojicount2 = setmaxemojicount;
        float length2 = this.equals.length();
        getActivity transformer = this.setMin.getTransformer(setmaxemojicount.getCause());
        this.isInside.getMax(this.setMin, setmaxemojicount2);
        float asBinder = setmaxemojicount.asBinder();
        this.values.reset();
        if (this.isInside.length > 0) {
            int i = this.isInside.setMin + 1;
            Entry intRange = setmaxemojicount2.toIntRange(Math.max(i - 2, 0));
            Entry intRange2 = setmaxemojicount2.toIntRange(Math.max(i - 1, 0));
            if (intRange2 != null) {
                this.values.moveTo(intRange2.length(), intRange2.getMin() * length2);
                Entry entry = intRange2;
                int i2 = this.isInside.setMin + 1;
                int i3 = -1;
                while (i2 <= this.isInside.length + this.isInside.setMin) {
                    if (i3 != i2) {
                        intRange2 = setmaxemojicount2.toIntRange(i2);
                    }
                    int i4 = i2 + 1;
                    if (i4 < setmaxemojicount.ICustomTabsCallback()) {
                        i2 = i4;
                    }
                    Entry intRange3 = setmaxemojicount2.toIntRange(i2);
                    this.values.cubicTo(entry.length() + ((intRange2.length() - intRange.length()) * asBinder), (entry.getMin() + ((intRange2.getMin() - intRange.getMin()) * asBinder)) * length2, intRange2.length() - ((intRange3.length() - entry.length()) * asBinder), (intRange2.getMin() - ((intRange3.getMin() - entry.getMin()) * asBinder)) * length2, intRange2.length(), intRange2.getMin() * length2);
                    intRange = entry;
                    entry = intRange2;
                    intRange2 = intRange3;
                    int i5 = i2;
                    i2 = i4;
                    i3 = i5;
                }
            } else {
                return;
            }
        }
        if (setmaxemojicount.newSessionWithExtras()) {
            this.hashCode.reset();
            this.hashCode.addPath(this.values);
            setMin(this.getMin, setmaxemojicount, this.hashCode, transformer, this.isInside);
        }
        this.toFloatRange.setColor(setmaxemojicount.length());
        this.toFloatRange.setStyle(Paint.Style.STROKE);
        transformer.setMin(this.values);
        this.getMin.drawPath(this.values, this.toFloatRange);
        this.toFloatRange.setPathEffect((PathEffect) null);
    }

    private void setMin(Canvas canvas, setMaxEmojiCount setmaxemojicount, Path path, getActivity getactivity, getShowsDialog.getMax getmax) {
        float max = setmaxemojicount.getInterfaceDescriptor().getMax(setmaxemojicount, this.setMin);
        path.lineTo(setmaxemojicount.toIntRange(getmax.setMin + getmax.length).length(), max);
        path.lineTo(setmaxemojicount.toIntRange(getmax.setMin).length(), max);
        path.close();
        getactivity.setMin(path);
        Drawable extraCommand = setmaxemojicount.extraCommand();
        if (extraCommand != null) {
            getMax(canvas, path, extraCommand);
        } else {
            getMin(canvas, path, setmaxemojicount.newSession(), setmaxemojicount.warmup());
        }
    }

    private void setMin(Canvas canvas, setMaxEmojiCount setmaxemojicount) {
        Canvas canvas2;
        int i;
        Canvas canvas3;
        char c;
        int i2;
        int i3;
        Canvas canvas4 = canvas;
        setMaxEmojiCount setmaxemojicount2 = setmaxemojicount;
        int ICustomTabsCallback = setmaxemojicount.ICustomTabsCallback();
        boolean z = setmaxemojicount.extraCallback() == LineDataSet.Mode.STEPPED;
        int i4 = z ? 4 : 2;
        getActivity transformer = this.setMin.getTransformer(setmaxemojicount.getCause());
        float length2 = this.equals.length();
        this.toFloatRange.setStyle(Paint.Style.STROKE);
        Canvas canvas5 = setmaxemojicount.ICustomTabsCallback$Default() ? this.getMin : canvas4;
        this.isInside.getMax(this.setMin, setmaxemojicount2);
        if (!setmaxemojicount.newSessionWithExtras() || ICustomTabsCallback <= 0) {
            i = ICustomTabsCallback;
            canvas2 = canvas5;
        } else {
            getShowsDialog.getMax getmax = this.isInside;
            Path path = this.FastBitmap$CoordinateSystem;
            int i5 = getmax.setMin;
            int i6 = getmax.length + getmax.setMin;
            int i7 = 0;
            while (true) {
                int i8 = (i7 * 128) + i5;
                int i9 = i8 + 128;
                if (i9 > i6) {
                    i9 = i6;
                }
                if (i8 <= i9) {
                    i3 = i6;
                    float max = setmaxemojicount.getInterfaceDescriptor().getMax(setmaxemojicount2, this.setMin);
                    float length3 = this.equals.length();
                    i2 = i5;
                    i = ICustomTabsCallback;
                    boolean z2 = setmaxemojicount.extraCallback() == LineDataSet.Mode.STEPPED;
                    path.reset();
                    Entry intRange = setmaxemojicount2.toIntRange(i8);
                    canvas2 = canvas5;
                    path.moveTo(intRange.length(), max);
                    path.lineTo(intRange.length(), intRange.getMin() * length3);
                    int i10 = i8 + 1;
                    Entry entry = intRange;
                    Entry entry2 = null;
                    while (i10 <= i9) {
                        entry2 = setmaxemojicount2.toIntRange(i10);
                        boolean z3 = z2;
                        if (z2) {
                            path.lineTo(entry2.length(), entry.getMin() * length3);
                        }
                        path.lineTo(entry2.length(), entry2.getMin() * length3);
                        i10++;
                        entry = entry2;
                        z2 = z3;
                    }
                    if (entry2 != null) {
                        path.lineTo(entry2.length(), max);
                    }
                    path.close();
                    transformer.setMin(path);
                    Drawable extraCommand = setmaxemojicount.extraCommand();
                    if (extraCommand != null) {
                        getMax(canvas4, path, extraCommand);
                    } else {
                        getMin(canvas4, path, setmaxemojicount.newSession(), setmaxemojicount.warmup());
                    }
                } else {
                    i = ICustomTabsCallback;
                    i3 = i6;
                    canvas2 = canvas5;
                    i2 = i5;
                }
                i7++;
                if (i8 > i9) {
                    break;
                }
                i6 = i3;
                i5 = i2;
                ICustomTabsCallback = i;
                canvas5 = canvas2;
            }
        }
        if (setmaxemojicount.setMin().size() > 1) {
            int i11 = i4 * 2;
            if (this.toDoubleRange.length <= i11) {
                this.toDoubleRange = new float[(i4 * 4)];
            }
            int i12 = this.isInside.setMin;
            while (i12 <= this.isInside.length + this.isInside.setMin) {
                Entry intRange2 = setmaxemojicount2.toIntRange(i12);
                if (intRange2 != null) {
                    this.toDoubleRange[0] = intRange2.length();
                    this.toDoubleRange[1] = intRange2.getMin() * length2;
                    if (i12 < this.isInside.getMin) {
                        Entry intRange3 = setmaxemojicount2.toIntRange(i12 + 1);
                        if (intRange3 == null) {
                            break;
                        }
                        if (z) {
                            this.toDoubleRange[2] = intRange3.length();
                            float[] fArr = this.toDoubleRange;
                            fArr[3] = fArr[1];
                            fArr[4] = fArr[2];
                            fArr[5] = fArr[3];
                            fArr[6] = intRange3.length();
                            this.toDoubleRange[7] = intRange3.getMin() * length2;
                        } else {
                            this.toDoubleRange[2] = intRange3.length();
                            this.toDoubleRange[3] = intRange3.getMin() * length2;
                        }
                        c = 0;
                    } else {
                        float[] fArr2 = this.toDoubleRange;
                        c = 0;
                        fArr2[2] = fArr2[0];
                        fArr2[3] = fArr2[1];
                    }
                    transformer.length(this.toDoubleRange);
                    if (!this.invokeSuspend.isInside(this.toDoubleRange[c])) {
                        break;
                    } else if (this.invokeSuspend.toFloatRange(this.toDoubleRange[2]) && (this.invokeSuspend.toIntRange(this.toDoubleRange[1]) || this.invokeSuspend.equals(this.toDoubleRange[3]))) {
                        this.toFloatRange.setColor(setmaxemojicount2.setMax(i12));
                        canvas3 = canvas2;
                        canvas3.drawLines(this.toDoubleRange, 0, i11, this.toFloatRange);
                        i12++;
                        canvas2 = canvas3;
                    }
                }
                canvas3 = canvas2;
                i12++;
                canvas2 = canvas3;
            }
        } else {
            Canvas canvas6 = canvas2;
            int i13 = i * i4;
            if (this.toDoubleRange.length < Math.max(i13, i4) * 2) {
                this.toDoubleRange = new float[(Math.max(i13, i4) * 4)];
            }
            if (setmaxemojicount2.toIntRange(this.isInside.setMin) != null) {
                int i14 = this.isInside.setMin;
                int i15 = 0;
                while (i14 <= this.isInside.length + this.isInside.setMin) {
                    Entry intRange4 = setmaxemojicount2.toIntRange(i14 == 0 ? 0 : i14 - 1);
                    Entry intRange5 = setmaxemojicount2.toIntRange(i14);
                    if (!(intRange4 == null || intRange5 == null)) {
                        int i16 = i15 + 1;
                        this.toDoubleRange[i15] = intRange4.length();
                        int i17 = i16 + 1;
                        this.toDoubleRange[i16] = intRange4.getMin() * length2;
                        if (z) {
                            int i18 = i17 + 1;
                            this.toDoubleRange[i17] = intRange5.length();
                            int i19 = i18 + 1;
                            this.toDoubleRange[i18] = intRange4.getMin() * length2;
                            int i20 = i19 + 1;
                            this.toDoubleRange[i19] = intRange5.length();
                            i17 = i20 + 1;
                            this.toDoubleRange[i20] = intRange4.getMin() * length2;
                        }
                        int i21 = i17 + 1;
                        this.toDoubleRange[i17] = intRange5.length();
                        this.toDoubleRange[i21] = intRange5.getMin() * length2;
                        i15 = i21 + 1;
                    }
                    i14++;
                }
                if (i15 > 0) {
                    transformer.length(this.toDoubleRange);
                    this.toFloatRange.setColor(setmaxemojicount.length());
                    canvas6.drawLines(this.toDoubleRange, 0, Math.max((this.isInside.length + 1) * i4, i4) * 2, this.toFloatRange);
                }
            }
        }
        this.toFloatRange.setPathEffect((PathEffect) null);
    }

    public final void setMax(Canvas canvas) {
        if (length((setValue) this.setMin)) {
            List intRange = this.setMin.getLineData().toIntRange();
            for (int i = 0; i < intRange.size(); i++) {
                setMaxEmojiCount setmaxemojicount = (setMaxEmojiCount) intRange.get(i);
                if (!getMin(setmaxemojicount) || setmaxemojicount.ICustomTabsCallback() <= 0) {
                    Canvas canvas2 = canvas;
                } else {
                    length((EmojiAppCompatTextView) setmaxemojicount);
                    getActivity transformer = this.setMin.getTransformer(setmaxemojicount.getCause());
                    int ICustomTabsCallback$Stub = (int) (setmaxemojicount.ICustomTabsCallback$Stub() * 1.75f);
                    if (!setmaxemojicount.setDefaultImpl()) {
                        ICustomTabsCallback$Stub /= 2;
                    }
                    int i2 = ICustomTabsCallback$Stub;
                    this.isInside.getMax(this.setMin, setmaxemojicount);
                    float[] length2 = transformer.length(setmaxemojicount, this.equals.getMin(), this.equals.length(), this.isInside.setMin, this.isInside.getMin);
                    closeDrawers floatRange = setmaxemojicount.toFloatRange();
                    setArguments max = setArguments.setMax(setmaxemojicount.onNavigationEvent());
                    max.length = getTargetFragment.setMax(max.length);
                    max.getMin = getTargetFragment.setMax(max.getMin);
                    for (int i3 = 0; i3 < length2.length; i3 += 2) {
                        float f = length2[i3];
                        float f2 = length2[i3 + 1];
                        if (!this.invokeSuspend.isInside(f)) {
                            break;
                        }
                        if (!this.invokeSuspend.toFloatRange(f) || !this.invokeSuspend.IsOverlapping(f2)) {
                            Canvas canvas3 = canvas;
                        } else {
                            int i4 = i3 / 2;
                            Entry intRange2 = setmaxemojicount.toIntRange(this.isInside.setMin + i4);
                            if (setmaxemojicount.Mean$Arithmetic()) {
                                this.toString.setColor(setmaxemojicount.getMin(i4));
                                canvas.drawText(floatRange.getMin(intRange2.getMin()), f, f2 - ((float) i2), this.toString);
                            } else {
                                Canvas canvas4 = canvas;
                            }
                            if (intRange2.equals != null && setmaxemojicount.create()) {
                                Drawable drawable = intRange2.equals;
                                getTargetFragment.setMax(canvas, drawable, (int) (f + max.length), (int) (f2 + max.getMin), drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
                            }
                        }
                    }
                    Canvas canvas5 = canvas;
                    setArguments.setMin(max);
                }
            }
        }
    }

    public final void setMax(Canvas canvas, addFocusables[] addfocusablesArr) {
        findOpenDrawer lineData = this.setMin.getLineData();
        for (addFocusables addfocusables : addfocusablesArr) {
            setMaxEmojiCount setmaxemojicount = (setMaxEmojiCount) lineData.setMin(addfocusables.equals);
            if (setmaxemojicount != null && setmaxemojicount.toIntRange()) {
                Entry length2 = setmaxemojicount.length(addfocusables.setMax, addfocusables.getMin);
                if (setMax(length2, setmaxemojicount)) {
                    isStateSaved max = this.setMin.getTransformer(setmaxemojicount.getCause()).getMax(length2.length(), length2.getMin() * this.equals.length());
                    addfocusables.isInside = (float) max.length;
                    addfocusables.IsOverlapping = (float) max.getMin;
                    getMin(canvas, (float) max.length, (float) max.getMin, setmaxemojicount);
                }
            }
        }
    }

    public final void getMin() {
        Canvas canvas = this.getMin;
        if (canvas != null) {
            canvas.setBitmap((Bitmap) null);
            this.getMin = null;
        }
        WeakReference<Bitmap> weakReference = this.getMax;
        if (weakReference != null) {
            Bitmap bitmap = weakReference.get();
            if (bitmap != null) {
                bitmap.recycle();
            }
            this.getMax.clear();
            this.getMax = null;
        }
    }

    class length {
        private Path getMax;
        Bitmap[] getMin;

        private length() {
            this.getMax = new Path();
        }

        /* synthetic */ length(onHasView onhasview, byte b) {
            this();
        }

        /* access modifiers changed from: protected */
        public final boolean setMin(setMaxEmojiCount setmaxemojicount) {
            int defaultImpl = setmaxemojicount.getDefaultImpl();
            Bitmap[] bitmapArr = this.getMin;
            if (bitmapArr == null) {
                this.getMin = new Bitmap[defaultImpl];
                return true;
            } else if (bitmapArr.length == defaultImpl) {
                return false;
            } else {
                this.getMin = new Bitmap[defaultImpl];
                return true;
            }
        }

        /* access modifiers changed from: protected */
        public final void length(setMaxEmojiCount setmaxemojicount, boolean z, boolean z2) {
            int defaultImpl = setmaxemojicount.getDefaultImpl();
            float ICustomTabsCallback$Stub = setmaxemojicount.ICustomTabsCallback$Stub();
            float onTransact = setmaxemojicount.onTransact();
            for (int i = 0; i < defaultImpl; i++) {
                Bitmap.Config config = Bitmap.Config.ARGB_4444;
                double d = (double) ICustomTabsCallback$Stub;
                Double.isNaN(d);
                int i2 = (int) (d * 2.1d);
                Bitmap createBitmap = Bitmap.createBitmap(i2, i2, config);
                Canvas canvas = new Canvas(createBitmap);
                this.getMin[i] = createBitmap;
                onHasView.this.toFloatRange.setColor(setmaxemojicount.equals(i));
                if (z2) {
                    this.getMax.reset();
                    this.getMax.addCircle(ICustomTabsCallback$Stub, ICustomTabsCallback$Stub, ICustomTabsCallback$Stub, Path.Direction.CW);
                    this.getMax.addCircle(ICustomTabsCallback$Stub, ICustomTabsCallback$Stub, onTransact, Path.Direction.CCW);
                    canvas.drawPath(this.getMax, onHasView.this.toFloatRange);
                } else {
                    canvas.drawCircle(ICustomTabsCallback$Stub, ICustomTabsCallback$Stub, ICustomTabsCallback$Stub, onHasView.this.toFloatRange);
                    if (z) {
                        canvas.drawCircle(ICustomTabsCallback$Stub, ICustomTabsCallback$Stub, onTransact, onHasView.this.setMax);
                    }
                }
            }
        }
    }

    public final void setMin(Canvas canvas) {
        length length2;
        Bitmap bitmap;
        this.toFloatRange.setStyle(Paint.Style.FILL);
        float length3 = this.equals.length();
        float[] fArr = this.invoke;
        float f = 0.0f;
        byte b = 0;
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        List intRange = this.setMin.getLineData().toIntRange();
        int i = 0;
        while (i < intRange.size()) {
            setMaxEmojiCount setmaxemojicount = (setMaxEmojiCount) intRange.get(i);
            if (setmaxemojicount.b() && setmaxemojicount.setDefaultImpl() && setmaxemojicount.ICustomTabsCallback() != 0) {
                this.setMax.setColor(setmaxemojicount.ICustomTabsService());
                getActivity transformer = this.setMin.getTransformer(setmaxemojicount.getCause());
                this.isInside.getMax(this.setMin, setmaxemojicount);
                float ICustomTabsCallback$Stub = setmaxemojicount.ICustomTabsCallback$Stub();
                float onTransact = setmaxemojicount.onTransact();
                boolean z = setmaxemojicount.ICustomTabsCallback$Stub$Proxy() && onTransact < ICustomTabsCallback$Stub && onTransact > f;
                boolean z2 = z && setmaxemojicount.ICustomTabsService() == 1122867;
                if (this.Mean$Arithmetic.containsKey(setmaxemojicount)) {
                    length2 = this.Mean$Arithmetic.get(setmaxemojicount);
                } else {
                    length2 = new length(this, b);
                    this.Mean$Arithmetic.put(setmaxemojicount, length2);
                }
                if (length2.setMin(setmaxemojicount)) {
                    length2.length(setmaxemojicount, z, z2);
                }
                int i2 = this.isInside.length + this.isInside.setMin;
                int i3 = this.isInside.setMin;
                while (i3 <= i2) {
                    Entry intRange2 = setmaxemojicount.toIntRange(i3);
                    if (intRange2 == null) {
                        break;
                    }
                    this.invoke[b] = intRange2.length();
                    this.invoke[1] = intRange2.getMin() * length3;
                    transformer.length(this.invoke);
                    if (!this.invokeSuspend.isInside(this.invoke[b])) {
                        break;
                    }
                    if (!this.invokeSuspend.toFloatRange(this.invoke[b]) || !this.invokeSuspend.IsOverlapping(this.invoke[1]) || (bitmap = length2.getMin[i3 % length2.getMin.length]) == null) {
                        Canvas canvas2 = canvas;
                    } else {
                        float[] fArr2 = this.invoke;
                        canvas.drawBitmap(bitmap, fArr2[b] - ICustomTabsCallback$Stub, fArr2[1] - ICustomTabsCallback$Stub, (Paint) null);
                    }
                    i3++;
                    b = 0;
                }
            }
            Canvas canvas3 = canvas;
            i++;
            f = 0.0f;
            b = 0;
        }
    }
}
