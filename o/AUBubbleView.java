package o;

import android.content.Context;
import android.text.TextUtils;
import id.dana.R;
import id.dana.tracker.TrackerKey;
import id.dana.tracker.mixpanel.ChallengeEvent;
import o.convertDipToPx;

public final class AUBubbleView {
    private Context getMin;
    private String setMax;
    private String setMin;

    public AUBubbleView(Context context, String str) {
        this.getMin = context;
        this.setMax = str;
    }

    public final convertDipToPx setMin(String str) {
        this.setMin = str;
        BlurProcess.getMin(TrackerKey.Event.OTP_INPUT);
        convertDipToPx.length length = new convertDipToPx.length(this.getMin);
        length.getMax = TrackerKey.Event.OTP_REQUEST;
        convertDipToPx.length max = length.setMax("Source", this.setMax).setMax(ChallengeEvent.Property.OTP_CHANNEL, TextUtils.isEmpty(this.setMin) ? ChallengeEvent.Channel.SMS : this.setMin);
        ScreenBrightnessBridgeExtension screenBrightnessBridgeExtension = ScreenBrightnessBridgeExtension.getMin;
        if (!ScreenBrightnessBridgeExtension.Grayscale$Algorithm().isEmpty()) {
            ScreenBrightnessBridgeExtension screenBrightnessBridgeExtension2 = ScreenBrightnessBridgeExtension.getMin;
            max.setMax("Merchant Name", ScreenBrightnessBridgeExtension.Grayscale$Algorithm());
        } else {
            max.setMax("Merchant Name", this.getMin.getString(R.string.dana_string));
        }
        max.setMin();
        return new convertDipToPx(max, (byte) 0);
    }

    public final convertDipToPx setMin() {
        convertDipToPx.length length = new convertDipToPx.length(this.getMin);
        length.getMax = TrackerKey.Event.OTP_INPUT;
        convertDipToPx.length max = length.setMax("Source", this.setMax).setMax(ChallengeEvent.Property.OTP_CHANNEL, TextUtils.isEmpty(this.setMin) ? ChallengeEvent.Channel.SMS : this.setMin);
        ScreenBrightnessBridgeExtension screenBrightnessBridgeExtension = ScreenBrightnessBridgeExtension.getMin;
        if (!ScreenBrightnessBridgeExtension.Grayscale$Algorithm().isEmpty()) {
            ScreenBrightnessBridgeExtension screenBrightnessBridgeExtension2 = ScreenBrightnessBridgeExtension.getMin;
            max.setMax("Merchant Name", ScreenBrightnessBridgeExtension.Grayscale$Algorithm());
        } else {
            max.setMax("Merchant Name", this.getMin.getString(R.string.dana_string));
        }
        max.setMin();
        return new convertDipToPx(max, (byte) 0);
    }

    public final convertDipToPx setMax(boolean z, int i, int i2) {
        convertDipToPx.length length = new convertDipToPx.length(this.getMin);
        length.getMax = TrackerKey.Event.OTP_COMPLETED;
        convertDipToPx.length max = length.setMax("Source", this.setMax).setMax(ChallengeEvent.Property.OTP_CHANNEL, TextUtils.isEmpty(this.setMin) ? ChallengeEvent.Channel.SMS : this.setMin).setMin(ChallengeEvent.Property.OTP_SUCCESS, z).getMax(ChallengeEvent.Property.OTP_NUMBER_OF_ATTEMPTS, i + 1).getMax(ChallengeEvent.Property.OTP_NUMBER_OF_REQUESTS, i2);
        ScreenBrightnessBridgeExtension screenBrightnessBridgeExtension = ScreenBrightnessBridgeExtension.getMin;
        if (!ScreenBrightnessBridgeExtension.Grayscale$Algorithm().isEmpty()) {
            ScreenBrightnessBridgeExtension screenBrightnessBridgeExtension2 = ScreenBrightnessBridgeExtension.getMin;
            max.setMax("Merchant Name", ScreenBrightnessBridgeExtension.Grayscale$Algorithm());
        } else {
            max.setMax("Merchant Name", this.getMin.getString(R.string.dana_string));
        }
        max.setMin();
        return new convertDipToPx(max, (byte) 0);
    }
}
