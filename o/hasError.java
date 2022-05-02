package o;

import id.dana.data.constant.BranchLinkConstant;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\nHÆ\u0003JO\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\n2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000f¨\u0006\""}, d2 = {"Lid/dana/nearbyme/merchantreview/model/MerchantReviewFormAnalyticModel;", "", "source", "", "merchantName", "merchantId", "shopName", "starsSubmitted", "tagsSubmitted", "hasReview", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getHasReview", "()Z", "getMerchantId", "()Ljava/lang/String;", "getMerchantName", "getShopName", "getSource", "getStarsSubmitted", "getTagsSubmitted", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class hasError {
    @NotNull
    public final String getMax;
    @NotNull
    public final String getMin;
    private final boolean isInside;
    @NotNull
    public final String length;
    @NotNull
    public final String setMax;
    @NotNull
    public final String setMin;
    @NotNull
    public final String toFloatRange;

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hasError)) {
            return false;
        }
        hasError haserror = (hasError) obj;
        return Intrinsics.areEqual((Object) this.setMin, (Object) haserror.setMin) && Intrinsics.areEqual((Object) this.getMin, (Object) haserror.getMin) && Intrinsics.areEqual((Object) this.getMax, (Object) haserror.getMax) && Intrinsics.areEqual((Object) this.setMax, (Object) haserror.setMax) && Intrinsics.areEqual((Object) this.length, (Object) haserror.length) && Intrinsics.areEqual((Object) this.toFloatRange, (Object) haserror.toFloatRange) && this.isInside == haserror.isInside;
    }

    public final int hashCode() {
        String str = this.setMin;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.getMin;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.getMax;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.setMax;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.length;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.toFloatRange;
        if (str6 != null) {
            i = str6.hashCode();
        }
        int i2 = (hashCode5 + i) * 31;
        boolean z = this.isInside;
        if (z) {
            z = true;
        }
        return i2 + (z ? 1 : 0);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("MerchantReviewFormAnalyticModel(source=");
        sb.append(this.setMin);
        sb.append(", merchantName=");
        sb.append(this.getMin);
        sb.append(", merchantId=");
        sb.append(this.getMax);
        sb.append(", shopName=");
        sb.append(this.setMax);
        sb.append(", starsSubmitted=");
        sb.append(this.length);
        sb.append(", tagsSubmitted=");
        sb.append(this.toFloatRange);
        sb.append(", hasReview=");
        sb.append(this.isInside);
        sb.append(")");
        return sb.toString();
    }

    public hasError(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, boolean z) {
        Intrinsics.checkNotNullParameter(str, "source");
        Intrinsics.checkNotNullParameter(str2, BranchLinkConstant.OauthParams.MERCHANT_NAME);
        Intrinsics.checkNotNullParameter(str3, "merchantId");
        Intrinsics.checkNotNullParameter(str4, "shopName");
        Intrinsics.checkNotNullParameter(str5, "starsSubmitted");
        Intrinsics.checkNotNullParameter(str6, "tagsSubmitted");
        this.setMin = str;
        this.getMin = str2;
        this.getMax = str3;
        this.setMax = str4;
        this.length = str5;
        this.toFloatRange = str6;
        this.isInside = z;
    }

    public final boolean getMin() {
        return this.isInside;
    }
}
