package com.alibaba.griver.core.ui.menu;

import com.alibaba.ariver.app.api.Page;
import com.alibaba.griver.api.common.menu.GriverMenuExtension;
import com.alibaba.griver.api.common.menu.GriverMenuItem;
import java.util.LinkedList;
import java.util.List;

public class GriverMenuExtensionImpl implements GriverMenuExtension {
    public List<GriverMenuItem> getAppendMenuList(Page page) {
        return null;
    }

    public List<GriverMenuItem> getMenuList(Page page) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(new ShareMenu());
        linkedList.add(new SettingMenu());
        linkedList.add(new AboutMenu());
        List<GriverMenuItem> appendMenuList = getAppendMenuList(page);
        if (appendMenuList != null) {
            linkedList.addAll(appendMenuList);
        }
        return linkedList;
    }
}
