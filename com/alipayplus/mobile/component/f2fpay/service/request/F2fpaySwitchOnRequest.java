package com.alipayplus.mobile.component.f2fpay.service.request;

import com.alipayplus.mobile.component.domain.model.request.BaseRpcRequest;
import java.io.Serializable;

public class F2fpaySwitchOnRequest extends BaseRpcRequest implements Serializable {
    public String password;
    public String userId;
    public String verificationType;
}
