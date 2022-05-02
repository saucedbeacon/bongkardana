package com.alipayplus.mobile.component.uniresultpage.service.request;

import com.alipayplus.mobile.component.common.facade.base.request.BaseServiceRequest;
import java.io.Serializable;
import java.util.List;

public class UniResultPageQueryRequest extends BaseServiceRequest implements Serializable {
    public List<String> bizNos;
    public String linkTargetId;
    public String resultBizType;
}
