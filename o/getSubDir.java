package o;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00032\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0017"}, d2 = {"Lid/dana/domain/nearbyme/model/MerchantReviews;", "", "hasMore", "", "reviews", "", "Lid/dana/domain/nearbyme/model/MerchantReview;", "(ZLjava/util/List;)V", "getHasMore", "()Z", "getReviews", "()Ljava/util/List;", "setReviews", "(Ljava/util/List;)V", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class getSubDir {
    private final boolean hasMore;
    @NotNull
    private List<FileCache> reviews;

    public static /* synthetic */ getSubDir copy$default(getSubDir getsubdir, boolean z, List<FileCache> list, int i, Object obj) {
        if ((i & 1) != 0) {
            z = getsubdir.hasMore;
        }
        if ((i & 2) != 0) {
            list = getsubdir.reviews;
        }
        return getsubdir.copy(z, list);
    }

    public final boolean component1() {
        return this.hasMore;
    }

    @NotNull
    public final List<FileCache> component2() {
        return this.reviews;
    }

    @NotNull
    public final getSubDir copy(boolean z, @NotNull List<FileCache> list) {
        Intrinsics.checkNotNullParameter(list, "reviews");
        return new getSubDir(z, list);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getSubDir)) {
            return false;
        }
        getSubDir getsubdir = (getSubDir) obj;
        return this.hasMore == getsubdir.hasMore && Intrinsics.areEqual((Object) this.reviews, (Object) getsubdir.reviews);
    }

    public final int hashCode() {
        boolean z = this.hasMore;
        if (z) {
            z = true;
        }
        int i = (z ? 1 : 0) * true;
        List<FileCache> list = this.reviews;
        return i + (list != null ? list.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("MerchantReviews(hasMore=");
        sb.append(this.hasMore);
        sb.append(", reviews=");
        sb.append(this.reviews);
        sb.append(")");
        return sb.toString();
    }

    public getSubDir(boolean z, @NotNull List<FileCache> list) {
        Intrinsics.checkNotNullParameter(list, "reviews");
        this.hasMore = z;
        this.reviews = list;
    }

    public final boolean getHasMore() {
        return this.hasMore;
    }

    @NotNull
    public final List<FileCache> getReviews() {
        return this.reviews;
    }

    public final void setReviews(@NotNull List<FileCache> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.reviews = list;
    }
}
