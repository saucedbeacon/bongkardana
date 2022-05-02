package com.alibaba.ariver.engine.api.extensions;

import com.alibaba.ariver.kernel.api.annotation.AutoExtension;
import com.alibaba.ariver.kernel.api.extension.Extension;
import java.util.List;
import java.util.Map;

@AutoExtension
public interface ReceivedHeaderPoint extends Extension {
    void onReceivedResponseHeader(Map<String, List<String>> map);
}
