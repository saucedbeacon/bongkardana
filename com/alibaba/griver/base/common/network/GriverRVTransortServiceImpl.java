package com.alibaba.griver.base.common.network;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.alibaba.ariver.kernel.common.network.RVTransportService;
import com.alibaba.ariver.kernel.common.network.download.RVDownloadCallback;
import com.alibaba.ariver.kernel.common.network.download.RVDownloadRequest;
import com.alibaba.ariver.kernel.common.network.http.RVHttpRequest;
import com.alibaba.ariver.kernel.common.network.http.RVHttpResponse;
import com.alibaba.ariver.kernel.common.utils.FileUtils;
import com.alibaba.griver.api.common.monitor.GriverMonitorConstants;
import com.alibaba.griver.api.common.network.DownloadCallback;
import com.alibaba.griver.api.common.network.DownloadRequest;
import com.alibaba.griver.api.common.network.HttpRequest;
import com.alibaba.griver.api.common.network.HttpResponse;
import com.alibaba.griver.base.common.logger.GriverLogger;
import com.alibaba.griver.base.common.monitor.GriverMonitor;
import java.util.HashMap;

public class GriverRVTransortServiceImpl implements RVTransportService {
    public RVHttpResponse httpRequest(RVHttpRequest rVHttpRequest) {
        if (rVHttpRequest == null) {
            HashMap hashMap = new HashMap();
            hashMap.put(GriverMonitorConstants.KEY_EXCEPTION_MESSAGE, "rvHttpRequest is empty");
            GriverMonitor.event(GriverMonitorConstants.ERROR_HTTP_FAILED, "GriverAppContainer", hashMap);
            return null;
        } else if (TextUtils.isEmpty(rVHttpRequest.getUrl())) {
            HashMap hashMap2 = new HashMap();
            hashMap2.put(GriverMonitorConstants.KEY_EXCEPTION_MESSAGE, "rvHttpRequest url is empty");
            GriverMonitor.event(GriverMonitorConstants.ERROR_HTTP_FAILED, "GriverAppContainer", hashMap2);
            return null;
        } else {
            HttpRequest httpRequest = new HttpRequest();
            httpRequest.setUrl(rVHttpRequest.getUrl());
            httpRequest.setMethod(rVHttpRequest.getMethod());
            httpRequest.setRequestData(rVHttpRequest.getRequestData());
            httpRequest.setHeaders(rVHttpRequest.getHeaders());
            HttpResponse request = GriverTransport.request(httpRequest);
            if (request == null) {
                GriverLogger.w("GriverRVTransportServiceImpl", "response is null, return null");
                return null;
            }
            RVHttpResponse rVHttpResponse = new RVHttpResponse();
            rVHttpResponse.setStatusCode(request.getStatusCode());
            rVHttpResponse.setHeaders(request.getHeaders());
            rVHttpResponse.setResStream(request.getInputStream());
            return rVHttpResponse;
        }
    }

    public void addDownload(RVDownloadRequest rVDownloadRequest, final RVDownloadCallback rVDownloadCallback) {
        String str;
        if (rVDownloadRequest == null) {
            GriverLogger.e("GriverRVTransportServiceImpl", "download request is null");
            if (rVDownloadCallback != null) {
                rVDownloadCallback.onCancel("request is null");
                return;
            }
            return;
        }
        DownloadRequest downloadRequest = new DownloadRequest();
        downloadRequest.downloadUrl = rVDownloadRequest.getDownloadUrl();
        String downloadFileName = rVDownloadRequest.getDownloadFileName();
        if (downloadFileName == null || "".equals(downloadFileName.trim())) {
            str = rVDownloadRequest.getDownloadUrl().substring(rVDownloadRequest.getDownloadUrl().lastIndexOf("/"));
        } else {
            str = "/".concat(String.valueOf(downloadFileName));
        }
        downloadRequest.downloadFilePath = FileUtils.combinePath(rVDownloadRequest.getDownloadDir(), str);
        GriverTransport.download(downloadRequest, new DownloadCallback() {
            public void onCancel(String str) {
            }

            public void onPrepare(String str) {
            }

            public void onProgress(String str, int i) {
            }

            public void onFinish(@Nullable String str) {
                RVDownloadCallback rVDownloadCallback = rVDownloadCallback;
                if (rVDownloadCallback != null) {
                    rVDownloadCallback.onFinish(str);
                }
            }

            public void onFailed(String str, int i, String str2) {
                RVDownloadCallback rVDownloadCallback = rVDownloadCallback;
                if (rVDownloadCallback != null) {
                    rVDownloadCallback.onFailed((String) null, i, str2);
                }
            }
        });
    }
}
