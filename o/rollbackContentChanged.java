package o;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.iap.ac.android.u.c;
import java.io.IOException;
import o.SavedStateHandleController;

public final class rollbackContentChanged extends TypeAdapter implements registerIn {
    private Gson getMax;
    private SavedStateHandleController.AnonymousClass1 getMin;
    private SavedStateHandleController length;

    public rollbackContentChanged(Gson gson, SavedStateHandleController.AnonymousClass1 r2, SavedStateHandleController savedStateHandleController) {
        this.getMax = gson;
        this.getMin = r2;
        this.length = savedStateHandleController;
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
        c cVar = new c();
        c.setMin(jsonReader, this.getMin);
        return cVar;
    }
}
