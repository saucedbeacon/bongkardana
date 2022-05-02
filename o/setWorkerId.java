package o;

import id.dana.contract.deeplink.path.FeatureParams;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o.BridgeResponse;
import o.GriverSecurity;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\bH\u0016J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\bH\u0016J\u0010\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0011H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u00020\b8BX\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lid/dana/data/nearbyme/repository/MerchantReviewFormEntityRepository;", "Lid/dana/domain/nearbyme/MerchantReviewFormRepository;", "merchantReviewEntityData", "Lid/dana/data/nearbyme/repository/source/local/PreferenceMerchantReviewFormEntityData;", "preferenceAccountEntityData", "Lid/dana/data/account/repository/source/preference/PreferenceAccountEntityData;", "(Lid/dana/data/nearbyme/repository/source/local/PreferenceMerchantReviewFormEntityData;Lid/dana/data/account/repository/source/preference/PreferenceAccountEntityData;)V", "phoneNumber", "", "getPhoneNumber", "()Ljava/lang/String;", "phoneNumber$delegate", "Lkotlin/Lazy;", "getDismissedMerchantReview", "", "shopId", "getLastShownMerchantReviewShown", "", "saveDismissedMerchantReview", "saveLastTimeMerchantReviewShown", "lastTimeMerchantReviewShown", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class setWorkerId implements GriverSecurity.AnonymousClass1 {
    private final BridgeResponse.NamedValue merchantReviewEntityData;
    private final Lazy phoneNumber$delegate = LazyKt.lazy(new getMax(this));
    /* access modifiers changed from: private */
    public final getFrameMarginVertical$core preferenceAccountEntityData;

    private final String getPhoneNumber() {
        return (String) this.phoneNumber$delegate.getValue();
    }

    @Inject
    public setWorkerId(@NotNull BridgeResponse.NamedValue namedValue, @NotNull getFrameMarginVertical$core getframemarginvertical_core) {
        Intrinsics.checkNotNullParameter(namedValue, "merchantReviewEntityData");
        Intrinsics.checkNotNullParameter(getframemarginvertical_core, "preferenceAccountEntityData");
        this.merchantReviewEntityData = namedValue;
        this.preferenceAccountEntityData = getframemarginvertical_core;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class getMax extends Lambda implements Function0<String> {
        final /* synthetic */ setWorkerId this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        getMax(setWorkerId setworkerid) {
            super(0);
            this.this$0 = setworkerid;
        }

        public final String invoke() {
            return (String) this.this$0.preferenceAccountEntityData.getAccount().map(AnonymousClass5.length).blockingFirst();
        }
    }

    public final long getLastShownMerchantReviewShown() {
        return this.merchantReviewEntityData.getLastTimeMerchantReviewShown(getPhoneNumber());
    }

    public final boolean saveLastTimeMerchantReviewShown(long j) {
        this.merchantReviewEntityData.saveLastTimeMerchantReviewShown(getPhoneNumber(), j);
        return true;
    }

    public final boolean saveDismissedMerchantReview(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, FeatureParams.SHOP_ID);
        this.merchantReviewEntityData.setDismissedMerchantReview(str, getPhoneNumber(), true);
        return true;
    }

    public final boolean getDismissedMerchantReview(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, FeatureParams.SHOP_ID);
        return this.merchantReviewEntityData.getDismissedMerchantReview(str, getPhoneNumber());
    }
}
