package o;

import com.google.firebase.crashlytics.internal.common.CrashlyticsController;
import java.io.File;
import java.io.FilenameFilter;

public final class getSupportFragmentManager implements FilenameFilter {
    public static final getSupportFragmentManager setMax = new getSupportFragmentManager();

    public final boolean accept(File file, String str) {
        return str.startsWith(CrashlyticsController.APP_EXCEPTION_MARKER_PREFIX);
    }
}
