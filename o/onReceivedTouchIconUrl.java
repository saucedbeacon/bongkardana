package o;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b&\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0000*\b\b\u0001\u0010\u0002*\u00020\u00032\u00020\u0003B\u0005¢\u0006\u0002\u0010\u0004J\u0019\u0010\u0005\u001a\u00028\u00012\u0006\u0010\u0006\u001a\u00028\u0000H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0007J\u001f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\t2\u0006\u0010\u0006\u001a\u00028\u0000HBø\u0001\u0000¢\u0006\u0002\u0010\u0007\u0002\u0004\n\u0002\b\u0019¨\u0006\n"}, d2 = {"Lid/dana/domain/core/usecase/CoroutineWorkerUseCase;", "P", "R", "", "()V", "execute", "param", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "invoke", "Lid/dana/domain/social/Result;", "domain_release"}, k = 1, mv = {1, 4, 2})
public abstract class onReceivedTouchIconUrl<P, R> {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\u0006\b\u0000\u0010\u0002 \u0000\"\b\b\u0001\u0010\u0003*\u00020\u00012\u0006\u0010\u0004\u001a\u0002H\u00022\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u00070\u0006HB"}, d2 = {"invoke", "", "P", "R", "param", "continuation", "Lkotlin/coroutines/Continuation;", "Lid/dana/domain/social/Result;"}, k = 3, mv = {1, 4, 2})
    @DebugMetadata(c = "id.dana.domain.core.usecase.CoroutineWorkerUseCase", f = "CoroutineWorkerUseCase.kt", i = {}, l = {23}, m = "invoke", n = {}, s = {})
    static final class setMax extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ onReceivedTouchIconUrl this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        setMax(onReceivedTouchIconUrl onreceivedtouchiconurl, Continuation continuation) {
            super(continuation);
            this.this$0 = onreceivedtouchiconurl;
        }

        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.invoke(null, this);
        }
    }

    @Nullable
    public abstract Object execute(P p, @NotNull Continuation<? super R> continuation);

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    @org.jetbrains.annotations.Nullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invoke(P r5, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super o.forThisDevice<? extends R>> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof o.onReceivedTouchIconUrl.setMax
            if (r0 == 0) goto L_0x0014
            r0 = r6
            o.onReceivedTouchIconUrl$setMax r0 = (o.onReceivedTouchIconUrl.setMax) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L_0x0014
            int r6 = r0.label
            int r6 = r6 - r2
            r0.label = r6
            goto L_0x0019
        L_0x0014:
            o.onReceivedTouchIconUrl$setMax r0 = new o.onReceivedTouchIconUrl$setMax
            r0.<init>(r4, r6)
        L_0x0019:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0034
            if (r2 != r3) goto L_0x002c
            kotlin.ResultKt.throwOnFailure(r6)     // Catch:{ Exception -> 0x002a }
            goto L_0x0040
        L_0x002a:
            r5 = move-exception
            goto L_0x0048
        L_0x002c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0034:
            kotlin.ResultKt.throwOnFailure(r6)
            r0.label = r3     // Catch:{ Exception -> 0x002a }
            java.lang.Object r6 = r4.execute(r5, r0)     // Catch:{ Exception -> 0x002a }
            if (r6 != r1) goto L_0x0040
            return r1
        L_0x0040:
            o.forThisDevice$setMax r5 = new o.forThisDevice$setMax     // Catch:{ Exception -> 0x002a }
            r5.<init>(r6)     // Catch:{ Exception -> 0x002a }
            o.forThisDevice r5 = (o.forThisDevice) r5     // Catch:{ Exception -> 0x002a }
            goto L_0x0050
        L_0x0048:
            o.forThisDevice$getMin r6 = new o.forThisDevice$getMin
            r6.<init>(r5)
            r5 = r6
            o.forThisDevice r5 = (o.forThisDevice) r5
        L_0x0050:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: o.onReceivedTouchIconUrl.invoke(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
