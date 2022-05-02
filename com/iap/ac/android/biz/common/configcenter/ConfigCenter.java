package com.iap.ac.android.biz.common.configcenter;

import androidx.annotation.NonNull;
import com.google.android.exoplayer2.upstream.DefaultLoadErrorHandlingPolicy;
import com.iap.ac.android.a.a;
import com.iap.ac.android.acs.plugin.biz.region.RegionConstants;
import com.iap.ac.android.acs.plugin.biz.region.foundation.RegionFoundationProxy;
import com.iap.ac.android.acs.plugin.downgrade.router.amcs.APDisableJSAPIConfigManager;
import com.iap.ac.android.biz.common.ACManager;
import com.iap.ac.android.biz.common.constants.Constants;
import com.iap.ac.android.biz.common.internal.foundation.facade.LogFacade;
import com.iap.ac.android.biz.common.utils.Utils;
import com.iap.ac.android.common.config.ACConfig;
import com.iap.ac.android.common.config.IConfigChangeListener;
import com.iap.ac.android.common.json.JsonUtils;
import com.iap.ac.android.common.log.ACLog;
import com.iap.ac.android.loglite.api.AnalyticsConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

public enum ConfigCenter implements IConfigChangeListener {
    INSTANCE;
    

    /* renamed from: a  reason: collision with root package name */
    public JSONObject f9679a;
    public boolean b;

    public final List<String> getAcCertificates() {
        try {
            JSONArray jSONArray = (JSONArray) getKeyOrDefault("ac_cer_list", new JSONArray());
            ArrayList arrayList = new ArrayList();
            if (jSONArray != null && jSONArray.length() > 0) {
                for (int i = 0; i < jSONArray.length(); i++) {
                    arrayList.add(jSONArray.getString(i));
                }
            }
            return arrayList;
        } catch (Throwable th) {
            ACLog.e(Constants.TAG, "getAcCertificates error", th);
            return null;
        }
    }

    public final JSONObject getAcsAcquirerIdMap() {
        return (JSONObject) getKeyOrDefault("ACS_MP_APPID_ACQUIRERID_MAP", new JSONObject());
    }

    public final List<String> getAcsAppIdList() {
        JSONArray jSONArray = (JSONArray) getKeyOrDefault("ACS_BIZ_MP_APPID_LIST", new JSONArray());
        int length = jSONArray.length();
        if (length <= 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i < length) {
            try {
                arrayList.add(jSONArray.getString(i));
                i++;
            } catch (Throwable th) {
                a.a("getAcsAppIdList error:", th, Constants.TAG);
                return null;
            }
        }
        return arrayList;
    }

    public final List<String> getAuthList() {
        try {
            JSONArray jSONArray = (JSONArray) getKeyOrDefault("ac_auth_list", new JSONArray());
            ArrayList arrayList = new ArrayList();
            if (jSONArray != null && jSONArray.length() > 0) {
                for (int i = 0; i < jSONArray.length(); i++) {
                    arrayList.add(jSONArray.getString(i));
                }
            }
            return arrayList;
        } catch (Throwable th) {
            ACLog.e(Constants.TAG, "ConfigCenter#getAuthList error", th);
            return null;
        }
    }

    public final List<String> getDomains(String str) {
        try {
            Map map = (Map) JsonUtils.fromJson((JSONObject) getKeyOrDefault("js_permission", new JSONObject()), Map.class);
            if (map != null) {
                return (List) map.get(str);
            }
            return null;
        } catch (Throwable th) {
            a.a("getDomains error:", th, Constants.TAG);
            return null;
        }
    }

    public final boolean getGolSignContractToggle() {
        return ((Boolean) getKeyOrDefault("toggle_gol_sign_contract", Boolean.TRUE)).booleanValue();
    }

