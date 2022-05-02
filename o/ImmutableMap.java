package o;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import o.SavedStateHandleController;

public final class ImmutableMap extends TypeAdapter implements registerIn {
    private Gson getMin;
    private SavedStateHandleController.AnonymousClass1 length;
    private SavedStateHandleController setMin;

    public ImmutableMap(Gson gson, SavedStateHandleController.AnonymousClass1 r2, SavedStateHandleController savedStateHandleController) {
        this.getMin = gson;
        this.length = r2;
        this.setMin = savedStateHandleController;
    }

    public final void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        containsValue containsvalue = (containsValue) obj;
        SavedStateHandleController savedStateHandleController = this.setMin;
        jsonWriter.beginObject();
        if (containsvalue != containsvalue.title) {
            savedStateHandleController.setMax(jsonWriter, 11);
            jsonWriter.value(containsvalue.title);
        }
        if (containsvalue != containsvalue.redirectUrl) {
            savedStateHandleController.setMax(jsonWriter, 183);
            jsonWriter.value(containsvalue.redirectUrl);
        }
        savedStateHandleController.setMax(jsonWriter, 98);
        jsonWriter.value(containsvalue.enable);
        if (containsvalue != containsvalue.key) {
            savedStateHandleController.setMax(jsonWriter, 35);
            jsonWriter.value(containsvalue.key);
        }
        jsonWriter.endObject();
    }

    public final Object read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.skipValue();
            return null;
        }
        containsValue containsvalue = new containsValue();
        Gson gson = this.getMin;
        SavedStateHandleController.AnonymousClass1 r3 = this.length;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            int min = r3.getMin(jsonReader);
            boolean z = jsonReader.peek() != JsonToken.NULL;
            if (min != 36) {
                if (min != 45) {
                    if (min != 150) {
                        if (min != 184) {
                            jsonReader.skipValue();
                        } else if (z) {
                            containsvalue.enable = gson.getAdapter(Boolean.class).read(jsonReader).booleanValue();
                        }
                    } else if (z) {
                        containsvalue.key = jsonReader.peek() != JsonToken.BOOLEAN ? jsonReader.nextString() : Boolean.toString(jsonReader.nextBoolean());
                    } else {
                        containsvalue.key = null;
                    }
                } else if (z) {
                    containsvalue.title = jsonReader.peek() != JsonToken.BOOLEAN ? jsonReader.nextString() : Boolean.toString(jsonReader.nextBoolean());
                } else {
                    containsvalue.title = null;
                }
            } else if (z) {
                containsvalue.redirectUrl = jsonReader.peek() != JsonToken.BOOLEAN ? jsonReader.nextString() : Boolean.toString(jsonReader.nextBoolean());
            } else {
                containsvalue.redirectUrl = null;
            }
            jsonReader.nextNull();
        }
        jsonReader.endObject();
        return containsvalue;
    }
}
