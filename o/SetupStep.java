package o;

import dagger.Component;
import id.dana.danah5.bca.BcaOneKlikEventHandler;
import id.dana.danah5.bottomsheet.BottomSheetBridge;
import id.dana.danah5.customredirectto.CutomRedirectToBridge;
import id.dana.danah5.deeplink.scanQr.OpenScanQrBridge;
import id.dana.danah5.easteregg.EasterEggsEventHandler;
import id.dana.danah5.faceverificationenablement.FaceVerificationEnablementBridge;
import id.dana.danah5.getonlineconfig.GetOnlineConfigBridge;
import id.dana.danah5.globalnetwork.GlobalNetworkBridge;
import id.dana.danah5.location.GetLocationNameBridge;
import id.dana.danah5.locationpicker.MapsUtilityBridge;
import id.dana.danah5.nfcutility.NfcUtilityBridge;
import id.dana.danah5.referralengagement.ShowReferralEngagementDialogBridge;
import id.dana.danah5.sendevent.SendEventBridge;
import id.dana.danah5.share.ShareBridge;
import id.dana.danah5.showagreement.ShowAgreementBridge;
import id.dana.danah5.twilioverifysecurityproduct.TwilioVerifySecurityProductBridge;
import id.dana.di.PerActivity;
import id.dana.di.modules.GContainerModule;
import id.dana.miniprogram.provider.OauthServiceProvider;
import kotlin.Metadata;
import o.PrepareException;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000fH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0011H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0013H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0015H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0017H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0019H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u001bH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u001dH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u001fH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010 \u001a\u00020!H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\"\u001a\u00020#H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010$\u001a\u00020%H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010&\u001a\u00020'H&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006(À\u0006\u0001"}, d2 = {"Lid/dana/di/component/GContainerComponent;", "", "inject", "", "bcaOneKlikEventHandler", "Lid/dana/danah5/bca/BcaOneKlikEventHandler;", "bottomSheetBridge", "Lid/dana/danah5/bottomsheet/BottomSheetBridge;", "cutomRedirectToBridge", "Lid/dana/danah5/customredirectto/CutomRedirectToBridge;", "openScanQrBridge", "Lid/dana/danah5/deeplink/scanQr/OpenScanQrBridge;", "easterEggsEventHandler", "Lid/dana/danah5/easteregg/EasterEggsEventHandler;", "faceVerificationEnablementBridge", "Lid/dana/danah5/faceverificationenablement/FaceVerificationEnablementBridge;", "getOnlineConfigBridge", "Lid/dana/danah5/getonlineconfig/GetOnlineConfigBridge;", "globalNetworkBridge", "Lid/dana/danah5/globalnetwork/GlobalNetworkBridge;", "httpRequestExtension", "Lid/dana/danah5/httprequest/HttpRequestExtension;", "getLocationNameBridge", "Lid/dana/danah5/location/GetLocationNameBridge;", "bridge", "Lid/dana/danah5/locationpicker/MapsUtilityBridge;", "nfcUtilityBridge", "Lid/dana/danah5/nfcutility/NfcUtilityBridge;", "showReferralEngagementDialogBridge", "Lid/dana/danah5/referralengagement/ShowReferralEngagementDialogBridge;", "sendEventBridge", "Lid/dana/danah5/sendevent/SendEventBridge;", "shareBridge", "Lid/dana/danah5/share/ShareBridge;", "showAgreementBridge", "Lid/dana/danah5/showagreement/ShowAgreementBridge;", "twilioVerifySecurityProductBridge", "Lid/dana/danah5/twilioverifysecurityproduct/TwilioVerifySecurityProductBridge;", "provider", "Lid/dana/miniprogram/provider/OauthServiceProvider;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
@PerActivity
@Component(dependencies = {PrepareException.AnonymousClass1.class}, modules = {GContainerModule.class})
public interface SetupStep {
    void getMax(@NotNull OpenScanQrBridge openScanQrBridge);

    void getMax(@NotNull EasterEggsEventHandler easterEggsEventHandler);

    void getMax(@NotNull GetLocationNameBridge getLocationNameBridge);

    void getMin(@NotNull GetOnlineConfigBridge getOnlineConfigBridge);

    void getMin(@NotNull NfcUtilityBridge nfcUtilityBridge);

    void getMin(@NotNull ShowReferralEngagementDialogBridge showReferralEngagementDialogBridge);

    void getMin(@NotNull ShareBridge shareBridge);

    void length(@NotNull BottomSheetBridge bottomSheetBridge);

    void length(@NotNull CutomRedirectToBridge cutomRedirectToBridge);

    void length(@NotNull FaceVerificationEnablementBridge faceVerificationEnablementBridge);

    void length(@NotNull ShowAgreementBridge showAgreementBridge);

    void length(@NotNull OauthServiceProvider oauthServiceProvider);

    void setMax(@NotNull BcaOneKlikEventHandler bcaOneKlikEventHandler);

    void setMax(@NotNull GlobalNetworkBridge globalNetworkBridge);

    void setMin(@NotNull MapsUtilityBridge mapsUtilityBridge);

    void setMin(@NotNull SendEventBridge sendEventBridge);

    void setMin(@NotNull TwilioVerifySecurityProductBridge twilioVerifySecurityProductBridge);
}
