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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000bB\u000f\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u001f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\b2\u0006\u0010\t\u001a\u00020\u0002H@ø\u0001\u0000¢\u0006\u0002\u0010\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, d2 = {"Lid/dana/domain/nearbyme/interactor/GetMerchantDetailActionConfig;", "Lid/dana/domain/social/core/SingleUseCase;", "Lid/dana/domain/nearbyme/interactor/GetMerchantDetailActionConfig$Params;", "Lid/dana/domain/nearbyme/model/MerchantDetailConfig;", "merchantConfigRepository", "Lid/dana/domain/nearbyme/MerchantConfigRepository;", "(Lid/dana/domain/nearbyme/MerchantConfigRepository;)V", "buildUseCase", "Lid/dana/domain/social/Result;", "params", "(Lid/dana/domain/nearbyme/interactor/GetMerchantDetailActionConfig$Params;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Params", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class isQAndAbove extends buildModelMapWithLock<setMin, getSerialNumberEncrypt> {
    private final GriverSecurityManager merchantConfigRepository;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005H@"}, d2 = {"buildUseCase", "", "params", "Lid/dana/domain/nearbyme/interactor/GetMerchantDetailActionConfig$Params;", "continuation", "Lkotlin/coroutines/Continuation;", "Lid/dana/domain/social/Result;", "Lid/dana/domain/nearbyme/model/MerchantDetailConfig;"}, k = 3, mv = {1, 4, 2})
    @DebugMetadata(c = "id.dana.domain.nearbyme.interactor.GetMerchantDetailActionConfig", f = "GetMerchantDetailActionConfig.kt", i = {}, l = {24}, m = "buildUseCase", n = {}, s = {})
    static final class length extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ isQAndAbove this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        length(isQAndAbove isqandabove, Continuation continuation) {
            super(continuation);
            this.this$0 = isqandabove;
        }

        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.buildUseCase((setMin) null, (Continuation<? super forThisDevice<getSerialNumberEncrypt>>) this);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public isQAndAbove(@NotNull GriverSecurityManager griverSecurityManager) {
        super((APExpansion.AnonymousClass1) null, (APExpansion.AnonymousClass1) null, 3, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(griverSecurityManager, "merchantConfigRepository");
        this.merchantConfigRepository = griverSecurityManager;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    @org.jetbrains.annotations.Nullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object buildUseCase(@org.jetbrains.annotations.NotNull o.isQAndAbove.setMin r5, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super o.forThisDevice<o.getSerialNumberEncrypt>> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof o.isQAndAbove.length
            if (r0 == 0) goto L_0x0014
            r0 = r6
            o.isQAndAbove$length r0 = (o.isQAndAbove.length) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L_0x0014
            int r6 = r0.label
            int r6 = r6 - r2
            r0.label = r6
            goto L_0x0019
        L_0x0014:
            o.isQAndAbove$length r0 = new o.isQAndAbove$length
            r0.<init>(r4, r6)
        L_0x0019:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0032
            if (r2 != r3) goto L_0x002a
            kotlin.ResultKt.throwOnFailure(r6)
            goto L_0x0044
        L_0x002a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0032:
            kotlin.ResultKt.throwOnFailure(r6)
            o.GriverSecurityManager r6 = r4.merchantConfigRepository
            boolean r5 = r5.getFromNearbyRevamp()
            r0.label = r3
            java.lang.Object r6 = r6.getMerchantDetailActionConfig(r5, r0)
            if (r6 != r1) goto L_0x0044
            return r1
        L_0x0044:
            o.forThisDevice$setMax r5 = new o.forThisDevice$setMax
            r5.<init>(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: o.isQAndAbove.buildUseCase(o.isQAndAbove$setMin, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\t\u0010\r\u001a\u00020\u000eHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lid/dana/domain/nearbyme/interactor/GetMerchantDetailActionConfig$Params;", "", "fromNearbyRevamp", "", "(Z)V", "getFromNearbyRevamp", "()Z", "component1", "copy", "equals", "other", "hashCode", "", "toString", "", "domain_release"}, k = 1, mv = {1, 4, 2})
    public static final class setMin {
        private final boolean fromNearbyRevamp;

        public static /* synthetic */ setMin copy$default(setMin setmin, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = setmin.fromNearbyRevamp;
            }
            return setmin.copy(z);
        }

        public final boolean component1() {
            return this.fromNearbyRevamp;
        }

        @NotNull
        public final setMin copy(boolean z) {
            return new setMin(z);
        }

        public final boolean equals(@Nullable Object obj) {
            if (this != obj) {
                return (obj instanceof setMin) && this.fromNearbyRevamp == ((setMin) obj).fromNearbyRevamp;
            }
            return true;
        }

        public final int hashCode() {
            boolean z = this.fromNearbyRevamp;
            if (z) {
                return 1;
            }
            return z ? 1 : 0;
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("Params(fromNearbyRevamp=");
            sb.append(this.fromNearbyRevamp);
            sb.append(")");
            return sb.toString();
        }

        public setMin(boolean z) {
            this.fromNearbyRevamp = z;
        }

        public final boolean getFromNearbyRevamp() {
            return this.fromNearbyRevamp;
        }
    }
}
