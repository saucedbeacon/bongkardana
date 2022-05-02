package com.google.android.play.core.ktx;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.android.play.core.install.InstallState;
import com.google.android.play.core.install.InstallStateUpdatedListener;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B&\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0017\u0010\u0003\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000eH\u0016R\"\u0010\u0003\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcom/google/android/play/core/ktx/AppUpdatePassthroughListener;", "Lcom/google/android/play/core/install/InstallStateUpdatedListener;", "listener", "disposeAction", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "(Lcom/google/android/play/core/install/InstallStateUpdatedListener;Lkotlin/jvm/functions/Function1;)V", "getDisposeAction", "()Lkotlin/jvm/functions/Function1;", "getListener", "()Lcom/google/android/play/core/install/InstallStateUpdatedListener;", "onStateUpdate", "state", "Lcom/google/android/play/core/install/InstallState;", "tmp.wkwm2e3_release"}, k = 1, mv = {1, 1, 16})
final class AppUpdatePassthroughListener implements InstallStateUpdatedListener {
    @NotNull
    private final Function1<AppUpdatePassthroughListener, Unit> disposeAction;
    @NotNull
    private final InstallStateUpdatedListener listener;

    public AppUpdatePassthroughListener(@NotNull InstallStateUpdatedListener installStateUpdatedListener, @NotNull Function1<? super AppUpdatePassthroughListener, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(installStateUpdatedListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        Intrinsics.checkParameterIsNotNull(function1, "disposeAction");
        this.listener = installStateUpdatedListener;
        this.disposeAction = function1;
    }

    @NotNull
    public final InstallStateUpdatedListener getListener() {
        return this.listener;
    }

    @NotNull
    public final Function1<AppUpdatePassthroughListener, Unit> getDisposeAction() {
        return this.disposeAction;
    }

    public final void onStateUpdate(@NotNull InstallState installState) {
        Intrinsics.checkParameterIsNotNull(installState, "state");
        this.listener.onStateUpdate(installState);
        int installStatus = installState.installStatus();
        if (installStatus == 0 || installStatus == 11 || installStatus == 5 || installStatus == 6) {
            this.disposeAction.invoke(this);
        }
    }
}
