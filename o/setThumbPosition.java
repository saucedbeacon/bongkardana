package o;

import android.graphics.Path;
import com.airbnb.lottie.parser.moshi.JsonReader;
import id.dana.data.constant.BranchLinkConstant;
import java.io.IOException;
import java.util.Collections;

final class setThumbPosition {
    private static final JsonReader.setMax setMin = JsonReader.setMax.getMin("nm", "c", "o", "fillEnabled", BranchLinkConstant.PayloadKey.REFERRAL, "hd");

    static setImeVisibility getMin(JsonReader jsonReader, setVerticalGravity setverticalgravity) throws IOException {
        onCloseClicked oncloseclicked = null;
        String str = null;
        onQueryRefine onqueryrefine = null;
        int i = 1;
        boolean z = false;
        boolean z2 = false;
        while (jsonReader.getMin()) {
            int min = jsonReader.setMin(setMin);
            if (min == 0) {
                str = jsonReader.toIntRange();
            } else if (min == 1) {
                onqueryrefine = new onQueryRefine(getSplitTrack.setMin(jsonReader, setverticalgravity, 1.0f, setThumbResource.getMax, false));
            } else if (min == 2) {
                oncloseclicked = new onCloseClicked(getSplitTrack.setMin(jsonReader, setverticalgravity, 1.0f, applyThumbTint.length, false));
            } else if (min == 3) {
                z = jsonReader.equals();
            } else if (min == 4) {
                i = jsonReader.values();
            } else if (min != 5) {
                jsonReader.isInside();
                jsonReader.FastBitmap$CoordinateSystem();
            } else {
                z2 = jsonReader.equals();
            }
        }
        if (oncloseclicked == null) {
            oncloseclicked = new onCloseClicked(Collections.singletonList(new setTitleMarginTop(100)));
        }
        return new setImeVisibility(str, z, i == 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD, onqueryrefine, oncloseclicked, z2);
    }
}
