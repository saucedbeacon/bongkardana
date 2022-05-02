package com.google.android.datatransport.cct;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.datatransport.Encoding;
import com.google.android.datatransport.backend.cct.BuildConfig;
import com.google.android.datatransport.cct.internal.AndroidClientInfo;
import com.google.android.datatransport.cct.internal.BatchedLogRequest;
import com.google.android.datatransport.cct.internal.ClientInfo;
import com.google.android.datatransport.cct.internal.LogEvent;
import com.google.android.datatransport.cct.internal.LogRequest;
import com.google.android.datatransport.cct.internal.LogResponse;
import com.google.android.datatransport.cct.internal.NetworkConnectionInfo;
import com.google.android.datatransport.cct.internal.QosTier;
import com.google.android.datatransport.runtime.EncodedPayload;
import com.google.android.datatransport.runtime.EventInternal;
import com.google.android.datatransport.runtime.backends.BackendRequest;
import com.google.android.datatransport.runtime.backends.TransportBackend;
import com.google.android.datatransport.runtime.logging.Logging;
import com.google.android.datatransport.runtime.time.Clock;
import com.google.common.net.HttpHeaders;
import com.google.firebase.encoders.DataEncoder;
import com.google.firebase.encoders.EncodingException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.zip.GZIPOutputStream;
import o.onActivityPreCreated;

public final class CctTransportBackend implements TransportBackend {
    private static final String ACCEPT_ENCODING_HEADER_KEY = "Accept-Encoding";
    static final String API_KEY_HEADER_KEY = "X-Goog-Api-Key";
    private static final int CONNECTION_TIME_OUT = 30000;
    private static final String CONTENT_ENCODING_HEADER_KEY = "Content-Encoding";
    private static final String CONTENT_TYPE_HEADER_KEY = "Content-Type";
    private static final String GZIP_CONTENT_ENCODING = "gzip";
    private static final int INVALID_VERSION_CODE = -1;
    private static final String JSON_CONTENT_TYPE = "application/json";
    private static final String KEY_APPLICATION_BUILD = "application_build";
    private static final String KEY_COUNTRY = "country";
    private static final String KEY_DEVICE = "device";
    private static final String KEY_FINGERPRINT = "fingerprint";
    private static final String KEY_HARDWARE = "hardware";
    private static final String KEY_LOCALE = "locale";
    private static final String KEY_MANUFACTURER = "manufacturer";
    private static final String KEY_MCC_MNC = "mcc_mnc";
    @VisibleForTesting
    static final String KEY_MOBILE_SUBTYPE = "mobile-subtype";
    private static final String KEY_MODEL = "model";
    @VisibleForTesting
    static final String KEY_NETWORK_TYPE = "net-type";
    private static final String KEY_OS_BUILD = "os-uild";
    private static final String KEY_PRODUCT = "product";
    private static final String KEY_SDK_VERSION = "sdk-version";
    private static final String KEY_TIMEZONE_OFFSET = "tz-offset";
    private static final String LOG_TAG = "CctTransportBackend";
    private static final int READ_TIME_OUT = 40000;
    private static long length = 678513233979053561L;
    private static int setMax = 0;
    private static int setMin = 1;
    private final Context applicationContext;
    private final ConnectivityManager connectivityManager;
    private final DataEncoder dataEncoder;
    final URL endPoint;
    private final int readTimeout;
    private final Clock uptimeClock;
    private final Clock wallTimeClock;

    private static URL parseUrlOrThrow(String str) {
        try {
            URL url = new URL(str);
            int i = setMin + 61;
            setMax = i % 128;
            if (i % 2 == 0) {
                return url;
            }
            int i2 = 23 / 0;
            return url;
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException("Invalid url: ".concat(String.valueOf(str)), e);
        }
    }

    CctTransportBackend(Context context, Clock clock, Clock clock2, int i) {
        this.dataEncoder = BatchedLogRequest.createDataEncoder();
        this.applicationContext = context;
        this.connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        this.endPoint = parseUrlOrThrow(CCTDestination.DEFAULT_END_POINT);
        this.uptimeClock = clock2;
        this.wallTimeClock = clock;
        this.readTimeout = i;
    }

