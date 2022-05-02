package com.alibaba.griver.base.api;

import android.net.Uri;
import java.util.Map;

public interface APWebResourceRequest {
    String getMethod();

    Map<String, String> getRequestHeaders();

    Uri getUrl();

    boolean hasGesture();

    boolean isForMainFrame();
}
