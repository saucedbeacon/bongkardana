package o;

import id.dana.contract.deeplink.path.FeatureParams;
import java.util.List;
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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001:\u0001\fB\u000f\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J%\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\t2\u0006\u0010\n\u001a\u00020\u0002H@ø\u0001\u0000¢\u0006\u0002\u0010\u000bR\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, d2 = {"Lid/dana/domain/nearbyme/interactor/GetMerchantDanaDeals;", "Lid/dana/domain/social/core/SingleUseCase;", "Lid/dana/domain/nearbyme/interactor/GetMerchantDanaDeals$Params;", "", "Lid/dana/domain/nearbyme/model/MerchantProductInfo;", "merchantInfoRepository", "Lid/dana/domain/nearbyme/MerchantInfoRepository;", "(Lid/dana/domain/nearbyme/MerchantInfoRepository;)V", "buildUseCase", "Lid/dana/domain/social/Result;", "params", "(Lid/dana/domain/nearbyme/interactor/GetMerchantDanaDeals$Params;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Params", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class AndroidVersionUtils extends buildModelMapWithLock<setMax, List<? extends mediaMounted>> {
    private final setStorageProxy merchantInfoRepository;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0018\u0010\u0004\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00060\u0005H@"}, d2 = {"buildUseCase", "", "params", "Lid/dana/domain/nearbyme/interactor/GetMerchantDanaDeals$Params;", "continuation", "Lkotlin/coroutines/Continuation;", "Lid/dana/domain/social/Result;", "", "Lid/dana/domain/nearbyme/model/MerchantProductInfo;"}, k = 3, mv = {1, 4, 2})
    @DebugMetadata(c = "id.dana.domain.nearbyme.interactor.GetMerchantDanaDeals", f = "GetMerchantDanaDeals.kt", i = {}, l = {35}, m = "buildUseCase", n = {}, s = {})
    static final class setMin extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ AndroidVersionUtils this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        setMin(AndroidVersionUtils androidVersionUtils, Continuation continuation) {
            super(continuation);
            this.this$0 = androidVersionUtils;
        }

        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.buildUseCase((setMax) null, (Continuation<? super forThisDevice<? extends List<mediaMounted>>>) this);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public AndroidVersionUtils(@NotNull setStorageProxy setstorageproxy) {
        super((APExpansion.AnonymousClass1) null, (APExpansion.AnonymousClass1) null, 3, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(setstorageproxy, "merchantInfoRepository");
        this.merchantInfoRepository = setstorageproxy;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lid/dana/domain/nearbyme/interactor/GetMerchantDanaDeals$Params;", "", "merchantId", "", "shopId", "(Ljava/lang/String;Ljava/lang/String;)V", "getMerchantId", "()Ljava/lang/String;", "getShopId", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "domain_release"}, k = 1, mv = {1, 4, 2})
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
            StringBuilder sb = new StringBuilder("Params(merchantId=");
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

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    @org.jetbrains.annotations.Nullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object buildUseCase(@org.jetbrains.annotations.NotNull o.AndroidVersionUtils.setMax r10, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super o.forThisDevice<? extends java.util.List<o.mediaMounted>>> r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof o.AndroidVersionUtils.setMin
            if (r0 == 0) goto L_0x0014
            r0 = r11
            o.AndroidVersionUtils$setMin r0 = (o.AndroidVersionUtils.setMin) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L_0x0014
            int r11 = r0.label
            int r11 = r11 - r2
            r0.label = r11
            goto L_0x0019
        L_0x0014:
            o.AndroidVersionUtils$setMin r0 = new o.AndroidVersionUtils$setMin
            r0.<init>(r9, r11)
        L_0x0019:
            r6 = r0
            java.lang.Object r11 = r6.result
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r6.label
            r2 = 1
            if (r1 == 0) goto L_0x0033
            if (r1 != r2) goto L_0x002b
            kotlin.ResultKt.throwOnFailure(r11)
            goto L_0x004f
        L_0x002b:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x0033:
            kotlin.ResultKt.throwOnFailure(r11)
            o.setStorageProxy r1 = r9.merchantInfoRepository
            java.lang.String r11 = r10.getMerchantId()
            java.lang.String r3 = r10.getShopId()
            r4 = 0
            r5 = 0
            r7 = 12
            r8 = 0
            r6.label = r2
            r2 = r11
            java.lang.Object r11 = o.GriverKVSpStorage.getMerchantPromoDanaDeal$default(r1, r2, r3, r4, r5, r6, r7, r8)
            if (r11 != r0) goto L_0x004f
            return r0
        L_0x004f:
            o.forThisDevice$setMax r10 = new o.forThisDevice$setMax
            r10.<init>(r11)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: o.AndroidVersionUtils.buildUseCase(o.AndroidVersionUtils$setMax, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
