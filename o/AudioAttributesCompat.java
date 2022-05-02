package o;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.iap.ac.android.u.g;
import com.iap.ac.android.u.i;
import com.iap.ac.android.u.l;
import java.io.IOException;
import o.SavedStateHandleController;

public final class AudioAttributesCompat extends TypeAdapter implements registerIn {
    private SavedStateHandleController getMax;
    private SavedStateHandleController.AnonymousClass1 getMin;
    private Gson setMin;

    public final class AttributeContentType extends TypeAdapter implements registerIn {
        private SavedStateHandleController length;
        private SavedStateHandleController.AnonymousClass1 setMax;
        private Gson setMin;

        public AttributeContentType(Gson gson, SavedStateHandleController.AnonymousClass1 r2, SavedStateHandleController savedStateHandleController) {
            this.setMin = gson;
            this.setMax = r2;
            this.length = savedStateHandleController;
        }

        public final void write(JsonWriter jsonWriter, Object obj) throws IOException {
            if (obj == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            jsonWriter.endObject();
        }

        public final Object read(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.skipValue();
                return null;
            }
            l lVar = new l();
            l.getMin(jsonReader, this.setMax);
            return lVar;
        }
    }

    public final class AttributeUsage extends TypeAdapter implements registerIn {
        private SavedStateHandleController.AnonymousClass1 getMax;
        private Gson getMin;
        private SavedStateHandleController length;

        public AttributeUsage(Gson gson, SavedStateHandleController.AnonymousClass1 r2, SavedStateHandleController savedStateHandleController) {
            this.getMin = gson;
            this.getMax = r2;
            this.length = savedStateHandleController;
        }

        public final void write(JsonWriter jsonWriter, Object obj) throws IOException {
            if (obj == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            jsonWriter.endObject();
        }

        public final Object read(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.skipValue();
                return null;
            }
            i iVar = new i();
            i.setMin(jsonReader, this.getMax);
            return iVar;
        }
    }

    public AudioAttributesCompat(Gson gson, SavedStateHandleController.AnonymousClass1 r2, SavedStateHandleController savedStateHandleController) {
        this.setMin = gson;
        this.getMin = r2;
        this.getMax = savedStateHandleController;
    }

    public final void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.endObject();
    }

    public final Object read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.skipValue();
            return null;
        }
        g gVar = new g();
        g.setMax(jsonReader, this.getMin);
        return gVar;
    }
}
