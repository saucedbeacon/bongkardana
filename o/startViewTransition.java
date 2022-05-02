package o;

import com.google.firebase.crashlytics.internal.persistence.CrashlyticsReportPersistence;
import java.io.File;
import java.io.FileFilter;

public final class startViewTransition implements FileFilter {
    private final String getMax;

    public startViewTransition(String str) {
        this.getMax = str;
    }

    public final boolean accept(File file) {
        return CrashlyticsReportPersistence.getMin(this.getMax, file);
    }
}
