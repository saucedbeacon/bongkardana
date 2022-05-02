package com.alibaba.ariver.app.api.point.biz;

import com.alibaba.ariver.kernel.api.annotation.AutoExtension;
import com.alibaba.ariver.kernel.api.extension.Extension;

@AutoExtension
public interface SceneParamChangePoint extends Extension {
    boolean onSceneParamChange(String str, Object obj);
}
