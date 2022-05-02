package o;

import android.content.Context;
import com.ap.zoloz.hummer.biz.HummerConstants;
import id.dana.data.constant.BranchLinkConstant;
import id.dana.tracker.TrackerKey;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.Blur;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001d\u0010\u0005\u001a\u00020\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\bH\bJ(\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\fH\u0016J(\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\fH\u0016J\u0018\u0010\u0011\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lid/dana/nearbyme/merchantdetail/tracker/MerchantDetailMixpanelTrackers;", "Lid/dana/nearbyme/merchantdetail/tracker/MerchantDetailAnalyticTracker;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "execute", "", "event", "Lkotlin/Function1;", "Lid/dana/tracker/mixpanel/MixPanelEvent$Builder;", "trackNearbyDetailOpen", "source", "", "merchantName", "shopName", "mccType", "trackNearbyDetailReviewOpen", "trackNearbyDetailShareOpen", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class ShareMenu implements AnonymousClass1 {
    private final Context setMax;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0005H&J(\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0005H&J\u0018\u0010\n\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, d2 = {"Lid/dana/nearbyme/merchantdetail/tracker/MerchantDetailAnalyticTracker;", "", "trackNearbyDetailOpen", "", "source", "", "merchantName", "shopName", "mccType", "trackNearbyDetailReviewOpen", "trackNearbyDetailShareOpen", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    /* renamed from: o.ShareMenu$1  reason: invalid class name */
    public interface AnonymousClass1 {
        void getMax(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4);

        void length(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4);

        void setMax(@NotNull String str, @NotNull String str2);
    }

    @Inject
    public ShareMenu(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        this.setMax = context;
    }

    public final void length(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "source");
        Intrinsics.checkNotNullParameter(str2, BranchLinkConstant.OauthParams.MERCHANT_NAME);
        Intrinsics.checkNotNullParameter(str3, "shopName");
        Intrinsics.checkNotNullParameter(str4, "mccType");
        Blur.getMax getmax = new Blur.getMax(this.setMax);
        Intrinsics.checkNotNullExpressionValue(getmax, "MixPanelEvent.Builder.createBuilder(context)");
        getmax.getMax = TrackerKey.Event.NEARBY_DETAIL_OPEN;
        getmax.getMin("Source", str);
        getmax.getMin("Merchant Name", str2);
        getmax.getMin("Shop Name", str3);
        getmax.getMin(TrackerKey.NearbyMerchantProperty.MCC_TYPE, str4);
        BlurProcess.getMax(new Blur(getmax, (byte) 0));
    }

    public final void getMax(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "source");
        Intrinsics.checkNotNullParameter(str2, BranchLinkConstant.OauthParams.MERCHANT_NAME);
        Intrinsics.checkNotNullParameter(str3, "shopName");
        Intrinsics.checkNotNullParameter(str4, "mccType");
        Blur.getMax getmax = new Blur.getMax(this.setMax);
        Intrinsics.checkNotNullExpressionValue(getmax, "MixPanelEvent.Builder.createBuilder(context)");
        getmax.getMax = TrackerKey.Event.NEARBY_DETAIL_REVIEW_OPEN;
        getmax.getMin("Source", str);
        getmax.getMin("Merchant Name", str2);
        getmax.getMin("Shop Name", str3);
        getmax.getMin(TrackerKey.NearbyMerchantProperty.MCC_TYPE, str4);
        BlurProcess.getMax(new Blur(getmax, (byte) 0));
    }

    public final void setMax(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, BranchLinkConstant.OauthParams.MERCHANT_NAME);
        Intrinsics.checkNotNullParameter(str2, "shopName");
        Blur.getMax getmax = new Blur.getMax(this.setMax);
        Intrinsics.checkNotNullExpressionValue(getmax, "MixPanelEvent.Builder.createBuilder(context)");
        getmax.getMax = TrackerKey.Event.NEARBY_DETAIL_PAGE_SHARE_LINK;
        getmax.getMin("Merchant Name", str);
        getmax.getMin("Shop Name", str2);
        BlurProcess.getMax(new Blur(getmax, (byte) 0));
    }
}
