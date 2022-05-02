package o;

import android.graphics.PointF;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;
import java.util.ArrayList;
import o.SearchView;

public final class getTrackTintList {
    private static final JsonReader.setMax getMin = JsonReader.setMax.getMin("k", "x", "y");

    public static onVoiceClicked setMin(JsonReader jsonReader, setVerticalGravity setverticalgravity) throws IOException {
        ArrayList arrayList = new ArrayList();
        if (jsonReader.IsOverlapping() == JsonReader.Token.BEGIN_ARRAY) {
            jsonReader.length();
            while (jsonReader.getMin()) {
                arrayList.add(new getQuery(setverticalgravity, setTextOn.length(jsonReader, setverticalgravity, setTitleMarginStart.getMax(), setShowText.setMin, jsonReader.IsOverlapping() == JsonReader.Token.BEGIN_OBJECT, false)));
            }
            jsonReader.getMax();
            getSplitTrack.getMax(arrayList);
        } else {
            arrayList.add(new setTitleMarginTop(getTextOn.getMin(jsonReader, setTitleMarginStart.getMax())));
        }
        return new onVoiceClicked(arrayList);
    }

    static SearchView.SavedState<PointF, PointF> setMax(JsonReader jsonReader, setVerticalGravity setverticalgravity) throws IOException {
        jsonReader.setMin();
        onVoiceClicked onvoiceclicked = null;
        onTextFocusChanged ontextfocuschanged = null;
        onTextFocusChanged ontextfocuschanged2 = null;
        boolean z = false;
        while (jsonReader.IsOverlapping() != JsonReader.Token.END_OBJECT) {
            int min = jsonReader.setMin(getMin);
            if (min != 0) {
                if (min != 1) {
                    if (min != 2) {
                        jsonReader.isInside();
                        jsonReader.FastBitmap$CoordinateSystem();
                    } else if (jsonReader.IsOverlapping() == JsonReader.Token.STRING) {
                        jsonReader.FastBitmap$CoordinateSystem();
                    } else {
                        ontextfocuschanged2 = new onTextFocusChanged(getSplitTrack.setMin(jsonReader, setverticalgravity, setTitleMarginStart.getMax(), getThumbDrawable.getMax, false));
                    }
                } else if (jsonReader.IsOverlapping() == JsonReader.Token.STRING) {
                    jsonReader.FastBitmap$CoordinateSystem();
                } else {
                    ontextfocuschanged = new onTextFocusChanged(getSplitTrack.setMin(jsonReader, setverticalgravity, setTitleMarginStart.getMax(), getThumbDrawable.getMax, false));
                }
                z = true;
            } else {
                onvoiceclicked = setMin(jsonReader, setverticalgravity);
            }
        }
        jsonReader.setMax();
        if (z) {
            setTitleMargin.setMax("Lottie doesn't support expressions.");
            setverticalgravity.length.add("Lottie doesn't support expressions.");
        }
        return onvoiceclicked != null ? onvoiceclicked : new onActionViewExpanded(ontextfocuschanged, ontextfocuschanged2);
    }
}
