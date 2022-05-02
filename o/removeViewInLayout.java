package o;

import com.google.firebase.crashlytics.internal.persistence.CrashlyticsReportPersistence;
import java.io.File;
import java.util.Comparator;

public final class removeViewInLayout implements Comparator {
    public static final removeViewInLayout setMin = new removeViewInLayout();

    public final int compare(Object obj, Object obj2) {
        return CrashlyticsReportPersistence.length((File) obj, (File) obj2);
    }
}
