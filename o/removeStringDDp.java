package o;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.common.base.Preconditions;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import io.split.android.client.network.HttpException;
import io.split.android.client.network.HttpMethod;
import io.split.android.client.network.HttpRequest;
import io.split.android.client.network.HttpResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URI;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import o.Draft_75;
import o.InvalidDataException;

public final class removeStringDDp implements HttpRequest {
    private static final translateRegularFrame JSON = translateRegularFrame.getMin("application/json; charset=utf-8");
    private String mBody;
    private Map<String, String> mHeaders;
    private HttpMethod mHttpMethod;
    private generateKey mOkHttpClient;
    private URI mUri;

    removeStringDDp(@NonNull generateKey generatekey, @NonNull URI uri, @NonNull HttpMethod httpMethod, @Nullable String str, @NonNull Map<String, String> map) {
        this.mOkHttpClient = (generateKey) Preconditions.checkNotNull(generatekey);
        this.mUri = (URI) Preconditions.checkNotNull(uri);
        this.mHttpMethod = (HttpMethod) Preconditions.checkNotNull(httpMethod);
        this.mBody = str;
        this.mHeaders = new HashMap((Map) Preconditions.checkNotNull(map));
    }

    /* renamed from: o.removeStringDDp$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$io$split$android$client$network$HttpMethod;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                io.split.android.client.network.HttpMethod[] r0 = io.split.android.client.network.HttpMethod.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$io$split$android$client$network$HttpMethod = r0
                io.split.android.client.network.HttpMethod r1 = io.split.android.client.network.HttpMethod.GET     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$io$split$android$client$network$HttpMethod     // Catch:{ NoSuchFieldError -> 0x001d }
                io.split.android.client.network.HttpMethod r1 = io.split.android.client.network.HttpMethod.POST     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o.removeStringDDp.AnonymousClass1.<clinit>():void");
        }
    }

    public final HttpResponse execute() throws HttpException {
        int i = AnonymousClass1.$SwitchMap$io$split$android$client$network$HttpMethod[this.mHttpMethod.ordinal()];
        if (i == 1) {
            return getRequest();
        }
        if (i == 2) {
            try {
                return postRequest();
            } catch (IOException e) {
                StringBuilder sb = new StringBuilder("Error serializing request body: ");
                sb.append(e.getLocalizedMessage());
                throw new HttpException(sb.toString());
            }
        } else {
            StringBuilder sb2 = new StringBuilder("Request HTTP Method not valid: ");
            sb2.append(this.mHttpMethod.name());
            throw new IllegalArgumentException(sb2.toString());
        }
    }

    private HttpResponse getRequest() throws HttpException {
        try {
            URL url = this.mUri.toURL();
            InvalidDataException.getMin getmin = new InvalidDataException.getMin();
            if (url != null) {
                Draft_76 min = Draft_76.getMin(url.toString());
                if (min != null) {
                    getmin.getMin = min;
                    addHeaders(getmin);
                    if (getmin.getMin != null) {
                        return buildResponse(FirebasePerfOkHttpClient.execute(IncompleteHandshakeException.setMax(this.mOkHttpClient, new InvalidDataException(getmin))));
                    }
                    throw new IllegalStateException("url == null");
                }
                throw new NullPointerException("url == null");
            }
            throw new NullPointerException("url == null");
        } catch (MalformedURLException e) {
            StringBuilder sb = new StringBuilder("URL is malformed: ");
            sb.append(e.getLocalizedMessage());
            throw new HttpException(sb.toString());
        } catch (ProtocolException e2) {
            StringBuilder sb2 = new StringBuilder("Http method not allowed: ");
            sb2.append(e2.getLocalizedMessage());
            throw new HttpException(sb2.toString());
        } catch (IOException e3) {
            StringBuilder sb3 = new StringBuilder("Something happened while retrieving data: ");
            sb3.append(e3.getLocalizedMessage());
            throw new HttpException(sb3.toString());
        }
    }

    private HttpResponse postRequest() throws IOException {
        if (this.mBody != null) {
            URL url = this.mUri.toURL();
            getPart length = getPart.length(JSON, this.mBody);
            InvalidDataException.getMin getmin = new InvalidDataException.getMin();
            if (url != null) {
                Draft_76 min = Draft_76.getMin(url.toString());
                if (min != null) {
                    getmin.getMin = min;
                    InvalidDataException.getMin length2 = getmin.length("POST", length);
                    addHeaders(length2);
                    if (length2.getMin != null) {
                        return buildResponse(FirebasePerfOkHttpClient.execute(IncompleteHandshakeException.setMax(this.mOkHttpClient, new InvalidDataException(length2))));
                    }
                    throw new IllegalStateException("url == null");
                }
                throw new NullPointerException("url == null");
            }
            throw new NullPointerException("url == null");
        }
        throw new IOException("Json data is null");
    }

    private void addHeaders(InvalidDataException.getMin getmin) {
        for (Map.Entry next : this.mHeaders.entrySet()) {
            String str = (String) next.getKey();
            String str2 = (String) next.getValue();
            Draft_75.length length = getmin.setMin;
            Draft_75.setMin(str);
            Draft_75.setMax(str2, str);
            length.getMax(str);
            length.setMin.add(str);
            length.setMin.add(str2.trim());
        }
    }

    private HttpResponse buildResponse(InvalidHandshakeException invalidHandshakeException) throws IOException {
        int i = invalidHandshakeException.getMax;
        if (i < 200 || i >= 300) {
            return new putStringDDp(i);
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(invalidHandshakeException.toFloatRange.getMax().setMin()));
        StringBuilder sb = new StringBuilder();
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                break;
            }
            sb.append(readLine);
        }
        bufferedReader.close();
        return new putStringDDp(i, sb.length() > 0 ? sb.toString() : null);
    }
}
