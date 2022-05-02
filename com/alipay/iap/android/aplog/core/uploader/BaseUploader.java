package com.alipay.iap.android.aplog.core.uploader;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import com.alibaba.fastjson.parser.JSONLexer;
import com.alipay.iap.android.aplog.core.LoggerFactory;
import com.alipay.iap.android.aplog.core.logger.TraceLogger;
import com.alipay.iap.android.aplog.util.FileUtil;
import com.alipay.iap.android.aplog.util.LoggingUtil;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

public class BaseUploader {
    public static String TAG = "BaseUploader";
    private static int getMin = 0;
    private static int length = 1;
    private static long setMax;
    private static char[] setMin;
    protected Context mContext;
    protected File mUploadFileDir;

    static void length() {
        setMin = new char[]{2677, 41333, 23652, 2830, 42524};
        setMax = 5515488682761104129L;
    }

    static {
        length();
        try {
            int i = getMin + 117;
            length = i % 128;
            int i2 = i % 2;
        } catch (Exception e) {
            throw e;
        }
    }

    public BaseUploader(File file, Context context) {
        this.mUploadFileDir = file;
        this.mContext = context;
    }

    /* access modifiers changed from: protected */
    public void cleanExpiresFile() {
        int i = getMin + 9;
        length = i % 128;
        File[] fileArr = null;
        if (i % 2 == 0) {
            try {
                int i2 = (FileUtil.getFolderSize(this.mUploadFileDir) > ((long) UploadManager.MAX_UPLOAD_FILE_SIZE) ? 1 : (FileUtil.getFolderSize(this.mUploadFileDir) == ((long) UploadManager.MAX_UPLOAD_FILE_SIZE) ? 0 : -1));
                super.hashCode();
                if (i2 < 0) {
                    return;
                }
            } catch (Exception e) {
                throw e;
            }
        } else if (FileUtil.getFolderSize(this.mUploadFileDir) < ((long) UploadManager.MAX_UPLOAD_FILE_SIZE)) {
            return;
        }
        try {
            fileArr = this.mUploadFileDir.listFiles();
        } catch (Throwable unused) {
        }
        if (!(fileArr == null)) {
            int i3 = getMin + 27;
            length = i3 % 128;
            if (i3 % 2 == 0) {
                if (fileArr.length < 3) {
                    return;
                }
            } else if (fileArr.length < 4) {
                return;
            }
            Arrays.sort(fileArr, UploadManager.CLEAN_FILE_COMPARATOR);
            int length2 = fileArr.length / 4;
            int i4 = 0;
            while (true) {
                if (!(i4 >= length2)) {
                    int i5 = length + 29;
                    getMin = i5 % 128;
                    int i6 = i5 % 2;
                    File file = fileArr[i4];
                    if (file != null && file.exists()) {
                        int i7 = length + 27;
                        getMin = i7 % 128;
                        int i8 = i7 % 2;
                        if (file.isFile()) {
                            try {
                                file.delete();
                                TraceLogger traceLogger = LoggerFactory.getTraceLogger();
                                String str = TAG;
                                StringBuilder sb = new StringBuilder("cleanExpiresFile: ");
                                sb.append(file.getName());
                                sb.append(" is too large or too old, total: ");
                                sb.append(fileArr.length);
                                traceLogger.error(str, sb.toString());
                                int i9 = length + 89;
                                getMin = i9 % 128;
                                int i10 = i9 % 2;
                            } catch (Throwable th) {
                                TraceLogger traceLogger2 = LoggerFactory.getTraceLogger();
                                String str2 = TAG;
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append(file.getName());
                                sb2.append(" cleanExpiresFile");
                                traceLogger2.warn(str2, sb2.toString(), th);
                            }
                        }
                    }
                    i4++;
                } else {
                    return;
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void uploadFileByHttp(File file, String str, String str2, String str3) throws IllegalStateException {
        if (file != null) {
            try {
                String readFile = FileUtil.readFile(file);
                if (!TextUtils.isEmpty(readFile)) {
                    String decodeUploadContent = decodeUploadContent(readFile);
                    if (!TextUtils.isEmpty(decodeUploadContent)) {
                        String logHost = LoggerFactory.getLogContext().getLogHost();
                        if (!TextUtils.isEmpty(logHost)) {
                            if (LoggingUtil.isDebuggable()) {
                                setComponentEnabled(this.mContext, "com.alipay.mobile.logmonitor.ClientMonitorExtReceiver");
                                StringBuilder sb = new StringBuilder();
                                sb.append(this.mContext.getPackageName());
                                sb.append(".monitor.action.UPLOAD_MDAP_LOG");
                                Intent intent = new Intent(sb.toString());
                                intent.setPackage(this.mContext.getPackageName());
                                intent.putExtra("file", file.getName());
                                try {
                                    this.mContext.sendBroadcast(intent);
                                } catch (Throwable unused) {
                                }
                            }
                            byte[] gzipDataByString = LoggingUtil.gzipDataByString(decodeUploadContent);
                            HashMap hashMap = new HashMap();
                            hashMap.put("Content-type", "text/xml");
                            hashMap.put("ProcessName", LoggerFactory.getProcessInfo().getProcessAlias());
                            hashMap.put("bizCode", str);
                            hashMap.put("userId", LoggerFactory.getLogContext().getUserID());
                            hashMap.put("productId", LoggerFactory.getLogContext().getProductID());
                            hashMap.put("event", str3);
                            hashMap.put("productVersion", LoggerFactory.getLogContext().getProductVersion());
                            hashMap.put("utdId", LoggerFactory.getLogContext().getDeviceID());
                            if (!TextUtils.isEmpty(str2)) {
                                try {
                                    TraceLogger traceLogger = LoggerFactory.getTraceLogger();
                                    String str4 = TAG;
                                    StringBuilder sb2 = new StringBuilder("uploadUrl = ");
                                    sb2.append(str2);
                                    sb2.append(" logCategory = ");
                                    sb2.append(str);
                                    traceLogger.info(str4, sb2.toString());
                                } catch (Exception e) {
                                    throw e;
                                }
                            } else {
                                StringBuilder sb3 = new StringBuilder();
                                sb3.append(logHost);
                                sb3.append(UploadManager.STATISTICS_URL_PATH);
                                str2 = sb3.toString();
                            }
                            LoggerFactory.getTraceLogger().debug(TAG, "uploadLogUrl: ".concat(String.valueOf(str2)));
                            try {
                                HttpURLConnection httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(new URL(str2).openConnection()));
                                httpURLConnection.setDoOutput(true);
                                httpURLConnection.setDoOutput(true);
                                httpURLConnection.setUseCaches(false);
                                httpURLConnection.setRequestMethod("POST");
                                httpURLConnection.setRequestProperty("Content-Length", String.valueOf(gzipDataByString.length));
                                Iterator it = hashMap.keySet().iterator();
                                while (true) {
                                    if (!(it.hasNext())) {
                                        break;
                                    }
                                    String str5 = (String) it.next();
                                    httpURLConnection.setRequestProperty(str5, (String) hashMap.get(str5));
                                }
                                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
                                bufferedOutputStream.write(gzipDataByString);
                                bufferedOutputStream.flush();
                                bufferedOutputStream.close();
                                int responseCode = httpURLConnection.getResponseCode();
                                if (200 == responseCode) {
                                    StringBuffer stringBuffer = new StringBuffer();
                                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream(), getMax(1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0 ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0 ? 0 : -1)), AndroidCharacter.getMirror('0') - '+', (char) (TextUtils.indexOf("", "", 0, 0) + 2592)).intern()));
                                    int i = length + 115;
                                    getMin = i % 128;
                                    int i2 = i % 2;
                                    while (true) {
                                        String readLine = bufferedReader.readLine();
                                        if (readLine == null) {
                                            break;
                                        }
                                        int i3 = length + 113;
                                        getMin = i3 % 128;
                                        if (i3 % 2 == 0) {
                                            stringBuffer.append(readLine);
                                            stringBuffer.append("\n");
                                        } else {
                                            stringBuffer.append(readLine);
                                            stringBuffer.append("\n");
                                            int i4 = 51 / 0;
                                        }
                                    }
                                    bufferedReader.close();
                                    String obj = stringBuffer.toString();
                                    try {
                                        int i5 = new JSONObject(obj).getInt("code");
                                        if (i5 == 200) {
                                            try {
                                                file.delete();
                                                int i6 = length + 85;
                                                getMin = i6 % 128;
                                                int i7 = i6 % 2;
                                                if ((LoggingUtil.isDebuggable() ? ':' : 'M') != ':' || TextUtils.isEmpty(obj)) {
                                                    int i8 = getMin + 95;
                                                    length = i8 % 128;
                                                    int i9 = i8 % 2;
                                                }
                                            } catch (Throwable th) {
                                                throw new IllegalStateException("delete file error: ".concat(String.valueOf(th)), th);
                                            }
                                        } else {
                                            throw new IllegalStateException("responseContent code is ".concat(String.valueOf(i5)));
                                        }
                                    } catch (JSONException unused2) {
                                        throw new IllegalStateException("get responseContent code error,JSONException");
                                    }
                                } else {
                                    throw new IllegalStateException("response code is ".concat(String.valueOf(responseCode)));
                                }
                            } catch (Throwable th2) {
                                throw new IllegalStateException("POST request error: ".concat(String.valueOf(th2)), th2);
                            }
                        } else {
                            throw new IllegalStateException("log host is empty");
                        }
                    } else {
                        throw new IllegalStateException("decode file content is empty");
                    }
                } else {
                    file.delete();
                    throw new IllegalStateException("file content is empty");
                }
            } catch (Throwable th3) {
                throw new IllegalStateException("read file error: ".concat(String.valueOf(th3)), th3);
            }
        } else {
            throw new IllegalStateException("file object is NULL");
        }
    }

    /* access modifiers changed from: protected */
    public void setComponentEnabled(Context context, String str) {
        try {
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, str), 1, 1);
            int i = getMin + 5;
            length = i % 128;
            if ((i % 2 == 0 ? JSONLexer.EOI : 31) == 26) {
                Object obj = null;
                super.hashCode();
            }
        } catch (Throwable th) {
            LoggerFactory.getTraceLogger().error(TAG, "setComponentEnabled: ".concat(String.valueOf(th)));
        }
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [java.lang.Object, java.lang.String] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0024, code lost:
        if ((r0 ? 20 : 'C') != 20) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002d, code lost:
        if (android.text.TextUtils.isEmpty(r7) != false) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0041, code lost:
        r7 = r7.split("_");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0049, code lost:
        if (r7.length >= 3) goto L_0x004c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x004b, code lost:
        r3 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x004c, code lost:
        if (r3 == true) goto L_0x0051;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0050, code lost:
        return r7[2];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0051, code lost:
        r7 = length + 75;
        getMin = r7 % 128;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x005a, code lost:
        if ((r7 % 2) == 0) goto L_0x0060;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
        r7 = r4.length;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x005d, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0060, code lost:
        return r4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String getLogCategory(java.lang.String r7) {
        /*
            r6 = this;
            int r0 = getMin
            int r0 = r0 + 45
            int r1 = r0 % 128
            length = r1
            r1 = 2
            int r0 = r0 % r1
            r2 = 1
            r3 = 0
            if (r0 != 0) goto L_0x0010
            r0 = 1
            goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            r4 = 0
            if (r0 == 0) goto L_0x0029
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            super.hashCode()     // Catch:{ all -> 0x0027 }
            r5 = 20
            if (r0 == 0) goto L_0x0022
            r0 = 20
            goto L_0x0024
        L_0x0022:
            r0 = 67
        L_0x0024:
            if (r0 == r5) goto L_0x002f
            goto L_0x0041
        L_0x0027:
            r7 = move-exception
            throw r7
        L_0x0029:
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            if (r0 == 0) goto L_0x0041
        L_0x002f:
            int r7 = getMin
            int r7 = r7 + 11
            int r0 = r7 % 128
            length = r0
            int r7 = r7 % r1
            if (r7 != 0) goto L_0x0040
            r7 = 22
            int r7 = r7 / r3
            return r4
        L_0x003e:
            r7 = move-exception
            throw r7
        L_0x0040:
            return r4
        L_0x0041:
            java.lang.String r0 = "_"
            java.lang.String[] r7 = r7.split(r0)
            int r0 = r7.length
            r5 = 3
            if (r0 >= r5) goto L_0x004c
            r3 = 1
        L_0x004c:
            if (r3 == r2) goto L_0x0051
            r7 = r7[r1]
            return r7
        L_0x0051:
            int r7 = length
            int r7 = r7 + 75
            int r0 = r7 % 128
            getMin = r0
            int r7 = r7 % r1
            if (r7 == 0) goto L_0x0060
            int r7 = r4.length     // Catch:{ all -> 0x005e }
            return r4
        L_0x005e:
            r7 = move-exception
            throw r7
        L_0x0060:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.iap.android.aplog.core.uploader.BaseUploader.getLogCategory(java.lang.String):java.lang.String");
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0028, code lost:
        if ((r0 == null) != true) goto L_0x0038;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0035, code lost:
        if (r0 == null) goto L_0x0037;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0038, code lost:
        r9 = r9.split(com.alipay.iap.android.aplog.core.LoggerFactory.LOG_SPLITER);
        r2 = r9.length;
        r4 = new java.lang.StringBuffer();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0044, code lost:
        if (r3 >= r2) goto L_0x007f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0046, code lost:
        r5 = r9[r3];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x004c, code lost:
        if (android.text.TextUtils.isEmpty(r5) != false) goto L_0x007c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x004e, code lost:
        r6 = length + 73;
        getMin = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x005f, code lost:
        if (r5.startsWith(com.alipay.iap.android.aplog.core.appender.MdapFileLogAppender.ENCRYPT_SIGN) == false) goto L_0x0076;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        r5 = r0.decrypt(r5.substring(2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x006d, code lost:
        if (android.text.TextUtils.isEmpty(r5) != false) goto L_0x007c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x006f, code lost:
        r4.append(r5);
        r4.append(com.alipay.iap.android.aplog.core.layout.mas.MasLog.Constant.GAP);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0076, code lost:
        r4.append(r5);
        r4.append(com.alipay.iap.android.aplog.core.layout.mas.MasLog.Constant.GAP);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0083, code lost:
        return r4.toString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0084, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0086, code lost:
        throw r9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String decodeUploadContent(java.lang.String r9) {
        /*
            r8 = this;
            int r0 = length
            int r0 = r0 + 65
            int r1 = r0 % 128
            getMin = r1
            r1 = 2
            int r0 = r0 % r1
            r2 = 99
            if (r0 == 0) goto L_0x0011
            r0 = 40
            goto L_0x0013
        L_0x0011:
            r0 = 99
        L_0x0013:
            r3 = 0
            if (r0 == r2) goto L_0x002d
            com.alipay.iap.android.aplog.api.LogContext r0 = com.alipay.iap.android.aplog.core.LoggerFactory.getLogContext()
            com.alipay.iap.android.aplog.api.LogEncryptClient r0 = r0.getLogEncryptClient()
            r2 = 0
            super.hashCode()     // Catch:{ all -> 0x002b }
            r2 = 1
            if (r0 != 0) goto L_0x0027
            r4 = 1
            goto L_0x0028
        L_0x0027:
            r4 = 0
        L_0x0028:
            if (r4 == r2) goto L_0x0037
            goto L_0x0038
        L_0x002b:
            r9 = move-exception
            throw r9
        L_0x002d:
            com.alipay.iap.android.aplog.api.LogContext r0 = com.alipay.iap.android.aplog.core.LoggerFactory.getLogContext()
            com.alipay.iap.android.aplog.api.LogEncryptClient r0 = r0.getLogEncryptClient()
            if (r0 != 0) goto L_0x0038
        L_0x0037:
            return r9
        L_0x0038:
            java.lang.String r2 = "\\$\\$"
            java.lang.String[] r9 = r9.split(r2)
            int r2 = r9.length
            java.lang.StringBuffer r4 = new java.lang.StringBuffer
            r4.<init>()
        L_0x0044:
            if (r3 >= r2) goto L_0x007f
            r5 = r9[r3]
            boolean r6 = android.text.TextUtils.isEmpty(r5)
            if (r6 != 0) goto L_0x007c
            int r6 = length
            int r6 = r6 + 73
            int r7 = r6 % 128
            getMin = r7
            int r6 = r6 % r1
            java.lang.String r6 = "1_"
            boolean r6 = r5.startsWith(r6)
            java.lang.String r7 = "$$"
            if (r6 == 0) goto L_0x0076
            java.lang.String r5 = r5.substring(r1)     // Catch:{ all -> 0x007c }
            java.lang.String r5 = r0.decrypt((java.lang.String) r5)     // Catch:{ all -> 0x007c }
            boolean r6 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x007c }
            if (r6 != 0) goto L_0x007c
            r4.append(r5)     // Catch:{ all -> 0x007c }
            r4.append(r7)     // Catch:{ all -> 0x007c }
            goto L_0x007c
        L_0x0076:
            r4.append(r5)
            r4.append(r7)
        L_0x007c:
            int r3 = r3 + 1
            goto L_0x0044
        L_0x007f:
            java.lang.String r9 = r4.toString()     // Catch:{ Exception -> 0x0084 }
            return r9
        L_0x0084:
            r9 = move-exception
            goto L_0x0087
        L_0x0086:
            throw r9
        L_0x0087:
            goto L_0x0086
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.iap.android.aplog.core.uploader.BaseUploader.decodeUploadContent(java.lang.String):java.lang.String");
    }

    private static String getMax(int i, int i2, char c) {
        int i3 = getMin + 47;
        length = i3 % 128;
        int i4 = i3 % 2;
        char[] cArr = new char[i2];
        int i5 = 0;
        while (true) {
            if (i5 >= i2) {
                return new String(cArr);
            }
            int i6 = length + 79;
            getMin = i6 % 128;
            int i7 = i6 % 2;
            try {
                try {
                    cArr[i5] = (char) ((int) ((((long) setMin[i + i5]) ^ (((long) i5) * setMax)) ^ ((long) c)));
                    i5++;
                } catch (Exception e) {
                    throw e;
                }
            } catch (Exception e2) {
                throw e2;
            }
        }
    }
}
