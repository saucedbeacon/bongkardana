package o;

import id.dana.contract.deeplink.path.FeatureParams;
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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000bB\u000f\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u001f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\b2\u0006\u0010\t\u001a\u00020\u0002H@ø\u0001\u0000¢\u0006\u0002\u0010\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, d2 = {"Lid/dana/domain/nearbyme/interactor/GetMerchantReviewSummary;", "Lid/dana/domain/social/core/SingleUseCase;", "Lid/dana/domain/nearbyme/interactor/GetMerchantReviewSummary$Param;", "Lid/dana/domain/nearbyme/model/MerchantReviewSummary;", "merchantInfoRepository", "Lid/dana/domain/nearbyme/MerchantInfoRepository;", "(Lid/dana/domain/nearbyme/MerchantInfoRepository;)V", "buildUseCase", "Lid/dana/domain/social/Result;", "params", "(Lid/dana/domain/nearbyme/interactor/GetMerchantReviewSummary$Param;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Param", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class isOutOfTime extends buildModelMapWithLock<setMax, containCachePath> {
    private final setStorageProxy merchantInfoRepository;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005H@"}, d2 = {"buildUseCase", "", "params", "Lid/dana/domain/nearbyme/interactor/GetMerchantReviewSummary$Param;", "continuation", "Lkotlin/coroutines/Continuation;", "Lid/dana/domain/social/Result;", "Lid/dana/domain/nearbyme/model/MerchantReviewSummary;"}, k = 3, mv = {1, 4, 2})
    @DebugMetadata(c = "id.dana.domain.nearbyme.interactor.GetMerchantReviewSummary", f = "GetMerchantReviewSummary.kt", i = {}, l = {34}, m = "buildUseCase", n = {}, s = {})
    static final class getMin extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ isOutOfTime this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        getMin(isOutOfTime isoutoftime, Continuation continuation) {
            super(continuation);
            this.this$0 = isoutoftime;
        }

        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.buildUseCase((setMax) null, (Continuation<? super forThisDevice<containCachePath>>) this);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public isOutOfTime(@NotNull setStorageProxy setstorageproxy) {
        super((APExpansion.AnonymousClass1) null, (APExpansion.AnonymousClass1) null, 3, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(setstorageproxy, "merchantInfoRepository");
        this.merchantInfoRepository = setstorageproxy;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lid/dana/domain/nearbyme/interactor/GetMerchantReviewSummary$Param;", "", "merchantId", "", "shopId", "(Ljava/lang/String;Ljava/lang/String;)V", "getMerchantId", "()Ljava/lang/String;", "getShopId", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "domain_release"}, k = 1, mv = {1, 4, 2})
    public static final class setMax {
        @NotNull
        private final String merchantId;
        @NotNull
        private final String shopId;

        public static /* synthetic */ setMax copy$default(setMax setmax, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = setmax.merchantId;
            }
            if ((i & 2) != 0) {
                str2 = setmax.shopId;
            }
            return setmax.copy(str, str2);
        }

        @NotNull
        public final String component1() {
            return this.merchantId;
        }

        @NotNull
        public final String component2() {
            return this.shopId;
        }

        @NotNull
        public final setMax copy(@NotNull String str, @NotNull String str2) {
            Intrinsics.checkNotNullParameter(str, "merchantId");
            Intrinsics.checkNotNullParameter(str2, FeatureParams.SHOP_ID);
            return new setMax(str, str2);
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof setMax)) {
                return false;
            }
            setMax setmax = (setMax) obj;
            return Intrinsics.areEqual((Object) this.merchantId, (Object) setmax.merchantId) && Intrinsics.areEqual((Object) this.shopId, (Object) setmax.shopId);
        }

        public final int hashCode() {
            String str = this.merchantId;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.shopId;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return hashCode + i;
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("Param(merchantId=");
            sb.append(this.merchantId);
            sb.append(", shopId=");
            sb.append(this.shopId);
            sb.append(")");
            return sb.toString();
        }

        public setMax(@NotNull String str, @NotNull String str2) {
            Intrinsics.checkNotNullParameter(str, "merchantId");
            Intrinsics.checkNotNullParameter(str2, FeatureParams.SHOP_ID);
            this.merchantId = str;
            this.shopId = str2;
        }

        @NotNull
        public final String getMerchantId() {
            return this.merchantId;
        }

        @NotNull
        public final String getShopId() {
            return this.shopId;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    @org.jetbrains.annotations.Nullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object buildUseCase(@org.jetbrains.annotations.NotNull o.isOutOfTime.setMax r5, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super o.forThisDevice<o.containCachePath>> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof o.isOutOfTime.getMin
            if (r0 == 0) goto L_0x0014
            r0 = r6
            o.isOutOfTime$getMin r0 = (o.isOutOfTime.getMin) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L_0x0014
            int r6 = r0.label
            int r6 = r6 - r2
            r0.label = r6
            goto L_0x0019
        L_0x0014:
            o.isOutOfTime$getMin r0 = new o.isOutOfTime$getMin
            r0.<init>(r4, r6)
        L_0x0019:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0032
            if (r2 != r3) goto L_0x002a
            kotlin.ResultKt.throwOnFailure(r6)
            goto L_0x0048
        L_0x002a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0032:
            kotlin.ResultKt.throwOnFailure(r6)
            o.setStorageProxy r6 = r4.merchantInfoRepository
            java.lang.String r2 = r5.getMerchantId()
            java.lang.String r5 = r5.getShopId()
            r0.label = r3
            java.lang.Object r6 = r6.getMerchantReviewSummary(r2, r5, r0)
            if (r6 != r1) goto L_0x0048
            return r1
        L_0x0048:
            o.forThisDevice$setMax r5 = new o.forThisDevice$setMax
            r5.<init>(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: o.isOutOfTime.buildUseCase(o.isOutOfTime$setMax, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
