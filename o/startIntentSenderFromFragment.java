package o;

import android.util.JsonReader;
import com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform;

public final class startIntentSenderFromFragment implements CrashlyticsReportJsonTransform.ObjectParser {
    public static final startIntentSenderFromFragment setMax = new startIntentSenderFromFragment();

    public final Object parse(JsonReader jsonReader) {
        return CrashlyticsReportJsonTransform.parseFile(jsonReader);
    }
}
