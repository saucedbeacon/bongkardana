package o;

import id.dana.nearbyme.merchantreview.model.MerchantReviewTagModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0002¢\u0006\u0002\u0010\u0002\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lid/dana/nearbyme/merchantreview/model/SentimentState;", "", "()V", "Negative", "Positive", "Lid/dana/nearbyme/merchantreview/model/SentimentState$Positive;", "Lid/dana/nearbyme/merchantreview/model/SentimentState$Negative;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public abstract class GriverWebChromeClientExtension {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lid/dana/nearbyme/merchantreview/model/SentimentState$Positive;", "Lid/dana/nearbyme/merchantreview/model/SentimentState;", "positiveTags", "", "Lid/dana/nearbyme/merchantreview/model/MerchantReviewTagModel;", "(Ljava/util/List;)V", "getPositiveTags", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMin extends GriverWebChromeClientExtension {
        @NotNull
        public final List<MerchantReviewTagModel> setMin;

        public final boolean equals(@Nullable Object obj) {
            if (this != obj) {
                return (obj instanceof getMin) && Intrinsics.areEqual((Object) this.setMin, (Object) ((getMin) obj).setMin);
            }
            return true;
        }

        public final int hashCode() {
            List<MerchantReviewTagModel> list = this.setMin;
            if (list != null) {
                return list.hashCode();
            }
            return 0;
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("Positive(positiveTags=");
            sb.append(this.setMin);
            sb.append(")");
            return sb.toString();
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public getMin(@NotNull List<MerchantReviewTagModel> list) {
            super((byte) 0);
            Intrinsics.checkNotNullParameter(list, "positiveTags");
            this.setMin = list;
        }
    }

    private GriverWebChromeClientExtension() {
    }

    public /* synthetic */ GriverWebChromeClientExtension(byte b) {
        this();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lid/dana/nearbyme/merchantreview/model/SentimentState$Negative;", "Lid/dana/nearbyme/merchantreview/model/SentimentState;", "negativeTags", "", "Lid/dana/nearbyme/merchantreview/model/MerchantReviewTagModel;", "(Ljava/util/List;)V", "getNegativeTags", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class length extends GriverWebChromeClientExtension {
        @NotNull
        public final List<MerchantReviewTagModel> setMin;

        public final boolean equals(@Nullable Object obj) {
            if (this != obj) {
                return (obj instanceof length) && Intrinsics.areEqual((Object) this.setMin, (Object) ((length) obj).setMin);
            }
            return true;
        }

        public final int hashCode() {
            List<MerchantReviewTagModel> list = this.setMin;
            if (list != null) {
                return list.hashCode();
            }
            return 0;
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("Negative(negativeTags=");
            sb.append(this.setMin);
            sb.append(")");
            return sb.toString();
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public length(@NotNull List<MerchantReviewTagModel> list) {
            super((byte) 0);
            Intrinsics.checkNotNullParameter(list, "negativeTags");
            this.setMin = list;
        }
    }
}
