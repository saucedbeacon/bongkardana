package o;

import com.alipayplus.mobile.component.domain.model.request.BaseRpcRequest;
import id.dana.contract.deeplink.path.FeatureParams;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\t¢\u0006\u0002\u0010\nJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0006HÆ\u0003J\u000f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00030\tHÆ\u0003JA\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\tHÆ\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$HÖ\u0003J\t\u0010%\u001a\u00020\u0006HÖ\u0001J\t\u0010&\u001a\u00020\u0003HÖ\u0001R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0007\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0014\"\u0004\b\u0018\u0010\u0016R\u001a\u0010\u0004\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0010\"\u0004\b\u001a\u0010\u0012¨\u0006'"}, d2 = {"Lid/dana/data/nearbyme/repository/source/network/request/merchantdetail/MerchantQueryReviewRequest;", "Lcom/alipayplus/mobile/component/domain/model/request/BaseRpcRequest;", "merchantId", "", "shopId", "pageNum", "", "pageSize", "filterCriteria", "", "(Ljava/lang/String;Ljava/lang/String;IILjava/util/List;)V", "getFilterCriteria", "()Ljava/util/List;", "setFilterCriteria", "(Ljava/util/List;)V", "getMerchantId", "()Ljava/lang/String;", "setMerchantId", "(Ljava/lang/String;)V", "getPageNum", "()I", "setPageNum", "(I)V", "getPageSize", "setPageSize", "getShopId", "setShopId", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "toString", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class CreateParams extends BaseRpcRequest {
    @NotNull
    private List<String> filterCriteria;
    @NotNull
    private String merchantId;
    private int pageNum;
    private int pageSize;
    @NotNull
    private String shopId;

    public static /* synthetic */ CreateParams copy$default(CreateParams createParams, String str, String str2, int i, int i2, List<String> list, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = createParams.merchantId;
        }
        if ((i3 & 2) != 0) {
            str2 = createParams.shopId;
        }
        String str3 = str2;
        if ((i3 & 4) != 0) {
            i = createParams.pageNum;
        }
        int i4 = i;
        if ((i3 & 8) != 0) {
            i2 = createParams.pageSize;
        }
        int i5 = i2;
        if ((i3 & 16) != 0) {
            list = createParams.filterCriteria;
        }
        return createParams.copy(str, str3, i4, i5, list);
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

    @NotNull
    public final List<String> component5() {
        return this.filterCriteria;
    }

    @NotNull
    public final CreateParams copy(@NotNull String str, @NotNull String str2, int i, int i2, @NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(str, "merchantId");
        Intrinsics.checkNotNullParameter(str2, FeatureParams.SHOP_ID);
        Intrinsics.checkNotNullParameter(list, "filterCriteria");
        return new CreateParams(str, str2, i, i2, list);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CreateParams)) {
            return false;
        }
        CreateParams createParams = (CreateParams) obj;
        return Intrinsics.areEqual((Object) this.merchantId, (Object) createParams.merchantId) && Intrinsics.areEqual((Object) this.shopId, (Object) createParams.shopId) && this.pageNum == createParams.pageNum && this.pageSize == createParams.pageSize && Intrinsics.areEqual((Object) this.filterCriteria, (Object) createParams.filterCriteria);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("MerchantQueryReviewRequest(merchantId=");
        sb.append(this.merchantId);
        sb.append(", shopId=");
        sb.append(this.shopId);
        sb.append(", pageNum=");
        sb.append(this.pageNum);
        sb.append(", pageSize=");
        sb.append(this.pageSize);
        sb.append(", filterCriteria=");
        sb.append(this.filterCriteria);
        sb.append(")");
        return sb.toString();
    }

    @NotNull
    public final String getMerchantId() {
        return this.merchantId;
    }

    public final void setMerchantId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.merchantId = str;
    }

    @NotNull
    public final String getShopId() {
        return this.shopId;
    }

    public final void setShopId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.shopId = str;
    }

    public final int getPageNum() {
        return this.pageNum;
    }

    public final void setPageNum(int i) {
        this.pageNum = i;
    }

    public final int getPageSize() {
        return this.pageSize;
    }

    public final void setPageSize(int i) {
        this.pageSize = i;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CreateParams(String str, String str2, int i, int i2, List list, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i3 & 4) != 0 ? 1 : i, (i3 & 8) != 0 ? 10 : i2, (i3 & 16) != 0 ? CollectionsKt.emptyList() : list);
    }

    @NotNull
    public final List<String> getFilterCriteria() {
        return this.filterCriteria;
    }

    public final void setFilterCriteria(@NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.filterCriteria = list;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J3\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u001a"}, d2 = {"Lid/dana/data/nearbyme/repository/source/network/request/merchantdetail/MerchantPromoDanaDealRequest;", "Lcom/alipayplus/mobile/component/domain/model/request/BaseRpcRequest;", "merchantId", "", "shopId", "pageNum", "", "pageSize", "(Ljava/lang/String;Ljava/lang/String;II)V", "getMerchantId", "()Ljava/lang/String;", "getPageNum", "()I", "getPageSize", "getShopId", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "toString", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
    /* renamed from: o.CreateParams$1  reason: invalid class name */
    public final class AnonymousClass1 extends BaseRpcRequest {
        @NotNull
        private final String merchantId;
        private final int pageNum;
        private final int pageSize;
        @Nullable
        private final String shopId;

        public static /* synthetic */ AnonymousClass1 copy$default(AnonymousClass1 r0, String str, String str2, int i, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                str = r0.merchantId;
            }
            if ((i3 & 2) != 0) {
                str2 = r0.shopId;
            }
            if ((i3 & 4) != 0) {
                i = r0.pageNum;
            }
            if ((i3 & 8) != 0) {
                i2 = r0.pageSize;
            }
            return r0.copy(str, str2, i, i2);
        }

        @NotNull
        public final String component1() {
            return this.merchantId;
        }

        @Nullable
        public final String component2() {
            return this.shopId;
        }

        public final int component3() {
            return this.pageNum;
        }

        public final int component4() {
            return this.pageSize;
        }

        @NotNull
        public final AnonymousClass1 copy(@NotNull String str, @Nullable String str2, int i, int i2) {
            Intrinsics.checkNotNullParameter(str, "merchantId");
            return new AnonymousClass1(str, str2, i, i2);
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AnonymousClass1)) {
                return false;
            }
            AnonymousClass1 r3 = (AnonymousClass1) obj;
            return Intrinsics.areEqual((Object) this.merchantId, (Object) r3.merchantId) && Intrinsics.areEqual((Object) this.shopId, (Object) r3.shopId) && this.pageNum == r3.pageNum && this.pageSize == r3.pageSize;
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("MerchantPromoDanaDealRequest(merchantId=");
            sb.append(this.merchantId);
            sb.append(", shopId=");
            sb.append(this.shopId);
            sb.append(", pageNum=");
            sb.append(this.pageNum);
            sb.append(", pageSize=");
            sb.append(this.pageSize);
            sb.append(")");
            return sb.toString();
        }

        @NotNull
        public final String getMerchantId() {
            return this.merchantId;
        }

        @Nullable
        public final String getShopId() {
            return this.shopId;
        }

        public final int getPageNum() {
            return this.pageNum;
        }

        public final int getPageSize() {
            return this.pageSize;
        }

        {
            Intrinsics.checkNotNullParameter(r2, "merchantId");
            this.merchantId = r2;
            this.shopId = r3;
            this.pageNum = r4;
            this.pageSize = r5;
        }

        public final int hashCode() {
            String str = this.merchantId;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.shopId;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return ((((hashCode + i) * 31) + Integer.valueOf(this.pageNum).hashCode()) * 31) + Integer.valueOf(this.pageSize).hashCode();
        }
    }

    public CreateParams(@NotNull String str, @NotNull String str2, int i, int i2, @NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(str, "merchantId");
        Intrinsics.checkNotNullParameter(str2, FeatureParams.SHOP_ID);
        Intrinsics.checkNotNullParameter(list, "filterCriteria");
        this.merchantId = str;
        this.shopId = str2;
        this.pageNum = i;
        this.pageSize = i2;
        this.filterCriteria = list;
    }

    public final int hashCode() {
        String str = this.merchantId;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.shopId;
        int hashCode2 = (((((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + Integer.valueOf(this.pageNum).hashCode()) * 31) + Integer.valueOf(this.pageSize).hashCode()) * 31;
        List<String> list = this.filterCriteria;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode2 + i;
    }
}
