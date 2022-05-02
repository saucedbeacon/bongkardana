package com.alibaba.griver.base.api;

import android.graphics.Bitmap;

public interface APWebHistoryItem {
    Bitmap getFavicon();

    String getOriginalUrl();

    String getTitle();

    String getUrl();
}
