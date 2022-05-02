package o;

import android.content.Context;
import android.text.TextUtils;
import id.dana.R;
import id.dana.tracker.TrackerKey;
import id.dana.tracker.mixpanel.ChallengeEvent;
import o.convertDipToPx;

public final class JavaBlurProcess {
    public String length;
    public final Context setMin;

    public final class BlurTask {
        public String getMin;
        public long length;
        public String setMax;
        public String setMin;
    }

    public JavaBlurProcess(Context context) {
        this.setMin = context;
    }

    public JavaBlurProcess(Context context, String str) {
        this.setMin = context;
        this.length = str;
    }

    public final convertDipToPx getMax(boolean z) {
        convertDipToPx.length length2 = new convertDipToPx.length(this.setMin);
        length2.getMax = TrackerKey.Event.PIN_COMPLETED;
        convertDipToPx.length min = length2.setMax("Source", TextUtils.isEmpty(this.length) ? "" : this.length).setMin(ChallengeEvent.Property.PIN_SUCCESS, z);
        ScreenBrightnessBridgeExtension screenBrightnessBridgeExtension = ScreenBrightnessBridgeExtension.getMin;
        if (!ScreenBrightnessBridgeExtension.Grayscale$Algorithm().isEmpty()) {
            ScreenBrightnessBridgeExtension screenBrightnessBridgeExtension2 = ScreenBrightnessBridgeExtension.getMin;
            min.setMax("Merchant Name", ScreenBrightnessBridgeExtension.Grayscale$Algorithm());
        } else {
            min.setMax("Merchant Name", this.setMin.getString(R.string.dana_string));
        }
        min.setMin();
        return new convertDipToPx(min, (byte) 0);
    }
}
