package o;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import id.dana.data.saving.model.MainEmptyStateEntity;
import java.io.IOException;
import o.SavedStateHandleController;

public final class access$602 extends TypeAdapter implements registerIn {
    private SavedStateHandleController getMax;
    private Gson length;
    private SavedStateHandleController.AnonymousClass1 setMin;

    public access$602(Gson gson, SavedStateHandleController.AnonymousClass1 r2, SavedStateHandleController savedStateHandleController) {
        this.length = gson;
        this.setMin = r2;
        this.getMax = savedStateHandleController;
    }

    public final void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        MainEmptyStateEntity mainEmptyStateEntity = (MainEmptyStateEntity) obj;
        SavedStateHandleController savedStateHandleController = this.getMax;
        jsonWriter.beginObject();
        if (mainEmptyStateEntity != mainEmptyStateEntity.icon) {
            savedStateHandleController.setMax(jsonWriter, 151);
            jsonWriter.value(mainEmptyStateEntity.icon);
        }
        if (mainEmptyStateEntity != mainEmptyStateEntity.title) {
            savedStateHandleController.setMax(jsonWriter, 11);
            jsonWriter.value(mainEmptyStateEntity.title);
        }
        if (mainEmptyStateEntity != mainEmptyStateEntity.subtitle) {
            savedStateHandleController.setMax(jsonWriter, 73);
            jsonWriter.value(mainEmptyStateEntity.subtitle);
        }
        jsonWriter.endObject();
    }

    public final Object read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.skipValue();
            return null;
        }
        MainEmptyStateEntity mainEmptyStateEntity = new MainEmptyStateEntity();
        SavedStateHandleController.AnonymousClass1 r1 = this.setMin;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            int min = r1.getMin(jsonReader);
            boolean z = jsonReader.peek() != JsonToken.NULL;
            if (min != 19) {
                if (min != 45) {
                    if (min != 163) {
                        jsonReader.skipValue();
                    } else if (z) {
                        mainEmptyStateEntity.subtitle = jsonReader.peek() != JsonToken.BOOLEAN ? jsonReader.nextString() : Boolean.toString(jsonReader.nextBoolean());
                    } else {
                        mainEmptyStateEntity.subtitle = null;
                    }
                } else if (z) {
                    mainEmptyStateEntity.title = jsonReader.peek() != JsonToken.BOOLEAN ? jsonReader.nextString() : Boolean.toString(jsonReader.nextBoolean());
                } else {
                    mainEmptyStateEntity.title = null;
                }
            } else if (z) {
                mainEmptyStateEntity.icon = jsonReader.peek() != JsonToken.BOOLEAN ? jsonReader.nextString() : Boolean.toString(jsonReader.nextBoolean());
            } else {
                mainEmptyStateEntity.icon = null;
            }
            jsonReader.nextNull();
        }
        jsonReader.endObject();
        return mainEmptyStateEntity;
    }
}
