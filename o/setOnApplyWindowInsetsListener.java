package o;

import android.util.JsonReader;
import com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform;

public final class setOnApplyWindowInsetsListener implements CrashlyticsReportJsonTransform.ObjectParser {
    public static final setOnApplyWindowInsetsListener setMax = new setOnApplyWindowInsetsListener();

    public final Object parse(JsonReader jsonReader) {
        return CrashlyticsReportJsonTransform.parseEventBinaryImage(jsonReader);
    }
}
