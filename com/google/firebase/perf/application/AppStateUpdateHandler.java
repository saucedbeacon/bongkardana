package com.google.firebase.perf.application;

import androidx.annotation.NonNull;
import com.google.firebase.perf.application.AppStateMonitor;
import com.google.firebase.perf.v1.ApplicationProcessState;
import java.lang.ref.WeakReference;

public abstract class AppStateUpdateHandler implements AppStateMonitor.AppStateCallback {
    private final WeakReference<AppStateMonitor.AppStateCallback> appStateCallback;
    private final AppStateMonitor appStateMonitor;
    private ApplicationProcessState currentAppState;
    private boolean isRegisteredForAppState;

    public AppStateUpdateHandler() {
        this(AppStateMonitor.getInstance());
    }

    public AppStateUpdateHandler(@NonNull AppStateMonitor appStateMonitor2) {
        this.isRegisteredForAppState = false;
        this.currentAppState = ApplicationProcessState.APPLICATION_PROCESS_STATE_UNKNOWN;
        this.appStateMonitor = appStateMonitor2;
        this.appStateCallback = new WeakReference<>(this);
    }

    /* access modifiers changed from: protected */
    public void registerForAppState() {
        if (!this.isRegisteredForAppState) {
            this.currentAppState = this.appStateMonitor.getAppState();
            this.appStateMonitor.registerForAppState(this.appStateCallback);
            this.isRegisteredForAppState = true;
        }
    }

    /* access modifiers changed from: protected */
    public void unregisterForAppState() {
        if (this.isRegisteredForAppState) {
            this.appStateMonitor.unregisterForAppState(this.appStateCallback);
            this.isRegisteredForAppState = false;
        }
    }

    /* access modifiers changed from: protected */
    public void incrementTsnsCount(int i) {
        this.appStateMonitor.incrementTsnsCount(i);
    }

    public void onUpdateAppState(ApplicationProcessState applicationProcessState) {
        if (this.currentAppState == ApplicationProcessState.APPLICATION_PROCESS_STATE_UNKNOWN) {
            this.currentAppState = applicationProcessState;
        } else if (this.currentAppState != applicationProcessState && applicationProcessState != ApplicationProcessState.APPLICATION_PROCESS_STATE_UNKNOWN) {
            this.currentAppState = ApplicationProcessState.FOREGROUND_BACKGROUND;
        }
    }

    public ApplicationProcessState getAppState() {
        return this.currentAppState;
    }
}
