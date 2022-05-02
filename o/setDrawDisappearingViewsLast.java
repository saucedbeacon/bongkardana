package o;

import com.google.firebase.crashlytics.internal.persistence.CrashlyticsReportPersistence;
import java.io.File;
import java.util.Comparator;

public final class setDrawDisappearingViewsLast implements Comparator {
    public static final setDrawDisappearingViewsLast getMin = new setDrawDisappearingViewsLast();

    public final int compare(Object obj, Object obj2) {
        return CrashlyticsReportPersistence.setMin((File) obj, (File) obj2);
    }
}
