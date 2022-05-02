package o;

import androidx.annotation.VisibleForTesting;
import com.iap.ac.android.acs.plugin.utils.Constants;
import id.dana.data.foundation.logger.log.DanaLogConstants;
import id.dana.domain.profilemenu.model.SettingModel;
import id.dana.twilio.onboarding.TwilioIntroductionActivity;
import java.util.Date;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o.BleAdvertisement;
import o.ConfirmPopup;
import o.MultilevelSelectActivity;
import o.ScanFilterUtils;
import o.addChooseImageCrossOrigin;
import o.getDetectedCrashCount;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\r\u0018\u0000 )2\u00020\u0001:\u0001)BO\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013¢\u0006\u0002\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\b\u0010\u0004\u001a\u00020\u0016H\u0016J\u0006\u0010\u000e\u001a\u00020\u0016J\u000e\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u001bJ\b\u0010\u001c\u001a\u00020\u001dH\u0002J\u0006\u0010\u001e\u001a\u00020\u0016J\u0006\u0010\u001f\u001a\u00020\u0016J\b\u0010 \u001a\u00020\u0016H\u0016J\u0010\u0010!\u001a\u00020\u001b2\u0006\u0010\"\u001a\u00020\u001dH\u0007J\b\u0010#\u001a\u00020\u0016H\u0016J\u0010\u0010$\u001a\u00020\u00162\u0006\u0010%\u001a\u00020\u001bH\u0016J\b\u0010&\u001a\u00020\u0016H\u0016J\u0010\u0010'\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\b\u0010(\u001a\u00020\u0016H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006*"}, d2 = {"Lid/dana/twilio/twiliodialog/TwilioDialogPresenter;", "Lid/dana/twilio/twiliodialog/TwilioDialogContract$Presenter;", "view", "Lid/dana/twilio/twiliodialog/TwilioDialogContract$View;", "checkTwilioEnrollmentFeature", "Lid/dana/domain/twilio/interactor/CheckTwilioEnrollmentFeature;", "getTwilioDialogDismissCount", "Lid/dana/domain/twilio/interactor/GetTwilioDialogDismissCount;", "saveTwilioDialogDismissCount", "Lid/dana/domain/twilio/interactor/SaveTwilioDialogDismissCount;", "saveNeverShowTwilioDialog", "Lid/dana/domain/twilio/interactor/SaveNeverShowTwilioDialog;", "getNeverShowTwilioDialog", "Lid/dana/domain/twilio/interactor/GetNeverShowTwilioDialog;", "checkTwilioEnrollmentStatus", "Lid/dana/domain/twilio/interactor/CheckTwilioEnrollmentStatus;", "twilioConsultEnrollment", "Lid/dana/domain/twilio/interactor/TwilioConsultEnrollment;", "getSetting", "Lid/dana/domain/profilemenu/interactor/GetSettingByKey;", "(Lid/dana/twilio/twiliodialog/TwilioDialogContract$View;Lid/dana/domain/twilio/interactor/CheckTwilioEnrollmentFeature;Lid/dana/domain/twilio/interactor/GetTwilioDialogDismissCount;Lid/dana/domain/twilio/interactor/SaveTwilioDialogDismissCount;Lid/dana/domain/twilio/interactor/SaveNeverShowTwilioDialog;Lid/dana/domain/twilio/interactor/GetNeverShowTwilioDialog;Lid/dana/domain/twilio/interactor/CheckTwilioEnrollmentStatus;Lid/dana/domain/twilio/interactor/TwilioConsultEnrollment;Lid/dana/domain/profilemenu/interactor/GetSettingByKey;)V", "checkDismissCount", "", "dismissCount", "", "consultTwilioEnrollment", "showCheckBox", "", "getCurrentDateTimestamp", "", "getDontShowAgain", "getMaybeLaterClickCount", "getProfileSettingModel", "isTenDaysDifference", "lastSaved", "onDestroy", "saveDontShowAgain", "neverShow", "saveMaybeLaterClick", "saveMaybeLaterClickCount", "saveTwilioFailedTimestamp", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class MultilevelSelectAdapter implements MultilevelSelectActivity.AnonymousClass1.length {
    @NotNull
    public static final setMax getMax = new setMax((byte) 0);
    private final StartupBroadcastReceiver IsOverlapping;
    private final ScanFilterUtils.ScanFilterData equals;
    final UrlBeaconUrlCompressor getMin;
    private final BleAdvertisement isInside;
    /* access modifiers changed from: private */
    public final MultilevelSelectActivity.AnonymousClass1.setMin length;
    private final onScanFailed setMax;
    final onNonBeaconLeScan setMin;
    private final addChooseImageCrossOrigin toFloatRange;
    private final getDetectedCrashCount toIntRange;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lid/dana/domain/twilio/model/TwilioInfo;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class getMax extends Lambda implements Function1<disableBluetooth, Unit> {
        final /* synthetic */ boolean $showCheckBox;
        final /* synthetic */ MultilevelSelectAdapter this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        getMax(MultilevelSelectAdapter multilevelSelectAdapter, boolean z) {
            super(1);
            this.this$0 = multilevelSelectAdapter;
            this.$showCheckBox = z;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((disableBluetooth) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull disableBluetooth disablebluetooth) {
            Intrinsics.checkNotNullParameter(disablebluetooth, "it");
            if (disablebluetooth.getRegisterAllowed()) {
                MultilevelSelectActivity.AnonymousClass1.setMin max = this.this$0.length;
                boolean z = this.$showCheckBox;
                String securityId = disablebluetooth.getSecurityId();
                if (securityId == null) {
                    securityId = "";
                }
                max.getMax(z, securityId);
                return;
            }
            MultilevelSelectAdapter multilevelSelectAdapter = this.this$0;
            multilevelSelectAdapter.getMin.execute(new MultilevelSelectAdapter$FastBitmap$CoordinateSystem(multilevelSelectAdapter));
            this.this$0.length.setMax();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class length extends Lambda implements Function1<Throwable, Unit> {
        final /* synthetic */ MultilevelSelectAdapter this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        length(MultilevelSelectAdapter multilevelSelectAdapter) {
            super(1);
            this.this$0 = multilevelSelectAdapter;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "it");
            MultilevelSelectAdapter multilevelSelectAdapter = this.this$0;
            multilevelSelectAdapter.getMin.execute(new MultilevelSelectAdapter$FastBitmap$CoordinateSystem(multilevelSelectAdapter));
            this.this$0.length.onError("");
            updateActionSheetContent.e(DanaLogConstants.TAG.TWILIO_CONSULT, th.getMessage(), th);
        }
    }

    @Inject
    public MultilevelSelectAdapter(@NotNull MultilevelSelectActivity.AnonymousClass1.setMin setmin, @NotNull onScanFailed onscanfailed, @NotNull UrlBeaconUrlCompressor urlBeaconUrlCompressor, @NotNull StartupBroadcastReceiver startupBroadcastReceiver, @NotNull BleAdvertisement bleAdvertisement, @NotNull ScanFilterUtils.ScanFilterData scanFilterData, @NotNull onNonBeaconLeScan onnonbeaconlescan, @NotNull getDetectedCrashCount getdetectedcrashcount, @NotNull addChooseImageCrossOrigin addchooseimagecrossorigin) {
        Intrinsics.checkNotNullParameter(setmin, "view");
        Intrinsics.checkNotNullParameter(onscanfailed, "checkTwilioEnrollmentFeature");
        Intrinsics.checkNotNullParameter(urlBeaconUrlCompressor, "getTwilioDialogDismissCount");
        Intrinsics.checkNotNullParameter(startupBroadcastReceiver, "saveTwilioDialogDismissCount");
        Intrinsics.checkNotNullParameter(bleAdvertisement, "saveNeverShowTwilioDialog");
        Intrinsics.checkNotNullParameter(scanFilterData, "getNeverShowTwilioDialog");
        Intrinsics.checkNotNullParameter(onnonbeaconlescan, "checkTwilioEnrollmentStatus");
        Intrinsics.checkNotNullParameter(getdetectedcrashcount, "twilioConsultEnrollment");
        Intrinsics.checkNotNullParameter(addchooseimagecrossorigin, Constants.JS_API_GET_SETTING);
        this.length = setmin;
        this.setMax = onscanfailed;
        this.getMin = urlBeaconUrlCompressor;
        this.IsOverlapping = startupBroadcastReceiver;
        this.isInside = bleAdvertisement;
        this.equals = scanFilterData;
        this.setMin = onnonbeaconlescan;
        this.toIntRange = getdetectedcrashcount;
        this.toFloatRange = addchooseimagecrossorigin;
    }

    public final void getMax(boolean z) {
        this.toIntRange.execute(new getDetectedCrashCount.setMin(new closeBluetoothAdapter(TwilioIntroductionActivity.HOME_PAGE)), new getMax(this, z), new length(this));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"id/dana/twilio/twiliodialog/TwilioDialogPresenter$saveMaybeLaterClick$1", "Lid/dana/domain/DefaultObserver;", "Lid/dana/domain/twilio/model/TwilioDialogParam;", "onNext", "", "twilioDialogParam", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class toIntRange extends GriverAppVirtualHostProxy<openBluetoothAdapter> {
        final /* synthetic */ MultilevelSelectAdapter getMin;

        toIntRange(MultilevelSelectAdapter multilevelSelectAdapter) {
            this.getMin = multilevelSelectAdapter;
        }

        public final /* synthetic */ void onNext(Object obj) {
            openBluetoothAdapter openbluetoothadapter = (openBluetoothAdapter) obj;
            Intrinsics.checkNotNullParameter(openbluetoothadapter, "twilioDialogParam");
            if (openbluetoothadapter.getDismissCount() == -1) {
                this.getMin.IsOverlapping.execute(new toDoubleRange(), new openBluetoothAdapter(openbluetoothadapter.getDismissCount() + 2, new Date().getTime()));
            } else {
                this.getMin.IsOverlapping.execute(new toDoubleRange(), new openBluetoothAdapter(openbluetoothadapter.getDismissCount() + 1, new Date().getTime()));
            }
        }
    }

    public final void getMin() {
        this.getMin.execute(new toIntRange(this));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"id/dana/twilio/twiliodialog/TwilioDialogPresenter$saveMaybeLaterClickCount$1", "Lid/dana/domain/DefaultObserver;", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class toDoubleRange extends GriverAppVirtualHostProxy<Boolean> {
        toDoubleRange() {
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"id/dana/twilio/twiliodialog/TwilioDialogPresenter$getMaybeLaterClickCount$1", "Lid/dana/domain/DefaultObserver;", "Lid/dana/domain/twilio/model/TwilioDialogParam;", "onNext", "", "twilioDialogParam", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class toFloatRange extends GriverAppVirtualHostProxy<openBluetoothAdapter> {
        final /* synthetic */ MultilevelSelectAdapter getMax;

        toFloatRange(MultilevelSelectAdapter multilevelSelectAdapter) {
            this.getMax = multilevelSelectAdapter;
        }

        public final /* synthetic */ void onNext(Object obj) {
            openBluetoothAdapter openbluetoothadapter = (openBluetoothAdapter) obj;
            Intrinsics.checkNotNullParameter(openbluetoothadapter, "twilioDialogParam");
            if (MultilevelSelectAdapter.getMin(openbluetoothadapter.getDateTimestamp()) || openbluetoothadapter.getDateTimestamp() == -1) {
                MultilevelSelectAdapter.length(this.getMax, openbluetoothadapter.getDismissCount());
            } else {
                this.getMax.length.setMax();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"id/dana/twilio/twiliodialog/TwilioDialogPresenter$saveDontShowAgain$1", "Lid/dana/domain/DefaultObserver;", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class IsOverlapping extends GriverAppVirtualHostProxy<Boolean> {
        IsOverlapping() {
        }
    }

    public final void setMin(boolean z) {
        this.isInside.execute(new IsOverlapping(), new BleAdvertisement.setMax(z));
    }

    public final void getMax() {
        this.getMin.execute(new MultilevelSelectAdapter$FastBitmap$CoordinateSystem(this));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"id/dana/twilio/twiliodialog/TwilioDialogPresenter$getDontShowAgain$1", "Lid/dana/domain/DefaultObserver;", "", "onNext", "", "neverShow", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class equals extends GriverAppVirtualHostProxy<Boolean> {
        final /* synthetic */ MultilevelSelectAdapter setMax;

        equals(MultilevelSelectAdapter multilevelSelectAdapter) {
            this.setMax = multilevelSelectAdapter;
        }

        public final /* synthetic */ void onNext(Object obj) {
            if (!((Boolean) obj).booleanValue()) {
                this.setMax.getMax(true);
            } else {
                this.setMax.length.setMax();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"id/dana/twilio/twiliodialog/TwilioDialogPresenter$checkTwilioEnrollmentFeature$1", "Lid/dana/domain/DefaultObserver;", "", "onNext", "", "enabled", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMin extends GriverAppVirtualHostProxy<Boolean> {
        final /* synthetic */ MultilevelSelectAdapter length;

        getMin(MultilevelSelectAdapter multilevelSelectAdapter) {
            this.length = multilevelSelectAdapter;
        }

        public final /* synthetic */ void onNext(Object obj) {
            if (((Boolean) obj).booleanValue()) {
                MultilevelSelectAdapter multilevelSelectAdapter = this.length;
                multilevelSelectAdapter.setMin.execute(new setMin(multilevelSelectAdapter));
                return;
            }
            this.length.length.setMax();
        }
    }

    public final void length() {
        this.setMax.execute(new getMin(this));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"id/dana/twilio/twiliodialog/TwilioDialogPresenter$checkTwilioEnrollmentStatus$1", "Lid/dana/domain/DefaultObserver;", "", "onNext", "", "enrolled", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMin extends GriverAppVirtualHostProxy<Boolean> {
        final /* synthetic */ MultilevelSelectAdapter getMax;

        setMin(MultilevelSelectAdapter multilevelSelectAdapter) {
            this.getMax = multilevelSelectAdapter;
        }

        public final /* synthetic */ void onNext(Object obj) {
            if (!((Boolean) obj).booleanValue()) {
                MultilevelSelectAdapter multilevelSelectAdapter = this.getMax;
                multilevelSelectAdapter.getMin.execute(new toFloatRange(multilevelSelectAdapter));
                return;
            }
            this.getMax.length.setMax();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"id/dana/twilio/twiliodialog/TwilioDialogPresenter$getProfileSettingModel$1", "Lid/dana/domain/DefaultObserver;", "Lid/dana/domain/profilemenu/model/SettingModel;", "onError", "", "e", "", "onNext", "settingModels", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class isInside extends GriverAppVirtualHostProxy<SettingModel> {
        final /* synthetic */ MultilevelSelectAdapter getMin;

        isInside(MultilevelSelectAdapter multilevelSelectAdapter) {
            this.getMin = multilevelSelectAdapter;
        }

        public final /* synthetic */ void onNext(Object obj) {
            SettingModel settingModel = (SettingModel) obj;
            Intrinsics.checkNotNullParameter(settingModel, "settingModels");
            this.getMin.length.getMax(settingModel);
        }

        public final void onError(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "e");
            MultilevelSelectActivity.AnonymousClass1.setMin unused = this.getMin.length;
            updateActionSheetContent.e(DanaLogConstants.TAG.DEEPLINK_SETTING_MORE_TAG, th.getMessage(), th);
        }
    }

    public final void setMin() {
        this.toFloatRange.execute(new isInside(this), addChooseImageCrossOrigin.setMax.forSettingKey("setting_more"));
    }

    @VisibleForTesting
    public static boolean getMin(long j) {
        return ConfirmPopup.AnonymousClass1.setMin(new Date(), new Date(j)) >= 10;
    }

    public final void setMax() {
        this.setMax.dispose();
        this.getMin.dispose();
        this.IsOverlapping.dispose();
        this.isInside.dispose();
        this.equals.dispose();
        this.setMin.dispose();
        this.toIntRange.dispose();
        this.toFloatRange.dispose();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lid/dana/twilio/twiliodialog/TwilioDialogPresenter$Companion;", "", "()V", "DISPLAY_DONT_SHOW_AGAIN_CHECKBOX", "", "NULL_INT_VALUE", "NULL_LONG_VALUE", "", "TEN_DAYS", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMax {
        private setMax() {
        }

        public /* synthetic */ setMax(byte b) {
            this();
        }
    }

    public static final /* synthetic */ void length(MultilevelSelectAdapter multilevelSelectAdapter, int i) {
        if (i >= 2) {
            multilevelSelectAdapter.equals.execute(new equals(multilevelSelectAdapter));
        } else {
            multilevelSelectAdapter.getMax(false);
        }
    }
}