    CctTransportBackend(Context context, Clock clock, Clock clock2) {
        this(context, clock, clock2, 40000);
    }

    private static TelephonyManager getTelephonyManager(Context context) {
        int i = setMin + 43;
        setMax = i % 128;
        boolean z = i % 2 != 0;
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        if (z) {
            Object[] objArr = null;
            int length2 = objArr.length;
        }
        return telephonyManager;
    }

    private static int getPackageVersionCode(Context context) {
        int i = setMax + 77;
        setMin = i % 128;
        int i2 = i % 2;
        try {
            int i3 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
            int i4 = setMin + 65;
            setMax = i4 % 128;
            if ((i4 % 2 != 0 ? 1 : 'C') != 1) {
                return i3;
            }
            Object[] objArr = null;
            int length2 = objArr.length;
            return i3;
        } catch (PackageManager.NameNotFoundException e) {
            Logging.e(LOG_TAG, "Unable to find version code for package", e);
            return -1;
        }
    }

    public final EventInternal decorate(EventInternal eventInternal) {
        int i = setMax + 31;
        setMin = i % 128;
        int i2 = i % 2;
        NetworkInfo activeNetworkInfo = this.connectivityManager.getActiveNetworkInfo();
        EventInternal build = eventInternal.toBuilder().addMetadata(KEY_SDK_VERSION, Build.VERSION.SDK_INT).addMetadata("model", Build.MODEL).addMetadata(KEY_HARDWARE, Build.HARDWARE).addMetadata("device", Build.DEVICE).addMetadata(KEY_PRODUCT, Build.PRODUCT).addMetadata(KEY_OS_BUILD, Build.ID).addMetadata("manufacturer", Build.MANUFACTURER).addMetadata(KEY_FINGERPRINT, Build.FINGERPRINT).addMetadata(KEY_TIMEZONE_OFFSET, getTzOffset()).addMetadata(KEY_NETWORK_TYPE, getNetTypeValue(activeNetworkInfo)).addMetadata(KEY_MOBILE_SUBTYPE, getNetSubtypeValue(activeNetworkInfo)).addMetadata(KEY_COUNTRY, Locale.getDefault().getCountry()).addMetadata("locale", Locale.getDefault().getLanguage()).addMetadata(KEY_MCC_MNC, getTelephonyManager(this.applicationContext).getSimOperator()).addMetadata(KEY_APPLICATION_BUILD, Integer.toString(getPackageVersionCode(this.applicationContext))).build();
        int i3 = setMin + 57;
        setMax = i3 % 128;
        int i4 = i3 % 2;
        return build;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001b, code lost:
        if ((r3 == null ? 28 : '^') != 28) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0028, code lost:
        if ((r3 == null ? '=' : 'U') != 'U') goto L_0x002a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x004b, code lost:
        r3 = r3.getType();
        r0 = setMax + 73;
        setMin = r0 % 128;
        r0 = r0 % 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0059, code lost:
        return r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int getNetTypeValue(android.net.NetworkInfo r3) {
        /*
            int r0 = setMax
            int r0 = r0 + 65
            int r1 = r0 % 128
            setMin = r1
            int r0 = r0 % 2
            if (r0 != 0) goto L_0x000e
            r0 = 0
            goto L_0x000f
        L_0x000e:
            r0 = 1
        L_0x000f:
            r1 = 0
            if (r0 == 0) goto L_0x001e
            r0 = 28
            if (r3 != 0) goto L_0x0019
            r2 = 28
            goto L_0x001b
        L_0x0019:
            r2 = 94
        L_0x001b:
            if (r2 == r0) goto L_0x002a
            goto L_0x004b
        L_0x001e:
            int r0 = r1.length     // Catch:{ all -> 0x005a }
            r0 = 85
            if (r3 != 0) goto L_0x0026
            r2 = 61
            goto L_0x0028
        L_0x0026:
            r2 = 85
        L_0x0028:
            if (r2 == r0) goto L_0x004b
        L_0x002a:
            int r3 = setMax
            int r3 = r3 + 39
            int r0 = r3 % 128
            setMin = r0
            int r3 = r3 % 2
            if (r3 != 0) goto L_0x0044
            com.google.android.datatransport.cct.internal.NetworkConnectionInfo$NetworkType r3 = com.google.android.datatransport.cct.internal.NetworkConnectionInfo.NetworkType.NONE     // Catch:{ Exception -> 0x0042 }
            int r3 = r3.getValue()     // Catch:{ Exception -> 0x0042 }
            super.hashCode()     // Catch:{ all -> 0x0040 }
            goto L_0x004a
        L_0x0040:
            r3 = move-exception
            throw r3
        L_0x0042:
            r3 = move-exception
            throw r3
        L_0x0044:
            com.google.android.datatransport.cct.internal.NetworkConnectionInfo$NetworkType r3 = com.google.android.datatransport.cct.internal.NetworkConnectionInfo.NetworkType.NONE
            int r3 = r3.getValue()
        L_0x004a:
            return r3
        L_0x004b:
            int r3 = r3.getType()
            int r0 = setMax
            int r0 = r0 + 73
            int r1 = r0 % 128
            setMin = r1
            int r0 = r0 % 2
            return r3
        L_0x005a:
            r3 = move-exception
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.datatransport.cct.CctTransportBackend.getNetTypeValue(android.net.NetworkInfo):int");
    }

    private static int getNetSubtypeValue(NetworkInfo networkInfo) {
        boolean z = true;
        if (!(networkInfo == null)) {
            int subtype = networkInfo.getSubtype();
            if (!(subtype != -1)) {
                return NetworkConnectionInfo.MobileSubtype.COMBINED.getValue();
            }
            try {
                if (NetworkConnectionInfo.MobileSubtype.forNumber(subtype) == null) {
                    z = false;
                }
                if (!z) {
                    return 0;
                }
                int i = setMax + 21;
                setMin = i % 128;
                int i2 = i % 2;
                return subtype;
            } catch (Exception e) {
                throw e;
            }
        } else {
            int i3 = setMax + 53;
            setMin = i3 % 128;
            if (i3 % 2 == 0) {
                int value = NetworkConnectionInfo.MobileSubtype.UNKNOWN_MOBILE_SUBTYPE.getValue();
                Object[] objArr = null;
                int length2 = objArr.length;
                return value;
            }
            try {
                return NetworkConnectionInfo.MobileSubtype.UNKNOWN_MOBILE_SUBTYPE.getValue();
            } catch (Exception e2) {
                throw e2;
            }
        }
    }

    private BatchedLogRequest getRequestBody(BackendRequest backendRequest) {
        LogEvent.Builder builder;
        HashMap hashMap = new HashMap();
        for (EventInternal next : backendRequest.getEvents()) {
            int i = setMin + 59;
            setMax = i % 128;
            int i2 = i % 2;
            String transportName = next.getTransportName();
            if (!hashMap.containsKey(transportName)) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(next);
                hashMap.put(transportName, arrayList);
                int i3 = setMin + 97;
                setMax = i3 % 128;
                int i4 = i3 % 2;
            } else {
                ((List) hashMap.get(transportName)).add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = hashMap.entrySet().iterator();
        while (true) {
            if ((it.hasNext() ? '?' : '/') == '/') {
                return BatchedLogRequest.create(arrayList2);
            }
            int i5 = setMax + 49;
            setMin = i5 % 128;
            int i6 = i5 % 2;
            Map.Entry entry = (Map.Entry) it.next();
            EventInternal eventInternal = (EventInternal) ((List) entry.getValue()).get(0);
            LogRequest.Builder clientInfo = LogRequest.builder().setQosTier(QosTier.DEFAULT).setRequestTimeMs(this.wallTimeClock.getTime()).setRequestUptimeMs(this.uptimeClock.getTime()).setClientInfo(ClientInfo.builder().setClientType(ClientInfo.ClientType.ANDROID_FIREBASE).setAndroidClientInfo(AndroidClientInfo.builder().setSdkVersion(Integer.valueOf(eventInternal.getInteger(KEY_SDK_VERSION))).setModel(eventInternal.get("model")).setHardware(eventInternal.get(KEY_HARDWARE)).setDevice(eventInternal.get("device")).setProduct(eventInternal.get(KEY_PRODUCT)).setOsBuild(eventInternal.get(KEY_OS_BUILD)).setManufacturer(eventInternal.get("manufacturer")).setFingerprint(eventInternal.get(KEY_FINGERPRINT)).setCountry(eventInternal.get(KEY_COUNTRY)).setLocale(eventInternal.get("locale")).setMccMnc(eventInternal.get(KEY_MCC_MNC)).setApplicationBuild(eventInternal.get(KEY_APPLICATION_BUILD)).build()).build());
            try {
                clientInfo.setSource(Integer.parseInt((String) entry.getKey()));
            } catch (NumberFormatException unused) {
                clientInfo.setSource((String) entry.getKey());
            }
            ArrayList arrayList3 = new ArrayList();
            Iterator it2 = ((List) entry.getValue()).iterator();
            while (true) {
                if ((it2.hasNext() ? 15 : '9') != 15) {
                    break;
                }
                EventInternal eventInternal2 = (EventInternal) it2.next();
                EncodedPayload encodedPayload = eventInternal2.getEncodedPayload();
                Encoding encoding = encodedPayload.getEncoding();
                if (encoding.equals(Encoding.of("proto"))) {
                    builder = LogEvent.protoBuilder(encodedPayload.getBytes());
                } else if (encoding.equals(Encoding.of("json"))) {
                    builder = LogEvent.jsonBuilder(new String(encodedPayload.getBytes(), Charset.forName(setMin(new char[]{6313, 6396, 23544, 20053, 4494, 16718, 14906, 136, 20341}).intern())));
                } else {
                    Logging.w(LOG_TAG, "Received event of unsupported encoding %s. Skipping...", encoding);
                }
                builder.setEventTimeMs(eventInternal2.getEventMillis()).setEventUptimeMs(eventInternal2.getUptimeMillis()).setTimezoneOffsetSeconds(eventInternal2.getLong(KEY_TIMEZONE_OFFSET)).setNetworkConnectionInfo(NetworkConnectionInfo.builder().setNetworkType(NetworkConnectionInfo.NetworkType.forNumber(eventInternal2.getInteger(KEY_NETWORK_TYPE))).setMobileSubtype(NetworkConnectionInfo.MobileSubtype.forNumber(eventInternal2.getInteger(KEY_MOBILE_SUBTYPE))).build());
                if ((eventInternal2.getCode() != null ? '(' : 'H') != 'H') {
                    builder.setEventCode(eventInternal2.getCode());
                }
                arrayList3.add(builder.build());
                int i7 = setMin + 3;
                setMax = i7 % 128;
                int i8 = i7 % 2;
            }
            clientInfo.setLogEvents(arrayList3);
            arrayList2.add(clientInfo.build());
        }
    }

    public final HttpResponse doSend(HttpRequest httpRequest) throws IOException {
        GZIPOutputStream gZIPOutputStream;
        InputStream maybeUnGzip;
        Logging.d(LOG_TAG, "Making request to: %s", (Object) httpRequest.url);
        HttpURLConnection httpURLConnection = (HttpURLConnection) httpRequest.url.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(this.readTimeout);
        httpURLConnection.setDoOutput(true);
        boolean z = false;
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty(HttpHeaders.USER_AGENT, String.format("datatransport/%s android/", new Object[]{BuildConfig.VERSION_NAME}));
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        if ((httpRequest.apiKey != null ? 6 : 'c') != 'c') {
            httpURLConnection.setRequestProperty(API_KEY_HEADER_KEY, httpRequest.apiKey);
        }
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                gZIPOutputStream = new GZIPOutputStream(outputStream);
                this.dataEncoder.encode(httpRequest.requestBody, new BufferedWriter(new OutputStreamWriter(gZIPOutputStream)));
                gZIPOutputStream.close();
                if ((outputStream != null ? ')' : '1') == ')') {
                    outputStream.close();
                }
                int responseCode = httpURLConnection.getResponseCode();
                Logging.i(LOG_TAG, "Status Code: ".concat(String.valueOf(responseCode)));
                StringBuilder sb = new StringBuilder("Content-Type: ");
                sb.append(httpURLConnection.getHeaderField("Content-Type"));
                Logging.i(LOG_TAG, sb.toString());
                StringBuilder sb2 = new StringBuilder("Content-Encoding: ");
                sb2.append(httpURLConnection.getHeaderField("Content-Encoding"));
                Logging.i(LOG_TAG, sb2.toString());
                if (responseCode != 302) {
                    if (!((responseCode == 301) || responseCode == 307)) {
                        if (responseCode != 200) {
                            return new HttpResponse(responseCode, (URL) null, 0);
                        }
                        try {
                            InputStream inputStream = httpURLConnection.getInputStream();
                            try {
                                maybeUnGzip = maybeUnGzip(inputStream, httpURLConnection.getHeaderField("Content-Encoding"));
                                HttpResponse httpResponse = new HttpResponse(responseCode, (URL) null, LogResponse.fromJson(new BufferedReader(new InputStreamReader(maybeUnGzip))).getNextRequestWaitMillis());
                                if (!(maybeUnGzip == null)) {
                                    maybeUnGzip.close();
                                }
                                if (inputStream == null) {
                                    z = true;
                                }
                                if (!z) {
                                    int i = setMin + 3;
                                    setMax = i % 128;
                                    int i2 = i % 2;
                                    inputStream.close();
                                    int i3 = setMax + 35;
                                    setMin = i3 % 128;
                                    int i4 = i3 % 2;
                                }
                                return httpResponse;
                            } catch (Throwable th) {
                                if (inputStream != null) {
                                    try {
                                        inputStream.close();
                                    } catch (Throwable th2) {
                                        th.addSuppressed(th2);
                                    }
                                }
                                throw th;
                            }
                        } catch (Exception e) {
                            throw e;
                        }
                    }
                }
                try {
                    return new HttpResponse(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0);
                } catch (Exception e2) {
                    throw e2;
                }
                throw th;
                throw th;
            } catch (Throwable th3) {
                if (outputStream != null) {
                    outputStream.close();
                }
                throw th3;
            }
        } catch (ConnectException | UnknownHostException e3) {
            Logging.e(LOG_TAG, "Couldn't open connection, returning with 500", e3);
            return new HttpResponse(500, (URL) null, 0);
        } catch (EncodingException | IOException e4) {
            Logging.e(LOG_TAG, "Couldn't encode request, returning with 400", e4);
            return new HttpResponse(400, (URL) null, 0);
        } catch (Throwable th4) {
            th3.addSuppressed(th4);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0026, code lost:
        if (r4 != false) goto L_0x0028;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0038, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001b, code lost:
        if ("gzip".equals(r4) != false) goto L_0x0028;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.io.InputStream maybeUnGzip(java.io.InputStream r3, java.lang.String r4) throws java.io.IOException {
        /*
            int r0 = setMax     // Catch:{ Exception -> 0x003b }
            int r0 = r0 + 105
            int r1 = r0 % 128
            setMin = r1     // Catch:{ Exception -> 0x003b }
            int r0 = r0 % 2
            r1 = 37
            if (r0 != 0) goto L_0x0011
            r0 = 37
            goto L_0x0013
        L_0x0011:
            r0 = 35
        L_0x0013:
            java.lang.String r2 = "gzip"
            if (r0 == r1) goto L_0x001e
            boolean r4 = r2.equals(r4)
            if (r4 == 0) goto L_0x0038
            goto L_0x0028
        L_0x001e:
            boolean r4 = r2.equals(r4)
            r0 = 0
            super.hashCode()     // Catch:{ all -> 0x0039 }
            if (r4 == 0) goto L_0x0038
        L_0x0028:
            java.util.zip.GZIPInputStream r4 = new java.util.zip.GZIPInputStream
            r4.<init>(r3)
            int r3 = setMax     // Catch:{ Exception -> 0x003b }
            int r3 = r3 + 117
            int r0 = r3 % 128
            setMin = r0     // Catch:{ Exception -> 0x003b }
            int r3 = r3 % 2
            return r4
        L_0x0038:
            return r3
        L_0x0039:
            r3 = move-exception
            throw r3
        L_0x003b:
            r3 = move-exception
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.datatransport.cct.CctTransportBackend.maybeUnGzip(java.io.InputStream, java.lang.String):java.io.InputStream");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0043, code lost:
        if (r8.getAPIKey() != null) goto L_0x0045;
     */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x004f A[SYNTHETIC, Splitter:B:26:0x004f] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.datatransport.runtime.backends.BackendResponse send(com.google.android.datatransport.runtime.backends.BackendRequest r8) {
        /*
            r7 = this;
            com.google.android.datatransport.cct.internal.BatchedLogRequest r0 = r7.getRequestBody(r8)
            r1 = 0
            java.net.URL r2 = r7.endPoint     // Catch:{ Exception -> 0x00e9 }
            byte[] r3 = r8.getExtras()     // Catch:{ Exception -> 0x00e9 }
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L_0x006c
            int r3 = setMax
            int r3 = r3 + 115
            int r6 = r3 % 128
            setMin = r6
            int r3 = r3 % 2
            if (r3 != 0) goto L_0x001d
            r3 = 0
            goto L_0x001e
        L_0x001d:
            r3 = 1
        L_0x001e:
            if (r3 == 0) goto L_0x0034
            byte[] r8 = r8.getExtras()     // Catch:{ IllegalArgumentException -> 0x0067 }
            com.google.android.datatransport.cct.CCTDestination r8 = com.google.android.datatransport.cct.CCTDestination.fromByteArray(r8)     // Catch:{ IllegalArgumentException -> 0x0067 }
            java.lang.String r3 = r8.getAPIKey()     // Catch:{ IllegalArgumentException -> 0x0067 }
            if (r3 == 0) goto L_0x0030
            r3 = 1
            goto L_0x0031
        L_0x0030:
            r3 = 0
        L_0x0031:
            if (r3 == r5) goto L_0x0045
            goto L_0x0049
        L_0x0034:
            byte[] r8 = r8.getExtras()     // Catch:{ IllegalArgumentException -> 0x0067 }
            com.google.android.datatransport.cct.CCTDestination r8 = com.google.android.datatransport.cct.CCTDestination.fromByteArray(r8)     // Catch:{ IllegalArgumentException -> 0x0067 }
            java.lang.String r3 = r8.getAPIKey()     // Catch:{ IllegalArgumentException -> 0x0067 }
            r6 = 86
            int r6 = r6 / r4
            if (r3 == 0) goto L_0x0049
        L_0x0045:
            java.lang.String r1 = r8.getAPIKey()     // Catch:{ IllegalArgumentException -> 0x0067 }
        L_0x0049:
            java.lang.String r3 = r8.getEndPoint()     // Catch:{ IllegalArgumentException -> 0x0067 }
            if (r3 == 0) goto L_0x006c
            int r2 = setMax     // Catch:{ Exception -> 0x0063 }
            int r2 = r2 + 55
            int r3 = r2 % 128
            setMin = r3
            int r2 = r2 % 2
            java.lang.String r8 = r8.getEndPoint()     // Catch:{ IllegalArgumentException -> 0x0067 }
            java.net.URL r8 = parseUrlOrThrow(r8)     // Catch:{ IllegalArgumentException -> 0x0067 }
            r2 = r8
            goto L_0x006c
        L_0x0063:
            r8 = move-exception
            goto L_0x00a3
        L_0x0065:
            r8 = move-exception
            throw r8
        L_0x0067:
            com.google.android.datatransport.runtime.backends.BackendResponse r8 = com.google.android.datatransport.runtime.backends.BackendResponse.fatalError()
            return r8
        L_0x006c:
            r8 = 5
            com.google.android.datatransport.cct.CctTransportBackend$HttpRequest r3 = new com.google.android.datatransport.cct.CctTransportBackend$HttpRequest     // Catch:{ IOException -> 0x00dc }
            r3.<init>(r2, r0, r1)     // Catch:{ IOException -> 0x00dc }
            o.requireContext r0 = new o.requireContext     // Catch:{ IOException -> 0x00dc }
            r0.<init>(r7)     // Catch:{ IOException -> 0x00dc }
            o.requireActivity r1 = o.requireActivity.length     // Catch:{ IOException -> 0x00dc }
            java.lang.Object r8 = com.google.android.datatransport.runtime.retries.Retries.retry(r8, r3, r0, r1)     // Catch:{ IOException -> 0x00dc }
            com.google.android.datatransport.cct.CctTransportBackend$HttpResponse r8 = (com.google.android.datatransport.cct.CctTransportBackend.HttpResponse) r8     // Catch:{ IOException -> 0x00dc }
            int r0 = r8.code     // Catch:{ IOException -> 0x00dc }
            r1 = 200(0xc8, float:2.8E-43)
            if (r0 != r1) goto L_0x0087
            r0 = 0
            goto L_0x0088
        L_0x0087:
            r0 = 1
        L_0x0088:
            if (r0 == r5) goto L_0x00a4
            long r0 = r8.nextRequestMillis     // Catch:{ IOException -> 0x00dc }
            com.google.android.datatransport.runtime.backends.BackendResponse r8 = com.google.android.datatransport.runtime.backends.BackendResponse.ok(r0)     // Catch:{ IOException -> 0x00dc }
            int r0 = setMax     // Catch:{ Exception -> 0x0063 }
            int r0 = r0 + 107
            int r1 = r0 % 128
            setMin = r1     // Catch:{ Exception -> 0x00e9 }
            int r0 = r0 % 2
            if (r0 != 0) goto L_0x00a2
            r0 = 70
            int r0 = r0 / r4
            return r8
        L_0x00a0:
            r8 = move-exception
            throw r8
        L_0x00a2:
            return r8
        L_0x00a3:
            throw r8
        L_0x00a4:
            int r0 = r8.code     // Catch:{ IOException -> 0x00dc }
            r1 = 500(0x1f4, float:7.0E-43)
            if (r0 >= r1) goto L_0x00ac
            r0 = 0
            goto L_0x00ad
        L_0x00ac:
            r0 = 1
        L_0x00ad:
            if (r0 == r5) goto L_0x00c5
            int r8 = r8.code     // Catch:{ IOException -> 0x00dc }
            r0 = 404(0x194, float:5.66E-43)
            if (r8 != r0) goto L_0x00b6
            goto L_0x00c5
        L_0x00b6:
            com.google.android.datatransport.runtime.backends.BackendResponse r8 = com.google.android.datatransport.runtime.backends.BackendResponse.fatalError()     // Catch:{ IOException -> 0x00dc }
            int r0 = setMax
            int r0 = r0 + 13
            int r1 = r0 % 128
            setMin = r1
            int r0 = r0 % 2
            return r8
        L_0x00c5:
            com.google.android.datatransport.runtime.backends.BackendResponse r8 = com.google.android.datatransport.runtime.backends.BackendResponse.transientError()     // Catch:{ IOException -> 0x00dc }
            int r0 = setMax
            int r0 = r0 + 19
            int r1 = r0 % 128
            setMin = r1
            int r0 = r0 % 2
            if (r0 != 0) goto L_0x00db
            r0 = 8
            int r0 = r0 / r4
            return r8
        L_0x00d9:
            r8 = move-exception
            throw r8
        L_0x00db:
            return r8
        L_0x00dc:
            r8 = move-exception
            java.lang.String r0 = "CctTransportBackend"
            java.lang.String r1 = "Could not make request to the backend"
            com.google.android.datatransport.runtime.logging.Logging.e(r0, r1, r8)
            com.google.android.datatransport.runtime.backends.BackendResponse r8 = com.google.android.datatransport.runtime.backends.BackendResponse.transientError()
            return r8
        L_0x00e9:
            r8 = move-exception
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.datatransport.cct.CctTransportBackend.send(com.google.android.datatransport.runtime.backends.BackendRequest):com.google.android.datatransport.runtime.backends.BackendResponse");
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [com.google.android.datatransport.cct.CctTransportBackend$HttpRequest] */
    public static /* synthetic */ HttpRequest lambda$send$0(HttpRequest httpRequest, HttpResponse httpResponse) {
        try {
            int i = setMax + 89;
            setMin = i % 128;
            int i2 = i % 2;
            ? r3 = 0;
            if ((httpResponse.redirectUrl != null ? 'G' : 'b') == 'b') {
                return r3;
            }
            int i3 = setMin + 71;
            setMax = i3 % 128;
            if ((i3 % 2 != 0 ? 'M' : 23) != 23) {
                Logging.d(LOG_TAG, "Following redirect to: %s", (Object) httpResponse.redirectUrl);
                HttpRequest withUrl = httpRequest.withUrl(httpResponse.redirectUrl);
                int length2 = r3.length;
                return withUrl;
            }
            Logging.d(LOG_TAG, "Following redirect to: %s", (Object) httpResponse.redirectUrl);
            return httpRequest.withUrl(httpResponse.redirectUrl);
        } catch (Exception e) {
            throw e;
        }
    }

    @VisibleForTesting
    static long getTzOffset() {
        int i = setMax + 103;
        setMin = i % 128;
        int i2 = i % 2;
        try {
            Calendar.getInstance();
            try {
                long offset = (long) (TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / 1000);
                int i3 = setMax + 73;
                setMin = i3 % 128;
                int i4 = i3 % 2;
                return offset;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public static final class HttpResponse {
        final int code;
        final long nextRequestMillis;
        @Nullable
        final URL redirectUrl;

        HttpResponse(int i, @Nullable URL url, long j) {
            this.code = i;
            this.redirectUrl = url;
            this.nextRequestMillis = j;
        }
    }

    public static final class HttpRequest {
        @Nullable
        final String apiKey;
        final BatchedLogRequest requestBody;
        final URL url;

        HttpRequest(URL url2, BatchedLogRequest batchedLogRequest, @Nullable String str) {
            this.url = url2;
            this.requestBody = batchedLogRequest;
            this.apiKey = str;
        }

        /* access modifiers changed from: package-private */
        public final HttpRequest withUrl(URL url2) {
            return new HttpRequest(url2, this.requestBody, this.apiKey);
        }
    }

    private static String setMin(char[] cArr) {
        int i = setMin + 81;
        setMax = i % 128;
        if (i % 2 != 0) {
        }
        char[] length2 = onActivityPreCreated.length(length, cArr);
        int i2 = 4;
        while (true) {
            if ((i2 < length2.length ? '\'' : 'L') != '\'') {
                return new String(length2, 4, length2.length - 4);
            }
            int i3 = setMax + 107;
            setMin = i3 % 128;
            if (i3 % 2 == 0) {
                length2[i2] = (char) ((int) (((long) (length2[i2] ^ length2[i2 - 2])) ^ (((long) (i2 >>> 4)) / length)));
                i2 += 97;
            } else {
                length2[i2] = (char) ((int) (((long) (length2[i2] ^ length2[i2 % 4])) ^ (((long) (i2 - 4)) * length)));
                i2++;
            }
        }
    }
}
