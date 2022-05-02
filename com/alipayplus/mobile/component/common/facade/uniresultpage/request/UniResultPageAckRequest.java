package com.alipayplus.mobile.component.common.facade.uniresultpage.request;

import com.alipayplus.mobile.component.common.facade.base.request.BaseServiceRequest;
import java.io.Serializable;

public class UniResultPageAckRequest extends BaseServiceRequest implements Serializable {
    public String bizNo;
    public String linkTargetId;
    public String resultBizType;
}
