package com.alibaba.ariver.app.api.service;

import androidx.annotation.Nullable;
import com.alibaba.ariver.app.api.App;
import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.kernel.common.Proxiable;

public interface TinyAppInnerProxy extends Proxiable {
    boolean isEmbedWebViewInnerAppBlack(@Nullable Page page);

    boolean isInner(App app);
}
