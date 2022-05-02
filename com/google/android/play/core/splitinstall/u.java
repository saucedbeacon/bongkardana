package com.google.android.play.core.splitinstall;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

final class u implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ SplitInstallRequest f11000a;
    final /* synthetic */ w b;

    u(w wVar, SplitInstallRequest splitInstallRequest) {
        this.b = wVar;
        this.f11000a = splitInstallRequest;
    }

    public final void run() {
        t a2 = this.b.b;
        List<String> moduleNames = this.f11000a.getModuleNames();
        List a3 = w.b(this.f11000a.getLanguages());
        Bundle bundle = new Bundle();
        bundle.putInt("session_id", 0);
        bundle.putInt("status", 5);
        bundle.putInt("error_code", 0);
        if (!moduleNames.isEmpty()) {
            bundle.putStringArrayList("module_names", new ArrayList(moduleNames));
        }
        if (!a3.isEmpty()) {
            bundle.putStringArrayList("languages", new ArrayList(a3));
        }
        bundle.putLong("total_bytes_to_download", 0);
        bundle.putLong("bytes_downloaded", 0);
        a2.a(SplitInstallSessionState.a(bundle));
    }
}
