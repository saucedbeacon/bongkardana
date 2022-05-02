package o;

import com.alipay.iap.android.wallet.acl.oauth.OAuthCodeFlowType;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import o.SavedStateHandleController;

public final class setSubtitleTextColor extends TypeAdapter implements registerIn {
    private Gson getMax;
    private SavedStateHandleController getMin;
    private SavedStateHandleController.AnonymousClass1 length;

    public setSubtitleTextColor(Gson gson, SavedStateHandleController.AnonymousClass1 r2, SavedStateHandleController savedStateHandleController) {
        this.getMax = gson;
        this.length = r2;
        this.getMin = savedStateHandleController;
    }

    public final void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
        } else {
            this.getMin.getMax(jsonWriter, obj == OAuthCodeFlowType.ALIPAY_CONNECT ? 168 : obj == OAuthCodeFlowType.LOCAL_MINI_PROGRAM ? 103 : obj == OAuthCodeFlowType.STANDARD ? 181 : -1);
        }
    }

    public final Object read(JsonReader jsonReader) throws IOException {
        int max = this.length.getMax(jsonReader);
        if (max == 54) {
            return OAuthCodeFlowType.LOCAL_MINI_PROGRAM;
        }
        if (max == 139) {
            return OAuthCodeFlowType.STANDARD;
        }
        if (max != 151) {
            return null;
        }
        return OAuthCodeFlowType.ALIPAY_CONNECT;
    }
}
