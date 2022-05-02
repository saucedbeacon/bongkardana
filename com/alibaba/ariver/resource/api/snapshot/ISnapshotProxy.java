package com.alibaba.ariver.resource.api.snapshot;

import com.alibaba.ariver.app.api.App;
import com.alibaba.ariver.kernel.common.Proxiable;

public interface ISnapshotProxy extends Proxiable {
    String getSnapshotExtDir(App app);

    boolean isSnapshotEnable(App app);

    boolean isSnapshotFileExist(App app);

    void snapshotHit(App app);
}
