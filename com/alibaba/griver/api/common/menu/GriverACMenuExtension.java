package com.alibaba.griver.api.common.menu;

import com.alibaba.ariver.app.api.Page;
import com.alibaba.griver.api.common.GriverExtension;
import java.util.List;

public interface GriverACMenuExtension extends GriverExtension {
    List<GriverMenuItem> getMenuList(Page page);
}