    public final synchronized <T> T getKeyOrDefault(String str, T t) {
        JSONObject jSONObject = this.f9679a;
        if (jSONObject == null) {
            return t;
        }
        try {
            T t2 = jSONObject.get(str);
            if (t2 != null && t2.getClass() == t.getClass()) {
                StringBuilder sb = new StringBuilder("ConfigCenter, get value from config center success, key: ");
                sb.append(str);
                sb.append(", value: ");
                sb.append(t2);
                ACLog.i(Constants.TAG, sb.toString());
                return t2;
            }
        } catch (Throwable th) {
            a.a("getKeyOrDefault exception: ", th, Constants.TAG);
        }
        StringBuilder sb2 = new StringBuilder("ConfigCenter, get value from config center fail, key: ");
        sb2.append(str);
        sb2.append(", use default value.");
        ACLog.e(Constants.TAG, sb2.toString());
        return t;
    }

    public final synchronized Map getMap(@NonNull String str, @NonNull Map map) {
        try {
            Map map2 = (Map) JsonUtils.fromJson((JSONObject) getKeyOrDefault(str, new JSONObject(map)), Map.class);
            if (map2 != null) {
                return map2;
            }
        } catch (Throwable th) {
            a.a("getMap exception:", th, Constants.TAG);
        }
        return map;
    }

    public final boolean getMpmGofCollectionOrderToggle() {
        return ((Boolean) getKeyOrDefault("toggle_mpm_gof_collection", Boolean.TRUE)).booleanValue();
    }

    public final boolean getMpmGofOrderToggle() {
        return ((Boolean) getKeyOrDefault("toggle_mpm_gof_order", Boolean.TRUE)).booleanValue();
    }

    public final boolean getMpmGolOrderToggle() {
        return ((Boolean) getKeyOrDefault("toggle_mpm_gol_order", Boolean.TRUE)).booleanValue();
    }

    public final boolean getMpmMiniAppToggle() {
        return ((Boolean) getKeyOrDefault("toggle_mpm_miniapp", Boolean.TRUE)).booleanValue();
    }

    public final long getMultiLanguageCacheExpirationTime() {
        return ((Long) getKeyOrDefault("ac_multilanguage_cache_expiration_time", 86400000L)).longValue();
    }

    public final List getRegionMiniAppList() {
        Object obj = INSTANCE.getMap(RegionConstants.SECTION_REGION_CONFIG, new HashMap()).get(RegionConstants.KEY_TOGGLE_MINI_PROGRAM_REGION_RPC_WHITE_LIST);
        if (obj instanceof List) {
            return (List) obj;
        }
        return null;
    }

    public final long getRemoteConfigRefreshInterval() {
        return Utils.stringToLong((String) getKeyOrDefault("remote_config_refresh_interval", ""), 60) * DefaultLoadErrorHandlingPolicy.DEFAULT_TRACK_BLACKLIST_MS;
    }

    public final void init() {
        this.f9679a = ACConfig.getInstance("ac_biz").getSectionConfig(APDisableJSAPIConfigManager.SECTION_AC_CONFIG);
        LogFacade.setLogStrategy((String) getKeyOrDefault(RegionFoundationProxy.COMPONENT_LOG, ""));
        Map a2 = com.iap.ac.android.b.a.a().a(ACConfig.getInstance("ac_biz").getSectionConfig("LogConfig"), "logUploadURLConfig", (Map) new HashMap());
        if (a2 != null) {
            a2.keySet();
            for (String str : a2.keySet()) {
                if (str != null) {
                    Object obj = a2.get(str);
                    if (obj instanceof String) {
                        AnalyticsConfig.registerBizTypeToUploadUrl(str, (String) obj);
                    }
                }
            }
        }
        ACConfig.getInstance("ac_biz").addSectionConfigChangeListener(APDisableJSAPIConfigManager.SECTION_AC_CONFIG, this);
    }

