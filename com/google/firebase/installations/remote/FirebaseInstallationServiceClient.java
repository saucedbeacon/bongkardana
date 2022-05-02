package com.google.firebase.installations.remote;

import android.content.Context;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import android.util.JsonReader;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.AndroidUtilsLight;
import com.google.android.gms.common.util.Hex;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.firebase.heartbeatinfo.HeartBeatInfo;
import com.google.firebase.inject.Provider;
import com.google.firebase.installations.FirebaseInstallationsException;
import com.google.firebase.installations.remote.InstallationResponse;
import com.google.firebase.installations.remote.TokenResult;
import com.google.firebase.platforminfo.UserAgentPublisher;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.regex.Pattern;
import kotlin.text.Typography;
import o.onActivityPostCreated;
import org.json.JSONException;
import org.json.JSONObject;

public class FirebaseInstallationServiceClient {
    private static final String ACCEPT_HEADER_KEY = "Accept";
    private static final String API_KEY_HEADER = "x-goog-api-key";
    private static final String CACHE_CONTROL_DIRECTIVE = "no-cache";
    private static final String CACHE_CONTROL_HEADER_KEY = "Cache-Control";
    private static final String CONTENT_ENCODING_HEADER_KEY = "Content-Encoding";
    private static final String CONTENT_TYPE_HEADER_KEY = "Content-Type";
    private static final String CREATE_REQUEST_RESOURCE_NAME_FORMAT = "projects/%s/installations";
    private static final String DELETE_REQUEST_RESOURCE_NAME_FORMAT = "projects/%s/installations/%s";
    private static final Pattern EXPIRATION_TIMESTAMP_PATTERN = Pattern.compile("[0-9]+s");
    private static final String FIREBASE_INSTALLATIONS_API_DOMAIN = "firebaseinstallations.googleapis.com";
    private static final String FIREBASE_INSTALLATIONS_API_VERSION = "v1";
    private static final String FIREBASE_INSTALLATIONS_ID_HEARTBEAT_TAG = "fire-installations-id";
    private static final String FIREBASE_INSTALLATION_AUTH_VERSION = "FIS_v2";
    private static final String FIS_TAG = "Firebase-Installations";
    private static final String GENERATE_AUTH_TOKEN_REQUEST_RESOURCE_NAME_FORMAT = "projects/%s/installations/%s/authTokens:generate";
    private static final String GZIP_CONTENT_ENCODING = "gzip";
    private static final String HEART_BEAT_HEADER = "x-firebase-client-log-type";
    private static final String JSON_CONTENT_TYPE = "application/json";
    private static final int MAX_RETRIES = 1;
    private static final int NETWORK_TIMEOUT_MILLIS = 10000;
    @VisibleForTesting
    static final String PARSING_EXPIRATION_TIME_ERROR_MESSAGE = "Invalid Expiration Timestamp.";
    private static final String SDK_VERSION_PREFIX = "a:";
    private static final int TRAFFIC_STATS_CREATE_INSTALLATION_TAG = 32769;
    private static final int TRAFFIC_STATS_DELETE_INSTALLATION_TAG = 32770;
    private static final int TRAFFIC_STATS_FIREBASE_INSTALLATIONS_TAG = 32768;
    private static final int TRAFFIC_STATS_GENERATE_AUTH_TOKEN_TAG = 32771;
    private static final String USER_AGENT_HEADER = "x-firebase-client";
    private static final Charset UTF_8 = Charset.forName(getMax(new char[]{59548, 25150, 37384, 63400, 65250, 59240}).intern());
    private static final String X_ANDROID_CERT_HEADER_KEY = "X-Android-Cert";
    private static final String X_ANDROID_IID_MIGRATION_KEY = "x-goog-fis-android-iid-migration-auth";
    private static final String X_ANDROID_PACKAGE_HEADER_KEY = "X-Android-Package";
    private static char getMax = '\u0000';
    private static int getMin = 0;
    private static int isInside = 1;
    private static char length;
    private static char setMax;
    private static char setMin;
    private final Context context;
    private final Provider<HeartBeatInfo> heartbeatInfo;
    private final RequestLimiter requestLimiter = new RequestLimiter();
    private boolean shouldServerErrorRetry;
    private final Provider<UserAgentPublisher> userAgentPublisher;

    static void getMin() {
        setMax = 14594;
        length = 44761;
        setMin = 20096;
        getMax = 54193;
    }

    private static void logBadConfigError() {
        int i = getMin + 17;
        isInside = i % 128;
        if ((i % 2 == 0 ? 13 : 'I') != 'I') {
            Object obj = null;
            super.hashCode();
        }
    }

    static {
        getMin();
        int i = getMin + 15;
        isInside = i % 128;
        int i2 = i % 2;
    }

