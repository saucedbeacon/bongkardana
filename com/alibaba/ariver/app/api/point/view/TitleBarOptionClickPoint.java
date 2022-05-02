package com.alibaba.ariver.app.api.point.view;

import com.alibaba.ariver.kernel.api.annotation.AutoExtension;
import com.alibaba.ariver.kernel.api.extension.Extension;

@AutoExtension
public interface TitleBarOptionClickPoint extends Extension {
    void onOptionClick(int i, boolean z);
}
