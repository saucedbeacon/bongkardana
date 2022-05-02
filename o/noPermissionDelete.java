package o;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import o.SavedStateHandleController;

public final class noPermissionDelete extends TypeAdapter implements registerIn {
    private Gson getMax;
    private SavedStateHandleController.AnonymousClass1 length;
    private SavedStateHandleController setMax;

    public noPermissionDelete(Gson gson, SavedStateHandleController.AnonymousClass1 r2, SavedStateHandleController savedStateHandleController) {
        this.getMax = gson;
        this.length = r2;
        this.setMax = savedStateHandleController;
    }

    public final void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        getExtension getextension = (getExtension) obj;
        SavedStateHandleController savedStateHandleController = this.setMax;
        jsonWriter.beginObject();
        if (getextension != getextension.key) {
            savedStateHandleController.setMax(jsonWriter, 35);
            jsonWriter.value(getextension.key);
        }
        if (getextension != getextension.title) {
            savedStateHandleController.setMax(jsonWriter, 11);
            jsonWriter.value(getextension.title);
        }
        if (getextension != getextension.subTitle) {
            savedStateHandleController.setMax(jsonWriter, 31);
            jsonWriter.value(getextension.subTitle);
        }
        if (getextension != getextension.action) {
            savedStateHandleController.setMax(jsonWriter, 17);
            jsonWriter.value(getextension.action);
        }
        if (getextension != getextension.redirectUrl) {
            savedStateHandleController.setMax(jsonWriter, 183);
            jsonWriter.value(getextension.redirectUrl);
        }
        savedStateHandleController.setMax(jsonWriter, 162);
        jsonWriter.value(getextension.promoActive);
        if (getextension != getextension.icon) {
            savedStateHandleController.setMax(jsonWriter, 151);
            jsonWriter.value(getextension.icon);
        }
        if (getextension != getextension.promoTitle) {
            savedStateHandleController.setMax(jsonWriter, 45);
            jsonWriter.value(getextension.promoTitle);
        }
        if (getextension != getextension.promoDesc) {
            savedStateHandleController.setMax(jsonWriter, 65);
            jsonWriter.value(getextension.promoDesc);
        }
        jsonWriter.endObject();
    }

    public final Object read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.skipValue();
            return null;
        }
        getExtension getextension = new getExtension();
        Gson gson = this.getMax;
        SavedStateHandleController.AnonymousClass1 r3 = this.length;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            int min = r3.getMin(jsonReader);
            boolean z = jsonReader.peek() != JsonToken.NULL;
            if (min != 2) {
                if (min != 17) {
                    if (min != 19) {
                        if (min != 30) {
                            if (min != 36) {
                                if (min != 45) {
                                    if (min != 79) {
                                        if (min != 150) {
                                            if (min != 186) {
                                                jsonReader.skipValue();
                                            } else if (z) {
                                                getextension.subTitle = jsonReader.peek() != JsonToken.BOOLEAN ? jsonReader.nextString() : Boolean.toString(jsonReader.nextBoolean());
                                            } else {
                                                getextension.subTitle = null;
                                            }
                                        } else if (z) {
                                            getextension.key = jsonReader.peek() != JsonToken.BOOLEAN ? jsonReader.nextString() : Boolean.toString(jsonReader.nextBoolean());
                                        } else {
                                            getextension.key = null;
                                        }
                                    } else if (z) {
                                        getextension.action = jsonReader.peek() != JsonToken.BOOLEAN ? jsonReader.nextString() : Boolean.toString(jsonReader.nextBoolean());
                                    } else {
                                        getextension.action = null;
                                    }
                                } else if (z) {
                                    getextension.title = jsonReader.peek() != JsonToken.BOOLEAN ? jsonReader.nextString() : Boolean.toString(jsonReader.nextBoolean());
                                } else {
                                    getextension.title = null;
                                }
                            } else if (z) {
                                getextension.redirectUrl = jsonReader.peek() != JsonToken.BOOLEAN ? jsonReader.nextString() : Boolean.toString(jsonReader.nextBoolean());
                            } else {
                                getextension.redirectUrl = null;
                            }
                        } else if (z) {
                            getextension.promoDesc = jsonReader.peek() != JsonToken.BOOLEAN ? jsonReader.nextString() : Boolean.toString(jsonReader.nextBoolean());
                        } else {
                            getextension.promoDesc = null;
                        }
                    } else if (z) {
                        getextension.icon = jsonReader.peek() != JsonToken.BOOLEAN ? jsonReader.nextString() : Boolean.toString(jsonReader.nextBoolean());
                    } else {
                        getextension.icon = null;
                    }
                } else if (z) {
                    getextension.promoTitle = jsonReader.peek() != JsonToken.BOOLEAN ? jsonReader.nextString() : Boolean.toString(jsonReader.nextBoolean());
                } else {
                    getextension.promoTitle = null;
                }
            } else if (z) {
                getextension.promoActive = gson.getAdapter(Boolean.class).read(jsonReader).booleanValue();
            }
            jsonReader.nextNull();
        }
        jsonReader.endObject();
        return getextension;
    }
}
