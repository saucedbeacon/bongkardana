package o;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import androidx.annotation.Nullable;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.alibaba.ariver.kernel.RVParams;
import com.alipay.mobile.verifyidentity.business.securitycommon.bean.SecurityConstants;
import java.io.IOException;
import java.lang.ref.WeakReference;
import o.IResultReceiver;

class setTextOn {
    static JsonReader.setMax getMin = JsonReader.setMax.getMin(SecurityConstants.KEY_TEXT, "s", "e", "o", "i", "h", "to", RVParams.TITLE_IMAGE);
    private static final Interpolator length = new LinearInterpolator();
    private static IResultReceiver.Stub<WeakReference<Interpolator>> setMax;
    static JsonReader.setMax setMin = JsonReader.setMax.getMin("x", "y");

    setTextOn() {
    }

    @Nullable
    private static WeakReference<Interpolator> getMin(int i) {
        WeakReference<Interpolator> min;
        synchronized (setTextOn.class) {
            if (setMax == null) {
                setMax = new IResultReceiver.Stub<>();
            }
            min = setMax.setMin(i);
        }
        return min;
    }

    private static void length(int i, WeakReference<Interpolator> weakReference) {
        synchronized (setTextOn.class) {
            setMax.setMax(i, weakReference);
        }
    }

    private static <T> setTitleMarginTop<T> length(setVerticalGravity setverticalgravity, JsonReader jsonReader, float f, onCreateDrawableState<T> oncreatedrawablestate) throws IOException {
        Interpolator interpolator;
        jsonReader.setMin();
        PointF pointF = null;
        PointF pointF2 = null;
        T t = null;
        T t2 = null;
        PointF pointF3 = null;
        PointF pointF4 = null;
        boolean z = false;
        float f2 = 0.0f;
        while (jsonReader.getMin()) {
            switch (jsonReader.setMin(getMin)) {
                case 0:
                    f2 = (float) jsonReader.toDoubleRange();
                    break;
                case 1:
                    t2 = oncreatedrawablestate.getMax(jsonReader, f);
                    break;
                case 2:
                    t = oncreatedrawablestate.getMax(jsonReader, f);
                    break;
                case 3:
                    pointF = getTextOn.getMin(jsonReader, 1.0f);
                    break;
                case 4:
                    pointF2 = getTextOn.getMin(jsonReader, 1.0f);
                    break;
                case 5:
                    if (jsonReader.values() != 1) {
                        z = false;
                        break;
                    } else {
                        z = true;
                        break;
                    }
                case 6:
                    pointF3 = getTextOn.getMin(jsonReader, f);
                    break;
                case 7:
                    pointF4 = getTextOn.getMin(jsonReader, f);
                    break;
                default:
                    jsonReader.FastBitmap$CoordinateSystem();
                    break;
            }
        }
        jsonReader.setMax();
        if (z) {
            t = t2;
        } else if (!(pointF == null || pointF2 == null)) {
            interpolator = getMin(pointF, pointF2);
            setTitleMarginTop settitlemargintop = new setTitleMarginTop(setverticalgravity, t2, t, interpolator, f2, (Float) null);
            settitlemargintop.FastBitmap$CoordinateSystem = pointF3;
            settitlemargintop.toDoubleRange = pointF4;
            return settitlemargintop;
        }
        interpolator = length;
        setTitleMarginTop settitlemargintop2 = new setTitleMarginTop(setverticalgravity, t2, t, interpolator, f2, (Float) null);
        settitlemargintop2.FastBitmap$CoordinateSystem = pointF3;
        settitlemargintop2.toDoubleRange = pointF4;
        return settitlemargintop2;
    }

