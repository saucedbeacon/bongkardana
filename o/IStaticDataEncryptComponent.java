package o;

import io.split.android.client.service.http.HttpFetcher;
import io.split.android.client.service.sseclient.InvalidJwtTokenException;
import io.split.android.client.service.sseclient.SseAuthenticationResponse;
import io.split.android.client.service.sseclient.SseJwtToken;
import java.util.HashMap;
import java.util.Map;

public class IStaticDataEncryptComponent {
    private static final String USER_KEY_PARAM = "users";
    private final HttpFetcher<SseAuthenticationResponse> mAuthFetcher;
    private final signWithToken mJwtParser;
    private final String mUserKey;

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, io.split.android.client.service.http.HttpFetcher<io.split.android.client.service.sseclient.SseAuthenticationResponse>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public IStaticDataEncryptComponent(@androidx.annotation.NonNull io.split.android.client.service.http.HttpFetcher<io.split.android.client.service.sseclient.SseAuthenticationResponse> r1, @androidx.annotation.NonNull java.lang.String r2, @androidx.annotation.NonNull o.signWithToken r3) {
        /*
            r0 = this;
            r0.<init>()
            java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r1)
            io.split.android.client.service.http.HttpFetcher r1 = (io.split.android.client.service.http.HttpFetcher) r1
            r0.mAuthFetcher = r1
            java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r2)
            java.lang.String r1 = (java.lang.String) r1
            r0.mUserKey = r1
            java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r3)
            o.signWithToken r1 = (o.signWithToken) r1
            r0.mJwtParser = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.IStaticDataEncryptComponent.<init>(io.split.android.client.service.http.HttpFetcher, java.lang.String, o.signWithToken):void");
    }

    public SecurityBodyDefine authenticate() {
        try {
            HashMap hashMap = new HashMap();
            hashMap.put(USER_KEY_PARAM, this.mUserKey);
            SseAuthenticationResponse execute = this.mAuthFetcher.execute(hashMap, (Map<String, String>) null);
            createLoadingDialog.d("SSE Authentication done, now parsing token");
            if (execute.isClientError()) {
                createLoadingDialog.d("Error while authenticating to streaming. Check your api key is correct.");
                return new SecurityBodyDefine(false, false, false, (SseJwtToken) null);
            } else if (!execute.isStreamingEnabled()) {
                createLoadingDialog.d("Streaming disabled for api key");
                return new SecurityBodyDefine(true, true, false, (SseJwtToken) null);
            } else {
                try {
                    return new SecurityBodyDefine(true, true, true, this.mJwtParser.parse(execute.getToken()));
                } catch (InvalidJwtTokenException unused) {
                    createLoadingDialog.e("Error while parsing Jwt");
                    return unexectedError();
                }
            }
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder("Unexpected ");
            sb.append(e.getLocalizedMessage());
            logError(sb.toString());
            return unexectedError();
        }
    }

    private void logError(String str) {
        createLoadingDialog.e("Error while authenticating to SSE server: ".concat(String.valueOf(str)));
    }

    private SecurityBodyDefine unexectedError() {
        return new SecurityBodyDefine(false, true);
    }
}
