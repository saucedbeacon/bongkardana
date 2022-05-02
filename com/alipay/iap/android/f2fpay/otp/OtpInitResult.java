package com.alipay.iap.android.f2fpay.otp;

import android.text.TextUtils;
import com.alipayplus.mobile.component.f2fpay.service.result.F2fPayInitResult;

public class OtpInitResult {
    public int interval;
    public String otpSeed;
    public int queryCount;
    public String queryInterval;
    public int rpcTimeCostMillisecond;
    public String serverTime;
    public String tidUidIndex;

    public OtpInitResult() {
    }

    public OtpInitResult(F2fPayInitResult f2fPayInitResult) {
        this.tidUidIndex = f2fPayInitResult.tidUidIndex;
        this.otpSeed = f2fPayInitResult.otpSeed;
        this.serverTime = f2fPayInitResult.serverTime;
        if (!TextUtils.isEmpty(f2fPayInitResult.queryInterval)) {
            this.queryInterval = f2fPayInitResult.queryInterval;
        }
        if (!TextUtils.isEmpty(f2fPayInitResult.interval) && TextUtils.isDigitsOnly(f2fPayInitResult.interval)) {
            this.interval = Integer.parseInt(f2fPayInitResult.interval);
        }
        if (!TextUtils.isEmpty(f2fPayInitResult.interval) && TextUtils.isDigitsOnly(f2fPayInitResult.queryCount)) {
            this.queryCount = Integer.parseInt(f2fPayInitResult.queryCount);
        }
    }
}
