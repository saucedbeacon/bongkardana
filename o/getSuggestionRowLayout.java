package o;

import android.graphics.Path;
import android.graphics.PointF;
import androidx.annotation.Nullable;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.content.PolystarShape;
import com.airbnb.lottie.model.content.ShapeTrimPath;
import java.util.List;
import o.setInputType;

public final class getSuggestionRowLayout implements setImeOptions, setInputType.getMin, onNothingSelected {
    private boolean FastBitmap$CoordinateSystem;
    private final setInputType<?, Float> IsOverlapping;
    private final setInputType<?, Float> equals;
    private final PolystarShape.Type getMax;
    private final String getMin;
    private addTab hashCode = new addTab();
    private final setInputType<?, PointF> isInside;
    private final Path length = new Path();
    private final LottieDrawable setMax;
    private final boolean setMin;
    @Nullable
    private final setInputType<?, Float> toDoubleRange;
    @Nullable
    private final setInputType<?, Float> toFloatRange;
    private final setInputType<?, Float> toIntRange;
    private final setInputType<?, Float> toString;

    public getSuggestionRowLayout(LottieDrawable lottieDrawable, onKeyPreIme onkeypreime, PolystarShape polystarShape) {
        this.setMax = lottieDrawable;
        this.getMin = polystarShape.getMax;
        this.getMax = polystarShape.setMin;
        this.setMin = polystarShape.length();
        this.IsOverlapping = new setOnQueryTextListener(polystarShape.getMin.setMin);
        this.isInside = polystarShape.length.getMax();
        this.toIntRange = new setOnQueryTextListener(polystarShape.setMax.setMin);
        this.equals = new setOnQueryTextListener(polystarShape.toIntRange.setMin);
        this.toString = new setOnQueryTextListener(polystarShape.equals.setMin);
        if (this.getMax == PolystarShape.Type.STAR) {
            this.toFloatRange = new setOnQueryTextListener(polystarShape.toFloatRange.setMin);
            this.toDoubleRange = new setOnQueryTextListener(polystarShape.isInside.setMin);
        } else {
            this.toFloatRange = null;
            this.toDoubleRange = null;
        }
        setInputType<?, Float> setinputtype = this.IsOverlapping;
        if (setinputtype != null) {
            onkeypreime.setMax.add(setinputtype);
        }
        setInputType<?, PointF> setinputtype2 = this.isInside;
        if (setinputtype2 != null) {
            onkeypreime.setMax.add(setinputtype2);
        }
        setInputType<?, Float> setinputtype3 = this.toIntRange;
        if (setinputtype3 != null) {
            onkeypreime.setMax.add(setinputtype3);
        }
        setInputType<?, Float> setinputtype4 = this.equals;
        if (setinputtype4 != null) {
            onkeypreime.setMax.add(setinputtype4);
        }
        setInputType<?, Float> setinputtype5 = this.toString;
        if (setinputtype5 != null) {
            onkeypreime.setMax.add(setinputtype5);
        }
        if (this.getMax == PolystarShape.Type.STAR) {
            setInputType<?, Float> setinputtype6 = this.toFloatRange;
            if (setinputtype6 != null) {
                onkeypreime.setMax.add(setinputtype6);
            }
            setInputType<?, Float> setinputtype7 = this.toDoubleRange;
            if (setinputtype7 != null) {
                onkeypreime.setMax.add(setinputtype7);
            }
        }
        this.IsOverlapping.getMin.add(this);
        this.isInside.getMin.add(this);
        this.toIntRange.getMin.add(this);
        this.equals.getMin.add(this);
        this.toString.getMin.add(this);
        if (this.getMax == PolystarShape.Type.STAR) {
            this.toFloatRange.getMin.add(this);
            this.toDoubleRange.getMin.add(this);
        }
    }

