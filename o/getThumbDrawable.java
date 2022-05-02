package o;

import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;

public final class getThumbDrawable implements onCreateDrawableState<Float> {
    public static final getThumbDrawable getMax = new getThumbDrawable();

    private getThumbDrawable() {
    }

    public final /* synthetic */ Object getMax(JsonReader jsonReader, float f) throws IOException {
        return Float.valueOf(getTextOn.getMax(jsonReader) * f);
    }
}
