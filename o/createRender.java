package o;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import id.dana.data.nearbyme.model.MerchantConfigEntity;
import java.io.IOException;
import o.SavedStateHandleController;

public final class createRender extends TypeAdapter implements registerIn {
    private SavedStateHandleController getMax;
    private SavedStateHandleController.AnonymousClass1 length;
    private Gson setMax;

    public createRender(Gson gson, SavedStateHandleController.AnonymousClass1 r2, SavedStateHandleController savedStateHandleController) {
        this.setMax = gson;
        this.length = r2;
        this.getMax = savedStateHandleController;
    }

    public final void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        SavedStateHandleController savedStateHandleController = this.getMax;
        jsonWriter.beginObject();
        savedStateHandleController.setMax(jsonWriter, 98);
        jsonWriter.value(((MerchantConfigEntity) obj).enable);
        jsonWriter.endObject();
    }

    public final Object read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.skipValue();
            return null;
        }
        MerchantConfigEntity merchantConfigEntity = new MerchantConfigEntity();
        Gson gson = this.setMax;
        SavedStateHandleController.AnonymousClass1 r2 = this.length;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            int min = r2.getMin(jsonReader);
            boolean z = jsonReader.peek() != JsonToken.NULL;
            if (min != 184) {
                jsonReader.skipValue();
            } else if (z) {
                merchantConfigEntity.enable = gson.getAdapter(Boolean.class).read(jsonReader).booleanValue();
            } else {
                jsonReader.nextNull();
            }
        }
        jsonReader.endObject();
        return merchantConfigEntity;
    }
}
