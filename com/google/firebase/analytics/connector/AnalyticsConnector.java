package com.google.firebase.analytics.connector;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Size;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.firebase.annotations.DeferredApi;
import java.util.List;
import java.util.Map;
import java.util.Set;

public interface AnalyticsConnector {

    @KeepForSdk
    public static class ConditionalUserProperty {
        @KeepForSdk
        public boolean active;
        @KeepForSdk
        public long creationTimestamp;
        @KeepForSdk
        @Nullable
        public String expiredEventName;
        @KeepForSdk
        @Nullable
        public Bundle expiredEventParams;
        @NonNull
        @KeepForSdk
        public String name;
        @NonNull
        @KeepForSdk
        public String origin;
        @KeepForSdk
        public long timeToLive;
        @KeepForSdk
        @Nullable
        public String timedOutEventName;
        @KeepForSdk
        @Nullable
        public Bundle timedOutEventParams;
        @KeepForSdk
        @Nullable
        public String triggerEventName;
        @KeepForSdk
        public long triggerTimeout;
        @KeepForSdk
        @Nullable
        public String triggeredEventName;
        @KeepForSdk
        @Nullable
        public Bundle triggeredEventParams;
        @KeepForSdk
        public long triggeredTimestamp;
        @KeepForSdk
        @Nullable
        public Object value;
    }

    @KeepForSdk
    public interface AnalyticsConnectorHandle {
        @KeepForSdk
        void registerEventNames(@NonNull Set<String> set);

        @KeepForSdk
        void unregister();

        @KeepForSdk
        void unregisterEventNames();
    }

    @KeepForSdk
    public interface AnalyticsConnectorListener {
        @KeepForSdk
        void onMessageTriggered(int i, @Nullable Bundle bundle);
    }

    @KeepForSdk
    void clearConditionalUserProperty(@Size(max = 24, min = 1) @NonNull String str, @Nullable String str2, @Nullable Bundle bundle);

    @WorkerThread
    @NonNull
    @KeepForSdk
    List<ConditionalUserProperty> getConditionalUserProperties(@NonNull String str, @Size(max = 23, min = 1) @Nullable String str2);

    @WorkerThread
    @KeepForSdk
    int getMaxUserProperties(@Size(min = 1) @NonNull String str);

    @WorkerThread
    @NonNull
    @KeepForSdk
    Map<String, Object> getUserProperties(boolean z);

    @KeepForSdk
    void logEvent(@NonNull String str, @NonNull String str2, @Nullable Bundle bundle);

    @KeepForSdk
    @DeferredApi
    @Nullable
    AnalyticsConnectorHandle registerAnalyticsConnectorListener(@NonNull String str, @NonNull AnalyticsConnectorListener analyticsConnectorListener);

    @KeepForSdk
    void setConditionalUserProperty(@NonNull ConditionalUserProperty conditionalUserProperty);

    @KeepForSdk
    void setUserProperty(@NonNull String str, @NonNull String str2, @NonNull Object obj);
}
