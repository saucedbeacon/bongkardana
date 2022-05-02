package com.alibaba.griver.api.ui.optionmenu;

import com.alibaba.ariver.app.api.Page;
import com.alibaba.griver.api.common.GriverExtension;
import com.alibaba.griver.api.common.menu.GriverMenuItem;
import java.util.List;

public interface GriverOptionMenuPanelExtension extends GriverExtension {
    void showOptionMenuPanel(Page page, List<GriverMenuItem> list);
}
