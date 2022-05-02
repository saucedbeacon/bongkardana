package o;

import dagger.internal.InjectedFieldSignature;
import id.dana.requestmoney.model.UserBankModel;
import id.dana.richview.MaintenanceBroadcastView;
import id.dana.richview.NewPromoBannerView;
import id.dana.richview.PromoBannerView;
import kotlin.Metadata;
import o.GriverBridgeManifest;
import o.GriverManifest;
import o.getDuration;
import o.parentColumns;
import o.setTabIndicatorColor;
import o.setTrimPathOffset;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0005"}, d2 = {"Lid/dana/requestmoney/bank/UserBankQrContract;", "", "()V", "Presenter", "View", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class GriverCaptureActivity {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, d2 = {"Lid/dana/requestmoney/bank/UserBankQrContract$Presenter;", "Lid/dana/base/AbstractContractKt$AbstractPresenter;", "getBankQr", "", "userBankModel", "Lid/dana/requestmoney/model/UserBankModel;", "amount", "Lid/dana/sendmoney/Amount;", "remarks", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public interface length extends parentColumns.setMin {
        void length(@NotNull UserBankModel userBankModel, @NotNull APImageDownloadRsp aPImageDownloadRsp, @NotNull String str);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, d2 = {"Lid/dana/requestmoney/bank/UserBankQrContract$View;", "Lid/dana/base/AbstractContractKt$AbstractView;", "onGetBankQr", "", "qrUserBankModel", "Lid/dana/requestmoney/model/QrUserBankModel;", "onGetBankQrFail", "generalError", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public interface setMin extends parentColumns.getMax {
        void getMin(@NotNull String str);

        void getMin(@NotNull access$2800 access_2800);
    }

    public final class InnerHandler implements getBindingAdapter<PromoBannerView> {
        @InjectedFieldSignature("id.dana.richview.PromoBannerView.presenter")
        public static void length(PromoBannerView promoBannerView, GriverBridgeManifest.getMin getmin) {
            promoBannerView.presenter = getmin;
        }
    }

    /* renamed from: o.GriverCaptureActivity$4  reason: invalid class name */
    public final class AnonymousClass4 implements getBindingAdapter<MaintenanceBroadcastView> {
        @InjectedFieldSignature("id.dana.richview.MaintenanceBroadcastView.presenter")
        public static void getMax(MaintenanceBroadcastView maintenanceBroadcastView, setTabIndicatorColor.getMax getmax) {
            maintenanceBroadcastView.presenter = getmax;
        }
    }

    /* renamed from: o.GriverCaptureActivity$6  reason: invalid class name */
    public final class AnonymousClass6 implements getBindingAdapter<NewPromoBannerView> {
        @InjectedFieldSignature("id.dana.richview.NewPromoBannerView.promoBannerPresenter")
        public static void length(NewPromoBannerView newPromoBannerView, GriverManifest.AnonymousClass8.setMax setmax) {
            newPromoBannerView.promoBannerPresenter = setmax;
        }

        @InjectedFieldSignature("id.dana.richview.NewPromoBannerView.globalFeedPresenter")
        public static void getMin(NewPromoBannerView newPromoBannerView, setTrimPathOffset.setMax setmax) {
            newPromoBannerView.globalFeedPresenter = setmax;
        }

        @InjectedFieldSignature("id.dana.richview.NewPromoBannerView.readDeepLinkPropertiesPresenter")
        public static void getMax(NewPromoBannerView newPromoBannerView, getDuration.length length) {
            newPromoBannerView.readDeepLinkPropertiesPresenter = length;
        }
    }
}
