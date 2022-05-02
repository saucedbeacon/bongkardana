package com.google.android.play.core.splitinstall;

final class s implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ SplitInstallSessionState f9625a;
    final /* synthetic */ int b;
    final /* synthetic */ int c;
    final /* synthetic */ t d;

    s(t tVar, SplitInstallSessionState splitInstallSessionState, int i, int i2) {
        this.d = tVar;
        this.f9625a = splitInstallSessionState;
        this.b = i;
        this.c = i2;
    }

    public final void run() {
        t tVar = this.d;
        SplitInstallSessionState splitInstallSessionState = this.f9625a;
        tVar.a(new a(splitInstallSessionState.sessionId(), this.b, this.c, splitInstallSessionState.bytesDownloaded(), splitInstallSessionState.totalBytesToDownload(), splitInstallSessionState.a(), splitInstallSessionState.b(), splitInstallSessionState.resolutionIntent(), splitInstallSessionState.c()));
    }
}
