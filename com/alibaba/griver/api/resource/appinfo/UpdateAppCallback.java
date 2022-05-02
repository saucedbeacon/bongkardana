package com.alibaba.griver.api.resource.appinfo;

import com.alibaba.ariver.resource.api.models.AppModel;
import java.util.List;

public interface UpdateAppCallback {
    void onFailure(UpdateAppException updateAppException);

    void onSuccess(List<AppModel> list);
}
