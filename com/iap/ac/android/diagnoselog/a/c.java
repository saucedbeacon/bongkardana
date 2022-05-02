package com.iap.ac.android.diagnoselog.a;

import com.iap.ac.android.diagnoselog.core.DiagnoseLogContext;
import com.iap.ac.android.diagnoselog.storage.DiagnoseFileStorage;

public class c implements Runnable {
    public c(DiagnoseLogContext diagnoseLogContext) {
    }

    public void run() {
        ((DiagnoseFileStorage) DiagnoseLogContext.b().f9702a).a();
    }
}
