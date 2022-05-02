package o;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.FlowPreview;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u0005¢\u0006\u0002\u0010\u0004J\u001f\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\bH@ø\u0001\u0000¢\u0006\u0002\u0010\tJ\u001f\u0010\n\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\bH¦@ø\u0001\u0000¢\u0006\u0002\u0010\t\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b"}, d2 = {"Lkotlinx/coroutines/flow/AbstractFlow;", "T", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/coroutines/flow/CancellableFlow;", "()V", "collect", "", "collector", "Lkotlinx/coroutines/flow/FlowCollector;", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "collectSafely", "kotlinx-coroutines-core"}, k = 1, mv = {1, 4, 2})
@FlowPreview
public abstract class onWebsocketHandshakeReceivedAsServer<T> implements onWebsocketMessageFragment<T> {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H@"}, d2 = {"collect", "", "T", "collector", "Lkotlinx/coroutines/flow/FlowCollector;", "continuation", "Lkotlin/coroutines/Continuation;", ""}, k = 3, mv = {1, 4, 2})
    @DebugMetadata(c = "kotlinx.coroutines.flow.AbstractFlow", f = "Flow.kt", i = {0}, l = {212}, m = "collect", n = {"safeCollector"}, s = {"L$0"})
    static final class getMax extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ onWebsocketHandshakeReceivedAsServer this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        getMax(onWebsocketHandshakeReceivedAsServer onwebsockethandshakereceivedasserver, Continuation continuation) {
            super(continuation);
            this.this$0 = onwebsockethandshakereceivedasserver;
        }

        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.collect((onWebsocketPong) null, this);
        }
    }

    @Nullable
    public abstract Object setMin(@NotNull onWebsocketPong<? super T> onwebsocketpong, @NotNull Continuation<? super Unit> continuation);

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    @org.jetbrains.annotations.Nullable
    @kotlinx.coroutines.InternalCoroutinesApi
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object collect(@org.jetbrains.annotations.NotNull o.onWebsocketPong<? super T> r6, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof o.onWebsocketHandshakeReceivedAsServer.getMax
            if (r0 == 0) goto L_0x0014
            r0 = r7
            o.onWebsocketHandshakeReceivedAsServer$getMax r0 = (o.onWebsocketHandshakeReceivedAsServer.getMax) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L_0x0014
            int r7 = r0.label
            int r7 = r7 - r2
            r0.label = r7
            goto L_0x0019
        L_0x0014:
            o.onWebsocketHandshakeReceivedAsServer$getMax r0 = new o.onWebsocketHandshakeReceivedAsServer$getMax
            r0.<init>(r5, r7)
        L_0x0019:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0038
            if (r2 != r3) goto L_0x0030
            java.lang.Object r6 = r0.L$0
            o.BasicWebSocketContext r6 = (o.BasicWebSocketContext) r6
            kotlin.ResultKt.throwOnFailure(r7)     // Catch:{ all -> 0x002e }
            goto L_0x0053
        L_0x002e:
            r7 = move-exception
            goto L_0x005d
        L_0x0030:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0038:
            kotlin.ResultKt.throwOnFailure(r7)
            o.BasicWebSocketContext r7 = new o.BasicWebSocketContext
            kotlin.coroutines.CoroutineContext r2 = r0.getContext()
            r7.<init>(r6, r2)
            r6 = r7
            o.onWebsocketPong r6 = (o.onWebsocketPong) r6     // Catch:{ all -> 0x0059 }
            r0.L$0 = r7     // Catch:{ all -> 0x0059 }
            r0.label = r3     // Catch:{ all -> 0x0059 }
            java.lang.Object r6 = r5.setMin(r6, r0)     // Catch:{ all -> 0x0059 }
            if (r6 != r1) goto L_0x0052
            return r1
        L_0x0052:
            r6 = r7
        L_0x0053:
            r6.releaseIntercepted()
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
        L_0x0059:
            r6 = move-exception
            r4 = r7
            r7 = r6
            r6 = r4
        L_0x005d:
            r6.releaseIntercepted()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: o.onWebsocketHandshakeReceivedAsServer.collect(o.onWebsocketPong, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
