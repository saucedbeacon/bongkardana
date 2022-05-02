package o;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.InternalCoroutinesApi;
import kotlinx.coroutines.channels.BufferOverflow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\n\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0014J\u001e\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\u001f\u0010\u001d\u001a\u00020\u000e2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u001fH@ø\u0001\u0000¢\u0006\u0002\u0010 J\u001f\u0010!\u001a\u00020\u000e2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\fH¤@ø\u0001\u0000¢\u0006\u0002\u0010\"J&\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH$J\u0010\u0010$\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010%H\u0016J&\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000%2\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0016\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000(2\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\b\u0010)\u001a\u00020\u0016H\u0016R\u0010\u0010\u0005\u001a\u00020\u00068\u0006X\u0004¢\u0006\u0002\n\u0000R9\u0010\n\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000b8@X\u0004ø\u0001\u0000¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u00020\b8\u0006X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\u00020\u00068BX\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014\u0002\u0004\n\u0002\b\u0019¨\u0006*"}, d2 = {"Lkotlinx/coroutines/flow/internal/ChannelFlow;", "T", "Lkotlinx/coroutines/flow/internal/FusibleFlow;", "context", "Lkotlin/coroutines/CoroutineContext;", "capacity", "", "onBufferOverflow", "Lkotlinx/coroutines/channels/BufferOverflow;", "(Lkotlin/coroutines/CoroutineContext;ILkotlinx/coroutines/channels/BufferOverflow;)V", "collectToFun", "Lkotlin/Function2;", "Lkotlinx/coroutines/channels/ProducerScope;", "Lkotlin/coroutines/Continuation;", "", "", "getCollectToFun$kotlinx_coroutines_core", "()Lkotlin/jvm/functions/Function2;", "produceCapacity", "getProduceCapacity", "()I", "additionalToStringProps", "", "broadcastImpl", "Lkotlinx/coroutines/channels/BroadcastChannel;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "start", "Lkotlinx/coroutines/CoroutineStart;", "collect", "collector", "Lkotlinx/coroutines/flow/FlowCollector;", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "collectTo", "(Lkotlinx/coroutines/channels/ProducerScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "create", "dropChannelOperators", "Lkotlinx/coroutines/flow/Flow;", "fuse", "produceImpl", "Lkotlinx/coroutines/channels/ReceiveChannel;", "toString", "kotlinx-coroutines-core"}, k = 1, mv = {1, 4, 2})
@InternalCoroutinesApi
public abstract class flushAndClose<T> implements onWebsocketOpen<T> {
    @JvmField
    public final int getMin;
    @NotNull
    @JvmField
    public final CoroutineContext length;
    @NotNull
    @JvmField
    public final BufferOverflow setMin;

    /* access modifiers changed from: protected */
    @NotNull
    public abstract flushAndClose<T> getMax(@NotNull CoroutineContext coroutineContext, int i, @NotNull BufferOverflow bufferOverflow);

    /* access modifiers changed from: protected */
    @Nullable
    public abstract Object getMin(@NotNull isClosing<? super T> isclosing, @NotNull Continuation<? super Unit> continuation);

