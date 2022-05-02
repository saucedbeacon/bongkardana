package com.alibaba.griver.api.h5.point;

import com.alibaba.ariver.kernel.api.extension.Extension;

public interface GriverH5LoadProgressPoint extends Extension {
    void onProgressChanged(int i);
}
