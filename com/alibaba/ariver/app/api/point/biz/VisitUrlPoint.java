package com.alibaba.ariver.app.api.point.biz;

import com.alibaba.ariver.app.api.Visit;
import com.alibaba.ariver.kernel.api.annotation.AutoExtension;
import com.alibaba.ariver.kernel.api.extension.Extension;

@AutoExtension
public interface VisitUrlPoint extends Extension {
    void onVisit(Visit visit);
}
