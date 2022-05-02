package o;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import id.dana.data.h5event.sendmoney.PayQueryResponse;
import java.io.IOException;
import o.SavedStateHandleController;

public final class isCreated extends TypeAdapter implements registerIn {
    private SavedStateHandleController getMax;
    private Gson getMin;
    private SavedStateHandleController.AnonymousClass1 length;

    public isCreated(Gson gson, SavedStateHandleController.AnonymousClass1 r2, SavedStateHandleController savedStateHandleController) {
        this.getMin = gson;
        this.length = r2;
        this.getMax = savedStateHandleController;
    }

    public final void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        PayQueryResponse payQueryResponse = (PayQueryResponse) obj;
        Gson gson = this.getMin;
        SavedStateHandleController savedStateHandleController = this.getMax;
        jsonWriter.beginObject();
        if (payQueryResponse != payQueryResponse.redirectUrl) {
            savedStateHandleController.setMax(jsonWriter, 183);
            jsonWriter.value(payQueryResponse.redirectUrl);
        }
        if (payQueryResponse != payQueryResponse.success) {
            savedStateHandleController.setMax(jsonWriter, 23);
            jsonWriter.value(payQueryResponse.success);
        }
        if (payQueryResponse != payQueryResponse.oauthRedirectUrl) {
            savedStateHandleController.setMax(jsonWriter, 38);
            jsonWriter.value(payQueryResponse.oauthRedirectUrl);
        }
        if (payQueryResponse != payQueryResponse.errorCode) {
            savedStateHandleController.setMax(jsonWriter, 40);
            jsonWriter.value(payQueryResponse.errorCode);
        }
        if (payQueryResponse != payQueryResponse.attributes) {
            savedStateHandleController.setMax(jsonWriter, 154);
            isEnableTabClick isenabletabclick = payQueryResponse.attributes;
            onActivityPrePaused.setMin(gson, isEnableTabClick.class, isenabletabclick).write(jsonWriter, isenabletabclick);
        }
        if (payQueryResponse != payQueryResponse.cashierOrderId) {
            savedStateHandleController.setMax(jsonWriter, 25);
            jsonWriter.value(payQueryResponse.cashierOrderId);
        }
        if (payQueryResponse != payQueryResponse.errorMsg) {
            savedStateHandleController.setMax(jsonWriter, 186);
            jsonWriter.value(payQueryResponse.errorMsg);
        }
        jsonWriter.endObject();
    }

    public final Object read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.skipValue();
            return null;
        }
        PayQueryResponse payQueryResponse = new PayQueryResponse();
        Gson gson = this.getMin;
        SavedStateHandleController.AnonymousClass1 r3 = this.length;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            int min = r3.getMin(jsonReader);
            boolean z = jsonReader.peek() != JsonToken.NULL;
            if (min != 36) {
                if (min != 99) {
                    if (min != 113) {
                        if (min != 124) {
                            if (min != 143) {
                                if (min != 153) {
                                    if (min != 170) {
                                        jsonReader.skipValue();
                                    } else if (z) {
                                        payQueryResponse.attributes = gson.getAdapter(isEnableTabClick.class).read(jsonReader);
                                    } else {
                                        payQueryResponse.attributes = null;
                                    }
                                } else if (z) {
                                    payQueryResponse.cashierOrderId = jsonReader.peek() != JsonToken.BOOLEAN ? jsonReader.nextString() : Boolean.toString(jsonReader.nextBoolean());
                                } else {
                                    payQueryResponse.cashierOrderId = null;
                                }
                            } else if (z) {
                                payQueryResponse.success = gson.getAdapter(Boolean.class).read(jsonReader);
                            } else {
                                payQueryResponse.success = null;
                            }
                        } else if (z) {
                            payQueryResponse.errorCode = jsonReader.peek() != JsonToken.BOOLEAN ? jsonReader.nextString() : Boolean.toString(jsonReader.nextBoolean());
                        } else {
                            payQueryResponse.errorCode = null;
                        }
                    } else if (z) {
                        payQueryResponse.errorMsg = jsonReader.peek() != JsonToken.BOOLEAN ? jsonReader.nextString() : Boolean.toString(jsonReader.nextBoolean());
                    } else {
                        payQueryResponse.errorMsg = null;
                    }
                } else if (z) {
                    payQueryResponse.oauthRedirectUrl = jsonReader.peek() != JsonToken.BOOLEAN ? jsonReader.nextString() : Boolean.toString(jsonReader.nextBoolean());
                } else {
                    payQueryResponse.oauthRedirectUrl = null;
                }
            } else if (z) {
                payQueryResponse.redirectUrl = jsonReader.peek() != JsonToken.BOOLEAN ? jsonReader.nextString() : Boolean.toString(jsonReader.nextBoolean());
            } else {
                payQueryResponse.redirectUrl = null;
            }
            jsonReader.nextNull();
        }
        jsonReader.endObject();
        return payQueryResponse;
    }
}
