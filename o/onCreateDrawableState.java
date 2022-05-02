package o;

import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;

interface onCreateDrawableState<V> {
    V getMax(JsonReader jsonReader, float f) throws IOException;
}
