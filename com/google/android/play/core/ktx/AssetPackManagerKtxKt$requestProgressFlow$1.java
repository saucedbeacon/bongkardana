package com.google.android.play.core.ktx;

import com.google.android.play.core.assetpacks.AssetPackManager;
import com.google.android.play.core.assetpacks.AssetPackState;
import com.google.android.play.core.assetpacks.AssetPackStateUpdateListener;
import com.google.android.play.core.assetpacks.AssetPackStates;
import com.google.android.play.core.tasks.OnFailureListener;
import com.google.android.play.core.tasks.OnSuccessListener;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.getReadyState;
import o.hasBufferedData;
import o.isClosing;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/channels/ProducerScope;", "Lcom/google/android/play/core/assetpacks/AssetPackState;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {1, 1, 16})
@DebugMetadata(c = "com.google.android.play.core.ktx.AssetPackManagerKtxKt$requestProgressFlow$1", f = "AssetPackManagerKtx.kt", i = {0, 0, 0}, l = {67}, m = "invokeSuspend", n = {"$this$callbackFlow", "packStatesAlreadyOffered", "globalSessionListener"}, s = {"L$0", "L$1", "L$2"})
final class AssetPackManagerKtxKt$requestProgressFlow$1 extends SuspendLambda implements Function2<isClosing<? super AssetPackState>, Continuation<? super Unit>, Object> {
    final /* synthetic */ List $packs;
    final /* synthetic */ AssetPackManager $this_requestProgressFlow;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    private isClosing p$;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AssetPackManagerKtxKt$requestProgressFlow$1(AssetPackManager assetPackManager, List list, Continuation continuation) {
        super(2, continuation);
        this.$this_requestProgressFlow = assetPackManager;
        this.$packs = list;
    }

    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        Intrinsics.checkParameterIsNotNull(continuation, "completion");
        AssetPackManagerKtxKt$requestProgressFlow$1 assetPackManagerKtxKt$requestProgressFlow$1 = new AssetPackManagerKtxKt$requestProgressFlow$1(this.$this_requestProgressFlow, this.$packs, continuation);
        assetPackManagerKtxKt$requestProgressFlow$1.p$ = (isClosing) obj;
        return assetPackManagerKtxKt$requestProgressFlow$1;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((AssetPackManagerKtxKt$requestProgressFlow$1) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            final isClosing isclosing = this.p$;
            final Set linkedHashSet = new LinkedHashSet();
            final AssetPackStateUpdateListener assetPackManagerKtxKt$requestProgressFlow$1$globalSessionListener$1 = new AssetPackManagerKtxKt$requestProgressFlow$1$globalSessionListener$1(isclosing, linkedHashSet);
            this.$this_requestProgressFlow.registerListener(assetPackManagerKtxKt$requestProgressFlow$1$globalSessionListener$1);
            this.$this_requestProgressFlow.getPackStates(this.$packs).addOnSuccessListener(new OnSuccessListener<AssetPackStates>(this) {
                final /* synthetic */ AssetPackManagerKtxKt$requestProgressFlow$1 this$0;

                {
                    this.this$0 = r1;
                }

                public final void onSuccess(@NotNull AssetPackStates assetPackStates) {
                    Intrinsics.checkParameterIsNotNull(assetPackStates, "states");
                    Collection arrayList = new ArrayList();
                    for (Object next : this.this$0.$packs) {
                        if (!linkedHashSet.contains((String) next)) {
                            arrayList.add(next);
                        }
                    }
                    for (String str : (List) arrayList) {
                        getReadyState getreadystate = isclosing;
                        Map<String, AssetPackState> packStates = assetPackStates.packStates();
                        Intrinsics.checkExpressionValueIsNotNull(packStates, "packStates()");
                        AssetPackState assetPackState = packStates.get(str);
                        if (assetPackState == null) {
                            Intrinsics.throwNpe();
                        }
                        TaskUtilsKt.tryOffer(getreadystate, assetPackState);
                    }
                }
            }).addOnFailureListener(new OnFailureListener() {
                public final void onFailure(Exception exc) {
                    isclosing.getMax(exc);
                }
            });
            this.L$0 = isclosing;
            this.L$1 = linkedHashSet;
            this.L$2 = assetPackManagerKtxKt$requestProgressFlow$1$globalSessionListener$1;
            this.label = 1;
            if (hasBufferedData.length(isclosing, new Function0<Unit>(this) {
                final /* synthetic */ AssetPackManagerKtxKt$requestProgressFlow$1 this$0;

                {
                    this.this$0 = r1;
                }

                public final void invoke() {
                    this.this$0.$this_requestProgressFlow.unregisterListener(assetPackManagerKtxKt$requestProgressFlow$1$globalSessionListener$1);
                }
            }, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return Unit.INSTANCE;
    }
}
