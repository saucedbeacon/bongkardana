package o;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J.\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001¢\u0006\u0002\u0010\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0018"}, d2 = {"Lid/dana/domain/nearbyme/model/NearbyRankingConfig;", "", "radius", "", "rating", "review", "(Ljava/lang/Integer;II)V", "getRadius", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getRating", "()I", "getReview", "component1", "component2", "component3", "copy", "(Ljava/lang/Integer;II)Lid/dana/domain/nearbyme/model/NearbyRankingConfig;", "equals", "", "other", "hashCode", "toString", "", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class clearTempPath {
    @Nullable
    private final Integer radius;
    private final int rating;
    private final int review;

    public static /* synthetic */ clearTempPath copy$default(clearTempPath cleartemppath, Integer num, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            num = cleartemppath.radius;
        }
        if ((i3 & 2) != 0) {
            i = cleartemppath.rating;
        }
        if ((i3 & 4) != 0) {
            i2 = cleartemppath.review;
        }
        return cleartemppath.copy(num, i, i2);
    }

    @Nullable
    public final Integer component1() {
        return this.radius;
    }

    public final int component2() {
        return this.rating;
    }

    public final int component3() {
        return this.review;
    }

    @NotNull
    public final clearTempPath copy(@Nullable Integer num, int i, int i2) {
        return new clearTempPath(num, i, i2);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof clearTempPath)) {
            return false;
        }
        clearTempPath cleartemppath = (clearTempPath) obj;
        return Intrinsics.areEqual((Object) this.radius, (Object) cleartemppath.radius) && this.rating == cleartemppath.rating && this.review == cleartemppath.review;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("NearbyRankingConfig(radius=");
        sb.append(this.radius);
        sb.append(", rating=");
        sb.append(this.rating);
        sb.append(", review=");
        sb.append(this.review);
        sb.append(")");
        return sb.toString();
    }

    public clearTempPath(@Nullable Integer num, int i, int i2) {
        this.radius = num;
        this.rating = i;
        this.review = i2;
    }

    @Nullable
    public final Integer getRadius() {
        return this.radius;
    }

    public final int getRating() {
        return this.rating;
    }

    public final int getReview() {
        return this.review;
    }

    public final int hashCode() {
        Integer num = this.radius;
        return ((((num != null ? num.hashCode() : 0) * 31) + Integer.valueOf(this.rating).hashCode()) * 31) + Integer.valueOf(this.review).hashCode();
    }
}
