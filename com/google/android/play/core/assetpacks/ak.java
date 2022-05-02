package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.play.core.internal.t;
import com.google.android.play.core.tasks.i;
import java.util.List;

class ak<T> extends t {

    /* renamed from: a  reason: collision with root package name */
    final i<T> f10846a;
    final /* synthetic */ ar b;

    ak(ar arVar, i<T> iVar) {
        this.b = arVar;
        this.f10846a = iVar;
    }

    ak(ar arVar, i iVar, byte[] bArr) {
        this(arVar, iVar);
    }

    ak(ar arVar, i iVar, char[] cArr) {
        this(arVar, iVar);
    }

    ak(ar arVar, i iVar, int[] iArr) {
        this(arVar, iVar);
    }

    ak(ar arVar, i iVar, short[] sArr) {
        this(arVar, iVar);
    }

    public void a() {
        this.b.e.a();
        ar.f10847a.c("onCancelDownloads()", new Object[0]);
    }

    public final void a(int i) {
        this.b.e.a();
        ar.f10847a.c("onCancelDownload(%d)", Integer.valueOf(i));
    }

    public void a(int i, Bundle bundle) {
        this.b.e.a();
        ar.f10847a.c("onStartDownload(%d)", Integer.valueOf(i));
    }

    public void a(Bundle bundle) {
        this.b.e.a();
        int i = bundle.getInt("error_code");
        ar.f10847a.b("onError(%d)", Integer.valueOf(i));
        this.f10846a.b((Exception) new AssetPackException(i));
    }

    public void a(Bundle bundle, Bundle bundle2) {
        this.b.f.a();
        ar.f10847a.c("onKeepAlive(%b)", Boolean.valueOf(bundle.getBoolean("keep_alive")));
    }

    public void a(List<Bundle> list) {
        this.b.e.a();
        ar.f10847a.c("onGetSessionStates", new Object[0]);
    }

    public void b() {
        this.b.e.a();
        ar.f10847a.c("onRemoveModule()", new Object[0]);
    }

    public final void b(int i) {
        this.b.e.a();
        ar.f10847a.c("onGetSession(%d)", Integer.valueOf(i));
    }

    public void b(Bundle bundle) {
        this.b.e.a();
        ar.f10847a.c("onNotifyChunkTransferred(%s, %s, %d, session=%d)", bundle.getString("module_name"), bundle.getString("slice_id"), Integer.valueOf(bundle.getInt("chunk_number")), Integer.valueOf(bundle.getInt("session_id")));
    }

    public void b(Bundle bundle, Bundle bundle2) throws RemoteException {
        this.b.e.a();
        ar.f10847a.c("onGetChunkFileDescriptor", new Object[0]);
    }

    public void c(Bundle bundle) {
        this.b.e.a();
        ar.f10847a.c("onNotifyModuleCompleted(%s, sessionId=%d)", bundle.getString("module_name"), Integer.valueOf(bundle.getInt("session_id")));
    }

    public void c(Bundle bundle, Bundle bundle2) {
        this.b.e.a();
        ar.f10847a.c("onRequestDownloadInfo()", new Object[0]);
    }

    public void d(Bundle bundle) {
        this.b.e.a();
        ar.f10847a.c("onNotifySessionFailed(%d)", Integer.valueOf(bundle.getInt("session_id")));
    }
}
