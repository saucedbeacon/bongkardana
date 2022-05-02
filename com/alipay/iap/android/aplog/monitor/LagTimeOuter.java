package com.alipay.iap.android.aplog.monitor;

import com.alipay.iap.android.aplog.core.LoggerFactory;
import com.alipay.iap.android.aplog.monitor.tools.HandlerThreadFactory;
import id.dana.myprofile.SettingMoreProfileActivity;
import id.dana.twilio.identityverification.TwilioIdentityVerificationActivity;

public class LagTimeOuter extends TimeOuter {
    /* access modifiers changed from: private */
    public ANRMonitor c;

    public LagTimeOuter(ANRMonitor aNRMonitor, long j) {
        super(j);
        this.c = aNRMonitor;
    }

    /* access modifiers changed from: package-private */
    public void a() {
        LoggerFactory.getTraceLogger().info("ANRMonitor", TwilioIdentityVerificationActivity.CHALLENGE_INFO_TIMEOUT);
        final long j = this.b;
        final long currentTimeMillis = System.currentTimeMillis();
        this.c.b(j, currentTimeMillis);
        if (this.c != null) {
            HandlerThreadFactory.a().postDelayed(new Runnable() {
                public void run() {
                    LagTimeOuter.this.c.c(j, currentTimeMillis);
                }
            }, SettingMoreProfileActivity.TOAST_DURATION);
        }
    }
}
