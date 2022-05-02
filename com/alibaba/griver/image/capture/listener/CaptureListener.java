package com.alibaba.griver.image.capture.listener;

import com.alibaba.griver.image.capture.meta.MediaInfo;

public interface CaptureListener {
    void onAction(boolean z, MediaInfo mediaInfo);
}
