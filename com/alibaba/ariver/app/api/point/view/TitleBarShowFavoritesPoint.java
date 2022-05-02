package com.alibaba.ariver.app.api.point.view;

import com.alibaba.ariver.kernel.api.annotation.AutoExtension;
import com.alibaba.ariver.kernel.api.annotation.ThreadType;
import com.alibaba.ariver.kernel.api.extension.Extension;
import com.alibaba.ariver.kernel.common.service.executor.ExecutorType;

@AutoExtension
public interface TitleBarShowFavoritesPoint extends Extension {
    @ThreadType(ExecutorType.SYNC)
    void showFavorites(boolean z);
}
