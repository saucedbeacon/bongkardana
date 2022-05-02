package o;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.OptionMenuRecyclerAdapter;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0007HÆ\u0003J)\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001J\u0006\u0010\u0017\u001a\u00020\u0014J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, d2 = {"Lid/dana/nearbyme/merchantdetail/model/MerchantReviewSummaryModel;", "", "rating", "", "numberOfReviews", "", "userReview", "Lid/dana/nearbyme/merchantdetail/model/MerchantReviewModel;", "(FILid/dana/nearbyme/merchantdetail/model/MerchantReviewModel;)V", "getNumberOfReviews", "()I", "getRating", "()F", "getUserReview", "()Lid/dana/nearbyme/merchantdetail/model/MerchantReviewModel;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "isUserReviewExist", "toString", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class onStateChange {
    public final int getMax;
    @Nullable
    public final OptionMenuRecyclerAdapter.OptionMenuViewHolder.AnonymousClass1 getMin;
    public final float setMin;

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof onStateChange)) {
            return false;
        }
        onStateChange onstatechange = (onStateChange) obj;
        return Float.compare(this.setMin, onstatechange.setMin) == 0 && this.getMax == onstatechange.getMax && Intrinsics.areEqual((Object) this.getMin, (Object) onstatechange.getMin);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("MerchantReviewSummaryModel(rating=");
        sb.append(this.setMin);
        sb.append(", numberOfReviews=");
        sb.append(this.getMax);
        sb.append(", userReview=");
        sb.append(this.getMin);
        sb.append(")");
        return sb.toString();
    }

    public onStateChange(float f, int i, @Nullable OptionMenuRecyclerAdapter.OptionMenuViewHolder.AnonymousClass1 r3) {
        this.setMin = f;
        this.getMax = i;
        this.getMin = r3;
    }

    public final boolean setMin() {
        OptionMenuRecyclerAdapter.OptionMenuViewHolder.AnonymousClass1 r0 = this.getMin;
        if (r0 != null) {
            if (r0.getMax.length() > 0) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = ((Float.valueOf(this.setMin).hashCode() * 31) + Integer.valueOf(this.getMax).hashCode()) * 31;
        OptionMenuRecyclerAdapter.OptionMenuViewHolder.AnonymousClass1 r1 = this.getMin;
        return hashCode + (r1 != null ? r1.hashCode() : 0);
    }
}