    public final void setMax(List<animateToTab> list, List<animateToTab> list2) {
        for (int i = 0; i < list.size(); i++) {
            animateToTab animatetotab = list.get(i);
            if (animatetotab instanceof getImeOptions) {
                getImeOptions getimeoptions = (getImeOptions) animatetotab;
                if (getimeoptions.setMin == ShapeTrimPath.Type.SIMULTANEOUSLY) {
                    this.hashCode.setMin.add(getimeoptions);
                    getimeoptions.length.add(this);
                }
            }
        }
    }

    public final Path getMax() {
        float f;
        float f2;
        double d;
        float f3;
        float f4;
        float f5;
        float f6;
        double d2;
        float f7;
        float f8;
        double d3;
        float f9;
        float f10;
        float f11;
        double d4;
        int i;
        if (this.FastBitmap$CoordinateSystem) {
            return this.length;
        }
        this.length.reset();
        if (this.setMin) {
            this.FastBitmap$CoordinateSystem = true;
            return this.length;
        }
        int i2 = AnonymousClass3.length[this.getMax.ordinal()];
        double d5 = 0.0d;
        float f12 = 0.0f;
        if (i2 == 1) {
            float floatValue = this.IsOverlapping.equals().floatValue();
            setInputType<?, Float> setinputtype = this.toIntRange;
            if (setinputtype != null) {
                d5 = (double) setinputtype.equals().floatValue();
            }
            double radians = Math.toRadians(d5 - 90.0d);
            double d6 = (double) floatValue;
            Double.isNaN(d6);
            float f13 = (float) (6.283185307179586d / d6);
            float f14 = f13 / 2.0f;
            float f15 = floatValue - ((float) ((int) floatValue));
            if (f15 != 0.0f) {
                double d7 = (double) ((1.0f - f15) * f14);
                Double.isNaN(d7);
                radians += d7;
            }
            float floatValue2 = this.equals.equals().floatValue();
            float floatValue3 = this.toFloatRange.equals().floatValue();
            setInputType<?, Float> setinputtype2 = this.toDoubleRange;
            float floatValue4 = setinputtype2 != null ? setinputtype2.equals().floatValue() / 100.0f : 0.0f;
            setInputType<?, Float> setinputtype3 = this.toString;
            float floatValue5 = setinputtype3 != null ? setinputtype3.equals().floatValue() / 100.0f : 0.0f;
            if (f15 != 0.0f) {
                float f16 = ((floatValue2 - floatValue3) * f15) + floatValue3;
                double d8 = (double) f16;
                double cos = Math.cos(radians);
                Double.isNaN(d8);
                float f17 = f14;
                float f18 = (float) (d8 * cos);
                double sin = Math.sin(radians);
                Double.isNaN(d8);
                f3 = (float) (d8 * sin);
                this.length.moveTo(f18, f3);
                double d9 = (double) ((f13 * f15) / 2.0f);
                Double.isNaN(d9);
                d = radians + d9;
                f = f16;
                f2 = f18;
                f4 = f17;
            } else {
                float f19 = f14;
                double d10 = (double) floatValue2;
                double cos2 = Math.cos(radians);
                Double.isNaN(d10);
                f2 = (float) (cos2 * d10);
                double sin2 = Math.sin(radians);
                Double.isNaN(d10);
                f3 = (float) (d10 * sin2);
                this.length.moveTo(f2, f3);
                f4 = f19;
                double d11 = (double) f4;
                Double.isNaN(d11);
                d = radians + d11;
                f = 0.0f;
            }
            double ceil = Math.ceil(d6) * 2.0d;
            float f20 = f4;
            float f21 = f3;
            float f22 = f2;
            int i3 = 0;
            boolean z = false;
            while (true) {
                double d12 = (double) i3;
                if (d12 >= ceil) {
                    break;
                }
                float f23 = z ? floatValue2 : floatValue3;
                if (f == 0.0f || d12 != ceil - 2.0d) {
                    f5 = f13;
                    f6 = f20;
                } else {
                    f5 = f13;
                    f6 = (f13 * f15) / 2.0f;
                }
                if (f == 0.0f || d12 != ceil - 1.0d) {
                    d2 = d12;
                    f7 = floatValue2;
                    f8 = f23;
                } else {
                    d2 = d12;
                    f7 = floatValue2;
                    f8 = f;
                }
                float f24 = f6;
                double d13 = (double) f8;
                double cos3 = Math.cos(d);
                Double.isNaN(d13);
                double d14 = ceil;
                float f25 = (float) (d13 * cos3);
                double sin3 = Math.sin(d);
                Double.isNaN(d13);
                float f26 = (float) (d13 * sin3);
                if (floatValue4 == 0.0f && floatValue5 == 0.0f) {
                    this.length.lineTo(f25, f26);
                    d3 = d;
                    f9 = floatValue5;
                    f10 = floatValue3;
                    f11 = floatValue4;
                } else {
                    float f27 = f21;
                    f9 = floatValue5;
                    f10 = floatValue3;
                    double atan2 = (double) ((float) (Math.atan2((double) f27, (double) f22) - 1.5707963267948966d));
                    float cos4 = (float) Math.cos(atan2);
                    float sin4 = (float) Math.sin(atan2);
                    f11 = floatValue4;
                    d3 = d;
                    double atan22 = (double) ((float) (Math.atan2((double) f26, (double) f25) - 1.5707963267948966d));
                    float cos5 = (float) Math.cos(atan22);
                    float sin5 = (float) Math.sin(atan22);
                    float f28 = z ? f11 : f9;
                    float f29 = z ? f9 : f11;
                    float f30 = (z ? f10 : f7) * f28 * 0.47829f;
                    float f31 = cos4 * f30;
                    float f32 = f30 * sin4;
                    float f33 = (z ? f7 : f10) * f29 * 0.47829f;
                    float f34 = cos5 * f33;
                    float f35 = f33 * sin5;
                    if (f15 != 0.0f) {
                        if (i3 == 0) {
                            f31 *= f15;
                            f32 *= f15;
                        } else if (d2 == d14 - 1.0d) {
                            f34 *= f15;
                            f35 *= f15;
                        }
                    }
                    this.length.cubicTo(f22 - f31, f27 - f32, f25 + f34, f26 + f35, f25, f26);
                }
                double d15 = (double) f24;
                Double.isNaN(d15);
                z = !z;
                i3++;
                d = d3 + d15;
                f22 = f25;
                floatValue4 = f11;
                floatValue3 = f10;
                floatValue5 = f9;
                floatValue2 = f7;
                ceil = d14;
                f21 = f26;
                f13 = f5;
            }
            PointF equals2 = this.isInside.equals();
            this.length.offset(equals2.x, equals2.y);
            this.length.close();
        } else if (i2 == 2) {
            int floor = (int) Math.floor((double) this.IsOverlapping.equals().floatValue());
            setInputType<?, Float> setinputtype4 = this.toIntRange;
            if (setinputtype4 != null) {
                d5 = (double) setinputtype4.equals().floatValue();
            }
            double radians2 = Math.toRadians(d5 - 90.0d);
            double d16 = (double) floor;
            Double.isNaN(d16);
            float floatValue6 = this.equals.equals().floatValue();
            double d17 = (double) floatValue6;
            double cos6 = Math.cos(radians2);
            Double.isNaN(d17);
            float f36 = (float) (d17 * cos6);
            double sin6 = Math.sin(radians2);
            Double.isNaN(d17);
            float f37 = (float) (d17 * sin6);
            this.length.moveTo(f36, f37);
            double d18 = (double) ((float) (6.283185307179586d / d16));
            Double.isNaN(d18);
            double d19 = radians2 + d18;
            double ceil2 = Math.ceil(d16);
            float floatValue7 = this.toString.equals().floatValue() / 100.0f;
            float f38 = f36;
            int i4 = 0;
            while (((double) i4) < ceil2) {
                double cos7 = Math.cos(d19);
                Double.isNaN(d17);
                float f39 = (float) (cos7 * d17);
                double sin7 = Math.sin(d19);
                Double.isNaN(d17);
                double d20 = ceil2;
                float f40 = (float) (d17 * sin7);
                if (floatValue7 != f12) {
                    d4 = d17;
                    double atan23 = (double) ((float) (Math.atan2((double) f37, (double) f38) - 1.5707963267948966d));
                    i = i4;
                    double atan24 = (double) ((float) (Math.atan2((double) f40, (double) f39) - 1.5707963267948966d));
                    float f41 = floatValue6 * floatValue7 * 0.25f;
                    this.length.cubicTo(f38 - (((float) Math.cos(atan23)) * f41), f37 - (((float) Math.sin(atan23)) * f41), f39 + (((float) Math.cos(atan24)) * f41), f40 + (f41 * ((float) Math.sin(atan24))), f39, f40);
                } else {
                    i = i4;
                    d4 = d17;
                    this.length.lineTo(f39, f40);
                }
                Double.isNaN(d18);
                d19 += d18;
                i4 = i + 1;
                f38 = f39;
                f37 = f40;
                ceil2 = d20;
                d17 = d4;
                f12 = 0.0f;
            }
            PointF equals3 = this.isInside.equals();
            this.length.offset(equals3.x, equals3.y);
            this.length.close();
        }
        this.length.close();
        this.hashCode.getMin(this.length);
        this.FastBitmap$CoordinateSystem = true;
        return this.length;
    }

