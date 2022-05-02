package o;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.iap.ac.android.u.d;
import java.io.IOException;
import o.SavedStateHandleController;

public final class dataToString extends TypeAdapter implements registerIn {
    private SavedStateHandleController getMin;
    private SavedStateHandleController.AnonymousClass1 setMax;
    private Gson setMin;

    public dataToString(Gson gson, SavedStateHandleController.AnonymousClass1 r2, SavedStateHandleController savedStateHandleController) {
        this.setMin = gson;
        this.setMax = r2;
        this.getMin = savedStateHandleController;
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
        d dVar = new d();
        d.getMin(jsonReader, this.setMax);
        return dVar;
    }
}
