package o;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import android.view.InflateException;
import androidx.annotation.AnimatorRes;
import androidx.annotation.RestrictTo;
import java.io.IOException;
import java.util.ArrayList;
import o.markerClass;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class setExpandedActionViewsExclusive {
    private static boolean length(int i) {
        return i >= 28 && i <= 31;
    }

    public static Animator getMin(Context context, @AnimatorRes int i) throws Resources.NotFoundException {
        if (Build.VERSION.SDK_INT >= 24) {
            return AnimatorInflater.loadAnimator(context, i);
        }
        return setMin(context, context.getResources(), context.getTheme(), i);
    }

    public static Animator setMin(Context context, Resources resources, Resources.Theme theme, @AnimatorRes int i) throws Resources.NotFoundException {
        return setMax(context, resources, theme, i, 1.0f);
    }

    public static Animator setMax(Context context, Resources resources, Resources.Theme theme, @AnimatorRes int i, float f) throws Resources.NotFoundException {
        XmlResourceParser xmlResourceParser = null;
        try {
            XmlResourceParser animation = resources.getAnimation(i);
            Animator min = getMin(context, resources, theme, (XmlPullParser) animation, f);
            if (animation != null) {
                animation.close();
            }
            return min;
        } catch (XmlPullParserException e) {
            StringBuilder sb = new StringBuilder("Can't load animation resource ID #0x");
            sb.append(Integer.toHexString(i));
            Resources.NotFoundException notFoundException = new Resources.NotFoundException(sb.toString());
            notFoundException.initCause(e);
            throw notFoundException;
        } catch (IOException e2) {
            StringBuilder sb2 = new StringBuilder("Can't load animation resource ID #0x");
            sb2.append(Integer.toHexString(i));
            Resources.NotFoundException notFoundException2 = new Resources.NotFoundException(sb2.toString());
            notFoundException2.initCause(e2);
            throw notFoundException2;
        } catch (Throwable th) {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw th;
        }
    }

    static class length implements TypeEvaluator<markerClass.setMin[]> {
        private markerClass.setMin[] getMin;

        length() {
        }

        /* renamed from: getMin */
        public markerClass.setMin[] evaluate(float f, markerClass.setMin[] setminArr, markerClass.setMin[] setminArr2) {
            if (markerClass.setMax(setminArr, setminArr2)) {
                if (!markerClass.setMax(this.getMin, setminArr)) {
                    this.getMin = markerClass.setMin(setminArr);
                }
                for (int i = 0; i < setminArr.length; i++) {
                    this.getMin[i].length(setminArr[i], setminArr2[i], f);
                }
                return this.getMin;
            }
            throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v6, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v22, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v25, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.animation.PropertyValuesHolder getMax(android.content.res.TypedArray r11, int r12, int r13, int r14, java.lang.String r15) {
        /*
            android.util.TypedValue r0 = r11.peekValue(r13)
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x000a
            r3 = 1
            goto L_0x000b
        L_0x000a:
            r3 = 0
        L_0x000b:
            if (r3 == 0) goto L_0x0010
            int r0 = r0.type
            goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            android.util.TypedValue r4 = r11.peekValue(r14)
            if (r4 == 0) goto L_0x0019
            r5 = 1
            goto L_0x001a
        L_0x0019:
            r5 = 0
        L_0x001a:
            if (r5 == 0) goto L_0x001f
            int r4 = r4.type
            goto L_0x0020
        L_0x001f:
            r4 = 0
        L_0x0020:
            r6 = 4
            r7 = 3
            if (r12 != r6) goto L_0x0037
            if (r3 == 0) goto L_0x002c
            boolean r12 = length(r0)
            if (r12 != 0) goto L_0x0034
        L_0x002c:
            if (r5 == 0) goto L_0x0036
            boolean r12 = length(r4)
            if (r12 == 0) goto L_0x0036
        L_0x0034:
            r12 = 3
            goto L_0x0037
        L_0x0036:
            r12 = 0
        L_0x0037:
            if (r12 != 0) goto L_0x003b
            r6 = 1
            goto L_0x003c
        L_0x003b:
            r6 = 0
        L_0x003c:
            r8 = 0
            r9 = 2
            if (r12 != r9) goto L_0x00a7
            java.lang.String r12 = r11.getString(r13)
            java.lang.String r11 = r11.getString(r14)
            o.markerClass$setMin[] r13 = o.markerClass.length(r12)
            o.markerClass$setMin[] r14 = o.markerClass.length(r11)
            if (r13 != 0) goto L_0x0054
            if (r14 == 0) goto L_0x00a4
        L_0x0054:
            if (r13 == 0) goto L_0x0095
            o.setExpandedActionViewsExclusive$length r0 = new o.setExpandedActionViewsExclusive$length
            r0.<init>()
            if (r14 == 0) goto L_0x008b
            boolean r3 = o.markerClass.setMax(r13, r14)
            if (r3 == 0) goto L_0x006f
            java.lang.Object[] r11 = new java.lang.Object[r9]
            r11[r2] = r13
            r11[r1] = r14
            android.animation.PropertyValuesHolder r11 = android.animation.PropertyValuesHolder.ofObject(r15, r0, r11)
            goto L_0x0168
        L_0x006f:
            android.view.InflateException r13 = new android.view.InflateException
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            java.lang.String r15 = " Can't morph from "
            r14.<init>(r15)
            r14.append(r12)
            java.lang.String r12 = " to "
            r14.append(r12)
            r14.append(r11)
            java.lang.String r11 = r14.toString()
            r13.<init>(r11)
            throw r13
        L_0x008b:
            java.lang.Object[] r11 = new java.lang.Object[r1]
            r11[r2] = r13
            android.animation.PropertyValuesHolder r11 = android.animation.PropertyValuesHolder.ofObject(r15, r0, r11)
            goto L_0x0168
        L_0x0095:
            if (r14 == 0) goto L_0x00a4
            o.setExpandedActionViewsExclusive$length r11 = new o.setExpandedActionViewsExclusive$length
            r11.<init>()
            java.lang.Object[] r12 = new java.lang.Object[r1]
            r12[r2] = r14
            android.animation.PropertyValuesHolder r8 = android.animation.PropertyValuesHolder.ofObject(r15, r11, r12)
        L_0x00a4:
            r11 = r8
            goto L_0x0168
        L_0x00a7:
            if (r12 != r7) goto L_0x00ae
            o.hasSupportDividerBeforeChildAt r12 = o.hasSupportDividerBeforeChildAt.getMax()
            goto L_0x00af
        L_0x00ae:
            r12 = r8
        L_0x00af:
            r7 = 5
            r10 = 0
            if (r6 == 0) goto L_0x00f8
            if (r3 == 0) goto L_0x00e3
            if (r0 != r7) goto L_0x00bc
            float r13 = r11.getDimension(r13, r10)
            goto L_0x00c0
        L_0x00bc:
            float r13 = r11.getFloat(r13, r10)
        L_0x00c0:
            if (r5 == 0) goto L_0x00d9
            if (r4 != r7) goto L_0x00c9
            float r11 = r11.getDimension(r14, r10)
            goto L_0x00cd
        L_0x00c9:
            float r11 = r11.getFloat(r14, r10)
        L_0x00cd:
            float[] r14 = new float[r9]
            r14[r2] = r13
            r14[r1] = r11
            android.animation.PropertyValuesHolder r8 = android.animation.PropertyValuesHolder.ofFloat(r15, r14)
            goto L_0x015f
        L_0x00d9:
            float[] r11 = new float[r1]
            r11[r2] = r13
            android.animation.PropertyValuesHolder r8 = android.animation.PropertyValuesHolder.ofFloat(r15, r11)
            goto L_0x015f
        L_0x00e3:
            if (r4 != r7) goto L_0x00ea
            float r11 = r11.getDimension(r14, r10)
            goto L_0x00ee
        L_0x00ea:
            float r11 = r11.getFloat(r14, r10)
        L_0x00ee:
            float[] r13 = new float[r1]
            r13[r2] = r11
            android.animation.PropertyValuesHolder r8 = android.animation.PropertyValuesHolder.ofFloat(r15, r13)
            goto L_0x015f
        L_0x00f8:
            if (r3 == 0) goto L_0x013e
            if (r0 != r7) goto L_0x0102
            float r13 = r11.getDimension(r13, r10)
            int r13 = (int) r13
            goto L_0x0111
        L_0x0102:
            boolean r0 = length(r0)
            if (r0 == 0) goto L_0x010d
            int r13 = r11.getColor(r13, r2)
            goto L_0x0111
        L_0x010d:
            int r13 = r11.getInt(r13, r2)
        L_0x0111:
            if (r5 == 0) goto L_0x0135
            if (r4 != r7) goto L_0x011b
            float r11 = r11.getDimension(r14, r10)
            int r11 = (int) r11
            goto L_0x012a
        L_0x011b:
            boolean r0 = length(r4)
            if (r0 == 0) goto L_0x0126
            int r11 = r11.getColor(r14, r2)
            goto L_0x012a
        L_0x0126:
            int r11 = r11.getInt(r14, r2)
        L_0x012a:
            int[] r14 = new int[r9]
            r14[r2] = r13
            r14[r1] = r11
            android.animation.PropertyValuesHolder r8 = android.animation.PropertyValuesHolder.ofInt(r15, r14)
            goto L_0x015f
        L_0x0135:
            int[] r11 = new int[r1]
            r11[r2] = r13
            android.animation.PropertyValuesHolder r8 = android.animation.PropertyValuesHolder.ofInt(r15, r11)
            goto L_0x015f
        L_0x013e:
            if (r5 == 0) goto L_0x015f
            if (r4 != r7) goto L_0x0148
            float r11 = r11.getDimension(r14, r10)
            int r11 = (int) r11
            goto L_0x0157
        L_0x0148:
            boolean r13 = length(r4)
            if (r13 == 0) goto L_0x0153
            int r11 = r11.getColor(r14, r2)
            goto L_0x0157
        L_0x0153:
            int r11 = r11.getInt(r14, r2)
        L_0x0157:
            int[] r13 = new int[r1]
            r13[r2] = r11
            android.animation.PropertyValuesHolder r8 = android.animation.PropertyValuesHolder.ofInt(r15, r13)
        L_0x015f:
            if (r8 == 0) goto L_0x00a4
            if (r12 == 0) goto L_0x00a4
            r8.setEvaluator(r12)
            goto L_0x00a4
        L_0x0168:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setExpandedActionViewsExclusive.getMax(android.content.res.TypedArray, int, int, int, java.lang.String):android.animation.PropertyValuesHolder");
    }

    private static void setMax(ValueAnimator valueAnimator, TypedArray typedArray, int i, float f, XmlPullParser xmlPullParser) {
        String str;
        String str2;
        ObjectAnimator objectAnimator = (ObjectAnimator) valueAnimator;
        String str3 = null;
        if (!NonNull.setMin(xmlPullParser, "pathData")) {
            str = null;
        } else {
            str = typedArray.getString(1);
        }
        if (str != null) {
            if (!NonNull.setMin(xmlPullParser, "propertyXName")) {
                str2 = null;
            } else {
                str2 = typedArray.getString(2);
            }
            if (NonNull.setMin(xmlPullParser, "propertyYName")) {
                str3 = typedArray.getString(3);
            }
            if (str2 == null && str3 == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(typedArray.getPositionDescription());
                sb.append(" propertyXName or propertyYName is needed for PathData");
                throw new InflateException(sb.toString());
            }
            length(markerClass.getMax(str), objectAnimator, f * 0.5f, str2, str3);
            return;
        }
        if (NonNull.setMin(xmlPullParser, "propertyName")) {
            str3 = typedArray.getString(0);
        }
        objectAnimator.setPropertyName(str3);
    }

    private static void length(Path path, ObjectAnimator objectAnimator, float f, String str, String str2) {
        PropertyValuesHolder propertyValuesHolder;
        Path path2 = path;
        ObjectAnimator objectAnimator2 = objectAnimator;
        String str3 = str;
        String str4 = str2;
        PathMeasure pathMeasure = new PathMeasure(path2, false);
        ArrayList arrayList = new ArrayList();
        float f2 = 0.0f;
        arrayList.add(Float.valueOf(0.0f));
        float f3 = 0.0f;
        do {
            f3 += pathMeasure.getLength();
            arrayList.add(Float.valueOf(f3));
        } while (pathMeasure.nextContour());
        PathMeasure pathMeasure2 = new PathMeasure(path2, false);
        int min = Math.min(100, ((int) (f3 / f)) + 1);
        float[] fArr = new float[min];
        float[] fArr2 = new float[min];
        float[] fArr3 = new float[2];
        float f4 = f3 / ((float) (min - 1));
        int i = 0;
        int i2 = 0;
        while (true) {
            propertyValuesHolder = null;
            if (i >= min) {
                break;
            }
            pathMeasure2.getPosTan(f2 - ((Float) arrayList.get(i2)).floatValue(), fArr3, (float[]) null);
            fArr[i] = fArr3[0];
            fArr2[i] = fArr3[1];
            f2 += f4;
            int i3 = i2 + 1;
            if (i3 < arrayList.size() && f2 > ((Float) arrayList.get(i3)).floatValue()) {
                pathMeasure2.nextContour();
                i2 = i3;
            }
            i++;
        }
        PropertyValuesHolder ofFloat = str3 != null ? PropertyValuesHolder.ofFloat(str3, fArr) : null;
        if (str4 != null) {
            propertyValuesHolder = PropertyValuesHolder.ofFloat(str4, fArr2);
        }
        if (ofFloat == null) {
            objectAnimator2.setValues(new PropertyValuesHolder[]{propertyValuesHolder});
        } else if (propertyValuesHolder == null) {
            objectAnimator2.setValues(new PropertyValuesHolder[]{ofFloat});
        } else {
            objectAnimator2.setValues(new PropertyValuesHolder[]{ofFloat, propertyValuesHolder});
        }
    }

    private static Animator getMin(Context context, Resources resources, Resources.Theme theme, XmlPullParser xmlPullParser, float f) throws XmlPullParserException, IOException {
        return length(context, resources, theme, xmlPullParser, Xml.asAttributeSet(xmlPullParser), (AnimatorSet) null, 0, f);
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x00ca  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.animation.Animator length(android.content.Context r18, android.content.res.Resources r19, android.content.res.Resources.Theme r20, org.xmlpull.v1.XmlPullParser r21, android.util.AttributeSet r22, android.animation.AnimatorSet r23, int r24, float r25) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            r8 = r19
            r9 = r20
            r10 = r21
            r11 = r22
            r12 = r23
            int r13 = r21.getDepth()
            r0 = 0
            r14 = r0
        L_0x0010:
            int r1 = r21.next()
            r2 = 3
            r15 = 0
            if (r1 != r2) goto L_0x001e
            int r2 = r21.getDepth()
            if (r2 <= r13) goto L_0x00f0
        L_0x001e:
            r2 = 1
            if (r1 == r2) goto L_0x00f0
            r3 = 2
            if (r1 != r3) goto L_0x00ec
            java.lang.String r1 = r21.getName()
            java.lang.String r3 = "objectAnimator"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x0044
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r22
            r4 = r25
            r5 = r21
            android.animation.ObjectAnimator r0 = getMax(r0, r1, r2, r3, r4, r5)
        L_0x0040:
            r3 = r18
            goto L_0x00c4
        L_0x0044:
            java.lang.String r3 = "animator"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x005e
            r4 = 0
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r22
            r5 = r25
            r6 = r21
            android.animation.ValueAnimator r0 = setMin(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x0040
        L_0x005e:
            java.lang.String r3 = "set"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x00a5
            android.animation.AnimatorSet r16 = new android.animation.AnimatorSet
            r16.<init>()
            int[] r0 = o.getMenu.isInside
            if (r9 != 0) goto L_0x0074
            android.content.res.TypedArray r0 = r8.obtainAttributes(r11, r0)
            goto L_0x0078
        L_0x0074:
            android.content.res.TypedArray r0 = r9.obtainStyledAttributes(r11, r0, r15, r15)
        L_0x0078:
            r7 = r0
            java.lang.String r0 = "ordering"
            boolean r0 = o.NonNull.setMin(r10, r0)
            if (r0 != 0) goto L_0x0083
            r6 = 0
            goto L_0x0088
        L_0x0083:
            int r0 = r7.getInt(r15, r15)
            r6 = r0
        L_0x0088:
            r5 = r16
            android.animation.AnimatorSet r5 = (android.animation.AnimatorSet) r5
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r21
            r4 = r22
            r17 = r7
            r7 = r25
            length(r0, r1, r2, r3, r4, r5, r6, r7)
            r17.recycle()
            r3 = r18
            r0 = r16
            goto L_0x00c4
        L_0x00a5:
            java.lang.String r3 = "propertyValuesHolder"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00d4
            android.util.AttributeSet r1 = android.util.Xml.asAttributeSet(r21)
            r3 = r18
            android.animation.PropertyValuesHolder[] r1 = setMax((android.content.Context) r3, (android.content.res.Resources) r8, (android.content.res.Resources.Theme) r9, (org.xmlpull.v1.XmlPullParser) r10, (android.util.AttributeSet) r1)
            if (r1 == 0) goto L_0x00c3
            boolean r4 = r0 instanceof android.animation.ValueAnimator
            if (r4 == 0) goto L_0x00c3
            r4 = r0
            android.animation.ValueAnimator r4 = (android.animation.ValueAnimator) r4
            r4.setValues(r1)
        L_0x00c3:
            r15 = 1
        L_0x00c4:
            if (r12 == 0) goto L_0x0010
            if (r15 != 0) goto L_0x0010
            if (r14 != 0) goto L_0x00cf
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
        L_0x00cf:
            r14.add(r0)
            goto L_0x0010
        L_0x00d4:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unknown animator name: "
            r1.<init>(r2)
            java.lang.String r2 = r21.getName()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x00ec:
            r3 = r18
            goto L_0x0010
        L_0x00f0:
            if (r12 == 0) goto L_0x0119
            if (r14 == 0) goto L_0x0119
            int r1 = r14.size()
            android.animation.Animator[] r1 = new android.animation.Animator[r1]
            java.util.Iterator r2 = r14.iterator()
        L_0x00fe:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0110
            java.lang.Object r3 = r2.next()
            android.animation.Animator r3 = (android.animation.Animator) r3
            int r4 = r15 + 1
            r1[r15] = r3
            r15 = r4
            goto L_0x00fe
        L_0x0110:
            if (r24 != 0) goto L_0x0116
            r12.playTogether(r1)
            goto L_0x0119
        L_0x0116:
            r12.playSequentially(r1)
        L_0x0119:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setExpandedActionViewsExclusive.length(android.content.Context, android.content.res.Resources, android.content.res.Resources$Theme, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.animation.AnimatorSet, int, float):android.animation.Animator");
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x0088  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.animation.PropertyValuesHolder[] setMax(android.content.Context r17, android.content.res.Resources r18, android.content.res.Resources.Theme r19, org.xmlpull.v1.XmlPullParser r20, android.util.AttributeSet r21) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            r6 = r19
            r7 = r20
            r8 = r21
            r9 = 0
            r10 = r9
        L_0x0008:
            int r0 = r20.getEventType()
            r1 = 3
            r11 = 0
            if (r0 == r1) goto L_0x0086
            r12 = 1
            if (r0 == r12) goto L_0x0086
            r2 = 2
            if (r0 == r2) goto L_0x001a
            r20.next()
            goto L_0x0008
        L_0x001a:
            java.lang.String r0 = r20.getName()
            java.lang.String r3 = "propertyValuesHolder"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0080
            int[] r0 = o.getMenu.toFloatRange
            if (r6 != 0) goto L_0x0031
            r13 = r18
            android.content.res.TypedArray r0 = r13.obtainAttributes(r8, r0)
            goto L_0x0037
        L_0x0031:
            r13 = r18
            android.content.res.TypedArray r0 = r6.obtainStyledAttributes(r8, r0, r11, r11)
        L_0x0037:
            r14 = r0
            java.lang.String r0 = "propertyName"
            boolean r0 = o.NonNull.setMin(r7, r0)
            if (r0 != 0) goto L_0x0042
            r15 = r9
            goto L_0x0047
        L_0x0042:
            java.lang.String r0 = r14.getString(r1)
            r15 = r0
        L_0x0047:
            java.lang.String r0 = "valueType"
            boolean r0 = o.NonNull.setMin(r7, r0)
            r1 = 4
            if (r0 != 0) goto L_0x0053
            r5 = 4
            goto L_0x0058
        L_0x0053:
            int r1 = r14.getInt(r2, r1)
            r5 = r1
        L_0x0058:
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r20
            r4 = r15
            r16 = r5
            android.animation.PropertyValuesHolder r0 = setMax(r0, r1, r2, r3, r4, r5)
            if (r0 != 0) goto L_0x006f
            r1 = r16
            android.animation.PropertyValuesHolder r0 = getMax(r14, r1, r11, r12, r15)
        L_0x006f:
            if (r0 == 0) goto L_0x007c
            if (r10 != 0) goto L_0x0079
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r10 = r1
        L_0x0079:
            r10.add(r0)
        L_0x007c:
            r14.recycle()
            goto L_0x0082
        L_0x0080:
            r13 = r18
        L_0x0082:
            r20.next()
            goto L_0x0008
        L_0x0086:
            if (r10 == 0) goto L_0x009b
            int r0 = r10.size()
            android.animation.PropertyValuesHolder[] r9 = new android.animation.PropertyValuesHolder[r0]
        L_0x008e:
            if (r11 >= r0) goto L_0x009b
            java.lang.Object r1 = r10.get(r11)
            android.animation.PropertyValuesHolder r1 = (android.animation.PropertyValuesHolder) r1
            r9[r11] = r1
            int r11 = r11 + 1
            goto L_0x008e
        L_0x009b:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setExpandedActionViewsExclusive.setMax(android.content.Context, android.content.res.Resources, android.content.res.Resources$Theme, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet):android.animation.PropertyValuesHolder[]");
    }

    private static int length(Resources resources, Resources.Theme theme, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        TypedArray typedArray;
        TypedValue typedValue;
        int[] iArr = getMenu.toIntRange;
        int i = 0;
        if (theme == null) {
            typedArray = resources.obtainAttributes(attributeSet, iArr);
        } else {
            typedArray = theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        }
        if (!NonNull.setMin(xmlPullParser, "value")) {
            typedValue = null;
        } else {
            typedValue = typedArray.peekValue(0);
        }
        if ((typedValue != null) && length(typedValue.type)) {
            i = 3;
        }
        typedArray.recycle();
        return i;
    }

    private static int setMin(TypedArray typedArray, int i, int i2) {
        TypedValue peekValue = typedArray.peekValue(i);
        boolean z = true;
        boolean z2 = peekValue != null;
        int i3 = z2 ? peekValue.type : 0;
        TypedValue peekValue2 = typedArray.peekValue(i2);
        if (peekValue2 == null) {
            z = false;
        }
        int i4 = z ? peekValue2.type : 0;
        if ((!z2 || !length(i3)) && (!z || !length(i4))) {
            return 0;
        }
        return 3;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00e1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.animation.PropertyValuesHolder setMax(android.content.Context r9, android.content.res.Resources r10, android.content.res.Resources.Theme r11, org.xmlpull.v1.XmlPullParser r12, java.lang.String r13, int r14) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            r0 = 0
            r1 = r0
        L_0x0002:
            int r2 = r12.next()
            r3 = 3
            if (r2 == r3) goto L_0x0040
            r4 = 1
            if (r2 == r4) goto L_0x0040
            java.lang.String r2 = r12.getName()
            java.lang.String r3 = "keyframe"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0002
            r2 = 4
            if (r14 != r2) goto L_0x0023
            android.util.AttributeSet r14 = android.util.Xml.asAttributeSet(r12)
            int r14 = length((android.content.res.Resources) r10, (android.content.res.Resources.Theme) r11, (android.util.AttributeSet) r14, (org.xmlpull.v1.XmlPullParser) r12)
        L_0x0023:
            android.util.AttributeSet r5 = android.util.Xml.asAttributeSet(r12)
            r2 = r9
            r3 = r10
            r4 = r11
            r6 = r14
            r7 = r12
            android.animation.Keyframe r2 = getMin(r2, r3, r4, r5, r6, r7)
            if (r2 == 0) goto L_0x003c
            if (r1 != 0) goto L_0x0039
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
        L_0x0039:
            r1.add(r2)
        L_0x003c:
            r12.next()
            goto L_0x0002
        L_0x0040:
            if (r1 == 0) goto L_0x00e8
            int r9 = r1.size()
            if (r9 <= 0) goto L_0x00e8
            r10 = 0
            java.lang.Object r11 = r1.get(r10)
            android.animation.Keyframe r11 = (android.animation.Keyframe) r11
            int r12 = r9 + -1
            java.lang.Object r12 = r1.get(r12)
            android.animation.Keyframe r12 = (android.animation.Keyframe) r12
            float r0 = r12.getFraction()
            r2 = 1065353216(0x3f800000, float:1.0)
            r4 = 0
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 >= 0) goto L_0x0077
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x006a
            r12.setFraction(r2)
            goto L_0x0077
        L_0x006a:
            int r0 = r1.size()
            android.animation.Keyframe r12 = setMax(r12, r2)
            r1.add(r0, r12)
            int r9 = r9 + 1
        L_0x0077:
            float r12 = r11.getFraction()
            int r0 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x0090
            int r12 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r12 >= 0) goto L_0x0087
            r11.setFraction(r4)
            goto L_0x0090
        L_0x0087:
            android.animation.Keyframe r11 = setMax(r11, r4)
            r1.add(r10, r11)
            int r9 = r9 + 1
        L_0x0090:
            android.animation.Keyframe[] r11 = new android.animation.Keyframe[r9]
            r1.toArray(r11)
        L_0x0095:
            if (r10 >= r9) goto L_0x00db
            r12 = r11[r10]
            float r0 = r12.getFraction()
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x00d8
            if (r10 != 0) goto L_0x00a7
            r12.setFraction(r4)
            goto L_0x00d8
        L_0x00a7:
            int r0 = r9 + -1
            if (r10 != r0) goto L_0x00af
            r12.setFraction(r2)
            goto L_0x00d8
        L_0x00af:
            int r12 = r10 + 1
            r1 = r10
        L_0x00b2:
            if (r12 >= r0) goto L_0x00c4
            r5 = r11[r12]
            float r5 = r5.getFraction()
            int r5 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            if (r5 >= 0) goto L_0x00c4
            int r1 = r12 + 1
            r8 = r1
            r1 = r12
            r12 = r8
            goto L_0x00b2
        L_0x00c4:
            int r12 = r1 + 1
            r12 = r11[r12]
            float r12 = r12.getFraction()
            int r0 = r10 + -1
            r0 = r11[r0]
            float r0 = r0.getFraction()
            float r12 = r12 - r0
            length((android.animation.Keyframe[]) r11, (float) r12, (int) r10, (int) r1)
        L_0x00d8:
            int r10 = r10 + 1
            goto L_0x0095
        L_0x00db:
            android.animation.PropertyValuesHolder r0 = android.animation.PropertyValuesHolder.ofKeyframe(r13, r11)
            if (r14 != r3) goto L_0x00e8
            o.hasSupportDividerBeforeChildAt r9 = o.hasSupportDividerBeforeChildAt.getMax()
            r0.setEvaluator(r9)
        L_0x00e8:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setExpandedActionViewsExclusive.setMax(android.content.Context, android.content.res.Resources, android.content.res.Resources$Theme, org.xmlpull.v1.XmlPullParser, java.lang.String, int):android.animation.PropertyValuesHolder");
    }

    private static Keyframe setMax(Keyframe keyframe, float f) {
        if (keyframe.getType() == Float.TYPE) {
            return Keyframe.ofFloat(f);
        }
        if (keyframe.getType() == Integer.TYPE) {
            return Keyframe.ofInt(f);
        }
        return Keyframe.ofObject(f);
    }

    private static void length(Keyframe[] keyframeArr, float f, int i, int i2) {
        float f2 = f / ((float) ((i2 - i) + 2));
        while (i <= i2) {
            keyframeArr[i].setFraction(keyframeArr[i - 1].getFraction() + f2);
            i++;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x008a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.animation.Keyframe getMin(android.content.Context r7, android.content.res.Resources r8, android.content.res.Resources.Theme r9, android.util.AttributeSet r10, int r11, org.xmlpull.v1.XmlPullParser r12) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            int[] r0 = o.getMenu.toIntRange
            r1 = 0
            if (r9 != 0) goto L_0x000a
            android.content.res.TypedArray r8 = r8.obtainAttributes(r10, r0)
            goto L_0x000e
        L_0x000a:
            android.content.res.TypedArray r8 = r9.obtainStyledAttributes(r10, r0, r1, r1)
        L_0x000e:
            java.lang.String r9 = "fraction"
            boolean r9 = o.NonNull.setMin(r12, r9)
            r10 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0 = 3
            if (r9 != 0) goto L_0x001a
            goto L_0x001e
        L_0x001a:
            float r10 = r8.getFloat(r0, r10)
        L_0x001e:
            java.lang.String r9 = "value"
            boolean r2 = o.NonNull.setMin(r12, r9)
            r3 = 0
            if (r2 != 0) goto L_0x002a
            r2 = r3
            goto L_0x002e
        L_0x002a:
            android.util.TypedValue r2 = r8.peekValue(r1)
        L_0x002e:
            r4 = 1
            if (r2 == 0) goto L_0x0033
            r5 = 1
            goto L_0x0034
        L_0x0033:
            r5 = 0
        L_0x0034:
            r6 = 4
            if (r11 != r6) goto L_0x0044
            if (r5 == 0) goto L_0x0043
            int r11 = r2.type
            boolean r11 = length(r11)
            if (r11 == 0) goto L_0x0043
            r11 = 3
            goto L_0x0044
        L_0x0043:
            r11 = 0
        L_0x0044:
            if (r5 == 0) goto L_0x006f
            if (r11 == 0) goto L_0x005e
            if (r11 == r4) goto L_0x004d
            if (r11 == r0) goto L_0x004d
            goto L_0x007b
        L_0x004d:
            boolean r9 = o.NonNull.setMin(r12, r9)
            if (r9 != 0) goto L_0x0055
            r9 = 0
            goto L_0x0059
        L_0x0055:
            int r9 = r8.getInt(r1, r1)
        L_0x0059:
            android.animation.Keyframe r3 = android.animation.Keyframe.ofInt(r10, r9)
            goto L_0x007b
        L_0x005e:
            boolean r9 = o.NonNull.setMin(r12, r9)
            r11 = 0
            if (r9 != 0) goto L_0x0066
            goto L_0x006a
        L_0x0066:
            float r11 = r8.getFloat(r1, r11)
        L_0x006a:
            android.animation.Keyframe r9 = android.animation.Keyframe.ofFloat(r10, r11)
            goto L_0x007a
        L_0x006f:
            if (r11 != 0) goto L_0x0076
            android.animation.Keyframe r9 = android.animation.Keyframe.ofFloat(r10)
            goto L_0x007a
        L_0x0076:
            android.animation.Keyframe r9 = android.animation.Keyframe.ofInt(r10)
        L_0x007a:
            r3 = r9
        L_0x007b:
            java.lang.String r9 = "interpolator"
            boolean r9 = o.NonNull.setMin(r12, r9)
            if (r9 != 0) goto L_0x0084
            goto L_0x0088
        L_0x0084:
            int r1 = r8.getResourceId(r4, r1)
        L_0x0088:
            if (r1 <= 0) goto L_0x0091
            android.view.animation.Interpolator r7 = o.dispatchPopulateAccessibilityEvent.length(r7, r1)
            r3.setInterpolator(r7)
        L_0x0091:
            r8.recycle()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setExpandedActionViewsExclusive.getMin(android.content.Context, android.content.res.Resources, android.content.res.Resources$Theme, android.util.AttributeSet, int, org.xmlpull.v1.XmlPullParser):android.animation.Keyframe");
    }

    private static ObjectAnimator getMax(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, float f, XmlPullParser xmlPullParser) throws Resources.NotFoundException {
        ObjectAnimator objectAnimator = new ObjectAnimator();
        setMin(context, resources, theme, attributeSet, objectAnimator, f, xmlPullParser);
        return objectAnimator;
    }

    private static ValueAnimator setMin(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, ValueAnimator valueAnimator, float f, XmlPullParser xmlPullParser) throws Resources.NotFoundException {
        TypedArray typedArray;
        TypedArray typedArray2;
        int[] iArr = getMenu.IsOverlapping;
        int i = 0;
        if (theme == null) {
            typedArray = resources.obtainAttributes(attributeSet, iArr);
        } else {
            typedArray = theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        }
        int[] iArr2 = getMenu.values;
        if (theme == null) {
            typedArray2 = resources.obtainAttributes(attributeSet, iArr2);
        } else {
            typedArray2 = theme.obtainStyledAttributes(attributeSet, iArr2, 0, 0);
        }
        if (valueAnimator == null) {
            valueAnimator = new ValueAnimator();
        }
        getMin(valueAnimator, typedArray, typedArray2, f, xmlPullParser);
        if (NonNull.setMin(xmlPullParser, "interpolator")) {
            i = typedArray.getResourceId(0, 0);
        }
        if (i > 0) {
            valueAnimator.setInterpolator(dispatchPopulateAccessibilityEvent.length(context, i));
        }
        typedArray.recycle();
        if (typedArray2 != null) {
            typedArray2.recycle();
        }
        return valueAnimator;
    }

    private static void getMin(ValueAnimator valueAnimator, TypedArray typedArray, TypedArray typedArray2, float f, XmlPullParser xmlPullParser) {
        int i;
        int i2;
        int i3 = 300;
        int i4 = 1;
        if (NonNull.setMin(xmlPullParser, "duration")) {
            i3 = typedArray.getInt(1, 300);
        }
        long j = (long) i3;
        int i5 = 0;
        if (!NonNull.setMin(xmlPullParser, "startOffset")) {
            i = 0;
        } else {
            i = typedArray.getInt(2, 0);
        }
        long j2 = (long) i;
        if (!NonNull.setMin(xmlPullParser, "valueType")) {
            i2 = 4;
        } else {
            i2 = typedArray.getInt(7, 4);
        }
        if (NonNull.setMin(xmlPullParser, "valueFrom") && NonNull.setMin(xmlPullParser, "valueTo")) {
            if (i2 == 4) {
                i2 = setMin(typedArray, 5, 6);
            }
            PropertyValuesHolder max = getMax(typedArray, i2, 5, 6, "");
            if (max != null) {
                valueAnimator.setValues(new PropertyValuesHolder[]{max});
            }
        }
        valueAnimator.setDuration(j);
        valueAnimator.setStartDelay(j2);
        if (NonNull.setMin(xmlPullParser, "repeatCount")) {
            i5 = typedArray.getInt(3, 0);
        }
        valueAnimator.setRepeatCount(i5);
        if (NonNull.setMin(xmlPullParser, "repeatMode")) {
            i4 = typedArray.getInt(4, 1);
        }
        valueAnimator.setRepeatMode(i4);
        if (typedArray2 != null) {
            setMax(valueAnimator, typedArray2, i2, f, xmlPullParser);
        }
    }
}
