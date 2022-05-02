package com.alibaba.griver.base.resource.point;

import com.alibaba.ariver.kernel.api.extension.Extension;
import com.alibaba.ariver.resource.api.content.ResourceQuery;

public interface BeforeGetMainPackageResourcePoint extends Extension {
    ResourceQuery beforeQuery(ResourceQuery resourceQuery);
}
