package o;

import id.dana.data.foundation.logger.log.DanaLogConstants;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.ImageInfoBridgeExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lid/dana/sendmoney/external/outlet/AddOutletReceiverPresenter;", "Lid/dana/sendmoney/external/outlet/AddOutletReceiverContract$Presenter;", "getSendMoneyVendorLogo", "Lid/dana/domain/sendmoney/interactor/GetSendMoneyVendorLogo;", "view", "Lid/dana/sendmoney/external/outlet/AddOutletReceiverContract$View;", "(Lid/dana/domain/sendmoney/interactor/GetSendMoneyVendorLogo;Lid/dana/sendmoney/external/outlet/AddOutletReceiverContract$View;)V", "getOutletLogos", "", "onDestroy", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class trimFilePath implements ImageInfoBridgeExtension.AnonymousClass1.setMin {
    /* access modifiers changed from: private */
    public final ImageInfoBridgeExtension.AnonymousClass1.getMin getMax;
    private final stopRangingBeaconsInRegion getMin;

    @Inject
    public trimFilePath(@NotNull stopRangingBeaconsInRegion stoprangingbeaconsinregion, @NotNull ImageInfoBridgeExtension.AnonymousClass1.getMin getmin) {
        Intrinsics.checkNotNullParameter(stoprangingbeaconsinregion, "getSendMoneyVendorLogo");
        Intrinsics.checkNotNullParameter(getmin, "view");
        this.getMin = stoprangingbeaconsinregion;
        this.getMax = getmin;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0016\u0010\b\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¨\u0006\n"}, d2 = {"id/dana/sendmoney/external/outlet/AddOutletReceiverPresenter$getOutletLogos$1", "Lid/dana/domain/DefaultObserver;", "", "Lid/dana/domain/promotion/CdpContent;", "onError", "", "error", "", "onNext", "cdpContents", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMin extends GriverAppVirtualHostProxy<List<? extends getDefaultProxy>> {
        final /* synthetic */ trimFilePath setMin;

        getMin(trimFilePath trimfilepath) {
            this.setMin = trimfilepath;
        }

        public final /* synthetic */ void onNext(Object obj) {
            List list = (List) obj;
            Intrinsics.checkNotNullParameter(list, "cdpContents");
            this.setMin.getMax.getMax(list);
            this.setMin.getMax.dismissProgress();
        }

        public final void onError(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "error");
            updateActionSheetContent.e(DanaLogConstants.TAG.SEND_MONEY_TAG, th.getMessage(), th);
            this.setMin.getMax.dismissProgress();
        }
    }

    public final void getMin() {
        this.getMax.showProgress();
        this.getMin.execute(new getMin(this));
    }

    public final void setMax() {
        this.getMin.dispose();
    }
}