    public flushAndClose(@NotNull CoroutineContext coroutineContext, int i, @NotNull BufferOverflow bufferOverflow) {
        this.length = coroutineContext;
        this.getMin = i;
        this.setMin = bufferOverflow;
        if (getApdidToken.setMax()) {
            if (!(this.getMin != -1)) {
                throw new AssertionError();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004H@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "T", "it", "Lkotlinx/coroutines/channels/ProducerScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {1, 4, 2})
    @DebugMetadata(c = "kotlinx.coroutines.flow.internal.ChannelFlow$collectToFun$1", f = "ChannelFlow.kt", i = {}, l = {60}, m = "invokeSuspend", n = {}, s = {})
    static final class getMax extends SuspendLambda implements Function2<isClosing<? super T>, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ flushAndClose this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        getMax(flushAndClose flushandclose, Continuation continuation) {
            super(2, continuation);
            this.this$0 = flushandclose;
        }

        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            getMax getmax = new getMax(this.this$0, continuation);
            getmax.L$0 = obj;
            return getmax;
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((getMax) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }

        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                flushAndClose flushandclose = this.this$0;
                this.label = 1;
                if (flushandclose.getMin((isClosing) this.L$0, this) == coroutine_suspended) {
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
    public final onWebsocketHandshakeSentAsClient<T> setMax(@NotNull CoroutineContext coroutineContext, int i, @NotNull BufferOverflow bufferOverflow) {
        boolean z = true;
        if (getApdidToken.setMax()) {
            if (!(i != -1)) {
                throw new AssertionError();
            }
        }
        CoroutineContext plus = coroutineContext.plus(this.length);
        if (bufferOverflow == BufferOverflow.SUSPEND) {
            int i2 = this.getMin;
            if (i2 != -3) {
                if (i != -3) {
                    if (i2 != -2) {
                        if (i != -2) {
                            if (getApdidToken.setMax()) {
                                if (!(this.getMin >= 0)) {
                                    throw new AssertionError();
                                }
                            }
                            if (getApdidToken.setMax()) {
                                if (i < 0) {
                                    z = false;
                                }
                                if (!z) {
                                    throw new AssertionError();
                                }
                            }
                            i2 = this.getMin + i;
                            if (i2 < 0) {
                                i = Integer.MAX_VALUE;
                            }
                        }
                    }
                }
                i = i2;
            }
            bufferOverflow = this.setMin;
        }
        if (Intrinsics.areEqual((Object) plus, (Object) this.length) && i == this.getMin && bufferOverflow == this.setMin) {
            return this;
        }
        return getMax(plus, i, bufferOverflow);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u0003H@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "T", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {1, 4, 2})
    @DebugMetadata(c = "kotlinx.coroutines.flow.internal.ChannelFlow$collect$2", f = "ChannelFlow.kt", i = {}, l = {135}, m = "invokeSuspend", n = {}, s = {})
    static final class setMin extends SuspendLambda implements Function2<initToken, Continuation<? super Unit>, Object> {
        final /* synthetic */ onWebsocketPong $collector;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ flushAndClose this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        setMin(flushAndClose flushandclose, onWebsocketPong onwebsocketpong, Continuation continuation) {
            super(2, continuation);
            this.this$0 = flushandclose;
            this.$collector = onwebsocketpong;
        }

        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            setMin setmin = new setMin(this.this$0, this.$collector, continuation);
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
                initToken inittoken = (initToken) this.L$0;
                onWebsocketPong onwebsocketpong = this.$collector;
                flushAndClose flushandclose = this.this$0;
                getRemoteSocketAddress getremotesocketaddress = new getRemoteSocketAddress(registerLog.setMin(inittoken, flushandclose.length), sendFragmentedFrame.getMax(flushandclose.getMin == -3 ? -2 : flushandclose.getMin, flushandclose.setMin, 4));
                getremotesocketaddress.setMax(CoroutineStart.ATOMIC, getremotesocketaddress, new getMax(flushandclose, (Continuation) null));
                this.label = 1;
                Object min = WebSocketFactory.getMin(onwebsocketpong, getremotesocketaddress, true, this);
                if (min != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    min = Unit.INSTANCE;
                }
                if (min == coroutine_suspended) {
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
        ArrayList arrayList = new ArrayList(4);
        if (this.length != EmptyCoroutineContext.INSTANCE) {
            StringBuilder sb = new StringBuilder("context=");
            sb.append(this.length);
            arrayList.add(sb.toString());
        }
        if (this.getMin != -3) {
            StringBuilder sb2 = new StringBuilder("capacity=");
            sb2.append(this.getMin);
            arrayList.add(sb2.toString());
        }
        if (this.setMin != BufferOverflow.SUSPEND) {
            StringBuilder sb3 = new StringBuilder("onBufferOverflow=");
            sb3.append(this.setMin);
            arrayList.add(sb3.toString());
        }
        StringBuilder sb4 = new StringBuilder();
        sb4.append(getClass().getSimpleName());
        sb4.append('[');
        sb4.append(CollectionsKt.joinToString$default(arrayList, ", ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null));
        sb4.append(']');
        return sb4.toString();
    }

    @Nullable
    public Object collect(@NotNull onWebsocketPong<? super T> onwebsocketpong, @NotNull Continuation<? super Unit> continuation) {
        WebSocketCallback webSocketCallback = new WebSocketCallback(continuation.getContext(), continuation);
        Object length2 = sendHandshake.length(webSocketCallback, webSocketCallback, new setMin(this, onwebsocketpong, (Continuation) null));
        if (length2 == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return length2 != IntrinsicsKt.getCOROUTINE_SUSPENDED() ? Unit.INSTANCE : length2;
    }
}
