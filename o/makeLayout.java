package o;

import android.graphics.PointF;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;

public final class makeLayout implements onCreateDrawableState<PointF> {
    public static final makeLayout length = new makeLayout();

    private makeLayout() {
    }

    public final /* synthetic */ Object getMax(JsonReader jsonReader, float f) throws IOException {
        JsonReader.Token IsOverlapping = jsonReader.IsOverlapping();
        if (IsOverlapping == JsonReader.Token.BEGIN_ARRAY) {
            return getTextOn.getMin(jsonReader, f);
        }
        if (IsOverlapping == JsonReader.Token.BEGIN_OBJECT) {
            return getTextOn.getMin(jsonReader, f);
        }
        if (IsOverlapping == JsonReader.Token.NUMBER) {
            PointF pointF = new PointF(((float) jsonReader.toDoubleRange()) * f, ((float) jsonReader.toDoubleRange()) * f);
            while (jsonReader.getMin()) {
                jsonReader.FastBitmap$CoordinateSystem();
            }
            return pointF;
        }
        throw new IllegalArgumentException("Cannot convert json to point. Next token is ".concat(String.valueOf(IsOverlapping)));
    }
}
