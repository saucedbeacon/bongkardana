package o;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001an\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0003\"\u0004\b\u0001\u0010\u0004\"\u0004\b\u0002\u0010\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00030\u00012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00040\u00012(\u0010\u0007\u001a$\b\u0001\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u0002H\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\n0\bH\u0000ø\u0001\u0000¢\u0006\u0002\u0010\u000b\u001a\u0001\u0010\f\u001a\u00020\r\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u00020\u000f2\u0014\u0010\u0010\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u0002H\u000e0\u00010\u00112\u0016\u0010\u0012\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u0001H\u000e\u0018\u00010\u00110\u001329\u0010\u0007\u001a5\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u000e0\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\t\u0012\u0006\u0012\u0004\u0018\u00010\n0\b¢\u0006\u0002\b\u0014H@ø\u0001\u0000¢\u0006\u0002\u0010\u0015*\u001c\b\u0002\u0010\u0016\"\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00172\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0017\u0002\u0004\n\u0002\b\u0019¨\u0006\u0018"}, d2 = {"zipImpl", "Lkotlinx/coroutines/flow/Flow;", "R", "T1", "T2", "flow", "flow2", "transform", "Lkotlin/Function3;", "Lkotlin/coroutines/Continuation;", "", "(Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function3;)Lkotlinx/coroutines/flow/Flow;", "combineInternal", "", "T", "Lkotlinx/coroutines/flow/FlowCollector;", "flows", "", "arrayFactory", "Lkotlin/Function0;", "Lkotlin/ExtensionFunctionType;", "(Lkotlinx/coroutines/flow/FlowCollector;[Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function3;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Update", "Lkotlin/collections/IndexedValue;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 4, 2})
public final class eot {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u00020\u0004H@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "R", "T", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {1, 4, 2})
    @DebugMetadata(c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2", f = "Combine.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2}, l = {57, 79, 82}, m = "invokeSuspend", n = {"latestValues", "resultChannel", "lastReceivedEpoch", "remainingAbsentValues", "currentEpoch", "latestValues", "resultChannel", "lastReceivedEpoch", "remainingAbsentValues", "currentEpoch", "latestValues", "resultChannel", "lastReceivedEpoch", "remainingAbsentValues", "currentEpoch"}, s = {"L$0", "L$1", "L$2", "I$0", "I$1", "L$0", "L$1", "L$2", "I$0", "I$1", "L$0", "L$1", "L$2", "I$0", "I$1"})
    public static final class setMax extends SuspendLambda implements Function2<initToken, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function0 $arrayFactory;
        final /* synthetic */ onWebsocketHandshakeSentAsClient[] $flows;
        final /* synthetic */ onWebsocketPong $this_combineInternal;
        final /* synthetic */ Function3 $transform;
        int I$0;
        int I$1;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public setMax(onWebsocketPong onwebsocketpong, onWebsocketHandshakeSentAsClient[] onwebsockethandshakesentasclientArr, Function0 function0, Function3 function3, Continuation continuation) {
            super(2, continuation);
            this.$this_combineInternal = onwebsocketpong;
            this.$flows = onwebsockethandshakesentasclientArr;
            this.$arrayFactory = function0;
            this.$transform = function3;
        }

        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            setMax setmax = new setMax(this.$this_combineInternal, this.$flows, this.$arrayFactory, this.$transform, continuation);
            setmax.L$0 = obj;
            return setmax;
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((setMax) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: o.closeBlocking[]} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v0, resolved type: o.closeBlocking} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: o.closeBlocking[]} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x00cd A[LOOP:1: B:27:0x00cd->B:33:0x00ec, LOOP_START, PHI: r1 r4 
          PHI: (r1v1 int) = (r1v0 int), (r1v2 int) binds: [B:24:0x00c8, B:33:0x00ec] A[DONT_GENERATE, DONT_INLINE]
          PHI: (r4v2 kotlin.collections.IndexedValue) = (r4v1 kotlin.collections.IndexedValue), (r4v14 kotlin.collections.IndexedValue) binds: [B:24:0x00c8, B:33:0x00ec] A[DONT_GENERATE, DONT_INLINE]] */
        @org.jetbrains.annotations.Nullable
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r25) {
            /*
                r24 = this;
                r6 = r24
                java.lang.Object r7 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r0 = r6.label
                r8 = 0
                r9 = 2
                r10 = 3
                r11 = 1
                if (r0 == 0) goto L_0x0051
                if (r0 == r11) goto L_0x0037
                if (r0 == r9) goto L_0x001d
                if (r0 != r10) goto L_0x0015
                goto L_0x001d
            L_0x0015:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L_0x001d:
                int r0 = r6.I$1
                int r1 = r6.I$0
                java.lang.Object r2 = r6.L$2
                byte[] r2 = (byte[]) r2
                java.lang.Object r3 = r6.L$1
                o.SocketChannelIOHelper r3 = (o.SocketChannelIOHelper) r3
                java.lang.Object r4 = r6.L$0
                java.lang.Object[] r4 = (java.lang.Object[]) r4
                kotlin.ResultKt.throwOnFailure(r25)
                r8 = r0
                r0 = r2
                r15 = r3
                r5 = r4
                r2 = r6
                goto L_0x00a6
            L_0x0037:
                int r0 = r6.I$1
                int r1 = r6.I$0
                java.lang.Object r2 = r6.L$2
                byte[] r2 = (byte[]) r2
                java.lang.Object r3 = r6.L$1
                o.SocketChannelIOHelper r3 = (o.SocketChannelIOHelper) r3
                java.lang.Object r4 = r6.L$0
                java.lang.Object[] r4 = (java.lang.Object[]) r4
                kotlin.ResultKt.throwOnFailure(r25)
                r15 = r3
                r5 = r4
                r3 = r6
                r4 = r25
                goto L_0x00c6
            L_0x0051:
                kotlin.ResultKt.throwOnFailure(r25)
                java.lang.Object r0 = r6.L$0
                r12 = r0
                o.initToken r12 = (o.initToken) r12
                o.onWebsocketHandshakeSentAsClient[] r0 = r6.$flows
                int r13 = r0.length
                if (r13 != 0) goto L_0x0061
                kotlin.Unit r0 = kotlin.Unit.INSTANCE
                return r0
            L_0x0061:
                java.lang.Object[] r5 = new java.lang.Object[r13]
                o.closeBlocking r15 = o.onWriteDemand.setMax
                r16 = 0
                r17 = 0
                r18 = 6
                r19 = 0
                r14 = r5
                kotlin.collections.ArraysKt.fill$default((java.lang.Object[]) r14, (java.lang.Object) r15, (int) r16, (int) r17, (int) r18, (java.lang.Object) r19)
                r0 = 6
                r14 = 0
                o.SocketChannelIOHelper r15 = o.sendFragmentedFrame.getMax(r13, r14, r0)
                java.util.concurrent.atomic.AtomicInteger r4 = new java.util.concurrent.atomic.AtomicInteger
                r4.<init>(r13)
                r3 = 0
            L_0x007d:
                if (r3 >= r13) goto L_0x00a0
                o.eot$setMax$5 r16 = new o.eot$setMax$5
                r17 = 0
                r0 = r16
                r1 = r24
                r2 = r3
                r18 = r3
                r3 = r15
                r19 = r4
                r20 = r5
                r5 = r17
                r0.<init>(r1, r2, r3, r4, r5)
                r0 = r16
                kotlin.jvm.functions.Function2 r0 = (kotlin.jvm.functions.Function2) r0
                o.xp4.getMin(r12, r14, r14, r0, r10)
                int r3 = r18 + 1
                r5 = r20
                goto L_0x007d
            L_0x00a0:
                r20 = r5
                byte[] r0 = new byte[r13]
                r2 = r6
                r1 = r13
            L_0x00a6:
                int r8 = r8 + r11
                byte r3 = (byte) r8
                r4 = r15
                o.isFlushAndClose r4 = (o.isFlushAndClose) r4
                r2.L$0 = r5
                r2.L$1 = r15
                r2.L$2 = r0
                r2.I$0 = r1
                r2.I$1 = r3
                r2.label = r11
                if (r4 == 0) goto L_0x0151
                java.lang.Object r4 = r4.getMin(r2)
                if (r4 != r7) goto L_0x00c0
                return r7
            L_0x00c0:
                r23 = r2
                r2 = r0
                r0 = r3
                r3 = r23
            L_0x00c6:
                kotlin.collections.IndexedValue r4 = (kotlin.collections.IndexedValue) r4
                if (r4 != 0) goto L_0x00cd
                kotlin.Unit r0 = kotlin.Unit.INSTANCE
                return r0
            L_0x00cd:
                int r8 = r4.getIndex()
                r12 = r5[r8]
                java.lang.Object r4 = r4.getValue()
                r5[r8] = r4
                o.closeBlocking r4 = o.onWriteDemand.setMax
                if (r12 != r4) goto L_0x00df
                int r1 = r1 + -1
            L_0x00df:
                byte r4 = r2[r8]
                if (r4 == r0) goto L_0x00ee
                byte r4 = (byte) r0
                r2[r8] = r4
                java.lang.Object r4 = r15.getMin()
                kotlin.collections.IndexedValue r4 = (kotlin.collections.IndexedValue) r4
                if (r4 != 0) goto L_0x00cd
            L_0x00ee:
                if (r1 != 0) goto L_0x0113
                kotlin.jvm.functions.Function0 r4 = r3.$arrayFactory
                java.lang.Object r4 = r4.invoke()
                java.lang.Object[] r4 = (java.lang.Object[]) r4
                if (r4 != 0) goto L_0x011f
                kotlin.jvm.functions.Function3 r4 = r3.$transform
                o.onWebsocketPong r8 = r3.$this_combineInternal
                if (r5 == 0) goto L_0x0117
                r3.L$0 = r5
                r3.L$1 = r15
                r3.L$2 = r2
                r3.I$0 = r1
                r3.I$1 = r0
                r3.label = r9
                java.lang.Object r4 = r4.invoke(r8, r5, r3)
                if (r4 != r7) goto L_0x0113
                return r7
            L_0x0113:
                r8 = r0
                r0 = r2
                r2 = r3
                goto L_0x00a6
            L_0x0117:
                java.lang.NullPointerException r0 = new java.lang.NullPointerException
                java.lang.String r1 = "null cannot be cast to non-null type kotlin.Array<T>"
                r0.<init>(r1)
                throw r0
            L_0x011f:
                if (r5 == 0) goto L_0x0149
                r18 = 0
                r19 = 0
                r20 = 0
                r21 = 14
                r22 = 0
                r16 = r5
                r17 = r4
                kotlin.collections.ArraysKt.copyInto$default((java.lang.Object[]) r16, (java.lang.Object[]) r17, (int) r18, (int) r19, (int) r20, (int) r21, (java.lang.Object) r22)
                kotlin.jvm.functions.Function3 r8 = r3.$transform
                o.onWebsocketPong r12 = r3.$this_combineInternal
                r3.L$0 = r5
                r3.L$1 = r15
                r3.L$2 = r2
                r3.I$0 = r1
                r3.I$1 = r0
                r3.label = r10
                java.lang.Object r4 = r8.invoke(r12, r4, r3)
                if (r4 != r7) goto L_0x0113
                return r7
            L_0x0149:
                java.lang.NullPointerException r0 = new java.lang.NullPointerException
                java.lang.String r1 = "null cannot be cast to non-null type kotlin.Array<T?>"
                r0.<init>(r1)
                throw r0
            L_0x0151:
                java.lang.NullPointerException r0 = new java.lang.NullPointerException
                java.lang.String r1 = "null cannot be cast to non-null type kotlinx.coroutines.channels.ReceiveChannel<E?>"
                r0.<init>(r1)
                goto L_0x015a
            L_0x0159:
                throw r0
            L_0x015a:
                goto L_0x0159
            */
            throw new UnsupportedOperationException("Method not decompiled: o.eot.setMax.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }
}
