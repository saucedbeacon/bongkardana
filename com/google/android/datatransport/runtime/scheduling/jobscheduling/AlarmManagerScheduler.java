package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Base64;
import androidx.annotation.VisibleForTesting;
import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.logging.Logging;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStore;
import com.google.android.datatransport.runtime.time.Clock;
import com.google.android.datatransport.runtime.util.PriorityMapping;
import com.google.android.exoplayer2.C;

public class AlarmManagerScheduler implements WorkScheduler {
    static final String ATTEMPT_NUMBER = "attemptNumber";
    static final String BACKEND_NAME = "backendName";
    static final String EVENT_PRIORITY = "priority";
    static final String EXTRAS = "extras";
    private static final String LOG_TAG = "AlarmManagerScheduler";
    private AlarmManager alarmManager;
    private final Clock clock;
    private final SchedulerConfig config;
    private final Context context;
    private final EventStore eventStore;

    public AlarmManagerScheduler(Context context2, EventStore eventStore2, Clock clock2, SchedulerConfig schedulerConfig) {
        this(context2, eventStore2, (AlarmManager) context2.getSystemService("alarm"), clock2, schedulerConfig);
    }

    @VisibleForTesting
    AlarmManagerScheduler(Context context2, EventStore eventStore2, AlarmManager alarmManager2, Clock clock2, SchedulerConfig schedulerConfig) {
        this.context = context2;
        this.eventStore = eventStore2;
        this.alarmManager = alarmManager2;
        this.clock = clock2;
        this.config = schedulerConfig;
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    public boolean isJobServiceOn(Intent intent) {
        return PendingIntent.getBroadcast(this.context, 0, intent, C.ENCODING_PCM_A_LAW) != null;
    }

    public void schedule(TransportContext transportContext, int i) {
        schedule(transportContext, i, false);
    }

    public void schedule(TransportContext transportContext, int i, boolean z) {
        Uri.Builder builder = new Uri.Builder();
        builder.appendQueryParameter(BACKEND_NAME, transportContext.getBackendName());
        builder.appendQueryParameter(EVENT_PRIORITY, String.valueOf(PriorityMapping.toInt(transportContext.getPriority())));
        if (transportContext.getExtras() != null) {
            builder.appendQueryParameter(EXTRAS, Base64.encodeToString(transportContext.getExtras(), 0));
        }
        Intent intent = new Intent(this.context, AlarmManagerSchedulerBroadcastReceiver.class);
        intent.setData(builder.build());
        intent.putExtra(ATTEMPT_NUMBER, i);
        if (z || !isJobServiceOn(intent)) {
            long nextCallTime = this.eventStore.getNextCallTime(transportContext);
            long scheduleDelay = this.config.getScheduleDelay(transportContext.getPriority(), nextCallTime, i);
            Logging.d(LOG_TAG, "Scheduling upload for context %s in %dms(Backend next call timestamp %d). Attempt %d", transportContext, Long.valueOf(scheduleDelay), Long.valueOf(nextCallTime), Integer.valueOf(i));
            this.alarmManager.set(3, this.clock.getTime() + scheduleDelay, PendingIntent.getBroadcast(this.context, 0, intent, 0));
            return;
        }
        Logging.d(LOG_TAG, "Upload for context %s is already scheduled. Returning...", (Object) transportContext);
    }
}
