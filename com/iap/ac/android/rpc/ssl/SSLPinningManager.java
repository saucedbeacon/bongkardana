package com.iap.ac.android.rpc.ssl;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Color;
import android.net.http.X509TrustManagerExtensions;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ViewConfiguration;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.alibaba.griver.base.common.utils.NetworkUtils;
import com.alibaba.griver.image.framework.meta.ImageFileType;
import com.google.common.base.Ascii;
import com.iap.ac.android.common.log.ACLog;
import com.iap.ac.android.rpc.ssl.api.ISSLPinningManager;
import com.iap.ac.android.rpc.ssl.api.OnAddRemoteCertificatesListener;
import com.iap.ac.android.rpc.ssl.db.CertificateDatabase;
import com.iap.ac.android.rpc.ssl.db.CertificateEntity;
import com.iap.ac.android.rpc.ssl.okhttp.OkHostnameVerifier;
import com.iap.ac.android.rpc.ssl.task.RemoteCertificateDownloadTask;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLPeerUnverifiedException;
import o.upFrom;

public class SSLPinningManager implements ISSLPinningManager {
    private static String DEBUG_TAG = "SSLPinning";
    private static int equals = 1;
    private static long getMax;
    public static final int getMin = 64;
    private static char[] length;
    private static int setMax;
    public static final byte[] setMin = {84, -89, -78, Ascii.FF, 6, -24, Ascii.DC2, 48, -72, Ascii.VT, -1, -21, 0, 6, -14, -8, ImageFileType.HEAD_HEVC_0, -56, -5, -16, -5, 67, -24, -37, -16, -5, 8, 0, -6, 3, -1, -22, Ascii.FF, Ascii.FS, -30, -5, -20, 2, -6, -10, -1, -18, 40, -40, -8, -4, Ascii.DLE, -16, 8, -5};
    private final CertificateDatabase certificateDatabase;
    private Context context;
    private final Handler mainThreadHandler = new Handler(Looper.getMainLooper());
    private List<Certificate> pinnedCertificateList = new ArrayList();
    private int pinningMode;
    private X509TrustManagerExtensions x509TrustManagerExtensions;

