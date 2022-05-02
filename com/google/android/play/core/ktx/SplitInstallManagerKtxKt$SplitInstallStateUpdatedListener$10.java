package com.google.android.play.core.ktx;

import com.google.android.play.core.splitinstall.SplitInstallSessionState;
import com.google.android.play.core.splitinstall.SplitInstallStateUpdatedListener;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "state", "Lcom/google/android/play/core/splitinstall/SplitInstallSessionState;", "onStateUpdate"}, k = 3, mv = {1, 1, 16})
final class SplitInstallManagerKtxKt$SplitInstallStateUpdatedListener$10 implements SplitInstallStateUpdatedListener {
    final /* synthetic */ Function1 $onCanceled;
    final /* synthetic */ Function1 $onCanceling;
    final /* synthetic */ Function1 $onDownloaded;
    final /* synthetic */ Function1 $onDownloading;
    final /* synthetic */ Function1 $onFailed;
    final /* synthetic */ Function1 $onInstalled;
    final /* synthetic */ Function1 $onInstalling;
    final /* synthetic */ Function1 $onNonTerminalStatus;
    final /* synthetic */ Function1 $onPending;
    final /* synthetic */ Function1 $onRequiresConfirmation;
    final /* synthetic */ Function1 $onTerminalStatus;

    SplitInstallManagerKtxKt$SplitInstallStateUpdatedListener$10(Function1 function1, Function1 function12, Function1 function13, Function1 function14, Function1 function15, Function1 function16, Function1 function17, Function1 function18, Function1 function19, Function1 function110, Function1 function111) {
        this.$onFailed = function1;
        this.$onPending = function12;
        this.$onRequiresConfirmation = function13;
        this.$onDownloading = function14;
        this.$onDownloaded = function15;
        this.$onInstalling = function16;
        this.$onInstalled = function17;
        this.$onCanceling = function18;
        this.$onCanceled = function19;
        this.$onTerminalStatus = function110;
        this.$onNonTerminalStatus = function111;
    }

    public final void onStateUpdate(@NotNull SplitInstallSessionState splitInstallSessionState) {
        Intrinsics.checkParameterIsNotNull(splitInstallSessionState, "state");
        switch (splitInstallSessionState.status()) {
            case 0:
            case 6:
                this.$onFailed.invoke(splitInstallSessionState);
                break;
            case 1:
                this.$onPending.invoke(splitInstallSessionState);
                break;
            case 2:
                this.$onDownloading.invoke(splitInstallSessionState);
                break;
            case 3:
                this.$onDownloaded.invoke(splitInstallSessionState);
                break;
            case 4:
                this.$onInstalling.invoke(splitInstallSessionState);
                break;
            case 5:
                this.$onInstalled.invoke(splitInstallSessionState);
                break;
            case 7:
                this.$onCanceled.invoke(splitInstallSessionState);
                break;
            case 8:
                this.$onRequiresConfirmation.invoke(splitInstallSessionState);
                break;
            case 9:
                this.$onCanceling.invoke(splitInstallSessionState);
                break;
        }
        if (splitInstallSessionState.hasTerminalStatus()) {
            this.$onTerminalStatus.invoke(splitInstallSessionState);
        } else {
            this.$onNonTerminalStatus.invoke(splitInstallSessionState);
        }
    }
}
