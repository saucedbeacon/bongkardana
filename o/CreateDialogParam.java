package o;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.CookieManager;
import androidx.annotation.NonNull;
import com.alibaba.griver.api.common.network.HttpRequest;
import com.alibaba.griver.api.common.network.HttpResponse;
import com.alipay.iap.android.common.utils.MiscUtils;
import com.google.common.net.HttpHeaders;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.StandardCharsets;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class CreateDialogParam implements AgreementConfirmPoint {
    private static final String DEFAULT_CONTENT_TYPE = "application/x-www-form-urlencoded";
    private static final int DEFAULT_TIME_OUT = 30000;
    private static final String HEADER_CONTENT_TYPE = "Content-Type";
    private static final String TAG = CreateDialogParam.class.getName();
    private boolean enableCache;

    private boolean hasResponseBody(int i) {
        return (i < 200 || i == 204 || i == 304) ? false : true;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J'\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u00072\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u001f"}, d2 = {"Lid/dana/data/geocode/model/GeocodeReverseConfigResult;", "Ljava/io/Serializable;", "distanceInMeters", "", "intervalInHours", "", "shouldCallGoogleGeocodeAPI", "", "(Ljava/lang/String;JZ)V", "getDistanceInMeters", "()Ljava/lang/String;", "setDistanceInMeters", "(Ljava/lang/String;)V", "getIntervalInHours", "()J", "setIntervalInHours", "(J)V", "getShouldCallGoogleGeocodeAPI", "()Z", "setShouldCallGoogleGeocodeAPI", "(Z)V", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "", "toString", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
    public final class AgreementClickListener implements Serializable {
        @NotNull
        String distanceInMeters;
        long intervalInHours;
        boolean shouldCallGoogleGeocodeAPI;

        public AgreementClickListener() {
            this((String) null, 0, false, 7, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ AgreementClickListener copy$default(AgreementClickListener agreementClickListener, String str, long j, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = agreementClickListener.distanceInMeters;
            }
            if ((i & 2) != 0) {
                j = agreementClickListener.intervalInHours;
            }
            if ((i & 4) != 0) {
                z = agreementClickListener.shouldCallGoogleGeocodeAPI;
            }
            return agreementClickListener.copy(str, j, z);
        }

        @NotNull
        public final String component1() {
            return this.distanceInMeters;
        }

        public final long component2() {
            return this.intervalInHours;
        }

        public final boolean component3() {
            return this.shouldCallGoogleGeocodeAPI;
        }

        @NotNull
        public final AgreementClickListener copy(@NotNull String str, long j, boolean z) {
            Intrinsics.checkNotNullParameter(str, "distanceInMeters");
            return new AgreementClickListener(str, j, z);
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AgreementClickListener)) {
                return false;
            }
            AgreementClickListener agreementClickListener = (AgreementClickListener) obj;
            return Intrinsics.areEqual((Object) this.distanceInMeters, (Object) agreementClickListener.distanceInMeters) && this.intervalInHours == agreementClickListener.intervalInHours && this.shouldCallGoogleGeocodeAPI == agreementClickListener.shouldCallGoogleGeocodeAPI;
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("GeocodeReverseConfigResult(distanceInMeters=");
            sb.append(this.distanceInMeters);
            sb.append(", intervalInHours=");
            sb.append(this.intervalInHours);
            sb.append(", shouldCallGoogleGeocodeAPI=");
            sb.append(this.shouldCallGoogleGeocodeAPI);
            sb.append(")");
            return sb.toString();
        }

        public AgreementClickListener(@NotNull String str, long j, boolean z) {
            Intrinsics.checkNotNullParameter(str, "distanceInMeters");
            this.distanceInMeters = str;
            this.intervalInHours = j;
            this.shouldCallGoogleGeocodeAPI = z;
        }

        @NotNull
        public final String getDistanceInMeters() {
            return this.distanceInMeters;
        }

        public final void setDistanceInMeters(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.distanceInMeters = str;
        }

        public final long getIntervalInHours() {
            return this.intervalInHours;
        }

        public final void setIntervalInHours(long j) {
            this.intervalInHours = j;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AgreementClickListener(String str, long j, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? 0 : j, (i & 4) != 0 ? true : z);
        }

        public final boolean getShouldCallGoogleGeocodeAPI() {
            return this.shouldCallGoogleGeocodeAPI;
        }

        public final void setShouldCallGoogleGeocodeAPI(boolean z) {
            this.shouldCallGoogleGeocodeAPI = z;
        }

        public final int hashCode() {
            String str = this.distanceInMeters;
            int hashCode = (((str != null ? str.hashCode() : 0) * 31) + Long.valueOf(this.intervalInHours).hashCode()) * 31;
            boolean z = this.shouldCallGoogleGeocodeAPI;
            if (z) {
                z = true;
            }
            return hashCode + (z ? 1 : 0);
        }
    }

    public final class Agreement {
        @androidx.annotation.Nullable
        private static String getSignMd5Str(@NonNull Context context) {
            try {
                return MiscUtils.md5(context.getPackageManager().getPackageInfo(context.getPackageName(), 64).signatures[0].toByteArray());
            } catch (Exception unused) {
                return null;
            }
        }

        public static boolean isGooglePlaySignature(@NonNull Context context) {
            return "861d4dd28461268b3288f87aefdf275d".equalsIgnoreCase(getSignMd5Str(context));
        }
    }

    public CreateDialogParam() {
        this(false);
    }

    public CreateDialogParam(boolean z) {
        this.enableCache = z;
    }

    private static void setCookie(HttpURLConnection httpURLConnection) {
        try {
            CookieManager instance = CookieManager.getInstance();
            instance.setAcceptCookie(true);
            Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
            for (String next : headerFields.keySet()) {
                if (next != null && (next.equalsIgnoreCase(HttpHeaders.SET_COOKIE2) || next.equalsIgnoreCase("Set-Cookie"))) {
                    for (String str : headerFields.get(next)) {
                        String str2 = TAG;
                        StringBuilder sb = new StringBuilder("setCookie [headerKey:headerValue]= ");
                        sb.append(next);
                        sb.append("\t: ");
                        sb.append(str);
                        updateActionSheetContent.d(str2, sb.toString());
                        instance.setCookie(httpURLConnection.getURL().toString(), str);
                    }
                }
            }
        } catch (Exception e) {
            updateActionSheetContent.e(TAG, e.getMessage());
        }
    }

    private static void addHeaderCookie(String str, HttpURLConnection httpURLConnection) {
        String cookie = CookieManager.getInstance().getCookie(str);
        if (!TextUtils.isEmpty(cookie)) {
            httpURLConnection.addRequestProperty("Cookie", cookie);
        }
    }

    private static void addHeaderAcceptLanguage(HttpURLConnection httpURLConnection) {
        if (TextUtils.isEmpty(httpURLConnection.getRequestProperty("Accept-Language"))) {
            httpURLConnection.addRequestProperty("Accept-Language", getLanguage());
        }
    }

    private static void addHeader(Map<String, String> map, HttpURLConnection httpURLConnection) {
        if (map != null && !map.isEmpty()) {
            for (String next : map.keySet()) {
                if (TextUtils.isEmpty(httpURLConnection.getRequestProperty(next))) {
                    httpURLConnection.addRequestProperty(next, map.get(next));
                }
            }
        }
    }

    public static String getLanguage() {
        return Locale.getDefault().toString().endsWith("ID") ? "id_ID" : "en_US";
    }

    public HttpResponse performRequest(HttpRequest httpRequest) throws IOException, NoSuchAlgorithmException, KeyManagementException {
        int i;
        updateActionSheetContent.d(TAG, "performRequest request=".concat(String.valueOf(httpRequest)));
        HttpURLConnection openConnection = openConnection(new URL(httpRequest.getUrl()), httpRequest);
        addHeader(httpRequest.getHeaders(), openConnection);
        addHeaderCookie(httpRequest.getUrl(), openConnection);
        addHeaderAcceptLanguage(openConnection);
        setConnectionParametersForRequest(openConnection, httpRequest.getMethod(), new String(httpRequest.getRequestData()));
        HttpResponse httpResponse = new HttpResponse();
        try {
            i = openConnection.getResponseCode();
        } catch (IOException e) {
            updateActionSheetContent.d(TAG, e.getMessage());
            i = openConnection.getResponseCode();
        }
        if (i != -1) {
            httpResponse.setStatusCode(i);
            httpResponse.setHeaders(openConnection.getHeaderFields());
            if (hasResponseBody(i)) {
                httpResponse.setInputStream(getContent(openConnection));
            }
            setCookie(openConnection);
            updateActionSheetContent.d(TAG, "performRequest response=".concat(String.valueOf(httpResponse)));
            return httpResponse;
        }
        throw new IOException("Could not retrieve response code from HttpUrlConnection.");
    }

    private HttpURLConnection createConnection(URL url) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection()));
        httpURLConnection.setInstanceFollowRedirects(HttpURLConnection.getFollowRedirects());
        return httpURLConnection;
    }

    private HttpURLConnection openConnection(URL url, HttpRequest httpRequest) throws IOException, NoSuchAlgorithmException, KeyManagementException {
        HttpURLConnection createConnection = createConnection(url);
        if (httpRequest.getTimeout() < 0) {
            httpRequest.setTimeout(30000);
        }
        createConnection.setConnectTimeout(httpRequest.getTimeout() / 2);
        createConnection.setReadTimeout(httpRequest.getTimeout() / 2);
        createConnection.setUseCaches(this.enableCache);
        createConnection.setDefaultUseCaches(this.enableCache);
        createConnection.setDoInput(true);
        if ("https".equals(url.getProtocol())) {
            SSLContext instance = SSLContext.getInstance("TLS");
            instance.init((KeyManager[]) null, (TrustManager[]) null, (SecureRandom) null);
            ((HttpsURLConnection) createConnection).setSSLSocketFactory(instance.getSocketFactory());
        }
        return createConnection;
    }

    private void setConnectionParametersForRequest(HttpURLConnection httpURLConnection, String str, String str2) throws IOException {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "GET")) {
            httpURLConnection.setRequestMethod("GET");
        } else if (TextUtils.equals(str, "POST")) {
            httpURLConnection.setRequestMethod("POST");
            if (!TextUtils.isEmpty(str2)) {
                addBody(httpURLConnection, str2.getBytes(StandardCharsets.UTF_8));
            }
        }
    }

    private void addBody(HttpURLConnection httpURLConnection, byte[] bArr) throws IOException {
        httpURLConnection.setFixedLengthStreamingMode(bArr.length);
        httpURLConnection.setDoOutput(true);
        if (TextUtils.isEmpty(httpURLConnection.getRequestProperty("Content-Type"))) {
            httpURLConnection.addRequestProperty("Content-Type", "application/x-www-form-urlencoded");
        }
        DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
        dataOutputStream.write(bArr);
        dataOutputStream.close();
    }

    private InputStream getContent(HttpURLConnection httpURLConnection) throws IOException {
        try {
            return httpURLConnection.getInputStream();
        } catch (IOException unused) {
            return httpURLConnection.getErrorStream();
        }
    }
}