    private static Interpolator getMin(PointF pointF, PointF pointF2) {
        Interpolator interpolator;
        pointF.x = getTitleMarginTop.setMax(pointF.x, -1.0f, 1.0f);
        pointF.y = getTitleMarginTop.setMax(pointF.y, -100.0f, 100.0f);
        pointF2.x = getTitleMarginTop.setMax(pointF2.x, -1.0f, 1.0f);
        pointF2.y = getTitleMarginTop.setMax(pointF2.y, -100.0f, 100.0f);
        int max = setTitleMarginStart.setMax(pointF.x, pointF.y, pointF2.x, pointF2.y);
        WeakReference<Interpolator> min = getMin(max);
        Interpolator interpolator2 = min != null ? min.get() : null;
        if (min == null || interpolator2 == null) {
            try {
                interpolator = setSupportProgress.setMax(pointF.x, pointF.y, pointF2.x, pointF2.y);
            } catch (IllegalArgumentException e) {
                if ("The Path cannot loop back on itself.".equals(e.getMessage())) {
                    interpolator = setSupportProgress.setMax(Math.min(pointF.x, 1.0f), pointF.y, Math.max(pointF2.x, 0.0f), pointF2.y);
                } else {
                    interpolator = new LinearInterpolator();
                }
            }
            interpolator2 = interpolator;
            try {
                length(max, new WeakReference(interpolator2));
            } catch (ArrayIndexOutOfBoundsException unused) {
            }
        }
        return interpolator2;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x01e1 A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static <T> o.setTitleMarginTop<T> length(com.airbnb.lottie.parser.moshi.JsonReader r20, o.setVerticalGravity r21, float r22, o.onCreateDrawableState<T> r23, boolean r24, boolean r25) throws java.io.IOException {
        /*
            r0 = r20
            r1 = r22
            r2 = r23
            if (r24 == 0) goto L_0x0202
            if (r25 == 0) goto L_0x0202
            r20.setMin()
            r3 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
        L_0x001a:
            boolean r17 = r20.getMin()
            if (r17 == 0) goto L_0x01ad
            com.airbnb.lottie.parser.moshi.JsonReader$setMax r4 = getMin
            int r4 = r0.setMin((com.airbnb.lottie.parser.moshi.JsonReader.setMax) r4)
            r5 = 1
            switch(r4) {
                case 0: goto L_0x01a0;
                case 1: goto L_0x0196;
                case 2: goto L_0x018c;
                case 3: goto L_0x00f1;
                case 4: goto L_0x0048;
                case 5: goto L_0x003e;
                case 6: goto L_0x0039;
                case 7: goto L_0x0034;
                default: goto L_0x002a;
            }
        L_0x002a:
            r18 = r3
            r3 = r14
            r19 = r15
            r20.FastBitmap$CoordinateSystem()
            goto L_0x01a9
        L_0x0034:
            android.graphics.PointF r3 = o.getTextOn.getMin(r0, r1)
            goto L_0x001a
        L_0x0039:
            android.graphics.PointF r15 = o.getTextOn.getMin(r0, r1)
            goto L_0x001a
        L_0x003e:
            int r4 = r20.values()
            if (r4 != r5) goto L_0x0046
            r6 = 1
            goto L_0x001a
        L_0x0046:
            r6 = 0
            goto L_0x001a
        L_0x0048:
            com.airbnb.lottie.parser.moshi.JsonReader$Token r4 = r20.IsOverlapping()
            com.airbnb.lottie.parser.moshi.JsonReader$Token r5 = com.airbnb.lottie.parser.moshi.JsonReader.Token.BEGIN_OBJECT
            if (r4 != r5) goto L_0x00e6
            r20.setMin()
            r4 = 0
            r5 = 0
            r12 = 0
            r13 = 0
        L_0x0057:
            boolean r18 = r20.getMin()
            if (r18 == 0) goto L_0x00d0
            r18 = r3
            com.airbnb.lottie.parser.moshi.JsonReader$setMax r3 = setMin
            int r3 = r0.setMin((com.airbnb.lottie.parser.moshi.JsonReader.setMax) r3)
            if (r3 == 0) goto L_0x00a1
            r19 = r15
            r15 = 1
            if (r3 == r15) goto L_0x0074
            r20.FastBitmap$CoordinateSystem()
        L_0x006f:
            r3 = r18
            r15 = r19
            goto L_0x0057
        L_0x0074:
            com.airbnb.lottie.parser.moshi.JsonReader$Token r3 = r20.IsOverlapping()
            com.airbnb.lottie.parser.moshi.JsonReader$Token r5 = com.airbnb.lottie.parser.moshi.JsonReader.Token.NUMBER
            if (r3 != r5) goto L_0x0085
            r3 = r14
            double r13 = r20.toDoubleRange()
            float r13 = (float) r13
            r14 = r3
            r5 = r13
            goto L_0x006f
        L_0x0085:
            r3 = r14
            r20.length()
            double r13 = r20.toDoubleRange()
            float r5 = (float) r13
            com.airbnb.lottie.parser.moshi.JsonReader$Token r13 = r20.IsOverlapping()
            com.airbnb.lottie.parser.moshi.JsonReader$Token r14 = com.airbnb.lottie.parser.moshi.JsonReader.Token.NUMBER
            if (r13 != r14) goto L_0x009c
            double r13 = r20.toDoubleRange()
            float r13 = (float) r13
            goto L_0x009d
        L_0x009c:
            r13 = r5
        L_0x009d:
            r20.getMax()
            goto L_0x00ce
        L_0x00a1:
            r3 = r14
            r19 = r15
            com.airbnb.lottie.parser.moshi.JsonReader$Token r4 = r20.IsOverlapping()
            com.airbnb.lottie.parser.moshi.JsonReader$Token r12 = com.airbnb.lottie.parser.moshi.JsonReader.Token.NUMBER
            if (r4 != r12) goto L_0x00b4
            double r14 = r20.toDoubleRange()
            float r12 = (float) r14
            r14 = r3
            r4 = r12
            goto L_0x006f
        L_0x00b4:
            r20.length()
            double r14 = r20.toDoubleRange()
            float r4 = (float) r14
            com.airbnb.lottie.parser.moshi.JsonReader$Token r12 = r20.IsOverlapping()
            com.airbnb.lottie.parser.moshi.JsonReader$Token r14 = com.airbnb.lottie.parser.moshi.JsonReader.Token.NUMBER
            if (r12 != r14) goto L_0x00ca
            double r14 = r20.toDoubleRange()
            float r12 = (float) r14
            goto L_0x00cb
        L_0x00ca:
            r12 = r4
        L_0x00cb:
            r20.getMax()
        L_0x00ce:
            r14 = r3
            goto L_0x006f
        L_0x00d0:
            r18 = r3
            r3 = r14
            r19 = r15
            android.graphics.PointF r14 = new android.graphics.PointF
            r14.<init>(r4, r5)
            android.graphics.PointF r4 = new android.graphics.PointF
            r4.<init>(r12, r13)
            r20.setMax()
            r13 = r4
            r12 = r14
            goto L_0x017f
        L_0x00e6:
            r18 = r3
            r3 = r14
            r19 = r15
            android.graphics.PointF r8 = o.getTextOn.getMin(r0, r1)
            goto L_0x01a9
        L_0x00f1:
            r18 = r3
            r3 = r14
            r19 = r15
            com.airbnb.lottie.parser.moshi.JsonReader$Token r4 = r20.IsOverlapping()
            com.airbnb.lottie.parser.moshi.JsonReader$Token r5 = com.airbnb.lottie.parser.moshi.JsonReader.Token.BEGIN_OBJECT
            if (r4 != r5) goto L_0x0181
            r20.setMin()
            r4 = 0
            r5 = 0
            r9 = 0
            r11 = 0
        L_0x0105:
            boolean r14 = r20.getMin()
            if (r14 == 0) goto L_0x016e
            com.airbnb.lottie.parser.moshi.JsonReader$setMax r14 = setMin
            int r14 = r0.setMin((com.airbnb.lottie.parser.moshi.JsonReader.setMax) r14)
            if (r14 == 0) goto L_0x0144
            r15 = 1
            if (r14 == r15) goto L_0x011a
            r20.FastBitmap$CoordinateSystem()
            goto L_0x0105
        L_0x011a:
            com.airbnb.lottie.parser.moshi.JsonReader$Token r5 = r20.IsOverlapping()
            com.airbnb.lottie.parser.moshi.JsonReader$Token r11 = com.airbnb.lottie.parser.moshi.JsonReader.Token.NUMBER
            if (r5 != r11) goto L_0x0129
            double r14 = r20.toDoubleRange()
            float r11 = (float) r14
            r5 = r11
            goto L_0x0105
        L_0x0129:
            r20.length()
            double r14 = r20.toDoubleRange()
            float r5 = (float) r14
            com.airbnb.lottie.parser.moshi.JsonReader$Token r11 = r20.IsOverlapping()
            com.airbnb.lottie.parser.moshi.JsonReader$Token r14 = com.airbnb.lottie.parser.moshi.JsonReader.Token.NUMBER
            if (r11 != r14) goto L_0x013f
            double r14 = r20.toDoubleRange()
            float r11 = (float) r14
            goto L_0x0140
        L_0x013f:
            r11 = r5
        L_0x0140:
            r20.getMax()
            goto L_0x0105
        L_0x0144:
            com.airbnb.lottie.parser.moshi.JsonReader$Token r4 = r20.IsOverlapping()
            com.airbnb.lottie.parser.moshi.JsonReader$Token r9 = com.airbnb.lottie.parser.moshi.JsonReader.Token.NUMBER
            if (r4 != r9) goto L_0x0153
            double r14 = r20.toDoubleRange()
            float r9 = (float) r14
            r4 = r9
            goto L_0x0105
        L_0x0153:
            r20.length()
            double r14 = r20.toDoubleRange()
            float r4 = (float) r14
            com.airbnb.lottie.parser.moshi.JsonReader$Token r9 = r20.IsOverlapping()
            com.airbnb.lottie.parser.moshi.JsonReader$Token r14 = com.airbnb.lottie.parser.moshi.JsonReader.Token.NUMBER
            if (r9 != r14) goto L_0x0169
            double r14 = r20.toDoubleRange()
            float r9 = (float) r14
            goto L_0x016a
        L_0x0169:
            r9 = r4
        L_0x016a:
            r20.getMax()
            goto L_0x0105
        L_0x016e:
            android.graphics.PointF r14 = new android.graphics.PointF
            r14.<init>(r4, r5)
            android.graphics.PointF r4 = new android.graphics.PointF
            r4.<init>(r9, r11)
            r20.setMax()
            r11 = r4
            r9 = r14
            r15 = r19
        L_0x017f:
            r14 = r3
            goto L_0x01a9
        L_0x0181:
            android.graphics.PointF r7 = o.getTextOn.getMin(r0, r1)
            r14 = r3
            r3 = r18
            r15 = r19
            goto L_0x001a
        L_0x018c:
            r18 = r3
            r3 = r14
            r19 = r15
            java.lang.Object r16 = r2.getMax(r0, r1)
            goto L_0x01a9
        L_0x0196:
            r18 = r3
            r3 = r14
            r19 = r15
            java.lang.Object r10 = r2.getMax(r0, r1)
            goto L_0x01a9
        L_0x01a0:
            r18 = r3
            r19 = r15
            double r3 = r20.toDoubleRange()
            float r14 = (float) r3
        L_0x01a9:
            r3 = r18
            goto L_0x001a
        L_0x01ad:
            r18 = r3
            r3 = r14
            r19 = r15
            r20.setMax()
            if (r6 == 0) goto L_0x01ba
            r16 = r10
            goto L_0x01d9
        L_0x01ba:
            if (r7 == 0) goto L_0x01c3
            if (r8 == 0) goto L_0x01c3
            android.view.animation.Interpolator r0 = getMin(r7, r8)
            goto L_0x01db
        L_0x01c3:
            if (r9 == 0) goto L_0x01d9
            if (r11 == 0) goto L_0x01d9
            if (r12 == 0) goto L_0x01d9
            if (r13 == 0) goto L_0x01d9
            android.view.animation.Interpolator r0 = getMin(r9, r12)
            android.view.animation.Interpolator r1 = getMin(r11, r13)
            r12 = r0
            r13 = r1
            r11 = r16
            r0 = 0
            goto L_0x01df
        L_0x01d9:
            android.view.animation.Interpolator r0 = length
        L_0x01db:
            r11 = r16
            r12 = 0
            r13 = 0
        L_0x01df:
            if (r12 == 0) goto L_0x01ed
            if (r13 == 0) goto L_0x01ed
            o.setTitleMarginTop r0 = new o.setTitleMarginTop
            r8 = r0
            r9 = r21
            r14 = r3
            r8.<init>((o.setVerticalGravity) r9, r10, r11, (android.view.animation.Interpolator) r12, (android.view.animation.Interpolator) r13, (float) r14)
            goto L_0x01f9
        L_0x01ed:
            o.setTitleMarginTop r1 = new o.setTitleMarginTop
            r14 = 0
            r8 = r1
            r9 = r21
            r12 = r0
            r13 = r3
            r8.<init>((o.setVerticalGravity) r9, r10, r11, (android.view.animation.Interpolator) r12, (float) r13, (java.lang.Float) r14)
            r0 = r1
        L_0x01f9:
            r15 = r19
            r0.FastBitmap$CoordinateSystem = r15
            r3 = r18
            r0.toDoubleRange = r3
            return r0
        L_0x0202:
            if (r24 == 0) goto L_0x020b
            r3 = r21
            o.setTitleMarginTop r0 = length(r3, r0, r1, r2)
            return r0
        L_0x020b:
            java.lang.Object r0 = r2.getMax(r0, r1)
            o.setTitleMarginTop r1 = new o.setTitleMarginTop
            r1.<init>(r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setTextOn.length(com.airbnb.lottie.parser.moshi.JsonReader, o.setVerticalGravity, float, o.onCreateDrawableState, boolean, boolean):o.setTitleMarginTop");
    }
}
