package com.alibaba.griver.core.ui.loading;

import android.app.Activity;
import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.app.api.PageContext;
import com.alibaba.ariver.app.api.point.page.PageEnterPoint;
import com.alibaba.ariver.app.api.point.page.PageExitPoint;
import com.alibaba.ariver.app.api.ui.PageContainer;
import com.alibaba.ariver.kernel.RVStartParams;
import com.alibaba.ariver.kernel.api.node.NodeAware;
import com.alibaba.ariver.kernel.common.utils.BundleUtils;
import com.alibaba.griver.api.webview.PageErrorPoint;
import com.alibaba.griver.api.webview.PageFinishedPoint;
import com.alibaba.griver.base.common.env.GriverEnv;
import com.alibaba.griver.base.common.logger.GriverLogger;
import com.alibaba.griver.core.R;
import com.alibaba.griver.ui.container.GriverPageContainer;
import java.lang.ref.WeakReference;

public class GriverPageLoadingExtension implements PageEnterPoint, PageExitPoint, NodeAware<Page>, PageErrorPoint, PageFinishedPoint {
    WeakReference<Page> pageWeakReference;

    public void onFinalized() {
    }

    public void onInitialized() {
    }

    public void setNode(WeakReference<Page> weakReference) {
        this.pageWeakReference = weakReference;
    }

    public Class<Page> getNodeType() {
        return Page.class;
    }

    public void onPageFinished(String str) {
        b();
        try {
            if (this.pageWeakReference == null) {
                return;
            }
            if (this.pageWeakReference.get() != null) {
                Page page = this.pageWeakReference.get();
                if (page.getPageContext() == null) {
                    return;
                }
                if (page.getPageContext().getActivity() != null) {
                    Activity activity = page.getPageContext().getActivity();
                    if (BundleUtils.getBoolean(page.getStartParams(), RVStartParams.KEY_TRANSPARENT, false)) {
                        activity.findViewById(R.id.fragment_container).setBackgroundColor(0);
                    }
                    PageContainer pageContainer = page.getPageContext().getPageContainer();
                    if (pageContainer instanceof GriverPageContainer) {
                        ((GriverPageContainer) pageContainer).onPageFinished(str);
                    }
                }
            }
        } catch (Exception e) {
            GriverLogger.e("GriverPageLoadingExtension", "set transparent background failed", e);
        }
    }

    public void onPageError(String str) {
        b();
    }

    private void a() {
        PageContext pageContext;
        WeakReference<Page> weakReference = this.pageWeakReference;
        if (weakReference != null && weakReference.get() != null && (pageContext = this.pageWeakReference.get().getPageContext()) != null && pageContext.getLoadingView() != null) {
            pageContext.getLoadingView().dismiss();
            pageContext.getLoadingView().show(GriverEnv.getResources().getString(R.string.griver_core_loading), 0, true);
        }
    }

    private void b() {
        WeakReference<Page> weakReference = this.pageWeakReference;
        if (weakReference != null && weakReference.get() != null) {
            PageContext pageContext = this.pageWeakReference.get().getPageContext();
            if (!(pageContext == null || pageContext.getLoadingView() == null)) {
                pageContext.getLoadingView().dismiss();
            }
            if (pageContext != null && pageContext.getTitleBar() != null) {
                pageContext.getTitleBar().showTitleLoading(false);
            }
        }
    }

    public void onPageEnter(Page page) {
        if (BundleUtils.getBoolean(page.getStartParams(), "showLoading", false)) {
            a();
        }
    }

    public void onPageExit(Page page) {
        b();
    }
}
