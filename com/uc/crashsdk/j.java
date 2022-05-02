package com.uc.crashsdk;

import com.uc.crashsdk.a.a;

final class j implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ CrashLogFilesUploader f9892a;

    j(CrashLogFilesUploader crashLogFilesUploader) {
        this.f9892a = crashLogFilesUploader;
    }

    public final void run() {
        try {
            CrashLogFilesUploader.a();
        } catch (Throwable th) {
            a.a(th, false);
        }
        this.f9892a.f9860a.sendEmptyMessage(0);
    }
}
