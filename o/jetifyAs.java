package o;

import android.annotation.SuppressLint;
import androidx.annotation.NonNull;
import id.dana.data.foundation.logger.log.DanaLogConstants;
import id.dana.di.PerActivity;
import id.dana.nearbyme.merchantreview.model.MerchantConsultReviewModel;
import id.dana.nearbyme.merchantreview.model.MerchantReviewTagModel;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import o.GriverAmcsLiteConfig;
import o.GriverInnerAmcsLiteConfig;
import o.GriverInnerConfig;
import o.VersionedParcelize;
import o.getIMEI;
import o.onCharacteristicWriteCompleted;
import o.onConnect;

@PerActivity
public final class jetifyAs implements VersionedParcelize.getMax {
    private final fetchAppList IsOverlapping;
    private final onCharacteristicWriteCompleted equals;
    private final getGriverSectionConfig getMax;
    private final getIMEI getMin;
    private final GriverInnerAmcsLiteConfig.AnonymousClass2 isInside;
    private final GriverInnerConfig.AnonymousClass1 length;
    /* access modifiers changed from: private */
    public final NetworkBridgeExtension setMax;
    /* access modifiers changed from: private */
    public final RequestBridgeExtension setMin;
    /* access modifiers changed from: private */
    public final VersionedParcelize.setMin toFloatRange;
    private final onConnect toIntRange;

    @Inject
    public jetifyAs(VersionedParcelize.setMin setmin, getGriverSectionConfig getgriversectionconfig, NetworkBridgeExtension networkBridgeExtension, GriverInnerConfig.AnonymousClass1 r4, RequestBridgeExtension requestBridgeExtension, onCharacteristicWriteCompleted oncharacteristicwritecompleted, onConnect onconnect, getIMEI getimei, fetchAppList fetchapplist, GriverInnerAmcsLiteConfig.AnonymousClass2 r10) {
        this.toFloatRange = setmin;
        this.getMax = getgriversectionconfig;
        this.setMax = networkBridgeExtension;
        this.length = r4;
        this.setMin = requestBridgeExtension;
        this.equals = oncharacteristicwritecompleted;
        this.toIntRange = onconnect;
        this.getMin = getimei;
        this.IsOverlapping = fetchapplist;
        this.isInside = r10;
    }

    public final void length() {
        this.toFloatRange.showProgress();
        this.getMax.execute(new GriverAppVirtualHostProxy<GriverAmcsLiteConfig.AnonymousClass2>() {
            public final /* synthetic */ void onNext(Object obj) {
                jetifyAs.this.toFloatRange.dismissProgress();
                jetifyAs.this.toFloatRange.onGetHomeInfo(jetifyAs.this.setMax.length((GriverAmcsLiteConfig.AnonymousClass2) obj));
            }

            public final void onError(Throwable th) {
                jetifyAs.this.toFloatRange.dismissProgress();
                jetifyAs.this.toFloatRange.onError(th.getMessage());
                StringBuilder sb = new StringBuilder(DanaLogConstants.Prefix.HOME_GETHOMEINFO_PREFIX);
                sb.append(getClass().getName());
                sb.append(":onError ");
                updateActionSheetContent.e(DanaLogConstants.TAG.HOME_TAG, sb.toString(), th);
            }
        });
    }

    public final void length(int i) {
        this.toFloatRange.showProgress();
        this.length.execute(new GriverAppVirtualHostProxy<GriverConfig>() {
            public final /* synthetic */ void onNext(Object obj) {
                jetifyAs.this.toFloatRange.dismissProgress();
                jetifyAs.this.toFloatRange.onGetHomeData((toggleSoftInput) jetifyAs.this.setMin.apply((GriverConfig) obj));
            }

            public final void onError(Throwable th) {
                jetifyAs.this.toFloatRange.dismissProgress();
            }
        }, GriverInnerConfig.AnonymousClass1.getMax.forFeeds(i, (String) null));
    }

