package o;

import com.google.firebase.crashlytics.internal.persistence.CrashlyticsReportPersistence;
import java.io.File;
import java.io.FilenameFilter;

public final class dispatchApplyWindowInsets implements FilenameFilter {
    private final String setMax;

    public dispatchApplyWindowInsets(String str) {
        this.setMax = str;
    }

    public final boolean accept(File file, String str) {
        return CrashlyticsReportPersistence.getMax(this.setMax, file, str);
    }
}
