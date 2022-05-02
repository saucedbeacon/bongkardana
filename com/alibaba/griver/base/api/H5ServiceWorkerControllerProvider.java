package com.alibaba.griver.base.api;

import android.webkit.WebResourceResponse;

public interface H5ServiceWorkerControllerProvider {
    WebResourceResponse shouldInterceptRequest4ServiceWorker(APWebResourceRequest aPWebResourceRequest);
}
