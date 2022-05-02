package com.uc.crashsdk.a;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Proxy;
import android.os.Build;
import com.google.common.base.Ascii;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class e {

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ boolean f9869a = (!e.class.desiredAssertionStatus());
    private static String b = "";
    private static a c;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public boolean f9870a;
        public String b;
    }

    private static boolean d() {
        String str;
        a aVar = c;
        if (aVar != null) {
            return aVar.f9870a;
        }
        if (aVar != null) {
            str = aVar.b;
        } else {
            NetworkInfo e = e();
            if (e == null) {
                str = "no_network";
            } else {
                int type = e.getType();
                if (e.getType() != 1) {
                    str = e.getExtraInfo() != null ? e.getExtraInfo().toLowerCase() : "unknown";
                    if (type == 0) {
                        if (str.contains("cmwap")) {
                            str = "cmwap";
                        } else if (str.contains("cmnet")) {
                            str = "cmnet";
                        } else if (str.contains("uniwap")) {
                            str = "uniwap";
                        } else if (str.contains("uninet")) {
                            str = "uninet";
                        } else if (str.contains("3gwap")) {
                            str = "3gwap";
                        } else if (str.contains("3gnet")) {
                            str = "3gnet";
                        } else if (str.contains("ctwap")) {
                            str = "ctwap";
                        } else if (str.contains("ctnet")) {
                            str = "ctnet";
                        }
                    }
                }
                str = "wifi";
            }
        }
        return "wifi".equals(str);
    }

    private static NetworkInfo e() {
        NetworkInfo[] allNetworkInfo;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) com.uc.crashsdk.e.a("connectivity");
            if (connectivityManager == null) {
                c.c("ConnectivityStatus, isQuickNet,ConnectivityManager==null");
                return null;
            }
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if ((activeNetworkInfo != null && activeNetworkInfo.isConnected()) || (allNetworkInfo = connectivityManager.getAllNetworkInfo()) == null) {
                return activeNetworkInfo;
            }
            for (int i = 0; i < allNetworkInfo.length; i++) {
                if (allNetworkInfo[i] != null && allNetworkInfo[i].isConnected()) {
                    return allNetworkInfo[i];
                }
            }
            return activeNetworkInfo;
        } catch (Exception e) {
            a.a(e, true);
            return null;
        }
    }

    public static String a() {
        if (Build.VERSION.SDK_INT >= 11) {
            return System.getProperty("http.proxyHost");
        }
        Context a2 = com.uc.crashsdk.e.a();
        if (a2 == null) {
            return null;
        }
        String host = Proxy.getHost(a2);
        return (!d() || host == null || host.indexOf("10.0.0") == -1) ? host : "";
    }

    public static int b() {
        if (Build.VERSION.SDK_INT >= 11) {
            String property = System.getProperty("http.proxyPort");
            if (property == null) {
                property = "-1";
            }
            try {
                return Integer.parseInt(property);
            } catch (Exception unused) {
                return -1;
            }
        } else {
            Context a2 = com.uc.crashsdk.e.a();
            if (a2 == null) {
                return 80;
            }
            String host = Proxy.getHost(a2);
            int port = Proxy.getPort(a2);
            if (!d() || host == null || host.indexOf("10.0.0") == -1) {
                return port;
            }
            return -1;
        }
    }

    public static byte[] a(byte[] bArr, byte[] bArr2) {
        return a(bArr, bArr2, true, false);
    }

    public static byte[] a(byte[] bArr, byte[] bArr2, boolean z) {
        return a(bArr, bArr2, z, true);
    }

    private static byte[] a(byte[] bArr, byte[] bArr2, boolean z, boolean z2) {
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0});
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, "AES");
        Cipher instance = Cipher.getInstance("AES/CBC/PKCS5Padding");
        instance.init(z ? 1 : 2, secretKeySpec, ivParameterSpec);
        if (!z) {
            return instance.doFinal(bArr);
        }
        if (!z2) {
            bArr = a(bArr);
        }
        return instance.doFinal(bArr);
    }

    private static byte[] a(byte[] bArr) {
        byte[] bArr2 = new byte[(bArr.length + 16)];
        int length = bArr.length;
        bArr2[0] = (byte) ((length >> 0) & 255);
        bArr2[1] = (byte) ((length >> 8) & 255);
        bArr2[2] = (byte) ((length >> 16) & 255);
        bArr2[3] = (byte) ((length >> 24) & 255);
        for (int i = 4; i < 16; i++) {
            bArr2[i] = 0;
        }
        System.arraycopy(bArr, 0, bArr2, 16, bArr.length);
        return bArr2;
    }

    public static byte[] c() {
        return new byte[]{48, Ascii.EM, 6, 55};
    }

    public static byte[] a(String str, byte[] bArr) {
        InputStream inputStream;
        ByteArrayOutputStream byteArrayOutputStream;
        OutputStream outputStream;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(new URL(str).openConnection()));
            httpURLConnection.setConnectTimeout(5000);
            httpURLConnection.setReadTimeout(5000);
            httpURLConnection.setDoInput(true);
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            httpURLConnection.setRequestProperty("Content-Length", String.valueOf(bArr.length));
            outputStream = httpURLConnection.getOutputStream();
            try {
                outputStream.write(bArr);
                if (httpURLConnection.getResponseCode() != 200) {
                    b.a((Closeable) outputStream);
                    b.a((Closeable) null);
                    b.a((Closeable) null);
                    return null;
                }
                inputStream = httpURLConnection.getInputStream();
                try {
                    byte[] bArr2 = new byte[1024];
                    byteArrayOutputStream = new ByteArrayOutputStream(inputStream.available());
                    while (true) {
                        try {
                            int read = inputStream.read(bArr2);
                            if (read != -1) {
                                byteArrayOutputStream.write(bArr2, 0, read);
                            } else {
                                byte[] byteArray = byteArrayOutputStream.toByteArray();
                                b.a((Closeable) outputStream);
                                b.a((Closeable) inputStream);
                                b.a((Closeable) byteArrayOutputStream);
                                return byteArray;
                            }
                        } catch (Throwable unused) {
                            b.a((Closeable) outputStream);
                            b.a((Closeable) inputStream);
                            b.a((Closeable) byteArrayOutputStream);
                            return null;
                        }
                    }
                } catch (Throwable unused2) {
                    byteArrayOutputStream = null;
                    b.a((Closeable) outputStream);
                    b.a((Closeable) inputStream);
                    b.a((Closeable) byteArrayOutputStream);
                    return null;
                }
            } catch (Throwable unused3) {
                inputStream = null;
                byteArrayOutputStream = null;
                b.a((Closeable) outputStream);
                b.a((Closeable) inputStream);
                b.a((Closeable) byteArrayOutputStream);
                return null;
            }
        } catch (Throwable unused4) {
            inputStream = null;
            outputStream = null;
            byteArrayOutputStream = null;
            b.a((Closeable) outputStream);
            b.a((Closeable) inputStream);
            b.a((Closeable) byteArrayOutputStream);
            return null;
        }
    }

    public static void a(byte[] bArr, int i, byte[] bArr2) {
        if (f9869a || bArr2.length == 4) {
            for (int i2 = 0; i2 < 4; i2++) {
                bArr[i2 + i] = bArr2[i2];
            }
            return;
        }
        throw new AssertionError();
    }
}
