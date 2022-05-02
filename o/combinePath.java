package o;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import o.SavedStateHandleController;

public final class combinePath extends TypeAdapter implements registerIn {
    private Gson length;
    private SavedStateHandleController.AnonymousClass1 setMax;
    private SavedStateHandleController setMin;

    public combinePath(Gson gson, SavedStateHandleController.AnonymousClass1 r2, SavedStateHandleController savedStateHandleController) {
        this.length = gson;
        this.setMax = r2;
        this.setMin = savedStateHandleController;
    }

    public final void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        getNewDomainSuffix getnewdomainsuffix = (getNewDomainSuffix) obj;
        SavedStateHandleController savedStateHandleController = this.setMin;
        jsonWriter.beginObject();
        if (getnewdomainsuffix != getnewdomainsuffix.billerName) {
            savedStateHandleController.setMax(jsonWriter, 184);
            jsonWriter.value(getnewdomainsuffix.billerName);
        }
        if (getnewdomainsuffix != getnewdomainsuffix.instId) {
            savedStateHandleController.setMax(jsonWriter, 99);
            jsonWriter.value(getnewdomainsuffix.instId);
        }
        if (getnewdomainsuffix != getnewdomainsuffix.prefix) {
            savedStateHandleController.setMax(jsonWriter, 142);
            jsonWriter.value(getnewdomainsuffix.prefix);
        }
        if (getnewdomainsuffix != getnewdomainsuffix.clientId) {
            savedStateHandleController.setMax(jsonWriter, 92);
            jsonWriter.value(getnewdomainsuffix.clientId);
        }
        if (getnewdomainsuffix != getnewdomainsuffix.redirectUrl) {
            savedStateHandleController.setMax(jsonWriter, 183);
            jsonWriter.value(getnewdomainsuffix.redirectUrl);
        }
        if (getnewdomainsuffix != getnewdomainsuffix.scopes) {
            savedStateHandleController.setMax(jsonWriter, 15);
            jsonWriter.value(getnewdomainsuffix.scopes);
        }
        savedStateHandleController.setMax(jsonWriter, 82);
        jsonWriter.value(getnewdomainsuffix.agreed);
        jsonWriter.endObject();
    }

    public final Object read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.skipValue();
            return null;
        }
        getNewDomainSuffix getnewdomainsuffix = new getNewDomainSuffix();
        Gson gson = this.length;
        SavedStateHandleController.AnonymousClass1 r3 = this.setMax;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            int min = r3.getMin(jsonReader);
            boolean z = jsonReader.peek() != JsonToken.NULL;
            if (min != 14) {
                if (min != 24) {
                    if (min != 27) {
                        if (min != 36) {
                            if (min != 101) {
                                if (min != 126) {
                                    if (min != 128) {
                                        jsonReader.skipValue();
                                    } else if (z) {
                                        getnewdomainsuffix.instId = jsonReader.peek() != JsonToken.BOOLEAN ? jsonReader.nextString() : Boolean.toString(jsonReader.nextBoolean());
                                    } else {
                                        getnewdomainsuffix.instId = null;
                                    }
                                } else if (z) {
                                    getnewdomainsuffix.scopes = jsonReader.peek() != JsonToken.BOOLEAN ? jsonReader.nextString() : Boolean.toString(jsonReader.nextBoolean());
                                } else {
                                    getnewdomainsuffix.scopes = null;
                                }
                            } else if (z) {
                                getnewdomainsuffix.billerName = jsonReader.peek() != JsonToken.BOOLEAN ? jsonReader.nextString() : Boolean.toString(jsonReader.nextBoolean());
                            } else {
                                getnewdomainsuffix.billerName = null;
                            }
                        } else if (z) {
                            getnewdomainsuffix.redirectUrl = jsonReader.peek() != JsonToken.BOOLEAN ? jsonReader.nextString() : Boolean.toString(jsonReader.nextBoolean());
                        } else {
                            getnewdomainsuffix.redirectUrl = null;
                        }
                    } else if (z) {
                        getnewdomainsuffix.agreed = gson.getAdapter(Boolean.class).read(jsonReader).booleanValue();
                    }
                } else if (z) {
                    getnewdomainsuffix.prefix = jsonReader.peek() != JsonToken.BOOLEAN ? jsonReader.nextString() : Boolean.toString(jsonReader.nextBoolean());
                } else {
                    getnewdomainsuffix.prefix = null;
                }
            } else if (z) {
                getnewdomainsuffix.clientId = jsonReader.peek() != JsonToken.BOOLEAN ? jsonReader.nextString() : Boolean.toString(jsonReader.nextBoolean());
            } else {
                getnewdomainsuffix.clientId = null;
            }
            jsonReader.nextNull();
        }
        jsonReader.endObject();
        return getnewdomainsuffix;
    }
}
