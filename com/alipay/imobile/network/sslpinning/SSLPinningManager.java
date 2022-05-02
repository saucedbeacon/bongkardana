package com.alipay.imobile.network.sslpinning;

import android.content.Context;
import android.content.res.AssetManager;
import android.media.AudioTrack;
import android.net.http.X509TrustManagerExtensions;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.widget.ExpandableListView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.alibaba.griver.base.common.utils.NetworkUtils;
import com.alibaba.griver.image.framework.meta.ImageFileType;
import com.alipay.iap.android.common.log.LoggerWrapper;
import com.alipay.imobile.network.sslpinning.api.ISSLPinningManager;
import com.alipay.imobile.network.sslpinning.api.OnAddRemoteCertificatesListener;
import com.alipay.imobile.network.sslpinning.b.b;
import com.alipay.imobile.network.sslpinning.db.CertificateDatabase;
import com.alipay.imobile.network.sslpinning.db.c;
import com.google.common.base.Ascii;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import o.onActivityPostResumed;
import o.upFrom;

public class SSLPinningManager implements ISSLPinningManager {

    /* renamed from: a  reason: collision with root package name */
    private static String f9114a = "SSLPinning";
    private static int getMax = 1;
    private static int getMin;
    public static final int length = 90;
    private static int[] setMax;
    public static final byte[] setMin = {110, -78, Ascii.EM, 77, 6, -24, Ascii.DC2, 48, -72, Ascii.VT, -1, -21, 0, 6, -14, -8, ImageFileType.HEAD_HEVC_0, -56, -5, -16, -5, 67, -24, -37, -16, -5, 8, 0, -6, 3, -1, -22, Ascii.FF, Ascii.FS, -30, -5, -20, 2, -6, -10, -1, -18, 40, -40, -8, -4, Ascii.DLE, -16, 8, -5};
    private int b;
    private Context c;
    private X509TrustManagerExtensions d;
    private final CertificateDatabase e;
    private final Handler f = new Handler(Looper.getMainLooper());
    private List<Certificate> g = new ArrayList();

    static {
        setMin();
        int i = getMax + 31;
        getMin = i % 128;
        if (!(i % 2 == 0)) {
            int i2 = 74 / 0;
        }
    }

