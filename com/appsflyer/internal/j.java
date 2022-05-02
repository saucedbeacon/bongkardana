package com.appsflyer.internal;

import android.content.Context;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerClientImpl;
import com.appsflyer.AFLogger;
import java.util.HashMap;
import o.inflateMenu;
import o.setContentInsetsAbsolute;

public final class j implements inflateMenu {

    /* renamed from: ˋ  reason: contains not printable characters */
    private InstallReferrerClient f8769;

    /* renamed from: ˎ  reason: contains not printable characters */
    private m f8770;

    /* renamed from: ˏ  reason: contains not printable characters */
    public final void m1278(Context context, m mVar) {
        this.f8770 = mVar;
        try {
            Context context2 = InstallReferrerClient.setMax(context).setMin;
            if (context2 != null) {
                InstallReferrerClientImpl installReferrerClientImpl = new InstallReferrerClientImpl(context2);
                this.f8769 = installReferrerClientImpl;
                installReferrerClientImpl.setMin(this);
                return;
            }
            throw new IllegalArgumentException("Please provide a valid Context.");
        } catch (Throwable th) {
            AFLogger.afErrorLog("referrerClient -> startConnection", th);
        }
    }

    public final void onInstallReferrerSetupFinished(int i) {
        HashMap hashMap = new HashMap();
        hashMap.put("code", String.valueOf(i));
        setContentInsetsAbsolute setcontentinsetsabsolute = null;
        if (i == 0) {
            try {
                AFLogger.afDebugLog("InstallReferrer connected");
                if (this.f8769.length()) {
                    setcontentinsetsabsolute = this.f8769.getMin();
                    this.f8769.getMax();
                } else {
                    AFLogger.afWarnLog("ReferrerClient: InstallReferrer is not ready");
                    hashMap.put("err", "ReferrerClient: InstallReferrer is not ready");
                }
            } catch (Throwable th) {
                StringBuilder sb = new StringBuilder("Failed to get install referrer: ");
                sb.append(th.getMessage());
                AFLogger.afWarnLog(sb.toString());
                hashMap.put("err", th.getMessage());
            }
        } else if (i == 1) {
            AFLogger.afWarnLog("InstallReferrer not supported");
        } else if (i != 2) {
            AFLogger.afWarnLog("responseCode not found.");
        } else {
            AFLogger.afWarnLog("InstallReferrer not supported");
        }
        if (setcontentinsetsabsolute != null) {
            try {
                if (setcontentinsetsabsolute.setMin.getString("install_referrer") != null) {
                    hashMap.put("val", setcontentinsetsabsolute.setMin.getString("install_referrer"));
                }
                hashMap.put("clk", Long.toString(setcontentinsetsabsolute.setMin.getLong("referrer_click_timestamp_seconds")));
                hashMap.put("install", Long.toString(setcontentinsetsabsolute.setMin.getLong("install_begin_timestamp_seconds")));
                try {
                    hashMap.put("instant", Boolean.valueOf(setcontentinsetsabsolute.setMax()));
                } catch (NoSuchMethodError unused) {
                }
            } catch (Exception unused2) {
                hashMap.put("val", "-1");
                hashMap.put("clk", "-1");
                hashMap.put("install", "-1");
            }
        }
        m mVar = this.f8770;
        if (mVar != null) {
            mVar.m1279(hashMap);
        }
    }

    public final void onInstallReferrerServiceDisconnected() {
        AFLogger.afDebugLog("Install Referrer service disconnected");
    }
}
