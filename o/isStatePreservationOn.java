package o;

import id.dana.domain.nearbyme.IoDispatcher;
import id.dana.domain.nearbyme.MainDispatcher;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import o.APExpansion;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B#\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007¢\u0006\u0002\u0010\tJ\u001f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b2\u0006\u0010\f\u001a\u00020\u0002H@ø\u0001\u0000¢\u0006\u0002\u0010\rJ\b\u0010\u000e\u001a\u00020\u0003H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, d2 = {"Lid/dana/domain/social/interactor/InitFeedPeriodically;", "Lid/dana/domain/social/core/SingleUseCase;", "", "", "socialSyncRepository", "Lid/dana/domain/social/SocialSyncRepository;", "ioDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "mainDispatcher", "(Lid/dana/domain/social/SocialSyncRepository;Lkotlinx/coroutines/CoroutineDispatcher;Lkotlinx/coroutines/CoroutineDispatcher;)V", "buildUseCase", "Lid/dana/domain/social/Result;", "params", "(Lkotlin/Unit;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isInitFeedJobRunning", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class isStatePreservationOn extends buildModelMapWithLock<Unit, Boolean> {
    private final APExpansion.AnonymousClass1 ioDispatcher;
    private final APExpansion.AnonymousClass1 mainDispatcher;
    private final getRequestedModel socialSyncRepository;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005H@"}, d2 = {"buildUseCase", "", "params", "", "continuation", "Lkotlin/coroutines/Continuation;", "Lid/dana/domain/social/Result;", ""}, k = 3, mv = {1, 4, 2})
    @DebugMetadata(c = "id.dana.domain.social.interactor.InitFeedPeriodically", f = "InitFeedPeriodically.kt", i = {}, l = {41}, m = "buildUseCase", n = {}, s = {})
    static final class setMin extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ isStatePreservationOn this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        setMin(isStatePreservationOn isstatepreservationon, Continuation continuation) {
            super(continuation);
            this.this$0 = isstatepreservationon;
        }

        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.buildUseCase((Unit) null, (Continuation<? super forThisDevice<Boolean>>) this);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public isStatePreservationOn(@NotNull getRequestedModel getrequestedmodel, @NotNull @IoDispatcher APExpansion.AnonymousClass1 r3, @NotNull @MainDispatcher APExpansion.AnonymousClass1 r4) {
        super(r3, r4);
        Intrinsics.checkNotNullParameter(getrequestedmodel, "socialSyncRepository");
        Intrinsics.checkNotNullParameter(r3, "ioDispatcher");
        Intrinsics.checkNotNullParameter(r4, "mainDispatcher");
        this.socialSyncRepository = getrequestedmodel;
        this.ioDispatcher = r3;
        this.mainDispatcher = r4;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    @org.jetbrains.annotations.Nullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object buildUseCase(@org.jetbrains.annotations.NotNull kotlin.Unit r4, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super o.forThisDevice<java.lang.Boolean>> r5) {
        /*
            r3 = this;
            boolean r4 = r5 instanceof o.isStatePreservationOn.setMin
            if (r4 == 0) goto L_0x0014
            r4 = r5
            o.isStatePreservationOn$setMin r4 = (o.isStatePreservationOn.setMin) r4
            int r0 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L_0x0014
            int r5 = r4.label
            int r5 = r5 - r1
            r4.label = r5
            goto L_0x0019
        L_0x0014:
            o.isStatePreservationOn$setMin r4 = new o.isStatePreservationOn$setMin
            r4.<init>(r3, r5)
        L_0x0019:
            java.lang.Object r5 = r4.result
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r4.label
            r2 = 1
            if (r1 == 0) goto L_0x0032
            if (r1 != r2) goto L_0x002a
            kotlin.ResultKt.throwOnFailure(r5)
            goto L_0x0054
        L_0x002a:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0032:
            kotlin.ResultKt.throwOnFailure(r5)
            boolean r5 = r3.isInitFeedJobRunning()
            if (r5 == 0) goto L_0x0046
            o.forThisDevice$setMax r4 = new o.forThisDevice$setMax
            r5 = 0
            java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r5)
            r4.<init>(r5)
            return r4
        L_0x0046:
            o.getRequestedModel r5 = r3.socialSyncRepository
            r5.setDeviceFeedFeatureSwitch(r2)
            r4.label = r2
            java.lang.Object r5 = r5.initFeedPeriodically(r4)
            if (r5 != r0) goto L_0x0054
            return r0
        L_0x0054:
            o.forThisDevice$setMax r4 = new o.forThisDevice$setMax
            r4.<init>(r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: o.isStatePreservationOn.buildUseCase(kotlin.Unit, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final boolean isInitFeedJobRunning() {
        DictionaryKeys initFeedJob = this.socialSyncRepository.getInitFeedJob();
        if (initFeedJob != null) {
            return initFeedJob.B_();
        }
        return false;
    }
}
