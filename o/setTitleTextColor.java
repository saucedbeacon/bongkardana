package o;

import com.alipay.iap.android.wallet.acl.oauth.OAuthResult;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Map;
import o.SavedStateHandleController;

public final class setTitleTextColor extends TypeAdapter implements registerIn {
    private Gson getMax;
    private SavedStateHandleController length;
    private SavedStateHandleController.AnonymousClass1 setMin;

    public setTitleTextColor(Gson gson, SavedStateHandleController.AnonymousClass1 r2, SavedStateHandleController savedStateHandleController) {
        this.getMax = gson;
        this.setMin = r2;
        this.length = savedStateHandleController;
    }

    public final void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        OAuthResult oAuthResult = (OAuthResult) obj;
        Gson gson = this.getMax;
        SavedStateHandleController savedStateHandleController = this.length;
        jsonWriter.beginObject();
        if (oAuthResult != oAuthResult.authCode) {
            savedStateHandleController.setMax(jsonWriter, 9);
            jsonWriter.value(oAuthResult.authCode);
        }
        if (oAuthResult != oAuthResult.authState) {
            savedStateHandleController.setMax(jsonWriter, 141);
            jsonWriter.value(oAuthResult.authState);
        }
        if (oAuthResult != oAuthResult.authErrorScopes) {
            savedStateHandleController.setMax(jsonWriter, 13);
            setSubtitleTextAppearance setsubtitletextappearance = new setSubtitleTextAppearance();
            Map<String, String> map = oAuthResult.authErrorScopes;
            onActivityPrePaused.length(gson, setsubtitletextappearance, map).write(jsonWriter, map);
        }
        if (oAuthResult != oAuthResult.authSuccessScopes) {
            savedStateHandleController.setMax(jsonWriter, 41);
            String[] strArr = oAuthResult.authSuccessScopes;
            onActivityPrePaused.setMin(gson, String[].class, strArr).write(jsonWriter, strArr);
        }
        if (oAuthResult != oAuthResult.authRedirectUrl) {
            savedStateHandleController.setMax(jsonWriter, 78);
            jsonWriter.value(oAuthResult.authRedirectUrl);
        }
        oAuthResult.length(gson, jsonWriter, savedStateHandleController);
        jsonWriter.endObject();
    }

    public final Object read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.skipValue();
            return null;
        }
        OAuthResult oAuthResult = new OAuthResult();
        Gson gson = this.getMax;
        SavedStateHandleController.AnonymousClass1 r3 = this.setMin;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            int min = r3.getMin(jsonReader);
            boolean z = jsonReader.peek() != JsonToken.NULL;
            if (min != 26) {
                if (min != 66) {
                    if (min != 72) {
                        if (min != 83) {
                            if (min != 94) {
                                oAuthResult.setMin(gson, jsonReader, min);
                            } else if (z) {
                                oAuthResult.authState = jsonReader.peek() != JsonToken.BOOLEAN ? jsonReader.nextString() : Boolean.toString(jsonReader.nextBoolean());
                            } else {
                                oAuthResult.authState = null;
                            }
                        } else if (z) {
                            oAuthResult.authErrorScopes = (Map) gson.getAdapter(new setSubtitleTextAppearance()).read(jsonReader);
                        } else {
                            oAuthResult.authErrorScopes = null;
                        }
                    } else if (z) {
                        oAuthResult.authCode = jsonReader.peek() != JsonToken.BOOLEAN ? jsonReader.nextString() : Boolean.toString(jsonReader.nextBoolean());
                    } else {
                        oAuthResult.authCode = null;
                    }
                } else if (z) {
                    oAuthResult.authSuccessScopes = gson.getAdapter(String[].class).read(jsonReader);
                } else {
                    oAuthResult.authSuccessScopes = null;
                }
            } else if (z) {
                oAuthResult.authRedirectUrl = jsonReader.peek() != JsonToken.BOOLEAN ? jsonReader.nextString() : Boolean.toString(jsonReader.nextBoolean());
            } else {
                oAuthResult.authRedirectUrl = null;
            }
            jsonReader.nextNull();
        }
        jsonReader.endObject();
        return oAuthResult;
    }
}
