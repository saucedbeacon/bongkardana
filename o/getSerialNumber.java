package o;

import id.dana.contract.deeplink.path.FeatureParams;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0019\b\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007HÆ\u0003J\u000f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007HÆ\u0003J\u000f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\fHÆ\u0003Ja\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00072\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u00072\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001J\u0013\u0010!\u001a\u00020\f2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020\u0005HÖ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015¨\u0006%"}, d2 = {"Lid/dana/domain/nearbyme/model/MerchantCreateReview;", "", "review", "", "rating", "", "positiveTags", "", "negativeTags", "images", "shopId", "shareToFeed", "", "(Ljava/lang/String;ILjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Z)V", "getImages", "()Ljava/util/List;", "getNegativeTags", "getPositiveTags", "getRating", "()I", "getReview", "()Ljava/lang/String;", "getShareToFeed", "()Z", "getShopId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "toString", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class getSerialNumber {
    @NotNull
    private final List<String> images;
    @NotNull
    private final List<String> negativeTags;
    @NotNull
    private final List<String> positiveTags;
    private final int rating;
    @NotNull
    private final String review;
    private final boolean shareToFeed;
    @NotNull
    private final String shopId;

    public static /* synthetic */ getSerialNumber copy$default(getSerialNumber getserialnumber, String str, int i, List<String> list, List<String> list2, List<String> list3, String str2, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = getserialnumber.review;
        }
        if ((i2 & 2) != 0) {
            i = getserialnumber.rating;
        }
        int i3 = i;
        if ((i2 & 4) != 0) {
            list = getserialnumber.positiveTags;
        }
        List<String> list4 = list;
        if ((i2 & 8) != 0) {
            list2 = getserialnumber.negativeTags;
        }
        List<String> list5 = list2;
        if ((i2 & 16) != 0) {
            list3 = getserialnumber.images;
        }
        List<String> list6 = list3;
        if ((i2 & 32) != 0) {
            str2 = getserialnumber.shopId;
        }
        String str3 = str2;
        if ((i2 & 64) != 0) {
            z = getserialnumber.shareToFeed;
        }
        return getserialnumber.copy(str, i3, list4, list5, list6, str3, z);
    }

    @NotNull
    public final String component1() {
        return this.review;
    }

    public final int component2() {
        return this.rating;
    }

    @NotNull
    public final List<String> component3() {
        return this.positiveTags;
    }

    @NotNull
    public final List<String> component4() {
        return this.negativeTags;
    }

    @NotNull
    public final List<String> component5() {
        return this.images;
    }

    @NotNull
    public final String component6() {
        return this.shopId;
    }

    public final boolean component7() {
        return this.shareToFeed;
    }

    @NotNull
    public final getSerialNumber copy(@NotNull String str, int i, @NotNull List<String> list, @NotNull List<String> list2, @NotNull List<String> list3, @NotNull String str2, boolean z) {
        Intrinsics.checkNotNullParameter(str, "review");
        Intrinsics.checkNotNullParameter(list, "positiveTags");
        Intrinsics.checkNotNullParameter(list2, "negativeTags");
        Intrinsics.checkNotNullParameter(list3, "images");
        Intrinsics.checkNotNullParameter(str2, FeatureParams.SHOP_ID);
        return new getSerialNumber(str, i, list, list2, list3, str2, z);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getSerialNumber)) {
            return false;
        }
        getSerialNumber getserialnumber = (getSerialNumber) obj;
        return Intrinsics.areEqual((Object) this.review, (Object) getserialnumber.review) && this.rating == getserialnumber.rating && Intrinsics.areEqual((Object) this.positiveTags, (Object) getserialnumber.positiveTags) && Intrinsics.areEqual((Object) this.negativeTags, (Object) getserialnumber.negativeTags) && Intrinsics.areEqual((Object) this.images, (Object) getserialnumber.images) && Intrinsics.areEqual((Object) this.shopId, (Object) getserialnumber.shopId) && this.shareToFeed == getserialnumber.shareToFeed;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("MerchantCreateReview(review=");
        sb.append(this.review);
        sb.append(", rating=");
        sb.append(this.rating);
        sb.append(", positiveTags=");
        sb.append(this.positiveTags);
        sb.append(", negativeTags=");
        sb.append(this.negativeTags);
        sb.append(", images=");
        sb.append(this.images);
        sb.append(", shopId=");
        sb.append(this.shopId);
        sb.append(", shareToFeed=");
        sb.append(this.shareToFeed);
        sb.append(")");
        return sb.toString();
    }

    public getSerialNumber(@NotNull String str, int i, @NotNull List<String> list, @NotNull List<String> list2, @NotNull List<String> list3, @NotNull String str2, boolean z) {
        Intrinsics.checkNotNullParameter(str, "review");
        Intrinsics.checkNotNullParameter(list, "positiveTags");
        Intrinsics.checkNotNullParameter(list2, "negativeTags");
        Intrinsics.checkNotNullParameter(list3, "images");
        Intrinsics.checkNotNullParameter(str2, FeatureParams.SHOP_ID);
        this.review = str;
        this.rating = i;
        this.positiveTags = list;
        this.negativeTags = list2;
        this.images = list3;
        this.shopId = str2;
        this.shareToFeed = z;
    }

    @NotNull
    public final String getReview() {
        return this.review;
    }

    public final int getRating() {
        return this.rating;
    }

    @NotNull
    public final List<String> getPositiveTags() {
        return this.positiveTags;
    }

    @NotNull
    public final List<String> getNegativeTags() {
        return this.negativeTags;
    }

    @NotNull
    public final List<String> getImages() {
        return this.images;
    }

    @NotNull
    public final String getShopId() {
        return this.shopId;
    }

    public final boolean getShareToFeed() {
        return this.shareToFeed;
    }

    public final int hashCode() {
        String str = this.review;
        int i = 0;
        int hashCode = (((str != null ? str.hashCode() : 0) * 31) + Integer.valueOf(this.rating).hashCode()) * 31;
        List<String> list = this.positiveTags;
        int hashCode2 = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        List<String> list2 = this.negativeTags;
        int hashCode3 = (hashCode2 + (list2 != null ? list2.hashCode() : 0)) * 31;
        List<String> list3 = this.images;
        int hashCode4 = (hashCode3 + (list3 != null ? list3.hashCode() : 0)) * 31;
        String str2 = this.shopId;
        if (str2 != null) {
            i = str2.hashCode();
        }
        int i2 = (hashCode4 + i) * 31;
        boolean z = this.shareToFeed;
        if (z) {
            z = true;
        }
        return i2 + (z ? 1 : 0);
    }
}
