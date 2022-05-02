package o;

import android.graphics.PointF;
import com.airbnb.lottie.model.content.PolystarShape;
import com.airbnb.lottie.parser.moshi.JsonReader;
import id.dana.data.constant.BranchLinkConstant;
import id.dana.lib.gcontainer.app.bridge.logging.H5GetLogInfoBridge;
import java.io.IOException;
import o.SearchView;

final class hitThumb {
    private static final JsonReader.setMax setMin = JsonReader.setMax.getMin("nm", "sy", "pt", "p", BranchLinkConstant.PayloadKey.REFERRAL, "or", H5GetLogInfoBridge.RESULT_OS, "ir", "is", "hd");

    static PolystarShape getMin(JsonReader jsonReader, setVerticalGravity setverticalgravity) throws IOException {
        String str = null;
        PolystarShape.Type type = null;
        onTextFocusChanged ontextfocuschanged = null;
        SearchView.SavedState<PointF, PointF> savedState = null;
        onTextFocusChanged ontextfocuschanged2 = null;
        onTextFocusChanged ontextfocuschanged3 = null;
        onTextFocusChanged ontextfocuschanged4 = null;
        onTextFocusChanged ontextfocuschanged5 = null;
        onTextFocusChanged ontextfocuschanged6 = null;
        boolean z = false;
        while (jsonReader.getMin()) {
            switch (jsonReader.setMin(setMin)) {
                case 0:
                    str = jsonReader.toIntRange();
                    break;
                case 1:
                    type = PolystarShape.Type.forValue(jsonReader.values());
                    break;
                case 2:
                    ontextfocuschanged = new onTextFocusChanged(getSplitTrack.setMin(jsonReader, setverticalgravity, 1.0f, getThumbDrawable.getMax, false));
                    break;
                case 3:
                    savedState = getTrackTintList.setMax(jsonReader, setverticalgravity);
                    break;
                case 4:
                    ontextfocuschanged2 = new onTextFocusChanged(getSplitTrack.setMin(jsonReader, setverticalgravity, 1.0f, getThumbDrawable.getMax, false));
                    break;
                case 5:
                    ontextfocuschanged4 = new onTextFocusChanged(getSplitTrack.setMin(jsonReader, setverticalgravity, setTitleMarginStart.getMax(), getThumbDrawable.getMax, false));
                    break;
                case 6:
                    ontextfocuschanged6 = new onTextFocusChanged(getSplitTrack.setMin(jsonReader, setverticalgravity, 1.0f, getThumbDrawable.getMax, false));
                    break;
                case 7:
                    ontextfocuschanged3 = new onTextFocusChanged(getSplitTrack.setMin(jsonReader, setverticalgravity, setTitleMarginStart.getMax(), getThumbDrawable.getMax, false));
                    break;
                case 8:
                    ontextfocuschanged5 = new onTextFocusChanged(getSplitTrack.setMin(jsonReader, setverticalgravity, 1.0f, getThumbDrawable.getMax, false));
                    break;
                case 9:
                    z = jsonReader.equals();
                    break;
                default:
                    jsonReader.isInside();
                    jsonReader.FastBitmap$CoordinateSystem();
                    break;
            }
        }
        return new PolystarShape(str, type, ontextfocuschanged, savedState, ontextfocuschanged2, ontextfocuschanged3, ontextfocuschanged4, ontextfocuschanged5, ontextfocuschanged6, z);
    }
}
