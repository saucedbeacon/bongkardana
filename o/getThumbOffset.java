package o;

import com.airbnb.lottie.model.content.ShapeTrimPath;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;

final class getThumbOffset {
    private static JsonReader.setMax length = JsonReader.setMax.getMin("s", "e", "o", "nm", "m", "hd");

    static ShapeTrimPath length(JsonReader jsonReader, setVerticalGravity setverticalgravity) throws IOException {
        String str = null;
        ShapeTrimPath.Type type = null;
        onTextFocusChanged ontextfocuschanged = null;
        onTextFocusChanged ontextfocuschanged2 = null;
        onTextFocusChanged ontextfocuschanged3 = null;
        boolean z = false;
        while (jsonReader.getMin()) {
            int min = jsonReader.setMin(length);
            if (min == 0) {
                ontextfocuschanged = new onTextFocusChanged(getSplitTrack.setMin(jsonReader, setverticalgravity, 1.0f, getThumbDrawable.getMax, false));
            } else if (min == 1) {
                ontextfocuschanged2 = new onTextFocusChanged(getSplitTrack.setMin(jsonReader, setverticalgravity, 1.0f, getThumbDrawable.getMax, false));
            } else if (min == 2) {
                ontextfocuschanged3 = new onTextFocusChanged(getSplitTrack.setMin(jsonReader, setverticalgravity, 1.0f, getThumbDrawable.getMax, false));
            } else if (min == 3) {
                str = jsonReader.toIntRange();
            } else if (min == 4) {
                type = ShapeTrimPath.Type.forId(jsonReader.values());
            } else if (min != 5) {
                jsonReader.FastBitmap$CoordinateSystem();
            } else {
                z = jsonReader.equals();
            }
        }
        return new ShapeTrimPath(str, type, ontextfocuschanged, ontextfocuschanged2, ontextfocuschanged3, z);
    }
}
