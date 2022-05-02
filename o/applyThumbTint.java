package o;

import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;

public final class applyThumbTint implements onCreateDrawableState<Integer> {
    public static final applyThumbTint length = new applyThumbTint();

    private applyThumbTint() {
    }

    public final /* synthetic */ Object getMax(JsonReader jsonReader, float f) throws IOException {
        return Integer.valueOf(Math.round(getTextOn.getMax(jsonReader) * f));
    }
}
