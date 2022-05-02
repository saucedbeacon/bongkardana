package o;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import id.dana.domain.danah5.model.H5ShareData;
import java.io.IOException;
import o.SavedStateHandleController;

public final class onJsAlert extends TypeAdapter implements registerIn {
    private Gson getMax;
    private SavedStateHandleController getMin;
    private SavedStateHandleController.AnonymousClass1 setMax;

    public onJsAlert(Gson gson, SavedStateHandleController.AnonymousClass1 r2, SavedStateHandleController savedStateHandleController) {
        this.getMax = gson;
        this.setMax = r2;
        this.getMin = savedStateHandleController;
    }

    public final void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        H5ShareData h5ShareData = (H5ShareData) obj;
        Gson gson = this.getMax;
        SavedStateHandleController savedStateHandleController = this.getMin;
        jsonWriter.beginObject();
        if (h5ShareData != h5ShareData.utdId) {
            savedStateHandleController.setMax(jsonWriter, 85);
            String[] strArr = h5ShareData.utdId;
            onActivityPrePaused.setMin(gson, String[].class, strArr).write(jsonWriter, strArr);
        }
        if (h5ShareData != h5ShareData.userId) {
            savedStateHandleController.setMax(jsonWriter, 94);
            String[] strArr2 = h5ShareData.userId;
            onActivityPrePaused.setMin(gson, String[].class, strArr2).write(jsonWriter, strArr2);
        }
        jsonWriter.endObject();
    }

    public final Object read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.skipValue();
            return null;
        }
        H5ShareData h5ShareData = new H5ShareData();
        Gson gson = this.getMax;
        SavedStateHandleController.AnonymousClass1 r3 = this.setMax;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            int min = r3.getMin(jsonReader);
            boolean z = jsonReader.peek() != JsonToken.NULL;
            if (min != 90) {
                if (min != 138) {
                    jsonReader.skipValue();
                } else if (z) {
                    h5ShareData.userId = gson.getAdapter(String[].class).read(jsonReader);
                } else {
                    h5ShareData.userId = null;
                }
            } else if (z) {
                h5ShareData.utdId = gson.getAdapter(String[].class).read(jsonReader);
            } else {
                h5ShareData.utdId = null;
            }
            jsonReader.nextNull();
        }
        jsonReader.endObject();
        return h5ShareData;
    }
}
