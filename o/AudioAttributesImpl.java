package o;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.iap.ac.android.u.j;
import java.io.IOException;
import o.SavedStateHandleController;

public final class AudioAttributesImpl extends TypeAdapter implements registerIn {
    private SavedStateHandleController.AnonymousClass1 getMax;
    private Gson setMax;
    private SavedStateHandleController setMin;

    public AudioAttributesImpl(Gson gson, SavedStateHandleController.AnonymousClass1 r2, SavedStateHandleController savedStateHandleController) {
        this.setMax = gson;
        this.getMax = r2;
        this.setMin = savedStateHandleController;
    }

    public final void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.endObject();
    }

    public final Object read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.skipValue();
            return null;
        }
        j jVar = new j();
        j.setMin(jsonReader, this.getMax);
        return jVar;
    }
}
