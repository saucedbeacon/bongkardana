package com.google.android.play.core.ktx;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o.isClosing;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/google/android/play/core/ktx/AppUpdatePassthroughListener;", "invoke"}, k = 3, mv = {1, 1, 16})
final class AppUpdateManagerKtxKt$requestUpdateFlow$1$globalUpdateListener$2 extends Lambda implements Function1<AppUpdatePassthroughListener, Unit> {
    final /* synthetic */ isClosing $this_callbackFlow;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AppUpdateManagerKtxKt$requestUpdateFlow$1$globalUpdateListener$2(isClosing isclosing) {
        super(1);
        this.$this_callbackFlow = isclosing;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((AppUpdatePassthroughListener) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(@NotNull AppUpdatePassthroughListener appUpdatePassthroughListener) {
        Intrinsics.checkParameterIsNotNull(appUpdatePassthroughListener, "$receiver");
        boolean unused = this.$this_callbackFlow.getMax((Throwable) null);
    }
}
