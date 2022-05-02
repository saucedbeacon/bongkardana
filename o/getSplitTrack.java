package o;

import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

final class getSplitTrack {
    static JsonReader.setMax setMax = JsonReader.setMax.getMin("k");

    static <T> List<setTitleMarginTop<T>> setMin(JsonReader jsonReader, setVerticalGravity setverticalgravity, float f, onCreateDrawableState<T> oncreatedrawablestate, boolean z) throws IOException {
        ArrayList arrayList = new ArrayList();
        if (jsonReader.IsOverlapping() == JsonReader.Token.STRING) {
            setTitleMargin.setMax("Lottie doesn't support expressions.");
            setverticalgravity.length.add("Lottie doesn't support expressions.");
            return arrayList;
        }
        jsonReader.setMin();
        while (jsonReader.getMin()) {
            if (jsonReader.setMin(setMax) != 0) {
                jsonReader.FastBitmap$CoordinateSystem();
            } else if (jsonReader.IsOverlapping() == JsonReader.Token.BEGIN_ARRAY) {
                jsonReader.length();
                if (jsonReader.IsOverlapping() == JsonReader.Token.NUMBER) {
                    arrayList.add(setTextOn.length(jsonReader, setverticalgravity, f, oncreatedrawablestate, false, z));
                } else {
                    while (jsonReader.getMin()) {
                        arrayList.add(setTextOn.length(jsonReader, setverticalgravity, f, oncreatedrawablestate, true, z));
                    }
                }
                jsonReader.getMax();
            } else {
                arrayList.add(setTextOn.length(jsonReader, setverticalgravity, f, oncreatedrawablestate, false, z));
            }
        }
        jsonReader.setMax();
        getMax(arrayList);
        return arrayList;
    }

    public static <T> void getMax(List<? extends setTitleMarginTop<T>> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        while (true) {
            i = size - 1;
            if (i2 >= i) {
                break;
            }
            setTitleMarginTop settitlemargintop = (setTitleMarginTop) list.get(i2);
            i2++;
            setTitleMarginTop settitlemargintop2 = (setTitleMarginTop) list.get(i2);
            settitlemargintop.toIntRange = Float.valueOf(settitlemargintop2.equals);
            if (settitlemargintop.getMin == null && settitlemargintop2.setMax != null) {
                settitlemargintop.getMin = settitlemargintop2.setMax;
                if (settitlemargintop instanceof getQuery) {
                    ((getQuery) settitlemargintop).setMax();
                }
            }
        }
        setTitleMarginTop settitlemargintop3 = (setTitleMarginTop) list.get(i);
        if ((settitlemargintop3.setMax == null || settitlemargintop3.getMin == null) && list.size() > 1) {
            list.remove(settitlemargintop3);
        }
    }
}
