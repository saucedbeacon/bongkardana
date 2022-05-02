package com.alibaba.griver.api.common.menu;

import com.alibaba.ariver.app.api.Page;

public class GriverBaseMenuItem extends GriverMenuItem {
    public boolean canShow(Page page) {
        return true;
    }
}
