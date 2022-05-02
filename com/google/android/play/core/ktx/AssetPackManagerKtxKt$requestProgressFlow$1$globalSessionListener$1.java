package com.google.android.play.core.ktx;

import com.google.android.play.core.assetpacks.AssetPackState;
import com.google.android.play.core.assetpacks.AssetPackStateUpdateListener;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.isClosing;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "state", "Lcom/google/android/play/core/assetpacks/AssetPackState;", "onStateUpdate"}, k = 3, mv = {1, 1, 16})
final class AssetPackManagerKtxKt$requestProgressFlow$1$globalSessionListener$1 implements AssetPackStateUpdateListener {
    final /* synthetic */ Set $packStatesAlreadyOffered;
    final /* synthetic */ isClosing $this_callbackFlow;

    AssetPackManagerKtxKt$requestProgressFlow$1$globalSessionListener$1(isClosing isclosing, Set set) {
        this.$this_callbackFlow = isclosing;
        this.$packStatesAlreadyOffered = set;
    }

    public final void onStateUpdate(@NotNull AssetPackState assetPackState) {
        Intrinsics.checkParameterIsNotNull(assetPackState, "state");
        Set set = this.$packStatesAlreadyOffered;
        String name = assetPackState.name();
        Intrinsics.checkExpressionValueIsNotNull(name, "name()");
        set.add(name);
        TaskUtilsKt.tryOffer(this.$this_callbackFlow, assetPackState);
    }
}
