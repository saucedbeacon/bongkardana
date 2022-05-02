package o;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.common.base.Preconditions;
import io.split.android.client.network.HttpClient;
import io.split.android.client.network.HttpMethod;
import io.split.android.client.network.HttpResponse;
import io.split.android.client.service.http.HttpFetcher;
import io.split.android.client.service.http.HttpFetcherException;
import io.split.android.client.service.http.HttpResponseParser;
import java.net.URI;
import java.util.Map;
import o.b;

public final class ILiteVMComponent<T> implements HttpFetcher<T> {
    private final HttpClient mClient;
    private getKeepAliveDuration mFetcherMetricsConfig;
    private b.a mMetrics;
    private final showCenterToast mNetworkHelper;
    private HttpResponseParser<T> mResponseParser;
    private final URI mTarget;

    public ILiteVMComponent(@NonNull HttpClient httpClient, @NonNull URI uri, @NonNull showCenterToast showcentertoast, @NonNull HttpResponseParser<T> httpResponseParser) {
        this(httpClient, uri, (b.a) null, (getKeepAliveDuration) null, showcentertoast, httpResponseParser);
    }

    public ILiteVMComponent(@NonNull HttpClient httpClient, @NonNull URI uri, b.a aVar, getKeepAliveDuration getkeepaliveduration, @NonNull showCenterToast showcentertoast, @NonNull HttpResponseParser<T> httpResponseParser) {
        this.mClient = (HttpClient) Preconditions.checkNotNull(httpClient);
        this.mTarget = (URI) Preconditions.checkNotNull(uri);
        this.mNetworkHelper = (showCenterToast) Preconditions.checkNotNull(showcentertoast);
        this.mResponseParser = (HttpResponseParser) Preconditions.checkNotNull(httpResponseParser);
        this.mMetrics = aVar;
        this.mFetcherMetricsConfig = getkeepaliveduration;
        if (aVar != null) {
            Preconditions.checkNotNull(getkeepaliveduration);
        }
    }

    /* JADX INFO: finally extract failed */
    public final T execute(@NonNull Map<String, Object> map, @Nullable Map<String, String> map2) throws HttpFetcherException {
        Preconditions.checkNotNull(map);
        long currentTimeMillis = System.currentTimeMillis();
        try {
            if (this.mNetworkHelper.isReachable(this.mTarget)) {
                getByteArrayDDpEx getbytearrayddpex = new getByteArrayDDpEx(this.mTarget);
                for (Map.Entry next : map.entrySet()) {
                    Object value = next.getValue();
                    getbytearrayddpex.addParameter((String) next.getKey(), value != null ? value.toString() : "");
                }
                URI build = getbytearrayddpex.build();
                HttpResponse execute = this.mClient.request(getbytearrayddpex.build(), HttpMethod.GET, (String) null, map2).execute();
                StringBuilder sb = new StringBuilder("Received from: ");
                sb.append(build.toString());
                sb.append(" -> ");
                sb.append(execute.getData());
                createLoadingDialog.d(sb.toString());
                if (!execute.isSuccess()) {
                    if (this.mMetrics != null) {
                        this.mMetrics.count(String.format(this.mFetcherMetricsConfig.getMax, new Object[]{Integer.valueOf(execute.getHttpStatus())}), 1);
                    }
                    StringBuilder sb2 = new StringBuilder("http return code ");
                    sb2.append(execute.getHttpStatus());
                    throw new IllegalStateException(sb2.toString());
                }
                T parse = this.mResponseParser.parse(execute.getData());
                if (parse != null) {
                    b.a aVar = this.mMetrics;
                    if (aVar != null) {
                        aVar.time(this.mFetcherMetricsConfig.length, System.currentTimeMillis() - currentTimeMillis);
                    }
                    return parse;
                }
                throw new IllegalStateException("Wrong data received from split changes server");
            }
            throw new IllegalStateException("Source not reachable");
        } catch (Exception e) {
            if (this.mMetrics != null) {
                this.mMetrics.count(this.mFetcherMetricsConfig.setMax, 1);
            }
            throw new HttpFetcherException(this.mTarget.toString(), e.getLocalizedMessage());
        } catch (Throwable th) {
            b.a aVar2 = this.mMetrics;
            if (aVar2 != null) {
                aVar2.time(this.mFetcherMetricsConfig.length, System.currentTimeMillis() - currentTimeMillis);
            }
            throw th;
        }
    }
}
