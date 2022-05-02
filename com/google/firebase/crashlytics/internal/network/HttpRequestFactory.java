package com.google.firebase.crashlytics.internal.network;

import java.util.Collections;
import java.util.Map;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

public class HttpRequestFactory {
    public HttpGetRequest buildHttpGetRequest(String str) {
        int length = str != null ? str.length() : 0;
        int max = dispatchOnCancelled.setMax(length);
        if (length != max) {
            onCanceled oncanceled = new onCanceled(length, max, 1);
            onCancelLoad.setMax(205449142, oncanceled);
            onCancelLoad.getMin(205449142, oncanceled);
        }
        return buildHttpGetRequest(str, Collections.emptyMap());
    }

    public HttpGetRequest buildHttpGetRequest(String str, Map<String, String> map) {
        return new HttpGetRequest(str, map);
    }
}
