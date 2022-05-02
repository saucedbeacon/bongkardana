package com.alibaba.ariver.app.api.point.page;

import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.kernel.api.annotation.AutoExtension;
import com.alibaba.ariver.kernel.api.annotation.ThreadType;
import com.alibaba.ariver.kernel.api.extension.Extension;
import com.alibaba.ariver.kernel.api.extension.SimpleSorter;
import com.alibaba.ariver.kernel.common.service.executor.ExecutorType;

@AutoExtension
public interface BackPressedPoint extends Extension, SimpleSorter {
    @ThreadType(ExecutorType.SYNC)
    Boolean handleBackPressed(Page page);
}
