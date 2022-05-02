package o;

import com.alibaba.fastjson.JSONArray;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.List;
import o.SavedStateHandleController;

public final class ensureLogoView extends TypeAdapter implements registerIn {
    private SavedStateHandleController.AnonymousClass1 getMax;
    private Gson length;
    private SavedStateHandleController setMax;

    public ensureLogoView(Gson gson, SavedStateHandleController.AnonymousClass1 r2, SavedStateHandleController savedStateHandleController) {
        this.length = gson;
        this.getMax = r2;
        this.setMax = savedStateHandleController;
    }

    public final void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        JSONArray jSONArray = (JSONArray) obj;
        Gson gson = this.length;
        SavedStateHandleController savedStateHandleController = this.setMax;
        jsonWriter.beginObject();
        if (jSONArray != jSONArray.list) {
            savedStateHandleController.setMax(jsonWriter, 55);
            getTitleMarginBottom gettitlemarginbottom = new getTitleMarginBottom();
            List<Object> list = jSONArray.list;
            onActivityPrePaused.length(gson, gettitlemarginbottom, list).write(jsonWriter, list);
        }
        jsonWriter.endObject();
    }

    public final Object read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.skipValue();
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        jSONArray.getMax(this.length, jsonReader, this.getMax);
        return jSONArray;
    }
}
