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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000bB\u000f\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u001f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\b2\u0006\u0010\t\u001a\u00020\u0002H@ø\u0001\u0000¢\u0006\u0002\u0010\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, d2 = {"Lid/dana/domain/nearbyme/interactor/GetMerchantInfo;", "Lid/dana/domain/social/core/SingleUseCase;", "Lid/dana/domain/nearbyme/interactor/GetMerchantInfo$Params;", "Lid/dana/domain/nearbyme/model/Shop;", "merchantInfoRepository", "Lid/dana/domain/nearbyme/MerchantInfoRepository;", "(Lid/dana/domain/nearbyme/MerchantInfoRepository;)V", "buildUseCase", "Lid/dana/domain/social/Result;", "params", "(Lid/dana/domain/nearbyme/interactor/GetMerchantInfo$Params;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Params", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class isValid extends buildModelMapWithLock<getMin, GriverConfigUtils> {
    private final setStorageProxy merchantInfoRepository;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005H@"}, d2 = {"buildUseCase", "", "params", "Lid/dana/domain/nearbyme/interactor/GetMerchantInfo$Params;", "continuation", "Lkotlin/coroutines/Continuation;", "Lid/dana/domain/social/Result;", "Lid/dana/domain/nearbyme/model/Shop;"}, k = 3, mv = {1, 4, 2})
    @DebugMetadata(c = "id.dana.domain.nearbyme.interactor.GetMerchantInfo", f = "GetMerchantInfo.kt", i = {}, l = {26}, m = "buildUseCase", n = {}, s = {})
    static final class setMax extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ isValid this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        setMax(isValid isvalid, Continuation continuation) {
            super(continuation);
            this.this$0 = isvalid;
        }

        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.buildUseCase((getMin) null, (Continuation<? super forThisDevice<GriverConfigUtils>>) this);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public isValid(@NotNull setStorageProxy setstorageproxy) {
        super((APExpansion.AnonymousClass1) null, (APExpansion.AnonymousClass1) null, 3, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(setstorageproxy, "merchantInfoRepository");
        this.merchantInfoRepository = setstorageproxy;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    @org.jetbrains.annotations.Nullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object buildUseCase(@org.jetbrains.annotations.NotNull o.isValid.getMin r6, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super o.forThisDevice<o.GriverConfigUtils>> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof o.isValid.setMax
            if (r0 == 0) goto L_0x0014
            r0 = r7
            o.isValid$setMax r0 = (o.isValid.setMax) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L_0x0014
            int r7 = r0.label
            int r7 = r7 - r2
            r0.label = r7
            goto L_0x0019
        L_0x0014:
            o.isValid$setMax r0 = new o.isValid$setMax
            r0.<init>(r5, r7)
        L_0x0019:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0032
            if (r2 != r3) goto L_0x002a
            kotlin.ResultKt.throwOnFailure(r7)
            goto L_0x004c
        L_0x002a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0032:
            kotlin.ResultKt.throwOnFailure(r7)
            o.setStorageProxy r7 = r5.merchantInfoRepository
            java.lang.String r2 = r6.getMerchantId()
            java.lang.String r4 = r6.getShopId()
            boolean r6 = r6.getUseNewMerchantCategory()
            r0.label = r3
            java.lang.Object r7 = r7.getMerchantInfo(r2, r4, r6, r0)
            if (r7 != r1) goto L_0x004c
            return r1
        L_0x004c:
            o.forThisDevice$setMax r6 = new o.forThisDevice$setMax
            r6.<init>(r7)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: o.isValid.buildUseCase(o.isValid$getMin, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lid/dana/domain/nearbyme/interactor/GetMerchantInfo$Params;", "", "shopId", "", "merchantId", "useNewMerchantCategory", "", "(Ljava/lang/String;Ljava/lang/String;Z)V", "getMerchantId", "()Ljava/lang/String;", "getShopId", "getUseNewMerchantCategory", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "domain_release"}, k = 1, mv = {1, 4, 2})
    public static final class getMin {
        @NotNull
        private final String merchantId;
        @NotNull
        private final String shopId;
        private final boolean useNewMerchantCategory;

        public static /* synthetic */ getMin copy$default(getMin getmin, String str, String str2, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = getmin.shopId;
            }
            if ((i & 2) != 0) {
                str2 = getmin.merchantId;
            }
            if ((i & 4) != 0) {
                z = getmin.useNewMerchantCategory;
            }
            return getmin.copy(str, str2, z);
        }

        @NotNull
        public final String component1() {
            return this.shopId;
        }

        @NotNull
        public final String component2() {
            return this.merchantId;
        }

        public final boolean component3() {
            return this.useNewMerchantCategory;
        }

        @NotNull
        public final getMin copy(@NotNull String str, @NotNull String str2, boolean z) {
            Intrinsics.checkNotNullParameter(str, FeatureParams.SHOP_ID);
            Intrinsics.checkNotNullParameter(str2, "merchantId");
            return new getMin(str, str2, z);
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof getMin)) {
                return false;
            }
            getMin getmin = (getMin) obj;
            return Intrinsics.areEqual((Object) this.shopId, (Object) getmin.shopId) && Intrinsics.areEqual((Object) this.merchantId, (Object) getmin.merchantId) && this.useNewMerchantCategory == getmin.useNewMerchantCategory;
        }

        public final int hashCode() {
            String str = this.shopId;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.merchantId;
            if (str2 != null) {
                i = str2.hashCode();
            }
            int i2 = (hashCode + i) * 31;
            boolean z = this.useNewMerchantCategory;
            if (z) {
                z = true;
            }
            return i2 + (z ? 1 : 0);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("Params(shopId=");
            sb.append(this.shopId);
            sb.append(", merchantId=");
            sb.append(this.merchantId);
            sb.append(", useNewMerchantCategory=");
            sb.append(this.useNewMerchantCategory);
            sb.append(")");
            return sb.toString();
        }

        public getMin(@NotNull String str, @NotNull String str2, boolean z) {
            Intrinsics.checkNotNullParameter(str, FeatureParams.SHOP_ID);
            Intrinsics.checkNotNullParameter(str2, "merchantId");
            this.shopId = str;
            this.merchantId = str2;
            this.useNewMerchantCategory = z;
        }

        @NotNull
        public final String getShopId() {
            return this.shopId;
        }

        @NotNull
        public final String getMerchantId() {
            return this.merchantId;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ getMin(String str, String str2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i & 4) != 0 ? false : z);
        }

        public final boolean getUseNewMerchantCategory() {
            return this.useNewMerchantCategory;
        }
    }
}
