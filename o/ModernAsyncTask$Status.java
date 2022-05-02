package o;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.iap.ac.android.u.b;
import java.io.IOException;
import o.SavedStateHandleController;

public final class ModernAsyncTask$Status extends TypeAdapter implements registerIn {
    private Gson getMax;
    private SavedStateHandleController.AnonymousClass1 setMax;
    private SavedStateHandleController setMin;

    public ModernAsyncTask$Status(Gson gson, SavedStateHandleController.AnonymousClass1 r2, SavedStateHandleController savedStateHandleController) {
        this.getMax = gson;
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
        b bVar = new b();
        b.getMin(jsonReader, this.setMax);
        return bVar;
    }
}
