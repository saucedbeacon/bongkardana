package com.google.android.play.core.ktx;

import com.google.android.play.core.splitinstall.SplitInstallManager;
import com.google.android.play.core.splitinstall.SplitInstallSessionState;
import com.google.android.play.core.splitinstall.SplitInstallStateUpdatedListener;
import com.google.android.play.core.tasks.OnFailureListener;
import com.google.android.play.core.tasks.OnSuccessListener;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
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
import o.hasBufferedData;
import o.isClosing;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/channels/ProducerScope;", "Lcom/google/android/play/core/splitinstall/SplitInstallSessionState;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {1, 1, 16})
@DebugMetadata(c = "com.google.android.play.core.ktx.SplitInstallManagerKtxKt$requestProgressFlow$1", f = "SplitInstallManagerKtx.kt", i = {0, 0, 0}, l = {78}, m = "invokeSuspend", n = {"$this$callbackFlow", "sessionsAlreadyOffered", "globalSessionListener"}, s = {"L$0", "L$1", "L$2"})
final class SplitInstallManagerKtxKt$requestProgressFlow$1 extends SuspendLambda implements Function2<isClosing<? super SplitInstallSessionState>, Continuation<? super Unit>, Object> {
    final /* synthetic */ SplitInstallManager $this_requestProgressFlow;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    private isClosing p$;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SplitInstallManagerKtxKt$requestProgressFlow$1(SplitInstallManager splitInstallManager, Continuation continuation) {
        super(2, continuation);
        this.$this_requestProgressFlow = splitInstallManager;
    }

    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        Intrinsics.checkParameterIsNotNull(continuation, "completion");
        SplitInstallManagerKtxKt$requestProgressFlow$1 splitInstallManagerKtxKt$requestProgressFlow$1 = new SplitInstallManagerKtxKt$requestProgressFlow$1(this.$this_requestProgressFlow, continuation);
        splitInstallManagerKtxKt$requestProgressFlow$1.p$ = (isClosing) obj;
        return splitInstallManagerKtxKt$requestProgressFlow$1;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((SplitInstallManagerKtxKt$requestProgressFlow$1) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            final isClosing isclosing = this.p$;
            final Set linkedHashSet = new LinkedHashSet();
            final SplitInstallStateUpdatedListener splitInstallManagerKtxKt$requestProgressFlow$1$globalSessionListener$1 = new SplitInstallManagerKtxKt$requestProgressFlow$1$globalSessionListener$1(isclosing, linkedHashSet);
            this.$this_requestProgressFlow.registerListener(splitInstallManagerKtxKt$requestProgressFlow$1$globalSessionListener$1);
            this.$this_requestProgressFlow.getSessionStates().addOnSuccessListener(new OnSuccessListener<List<SplitInstallSessionState>>() {
                public final void onSuccess(@NotNull List<? extends SplitInstallSessionState> list) {
                    Intrinsics.checkParameterIsNotNull(list, "sessionList");
                    Collection arrayList = new ArrayList();
                    for (Object next : list) {
                        if (!linkedHashSet.contains(Integer.valueOf(((SplitInstallSessionState) next).sessionId()))) {
                            arrayList.add(next);
                        }
                    }
                    for (SplitInstallSessionState tryOffer : (List) arrayList) {
                        TaskUtilsKt.tryOffer(isclosing, tryOffer);
                    }
                }
            }).addOnFailureListener(new OnFailureListener() {
                public final void onFailure(Exception exc) {
                    isclosing.getMax(exc);
                }
            });
            this.L$0 = isclosing;
            this.L$1 = linkedHashSet;
            this.L$2 = splitInstallManagerKtxKt$requestProgressFlow$1$globalSessionListener$1;
            this.label = 1;
            if (hasBufferedData.length(isclosing, new Function0<Unit>(this) {
                final /* synthetic */ SplitInstallManagerKtxKt$requestProgressFlow$1 this$0;

                {
                    this.this$0 = r1;
                }

                public final void invoke() {
                    this.this$0.$this_requestProgressFlow.unregisterListener(splitInstallManagerKtxKt$requestProgressFlow$1$globalSessionListener$1);
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
