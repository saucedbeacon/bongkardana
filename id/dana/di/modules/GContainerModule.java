package id.dana.di.modules;

import dagger.Module;
import dagger.Provides;
import id.dana.data.risk.riskevent.SendRiskEventReceiver;
import id.dana.data.risk.riskevent.sharetextbroadcast.ShareTextBroadcastReceiver;
import id.dana.di.PerActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.Constants;
import o.GriverCreateDialogParam;
import o.GriverShareSchemeExtension;
import o.GriverSwtich;
import o.H5UCProvider;
import o.cannotInitUC;
import o.crashDetected;
import o.disableItems;
import o.forceFlush;
import o.getCancelListeners$core;
import o.isKeepCallback;
import o.maxWidth;
import o.negativeButton;
import o.onNonBeaconLeScan;
import o.setUpdateNotifier;
import o.showTwoWheelDialog;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J \u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0007J\b\u0010\u0015\u001a\u00020\u0016H\u0007J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0007J0\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&H\u0007¨\u0006'"}, d2 = {"Lid/dana/di/modules/GContainerModule;", "", "()V", "provideFaceVerificationEnablementManager", "Lid/dana/danah5/faceverificationenablement/FaceVerificationEnablementManager;", "switchFaceAuthentication", "Lid/dana/domain/auth/face/interactor/SwitchFaceAuthentication;", "getUserId", "Lid/dana/domain/account/interactor/GetUserId;", "provideGlobalNetworkManager", "Lid/dana/danah5/globalnetwork/manager/GlobalNetworkPluginManager;", "getSelectedCountryCode", "Lid/dana/domain/globalnetwork/interactor/GetSelectedCountryCode;", "getForex", "Lid/dana/domain/globalnetwork/interactor/GetForex;", "getRealTimeForex", "Lid/dana/domain/globalnetwork/interactor/GetRealTimeForex;", "provideSaveReferralEngagementDialogCache", "Lid/dana/domain/referral/interactor/SaveReferralEngagementDialogCache;", "referralRepository", "Lid/dana/domain/referral/ReferralRepository;", "provideServicesBottomSheetManager", "Lid/dana/danah5/bottomsheet/service/ServicesBottomSheetManager;", "provideShareTextBroadcastReceiver", "Lid/dana/data/risk/riskevent/sharetextbroadcast/ShareTextBroadcastReceiver;", "sendRiskEventReceiver", "Lid/dana/data/risk/riskevent/SendRiskEventReceiver;", "provideTwilioSecurityProductManager", "Lid/dana/danah5/twilioverifysecurityproduct/TwilioVerifySecurityProductManager;", "checkTwilioEnrollmentStatus", "Lid/dana/domain/twilio/interactor/CheckTwilioEnrollmentStatus;", "twilioRequestChallenge", "Lid/dana/domain/twilio/interactor/TwilioRequestChallenge;", "twilioVerifySecurityProduct", "Lid/dana/domain/twilio/interactor/TwilioVerifySecurityProduct;", "updateTwilioChallenge", "Lid/dana/domain/twilio/interactor/UpdateTwilioChallenge;", "twilioMixpanelTracker", "Lid/dana/twilio/tracker/TwilioMixpanelTracker;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
@Module
public final class GContainerModule {
    @NotNull
    @PerActivity
    @Provides
    public final maxWidth setMin(@NotNull cannotInitUC cannotinituc, @NotNull isKeepCallback iskeepcallback, @NotNull H5UCProvider h5UCProvider) {
        Intrinsics.checkNotNullParameter(cannotinituc, "getSelectedCountryCode");
        Intrinsics.checkNotNullParameter(iskeepcallback, "getForex");
        Intrinsics.checkNotNullParameter(h5UCProvider, "getRealTimeForex");
        return new maxWidth(cannotinituc, iskeepcallback, h5UCProvider);
    }

    @NotNull
    @PerActivity
    @Provides
    public final ShareTextBroadcastReceiver length(@NotNull SendRiskEventReceiver sendRiskEventReceiver) {
        Intrinsics.checkNotNullParameter(sendRiskEventReceiver, "sendRiskEventReceiver");
        return sendRiskEventReceiver;
    }

    @NotNull
    @PerActivity
    @Provides
    public final getCancelListeners$core getMin() {
        return new getCancelListeners$core();
    }

    @NotNull
    @PerActivity
    @Provides
    public final negativeButton.Cdefault getMin(@NotNull GriverShareSchemeExtension griverShareSchemeExtension, @NotNull GriverCreateDialogParam griverCreateDialogParam) {
        Intrinsics.checkNotNullParameter(griverShareSchemeExtension, "switchFaceAuthentication");
        Intrinsics.checkNotNullParameter(griverCreateDialogParam, "getUserId");
        return new negativeButton.Cdefault(griverShareSchemeExtension, griverCreateDialogParam);
    }

    @NotNull
    @PerActivity
    @Provides
    public final disableItems length(@NotNull onNonBeaconLeScan onnonbeaconlescan, @NotNull crashDetected crashdetected, @NotNull forceFlush forceflush, @NotNull setUpdateNotifier setupdatenotifier, @NotNull showTwoWheelDialog showtwowheeldialog) {
        Intrinsics.checkNotNullParameter(onnonbeaconlescan, "checkTwilioEnrollmentStatus");
        Intrinsics.checkNotNullParameter(crashdetected, "twilioRequestChallenge");
        Intrinsics.checkNotNullParameter(forceflush, "twilioVerifySecurityProduct");
        Intrinsics.checkNotNullParameter(setupdatenotifier, "updateTwilioChallenge");
        Intrinsics.checkNotNullParameter(showtwowheeldialog, "twilioMixpanelTracker");
        return new disableItems(onnonbeaconlescan, crashdetected, forceflush, setupdatenotifier, showtwowheeldialog);
    }

    @NotNull
    @PerActivity
    @Provides
    public final Constants setMax(@NotNull GriverSwtich griverSwtich) {
        Intrinsics.checkNotNullParameter(griverSwtich, "referralRepository");
        return new Constants(griverSwtich);
    }
}