    static /* synthetic */ CertificateDatabase a(SSLPinningManager sSLPinningManager) {
        CertificateDatabase certificateDatabase;
        try {
            int i = getMin + 45;
            getMax = i % 128;
            if (i % 2 != 0) {
                certificateDatabase = sSLPinningManager.e;
            } else {
                certificateDatabase = sSLPinningManager.e;
                Object[] objArr = null;
                int length2 = objArr.length;
            }
            int i2 = getMin + 53;
            getMax = i2 % 128;
            int i3 = i2 % 2;
            return certificateDatabase;
        } catch (Exception e2) {
            throw e2;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0022, code lost:
        if (r3.d != null) goto L_0x0024;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x005a, code lost:
        throw new javax.net.ssl.SSLException("X509TrustManagerExtensions is not available");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x005b, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x005c, code lost:
        throw r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        if (r3.d != null) goto L_0x0024;
     */
    @androidx.annotation.RequiresApi(api = 17)
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.util.List<java.security.cert.X509Certificate> a(javax.net.ssl.HttpsURLConnection r4) throws javax.net.ssl.SSLException {
        /*
            r3 = this;
            int r0 = getMin
            int r0 = r0 + 113
            int r1 = r0 % 128
            getMax = r1
            int r0 = r0 % 2
            r1 = 10
            if (r0 != 0) goto L_0x0011
            r0 = 10
            goto L_0x0013
        L_0x0011:
            r0 = 32
        L_0x0013:
            if (r0 == r1) goto L_0x001c
            android.net.http.X509TrustManagerExtensions r0 = r3.d     // Catch:{ Exception -> 0x001a }
            if (r0 == 0) goto L_0x0053
            goto L_0x0024
        L_0x001a:
            r4 = move-exception
            throw r4
        L_0x001c:
            android.net.http.X509TrustManagerExtensions r0 = r3.d
            r1 = 49
            int r1 = r1 / 0
            if (r0 == 0) goto L_0x0053
        L_0x0024:
            java.security.cert.Certificate[] r0 = r4.getServerCertificates()
            int r1 = r0.length
            java.lang.Class<java.security.cert.X509Certificate[]> r2 = java.security.cert.X509Certificate[].class
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r1, r2)
            java.security.cert.X509Certificate[] r0 = (java.security.cert.X509Certificate[]) r0
            java.net.URL r4 = r4.getURL()
            java.lang.String r4 = r4.getHost()
            android.net.http.X509TrustManagerExtensions r1 = r3.d     // Catch:{ CertificateException -> 0x004c }
            java.lang.String r2 = "RSA"
            java.util.List r4 = r1.checkServerTrusted(r0, r2, r4)     // Catch:{ CertificateException -> 0x004c }
            int r0 = getMin
            int r0 = r0 + 61
            int r1 = r0 % 128
            getMax = r1
            int r0 = r0 % 2
            return r4
        L_0x004c:
            r4 = move-exception
            javax.net.ssl.SSLException r0 = new javax.net.ssl.SSLException
            r0.<init>(r4)
            throw r0
        L_0x0053:
            javax.net.ssl.SSLException r4 = new javax.net.ssl.SSLException
            java.lang.String r0 = "X509TrustManagerExtensions is not available"
            r4.<init>(r0)     // Catch:{ Exception -> 0x005b }
            throw r4     // Catch:{ Exception -> 0x005b }
        L_0x005b:
            r4 = move-exception
            throw r4
        L_0x005d:
            r4 = move-exception
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.imobile.network.sslpinning.SSLPinningManager.a(javax.net.ssl.HttpsURLConnection):java.util.List");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0048  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String setMin(int r6, int r7, byte r8) {
        /*
            int r0 = getMin
            int r0 = r0 + 39
            int r1 = r0 % 128
            getMax = r1
            int r0 = r0 % 2
            byte[] r0 = setMin
            int r7 = r7 * 36
            int r7 = r7 + 4
            int r6 = r6 * 26
            int r6 = 37 - r6
            int r8 = r8 * 3
            int r8 = r8 + 103
            byte[] r1 = new byte[r6]
            int r6 = r6 + -1
            r2 = 46
            if (r0 != 0) goto L_0x0023
            r3 = 90
            goto L_0x0025
        L_0x0023:
            r3 = 46
        L_0x0025:
            r4 = 0
            if (r3 == r2) goto L_0x0039
            int r8 = getMax
            int r8 = r8 + 83
            int r2 = r8 % 128
            getMin = r2
            int r8 = r8 % 2
            r8 = r7
            r2 = r1
            r3 = 0
            r7 = r6
            r1 = r0
            r0 = r8
            goto L_0x0053
        L_0x0039:
            r2 = 0
            r5 = r8
            r8 = r7
            r7 = r5
        L_0x003d:
            byte r3 = (byte) r7
            r1[r2] = r3
            if (r2 != r6) goto L_0x0048
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r4)
            return r6
        L_0x0048:
            int r2 = r2 + 1
            byte r3 = r0[r8]
            r5 = r7
            r7 = r6
            r6 = r3
            r3 = r2
            r2 = r1
            r1 = r0
            r0 = r5
        L_0x0053:
            int r6 = -r6
            int r8 = r8 + 1
            int r0 = r0 + r6
            int r6 = r0 + -3
            r0 = r1
            r1 = r2
            r2 = r3
            r5 = r7
            r7 = r6
            r6 = r5
            goto L_0x003d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.imobile.network.sslpinning.SSLPinningManager.setMin(int, int, byte):java.lang.String");
    }

    static void setMin() {
        setMax = new int[]{2055484129, 871602744, -1946846156, -603741097, 2063221535, -417332641, 836119885, -1128665428, 454609807, -512827023, 352605424, -596660009, -1558994881, -1999528728, 185516775, -1175313450, -159723606, -186194102};
    }

    public void addAndPersistRemoteCertificates(@NonNull final List<String> list, @Nullable final OnAddRemoteCertificatesListener onAddRemoteCertificatesListener) {
        this.f.post(new Runnable() {
            public void run() {
                b bVar = new b(onAddRemoteCertificatesListener, SSLPinningManager.a(SSLPinningManager.this).a());
                Executor executor = AsyncTask.SERIAL_EXECUTOR;
                List list = list;
                bVar.executeOnExecutor(executor, list.toArray(new String[list.size()]));
            }
        });
        int i = getMax + 11;
        getMin = i % 128;
        int i2 = i % 2;
    }

    public void addCertificates(@NonNull List<String> list) throws CertificateException, IOException {
        int i = getMax + 103;
        getMin = i % 128;
        if ((i % 2 != 0 ? '%' : '3') != '3') {
            int i2 = 63 / 0;
            if (list.size() == 0) {
                return;
            }
        } else if (list.size() == 0) {
            return;
        }
        int i3 = getMin + 77;
        getMax = i3 % 128;
        int i4 = i3 % 2;
        for (int i5 = 0; i5 < list.size(); i5++) {
            CertificateFactory instance = CertificateFactory.getInstance("X.509");
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new ByteArrayInputStream(list.get(i5).getBytes(Charset.forName(setMin(ExpandableListView.getPackedPositionGroup(0) + 5, new int[]{173139373, 1571638753, -185999739, 202002364}).intern()))));
            this.g.add(instance.generateCertificate(bufferedInputStream));
            bufferedInputStream.close();
        }
    }

    @NonNull
    public List<Certificate> getCertificates() {
        int i = getMin + 39;
        getMax = i % 128;
        int i2 = i % 2;
        List<c> a2 = this.e.a().a();
        if (a2.size() <= 0) {
            return this.g;
        }
        ArrayList arrayList = new ArrayList(this.g);
        int i3 = 0;
        int i4 = getMax + 49;
        getMin = i4 % 128;
        int i5 = i4 % 2;
        while (true) {
            try {
                if ((i3 < a2.size() ? 'V' : 10) == 10) {
                    return arrayList;
                }
                try {
                    arrayList.add(a2.get(i3).b);
                    i3++;
                } catch (Exception e2) {
                    throw e2;
                }
            } catch (Exception e3) {
                throw e3;
            }
        }
    }

    public void setPinningMode(int i) {
        String str;
        try {
            this.b = i;
            String str2 = f9114a;
            try {
                StringBuilder sb = new StringBuilder("Set Pinning mode to ");
                if (i == 0) {
                    int i2 = getMin + 1;
                    getMax = i2 % 128;
                    int i3 = i2 % 2;
                    str = NetworkUtils.NETWORK_TYPE_NONE;
                } else {
                    str = "CERTIFICATE";
                }
                sb.append(str);
                LoggerWrapper.d(str2, sb.toString());
                int i4 = getMin + 37;
                getMax = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 15 / 0;
                }
            } catch (Exception e2) {
                throw e2;
            }
        } catch (Exception e3) {
            throw e3;
        }
    }

    public void setPresetCertificateFolderPath(@NonNull String str) {
        String str2 = str;
        ArrayList arrayList = new ArrayList();
        try {
            String[] list = this.c.getAssets().list(str2);
            if (list != null) {
                if (list.length > 0) {
                    int i = getMax + 107;
                    getMin = i % 128;
                    int i2 = 2;
                    int i3 = i % 2;
                    int i4 = 0;
                    while (i4 < list.length) {
                        AssetManager assets = this.c.getAssets();
                        StringBuilder sb = new StringBuilder();
                        sb.append(str2);
                        sb.append("/");
                        sb.append(list[i4]);
                        Object[] objArr = new Object[i2];
                        objArr[1] = sb.toString();
                        objArr[0] = assets;
                        Class[] clsArr = new Class[i2];
                        clsArr[0] = AssetManager.class;
                        clsArr[1] = String.class;
                        InputStream inputStream = (InputStream) ((Class) upFrom.setMax((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 19, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) (56348 - TextUtils.indexOf("", "")))).getMethod("getMin", clsArr).invoke((Object) null, objArr);
                        try {
                            int i5 = getMin + 25;
                            try {
                                getMax = i5 % 128;
                                int i6 = i5 % 2;
                                int i7 = getMin + 107;
                                getMax = i7 % 128;
                                int i8 = i7 % i2;
                                byte b2 = (byte) setMin[12];
                                Class<?> cls = Class.forName(setMin(b2, (byte) b2, (byte) (-setMin[10])));
                                byte b3 = (byte) (-setMin[10]);
                                Object invoke = cls.getMethod(setMin(b3, (byte) b3, (byte) setMin[12]), new Class[]{String.class}).invoke((Object) null, new Object[]{"X.509"});
                                int i9 = getMax + 73;
                                getMin = i9 % 128;
                                int i10 = i9 % 2;
                                Object[] objArr2 = {inputStream};
                                byte b4 = (byte) setMin[12];
                                arrayList.add(Class.forName(setMin(b4, (byte) b4, (byte) (-setMin[10]))).getMethod("generateCertificate", new Class[]{InputStream.class}).invoke(invoke, objArr2));
                                inputStream.close();
                                i4++;
                                i2 = 2;
                            } catch (Exception e2) {
                                throw e2;
                            }
                        } catch (Exception e3) {
                            throw e3;
                        }
                    }
                }
            }
            this.g.addAll(arrayList);
        } catch (IOException | CertificateException unused) {
            LoggerWrapper.d(f9114a, "Error in getting the certificate from assets folder");
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002b, code lost:
        if (r8.b != 0) goto L_0x002d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001c, code lost:
        if (r8.b != 0) goto L_0x002d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void validateCertificates(@androidx.annotation.NonNull javax.net.ssl.HttpsURLConnection r9) throws javax.net.ssl.SSLException {
        /*
            r8 = this;
            int r0 = getMax
            int r0 = r0 + 61
            int r1 = r0 % 128
            getMin = r1
            int r0 = r0 % 2
            r1 = 96
            if (r0 == 0) goto L_0x0011
            r0 = 96
            goto L_0x0013
        L_0x0011:
            r0 = 49
        L_0x0013:
            r2 = 0
            if (r0 == r1) goto L_0x0022
            java.util.List r0 = r8.getCertificates()     // Catch:{ Exception -> 0x001f }
            int r1 = r8.b     // Catch:{ Exception -> 0x001f }
            if (r1 == 0) goto L_0x012f
            goto L_0x002d
        L_0x001f:
            r9 = move-exception
            goto L_0x012e
        L_0x0022:
            java.util.List r0 = r8.getCertificates()
            int r1 = r8.b
            r3 = 86
            int r3 = r3 / r2
            if (r1 == 0) goto L_0x012f
        L_0x002d:
            boolean r1 = r0.isEmpty()     // Catch:{ Exception -> 0x001f }
            if (r1 == 0) goto L_0x0035
            goto L_0x012f
        L_0x0035:
            java.net.URL r1 = r9.getURL()
            java.lang.String r1 = r1.getHost()
            r3 = 0
            r4 = 0
        L_0x003f:
            int r5 = r0.size()
            r6 = 93
            if (r3 >= r5) goto L_0x004a
            r5 = 93
            goto L_0x004c
        L_0x004a:
            r5 = 19
        L_0x004c:
            if (r5 == r6) goto L_0x004f
            goto L_0x0070
        L_0x004f:
            java.lang.Object r5 = r0.get(r3)
            java.security.cert.Certificate r5 = (java.security.cert.Certificate) r5
            boolean r6 = r5 instanceof java.security.cert.X509Certificate
            r7 = 80
            if (r6 == 0) goto L_0x005e
            r6 = 80
            goto L_0x0060
        L_0x005e:
            r6 = 73
        L_0x0060:
            if (r6 == r7) goto L_0x0063
            goto L_0x006d
        L_0x0063:
            java.security.cert.X509Certificate r5 = (java.security.cert.X509Certificate) r5
            com.alipay.imobile.network.sslpinning.a.a r4 = com.alipay.imobile.network.sslpinning.a.a.f9400a
            boolean r4 = r4.a((java.lang.String) r1, (java.security.cert.X509Certificate) r5)
            if (r4 != 0) goto L_0x0070
        L_0x006d:
            int r3 = r3 + 1
            goto L_0x003f
        L_0x0070:
            if (r4 != 0) goto L_0x008b
            java.lang.String r9 = f9114a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "No certificates pinned for "
            r0.<init>(r2)
            r0.append(r1)
            java.lang.String r1 = ", validation bypassed"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.alipay.iap.android.common.log.LoggerWrapper.d(r9, r0)
            return
        L_0x008b:
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x012c }
            r4 = 17
            if (r3 >= r4) goto L_0x009c
            int r9 = getMin
            int r9 = r9 + 43
            int r0 = r9 % 128
            getMax = r0
            int r9 = r9 % 2
            return
        L_0x009c:
            java.util.List r9 = r8.a((javax.net.ssl.HttpsURLConnection) r9)
            java.util.Iterator r9 = r9.iterator()
            java.lang.String r3 = ""
        L_0x00a6:
            boolean r4 = r9.hasNext()
            if (r4 == 0) goto L_0x010d
            java.lang.Object r4 = r9.next()
            java.security.cert.X509Certificate r4 = (java.security.cert.X509Certificate) r4
            boolean r5 = r0.contains(r4)
            if (r5 == 0) goto L_0x00eb
            int r9 = getMin
            int r9 = r9 + 67
            int r0 = r9 % 128
            getMax = r0
            int r9 = r9 % 2
            if (r9 != 0) goto L_0x00c6
            r9 = 0
            goto L_0x00c7
        L_0x00c6:
            r9 = 1
        L_0x00c7:
            java.lang.String r0 = "Server certificates validation successful for "
            if (r9 == 0) goto L_0x00d9
            java.lang.String r9 = f9114a     // Catch:{ Exception -> 0x012c }
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ Exception -> 0x012c }
            java.lang.String r0 = r0.concat(r1)     // Catch:{ Exception -> 0x012c }
            com.alipay.iap.android.common.log.LoggerWrapper.d(r9, r0)     // Catch:{ Exception -> 0x012c }
            return
        L_0x00d9:
            java.lang.String r9 = f9114a
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r0 = r0.concat(r1)
            com.alipay.iap.android.common.log.LoggerWrapper.d(r9, r0)
            r9 = 6
            int r9 = r9 / r2
            return
        L_0x00e9:
            r9 = move-exception
            throw r9
        L_0x00eb:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r3)
            java.lang.String r3 = "    "
            r5.append(r3)
            java.security.Principal r3 = r4.getSubjectDN()
            java.lang.String r3 = r3.toString()
            r5.append(r3)
            java.lang.String r3 = "\n"
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            goto L_0x00a6
        L_0x010d:
            java.lang.String r9 = f9114a
            java.lang.String r0 = java.lang.String.valueOf(r1)
            java.lang.String r1 = "Server certificates validation failed for "
            java.lang.String r0 = r1.concat(r0)
            com.alipay.iap.android.common.log.LoggerWrapper.d(r9, r0)
            javax.net.ssl.SSLPeerUnverifiedException r9 = new javax.net.ssl.SSLPeerUnverifiedException
            java.lang.String r0 = java.lang.String.valueOf(r3)
            java.lang.String r1 = "Certificate pinning failure\n  Peer certificate chain:\n"
            java.lang.String r0 = r1.concat(r0)
            r9.<init>(r0)
            throw r9
        L_0x012c:
            r9 = move-exception
            throw r9
        L_0x012e:
            throw r9
        L_0x012f:
            java.lang.String r9 = f9114a
            java.lang.String r0 = "Pinning mode is NONE or local certificate list is empty, validation bypassed"
            com.alipay.iap.android.common.log.LoggerWrapper.d(r9, r0)
            return
        L_0x0137:
            r9 = move-exception
            goto L_0x013a
        L_0x0139:
            throw r9
        L_0x013a:
            goto L_0x0139
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.imobile.network.sslpinning.SSLPinningManager.validateCertificates(javax.net.ssl.HttpsURLConnection):void");
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [java.security.KeyStore] */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        r5 = (javax.net.ssl.X509TrustManager) r5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SSLPinningManager(@androidx.annotation.NonNull android.content.Context r9) {
        /*
            r8 = this;
            r8.<init>()
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            r8.f = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r8.g = r0
            r8.c = r9
            java.lang.Class<com.alipay.imobile.network.sslpinning.db.CertificateDatabase> r0 = com.alipay.imobile.network.sslpinning.db.CertificateDatabase.class
            java.lang.String r1 = "database-cert"
            androidx.room.RoomDatabase$setMax r9 = o.setPrimaryBackground.setMin(r9, r0, r1)
            r0 = 1
            r9.getMin = r0
            androidx.room.RoomDatabase r9 = r9.getMin()
            com.alipay.imobile.network.sslpinning.db.CertificateDatabase r9 = (com.alipay.imobile.network.sslpinning.db.CertificateDatabase) r9
            r8.e = r9
            java.lang.String r9 = javax.net.ssl.TrustManagerFactory.getDefaultAlgorithm()     // Catch:{ KeyStoreException | NoSuchAlgorithmException -> 0x0084 }
            javax.net.ssl.TrustManagerFactory r9 = javax.net.ssl.TrustManagerFactory.getInstance(r9)     // Catch:{ KeyStoreException | NoSuchAlgorithmException -> 0x0084 }
            r1 = 0
            r9.init(r1)     // Catch:{ KeyStoreException | NoSuchAlgorithmException -> 0x0084 }
            javax.net.ssl.TrustManager[] r9 = r9.getTrustManagers()     // Catch:{ KeyStoreException | NoSuchAlgorithmException -> 0x0084 }
            int r2 = r9.length     // Catch:{ KeyStoreException | NoSuchAlgorithmException -> 0x0084 }
            r3 = 0
            r4 = 0
        L_0x003d:
            if (r4 >= r2) goto L_0x0041
            r5 = 1
            goto L_0x0042
        L_0x0041:
            r5 = 0
        L_0x0042:
            if (r5 == r0) goto L_0x0046
            r5 = r1
            goto L_0x0066
        L_0x0046:
            r5 = r9[r4]     // Catch:{ KeyStoreException | NoSuchAlgorithmException -> 0x0084 }
            boolean r6 = r5 instanceof javax.net.ssl.X509TrustManager     // Catch:{ KeyStoreException | NoSuchAlgorithmException -> 0x0084 }
            r7 = 22
            if (r6 == 0) goto L_0x0051
            r6 = 22
            goto L_0x0053
        L_0x0051:
            r6 = 40
        L_0x0053:
            if (r6 == r7) goto L_0x0064
            int r4 = r4 + 1
            int r5 = getMin     // Catch:{ Exception -> 0x0062 }
            int r5 = r5 + 95
            int r6 = r5 % 128
            getMax = r6     // Catch:{ Exception -> 0x0062 }
            int r5 = r5 % 2
            goto L_0x003d
        L_0x0062:
            r9 = move-exception
            throw r9
        L_0x0064:
            javax.net.ssl.X509TrustManager r5 = (javax.net.ssl.X509TrustManager) r5     // Catch:{ KeyStoreException | NoSuchAlgorithmException -> 0x0084 }
        L_0x0066:
            int r9 = android.os.Build.VERSION.SDK_INT     // Catch:{ KeyStoreException | NoSuchAlgorithmException -> 0x0084 }
            r0 = 17
            if (r9 < r0) goto L_0x0073
            android.net.http.X509TrustManagerExtensions r9 = new android.net.http.X509TrustManagerExtensions     // Catch:{ KeyStoreException | NoSuchAlgorithmException -> 0x0084 }
            r9.<init>(r5)     // Catch:{ KeyStoreException | NoSuchAlgorithmException -> 0x0084 }
            r8.d = r9     // Catch:{ KeyStoreException | NoSuchAlgorithmException -> 0x0084 }
        L_0x0073:
            int r9 = getMax
            int r9 = r9 + 19
            int r0 = r9 % 128
            getMin = r0
            int r9 = r9 % 2
            if (r9 == 0) goto L_0x0083
            int r9 = r1.length     // Catch:{ all -> 0x0081 }
            return
        L_0x0081:
            r9 = move-exception
            throw r9
        L_0x0083:
            return
        L_0x0084:
            java.lang.String r9 = f9114a
            java.lang.String r0 = "Failed to construct X509TrustManagerExtensions"
            com.alipay.iap.android.common.log.LoggerWrapper.d(r9, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.imobile.network.sslpinning.SSLPinningManager.<init>(android.content.Context):void");
    }

    private static String setMin(int i, int[] iArr) {
        int i2;
        int[] iArr2;
        char[] cArr;
        char[] cArr2;
        int i3 = getMin + 57;
        getMax = i3 % 128;
        if ((i3 % 2 == 0 ? '^' : '(') != '^') {
            cArr2 = new char[4];
            cArr = new char[(iArr.length << 1)];
            iArr2 = (int[]) setMax.clone();
            i2 = 0;
        } else {
            cArr2 = new char[3];
            cArr = new char[(iArr.length % 1)];
            iArr2 = (int[]) setMax.clone();
            i2 = 1;
        }
        try {
            int i4 = getMax + 53;
            try {
                getMin = i4 % 128;
                int i5 = i4 % 2;
                while (true) {
                    if (i2 >= iArr.length) {
                        return new String(cArr, 0, i);
                    }
                    int i6 = getMin + 11;
                    getMax = i6 % 128;
                    int i7 = i6 % 2;
                    cArr2[0] = (char) (iArr[i2] >> 16);
                    cArr2[1] = (char) iArr[i2];
                    int i8 = i2 + 1;
                    cArr2[2] = (char) (iArr[i8] >> 16);
                    cArr2[3] = (char) iArr[i8];
                    onActivityPostResumed.getMin(cArr2, iArr2, false);
                    int i9 = i2 << 1;
                    cArr[i9] = cArr2[0];
                    cArr[i9 + 1] = cArr2[1];
                    cArr[i9 + 2] = cArr2[2];
                    cArr[i9 + 3] = cArr2[3];
                    i2 += 2;
                }
            } catch (Exception e2) {
                throw e2;
            }
        } catch (Exception e3) {
            throw e3;
        }
    }
}
