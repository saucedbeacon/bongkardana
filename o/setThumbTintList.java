package o;

import android.graphics.Path;
import com.airbnb.lottie.model.content.GradientType;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.alipay.mobile.verifyidentity.business.securitycommon.bean.SecurityConstants;
import id.dana.data.constant.BranchLinkConstant;
import java.io.IOException;
import java.util.Collections;

final class setThumbTintList {
    private static final JsonReader.setMax getMin = JsonReader.setMax.getMin("nm", "g", "o", SecurityConstants.KEY_TEXT, "s", "e", BranchLinkConstant.PayloadKey.REFERRAL, "hd");
    private static final JsonReader.setMax setMin = JsonReader.setMax.getMin("p", "k");

    static isEmpty setMin(JsonReader jsonReader, setVerticalGravity setverticalgravity) throws IOException {
        onCloseClicked oncloseclicked = null;
        Path.FillType fillType = Path.FillType.WINDING;
        String str = null;
        GradientType gradientType = null;
        onWindowFocusChanged onwindowfocuschanged = null;
        onSearchClicked onsearchclicked = null;
        onSearchClicked onsearchclicked2 = null;
        boolean z = false;
        while (jsonReader.getMin()) {
            switch (jsonReader.setMin(getMin)) {
                case 0:
                    str = jsonReader.toIntRange();
                    break;
                case 1:
                    int i = -1;
                    jsonReader.setMin();
                    while (jsonReader.getMin()) {
                        int min = jsonReader.setMin(setMin);
                        if (min == 0) {
                            i = jsonReader.values();
                        } else if (min != 1) {
                            jsonReader.isInside();
                            jsonReader.FastBitmap$CoordinateSystem();
                        } else {
                            onwindowfocuschanged = new onWindowFocusChanged(getSplitTrack.setMin(jsonReader, setverticalgravity, 1.0f, new setThumbTintMode(i), false));
                        }
                    }
                    jsonReader.setMax();
                    break;
                case 2:
                    oncloseclicked = new onCloseClicked(getSplitTrack.setMin(jsonReader, setverticalgravity, 1.0f, applyThumbTint.length, false));
                    break;
                case 3:
                    gradientType = jsonReader.values() == 1 ? GradientType.LINEAR : GradientType.RADIAL;
                    break;
                case 4:
                    onsearchclicked = new onSearchClicked(getSplitTrack.setMin(jsonReader, setverticalgravity, setTitleMarginStart.getMax(), makeLayout.length, true));
                    break;
                case 5:
                    onsearchclicked2 = new onSearchClicked(getSplitTrack.setMin(jsonReader, setverticalgravity, setTitleMarginStart.getMax(), makeLayout.length, true));
                    break;
                case 6:
                    fillType = jsonReader.values() == 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD;
                    break;
                case 7:
                    z = jsonReader.equals();
                    break;
                default:
                    jsonReader.isInside();
                    jsonReader.FastBitmap$CoordinateSystem();
                    break;
            }
        }
        return new isEmpty(str, gradientType, fillType, onwindowfocuschanged, oncloseclicked == null ? new onCloseClicked(Collections.singletonList(new setTitleMarginTop(100))) : oncloseclicked, onsearchclicked, onsearchclicked2, z);
    }
}
