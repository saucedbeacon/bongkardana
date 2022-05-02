package com.alibaba.ariver.resource.api.prepare;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.alibaba.ariver.app.api.EntryInfo;
import com.alibaba.ariver.resource.api.models.AppModel;

public interface PrepareCallback {
    void prepareAbort();

    void prepareFail(PrepareData prepareData, PrepareException prepareException);

    void prepareFinish(PrepareData prepareData, @Nullable AppModel appModel, @Nullable Bundle bundle, @Nullable Bundle bundle2);

    void showLoading(boolean z, EntryInfo entryInfo);

    void startApp(PrepareCallbackParam prepareCallbackParam);

    void updateLoading(EntryInfo entryInfo);
}
