package com.google.firebase.crashlytics.internal.send;

import android.content.Context;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import androidx.annotation.NonNull;
import com.google.android.datatransport.Encoding;
import com.google.android.datatransport.Event;
import com.google.android.datatransport.Transformer;
import com.google.android.datatransport.Transport;
import com.google.android.datatransport.cct.CCTDestination;
import com.google.android.datatransport.runtime.Destination;
import com.google.android.datatransport.runtime.TransportRuntime;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.crashlytics.internal.common.CrashlyticsReportWithSessionId;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform;
import java.nio.charset.Charset;
import o.OnLifecycleEvent;
import o.addViewInLayout;
import o.removeViewAt;

public class DataTransportCrashlyticsReportSender {
    private static final String CRASHLYTICS_API_KEY = mergeStrings("AzSBpY4F0rHiHFdinTvM", "IayrSTFL9eJ69YeSUO2");
    private static final String CRASHLYTICS_ENDPOINT = mergeStrings("hts/cahyiseot-agolai.o/1frlglgc/aclg", "tp:/rsltcrprsp.ogepscmv/ieo/eaybtho");
    private static final String CRASHLYTICS_TRANSPORT_NAME = "FIREBASE_CRASHLYTICS_REPORT";
    private static final Transformer<CrashlyticsReport, byte[]> DEFAULT_TRANSFORM = addViewInLayout.setMin;
    private static final CrashlyticsReportJsonTransform TRANSFORM = new CrashlyticsReportJsonTransform();
    private static long getMax = 0;
    private static int getMin = 1;
    private static char length;
    private static int setMax;
    private static int setMin;
    private final Transport<CrashlyticsReport> transport;
    private final Transformer<CrashlyticsReport, byte[]> transportTransform;

    static void getMin() {
        length = 3090;
        getMax = 0;
        setMax = 0;
    }

    public static /* synthetic */ byte[] length(CrashlyticsReport crashlyticsReport) {
        int i = setMin + 107;
        getMin = i % 128;
        int i2 = i % 2;
        byte[] lambda$static$0 = lambda$static$0(crashlyticsReport);
        int i3 = getMin + 79;
        setMin = i3 % 128;
        int i4 = i3 % 2;
        return lambda$static$0;
    }

    public static /* synthetic */ void setMax(TaskCompletionSource taskCompletionSource, CrashlyticsReportWithSessionId crashlyticsReportWithSessionId, Exception exc) {
        int i = setMin + 91;
        getMin = i % 128;
        char c = i % 2 == 0 ? '`' : '(';
        lambda$sendReport$1(taskCompletionSource, crashlyticsReportWithSessionId, exc);
        if (c == '`') {
            Object[] objArr = null;
            int length2 = objArr.length;
        }
    }

    static {
        getMin();
        int i = setMin + 123;
        getMin = i % 128;
        if ((i % 2 == 0 ? '%' : '4') != '4') {
            Object[] objArr = null;
            int length2 = objArr.length;
        }
    }

    private static /* synthetic */ byte[] lambda$static$0(CrashlyticsReport crashlyticsReport) {
        int i = setMin + 81;
        getMin = i % 128;
        int i2 = i % 2;
        byte[] bytes = TRANSFORM.reportToJson(crashlyticsReport).getBytes(Charset.forName(length(new char[]{8969, 22112, 25713, 22492}, TextUtils.indexOf("", '0', 0) + 1901486116, new char[]{28697, 29818, 40908, 4837, 65113}, new char[]{0, 0, 0, 0}, (char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 56419)).intern()));
        int i3 = setMin + 105;
        getMin = i3 % 128;
        if ((i3 % 2 == 0 ? '+' : '#') == '#') {
            return bytes;
        }
        Object obj = null;
        super.hashCode();
        return bytes;
    }

    public static DataTransportCrashlyticsReportSender create(Context context) {
        TransportRuntime.initialize(context);
        DataTransportCrashlyticsReportSender dataTransportCrashlyticsReportSender = new DataTransportCrashlyticsReportSender(TransportRuntime.getInstance().newFactory((Destination) new CCTDestination(CRASHLYTICS_ENDPOINT, CRASHLYTICS_API_KEY)).getTransport(CRASHLYTICS_TRANSPORT_NAME, CrashlyticsReport.class, Encoding.of("json"), DEFAULT_TRANSFORM), DEFAULT_TRANSFORM);
        try {
            int i = setMin + 121;
            getMin = i % 128;
            if ((i % 2 == 0 ? '@' : 'N') != '@') {
                return dataTransportCrashlyticsReportSender;
            }
            int i2 = 95 / 0;
            return dataTransportCrashlyticsReportSender;
        } catch (Exception e) {
            throw e;
        }
    }

    DataTransportCrashlyticsReportSender(Transport<CrashlyticsReport> transport2, Transformer<CrashlyticsReport, byte[]> transformer) {
        this.transport = transport2;
        this.transportTransform = transformer;
    }

