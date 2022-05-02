package o;

import android.util.JsonReader;
import com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform;

public final class startActivityFromFragment implements CrashlyticsReportJsonTransform.ObjectParser {
    public static final startActivityFromFragment length = new startActivityFromFragment();

    public final Object parse(JsonReader jsonReader) {
        return CrashlyticsReportJsonTransform.parseEventThread(jsonReader);
    }
}
