package o;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import androidx.annotation.Nullable;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.DocumentData;
import com.airbnb.lottie.model.layer.Layer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import o.PlaybackStateCompat;

public final class getSwitchMinWidth extends onKeyPreIme {
    private final Paint FastBitmap$CoordinateSystem = new Paint() {
        {
            setStyle(Paint.Style.STROKE);
        }
    };
    @Nullable
    private setInputType<Integer, Integer> Grayscale$Algorithm;
    @Nullable
    private setInputType<Float, Float> ICustomTabsCallback;
    private final Matrix IsOverlapping = new Matrix();
    private final LottieDrawable Mean$Arithmetic;
    @Nullable
    private setInputType<Integer, Integer> b;
    @Nullable
    private setInputType<Float, Float> create;
    private final StringBuilder equals = new StringBuilder(2);
    @Nullable
    private setInputType<Float, Float> getCause;
    private final Map<setQueryRefinementEnabled, List<createTabView>> hashCode = new HashMap();
    private final setVerticalGravity invoke;
    @Nullable
    private setInputType<Integer, Integer> invokeSuspend;
    @Nullable
    private setInputType<Float, Float> onNavigationEvent;
    @Nullable
    private setInputType<Float, Float> onPostMessage;
    @Nullable
    private setInputType<Float, Float> onRelationshipValidationResult;
    private final Paint toDoubleRange = new Paint() {
        {
            setStyle(Paint.Style.FILL);
        }
    };
    private final RectF toIntRange = new RectF();
    private final PlaybackStateCompat.ShuffleMode<String> toString = new PlaybackStateCompat.ShuffleMode<>();
    @Nullable
    private setInputType<Integer, Integer> valueOf;
    private final setIconified values;

    getSwitchMinWidth(LottieDrawable lottieDrawable, Layer layer) {
        super(lottieDrawable, layer);
        this.Mean$Arithmetic = lottieDrawable;
        this.invoke = layer.getMax;
        setIconified seticonified = new setIconified(layer.invoke.setMin);
        this.values = seticonified;
        seticonified.getMin.add(this);
        setIconified seticonified2 = this.values;
        if (seticonified2 != null) {
            this.setMax.add(seticonified2);
        }
        adjustDropDownSizeAndPosition adjustdropdownsizeandposition = layer.Mean$Arithmetic;
        if (!(adjustdropdownsizeandposition == null || adjustdropdownsizeandposition.setMin == null)) {
            getInputType getinputtype = new getInputType(adjustdropdownsizeandposition.setMin.setMin);
            this.valueOf = getinputtype;
            getinputtype.getMin.add(this);
            setInputType<Integer, Integer> setinputtype = this.valueOf;
            if (setinputtype != null) {
                this.setMax.add(setinputtype);
            }
        }
        if (!(adjustdropdownsizeandposition == null || adjustdropdownsizeandposition.setMax == null)) {
            getInputType getinputtype2 = new getInputType(adjustdropdownsizeandposition.setMax.setMin);
            this.Grayscale$Algorithm = getinputtype2;
            getinputtype2.getMin.add(this);
            setInputType<Integer, Integer> setinputtype2 = this.Grayscale$Algorithm;
            if (setinputtype2 != null) {
                this.setMax.add(setinputtype2);
            }
        }
        if (!(adjustdropdownsizeandposition == null || adjustdropdownsizeandposition.getMin == null)) {
            setOnQueryTextListener setonquerytextlistener = new setOnQueryTextListener(adjustdropdownsizeandposition.getMin.setMin);
            this.getCause = setonquerytextlistener;
            setonquerytextlistener.getMin.add(this);
            setInputType<Float, Float> setinputtype3 = this.getCause;
            if (setinputtype3 != null) {
                this.setMax.add(setinputtype3);
            }
        }
        if (adjustdropdownsizeandposition != null && adjustdropdownsizeandposition.getMax != null) {
            setOnQueryTextListener setonquerytextlistener2 = new setOnQueryTextListener(adjustdropdownsizeandposition.getMax.setMin);
            this.ICustomTabsCallback = setonquerytextlistener2;
            setonquerytextlistener2.getMin.add(this);
            setInputType<Float, Float> setinputtype4 = this.ICustomTabsCallback;
            if (setinputtype4 != null) {
                this.setMax.add(setinputtype4);
            }
        }
    }

