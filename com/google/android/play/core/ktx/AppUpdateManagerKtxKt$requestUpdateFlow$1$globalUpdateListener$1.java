package com.google.android.play.core.ktx;

import com.google.android.play.core.install.InstallState;
import com.google.android.play.core.install.InstallStateUpdatedListener;
import com.google.android.play.core.ktx.AppUpdateResult;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.isClosing;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "installState", "Lcom/google/android/play/core/install/InstallState;", "onStateUpdate"}, k = 3, mv = {1, 1, 16})
final class AppUpdateManagerKtxKt$requestUpdateFlow$1$globalUpdateListener$1 implements InstallStateUpdatedListener {
    final /* synthetic */ isClosing $this_callbackFlow;
    final /* synthetic */ AppUpdateManagerKtxKt$requestUpdateFlow$1 this$0;

    AppUpdateManagerKtxKt$requestUpdateFlow$1$globalUpdateListener$1(AppUpdateManagerKtxKt$requestUpdateFlow$1 appUpdateManagerKtxKt$requestUpdateFlow$1, isClosing isclosing) {
        this.this$0 = appUpdateManagerKtxKt$requestUpdateFlow$1;
        this.$this_callbackFlow = isclosing;
    }

    public final void onStateUpdate(@NotNull InstallState installState) {
        Intrinsics.checkParameterIsNotNull(installState, "installState");
        if (installState.installStatus() == 11) {
            TaskUtilsKt.tryOffer(this.$this_callbackFlow, new AppUpdateResult.Downloaded(this.this$0.$this_requestUpdateFlow));
        } else {
            TaskUtilsKt.tryOffer(this.$this_callbackFlow, new AppUpdateResult.InProgress(installState));
        }
    }
}
