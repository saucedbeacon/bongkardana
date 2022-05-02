package com.alibaba.griver.image.framework.api;

import com.alibaba.griver.image.framework.meta.APImageDownloadRsp;

public interface APImageDownLoadCallback {
    void onError(APImageDownloadRsp aPImageDownloadRsp, Exception exc);

    void onProcess(String str, int i);

    void onSucc(APImageDownloadRsp aPImageDownloadRsp);
}
