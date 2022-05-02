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
import io.split.android.client.service.sseclient.SseAuthenticationResponse;
import java.net.URI;
import java.util.Map;

public class ISecurityGuardPlugin implements HttpFetcher<SseAuthenticationResponse> {
    private final HttpClient mClient;
    private final showCenterToast mNetworkHelper;
    private HttpResponseParser<SseAuthenticationResponse> mResponseParser;
    private final URI mTarget;

    /* JADX WARNING: type inference failed for: r4v0, types: [io.split.android.client.service.http.HttpResponseParser<io.split.android.client.service.sseclient.SseAuthenticationResponse>, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ISecurityGuardPlugin(@androidx.annotation.NonNull io.split.android.client.network.HttpClient r1, @androidx.annotation.NonNull java.net.URI r2, @androidx.annotation.NonNull o.showCenterToast r3, @androidx.annotation.NonNull io.split.android.client.service.http.HttpResponseParser<io.split.android.client.service.sseclient.SseAuthenticationResponse> r4) {
        /*
            r0 = this;
            r0.<init>()
            java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r1)
            io.split.android.client.network.HttpClient r1 = (io.split.android.client.network.HttpClient) r1
            r0.mClient = r1
            java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r2)
            java.net.URI r1 = (java.net.URI) r1
            r0.mTarget = r1
            java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r3)
            o.showCenterToast r1 = (o.showCenterToast) r1
            r0.mNetworkHelper = r1
            java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r4)
            io.split.android.client.service.http.HttpResponseParser r1 = (io.split.android.client.service.http.HttpResponseParser) r1
            r0.mResponseParser = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ISecurityGuardPlugin.<init>(io.split.android.client.network.HttpClient, java.net.URI, o.showCenterToast, io.split.android.client.service.http.HttpResponseParser):void");
    }

    public SseAuthenticationResponse execute(@NonNull Map<String, Object> map, @Nullable Map<String, String> map2) throws HttpFetcherException {
        Preconditions.checkNotNull(map);
        try {
            if (this.mNetworkHelper.isReachable(this.mTarget)) {
                getByteArrayDDpEx getbytearrayddpex = new getByteArrayDDpEx(this.mTarget);
                for (Map.Entry next : map.entrySet()) {
                    Object value = next.getValue();
                    getbytearrayddpex.addParameter((String) next.getKey(), value != null ? value.toString() : "");
                }
                HttpResponse execute = this.mClient.request(getbytearrayddpex.build(), HttpMethod.GET).execute();
                if (execute.isSuccess()) {
                    SseAuthenticationResponse parse = this.mResponseParser.parse(execute.getData());
                    if (parse != null) {
                        return parse;
                    }
                    throw new IllegalStateException("Wrong data received from split changes server");
                } else if (execute.isClientRelatedError()) {
                    return new SseAuthenticationResponse(true);
                } else {
                    StringBuilder sb = new StringBuilder("http return code ");
                    sb.append(execute.getHttpStatus());
                    throw new IllegalStateException(sb.toString());
                }
            } else {
                throw new IllegalStateException("Source not reachable");
            }
        } catch (Exception e) {
            throw new HttpFetcherException(this.mTarget.toString(), e.getLocalizedMessage());
        }
    }
}
