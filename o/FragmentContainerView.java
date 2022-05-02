package o;

import com.google.firebase.crashlytics.internal.persistence.CrashlyticsReportPersistence;
import java.io.File;
import java.io.FilenameFilter;

public final class FragmentContainerView implements FilenameFilter {
    public static final FragmentContainerView getMin = new FragmentContainerView();

    public final boolean accept(File file, String str) {
        return CrashlyticsReportPersistence.length(file, str);
    }
}
