package com.alibaba.griver.base.api;

import com.alibaba.ariver.kernel.api.extension.Extension;

public interface PageProcessPoint extends Extension {
    void onProgressChanged(String str, int i);
}
