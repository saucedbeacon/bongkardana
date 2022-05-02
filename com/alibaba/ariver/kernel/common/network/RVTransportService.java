package com.alibaba.ariver.kernel.common.network;

import androidx.annotation.WorkerThread;
import com.alibaba.ariver.kernel.common.Proxiable;
import com.alibaba.ariver.kernel.common.network.download.RVDownloadCallback;
import com.alibaba.ariver.kernel.common.network.download.RVDownloadRequest;
import com.alibaba.ariver.kernel.common.network.http.RVHttpRequest;
import com.alibaba.ariver.kernel.common.network.http.RVHttpResponse;

public interface RVTransportService extends Proxiable {
    void addDownload(RVDownloadRequest rVDownloadRequest, RVDownloadCallback rVDownloadCallback);

    @WorkerThread
    RVHttpResponse httpRequest(RVHttpRequest rVHttpRequest);
}
