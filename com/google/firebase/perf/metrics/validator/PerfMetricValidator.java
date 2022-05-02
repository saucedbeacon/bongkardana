package com.google.firebase.perf.metrics.validator;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.perf.logging.AndroidLogger;
import com.google.firebase.perf.util.Constants;
import com.google.firebase.perf.v1.PerfMetric;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public abstract class PerfMetricValidator {
    public abstract boolean isValidPerfMetric();

    @NonNull
    private static List<PerfMetricValidator> getValidators(@NonNull PerfMetric perfMetric, @NonNull Context context) {
        ArrayList arrayList = new ArrayList();
        if (perfMetric.hasTraceMetric()) {
            arrayList.add(new FirebasePerfTraceValidator(perfMetric.getTraceMetric()));
        }
        if (perfMetric.hasNetworkRequestMetric()) {
            arrayList.add(new FirebasePerfNetworkValidator(perfMetric.getNetworkRequestMetric(), context));
        }
        if (perfMetric.hasApplicationInfo()) {
            arrayList.add(new FirebasePerfApplicationInfoValidator(perfMetric.getApplicationInfo()));
        }
        if (perfMetric.hasGaugeMetric()) {
            arrayList.add(new FirebasePerfGaugeMetricValidator(perfMetric.getGaugeMetric()));
        }
        return arrayList;
    }

    public static boolean isValid(@NonNull PerfMetric perfMetric, @NonNull Context context) {
        List<PerfMetricValidator> validators = getValidators(perfMetric, context);
        if (validators.isEmpty()) {
            AndroidLogger.getInstance().debug("No validators found for PerfMetric.");
            return false;
        }
        for (PerfMetricValidator isValidPerfMetric : validators) {
            if (!isValidPerfMetric.isValidPerfMetric()) {
                return false;
            }
        }
        return true;
    }

    @Nullable
    public static String validateTraceName(@Nullable String str) {
        if (str == null) {
            return "Trace name must not be null";
        }
        if (str.length() > 100) {
            return String.format(Locale.US, "Trace name must not exceed %d characters", new Object[]{100});
        } else if (!str.startsWith("_")) {
            return null;
        } else {
            for (Constants.TraceNames obj : Constants.TraceNames.values()) {
                if (obj.toString().equals(str)) {
                    return null;
                }
            }
            if (str.startsWith(Constants.SCREEN_TRACE_PREFIX)) {
                return null;
            }
            return "Trace name must not start with '_'";
        }
    }

    @Nullable
    public static String validateMetricName(@Nullable String str) {
        if (str == null) {
            return "Metric name must not be null";
        }
        if (str.length() > 100) {
            return String.format(Locale.US, "Metric name must not exceed %d characters", new Object[]{100});
        } else if (!str.startsWith("_")) {
            return null;
        } else {
            for (Constants.CounterNames obj : Constants.CounterNames.values()) {
                if (obj.toString().equals(str)) {
                    return null;
                }
            }
            return "Metric name must not start with '_'";
        }
    }

    @Nullable
    public static String validateAttribute(@NonNull Map.Entry<String, String> entry) {
        String key = entry.getKey();
        String value = entry.getValue();
        if (key == null) {
            return "Attribute key must not be null";
        }
        if (value == null) {
            return "Attribute value must not be null";
        }
        if (key.length() > 40) {
            return String.format(Locale.US, "Attribute key length must not exceed %d characters", new Object[]{40});
        } else if (value.length() > 100) {
            return String.format(Locale.US, "Attribute value length must not exceed %d characters", new Object[]{100});
        } else if (!key.matches("^(?!(firebase_|google_|ga_))[A-Za-z][A-Za-z_0-9]*")) {
            return "Attribute key must start with letter, must only contain alphanumeric characters and underscore and must not start with \"firebase_\", \"google_\" and \"ga_";
        } else {
            return null;
        }
    }
}
