package o;

import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.APExpansion;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u001f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\b2\u0006\u0010\t\u001a\u00020\u0002H@ø\u0001\u0000¢\u0006\u0002\u0010\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b"}, d2 = {"Lid/dana/domain/social/interactor/InitSocialFeed;", "Lid/dana/domain/social/core/SingleUseCase;", "", "Lid/dana/domain/social/model/InitFeed;", "socialSyncRepository", "Lid/dana/domain/social/SocialSyncRepository;", "(Lid/dana/domain/social/SocialSyncRepository;)V", "buildUseCase", "Lid/dana/domain/social/Result;", "params", "(Lkotlin/Unit;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class startStatusPreservation extends buildModelMapWithLock<Unit, setBeaconParsers> {
    private getRequestedModel socialSyncRepository;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005H@"}, d2 = {"buildUseCase", "", "params", "", "continuation", "Lkotlin/coroutines/Continuation;", "Lid/dana/domain/social/Result;", "Lid/dana/domain/social/model/InitFeed;"}, k = 3, mv = {1, 4, 2})
    @DebugMetadata(c = "id.dana.domain.social.interactor.InitSocialFeed", f = "InitSocialFeed.kt", i = {}, l = {24}, m = "buildUseCase", n = {}, s = {})
    static final class setMax extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ startStatusPreservation this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        setMax(startStatusPreservation startstatuspreservation, Continuation continuation) {
            super(continuation);
            this.this$0 = startstatuspreservation;
        }

        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.buildUseCase((Unit) null, (Continuation<? super forThisDevice<setBeaconParsers>>) this);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public startStatusPreservation(@NotNull getRequestedModel getrequestedmodel) {
        super((APExpansion.AnonymousClass1) null, (APExpansion.AnonymousClass1) null, 3, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(getrequestedmodel, "socialSyncRepository");
        this.socialSyncRepository = getrequestedmodel;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    @org.jetbrains.annotations.Nullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object buildUseCase(@org.jetbrains.annotations.NotNull kotlin.Unit r4, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super o.forThisDevice<o.setBeaconParsers>> r5) {
        /*
            r3 = this;
            boolean r4 = r5 instanceof o.startStatusPreservation.setMax
            if (r4 == 0) goto L_0x0014
            r4 = r5
            o.startStatusPreservation$setMax r4 = (o.startStatusPreservation.setMax) r4
            int r0 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L_0x0014
            int r5 = r4.label
            int r5 = r5 - r1
            r4.label = r5
            goto L_0x0019
        L_0x0014:
            o.startStatusPreservation$setMax r4 = new o.startStatusPreservation$setMax
            r4.<init>(r3, r5)
        L_0x0019:
            java.lang.Object r5 = r4.result
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r4.label
            r2 = 1
            if (r1 == 0) goto L_0x0032
            if (r1 != r2) goto L_0x002a
            kotlin.ResultKt.throwOnFailure(r5)
            goto L_0x0040
        L_0x002a:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0032:
            kotlin.ResultKt.throwOnFailure(r5)
            o.getRequestedModel r5 = r3.socialSyncRepository
            r4.label = r2
            java.lang.Object r5 = r5.initFeedFirstTime(r4)
            if (r5 != r0) goto L_0x0040
            return r0
        L_0x0040:
            o.forThisDevice$setMax r4 = new o.forThisDevice$setMax
            r4.<init>(r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: o.startStatusPreservation.buildUseCase(kotlin.Unit, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
