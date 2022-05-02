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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ!\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H@ø\u0001\u0000¢\u0006\u0002\u0010\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, d2 = {"Lid/dana/domain/social/interactor/InitFeedWithoutContact;", "Lid/dana/domain/social/core/SingleUseCase;", "", "Lid/dana/domain/social/model/InitFeed;", "repository", "Lid/dana/domain/social/SocialSyncRepository;", "socialPrivacyRepository", "Lid/dana/domain/social/SocialPrivacyRepository;", "(Lid/dana/domain/social/SocialSyncRepository;Lid/dana/domain/social/SocialPrivacyRepository;)V", "buildUseCase", "Lid/dana/domain/social/Result;", "params", "(Lkotlin/Unit;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class stopStatusPreservation extends buildModelMapWithLock<Unit, setBeaconParsers> {
    private final getRequestedModel repository;
    private final getResponseString socialPrivacyRepository;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0012\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005H@"}, d2 = {"buildUseCase", "", "params", "", "continuation", "Lkotlin/coroutines/Continuation;", "Lid/dana/domain/social/Result;", "Lid/dana/domain/social/model/InitFeed;"}, k = 3, mv = {1, 4, 2})
    @DebugMetadata(c = "id.dana.domain.social.interactor.InitFeedWithoutContact", f = "InitFeedWithoutContact.kt", i = {}, l = {28}, m = "buildUseCase", n = {}, s = {})
    static final class setMax extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ stopStatusPreservation this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        setMax(stopStatusPreservation stopstatuspreservation, Continuation continuation) {
            super(continuation);
            this.this$0 = stopstatuspreservation;
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
    public stopStatusPreservation(@NotNull getRequestedModel getrequestedmodel, @NotNull getResponseString getresponsestring) {
        super((APExpansion.AnonymousClass1) null, (APExpansion.AnonymousClass1) null, 3, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(getrequestedmodel, "repository");
        Intrinsics.checkNotNullParameter(getresponsestring, "socialPrivacyRepository");
        this.repository = getrequestedmodel;
        this.socialPrivacyRepository = getresponsestring;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    @org.jetbrains.annotations.Nullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object buildUseCase(@org.jetbrains.annotations.Nullable kotlin.Unit r8, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super o.forThisDevice<o.setBeaconParsers>> r9) {
        /*
            r7 = this;
            boolean r8 = r9 instanceof o.stopStatusPreservation.setMax
            if (r8 == 0) goto L_0x0014
            r8 = r9
            o.stopStatusPreservation$setMax r8 = (o.stopStatusPreservation.setMax) r8
            int r0 = r8.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L_0x0014
            int r9 = r8.label
            int r9 = r9 - r1
            r8.label = r9
            goto L_0x0019
        L_0x0014:
            o.stopStatusPreservation$setMax r8 = new o.stopStatusPreservation$setMax
            r8.<init>(r7, r9)
        L_0x0019:
            java.lang.Object r9 = r8.result
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r8.label
            r2 = 1
            if (r1 == 0) goto L_0x0032
            if (r1 != r2) goto L_0x002a
            kotlin.ResultKt.throwOnFailure(r9)
            goto L_0x0048
        L_0x002a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0032:
            kotlin.ResultKt.throwOnFailure(r9)
            o.getResponseString r9 = r7.socialPrivacyRepository
            boolean r9 = r9.getShareFeedConsent()
            if (r9 == 0) goto L_0x004b
            o.getRequestedModel r9 = r7.repository
            r8.label = r2
            java.lang.Object r9 = r9.initFeedWithoutContact(r8)
            if (r9 != r0) goto L_0x0048
            return r0
        L_0x0048:
            o.setBeaconParsers r9 = (o.setBeaconParsers) r9
            goto L_0x0059
        L_0x004b:
            o.setBeaconParsers r9 = new o.setBeaconParsers
            id.dana.domain.social.InitStatus r1 = id.dana.domain.social.InitStatus.FINISH
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 14
            r6 = 0
            r0 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6)
        L_0x0059:
            o.forThisDevice$setMax r8 = new o.forThisDevice$setMax
            r8.<init>(r9)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: o.stopStatusPreservation.buildUseCase(kotlin.Unit, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
