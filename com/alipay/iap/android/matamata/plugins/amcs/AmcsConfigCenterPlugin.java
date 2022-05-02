package com.alipay.iap.android.matamata.plugins.amcs;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alipay.iap.android.common.securityprofiles.extractor.SecurityProfileExtractor;
import com.alipay.iap.android.common.securityprofiles.profile.RpcProfile;
import com.alipay.iap.android.common.securityprofiles.profile.SyncProfile;
import com.alipay.plus.android.config.sdk.ConfigCenter;
import com.alipay.plus.android.config.sdk.ConfigCenterContext;
import com.alipay.plus.android.config.sdk.delegate.ConfigIdentifierProvider;
import com.alipay.plus.android.config.sdk.listener.ConfigChangeType;
import com.alipay.plus.android.config.sdk.listener.commonconfig.ICommonConfigListener;
import com.alipay.plus.android.config.sdk.listener.sectionconfig.ChangedDetails;
import com.alipay.plus.android.config.sdk.listener.sectionconfig.ISectionConfigListener;
import com.facebook.flipper.core.FlipperObject;
import com.facebook.flipper.core.FlipperReceiver;
import o.DANAJobIntentService;
import o.dispatchKeyShortcutEvent;
import o.getExtraData;

public class AmcsConfigCenterPlugin extends DANAJobIntentService {
    public static final String ID = "AmcsConfig";
    /* access modifiers changed from: private */
    @NonNull
    public ConfigCenter mConfigCenter = ConfigCenter.getInstance();
    @NonNull
    private final Context mContext;

    public String getId() {
        return ID;
    }

    static class Events {
        private Events() {
        }

        static class Send {
            static final String configsRefreshed = "configsRefreshed";

            Send() {
            }
        }

        static class Recv {
            static final String addConfigObserver = "addConfigObserver";
            static final String forceRefreshConfig = "forceRefreshConfig";
            static final String getSdkStatus = "getSdkStatus";
            static final String modifyConfig = "modifyConfig";

            Recv() {
            }
        }
    }

    public AmcsConfigCenterPlugin(@NonNull Context context) {
        this.mContext = context;
    }

    public synchronized void onConnect(dispatchKeyShortcutEvent dispatchkeyshortcutevent) {
        super.onConnect(dispatchkeyshortcutevent);
        dispatchkeyshortcutevent.receive("getSdkStatus", new FlipperReceiver() {
            public void onReceive(FlipperObject flipperObject, getExtraData getextradata) throws Exception {
                AmcsConfigCenterPlugin.this.getSdkStatus(getextradata);
            }
        });
        dispatchkeyshortcutevent.receive("modifyConfig", new FlipperReceiver() {
            public void onReceive(FlipperObject flipperObject, getExtraData getextradata) throws Exception {
                AmcsConfigCenterPlugin.this.modifyConfig(flipperObject, getextradata);
            }
        });
        dispatchkeyshortcutevent.receive("forceRefreshConfig", new FlipperReceiver() {
            public void onReceive(FlipperObject flipperObject, getExtraData getextradata) throws Exception {
                AmcsConfigCenterPlugin.this.mConfigCenter.refreshConfig();
            }
        });
        dispatchkeyshortcutevent.receive("addConfigObserver", new FlipperReceiver() {
            public void onReceive(FlipperObject flipperObject, getExtraData getextradata) throws Exception {
                AmcsConfigCenterPlugin.this.addConfigObserver(flipperObject);
            }
        });
    }

    /* access modifiers changed from: private */
    public void getSdkStatus(getExtraData getextradata) {
        FlipperObject.setMax setmax = new FlipperObject.setMax();
        boolean isInitialized = this.mConfigCenter.isInitialized();
        setmax.getMin("initialized", Boolean.valueOf(isInitialized));
        if (isInitialized) {
            ConfigCenterContext configContext = this.mConfigCenter.getConfigContext();
            setmax.getMax("rpcProfile", JSON.toJSONString(configContext.getRpcProfile()));
            setmax.getMax("syncProfile", JSON.toJSONString(getSyncProfile(configContext.getRpcProfile())));
            setmax.length("localVersion", Long.valueOf(this.mConfigCenter.getLastUpdateVersion()));
            setmax.getMax("env", this.mConfigCenter.getConfigContext().getEnvironment());
            ConfigIdentifierProvider identifierProvider = configContext.getIdentifierProvider();
            setmax.getMax("utdid", identifierProvider.getUtdId(this.mContext));
            setmax.getMax("reference", identifierProvider.getConfigUserId(this.mContext));
            fillConfigs(setmax);
        }
        getextradata.setMax(new FlipperObject(setmax.getMax));
    }

