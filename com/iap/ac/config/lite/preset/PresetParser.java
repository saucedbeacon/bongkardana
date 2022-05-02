package com.iap.ac.config.lite.preset;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.iap.ac.android.common.json.JsonUtils;
import com.iap.ac.android.common.log.ACLog;
import com.iap.ac.config.lite.c.e;
import com.iap.ac.config.lite.preset.PresetConfig;
import java.util.List;

public class PresetParser {
    public static final String FILE_EXT = ".json";
    public static final String FILE_NAME = "amcs_config";
    public static final String UNDERLINE = "_";

    /* renamed from: a  reason: collision with root package name */
    private static final String f11074a = e.b("PresetParser");

    @NonNull
    public static PresetConfig.SiteConfig getSiteConfig(Context context, String str, String str2) {
        List<PresetConfig.SiteConfig> list;
        PresetConfig parsePresetConfig = parsePresetConfig(context, str2);
        if (!(parsePresetConfig == null || (list = parsePresetConfig.firstPartyConfig) == null)) {
            for (PresetConfig.SiteConfig next : list) {
                if (next.env.toUpperCase().equals(str.toUpperCase())) {
                    return next;
                }
            }
        }
        ACLog.e(f11074a, String.format("doesn't find any siteConfig, env = %s, bizCode = %s", new Object[]{str, str2}));
        return new PresetConfig.SiteConfig();
    }

    public static PresetConfig parsePresetConfig(Context context, String str) {
        StringBuilder sb = new StringBuilder(FILE_NAME);
        sb.append(TextUtils.isEmpty(str) ? "" : "_".concat(String.valueOf(str)));
        sb.append(".json");
        String b = e.b(context, sb.toString());
        ACLog.d(f11074a, String.format("amcs_config.json content = %s", new Object[]{b}));
        try {
            return (PresetConfig) JsonUtils.fromJson(b, PresetConfig.class);
        } catch (Exception e) {
            ACLog.d(f11074a, "parsePresetConfig e : ".concat(String.valueOf(e)));
            return null;
        }
    }
}
