package com.alibaba.griver.api.resource.extensions;

import com.alibaba.ariver.kernel.common.Proxiable;
import java.util.List;

public interface GriverCommonResourceProxy extends Proxiable {
    List<String> getCommonResources();
}
