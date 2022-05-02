package com.google.android.play.core.install;

final class NativeInstallStateUpdateListener implements InstallStateUpdatedListener {
    NativeInstallStateUpdateListener() {
    }

    public final native void onStateUpdate(InstallState installState);
}
