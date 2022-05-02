package o;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.crashlytics.internal.common.SessionReportingCoordinator;

public final class onPrepareOptionsPanel implements Continuation {
    private final SessionReportingCoordinator length;

    public onPrepareOptionsPanel(SessionReportingCoordinator sessionReportingCoordinator) {
        this.length = sessionReportingCoordinator;
    }

    public final Object then(Task task) {
        return Boolean.valueOf(this.length.onReportSendComplete(task));
    }
}
