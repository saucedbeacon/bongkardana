package o;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.util.Comparator;

public final class getSupportLoaderManager implements Comparator {
    public static final getSupportLoaderManager setMin = new getSupportLoaderManager();

    public final int compare(Object obj, Object obj2) {
        return ((CrashlyticsReport.CustomAttribute) obj).getKey().compareTo(((CrashlyticsReport.CustomAttribute) obj2).getKey());
    }
}
