package o;

import com.google.android.datatransport.TransportScheduleCallback;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.crashlytics.internal.common.CrashlyticsReportWithSessionId;
import com.google.firebase.crashlytics.internal.send.DataTransportCrashlyticsReportSender;

public final class removeViewAt implements TransportScheduleCallback {
    private final CrashlyticsReportWithSessionId getMax;
    private final TaskCompletionSource getMin;

    public removeViewAt(TaskCompletionSource taskCompletionSource, CrashlyticsReportWithSessionId crashlyticsReportWithSessionId) {
        this.getMin = taskCompletionSource;
        this.getMax = crashlyticsReportWithSessionId;
    }

    public final void onSchedule(Exception exc) {
        DataTransportCrashlyticsReportSender.setMax(this.getMin, this.getMax, exc);
    }
}
