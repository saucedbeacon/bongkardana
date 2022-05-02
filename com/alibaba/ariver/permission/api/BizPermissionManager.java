package com.alibaba.ariver.permission.api;

import com.alibaba.fastjson.JSONObject;

public interface BizPermissionManager {
    boolean checkBizParamPermission(String str, String str2, JSONObject jSONObject);
}
