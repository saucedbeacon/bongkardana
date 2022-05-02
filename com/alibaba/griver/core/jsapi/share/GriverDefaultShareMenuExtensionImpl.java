package com.alibaba.griver.core.jsapi.share;

import com.alibaba.griver.api.ui.share.BaseShareItem;
import com.alibaba.griver.api.ui.share.GriverShareMenuExtension;
import com.alibaba.griver.core.jsapi.share.menu.CopyUrlShareItem;
import com.alibaba.griver.core.jsapi.share.menu.MessagesShareItem;
import com.alibaba.griver.core.jsapi.share.menu.MoreShareItem;
import java.util.ArrayList;
import java.util.List;

public class GriverDefaultShareMenuExtensionImpl implements GriverShareMenuExtension {
    public List<BaseShareItem> getShareItems() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new MessagesShareItem());
        arrayList.add(new CopyUrlShareItem());
        arrayList.add(new MoreShareItem());
        return arrayList;
    }
}