    public FirebaseInstallationServiceClient(@NonNull Context context2, @NonNull Provider<UserAgentPublisher> provider, @NonNull Provider<HeartBeatInfo> provider2) {
        this.context = context2;
        this.userAgentPublisher = provider;
        this.heartbeatInfo = provider2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0040, code lost:
        if (r15 != null) goto L_0x005b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0059, code lost:
        if ((r15 != null ? '4' : '*') != '*') goto L_0x005b;
     */
    @androidx.annotation.NonNull
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.firebase.installations.remote.InstallationResponse createFirebaseInstallation(@androidx.annotation.NonNull java.lang.String r11, @androidx.annotation.Nullable java.lang.String r12, @androidx.annotation.NonNull java.lang.String r13, @androidx.annotation.NonNull java.lang.String r14, @androidx.annotation.Nullable java.lang.String r15) throws com.google.firebase.installations.FirebaseInstallationsException {
        /*
            r10 = this;
            com.google.firebase.installations.remote.RequestLimiter r0 = r10.requestLimiter
            boolean r0 = r0.isRequestAllowed()
            java.lang.String r1 = "Firebase Installations Service is unavailable. Please try again later."
            if (r0 == 0) goto L_0x0101
            r0 = 1
            java.lang.Object[] r2 = new java.lang.Object[r0]
            r3 = 0
            r2[r3] = r13
            java.lang.String r4 = "projects/%s/installations"
            java.lang.String r2 = java.lang.String.format(r4, r2)
            java.net.URL r2 = r10.getFullyQualifiedRequestUri(r2)
            r4 = 0
        L_0x001b:
            if (r4 > r0) goto L_0x001f
            r5 = 1
            goto L_0x0020
        L_0x001f:
            r5 = 0
        L_0x0020:
            if (r5 != r0) goto L_0x00f7
            int r5 = isInside     // Catch:{ Exception -> 0x00f5 }
            int r5 = r5 + 77
            int r6 = r5 % 128
            getMin = r6     // Catch:{ Exception -> 0x00f5 }
            int r5 = r5 % 2
            java.lang.String r6 = "POST"
            r7 = 32769(0x8001, float:4.5919E-41)
            if (r5 == 0) goto L_0x0043
            android.net.TrafficStats.setThreadStatsTag(r7)
            java.net.HttpURLConnection r5 = r10.openHttpURLConnection(r2, r11)
            r5.setRequestMethod(r6)     // Catch:{ IOException | AssertionError -> 0x00eb, all -> 0x00e3 }
            r5.setDoOutput(r3)     // Catch:{ IOException | AssertionError -> 0x00eb, all -> 0x00e3 }
            if (r15 == 0) goto L_0x0061
            goto L_0x005b
        L_0x0043:
            android.net.TrafficStats.setThreadStatsTag(r7)
            java.net.HttpURLConnection r5 = r10.openHttpURLConnection(r2, r11)
            r5.setRequestMethod(r6)     // Catch:{ IOException | AssertionError -> 0x00eb, all -> 0x00e3 }
            r5.setDoOutput(r0)     // Catch:{ IOException | AssertionError -> 0x00eb, all -> 0x00e3 }
            r6 = 42
            if (r15 == 0) goto L_0x0057
            r7 = 52
            goto L_0x0059
        L_0x0057:
            r7 = 42
        L_0x0059:
            if (r7 == r6) goto L_0x0061
        L_0x005b:
            java.lang.String r6 = "x-goog-fis-android-iid-migration-auth"
            r5.addRequestProperty(r6, r15)     // Catch:{ IOException | AssertionError -> 0x00eb, all -> 0x00e3 }
        L_0x0061:
            r10.writeFIDCreateRequestBodyToOutputStream(r5, r12, r14)     // Catch:{ IOException | AssertionError -> 0x00eb, all -> 0x00e3 }
            int r6 = r5.getResponseCode()     // Catch:{ IOException | AssertionError -> 0x00eb, all -> 0x00e3 }
            com.google.firebase.installations.remote.RequestLimiter r7 = r10.requestLimiter     // Catch:{ IOException | AssertionError -> 0x00eb, all -> 0x00e3 }
            r7.setNextRequestTime(r6)     // Catch:{ IOException | AssertionError -> 0x00eb, all -> 0x00e3 }
            boolean r7 = isSuccessfulResponseCode(r6)     // Catch:{ IOException | AssertionError -> 0x00eb, all -> 0x00e3 }
            r8 = 18
            r9 = 78
            if (r7 == 0) goto L_0x007a
            r7 = 18
            goto L_0x007c
        L_0x007a:
            r7 = 78
        L_0x007c:
            if (r7 == r9) goto L_0x0089
            com.google.firebase.installations.remote.InstallationResponse r11 = r10.readCreateResponse(r5)     // Catch:{ IOException | AssertionError -> 0x00eb, all -> 0x00e3 }
        L_0x0082:
            r5.disconnect()
            android.net.TrafficStats.clearThreadStatsTag()
            return r11
        L_0x0089:
            logFisCommunicationError(r5, r14, r11, r13)     // Catch:{ IOException | AssertionError -> 0x00eb, all -> 0x00e3 }
            r7 = 429(0x1ad, float:6.01E-43)
            if (r6 == r7) goto L_0x00d9
            r7 = 500(0x1f4, float:7.0E-43)
            r9 = 29
            if (r6 < r7) goto L_0x0097
            goto L_0x0099
        L_0x0097:
            r8 = 29
        L_0x0099:
            if (r8 == r9) goto L_0x00c7
            r7 = 600(0x258, float:8.41E-43)
            if (r6 >= r7) goto L_0x00c7
            int r6 = getMin
            int r6 = r6 + 57
            int r7 = r6 % 128
            isInside = r7
            int r6 = r6 % 2
            if (r6 != 0) goto L_0x00b6
            r5.disconnect()     // Catch:{ Exception -> 0x00f5 }
            android.net.TrafficStats.clearThreadStatsTag()     // Catch:{ Exception -> 0x00f5 }
            r5 = 0
            int r5 = r5.length     // Catch:{ all -> 0x00b4 }
            goto L_0x00bc
        L_0x00b4:
            r11 = move-exception
            throw r11
        L_0x00b6:
            r5.disconnect()
            android.net.TrafficStats.clearThreadStatsTag()
        L_0x00bc:
            int r5 = isInside
            int r5 = r5 + 61
            int r6 = r5 % 128
            getMin = r6
            int r5 = r5 % 2
            goto L_0x00f1
        L_0x00c7:
            logBadConfigError()     // Catch:{ IOException | AssertionError -> 0x00eb, all -> 0x00e3 }
            com.google.firebase.installations.remote.InstallationResponse$Builder r6 = com.google.firebase.installations.remote.InstallationResponse.builder()     // Catch:{ IOException | AssertionError -> 0x00eb, all -> 0x00e3 }
            com.google.firebase.installations.remote.InstallationResponse$ResponseCode r7 = com.google.firebase.installations.remote.InstallationResponse.ResponseCode.BAD_CONFIG     // Catch:{ IOException | AssertionError -> 0x00eb, all -> 0x00e3 }
            com.google.firebase.installations.remote.InstallationResponse$Builder r6 = r6.setResponseCode(r7)     // Catch:{ IOException | AssertionError -> 0x00eb, all -> 0x00e3 }
            com.google.firebase.installations.remote.InstallationResponse r11 = r6.build()     // Catch:{ IOException | AssertionError -> 0x00eb, all -> 0x00e3 }
            goto L_0x0082
        L_0x00d9:
            com.google.firebase.installations.FirebaseInstallationsException r6 = new com.google.firebase.installations.FirebaseInstallationsException     // Catch:{ IOException | AssertionError -> 0x00eb, all -> 0x00e3 }
            java.lang.String r7 = "Firebase servers have received too many requests from this client in a short period of time. Please try again later."
            com.google.firebase.installations.FirebaseInstallationsException$Status r8 = com.google.firebase.installations.FirebaseInstallationsException.Status.TOO_MANY_REQUESTS     // Catch:{ IOException | AssertionError -> 0x00eb, all -> 0x00e3 }
            r6.<init>(r7, r8)     // Catch:{ IOException | AssertionError -> 0x00eb, all -> 0x00e3 }
            throw r6     // Catch:{ IOException | AssertionError -> 0x00eb, all -> 0x00e3 }
        L_0x00e3:
            r11 = move-exception
            r5.disconnect()
            android.net.TrafficStats.clearThreadStatsTag()
            throw r11
        L_0x00eb:
            r5.disconnect()
            android.net.TrafficStats.clearThreadStatsTag()
        L_0x00f1:
            int r4 = r4 + 1
            goto L_0x001b
        L_0x00f5:
            r11 = move-exception
            throw r11
        L_0x00f7:
            com.google.firebase.installations.FirebaseInstallationsException r11 = new com.google.firebase.installations.FirebaseInstallationsException
            com.google.firebase.installations.FirebaseInstallationsException$Status r12 = com.google.firebase.installations.FirebaseInstallationsException.Status.UNAVAILABLE     // Catch:{ Exception -> 0x00ff }
            r11.<init>(r1, r12)
            throw r11
        L_0x00ff:
            r11 = move-exception
            throw r11
        L_0x0101:
            com.google.firebase.installations.FirebaseInstallationsException r11 = new com.google.firebase.installations.FirebaseInstallationsException
            com.google.firebase.installations.FirebaseInstallationsException$Status r12 = com.google.firebase.installations.FirebaseInstallationsException.Status.UNAVAILABLE
            r11.<init>(r1, r12)
            goto L_0x010a
        L_0x0109:
            throw r11
        L_0x010a:
            goto L_0x0109
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.installations.remote.FirebaseInstallationServiceClient.createFirebaseInstallation(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):com.google.firebase.installations.remote.InstallationResponse");
    }

    private void writeFIDCreateRequestBodyToOutputStream(HttpURLConnection httpURLConnection, @Nullable String str, @NonNull String str2) throws IOException {
        int i = getMin + 103;
        isInside = i % 128;
        if ((i % 2 == 0 ? Typography.dollar : '6') != '6') {
            try {
                writeRequestBodyToOutputStream(httpURLConnection, getJsonBytes(buildCreateFirebaseInstallationRequestBody(str, str2)));
                int i2 = 76 / 0;
            } catch (Exception e) {
                throw e;
            }
        } else {
            writeRequestBodyToOutputStream(httpURLConnection, getJsonBytes(buildCreateFirebaseInstallationRequestBody(str, str2)));
        }
    }

    private static byte[] getJsonBytes(JSONObject jSONObject) throws IOException {
        int i = isInside + 125;
        getMin = i % 128;
        int i2 = i % 2;
        byte[] bytes = jSONObject.toString().getBytes(getMax(new char[]{59548, 25150, 37384, 63400, 65250, 59240}).intern());
        int i3 = isInside + 107;
        getMin = i3 % 128;
        if (!(i3 % 2 != 0)) {
            return bytes;
        }
        Object[] objArr = null;
        int length2 = objArr.length;
        return bytes;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0024, code lost:
        if (r3 != null) goto L_0x0026;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x005a, code lost:
        throw new java.io.IOException("Cannot send request to FIS servers. No OutputStream available.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        if (r3 != null) goto L_0x0026;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void writeRequestBodyToOutputStream(java.net.URLConnection r3, byte[] r4) throws java.io.IOException {
        /*
            int r0 = isInside
            int r0 = r0 + 71
            int r1 = r0 % 128
            getMin = r1
            int r0 = r0 % 2
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0010
            r0 = 0
            goto L_0x0011
        L_0x0010:
            r0 = 1
        L_0x0011:
            if (r0 == 0) goto L_0x001c
            java.io.OutputStream r3 = r3.getOutputStream()     // Catch:{ Exception -> 0x001a }
            if (r3 == 0) goto L_0x0053
            goto L_0x0026
        L_0x001a:
            r3 = move-exception
            goto L_0x005b
        L_0x001c:
            java.io.OutputStream r3 = r3.getOutputStream()
            r0 = 0
            super.hashCode()     // Catch:{ all -> 0x005c }
            if (r3 == 0) goto L_0x0053
        L_0x0026:
            java.util.zip.GZIPOutputStream r0 = new java.util.zip.GZIPOutputStream
            r0.<init>(r3)
            r0.write(r4)     // Catch:{ all -> 0x004b }
            r0.close()     // Catch:{ IOException -> 0x004a }
            r3.close()     // Catch:{ IOException -> 0x004a }
            int r3 = getMin
            int r3 = r3 + 117
            int r4 = r3 % 128
            isInside = r4
            int r3 = r3 % 2
            if (r3 != 0) goto L_0x0041
            r1 = 0
        L_0x0041:
            if (r1 == 0) goto L_0x0044
            return
        L_0x0044:
            r3 = 69
            int r3 = r3 / r2
            return
        L_0x0048:
            r3 = move-exception
            throw r3
        L_0x004a:
            return
        L_0x004b:
            r4 = move-exception
            r0.close()     // Catch:{ IOException -> 0x0052 }
            r3.close()     // Catch:{ IOException -> 0x0052 }
        L_0x0052:
            throw r4
        L_0x0053:
            java.io.IOException r3 = new java.io.IOException
            java.lang.String r4 = "Cannot send request to FIS servers. No OutputStream available."
            r3.<init>(r4)     // Catch:{ Exception -> 0x001a }
            throw r3     // Catch:{ Exception -> 0x001a }
        L_0x005b:
            throw r3
        L_0x005c:
            r3 = move-exception
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.installations.remote.FirebaseInstallationServiceClient.writeRequestBodyToOutputStream(java.net.URLConnection, byte[]):void");
    }

    private static JSONObject buildCreateFirebaseInstallationRequestBody(@Nullable String str, @NonNull String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("fid", str);
            jSONObject.put("appId", str2);
            jSONObject.put("authVersion", FIREBASE_INSTALLATION_AUTH_VERSION);
            jSONObject.put("sdkVersion", "a:17.0.0");
            int i = isInside + 39;
            getMin = i % 128;
            if ((i % 2 != 0 ? '[' : '*') == '*') {
                return jSONObject;
            }
            int i2 = 25 / 0;
            return jSONObject;
        } catch (JSONException e) {
            throw new IllegalStateException(e);
        }
    }

    private void writeGenerateAuthTokenRequestBodyToOutputStream(HttpURLConnection httpURLConnection) throws IOException {
        int i = isInside + 49;
        getMin = i % 128;
        if ((i % 2 != 0 ? 'Y' : 27) != 27) {
            writeRequestBodyToOutputStream(httpURLConnection, getJsonBytes(buildGenerateAuthTokenRequestBody()));
            Object obj = null;
            super.hashCode();
            return;
        }
        writeRequestBodyToOutputStream(httpURLConnection, getJsonBytes(buildGenerateAuthTokenRequestBody()));
    }

    private static JSONObject buildGenerateAuthTokenRequestBody() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("sdkVersion", "a:17.0.0");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("installation", jSONObject);
            int i = getMin + 65;
            isInside = i % 128;
            int i2 = i % 2;
            return jSONObject2;
        } catch (JSONException e) {
            throw new IllegalStateException(e);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0090, code lost:
        if ((r5 >= 600) == false) goto L_0x0092;
     */
    @androidx.annotation.NonNull
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void deleteFirebaseInstallation(@androidx.annotation.NonNull java.lang.String r10, @androidx.annotation.NonNull java.lang.String r11, @androidx.annotation.NonNull java.lang.String r12, @androidx.annotation.NonNull java.lang.String r13) throws com.google.firebase.installations.FirebaseInstallationsException {
        /*
            r9 = this;
            int r0 = isInside
            int r0 = r0 + 3
            int r1 = r0 % 128
            getMin = r1
            r1 = 2
            int r0 = r0 % r1
            java.lang.Object[] r0 = new java.lang.Object[r1]
            r2 = 0
            r0[r2] = r12
            r3 = 1
            r0[r3] = r11
            java.lang.String r11 = "projects/%s/installations/%s"
            java.lang.String r11 = java.lang.String.format(r11, r0)
            java.net.URL r11 = r9.getFullyQualifiedRequestUri(r11)
            r0 = 0
        L_0x001d:
            if (r0 > r3) goto L_0x00c1
            int r4 = isInside
            int r4 = r4 + 49
            int r5 = r4 % 128
            getMin = r5
            int r4 = r4 % r1
            r4 = 32770(0x8002, float:4.592E-41)
            android.net.TrafficStats.setThreadStatsTag(r4)
            java.net.HttpURLConnection r4 = r9.openHttpURLConnection(r11, r10)
            java.lang.String r5 = "DELETE"
            r4.setRequestMethod(r5)     // Catch:{ IOException -> 0x00b7, all -> 0x00af }
            java.lang.String r5 = "Authorization"
            java.lang.String r6 = "FIS_v2 "
            java.lang.String r7 = java.lang.String.valueOf(r13)     // Catch:{ IOException -> 0x00b7, all -> 0x00af }
            java.lang.String r6 = r6.concat(r7)     // Catch:{ IOException -> 0x00b7, all -> 0x00af }
            r4.addRequestProperty(r5, r6)     // Catch:{ IOException -> 0x00b7, all -> 0x00af }
            int r5 = r4.getResponseCode()     // Catch:{ IOException -> 0x00b7, all -> 0x00af }
            r6 = 200(0xc8, float:2.8E-43)
            if (r5 == r6) goto L_0x0050
            r6 = 0
            goto L_0x0051
        L_0x0050:
            r6 = 1
        L_0x0051:
            if (r6 == 0) goto L_0x0054
            goto L_0x00a8
        L_0x0054:
            r6 = 401(0x191, float:5.62E-43)
            if (r5 == r6) goto L_0x005a
            r6 = 0
            goto L_0x005b
        L_0x005a:
            r6 = 1
        L_0x005b:
            if (r6 == 0) goto L_0x005e
            goto L_0x00a8
        L_0x005e:
            r6 = 404(0x194, float:5.66E-43)
            r7 = 69
            if (r5 != r6) goto L_0x0067
            r6 = 69
            goto L_0x0069
        L_0x0067:
            r6 = 38
        L_0x0069:
            if (r6 == r7) goto L_0x00a8
            r6 = 0
            logFisCommunicationError(r4, r6, r10, r12)     // Catch:{ IOException -> 0x00b7, all -> 0x00af }
            r6 = 429(0x1ad, float:6.01E-43)
            r8 = 25
            if (r5 == r6) goto L_0x0078
            r6 = 25
            goto L_0x007a
        L_0x0078:
            r6 = 47
        L_0x007a:
            if (r6 == r8) goto L_0x007d
            goto L_0x0092
        L_0x007d:
            int r6 = isInside
            int r6 = r6 + r7
            int r7 = r6 % 128
            getMin = r7
            int r6 = r6 % r1
            r6 = 500(0x1f4, float:7.0E-43)
            if (r5 < r6) goto L_0x009b
            r6 = 600(0x258, float:8.41E-43)
            if (r5 >= r6) goto L_0x008f
            r5 = 0
            goto L_0x0090
        L_0x008f:
            r5 = 1
        L_0x0090:
            if (r5 != 0) goto L_0x009b
        L_0x0092:
            int r0 = r0 + 1
            r4.disconnect()     // Catch:{ Exception -> 0x00cb }
            android.net.TrafficStats.clearThreadStatsTag()     // Catch:{ Exception -> 0x00cd }
            goto L_0x001d
        L_0x009b:
            logBadConfigError()     // Catch:{ IOException -> 0x00b7, all -> 0x00af }
            com.google.firebase.installations.FirebaseInstallationsException r5 = new com.google.firebase.installations.FirebaseInstallationsException     // Catch:{ IOException -> 0x00b7, all -> 0x00af }
            java.lang.String r6 = "Bad config while trying to delete FID"
            com.google.firebase.installations.FirebaseInstallationsException$Status r7 = com.google.firebase.installations.FirebaseInstallationsException.Status.BAD_CONFIG     // Catch:{ IOException -> 0x00b7, all -> 0x00af }
            r5.<init>(r6, r7)     // Catch:{ IOException -> 0x00b7, all -> 0x00af }
            throw r5     // Catch:{ IOException -> 0x00b7, all -> 0x00af }
        L_0x00a8:
            r4.disconnect()
            android.net.TrafficStats.clearThreadStatsTag()
            return
        L_0x00af:
            r10 = move-exception
            r4.disconnect()
            android.net.TrafficStats.clearThreadStatsTag()
            throw r10
        L_0x00b7:
            int r0 = r0 + 1
            r4.disconnect()
            android.net.TrafficStats.clearThreadStatsTag()
            goto L_0x001d
        L_0x00c1:
            com.google.firebase.installations.FirebaseInstallationsException r10 = new com.google.firebase.installations.FirebaseInstallationsException
            java.lang.String r11 = "Firebase Installations Service is unavailable. Please try again later."
            com.google.firebase.installations.FirebaseInstallationsException$Status r12 = com.google.firebase.installations.FirebaseInstallationsException.Status.UNAVAILABLE     // Catch:{ Exception -> 0x00cb }
            r10.<init>(r11, r12)
            throw r10
        L_0x00cb:
            r10 = move-exception
            throw r10
        L_0x00cd:
            r10 = move-exception
            goto L_0x00d0
        L_0x00cf:
            throw r10
        L_0x00d0:
            goto L_0x00cf
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.installations.remote.FirebaseInstallationServiceClient.deleteFirebaseInstallation(java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }

    private URL getFullyQualifiedRequestUri(String str) throws FirebaseInstallationsException {
        try {
            boolean z = false;
            URL url = new URL(String.format("https://%s/%s/%s", new Object[]{FIREBASE_INSTALLATIONS_API_DOMAIN, FIREBASE_INSTALLATIONS_API_VERSION, str}));
            int i = getMin + 41;
            isInside = i % 128;
            if (i % 2 != 0) {
                z = true;
            }
            if (z) {
                return url;
            }
            Object[] objArr = null;
            int length2 = objArr.length;
            return url;
        } catch (MalformedURLException e) {
            throw new FirebaseInstallationsException(e.getMessage(), FirebaseInstallationsException.Status.UNAVAILABLE);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0066, code lost:
        r5.disconnect();
        android.net.TrafficStats.clearThreadStatsTag();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x006c, code lost:
        return r10;
     */
    @androidx.annotation.NonNull
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.firebase.installations.remote.TokenResult generateAuthToken(@androidx.annotation.NonNull java.lang.String r10, @androidx.annotation.NonNull java.lang.String r11, @androidx.annotation.NonNull java.lang.String r12, @androidx.annotation.NonNull java.lang.String r13) throws com.google.firebase.installations.FirebaseInstallationsException {
        /*
            r9 = this;
            com.google.firebase.installations.remote.RequestLimiter r0 = r9.requestLimiter
            boolean r0 = r0.isRequestAllowed()
            java.lang.String r1 = "Firebase Installations Service is unavailable. Please try again later."
            if (r0 == 0) goto L_0x00ff
            r0 = 2
            java.lang.Object[] r2 = new java.lang.Object[r0]
            r3 = 0
            r2[r3] = r12
            r4 = 1
            r2[r4] = r11
            java.lang.String r11 = "projects/%s/installations/%s/authTokens:generate"
            java.lang.String r11 = java.lang.String.format(r11, r2)
            java.net.URL r11 = r9.getFullyQualifiedRequestUri(r11)
            r2 = 0
        L_0x001e:
            if (r2 > r4) goto L_0x0022
            r5 = 0
            goto L_0x0023
        L_0x0022:
            r5 = 1
        L_0x0023:
            if (r5 == r4) goto L_0x00f7
            int r5 = isInside     // Catch:{ Exception -> 0x00f5 }
            int r5 = r5 + 115
            int r6 = r5 % 128
            getMin = r6     // Catch:{ Exception -> 0x00f5 }
            int r5 = r5 % 2
            r5 = 32771(0x8003, float:4.5922E-41)
            android.net.TrafficStats.setThreadStatsTag(r5)     // Catch:{ Exception -> 0x00f3 }
            java.net.HttpURLConnection r5 = r9.openHttpURLConnection(r11, r10)     // Catch:{ Exception -> 0x00f3 }
            java.lang.String r6 = "POST"
            r5.setRequestMethod(r6)     // Catch:{ IOException | AssertionError -> 0x00e9, all -> 0x00e1 }
            java.lang.String r6 = "Authorization"
            java.lang.String r7 = "FIS_v2 "
            java.lang.String r8 = java.lang.String.valueOf(r13)     // Catch:{ IOException | AssertionError -> 0x00e9, all -> 0x00e1 }
            java.lang.String r7 = r7.concat(r8)     // Catch:{ IOException | AssertionError -> 0x00e9, all -> 0x00e1 }
            r5.addRequestProperty(r6, r7)     // Catch:{ IOException | AssertionError -> 0x00e9, all -> 0x00e1 }
            r5.setDoOutput(r4)     // Catch:{ IOException | AssertionError -> 0x00e9, all -> 0x00e1 }
            r9.writeGenerateAuthTokenRequestBodyToOutputStream(r5)     // Catch:{ IOException | AssertionError -> 0x00e9, all -> 0x00e1 }
            int r6 = r5.getResponseCode()     // Catch:{ IOException | AssertionError -> 0x00e9, all -> 0x00e1 }
            com.google.firebase.installations.remote.RequestLimiter r7 = r9.requestLimiter     // Catch:{ IOException | AssertionError -> 0x00e9, all -> 0x00e1 }
            r7.setNextRequestTime(r6)     // Catch:{ IOException | AssertionError -> 0x00e9, all -> 0x00e1 }
            boolean r7 = isSuccessfulResponseCode(r6)     // Catch:{ IOException | AssertionError -> 0x00e9, all -> 0x00e1 }
            if (r7 == 0) goto L_0x006d
            com.google.firebase.installations.remote.TokenResult r10 = r9.readGenerateAuthTokenResponse(r5)     // Catch:{ IOException | AssertionError -> 0x00e9, all -> 0x00e1 }
        L_0x0066:
            r5.disconnect()
            android.net.TrafficStats.clearThreadStatsTag()
            return r10
        L_0x006d:
            r7 = 0
            logFisCommunicationError(r5, r7, r10, r12)     // Catch:{ IOException | AssertionError -> 0x00e9, all -> 0x00e1 }
            r7 = 401(0x191, float:5.62E-43)
            if (r6 == r7) goto L_0x00c3
            int r7 = isInside
            int r7 = r7 + 11
            int r8 = r7 % 128
            getMin = r8
            int r7 = r7 % r0
            r7 = 404(0x194, float:5.66E-43)
            r8 = 57
            if (r6 != r7) goto L_0x0087
            r7 = 16
            goto L_0x0089
        L_0x0087:
            r7 = 57
        L_0x0089:
            if (r7 == r8) goto L_0x008c
            goto L_0x00c3
        L_0x008c:
            r7 = 429(0x1ad, float:6.01E-43)
            if (r6 == r7) goto L_0x00b9
            r7 = 500(0x1f4, float:7.0E-43)
            if (r6 < r7) goto L_0x00a7
            r7 = 600(0x258, float:8.41E-43)
            if (r6 >= r7) goto L_0x009a
            r6 = 0
            goto L_0x009b
        L_0x009a:
            r6 = 1
        L_0x009b:
            if (r6 == r4) goto L_0x00a7
            int r6 = isInside
            int r6 = r6 + 83
            int r7 = r6 % 128
            getMin = r7
            int r6 = r6 % r0
            goto L_0x00e9
        L_0x00a7:
            logBadConfigError()     // Catch:{ IOException | AssertionError -> 0x00e9, all -> 0x00e1 }
            com.google.firebase.installations.remote.TokenResult$Builder r6 = com.google.firebase.installations.remote.TokenResult.builder()     // Catch:{ IOException | AssertionError -> 0x00e9, all -> 0x00e1 }
            com.google.firebase.installations.remote.TokenResult$ResponseCode r7 = com.google.firebase.installations.remote.TokenResult.ResponseCode.BAD_CONFIG     // Catch:{ IOException | AssertionError -> 0x00e9, all -> 0x00e1 }
            com.google.firebase.installations.remote.TokenResult$Builder r6 = r6.setResponseCode(r7)     // Catch:{ IOException | AssertionError -> 0x00e9, all -> 0x00e1 }
            com.google.firebase.installations.remote.TokenResult r10 = r6.build()     // Catch:{ IOException | AssertionError -> 0x00e9, all -> 0x00e1 }
            goto L_0x0066
        L_0x00b9:
            com.google.firebase.installations.FirebaseInstallationsException r6 = new com.google.firebase.installations.FirebaseInstallationsException     // Catch:{ IOException | AssertionError -> 0x00e9, all -> 0x00e1 }
            java.lang.String r7 = "Firebase servers have received too many requests from this client in a short period of time. Please try again later."
            com.google.firebase.installations.FirebaseInstallationsException$Status r8 = com.google.firebase.installations.FirebaseInstallationsException.Status.TOO_MANY_REQUESTS     // Catch:{ IOException | AssertionError -> 0x00e9, all -> 0x00e1 }
            r6.<init>(r7, r8)     // Catch:{ IOException | AssertionError -> 0x00e9, all -> 0x00e1 }
            throw r6     // Catch:{ IOException | AssertionError -> 0x00e9, all -> 0x00e1 }
        L_0x00c3:
            com.google.firebase.installations.remote.TokenResult$Builder r6 = com.google.firebase.installations.remote.TokenResult.builder()     // Catch:{ IOException | AssertionError -> 0x00e9, all -> 0x00e1 }
            com.google.firebase.installations.remote.TokenResult$ResponseCode r7 = com.google.firebase.installations.remote.TokenResult.ResponseCode.AUTH_ERROR     // Catch:{ IOException | AssertionError -> 0x00e9, all -> 0x00e1 }
            com.google.firebase.installations.remote.TokenResult$Builder r6 = r6.setResponseCode(r7)     // Catch:{ IOException | AssertionError -> 0x00e9, all -> 0x00e1 }
            com.google.firebase.installations.remote.TokenResult r10 = r6.build()     // Catch:{ IOException | AssertionError -> 0x00e9, all -> 0x00e1 }
            r5.disconnect()     // Catch:{ Exception -> 0x00f5 }
            android.net.TrafficStats.clearThreadStatsTag()     // Catch:{ Exception -> 0x00f5 }
            int r11 = getMin
            int r11 = r11 + 93
            int r12 = r11 % 128
            isInside = r12
            int r11 = r11 % r0
            return r10
        L_0x00e1:
            r10 = move-exception
            r5.disconnect()
            android.net.TrafficStats.clearThreadStatsTag()
            throw r10
        L_0x00e9:
            r5.disconnect()
            android.net.TrafficStats.clearThreadStatsTag()
            int r2 = r2 + 1
            goto L_0x001e
        L_0x00f3:
            r10 = move-exception
            throw r10
        L_0x00f5:
            r10 = move-exception
            throw r10
        L_0x00f7:
            com.google.firebase.installations.FirebaseInstallationsException r10 = new com.google.firebase.installations.FirebaseInstallationsException
            com.google.firebase.installations.FirebaseInstallationsException$Status r11 = com.google.firebase.installations.FirebaseInstallationsException.Status.UNAVAILABLE
            r10.<init>(r1, r11)
            throw r10
        L_0x00ff:
            com.google.firebase.installations.FirebaseInstallationsException r10 = new com.google.firebase.installations.FirebaseInstallationsException
            com.google.firebase.installations.FirebaseInstallationsException$Status r11 = com.google.firebase.installations.FirebaseInstallationsException.Status.UNAVAILABLE
            r10.<init>(r1, r11)
            goto L_0x0108
        L_0x0107:
            throw r10
        L_0x0108:
            goto L_0x0107
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.installations.remote.FirebaseInstallationServiceClient.generateAuthToken(java.lang.String, java.lang.String, java.lang.String, java.lang.String):com.google.firebase.installations.remote.TokenResult");
    }

    private static boolean isSuccessfulResponseCode(int i) {
        int i2 = getMin + 63;
        isInside = i2 % 128;
        int i3 = i2 % 2;
        if ((i >= 200 ? 22 : 'c') != 22) {
            return false;
        }
        if ((i < 300 ? ';' : '_') != ';') {
            return false;
        }
        int i4 = getMin + 113;
        isInside = i4 % 128;
        int i5 = i4 % 2;
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x009b, code lost:
        if ((r0 != com.google.firebase.heartbeatinfo.HeartBeatInfo.HeartBeat.NONE ? 6 : kotlin.text.Typography.less) != '<') goto L_0x00b0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.net.HttpURLConnection openHttpURLConnection(java.net.URL r6, java.lang.String r7) throws com.google.firebase.installations.FirebaseInstallationsException {
        /*
            r5 = this;
            r0 = 0
            if (r7 == 0) goto L_0x0008
            int r1 = r7.length()
            goto L_0x0013
        L_0x0008:
            int r1 = isInside
            int r1 = r1 + 23
            int r2 = r1 % 128
            getMin = r2
            int r1 = r1 % 2
            r1 = 0
        L_0x0013:
            int r2 = o.dispatchOnCancelled.setMax(r1)
            if (r1 == r2) goto L_0x0028
            o.onCanceled r3 = new o.onCanceled
            r4 = 1
            r3.<init>(r1, r2, r4)
            r1 = -1929444355(0xffffffff8cff03fd, float:-3.9291371E-31)
            o.onCancelLoad.setMax(r1, r3)
            o.onCancelLoad.getMin(r1, r3)
        L_0x0028:
            java.net.URLConnection r6 = r6.openConnection()     // Catch:{ IOException -> 0x00e5 }
            java.net.HttpURLConnection r6 = (java.net.HttpURLConnection) r6     // Catch:{ IOException -> 0x00e5 }
            r1 = 10000(0x2710, float:1.4013E-41)
            r6.setConnectTimeout(r1)
            r6.setUseCaches(r0)
            r6.setReadTimeout(r1)
            java.lang.String r1 = "application/json"
            java.lang.String r2 = "Content-Type"
            r6.addRequestProperty(r2, r1)
            java.lang.String r2 = "Accept"
            r6.addRequestProperty(r2, r1)
            java.lang.String r1 = "Content-Encoding"
            java.lang.String r2 = "gzip"
            r6.addRequestProperty(r1, r2)
            java.lang.String r1 = "Cache-Control"
            java.lang.String r2 = "no-cache"
            r6.addRequestProperty(r1, r2)
            android.content.Context r1 = r5.context
            java.lang.String r1 = r1.getPackageName()
            java.lang.String r2 = "X-Android-Package"
            r6.addRequestProperty(r2, r1)
            com.google.firebase.inject.Provider<com.google.firebase.heartbeatinfo.HeartBeatInfo> r1 = r5.heartbeatInfo
            java.lang.Object r1 = r1.get()
            if (r1 == 0) goto L_0x00d5
            com.google.firebase.inject.Provider<com.google.firebase.platforminfo.UserAgentPublisher> r1 = r5.userAgentPublisher
            java.lang.Object r1 = r1.get()
            if (r1 == 0) goto L_0x00d5
            int r1 = isInside
            int r1 = r1 + 11
            int r2 = r1 % 128
            getMin = r2
            int r1 = r1 % 2
            r2 = 26
            if (r1 == 0) goto L_0x007f
            r1 = 26
            goto L_0x0081
        L_0x007f:
            r1 = 70
        L_0x0081:
            java.lang.String r3 = "fire-installations-id"
            if (r1 == r2) goto L_0x009e
            com.google.firebase.inject.Provider<com.google.firebase.heartbeatinfo.HeartBeatInfo> r0 = r5.heartbeatInfo
            java.lang.Object r0 = r0.get()
            com.google.firebase.heartbeatinfo.HeartBeatInfo r0 = (com.google.firebase.heartbeatinfo.HeartBeatInfo) r0
            com.google.firebase.heartbeatinfo.HeartBeatInfo$HeartBeat r0 = r0.getHeartBeatCode(r3)
            com.google.firebase.heartbeatinfo.HeartBeatInfo$HeartBeat r1 = com.google.firebase.heartbeatinfo.HeartBeatInfo.HeartBeat.NONE
            r2 = 60
            if (r0 == r1) goto L_0x0099
            r1 = 6
            goto L_0x009b
        L_0x0099:
            r1 = 60
        L_0x009b:
            if (r1 == r2) goto L_0x00d5
            goto L_0x00b0
        L_0x009e:
            com.google.firebase.inject.Provider<com.google.firebase.heartbeatinfo.HeartBeatInfo> r1 = r5.heartbeatInfo     // Catch:{ Exception -> 0x00d3 }
            java.lang.Object r1 = r1.get()     // Catch:{ Exception -> 0x00d3 }
            com.google.firebase.heartbeatinfo.HeartBeatInfo r1 = (com.google.firebase.heartbeatinfo.HeartBeatInfo) r1     // Catch:{ Exception -> 0x00d3 }
            com.google.firebase.heartbeatinfo.HeartBeatInfo$HeartBeat r1 = r1.getHeartBeatCode(r3)     // Catch:{ Exception -> 0x00d3 }
            com.google.firebase.heartbeatinfo.HeartBeatInfo$HeartBeat r2 = com.google.firebase.heartbeatinfo.HeartBeatInfo.HeartBeat.NONE     // Catch:{ Exception -> 0x00d3 }
            int r0 = r0 / r0
            if (r1 == r2) goto L_0x00d5
            r0 = r1
        L_0x00b0:
            com.google.firebase.inject.Provider<com.google.firebase.platforminfo.UserAgentPublisher> r1 = r5.userAgentPublisher
            java.lang.Object r1 = r1.get()
            com.google.firebase.platforminfo.UserAgentPublisher r1 = (com.google.firebase.platforminfo.UserAgentPublisher) r1
            java.lang.String r1 = r1.getUserAgent()
            java.lang.String r2 = "x-firebase-client"
            r6.addRequestProperty(r2, r1)
            int r0 = r0.getCode()
            java.lang.String r0 = java.lang.Integer.toString(r0)
            java.lang.String r1 = "x-firebase-client-log-type"
            r6.addRequestProperty(r1, r0)
            goto L_0x00d5
        L_0x00d1:
            r6 = move-exception
            throw r6
        L_0x00d3:
            r6 = move-exception
            throw r6
        L_0x00d5:
            java.lang.String r0 = r5.getFingerprintHashForPackage()
            java.lang.String r1 = "X-Android-Cert"
            r6.addRequestProperty(r1, r0)
            java.lang.String r0 = "x-goog-api-key"
            r6.addRequestProperty(r0, r7)
            return r6
        L_0x00e5:
            com.google.firebase.installations.FirebaseInstallationsException r6 = new com.google.firebase.installations.FirebaseInstallationsException
            com.google.firebase.installations.FirebaseInstallationsException$Status r7 = com.google.firebase.installations.FirebaseInstallationsException.Status.UNAVAILABLE
            java.lang.String r0 = "Firebase Installations Service is unavailable. Please try again later."
            r6.<init>(r0, r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.installations.remote.FirebaseInstallationServiceClient.openHttpURLConnection(java.net.URL, java.lang.String):java.net.HttpURLConnection");
    }

    private InstallationResponse readCreateResponse(HttpURLConnection httpURLConnection) throws AssertionError, IOException {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, UTF_8));
        TokenResult.Builder builder = TokenResult.builder();
        InstallationResponse.Builder builder2 = InstallationResponse.builder();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            try {
                String nextName = jsonReader.nextName();
                if (!(!nextName.equals("name"))) {
                    try {
                        builder2.setUri(jsonReader.nextString());
                    } catch (Exception e) {
                        throw e;
                    }
                } else if (nextName.equals("fid")) {
                    int i = isInside + 77;
                    getMin = i % 128;
                    int i2 = i % 2;
                    builder2.setFid(jsonReader.nextString());
                } else if (nextName.equals("refreshToken")) {
                    builder2.setRefreshToken(jsonReader.nextString());
                    int i3 = isInside + 47;
                    getMin = i3 % 128;
                    int i4 = i3 % 2;
                } else {
                    if ((nextName.equals("authToken") ? '_' : '7') != '_') {
                        jsonReader.skipValue();
                    } else {
                        int i5 = getMin + 111;
                        isInside = i5 % 128;
                        if ((i5 % 2 == 0 ? 'Z' : 3) != 'Z') {
                            jsonReader.beginObject();
                        } else {
                            jsonReader.beginObject();
                            Object[] objArr = null;
                            int length2 = objArr.length;
                        }
                        while (true) {
                            if (!(jsonReader.hasNext())) {
                                builder2.setAuthToken(builder.build());
                                jsonReader.endObject();
                                break;
                            }
                            String nextName2 = jsonReader.nextName();
                            if (nextName2.equals("token")) {
                                int i6 = getMin + 117;
                                isInside = i6 % 128;
                                if ((i6 % 2 == 0 ? 3 : 'Q') != 3) {
                                    builder.setToken(jsonReader.nextString());
                                } else {
                                    builder.setToken(jsonReader.nextString());
                                    int i7 = 57 / 0;
                                }
                                int i8 = isInside + 121;
                                getMin = i8 % 128;
                                int i9 = i8 % 2;
                            } else if (nextName2.equals("expiresIn")) {
                                int i10 = getMin + 35;
                                isInside = i10 % 128;
                                int i11 = i10 % 2;
                                builder.setTokenExpirationTimestamp(parseTokenExpirationTimestamp(jsonReader.nextString()));
                            } else {
                                jsonReader.skipValue();
                            }
                        }
                    }
                }
            } catch (Exception e2) {
                throw e2;
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        return builder2.setResponseCode(InstallationResponse.ResponseCode.OK).build();
    }

    private TokenResult readGenerateAuthTokenResponse(HttpURLConnection httpURLConnection) throws AssertionError, IOException {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, UTF_8));
        TokenResult.Builder builder = TokenResult.builder();
        jsonReader.beginObject();
        while (true) {
            if ((jsonReader.hasNext() ? '[' : ']') != '[') {
                jsonReader.endObject();
                jsonReader.close();
                inputStream.close();
                return builder.setResponseCode(TokenResult.ResponseCode.OK).build();
            }
            int i = getMin + 95;
            isInside = i % 128;
            int i2 = i % 2;
            String nextName = jsonReader.nextName();
            if (nextName.equals("token")) {
                try {
                    builder.setToken(jsonReader.nextString());
                } catch (Exception e) {
                    throw e;
                }
            } else if (nextName.equals("expiresIn")) {
                try {
                    builder.setTokenExpirationTimestamp(parseTokenExpirationTimestamp(jsonReader.nextString()));
                } catch (Exception e2) {
                    throw e2;
                }
            } else {
                jsonReader.skipValue();
                int i3 = getMin + 93;
                isInside = i3 % 128;
                int i4 = i3 % 2;
            }
        }
    }

    private String getFingerprintHashForPackage() {
        int i = getMin + 43;
        isInside = i % 128;
        int i2 = i % 2;
        String str = null;
        try {
            byte[] packageCertificateHashBytes = AndroidUtilsLight.getPackageCertificateHashBytes(this.context, this.context.getPackageName());
            if (!(packageCertificateHashBytes != null)) {
                int i3 = isInside + 9;
                getMin = i3 % 128;
                int i4 = i3 % 2;
                return null;
            }
            str = Hex.bytesToStringUppercase(packageCertificateHashBytes, false);
            int i5 = getMin + 65;
            isInside = i5 % 128;
            int i6 = i5 % 2;
            return str;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    @VisibleForTesting
    static long parseTokenExpirationTimestamp(String str) {
        int i = getMin + 63;
        isInside = i % 128;
        int i2 = i % 2;
        Preconditions.checkArgument(EXPIRATION_TIMESTAMP_PATTERN.matcher(str).matches(), PARSING_EXPIRATION_TIME_ERROR_MESSAGE);
        if ((str != null ? 17 : '-') != 17) {
            return 0;
        }
        try {
            int i3 = isInside + 33;
            try {
                getMin = i3 % 128;
                int i4 = i3 % 2;
                if ((str.length() == 0 ? ')' : 24) != 24) {
                    return 0;
                }
                return Long.parseLong(str.substring(0, str.length() - 1));
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    private static void logFisCommunicationError(HttpURLConnection httpURLConnection, @Nullable String str, @NonNull String str2, @NonNull String str3) {
        if ((!TextUtils.isEmpty(readErrorResponse(httpURLConnection)) ? Typography.quote : 30) == '\"') {
            int i = isInside + 67;
            getMin = i % 128;
            int i2 = i % 2;
            try {
                availableFirebaseOptions(str, str2, str3);
                int i3 = getMin + 21;
                isInside = i3 % 128;
                int i4 = i3 % 2;
            } catch (Exception e) {
                throw e;
            }
        }
    }

    private static String availableFirebaseOptions(@Nullable String str, @NonNull String str2, @NonNull String str3) {
        String str4;
        int i = isInside + 33;
        getMin = i % 128;
        int i2 = i % 2;
        Object[] objArr = new Object[3];
        boolean z = false;
        objArr[0] = str2;
        objArr[1] = str3;
        if (!(!TextUtils.isEmpty(str))) {
            int i3 = getMin + 19;
            isInside = i3 % 128;
            if (i3 % 2 == 0) {
                z = true;
            }
            if (z) {
                Object obj = null;
                super.hashCode();
            }
            str4 = "";
        } else {
            str4 = ", ".concat(String.valueOf(str));
        }
        objArr[2] = str4;
        return String.format("Firebase options used while communicating with Firebase server APIs: %s, %s%s", objArr);
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:49:0x0095 */
    @androidx.annotation.Nullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String readErrorResponse(java.net.HttpURLConnection r8) {
        /*
            int r0 = isInside
            int r0 = r0 + 125
            int r1 = r0 % 128
            getMin = r1
            r1 = 2
            int r0 = r0 % r1
            java.io.InputStream r0 = r8.getErrorStream()
            r2 = 12
            if (r0 != 0) goto L_0x0015
            r3 = 79
            goto L_0x0017
        L_0x0015:
            r3 = 12
        L_0x0017:
            r4 = 0
            r5 = 0
            if (r3 == r2) goto L_0x003a
            int r8 = getMin     // Catch:{ Exception -> 0x0038 }
            int r8 = r8 + 57
            int r0 = r8 % 128
            isInside = r0     // Catch:{ Exception -> 0x0036 }
            int r8 = r8 % r1
            r0 = 58
            if (r8 != 0) goto L_0x002b
            r8 = 61
            goto L_0x002d
        L_0x002b:
            r8 = 58
        L_0x002d:
            if (r8 == r0) goto L_0x0035
            r8 = 38
            int r8 = r8 / r4
            return r5
        L_0x0033:
            r8 = move-exception
            throw r8
        L_0x0035:
            return r5
        L_0x0036:
            r8 = move-exception
            throw r8
        L_0x0038:
            r8 = move-exception
            throw r8
        L_0x003a:
            java.io.BufferedReader r2 = new java.io.BufferedReader
            java.io.InputStreamReader r3 = new java.io.InputStreamReader
            java.nio.charset.Charset r6 = UTF_8
            r3.<init>(r0, r6)
            r2.<init>(r3)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0095, all -> 0x0090 }
            r0.<init>()     // Catch:{ IOException -> 0x0095, all -> 0x0090 }
            java.lang.String r3 = r2.readLine()     // Catch:{ IOException -> 0x0095, all -> 0x0090 }
        L_0x004f:
            r6 = 84
            if (r3 == 0) goto L_0x0056
            r7 = 73
            goto L_0x0058
        L_0x0056:
            r7 = 84
        L_0x0058:
            if (r7 == r6) goto L_0x0070
            r0.append(r3)     // Catch:{ IOException -> 0x0095, all -> 0x0090 }
            r3 = 10
            r0.append(r3)     // Catch:{ IOException -> 0x0095, all -> 0x0090 }
            java.lang.String r3 = r2.readLine()     // Catch:{ IOException -> 0x0095, all -> 0x0090 }
            int r6 = isInside
            int r6 = r6 + 111
            int r7 = r6 % 128
            getMin = r7
            int r6 = r6 % r1
            goto L_0x004f
        L_0x0070:
            java.lang.String r3 = "Error when communicating with the Firebase Installations server API. HTTP response: [%d %s: %s]"
            r6 = 3
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch:{ IOException -> 0x0095, all -> 0x0090 }
            int r7 = r8.getResponseCode()     // Catch:{ IOException -> 0x0095, all -> 0x0090 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ IOException -> 0x0095, all -> 0x0090 }
            r6[r4] = r7     // Catch:{ IOException -> 0x0095, all -> 0x0090 }
            r4 = 1
            java.lang.String r8 = r8.getResponseMessage()     // Catch:{ IOException -> 0x0095, all -> 0x0090 }
            r6[r4] = r8     // Catch:{ IOException -> 0x0095, all -> 0x0090 }
            r6[r1] = r0     // Catch:{ IOException -> 0x0095, all -> 0x0090 }
            java.lang.String r8 = java.lang.String.format(r3, r6)     // Catch:{ IOException -> 0x0095, all -> 0x0090 }
            r2.close()     // Catch:{ IOException -> 0x008f }
        L_0x008f:
            return r8
        L_0x0090:
            r8 = move-exception
            r2.close()     // Catch:{ IOException -> 0x0094 }
        L_0x0094:
            throw r8
        L_0x0095:
            r2.close()     // Catch:{ IOException -> 0x0098 }
        L_0x0098:
            int r8 = isInside
            int r8 = r8 + 39
            int r0 = r8 % 128
            getMin = r0
            int r8 = r8 % r1
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.installations.remote.FirebaseInstallationServiceClient.readErrorResponse(java.net.HttpURLConnection):java.lang.String");
    }

    private static String getMax(char[] cArr) {
        int i = getMin + 83;
        isInside = i % 128;
        int i2 = i % 2;
        char[] cArr2 = new char[cArr.length];
        char[] cArr3 = new char[2];
        int i3 = 0;
        while (true) {
            if ((i3 < cArr.length ? (char) 25 : 29) != 25) {
                return new String(cArr2, 1, cArr2[0]);
            }
            int i4 = isInside + 33;
            getMin = i4 % 128;
            int i5 = i4 % 2;
            cArr3[0] = cArr[i3];
            int i6 = i3 + 1;
            cArr3[1] = cArr[i6];
            try {
                onActivityPostCreated.setMax(cArr3, setMax, getMax, length, setMin);
                cArr2[i3] = cArr3[0];
                cArr2[i6] = cArr3[1];
                i3 += 2;
            } catch (Exception e) {
                throw e;
            }
        }
    }
}
