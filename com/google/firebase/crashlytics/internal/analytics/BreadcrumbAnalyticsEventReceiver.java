package com.google.firebase.crashlytics.internal.analytics;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.breadcrumbs.BreadcrumbHandler;
import com.google.firebase.crashlytics.internal.breadcrumbs.BreadcrumbSource;
import org.json.JSONException;
import org.json.JSONObject;

public class BreadcrumbAnalyticsEventReceiver implements AnalyticsEventReceiver, BreadcrumbSource {
    private static final String BREADCRUMB_NAME_KEY = "name";
    private static final String BREADCRUMB_PARAMS_KEY = "parameters";
    private static final String BREADCRUMB_PREFIX = "$A$:";
    @Nullable
    private BreadcrumbHandler breadcrumbHandler;

    public void onEvent(@NonNull String str, @NonNull Bundle bundle) {
        BreadcrumbHandler breadcrumbHandler2 = this.breadcrumbHandler;
        if (breadcrumbHandler2 != null) {
            try {
                StringBuilder sb = new StringBuilder(BREADCRUMB_PREFIX);
                sb.append(serializeEvent(str, bundle));
                breadcrumbHandler2.handleBreadcrumb(sb.toString());
            } catch (JSONException unused) {
                Logger.getLogger().w("Unable to serialize Firebase Analytics event to breadcrumb.");
            }
        }
    }

    public void registerBreadcrumbHandler(@Nullable BreadcrumbHandler breadcrumbHandler2) {
        this.breadcrumbHandler = breadcrumbHandler2;
        Logger.getLogger().d("Registered Firebase Analytics event receiver for breadcrumbs");
    }

    @NonNull
    private static String serializeEvent(@NonNull String str, @NonNull Bundle bundle) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        for (String str2 : bundle.keySet()) {
            jSONObject2.put(str2, bundle.get(str2));
        }
        jSONObject.put("name", str);
        jSONObject.put(BREADCRUMB_PARAMS_KEY, jSONObject2);
        return jSONObject.toString();
    }
}
