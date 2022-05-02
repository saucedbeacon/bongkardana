package o;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000v\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001ah\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012B\u0010\u0003\u001a>\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u0005\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u0004¢\u0006\u0002\b\rø\u0001\u0000¢\u0006\u0002\u0010\u000e\u001a1\u0010\u000f\u001a\u0004\u0018\u00010\u0006\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0005H@ø\u0001\u0000¢\u0006\u0002\u0010\u0011\u001a\u0019\u0010\u0012\u001a\u00020\u0013*\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0015H\u0002¢\u0006\u0002\b\u0016\u001a\u001b\u0010\u0017\u001a\u00020\u0013*\u00020\u00062\b\u0010\u0018\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0002\b\u0019\u001aB\u0010\u001a\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0014\b\u0002\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00130\u001dH\u0007\u001a>\u0010\u001e\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\b\b\u0002\u0010\u001f\u001a\u00020 2\u0014\b\u0002\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00130\u001dH\u0007\u001ac\u0010\u001e\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\b\b\u0002\u0010\u001f\u001a\u00020!23\b\u0002\u0010\u001c\u001a-\b\u0001\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\"ø\u0001\u0000¢\u0006\u0002\u0010#\u001a}\u0010$\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012W\u0010\u001c\u001aS\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u0005\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110!¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(&\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\n\u0012\u0006\u0012\u0004\u0018\u00010\f0%¢\u0006\u0002\b\rø\u0001\u0000¢\u0006\u0002\u0010'*\\\b\u0007\u0010(\"\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00130\u001d2\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00130\u001dB6\b)\u0012\n\b*\u0012\u0006\b\n0+8,\u0012\b\b-\u0012\u0004\b\b(.\u0012\u001c\b/\u0012\u0018\b\u000bB\u0014\b0\u0012\u0006\b1\u0012\u0002\b\f\u0012\b\b2\u0012\u0004\b\b(3\u0002\u0004\n\u0002\b\u0019¨\u00064"}, d2 = {"catch", "Lkotlinx/coroutines/flow/Flow;", "T", "action", "Lkotlin/Function3;", "Lkotlinx/coroutines/flow/FlowCollector;", "", "Lkotlin/ParameterName;", "name", "cause", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function3;)Lkotlinx/coroutines/flow/Flow;", "catchImpl", "collector", "(Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isCancellationCause", "", "coroutineContext", "Lkotlin/coroutines/CoroutineContext;", "isCancellationCause$FlowKt__ErrorsKt", "isSameExceptionAs", "other", "isSameExceptionAs$FlowKt__ErrorsKt", "onErrorCollect", "fallback", "predicate", "Lkotlin/Function1;", "retry", "retries", "", "", "Lkotlin/Function2;", "(Lkotlinx/coroutines/flow/Flow;JLkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/flow/Flow;", "retryWhen", "Lkotlin/Function4;", "attempt", "(Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function4;)Lkotlinx/coroutines/flow/Flow;", "ExceptionPredicate", "Lkotlin/Deprecated;", "level", "Lkotlin/DeprecationLevel;", "ERROR", "message", "Use (Throwable) -> Boolean functional type", "replaceWith", "Lkotlin/ReplaceWith;", "imports", "expression", "(Throwable) -> Boolean", "kotlinx-coroutines-core"}, k = 5, mv = {1, 4, 2}, xs = "kotlinx/coroutines/flow/FlowKt")
final /* synthetic */ class decodeHandshake {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001f\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H@ø\u0001\u0000¢\u0006\u0002\u0010\u0006\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/Flow;", "collect", "", "collector", "Lkotlinx/coroutines/flow/FlowCollector;", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 4, 2})
    public static final class getMin implements onWebsocketHandshakeSentAsClient<T> {
        final /* synthetic */ onWebsocketHandshakeSentAsClient getMax;
        final /* synthetic */ Function3 setMax;

        /* JADX WARNING: Removed duplicated region for block: B:14:0x0041  */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x0058  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
        @org.jetbrains.annotations.Nullable
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object collect(@org.jetbrains.annotations.NotNull o.onWebsocketPong r6, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof o.decodeHandshake.getMin.AnonymousClass3
                if (r0 == 0) goto L_0x0014
                r0 = r7
                o.decodeHandshake$getMin$3 r0 = (o.decodeHandshake.getMin.AnonymousClass3) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r1 = r1 & r2
                if (r1 == 0) goto L_0x0014
                int r7 = r0.label
                int r7 = r7 - r2
                r0.label = r7
                goto L_0x0019
            L_0x0014:
                o.decodeHandshake$getMin$3 r0 = new o.decodeHandshake$getMin$3
                r0.<init>(r5, r7)
            L_0x0019:
                java.lang.Object r7 = r0.result
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.label
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L_0x0041
                if (r2 == r4) goto L_0x0035
                if (r2 != r3) goto L_0x002d
                kotlin.ResultKt.throwOnFailure(r7)
                goto L_0x0070
            L_0x002d:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L_0x0035:
                java.lang.Object r6 = r0.L$1
                o.onWebsocketPong r6 = (o.onWebsocketPong) r6
                java.lang.Object r2 = r0.L$0
                o.decodeHandshake$getMin r2 = (o.decodeHandshake.getMin) r2
                kotlin.ResultKt.throwOnFailure(r7)
                goto L_0x0054
            L_0x0041:
                kotlin.ResultKt.throwOnFailure(r7)
                o.onWebsocketHandshakeSentAsClient r7 = r5.getMax
                r0.L$0 = r5
                r0.L$1 = r6
                r0.label = r4
                java.lang.Object r7 = o.decodeHandshake.getMin(r7, r6, r0)
                if (r7 != r1) goto L_0x0053
                return r1
            L_0x0053:
                r2 = r5
            L_0x0054:
                java.lang.Throwable r7 = (java.lang.Throwable) r7
                if (r7 == 0) goto L_0x0070
                kotlin.jvm.functions.Function3 r2 = r2.setMax
                r4 = 0
                r0.L$0 = r4
                r0.L$1 = r4
                r0.label = r3
                r3 = 6
                kotlin.jvm.internal.InlineMarker.mark((int) r3)
                java.lang.Object r6 = r2.invoke(r6, r7, r0)
                r7 = 7
                kotlin.jvm.internal.InlineMarker.mark((int) r7)
                if (r6 != r1) goto L_0x0070
                return r1
            L_0x0070:
                kotlin.Unit r6 = kotlin.Unit.INSTANCE
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: o.decodeHandshake.getMin.collect(o.onWebsocketPong, kotlin.coroutines.Continuation):java.lang.Object");
        }

        public getMin(onWebsocketHandshakeSentAsClient onwebsockethandshakesentasclient, Function3 function3) {
            this.getMax = onwebsockethandshakesentasclient;
            this.setMax = function3;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00028\u0000H@ø\u0001\u0000¢\u0006\u0002\u0010\u0005\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/FlowKt__CollectKt$collect$3", "Lkotlinx/coroutines/flow/FlowCollector;", "emit", "", "value", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 4, 2})
    public static final class setMin implements onWebsocketPong<T> {
        final /* synthetic */ Ref.ObjectRef getMin;
        final /* synthetic */ onWebsocketPong setMax;

        public setMin(onWebsocketPong onwebsocketpong, Ref.ObjectRef objectRef) {
            this.setMax = onwebsocketpong;
            this.getMin = objectRef;
        }

        /* JADX WARNING: Removed duplicated region for block: B:15:0x0038  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
        @org.jetbrains.annotations.Nullable
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object emit(java.lang.Object r5, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation r6) {
            /*
                r4 = this;
                boolean r0 = r6 instanceof o.decodeHandshake.setMin.AnonymousClass5
                if (r0 == 0) goto L_0x0014
                r0 = r6
                o.decodeHandshake$setMin$5 r0 = (o.decodeHandshake.setMin.AnonymousClass5) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r1 = r1 & r2
                if (r1 == 0) goto L_0x0014
                int r6 = r0.label
                int r6 = r6 - r2
                r0.label = r6
                goto L_0x0019
            L_0x0014:
                o.decodeHandshake$setMin$5 r0 = new o.decodeHandshake$setMin$5
                r0.<init>(r4, r6)
            L_0x0019:
                java.lang.Object r6 = r0.result
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.label
                r3 = 1
                if (r2 == 0) goto L_0x0038
                if (r2 != r3) goto L_0x0030
                java.lang.Object r5 = r0.L$0
                o.decodeHandshake$setMin r5 = (o.decodeHandshake.setMin) r5
                kotlin.ResultKt.throwOnFailure(r6)     // Catch:{ all -> 0x002e }
                goto L_0x0048
            L_0x002e:
                r6 = move-exception
                goto L_0x004d
            L_0x0030:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L_0x0038:
                kotlin.ResultKt.throwOnFailure(r6)
                o.onWebsocketPong r6 = r4.setMax     // Catch:{ all -> 0x004b }
                r0.L$0 = r4     // Catch:{ all -> 0x004b }
                r0.label = r3     // Catch:{ all -> 0x004b }
                java.lang.Object r5 = r6.emit(r5, r0)     // Catch:{ all -> 0x004b }
                if (r5 != r1) goto L_0x0048
                return r1
            L_0x0048:
                kotlin.Unit r5 = kotlin.Unit.INSTANCE
                return r5
            L_0x004b:
                r6 = move-exception
                r5 = r4
            L_0x004d:
                kotlin.jvm.internal.Ref$ObjectRef r5 = r5.getMin
                r5.element = r6
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: o.decodeHandshake.setMin.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    @org.jetbrains.annotations.Nullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> java.lang.Object getMin(@org.jetbrains.annotations.NotNull o.onWebsocketHandshakeSentAsClient<? extends T> r5, @org.jetbrains.annotations.NotNull o.onWebsocketPong<? super T> r6, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super java.lang.Throwable> r7) {
        /*
            boolean r0 = r7 instanceof o.decodeHandshake.getMax
            if (r0 == 0) goto L_0x0014
            r0 = r7
            o.decodeHandshake$getMax r0 = (o.decodeHandshake.getMax) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L_0x0014
            int r7 = r0.label
            int r7 = r7 - r2
            r0.label = r7
            goto L_0x0019
        L_0x0014:
            o.decodeHandshake$getMax r0 = new o.decodeHandshake$getMax
            r0.<init>(r7)
        L_0x0019:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x0039
            if (r2 != r4) goto L_0x0031
            java.lang.Object r5 = r0.L$0
            kotlin.jvm.internal.Ref$ObjectRef r5 = (kotlin.jvm.internal.Ref.ObjectRef) r5
            kotlin.ResultKt.throwOnFailure(r7)     // Catch:{ all -> 0x002f }
            goto L_0x0055
        L_0x002f:
            r6 = move-exception
            goto L_0x0058
        L_0x0031:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0039:
            kotlin.ResultKt.throwOnFailure(r7)
            kotlin.jvm.internal.Ref$ObjectRef r7 = new kotlin.jvm.internal.Ref$ObjectRef
            r7.<init>()
            r7.element = r3
            o.decodeHandshake$setMin r2 = new o.decodeHandshake$setMin     // Catch:{ all -> 0x0056 }
            r2.<init>(r6, r7)     // Catch:{ all -> 0x0056 }
            o.onWebsocketPong r2 = (o.onWebsocketPong) r2     // Catch:{ all -> 0x0056 }
            r0.L$0 = r7     // Catch:{ all -> 0x0056 }
            r0.label = r4     // Catch:{ all -> 0x0056 }
            java.lang.Object r5 = r5.collect(r2, r0)     // Catch:{ all -> 0x0056 }
            if (r5 != r1) goto L_0x0055
            return r1
        L_0x0055:
            return r3
        L_0x0056:
            r6 = move-exception
            r5 = r7
        L_0x0058:
            T r5 = r5.element
            java.lang.Throwable r5 = (java.lang.Throwable) r5
            boolean r5 = length(r6, r5)
            if (r5 != 0) goto L_0x006d
            kotlin.coroutines.CoroutineContext r5 = r0.getContext()
            boolean r5 = setMin(r6, r5)
            if (r5 != 0) goto L_0x006d
            return r6
        L_0x006d:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: o.decodeHandshake.getMin(o.onWebsocketHandshakeSentAsClient, o.onWebsocketPong, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private static final boolean setMin(Throwable th, CoroutineContext coroutineContext) {
        DictionaryKeys dictionaryKeys = (DictionaryKeys) coroutineContext.get(DictionaryKeys.getMax);
        if (dictionaryKeys == null || !dictionaryKeys.toIntRange()) {
            return false;
        }
        return length(th, dictionaryKeys.C_());
    }

    private static final boolean length(Throwable th, Throwable th2) {
        if (th2 == null) {
            return false;
        }
        if (getApdidToken.length()) {
            th2 = WebSocketCallbackAdapter.setMin(th2);
        }
        if (getApdidToken.length()) {
            th = WebSocketCallbackAdapter.setMin(th);
        }
        return Intrinsics.areEqual((Object) th2, (Object) th);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00052\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007H@"}, d2 = {"catchImpl", "", "T", "Lkotlinx/coroutines/flow/Flow;", "collector", "Lkotlinx/coroutines/flow/FlowCollector;", "continuation", "Lkotlin/coroutines/Continuation;", ""}, k = 3, mv = {1, 4, 2})
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt", f = "Errors.kt", i = {0}, l = {230}, m = "catchImpl", n = {"fromDownstream"}, s = {"L$0"})
    static final class getMax extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        getMax(Continuation continuation) {
            super(continuation);
        }

        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return decodeHandshake.getMin((onWebsocketHandshakeSentAsClient) null, (onWebsocketPong) null, this);
        }
    }
}
