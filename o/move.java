package o;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import o.SavedStateHandleController;

public final class move extends TypeAdapter implements registerIn {
    private SavedStateHandleController.AnonymousClass1 getMin;
    private SavedStateHandleController length;
    private Gson setMax;

    public move(Gson gson, SavedStateHandleController.AnonymousClass1 r2, SavedStateHandleController savedStateHandleController) {
        this.setMax = gson;
        this.getMin = r2;
        this.length = savedStateHandleController;
    }

    public final void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        calculateSize calculatesize = (calculateSize) obj;
        SavedStateHandleController savedStateHandleController = this.length;
        jsonWriter.beginObject();
        if (calculatesize != calculatesize.instId) {
            savedStateHandleController.setMax(jsonWriter, 99);
            jsonWriter.value(calculatesize.instId);
        }
        if (calculatesize != calculatesize.bankName) {
            savedStateHandleController.setMax(jsonWriter, 90);
            jsonWriter.value(calculatesize.bankName);
        }
        if (calculatesize != calculatesize.eWalletName) {
            savedStateHandleController.setMax(jsonWriter, 39);
            jsonWriter.value(calculatesize.eWalletName);
        }
        if (calculatesize != calculatesize.identifier) {
            savedStateHandleController.setMax(jsonWriter, 76);
            jsonWriter.value(calculatesize.identifier);
        }
        jsonWriter.endObject();
    }

    public final Object read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.skipValue();
            return null;
        }
        calculateSize calculatesize = new calculateSize();
        SavedStateHandleController.AnonymousClass1 r1 = this.getMin;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            int min = r1.getMin(jsonReader);
            boolean z = jsonReader.peek() != JsonToken.NULL;
            if (min != 15) {
                if (min != 33) {
                    if (min != 64) {
                        if (min != 128) {
                            jsonReader.skipValue();
                        } else if (z) {
                            calculatesize.instId = jsonReader.peek() != JsonToken.BOOLEAN ? jsonReader.nextString() : Boolean.toString(jsonReader.nextBoolean());
                        } else {
                            calculatesize.instId = null;
                        }
                    } else if (z) {
                        calculatesize.bankName = jsonReader.peek() != JsonToken.BOOLEAN ? jsonReader.nextString() : Boolean.toString(jsonReader.nextBoolean());
                    } else {
                        calculatesize.bankName = null;
                    }
                } else if (z) {
                    calculatesize.identifier = jsonReader.peek() != JsonToken.BOOLEAN ? jsonReader.nextString() : Boolean.toString(jsonReader.nextBoolean());
                } else {
                    calculatesize.identifier = null;
                }
            } else if (z) {
                calculatesize.eWalletName = jsonReader.peek() != JsonToken.BOOLEAN ? jsonReader.nextString() : Boolean.toString(jsonReader.nextBoolean());
            } else {
                calculatesize.eWalletName = null;
            }
            jsonReader.nextNull();
        }
        jsonReader.endObject();
        return calculatesize;
    }
}
