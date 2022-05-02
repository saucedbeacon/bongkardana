package com.alibaba.griver.base.common.network;

import android.text.TextUtils;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.kernel.common.service.executor.ExecutorType;
import com.alibaba.ariver.kernel.common.utils.FileUtils;
import com.alibaba.ariver.kernel.common.utils.IOUtils;
import com.alibaba.griver.api.common.monitor.GriverMonitorConstants;
import com.alibaba.griver.api.common.network.DownloadCallback;
import com.alibaba.griver.api.common.network.DownloadRequest;
import com.alibaba.griver.api.common.network.GriverTransportExtension;
import com.alibaba.griver.api.common.network.HttpRequest;
import com.alibaba.griver.api.common.network.HttpResponse;
import com.alibaba.griver.base.common.executor.GriverExecutors;
import com.alibaba.griver.base.common.logger.GriverLogger;
import com.alibaba.griver.base.common.monitor.GriverMonitor;
import com.alibaba.griver.base.common.monitor.MonitorMap;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

public class GriverTransport {
    public static HttpResponse request(HttpRequest httpRequest) {
        HttpResponse httpResponse = null;
        if (httpRequest == null) {
            HashMap hashMap = new HashMap();
            hashMap.put(GriverMonitorConstants.KEY_EXCEPTION_MESSAGE, "httpRequest is empty");
            GriverMonitor.event(GriverMonitorConstants.ERROR_HTTP_FAILED, "GriverAppContainer", hashMap);
            GriverLogger.w("GriverTransport", "request is null, return null", (Throwable) null);
            return null;
        } else if (TextUtils.isEmpty(httpRequest.getUrl())) {
            HashMap hashMap2 = new HashMap();
            hashMap2.put(GriverMonitorConstants.KEY_EXCEPTION_MESSAGE, "httpRequest url is empty");
            GriverMonitor.event(GriverMonitorConstants.ERROR_HTTP_FAILED, "GriverAppContainer", hashMap2);
            GriverLogger.w("GriverTransport", "request url is empty, return null", (Throwable) null);
            return null;
        } else {
            try {
                httpResponse = a().request(httpRequest);
                if (httpResponse == null) {
                    HashMap hashMap3 = new HashMap(8);
                    hashMap3.put("url", httpRequest.getUrl());
                    hashMap3.put(GriverMonitorConstants.KEY_EXCEPTION_MESSAGE, "response is null");
                    GriverMonitor.event(GriverMonitorConstants.ERROR_HTTP_FAILED, "GriverAppContainer", hashMap3);
                }
            } catch (Exception e) {
                Map<String, String> commonExceptionMap = GriverMonitor.getCommonExceptionMap(e);
                commonExceptionMap.put("url", httpRequest.getUrl());
                GriverMonitor.event(GriverMonitorConstants.ERROR_HTTP_FAILED, "GriverAppContainer", commonExceptionMap);
            }
            return httpResponse;
        }
    }

    private static GriverTransportExtension a() {
        return (GriverTransportExtension) RVProxy.get(GriverTransportExtension.class);
    }

