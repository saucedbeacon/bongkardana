package com.alibaba.ariver.app.api.model;

import androidx.annotation.Keep;
import androidx.annotation.Nullable;
import com.alibaba.ariver.kernel.RVConstants;
import com.alibaba.ariver.kernel.RVStartParams;
import com.alibaba.ariver.kernel.common.utils.JSONUtils;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;
import com.alipay.mobile.verifyidentity.business.securitycommon.bean.SecurityConstants;
import java.util.ArrayList;
import java.util.List;

@Keep
public class AppConfigModel {
    @JSONField(name = "window")
    private JSONObject appLaunchParams;
    @JSONField(name = "includeFiles")
    private List<String> includeFiles;
    @JSONField(name = "launchParams")
    private JSONObject pageLaunchParams;
    @JSONField
    private List<String> pages;
    @JSONField
    private String useDynamicPlugins;

    @Nullable
    public static AppConfigModel parseFromJSON(byte[] bArr) {
        AppConfigModel appConfigModel = (AppConfigModel) JSONUtils.parseObject(bArr, AppConfigModel.class);
        if (appConfigModel != null) {
            return appConfigModel;
        }
        RVLogger.d(RVConstants.RESOURCE_TAG, "AppConfigModel parseFromJSON use manual parse");
        return manualParseJson(bArr);
    }

    protected static AppConfigModel manualParseJson(byte[] bArr) {
        JSONObject parseObject = JSONUtils.parseObject(bArr);
        if (parseObject == null) {
            return null;
        }
        AppConfigModel appConfigModel = new AppConfigModel();
        appConfigModel.appLaunchParams = JSONUtils.getJSONObject(parseObject, "window", new JSONObject());
        appConfigModel.pageLaunchParams = JSONUtils.getJSONObject(parseObject, RVConstants.EXTRA_RES_LAUNCH_PARAMS, new JSONObject());
        appConfigModel.useDynamicPlugins = JSONUtils.getString(parseObject, RVStartParams.KEY_USE_DYNAMIC_PLUGIN);
        JSONArray jSONArray = JSONUtils.getJSONArray(parseObject, SecurityConstants.KEY_PAGES, (JSONArray) null);
        if (jSONArray != null) {
            ArrayList arrayList = new ArrayList();
            int size = jSONArray.size();
            for (int i = 0; i < size; i++) {
                arrayList.add(jSONArray.getString(i));
            }
            appConfigModel.pages = arrayList;
        }
        return appConfigModel;
    }

    public JSONObject getAppLaunchParams() {
        return this.appLaunchParams;
    }

    public void setAppLaunchParams(JSONObject jSONObject) {
        this.appLaunchParams = jSONObject;
    }

    public List<String> getPages() {
        return this.pages;
    }

    public void setPages(List<String> list) {
        this.pages = list;
    }

    public JSONObject getPageLaunchParams() {
        return this.pageLaunchParams;
    }

    public void setPageLaunchParams(JSONObject jSONObject) {
        this.pageLaunchParams = jSONObject;
    }

    public List<String> getIncludeFiles() {
        return this.includeFiles;
    }

    public void setIncludeFiles(List<String> list) {
        this.includeFiles = list;
    }

    public String getUseDynamicPlugins() {
        return this.useDynamicPlugins;
    }

    public void setUseDynamicPlugins(String str) {
        this.useDynamicPlugins = str;
    }
}
