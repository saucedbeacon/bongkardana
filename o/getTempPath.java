package o;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.FileCache;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B/\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0002\u0010\bJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003J3\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\"\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\n\"\u0004\b\u0012\u0010\f¨\u0006\u001d"}, d2 = {"Lid/dana/domain/nearbyme/model/NearbyShopsPromo;", "", "merchantId", "", "shopId", "promoInfos", "", "Lid/dana/domain/nearbyme/model/PromoInfo;", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getMerchantId", "()Ljava/lang/String;", "setMerchantId", "(Ljava/lang/String;)V", "getPromoInfos", "()Ljava/util/List;", "setPromoInfos", "(Ljava/util/List;)V", "getShopId", "setShopId", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class getTempPath {
    @Nullable
    private String merchantId;
    @Nullable
    private List<FileCache.AnonymousClass1> promoInfos;
    @Nullable
    private String shopId;

    public getTempPath() {
        this((String) null, (String) null, (List) null, 7, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ getTempPath copy$default(getTempPath gettemppath, String str, String str2, List<FileCache.AnonymousClass1> list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = gettemppath.merchantId;
        }
        if ((i & 2) != 0) {
            str2 = gettemppath.shopId;
        }
        if ((i & 4) != 0) {
            list = gettemppath.promoInfos;
        }
        return gettemppath.copy(str, str2, list);
    }

    @Nullable
    public final String component1() {
        return this.merchantId;
    }

    @Nullable
    public final String component2() {
        return this.shopId;
    }

    @Nullable
    public final List<FileCache.AnonymousClass1> component3() {
        return this.promoInfos;
    }

    @NotNull
    public final getTempPath copy(@Nullable String str, @Nullable String str2, @Nullable List<FileCache.AnonymousClass1> list) {
        return new getTempPath(str, str2, list);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getTempPath)) {
            return false;
        }
        getTempPath gettemppath = (getTempPath) obj;
        return Intrinsics.areEqual((Object) this.merchantId, (Object) gettemppath.merchantId) && Intrinsics.areEqual((Object) this.shopId, (Object) gettemppath.shopId) && Intrinsics.areEqual((Object) this.promoInfos, (Object) gettemppath.promoInfos);
    }

    public final int hashCode() {
        String str = this.merchantId;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.shopId;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        List<FileCache.AnonymousClass1> list = this.promoInfos;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode2 + i;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("NearbyShopsPromo(merchantId=");
        sb.append(this.merchantId);
        sb.append(", shopId=");
        sb.append(this.shopId);
        sb.append(", promoInfos=");
        sb.append(this.promoInfos);
        sb.append(")");
        return sb.toString();
    }

    public getTempPath(@Nullable String str, @Nullable String str2, @Nullable List<FileCache.AnonymousClass1> list) {
        this.merchantId = str;
        this.shopId = str2;
        this.promoInfos = list;
    }

    @Nullable
    public final String getMerchantId() {
        return this.merchantId;
    }

    public final void setMerchantId(@Nullable String str) {
        this.merchantId = str;
    }

    @Nullable
    public final String getShopId() {
        return this.shopId;
    }

    public final void setShopId(@Nullable String str) {
        this.shopId = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ getTempPath(String str, String str2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? CollectionsKt.emptyList() : list);
    }

    @Nullable
    public final List<FileCache.AnonymousClass1> getPromoInfos() {
        return this.promoInfos;
    }

    public final void setPromoInfos(@Nullable List<FileCache.AnonymousClass1> list) {
        this.promoInfos = list;
    }
}
