package o;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import o.CreateDialogParam;
import o.SavedStateHandleController;

public final class DialogPoint extends TypeAdapter implements registerIn {
    private SavedStateHandleController getMax;
    private SavedStateHandleController.AnonymousClass1 getMin;
    private Gson setMin;

    public DialogPoint(Gson gson, SavedStateHandleController.AnonymousClass1 r2, SavedStateHandleController savedStateHandleController) {
        this.setMin = gson;
        this.getMin = r2;
        this.getMax = savedStateHandleController;
    }

    public final void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        CreateDialogParam.AgreementClickListener agreementClickListener = (CreateDialogParam.AgreementClickListener) obj;
        Gson gson = this.setMin;
        SavedStateHandleController savedStateHandleController = this.getMax;
        jsonWriter.beginObject();
        if (agreementClickListener != agreementClickListener.distanceInMeters) {
            savedStateHandleController.setMax(jsonWriter, 147);
            jsonWriter.value(agreementClickListener.distanceInMeters);
        }
        savedStateHandleController.setMax(jsonWriter, 155);
        Class cls = Long.TYPE;
        Long valueOf = Long.valueOf(agreementClickListener.intervalInHours);
        onActivityPrePaused.setMin(gson, cls, valueOf).write(jsonWriter, valueOf);
        savedStateHandleController.setMax(jsonWriter, 143);
        jsonWriter.value(agreementClickListener.shouldCallGoogleGeocodeAPI);
        jsonWriter.endObject();
    }

    public final Object read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.skipValue();
            return null;
        }
        CreateDialogParam.AgreementClickListener agreementClickListener = new CreateDialogParam.AgreementClickListener();
        Gson gson = this.setMin;
        SavedStateHandleController.AnonymousClass1 r3 = this.getMin;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            int min = r3.getMin(jsonReader);
            boolean z = jsonReader.peek() != JsonToken.NULL;
            if (min != 48) {
                if (min != 49) {
                    if (min != 156) {
                        jsonReader.skipValue();
                    } else if (z) {
                        agreementClickListener.intervalInHours = gson.getAdapter(Long.class).read(jsonReader).longValue();
                    }
                } else if (z) {
                    agreementClickListener.distanceInMeters = jsonReader.peek() != JsonToken.BOOLEAN ? jsonReader.nextString() : Boolean.toString(jsonReader.nextBoolean());
                } else {
                    agreementClickListener.distanceInMeters = null;
                }
            } else if (z) {
                agreementClickListener.shouldCallGoogleGeocodeAPI = gson.getAdapter(Boolean.class).read(jsonReader).booleanValue();
            }
            jsonReader.nextNull();
        }
        jsonReader.endObject();
        return agreementClickListener;
    }
}
