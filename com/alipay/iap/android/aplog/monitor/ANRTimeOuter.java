package com.alipay.iap.android.aplog.monitor;

import com.alipay.iap.android.aplog.core.LoggerFactory;
import id.dana.twilio.identityverification.TwilioIdentityVerificationActivity;

public class ANRTimeOuter extends TimeOuter {
    private ANRMonitor c;

    public ANRTimeOuter(ANRMonitor aNRMonitor, long j) {
        super(j);
        this.c = aNRMonitor;
    }

    /* access modifiers changed from: package-private */
    public void a() {
        LoggerFactory.getTraceLogger().info("ANRMonitor", TwilioIdentityVerificationActivity.CHALLENGE_INFO_TIMEOUT);
        ANRMonitor aNRMonitor = this.c;
        if (aNRMonitor != null) {
            aNRMonitor.c(this.b, System.currentTimeMillis());
        }
    }
}
