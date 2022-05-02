package o;

import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;

final class getThumbTintMode {
    private static final JsonReader.setMax setMax = JsonReader.setMax.getMin("fFamily", "fName", "fStyle", "ascent");

    static getSuggestionsAdapter setMin(JsonReader jsonReader) throws IOException {
        jsonReader.setMin();
        String str = null;
        String str2 = null;
        String str3 = null;
        float f = 0.0f;
        while (jsonReader.getMin()) {
            int min = jsonReader.setMin(setMax);
            if (min == 0) {
                str = jsonReader.toIntRange();
            } else if (min == 1) {
                str2 = jsonReader.toIntRange();
            } else if (min == 2) {
                str3 = jsonReader.toIntRange();
            } else if (min != 3) {
                jsonReader.isInside();
                jsonReader.FastBitmap$CoordinateSystem();
            } else {
                f = (float) jsonReader.toDoubleRange();
            }
        }
        jsonReader.setMax();
        return new getSuggestionsAdapter(str, str2, str3, f);
    }
}
