package com.alibaba.ariver.app.api.ui.darkmode;

import android.content.Context;
import androidx.annotation.Nullable;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.kernel.common.service.RVEnvironmentService;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.fastjson.JSONArray;

public interface ColorSchemeDecider {
    public static final String TAG = "AriverApp:ColorSchemeDecider";

    ColorSchemeType getCurrentColorScheme();

    public static class DefaultDecider implements ColorSchemeDecider {
        @Nullable

        /* renamed from: a  reason: collision with root package name */
        private JSONArray f9957a;

        public DefaultDecider(@Nullable JSONArray jSONArray) {
            this.f9957a = jSONArray;
            RVLogger.d(ColorSchemeDecider.TAG, "initialize ColorDecider by supportColorScheme: ".concat(String.valueOf(jSONArray)));
        }

        public ColorSchemeType getCurrentColorScheme() {
            JSONArray jSONArray = this.f9957a;
            if (jSONArray == null || jSONArray.size() == 0) {
                return ColorSchemeType.DEFAULT;
            }
            if (ThemeUtils.isDarkMode((Context) ((RVEnvironmentService) RVProxy.get(RVEnvironmentService.class)).getApplicationContext()) && this.f9957a.contains("dark")) {
                return ColorSchemeType.DARK;
            }
            if (this.f9957a.contains(ThemeUtils.COLOR_SCHEME_LIGHT)) {
                return ColorSchemeType.LIGHT;
            }
            return ColorSchemeType.DEFAULT;
        }
    }
}
