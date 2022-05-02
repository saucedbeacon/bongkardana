package o;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

public interface SavedStateHandleController {

    /* renamed from: o.SavedStateHandleController$1  reason: invalid class name */
    public interface AnonymousClass1 {
        int getMax(JsonReader jsonReader) throws IOException;

        int getMin(JsonReader jsonReader) throws IOException;
    }

    void getMax(JsonWriter jsonWriter, int i) throws IOException;

    void setMax(JsonWriter jsonWriter, int i) throws IOException;
}
