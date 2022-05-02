package com.uc.crashsdk;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.os.Process;
import com.uc.crashsdk.a.a;
import com.uc.crashsdk.a.c;
import com.uc.crashsdk.a.i;
import java.io.File;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

public class CrashLogFilesUploader extends Service {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final Handler f9860a = new i(this);
    private boolean b = false;

    public IBinder onBind(Intent intent) {
        int max;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || -134037523 == (max = dispatchOnCancelled.getMax(applicationContext, -134037523)))) {
            onCanceled oncanceled = new onCanceled(-134037523, max, 512);
            onCancelLoad.setMax(-134037523, oncanceled);
            onCancelLoad.getMin(-134037523, oncanceled);
        }
        return null;
    }

    static /* synthetic */ void a() {
        c.b("Service uploading logs ...");
        f.a(f.f(), true, true);
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        if (!p.a()) {
            StringBuilder sb = new StringBuilder("Must initialize crashsdk for current process (");
            sb.append(f.d());
            sb.append(", ");
            sb.append(Process.myPid());
            sb.append("), or set CustomInfo.mUploadUcebuCrashLog as false!");
            throw new RuntimeException(sb.toString());
        } else if (this.b) {
            return 2;
        } else {
            this.b = true;
            i.a(1, new j(this));
            return 2;
        }
    }

    public static void a(Context context) {
        String O = p.O();
        File file = new File(O);
        if (file.exists() && file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                c.c("Ucebu can not list folder: ".concat(String.valueOf(O)));
                return;
            }
            int length = listFiles.length;
            int i = 0;
            while (i < length) {
                File file2 = listFiles[i];
                if (!file2.isFile() || !file2.getName().contains("ucebu")) {
                    i++;
                } else {
                    try {
                        context.startService(new Intent(context, CrashLogFilesUploader.class));
                        return;
                    } catch (Exception e) {
                        a.a(e, false);
                        return;
                    }
                }
            }
        }
    }
}
