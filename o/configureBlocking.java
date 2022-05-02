package o;

import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.channels.ClosedReceiveChannelException;
import o.AbstractClientProxyChannel;
import o.getWebSocketContext;
import o.onWebsocketHandshakeReceivedAsClient;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b \u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003:\u0007XYZ[\\]^B'\u0012 \u0010\u0004\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\u0007¢\u0006\u0002\u0010\bJ\u0012\u0010\u001b\u001a\u00020\n2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0007J\u0016\u0010\u001b\u001a\u00020\u00062\u000e\u0010\u001c\u001a\n\u0018\u00010\u001ej\u0004\u0018\u0001`\u001fJ\u0017\u0010 \u001a\u00020\n2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0000¢\u0006\u0002\b!J\u000e\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000#H\u0004J\u0016\u0010$\u001a\u00020\n2\f\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000&H\u0002J\u0016\u0010'\u001a\u00020\n2\f\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000&H\u0014JR\u0010(\u001a\u00020\n\"\u0004\b\u0001\u0010)2\f\u0010*\u001a\b\u0012\u0004\u0012\u0002H)0+2$\u0010,\u001a \b\u0001\u0012\u0006\u0012\u0004\u0018\u00010.\u0012\n\u0012\b\u0012\u0004\u0012\u0002H)0/\u0012\u0006\u0012\u0004\u0018\u00010.0-2\u0006\u00100\u001a\u000201H\u0002ø\u0001\u0000¢\u0006\u0002\u00102J\u000f\u00103\u001a\b\u0012\u0004\u0012\u00028\u000004H\u0002J\u0010\u00105\u001a\u00020\u00062\u0006\u00106\u001a\u00020\nH\u0014J/\u00107\u001a\u00020\u00062\f\u00108\u001a\b\u0012\u0004\u0012\u00020:092\n\u0010;\u001a\u0006\u0012\u0002\b\u00030<H\u0014ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b=\u0010>J\b\u0010?\u001a\u00020\u0006H\u0014J\b\u0010@\u001a\u00020\u0006H\u0014J\r\u0010A\u001a\u0004\u0018\u00018\u0000¢\u0006\u0002\u0010BJ\n\u0010C\u001a\u0004\u0018\u00010.H\u0014J\u0016\u0010D\u001a\u0004\u0018\u00010.2\n\u0010*\u001a\u0006\u0012\u0002\b\u00030+H\u0014J\u0011\u0010%\u001a\u00028\u0000H@ø\u0001\u0000¢\u0006\u0002\u0010EJ\"\u0010F\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017H@ø\u0001\u0000ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\bG\u0010EJ\u0013\u0010H\u001a\u0004\u0018\u00018\u0000H@ø\u0001\u0000¢\u0006\u0002\u0010EJ\u0019\u0010I\u001a\u0004\u0018\u00018\u00002\b\u0010J\u001a\u0004\u0018\u00010.H\u0002¢\u0006\u0002\u0010KJ\u001f\u0010L\u001a\u0002H)\"\u0004\b\u0001\u0010)2\u0006\u00100\u001a\u000201H@ø\u0001\u0000¢\u0006\u0002\u0010MJR\u0010N\u001a\u00020\u0006\"\u0004\b\u0001\u0010)2\f\u0010*\u001a\b\u0012\u0004\u0012\u0002H)0+2\u0006\u00100\u001a\u0002012$\u0010,\u001a \b\u0001\u0012\u0006\u0012\u0004\u0018\u00010.\u0012\n\u0012\b\u0012\u0004\u0012\u0002H)0/\u0012\u0006\u0012\u0004\u0018\u00010.0-H\u0002ø\u0001\u0000¢\u0006\u0002\u0010OJ \u0010P\u001a\u00020\u00062\n\u0010Q\u001a\u0006\u0012\u0002\b\u00030R2\n\u0010%\u001a\u0006\u0012\u0002\b\u00030&H\u0002J\u0010\u0010S\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010TH\u0014JX\u0010U\u001a\u00020\u0006\"\u0004\b\u0001\u0010)* \b\u0001\u0012\u0006\u0012\u0004\u0018\u00010.\u0012\n\u0012\b\u0012\u0004\u0012\u0002H)0/\u0012\u0006\u0012\u0004\u0018\u00010.0-2\f\u0010*\u001a\b\u0012\u0004\u0012\u0002H)0+2\u0006\u00100\u001a\u0002012\b\u0010V\u001a\u0004\u0018\u00010.H\u0002ø\u0001\u0000¢\u0006\u0002\u0010WR\u0014\u0010\t\u001a\u00020\n8DX\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0012\u0010\r\u001a\u00020\nX¤\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\fR\u0012\u0010\u000e\u001a\u00020\nX¤\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\fR\u0014\u0010\u000f\u001a\u00020\n8VX\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\fR\u0014\u0010\u0010\u001a\u00020\n8VX\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\fR\u0014\u0010\u0011\u001a\u00020\n8DX\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\fR\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u00138F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R \u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00170\u00138Fø\u0001\u0000¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0015R\u0019\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00138F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0015\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006_"}, d2 = {"Lkotlinx/coroutines/channels/AbstractChannel;", "E", "Lkotlinx/coroutines/channels/AbstractSendChannel;", "Lkotlinx/coroutines/channels/Channel;", "onUndeliveredElement", "Lkotlin/Function1;", "", "Lkotlinx/coroutines/internal/OnUndeliveredElement;", "(Lkotlin/jvm/functions/Function1;)V", "hasReceiveOrClosed", "", "getHasReceiveOrClosed", "()Z", "isBufferAlwaysEmpty", "isBufferEmpty", "isClosedForReceive", "isEmpty", "isEmptyImpl", "onReceive", "Lkotlinx/coroutines/selects/SelectClause1;", "getOnReceive", "()Lkotlinx/coroutines/selects/SelectClause1;", "onReceiveOrClosed", "Lkotlinx/coroutines/channels/ValueOrClosed;", "getOnReceiveOrClosed", "onReceiveOrNull", "getOnReceiveOrNull", "cancel", "cause", "", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "cancelInternal", "cancelInternal$kotlinx_coroutines_core", "describeTryPoll", "Lkotlinx/coroutines/channels/AbstractChannel$TryPollDesc;", "enqueueReceive", "receive", "Lkotlinx/coroutines/channels/Receive;", "enqueueReceiveInternal", "enqueueReceiveSelect", "R", "select", "Lkotlinx/coroutines/selects/SelectInstance;", "block", "Lkotlin/Function2;", "", "Lkotlin/coroutines/Continuation;", "receiveMode", "", "(Lkotlinx/coroutines/selects/SelectInstance;Lkotlin/jvm/functions/Function2;I)Z", "iterator", "Lkotlinx/coroutines/channels/ChannelIterator;", "onCancelIdempotent", "wasClosed", "onCancelIdempotentList", "list", "Lkotlinx/coroutines/internal/InlineList;", "Lkotlinx/coroutines/channels/Send;", "closed", "Lkotlinx/coroutines/channels/Closed;", "onCancelIdempotentList-w-w6eGU", "(Ljava/lang/Object;Lkotlinx/coroutines/channels/Closed;)V", "onReceiveDequeued", "onReceiveEnqueued", "poll", "()Ljava/lang/Object;", "pollInternal", "pollSelectInternal", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "receiveOrClosed", "receiveOrClosed-WVj179g", "receiveOrNull", "receiveOrNullResult", "result", "(Ljava/lang/Object;)Ljava/lang/Object;", "receiveSuspend", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "registerSelectReceiveMode", "(Lkotlinx/coroutines/selects/SelectInstance;ILkotlin/jvm/functions/Function2;)V", "removeReceiveOnCancel", "cont", "Lkotlinx/coroutines/CancellableContinuation;", "takeFirstReceiveOrPeekClosed", "Lkotlinx/coroutines/channels/ReceiveOrClosed;", "tryStartBlockUnintercepted", "value", "(Lkotlin/jvm/functions/Function2;Lkotlinx/coroutines/selects/SelectInstance;ILjava/lang/Object;)V", "Itr", "ReceiveElement", "ReceiveElementWithUndeliveredHandler", "ReceiveHasNext", "ReceiveSelect", "RemoveReceiveOnCancel", "TryPollDesc", "kotlinx-coroutines-core"}, k = 1, mv = {1, 4, 2})
public abstract class configureBlocking<E> extends socket<E> implements SocketChannelIOHelper<E> {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u00022\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00050\u0004H@"}, d2 = {"receiveOrClosed", "", "E", "continuation", "Lkotlin/coroutines/Continuation;", "Lkotlinx/coroutines/channels/ValueOrClosed;"}, k = 3, mv = {1, 4, 2})
    @DebugMetadata(c = "kotlinx.coroutines.channels.AbstractChannel", f = "AbstractChannel.kt", i = {}, l = {631}, m = "receiveOrClosed-WVj179g", n = {}, s = {})
    static final class setMin extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ configureBlocking this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        setMin(configureBlocking configureblocking, Continuation continuation) {
            super(continuation);
            this.this$0 = configureblocking;
        }

        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object max = this.this$0.getMax(this);
            return max == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? max : onWebsocketHandshakeReceivedAsClient.setMax(max);
        }
    }

    /* access modifiers changed from: protected */
    public abstract boolean getMax();

    /* access modifiers changed from: protected */
    public abstract boolean setMin();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0016¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/internal/LockFreeLinkedListNode$makeCondAddOp$1", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$CondAddOp;", "prepare", "", "affected", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "Lkotlinx/coroutines/internal/Node;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 4, 2})
    public static final class getMax extends getWebSocketContext.length {
        final /* synthetic */ configureBlocking getMax;
        final /* synthetic */ getWebSocketContext setMax;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public getMax(getWebSocketContext getwebsocketcontext, getWebSocketContext getwebsocketcontext2, configureBlocking configureblocking) {
            super(getwebsocketcontext2);
            this.setMax = getwebsocketcontext;
            this.getMax = configureblocking;
        }

        public final /* synthetic */ Object setMin() {
            if (this.getMax.getMax()) {
                return null;
            }
            return cancelTimeoutScheduleFuture.setMax();
        }
    }

    /* access modifiers changed from: protected */
    @Nullable
    public Object setMax() {
        while (true) {
            getDraft doubleRange = toDoubleRange();
            if (doubleRange == null) {
                return isInboundDone.setMax;
            }
            closeBlocking min = doubleRange.getMin();
            if (min != null) {
                if (getApdidToken.setMax()) {
                    if (!(min == cy3.getMax)) {
                        throw new AssertionError();
                    }
                }
                doubleRange.length();
                return doubleRange.setMax();
            }
            doubleRange.getMax();
        }
    }

    public boolean length() {
        return values() != null && getMax();
    }

    /* access modifiers changed from: protected */
    public boolean length(@NotNull getLocalSocketAddress<? super E> getlocalsocketaddress) {
        int min;
        getWebSocketContext values;
        if (setMin()) {
            getWebSocketContext isInside = isInside();
            do {
                values = isInside.values();
                if (values == null) {
                    values = getWebSocketContext.setMin((getWebSocketContext) isInside._prev);
                }
                if (!(!(values instanceof getDraft))) {
                    return false;
                }
            } while (!values.setMax(getlocalsocketaddress, isInside));
            return true;
        }
        getWebSocketContext isInside2 = isInside();
        getWebSocketContext getwebsocketcontext = getlocalsocketaddress;
        getWebSocketContext.length getmax = new getMax(getwebsocketcontext, getwebsocketcontext, this);
        do {
            getWebSocketContext values2 = isInside2.values();
            if (values2 == null) {
                values2 = getWebSocketContext.setMin((getWebSocketContext) isInside2._prev);
            }
            if (!(!(values2 instanceof getDraft))) {
                return false;
            }
            min = values2.setMin(getwebsocketcontext, isInside2, getmax);
            if (min == 1) {
                return true;
            }
        } while (min != 2);
        return false;
    }

    /* access modifiers changed from: private */
    public final boolean setMin(getLocalSocketAddress<? super E> getlocalsocketaddress) {
        return length(getlocalsocketaddress);
    }

    @Nullable
    public final Object getMin(@NotNull Continuation<? super E> continuation) {
        Object max = setMax();
        if (max == isInboundDone.setMax || (max instanceof batch)) {
            return setMax(1, continuation);
        }
        return max;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    @org.jetbrains.annotations.Nullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object getMax(@org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super o.onWebsocketHandshakeReceivedAsClient<? extends E>> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof o.configureBlocking.setMin
            if (r0 == 0) goto L_0x0014
            r0 = r5
            o.configureBlocking$setMin r0 = (o.configureBlocking.setMin) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L_0x0014
            int r5 = r0.label
            int r5 = r5 - r2
            r0.label = r5
            goto L_0x0019
        L_0x0014:
            o.configureBlocking$setMin r0 = new o.configureBlocking$setMin
            r0.<init>(r4, r5)
        L_0x0019:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0032
            if (r2 != r3) goto L_0x002a
            kotlin.ResultKt.throwOnFailure(r5)
            goto L_0x0062
        L_0x002a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x0032:
            kotlin.ResultKt.throwOnFailure(r5)
            java.lang.Object r5 = r4.setMax()
            o.closeBlocking r2 = o.isInboundDone.setMax
            if (r5 == r2) goto L_0x0058
            boolean r0 = r5 instanceof o.batch
            if (r0 == 0) goto L_0x0051
            o.onWebsocketHandshakeReceivedAsClient$setMax r0 = o.onWebsocketHandshakeReceivedAsClient.length
            o.batch r5 = (o.batch) r5
            java.lang.Throwable r5 = r5.setMax
            o.onWebsocketHandshakeReceivedAsClient$length r0 = new o.onWebsocketHandshakeReceivedAsClient$length
            r0.<init>(r5)
            java.lang.Object r5 = o.onWebsocketHandshakeReceivedAsClient.setMin(r0)
            return r5
        L_0x0051:
            o.onWebsocketHandshakeReceivedAsClient$setMax r0 = o.onWebsocketHandshakeReceivedAsClient.length
            java.lang.Object r5 = o.onWebsocketHandshakeReceivedAsClient.setMin(r5)
            return r5
        L_0x0058:
            r5 = 2
            r0.label = r3
            java.lang.Object r5 = r4.setMax(r5, r0)
            if (r5 != r1) goto L_0x0062
            return r1
        L_0x0062:
            o.onWebsocketHandshakeReceivedAsClient r5 = (o.onWebsocketHandshakeReceivedAsClient) r5
            java.lang.Object r5 = r5.getMin
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: o.configureBlocking.getMax(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Nullable
    public final E getMin() {
        E max = setMax();
        if (max == isInboundDone.setMax) {
            return null;
        }
        if (!(max instanceof batch)) {
            return max;
        }
        batch batch = (batch) max;
        if (batch.setMax == null) {
            return null;
        }
        throw WebSocketCallbackAdapter.getMin(batch.setMax);
    }

    public final void getMin(@Nullable CancellationException cancellationException) {
        if (!length()) {
            if (cancellationException == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(getClass().getSimpleName());
                sb.append(" was cancelled");
                cancellationException = new CancellationException(sb.toString());
            }
            setMax(cancellationException);
        }
    }

    private boolean setMax(@Nullable Throwable th) {
        boolean max = getMax(th);
        getMin(max);
        return max;
    }

    /* access modifiers changed from: protected */
    public void getMin(boolean z) {
        batch<?> IsOverlapping = IsOverlapping();
        if (IsOverlapping != null) {
            Object obj = null;
            while (true) {
                getWebSocketContext equals = IsOverlapping.equals();
                if (equals instanceof onFragment) {
                    setMin(obj, IsOverlapping);
                    return;
                } else if (getApdidToken.setMax() && !(equals instanceof getDraft)) {
                    throw new AssertionError();
                } else if (!equals.A_()) {
                    equals.toIntRange();
                } else if (equals != null) {
                    obj = setWebSocketContext.getMax(obj, (getDraft) equals);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.channels.Send");
                }
            }
        } else {
            throw new IllegalStateException("Cannot happen".toString());
        }
    }

    /* access modifiers changed from: protected */
    @Nullable
    public final isClosed<E> equals() {
        return super.equals();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\u0011\u0012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\u0002\u0010\u0004J\u0013\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0002J\b\u0010\t\u001a\u00020\nH\u0016R\u0012\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lkotlinx/coroutines/channels/AbstractChannel$RemoveReceiveOnCancel;", "Lkotlinx/coroutines/BeforeResumeCancelHandler;", "receive", "Lkotlinx/coroutines/channels/Receive;", "(Lkotlinx/coroutines/channels/AbstractChannel;Lkotlinx/coroutines/channels/Receive;)V", "invoke", "", "cause", "", "toString", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 4, 2})
    final class getMin extends xp1 {
        private final getLocalSocketAddress<?> setMax;

        public getMin(@NotNull getLocalSocketAddress<?> getlocalsocketaddress) {
            this.setMax = getlocalsocketaddress;
        }

        public final void setMin(@Nullable Throwable th) {
            this.setMax.A_();
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("RemoveReceiveOnCancel[");
            sb.append(this.setMax);
            sb.append(']');
            return sb.toString();
        }

        public final /* synthetic */ Object invoke(Object obj) {
            this.setMax.A_();
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0012\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00002\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u001d\u0012\u000e\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0015\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\fJ\u0014\u0010\r\u001a\u00020\n2\n\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\u000fH\u0016J\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000b\u001a\u00028\u0001¢\u0006\u0002\u0010\u0011J\b\u0010\u0012\u001a\u00020\u0013H\u0016J!\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u000b\u001a\u00028\u00012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0002\u0010\u0018R\u0018\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0006X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u00020\u00078\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lkotlinx/coroutines/channels/AbstractChannel$ReceiveElement;", "E", "Lkotlinx/coroutines/channels/Receive;", "cont", "Lkotlinx/coroutines/CancellableContinuation;", "", "receiveMode", "", "(Lkotlinx/coroutines/CancellableContinuation;I)V", "completeResumeReceive", "", "value", "(Ljava/lang/Object;)V", "resumeReceiveClosed", "closed", "Lkotlinx/coroutines/channels/Closed;", "resumeValue", "(Ljava/lang/Object;)Ljava/lang/Object;", "toString", "", "tryResumeReceive", "Lkotlinx/coroutines/internal/Symbol;", "otherOp", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$PrepareOp;", "(Ljava/lang/Object;Lkotlinx/coroutines/internal/LockFreeLinkedListNode$PrepareOp;)Lkotlinx/coroutines/internal/Symbol;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 4, 2})
    static class length<E> extends getLocalSocketAddress<E> {
        @JvmField
        public final int getMax;
        @NotNull
        @JvmField
        public final cy1<Object> length;

        public length(@NotNull cy1<Object> cy1, int i) {
            this.length = cy1;
            this.getMax = i;
        }

        @Nullable
        public final Object setMax(E e) {
            if (this.getMax != 2) {
                return e;
            }
            onWebsocketHandshakeReceivedAsClient.setMax setmax = onWebsocketHandshakeReceivedAsClient.length;
            return onWebsocketHandshakeReceivedAsClient.setMax(onWebsocketHandshakeReceivedAsClient.setMin(e));
        }

        @Nullable
        public final closeBlocking getMin(E e) {
            Object min = this.length.setMin(setMax(e), setMin(e));
            if (min == null) {
                return null;
            }
            if (getApdidToken.setMax()) {
                if (!(min == cy3.getMax)) {
                    throw new AssertionError();
                }
            }
            return cy3.getMax;
        }

        public final void D_() {
            this.length.getMax(cy3.getMax);
        }

        public final void setMin(@NotNull batch<?> batch) {
            if (this.getMax == 1 && batch.setMax == null) {
                Result.Companion companion = Result.Companion;
                this.length.resumeWith(Result.m1constructorimpl((Object) null));
            } else if (this.getMax == 2) {
                onWebsocketHandshakeReceivedAsClient.setMax setmax = onWebsocketHandshakeReceivedAsClient.length;
                onWebsocketHandshakeReceivedAsClient max = onWebsocketHandshakeReceivedAsClient.setMax(onWebsocketHandshakeReceivedAsClient.setMin(new onWebsocketHandshakeReceivedAsClient.length(batch.setMax)));
                Result.Companion companion2 = Result.Companion;
                this.length.resumeWith(Result.m1constructorimpl(max));
            } else {
                Continuation continuation = this.length;
                Throwable th = batch.setMax;
                if (th == null) {
                    th = new ClosedReceiveChannelException("Channel was closed");
                }
                Result.Companion companion3 = Result.Companion;
                continuation.resumeWith(Result.m1constructorimpl(ResultKt.createFailure(th)));
            }
        }

        @NotNull
        public String toString() {
            StringBuilder sb = new StringBuilder("ReceiveElement@");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append("[receiveMode=");
            sb.append(this.getMax);
            sb.append(']');
            return sb.toString();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\b\u0002\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00002\b\u0012\u0004\u0012\u0002H\u00010\u0002B;\u0012\u000e\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u001c\u0010\b\u001a\u0018\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00028\u0001`\u000b¢\u0006\u0002\u0010\fJ#\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\u0006\u0010\u000f\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\u0010R&\u0010\b\u001a\u0018\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00028\u0001`\u000b8\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lkotlinx/coroutines/channels/AbstractChannel$ReceiveElementWithUndeliveredHandler;", "E", "Lkotlinx/coroutines/channels/AbstractChannel$ReceiveElement;", "cont", "Lkotlinx/coroutines/CancellableContinuation;", "", "receiveMode", "", "onUndeliveredElement", "Lkotlin/Function1;", "", "Lkotlinx/coroutines/internal/OnUndeliveredElement;", "(Lkotlinx/coroutines/CancellableContinuation;ILkotlin/jvm/functions/Function1;)V", "resumeOnCancellationFun", "", "value", "(Ljava/lang/Object;)Lkotlin/jvm/functions/Function1;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 4, 2})
    static final class setMax<E> extends length<E> {
        @NotNull
        @JvmField
        public final Function1<E, Unit> setMin;

        public setMax(@NotNull cy1<Object> cy1, int i, @NotNull Function1<? super E, Unit> function1) {
            super(cy1, i);
            this.setMin = function1;
        }

        @Nullable
        public final Function1<Throwable, Unit> setMin(E e) {
            return new AbstractClientProxyChannel.getMin(this.setMin, e, this.length.getContext());
        }
    }

    private /* synthetic */ <R> Object setMax(int i, Continuation<? super R> continuation) {
        length length2;
        getNativeProp<? super R> max = JNIBridge.getMax(IntrinsicsKt.intercepted(continuation));
        cy1 cy1 = max;
        if (this.getMax == null) {
            if (cy1 != null) {
                length2 = new length(cy1, i);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Any?>");
            }
        } else if (cy1 != null) {
            length2 = new setMax(cy1, i, this.getMax);
        } else {
            throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Any?>");
        }
        while (true) {
            getLocalSocketAddress getlocalsocketaddress = length2;
            if (!setMin(getlocalsocketaddress)) {
                Object max2 = setMax();
                if (!(max2 instanceof batch)) {
                    if (max2 != isInboundDone.setMax) {
                        cy1.setMax(length2.setMax(max2), (Function1<? super Throwable, Unit>) length2.setMin(max2));
                        break;
                    }
                } else {
                    length2.setMin((batch<?>) (batch) max2);
                    break;
                }
            } else {
                cy1.getMin(new getMin(getlocalsocketaddress));
                break;
            }
        }
        Object min = max.setMin();
        if (min == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return min;
    }

    /* access modifiers changed from: protected */
    public void setMin(@NotNull Object obj, @NotNull batch<?> batch) {
        if (obj == null) {
            return;
        }
        if (!(obj instanceof ArrayList)) {
            ((getDraft) obj).getMin(batch);
        } else if (obj != null) {
            ArrayList arrayList = (ArrayList) obj;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((getDraft) arrayList.get(size)).getMin(batch);
            }
        } else {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.ArrayList<E> /* = java.util.ArrayList<E> */");
        }
    }
}
