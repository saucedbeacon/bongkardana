package o;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import id.dana.data.h5event.sendmoney.CheckoutFinishEntity;
import id.dana.data.h5event.sendmoney.PayQueryResponse;
import id.dana.savings.activity.SavingsActivity;
import java.io.IOException;
import o.SavedStateHandleController;

public final class removeTabItem extends TypeAdapter implements registerIn {
    private SavedStateHandleController.AnonymousClass1 getMax;
    private Gson getMin;
    private SavedStateHandleController setMin;

    public removeTabItem(Gson gson, SavedStateHandleController.AnonymousClass1 r2, SavedStateHandleController savedStateHandleController) {
        this.getMin = gson;
        this.getMax = r2;
        this.setMin = savedStateHandleController;
    }

    public final void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        CheckoutFinishEntity checkoutFinishEntity = (CheckoutFinishEntity) obj;
        Gson gson = this.getMin;
        SavedStateHandleController savedStateHandleController = this.setMin;
        jsonWriter.beginObject();
        savedStateHandleController.setMax(jsonWriter, 28);
        jsonWriter.value(checkoutFinishEntity.apiSuccess);
        if (checkoutFinishEntity != checkoutFinishEntity.processingStatus) {
            savedStateHandleController.setMax(jsonWriter, 106);
            jsonWriter.value(checkoutFinishEntity.processingStatus);
        }
        if (checkoutFinishEntity != checkoutFinishEntity.transType) {
            savedStateHandleController.setMax(jsonWriter, 42);
            jsonWriter.value(checkoutFinishEntity.transType);
        }
        if (checkoutFinishEntity != checkoutFinishEntity.payQueryResponse) {
            savedStateHandleController.setMax(jsonWriter, SavingsActivity.RV_BENEFIT_WIDTH);
            PayQueryResponse payQueryResponse = checkoutFinishEntity.payQueryResponse;
            onActivityPrePaused.setMin(gson, PayQueryResponse.class, payQueryResponse).write(jsonWriter, payQueryResponse);
        }
        if (checkoutFinishEntity != checkoutFinishEntity.transScenario) {
            savedStateHandleController.setMax(jsonWriter, 43);
            jsonWriter.value(checkoutFinishEntity.transScenario);
        }
        jsonWriter.endObject();
    }

    public final Object read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.skipValue();
            return null;
        }
        CheckoutFinishEntity checkoutFinishEntity = new CheckoutFinishEntity();
        Gson gson = this.getMin;
        SavedStateHandleController.AnonymousClass1 r3 = this.getMax;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            int min = r3.getMin(jsonReader);
            boolean z = jsonReader.peek() != JsonToken.NULL;
            if (min != 65) {
                if (min != 69) {
                    if (min != 91) {
                        if (min != 120) {
                            if (min != 140) {
                                jsonReader.skipValue();
                            } else if (z) {
                                checkoutFinishEntity.transType = jsonReader.peek() != JsonToken.BOOLEAN ? jsonReader.nextString() : Boolean.toString(jsonReader.nextBoolean());
                            } else {
                                checkoutFinishEntity.transType = null;
                            }
                        } else if (z) {
                            checkoutFinishEntity.transScenario = jsonReader.peek() != JsonToken.BOOLEAN ? jsonReader.nextString() : Boolean.toString(jsonReader.nextBoolean());
                        } else {
                            checkoutFinishEntity.transScenario = null;
                        }
                    } else if (z) {
                        checkoutFinishEntity.payQueryResponse = gson.getAdapter(PayQueryResponse.class).read(jsonReader);
                    } else {
                        checkoutFinishEntity.payQueryResponse = null;
                    }
                } else if (z) {
                    checkoutFinishEntity.processingStatus = jsonReader.peek() != JsonToken.BOOLEAN ? jsonReader.nextString() : Boolean.toString(jsonReader.nextBoolean());
                } else {
                    checkoutFinishEntity.processingStatus = null;
                }
            } else if (z) {
                checkoutFinishEntity.apiSuccess = gson.getAdapter(Boolean.class).read(jsonReader).booleanValue();
            }
            jsonReader.nextNull();
        }
        jsonReader.endObject();
        return checkoutFinishEntity;
    }
}
