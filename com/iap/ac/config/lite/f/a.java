package com.iap.ac.config.lite.f;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.iap.ac.android.common.log.ACLog;
import com.iap.ac.config.lite.c.e;
import com.iap.ac.config.lite.common.AmcsConstants;
import com.iap.ac.config.lite.listener.sectionconfig.ChangedDetails;
import com.iap.ac.config.lite.listener.sectionconfig.ISectionConfigListener;
import org.json.JSONObject;

public class a implements ISectionConfigListener {
    private static final String b = e.b("ConfigPollingListener");
    @NonNull

    /* renamed from: a  reason: collision with root package name */
    private C0034a f9813a;

    /* renamed from: com.iap.ac.config.lite.f.a$a  reason: collision with other inner class name */
    public interface C0034a {
        void startConfigPolling();

        void stopConfigPolling();
    }

    public a(@NonNull C0034a aVar) {
        this.f9813a = aVar;
    }

    public void onConfigChanged(@NonNull String str, @Nullable JSONObject jSONObject, @NonNull ChangedDetails changedDetails) {
        if ("amcs".equalsIgnoreCase(str)) {
            ACLog.d(b, "notice amcs section has changed!");
            if (jSONObject != null) {
                long optInt = (long) jSONObject.optInt(AmcsConstants.AMCS_SYNC_INTERVAL, 300);
                if (optInt <= 0) {
                    ACLog.d(b, "notice dns sync interval close");
                    this.f9813a.stopConfigPolling();
                    return;
                }
                ACLog.d(b, String.format("notice dns sync interval changed,now is [%s]", new Object[]{Long.valueOf(optInt)}));
                this.f9813a.startConfigPolling();
            }
        }
    }
}
