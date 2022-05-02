package com.iap.ac.android.diagnoselog.b;

import com.iap.ac.android.diagnoselog.core.UserDiagnosing;
import com.iap.ac.android.diagnoselog.upload.OSSUploader;
import java.io.File;
import java.util.concurrent.TimeUnit;

public class a implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ File f11044a;
    public final /* synthetic */ UserDiagnosing.DiagnoseTask b;
    public final /* synthetic */ OSSUploader c;

    public a(OSSUploader oSSUploader, File file, UserDiagnosing.DiagnoseTask diagnoseTask) {
        this.c = oSSUploader;
        this.f11044a = file;
        this.b = diagnoseTask;
    }

    public void run() {
        int i = 0;
        while (i < 3) {
            if (!this.c.a(this.f11044a, this.b, i == 2)) {
                if (i <= 1) {
                    try {
                        TimeUnit.SECONDS.sleep((long) ((i + 1) * 30));
                    } catch (InterruptedException unused) {
                    }
                }
                i++;
            } else {
                return;
            }
        }
    }
}
