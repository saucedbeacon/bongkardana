package o;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import o.SavedStateHandleController;

public final class getAppStack extends TypeAdapter implements registerIn {
    private SavedStateHandleController getMin;
    private Gson setMax;
    private SavedStateHandleController.AnonymousClass1 setMin;

    public getAppStack(Gson gson, SavedStateHandleController.AnonymousClass1 r2, SavedStateHandleController savedStateHandleController) {
        this.setMax = gson;
        this.setMin = r2;
        this.getMin = savedStateHandleController;
    }

    public final void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        SavedStateHandleController savedStateHandleController = this.getMin;
        jsonWriter.beginObject();
        savedStateHandleController.setMax(jsonWriter, TsExtractor.TS_STREAM_TYPE_DTS);
        jsonWriter.value((Number) Integer.valueOf(((startApp) obj).minimumRadiusInMeter));
        jsonWriter.endObject();
    }

    public final Object read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.skipValue();
            return null;
        }
        startApp startapp = new startApp();
        SavedStateHandleController.AnonymousClass1 r1 = this.setMin;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            int min = r1.getMin(jsonReader);
            boolean z = jsonReader.peek() != JsonToken.NULL;
            if (min != 68) {
                jsonReader.skipValue();
            } else if (z) {
                try {
                    startapp.minimumRadiusInMeter = jsonReader.nextInt();
                } catch (NumberFormatException e) {
                    throw new JsonSyntaxException((Throwable) e);
                }
            } else {
                jsonReader.nextNull();
            }
        }
        jsonReader.endObject();
        return startapp;
    }
}
