package o;

import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;

public final class stopDrag implements onCreateDrawableState<getLogo> {
    public static final stopDrag setMin = new stopDrag();

    private stopDrag() {
    }

    public final /* synthetic */ Object getMax(JsonReader jsonReader, float f) throws IOException {
        boolean z = jsonReader.IsOverlapping() == JsonReader.Token.BEGIN_ARRAY;
        if (z) {
            jsonReader.length();
        }
        float doubleRange = (float) jsonReader.toDoubleRange();
        float doubleRange2 = (float) jsonReader.toDoubleRange();
        while (jsonReader.getMin()) {
            jsonReader.FastBitmap$CoordinateSystem();
        }
        if (z) {
            jsonReader.getMax();
        }
        return new getLogo((doubleRange / 100.0f) * f, (doubleRange2 / 100.0f) * f);
    }
}
