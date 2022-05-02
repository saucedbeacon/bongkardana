package o;

import id.dana.contract.deeplink.path.FeatureParams;
import id.dana.domain.nearbyme.DefaultDispatcher;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.APExpansion;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001:\u0001\u000eB\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0001\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\"\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\f0\u000b2\u0006\u0010\r\u001a\u00020\u0002H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lid/dana/domain/nearbyme/interactor/GetMerchantImage;", "Lid/dana/domain/core/usecase/FlowUseCase;", "Lid/dana/domain/nearbyme/interactor/GetMerchantImage$Param;", "", "Lid/dana/domain/nearbyme/model/MerchantImage;", "merchantInfoRepository", "Lid/dana/domain/nearbyme/MerchantInfoRepository;", "defaultDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "(Lid/dana/domain/nearbyme/MerchantInfoRepository;Lkotlinx/coroutines/CoroutineDispatcher;)V", "execute", "Lkotlinx/coroutines/flow/Flow;", "Lid/dana/domain/social/Result;", "params", "Param", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class isRAndAbove extends onHideCustomView<getMin, List<? extends getUtdid>> {
    private final setStorageProxy merchantInfoRepository;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public isRAndAbove(@NotNull setStorageProxy setstorageproxy, @NotNull @DefaultDispatcher APExpansion.AnonymousClass1 r3) {
        super(r3);
        Intrinsics.checkNotNullParameter(setstorageproxy, "merchantInfoRepository");
        Intrinsics.checkNotNullParameter(r3, "defaultDispatcher");
        this.merchantInfoRepository = setstorageproxy;
    }

    @NotNull
    public final onWebsocketHandshakeSentAsClient<forThisDevice<List<getUtdid>>> execute(@NotNull getMin getmin) {
        Intrinsics.checkNotNullParameter(getmin, "params");
        return this.merchantInfoRepository.getMerchantImage(getmin.getMerchantId(), getmin.getShopId(), getmin.getPageNum(), getmin.getPageSize(), getmin.getSkipCache());
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0014\b\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0017\u001a\u00020\tHÆ\u0003J;\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\t2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u0006HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001d"}, d2 = {"Lid/dana/domain/nearbyme/interactor/GetMerchantImage$Param;", "", "merchantId", "", "shopId", "pageNum", "", "pageSize", "skipCache", "", "(Ljava/lang/String;Ljava/lang/String;IIZ)V", "getMerchantId", "()Ljava/lang/String;", "getPageNum", "()I", "getPageSize", "getShopId", "getSkipCache", "()Z", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "toString", "domain_release"}, k = 1, mv = {1, 4, 2})
    public static final class getMin {
        @NotNull
        private final String merchantId;
        private final int pageNum;
        private final int pageSize;
        @NotNull
        private final String shopId;
        private final boolean skipCache;

        public static /* synthetic */ getMin copy$default(getMin getmin, String str, String str2, int i, int i2, boolean z, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                str = getmin.merchantId;
            }
            if ((i3 & 2) != 0) {
                str2 = getmin.shopId;
            }
            String str3 = str2;
            if ((i3 & 4) != 0) {
                i = getmin.pageNum;
            }
            int i4 = i;
            if ((i3 & 8) != 0) {
                i2 = getmin.pageSize;
            }
            int i5 = i2;
            if ((i3 & 16) != 0) {
                z = getmin.skipCache;
            }
            return getmin.copy(str, str3, i4, i5, z);
        }

        @NotNull
        public final String component1() {
            return this.merchantId;
        }

        @NotNull
        public final String component2() {
            return this.shopId;
        }

        public final int component3() {
            return this.pageNum;
        }

        public final int component4() {
            return this.pageSize;
        }

        public final boolean component5() {
            return this.skipCache;
        }

        @NotNull
        public final getMin copy(@NotNull String str, @NotNull String str2, int i, int i2, boolean z) {
            Intrinsics.checkNotNullParameter(str, "merchantId");
            Intrinsics.checkNotNullParameter(str2, FeatureParams.SHOP_ID);
            return new getMin(str, str2, i, i2, z);
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof getMin)) {
                return false;
            }
            getMin getmin = (getMin) obj;
            return Intrinsics.areEqual((Object) this.merchantId, (Object) getmin.merchantId) && Intrinsics.areEqual((Object) this.shopId, (Object) getmin.shopId) && this.pageNum == getmin.pageNum && this.pageSize == getmin.pageSize && this.skipCache == getmin.skipCache;
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("Param(merchantId=");
            sb.append(this.merchantId);
            sb.append(", shopId=");
            sb.append(this.shopId);
            sb.append(", pageNum=");
            sb.append(this.pageNum);
            sb.append(", pageSize=");
            sb.append(this.pageSize);
            sb.append(", skipCache=");
            sb.append(this.skipCache);
            sb.append(")");
            return sb.toString();
        }

        public getMin(@NotNull String str, @NotNull String str2, int i, int i2, boolean z) {
            Intrinsics.checkNotNullParameter(str, "merchantId");
            Intrinsics.checkNotNullParameter(str2, FeatureParams.SHOP_ID);
            this.merchantId = str;
            this.shopId = str2;
            this.pageNum = i;
            this.pageSize = i2;
            this.skipCache = z;
        }

        @NotNull
        public final String getMerchantId() {
            return this.merchantId;
        }

        @NotNull
        public final String getShopId() {
            return this.shopId;
        }

        public final int getPageNum() {
            return this.pageNum;
        }

        public final int getPageSize() {
            return this.pageSize;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ getMin(String str, String str2, int i, int i2, boolean z, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i3 & 4) != 0 ? 1 : i, (i3 & 8) != 0 ? 10 : i2, (i3 & 16) != 0 ? false : z);
        }

        public final boolean getSkipCache() {
            return this.skipCache;
        }

        public final int hashCode() {
            String str = this.merchantId;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.shopId;
            if (str2 != null) {
                i = str2.hashCode();
            }
            int hashCode2 = (((((hashCode + i) * 31) + Integer.valueOf(this.pageNum).hashCode()) * 31) + Integer.valueOf(this.pageSize).hashCode()) * 31;
            boolean z = this.skipCache;
            if (z) {
                z = true;
            }
            return hashCode2 + (z ? 1 : 0);
        }
    }
}
