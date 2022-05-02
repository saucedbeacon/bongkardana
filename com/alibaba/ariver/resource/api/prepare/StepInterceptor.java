package com.alibaba.ariver.resource.api.prepare;

import com.alibaba.ariver.resource.api.models.AppModel;

public interface StepInterceptor {
    boolean after(PrepareStep prepareStep, PrepareController prepareController);

    boolean before(PrepareStep prepareStep, PrepareController prepareController);

    void init(PrepareContext prepareContext, PrepareCallback prepareCallback);

    boolean onError(PrepareException prepareException, PrepareController prepareController);

    void onGetAppInfo(AppModel appModel);
}
