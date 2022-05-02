package com.alibaba.griver.base.common.utils;

import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.resource.api.models.AppInfoModel;
import com.alibaba.ariver.resource.api.models.AppModel;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.griver.api.model.APIContext;
import com.alibaba.griver.api.model.MiniProgramMetaData;
import com.alibaba.griver.base.common.constants.GriverBaseConstants;
import com.alibaba.griver.base.common.innerapp.GriverInnerAppUtil;
import com.alibaba.griver.base.common.logger.GriverLogger;
import id.dana.data.foundation.logger.log.DanaLogConstants;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;

public class APIContextUtils {
    public static APIContext createApiContext(Page page) {
        if (page == null) {
            return new APIContext(DanaLogConstants.TAG.MINI_PROGRAM, new MiniProgramMetaData(""), (Map<String, String>) null);
        }
        return createApiContext((AppModel) page.getApp().getData(AppModel.class));
    }

    public static APIContext createApiContext(AppModel appModel) {
        String str = "";
        if (appModel == null) {
            return new APIContext(DanaLogConstants.TAG.MINI_PROGRAM, new MiniProgramMetaData(str), (Map<String, String>) null);
        }
        String appId = appModel.getAppId();
        JSONObject extendInfos = appModel.getExtendInfos();
        if (extendInfos != null) {
            str = extendInfos.getString("merchantId");
        }
        MiniProgramMetaData miniProgramMetaData = new MiniProgramMetaData(appId, str);
        AppInfoModel appInfoModel = appModel.getAppInfoModel();
        if (appInfoModel != null) {
            miniProgramMetaData.setName(appInfoModel.getName());
            miniProgramMetaData.setLogo(appInfoModel.getLogo());
            miniProgramMetaData.setDesc(appInfoModel.getDesc());
            miniProgramMetaData.setDeployVersion(appInfoModel.getVersion());
            miniProgramMetaData.setDeveloperVersion(appInfoModel.getDeveloperVersion());
        }
        if (extendInfos != null) {
            miniProgramMetaData.setAppType(2);
            try {
                if (extendInfos.getJSONObject(GriverInnerAppUtil.KEY_CLIENT_PARAM) != null) {
                    miniProgramMetaData.setClientParams(new org.json.JSONObject(JSON.toJSONString(extendInfos.getJSONObject(GriverInnerAppUtil.KEY_CLIENT_PARAM))));
                }
                if (extendInfos.getJSONObject("languages") != null) {
                    miniProgramMetaData.setLanguages(new org.json.JSONObject(JSON.toJSONString(extendInfos.getJSONObject("languages"))));
                }
                JSONObject jSONObject = extendInfos.getJSONObject("acParams");
                if (jSONObject != null && !jSONObject.isEmpty()) {
                    HashMap hashMap = new HashMap();
                    for (String next : jSONObject.keySet()) {
                        hashMap.put(next, jSONObject.getString(next));
                    }
                    miniProgramMetaData.setAcParams(hashMap);
                }
            } catch (JSONException e) {
                GriverLogger.e("APIContextUtils", "parse mini program meta data error, just print", e);
            }
            miniProgramMetaData.setAcquirerId(extendInfos.getString(GriverBaseConstants.KEY_SOURCE_SITE));
            miniProgramMetaData.setPublishStatus(extendInfos.getString("publishingStatus"));
            miniProgramMetaData.setClientId(extendInfos.getString(GriverBaseConstants.KEY_CLIENT_ID));
        }
        return new APIContext(DanaLogConstants.TAG.MINI_PROGRAM, miniProgramMetaData, (Map<String, String>) null);
    }
}
