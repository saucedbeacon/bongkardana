package com.alibaba.griver.api.common.page;

import com.alibaba.ariver.app.api.Page;
import com.alibaba.griver.api.common.GriverEvent;

public interface GriverPageHelperEvent extends GriverEvent {
    void onPageBacked(Page page);

    void onPageDestroy(Page page);

    void onPageExit(Page page);

    void onPageFinished(Page page, String str);

    void onPagePause(Page page);

    void onPageResume(Page page);

    void onPageStarted(Page page, String str);

    void onProgressChanged(Page page, String str, int i);
}
