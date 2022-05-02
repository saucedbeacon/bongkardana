package o;

import com.alipay.iap.android.wallet.acl.base.BaseResult;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import o.SavedStateHandleController;

public final class collapseActionView extends TypeAdapter implements registerIn {
    private SavedStateHandleController.AnonymousClass1 getMin;
    private SavedStateHandleController length;
    private Gson setMin;

    public collapseActionView(Gson gson, SavedStateHandleController.AnonymousClass1 r2, SavedStateHandleController savedStateHandleController) {
        this.setMin = gson;
        this.getMin = r2;
        this.length = savedStateHandleController;
    }

    public final void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        Gson gson = this.setMin;
        SavedStateHandleController savedStateHandleController = this.length;
        jsonWriter.beginObject();
        ((BaseResult) obj).length(gson, jsonWriter, savedStateHandleController);
        jsonWriter.endObject();
    }

    public final Object read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.skipValue();
            return null;
        }
        BaseResult baseResult = new BaseResult();
        Gson gson = this.setMin;
        SavedStateHandleController.AnonymousClass1 r2 = this.getMin;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            baseResult.setMin(gson, jsonReader, r2.getMin(jsonReader));
        }
        jsonReader.endObject();
        return baseResult;
    }
}
