package o;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import java.io.IOException;
import java.util.List;
import o.fromInclusive;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
final class MainThread {
    static Shader getMax(@NonNull Resources resources, @NonNull XmlPullParser xmlPullParser, @NonNull AttributeSet attributeSet, @Nullable Resources.Theme theme) throws IOException, XmlPullParserException {
        TypedArray typedArray;
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        float f7;
        XmlPullParser xmlPullParser2 = xmlPullParser;
        AttributeSet attributeSet2 = attributeSet;
        Resources.Theme theme2 = theme;
        String name = xmlPullParser.getName();
        if (name.equals("gradient")) {
            int[] iArr = fromInclusive.IsOverlapping.create;
            if (theme2 == null) {
                typedArray = resources.obtainAttributes(attributeSet2, iArr);
            } else {
                Resources resources2 = resources;
                typedArray = theme2.obtainStyledAttributes(attributeSet2, iArr, 0, 0);
            }
            int i6 = fromInclusive.IsOverlapping.ICustomTabsCallback$Default;
            if (!NonNull.setMin(xmlPullParser2, "startX")) {
                f = 0.0f;
            } else {
                f = typedArray.getFloat(i6, 0.0f);
            }
            int i7 = fromInclusive.IsOverlapping.ICustomTabsCallback$Stub;
            if (!NonNull.setMin(xmlPullParser2, "startY")) {
                f2 = 0.0f;
            } else {
                f2 = typedArray.getFloat(i7, 0.0f);
            }
            int i8 = fromInclusive.IsOverlapping.ICustomTabsService;
            if (!NonNull.setMin(xmlPullParser2, "endX")) {
                f3 = 0.0f;
            } else {
                f3 = typedArray.getFloat(i8, 0.0f);
            }
            int i9 = fromInclusive.IsOverlapping.getDefaultImpl;
            if (!NonNull.setMin(xmlPullParser2, "endY")) {
                f4 = 0.0f;
            } else {
                f4 = typedArray.getFloat(i9, 0.0f);
            }
            int i10 = fromInclusive.IsOverlapping.extraCallbackWithResult;
            if (!NonNull.setMin(xmlPullParser2, "centerX")) {
                f5 = 0.0f;
            } else {
                f5 = typedArray.getFloat(i10, 0.0f);
            }
            int i11 = fromInclusive.IsOverlapping.onRelationshipValidationResult;
            if (!NonNull.setMin(xmlPullParser2, "centerY")) {
                f6 = 0.0f;
            } else {
                f6 = typedArray.getFloat(i11, 0.0f);
            }
            int i12 = fromInclusive.IsOverlapping.onMessageChannelReady;
            if (!NonNull.setMin(xmlPullParser2, "type")) {
                i = 0;
            } else {
                i = typedArray.getInt(i12, 0);
            }
            int i13 = fromInclusive.IsOverlapping.onPostMessage;
            if (!NonNull.setMin(xmlPullParser2, "startColor")) {
                i2 = 0;
            } else {
                i2 = typedArray.getColor(i13, 0);
            }
            boolean min = NonNull.setMin(xmlPullParser2, "centerColor");
            int i14 = fromInclusive.IsOverlapping.onTransact;
            if (!NonNull.setMin(xmlPullParser2, "centerColor")) {
                i3 = 0;
            } else {
                i3 = typedArray.getColor(i14, 0);
            }
            int i15 = fromInclusive.IsOverlapping.extraCallback;
            if (!NonNull.setMin(xmlPullParser2, "endColor")) {
                i4 = 0;
            } else {
                i4 = typedArray.getColor(i15, 0);
            }
            int i16 = fromInclusive.IsOverlapping.asInterface;
            if (!NonNull.setMin(xmlPullParser2, "tileMode")) {
                i5 = 0;
            } else {
                i5 = typedArray.getInt(i16, 0);
            }
            int i17 = fromInclusive.IsOverlapping.asBinder;
            if (!NonNull.setMin(xmlPullParser2, "gradientRadius")) {
                f7 = 0.0f;
            } else {
                f7 = typedArray.getFloat(i17, 0.0f);
            }
            typedArray.recycle();
            getMin min2 = getMin(setMin(resources, xmlPullParser, attributeSet, theme), i2, i4, min, i3);
            if (i != 1) {
                return i != 2 ? new LinearGradient(f, f2, f3, f4, min2.getMax, min2.getMin, setMin(i5)) : new SweepGradient(f5, f6, min2.getMax, min2.getMin);
            }
            if (f7 > 0.0f) {
                return new RadialGradient(f5, f6, f7, min2.getMax, min2.getMin, setMin(i5));
            }
            throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
        }
        StringBuilder sb = new StringBuilder();
        sb.append(xmlPullParser.getPositionDescription());
        sb.append(": invalid gradient color tag ");
        sb.append(name);
        throw new XmlPullParserException(sb.toString());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0089, code lost:
        throw new org.xmlpull.v1.XmlPullParserException(r10.toString());
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static o.MainThread.getMin setMin(@androidx.annotation.NonNull android.content.res.Resources r8, @androidx.annotation.NonNull org.xmlpull.v1.XmlPullParser r9, @androidx.annotation.NonNull android.util.AttributeSet r10, @androidx.annotation.Nullable android.content.res.Resources.Theme r11) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            int r0 = r9.getDepth()
            r1 = 1
            int r0 = r0 + r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 20
            r2.<init>(r3)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r3)
        L_0x0012:
            int r3 = r9.next()
            if (r3 == r1) goto L_0x008a
            int r5 = r9.getDepth()
            if (r5 >= r0) goto L_0x0021
            r6 = 3
            if (r3 == r6) goto L_0x008a
        L_0x0021:
            r6 = 2
            if (r3 != r6) goto L_0x0012
            if (r5 > r0) goto L_0x0012
            java.lang.String r3 = r9.getName()
            java.lang.String r5 = "item"
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x0012
            int[] r3 = o.fromInclusive.IsOverlapping.getInterfaceDescriptor
            r5 = 0
            if (r11 != 0) goto L_0x003c
            android.content.res.TypedArray r3 = r8.obtainAttributes(r10, r3)
            goto L_0x0040
        L_0x003c:
            android.content.res.TypedArray r3 = r11.obtainStyledAttributes(r10, r3, r5, r5)
        L_0x0040:
            int r6 = o.fromInclusive.IsOverlapping.setDefaultImpl
            boolean r6 = r3.hasValue(r6)
            int r7 = o.fromInclusive.IsOverlapping.ICustomTabsCallback$Stub$Proxy
            boolean r7 = r3.hasValue(r7)
            if (r6 == 0) goto L_0x006f
            if (r7 == 0) goto L_0x006f
            int r6 = o.fromInclusive.IsOverlapping.setDefaultImpl
            int r5 = r3.getColor(r6, r5)
            int r6 = o.fromInclusive.IsOverlapping.ICustomTabsCallback$Stub$Proxy
            r7 = 0
            float r6 = r3.getFloat(r6, r7)
            r3.recycle()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
            r4.add(r3)
            java.lang.Float r3 = java.lang.Float.valueOf(r6)
            r2.add(r3)
            goto L_0x0012
        L_0x006f:
            org.xmlpull.v1.XmlPullParserException r8 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r9 = r9.getPositionDescription()
            r10.append(r9)
            java.lang.String r9 = ": <item> tag requires a 'color' attribute and a 'offset' attribute!"
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            r8.<init>(r9)
            throw r8
        L_0x008a:
            int r8 = r4.size()
            if (r8 <= 0) goto L_0x0096
            o.MainThread$getMin r8 = new o.MainThread$getMin
            r8.<init>((java.util.List<java.lang.Integer>) r4, (java.util.List<java.lang.Float>) r2)
            return r8
        L_0x0096:
            r8 = 0
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: o.MainThread.setMin(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):o.MainThread$getMin");
    }

    private static getMin getMin(@Nullable getMin getmin, @ColorInt int i, @ColorInt int i2, boolean z, @ColorInt int i3) {
        if (getmin != null) {
            return getmin;
        }
        if (z) {
            return new getMin(i, i3, i2);
        }
        return new getMin(i, i2);
    }

    private static Shader.TileMode setMin(int i) {
        if (i == 1) {
            return Shader.TileMode.REPEAT;
        }
        if (i != 2) {
            return Shader.TileMode.CLAMP;
        }
        return Shader.TileMode.MIRROR;
    }

    static final class getMin {
        final int[] getMax;
        final float[] getMin;

        getMin(@NonNull List<Integer> list, @NonNull List<Float> list2) {
            int size = list.size();
            this.getMax = new int[size];
            this.getMin = new float[size];
            for (int i = 0; i < size; i++) {
                this.getMax[i] = list.get(i).intValue();
                this.getMin[i] = list2.get(i).floatValue();
            }
        }

        getMin(@ColorInt int i, @ColorInt int i2) {
            this.getMax = new int[]{i, i2};
            this.getMin = new float[]{0.0f, 1.0f};
        }

        getMin(@ColorInt int i, @ColorInt int i2, @ColorInt int i3) {
            this.getMax = new int[]{i, i2, i3};
            this.getMin = new float[]{0.0f, 0.5f, 1.0f};
        }
    }
}
