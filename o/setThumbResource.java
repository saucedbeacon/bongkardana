package o;

import android.graphics.Color;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;

public final class setThumbResource implements onCreateDrawableState<Integer> {
    public static final setThumbResource getMax = new setThumbResource();

    private setThumbResource() {
    }

    public final /* synthetic */ Object getMax(JsonReader jsonReader, float f) throws IOException {
        boolean z = jsonReader.IsOverlapping() == JsonReader.Token.BEGIN_ARRAY;
        if (z) {
            jsonReader.length();
        }
        double doubleRange = jsonReader.toDoubleRange();
        double doubleRange2 = jsonReader.toDoubleRange();
        double doubleRange3 = jsonReader.toDoubleRange();
        double doubleRange4 = jsonReader.IsOverlapping() == JsonReader.Token.NUMBER ? jsonReader.toDoubleRange() : 1.0d;
        if (z) {
            jsonReader.getMax();
        }
        if (doubleRange <= 1.0d && doubleRange2 <= 1.0d && doubleRange3 <= 1.0d) {
            doubleRange *= 255.0d;
            doubleRange2 *= 255.0d;
            doubleRange3 *= 255.0d;
            if (doubleRange4 <= 1.0d) {
                doubleRange4 *= 255.0d;
            }
        }
        return Integer.valueOf(Color.argb((int) doubleRange4, (int) doubleRange, (int) doubleRange2, (int) doubleRange3));
    }
}
