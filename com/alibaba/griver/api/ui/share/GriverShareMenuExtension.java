package com.alibaba.griver.api.ui.share;

import com.alibaba.griver.api.common.GriverExtension;
import java.util.List;

public interface GriverShareMenuExtension extends GriverExtension {
    List<BaseShareItem> getShareItems();
}
