package o;

import kotlin.Metadata;
import o.GriverPrepareInterceptor;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0014"}, d2 = {"Lid/dana/domain/qrbarcode/QrUserBankResult;", "Lid/dana/domain/qrbarcode/QrUserResult;", "expireTimeInSecond", "", "expireDateTimestamp", "(JJ)V", "getExpireDateTimestamp", "()J", "getExpireTimeInSecond", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class GriverAppXInterceptor extends GriverPrepareInterceptor.AnonymousClass1 {
    private final long expireDateTimestamp;
    private final long expireTimeInSecond;

    /* renamed from: o.GriverAppXInterceptor$1  reason: invalid class name */
    public interface AnonymousClass1 {
        setFavoriteBtnVisibility decrementFreeTransferCount(String str);

        TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1<Integer> getFreeTransferCount(String str);

        TitleBarRightButtonView.AnonymousClass1<GriverAMCSLiteAppUpdater> getHomePromotionBanner();

        TitleBarRightButtonView.AnonymousClass1<GriverAMCSLiteAppUpdater> getHomeReferralEntryBanner();

        TitleBarRightButtonView.AnonymousClass1<GriverAMCSLiteAppUpdater> getHomeReferralP2PEntryBanner();

        TitleBarRightButtonView.AnonymousClass1<GriverAMCSLiteAppUpdater> getHomeShoppingBanner();

        TitleBarRightButtonView.AnonymousClass1<GriverAMCSLiteAppUpdater> getInterstitialPromotionBanner();

        TitleBarRightButtonView.AnonymousClass1<GriverAMCSLiteAppUpdater> getLeaderboardEntryBanner();

        TitleBarRightButtonView.AnonymousClass1<GriverAMCSLiteAppUpdater> getPromoClaimBannerConfiguration();

        TitleBarRightButtonView.AnonymousClass1<GriverAMCSLiteAppUpdater> getRecipientHomePromotionBanner();

        TitleBarRightButtonView.AnonymousClass1<GriverAMCSLiteAppUpdater> getReferralTrackerEmptyPlaceholder();

        TitleBarRightButtonView.AnonymousClass1<Boolean> readInterstitialPromotionBanner(String str);

        TitleBarRightButtonView.AnonymousClass1<Boolean> saveInterstitialBannerGapTime(Long l);

        TitleBarRightButtonView.AnonymousClass1<Boolean> saveInterstitialBannerResetTime(Long l);
    }

    public static /* synthetic */ GriverAppXInterceptor copy$default(GriverAppXInterceptor griverAppXInterceptor, long j, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = griverAppXInterceptor.expireTimeInSecond;
        }
        if ((i & 2) != 0) {
            j2 = griverAppXInterceptor.expireDateTimestamp;
        }
        return griverAppXInterceptor.copy(j, j2);
    }

    public final long component1() {
        return this.expireTimeInSecond;
    }

    public final long component2() {
        return this.expireDateTimestamp;
    }

    @NotNull
    public final GriverAppXInterceptor copy(long j, long j2) {
        return new GriverAppXInterceptor(j, j2);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GriverAppXInterceptor)) {
            return false;
        }
        GriverAppXInterceptor griverAppXInterceptor = (GriverAppXInterceptor) obj;
        return this.expireTimeInSecond == griverAppXInterceptor.expireTimeInSecond && this.expireDateTimestamp == griverAppXInterceptor.expireDateTimestamp;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("QrUserBankResult(expireTimeInSecond=");
        sb.append(this.expireTimeInSecond);
        sb.append(", expireDateTimestamp=");
        sb.append(this.expireDateTimestamp);
        sb.append(")");
        return sb.toString();
    }

    public final long getExpireTimeInSecond() {
        return this.expireTimeInSecond;
    }

    public final long getExpireDateTimestamp() {
        return this.expireDateTimestamp;
    }

    public GriverAppXInterceptor(long j, long j2) {
        this.expireTimeInSecond = j;
        this.expireDateTimestamp = j2;
    }

    public final int hashCode() {
        return (Long.valueOf(this.expireTimeInSecond).hashCode() * 31) + Long.valueOf(this.expireDateTimestamp).hashCode();
    }
}
