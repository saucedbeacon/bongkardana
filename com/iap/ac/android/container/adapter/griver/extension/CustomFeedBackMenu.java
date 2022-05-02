package com.iap.ac.android.container.adapter.griver.extension;

import com.alibaba.ariver.app.api.Page;
import com.alibaba.griver.core.ui.menu.FeedbackMenu;

public class CustomFeedBackMenu extends FeedbackMenu {
    public boolean canShow(Page page) {
        return true;
    }

    public CustomFeedBackMenu() {
        this.listener = null;
    }
}
