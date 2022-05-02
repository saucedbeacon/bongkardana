package com.iap.ac.android.gradient.a;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.iap.ac.android.common.config.ACConfig;
import com.iap.ac.android.common.json.JsonUtils;
import com.iap.ac.android.common.log.ACLog;
import com.iap.ac.android.gradient.pluginloader.loader.PluginLoader;
import com.iap.ac.android.gradient.proguard.model.GradientConfig;
import com.iap.ac.android.gradient.proguard.model.ModuleConfig;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public class a {
    public static final String TAG = "Gradient";
    public final Map<String, Object> attribute = new HashMap();
    public String bizCode;
    public final Map<String, GradientConfig> gradientConfigMap = new HashMap();
    public PluginLoader pluginLoader;

    public boolean isGradientEnable(String str) {
        JSONObject sectionConfig = ACConfig.getInstance(str).getSectionConfig("gradient");
        return sectionConfig != null && sectionConfig.optBoolean("gradientToggle");
    }

    public void refreshGradientConfig(@NonNull Context context, String str) {
        try {
            String[] list = context.getAssets().list("gradient");
            if (list != null) {
                for (String a2 : list) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(com.iap.ac.android.gradient.e.a.a(a2));
                    sb.append("gradient_config.json");
                    String b = com.iap.ac.android.gradient.e.a.b(context, sb.toString());
                    if (!TextUtils.isEmpty(b)) {
                        GradientConfig gradientConfig = (GradientConfig) JsonUtils.fromJson(b, GradientConfig.class);
                        this.gradientConfigMap.put(gradientConfig.moduleName, gradientConfig);
                        this.attribute.put(gradientConfig.moduleName, gradientConfig.moduleVersion);
                    }
                }
                ACConfig.getInstance(str).refreshConfig(this.attribute, true);
            }
        } catch (Exception e) {
            ACLog.e(TAG, "refreshGradientConfig : ".concat(String.valueOf(e)));
        }
    }

    public void tryLoadPlugin(@NonNull Context context, String str) {
        ModuleConfig moduleConfig;
        try {
            JSONObject sectionConfig = ACConfig.getInstance(str).getSectionConfig("gradient");
            if (sectionConfig != null) {
                for (String next : this.attribute.keySet()) {
                    JSONObject optJSONObject = sectionConfig.optJSONObject(next);
                    if (optJSONObject != null && (moduleConfig = (ModuleConfig) JsonUtils.fromJson(optJSONObject, ModuleConfig.class)) != null && moduleConfig.enable && moduleConfig.autoLoad) {
                        this.pluginLoader.loadPlugin(context, next);
                    }
                }
            }
        } catch (Exception e) {
            ACLog.e(TAG, "tryLoadPlugin : ".concat(String.valueOf(e)));
        }
    }
}