    @Nullable
    private SyncProfile getSyncProfile(@NonNull RpcProfile rpcProfile) {
        return new SecurityProfileExtractor(this.mContext, rpcProfile.authCode).createSyncProfile(rpcProfile.environment);
    }

    private void fillConfigs(FlipperObject.setMax setmax) {
        JSONObject configObject = this.mConfigCenter.getConfigObject();
        JSONObject sectionConfigObjects = ConfigCenter.getInstance().getSectionConfigObjects();
        setmax.getMax("commonConfig", JSON.toJSONString(configObject));
        setmax.getMax("sectionConfig", JSON.toJSONString(sectionConfigObjects));
    }

    /* access modifiers changed from: private */
    public static String convertChangeType(@NonNull ConfigChangeType configChangeType) {
        if (configChangeType == ConfigChangeType.Added) {
            return "added";
        }
        if (configChangeType == ConfigChangeType.Modified) {
            return "modified";
        }
        return configChangeType == ConfigChangeType.Deleted ? "deleted" : "unknown";
    }

    /* access modifiers changed from: private */
    public void modifyConfig(FlipperObject flipperObject, getExtraData getextradata) {
        String str;
        String str2;
        String str3 = null;
        if (flipperObject.setMax.isNull("section")) {
            str = null;
        } else {
            str = flipperObject.setMax.optString("section");
        }
        if (flipperObject.setMax.isNull("key")) {
            str2 = null;
        } else {
            str2 = flipperObject.setMax.optString("key");
        }
        if (!flipperObject.setMax.isNull("value")) {
            str3 = flipperObject.setMax.optString("value");
        }
        JSONObject parseObject = JSON.parseObject(str3);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(str2, parseObject.get("valueObject"));
        getextradata.setMax(new FlipperObject(new FlipperObject.setMax().getMin("changed", Boolean.valueOf(this.mConfigCenter.mergeConfigAdvanced(str, jSONObject, true, true, true))).getMax));
    }

    /* access modifiers changed from: private */
    public void addConfigObserver(FlipperObject flipperObject) {
        String str;
        final String str2 = null;
        if (flipperObject.setMax.isNull("section")) {
            str = null;
        } else {
            str = flipperObject.setMax.optString("section");
        }
        if (!flipperObject.setMax.isNull("key")) {
            str2 = flipperObject.setMax.optString("key");
        }
        if (TextUtils.isEmpty(str)) {
            this.mConfigCenter.addCommonConfigListener(str2, new ICommonConfigListener() {
                public void onCommonConfigChanged(@NonNull String str, @Nullable Object obj, @NonNull ConfigChangeType configChangeType) {
                    AmcsConfigCenterPlugin.this.send("configsRefreshed", new FlipperObject(new FlipperObject.setMax().getMax("key", str).getMax("changeType", AmcsConfigCenterPlugin.convertChangeType(configChangeType)).getMax("newValue", JSON.toJSONString(obj)).getMax));
                }
            });
        } else {
            this.mConfigCenter.addSectionConfigListener(str, new ISectionConfigListener() {
                public void onConfigChanged(@NonNull String str, @Nullable JSONObject jSONObject, @NonNull ChangedDetails changedDetails) {
                    if (TextUtils.isEmpty(str2)) {
                        AmcsConfigCenterPlugin.this.send("configsRefreshed", new FlipperObject(new FlipperObject.setMax().getMax("section", str).getMax("newValue", JSON.toJSONString(jSONObject)).getMax));
                        return;
                    }
                    String str2 = null;
                    if (jSONObject != null) {
                        str2 = JSON.toJSONString(jSONObject.get(str2));
                    }
                    AmcsConfigCenterPlugin.this.send("configsRefreshed", new FlipperObject(new FlipperObject.setMax().getMax("key", str2).getMax("section", str).getMax("newValue", str2).getMax));
                }
            });
        }
    }
}
