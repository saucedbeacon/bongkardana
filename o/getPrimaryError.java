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

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001d\u0010\u0005\u001a\u00020\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\bH\bJ(\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\fH\u0016J\u0010\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lid/dana/nearbyme/merchantreview/tracker/MerchantReviewFormMixpanelTracker;", "Lid/dana/nearbyme/merchantreview/tracker/MerchantReviewFormAnalyticTracker;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "execute", "", "event", "Lkotlin/Function1;", "Lid/dana/tracker/mixpanel/MixPanelEvent$Builder;", "trackMerchantReviewFormOpen", "source", "", "merchantName", "merchantId", "shopName", "trackReviewSubmit", "analyticModel", "Lid/dana/nearbyme/merchantreview/model/MerchantReviewFormAnalyticModel;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class getPrimaryError implements addError {
    private final Context getMax;

    @Inject
    public getPrimaryError(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        this.getMax = context;
    }

    public final void length(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "source");
        Intrinsics.checkNotNullParameter(str2, BranchLinkConstant.OauthParams.MERCHANT_NAME);
        Intrinsics.checkNotNullParameter(str3, "merchantId");
        Intrinsics.checkNotNullParameter(str4, "shopName");
        Blur.getMax getmax = new Blur.getMax(this.getMax);
        Intrinsics.checkNotNullExpressionValue(getmax, "MixPanelEvent.Builder.createBuilder(context)");
        getmax.getMax = TrackerKey.Event.NEARBY_REVIEW_FORM_OPEN;
        getmax.getMin("Source", str);
        getmax.getMin("Merchant Name", str2);
        getmax.getMin(TrackerKey.Property.MERCHANT_ID, str3);
        getmax.getMin("Shop Name", str4);
        BlurProcess.getMax(new Blur(getmax, (byte) 0));
    }

    public final void setMax(@NotNull hasError haserror) {
        Intrinsics.checkNotNullParameter(haserror, "analyticModel");
        Blur.getMax getmax = new Blur.getMax(this.getMax);
        Intrinsics.checkNotNullExpressionValue(getmax, "MixPanelEvent.Builder.createBuilder(context)");
        getmax.getMax = TrackerKey.Event.NEARBY_REVIEW_FORM_SUBMIT;
        getmax.getMin("Source", haserror.setMin);
        getmax.getMin("Merchant Name", haserror.getMin);
        getmax.getMin(TrackerKey.Property.MERCHANT_ID, haserror.getMax);
        getmax.getMin("Shop Name", haserror.setMax);
        getmax.getMin(TrackerKey.NearbyMerchantProperty.HAS_REVIEW, String.valueOf(haserror.getMin()));
        getmax.getMin(TrackerKey.NearbyMerchantProperty.STARS_SUBMITTED, haserror.length);
        getmax.getMin(TrackerKey.NearbyMerchantProperty.TAGS_SUBMITTED, haserror.toFloatRange.length() == 0 ? "No Tags" : haserror.toFloatRange);
        BlurProcess.getMax(new Blur(getmax, (byte) 0));
    }
}
