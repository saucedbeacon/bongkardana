package com.alibaba.ariver.kernel.common.log;

import com.alibaba.ariver.kernel.api.annotation.DefaultImpl;
import com.alibaba.ariver.kernel.common.Proxiable;

@DefaultImpl("com.alibaba.ariver.kernel.common.log.DefaultAppLoggerImpl")
public interface AppLoggerProxy extends Proxiable {
    String getBizType();

    void log(BaseAppLog baseAppLog);
}
