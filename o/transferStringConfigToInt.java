package o;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.FileCache;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B)\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007J\u0011\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003HÆ\u0003J-\u0010\r\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\t¨\u0006\u0015"}, d2 = {"Lid/dana/domain/nearbyme/model/PromoDealsInfo;", "", "promoInfo", "", "Lid/dana/domain/nearbyme/model/PromoInfo;", "dealsInfo", "Lid/dana/domain/nearbyme/model/MerchantProductInfo;", "(Ljava/util/List;Ljava/util/List;)V", "getDealsInfo", "()Ljava/util/List;", "getPromoInfo", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class transferStringConfigToInt {
    @Nullable
    private final List<mediaMounted> dealsInfo;
    @Nullable
    private final List<FileCache.AnonymousClass1> promoInfo;

    public transferStringConfigToInt() {
        this((List) null, (List) null, 3, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ transferStringConfigToInt copy$default(transferStringConfigToInt transferstringconfigtoint, List<FileCache.AnonymousClass1> list, List<mediaMounted> list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = transferstringconfigtoint.promoInfo;
        }
        if ((i & 2) != 0) {
            list2 = transferstringconfigtoint.dealsInfo;
        }
        return transferstringconfigtoint.copy(list, list2);
    }

    @Nullable
    public final List<FileCache.AnonymousClass1> component1() {
        return this.promoInfo;
    }

    @Nullable
    public final List<mediaMounted> component2() {
        return this.dealsInfo;
    }

    @NotNull
    public final transferStringConfigToInt copy(@Nullable List<FileCache.AnonymousClass1> list, @Nullable List<mediaMounted> list2) {
        return new transferStringConfigToInt(list, list2);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof transferStringConfigToInt)) {
            return false;
        }
        transferStringConfigToInt transferstringconfigtoint = (transferStringConfigToInt) obj;
        return Intrinsics.areEqual((Object) this.promoInfo, (Object) transferstringconfigtoint.promoInfo) && Intrinsics.areEqual((Object) this.dealsInfo, (Object) transferstringconfigtoint.dealsInfo);
    }

    public final int hashCode() {
        List<FileCache.AnonymousClass1> list = this.promoInfo;
        int i = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        List<mediaMounted> list2 = this.dealsInfo;
        if (list2 != null) {
            i = list2.hashCode();
        }
        return hashCode + i;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("PromoDealsInfo(promoInfo=");
        sb.append(this.promoInfo);
        sb.append(", dealsInfo=");
        sb.append(this.dealsInfo);
        sb.append(")");
        return sb.toString();
    }

    public transferStringConfigToInt(@Nullable List<FileCache.AnonymousClass1> list, @Nullable List<mediaMounted> list2) {
        this.promoInfo = list;
        this.dealsInfo = list2;
    }

    @Nullable
    public final List<FileCache.AnonymousClass1> getPromoInfo() {
        return this.promoInfo;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ transferStringConfigToInt(List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : list2);
    }

    @Nullable
    public final List<mediaMounted> getDealsInfo() {
        return this.dealsInfo;
    }
}
