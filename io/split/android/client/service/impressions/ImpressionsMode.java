package io.split.android.client.service.impressions;

public enum ImpressionsMode {
    OPTIMIZED,
    DEBUG;

    public static ImpressionsMode fromString(String str) {
        if (str != null) {
            str = str.toUpperCase();
        }
        return "DEBUG".equals(str) ? DEBUG : OPTIMIZED;
    }
}
