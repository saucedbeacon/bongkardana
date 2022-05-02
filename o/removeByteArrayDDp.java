package o;

import androidx.annotation.NonNull;
import com.google.common.base.Preconditions;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import io.split.android.client.network.HttpException;
import io.split.android.client.network.HttpStreamRequest;
import io.split.android.client.network.HttpStreamResponse;
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

public final class removeByteArrayDDp implements HttpStreamRequest {
    private static final translateRegularFrame JSON = translateRegularFrame.getMin("application/json; charset=utf-8");
    private Map<String, String> mHeaders;
    private generateKey mOkHttpClient;
    private InvalidHandshakeException mOkHttpResponse;
    private BufferedReader mResponseBufferedReader;
    private URI mUri;

    removeByteArrayDDp(@NonNull generateKey generatekey, @NonNull URI uri, @NonNull Map<String, String> map) {
        this.mOkHttpClient = (generateKey) Preconditions.checkNotNull(generatekey);
        this.mUri = (URI) Preconditions.checkNotNull(uri);
        this.mHeaders = new HashMap((Map) Preconditions.checkNotNull(map));
    }

    public final HttpStreamResponse execute() throws HttpException {
        return getRequest();
    }

    public final void addHeader(String str, String str2) {
        this.mHeaders.put(str, str2);
    }

    public final void close() {
        createLoadingDialog.d("Closing streaming connection");
        InvalidHandshakeException invalidHandshakeException = this.mOkHttpResponse;
        if (invalidHandshakeException != null) {
            if (invalidHandshakeException.toFloatRange != null) {
                try {
                    this.mOkHttpResponse.close();
                    this.mOkHttpResponse.toFloatRange.close();
                } catch (Exception e) {
                    StringBuilder sb = new StringBuilder("Unknown error closing streaming connection: ");
                    sb.append(e.getLocalizedMessage());
                    createLoadingDialog.d(sb.toString());
                }
            }
            BufferedReader bufferedReader = this.mResponseBufferedReader;
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException unused) {
                    createLoadingDialog.d("Buffer already closed");
                } catch (Exception e2) {
                    StringBuilder sb2 = new StringBuilder("Unknown error closing buffer: ");
                    sb2.append(e2.getLocalizedMessage());
                    createLoadingDialog.d(sb2.toString());
                }
            }
        }
    }

    private HttpStreamResponse getRequest() throws HttpException {
        try {
            URL url = this.mUri.toURL();
            InvalidDataException.getMin getmin = new InvalidDataException.getMin();
            if (url != null) {
                Draft_76 min = Draft_76.getMin(url.toString());
                if (min != null) {
                    getmin.getMin = min;
                    addHeaders(getmin);
                    if (getmin.getMin != null) {
                        InvalidHandshakeException execute = FirebasePerfOkHttpClient.execute(IncompleteHandshakeException.setMax(this.mOkHttpClient, new InvalidDataException(getmin)));
                        this.mOkHttpResponse = execute;
                        return buildResponse(execute);
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

    private HttpStreamResponse buildResponse(InvalidHandshakeException invalidHandshakeException) throws IOException {
        int i = invalidHandshakeException.getMax;
        if (i < 200 || i >= 300 || invalidHandshakeException.toFloatRange == null) {
            return new removeStringDDpEx(i);
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(invalidHandshakeException.toFloatRange.getMax().setMin()));
        this.mResponseBufferedReader = bufferedReader;
        return new removeStringDDpEx(i, bufferedReader);
    }
}
