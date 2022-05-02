package com.alipayplus.mobile.component.f2fpay.service.result;

import com.alipayplus.mobile.component.common.facade.base.result.BaseServiceResult;
import java.io.Serializable;

public class F2fPayInitResult extends BaseServiceResult implements Serializable {
    public String interval;
    public String otpSeed;
    public int otpSeedValidHours;
    public String queryCount;
    public String queryInterval;
    public String serverTime;
    public String tidUidIndex;
}
