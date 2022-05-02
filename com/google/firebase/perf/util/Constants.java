package com.google.firebase.perf.util;

import androidx.annotation.NonNull;

public class Constants {
    public static final int BURST_CAPACITY = 500;
    public static final String ENABLE_DISABLE = "isEnabled";
    public static final int FROZEN_FRAME_TIME = 700;
    public static final int MAX_ATTRIBUTE_KEY_LENGTH = 40;
    public static final int MAX_ATTRIBUTE_VALUE_LENGTH = 100;
    public static final int MAX_CONTENT_TYPE_LENGTH = 128;
    public static final int MAX_COUNTER_ID_LENGTH = 100;
    public static final int MAX_HOST_LENGTH = 255;
    public static final float MAX_SAMPLING_RATE = 1.0f;
    public static final int MAX_SUBTRACE_DEEP = 1;
    public static final int MAX_TRACE_CUSTOM_ATTRIBUTES = 5;
    public static final int MAX_TRACE_ID_LENGTH = 100;
    public static final int MAX_URL_LENGTH = 2000;
    public static final float MIN_SAMPLING_RATE = 0.0f;
    public static final String PREFS_NAME = "FirebasePerfSharedPrefs";
    public static final int RATE_PER_MINUTE = 100;
    public static final String SCREEN_TRACE_PREFIX = "_st_";
    public static final int SLOW_FRAME_TIME = 16;

    public enum TraceNames {
        APP_START_TRACE_NAME("_as"),
        ON_CREATE_TRACE_NAME("_astui"),
        ON_START_TRACE_NAME("_astfd"),
        ON_RESUME_TRACE_NAME("_asti"),
        FOREGROUND_TRACE_NAME("_fs"),
        BACKGROUND_TRACE_NAME("_bs");
        
        private String mName;

        private TraceNames(@NonNull String str) {
            this.mName = str;
        }

        public final String toString() {
            return this.mName;
        }
    }

    public enum CounterNames {
        TRACE_EVENT_RATE_LIMITED("_fstec"),
        NETWORK_TRACE_EVENT_RATE_LIMITED("_fsntc"),
        TRACE_STARTED_NOT_STOPPED("_tsns"),
        FRAMES_TOTAL("_fr_tot"),
        FRAMES_SLOW("_fr_slo"),
        FRAMES_FROZEN("_fr_fzn");
        
        private String mName;

        private CounterNames(@NonNull String str) {
            this.mName = str;
        }

        public final String toString() {
            return this.mName;
        }
    }
}
