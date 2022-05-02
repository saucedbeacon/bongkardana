package o;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.iap.ac.android.u.e;
import java.io.IOException;
import o.SavedStateHandleController;

public final class AudioAttributesCompatParcelizer extends TypeAdapter implements registerIn {
    private Gson getMin;
    private SavedStateHandleController.AnonymousClass1 setMax;
    private SavedStateHandleController setMin;

    public AudioAttributesCompatParcelizer(Gson gson, SavedStateHandleController.AnonymousClass1 r2, SavedStateHandleController savedStateHandleController) {
        this.getMin = gson;
        this.setMax = r2;
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
        e eVar = new e();
        e.setMin(jsonReader, this.setMax);
        return eVar;
    }
}
