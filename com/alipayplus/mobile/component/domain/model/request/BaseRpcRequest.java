package com.alipayplus.mobile.component.domain.model.request;

import com.alipayplus.mobile.component.common.facade.base.MobileEnvInfo;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class BaseRpcRequest implements Serializable {
    public MobileEnvInfo envInfo;
    public Map<String, String> extParams = new HashMap();
}
