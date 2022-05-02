package com.alibaba.ariver.app.api.point.biz;

import android.content.BroadcastReceiver;
import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.kernel.api.annotation.AutoExtension;
import com.alibaba.ariver.kernel.api.extension.Extension;

@AutoExtension
public interface SnapshotPoint extends Extension {
    void addScreenshotListener(Page page);

    void registerReceiever(BroadcastReceiver broadcastReceiver);

    void unregisterReceiver(BroadcastReceiver broadcastReceiver);
}
