package o;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.BufferOverflow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\b \u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u0002H\u00020\u0003B+\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u001f\u0010\r\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u0010H@ø\u0001\u0000¢\u0006\u0002\u0010\u0011J\u001f\u0010\u0012\u001a\u00020\u000e2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00010\u0014H@ø\u0001\u0000¢\u0006\u0002\u0010\u0015J'\u0010\u0016\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u00102\u0006\u0010\u0017\u001a\u00020\u0007H@ø\u0001\u0000¢\u0006\u0002\u0010\u0018J\u001f\u0010\u0019\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u0010H¤@ø\u0001\u0000¢\u0006\u0002\u0010\u0011J\b\u0010\u001a\u001a\u00020\u001bH\u0016R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0004X\u0004¢\u0006\u0002\n\u0000\u0002\u0004\n\u0002\b\u0019¨\u0006\u001c"}, d2 = {"Lkotlinx/coroutines/flow/internal/ChannelFlowOperator;", "S", "T", "Lkotlinx/coroutines/flow/internal/ChannelFlow;", "flow", "Lkotlinx/coroutines/flow/Flow;", "context", "Lkotlin/coroutines/CoroutineContext;", "capacity", "", "onBufferOverflow", "Lkotlinx/coroutines/channels/BufferOverflow;", "(Lkotlinx/coroutines/flow/Flow;Lkotlin/coroutines/CoroutineContext;ILkotlinx/coroutines/channels/BufferOverflow;)V", "collect", "", "collector", "Lkotlinx/coroutines/flow/FlowCollector;", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "collectTo", "scope", "Lkotlinx/coroutines/channels/ProducerScope;", "(Lkotlinx/coroutines/channels/ProducerScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "collectWithContextUndispatched", "newContext", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "flowCollect", "toString", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 4, 2})
public abstract class isFlashEdgeCase<S, T> extends flushAndClose<T> {
    @NotNull
    @JvmField
    protected final onWebsocketHandshakeSentAsClient<S> setMax;

    /* access modifiers changed from: protected */
    @Nullable
    public abstract Object getMin(@NotNull onWebsocketPong<? super T> onwebsocketpong, @NotNull Continuation<? super Unit> continuation);

    public isFlashEdgeCase(@NotNull onWebsocketHandshakeSentAsClient<? extends S> onwebsockethandshakesentasclient, @NotNull CoroutineContext coroutineContext, int i, @NotNull BufferOverflow bufferOverflow) {
        super(coroutineContext, i, bufferOverflow);
        this.setMax = onwebsockethandshakesentasclient;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00030\u0005H@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "S", "T", "it", "Lkotlinx/coroutines/flow/FlowCollector;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {1, 4, 2})
    @DebugMetadata(c = "kotlinx.coroutines.flow.internal.ChannelFlowOperator$collectWithContextUndispatched$2", f = "ChannelFlow.kt", i = {}, l = {164}, m = "invokeSuspend", n = {}, s = {})
    static final class setMin extends SuspendLambda implements Function2<onWebsocketPong<? super T>, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ isFlashEdgeCase this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        setMin(isFlashEdgeCase isflashedgecase, Continuation continuation) {
            super(2, continuation);
            this.this$0 = isflashedgecase;
        }

        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            setMin setmin = new setMin(this.this$0, continuation);
            setmin.L$0 = obj;
            return setmin;
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((setMin) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }

        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                isFlashEdgeCase isflashedgecase = this.this$0;
                this.label = 1;
                if (isflashedgecase.getMin((onWebsocketPong) this.L$0, (Continuation<? super Unit>) this) == coroutine_suspended) {
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

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.setMax);
        sb.append(" -> ");
        sb.append(super.toString());
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    @Nullable
    public final Object getMin(@NotNull isClosing<? super T> isclosing, @NotNull Continuation<? super Unit> continuation) {
        Object min = getMin(new onWebsocketError(isclosing), continuation);
        return min != IntrinsicsKt.getCOROUTINE_SUSPENDED() ? Unit.INSTANCE : min;
    }

    @Nullable
    public Object collect(@NotNull onWebsocketPong<? super T> onwebsocketpong, @NotNull Continuation<? super Unit> continuation) {
        if (this.getMin == -3) {
            CoroutineContext context = continuation.getContext();
            CoroutineContext plus = context.plus(this.length);
            if (Intrinsics.areEqual((Object) plus, (Object) context)) {
                Object min = getMin(onwebsocketpong, continuation);
                if (min != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    return Unit.INSTANCE;
                }
                return min;
            } else if (Intrinsics.areEqual((Object) (ContinuationInterceptor) plus.get(ContinuationInterceptor.Key), (Object) (ContinuationInterceptor) context.get(ContinuationInterceptor.Key))) {
                CoroutineContext context2 = continuation.getContext();
                if (!(onwebsocketpong instanceof onWebsocketError) && !(onwebsocketpong instanceof onWebsocketClosing)) {
                    onwebsocketpong = new setAttribute<>(onwebsocketpong, context2);
                }
                Object max = WebSocketListener.setMax(plus, onwebsocketpong, WebSocketClient.getMin(plus), new setMin(this, (Continuation) null), continuation);
                if (max != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    max = Unit.INSTANCE;
                }
                if (max != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    return Unit.INSTANCE;
                }
                return max;
            }
        }
        Object collect = super.collect(onwebsocketpong, continuation);
        return collect != IntrinsicsKt.getCOROUTINE_SUSPENDED() ? Unit.INSTANCE : collect;
    }
}
