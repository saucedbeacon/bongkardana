package com.uc.crashsdk;

import android.os.Handler;
import android.os.Message;
import android.os.Process;
import com.uc.crashsdk.a.c;

final class i extends Handler {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ CrashLogFilesUploader f9891a;

    i(CrashLogFilesUploader crashLogFilesUploader) {
        this.f9891a = crashLogFilesUploader;
    }

    public final void handleMessage(Message message) {
        if (message.what == 0) {
            c.b("Crash log upload service done, exiting");
            this.f9891a.stopSelf();
            Process.killProcess(Process.myPid());
        }
    }
}
