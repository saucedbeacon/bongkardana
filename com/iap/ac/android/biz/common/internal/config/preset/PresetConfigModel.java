package com.iap.ac.android.biz.common.internal.config.preset;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.iap.ac.android.a.a;
import com.iap.ac.android.biz.common.constants.Constants;
import com.iap.ac.android.biz.common.model.CommonConfig;
import com.iap.ac.android.biz.common.model.PresetConfig;
import com.iap.ac.android.biz.common.rpc.result.MobilePaymentFetchConfigsResult;
import com.iap.ac.android.biz.common.utils.Utils;
import com.iap.ac.android.common.log.ACLog;
import com.iap.ac.android.d.e;

public class PresetConfigModel {
    public static final String PRESET_CONFIG_FILE_EXTENSION = ".json";
    public static final String PRESET_CONFIG_FILE_NAME = "iapconnect_config";
    public CommonConfig mCommonConfig = new CommonConfig();
    public PresetConfig mPresetConfig;

    private void extractCommonConfig() {
        PresetConfig presetConfig = this.mPresetConfig;
        if (presetConfig != null) {
            CommonConfig commonConfig = this.mCommonConfig;
            commonConfig.appId = presetConfig.appId;
            commonConfig.gpSignature = presetConfig.gpSignature;
            if (!TextUtils.isEmpty(presetConfig.acsAppId)) {
                this.mCommonConfig.acsAppId = this.mPresetConfig.acsAppId;
            }
            String str = this.mPresetConfig.authCode;
            if (str != null) {
                this.mCommonConfig.authCode = str;
            }
            if (!TextUtils.isEmpty(this.mPresetConfig.cdnUrl)) {
                this.mCommonConfig.cdnUrl = this.mPresetConfig.cdnUrl;
            }
            CommonConfig commonConfig2 = this.mCommonConfig;
            PresetConfig presetConfig2 = this.mPresetConfig;
            commonConfig2.siteName = presetConfig2.siteName;
            commonConfig2.certList = presetConfig2.certList;
            commonConfig2.defaultRegion = presetConfig2.defaultRegion;
            commonConfig2.defaultMobilePhoneRegionCode = presetConfig2.defaultMobilePhoneRegionCode;
            commonConfig2.pspId = presetConfig2.pspId;
            commonConfig2.clientId = presetConfig2.clientId;
        }
    }

    private String getPresetConfigFileName(@Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            return "iapconnect_config.json";
        }
        StringBuilder a2 = a.a("iapconnect_config_");
        a2.append(str.toLowerCase());
        a2.append(".json");
        return a2.toString();
    }

    public CommonConfig getCommonConfig() {
        if (isValid()) {
            return this.mCommonConfig;
        }
        return null;
    }

    public MobilePaymentFetchConfigsResult getPresetConfigResult() {
        if (isValid()) {
            return this.mPresetConfig.acconfig;
        }
        return null;
    }

    public boolean isValid() {
        PresetConfig presetConfig = this.mPresetConfig;
        return (presetConfig == null || presetConfig.acconfig == null || !this.mCommonConfig.isValid()) ? false : true;
    }

    public synchronized boolean parsePresetConfig(Context context, @Nullable String str) {
        String readConfigFromAsset = Utils.readConfigFromAsset(context, getPresetConfigFileName(str));
        if (!TextUtils.isEmpty(readConfigFromAsset)) {
            PresetConfig presetConfig = (PresetConfig) e.a(readConfigFromAsset, PresetConfig.class);
            if (presetConfig != null) {
                this.mPresetConfig = presetConfig;
                extractCommonConfig();
            } else {
                ACLog.e(Constants.TAG, "PresetConfigModel, parsePresetConfig error, parse PresetConfig null with json: ".concat(String.valueOf(readConfigFromAsset)));
            }
        } else {
            ACLog.e(Constants.TAG, "PresetConfigModel, parsePresetConfig error, empty preset file content");
        }
        return isValid();
    }
}
