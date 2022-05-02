package com.google.firebase.perf.util;

import android.content.Context;
import android.content.res.Resources;
import androidx.annotation.NonNull;
import com.google.firebase.perf.logging.AndroidLogger;
import java.net.URI;

public class URLAllowlist {
    private static String[] allowlistedDomains;

    public static boolean isURLAllowlisted(@NonNull URI uri, @NonNull Context context) {
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("firebase_performance_whitelisted_domains", "array", context.getPackageName());
        if (identifier == 0) {
            return true;
        }
        AndroidLogger.getInstance().info("Detected domain allowlist, only allowlisted domains will be measured.");
        if (allowlistedDomains == null) {
            allowlistedDomains = resources.getStringArray(identifier);
        }
        String host = uri.getHost();
        if (host == null) {
            return true;
        }
        for (String contains : allowlistedDomains) {
            if (host.contains(contains)) {
                return true;
            }
        }
        return false;
    }
}
