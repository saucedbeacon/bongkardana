package o;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import o.SavedStateHandleController;

public final class getMServiceUuidStartOffset extends TypeAdapter implements registerIn {
    private SavedStateHandleController.AnonymousClass1 getMax;
    private SavedStateHandleController setMax;
    private Gson setMin;

    public getMServiceUuidStartOffset(Gson gson, SavedStateHandleController.AnonymousClass1 r2, SavedStateHandleController savedStateHandleController) {
        this.setMin = gson;
        this.getMax = r2;
        this.setMax = savedStateHandleController;
    }

    public final void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        addExtraDataParser addextradataparser = (addExtraDataParser) obj;
        SavedStateHandleController savedStateHandleController = this.setMax;
        jsonWriter.beginObject();
        if (addextradataparser != addextradataparser.key) {
            savedStateHandleController.setMax(jsonWriter, 35);
            jsonWriter.value(addextradataparser.key);
        }
        if (addextradataparser != addextradataparser.instId) {
            savedStateHandleController.setMax(jsonWriter, 99);
            jsonWriter.value(addextradataparser.instId);
        }
        if (addextradataparser != addextradataparser.instLocalName) {
            savedStateHandleController.setMax(jsonWriter, 46);
            jsonWriter.value(addextradataparser.instLocalName);
        }
        if (addextradataparser != addextradataparser.payMethod) {
            savedStateHandleController.setMax(jsonWriter, 187);
            jsonWriter.value(addextradataparser.payMethod);
        }
        if (addextradataparser != addextradataparser.url) {
            savedStateHandleController.setMax(jsonWriter, 84);
            jsonWriter.value(addextradataparser.url);
        }
        savedStateHandleController.setMax(jsonWriter, 98);
        jsonWriter.value(addextradataparser.enable);
        jsonWriter.endObject();
    }

    public final Object read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.skipValue();
            return null;
        }
        addExtraDataParser addextradataparser = new addExtraDataParser();
        Gson gson = this.setMin;
        SavedStateHandleController.AnonymousClass1 r3 = this.getMax;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            int min = r3.getMin(jsonReader);
            boolean z = jsonReader.peek() != JsonToken.NULL;
            if (min != 50) {
                if (min != 121) {
                    if (min != 128) {
                        if (min != 148) {
                            if (min != 150) {
                                if (min != 184) {
                                    jsonReader.skipValue();
                                } else if (z) {
                                    addextradataparser.enable = gson.getAdapter(Boolean.class).read(jsonReader).booleanValue();
                                }
                            } else if (z) {
                                addextradataparser.key = jsonReader.peek() != JsonToken.BOOLEAN ? jsonReader.nextString() : Boolean.toString(jsonReader.nextBoolean());
                            } else {
                                addextradataparser.key = null;
                            }
                        } else if (z) {
                            addextradataparser.url = jsonReader.peek() != JsonToken.BOOLEAN ? jsonReader.nextString() : Boolean.toString(jsonReader.nextBoolean());
                        } else {
                            addextradataparser.url = null;
                        }
                    } else if (z) {
                        addextradataparser.instId = jsonReader.peek() != JsonToken.BOOLEAN ? jsonReader.nextString() : Boolean.toString(jsonReader.nextBoolean());
                    } else {
                        addextradataparser.instId = null;
                    }
                } else if (z) {
                    addextradataparser.instLocalName = jsonReader.peek() != JsonToken.BOOLEAN ? jsonReader.nextString() : Boolean.toString(jsonReader.nextBoolean());
                } else {
                    addextradataparser.instLocalName = null;
                }
            } else if (z) {
                addextradataparser.payMethod = jsonReader.peek() != JsonToken.BOOLEAN ? jsonReader.nextString() : Boolean.toString(jsonReader.nextBoolean());
            } else {
                addextradataparser.payMethod = null;
            }
            jsonReader.nextNull();
        }
        jsonReader.endObject();
        return addextradataparser;
    }
}
