package com.alibaba.ariver.kernel.api.extension.registry;

import java.util.List;

public interface Plugin {
    String getBundleName();

    List<ExtensionMetaInfo> getExtensionMetaInfos();
}
