package com.alipayplus.mobile.component.common.facade.base.request;

import com.alipayplus.mobile.component.common.facade.base.MobileEnvInfo;
import java.io.Serializable;
import java.util.Map;

public class BaseServiceRequest implements Serializable {
    public MobileEnvInfo envInfo;
    public Map<String, String> extParams;
    public String userId;
}
