package o;

import android.util.JsonWriter;
import com.alibaba.ariver.kernel.RVParams;
import com.alibaba.ariver.remotedebug.utils.TinyAppLogUtil;
import id.dana.lib.gcontainer.app.bridge.logging.H5GetLogInfoBridge;
import id.dana.twilio.identityverification.TwilioIdentityVerificationActivity;
import java.io.IOException;
import java.io.StringWriter;

final class cancelLoad extends stopLoading {
    private float isInside;

    cancelLoad(String str, String str2, String str3, String str4, String str5, String str6, String str7, float f) {
        super(str, str2, str3, str4, str5, str6, str7, onStopLoading.HEARTBEAT);
        this.isInside = f;
    }

    /* access modifiers changed from: package-private */
    public final String setMin() {
        StringWriter stringWriter = new StringWriter();
        try {
            new JsonWriter(stringWriter).beginObject().name("apiKey").value(this.getMax).name("guardVersion").value(this.getMin).name("appVersion").value(this.length).name(H5GetLogInfoBridge.RESULT_OS).value((long) this.setMax).name("osVersion").value(this.setMin).name(TwilioIdentityVerificationActivity.CHALLENGE_INFO_DEVICE).value(this.toFloatRange).name("fingerprint").value(this.equals).name(TinyAppLogUtil.TINY_APP_STANDARD_EXTRA_TIMESTAMP).value(this.IsOverlapping).name("type").value((long) this.toIntRange.IsOverlapping).name("data").beginObject().name(RVParams.SHOW_REPORT_BTN).value((double) this.isInside).endObject().endObject();
            return stringWriter.toString();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
