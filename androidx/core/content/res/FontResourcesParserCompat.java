package androidx.core.content.res;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.Base64;
import android.util.TypedValue;
import android.util.Xml;
import androidx.annotation.ArrayRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import o.UseExperimental;
import o.fromInclusive;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class FontResourcesParserCompat {

    @Retention(RetentionPolicy.SOURCE)
    public @interface FetchStrategy {
    }

    public interface getMin {
    }

    public static final class length implements getMin {
        @Nullable
        private final String getMin;
        private final int length;
        private final int setMax;
        @NonNull
        private final UseExperimental setMin;

        @RestrictTo({RestrictTo.Scope.LIBRARY})
        public length(@NonNull UseExperimental useExperimental, int i, int i2, @Nullable String str) {
            this.setMin = useExperimental;
            this.length = i;
            this.setMax = i2;
            this.getMin = str;
        }

        @NonNull
        public final UseExperimental setMin() {
            return this.setMin;
        }

        public final int getMax() {
            return this.length;
        }

        public final int length() {
            return this.setMax;
        }

        @Nullable
        @RestrictTo({RestrictTo.Scope.LIBRARY})
        public final String setMax() {
            return this.getMin;
        }
    }

    public static final class setMax {
        private int getMax;
        private boolean getMin;
        private int isInside;
        private String length;
        private int setMax;
        @NonNull
        private final String setMin;

        public setMax(@NonNull String str, int i, boolean z, @Nullable String str2, int i2, int i3) {
            this.setMin = str;
            this.setMax = i;
            this.getMin = z;
            this.length = str2;
            this.getMax = i2;
            this.isInside = i3;
        }

        @NonNull
        public final String getMax() {
            return this.setMin;
        }

        public final int length() {
            return this.setMax;
        }

        public final boolean setMax() {
            return this.getMin;
        }

        @Nullable
        public final String setMin() {
            return this.length;
        }

        public final int getMin() {
            return this.getMax;
        }

        public final int IsOverlapping() {
            return this.isInside;
        }
    }

    public static final class setMin implements getMin {
        @NonNull
        private final setMax[] getMin;

        public setMin(@NonNull setMax[] setmaxArr) {
            this.getMin = setmaxArr;
        }

        @NonNull
        public final setMax[] getMax() {
            return this.getMin;
        }
    }

    /*  JADX ERROR: StackOverflow in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    @androidx.annotation.Nullable
    public static androidx.core.content.res.FontResourcesParserCompat.getMin setMin(org.xmlpull.v1.XmlPullParser r3, android.content.res.Resources r4) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
        L_0x0000:
            int r0 = r3.next()
            r1 = 2
            if (r0 == r1) goto L_0x000a
            r2 = 1
            if (r0 != r2) goto L_0x0000
        L_0x000a:
            if (r0 != r1) goto L_0x0011
            androidx.core.content.res.FontResourcesParserCompat$getMin r3 = length((org.xmlpull.v1.XmlPullParser) r3, (android.content.res.Resources) r4)
            return r3
        L_0x0011:
            org.xmlpull.v1.XmlPullParserException r3 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r4 = "No start tag found"
            r3.<init>(r4)
            goto L_0x001a
        L_0x0019:
            throw r3
        L_0x001a:
            goto L_0x0019
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.content.res.FontResourcesParserCompat.setMin(org.xmlpull.v1.XmlPullParser, android.content.res.Resources):androidx.core.content.res.FontResourcesParserCompat$getMin");
    }

    @Nullable
    private static getMin length(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        xmlPullParser.require(2, (String) null, "font-family");
        if (xmlPullParser.getName().equals("font-family")) {
            return getMin(xmlPullParser, resources);
        }
        getMin(xmlPullParser);
        return null;
    }

    @Nullable
    private static getMin getMin(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), fromInclusive.IsOverlapping.IsOverlapping);
        String string = obtainAttributes.getString(fromInclusive.IsOverlapping.toIntRange);
        String string2 = obtainAttributes.getString(fromInclusive.IsOverlapping.toDoubleRange);
        String string3 = obtainAttributes.getString(fromInclusive.IsOverlapping.FastBitmap$CoordinateSystem);
        int resourceId = obtainAttributes.getResourceId(fromInclusive.IsOverlapping.equals, 0);
        int integer = obtainAttributes.getInteger(fromInclusive.IsOverlapping.toFloatRange, 1);
        int integer2 = obtainAttributes.getInteger(fromInclusive.IsOverlapping.isInside, 500);
        String string4 = obtainAttributes.getString(fromInclusive.IsOverlapping.values);
        obtainAttributes.recycle();
        if (string == null || string2 == null || string3 == null) {
            ArrayList arrayList = new ArrayList();
            while (xmlPullParser.next() != 3) {
                if (xmlPullParser.getEventType() == 2) {
                    if (xmlPullParser.getName().equals("font")) {
                        arrayList.add(getMax(xmlPullParser, resources));
                    } else {
                        getMin(xmlPullParser);
                    }
                }
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            return new setMin((setMax[]) arrayList.toArray(new setMax[arrayList.size()]));
        }
        while (xmlPullParser.next() != 3) {
            getMin(xmlPullParser);
        }
        return new length(new UseExperimental(string, string2, string3, getMin(resources, resourceId)), integer, integer2, string4);
    }

    private static int length(TypedArray typedArray, int i) {
        if (Build.VERSION.SDK_INT >= 21) {
            return typedArray.getType(i);
        }
        TypedValue typedValue = new TypedValue();
        typedArray.getValue(i, typedValue);
        return typedValue.type;
    }

    public static List<List<byte[]>> getMin(Resources resources, @ArrayRes int i) {
        if (i == 0) {
            return Collections.emptyList();
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i);
        try {
            if (obtainTypedArray.length() == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            if (length(obtainTypedArray, 0) == 1) {
                for (int i2 = 0; i2 < obtainTypedArray.length(); i2++) {
                    int resourceId = obtainTypedArray.getResourceId(i2, 0);
                    if (resourceId != 0) {
                        arrayList.add(getMax(resources.getStringArray(resourceId)));
                    }
                }
            } else {
                arrayList.add(getMax(resources.getStringArray(i)));
            }
            obtainTypedArray.recycle();
            return arrayList;
        } finally {
            obtainTypedArray.recycle();
        }
    }

    private static List<byte[]> getMax(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String decode : strArr) {
            arrayList.add(Base64.decode(decode, 0));
        }
        return arrayList;
    }

    private static setMax getMax(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), fromInclusive.IsOverlapping.hashCode);
        if (obtainAttributes.hasValue(fromInclusive.IsOverlapping.ICustomTabsCallback)) {
            i = fromInclusive.IsOverlapping.ICustomTabsCallback;
        } else {
            i = fromInclusive.IsOverlapping.Mean$Arithmetic;
        }
        int i6 = obtainAttributes.getInt(i, 400);
        if (obtainAttributes.hasValue(fromInclusive.IsOverlapping.getCause)) {
            i2 = fromInclusive.IsOverlapping.getCause;
        } else {
            i2 = fromInclusive.IsOverlapping.invoke;
        }
        boolean z = 1 == obtainAttributes.getInt(i2, 0);
        if (obtainAttributes.hasValue(fromInclusive.IsOverlapping.b)) {
            i3 = fromInclusive.IsOverlapping.b;
        } else {
            i3 = fromInclusive.IsOverlapping.valueOf;
        }
        if (obtainAttributes.hasValue(fromInclusive.IsOverlapping.onNavigationEvent)) {
            i4 = fromInclusive.IsOverlapping.onNavigationEvent;
        } else {
            i4 = fromInclusive.IsOverlapping.Grayscale$Algorithm;
        }
        String string = obtainAttributes.getString(i4);
        int i7 = obtainAttributes.getInt(i3, 0);
        if (obtainAttributes.hasValue(fromInclusive.IsOverlapping.invokeSuspend)) {
            i5 = fromInclusive.IsOverlapping.invokeSuspend;
        } else {
            i5 = fromInclusive.IsOverlapping.toString;
        }
        int resourceId = obtainAttributes.getResourceId(i5, 0);
        String string2 = obtainAttributes.getString(i5);
        obtainAttributes.recycle();
        while (xmlPullParser.next() != 3) {
            getMin(xmlPullParser);
        }
        return new setMax(string2, i6, z, string, i7, resourceId);
    }

    private static void getMin(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int i = 1;
        while (i > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i++;
            } else if (next == 3) {
                i--;
            }
        }
    }
}