    public final void onConfigChanged(String str, Object obj) {
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onSectionConfigChanged(@androidx.annotation.NonNull java.lang.String r3, @androidx.annotation.Nullable org.json.JSONObject r4) {
        /*
            r2 = this;
            int r0 = r3.hashCode()
            r1 = -1324198396(0xffffffffb1125604, float:-2.129469E-9)
            if (r0 == r1) goto L_0x0018
            r1 = -801525882(0xffffffffd039af86, float:-1.24611523E10)
            if (r0 != r1) goto L_0x0022
            java.lang.String r0 = "LogConfig"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0022
            r3 = 1
            goto L_0x0023
        L_0x0018:
            java.lang.String r0 = "ACConfig"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0022
            r3 = 0
            goto L_0x0023
        L_0x0022:
            r3 = -1
        L_0x0023:
            if (r3 != 0) goto L_0x0056
            r2.f9679a = r4
            java.lang.String r3 = "log"
            java.lang.String r4 = ""
            java.lang.Object r3 = r2.getKeyOrDefault(r3, r4)
            java.lang.String r3 = (java.lang.String) r3
            com.iap.ac.android.biz.common.internal.foundation.facade.LogFacade.setLogStrategy(r3)
            boolean r3 = r2.getSslPinningToggle()
            if (r3 == 0) goto L_0x0040
            com.iap.ac.android.biz.common.rpc.ssl.IAPSslPinner r3 = com.iap.ac.android.biz.common.rpc.ssl.IAPSslPinner.INSTANCE
            r3.enableSslPinning()
            goto L_0x0045
        L_0x0040:
            com.iap.ac.android.biz.common.rpc.ssl.IAPSslPinner r3 = com.iap.ac.android.biz.common.rpc.ssl.IAPSslPinner.INSTANCE
            r3.disableSslPinning()
        L_0x0045:
            java.util.List r3 = r2.getAcCertificates()
            if (r3 == 0) goto L_0x0056
            int r4 = r3.size()
            if (r4 <= 0) goto L_0x0056
            com.iap.ac.android.biz.common.rpc.ssl.IAPSslPinner r4 = com.iap.ac.android.biz.common.rpc.ssl.IAPSslPinner.INSTANCE
            r4.addCertificates(r3)
        L_0x0056:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iap.ac.android.biz.common.configcenter.ConfigCenter.onSectionConfigChanged(java.lang.String, org.json.JSONObject):void");
    }

    public final void refreshConfigs() {
        if (!ACManager.getInstance().getAMCSToggle()) {
            ACLog.e(Constants.TAG, "refreshConfigs, skip refresh because close AMCS toggle is false");
        } else if (this.b) {
            ACConfig.getInstance("ac_biz").refreshConfig((Map<String, Object>) null, false);
            this.b = false;
        } else {
            ACConfig.getInstance("ac_biz").refreshConfig((Map<String, Object>) null, true);
        }
    }

    public final boolean getACContainerToggle() {
        return ((Boolean) getKeyOrDefault("toggle_accontainer", Boolean.TRUE)).booleanValue();
    }

    public final boolean getGoogleInvokeImgsApi() {
        return ((Boolean) getKeyOrDefault("google_invoke_imgsapi", Boolean.FALSE)).booleanValue();
    }

    public final boolean getIsvToggle() {
        return ((Boolean) getKeyOrDefault("toggle_isv_ad_page", Boolean.FALSE)).booleanValue();
    }

    public final boolean getLoadingGolGoogleAuthToggle() {
        return ((Boolean) getKeyOrDefault("toggle_loading_gol_google_auth", Boolean.TRUE)).booleanValue();
    }

    public final boolean getLoadingSpiToggle() {
        return ((Boolean) getKeyOrDefault("toggle_loading_spi", Boolean.TRUE)).booleanValue();
    }

    public final boolean getOfflineCodeToggle() {
        return ((Boolean) getKeyOrDefault("toggle_cpm_offline", Boolean.TRUE)).booleanValue();
    }

    public final boolean getOnlineCodeToggle() {
        return ((Boolean) getKeyOrDefault("toggle_cpm_online", Boolean.TRUE)).booleanValue();
    }

    public final boolean getSslPinningToggle() {
        return ((Boolean) getKeyOrDefault("toggle_ssl_pinning", Boolean.FALSE)).booleanValue();
    }
}
