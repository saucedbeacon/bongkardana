package com.alipayplus.mobile.component.domain.model.user;

import java.io.Serializable;
import java.util.Date;
import java.util.Map;

public class Classification implements Serializable {
    public String classificationName;
    public String classificationValue;
    public Map<String, Object> extInfo;
    public Date modifyDate;
}
