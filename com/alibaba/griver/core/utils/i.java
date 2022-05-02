package com.alibaba.griver.core.utils;

import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.resource.api.models.AppInfoModel;
import com.alibaba.ariver.resource.api.models.AppModel;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.griver.api.bridge.BridgeInterceptor;
import com.alibaba.griver.base.common.constants.GriverBaseConstants;
import com.alibaba.griver.base.common.innerapp.GriverInnerAppUtil;
import com.alipay.mobile.verifyidentity.business.securitycommon.bean.SecurityConstants;

public class i {
    public static void a(Page page, BridgeInterceptor.InterceptContext interceptContext) {
        AppModel appModel = (AppModel) page.getApp().getData(AppModel.class);
        if (appModel != null) {
            JSONObject jSONObject = new JSONObject();
            AppInfoModel appInfoModel = appModel.getAppInfoModel();
            if (appInfoModel != null) {
                jSONObject.put("appId", (Object) appInfoModel.getAppId());
                jSONObject.put("appType", (Object) 2);
                jSONObject.put("name", (Object) appInfoModel.getName());
                jSONObject.put("logo", (Object) appInfoModel.getLogo());
                jSONObject.put(SecurityConstants.KEY_DESC, (Object) appInfoModel.getDesc());
                jSONObject.put("deployVersion", (Object) appInfoModel.getVersion());
                jSONObject.put("developerVersion", (Object) appInfoModel.getDeveloperVersion());
            }
            JSONObject extendInfos = appModel.getExtendInfos();
            if (extendInfos != null) {
                jSONObject.put(GriverBaseConstants.KEY_SOURCE_SITE, (Object) extendInfos.getString(GriverBaseConstants.KEY_SOURCE_SITE));
                jSONObject.put(GriverBaseConstants.KEY_CLIENT_ID, (Object) extendInfos.getString(GriverBaseConstants.KEY_CLIENT_ID));
                jSONObject.put("publishingStatus", (Object) extendInfos.getString("publishingStatus"));
                if (extendInfos.getJSONObject(GriverInnerAppUtil.KEY_CLIENT_PARAM) != null) {
                    jSONObject.put(GriverInnerAppUtil.KEY_CLIENT_PARAM, (Object) JSON.toJSONString(extendInfos.getJSONObject(GriverInnerAppUtil.KEY_CLIENT_PARAM)));
                }
                if (extendInfos.getJSONObject("languages") != null) {
                    jSONObject.put("languages", (Object) JSON.toJSONString(extendInfos.getJSONObject("languages")));
                }
                interceptContext.sourceSite = extendInfos.getString(GriverBaseConstants.KEY_SOURCE_SITE);
                boolean containsKey = extendInfos.containsKey("merchantId");
                JSONObject jSONObject2 = extendInfos.getJSONObject("acParams");
                if (containsKey) {
                    if (jSONObject2 == null) {
                        jSONObject2 = new JSONObject();
                    }
                    if (!jSONObject2.containsKey("merchantId")) {
                        jSONObject.put("merchantId", extendInfos.get("merchantId"));
                        jSONObject2.put("merchantId", extendInfos.get("merchantId"));
                    }
                }
                jSONObject.put("acParams", (Object) JSON.toJSONString(jSONObject2));
                interceptContext.acParams = jSONObject;
            }
            if (appModel.getAppInfoModel() != null) {
                interceptContext.miniProgramName = appModel.getAppInfoModel().getName();
            }
        }
    }
}
