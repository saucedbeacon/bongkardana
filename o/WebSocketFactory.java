package o;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\u001a\u001e\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u0007\u001a0\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0003\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0007\u001a\u001c\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\n\u001a/\u0010\u000b\u001a\u00020\f\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\u00020\nH@ø\u0001\u0000¢\u0006\u0002\u0010\u000f\u001a9\u0010\u0010\u001a\u00020\f\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0012H@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a&\u0010\u0015\u001a\b\u0012\u0004\u0012\u0002H\u00020\n\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0006H\u0007\u001a\u001c\u0010\u0016\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\n\u0002\u0004\n\u0002\b\u0019¨\u0006\u0017"}, d2 = {"asFlow", "Lkotlinx/coroutines/flow/Flow;", "T", "Lkotlinx/coroutines/channels/BroadcastChannel;", "broadcastIn", "scope", "Lkotlinx/coroutines/CoroutineScope;", "start", "Lkotlinx/coroutines/CoroutineStart;", "consumeAsFlow", "Lkotlinx/coroutines/channels/ReceiveChannel;", "emitAll", "", "Lkotlinx/coroutines/flow/FlowCollector;", "channel", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlinx/coroutines/channels/ReceiveChannel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "emitAllImpl", "consume", "", "emitAllImpl$FlowKt__ChannelsKt", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlinx/coroutines/channels/ReceiveChannel;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "produceIn", "receiveAsFlow", "kotlinx-coroutines-core"}, k = 5, mv = {1, 4, 2}, xs = "kotlinx/coroutines/flow/FlowKt")
public final /* synthetic */ class WebSocketFactory {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH@"}, d2 = {"emitAllImpl", "", "T", "Lkotlinx/coroutines/flow/FlowCollector;", "channel", "Lkotlinx/coroutines/channels/ReceiveChannel;", "consume", "", "continuation", "Lkotlin/coroutines/Continuation;", ""}, k = 3, mv = {1, 4, 2})
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ChannelsKt", f = "Channels.kt", i = {0, 0, 0, 0, 1, 1, 1, 1}, l = {50, 61}, m = "emitAllImpl$FlowKt__ChannelsKt", n = {"$this$emitAllImpl", "channel", "cause", "consume", "$this$emitAllImpl", "channel", "cause", "consume"}, s = {"L$0", "L$1", "L$2", "Z$0", "L$0", "L$1", "L$2", "Z$0"})
    static final class length extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        length(Continuation continuation) {
            super(continuation);
        }

        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return WebSocketFactory.getMin((onWebsocketPong) null, (isFlushAndClose) null, false, this);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0073 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x008e A[SYNTHETIC, Splitter:B:35:0x008e] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x008f A[Catch:{ all -> 0x005d }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final /* synthetic */ <T> java.lang.Object getMin(o.onWebsocketPong<? super T> r7, o.isFlushAndClose<? extends T> r8, boolean r9, kotlin.coroutines.Continuation<? super kotlin.Unit> r10) {
        /*
            boolean r0 = r10 instanceof o.WebSocketFactory.length
            if (r0 == 0) goto L_0x0014
            r0 = r10
            o.WebSocketFactory$length r0 = (o.WebSocketFactory.length) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L_0x0014
            int r10 = r0.label
            int r10 = r10 - r2
            r0.label = r10
            goto L_0x0019
        L_0x0014:
            o.WebSocketFactory$length r0 = new o.WebSocketFactory$length
            r0.<init>(r10)
        L_0x0019:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x005f
            if (r2 == r4) goto L_0x0047
            if (r2 != r3) goto L_0x003f
            boolean r7 = r0.Z$0
            java.lang.Object r8 = r0.L$2
            java.lang.Throwable r8 = (java.lang.Throwable) r8
            java.lang.Object r9 = r0.L$1
            o.isFlushAndClose r9 = (o.isFlushAndClose) r9
            java.lang.Object r2 = r0.L$0
            o.onWebsocketPong r2 = (o.onWebsocketPong) r2
            kotlin.ResultKt.throwOnFailure(r10)     // Catch:{ all -> 0x005d }
        L_0x003a:
            r10 = r8
            r8 = r9
            r9 = r7
            r7 = r2
            goto L_0x0063
        L_0x003f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0047:
            boolean r7 = r0.Z$0
            java.lang.Object r8 = r0.L$2
            java.lang.Throwable r8 = (java.lang.Throwable) r8
            java.lang.Object r9 = r0.L$1
            o.isFlushAndClose r9 = (o.isFlushAndClose) r9
            java.lang.Object r2 = r0.L$0
            o.onWebsocketPong r2 = (o.onWebsocketPong) r2
            kotlin.ResultKt.throwOnFailure(r10)     // Catch:{ all -> 0x005d }
            o.onWebsocketHandshakeReceivedAsClient r10 = (o.onWebsocketHandshakeReceivedAsClient) r10     // Catch:{ all -> 0x005d }
            java.lang.Object r10 = r10.getMin     // Catch:{ all -> 0x005d }
            goto L_0x007a
        L_0x005d:
            r8 = move-exception
            goto L_0x00a9
        L_0x005f:
            kotlin.ResultKt.throwOnFailure(r10)
            r10 = 0
        L_0x0063:
            r0.L$0 = r7     // Catch:{ all -> 0x00a4 }
            r0.L$1 = r8     // Catch:{ all -> 0x00a4 }
            r0.L$2 = r10     // Catch:{ all -> 0x00a4 }
            r0.Z$0 = r9     // Catch:{ all -> 0x00a4 }
            r0.label = r4     // Catch:{ all -> 0x00a4 }
            java.lang.Object r2 = r8.getMax(r0)     // Catch:{ all -> 0x00a4 }
            if (r2 != r1) goto L_0x0074
            return r1
        L_0x0074:
            r6 = r2
            r2 = r7
            r7 = r9
            r9 = r8
            r8 = r10
            r10 = r6
        L_0x007a:
            boolean r5 = o.onWebsocketHandshakeReceivedAsClient.length(r10)     // Catch:{ all -> 0x005d }
            if (r5 == 0) goto L_0x008f
            java.lang.Throwable r10 = o.onWebsocketHandshakeReceivedAsClient.getMax(r10)     // Catch:{ all -> 0x005d }
            if (r10 != 0) goto L_0x008e
            if (r7 == 0) goto L_0x008b
            o.WebSocket.setMin(r9, r8)
        L_0x008b:
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            return r7
        L_0x008e:
            throw r10     // Catch:{ all -> 0x005d }
        L_0x008f:
            java.lang.Object r10 = o.onWebsocketHandshakeReceivedAsClient.getMin(r10)     // Catch:{ all -> 0x005d }
            r0.L$0 = r2     // Catch:{ all -> 0x005d }
            r0.L$1 = r9     // Catch:{ all -> 0x005d }
            r0.L$2 = r8     // Catch:{ all -> 0x005d }
            r0.Z$0 = r7     // Catch:{ all -> 0x005d }
            r0.label = r3     // Catch:{ all -> 0x005d }
            java.lang.Object r10 = r2.emit(r10, r0)     // Catch:{ all -> 0x005d }
            if (r10 != r1) goto L_0x003a
            return r1
        L_0x00a4:
            r7 = move-exception
            r6 = r8
            r8 = r7
            r7 = r9
            r9 = r6
        L_0x00a9:
            throw r8     // Catch:{ all -> 0x00aa }
        L_0x00aa:
            r10 = move-exception
            if (r7 == 0) goto L_0x00b0
            o.WebSocket.setMin(r9, r8)
        L_0x00b0:
            goto L_0x00b2
        L_0x00b1:
            throw r10
        L_0x00b2:
            goto L_0x00b1
        */
        throw new UnsupportedOperationException("Method not decompiled: o.WebSocketFactory.getMin(o.onWebsocketPong, o.isFlushAndClose, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