    public final void getMax(String str) {
        this.toFloatRange.showProgress();
        this.equals.execute(new GriverAppVirtualHostProxy<Boolean>() {
            public final /* synthetic */ void onNext(Object obj) {
                jetifyAs.this.toFloatRange.dismissProgress();
                jetifyAs.this.toFloatRange.onShowTooltip(((Boolean) obj).booleanValue());
            }

            public final void onError(Throwable th) {
                jetifyAs.this.toFloatRange.dismissProgress();
                jetifyAs.this.toFloatRange.onShowTooltip(false);
                StringBuilder sb = new StringBuilder(DanaLogConstants.Prefix.IS_NEED_TO_SHOW_TOOLTIP_PREFIX);
                sb.append(getClass().getName());
                sb.append("on Error");
                updateActionSheetContent.e(DanaLogConstants.TAG.USER_EDUCATION_TAG, sb.toString(), th);
            }
        }, onCharacteristicWriteCompleted.getMax.forShowTooltip(str));
    }

    public final void getMin(String str) {
        this.toIntRange.execute(new GriverAppVirtualHostProxy<Boolean>() {
            public final void onError(Throwable th) {
                StringBuilder sb = new StringBuilder(DanaLogConstants.Prefix.SAVE_SHOW_TOOLTIP_PREFIX);
                sb.append(getClass().getName());
                sb.append("on Error");
                updateActionSheetContent.e(DanaLogConstants.TAG.USER_EDUCATION_TAG, sb.toString(), th);
            }
        }, onConnect.getMax.forSaveShowToolTip(true, str));
    }

    public final void length(String str, String str2, boolean z) {
        this.toFloatRange.showProgress();
        this.getMin.execute(new getIMEI.getMax(str2, z), new isCustom(this, str), new deprecatedIds(this));
    }

    @SuppressLint({"WrongConstant"})
    public final void getMax() {
        this.isInside.execute(new GriverAppVirtualHostProxy<Boolean>() {
            public final void onError(Throwable th) {
                updateActionSheetContent.e(DanaLogConstants.TAG.CONVERT_USER_CONFIG, th.getMessage(), th);
            }
        });
    }

    @NonNull
    private static List<MerchantReviewTagModel> getMin(List<getExtensionFromMimeType> list) {
        ArrayList arrayList = new ArrayList();
        for (getExtensionFromMimeType next : list) {
            MerchantReviewTagModel.setMax setmax = MerchantReviewTagModel.setMin;
            Intrinsics.checkNotNullParameter(next, "tag");
            arrayList.add(new MerchantReviewTagModel(next.getId(), next.getDescription()));
        }
        return arrayList;
    }

    public final void setMax() {
        this.getMax.dispose();
        this.length.dispose();
        this.equals.dispose();
        this.toIntRange.dispose();
        this.getMin.dispose();
        this.isInside.dispose();
    }

    static /* synthetic */ Unit setMax(jetifyAs jetifyas, String str, DiskUtil diskUtil) {
        jetifyas.toFloatRange.dismissProgress();
        MerchantConsultReviewModel merchantConsultReviewModel = new MerchantConsultReviewModel(jetifyas.IsOverlapping.setMax(diskUtil.getReviewableShop()), getMin(diskUtil.getPositiveTags()), getMin(diskUtil.getNegativeSentiments()), "", "", 0);
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        merchantConsultReviewModel.getMax = str;
        jetifyas.toFloatRange.onShouldShowMerchant(merchantConsultReviewModel);
        return null;
    }

    static /* synthetic */ Unit getMin(jetifyAs jetifyas, Exception exc) {
        jetifyas.toFloatRange.dismissProgress();
        jetifyas.toFloatRange.onShowMerchantReviewCheckingError();
        updateActionSheetContent.e("Nearby", exc.getMessage(), exc);
        return null;
    }
}
