package o;

import android.util.JsonReader;
import com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform;

public final class setLayoutTransition implements CrashlyticsReportJsonTransform.ObjectParser {
    public static final setLayoutTransition getMin = new setLayoutTransition();

    public final Object parse(JsonReader jsonReader) {
        return CrashlyticsReportJsonTransform.parseEventFrame(jsonReader);
    }
}
