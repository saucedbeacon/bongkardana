package com.alibaba.ariver.kernel.common.log;

import com.alibaba.ariver.kernel.RVConstants;
import com.alibaba.ariver.kernel.common.utils.RVLogger;

public class DefaultAppLoggerImpl implements AppLoggerProxy {
    public String getBizType() {
        return RVConstants.TAG;
    }

    public void log(BaseAppLog baseAppLog) {
        RVLogger.d(baseAppLog.toString());
    }
}
