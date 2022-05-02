package com.google.firebase.perf.metrics.validator;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.perf.logging.AndroidLogger;
import com.google.firebase.perf.v1.TraceMetric;
import java.util.Map;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

final class FirebasePerfTraceValidator extends PerfMetricValidator {
    private static final AndroidLogger logger = AndroidLogger.getInstance();
    private final TraceMetric traceMetric;

    private boolean isValidCounterValue(@Nullable Long l) {
        return l != null;
    }

    FirebasePerfTraceValidator(@NonNull TraceMetric traceMetric2) {
        this.traceMetric = traceMetric2;
    }

    public final boolean isValidPerfMetric() {
        if (!isValidTrace(this.traceMetric, 0)) {
            AndroidLogger androidLogger = logger;
            StringBuilder sb = new StringBuilder("Invalid Trace:");
            sb.append(this.traceMetric.getName());
            androidLogger.warn(sb.toString());
            return false;
        } else if (!hasCounters(this.traceMetric) || areCountersValid(this.traceMetric)) {
            return true;
        } else {
            AndroidLogger androidLogger2 = logger;
            StringBuilder sb2 = new StringBuilder("Invalid Counters for Trace:");
            sb2.append(this.traceMetric.getName());
            androidLogger2.warn(sb2.toString());
            return false;
        }
    }

    private boolean hasCounters(@NonNull TraceMetric traceMetric2) {
        boolean z;
        if (traceMetric2.getCountersCount() > 0) {
            return true;
        }
        for (TraceMetric countersCount : traceMetric2.getSubtracesList()) {
            if (countersCount.getCountersCount() > 0) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    private boolean areCountersValid(@NonNull TraceMetric traceMetric2) {
        return areCountersValid(traceMetric2, 0);
    }

    private boolean areCountersValid(@Nullable TraceMetric traceMetric2, int i) {
        if (traceMetric2 == null) {
            return false;
        }
        if (i > 1) {
            logger.warn("Exceed MAX_SUBTRACE_DEEP:1");
            return false;
        }
        for (Map.Entry next : traceMetric2.getCountersMap().entrySet()) {
            if (!isValidCounterId((String) next.getKey())) {
                AndroidLogger androidLogger = logger;
                StringBuilder sb = new StringBuilder("invalid CounterId:");
                sb.append((String) next.getKey());
                androidLogger.warn(sb.toString());
                return false;
            } else if (!isValidCounterValue((Long) next.getValue())) {
                AndroidLogger androidLogger2 = logger;
                StringBuilder sb2 = new StringBuilder("invalid CounterValue:");
                sb2.append(next.getValue());
                androidLogger2.warn(sb2.toString());
                return false;
            }
        }
        for (TraceMetric areCountersValid : traceMetric2.getSubtracesList()) {
            if (!areCountersValid(areCountersValid, i + 1)) {
                return false;
            }
        }
        return true;
    }

    private boolean isValidTrace(@Nullable TraceMetric traceMetric2, int i) {
        int max = dispatchOnCancelled.setMax(i);
        if (i != max) {
            onCanceled oncanceled = new onCanceled(i, max, 1);
            onCancelLoad.setMax(605542528, oncanceled);
            onCancelLoad.getMin(605542528, oncanceled);
        }
        if (traceMetric2 == null) {
            logger.warn("TraceMetric is null");
            return false;
        } else if (i > 1) {
            logger.warn("Exceed MAX_SUBTRACE_DEEP:1");
            return false;
        } else if (!isValidTraceId(traceMetric2.getName())) {
            AndroidLogger androidLogger = logger;
            StringBuilder sb = new StringBuilder("invalid TraceId:");
            sb.append(traceMetric2.getName());
            androidLogger.warn(sb.toString());
            return false;
        } else if (!isValidTraceDuration(traceMetric2)) {
            AndroidLogger androidLogger2 = logger;
            StringBuilder sb2 = new StringBuilder("invalid TraceDuration:");
            sb2.append(traceMetric2.getDurationUs());
            androidLogger2.warn(sb2.toString());
            return false;
        } else if (!traceMetric2.hasClientStartTimeUs()) {
            logger.warn("clientStartTimeUs is null.");
            return false;
        } else {
            for (TraceMetric isValidTrace : traceMetric2.getSubtracesList()) {
                if (!isValidTrace(isValidTrace, i + 1)) {
                    return false;
                }
            }
            return hasValidAttributes(traceMetric2.getCustomAttributesMap());
        }
    }

    private boolean isValidTraceId(@Nullable String str) {
        if (str == null) {
            return false;
        }
        String trim = str.trim();
        if (trim.isEmpty() || trim.length() > 100) {
            return false;
        }
        return true;
    }

    private boolean isValidTraceDuration(@Nullable TraceMetric traceMetric2) {
        return traceMetric2 != null && traceMetric2.getDurationUs() > 0;
    }

    private boolean isValidCounterId(@Nullable String str) {
        if (str == null) {
            return false;
        }
        String trim = str.trim();
        if (trim.isEmpty()) {
            logger.warn("counterId is empty");
            return false;
        } else if (trim.length() <= 100) {
            return true;
        } else {
            logger.warn("counterId exceeded max length 100");
            return false;
        }
    }

    private boolean hasValidAttributes(Map<String, String> map) {
        for (Map.Entry<String, String> validateAttribute : map.entrySet()) {
            String validateAttribute2 = PerfMetricValidator.validateAttribute(validateAttribute);
            if (validateAttribute2 != null) {
                logger.warn(validateAttribute2);
                return false;
            }
        }
        return true;
    }
}
