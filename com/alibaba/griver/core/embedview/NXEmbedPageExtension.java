package com.alibaba.griver.core.embedview;

import com.alibaba.ariver.app.PageNode;
import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.app.api.point.page.BackPressedPoint;
import com.alibaba.ariver.kernel.api.extension.SimpleSortable;
import com.alibaba.ariver.kernel.api.scheduler.Interruptable;
import com.alibaba.ariver.kernel.api.scheduler.Interruptor;
import com.alibaba.ariver.kernel.common.utils.RVLogger;

public class NXEmbedPageExtension extends d implements BackPressedPoint, SimpleSortable, Interruptable {

    /* renamed from: a  reason: collision with root package name */
    private String f10290a = "Griver:NXEmbedPageExtension";
    private Interruptor b;

    public void onFinalized() {
    }

    public void onInitialized() {
    }

    public int priority() {
        return 3;
    }

    public Boolean handleBackPressed(Page page) {
        RVLogger.d(this.f10290a, "handleBackPressed ");
        if (page != null && (page instanceof PageNode)) {
            PageNode pageNode = (PageNode) page;
            if (pageNode.getEmbedPage() != null && interceptBack(pageNode.getEmbedPage())) {
                RVLogger.d(this.f10290a, "interceptBackEvent  by embedView ");
                this.b.interrupt();
            }
        }
        return Boolean.FALSE;
    }

    public void setInterruptor(Interruptor interruptor) {
        this.b = interruptor;
    }
}
