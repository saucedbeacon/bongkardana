package o;

import com.alipayplus.mobile.component.domain.model.result.BaseRpcResult;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0007HÆ\u0003J)\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001J\u0006\u0010\u0018\u001a\u00020\u0019J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001c"}, d2 = {"Lid/dana/data/nearbyme/repository/source/network/result/merchantdetail/MerchantReviewSummaryResult;", "Lcom/alipayplus/mobile/component/domain/model/result/BaseRpcResult;", "rating", "", "numberOfReviews", "", "userReview", "Lid/dana/data/nearbyme/model/MerchantReviewEntity;", "(FILid/dana/data/nearbyme/model/MerchantReviewEntity;)V", "getNumberOfReviews", "()I", "getRating", "()F", "getUserReview", "()Lid/dana/data/nearbyme/model/MerchantReviewEntity;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "toMerchantReviewSummary", "Lid/dana/domain/nearbyme/model/MerchantReviewSummary;", "toString", "", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class newBuilder extends BaseRpcResult {
    private final int numberOfReviews;
    private final float rating;
    @Nullable
    private final RVEngine userReview;

    public static /* synthetic */ newBuilder copy$default(newBuilder newbuilder, float f, int i, RVEngine rVEngine, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f = newbuilder.rating;
        }
        if ((i2 & 2) != 0) {
            i = newbuilder.numberOfReviews;
        }
        if ((i2 & 4) != 0) {
            rVEngine = newbuilder.userReview;
        }
        return newbuilder.copy(f, i, rVEngine);
    }

    public final float component1() {
        return this.rating;
    }

    public final int component2() {
        return this.numberOfReviews;
    }

    @Nullable
    public final RVEngine component3() {
        return this.userReview;
    }

    @NotNull
    public final newBuilder copy(float f, int i, @Nullable RVEngine rVEngine) {
        return new newBuilder(f, i, rVEngine);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof newBuilder)) {
            return false;
        }
        newBuilder newbuilder = (newBuilder) obj;
        return Float.compare(this.rating, newbuilder.rating) == 0 && this.numberOfReviews == newbuilder.numberOfReviews && Intrinsics.areEqual((Object) this.userReview, (Object) newbuilder.userReview);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("MerchantReviewSummaryResult(rating=");
        sb.append(this.rating);
        sb.append(", numberOfReviews=");
        sb.append(this.numberOfReviews);
        sb.append(", userReview=");
        sb.append(this.userReview);
        sb.append(")");
        return sb.toString();
    }

    public final float getRating() {
        return this.rating;
    }

    public final int getNumberOfReviews() {
        return this.numberOfReviews;
    }

    @Nullable
    public final RVEngine getUserReview() {
        return this.userReview;
    }

    public newBuilder(float f, int i, @Nullable RVEngine rVEngine) {
        this.rating = f;
        this.numberOfReviews = i;
        this.userReview = rVEngine;
    }

    @NotNull
    public final containCachePath toMerchantReviewSummary() {
        float f = this.rating;
        int i = this.numberOfReviews;
        RVEngine rVEngine = this.userReview;
        return new containCachePath(f, i, rVEngine != null ? rVEngine.toMerchantReview() : null);
    }

    public final int hashCode() {
        int hashCode = ((Float.valueOf(this.rating).hashCode() * 31) + Integer.valueOf(this.numberOfReviews).hashCode()) * 31;
        RVEngine rVEngine = this.userReview;
        return hashCode + (rVEngine != null ? rVEngine.hashCode() : 0);
    }
}
