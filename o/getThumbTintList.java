package o;

import com.airbnb.lottie.parser.moshi.JsonReader;
import com.alibaba.griver.api.common.monitor.GriverMonitorConstants;
import java.io.IOException;
import java.util.ArrayList;

final class getThumbTintList {
    private static final JsonReader.setMax getMax = JsonReader.setMax.getMin("shapes");
    private static final JsonReader.setMax length = JsonReader.setMax.getMin("ch", GriverMonitorConstants.KEY_SIZE, "w", TtmlNode.TAG_STYLE, "fFamily", "data");

    static setQueryRefinementEnabled getMax(JsonReader jsonReader, setVerticalGravity setverticalgravity) throws IOException {
        ArrayList arrayList = new ArrayList();
        jsonReader.setMin();
        String str = null;
        String str2 = null;
        double d = 0.0d;
        double d2 = 0.0d;
        char c = 0;
        while (jsonReader.getMin()) {
            int min = jsonReader.setMin(length);
            if (min == 0) {
                c = jsonReader.toIntRange().charAt(0);
            } else if (min == 1) {
                d = jsonReader.toDoubleRange();
            } else if (min == 2) {
                d2 = jsonReader.toDoubleRange();
            } else if (min == 3) {
                str = jsonReader.toIntRange();
            } else if (min == 4) {
                str2 = jsonReader.toIntRange();
            } else if (min != 5) {
                jsonReader.isInside();
                jsonReader.FastBitmap$CoordinateSystem();
            } else {
                jsonReader.setMin();
                while (jsonReader.getMin()) {
                    if (jsonReader.setMin(getMax) != 0) {
                        jsonReader.isInside();
                        jsonReader.FastBitmap$CoordinateSystem();
                    } else {
                        jsonReader.length();
                        while (jsonReader.getMin()) {
                            arrayList.add((showSoftInputIfNecessary) applyTrackTint.setMin(jsonReader, setverticalgravity));
                        }
                        jsonReader.getMax();
                    }
                }
                jsonReader.setMax();
            }
        }
        jsonReader.setMax();
        return new setQueryRefinementEnabled(arrayList, c, d, d2, str, str2);
    }
}
