package o;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.List;
import o.SavedStateHandleController;

public final class setUrl extends TypeAdapter implements registerIn {
    private SavedStateHandleController.AnonymousClass1 getMin;
    private SavedStateHandleController length;
    private Gson setMin;

    public setUrl(Gson gson, SavedStateHandleController.AnonymousClass1 r2, SavedStateHandleController savedStateHandleController) {
        this.setMin = gson;
        this.getMin = r2;
        this.length = savedStateHandleController;
    }

    public final void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        inflateFromResource inflatefromresource = (inflateFromResource) obj;
        Gson gson = this.setMin;
        SavedStateHandleController savedStateHandleController = this.length;
        jsonWriter.beginObject();
        if (inflatefromresource != inflatefromresource.serviceKey) {
            savedStateHandleController.setMax(jsonWriter, 113);
            getLaunchParamsTag getlaunchparamstag = new getLaunchParamsTag();
            List<String> list = inflatefromresource.serviceKey;
            onActivityPrePaused.length(gson, getlaunchparamstag, list).write(jsonWriter, list);
        }
        if (inflatefromresource != inflatefromresource.prepaidKey) {
            savedStateHandleController.setMax(jsonWriter, 149);
            initColorModels initcolormodels = new initColorModels();
            List<String> list2 = inflatefromresource.prepaidKey;
            onActivityPrePaused.length(gson, initcolormodels, list2).write(jsonWriter, list2);
        }
        if (inflatefromresource != inflatefromresource.postpaidKey) {
            savedStateHandleController.setMax(jsonWriter, 44);
            setLaunchParamsTag setlaunchparamstag = new setLaunchParamsTag();
            List<String> list3 = inflatefromresource.postpaidKey;
            onActivityPrePaused.length(gson, setlaunchparamstag, list3).write(jsonWriter, list3);
        }
        if (inflatefromresource != inflatefromresource.backgroundColor) {
            savedStateHandleController.setMax(jsonWriter, 108);
            jsonWriter.value(inflatefromresource.backgroundColor);
        }
        if (inflatefromresource != inflatefromresource.title) {
            savedStateHandleController.setMax(jsonWriter, 11);
            jsonWriter.value(inflatefromresource.title);
        }
        if (inflatefromresource != inflatefromresource.icon) {
            savedStateHandleController.setMax(jsonWriter, 151);
            jsonWriter.value(inflatefromresource.icon);
        }
        if (inflatefromresource != inflatefromresource.buttonDescription) {
            savedStateHandleController.setMax(jsonWriter, 62);
            jsonWriter.value(inflatefromresource.buttonDescription);
        }
        if (inflatefromresource != inflatefromresource.serviceName) {
            savedStateHandleController.setMax(jsonWriter, 79);
            jsonWriter.value(inflatefromresource.serviceName);
        }
        if (inflatefromresource != inflatefromresource.link) {
            savedStateHandleController.setMax(jsonWriter, TsExtractor.TS_STREAM_TYPE_AC3);
            jsonWriter.value(inflatefromresource.link);
        }
        jsonWriter.endObject();
    }

    public final Object read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.skipValue();
            return null;
        }
        inflateFromResource inflatefromresource = new inflateFromResource();
        Gson gson = this.setMin;
        SavedStateHandleController.AnonymousClass1 r3 = this.getMin;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            int min = r3.getMin(jsonReader);
            boolean z = jsonReader.peek() != JsonToken.NULL;
            if (min != 3) {
                if (min != 19) {
                    if (min != 45) {
                        if (min != 75) {
                            if (min != 86) {
                                if (min != 100) {
                                    if (min != 136) {
                                        if (min != 154) {
                                            if (min != 164) {
                                                jsonReader.skipValue();
                                            } else if (z) {
                                                inflatefromresource.prepaidKey = (List) gson.getAdapter(new initColorModels()).read(jsonReader);
                                            } else {
                                                inflatefromresource.prepaidKey = null;
                                            }
                                        } else if (z) {
                                            inflatefromresource.link = jsonReader.peek() != JsonToken.BOOLEAN ? jsonReader.nextString() : Boolean.toString(jsonReader.nextBoolean());
                                        } else {
                                            inflatefromresource.link = null;
                                        }
                                    } else if (z) {
                                        inflatefromresource.buttonDescription = jsonReader.peek() != JsonToken.BOOLEAN ? jsonReader.nextString() : Boolean.toString(jsonReader.nextBoolean());
                                    } else {
                                        inflatefromresource.buttonDescription = null;
                                    }
                                } else if (z) {
                                    inflatefromresource.serviceKey = (List) gson.getAdapter(new getLaunchParamsTag()).read(jsonReader);
                                } else {
                                    inflatefromresource.serviceKey = null;
                                }
                            } else if (z) {
                                inflatefromresource.postpaidKey = (List) gson.getAdapter(new setLaunchParamsTag()).read(jsonReader);
                            } else {
                                inflatefromresource.postpaidKey = null;
                            }
                        } else if (z) {
                            inflatefromresource.backgroundColor = jsonReader.peek() != JsonToken.BOOLEAN ? jsonReader.nextString() : Boolean.toString(jsonReader.nextBoolean());
                        } else {
                            inflatefromresource.backgroundColor = null;
                        }
                    } else if (z) {
                        inflatefromresource.title = jsonReader.peek() != JsonToken.BOOLEAN ? jsonReader.nextString() : Boolean.toString(jsonReader.nextBoolean());
                    } else {
                        inflatefromresource.title = null;
                    }
                } else if (z) {
                    inflatefromresource.icon = jsonReader.peek() != JsonToken.BOOLEAN ? jsonReader.nextString() : Boolean.toString(jsonReader.nextBoolean());
                } else {
                    inflatefromresource.icon = null;
                }
            } else if (z) {
                inflatefromresource.serviceName = jsonReader.peek() != JsonToken.BOOLEAN ? jsonReader.nextString() : Boolean.toString(jsonReader.nextBoolean());
            } else {
                inflatefromresource.serviceName = null;
            }
            jsonReader.nextNull();
        }
        jsonReader.endObject();
        return inflatefromresource;
    }
}
