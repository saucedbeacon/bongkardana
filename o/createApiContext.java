package o;

import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.APExpansion;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \n2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\nB\u000f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00072\u0006\u0010\b\u001a\u00020\u0002H@ø\u0001\u0000¢\u0006\u0002\u0010\tR\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b"}, d2 = {"Lid/dana/domain/nearbyme/interactor/GetHomeShoppingTnc;", "Lid/dana/domain/social/core/SingleUseCase;", "", "merchantInfoRepository", "Lid/dana/domain/nearbyme/MerchantInfoRepository;", "(Lid/dana/domain/nearbyme/MerchantInfoRepository;)V", "buildUseCase", "Lid/dana/domain/social/Result;", "params", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class createApiContext extends buildModelMapWithLock<String, String> {
    @NotNull
    public static final length Companion = new length((DefaultConstructorMarker) null);
    @NotNull
    public static final String TNC_BIZ_INFO = "TERM_CONDITION";
    private final setStorageProxy merchantInfoRepository;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00060\u0005H@"}, d2 = {"buildUseCase", "", "params", "", "continuation", "Lkotlin/coroutines/Continuation;", "Lid/dana/domain/social/Result;"}, k = 3, mv = {1, 4, 2})
    @DebugMetadata(c = "id.dana.domain.nearbyme.interactor.GetHomeShoppingTnc", f = "GetHomeShoppingTnc.kt", i = {}, l = {25}, m = "buildUseCase", n = {}, s = {})
    static final class getMax extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ createApiContext this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        getMax(createApiContext createapicontext, Continuation continuation) {
            super(continuation);
            this.this$0 = createapicontext;
        }

        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.buildUseCase((String) null, (Continuation<? super forThisDevice<String>>) this);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public createApiContext(@NotNull setStorageProxy setstorageproxy) {
        super((APExpansion.AnonymousClass1) null, (APExpansion.AnonymousClass1) null, 3, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(setstorageproxy, "merchantInfoRepository");
        this.merchantInfoRepository = setstorageproxy;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    @org.jetbrains.annotations.Nullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object buildUseCase(@org.jetbrains.annotations.NotNull java.lang.String r5, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super o.forThisDevice<java.lang.String>> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof o.createApiContext.getMax
            if (r0 == 0) goto L_0x0014
            r0 = r6
            o.createApiContext$getMax r0 = (o.createApiContext.getMax) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L_0x0014
            int r6 = r0.label
            int r6 = r6 - r2
            r0.label = r6
            goto L_0x0019
        L_0x0014:
            o.createApiContext$getMax r0 = new o.createApiContext$getMax
            r0.<init>(r4, r6)
        L_0x0019:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0032
            if (r2 != r3) goto L_0x002a
            kotlin.ResultKt.throwOnFailure(r6)
            goto L_0x0042
        L_0x002a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0032:
            kotlin.ResultKt.throwOnFailure(r6)
            o.setStorageProxy r6 = r4.merchantInfoRepository
            r0.label = r3
            java.lang.String r2 = "TERM_CONDITION"
            java.lang.Object r6 = r6.queryAdditionalInfo(r5, r2, r0)
            if (r6 != r1) goto L_0x0042
            return r1
        L_0x0042:
            o.getIMEIEncrypt r6 = (o.getIMEIEncrypt) r6
            java.lang.String r5 = r6.getInfoContent()
            o.forThisDevice$setMax r6 = new o.forThisDevice$setMax
            r6.<init>(r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: o.createApiContext.buildUseCase(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lid/dana/domain/nearbyme/interactor/GetHomeShoppingTnc$Companion;", "", "()V", "TNC_BIZ_INFO", "", "domain_release"}, k = 1, mv = {1, 4, 2})
    public static final class length {
        private length() {
        }

        public /* synthetic */ length(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
