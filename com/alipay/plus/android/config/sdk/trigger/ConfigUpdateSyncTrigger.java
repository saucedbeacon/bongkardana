package com.alipay.plus.android.config.sdk.trigger;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alipay.iap.android.common.log.LoggerWrapper;
import com.alipay.iap.android.common.syncintegration.api.IAPSyncMessage;
import com.alipay.iap.android.common.syncintegration.api.IAPSyncProvider;
import com.alipay.iap.android.common.syncintegration.impl.IAPSyncMessageParsedCallback;
import com.alipay.plus.android.config.sdk.ConfigCenter;
import com.alipay.plus.android.config.sdk.ConfigCenterContext;
import com.alipay.plus.android.config.sdk.a.e;
import com.alipay.plus.android.config.sdk.retry.DistributionNode;
import com.alipay.plus.android.config.sdk.retry.DistributionNodesConfig;
import com.alipay.plus.android.config.sdk.utils.ConfigUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ConfigUpdateSyncTrigger extends ConfigUpdateTrigger {
    protected static final String CONFIG_SYNC_BIZ_ID = "APLUS-CONFIG";
    protected static final String CONFIG_SYNC_BY_USER_BIZ_ID = "APLUS-CONFIG-USER";
    protected static final String CONFIG_SYNC_NODE_BIZ_ID = "APLUS-CONFIG-NODE";

    /* renamed from: a  reason: collision with root package name */
    private static final String f10763a = e.a("BaseSyncTrigger");
    protected IAPSyncProvider mSyncProvider;

    public ConfigUpdateSyncTrigger(@NonNull IAPSyncProvider iAPSyncProvider) {
        this.mSyncProvider = iAPSyncProvider;
    }

    @Nullable
    private static List<DistributionNode> a(@Nullable JSONArray jSONArray) {
        Integer num;
        if (jSONArray == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.size(); i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            if (jSONObject != null) {
                String string = jSONObject.getString("url");
                if (!TextUtils.isEmpty(string)) {
                    try {
                        num = jSONObject.getInteger("rate");
                    } catch (Exception unused) {
                        LoggerWrapper.d(f10763a, String.format("Node rate cannot be parsed, rate is [%s]", new Object[]{String.valueOf(jSONObject.getString("rate"))}));
                        num = null;
                    }
                    try {
                        DistributionNode distributionNode = new DistributionNode(DistributionNode.a.valueOf(jSONObject.getString("type")), string, jSONObject.getString("configName"), num);
                        try {
                            JSONObject jSONObject2 = jSONObject.getJSONObject("extras");
                            if (jSONObject2 != null) {
                                distributionNode.extras = jSONObject2;
                            }
                        } catch (Exception unused2) {
                            LoggerWrapper.e(f10763a, "Can not parse extras ");
                        }
                        arrayList.add(distributionNode);
                        LoggerWrapper.d(f10763a, String.format("CdnBackup [%s] Receive CDN message! message: %s", new Object[]{String.valueOf(i), distributionNode.toString()}));
                    } catch (Exception unused3) {
                        LoggerWrapper.e(f10763a, String.format("Can not parse Distribution type [%s]", new Object[]{jSONObject.getString("type")}));
                    }
                }
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    @SuppressLint({"DefaultLocale"})
    public void a(List<String> list) {
        long lastNodesVersion = ConfigCenter.getInstance().getLastNodesVersion();
        for (String next : list) {
            try {
                JSONObject parseObject = JSON.parseObject(next);
                long parseLong = ConfigUtils.parseLong(parseObject.getString("update"), 0);
                if (parseLong > lastNodesVersion) {
                    ConfigCenter.getInstance().updateAndSaveDistributionNodes(new DistributionNodesConfig(parseLong, a(ConfigUtils.getJSONArraySafe(parseObject, "distributionNodes"))));
                    LoggerWrapper.d(f10763a, String.format("Receive node sync message: %s! will refresh nodes now!", new Object[]{next}));
                    return;
                }
                String str = f10763a;
                StringBuilder sb = new StringBuilder("Receive node sync message! But not refresh nodes!");
                sb.append(String.format("lastUpdateTimestamp = %d, nodeUpdateTimestamp = %d", new Object[]{Long.valueOf(lastNodesVersion), Long.valueOf(parseLong)}));
                LoggerWrapper.d(str, sb.toString());
            } catch (Throwable th) {
                String str2 = f10763a;
                StringBuilder sb2 = new StringBuilder("Cannot parse nodes sync message to JSONObject! ");
                sb2.append(th.getMessage());
                LoggerWrapper.w(str2, sb2.toString());
            }
        }
    }

    /* access modifiers changed from: private */
    @SuppressLint({"DefaultLocale"})
    public void b(@NonNull List<String> list) {
        long lastUpdateVersion = ConfigCenter.getInstance().getLastUpdateVersion();
        for (String next : list) {
            try {
                JSONObject parseObject = JSON.parseObject(next);
                long parseLong = ConfigUtils.parseLong(parseObject.getString("update"), 0);
                if (parseLong > lastUpdateVersion) {
                    ConfigCenter.getInstance().saveCdnBackupConfig(new DistributionNodesConfig(parseLong, a(ConfigUtils.getJSONArraySafe(parseObject, "cdnMessage"))));
                    LoggerWrapper.d(f10763a, String.format("Receive sync message: %s! will refresh config now!", new Object[]{next}));
                    updateConfig();
                    return;
                }
                String str = f10763a;
                StringBuilder sb = new StringBuilder("Receive sync message! But not refresh config!");
                sb.append(String.format("lastUpdateTimestamp = %d, configUpdateTimestamp = %d", new Object[]{Long.valueOf(lastUpdateVersion), Long.valueOf(parseLong)}));
                LoggerWrapper.d(str, sb.toString());
            } catch (Throwable th) {
                String str2 = f10763a;
                StringBuilder sb2 = new StringBuilder("Cannot parse config sync message to JSONObject! ");
                sb2.append(th.getMessage());
                LoggerWrapper.w(str2, sb2.toString());
            }
        }
    }

    /* access modifiers changed from: protected */
    public void registerSyncReceiver(@NonNull final ConfigCenterContext configCenterContext) {
        AnonymousClass1 r0 = new IAPSyncMessageParsedCallback() {
            public void onReceiveParsedSyncMessage(@NonNull IAPSyncMessage iAPSyncMessage, @NonNull String str, @NonNull List<String> list) {
                if (TextUtils.equals(str, "APLUS-CONFIG") || TextUtils.equals(str, "APLUS-CONFIG-USER")) {
                    ConfigUpdateSyncTrigger.this.b(list);
                    configCenterContext.getConfigMonitor().behavior("sync_getdata", (Map<String, String>) null);
                }
            }
        };
        AnonymousClass2 r1 = new IAPSyncMessageParsedCallback() {
            public void onReceiveParsedSyncMessage(@NonNull IAPSyncMessage iAPSyncMessage, @NonNull String str, @NonNull List<String> list) {
                if (TextUtils.equals(str, ConfigUpdateSyncTrigger.CONFIG_SYNC_NODE_BIZ_ID)) {
                    ConfigUpdateSyncTrigger.this.a(list);
                    configCenterContext.getConfigMonitor().behavior("sync_getdata", (Map<String, String>) null);
                }
            }
        };
        this.mSyncProvider.registerReceiveCallback("APLUS-CONFIG", r0);
        this.mSyncProvider.registerReceiveCallback("APLUS-CONFIG-USER", r0);
        this.mSyncProvider.registerReceiveCallback(CONFIG_SYNC_NODE_BIZ_ID, r1);
    }

    public void startTrigger(@NonNull ConfigCenterContext configCenterContext) {
        LoggerWrapper.d(f10763a, "startTrigger.");
        registerSyncReceiver(configCenterContext);
    }
}