    public final void setMin(RectF rectF, Matrix matrix, boolean z) {
        super.setMin(rectF, matrix, z);
        rectF.set(0.0f, 0.0f, (float) this.invoke.equals.width(), (float) this.invoke.equals.height());
    }

    /* access modifiers changed from: package-private */
    public final void getMin(Canvas canvas, Matrix matrix, int i) {
        float f;
        int i2;
        int i3;
        String str;
        List list;
        float floatValue;
        int i4;
        float f2;
        String str2;
        Canvas canvas2 = canvas;
        Matrix matrix2 = matrix;
        canvas.save();
        if (!this.Mean$Arithmetic.toDoubleRange()) {
            canvas.concat(matrix);
        }
        DocumentData documentData = (DocumentData) this.values.equals();
        getSuggestionsAdapter getsuggestionsadapter = this.invoke.getMin.get(documentData.getMin);
        if (getsuggestionsadapter == null) {
            canvas.restore();
            return;
        }
        setInputType<Integer, Integer> setinputtype = this.invokeSuspend;
        if (setinputtype != null) {
            this.toDoubleRange.setColor(setinputtype.equals().intValue());
        } else {
            setInputType<Integer, Integer> setinputtype2 = this.valueOf;
            if (setinputtype2 != null) {
                this.toDoubleRange.setColor(setinputtype2.equals().intValue());
            } else {
                this.toDoubleRange.setColor(documentData.IsOverlapping);
            }
        }
        setInputType<Integer, Integer> setinputtype3 = this.b;
        if (setinputtype3 != null) {
            this.FastBitmap$CoordinateSystem.setColor(setinputtype3.equals().intValue());
        } else {
            setInputType<Integer, Integer> setinputtype4 = this.Grayscale$Algorithm;
            if (setinputtype4 != null) {
                this.FastBitmap$CoordinateSystem.setColor(setinputtype4.equals().intValue());
            } else {
                this.FastBitmap$CoordinateSystem.setColor(documentData.toIntRange);
            }
        }
        int intValue = ((this.isInside.setMax == null ? 100 : this.isInside.setMax.equals().intValue()) * 255) / 100;
        this.toDoubleRange.setAlpha(intValue);
        this.FastBitmap$CoordinateSystem.setAlpha(intValue);
        setInputType<Float, Float> setinputtype5 = this.create;
        if (setinputtype5 != null) {
            this.FastBitmap$CoordinateSystem.setStrokeWidth(setinputtype5.equals().floatValue());
        } else {
            setInputType<Float, Float> setinputtype6 = this.getCause;
            if (setinputtype6 != null) {
                this.FastBitmap$CoordinateSystem.setStrokeWidth(setinputtype6.equals().floatValue());
            } else {
                this.FastBitmap$CoordinateSystem.setStrokeWidth(documentData.isInside * setTitleMarginStart.getMax() * setTitleMarginStart.getMin(matrix));
            }
        }
        if (this.Mean$Arithmetic.toDoubleRange()) {
            setInputType<Float, Float> setinputtype7 = this.onRelationshipValidationResult;
            if (setinputtype7 != null) {
                f = setinputtype7.equals().floatValue();
            } else {
                setInputType<Float, Float> setinputtype8 = this.onPostMessage;
                if (setinputtype8 != null) {
                    f = setinputtype8.equals().floatValue();
                } else {
                    f = documentData.length;
                }
            }
            float f3 = f / 100.0f;
            float min = setTitleMarginStart.getMin(matrix);
            String str3 = documentData.setMin;
            float max = documentData.equals * setTitleMarginStart.getMax();
            List asList = Arrays.asList(str3.replaceAll("\r\n", "\r").replaceAll("\n", "\r").split("\r"));
            int size = asList.size();
            char c = 0;
            int i5 = 0;
            while (i5 < size) {
                String str4 = (String) asList.get(i5);
                int i6 = 0;
                float f4 = 0.0f;
                while (i6 < str4.length()) {
                    List list2 = asList;
                    setQueryRefinementEnabled min2 = this.invoke.toFloatRange.setMin(((((str4.charAt(i6) + c) * 31) + getsuggestionsadapter.length.hashCode()) * 31) + getsuggestionsadapter.getMin.hashCode());
                    if (min2 != null) {
                        double d = (double) f4;
                        f2 = max;
                        double d2 = min2.setMax;
                        str2 = str4;
                        i4 = i5;
                        double d3 = (double) f3;
                        Double.isNaN(d3);
                        double d4 = d2 * d3;
                        double max2 = (double) setTitleMarginStart.getMax();
                        Double.isNaN(max2);
                        double d5 = d4 * max2;
                        double d6 = (double) min;
                        Double.isNaN(d6);
                        Double.isNaN(d);
                        f4 = (float) (d + (d5 * d6));
                    } else {
                        f2 = max;
                        i4 = i5;
                        str2 = str4;
                    }
                    i6++;
                    str4 = str2;
                    asList = list2;
                    max = f2;
                    i5 = i4;
                    c = 0;
                    Matrix matrix3 = matrix;
                }
                List list3 = asList;
                float f5 = max;
                String str5 = str4;
                canvas.save();
                setMax(documentData.getMax, canvas2, f4);
                int i7 = i5;
                canvas2.translate(0.0f, (((float) i7) * f5) - ((((float) (size - 1)) * f5) / 2.0f));
                if (str5 != null) {
                    i2 = str5.length();
                } else {
                    i2 = 0;
                }
                int max3 = dispatchOnCancelled.setMax(i2);
                if (i2 != max3) {
                    onCanceled oncanceled = new onCanceled(i2, max3, 1);
                    onCancelLoad.setMax(-896377687, oncanceled);
                    onCancelLoad.getMin(-896377687, oncanceled);
                }
                int i8 = 0;
                while (i8 < str5.length()) {
                    setQueryRefinementEnabled min3 = this.invoke.toFloatRange.setMin(((((str5.charAt(i8) + 0) * 31) + getsuggestionsadapter.length.hashCode()) * 31) + getsuggestionsadapter.getMin.hashCode());
                    if (min3 != null) {
                        if (this.hashCode.containsKey(min3)) {
                            list = this.hashCode.get(min3);
                            str = str5;
                            i3 = size;
                        } else {
                            List<showSoftInputIfNecessary> list4 = min3.setMin;
                            int size2 = list4.size();
                            ArrayList arrayList = new ArrayList(size2);
                            int i9 = 0;
                            while (i9 < size2) {
                                arrayList.add(new createTabView(this.Mean$Arithmetic, this, list4.get(i9)));
                                i9++;
                                str5 = str5;
                                size = size;
                            }
                            str = str5;
                            i3 = size;
                            this.hashCode.put(min3, arrayList);
                            list = arrayList;
                        }
                        for (int i10 = 0; i10 < list.size(); i10++) {
                            Path max4 = ((createTabView) list.get(i10)).getMax();
                            max4.computeBounds(this.toIntRange, false);
                            this.IsOverlapping.set(matrix);
                            this.IsOverlapping.preTranslate(0.0f, (-documentData.toFloatRange) * setTitleMarginStart.getMax());
                            this.IsOverlapping.preScale(f3, f3);
                            max4.transform(this.IsOverlapping);
                            if (documentData.hashCode) {
                                getMax(max4, this.toDoubleRange, canvas2);
                                getMax(max4, this.FastBitmap$CoordinateSystem, canvas2);
                            } else {
                                getMax(max4, this.FastBitmap$CoordinateSystem, canvas2);
                                getMax(max4, this.toDoubleRange, canvas2);
                            }
                        }
                        Matrix matrix4 = matrix;
                        float max5 = ((float) min3.setMax) * f3 * setTitleMarginStart.getMax() * min;
                        float f6 = ((float) documentData.setMax) / 10.0f;
                        setInputType<Float, Float> setinputtype9 = this.onNavigationEvent;
                        if (setinputtype9 != null) {
                            floatValue = setinputtype9.equals().floatValue();
                        } else {
                            setInputType<Float, Float> setinputtype10 = this.ICustomTabsCallback;
                            if (setinputtype10 != null) {
                                floatValue = setinputtype10.equals().floatValue();
                            }
                            canvas2.translate(max5 + (f6 * min), 0.0f);
                        }
                        f6 += floatValue;
                        canvas2.translate(max5 + (f6 * min), 0.0f);
                    } else {
                        Matrix matrix5 = matrix;
                        str = str5;
                        i3 = size;
                    }
                    i8++;
                    str5 = str;
                    size = i3;
                }
                int i11 = size;
                canvas.restore();
                i5 = i7 + 1;
                Matrix matrix6 = matrix;
                asList = list3;
                max = f5;
                c = 0;
            }
        } else {
            getMax(documentData, getsuggestionsadapter, matrix2, canvas2);
        }
        canvas.restore();
    }

