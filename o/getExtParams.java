package o;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import id.dana.data.saving.model.SavingBenefitEntity;
import java.io.IOException;
import o.SavedStateHandleController;

public final class getExtParams extends TypeAdapter implements registerIn {
    private SavedStateHandleController.AnonymousClass1 getMin;
    private SavedStateHandleController length;
    private Gson setMax;

    public getExtParams(Gson gson, SavedStateHandleController.AnonymousClass1 r2, SavedStateHandleController savedStateHandleController) {
        this.setMax = gson;
        this.getMin = r2;
        this.length = savedStateHandleController;
    }

    public final void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        SavingBenefitEntity savingBenefitEntity = (SavingBenefitEntity) obj;
        SavedStateHandleController savedStateHandleController = this.length;
        jsonWriter.beginObject();
        if (savingBenefitEntity != savingBenefitEntity.icon) {
            savedStateHandleController.setMax(jsonWriter, 151);
            jsonWriter.value(savingBenefitEntity.icon);
        }
        if (savingBenefitEntity != savingBenefitEntity.title) {
            savedStateHandleController.setMax(jsonWriter, 11);
            jsonWriter.value(savingBenefitEntity.title);
        }
        if (savingBenefitEntity != savingBenefitEntity.subtitle) {
            savedStateHandleController.setMax(jsonWriter, 73);
            jsonWriter.value(savingBenefitEntity.subtitle);
        }
        jsonWriter.endObject();
    }

    public final Object read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.skipValue();
            return null;
        }
        SavingBenefitEntity savingBenefitEntity = new SavingBenefitEntity();
        SavedStateHandleController.AnonymousClass1 r1 = this.getMin;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            int min = r1.getMin(jsonReader);
            boolean z = jsonReader.peek() != JsonToken.NULL;
            if (min != 19) {
                if (min != 45) {
                    if (min != 163) {
                        jsonReader.skipValue();
                    } else if (z) {
                        savingBenefitEntity.subtitle = jsonReader.peek() != JsonToken.BOOLEAN ? jsonReader.nextString() : Boolean.toString(jsonReader.nextBoolean());
                    } else {
                        savingBenefitEntity.subtitle = null;
                    }
                } else if (z) {
                    savingBenefitEntity.title = jsonReader.peek() != JsonToken.BOOLEAN ? jsonReader.nextString() : Boolean.toString(jsonReader.nextBoolean());
                } else {
                    savingBenefitEntity.title = null;
                }
            } else if (z) {
                savingBenefitEntity.icon = jsonReader.peek() != JsonToken.BOOLEAN ? jsonReader.nextString() : Boolean.toString(jsonReader.nextBoolean());
            } else {
                savingBenefitEntity.icon = null;
            }
            jsonReader.nextNull();
        }
        jsonReader.endObject();
        return savingBenefitEntity;
    }
}
