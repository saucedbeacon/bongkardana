package o;

import com.airbnb.lottie.model.content.MergePaths;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;

final class getShowText {
    private static final JsonReader.setMax setMax = JsonReader.setMax.getMin("nm", "mm", "hd");

    static MergePaths getMin(JsonReader jsonReader) throws IOException {
        String str = null;
        MergePaths.MergePathsMode mergePathsMode = null;
        boolean z = false;
        while (jsonReader.getMin()) {
            int min = jsonReader.setMin(setMax);
            if (min == 0) {
                str = jsonReader.toIntRange();
            } else if (min == 1) {
                mergePathsMode = MergePaths.MergePathsMode.forId(jsonReader.values());
            } else if (min != 2) {
                jsonReader.isInside();
                jsonReader.FastBitmap$CoordinateSystem();
            } else {
                z = jsonReader.equals();
            }
        }
        return new MergePaths(str, mergePathsMode, z);
    }
}
