package o;

import com.alibaba.fastjson.JSONObject;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Map;
import o.SavedStateHandleController;

public final class setLogoDescription extends TypeAdapter implements registerIn {
    private SavedStateHandleController getMin;
    private SavedStateHandleController.AnonymousClass1 length;
    private Gson setMax;

    public setLogoDescription(Gson gson, SavedStateHandleController.AnonymousClass1 r2, SavedStateHandleController savedStateHandleController) {
        this.setMax = gson;
        this.length = r2;
        this.getMin = savedStateHandleController;
    }

    public final void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        JSONObject jSONObject = (JSONObject) obj;
        Gson gson = this.setMax;
        SavedStateHandleController savedStateHandleController = this.getMin;
        jsonWriter.beginObject();
        if (jSONObject != jSONObject.map) {
            savedStateHandleController.setMax(jsonWriter, 144);
            hasExpandedActionView hasexpandedactionview = new hasExpandedActionView();
            Map<String, Object> map = jSONObject.map;
            onActivityPrePaused.length(gson, hasexpandedactionview, map).write(jsonWriter, map);
        }
        jsonWriter.endObject();
    }

    public final Object read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.skipValue();
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.setMax(this.setMax, jsonReader, this.length);
        return jSONObject;
    }
}
