package com.alipayplus.mobile.component.f2fpay.service.request;

import com.alipayplus.mobile.component.common.facade.base.request.BaseServiceRequest;
import java.io.Serializable;

public class F2fPayInitRequest extends BaseServiceRequest implements Serializable {
    public String apdid;
    public String imei;
    public String imsi;
    public String mac;
    public String osType;
    public String osVersion;
    public String random;
    public String tid;
}
