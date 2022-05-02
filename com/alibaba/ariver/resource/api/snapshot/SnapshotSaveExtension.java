package com.alibaba.ariver.resource.api.snapshot;

import android.os.Bundle;
import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.app.api.point.app.PushWindowPoint;
import com.alibaba.ariver.app.api.point.page.PagePausePoint;

public class SnapshotSaveExtension implements PushWindowPoint, PagePausePoint {
    public boolean handlePushWindow(Page page, String str, Bundle bundle, Bundle bundle2) {
        return false;
    }

    public void onFinalized() {
    }

    public void onInitialized() {
    }

    public void onPagePause(Page page) {
    }
}
