package o;

import id.dana.data.foundation.logger.log.DanaLogConstants;
import id.dana.domain.profilemenu.model.SettingModel;
import id.dana.myprofile.MyProfileBundleKey;
import id.dana.richview.profile.RiskResultType;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o.FileMangerBridgeExtension;
import o.addChooseImageCrossOrigin;
import o.handleTinyAppKeyEvent;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 ,2\u00020\u0001:\u0001,BW\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015¢\u0006\u0002\u0010\u0016J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u0018H\u0016J\u0010\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\u0018\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\b\u0010 \u001a\u00020\u0018H\u0016J\b\u0010\u0006\u001a\u00020\u0018H\u0007J.\u0010!\u001a\u00020\u00182\u0006\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u001c2\b\u0010%\u001a\u0004\u0018\u00010\u001c2\b\u0010&\u001a\u0004\u0018\u00010\u001cH\u0016J*\u0010'\u001a\u00020\u00182\u0006\u0010(\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\u0014\u0010)\u001a\u00020\u0018*\u00020*2\u0006\u0010\"\u001a\u00020#H\u0002J\u0014\u0010+\u001a\u00020\u0018*\u00020*2\u0006\u0010\"\u001a\u00020#H\u0002R\u000e\u0010\u0012\u001a\u00020\u0013X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006-"}, d2 = {"Lid/dana/paymentsetting/PaymentSettingPresenter;", "Lid/dana/paymentsetting/PaymentSettingContract$Presenter;", "view", "Lid/dana/paymentsetting/PaymentSettingContract$View;", "paymentSettingCheck", "Lid/dana/domain/paymentsetting/interactor/PaymentSettingCheck;", "savePaymentSettingCheck", "Lid/dana/domain/paymentsetting/interactor/SavePaymentSettingCheck;", "getSettingByKey", "Lid/dana/domain/profilemenu/interactor/GetSettingByKey;", "getAutoRouteInitialSetting", "Lid/dana/domain/autoroute/interactor/GetAutoRouteInitialSetting;", "switchAutoRouting", "Lid/dana/domain/autoroute/interactor/SwitchAutoRouting;", "initPaymentAuthentication", "Lid/dana/domain/profilemenu/interactor/InitPaymentAuthentication;", "paymentSecurityInitMapper", "Lid/dana/myprofile/mapper/PaymentSecurityInitMapper;", "controlSwitchPaymentAuthentication", "Lid/dana/domain/profilemenu/interactor/ControlSwitchPaymentAuthentication;", "paymentSecuritySwitchMapper", "Lid/dana/myprofile/mapper/PaymentSecuritySwitchMapper;", "(Lid/dana/paymentsetting/PaymentSettingContract$View;Lid/dana/domain/paymentsetting/interactor/PaymentSettingCheck;Lid/dana/domain/paymentsetting/interactor/SavePaymentSettingCheck;Lid/dana/domain/profilemenu/interactor/GetSettingByKey;Lid/dana/domain/autoroute/interactor/GetAutoRouteInitialSetting;Lid/dana/domain/autoroute/interactor/SwitchAutoRouting;Lid/dana/domain/profilemenu/interactor/InitPaymentAuthentication;Lid/dana/myprofile/mapper/PaymentSecurityInitMapper;Lid/dana/domain/profilemenu/interactor/ControlSwitchPaymentAuthentication;Lid/dana/myprofile/mapper/PaymentSecuritySwitchMapper;)V", "checkPaymentSetting", "", "getAutoRouteInitialState", "getProfileSettingModel", "actionClick", "", "initPaymentAuth", "settingModel", "Lid/dana/domain/profilemenu/model/SettingModel;", "onDestroy", "switchAutoRouteState", "autoroute", "", "authenticationType", "securityId", "validateData", "switchPaymentAuth", "authenticationStatus", "processResult", "Lid/dana/domain/autoroute/model/UserAutoRouteConfigSwitch;", "processRiskResult", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class uploadFileByHttp implements FileMangerBridgeExtension.AnonymousClass1.getMax {
    @NotNull
    public static final length getMax = new length((byte) 0);
    private final handleTinyAppKeyEvent IsOverlapping;
    /* access modifiers changed from: private */
    public final showPopupWindowToast equals;
    private final getWebViewSettings getMin;
    private final setToolbarMenu isInside;
    private final addChooseImageCrossOrigin length;
    final APWebMessage setMax;
    /* access modifiers changed from: private */
    public final FileMangerBridgeExtension.AnonymousClass1.length setMin;
    /* access modifiers changed from: private */
    public final showSysToast toDoubleRange;
    private final getIconDrawable toFloatRange;
    private final isWebWorkerSupported toIntRange;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lid/dana/domain/autoroute/model/UserAutoRouteConfigSwitch;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class IsOverlapping extends Lambda implements Function1<GriverGeoLocationExtension, Unit> {
        final /* synthetic */ boolean $autoroute;
        final /* synthetic */ uploadFileByHttp this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        IsOverlapping(uploadFileByHttp uploadfilebyhttp, boolean z) {
            super(1);
            this.this$0 = uploadfilebyhttp;
            this.$autoroute = z;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((GriverGeoLocationExtension) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull GriverGeoLocationExtension griverGeoLocationExtension) {
            Intrinsics.checkNotNullParameter(griverGeoLocationExtension, "it");
            this.this$0.setMin.dismissProgress();
            uploadFileByHttp.getMax(this.this$0, griverGeoLocationExtension, this.$autoroute);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class equals extends Lambda implements Function1<Throwable, Unit> {
        public static final equals INSTANCE = new equals();

        equals() {
            super(1);
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "it");
            updateActionSheetContent.e(DanaLogConstants.TAG.PAYMENT_SETTING_TAG, th.getMessage(), th);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class getMax extends Lambda implements Function1<Throwable, Unit> {
        public static final getMax INSTANCE = new getMax();

        getMax() {
            super(1);
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "it");
            updateActionSheetContent.e(DanaLogConstants.TAG.PAYMENT_SETTING_TAG, th.getMessage(), th);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class getMin extends Lambda implements Function1<Boolean, Unit> {
        final /* synthetic */ uploadFileByHttp this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        getMin(uploadFileByHttp uploadfilebyhttp) {
            super(1);
            this.this$0 = uploadfilebyhttp;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            invoke(((Boolean) obj).booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z) {
            this.this$0.setMin.getMin(z);
            this.this$0.setMax.execute(onReceivedIcon.INSTANCE, toIntRange.INSTANCE, equals.INSTANCE);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lid/dana/domain/autoroute/model/AutoRouteInit;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class setMax extends Lambda implements Function1<GriverButtonStyleExtension, Unit> {
        final /* synthetic */ uploadFileByHttp this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        setMax(uploadFileByHttp uploadfilebyhttp) {
            super(1);
            this.this$0 = uploadfilebyhttp;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((GriverButtonStyleExtension) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull GriverButtonStyleExtension griverButtonStyleExtension) {
            Intrinsics.checkNotNullParameter(griverButtonStyleExtension, "it");
            Boolean autorouteAssetExist = griverButtonStyleExtension.getAutorouteAssetExist();
            boolean z = false;
            boolean booleanValue = autorouteAssetExist != null ? autorouteAssetExist.booleanValue() : false;
            Boolean autorouteConfigEnable = griverButtonStyleExtension.getAutorouteConfigEnable();
            if (autorouteConfigEnable != null) {
                z = autorouteConfigEnable.booleanValue();
            }
            if (booleanValue && z) {
                this.this$0.setMin.getMax();
            } else if (!booleanValue || z) {
                this.this$0.setMin.setMin();
            } else {
                this.this$0.setMin.setMin(griverButtonStyleExtension.getAuthenticationSettingOptions());
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class setMin extends Lambda implements Function1<Throwable, Unit> {
        final /* synthetic */ uploadFileByHttp this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        setMin(uploadFileByHttp uploadfilebyhttp) {
            super(1);
            this.this$0 = uploadfilebyhttp;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "it");
            this.this$0.setMin.setMax();
            updateActionSheetContent.e(DanaLogConstants.TAG.PAYMENT_SETTING_TAG, th.getMessage(), th);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class toIntRange extends Lambda implements Function1<Boolean, Unit> {
        public static final toIntRange INSTANCE = new toIntRange();

        toIntRange() {
            super(1);
        }

        public final void invoke(boolean z) {
        }

        public final /* synthetic */ Object invoke(Object obj) {
            invoke(((Boolean) obj).booleanValue());
            return Unit.INSTANCE;
        }
    }

    @Inject
    public uploadFileByHttp(@NotNull FileMangerBridgeExtension.AnonymousClass1.length length2, @NotNull getWebViewSettings getwebviewsettings, @NotNull APWebMessage aPWebMessage, @NotNull addChooseImageCrossOrigin addchooseimagecrossorigin, @NotNull setToolbarMenu settoolbarmenu, @NotNull getIconDrawable geticondrawable, @NotNull isWebWorkerSupported iswebworkersupported, @NotNull showPopupWindowToast showpopupwindowtoast, @NotNull handleTinyAppKeyEvent handletinyappkeyevent, @NotNull showSysToast showsystoast) {
        Intrinsics.checkNotNullParameter(length2, "view");
        Intrinsics.checkNotNullParameter(getwebviewsettings, "paymentSettingCheck");
        Intrinsics.checkNotNullParameter(aPWebMessage, "savePaymentSettingCheck");
        Intrinsics.checkNotNullParameter(addchooseimagecrossorigin, "getSettingByKey");
        Intrinsics.checkNotNullParameter(settoolbarmenu, "getAutoRouteInitialSetting");
        Intrinsics.checkNotNullParameter(geticondrawable, "switchAutoRouting");
        Intrinsics.checkNotNullParameter(iswebworkersupported, "initPaymentAuthentication");
        Intrinsics.checkNotNullParameter(showpopupwindowtoast, "paymentSecurityInitMapper");
        Intrinsics.checkNotNullParameter(handletinyappkeyevent, "controlSwitchPaymentAuthentication");
        Intrinsics.checkNotNullParameter(showsystoast, "paymentSecuritySwitchMapper");
        this.setMin = length2;
        this.getMin = getwebviewsettings;
        this.setMax = aPWebMessage;
        this.length = addchooseimagecrossorigin;
        this.isInside = settoolbarmenu;
        this.toFloatRange = geticondrawable;
        this.toIntRange = iswebworkersupported;
        this.equals = showpopupwindowtoast;
        this.IsOverlapping = handletinyappkeyevent;
        this.toDoubleRange = showsystoast;
    }

    public final void length() {
        this.getMin.execute(onReceivedIcon.INSTANCE, new getMin(this), getMax.INSTANCE);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"id/dana/paymentsetting/PaymentSettingPresenter$getProfileSettingModel$1", "Lid/dana/domain/DefaultObserver;", "Lid/dana/domain/profilemenu/model/SettingModel;", "onError", "", "e", "", "onNext", "settingModels", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class toFloatRange extends GriverAppVirtualHostProxy<SettingModel> {
        final /* synthetic */ String length;
        final /* synthetic */ uploadFileByHttp setMax;

        toFloatRange(uploadFileByHttp uploadfilebyhttp, String str) {
            this.setMax = uploadfilebyhttp;
            this.length = str;
        }

        public final /* synthetic */ void onNext(Object obj) {
            SettingModel settingModel = (SettingModel) obj;
            Intrinsics.checkNotNullParameter(settingModel, "settingModels");
            if (Intrinsics.areEqual((Object) this.length, (Object) "SWITCH_AOUTOROUTE_ON")) {
                this.setMax.setMin.getMin(settingModel);
            } else {
                this.setMax.setMin.getMax(settingModel);
            }
        }

        public final void onError(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "e");
            this.setMax.setMin.getMax(this.length);
            updateActionSheetContent.e(DanaLogConstants.TAG.PAYMENT_SETTING_TAG, th.getMessage(), th);
        }
    }

    public final void length(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "actionClick");
        this.length.execute(new toFloatRange(this, str), addChooseImageCrossOrigin.setMax.forSettingKey("setting_more"));
    }

    public final void getMin() {
        this.isInside.execute(Unit.INSTANCE, new setMax(this), new setMin(this));
    }

    public final void setMin(@Nullable String str) {
        this.setMin.showProgress();
        GriverTitleBarCreatedEvent griverTitleBarCreatedEvent = new GriverTitleBarCreatedEvent((Boolean) null, (String) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null);
        griverTitleBarCreatedEvent.setAutoroute(Boolean.TRUE);
        griverTitleBarCreatedEvent.setAuthenticationType(str);
        griverTitleBarCreatedEvent.setSecurityId((String) null);
        griverTitleBarCreatedEvent.setValidateData((String) null);
        this.toFloatRange.execute(griverTitleBarCreatedEvent, new IsOverlapping(this, true), new uploadFileByHttp$FastBitmap$CoordinateSystem(this));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"id/dana/paymentsetting/PaymentSettingPresenter$initPaymentAuth$1", "Lid/dana/domain/DefaultObserver;", "Lid/dana/domain/profilemenu/model/PaymentSecurityInit;", "onError", "", "throwable", "", "onNext", "paymentSecurityInit", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class isInside extends GriverAppVirtualHostProxy<getSharedPreference> {
        final /* synthetic */ String getMin;
        final /* synthetic */ uploadFileByHttp length;
        final /* synthetic */ SettingModel setMax;

        isInside(uploadFileByHttp uploadfilebyhttp, String str, SettingModel settingModel) {
            this.length = uploadfilebyhttp;
            this.getMin = str;
            this.setMax = settingModel;
        }

        public final /* synthetic */ void onNext(Object obj) {
            getSharedPreference getsharedpreference = (getSharedPreference) obj;
            Intrinsics.checkNotNullParameter(getsharedpreference, "paymentSecurityInit");
            this.length.setMin.dismissProgress();
            this.length.setMin.length((showTime) this.length.equals.apply(getsharedpreference), this.getMin, this.setMax);
        }

        public final void onError(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "throwable");
            this.length.setMin.dismissProgress();
            this.length.setMin.setMin(this.getMin, this.setMax);
            updateActionSheetContent.e(DanaLogConstants.TAG.PAYMENT_SETTING_TAG, th.getMessage(), th);
        }
    }

    public final void getMin(@NotNull String str, @NotNull SettingModel settingModel) {
        int length2 = str != null ? str.length() : 0;
        int max = dispatchOnCancelled.setMax(length2);
        if (length2 != max) {
            onCanceled oncanceled = new onCanceled(length2, max, 1);
            onCancelLoad.setMax(-1075538711, oncanceled);
            onCancelLoad.getMin(-1075538711, oncanceled);
        }
        Intrinsics.checkNotNullParameter(str, "actionClick");
        Intrinsics.checkNotNullParameter(settingModel, MyProfileBundleKey.SETTING_MODEL);
        this.setMin.showProgress();
        this.toIntRange.execute(new isInside(this, str, settingModel));
    }

    public final void length(boolean z, @Nullable String str, @NotNull String str2, @NotNull SettingModel settingModel) {
        Intrinsics.checkNotNullParameter(str2, "actionClick");
        Intrinsics.checkNotNullParameter(settingModel, MyProfileBundleKey.SETTING_MODEL);
        this.setMin.showProgress();
        this.IsOverlapping.execute(new toString(this, str2, settingModel), handleTinyAppKeyEvent.getMin.forPaymentSecuritySwitchOn(z, str));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"id/dana/paymentsetting/PaymentSettingPresenter$switchPaymentAuth$1", "Lid/dana/domain/DefaultObserver;", "Lid/dana/domain/profilemenu/model/PaymentSecuritySwitch;", "onError", "", "throwable", "", "onNext", "paymentSecuritySwitch", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class toString extends GriverAppVirtualHostProxy<getUid> {
        final /* synthetic */ String getMax;
        final /* synthetic */ SettingModel length;
        final /* synthetic */ uploadFileByHttp setMin;

        toString(uploadFileByHttp uploadfilebyhttp, String str, SettingModel settingModel) {
            this.setMin = uploadfilebyhttp;
            this.getMax = str;
            this.length = settingModel;
        }

        public final /* synthetic */ void onNext(Object obj) {
            getUid getuid = (getUid) obj;
            Intrinsics.checkNotNullParameter(getuid, "paymentSecuritySwitch");
            this.setMin.setMin.dismissProgress();
            getWebViewType risk = getuid.getRisk();
            Intrinsics.checkNotNullExpressionValue(risk, "paymentSecuritySwitch.risk");
            if (Intrinsics.areEqual((Object) RiskResultType.ACCEPT, (Object) risk.getResult())) {
                this.setMin.setMin.length(this.getMax, this.length, true);
            } else {
                this.setMin.setMin.setMax((PopupWindowToast) this.setMin.toDoubleRange.apply(getuid), this.getMax, this.length);
            }
        }

        public final void onError(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "throwable");
            this.setMin.setMin.dismissProgress();
            this.setMin.setMin.length(this.getMax, this.length, false);
            updateActionSheetContent.e(DanaLogConstants.TAG.PAYMENT_SETTING_TAG, th.getMessage(), th);
        }
    }

    public final void setMax() {
        this.getMin.dispose();
        this.setMax.dispose();
        this.length.dispose();
        this.isInside.dispose();
        this.toFloatRange.dispose();
        this.toIntRange.dispose();
        this.IsOverlapping.dispose();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lid/dana/paymentsetting/PaymentSettingPresenter$Companion;", "", "()V", "SWITCH_AOUTOROUTE_ON", "", "SWITCH_PAYMENT_AUTH_OFF", "SWITCH_PAYMENT_AUTH_ON", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class length {
        private length() {
        }

        public /* synthetic */ length(byte b) {
            this();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0024, code lost:
        if (r0.equals(id.dana.richview.profile.RiskResultType.ACCEPT) == false) goto L_0x0057;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final /* synthetic */ void getMax(o.uploadFileByHttp r3, o.GriverGeoLocationExtension r4, boolean r5) {
        /*
            o.GriverBackHomeButtonStyleExtension r0 = r4.getRiskResult()
            if (r0 == 0) goto L_0x000b
            java.lang.String r0 = r0.getResult()
            goto L_0x000c
        L_0x000b:
            r0 = 0
        L_0x000c:
            if (r0 != 0) goto L_0x000f
            goto L_0x0026
        L_0x000f:
            int r1 = r0.hashCode()
            r2 = 832880155(0x31a4be1b, float:4.7946407E-9)
            if (r1 == r2) goto L_0x002c
            r4 = 1924835592(0x72baa908, float:7.3943754E30)
            if (r1 == r4) goto L_0x001e
            goto L_0x0057
        L_0x001e:
            java.lang.String r4 = "ACCEPT"
            boolean r4 = r0.equals(r4)
            if (r4 == 0) goto L_0x0057
        L_0x0026:
            o.FileMangerBridgeExtension$1$length r3 = r3.setMin
            r3.getMin()
            return
        L_0x002c:
            java.lang.String r1 = "VERIFICATION"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0057
            o.GriverBackHomeButtonStyleExtension r0 = r4.getRiskResult()
            java.lang.String r1 = ""
            if (r0 == 0) goto L_0x0042
            java.lang.String r0 = r0.getSecurityId()
            if (r0 != 0) goto L_0x0043
        L_0x0042:
            r0 = r1
        L_0x0043:
            o.onGeolocationPermissionsShowPrompt r4 = r4.getSecurityContextResult()
            if (r4 == 0) goto L_0x0051
            java.lang.String r4 = r4.getPubKey()
            if (r4 != 0) goto L_0x0050
            goto L_0x0051
        L_0x0050:
            r1 = r4
        L_0x0051:
            o.FileMangerBridgeExtension$1$length r3 = r3.setMin
            r3.getMin(r5, r0, r1)
            return
        L_0x0057:
            o.FileMangerBridgeExtension$1$length r3 = r3.setMin
            r3.setMax()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.uploadFileByHttp.getMax(o.uploadFileByHttp, o.GriverGeoLocationExtension, boolean):void");
    }
}
