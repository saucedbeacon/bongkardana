package o;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import o.SavedStateHandleController;

public final class preCreateApp extends TypeAdapter implements registerIn {
    private Gson getMax;
    private SavedStateHandleController getMin;
    private SavedStateHandleController.AnonymousClass1 length;

    public preCreateApp(Gson gson, SavedStateHandleController.AnonymousClass1 r2, SavedStateHandleController savedStateHandleController) {
        this.getMax = gson;
        this.length = r2;
        this.getMin = savedStateHandleController;
    }

    public final void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        JsonReader$Token jsonReader$Token = (JsonReader$Token) obj;
        SavedStateHandleController savedStateHandleController = this.getMin;
        jsonWriter.beginObject();
        if (jsonReader$Token != jsonReader$Token.icon) {
            savedStateHandleController.setMax(jsonWriter, 151);
            jsonWriter.value(jsonReader$Token.icon);
        }
        if (jsonReader$Token != jsonReader$Token.name) {
            savedStateHandleController.setMax(jsonWriter, 63);
            jsonWriter.value(jsonReader$Token.name);
        }
        if (jsonReader$Token != jsonReader$Token.nameInBahasa) {
            savedStateHandleController.setMax(jsonWriter, 68);
            jsonWriter.value(jsonReader$Token.nameInBahasa);
        }
        jsonWriter.endObject();
    }

    public final Object read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.skipValue();
            return null;
        }
        JsonReader$Token jsonReader$Token = new JsonReader$Token();
        SavedStateHandleController.AnonymousClass1 r1 = this.length;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            int min = r1.getMin(jsonReader);
            boolean z = jsonReader.peek() != JsonToken.NULL;
            if (min != 8) {
                if (min != 19) {
                    if (min != 85) {
                        jsonReader.skipValue();
                    } else if (z) {
                        jsonReader$Token.nameInBahasa = jsonReader.peek() != JsonToken.BOOLEAN ? jsonReader.nextString() : Boolean.toString(jsonReader.nextBoolean());
                    } else {
                        jsonReader$Token.nameInBahasa = null;
                    }
                } else if (z) {
                    jsonReader$Token.icon = jsonReader.peek() != JsonToken.BOOLEAN ? jsonReader.nextString() : Boolean.toString(jsonReader.nextBoolean());
                } else {
                    jsonReader$Token.icon = null;
                }
            } else if (z) {
                jsonReader$Token.name = jsonReader.peek() != JsonToken.BOOLEAN ? jsonReader.nextString() : Boolean.toString(jsonReader.nextBoolean());
            } else {
                jsonReader$Token.name = null;
            }
            jsonReader.nextNull();
        }
        jsonReader.endObject();
        return jsonReader$Token;
    }
}
