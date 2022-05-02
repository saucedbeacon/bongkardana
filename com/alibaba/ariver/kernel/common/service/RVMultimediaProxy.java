package com.alibaba.ariver.kernel.common.service;

import com.alibaba.ariver.kernel.common.Proxiable;

public interface RVMultimediaProxy extends Proxiable {
    String decodeLocalIdToPath(String str);

    String encodePathToLocalId(String str);

    boolean saveIdWithPath(String str, String str2);
}
