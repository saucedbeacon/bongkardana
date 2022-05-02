package com.alibaba.griver.base.resource.appcenter.predownloadstorage;

import com.alibaba.griver.base.resource.appcenter.storage.GriverAbstractDBHelper;
import com.alibaba.griver.base.resource.appcenter.storage.GriverAppSQLiteStorage;

public class GriverAppPreDownloadSQLiteStorage extends GriverAppSQLiteStorage {
    public GriverAppPreDownloadSQLiteStorage(GriverAbstractDBHelper griverAbstractDBHelper) {
        super(griverAbstractDBHelper);
    }
}
