package o;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.XmlRes;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public final class LayoutRes {
    private static final ThreadLocal<TypedValue> getMax = new ThreadLocal<>();

    @Nullable
    public static ColorStateList length(@NonNull Resources resources, @XmlRes int i, @Nullable Resources.Theme theme) {
        try {
            return setMax(resources, resources.getXml(i), theme);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:6:0x0010  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0015  */
    @androidx.annotation.NonNull
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.content.res.ColorStateList setMax(@androidx.annotation.NonNull android.content.res.Resources r4, @androidx.annotation.NonNull org.xmlpull.v1.XmlPullParser r5, @androidx.annotation.Nullable android.content.res.Resources.Theme r6) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r5)
        L_0x0004:
            int r1 = r5.next()
            r2 = 2
            if (r1 == r2) goto L_0x000e
            r3 = 1
            if (r1 != r3) goto L_0x0004
        L_0x000e:
            if (r1 != r2) goto L_0x0015
            android.content.res.ColorStateList r4 = setMax(r4, r5, r0, r6)
            return r4
        L_0x0015:
            org.xmlpull.v1.XmlPullParserException r4 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r5 = "No start tag found"
            r4.<init>(r5)
            goto L_0x001e
        L_0x001d:
            throw r4
        L_0x001e:
            goto L_0x001d
        */
        throw new UnsupportedOperationException("Method not decompiled: o.LayoutRes.setMax(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.content.res.Resources$Theme):android.content.res.ColorStateList");
    }

    @NonNull
    public static ColorStateList setMax(@NonNull Resources resources, @NonNull XmlPullParser xmlPullParser, @NonNull AttributeSet attributeSet, @Nullable Resources.Theme theme) throws XmlPullParserException, IOException {
        String name = xmlPullParser.getName();
        if (name.equals("selector")) {
            return getMax(resources, xmlPullParser, attributeSet, theme);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(xmlPullParser.getPositionDescription());
        sb.append(": invalid color state list tag ");
        sb.append(name);
        throw new XmlPullParserException(sb.toString());
    }

    /* JADX WARNING: type inference failed for: r9v11, types: [java.lang.Object[], java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00d0  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.content.res.ColorStateList getMax(@androidx.annotation.NonNull android.content.res.Resources r17, @androidx.annotation.NonNull org.xmlpull.v1.XmlPullParser r18, @androidx.annotation.NonNull android.util.AttributeSet r19, @androidx.annotation.Nullable android.content.res.Resources.Theme r20) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            r0 = r17
            r1 = r19
            r2 = r20
            int r3 = r18.getDepth()
            r4 = 1
            int r3 = r3 + r4
            r5 = 20
            int[][] r6 = new int[r5][]
            int[] r5 = new int[r5]
            r7 = 0
            r8 = 0
        L_0x0014:
            int r9 = r18.next()
            if (r9 == r4) goto L_0x00ef
            int r10 = r18.getDepth()
            if (r10 >= r3) goto L_0x0023
            r11 = 3
            if (r9 == r11) goto L_0x00ef
        L_0x0023:
            r11 = 2
            if (r9 != r11) goto L_0x00ec
            if (r10 > r3) goto L_0x00ec
            java.lang.String r9 = r18.getName()
            java.lang.String r10 = "item"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x00ec
            int[] r9 = o.fromInclusive.IsOverlapping.length
            android.content.res.TypedArray r9 = length(r0, r2, r1, r9)
            int r10 = o.fromInclusive.IsOverlapping.setMax
            r11 = -1
            int r10 = r9.getResourceId(r10, r11)
            if (r10 == r11) goto L_0x0056
            boolean r11 = setMax(r0, r10)
            if (r11 != 0) goto L_0x0056
            android.content.res.XmlResourceParser r10 = r0.getXml(r10)     // Catch:{ Exception -> 0x0056 }
            android.content.res.ColorStateList r10 = setMax(r0, r10, r2)     // Catch:{ Exception -> 0x0056 }
            int r10 = r10.getDefaultColor()     // Catch:{ Exception -> 0x0056 }
            goto L_0x005f
        L_0x0056:
            int r10 = o.fromInclusive.IsOverlapping.setMax
            r11 = -65281(0xffffffffffff00ff, float:NaN)
            int r10 = r9.getColor(r10, r11)
        L_0x005f:
            int r11 = o.fromInclusive.IsOverlapping.getMax
            boolean r11 = r9.hasValue(r11)
            r12 = 1065353216(0x3f800000, float:1.0)
            if (r11 == 0) goto L_0x0070
            int r11 = o.fromInclusive.IsOverlapping.getMax
            float r12 = r9.getFloat(r11, r12)
            goto L_0x007e
        L_0x0070:
            int r11 = o.fromInclusive.IsOverlapping.getMin
            boolean r11 = r9.hasValue(r11)
            if (r11 == 0) goto L_0x007e
            int r11 = o.fromInclusive.IsOverlapping.getMin
            float r12 = r9.getFloat(r11, r12)
        L_0x007e:
            r9.recycle()
            int r9 = r19.getAttributeCount()
            int[] r11 = new int[r9]
            r13 = 0
            r14 = 0
        L_0x0089:
            if (r13 >= r9) goto L_0x00ae
            int r15 = r1.getAttributeNameResource(r13)
            r4 = 16843173(0x10101a5, float:2.3694738E-38)
            if (r15 == r4) goto L_0x00aa
            r4 = 16843551(0x101031f, float:2.3695797E-38)
            if (r15 == r4) goto L_0x00aa
            int r4 = o.fromInclusive.length.getMin
            if (r15 == r4) goto L_0x00aa
            int r4 = r14 + 1
            boolean r16 = r1.getAttributeBooleanValue(r13, r7)
            if (r16 == 0) goto L_0x00a6
            goto L_0x00a7
        L_0x00a6:
            int r15 = -r15
        L_0x00a7:
            r11[r14] = r15
            r14 = r4
        L_0x00aa:
            int r13 = r13 + 1
            r4 = 1
            goto L_0x0089
        L_0x00ae:
            int[] r4 = android.util.StateSet.trimStateSet(r11, r14)
            int r9 = getMax(r10, r12)
            int r10 = r8 + 1
            int r11 = r5.length
            r12 = 8
            r13 = 4
            if (r10 <= r11) goto L_0x00cb
            if (r8 > r13) goto L_0x00c3
            r11 = 8
            goto L_0x00c5
        L_0x00c3:
            int r11 = r8 * 2
        L_0x00c5:
            int[] r11 = new int[r11]
            java.lang.System.arraycopy(r5, r7, r11, r7, r8)
            r5 = r11
        L_0x00cb:
            r5[r8] = r9
            int r9 = r6.length
            if (r10 <= r9) goto L_0x00e7
            java.lang.Class r9 = r6.getClass()
            java.lang.Class r9 = r9.getComponentType()
            if (r8 > r13) goto L_0x00db
            goto L_0x00dd
        L_0x00db:
            int r12 = r8 * 2
        L_0x00dd:
            java.lang.Object r9 = java.lang.reflect.Array.newInstance(r9, r12)
            java.lang.Object[] r9 = (java.lang.Object[]) r9
            java.lang.System.arraycopy(r6, r7, r9, r7, r8)
            r6 = r9
        L_0x00e7:
            r6[r8] = r4
            int[][] r6 = (int[][]) r6
            r8 = r10
        L_0x00ec:
            r4 = 1
            goto L_0x0014
        L_0x00ef:
            int[] r0 = new int[r8]
            int[][] r1 = new int[r8][]
            java.lang.System.arraycopy(r5, r7, r0, r7, r8)
            java.lang.System.arraycopy(r6, r7, r1, r7, r8)
            android.content.res.ColorStateList r2 = new android.content.res.ColorStateList
            r2.<init>(r1, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: o.LayoutRes.getMax(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):android.content.res.ColorStateList");
    }

    private static boolean setMax(@NonNull Resources resources, @ColorRes int i) {
        TypedValue max = getMax();
        resources.getValue(i, max, true);
        if (max.type < 28 || max.type > 31) {
            return false;
        }
        return true;
    }

    @NonNull
    private static TypedValue getMax() {
        TypedValue typedValue = getMax.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        getMax.set(typedValue2);
        return typedValue2;
    }

    private static TypedArray length(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        if (theme == null) {
            return resources.obtainAttributes(attributeSet, iArr);
        }
        return theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    @ColorInt
    private static int getMax(@ColorInt int i, @FloatRange(from = 0.0d, to = 1.0d) float f) {
        return (i & FlexItem.MAX_SIZE) | (Math.round(((float) Color.alpha(i)) * f) << 24);
    }
}
