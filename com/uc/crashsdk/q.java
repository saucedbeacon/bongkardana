package com.uc.crashsdk;

import com.google.common.net.HttpHeaders;
import com.uc.crashsdk.a.a;
import com.uc.crashsdk.a.b;
import com.uc.crashsdk.a.c;
import com.uc.crashsdk.a.e;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import org.apache.http.HttpHost;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.impl.client.DefaultHttpClient;

public final class q {

    /* renamed from: a  reason: collision with root package name */
    public static int f9895a = 5000;

    private static byte[] a(File file) {
        FileInputStream fileInputStream;
        byte[] bArr;
        BufferedInputStream bufferedInputStream = null;
        if (!file.isFile()) {
            return null;
        }
        try {
            int length = (int) file.length();
            fileInputStream = new FileInputStream(file);
            try {
                BufferedInputStream bufferedInputStream2 = new BufferedInputStream(fileInputStream);
                try {
                    byte[] bArr2 = new byte[length];
                    int i = 0;
                    while (i < length) {
                        int read = bufferedInputStream2.read(bArr2, i, length - i);
                        if (-1 == read) {
                            break;
                        }
                        i += read;
                    }
                    b.a((Closeable) bufferedInputStream2);
                    b.a((Closeable) fileInputStream);
                    return bArr2;
                } catch (Exception e) {
                    e = e;
                    bufferedInputStream = bufferedInputStream2;
                    bArr = null;
                    try {
                        a.a(e, true);
                        b.a((Closeable) bufferedInputStream);
                        b.a((Closeable) fileInputStream);
                        return bArr;
                    } catch (Throwable th) {
                        th = th;
                        b.a((Closeable) bufferedInputStream);
                        b.a((Closeable) fileInputStream);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    bufferedInputStream = bufferedInputStream2;
                    b.a((Closeable) bufferedInputStream);
                    b.a((Closeable) fileInputStream);
                    throw th;
                }
            } catch (Exception e2) {
                e = e2;
                bArr = null;
                a.a(e, true);
                b.a((Closeable) bufferedInputStream);
                b.a((Closeable) fileInputStream);
                return bArr;
            }
        } catch (Exception e3) {
            e = e3;
            bArr = null;
            fileInputStream = null;
            a.a(e, true);
            b.a((Closeable) bufferedInputStream);
            b.a((Closeable) fileInputStream);
            return bArr;
        } catch (Throwable th3) {
            th = th3;
            fileInputStream = null;
            b.a((Closeable) bufferedInputStream);
            b.a((Closeable) fileInputStream);
            throw th;
        }
    }

    public static boolean a(File file, String str, String str2) {
        for (int i = 0; i < 2; i++) {
            if (b(file, str, str2)) {
                return true;
            }
            c.b("upload try again: ".concat(String.valueOf(str)));
        }
        return false;
    }

    private static boolean b(File file, String str, String str2) {
        try {
            byte[] a2 = a(file);
            if (a2 != null) {
                if (a2.length != 0) {
                    return a(a2, str, str2);
                }
            }
            return false;
        } catch (Exception e) {
            a.a(e, false);
            return false;
        }
    }

    private static boolean a(byte[] bArr, String str, String str2) {
        HttpHost httpHost;
        if (bArr != null) {
            try {
                if (bArr.length != 0) {
                    DefaultHttpClient defaultHttpClient = new DefaultHttpClient();
                    defaultHttpClient.getParams().setIntParameter("http.connection.timeout", 10000);
                    defaultHttpClient.getParams().setIntParameter("http.socket.timeout", 60000);
                    String a2 = e.a();
                    if (a2 != null) {
                        defaultHttpClient.getParams().setParameter("http.route.default-proxy", new HttpHost(a2, e.b()));
                    }
                    if (str2 == null || str2.length() <= 0) {
                        return false;
                    }
                    StringBuilder sb = new StringBuilder("uploadCrashLog get url [");
                    sb.append(str2);
                    sb.append("] ...");
                    c.b(sb.toString());
                    HttpPost httpPost = new HttpPost(str2);
                    if (str2.startsWith("http://")) {
                        str2 = str2.substring(7);
                    } else if (str2.startsWith("https://")) {
                        str2 = str2.substring(8);
                    }
                    StringBuilder sb2 = new StringBuilder("uploadCrashLog after substr url [");
                    sb2.append(str2);
                    sb2.append("] ...");
                    c.b(sb2.toString());
                    if (str2.contains(":")) {
                        String substring = str2.substring(0, str2.indexOf(":"));
                        int indexOf = str2.indexOf("/");
                        if (indexOf < 0) {
                            indexOf = str2.length();
                        }
                        httpHost = new HttpHost(substring, Integer.valueOf(str2.substring(str2.indexOf(":") + 1, indexOf)).intValue());
                    } else if (str2.contains("/")) {
                        httpHost = new HttpHost(str2.substring(0, str2.indexOf("/")));
                    } else {
                        httpHost = new HttpHost(str2);
                    }
                    httpPost.setHeader("Content-Type", "multipart/form-data; boundary=----------izQ290kHh6g3Yn2IeyJCoc");
                    httpPost.setHeader(HttpHeaders.CONTENT_DISPOSITION, "form-data; name=\"file\"; filename=".concat(String.valueOf(str)));
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("------------izQ290kHh6g3Yn2IeyJCoc\r\n");
                    stringBuffer.append("Content-Disposition: form-data; name=\"file\";");
                    stringBuffer.append(" filename=\"");
                    stringBuffer.append(str);
                    stringBuffer.append("\"\r\n");
                    stringBuffer.append("Content-Type: application/octet-stream\r\n");
                    stringBuffer.append("\r\n");
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    byteArrayOutputStream.write(stringBuffer.toString().getBytes());
                    byteArrayOutputStream.write(bArr);
                    StringBuffer stringBuffer2 = new StringBuffer();
                    stringBuffer2.append("\r\n------------izQ290kHh6g3Yn2IeyJCoc--\r\n");
                    byteArrayOutputStream.write(stringBuffer2.toString().getBytes());
                    byteArrayOutputStream.close();
                    httpPost.setEntity(new ByteArrayEntity(byteArrayOutputStream.toByteArray()));
                    try {
                        int statusCode = defaultHttpClient.execute(httpHost, httpPost).getStatusLine().getStatusCode();
                        c.a("crashsdk", "StatusLine: ".concat(String.valueOf(statusCode)));
                        return statusCode == 200;
                    } catch (Throwable th) {
                        a.a(th, true);
                        return false;
                    } finally {
                        defaultHttpClient.getConnectionManager().shutdown();
                    }
                }
            } catch (Exception e) {
                a.a(e, true);
            }
        }
        return false;
    }
}
