package o;

import android.text.TextUtils;
import android.webkit.CookieManager;
import com.alibaba.griver.api.common.network.HttpRequest;
import com.alibaba.griver.api.common.network.HttpResponse;
import com.google.common.net.HttpHeaders;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import javax.inject.Inject;
import o.Draft_75;
import o.InvalidDataException;

public class getMessage implements AgreementConfirmPoint {
    private static final String DEFAULT_CONTENT_TYPE = "application/x-www-form-urlencoded";
    private static final String HEADER_CONTENT_TYPE = "Content-Type";
    private static final String TAG = getMessage.class.getName();
    private final generateKey okHttpClient;

    @Inject
    public getMessage(generateKey generatekey) {
        this.okHttpClient = generatekey;
    }

    public HttpResponse performRequest(HttpRequest httpRequest) throws Exception {
        Map<String, String> mergeHeader = mergeHeader(httpRequest);
        InvalidDataException.getMin getmin = new InvalidDataException.getMin();
        getmin.setMax(httpRequest.getUrl());
        addHeader(mergeHeader, getmin);
        addHeaderAcceptLanguage(mergeHeader, getmin);
        setParametersForRequest(httpRequest, mergeHeader, getmin);
        generateKey generatekey = this.okHttpClient;
        if (getmin.getMin != null) {
            InvalidHandshakeException execute = FirebasePerfOkHttpClient.execute(IncompleteHandshakeException.setMax(generatekey, new InvalidDataException(getmin)));
            setCookie(execute);
            HttpResponse transform = transform(execute);
            updateActionSheetContent.d(TAG, "performRequest response=".concat(String.valueOf(transform)));
            return transform;
        }
        throw new IllegalStateException("url == null");
    }

    private void addHeader(Map<String, String> map, InvalidDataException.getMin getmin) {
        for (String next : map.keySet()) {
            addHeader(next, map.get(next), getmin);
        }
    }

    private Map<String, String> mergeHeader(HttpRequest httpRequest) {
        HashMap hashMap = new HashMap();
        mergeHeader(httpRequest.getHeaders(), hashMap);
        return hashMap;
    }

    private void addHeaderAcceptLanguage(Map<String, String> map, InvalidDataException.getMin getmin) {
        if (TextUtils.isEmpty(map.get("Accept-Language"))) {
            addHeader("Accept-Language", getLanguage(), getmin);
        }
    }

    private void mergeHeader(Map<String, String> map, Map<String, String> map2) {
        if (map != null && !map.isEmpty()) {
            for (String next : map.keySet()) {
                if (TextUtils.isEmpty(map2.get(next))) {
                    mergeHeader(next, map.get(next), map2);
                }
            }
        }
    }

    private void mergeHeader(String str, String str2, Map<String, String> map) {
        if (str.equalsIgnoreCase("Content-Type")) {
            str = "Content-Type";
        } else if (str.equalsIgnoreCase(HttpHeaders.USER_AGENT)) {
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append(" okhttp/3.12.12");
            str2 = sb.toString();
        }
        map.put(str, str2);
    }

    private void addHeader(String str, String str2, InvalidDataException.getMin getmin) {
        if (!TextUtils.isEmpty(str)) {
            Draft_75.length length = getmin.setMin;
            Draft_75.setMin(str);
            Draft_75.setMax(str2, str);
            length.setMin.add(str);
            length.setMin.add(str2.trim());
        }
    }

    private String getLanguage() {
        return Locale.getDefault().toString().endsWith("ID") ? "id_ID" : "en_US";
    }

    private void setParametersForRequest(HttpRequest httpRequest, Map<String, String> map, InvalidDataException.getMin getmin) {
        if (TextUtils.isEmpty(httpRequest.getMethod()) || TextUtils.equals(httpRequest.getMethod(), "GET")) {
            getmin.length("GET", (getPart) null);
        } else if (TextUtils.equals(httpRequest.getMethod(), "POST")) {
            String str = map.get("Content-Type");
            if (TextUtils.isEmpty(str)) {
                str = "application/x-www-form-urlencoded";
            }
            getmin.length("POST", getPart.length(translateRegularFrame.length(str), new String(httpRequest.getRequestData())));
        }
    }

    private void setCookie(InvalidHandshakeException invalidHandshakeException) {
        CookieManager instance = CookieManager.getInstance();
        instance.setAcceptCookie(true);
        String length = invalidHandshakeException.toIntRange.length("Set-Cookie");
        String str = null;
        if (length == null) {
            length = null;
        }
        instance.setCookie(invalidHandshakeException.getMin.setMin.getMax().toString(), length);
        String length2 = invalidHandshakeException.toIntRange.length(HttpHeaders.SET_COOKIE2);
        if (length2 != null) {
            str = length2;
        }
        instance.setCookie(invalidHandshakeException.getMin.setMin.getMax().toString(), str);
    }

    private HttpResponse transform(InvalidHandshakeException invalidHandshakeException) {
        Draft_75 draft_75 = invalidHandshakeException.toIntRange;
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        int length = draft_75.length.length / 2;
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            String lowerCase = draft_75.length[i2].toLowerCase(Locale.US);
            List list = (List) treeMap.get(lowerCase);
            if (list == null) {
                list = new ArrayList(2);
                treeMap.put(lowerCase, list);
            }
            list.add(draft_75.length[i2 + 1]);
        }
        InputStream inputStream = null;
        if (invalidHandshakeException.toFloatRange != null) {
            inputStream = invalidHandshakeException.toFloatRange.getMax().setMin();
        }
        HttpResponse httpResponse = new HttpResponse();
        httpResponse.setHeaders(treeMap);
        httpResponse.setStatusCode(invalidHandshakeException.getMax);
        httpResponse.setInputStream(inputStream);
        return httpResponse;
    }
}
