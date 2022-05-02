package o;

import com.alipayplus.mobile.component.domain.model.result.BaseRpcResult;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\u0006\u0010\u0014\u001a\u00020\u0015J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0018"}, d2 = {"Lid/dana/data/nearbyme/repository/source/network/result/merchantdetail/MerchantQueryReviewResult;", "Lcom/alipayplus/mobile/component/domain/model/result/BaseRpcResult;", "hasMore", "", "reviews", "", "Lid/dana/data/nearbyme/model/MerchantReviewEntity;", "(ZLjava/util/List;)V", "getHasMore", "()Z", "getReviews", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toMerchantReviews", "Lid/dana/domain/nearbyme/model/MerchantReviews;", "toString", "", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class getParams extends BaseRpcResult {
    private final boolean hasMore;
    @NotNull
    private final List<RVEngine> reviews;

    public static /* synthetic */ getParams copy$default(getParams getparams, boolean z, List<RVEngine> list, int i, Object obj) {
        if ((i & 1) != 0) {
            z = getparams.hasMore;
        }
        if ((i & 2) != 0) {
            list = getparams.reviews;
        }
        return getparams.copy(z, list);
    }

    public final boolean component1() {
        return this.hasMore;
    }

    @NotNull
    public final List<RVEngine> component2() {
        return this.reviews;
    }

    @NotNull
    public final getParams copy(boolean z, @NotNull List<RVEngine> list) {
        Intrinsics.checkNotNullParameter(list, "reviews");
        return new getParams(z, list);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getParams)) {
            return false;
        }
        getParams getparams = (getParams) obj;
        return this.hasMore == getparams.hasMore && Intrinsics.areEqual((Object) this.reviews, (Object) getparams.reviews);
    }

    public final int hashCode() {
        boolean z = this.hasMore;
        if (z) {
            z = true;
        }
        int i = (z ? 1 : 0) * true;
        List<RVEngine> list = this.reviews;
        return i + (list != null ? list.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("MerchantQueryReviewResult(hasMore=");
        sb.append(this.hasMore);
        sb.append(", reviews=");
        sb.append(this.reviews);
        sb.append(")");
        return sb.toString();
    }

    public final boolean getHasMore() {
        return this.hasMore;
    }

    @NotNull
    public final List<RVEngine> getReviews() {
        return this.reviews;
    }

    public getParams(boolean z, @NotNull List<RVEngine> list) {
        Intrinsics.checkNotNullParameter(list, "reviews");
        this.hasMore = z;
        this.reviews = list;
    }

    @NotNull
    public final getSubDir toMerchantReviews() {
        boolean z = this.hasMore;
        Iterable<RVEngine> iterable = this.reviews;
        Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
        for (RVEngine merchantReview : iterable) {
            arrayList.add(merchantReview.toMerchantReview());
        }
        return new getSubDir(z, (List) arrayList);
    }
}
