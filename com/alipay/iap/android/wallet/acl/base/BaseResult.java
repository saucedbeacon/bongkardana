package com.alipay.iap.android.wallet.acl.base;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.util.Map;
import o.SavedStateHandleController;
import o.getLogoDescription;
import o.onActivityPrePaused;

public class BaseResult implements Result {
    private Map<String, String> extendedInfo;
    private boolean hasError;
    private ResultError resultError;

    public final /* synthetic */ void length(Gson gson, JsonWriter jsonWriter, SavedStateHandleController savedStateHandleController) {
        savedStateHandleController.setMax(jsonWriter, 124);
        jsonWriter.value(this.hasError);
        if (this != this.extendedInfo) {
            savedStateHandleController.setMax(jsonWriter, 16);
            getLogoDescription getlogodescription = new getLogoDescription();
            Map<String, String> map = this.extendedInfo;
            onActivityPrePaused.length(gson, getlogodescription, map).write(jsonWriter, map);
        }
        if (this != this.resultError) {
            savedStateHandleController.setMax(jsonWriter, 165);
            ResultError resultError2 = this.resultError;
            onActivityPrePaused.setMin(gson, ResultError.class, resultError2).write(jsonWriter, resultError2);
        }
    }

    public final /* synthetic */ void setMin(Gson gson, JsonReader jsonReader, int i) {
        boolean z = jsonReader.peek() != JsonToken.NULL;
        if (i != 159) {
            if (i != 160) {
                if (i != 168) {
                    jsonReader.skipValue();
                } else if (z) {
                    this.resultError = gson.getAdapter(ResultError.class).read(jsonReader);
                } else {
                    this.resultError = null;
                    jsonReader.nextNull();
                }
            } else if (z) {
                this.hasError = gson.getAdapter(Boolean.class).read(jsonReader).booleanValue();
            } else {
                jsonReader.nextNull();
            }
        } else if (z) {
            this.extendedInfo = (Map) gson.getAdapter(new getLogoDescription()).read(jsonReader);
        } else {
            this.extendedInfo = null;
            jsonReader.nextNull();
        }
    }

    public boolean isHasError() {
        if (this.resultError == null) {
            return this.hasError;
        }
        return true;
    }

    public void setHasError(boolean z) {
        this.hasError = z;
    }

    public ResultError getResultError() {
        return this.resultError;
    }

    public void setResultError(ResultError resultError2) {
        this.resultError = resultError2;
        setHasError(true);
    }

    public void setHasError(boolean z, String str) {
        this.hasError = z;
        if (z) {
            getExtendedInfo().put("ERROR_CODE", str);
        }
    }

    public Map<String, String> getExtendedInfo() {
        return this.extendedInfo;
    }

    public void setExtendedInfo(Map<String, String> map) {
        this.extendedInfo = map;
    }
}
