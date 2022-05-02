package o;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import id.dana.data.saving.model.MainEmptyStateEntity;
import id.dana.data.saving.model.SavingBenefitEntity;
import java.io.IOException;
import java.util.List;
import o.RVHttpRequest;
import o.SavedStateHandleController;

public final class isPackageRequest extends TypeAdapter implements registerIn {
    private SavedStateHandleController.AnonymousClass1 length;
    private SavedStateHandleController setMax;
    private Gson setMin;

    public isPackageRequest(Gson gson, SavedStateHandleController.AnonymousClass1 r2, SavedStateHandleController savedStateHandleController) {
        this.setMin = gson;
        this.length = r2;
        this.setMax = savedStateHandleController;
    }

    public final void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        url url = (url) obj;
        Gson gson = this.setMin;
        SavedStateHandleController savedStateHandleController = this.setMax;
        jsonWriter.beginObject();
        if (url != url.mainEmptyState) {
            savedStateHandleController.setMax(jsonWriter, 60);
            MainEmptyStateEntity mainEmptyStateEntity = url.mainEmptyState;
            onActivityPrePaused.setMin(gson, MainEmptyStateEntity.class, mainEmptyStateEntity).write(jsonWriter, mainEmptyStateEntity);
        }
        if (url != url.savingBenefit) {
            savedStateHandleController.setMax(jsonWriter, 29);
            RVHttpRequest.AnonymousClass1 r1 = new TypeToken<List<SavingBenefitEntity>>() {
            };
            List<SavingBenefitEntity> list = url.savingBenefit;
            onActivityPrePaused.length(gson, r1, list).write(jsonWriter, list);
        }
        jsonWriter.endObject();
    }

    public final Object read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.skipValue();
            return null;
        }
        url url = new url();
        Gson gson = this.setMin;
        SavedStateHandleController.AnonymousClass1 r3 = this.length;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            int min = r3.getMin(jsonReader);
            boolean z = jsonReader.peek() != JsonToken.NULL;
            if (min != 87) {
                if (min != 123) {
                    jsonReader.skipValue();
                } else if (z) {
                    url.mainEmptyState = gson.getAdapter(MainEmptyStateEntity.class).read(jsonReader);
                } else {
                    url.mainEmptyState = null;
                }
            } else if (z) {
                url.savingBenefit = (List) gson.getAdapter(new TypeToken<List<SavingBenefitEntity>>() {
                }).read(jsonReader);
            } else {
                url.savingBenefit = null;
            }
            jsonReader.nextNull();
        }
        jsonReader.endObject();
        return url;
    }
}
