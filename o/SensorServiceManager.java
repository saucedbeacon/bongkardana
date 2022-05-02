package o;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.ap.zoloz.hummer.biz.HummerConstants;
import com.appsflyer.AFInAppEventType;
import id.dana.constants.AnalyticEventConstant;
import id.dana.data.foundation.logger.log.DanaLogConstants;
import id.dana.tracker.TrackerKey;
import id.dana.tracker.constant.TrackerType;
import id.dana.tracker.spm.SpmTagConstant;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import o.SensorBridgeExtension;
import o.convertDipToPx;
import o.getTypefaceByCat;
import o.setHardwareEqualityEnforced;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B/\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u0010\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u000eH\u0002J\b\u0010\u0015\u001a\u00020\u0012H\u0016J:\u0010\u0016\u001a\u00020\u00122\b\u0010\u0017\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0018\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u000e2\b\u0010\u001c\u001a\u0004\u0018\u00010\u000eH\u0016J\b\u0010\u001d\u001a\u00020\u0012H\u0002J\u0012\u0010\u001e\u001a\u00020\u00122\b\u0010\u0017\u001a\u0004\u0018\u00010\u000eH\u0002J\u0010\u0010\u001f\u001a\u00020\u00122\u0006\u0010 \u001a\u00020\u000eH\u0002J\b\u0010!\u001a\u00020\u0012H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u00020\u000e8BX\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00128BX\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u0013R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lid/dana/onboarding/confirmpin/ConfirmPinPresenter;", "Lid/dana/onboarding/confirmpin/ConfirmPinContract$Presenter;", "context", "Landroid/content/Context;", "view", "Lid/dana/onboarding/confirmpin/ConfirmPinContract$View;", "createProfile", "Lid/dana/domain/registration/interactor/CreateProfile;", "deviceInformationProvider", "Lid/dana/data/config/DeviceInformationProvider;", "getUserId", "Lid/dana/domain/account/interactor/GetUserId;", "(Landroid/content/Context;Lid/dana/onboarding/confirmpin/ConfirmPinContract$View;Lid/dana/domain/registration/interactor/CreateProfile;Lid/dana/data/config/DeviceInformationProvider;Lid/dana/domain/account/interactor/GetUserId;)V", "phoneNumberTag", "", "getPhoneNumberTag", "()Ljava/lang/String;", "userId", "", "()Lkotlin/Unit;", "initEventConfig", "onDestroy", "register", "phoneNumber", "nickname", "avatarFile", "Ljava/io/File;", "pin", "referralCode", "trackCompleteRegistration", "trackFailedRegistration", "trackRegistrationExceptionLog", "errorMessage", "trackRegistrationPinConfirmEvent", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class SensorServiceManager implements SensorBridgeExtension.AnonymousClass4.length {
    /* access modifiers changed from: private */
    public final Context getMax;
    private final GriverCreateDialogParam getMin;
    /* access modifiers changed from: private */
    public final SensorBridgeExtension.AnonymousClass4.getMax length;
    private final setHardwareEqualityEnforced setMax;
    private final getPerformanceTracker setMin;

    @Inject
    public SensorServiceManager(@NotNull Context context, @NotNull SensorBridgeExtension.AnonymousClass4.getMax getmax, @NotNull setHardwareEqualityEnforced sethardwareequalityenforced, @NotNull getPerformanceTracker getperformancetracker, @NotNull GriverCreateDialogParam griverCreateDialogParam) {
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        Intrinsics.checkNotNullParameter(getmax, "view");
        Intrinsics.checkNotNullParameter(sethardwareequalityenforced, "createProfile");
        Intrinsics.checkNotNullParameter(getperformancetracker, "deviceInformationProvider");
        Intrinsics.checkNotNullParameter(griverCreateDialogParam, "getUserId");
        this.getMax = context;
        this.length = getmax;
        this.setMax = sethardwareequalityenforced;
        this.setMin = getperformancetracker;
        this.getMin = griverCreateDialogParam;
    }

    public final void length(@Nullable String str, @Nullable String str2, @Nullable File file, @Nullable String str3, @Nullable String str4) {
        this.length.showProgress();
        convertDipToPx.length length2 = new convertDipToPx.length(this.getMax);
        length2.getMax = TrackerKey.Event.REGISTRATION_PIN_CONFIRM;
        length2.setMin();
        convertDipToPx convertdiptopx = new convertDipToPx(length2, (byte) 0);
        List length3 = convertdiptopx.length != null ? convertdiptopx.length.length : new ArrayList();
        genTextSelector.setMax((convertSpToPx[]) length3.toArray(new convertSpToPx[length3.size()]));
        this.setMax.execute(new setMax(this, str), setHardwareEqualityEnforced.getMin.forCreateProfile(str, str3, str2, file, str4));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"id/dana/onboarding/confirmpin/ConfirmPinPresenter$register$1", "Lid/dana/domain/DefaultObserver;", "", "onError", "", "e", "", "onNext", "isRegistrationSuccess", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMax extends GriverAppVirtualHostProxy<Boolean> {
        final /* synthetic */ String getMin;
        final /* synthetic */ SensorServiceManager setMin;

        setMax(SensorServiceManager sensorServiceManager, String str) {
            this.setMin = sensorServiceManager;
            this.getMin = str;
        }

        public final /* synthetic */ void onNext(Object obj) {
            boolean booleanValue = ((Boolean) obj).booleanValue();
            this.setMin.length.dismissProgress();
            if (booleanValue) {
                this.setMin.length.getMin();
                Unit unused = this.setMin.getMin.execute(new setMin(this.setMin));
                return;
            }
            SensorServiceManager.setMax(this.setMin, this.getMin);
            StringBuilder sb = new StringBuilder("registration failed!");
            sb.append(this.getMin);
            updateActionSheetContent.exception(DanaLogConstants.TAG.REGISTER_TAG, DanaLogConstants.Prefix.CONFIRM_PIN_REGISTER_PREFIX, sb.toString());
        }

        public final void onError(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "e");
            this.setMin.length.dismissProgress();
            this.setMin.length.onError(makeCenterView.length(this.setMin.getMax, th));
            SensorServiceManager.setMax(this.setMin, this.getMin);
            StringBuilder sb = new StringBuilder("register error: ");
            sb.append(this.getMin);
            sb.append(th);
            updateActionSheetContent.exception(DanaLogConstants.TAG.REGISTER_TAG, DanaLogConstants.Prefix.CONFIRM_PIN_REGISTER_PREFIX, sb.toString());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"id/dana/onboarding/confirmpin/ConfirmPinPresenter$userId$1", "Lid/dana/domain/DefaultObserver;", "", "onNext", "", "userId", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMin extends GriverAppVirtualHostProxy<String> {
        final /* synthetic */ SensorServiceManager setMin;

        setMin(SensorServiceManager sensorServiceManager) {
            this.setMin = sensorServiceManager;
        }

        public final /* synthetic */ void onNext(Object obj) {
            String str = (String) obj;
            Intrinsics.checkNotNullParameter(str, "userId");
            if (!TextUtils.isEmpty(str)) {
                SensorServiceManager.getMin(this.setMin, str);
                SensorServiceManager.getMin(this.setMin);
            }
        }
    }

    public final void setMax() {
        this.setMax.dispose();
        this.getMin.dispose();
    }

    public static final /* synthetic */ void setMax(SensorServiceManager sensorServiceManager, String str) {
        new HashMap().put(SpmTagConstant.REGISTRATION.TAG_PHONE_NUMBER, str);
        Map hashMap = new HashMap();
        hashMap.put(SpmTagConstant.REGISTRATION.TAG_PHONE_NUMBER, str);
        hashMap.put("UTDID", sensorServiceManager.setMin.getDeviceUtdId());
        Bundle bundle = new Bundle();
        bundle.putString(SpmTagConstant.REGISTRATION.TAG_PHONE_NUMBER, str);
        bundle.putString("UTDID", sensorServiceManager.setMin.getDeviceUtdId());
        genTextSelector.setMax(new setWidth(sensorServiceManager.getMax, AnalyticEventConstant.AE_FAILED_REGISTRATION, hashMap), new AUBubbleDrawable(sensorServiceManager.getMax, AnalyticEventConstant.AE_FAILED_REGISTRATION, hashMap), new getActivityByContext(sensorServiceManager.getMax, AnalyticEventConstant.AE_FAILED_REGISTRATION, bundle));
    }

    public static final /* synthetic */ void getMin(SensorServiceManager sensorServiceManager, String str) {
        getTypefaceByCat.setMin setmin = new getTypefaceByCat.setMin();
        setmin.getMax = sensorServiceManager.getMax;
        setmin.setMin = str;
        setmin.setMax = sensorServiceManager.setMin.getCurrentTrackerId();
        for (getTypeface max : judgeRes.getMin(new getTypefaceByCat(setmin.setMin("KYC0"), (byte) 0), sensorServiceManager.setMin, TrackerType.APPSFLYER, TrackerType.BRANCH, TrackerType.MIXPANEL)) {
            max.setMax();
        }
    }

    public static final /* synthetic */ void getMin(SensorServiceManager sensorServiceManager) {
        Map hashMap = new HashMap();
        String deviceUtdId = sensorServiceManager.setMin.getDeviceUtdId();
        Intrinsics.checkNotNullExpressionValue(deviceUtdId, "deviceInformationProvider.deviceUtdId");
        hashMap.put("UTDID", deviceUtdId);
        Bundle bundle = new Bundle();
        bundle.putString("UTDID", sensorServiceManager.setMin.getDeviceUtdId());
        genTextSelector.setMax(new setWidth(sensorServiceManager.getMax, AFInAppEventType.COMPLETE_REGISTRATION, hashMap), new getActivityByContext(sensorServiceManager.getMax, AFInAppEventType.COMPLETE_REGISTRATION, bundle));
    }
}
