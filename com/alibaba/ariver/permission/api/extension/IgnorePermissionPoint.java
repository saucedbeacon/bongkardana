package com.alibaba.ariver.permission.api.extension;

import com.alibaba.ariver.kernel.api.annotation.AutoExtension;
import com.alibaba.ariver.kernel.api.extension.Extension;

@AutoExtension
public interface IgnorePermissionPoint extends Extension {
    boolean ignoreAppPermission(String str);
}
