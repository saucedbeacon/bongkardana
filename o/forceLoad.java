package o;

import android.util.JsonReader;
import com.alibaba.ariver.kernel.RVParams;
import java.io.IOException;
import java.io.StringReader;

final class forceLoad {
    public final float setMin;

    private forceLoad(float f) {
        this.setMin = f;
    }

    /* JADX INFO: finally extract failed */
    static forceLoad length(String str) throws IOException {
        JsonReader jsonReader = new JsonReader(new StringReader(str));
        try {
            jsonReader.beginObject();
            float f = 1.0f;
            while (jsonReader.hasNext()) {
                if (jsonReader.nextName().equals(RVParams.SHOW_REPORT_BTN)) {
                    f = (float) jsonReader.nextDouble();
                } else {
                    jsonReader.skipValue();
                }
            }
            jsonReader.endObject();
            jsonReader.close();
            return new forceLoad(f);
        } catch (Throwable th) {
            jsonReader.close();
            throw th;
        }
    }
}