    /* JADX WARNING: Removed duplicated region for block: B:55:0x0156 A[LOOP:0: B:54:0x0154->B:55:0x0156, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void getMax(com.airbnb.lottie.model.DocumentData r8, o.getSuggestionsAdapter r9, android.graphics.Matrix r10, android.graphics.Canvas r11) {
        /*
            r7 = this;
            o.setTitleMarginStart.getMin((android.graphics.Matrix) r10)
            com.airbnb.lottie.LottieDrawable r10 = r7.Mean$Arithmetic
            java.lang.String r0 = r9.length
            java.lang.String r9 = r9.getMin
            android.graphics.drawable.Drawable$Callback r1 = r10.getCallback()
            r2 = 0
            if (r1 != 0) goto L_0x0012
            r10 = r2
            goto L_0x0025
        L_0x0012:
            o.isIconfiedByDefault r1 = r10.hashCode
            if (r1 != 0) goto L_0x0023
            o.isIconfiedByDefault r1 = new o.isIconfiedByDefault
            android.graphics.drawable.Drawable$Callback r3 = r10.getCallback()
            o.setOrientation r4 = r10.values
            r1.<init>(r3, r4)
            r10.hashCode = r1
        L_0x0023:
            o.isIconfiedByDefault r10 = r10.hashCode
        L_0x0025:
            r1 = 0
            r3 = 1
            if (r10 == 0) goto L_0x0093
            o.onSubmitQuery<java.lang.String> r2 = r10.setMax
            r2.length = r0
            r2.getMin = r9
            java.util.Map<o.onSubmitQuery<java.lang.String>, android.graphics.Typeface> r2 = r10.getMax
            o.onSubmitQuery<java.lang.String> r4 = r10.setMax
            java.lang.Object r2 = r2.get(r4)
            android.graphics.Typeface r2 = (android.graphics.Typeface) r2
            if (r2 == 0) goto L_0x003c
            goto L_0x0093
        L_0x003c:
            java.util.Map<java.lang.String, android.graphics.Typeface> r2 = r10.length
            java.lang.Object r2 = r2.get(r0)
            android.graphics.Typeface r2 = (android.graphics.Typeface) r2
            if (r2 == 0) goto L_0x0047
            goto L_0x0065
        L_0x0047:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = "fonts/"
            r2.<init>(r4)
            r2.append(r0)
            java.lang.String r4 = r10.isInside
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            android.content.res.AssetManager r4 = r10.setMin
            android.graphics.Typeface r2 = android.graphics.Typeface.createFromAsset(r4, r2)
            java.util.Map<java.lang.String, android.graphics.Typeface> r4 = r10.length
            r4.put(r0, r2)
        L_0x0065:
            java.lang.String r0 = "Italic"
            boolean r0 = r9.contains(r0)
            java.lang.String r4 = "Bold"
            boolean r9 = r9.contains(r4)
            if (r0 == 0) goto L_0x0077
            if (r9 == 0) goto L_0x0077
            r9 = 3
            goto L_0x0080
        L_0x0077:
            if (r0 == 0) goto L_0x007b
            r9 = 2
            goto L_0x0080
        L_0x007b:
            if (r9 == 0) goto L_0x007f
            r9 = 1
            goto L_0x0080
        L_0x007f:
            r9 = 0
        L_0x0080:
            int r0 = r2.getStyle()
            if (r0 != r9) goto L_0x0087
            goto L_0x008c
        L_0x0087:
            android.graphics.Typeface r9 = android.graphics.Typeface.create(r2, r9)
            r2 = r9
        L_0x008c:
            java.util.Map<o.onSubmitQuery<java.lang.String>, android.graphics.Typeface> r9 = r10.getMax
            o.onSubmitQuery<java.lang.String> r10 = r10.setMax
            r9.put(r10, r2)
        L_0x0093:
            if (r2 != 0) goto L_0x0096
            return
        L_0x0096:
            java.lang.String r9 = r8.setMin
            com.airbnb.lottie.LottieDrawable r10 = r7.Mean$Arithmetic
            o.ScrollingTabContainerView r10 = r10.toDoubleRange
            if (r10 == 0) goto L_0x00bc
            boolean r0 = r10.getMax
            if (r0 == 0) goto L_0x00b3
            java.util.Map<java.lang.String, java.lang.String> r0 = r10.length
            boolean r0 = r0.containsKey(r9)
            if (r0 == 0) goto L_0x00b3
            java.util.Map<java.lang.String, java.lang.String> r10 = r10.length
            java.lang.Object r9 = r10.get(r9)
            java.lang.String r9 = (java.lang.String) r9
            goto L_0x00bc
        L_0x00b3:
            boolean r0 = r10.getMax
            if (r0 == 0) goto L_0x00bc
            java.util.Map<java.lang.String, java.lang.String> r10 = r10.length
            r10.put(r9, r9)
        L_0x00bc:
            android.graphics.Paint r10 = r7.toDoubleRange
            r10.setTypeface(r2)
            o.setInputType<java.lang.Float, java.lang.Float> r10 = r7.onRelationshipValidationResult
            if (r10 == 0) goto L_0x00d0
            java.lang.Object r10 = r10.equals()
            java.lang.Float r10 = (java.lang.Float) r10
            float r10 = r10.floatValue()
            goto L_0x00e1
        L_0x00d0:
            o.setInputType<java.lang.Float, java.lang.Float> r10 = r7.onPostMessage
            if (r10 == 0) goto L_0x00df
            java.lang.Object r10 = r10.equals()
            java.lang.Float r10 = (java.lang.Float) r10
            float r10 = r10.floatValue()
            goto L_0x00e1
        L_0x00df:
            float r10 = r8.length
        L_0x00e1:
            android.graphics.Paint r0 = r7.toDoubleRange
            float r2 = o.setTitleMarginStart.getMax()
            float r2 = r2 * r10
            r0.setTextSize(r2)
            android.graphics.Paint r0 = r7.FastBitmap$CoordinateSystem
            android.graphics.Paint r2 = r7.toDoubleRange
            android.graphics.Typeface r2 = r2.getTypeface()
            r0.setTypeface(r2)
            android.graphics.Paint r0 = r7.FastBitmap$CoordinateSystem
            android.graphics.Paint r2 = r7.toDoubleRange
            float r2 = r2.getTextSize()
            r0.setTextSize(r2)
            float r0 = r8.equals
            float r2 = o.setTitleMarginStart.getMax()
            float r0 = r0 * r2
            int r2 = r8.setMax
            float r2 = (float) r2
            r4 = 1092616192(0x41200000, float:10.0)
            float r2 = r2 / r4
            o.setInputType<java.lang.Float, java.lang.Float> r4 = r7.onNavigationEvent
            if (r4 == 0) goto L_0x0120
            java.lang.Object r4 = r4.equals()
            java.lang.Float r4 = (java.lang.Float) r4
            float r4 = r4.floatValue()
        L_0x011e:
            float r2 = r2 + r4
            goto L_0x012f
        L_0x0120:
            o.setInputType<java.lang.Float, java.lang.Float> r4 = r7.ICustomTabsCallback
            if (r4 == 0) goto L_0x012f
            java.lang.Object r4 = r4.equals()
            java.lang.Float r4 = (java.lang.Float) r4
            float r4 = r4.floatValue()
            goto L_0x011e
        L_0x012f:
            float r4 = o.setTitleMarginStart.getMax()
            float r2 = r2 * r4
            float r2 = r2 * r10
            r10 = 1120403456(0x42c80000, float:100.0)
            float r2 = r2 / r10
            java.lang.String r10 = "\r"
            java.lang.String r4 = "\r\n"
            java.lang.String r9 = r9.replaceAll(r4, r10)
            java.lang.String r4 = "\n"
            java.lang.String r9 = r9.replaceAll(r4, r10)
            java.lang.String[] r9 = r9.split(r10)
            java.util.List r9 = java.util.Arrays.asList(r9)
            int r10 = r9.size()
        L_0x0154:
            if (r1 >= r10) goto L_0x018c
            java.lang.Object r4 = r9.get(r1)
            java.lang.String r4 = (java.lang.String) r4
            android.graphics.Paint r5 = r7.FastBitmap$CoordinateSystem
            float r5 = r5.measureText(r4)
            int r6 = r4.length()
            int r6 = r6 - r3
            float r6 = (float) r6
            float r6 = r6 * r2
            float r5 = r5 + r6
            r11.save()
            com.airbnb.lottie.model.DocumentData$Justification r6 = r8.getMax
            setMax(r6, r11, r5)
            int r5 = r10 + -1
            float r5 = (float) r5
            float r5 = r5 * r0
            r6 = 1073741824(0x40000000, float:2.0)
            float r5 = r5 / r6
            float r6 = (float) r1
            float r6 = r6 * r0
            float r6 = r6 - r5
            r5 = 0
            r11.translate(r5, r6)
            r7.setMin(r4, r8, r11, r2)
            r11.restore()
            int r1 = r1 + 1
            goto L_0x0154
        L_0x018c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getSwitchMinWidth.getMax(com.airbnb.lottie.model.DocumentData, o.getSuggestionsAdapter, android.graphics.Matrix, android.graphics.Canvas):void");
    }

    private void setMin(String str, DocumentData documentData, Canvas canvas, float f) {
        String str2;
        int i = 0;
        while (i < str.length()) {
            int codePointAt = str.codePointAt(i);
            int charCount = Character.charCount(codePointAt) + i;
            while (charCount < str.length()) {
                int codePointAt2 = str.codePointAt(charCount);
                if (!setMax(codePointAt2)) {
                    break;
                }
                charCount += Character.charCount(codePointAt2);
                codePointAt = (codePointAt * 31) + codePointAt2;
            }
            long j = (long) codePointAt;
            if (this.toString.setMin(j)) {
                str2 = this.toString.getMax(j, null);
            } else {
                this.equals.setLength(0);
                int i2 = i;
                while (i2 < charCount) {
                    int codePointAt3 = str.codePointAt(i2);
                    this.equals.appendCodePoint(codePointAt3);
                    i2 += Character.charCount(codePointAt3);
                }
                str2 = this.equals.toString();
                this.toString.setMax(j, str2);
            }
            i += str2.length();
            if (documentData.hashCode) {
                setMin(str2, this.toDoubleRange, canvas);
                setMin(str2, this.FastBitmap$CoordinateSystem, canvas);
            } else {
                setMin(str2, this.FastBitmap$CoordinateSystem, canvas);
                setMin(str2, this.toDoubleRange, canvas);
            }
            canvas.translate(this.toDoubleRange.measureText(str2) + f, 0.0f);
        }
    }

    /* renamed from: o.getSwitchMinWidth$5  reason: invalid class name */
    static /* synthetic */ class AnonymousClass5 {
        static final /* synthetic */ int[] length;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.airbnb.lottie.model.DocumentData$Justification[] r0 = com.airbnb.lottie.model.DocumentData.Justification.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                length = r0
                com.airbnb.lottie.model.DocumentData$Justification r1 = com.airbnb.lottie.model.DocumentData.Justification.LEFT_ALIGN     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = length     // Catch:{ NoSuchFieldError -> 0x001d }
                com.airbnb.lottie.model.DocumentData$Justification r1 = com.airbnb.lottie.model.DocumentData.Justification.RIGHT_ALIGN     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = length     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.airbnb.lottie.model.DocumentData$Justification r1 = com.airbnb.lottie.model.DocumentData.Justification.CENTER     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o.getSwitchMinWidth.AnonymousClass5.<clinit>():void");
        }
    }

    private static void setMax(DocumentData.Justification justification, Canvas canvas, float f) {
        int i = AnonymousClass5.length[justification.ordinal()];
        if (i == 2) {
            canvas.translate(-f, 0.0f);
        } else if (i == 3) {
            canvas.translate((-f) / 2.0f, 0.0f);
        }
    }

    private static void getMax(Path path, Paint paint, Canvas canvas) {
        if (paint.getColor() != 0) {
            if (paint.getStyle() != Paint.Style.STROKE || paint.getStrokeWidth() != 0.0f) {
                canvas.drawPath(path, paint);
            }
        }
    }

    private static void setMin(String str, Paint paint, Canvas canvas) {
        if (paint.getColor() != 0) {
            if (paint.getStyle() != Paint.Style.STROKE || paint.getStrokeWidth() != 0.0f) {
                canvas.drawText(str, 0, str.length(), 0.0f, 0.0f, paint);
            }
        }
    }

    private static boolean setMax(int i) {
        return Character.getType(i) == 16 || Character.getType(i) == 27 || Character.getType(i) == 6 || Character.getType(i) == 28 || Character.getType(i) == 19;
    }

    public final <T> void length(T t, @Nullable setTitleMarginBottom<T> settitlemarginbottom) {
        super.length(t, settitlemarginbottom);
        if (t == MenuPopupWindow$MenuDropDownListView.setMin) {
            setInputType<Integer, Integer> setinputtype = this.invokeSuspend;
            if (setinputtype != null) {
                this.setMax.remove(setinputtype);
            }
            if (settitlemarginbottom == null) {
                this.invokeSuspend = null;
                return;
            }
            isSubmitButtonEnabled issubmitbuttonenabled = new isSubmitButtonEnabled(settitlemarginbottom);
            this.invokeSuspend = issubmitbuttonenabled;
            issubmitbuttonenabled.getMin.add(this);
            setInputType<Integer, Integer> setinputtype2 = this.invokeSuspend;
            if (setinputtype2 != null) {
                this.setMax.add(setinputtype2);
            }
        } else if (t == MenuPopupWindow$MenuDropDownListView.getMax) {
            setInputType<Integer, Integer> setinputtype3 = this.b;
            if (setinputtype3 != null) {
                this.setMax.remove(setinputtype3);
            }
            if (settitlemarginbottom == null) {
                this.b = null;
                return;
            }
            isSubmitButtonEnabled issubmitbuttonenabled2 = new isSubmitButtonEnabled(settitlemarginbottom);
            this.b = issubmitbuttonenabled2;
            issubmitbuttonenabled2.getMin.add(this);
            setInputType<Integer, Integer> setinputtype4 = this.b;
            if (setinputtype4 != null) {
                this.setMax.add(setinputtype4);
            }
        } else if (t == MenuPopupWindow$MenuDropDownListView.Grayscale$Algorithm) {
            setInputType<Float, Float> setinputtype5 = this.create;
            if (setinputtype5 != null) {
                this.setMax.remove(setinputtype5);
            }
            if (settitlemarginbottom == null) {
                this.create = null;
                return;
            }
            isSubmitButtonEnabled issubmitbuttonenabled3 = new isSubmitButtonEnabled(settitlemarginbottom);
            this.create = issubmitbuttonenabled3;
            issubmitbuttonenabled3.getMin.add(this);
            setInputType<Float, Float> setinputtype6 = this.create;
            if (setinputtype6 != null) {
                this.setMax.add(setinputtype6);
            }
        } else if (t == MenuPopupWindow$MenuDropDownListView.invokeSuspend) {
            setInputType<Float, Float> setinputtype7 = this.onNavigationEvent;
            if (setinputtype7 != null) {
                this.setMax.remove(setinputtype7);
            }
            if (settitlemarginbottom == null) {
                this.onNavigationEvent = null;
                return;
            }
            isSubmitButtonEnabled issubmitbuttonenabled4 = new isSubmitButtonEnabled(settitlemarginbottom);
            this.onNavigationEvent = issubmitbuttonenabled4;
            issubmitbuttonenabled4.getMin.add(this);
            setInputType<Float, Float> setinputtype8 = this.onNavigationEvent;
            if (setinputtype8 != null) {
                this.setMax.add(setinputtype8);
            }
        } else if (t == MenuPopupWindow$MenuDropDownListView.onMessageChannelReady) {
            setInputType<Float, Float> setinputtype9 = this.onRelationshipValidationResult;
            if (setinputtype9 != null) {
                this.setMax.remove(setinputtype9);
            }
            if (settitlemarginbottom == null) {
                this.onRelationshipValidationResult = null;
                return;
            }
            isSubmitButtonEnabled issubmitbuttonenabled5 = new isSubmitButtonEnabled(settitlemarginbottom);
            this.onRelationshipValidationResult = issubmitbuttonenabled5;
            issubmitbuttonenabled5.getMin.add(this);
            setInputType<Float, Float> setinputtype10 = this.onRelationshipValidationResult;
            if (setinputtype10 != null) {
                this.setMax.add(setinputtype10);
            }
        }
    }
}
