package o;

import com.google.firebase.crashlytics.internal.persistence.CrashlyticsReportPersistence;
import java.io.File;
import java.io.FilenameFilter;

public final class endViewTransition implements FilenameFilter {
    public static final endViewTransition setMax = new endViewTransition();

    public final boolean accept(File file, String str) {
        return CrashlyticsReportPersistence.getMin(file, str);
    }
}
