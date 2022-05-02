package com.alibaba.ariver.resource.api.appinfo;

import com.alibaba.ariver.resource.api.models.AppModel;
import java.util.List;

public interface UpdateAppCallback {
    void onError(UpdateAppException updateAppException);

    void onSuccess(List<AppModel> list);
}
