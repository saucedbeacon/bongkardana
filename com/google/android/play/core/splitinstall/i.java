package com.google.android.play.core.splitinstall;

import android.app.Activity;
import android.content.IntentSender;
import androidx.annotation.NonNull;
import com.google.android.play.core.common.IntentSenderForResultStarter;
import com.google.android.play.core.internal.cj;
import com.google.android.play.core.splitinstall.testing.FakeSplitInstallManager;
import com.google.android.play.core.tasks.Task;
import java.io.File;
import java.util.List;
import java.util.Locale;
import java.util.Set;

final class i implements SplitInstallManager {

    /* renamed from: a  reason: collision with root package name */
    private final cj<w> f10983a;
    private final cj<FakeSplitInstallManager> b;
    private final cj<File> c;

    i(cj<w> cjVar, cj<FakeSplitInstallManager> cjVar2, cj<File> cjVar3) {
        this.f10983a = cjVar;
        this.b = cjVar2;
        this.c = cjVar3;
    }

    private final SplitInstallManager a() {
        return (SplitInstallManager) (this.c.a() == null ? this.f10983a : this.b).a();
    }

    @NonNull
    public final Task<Void> cancelInstall(int i) {
        return a().cancelInstall(i);
    }

    @NonNull
    public final Task<Void> deferredInstall(List<String> list) {
        return a().deferredInstall(list);
    }

    @NonNull
    public final Task<Void> deferredLanguageInstall(List<Locale> list) {
        return a().deferredLanguageInstall(list);
    }

    @NonNull
    public final Task<Void> deferredLanguageUninstall(List<Locale> list) {
        return a().deferredLanguageUninstall(list);
    }

    @NonNull
    public final Task<Void> deferredUninstall(List<String> list) {
        return a().deferredUninstall(list);
    }

    @NonNull
    public final Set<String> getInstalledLanguages() {
        return a().getInstalledLanguages();
    }

    @NonNull
    public final Set<String> getInstalledModules() {
        return a().getInstalledModules();
    }

    @NonNull
    public final Task<SplitInstallSessionState> getSessionState(int i) {
        return a().getSessionState(i);
    }

    @NonNull
    public final Task<List<SplitInstallSessionState>> getSessionStates() {
        return a().getSessionStates();
    }

    public final void registerListener(@NonNull SplitInstallStateUpdatedListener splitInstallStateUpdatedListener) {
        a().registerListener(splitInstallStateUpdatedListener);
    }

    public final boolean startConfirmationDialogForResult(@NonNull SplitInstallSessionState splitInstallSessionState, @NonNull Activity activity, int i) throws IntentSender.SendIntentException {
        return a().startConfirmationDialogForResult(splitInstallSessionState, activity, i);
    }

    public final boolean startConfirmationDialogForResult(@NonNull SplitInstallSessionState splitInstallSessionState, @NonNull IntentSenderForResultStarter intentSenderForResultStarter, int i) throws IntentSender.SendIntentException {
        return a().startConfirmationDialogForResult(splitInstallSessionState, intentSenderForResultStarter, i);
    }

    public final Task<Integer> startInstall(@NonNull SplitInstallRequest splitInstallRequest) {
        return a().startInstall(splitInstallRequest);
    }

    public final void unregisterListener(@NonNull SplitInstallStateUpdatedListener splitInstallStateUpdatedListener) {
        a().unregisterListener(splitInstallStateUpdatedListener);
    }
}
