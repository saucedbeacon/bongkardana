package o;

import kotlin.Metadata;
import kotlin.jvm.functions.Function2;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001as\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032D\u0010\u0004\u001a@\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u0003\u0012\u0015\u0012\u0013\u0018\u00010\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0005¢\u0006\u0002\b\f2\b\u0010\t\u001a\u0004\u0018\u00010\u0006H@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u001aj\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0010\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00102D\u0010\u0004\u001a@\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u0003\u0012\u0015\u0012\u0013\u0018\u00010\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0005¢\u0006\u0002\b\fø\u0001\u0000¢\u0006\u0002\u0010\u0011\u001aS\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0010\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00102-\u0010\u0004\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0013¢\u0006\u0002\b\fø\u0001\u0000¢\u0006\u0002\u0010\u0014\u001aS\u0010\u0015\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0010\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00102-\u0010\u0004\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0013¢\u0006\u0002\b\fø\u0001\u0000¢\u0006\u0002\u0010\u0014\u001as\u0010\u0016\u001a\b\u0012\u0004\u0012\u0002H\u00170\u0010\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0017*\b\u0012\u0004\u0012\u0002H\u00020\u00102D\b\u0005\u0010\u0016\u001a>\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00170\u0003\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0005¢\u0006\u0002\b\fH\bø\u0001\u0000¢\u0006\u0002\u0010\u0011\u001as\u0010\u0019\u001a\b\u0012\u0004\u0012\u0002H\u00170\u0010\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0017*\b\u0012\u0004\u0012\u0002H\u00020\u00102D\b\u0005\u0010\u0016\u001a>\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00170\u0003\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0005¢\u0006\u0002\b\fH\bø\u0001\u0000¢\u0006\u0002\u0010\u0011\u0002\u0004\n\u0002\b\u0019¨\u0006\u001a"}, d2 = {"invokeSafely", "", "T", "Lkotlinx/coroutines/flow/FlowCollector;", "action", "Lkotlin/Function3;", "", "Lkotlin/ParameterName;", "name", "cause", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "invokeSafely$FlowKt__EmittersKt", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/jvm/functions/Function3;Ljava/lang/Throwable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onCompletion", "Lkotlinx/coroutines/flow/Flow;", "(Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function3;)Lkotlinx/coroutines/flow/Flow;", "onEmpty", "Lkotlin/Function2;", "(Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/flow/Flow;", "onStart", "transform", "R", "value", "unsafeTransform", "kotlinx-coroutines-core"}, k = 5, mv = {1, 4, 2}, xs = "kotlinx/coroutines/flow/FlowKt")
final /* synthetic */ class WebSocketImpl {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001f\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H@ø\u0001\u0000¢\u0006\u0002\u0010\u0006\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/Flow;", "collect", "", "collector", "Lkotlinx/coroutines/flow/FlowCollector;", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 4, 2})
    public static final class setMin implements onWebsocketHandshakeSentAsClient<T> {
        final /* synthetic */ onWebsocketHandshakeSentAsClient getMin;
        final /* synthetic */ Function2 setMax;

        /* JADX WARNING: Removed duplicated region for block: B:17:0x0047  */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x0084 A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
        @org.jetbrains.annotations.Nullable
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object collect(@org.jetbrains.annotations.NotNull o.onWebsocketPong r7, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation r8) {
            /*
                r6 = this;
                boolean r0 = r8 instanceof o.WebSocketImpl.setMin.AnonymousClass4
                if (r0 == 0) goto L_0x0014
                r0 = r8
                o.WebSocketImpl$setMin$4 r0 = (o.WebSocketImpl.setMin.AnonymousClass4) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r1 = r1 & r2
                if (r1 == 0) goto L_0x0014
                int r8 = r0.label
                int r8 = r8 - r2
                r0.label = r8
                goto L_0x0019
            L_0x0014:
                o.WebSocketImpl$setMin$4 r0 = new o.WebSocketImpl$setMin$4
                r0.<init>(r6, r8)
            L_0x0019:
                java.lang.Object r8 = r0.result
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.label
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L_0x0047
                if (r2 == r4) goto L_0x0035
                if (r2 != r3) goto L_0x002d
                kotlin.ResultKt.throwOnFailure(r8)
                goto L_0x0085
            L_0x002d:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L_0x0035:
                java.lang.Object r7 = r0.L$2
                o.BasicWebSocketContext r7 = (o.BasicWebSocketContext) r7
                java.lang.Object r2 = r0.L$1
                o.onWebsocketPong r2 = (o.onWebsocketPong) r2
                java.lang.Object r4 = r0.L$0
                o.WebSocketImpl$setMin r4 = (o.WebSocketImpl.setMin) r4
                kotlin.ResultKt.throwOnFailure(r8)     // Catch:{ all -> 0x0045 }
                goto L_0x0070
            L_0x0045:
                r8 = move-exception
                goto L_0x008a
            L_0x0047:
                kotlin.ResultKt.throwOnFailure(r8)
                kotlin.coroutines.CoroutineContext r8 = r0.getContext()
                o.BasicWebSocketContext r2 = new o.BasicWebSocketContext
                r2.<init>(r7, r8)
                kotlin.jvm.functions.Function2 r8 = r6.setMax     // Catch:{ all -> 0x0088 }
                r0.L$0 = r6     // Catch:{ all -> 0x0088 }
                r0.L$1 = r7     // Catch:{ all -> 0x0088 }
                r0.L$2 = r2     // Catch:{ all -> 0x0088 }
                r0.label = r4     // Catch:{ all -> 0x0088 }
                r4 = 6
                kotlin.jvm.internal.InlineMarker.mark((int) r4)     // Catch:{ all -> 0x0088 }
                java.lang.Object r8 = r8.invoke(r2, r0)     // Catch:{ all -> 0x0088 }
                r4 = 7
                kotlin.jvm.internal.InlineMarker.mark((int) r4)     // Catch:{ all -> 0x0088 }
                if (r8 != r1) goto L_0x006c
                return r1
            L_0x006c:
                r4 = r6
                r5 = r2
                r2 = r7
                r7 = r5
            L_0x0070:
                r7.releaseIntercepted()
                o.onWebsocketHandshakeSentAsClient r7 = r4.getMin
                r8 = 0
                r0.L$0 = r8
                r0.L$1 = r8
                r0.L$2 = r8
                r0.label = r3
                java.lang.Object r7 = r7.collect(r2, r0)
                if (r7 != r1) goto L_0x0085
                return r1
            L_0x0085:
                kotlin.Unit r7 = kotlin.Unit.INSTANCE
                return r7
            L_0x0088:
                r8 = move-exception
                r7 = r2
            L_0x008a:
                r7.releaseIntercepted()
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: o.WebSocketImpl.setMin.collect(o.onWebsocketPong, kotlin.coroutines.Continuation):java.lang.Object");
        }

        public setMin(onWebsocketHandshakeSentAsClient onwebsockethandshakesentasclient, Function2 function2) {
            this.getMin = onwebsockethandshakesentasclient;
            this.setMax = function2;
        }
    }
}