    public static void download(final DownloadRequest downloadRequest, final DownloadCallback downloadCallback) {
        if (downloadRequest == null) {
            a((DownloadRequest) null, downloadCallback, 100, GriverMonitorConstants.MESSAGE_DOWNLOAD_REQUEST_EMPTY_ERROR, (Throwable) null);
            return;
        }
        try {
            final String str = downloadRequest.downloadUrl;
            final String str2 = downloadRequest.downloadFilePath;
            if (TextUtils.isEmpty(str)) {
                a(downloadRequest, downloadCallback, 101, GriverMonitorConstants.MESSAGE_DOWNLOAD_REQUEST_URL_EMPTY_ERROR, (Throwable) null);
                GriverLogger.e("GriverTransport", "invalid download request, return");
            } else if (TextUtils.isEmpty(str2)) {
                GriverLogger.e("GriverTransport", "download request file path is empty. Path: ".concat(String.valueOf(str2)));
                a(downloadRequest, downloadCallback, 102, GriverMonitorConstants.MESSAGE_DOWNLOAD_PATH_EMPTY_ERROR, (Throwable) null);
            } else {
                GriverLogger.d("GriverTransport", "download path: ".concat(String.valueOf(str2)));
                if (FileUtils.exists(new File(str2))) {
                    GriverLogger.d("GriverTransport", "download file exists, callback finish");
                    a(downloadRequest, downloadCallback, true, 0, 0, 0);
                    return;
                }
                GriverExecutors.getExecutor(downloadRequest.urgent ? ExecutorType.URGENT : ExecutorType.NETWORK).execute(new Runnable() {
                    public final void run() {
                        byte[] bArr;
                        InputStream inputStream;
                        FileOutputStream fileOutputStream;
                        byte[] bArr2;
                        FileOutputStream fileOutputStream2;
                        int i = downloadRequest.retryTime + 1;
                        FileOutputStream fileOutputStream3 = null;
                        int i2 = 99;
                        String str = "";
                        Exception exc = null;
                        while (i > 0) {
                            int i3 = i - 1;
                            long currentTimeMillis = System.currentTimeMillis();
                            HttpRequest httpRequest = new HttpRequest();
                            httpRequest.setUrl(str);
                            httpRequest.setMethod("GET");
                            HttpResponse request = GriverTransport.request(httpRequest);
                            if (request == null || request.getStatusCode() != 200 || request.getInputStream() == null) {
                                str = GriverMonitorConstants.MESSAGE_DOWNLOAD_RESPONSE_ERROR;
                                exc = null;
                                i = i3;
                                i2 = 200;
                            } else if (FileUtils.create(str2)) {
                                InputStream inputStream2 = request.getInputStream();
                                byte[] buf = IOUtils.getBuf(1024);
                                try {
                                    fileOutputStream = new FileOutputStream(str2);
                                    long j = 0;
                                    while (true) {
                                        try {
                                            int read = inputStream2.read(buf);
                                            if (read != -1) {
                                                j += (long) read;
                                                try {
                                                    fileOutputStream.write(buf, 0, read);
                                                } catch (Exception e) {
                                                    exc = e;
                                                    bArr2 = buf;
                                                    inputStream = inputStream2;
                                                } catch (Throwable th) {
                                                    th = th;
                                                    bArr = buf;
                                                    fileOutputStream3 = fileOutputStream;
                                                    inputStream = inputStream2;
                                                    IOUtils.returnBuf(bArr);
                                                    IOUtils.closeQuietly(fileOutputStream3);
                                                    IOUtils.closeQuietly(inputStream);
                                                    throw th;
                                                }
                                            } else {
                                                DownloadRequest downloadRequest = downloadRequest;
                                                DownloadCallback downloadCallback = downloadCallback;
                                                bArr2 = buf;
                                                fileOutputStream2 = fileOutputStream;
                                                long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                                                inputStream = inputStream2;
                                                try {
                                                    GriverTransport.a(downloadRequest, downloadCallback, false, j, currentTimeMillis2, i3);
                                                    GriverLogger.d("GriverTransport", "download success");
                                                    IOUtils.returnBuf(bArr2);
                                                    IOUtils.closeQuietly(fileOutputStream2);
                                                    IOUtils.closeQuietly(inputStream);
                                                    return;
                                                } catch (Exception e2) {
                                                    exc = e2;
                                                    fileOutputStream = fileOutputStream2;
                                                } catch (Throwable th2) {
                                                    th = th2;
                                                    fileOutputStream3 = fileOutputStream2;
                                                    IOUtils.returnBuf(bArr);
                                                    IOUtils.closeQuietly(fileOutputStream3);
                                                    IOUtils.closeQuietly(inputStream);
                                                    throw th;
                                                }
                                            }
                                        } catch (Exception e3) {
                                            bArr2 = buf;
                                            FileOutputStream fileOutputStream4 = fileOutputStream;
                                            inputStream = inputStream2;
                                            exc = e3;
                                            try {
                                                GriverLogger.e("GriverTransport", "input error".concat(String.valueOf(exc)));
                                                IOUtils.returnBuf(bArr);
                                                IOUtils.closeQuietly(fileOutputStream);
                                                IOUtils.closeQuietly(inputStream);
                                                i = i3;
                                                str = "write file failed";
                                                i2 = 301;
                                            } catch (Throwable th3) {
                                                th = th3;
                                                fileOutputStream3 = fileOutputStream;
                                                IOUtils.returnBuf(bArr);
                                                IOUtils.closeQuietly(fileOutputStream3);
                                                IOUtils.closeQuietly(inputStream);
                                                throw th;
                                            }
                                        } catch (Throwable th4) {
                                            th = th4;
                                            bArr2 = buf;
                                            fileOutputStream2 = fileOutputStream;
                                            inputStream = inputStream2;
                                            fileOutputStream3 = fileOutputStream2;
                                            IOUtils.returnBuf(bArr);
                                            IOUtils.closeQuietly(fileOutputStream3);
                                            IOUtils.closeQuietly(inputStream);
                                            throw th;
                                        }
                                    }
                                } catch (Exception e4) {
                                    bArr2 = buf;
                                    inputStream = inputStream2;
                                    exc = e4;
                                    fileOutputStream = null;
                                    GriverLogger.e("GriverTransport", "input error".concat(String.valueOf(exc)));
                                    IOUtils.returnBuf(bArr);
                                    IOUtils.closeQuietly(fileOutputStream);
                                    IOUtils.closeQuietly(inputStream);
                                    i = i3;
                                    str = "write file failed";
                                    i2 = 301;
                                } catch (Throwable th5) {
                                    th = th5;
                                    bArr = buf;
                                    inputStream = inputStream2;
                                    IOUtils.returnBuf(bArr);
                                    IOUtils.closeQuietly(fileOutputStream3);
                                    IOUtils.closeQuietly(inputStream);
                                    throw th;
                                }
                            } else {
                                str = GriverMonitorConstants.MESSAGE_DOWNLOAD_CREATE_FILE_ERROR;
                                exc = null;
                                i = i3;
                                i2 = 300;
                            }
                        }
                        GriverTransport.a(downloadRequest, downloadCallback, i2, str, exc);
                    }
                });
            }
        } catch (Exception e) {
            a(downloadRequest, downloadCallback, 99, "unknown error", e);
        }
    }