    @NonNull
    public Task<CrashlyticsReportWithSessionId> sendReport(@NonNull CrashlyticsReportWithSessionId crashlyticsReportWithSessionId) {
        CrashlyticsReport report = crashlyticsReportWithSessionId.getReport();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.transport.schedule(Event.ofUrgent(report), new removeViewAt(taskCompletionSource, crashlyticsReportWithSessionId));
        Task<CrashlyticsReportWithSessionId> task = taskCompletionSource.getTask();
        int i = getMin + 21;
        setMin = i % 128;
        if ((i % 2 != 0 ? 'P' : 14) != 'P') {
            return task;
        }
        Object obj = null;
        super.hashCode();
        return task;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001e, code lost:
        if (r2 != 3) goto L_0x0020;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        r4.trySetException(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0039, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x003a, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x003b, code lost:
        throw r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0014, code lost:
        if (r6 != null) goto L_0x0036;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static /* synthetic */ void lambda$sendReport$1(com.google.android.gms.tasks.TaskCompletionSource r4, com.google.firebase.crashlytics.internal.common.CrashlyticsReportWithSessionId r5, java.lang.Exception r6) {
        /*
            int r0 = getMin
            int r0 = r0 + 113
            int r1 = r0 % 128
            setMin = r1
            int r0 = r0 % 2
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0010
            r0 = 1
            goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            r3 = 0
            if (r0 == r1) goto L_0x0017
            if (r6 == 0) goto L_0x0020
            goto L_0x0036
        L_0x0017:
            super.hashCode()     // Catch:{ all -> 0x003c }
            r0 = 3
            if (r6 == 0) goto L_0x001e
            r2 = 3
        L_0x001e:
            if (r2 == r0) goto L_0x0036
        L_0x0020:
            r4.trySetResult(r5)
            int r4 = setMin
            int r4 = r4 + 21
            int r5 = r4 % 128
            getMin = r5
            int r4 = r4 % 2
            if (r4 != 0) goto L_0x0035
            super.hashCode()     // Catch:{ all -> 0x0033 }
            return
        L_0x0033:
            r4 = move-exception
            throw r4
        L_0x0035:
            return
        L_0x0036:
            r4.trySetException(r6)     // Catch:{ Exception -> 0x003a }
            return
        L_0x003a:
            r4 = move-exception
            throw r4
        L_0x003c:
            r4 = move-exception
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.crashlytics.internal.send.DataTransportCrashlyticsReportSender.lambda$sendReport$1(com.google.android.gms.tasks.TaskCompletionSource, com.google.firebase.crashlytics.internal.common.CrashlyticsReportWithSessionId, java.lang.Exception):void");
    }

    private static String mergeStrings(String str, String str2) {
        int length2 = str.length() - str2.length();
        if (length2 < 0 || length2 > 1) {
            throw new IllegalArgumentException("Invalid input received");
        }
        StringBuilder sb = new StringBuilder(str.length() + str2.length());
        int i = setMin + 69;
        getMin = i % 128;
        int i2 = i % 2;
        int i3 = 0;
        while (i3 < str.length()) {
            int i4 = getMin + 89;
            setMin = i4 % 128;
            if ((i4 % 2 != 0 ? 'E' : '/') != '/') {
                try {
                    sb.append(str.charAt(i3));
                    int length3 = str2.length();
                    Object[] objArr = null;
                    int length4 = objArr.length;
                    if (length3 <= i3) {
                        i3++;
                    }
                } catch (Exception e) {
                    throw e;
                }
            } else {
                sb.append(str.charAt(i3));
                if (str2.length() <= i3) {
                    i3++;
                }
            }
            sb.append(str2.charAt(i3));
            i3++;
        }
        try {
            return sb.toString();
        } catch (Exception e2) {
            throw e2;
        }
    }

    private static String length(char[] cArr, int i, char[] cArr2, char[] cArr3, char c) {
        int i2 = getMin + 85;
        setMin = i2 % 128;
        int i3 = i2 % 2;
        char[] cArr4 = (char[]) cArr.clone();
        char[] cArr5 = (char[]) cArr3.clone();
        cArr4[0] = (char) (c ^ cArr4[0]);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length2 = cArr2.length;
        char[] cArr6 = new char[length2];
        int i4 = 0;
        while (true) {
            if (i4 < length2) {
                int i5 = getMin + 113;
                setMin = i5 % 128;
                if ((i5 % 2 != 0 ? '3' : '.') != '.') {
                    try {
                        OnLifecycleEvent.length(cArr4, cArr5, i4);
                        try {
                            cArr6[i4] = (char) ((int) (((((long) (cArr2[i4] | cArr4[(i4 << 4) * 2])) - getMax) + ((long) setMax)) & ((long) length)));
                            i4 += 64;
                        } catch (Exception e) {
                            throw e;
                        }
                    } catch (Exception e2) {
                        throw e2;
                    }
                } else {
                    OnLifecycleEvent.length(cArr4, cArr5, i4);
                    cArr6[i4] = (char) ((int) (((((long) (cArr2[i4] ^ cArr4[(i4 + 3) % 4])) ^ getMax) ^ ((long) setMax)) ^ ((long) length)));
                    i4++;
                }
            } else {
                String str = new String(cArr6);
                int i6 = setMin + 59;
                getMin = i6 % 128;
                int i7 = i6 % 2;
                return str;
            }
        }
    }
}
