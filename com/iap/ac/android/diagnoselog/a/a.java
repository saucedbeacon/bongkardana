package com.iap.ac.android.diagnoselog.a;

import com.iap.ac.android.diagnoselog.api.OnLogUploadListener;
import com.iap.ac.android.diagnoselog.core.DiagnoseLogContext;
import com.iap.ac.android.diagnoselog.core.UserDiagnosing;

public class a implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f11041a;
    public final /* synthetic */ DiagnoseLogContext b;

    public a(DiagnoseLogContext diagnoseLogContext, String str) {
        this.b = diagnoseLogContext;
        this.f11041a = str;
    }

    public void run() {
        DiagnoseLogContext diagnoseLogContext = this.b;
        new UserDiagnosing(diagnoseLogContext.d, diagnoseLogContext.c, (OnLogUploadListener) null).a(this.f11041a);
    }
}
