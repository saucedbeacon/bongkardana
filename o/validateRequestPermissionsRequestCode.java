package o;

import android.util.JsonReader;
import com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform;

public final class validateRequestPermissionsRequestCode implements CrashlyticsReportJsonTransform.ObjectParser {
    public static final validateRequestPermissionsRequestCode setMin = new validateRequestPermissionsRequestCode();

    public final Object parse(JsonReader jsonReader) {
        return CrashlyticsReportJsonTransform.parseCustomAttribute(jsonReader);
    }
}
