package com.google.android.play.core.ktx;

import com.google.android.play.core.assetpacks.AssetPackManager;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H@"}, d2 = {"requestPackStates", "", "Lcom/google/android/play/core/assetpacks/AssetPackManager;", "packs", "", "", "continuation", "Lkotlin/coroutines/Continuation;", "Lcom/google/android/play/core/assetpacks/AssetPackStates;"}, k = 3, mv = {1, 1, 16})
@DebugMetadata(c = "com.google.android.play.core.ktx.AssetPackManagerKtxKt", f = "AssetPackManagerKtx.kt", i = {0, 0, 0}, l = {79}, m = "requestPackStates", n = {"$this$requestPackStates", "packs", "task"}, s = {"L$0", "L$1", "L$2"})
final class AssetPackManagerKtxKt$requestPackStates$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;

    AssetPackManagerKtxKt$requestPackStates$1(Continuation continuation) {
        super(continuation);
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return AssetPackManagerKtxKt.requestPackStates((AssetPackManager) null, (List<String>) null, this);
    }
}