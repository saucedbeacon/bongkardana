package o;

import android.graphics.Color;
import android.graphics.PointF;
import androidx.annotation.ColorInt;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

final class getTextOn {
    private static final JsonReader.setMax setMin = JsonReader.setMax.getMin("x", "y");

    @ColorInt
    static int getMin(JsonReader jsonReader) throws IOException {
        jsonReader.length();
        int doubleRange = (int) (jsonReader.toDoubleRange() * 255.0d);
        int doubleRange2 = (int) (jsonReader.toDoubleRange() * 255.0d);
        int doubleRange3 = (int) (jsonReader.toDoubleRange() * 255.0d);
        while (jsonReader.getMin()) {
            jsonReader.FastBitmap$CoordinateSystem();
        }
        jsonReader.getMax();
        return Color.argb(255, doubleRange, doubleRange2, doubleRange3);
    }

    static List<PointF> setMin(JsonReader jsonReader, float f) throws IOException {
        ArrayList arrayList = new ArrayList();
        jsonReader.length();
        while (jsonReader.IsOverlapping() == JsonReader.Token.BEGIN_ARRAY) {
            jsonReader.length();
            arrayList.add(getMin(jsonReader, f));
            jsonReader.getMax();
        }
        jsonReader.getMax();
        return arrayList;
    }

    /* renamed from: o.getTextOn$5  reason: invalid class name */
    static /* synthetic */ class AnonymousClass5 {
        static final /* synthetic */ int[] getMax;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.airbnb.lottie.parser.moshi.JsonReader$Token[] r0 = com.airbnb.lottie.parser.moshi.JsonReader.Token.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                getMax = r0
                com.airbnb.lottie.parser.moshi.JsonReader$Token r1 = com.airbnb.lottie.parser.moshi.JsonReader.Token.NUMBER     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = getMax     // Catch:{ NoSuchFieldError -> 0x001d }
                com.airbnb.lottie.parser.moshi.JsonReader$Token r1 = com.airbnb.lottie.parser.moshi.JsonReader.Token.BEGIN_ARRAY     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = getMax     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.airbnb.lottie.parser.moshi.JsonReader$Token r1 = com.airbnb.lottie.parser.moshi.JsonReader.Token.BEGIN_OBJECT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o.getTextOn.AnonymousClass5.<clinit>():void");
        }
    }

    static PointF getMin(JsonReader jsonReader, float f) throws IOException {
        int i = AnonymousClass5.getMax[jsonReader.IsOverlapping().ordinal()];
        if (i == 1) {
            return length(jsonReader, f);
        }
        if (i == 2) {
            return setMax(jsonReader, f);
        }
        if (i == 3) {
            return getMax(jsonReader, f);
        }
        StringBuilder sb = new StringBuilder("Unknown point starts with ");
        sb.append(jsonReader.IsOverlapping());
        throw new IllegalArgumentException(sb.toString());
    }

    private static PointF length(JsonReader jsonReader, float f) throws IOException {
        float doubleRange = (float) jsonReader.toDoubleRange();
        float doubleRange2 = (float) jsonReader.toDoubleRange();
        while (jsonReader.getMin()) {
            jsonReader.FastBitmap$CoordinateSystem();
        }
        return new PointF(doubleRange * f, doubleRange2 * f);
    }

    private static PointF setMax(JsonReader jsonReader, float f) throws IOException {
        jsonReader.length();
        float doubleRange = (float) jsonReader.toDoubleRange();
        float doubleRange2 = (float) jsonReader.toDoubleRange();
        while (jsonReader.IsOverlapping() != JsonReader.Token.END_ARRAY) {
            jsonReader.FastBitmap$CoordinateSystem();
        }
        jsonReader.getMax();
        return new PointF(doubleRange * f, doubleRange2 * f);
    }

    private static PointF getMax(JsonReader jsonReader, float f) throws IOException {
        jsonReader.setMin();
        float f2 = 0.0f;
        float f3 = 0.0f;
        while (jsonReader.getMin()) {
            int min = jsonReader.setMin(setMin);
            if (min == 0) {
                f2 = getMax(jsonReader);
            } else if (min != 1) {
                jsonReader.isInside();
                jsonReader.FastBitmap$CoordinateSystem();
            } else {
                f3 = getMax(jsonReader);
            }
        }
        jsonReader.setMax();
        return new PointF(f2 * f, f3 * f);
    }

    static float getMax(JsonReader jsonReader) throws IOException {
        JsonReader.Token IsOverlapping = jsonReader.IsOverlapping();
        int i = AnonymousClass5.getMax[IsOverlapping.ordinal()];
        if (i == 1) {
            return (float) jsonReader.toDoubleRange();
        }
        if (i == 2) {
            jsonReader.length();
            float doubleRange = (float) jsonReader.toDoubleRange();
            while (jsonReader.getMin()) {
                jsonReader.FastBitmap$CoordinateSystem();
            }
            jsonReader.getMax();
            return doubleRange;
        }
        throw new IllegalArgumentException("Unknown value for token of type ".concat(String.valueOf(IsOverlapping)));
    }
}
