package o;

import com.airbnb.lottie.parser.moshi.JsonReader;
import com.alibaba.ariver.kernel.RVParams;
import com.alipay.mobile.verifyidentity.business.securitycommon.bean.SecurityConstants;
import java.io.IOException;

public final class getTrackDrawable {
    private static JsonReader.setMax length = JsonReader.setMax.getMin("fc", RVParams.SAFEPAY_CONTEXT, "sw", SecurityConstants.KEY_TEXT);
    private static JsonReader.setMax setMin = JsonReader.setMax.getMin("a");

    public static adjustDropDownSizeAndPosition setMin(JsonReader jsonReader, setVerticalGravity setverticalgravity) throws IOException {
        jsonReader.setMin();
        adjustDropDownSizeAndPosition adjustdropdownsizeandposition = null;
        while (jsonReader.getMin()) {
            if (jsonReader.setMin(setMin) != 0) {
                jsonReader.isInside();
                jsonReader.FastBitmap$CoordinateSystem();
            } else {
                jsonReader.setMin();
                onQueryRefine onqueryrefine = null;
                onQueryRefine onqueryrefine2 = null;
                onTextFocusChanged ontextfocuschanged = null;
                onTextFocusChanged ontextfocuschanged2 = null;
                while (jsonReader.getMin()) {
                    int min = jsonReader.setMin(length);
                    if (min == 0) {
                        onqueryrefine = new onQueryRefine(getSplitTrack.setMin(jsonReader, setverticalgravity, 1.0f, setThumbResource.getMax, false));
                    } else if (min == 1) {
                        onqueryrefine2 = new onQueryRefine(getSplitTrack.setMin(jsonReader, setverticalgravity, 1.0f, setThumbResource.getMax, false));
                    } else if (min == 2) {
                        ontextfocuschanged = new onTextFocusChanged(getSplitTrack.setMin(jsonReader, setverticalgravity, setTitleMarginStart.getMax(), getThumbDrawable.getMax, false));
                    } else if (min != 3) {
                        jsonReader.isInside();
                        jsonReader.FastBitmap$CoordinateSystem();
                    } else {
                        ontextfocuschanged2 = new onTextFocusChanged(getSplitTrack.setMin(jsonReader, setverticalgravity, setTitleMarginStart.getMax(), getThumbDrawable.getMax, false));
                    }
                }
                jsonReader.setMax();
                adjustdropdownsizeandposition = new adjustDropDownSizeAndPosition(onqueryrefine, onqueryrefine2, ontextfocuschanged, ontextfocuschanged2);
            }
        }
        jsonReader.setMax();
        return adjustdropdownsizeandposition == null ? new adjustDropDownSizeAndPosition((onQueryRefine) null, (onQueryRefine) null, (onTextFocusChanged) null, (onTextFocusChanged) null) : adjustdropdownsizeandposition;
    }
}
