package com.alibaba.ariver.resource.api.prerun;

import android.os.Bundle;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.alibaba.ariver.kernel.RVParams;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.kernel.common.service.RVConfigService;
import com.alibaba.ariver.kernel.common.utils.BundleUtils;
import com.alibaba.ariver.kernel.common.utils.CollectionUtils;
import com.alibaba.ariver.kernel.common.utils.JSONUtils;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.alibaba.ariver.kernel.common.utils.RVKernelUtils;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class AppxPrerunChecker {

    /* renamed from: a  reason: collision with root package name */
    private static final Set<String> f10178a = new HashSet();
    private static final Set<String> b = new HashSet();
    private static final Set<String> c = new HashSet();

    static {
        a();
    }

    public static boolean isPrerunWorkerApp(String str, Bundle bundle) {
        if (TextUtils.isEmpty(str) || bundle == null) {
            return false;
        }
        if (!"YES".equalsIgnoreCase(BundleUtils.getString(bundle, RVParams.APPX_ROUTE_FRAMEWORK))) {
            return f10178a.contains(str);
        }
        if (!b.isEmpty()) {
            JSONArray configJSONArray = ((RVConfigService) RVProxy.get(RVConfigService.class)).getConfigJSONArray("ta_appxng_prerun_blacklist");
            if ((CollectionUtils.isEmpty((List) configJSONArray) || !configJSONArray.contains(str)) && !"NO".equalsIgnoreCase(BundleUtils.getString(bundle, RVParams.PRE_RUN_WORKER))) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static boolean isPrerunAction(String str) {
        if (!TextUtils.isEmpty(str) && !b.contains(str)) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    public static void a(@Nullable String str) {
        try {
            f10178a.clear();
            b.clear();
            JSONObject parseObject = JSONUtils.parseObject(str);
            if (parseObject != null) {
                JSONArray jSONArray = parseObject.getJSONArray("white_list");
                if (!CollectionUtils.isEmpty((List) jSONArray)) {
                    for (int i = 0; i < jSONArray.size(); i++) {
                        f10178a.add(jSONArray.getString(i));
                    }
                }
                JSONArray jSONArray2 = parseObject.getJSONArray("block_apis");
                if (!CollectionUtils.isEmpty((List) jSONArray2)) {
                    for (int i2 = 0; i2 < jSONArray2.size(); i2++) {
                        b.add(jSONArray2.getString(i2));
                    }
                }
            }
        } catch (Exception e) {
            RVLogger.w("AriverRes:AppxPrerunChecker", "initPrerunConfig failed:\t", e);
        }
    }

    /* access modifiers changed from: private */
    public static void b(@Nullable String str) {
        try {
            c.clear();
            JSONArray parseArray = JSONUtils.parseArray(str);
            if (!CollectionUtils.isEmpty((List) parseArray)) {
                for (int i = 0; i < parseArray.size(); i++) {
                    c.add(parseArray.getString(i));
                }
            }
        } catch (Exception e) {
            RVLogger.w("AriverRes:AppxPrerunChecker", "initMessageQueueConfig failed:\t", e);
        }
    }

    private static void a() {
        RVConfigService rVConfigService = (RVConfigService) RVProxy.get(RVConfigService.class);
        if (rVConfigService != null) {
            try {
                a(rVConfigService.getConfig("ta_launch_prerunWorker", (String) null, new RVConfigService.OnConfigChangeListener() {
                    public final void onChange(String str) {
                        RVLogger.d("AriverRes:AppxPrerunChecker", "ta_launch_prerunWorker,onConfigChange:  ".concat(String.valueOf(str)));
                        AppxPrerunChecker.a(str);
                    }
                }));
            } catch (Exception e) {
                RVLogger.e("AriverRes:AppxPrerunChecker", (Throwable) e);
            }
            try {
                b(rVConfigService.getConfig("ta_v8Worker_messageQueue_whiteList", (String) null, new RVConfigService.OnConfigChangeListener() {
                    public final void onChange(String str) {
                        RVLogger.d("AriverRes:AppxPrerunChecker", "ta_v8Worker_messageQueue_whiteList,onConfigChange:  ".concat(String.valueOf(str)));
                        AppxPrerunChecker.b(str);
                    }
                }));
            } catch (Exception e2) {
                RVLogger.e("AriverRes:AppxPrerunChecker", (Throwable) e2);
            }
        }
    }

    private static String b() {
        if (RVKernelUtils.isDebug()) {
            return PreferenceManager.getDefaultSharedPreferences(ProcessUtils.getContext()).getString("prerun_dev_mode_settings", "0");
        }
        return "0";
    }

    public static boolean isRenderMessageQueue(String str) {
        String b2 = b();
        if (b2.equals("0")) {
            return c.contains(str);
        }
        return b2.equals("1");
    }

    public static void tryInjectStartParams(String str, Bundle bundle) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (isPrerunWorkerApp(str, bundle)) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" support prerun");
            RVLogger.d("AriverRes:AppxPrerunChecker", sb.toString());
            bundle.putString(RVParams.PRE_RUN_WORKER, "YES");
            if (isRenderMessageQueue(str)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" support messagequeue");
                RVLogger.d("AriverRes:AppxPrerunChecker", sb2.toString());
                bundle.putString(RVParams.ENABLE_RENDER_MESSAGEQUEUE, "YES");
            }
        } else if (BundleUtils.contains(bundle, RVParams.PRE_RUN_WORKER)) {
            bundle.remove(RVParams.PRE_RUN_WORKER);
        }
    }
}
