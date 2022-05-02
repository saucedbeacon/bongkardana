package o;

import com.google.android.datatransport.Transformer;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.crashlytics.internal.send.DataTransportCrashlyticsReportSender;

public final class addViewInLayout implements Transformer {
    public static final addViewInLayout setMin = new addViewInLayout();

    public final Object apply(Object obj) {
        return DataTransportCrashlyticsReportSender.length((CrashlyticsReport) obj);
    }
}
