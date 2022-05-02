package o;

import android.util.JsonWriter;
import com.alibaba.ariver.remotedebug.utils.TinyAppLogUtil;
import id.dana.lib.gcontainer.app.bridge.logging.H5GetLogInfoBridge;
import id.dana.twilio.identityverification.TwilioIdentityVerificationActivity;
import java.io.IOException;
import java.io.StringWriter;

final class startLoading extends stopLoading {
    private int isInside;
    private int toDoubleRange;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    startLoading(java.lang.String r12, java.lang.String r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, o.commitContentChanged r19) {
        /*
            r11 = this;
            r9 = r11
            r10 = r19
            o.onStopLoading r8 = r10.length
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            int r0 = r10.getMax
            r9.isInside = r0
            int r0 = r10.getMin
            r9.toDoubleRange = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.startLoading.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, o.commitContentChanged):void");
    }

    /* access modifiers changed from: package-private */
    public final String setMin() {
        StringWriter stringWriter = new StringWriter();
        try {
            new JsonWriter(stringWriter).beginObject().name("apiKey").value(this.getMax).name("guardVersion").value(this.getMin).name("appVersion").value(this.length).name(H5GetLogInfoBridge.RESULT_OS).value((long) this.setMax).name("osVersion").value(this.setMin).name(TwilioIdentityVerificationActivity.CHALLENGE_INFO_DEVICE).value(this.toFloatRange).name("fingerprint").value(this.equals).name(TinyAppLogUtil.TINY_APP_STANDARD_EXTRA_TIMESTAMP).value(this.IsOverlapping).name("type").value((long) this.toIntRange.IsOverlapping).name("data").beginObject().name("okValue").value((long) this.isInside).name("resultValue").value((long) this.toDoubleRange).endObject().endObject();
            return stringWriter.toString();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
