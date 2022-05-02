package o;

import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0019\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H@ø\u0001\u0000¢\u0006\u0002\u0010\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000\u0002\u0004\n\u0002\b\u0019¨\u0006\n"}, d2 = {"Lid/dana/domain/nearbyme/interactor/merchantreview/CreateMerchantReview;", "Lid/dana/domain/core/usecase/CoroutineWorkerUseCase;", "Lid/dana/domain/nearbyme/model/MerchantCreateReview;", "", "merchantReviewRepository", "Lid/dana/domain/nearbyme/MerchantReviewRepository;", "(Lid/dana/domain/nearbyme/MerchantReviewRepository;)V", "execute", "param", "(Lid/dana/domain/nearbyme/model/MerchantCreateReview;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class BridgeUtils extends onReceivedTouchIconUrl<getSerialNumber, Unit> {
    private final AESUtil merchantReviewRepository;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H@"}, d2 = {"execute", "", "param", "Lid/dana/domain/nearbyme/model/MerchantCreateReview;", "continuation", "Lkotlin/coroutines/Continuation;", ""}, k = 3, mv = {1, 4, 2})
    @DebugMetadata(c = "id.dana.domain.nearbyme.interactor.merchantreview.CreateMerchantReview", f = "CreateMerchantReview.kt", i = {}, l = {23}, m = "execute", n = {}, s = {})
    static final class getMin extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ BridgeUtils this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        getMin(BridgeUtils bridgeUtils, Continuation continuation) {
            super(continuation);
            this.this$0 = bridgeUtils;
        }

        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.execute((getSerialNumber) null, (Continuation<? super Unit>) this);
        }
    }

    @Inject
    public BridgeUtils(@NotNull AESUtil aESUtil) {
        Intrinsics.checkNotNullParameter(aESUtil, "merchantReviewRepository");
        this.merchantReviewRepository = aESUtil;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    @org.jetbrains.annotations.Nullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object execute(@org.jetbrains.annotations.NotNull o.getSerialNumber r5, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof o.BridgeUtils.getMin
            if (r0 == 0) goto L_0x0014
            r0 = r6
            o.BridgeUtils$getMin r0 = (o.BridgeUtils.getMin) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L_0x0014
            int r6 = r0.label
            int r6 = r6 - r2
            r0.label = r6
            goto L_0x0019
        L_0x0014:
            o.BridgeUtils$getMin r0 = new o.BridgeUtils$getMin
            r0.<init>(r4, r6)
        L_0x0019:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0032
            if (r2 != r3) goto L_0x002a
            kotlin.ResultKt.throwOnFailure(r6)
            goto L_0x0040
        L_0x002a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0032:
            kotlin.ResultKt.throwOnFailure(r6)
            o.AESUtil r6 = r4.merchantReviewRepository
            r0.label = r3
            java.lang.Object r5 = r6.createMerchantReview(r5, r0)
            if (r5 != r1) goto L_0x0040
            return r1
        L_0x0040:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: o.BridgeUtils.execute(o.getSerialNumber, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
