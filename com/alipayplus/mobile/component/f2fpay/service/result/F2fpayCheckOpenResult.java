package com.alipayplus.mobile.component.f2fpay.service.result;

import com.alipayplus.mobile.component.common.facade.base.result.BaseServiceResult;
import java.io.Serializable;

public class F2fpayCheckOpenResult extends BaseServiceResult implements Serializable {
    public boolean openFlag;
    public String publicKey;
}