    /* renamed from: o.getSuggestionRowLayout$3  reason: invalid class name */
    static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] length;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.airbnb.lottie.model.content.PolystarShape$Type[] r0 = com.airbnb.lottie.model.content.PolystarShape.Type.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                length = r0
                com.airbnb.lottie.model.content.PolystarShape$Type r1 = com.airbnb.lottie.model.content.PolystarShape.Type.STAR     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = length     // Catch:{ NoSuchFieldError -> 0x001d }
                com.airbnb.lottie.model.content.PolystarShape$Type r1 = com.airbnb.lottie.model.content.PolystarShape.Type.POLYGON     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o.getSuggestionRowLayout.AnonymousClass3.<clinit>():void");
        }
    }

    public final String setMin() {
        return this.getMin;
    }

    public final void setMax(setMaxWidth setmaxwidth, int i, List<setMaxWidth> list, setMaxWidth setmaxwidth2) {
        getTitleMarginTop.getMin(setmaxwidth, i, list, setmaxwidth2, this);
    }

    public final <T> void length(T t, @Nullable setTitleMarginBottom<T> settitlemarginbottom) {
        setInputType<?, Float> setinputtype;
        setInputType<?, Float> setinputtype2;
        if (t == MenuPopupWindow$MenuDropDownListView.getCause) {
            this.IsOverlapping.getMin(settitlemarginbottom);
        } else if (t == MenuPopupWindow$MenuDropDownListView.ICustomTabsCallback) {
            this.toIntRange.getMin(settitlemarginbottom);
        } else if (t == MenuPopupWindow$MenuDropDownListView.toDoubleRange) {
            this.isInside.getMin(settitlemarginbottom);
        } else if (t == MenuPopupWindow$MenuDropDownListView.onNavigationEvent && (setinputtype2 = this.toFloatRange) != null) {
            setinputtype2.getMin(settitlemarginbottom);
        } else if (t == MenuPopupWindow$MenuDropDownListView.create) {
            this.equals.getMin(settitlemarginbottom);
        } else if (t == MenuPopupWindow$MenuDropDownListView.b && (setinputtype = this.toDoubleRange) != null) {
            setinputtype.getMin(settitlemarginbottom);
        } else if (t == MenuPopupWindow$MenuDropDownListView.extraCallback) {
            this.toString.getMin(settitlemarginbottom);
        }
    }

    public final void setMax() {
        this.FastBitmap$CoordinateSystem = false;
        this.setMax.invalidateSelf();
    }
}