    static void setMax() {
        length = new char[]{7273, 55268, 35682, 32437, 12852};
        getMax = 8310689084054293388L;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0048  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String setMin(int r7, byte r8, byte r9) {
        /*
            int r0 = equals
            int r0 = r0 + 61
            int r1 = r0 % 128
            setMax = r1
            int r0 = r0 % 2
            int r9 = r9 * 36
            int r9 = 40 - r9
            int r7 = r7 * 26
            int r7 = r7 + 11
            byte[] r0 = setMin
            int r8 = r8 * 3
            int r8 = r8 + 103
            byte[] r1 = new byte[r7]
            r2 = 87
            if (r0 != 0) goto L_0x0021
            r3 = 79
            goto L_0x0023
        L_0x0021:
            r3 = 87
        L_0x0023:
            r4 = 0
            if (r3 == r2) goto L_0x002b
            r2 = r1
            r5 = 0
            r1 = r0
            r0 = r9
            goto L_0x004f
        L_0x002b:
            r2 = 0
            r6 = r9
            r9 = r8
            r8 = r6
        L_0x002f:
            byte r3 = (byte) r9
            int r5 = r2 + 1
            r1[r2] = r3
            if (r5 != r7) goto L_0x0048
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r4)
            int r8 = equals     // Catch:{ Exception -> 0x0046 }
            int r8 = r8 + 11
            int r9 = r8 % 128
            setMax = r9     // Catch:{ Exception -> 0x0046 }
            int r8 = r8 % 2
            return r7
        L_0x0046:
            r7 = move-exception
            throw r7
        L_0x0048:
            byte r2 = r0[r8]
            r6 = r0
            r0 = r8
            r8 = r2
            r2 = r1
            r1 = r6
        L_0x004f:
            int r8 = -r8
            int r9 = r9 + r8
            int r9 = r9 + -3
            int r8 = r0 + 1
            r0 = r1
            r1 = r2
            r2 = r5
            goto L_0x002f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iap.ac.android.rpc.ssl.SSLPinningManager.setMin(int, byte, byte):java.lang.String");
    }

    static /* synthetic */ CertificateDatabase access$000(SSLPinningManager sSLPinningManager) {
        int i = equals + 45;
        setMax = i % 128;
        boolean z = false;
        boolean z2 = i % 2 == 0;
        Object[] objArr = null;
        CertificateDatabase certificateDatabase2 = sSLPinningManager.certificateDatabase;
        if (!z2) {
            int length2 = objArr.length;
        }
        int i2 = equals + 27;
        setMax = i2 % 128;
        if (i2 % 2 != 0) {
            z = true;
        }
        if (!z) {
            return certificateDatabase2;
        }
        super.hashCode();
        return certificateDatabase2;
    }

    static {
        setMax();
        int i = setMax + 85;
        equals = i % 128;
        int i2 = i % 2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v7, resolved type: javax.net.ssl.TrustManager[]} */
    /* JADX WARNING: type inference failed for: r5v4 */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0060, code lost:
        r9 = setMax + 23;
        equals = r9 % 128;
        r9 = r9 % 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        r1 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x006f, code lost:
        r9 = equals + 19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        setMax = r9 % 128;
        r9 = r9 % 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0078, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0079, code lost:
        throw r9;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SSLPinningManager(@androidx.annotation.NonNull android.content.Context r9) {
        /*
            r8 = this;
            r8.<init>()
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            r8.mainThreadHandler = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r8.pinnedCertificateList = r0
            r8.context = r9
            java.lang.Class<com.iap.ac.android.rpc.ssl.db.CertificateDatabase> r0 = com.iap.ac.android.rpc.ssl.db.CertificateDatabase.class
            java.lang.String r1 = "database-cert"
            androidx.room.RoomDatabase$setMax r9 = o.setPrimaryBackground.setMin(r9, r0, r1)
            r0 = 1
            r9.getMin = r0
            androidx.room.RoomDatabase r9 = r9.getMin()
            com.iap.ac.android.rpc.ssl.db.CertificateDatabase r9 = (com.iap.ac.android.rpc.ssl.db.CertificateDatabase) r9
            r8.certificateDatabase = r9
            java.lang.String r9 = javax.net.ssl.TrustManagerFactory.getDefaultAlgorithm()     // Catch:{ KeyStoreException | NoSuchAlgorithmException -> 0x0088 }
            javax.net.ssl.TrustManagerFactory r9 = javax.net.ssl.TrustManagerFactory.getInstance(r9)     // Catch:{ KeyStoreException | NoSuchAlgorithmException -> 0x0088 }
            r1 = 0
            r9.init(r1)     // Catch:{ KeyStoreException | NoSuchAlgorithmException -> 0x0088 }
            javax.net.ssl.TrustManager[] r9 = r9.getTrustManagers()     // Catch:{ KeyStoreException | NoSuchAlgorithmException -> 0x0088 }
            int r2 = r9.length     // Catch:{ KeyStoreException | NoSuchAlgorithmException -> 0x0088 }
            r3 = 0
            r4 = 0
        L_0x003d:
            if (r4 >= r2) goto L_0x0041
            r5 = 0
            goto L_0x0042
        L_0x0041:
            r5 = 1
        L_0x0042:
            if (r5 == r0) goto L_0x007a
            int r5 = equals
            int r5 = r5 + 87
            int r6 = r5 % 128
            setMax = r6
            int r5 = r5 % 2
            r5 = r9[r4]     // Catch:{ KeyStoreException | NoSuchAlgorithmException -> 0x0088 }
            boolean r6 = r5 instanceof javax.net.ssl.X509TrustManager     // Catch:{ KeyStoreException | NoSuchAlgorithmException -> 0x0088 }
            r7 = 27
            if (r6 == 0) goto L_0x0059
            r6 = 27
            goto L_0x005b
        L_0x0059:
            r6 = 24
        L_0x005b:
            if (r6 == r7) goto L_0x0060
            int r4 = r4 + 1
            goto L_0x003d
        L_0x0060:
            int r9 = setMax
            int r9 = r9 + 23
            int r0 = r9 % 128
            equals = r0
            int r9 = r9 % 2
            r1 = r5
            javax.net.ssl.X509TrustManager r1 = (javax.net.ssl.X509TrustManager) r1     // Catch:{ KeyStoreException | NoSuchAlgorithmException -> 0x0088 }
            int r9 = equals     // Catch:{ Exception -> 0x0078 }
            int r9 = r9 + 19
            int r0 = r9 % 128
            setMax = r0     // Catch:{ Exception -> 0x0078 }
            int r9 = r9 % 2
            goto L_0x007a
        L_0x0078:
            r9 = move-exception
            throw r9
        L_0x007a:
            int r9 = android.os.Build.VERSION.SDK_INT     // Catch:{ KeyStoreException | NoSuchAlgorithmException -> 0x0088 }
            r0 = 17
            if (r9 < r0) goto L_0x0087
            android.net.http.X509TrustManagerExtensions r9 = new android.net.http.X509TrustManagerExtensions     // Catch:{ KeyStoreException | NoSuchAlgorithmException -> 0x0088 }
            r9.<init>(r1)     // Catch:{ KeyStoreException | NoSuchAlgorithmException -> 0x0088 }
            r8.x509TrustManagerExtensions = r9     // Catch:{ KeyStoreException | NoSuchAlgorithmException -> 0x0088 }
        L_0x0087:
            return
        L_0x0088:
            java.lang.String r9 = DEBUG_TAG
            java.lang.String r0 = "Failed to construct X509TrustManagerExtensions"
            com.iap.ac.android.common.log.ACLog.d(r9, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iap.ac.android.rpc.ssl.SSLPinningManager.<init>(android.content.Context):void");
    }

    public void setPresetCertificateFolderPath(@NonNull String str) {
        String str2 = str;
        ArrayList arrayList = new ArrayList();
        try {
            String[] list = this.context.getAssets().list(str2);
            if (list != null) {
                if ((list.length > 0 ? 14 : '5') != '5') {
                    int i = 0;
                    while (i < list.length) {
                        AssetManager assets = this.context.getAssets();
                        StringBuilder sb = new StringBuilder();
                        sb.append(str2);
                        sb.append("/");
                        sb.append(list[i]);
                        Object[] objArr = new Object[2];
                        objArr[1] = sb.toString();
                        objArr[0] = assets;
                        InputStream inputStream = (InputStream) ((Class) upFrom.setMax(19 - (ViewConfiguration.getScrollBarSize() >> 8), ViewConfiguration.getScrollBarFadeDuration() >> 16, (char) ((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 56348))).getMethod("getMin", new Class[]{AssetManager.class, String.class}).invoke((Object) null, objArr);
                        byte b = (byte) (-setMin[10]);
                        byte b2 = (byte) b;
                        Class<?> cls = Class.forName(setMin(b, b2, (byte) b2));
                        byte b3 = (byte) setMin[12];
                        byte b4 = (byte) b3;
                        Object invoke = cls.getMethod(setMin(b3, b4, (byte) b4), new Class[]{String.class}).invoke((Object) null, new Object[]{"X.509"});
                        int i2 = setMax + 87;
                        equals = i2 % 128;
                        int i3 = i2 % 2;
                        Object[] objArr2 = {inputStream};
                        byte b5 = (byte) (-setMin[10]);
                        byte b6 = (byte) b5;
                        arrayList.add(Class.forName(setMin(b5, b6, (byte) b6)).getMethod("generateCertificate", new Class[]{InputStream.class}).invoke(invoke, objArr2));
                        inputStream.close();
                        i++;
                        int i4 = equals + 33;
                        setMax = i4 % 128;
                        int i5 = i4 % 2;
                    }
                }
            }
            this.pinnedCertificateList.addAll(arrayList);
        } catch (IOException | CertificateException unused) {
            ACLog.d(DEBUG_TAG, "Error in getting the certificate from assets folder");
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public void addCertificates(@NonNull List<String> list) throws CertificateException, IOException {
        Object[] objArr = null;
        boolean z = false;
        if (list.size() == 0) {
            try {
                int i = setMax + 55;
                equals = i % 128;
                if (i % 2 == 0) {
                    z = true;
                }
                if (z) {
                    int length2 = objArr.length;
                }
            } catch (Exception e) {
                throw e;
            }
        } else {
            int i2 = 0;
            while (i2 < list.size()) {
                try {
                    CertificateFactory instance = CertificateFactory.getInstance("X.509");
                    BufferedInputStream bufferedInputStream = new BufferedInputStream(new ByteArrayInputStream(list.get(i2).getBytes(Charset.forName(setMax(-16777216 - Color.rgb(0, 0, 0), (char) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 7228), TextUtils.getCapsMode("", 0, 0) + 5).intern()))));
                    this.pinnedCertificateList.add(instance.generateCertificate(bufferedInputStream));
                    bufferedInputStream.close();
                    i2++;
                } catch (Exception e2) {
                    throw e2;
                }
            }
            int i3 = equals + 23;
            setMax = i3 % 128;
            if (i3 % 2 != 0) {
                z = true;
            }
            if (z) {
                super.hashCode();
            }
        }
    }

    public void addAndPersistRemoteCertificates(@NonNull final List<String> list, @Nullable final OnAddRemoteCertificatesListener onAddRemoteCertificatesListener) {
        this.mainThreadHandler.post(new Runnable() {
            public void run() {
                RemoteCertificateDownloadTask remoteCertificateDownloadTask = new RemoteCertificateDownloadTask(onAddRemoteCertificatesListener, SSLPinningManager.access$000(SSLPinningManager.this).certificateDao());
                Executor executor = AsyncTask.SERIAL_EXECUTOR;
                List list = list;
                remoteCertificateDownloadTask.executeOnExecutor(executor, list.toArray(new String[list.size()]));
            }
        });
        try {
            int i = setMax + 69;
            try {
                equals = i % 128;
                int i2 = i % 2;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public void setPinningMode(int i) {
        try {
            this.pinningMode = i;
            String str = DEBUG_TAG;
            StringBuilder sb = new StringBuilder("Set Pinning mode to ");
            char c = i == 0 ? '#' : 'L';
            String str2 = NetworkUtils.NETWORK_TYPE_NONE;
            if (c != '#') {
                str2 = "CERTIFICATE";
            } else {
                int i2 = setMax + 71;
                equals = i2 % 128;
                if (i2 % 2 == 0) {
                    Object[] objArr = null;
                    int length2 = objArr.length;
                }
            }
            sb.append(str2);
            ACLog.d(str, sb.toString());
            int i3 = equals + 105;
            setMax = i3 % 128;
            if ((i3 % 2 != 0 ? 24 : 'E') == 24) {
                int i4 = 90 / 0;
            }
        } catch (Exception e) {
            throw e;
        }
    }

    public void validateCertificates(@NonNull HttpsURLConnection httpsURLConnection) throws SSLException {
        X509Certificate x509Certificate;
        List<Certificate> certificates = getCertificates();
        if (this.pinningMode == 0 || certificates.isEmpty()) {
            ACLog.d(DEBUG_TAG, "Pinning mode is NONE or local certificate list is empty, validation bypassed");
            return;
        }
        String host = httpsURLConnection.getURL().getHost();
        boolean z = false;
        for (int i = 0; i < certificates.size(); i++) {
            Certificate certificate = certificates.get(i);
            if (certificate instanceof X509Certificate) {
                int i2 = equals + 37;
                setMax = i2 % 128;
                int i3 = i2 % 2;
                z = OkHostnameVerifier.INSTANCE.verify(host, (X509Certificate) certificate);
                if (z) {
                    break;
                }
            }
        }
        if (!z) {
            String str = DEBUG_TAG;
            StringBuilder sb = new StringBuilder("No certificates pinned for ");
            sb.append(host);
            sb.append(", validation bypassed");
            ACLog.d(str, sb.toString());
        } else if (Build.VERSION.SDK_INT >= 17) {
            Iterator<X509Certificate> it = trustedChain(httpsURLConnection).iterator();
            String str2 = "";
            while (true) {
                boolean z2 = true;
                if (it.hasNext()) {
                    int i4 = equals + 121;
                    setMax = i4 % 128;
                    if (i4 % 2 != 0) {
                        x509Certificate = it.next();
                        int i5 = 60 / 0;
                        if (certificates.contains(x509Certificate)) {
                            z2 = false;
                        }
                        if (!z2) {
                            break;
                        }
                        StringBuilder sb2 = new StringBuilder();
                        try {
                            sb2.append(str2);
                            sb2.append("    ");
                            try {
                                sb2.append(x509Certificate.getSubjectDN().toString());
                                sb2.append("\n");
                                str2 = sb2.toString();
                            } catch (Exception e) {
                                throw e;
                            }
                        } catch (Exception e2) {
                            throw e2;
                        }
                    } else {
                        x509Certificate = it.next();
                        if (certificates.contains(x509Certificate)) {
                            break;
                        }
                        StringBuilder sb22 = new StringBuilder();
                        sb22.append(str2);
                        sb22.append("    ");
                        sb22.append(x509Certificate.getSubjectDN().toString());
                        sb22.append("\n");
                        str2 = sb22.toString();
                    }
                } else {
                    ACLog.d(DEBUG_TAG, "Server certificates validation failed for ".concat(String.valueOf(host)));
                    throw new SSLPeerUnverifiedException("Certificate pinning failure\n  Peer certificate chain:\n".concat(String.valueOf(str2)));
                }
            }
            ACLog.d(DEBUG_TAG, "Server certificates validation successful for ".concat(String.valueOf(host)));
        }
    }

    @NonNull
    public List<Certificate> getCertificates() {
        List<CertificateEntity> loadAllCertificates = this.certificateDatabase.certificateDao().loadAllCertificates();
        if (loadAllCertificates.size() > 0) {
            try {
                ArrayList arrayList = new ArrayList(this.pinnedCertificateList);
                int i = 0;
                while (true) {
                    if ((i < loadAllCertificates.size() ? 19 : 'U') != 19) {
                        return arrayList;
                    }
                    try {
                        int i2 = equals + 73;
                        setMax = i2 % 128;
                        if (i2 % 2 == 0) {
                            arrayList.add(loadAllCertificates.get(i).certificateData);
                            i++;
                        } else {
                            arrayList.add(loadAllCertificates.get(i).certificateData);
                            i += 52;
                        }
                    } catch (Exception e) {
                        throw e;
                    }
                }
            } catch (Exception e2) {
                throw e2;
            }
        } else {
            List<Certificate> list = this.pinnedCertificateList;
            int i3 = equals + 27;
            setMax = i3 % 128;
            if (i3 % 2 == 0) {
                return list;
            }
            int i4 = 72 / 0;
            return list;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001f, code lost:
        if (r3.x509TrustManagerExtensions != null) goto L_0x0021;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x006a, code lost:
        throw new javax.net.ssl.SSLException("X509TrustManagerExtensions is not available");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0017, code lost:
        if (r3.x509TrustManagerExtensions != null) goto L_0x0021;
     */
    @androidx.annotation.RequiresApi(api = 17)
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.util.List<java.security.cert.X509Certificate> trustedChain(javax.net.ssl.HttpsURLConnection r4) throws javax.net.ssl.SSLException {
        /*
            r3 = this;
            int r0 = equals
            int r0 = r0 + 19
            int r1 = r0 % 128
            setMax = r1
            int r0 = r0 % 2
            r1 = 24
            if (r0 == 0) goto L_0x0011
            r0 = 24
            goto L_0x0013
        L_0x0011:
            r0 = 20
        L_0x0013:
            if (r0 == r1) goto L_0x001a
            android.net.http.X509TrustManagerExtensions r0 = r3.x509TrustManagerExtensions
            if (r0 == 0) goto L_0x0063
            goto L_0x0021
        L_0x001a:
            android.net.http.X509TrustManagerExtensions r0 = r3.x509TrustManagerExtensions
            r1 = 2
            int r1 = r1 / 0
            if (r0 == 0) goto L_0x0063
        L_0x0021:
            java.security.cert.Certificate[] r0 = r4.getServerCertificates()     // Catch:{ Exception -> 0x0061 }
            int r1 = r0.length
            java.lang.Class<java.security.cert.X509Certificate[]> r2 = java.security.cert.X509Certificate[].class
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r1, r2)     // Catch:{ Exception -> 0x0061 }
            java.security.cert.X509Certificate[] r0 = (java.security.cert.X509Certificate[]) r0     // Catch:{ Exception -> 0x0061 }
            java.net.URL r4 = r4.getURL()     // Catch:{ Exception -> 0x0061 }
            java.lang.String r4 = r4.getHost()     // Catch:{ Exception -> 0x0061 }
            android.net.http.X509TrustManagerExtensions r1 = r3.x509TrustManagerExtensions     // Catch:{ CertificateException -> 0x005a }
            java.lang.String r2 = "RSA"
            java.util.List r4 = r1.checkServerTrusted(r0, r2, r4)     // Catch:{ CertificateException -> 0x005a }
            int r0 = setMax
            int r0 = r0 + 7
            int r1 = r0 % 128
            equals = r1
            int r0 = r0 % 2
            r1 = 53
            if (r0 != 0) goto L_0x004e
            r0 = 4
            goto L_0x0050
        L_0x004e:
            r0 = 53
        L_0x0050:
            if (r0 == r1) goto L_0x0059
            r0 = 17
            int r0 = r0 / 0
            return r4
        L_0x0057:
            r4 = move-exception
            throw r4
        L_0x0059:
            return r4
        L_0x005a:
            r4 = move-exception
            javax.net.ssl.SSLException r0 = new javax.net.ssl.SSLException
            r0.<init>(r4)
            throw r0
        L_0x0061:
            r4 = move-exception
            throw r4
        L_0x0063:
            javax.net.ssl.SSLException r4 = new javax.net.ssl.SSLException
            java.lang.String r0 = "X509TrustManagerExtensions is not available"
            r4.<init>(r0)
            throw r4
        L_0x006b:
            r4 = move-exception
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iap.ac.android.rpc.ssl.SSLPinningManager.trustedChain(javax.net.ssl.HttpsURLConnection):java.util.List");
    }

    private static String setMax(int i, char c, int i2) {
        char[] cArr = new char[i2];
        boolean z = false;
        int i3 = 0;
        while (true) {
            if ((i3 < i2 ? 'U' : 'P') != 'U') {
                break;
            }
            try {
                int i4 = setMax + 105;
                equals = i4 % 128;
                int i5 = i4 % 2;
                try {
                    cArr[i3] = (char) ((int) ((((long) length[i + i3]) ^ (((long) i3) * getMax)) ^ ((long) c)));
                    i3++;
                } catch (Exception e) {
                    throw e;
                }
            } catch (Exception e2) {
                throw e2;
            }
        }
        String str = new String(cArr);
        int i6 = setMax + 5;
        equals = i6 % 128;
        if (i6 % 2 == 0) {
            z = true;
        }
        if (!z) {
            return str;
        }
        Object[] objArr = null;
        int length2 = objArr.length;
        return str;
    }
}