    /* access modifiers changed from: private */
    public static void a(DownloadRequest downloadRequest, DownloadCallback downloadCallback, int i, String str, Throwable th) {
        if (downloadCallback != null) {
            downloadCallback.onFailed((String) null, i, str);
        }
        if (downloadRequest == null) {
            GriverLogger.e("GriverTransport", "download request is null, return direct");
            return;
        }
        StringBuilder sb = new StringBuilder("download failed for appId: ");
        sb.append(downloadRequest.appId);
        sb.append(", version: ");
        sb.append(downloadRequest.version);
        sb.append(", downloadUrl: ");
        sb.append(downloadRequest.downloadUrl);
        sb.append(", path: ");
        sb.append(downloadRequest.downloadFilePath);
        sb.append(", errorCode: ");
        sb.append(i);
        sb.append(", errorMessage: ");
        sb.append(str);
        GriverLogger.e("GriverTransport", sb.toString());
        GriverMonitor.error(GriverMonitorConstants.ERROR_DOWNLOAD_FAIL, "GriverAppContainer", new MonitorMap.Builder().appId(downloadRequest.appId).version(downloadRequest.version).deployVersion(downloadRequest.deployVersion).message(str).exception(th).downloadPath(downloadRequest.downloadFilePath).url(downloadRequest.downloadUrl).requestUrl(downloadRequest.downloadUrl).code(String.valueOf(i)).overTime(String.valueOf(downloadRequest.retryTime)).needAsynAppType(true).build());
    }

    /* access modifiers changed from: private */
    public static void a(DownloadRequest downloadRequest, DownloadCallback downloadCallback, boolean z, long j, long j2, int i) {
        if (downloadCallback != null) {
            if (z) {
                downloadCallback.onFinish((String) null);
                return;
            }
            downloadCallback.onFinish(downloadRequest.downloadFilePath);
        }
        StringBuilder sb = new StringBuilder("download success: ");
        sb.append(downloadRequest.downloadUrl);
        sb.append(" , savePath: ");
        sb.append(downloadRequest.downloadFilePath);
        GriverLogger.d("GriverTransport", sb.toString());
        GriverMonitor.event(GriverMonitorConstants.EVENT_DOWNLOAD_SUCCESS, "GriverAppContainer", new MonitorMap.Builder().appId(downloadRequest.appId).version(downloadRequest.version).deployVersion(downloadRequest.deployVersion).url(downloadRequest.downloadUrl).downloadPath(downloadRequest.downloadFilePath).cost(String.valueOf(j2)).size(String.valueOf(j)).append(GriverMonitorConstants.KEY_RETRY_TIME, String.valueOf(i)).needAsynAppType(true).build());
    }
}
