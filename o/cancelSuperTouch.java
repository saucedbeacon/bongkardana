package o;

import android.graphics.PointF;
import com.airbnb.lottie.parser.moshi.JsonReader;
import id.dana.data.constant.BranchLinkConstant;
import java.io.IOException;
import o.SearchView;

final class cancelSuperTouch {
    private static JsonReader.setMax length = JsonReader.setMax.getMin("nm", "p", "s", BranchLinkConstant.PayloadKey.REFERRAL, "hd");

    static replaceText setMin(JsonReader jsonReader, setVerticalGravity setverticalgravity) throws IOException {
        String str = null;
        SearchView.SavedState<PointF, PointF> savedState = null;
        onSearchClicked onsearchclicked = null;
        onTextFocusChanged ontextfocuschanged = null;
        boolean z = false;
        while (jsonReader.getMin()) {
            int min = jsonReader.setMin(length);
            if (min == 0) {
                str = jsonReader.toIntRange();
            } else if (min == 1) {
                savedState = getTrackTintList.setMax(jsonReader, setverticalgravity);
            } else if (min == 2) {
                onsearchclicked = new onSearchClicked(getSplitTrack.setMin(jsonReader, setverticalgravity, setTitleMarginStart.getMax(), makeLayout.length, true));
            } else if (min == 3) {
                ontextfocuschanged = new onTextFocusChanged(getSplitTrack.setMin(jsonReader, setverticalgravity, setTitleMarginStart.getMax(), getThumbDrawable.getMax, false));
            } else if (min != 4) {
                jsonReader.FastBitmap$CoordinateSystem();
            } else {
                z = jsonReader.equals();
            }
        }
        return new replaceText(str, savedState, onsearchclicked, ontextfocuschanged, z);
    }
}
