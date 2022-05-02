package o;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

public class GriverSecurity {
    private String loginId;
    private String loginIdType;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0007H&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, d2 = {"Lid/dana/domain/nearbyme/MerchantReviewFormRepository;", "", "getDismissedMerchantReview", "", "shopId", "", "getLastShownMerchantReviewShown", "", "saveDismissedMerchantReview", "saveLastTimeMerchantReviewShown", "lastTimeMerchantReviewShown", "domain_release"}, k = 1, mv = {1, 4, 2})
    /* renamed from: o.GriverSecurity$1  reason: invalid class name */
    public interface AnonymousClass1 {
        boolean getDismissedMerchantReview(@NotNull String str);

        long getLastShownMerchantReviewShown();

        boolean saveDismissedMerchantReview(@NotNull String str);

        boolean saveLastTimeMerchantReviewShown(long j);
    }

    public String getLoginId() {
        return this.loginId;
    }

    public void setLoginId(String str) {
        this.loginId = str;
    }

    public String getLoginIdType() {
        return this.loginIdType;
    }

    public void setLoginIdType(String str) {
        this.loginIdType = str;
    }
}
