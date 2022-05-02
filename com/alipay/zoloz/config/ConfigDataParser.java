package com.alipay.zoloz.config;

import com.alibaba.fastjson.JSON;
import com.alipay.mobile.security.bio.runtime.FrameworkDesc;
import com.alipay.zoloz.config.util.ConfigLog;
import com.alipay.zoloz.config.util.FileUtil;
import java.util.HashMap;

class ConfigDataParser {
    private static final String FILE_SUBFIX_FRAMEWORK = "/FrameworkConfig/framework.json";
    private static final String FILE_SUBFIX_H5_CONFIG = "/H5Config/business.json";
    private static final String FILE_SUBFIX_OFF_WEB_CONFIG = "/ekyc_web.zip";
    public static final String FILE_SUBFIX_UI_CONFIG = "/";
    public static final String TAG = "ConfigDataParser";
    private static final String webEndPath = "/zoloz/web";
    private String baseTargetPath;
    private HashMap<String, Object> bizConfig = new HashMap<>();
    private String feUIConfig;
    private HashMap<String, Object> frameworkConfigs = new HashMap<>();
    private HashMap<String, Object> h5Configs = new HashMap<>();
    private String uiConfigPath;

    ConfigDataParser() {
    }

    /* access modifiers changed from: package-private */
    public boolean parseAndVerifyConfig(IConfigCenterCallback iConfigCenterCallback) {
        boolean parseUIConfig = parseUIConfig();
        boolean parseFrameworkConfig = parseFrameworkConfig();
        boolean parseH5Config = parseH5Config();
        parseFeUIConfig();
        if (!parseUIConfig || !parseFrameworkConfig || !parseH5Config) {
            StringBuilder sb = new StringBuilder("");
            if (!parseUIConfig) {
                sb.append("ui config wrong");
            } else if (!parseFrameworkConfig) {
                sb.append("framework config wrong");
            } else if (!parseH5Config) {
                sb.append("H5 config wrong");
            }
            ConfigLog.e(TAG, "error: ".concat(String.valueOf(sb)));
            iConfigCenterCallback.onConfigFail(sb.toString());
        } else {
            iConfigCenterCallback.onConfigSuccess();
        }
        return parseFrameworkConfig && parseUIConfig && parseH5Config;
    }

    private synchronized boolean parseH5Config() {
        ConfigLog.d(TAG, "parseH5Config for web config");
        StringBuilder sb = new StringBuilder();
        sb.append(this.baseTargetPath);
        sb.append(FILE_SUBFIX_H5_CONFIG);
        String obj = sb.toString();
        if (!FileUtil.exists(obj)) {
            return true;
        }
        this.h5Configs = (HashMap) JSON.parseObject(FileUtil.getText(obj), HashMap.class);
        return true;
    }

    private synchronized boolean parseFrameworkConfig() {
        ConfigLog.d(TAG, "parseFrameworkConfig");
        StringBuilder sb = new StringBuilder();
        sb.append(this.baseTargetPath);
        sb.append(FILE_SUBFIX_FRAMEWORK);
        String obj = sb.toString();
        if (FileUtil.exists(obj)) {
            String text = FileUtil.getText(obj);
            if (text != null) {
                this.frameworkConfigs.putAll((HashMap) JSON.parseObject(text, HashMap.class));
            }
            return true;
        }
        this.frameworkConfigs.putAll((HashMap) JSON.parseObject(new String(com.alipay.mobile.security.bio.utils.FileUtil.getAssetsData(ConfigCenter.getInstance().getApplicationContext().getResources(), FrameworkDesc.ASSETS_NAME_ZOLOZ_FRAMEWORK)), HashMap.class));
        return verifyFrameworkParams(this.frameworkConfigs);
    }

    private synchronized void parseFeUIConfig() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.baseTargetPath);
        sb.append("//feuiconfig.json");
        String obj = sb.toString();
        if (FileUtil.exists(obj)) {
            this.feUIConfig = FileUtil.getText(obj);
        }
    }

    private boolean verifyFrameworkParams(HashMap hashMap) {
        return hashMap.get(ConfigConstants.BIO_SDK_VERSION) != null;
    }

    private boolean parseUIConfig() {
        ConfigLog.d(TAG, "parseUIConfig");
        boolean isUIConfigExist = ConfigCenter.getInstance().isUIConfigExist();
        StringBuilder sb = new StringBuilder();
        sb.append(this.baseTargetPath);
        sb.append("/");
        String obj = sb.toString();
        this.uiConfigPath = obj;
        if (FileUtil.exists(obj)) {
            ConfigCenter.getInstance().setUiConfigPath(this.uiConfigPath);
            return true;
        } else if (!isUIConfigExist) {
            return true;
        } else {
            return false;
        }
    }

    public void setBaseTargetPath(String str) {
        this.baseTargetPath = str;
    }

    public String getBaseTargetPath() {
        return this.baseTargetPath;
    }

    public synchronized Object getValueFromFramework(String str) {
        return this.frameworkConfigs.get(str);
    }

    public synchronized Object getValueFromH5(String str) {
        return this.h5Configs.get(str);
    }

    public synchronized void addAll(HashMap hashMap) {
        this.frameworkConfigs.putAll(hashMap);
    }

    public synchronized void disable() {
        this.frameworkConfigs.clear();
        this.h5Configs.clear();
    }

    public synchronized void addOne(String str, Object obj) {
        this.frameworkConfigs.put(str, obj);
    }

    public HashMap<String, Object> getBizConfig() {
        return this.bizConfig;
    }

    public HashMap<String, Object> getFrameworkConfigs() {
        return this.frameworkConfigs;
    }

    public void setBizConfig(HashMap<String, Object> hashMap) {
        this.bizConfig = hashMap;
    }

    public String getFeUIConfig() {
        return this.feUIConfig;
    }
}
