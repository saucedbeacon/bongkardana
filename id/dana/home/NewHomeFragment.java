package id.dana.home;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.core.widget.NestedScrollView;
import androidx.lifecycle.LiveData;
import butterknife.BindView;
import butterknife.OnClick;
import id.dana.R;
import id.dana.appwidget.DanaQuickActionMediumWidgetProvider;
import id.dana.appwidget.DanaQuickActionWidgetProvider;
import id.dana.component.buttoncomponent.DanaButtonSecondaryView;
import id.dana.danah5.DanaH5;
import id.dana.dialog.DialogPermission;
import id.dana.domain.usereducation.BottomSheetOnBoardingScenario;
import id.dana.globalnetwork.currency.CurrencySwitchRichView;
import id.dana.globalnetwork.view.OnboardingGlobalNetworkSheetActivity;
import id.dana.home.HomeFragment;
import id.dana.home.NewHomeFragment;
import id.dana.home.tab.HomeTabFragment;
import id.dana.home.view.GridMenuView;
import id.dana.home.view.SavedCardIndicatorLottieAnimationView;
import id.dana.investment.view.HomeInvestmentView;
import id.dana.model.CurrencyAmountModel;
import id.dana.model.GnContentModel;
import id.dana.nearbyme.NewNearbyMeView;
import id.dana.nearbyme.merchantreview.MerchantReviewDialogFragment;
import id.dana.nearbyme.merchantreview.model.MerchantConsultReviewModel;
import id.dana.notification.NotificationData;
import id.dana.notification.RedirectType;
import id.dana.oauth.MatchPhoneNumberDialog;
import id.dana.onboarding.OnboardingParams;
import id.dana.pay.PayCardInfo;
import id.dana.promoquest.views.MissionSummaryView;
import id.dana.requestmoney.RequestMoneyActivity;
import id.dana.richview.LoadingLottieAnimationView;
import id.dana.richview.NewPromoBannerView;
import id.dana.richview.SurveyView;
import id.dana.richview.homereferral.HomeReferralView;
import id.dana.richview.moreforyou.MoreForYouView;
import id.dana.richview.servicescard.NewServiceCardView;
import id.dana.sendmoney.RecipientActivity;
import id.dana.sendmoney_v2.landing.SendMoneyActivity;
import id.dana.social.view.NewSocialWidgetView;
import id.dana.tracker.TrackerKey;
import id.dana.tracker.mixpanel.TopupSource;
import in.srain.cube.views.ptr.PtrClassicFrameLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import javax.inject.Inject;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.BLEBridgeExtension;
import o.CascadingMenuPopup$HorizPosition;
import o.CornerMarkingDataProvider;
import o.CustomPopMenuExtension;
import o.DecodeWrapper;
import o.DefaultBlueToothProxy;
import o.FtsOptions$Order;
import o.GriverManifest;
import o.GriverResourceLoadExtension;
import o.InputBridgeExtension;
import o.LoadingBridgeExtension;
import o.PhotoView;
import o.TinyAppHostApduService;
import o.VersionedParcelize;
import o.ViewPager2;
import o.access$1402;
import o.access$1602;
import o.dispatchOnCancelled;
import o.fakeDragBy;
import o.getAlpha;
import o.getEnv;
import o.getMaxTextureSize;
import o.getSelectedIndex;
import o.getShortName;
import o.getStartDelay;
import o.getUseAmcsLite;
import o.getUseSecurityGuard;
import o.h5PageReload;
import o.inTransaction;
import o.initUC7zSo;
import o.isAlipayApp;
import o.isNfcEnable;
import o.isShowMenu;
import o.observedEntities;
import o.onCancelLoad;
import o.onCanceled;
import o.onFailure;
import o.onMeasure;
import o.onNext;
import o.parameters;
import o.resetTouch;
import o.restoreState;
import o.setAcParams;
import o.setCancelOnTouchOutside$core;
import o.setLineVisible;
import o.setStateOn;
import o.setUseAmcsLite;
import o.setUseSecurityGuard;
import org.jetbrains.annotations.Nullable;

public class NewHomeFragment extends FtsOptions$Order implements access$1602 {
    public static final int getMin = ((int) (Resources.getSystem().getDisplayMetrics().density * 36.0f));
    private static final int setMax = ((int) (Resources.getSystem().getDisplayMetrics().density * 29.0f));
    public static final int setMin = CornerMarkingDataProvider.AnonymousClass2.setMax();
    /* access modifiers changed from: private */
    public DialogPermission FastBitmap$CoordinateSystem;
    /* access modifiers changed from: private */
    public String Grayscale$Algorithm;
    private boolean IsOverlapping;
    /* access modifiers changed from: private */
    public MatchPhoneNumberDialog Mean$Arithmetic;
    @BindView(2131362068)
    DanaButtonSecondaryView btnDanaProtectionMainButton;
    @BindView(2131362618)
    CurrencySwitchRichView currencySwitch;
    @BindView(2131365627)
    TextView currencyTv;
    @Inject
    public getShortName dynamicUrlWrapper;
    private final HomeFragment.length equals;
    @BindView(2131362819)
    EditText etGlobalSearchToolbar;
    @Inject
    public BLEBridgeExtension.AnonymousClass9 geoFenceManager;
    @Inject
    public BLEBridgeExtension.AnonymousClass6 geofencePresenter;
    @Inject
    public parameters.setMax getBalancePresenter;
    @Inject
    public onNext.setMin globalNetworkPresenter;
    @Inject
    public getAlpha.length globalSearchPresenter;
    @BindView(2131363010)
    public GridMenuView gmvRequest;
    @BindView(2131363011)
    public GridMenuView gmvScan;
    @BindView(2131363012)
    public GridMenuView gmvSend;
    @BindView(2131363013)
    public GridMenuView gmvTopup;
    private GriverResourceLoadExtension.AnonymousClass1 hashCode;
    @Inject
    public VersionedParcelize.getMax homeInfoContractPresenter;
    @BindView(2131365880)
    HomeInvestmentView homeInvestmentView;
    @BindView(2131365881)
    HomeReferralView homeReferralView;
    @BindView(2131364053)
    ImageView inboxMenuBar;
    /* access modifiers changed from: private */
    public GriverManifest.AnonymousClass53 invoke;
    private String invokeSuspend;
    /* access modifiers changed from: private */
    public DefaultBlueToothProxy isInside;
    @BindView(2131363722)
    SavedCardIndicatorLottieAnimationView lavSavedCardIndicator;
    @BindView(2131363902)
    LinearLayout llPayContent;
    @Inject
    public isAlipayApp locationPermissionSubject;
    @Inject
    public inTransaction.getMax logoutPresenter;
    @BindView(2131365928)
    MissionSummaryView missionSummaryView;
    @BindView(2131365901)
    MoreForYouView moreForYouView;
    @BindView(2131365904)
    NewNearbyMeView nearbyMeView;
    @BindView(2131364145)
    NestedScrollView nestedScrollView;
    @Inject
    public getSelectedIndex.length onBoardingPresenter;
    /* access modifiers changed from: private */
    public Integer onNavigationEvent;
    @Inject
    public resetTouch ottVerifyPresenter;
    @Inject
    public ViewPager2.OffscreenPageLimit.length permissionStatePresenter;
    @BindView(2131361930)
    NewPromoBannerView promoBannerView;
    @BindView(2131364301)
    PtrClassicFrameLayout ptrHome;
    @Inject
    public fakeDragBy.length queryPayMethodPresenter;
    @Inject
    public onFailure.getMin sendMoneyV2Presenter;
    @BindView(2131365952)
    NewServiceCardView serviceCardView;
    @Inject
    public CustomPopMenuExtension sessionExpiredManager;
    @BindView(2131365960)
    NewSocialWidgetView socialWidgetView;
    @BindView(2131365968)
    SurveyView surveyView;
    /* access modifiers changed from: private */
    public setStateOn toDoubleRange;
    private setStateOn toFloatRange;
    /* access modifiers changed from: private */
    public boolean toIntRange;
    /* access modifiers changed from: private */
    public LoadingLottieAnimationView toString;
    @BindView(2131365119)
    TextView tvBalance;
    @BindView(2131365291)
    TextView tvHiddenPayContent;
    @Inject
    public restoreState.length unreadInboxPresenter;
    private GriverManifest.AnonymousClass36 valueOf;
    /* access modifiers changed from: private */
    public boolean values;
    @BindView(2131365843)
    View viewBalanceClickArea;

    public final int setMin() {
        return R.layout.new_fragment_home;
    }

    static /* synthetic */ void getMax(NewHomeFragment newHomeFragment, boolean z, String str, boolean z2, String str2) {
        int i;
        boolean z3 = false;
        if (str != null) {
            i = str.length();
        } else {
            i = 0;
        }
        int max = dispatchOnCancelled.setMax(i);
        if (i != max) {
            onCanceled oncanceled = new onCanceled(i, max, 1);
            onCancelLoad.setMax(1331090654, oncanceled);
            onCancelLoad.getMin(1331090654, oncanceled);
        }
        if (z2 && !str2.equals("ID")) {
            z3 = true;
        }
        if (z || z3) {
            String str3 = z ? OnboardingParams.FIRST_TIME_TOP_UP : "&countryCode=";
            if (z3) {
                StringBuilder sb = new StringBuilder();
                sb.append(str3);
                if (z) {
                    str2 = "&countryCode=".concat(String.valueOf(str2));
                }
                sb.append(str2);
                str3 = sb.toString();
            }
            str = isShowMenu.getMin(str, str3);
        }
        DanaH5.startContainerFullUrl(str, new setCancelOnTouchOutside$core() {
            public final void onContainerCreated(Bundle bundle) {
            }

            public final void onContainerDestroyed(Bundle bundle) {
                NewHomeFragment.this.o_();
            }
        });
    }

    public NewHomeFragment() {
        this((HomeFragment.length) null);
    }

    private NewHomeFragment(HomeFragment.length length) {
        this.equals = length;
    }

    public static NewHomeFragment setMin(HomeFragment.length length) {
        return new NewHomeFragment(length);
    }

    /* JADX WARNING: Removed duplicated region for block: B:73:0x0398  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x03b3  */
    /* JADX WARNING: Removed duplicated region for block: B:97:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setMax() {
        /*
            r13 = this;
            java.lang.String r0 = "FCMPush"
            androidx.fragment.app.FragmentActivity r1 = r13.getActivity()
            if (r1 != 0) goto L_0x0009
            return
        L_0x0009:
            o.onFinishInflate r1 = new o.onFinishInflate
            androidx.fragment.app.FragmentActivity r2 = r13.getActivity()
            o.onFinishInflate$setMin r3 = new o.onFinishInflate$setMin
            r3.<init>()
            r1.<init>((o.ListMenuItemView) r2, (o.onFinishInflate.setMax) r3)
            java.lang.Class<o.GriverManifest$36> r2 = o.GriverManifest.AnonymousClass36.class
            o.setGroupDividerEnabled r1 = r1.setMax(r2)
            o.GriverManifest$36 r1 = (o.GriverManifest.AnonymousClass36) r1
            r13.valueOf = r1
            androidx.fragment.app.FragmentActivity r1 = r13.getActivity()
            id.dana.home.HomeTabActivity r1 = (id.dana.home.HomeTabActivity) r1
            o.GriverManifest$53 r1 = r1.getSwipeDelegateListener()
            r13.invoke = r1
            o.GriverResourceLoadExtension$1 r1 = r13.hashCode
            r2 = 5
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            r7 = 0
            r8 = 0
            if (r1 != 0) goto L_0x0125
            o.loadSnapshotFile$setMax r1 = new o.loadSnapshotFile$setMax
            r1.<init>(r8)
            id.dana.base.BaseActivity r9 = r13.getMax
            if (r9 == 0) goto L_0x0048
            id.dana.base.BaseActivity r9 = r13.getMax
            o.PrepareException$1 r9 = r9.getApplicationComponent()
            goto L_0x0049
        L_0x0048:
            r9 = r7
        L_0x0049:
            if (r9 == 0) goto L_0x0124
            o.PrepareException$1 r9 = (o.PrepareException.AnonymousClass1) r9
            r1.hashCode = r9
            id.dana.contract.permission.PermissionStateModule r9 = new id.dana.contract.permission.PermissionStateModule
            id.dana.home.NewHomeFragment$4 r10 = new id.dana.home.NewHomeFragment$4
            r10.<init>()
            r9.<init>(r10)
            id.dana.contract.permission.PermissionStateModule r9 = (id.dana.contract.permission.PermissionStateModule) r9
            r1.setMin = r9
            id.dana.contract.user.GetBalanceModule r9 = new id.dana.contract.user.GetBalanceModule
            id.dana.home.NewHomeFragment$12 r10 = new id.dana.home.NewHomeFragment$12
            r10.<init>()
            r9.<init>(r10)
            id.dana.contract.user.GetBalanceModule r9 = (id.dana.contract.user.GetBalanceModule) r9
            r1.getMin = r9
            id.dana.contract.inbox.UnreadInboxModule r9 = new id.dana.contract.inbox.UnreadInboxModule
            id.dana.home.NewHomeFragment$17 r10 = new id.dana.home.NewHomeFragment$17
            r10.<init>()
            r9.<init>(r10)
            id.dana.contract.inbox.UnreadInboxModule r9 = (id.dana.contract.inbox.UnreadInboxModule) r9
            r1.getMax = r9
            id.dana.contract.payasset.QueryPayMethodModule r9 = new id.dana.contract.payasset.QueryPayMethodModule
            id.dana.home.NewHomeFragment$20 r10 = new id.dana.home.NewHomeFragment$20
            r10.<init>()
            r9.<init>(r10)
            id.dana.contract.payasset.QueryPayMethodModule r9 = (id.dana.contract.payasset.QueryPayMethodModule) r9
            r1.setMax = r9
            id.dana.contract.homeinfo.HomeInfoModule r9 = new id.dana.contract.homeinfo.HomeInfoModule
            id.dana.home.NewHomeFragment$16 r10 = new id.dana.home.NewHomeFragment$16
            r10.<init>()
            r9.<init>(r10)
            id.dana.contract.homeinfo.HomeInfoModule r9 = (id.dana.contract.homeinfo.HomeInfoModule) r9
            r1.length = r9
            id.dana.di.modules.BottomSheetOnBoardingModule r9 = new id.dana.di.modules.BottomSheetOnBoardingModule
            id.dana.home.NewHomeFragment$18 r10 = new id.dana.home.NewHomeFragment$18
            r10.<init>()
            r9.<init>(r10)
            id.dana.di.modules.BottomSheetOnBoardingModule r9 = (id.dana.di.modules.BottomSheetOnBoardingModule) r9
            r1.isInside = r9
            id.dana.di.modules.GeofenceModule r9 = new id.dana.di.modules.GeofenceModule
            id.dana.home.NewHomeFragment$19 r10 = new id.dana.home.NewHomeFragment$19
            r10.<init>()
            r9.<init>(r10)
            id.dana.di.modules.GeofenceModule r9 = (id.dana.di.modules.GeofenceModule) r9
            r1.IsOverlapping = r9
            id.dana.di.modules.GlobalNetworkModule r9 = new id.dana.di.modules.GlobalNetworkModule
            id.dana.home.NewHomeFragment$23 r10 = new id.dana.home.NewHomeFragment$23
            r10.<init>()
            r9.<init>(r10)
            id.dana.di.modules.GlobalNetworkModule r9 = (id.dana.di.modules.GlobalNetworkModule) r9
            r1.toIntRange = r9
            id.dana.di.modules.LogoutModule r9 = new id.dana.di.modules.LogoutModule
            id.dana.home.NewHomeFragment$2 r10 = new id.dana.home.NewHomeFragment$2
            r10.<init>()
            r9.<init>(r10)
            id.dana.di.modules.LogoutModule r9 = (id.dana.di.modules.LogoutModule) r9
            r1.equals = r9
            id.dana.contract.ott.OttVerifyModule r9 = new id.dana.contract.ott.OttVerifyModule
            id.dana.home.NewHomeFragment$3 r10 = new id.dana.home.NewHomeFragment$3
            r10.<init>()
            r9.<init>(r10)
            id.dana.contract.ott.OttVerifyModule r9 = (id.dana.contract.ott.OttVerifyModule) r9
            r1.toFloatRange = r9
            id.dana.contract.globalsearch.GlobalSearchModule r9 = new id.dana.contract.globalsearch.GlobalSearchModule
            id.dana.home.NewHomeFragment$5 r10 = new id.dana.home.NewHomeFragment$5
            r10.<init>()
            r9.<init>(r10)
            id.dana.contract.globalsearch.GlobalSearchModule r9 = (id.dana.contract.globalsearch.GlobalSearchModule) r9
            r1.toDoubleRange = r9
            id.dana.sendmoney.di.module.SendMoneyV2Module r9 = new id.dana.sendmoney.di.module.SendMoneyV2Module
            id.dana.home.NewHomeFragment$8 r10 = new id.dana.home.NewHomeFragment$8
            r10.<init>()
            r9.<init>(r10)
            id.dana.sendmoney.di.module.SendMoneyV2Module r9 = (id.dana.sendmoney.di.module.SendMoneyV2Module) r9
            r1.toString = r9
            o.GriverResourceLoadExtension$1 r1 = r1.setMax()
            r13.hashCode = r1
            r1.getMax(r13)
            r1 = 7
            o.onDelete$getMin[] r1 = new o.onDelete.getMin[r1]
            o.parameters$setMax r9 = r13.getBalancePresenter
            r1[r8] = r9
            o.restoreState$length r9 = r13.unreadInboxPresenter
            r1[r6] = r9
            o.fakeDragBy$length r9 = r13.queryPayMethodPresenter
            r1[r5] = r9
            o.VersionedParcelize$getMax r9 = r13.homeInfoContractPresenter
            r1[r4] = r9
            o.getSelectedIndex$length r9 = r13.onBoardingPresenter
            r1[r3] = r9
            o.onFailure$getMin r9 = r13.sendMoneyV2Presenter
            r1[r2] = r9
            r9 = 6
            o.getAlpha$length r10 = r13.globalSearchPresenter
            r1[r9] = r10
            r13.getMin(r1)
            goto L_0x0125
        L_0x0124:
            throw r7
        L_0x0125:
            o.setStateOn$getMin r1 = new o.setStateOn$getMin
            r1.<init>((androidx.fragment.app.Fragment) r13)
            java.lang.String r9 = "android.permission.ACCESS_FINE_LOCATION"
            java.lang.String r10 = "android.permission.ACCESS_COARSE_LOCATION"
            java.lang.String[] r10 = new java.lang.String[]{r9, r10}
            java.util.List<java.lang.String> r11 = r1.length
            java.util.Collections.addAll(r11, r10)
            id.dana.home.NewHomeFragment$7 r10 = new id.dana.home.NewHomeFragment$7
            r10.<init>()
            r1.getMax = r10
            o.setStateOn r10 = new o.setStateOn
            r10.<init>(r1, r8)
            r13.toDoubleRange = r10
            o.setStateOn$getMin r1 = new o.setStateOn$getMin
            r1.<init>((androidx.fragment.app.Fragment) r13)
            java.util.List<java.lang.String> r10 = r1.length
            java.lang.String r11 = "android.permission.READ_CONTACTS"
            r10.add(r11)
            id.dana.home.NewHomeFragment$10 r10 = new id.dana.home.NewHomeFragment$10
            r10.<init>()
            r1.getMax = r10
            o.setStateOn r10 = new o.setStateOn
            r10.<init>(r1, r8)
            r13.toFloatRange = r10
            in.srain.cube.views.ptr.PtrClassicFrameLayout r1 = r13.ptrHome
            r1.setPtrHandler(r13)
            in.srain.cube.views.ptr.PtrClassicFrameLayout r1 = r13.ptrHome
            r1.disableWhenHorizontalMove(r6)
            in.srain.cube.views.ptr.PtrClassicFrameLayout r1 = r13.ptrHome
            android.view.LayoutInflater r6 = r13.getLayoutInflater()
            r8 = 2131559465(0x7f0d0429, float:1.8744275E38)
            android.view.View r6 = r6.inflate(r8, r7)
            r1.setHeaderView(r6)
            in.srain.cube.views.ptr.PtrClassicFrameLayout r1 = r13.ptrHome
            android.view.View r1 = r1.getHeaderView()
            r6 = 2131363718(0x7f0a0786, float:1.8347253E38)
            android.view.View r1 = r1.findViewById(r6)
            id.dana.richview.LoadingLottieAnimationView r1 = (id.dana.richview.LoadingLottieAnimationView) r1
            r13.toString = r1
            id.dana.home.NewHomeFragment$9 r6 = new id.dana.home.NewHomeFragment$9
            r6.<init>()
            r1.addAnimatorListener(r6)
            o.DefaultBlueToothProxy r1 = new o.DefaultBlueToothProxy
            androidx.fragment.app.FragmentActivity r6 = r13.getActivity()
            r1.<init>(r6)
            r13.isInside = r1
            o.onNext$setMin r1 = r13.globalNetworkPresenter
            java.lang.String r6 = "ID"
            r1.equals(r6)
            id.dana.globalnetwork.currency.CurrencySwitchRichView r1 = r13.currencySwitch
            r1.setLocalCurrencySymbol(r6)
            id.dana.globalnetwork.currency.CurrencySwitchRichView r1 = r13.currencySwitch
            o.GriverManifest$39$1 r6 = new o.GriverManifest$39$1
            r6.<init>(r13)
            r1.setSwitchStateListener(r6)
            o.GriverManifest$36 r1 = r13.valueOf
            o.CascadingMenuPopup$HorizPosition<java.lang.Boolean> r1 = r1.setMax
            boolean r6 = r1.setMax()
            if (r6 != 0) goto L_0x01ce
            o.setChecked r6 = r13.getViewLifecycleOwner()
            id.dana.globalnetwork.currency.CurrencySwitchRichView r7 = r13.currencySwitch
            java.util.Objects.requireNonNull(r7)
            o.GriverManifest$40 r8 = new o.GriverManifest$40
            r8.<init>(r7)
            r1.getMax(r6, r8)
        L_0x01ce:
            r13.o_()
            o.fakeDragBy$length r1 = r13.queryPayMethodPresenter
            if (r1 == 0) goto L_0x01d8
            r1.equals()
        L_0x01d8:
            androidx.fragment.app.FragmentActivity r1 = r13.getActivity()
            android.content.Intent r1 = r1.getIntent()
            android.os.Bundle r1 = r1.getExtras()
            if (r1 == 0) goto L_0x027b
            java.util.HashMap r6 = new java.util.HashMap
            r6.<init>()
            java.util.Set r7 = r1.keySet()
            java.util.Iterator r7 = r7.iterator()
        L_0x01f3:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x0234
            java.lang.Object r8 = r7.next()
            java.lang.String r8 = (java.lang.String) r8
            java.lang.String r10 = r1.getString(r8)     // Catch:{ ClassCastException -> 0x0225 }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r12 = "Notification data ["
            r11.<init>(r12)
            r11.append(r8)
            java.lang.String r12 = " : "
            r11.append(r12)
            r11.append(r10)
            java.lang.String r12 = "]"
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            o.updateActionSheetContent.d(r0, r11)
            r6.put(r8, r10)
            goto L_0x01f3
        L_0x0225:
            r10 = move-exception
            java.lang.String r8 = java.lang.String.valueOf(r8)
            java.lang.String r11 = "getNotificationData error. key = "
            java.lang.String r8 = r11.concat(r8)
            o.updateActionSheetContent.e(r0, r8, r10)
            goto L_0x01f3
        L_0x0234:
            o.TinyAppHostApduService$1 r0 = new o.TinyAppHostApduService$1
            o.getShortName r7 = r13.dynamicUrlWrapper
            r0.<init>(r7)
            java.lang.String r7 = "iconUrl"
            java.lang.String r7 = r1.getString(r7)
            java.lang.String r8 = "contentType"
            java.lang.String r8 = r1.getString(r8)
            java.lang.String r10 = "redirectType"
            java.lang.String r10 = r1.getString(r10)
            java.lang.String r11 = "redirectValue"
            java.lang.String r11 = r1.getString(r11)
            java.lang.String r12 = "imageUrl"
            java.lang.String r1 = r1.getString(r12)
            id.dana.notification.NotificationData r12 = new id.dana.notification.NotificationData
            r12.<init>()
            r12.length = r8
            r12.setMin = r7
            r12.getMax = r10
            r12.toFloatRange = r11
            r12.IsOverlapping = r1
            r12.FastBitmap$CoordinateSystem = r6
            androidx.fragment.app.FragmentActivity r1 = r13.getActivity()
            o.isNfcEnable r0 = r0.setMax(r1, r12)
            if (r0 == 0) goto L_0x027b
            androidx.fragment.app.FragmentActivity r1 = r13.getActivity()
            r0.setMax(r1)
        L_0x027b:
            boolean r0 = o.CornerMarkingDataProvider.IsOverlapping()
            if (r0 == 0) goto L_0x0290
            android.content.Context r0 = r13.getContext()
            boolean r0 = o.setStateOn.getMin(r0, r9)
            if (r0 != 0) goto L_0x0290
            o.ViewPager2$OffscreenPageLimit$length r0 = r13.permissionStatePresenter
            r0.length()
        L_0x0290:
            id.dana.nearbyme.NewNearbyMeView r0 = r13.nearbyMeView
            id.dana.home.NewHomeFragment$6 r1 = new id.dana.home.NewHomeFragment$6
            r1.<init>()
            r0.setOnNearbyMeEntryView(r1)
            id.dana.nearbyme.NewNearbyMeView r0 = r13.nearbyMeView
            java.lang.String r1 = "Home"
            r0.setSource(r1)
            id.dana.social.view.NewSocialWidgetView r0 = r13.socialWidgetView
            id.dana.home.NewHomeFragment$14 r1 = new id.dana.home.NewHomeFragment$14
            r1.<init>()
            r0.setWidgetListener(r1)
            androidx.core.widget.NestedScrollView r0 = r13.nestedScrollView
            o.GriverManifest$4 r1 = new o.GriverManifest$4
            r1.<init>(r13)
            r0.setOnScrollChangeListener(r1)
            r13.Grayscale$Algorithm()
            android.content.Context r0 = r13.getContext()
            boolean r0 = o.setStateOn.getMin(r0, r9)
            if (r0 == 0) goto L_0x02d0
            o.BLEBridgeExtension$6 r0 = r13.geofencePresenter
            o.flingScroll r1 = r0.getMax
            o.BLEBridgeExtension$6$setMax r6 = new o.BLEBridgeExtension$6$setMax
            r6.<init>(r0)
            o.setGlobalUserData r6 = (o.setGlobalUserData) r6
            r1.execute(r6)
        L_0x02d0:
            o.onNext$setMin r0 = r13.globalNetworkPresenter
            r0.length()
            o.parameters$setMax r0 = r13.getBalancePresenter
            r0.getMin()
            o.onNext$setMin r0 = r13.globalNetworkPresenter
            r0.toDoubleRange()
            id.dana.component.buttoncomponent.DanaButtonSecondaryView r0 = r13.btnDanaProtectionMainButton
            o.GriverManifest$42 r1 = o.GriverManifest.AnonymousClass42.setMin
            r0.setOnClickListener(r1)
            r13.Grayscale$Algorithm()
            android.content.Context r0 = r13.getContext()
            boolean r0 = o.setStateOn.getMin(r0, r9)
            if (r0 == 0) goto L_0x0301
            o.BLEBridgeExtension$6 r0 = r13.geofencePresenter
            o.flingScroll r1 = r0.getMax
            o.BLEBridgeExtension$6$setMax r6 = new o.BLEBridgeExtension$6$setMax
            r6.<init>(r0)
            o.setGlobalUserData r6 = (o.setGlobalUserData) r6
            r1.execute(r6)
        L_0x0301:
            o.getStartDelay r0 = o.getStartDelay.IsOverlapping()
            boolean r1 = r0.getMax()
            java.lang.String r6 = ""
            if (r1 == 0) goto L_0x0327
            java.lang.String r1 = r0.setMax
            if (r1 != 0) goto L_0x0312
            r1 = r6
        L_0x0312:
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x0327
            o.resetTouch r0 = r13.ottVerifyPresenter
            o.GriverOpenAuthExtension$RevokeCallback r1 = r0.setMin
            o.resetTouch$setMax r6 = new o.resetTouch$setMax
            r6.<init>(r0)
            o.setGlobalUserData r6 = (o.setGlobalUserData) r6
            r1.execute(r6)
            goto L_0x0380
        L_0x0327:
            boolean r1 = r0.getMax()
            if (r1 == 0) goto L_0x0380
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r0.toFloatRange = r1
            o.getStartDelay r0 = o.getStartDelay.IsOverlapping()
            java.lang.String r0 = r0.setMin
            if (r0 != 0) goto L_0x033a
            r0 = r6
        L_0x033a:
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0350
            o.resetTouch r0 = r13.ottVerifyPresenter
            o.getStartDelay r1 = o.getStartDelay.IsOverlapping()
            java.lang.String r1 = r1.setMin
            if (r1 != 0) goto L_0x034b
            goto L_0x034c
        L_0x034b:
            r6 = r1
        L_0x034c:
            r0.getMin((java.lang.String) r6)
            goto L_0x0380
        L_0x0350:
            o.getBubbleHeight r0 = o.getBubbleHeight.setMax()
            java.lang.String r1 = "deeplink_payment_without_ott"
            java.lang.String r7 = "name"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r7)
            java.util.Map<java.lang.String, com.google.firebase.perf.metrics.Trace> r0 = r0.getMin
            java.lang.Object r0 = r0.get(r1)
            com.google.firebase.perf.metrics.Trace r0 = (com.google.firebase.perf.metrics.Trace) r0
            if (r0 == 0) goto L_0x0368
            r0.stop()
        L_0x0368:
            o.getStartDelay r0 = o.getStartDelay.IsOverlapping()
            java.lang.String r0 = r0.getMin
            if (r0 != 0) goto L_0x0371
            goto L_0x0372
        L_0x0371:
            r6 = r0
        L_0x0372:
            boolean r0 = r6.isEmpty()
            if (r0 != 0) goto L_0x0380
            id.dana.home.NewHomeFragment$11 r0 = new id.dana.home.NewHomeFragment$11
            r0.<init>()
            id.dana.danah5.DanaH5.startContainerFullUrl(r6, r0)
        L_0x0380:
            o.onNext$setMin r0 = r13.globalNetworkPresenter
            r0.length()
            o.parameters$setMax r0 = r13.getBalancePresenter
            r0.getMin()
            o.VersionedParcelize$getMax r0 = r13.homeInfoContractPresenter
            r0.getMax()
            o.getAlpha$length r0 = r13.globalSearchPresenter
            r0.getMax()
            id.dana.investment.view.HomeInvestmentView r0 = r13.homeInvestmentView
            if (r0 == 0) goto L_0x03a0
            o.GriverManifest$5 r1 = new o.GriverManifest$5
            r1.<init>(r13)
            r0.setListener(r1)
        L_0x03a0:
            androidx.fragment.app.FragmentActivity r0 = r13.getActivity()
            boolean r0 = r0 instanceof id.dana.home.HomeTabActivity
            if (r0 == 0) goto L_0x03e3
            androidx.fragment.app.FragmentActivity r0 = r13.getActivity()
            android.content.Intent r0 = r0.getIntent()
            if (r0 != 0) goto L_0x03b3
            goto L_0x03e3
        L_0x03b3:
            androidx.fragment.app.FragmentActivity r0 = r13.getActivity()
            android.content.Intent r0 = r0.getIntent()
            android.os.Bundle r0 = r0.getExtras()
            int r0 = id.dana.appshortcut.DanaAppShortcut.getMin((android.os.Bundle) r0)
            if (r0 == r5) goto L_0x03de
            if (r0 == r4) goto L_0x03d8
            if (r0 == r3) goto L_0x03d2
            if (r0 == r2) goto L_0x03cc
            goto L_0x03d1
        L_0x03cc:
            android.view.View r0 = r13.viewBalanceClickArea
            r0.performClick()
        L_0x03d1:
            return
        L_0x03d2:
            id.dana.home.view.GridMenuView r0 = r13.gmvRequest
            r0.performClick()
            return
        L_0x03d8:
            id.dana.home.view.GridMenuView r0 = r13.gmvSend
            r0.performClick()
            return
        L_0x03de:
            id.dana.home.view.GridMenuView r0 = r13.gmvTopup
            r0.performClick()
        L_0x03e3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: id.dana.home.NewHomeFragment.setMax():void");
    }

    public void onResume() {
        super.onResume();
        parameters.setMax setmax = this.getBalancePresenter;
        if (setmax != null) {
            setmax.setMin();
        }
        this.getBalancePresenter.getMin();
        this.surveyView.getSurvey();
        this.serviceCardView.refreshView();
        this.socialWidgetView.onActivityResume();
        fakeDragBy.length length = this.queryPayMethodPresenter;
        if (length != null) {
            length.length();
        }
        if (getActivity() instanceof HomeTabActivity) {
            Intent intent = getActivity().getIntent();
            String stringExtra = intent.getStringExtra(HomeTabActivity.EXTRA_SHOP_ID);
            String stringExtra2 = intent.getStringExtra("source");
            boolean booleanExtra = intent.getBooleanExtra(HomeTabActivity.EXTRA_IGNORE_DISMISS_RULE, false);
            intent.removeExtra(HomeTabActivity.EXTRA_SHOP_ID);
            intent.removeExtra("source");
            intent.removeExtra(HomeTabActivity.EXTRA_IGNORE_DISMISS_RULE);
            if (stringExtra != null) {
                getMin(stringExtra2, stringExtra, Boolean.valueOf(booleanExtra));
            }
        }
        this.globalSearchPresenter.toFloatRange();
    }

    public void onPause() {
        this.queryPayMethodPresenter.toFloatRange();
        super.onPause();
    }

    public void onDestroyView() {
        NewPromoBannerView newPromoBannerView = this.promoBannerView;
        if (newPromoBannerView != null) {
            newPromoBannerView.unbindAdapter();
        }
        MissionSummaryView missionSummaryView2 = this.missionSummaryView;
        if (missionSummaryView2 != null) {
            missionSummaryView2.unregisterReceiver();
        }
        super.onDestroyView();
    }

    public final void o_() {
        restoreState.length length = this.unreadInboxPresenter;
        if (length != null) {
            length.length();
        }
        fakeDragBy.length length2 = this.queryPayMethodPresenter;
        if (length2 != null) {
            length2.length();
        }
        NewSocialWidgetView newSocialWidgetView = this.socialWidgetView;
        if (newSocialWidgetView != null) {
            newSocialWidgetView.onTabSwipeResume();
        }
        super.o_();
    }

    public final void IsOverlapping() {
        parameters.setMax setmax = this.getBalancePresenter;
        if (setmax != null) {
            setmax.length();
        }
        this.socialWidgetView.onUnselected();
        super.IsOverlapping();
    }

    public final void getMin(String str, String str2, Boolean bool) {
        if (str != null && str2 != null && bool != null) {
            this.homeInfoContractPresenter.length(str, str2, bool.booleanValue());
        } else if (this.getMax instanceof HomeTabActivity) {
            ((HomeTabActivity) this.getMax).nextOnboardingStep();
        }
    }

    /* access modifiers changed from: private */
    public void length(String str, String str2) {
        this.llPayContent.setVisibility(0);
        this.currencyTv.setVisibility(0);
        this.currencyTv.setText(str2);
        this.tvBalance.setText(str);
        DefaultBlueToothProxy defaultBlueToothProxy = this.isInside;
        if (defaultBlueToothProxy != null) {
            defaultBlueToothProxy.dismiss();
        }
    }

    /* access modifiers changed from: private */
    public boolean invoke() {
        String str;
        if (!(getParentFragment() instanceof HomeTabFragment)) {
            return false;
        }
        HomeTabFragment homeTabFragment = (HomeTabFragment) getParentFragment();
        if (homeTabFragment.toFloatRange == null) {
            str = "";
        } else {
            str = homeTabFragment.toFloatRange.toIntRange.getMax;
        }
        return "KYC2".equals(str);
    }

    private void Grayscale$Algorithm() {
        AnonymousClass13 r0 = new observedEntities(this.getMax) {
            public final void getMin(View view) {
                NewHomeFragment newHomeFragment = NewHomeFragment.this;
                switch (view.getId()) {
                    case R.id.f44752131363010 /*2131363010*/:
                        newHomeFragment.startActivity(newHomeFragment.setMax(RequestMoneyActivity.class, TrackerKey.SourceType.FOUR_KING_KONG));
                        return;
                    case R.id.f44772131363012 /*2131363012*/:
                        newHomeFragment.sendMoneyV2Presenter.setMin();
                        return;
                    case R.id.f44782131363013 /*2131363013*/:
                        newHomeFragment.onClickTopup();
                        return;
                    case R.id.f72082131365843 /*2131365843*/:
                        newHomeFragment.startActivity(new Intent(newHomeFragment.getActivity(), WalletActivity.class));
                        return;
                    default:
                        return;
                }
            }
        };
        this.gmvSend.setOnClickListener(r0);
        this.gmvTopup.setOnClickListener(r0);
        this.gmvRequest.setOnClickListener(r0);
        this.viewBalanceClickArea.setOnClickListener(r0);
    }

    /* access modifiers changed from: private */
    public static boolean length(List<PayCardInfo> list) {
        return list != null && !list.isEmpty();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (intent == null) {
            return;
        }
        if (100 == i) {
            this.nearbyMeView.onLocationResolutionResult(i2);
        } else if (setMin == i && i2 == -1) {
            if (intent.getBooleanExtra("showTooltip", true)) {
                this.globalNetworkPresenter.getMin(false);
                this.globalNetworkPresenter.values();
            }
            if (!TextUtils.isEmpty(this.invokeSuspend)) {
                this.globalNetworkPresenter.setMin(this.invokeSuspend);
            }
        }
    }

    public void onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        if (!this.toDoubleRange.getMin(i, strArr, iArr)) {
            super.onRequestPermissionsResult(i, strArr, iArr);
        }
        if (!this.toFloatRange.getMin(i, strArr, iArr)) {
            super.onRequestPermissionsResult(i, strArr, iArr);
        }
    }

    @OnClick({2131364053})
    public void onClickInbox() {
        GriverManifest.AnonymousClass53 r0 = this.invoke;
        if (r0 != null) {
            r0.getMax(TrackerKey.SourceType.INBOX_ICON, false);
        }
    }

    @OnClick({2131363011})
    public void onClickScan() {
        GriverManifest.AnonymousClass53 r0 = this.invoke;
        if (r0 != null) {
            r0.getMin();
            DecodeWrapper.getMin(TrackerKey.SourceType.FOUR_KING_KONG);
        }
    }

    @OnClick({2131363013})
    public void onClickTopup() {
        this.onBoardingPresenter.setMax(BottomSheetOnBoardingScenario.TOP_UP, this.dynamicUrlWrapper.getTopupUrl(TopupSource.FOUR_KING_KONG));
    }

    public final void getMax() {
        LoadingLottieAnimationView loadingLottieAnimationView = this.toString;
        if (loadingLottieAnimationView != null) {
            loadingLottieAnimationView.playAnimation();
        }
        NewNearbyMeView newNearbyMeView = this.nearbyMeView;
        if (newNearbyMeView != null && newNearbyMeView.getVisibility() == 0) {
            this.nearbyMeView.checkPermission(true);
        }
        MissionSummaryView missionSummaryView2 = this.missionSummaryView;
        if (missionSummaryView2 != null) {
            missionSummaryView2.checkPromoQuest();
        }
        NewPromoBannerView newPromoBannerView = this.promoBannerView;
        if (newPromoBannerView != null) {
            newPromoBannerView.refreshView();
        }
        VersionedParcelize.getMax getmax = this.homeInfoContractPresenter;
        NewPromoBannerView.getMin getmin = NewPromoBannerView.Companion;
        getmax.length(3);
        this.homeReferralView.checkReferralQuestExists();
        this.socialWidgetView.refreshTimeline();
        this.moreForYouView.refreshContent();
        this.homeInvestmentView.refreshPortfolio();
    }

    public final setUseAmcsLite getMin(View view, getEnv getenv, int i, int i2, int i3) {
        return ((setUseSecurityGuard) ((setUseSecurityGuard) ((setUseSecurityGuard) new setUseSecurityGuard(this.getMax).getMax(view)).setMin(getenv)).getMin(new access$1402(getResources().getString(i), getResources().getString(i2), i3))).getMin();
    }

    public final void equals() {
        MatchPhoneNumberDialog.getMin getmin = new MatchPhoneNumberDialog.getMin(getContext(), new DialogInterface.OnDismissListener(this) {
            private final NewHomeFragment setMax;

            {
                this.setMax = r1;
            }

            public final void onDismiss(DialogInterface dialogInterface) {
                NewHomeFragment.toDoubleRange();
            }
        });
        getmin.getMin = new View.OnClickListener(this) {
            private final NewHomeFragment getMax;

            {
                this.getMax = r1;
            }

            public final void onClick(View view) {
                NewHomeFragment.getCause(this.getMax);
            }
        };
        getmin.setMin = new View.OnClickListener(this) {
            private final NewHomeFragment getMax;

            {
                this.getMax = r1;
            }

            public final void onClick(View view) {
                NewHomeFragment.onRelationshipValidationResult(this.getMax);
            }
        };
        MatchPhoneNumberDialog matchPhoneNumberDialog = new MatchPhoneNumberDialog(getmin.getMax, getmin.setMax, getmin, (byte) 0);
        this.Mean$Arithmetic = matchPhoneNumberDialog;
        matchPhoneNumberDialog.setMin();
    }

    static /* synthetic */ void getMin(NewHomeFragment newHomeFragment) {
        if (newHomeFragment.FastBitmap$CoordinateSystem == null) {
            DialogPermission max = setAcParams.getMax(newHomeFragment.getContext(), "location", new DialogPermission.length() {
                public final void onDialogDismissed() {
                }

                public final void onPositiveButtonClicked() {
                    NewHomeFragment.this.toDoubleRange.setMin();
                    NewHomeFragment.this.FastBitmap$CoordinateSystem.setMax();
                }

                public final void onNegativeButtonClicked() {
                    NewHomeFragment.invoke(NewHomeFragment.this);
                }
            });
            newHomeFragment.FastBitmap$CoordinateSystem = max;
            max.setMin();
        }
    }

    static /* synthetic */ void setMin(NewHomeFragment newHomeFragment) {
        DefaultBlueToothProxy defaultBlueToothProxy = newHomeFragment.isInside;
        if (defaultBlueToothProxy != null) {
            defaultBlueToothProxy.dismiss();
        }
    }

    static /* synthetic */ void getMax(NewHomeFragment newHomeFragment, CurrencyAmountModel currencyAmountModel) {
        if (newHomeFragment.getContext() != null) {
            DanaQuickActionWidgetProvider.refreshQuickActionWidgets(newHomeFragment.getContext(), currencyAmountModel);
            DanaQuickActionMediumWidgetProvider.refreshQuickActionMediumWidgets(newHomeFragment.getContext(), currencyAmountModel);
        }
    }

    static /* synthetic */ void getMax(NewHomeFragment newHomeFragment) {
        CascadingMenuPopup$HorizPosition<Boolean> cascadingMenuPopup$HorizPosition = newHomeFragment.valueOf.getMax;
        if (!cascadingMenuPopup$HorizPosition.setMax()) {
            cascadingMenuPopup$HorizPosition.getMax(newHomeFragment.getViewLifecycleOwner(), new onMeasure(newHomeFragment) {
                private final NewHomeFragment setMin;

                {
                    this.setMin = r1;
                }

                public final void onChanged(Object obj) {
                    NewHomeFragment.length(this.setMin, (Boolean) obj);
                }
            });
        }
    }

    static /* synthetic */ void setMin(NewHomeFragment newHomeFragment, boolean z) {
        int i = 0;
        newHomeFragment.tvBalance.setVisibility(z ? 0 : 8);
        TextView textView = newHomeFragment.tvHiddenPayContent;
        if (z) {
            i = 8;
        }
        textView.setVisibility(i);
    }

    static /* synthetic */ void setMax(NewHomeFragment newHomeFragment, boolean z) {
        ImageView imageView = newHomeFragment.inboxMenuBar;
        if (imageView != null) {
            imageView.setSelected(z);
        }
    }

    static /* synthetic */ void length(NewHomeFragment newHomeFragment, boolean z) {
        SavedCardIndicatorLottieAnimationView savedCardIndicatorLottieAnimationView = newHomeFragment.lavSavedCardIndicator;
        if (savedCardIndicatorLottieAnimationView != null) {
            savedCardIndicatorLottieAnimationView.setHasSavedCard(z);
        }
    }

    static /* synthetic */ void length(NewHomeFragment newHomeFragment, InputBridgeExtension inputBridgeExtension) {
        TextView textView;
        if (inputBridgeExtension != null && inputBridgeExtension.setMax != null && (textView = newHomeFragment.tvBalance) != null && !newHomeFragment.IsOverlapping) {
            textView.setText(setLineVisible.length(new CurrencyAmountModel(inputBridgeExtension.setMax.getMax)));
        }
    }

    static /* synthetic */ void length(NewHomeFragment newHomeFragment, h5PageReload h5pagereload) {
        ImageView imageView;
        if (h5pagereload != null && h5pagereload.length() && (imageView = newHomeFragment.inboxMenuBar) != null) {
            imageView.setSelected(h5pagereload.getMin());
        }
    }

    static /* synthetic */ void setMax(NewHomeFragment newHomeFragment, LoadingBridgeExtension loadingBridgeExtension) {
        if (newHomeFragment.promoBannerView != null && loadingBridgeExtension != null && loadingBridgeExtension.setMin != null) {
            newHomeFragment.promoBannerView.updateBanner(loadingBridgeExtension);
        }
    }

    static /* synthetic */ void getMax(NewHomeFragment newHomeFragment, MerchantConsultReviewModel merchantConsultReviewModel) {
        MerchantReviewDialogFragment.getMin getmin = MerchantReviewDialogFragment.length;
        MerchantReviewDialogFragment.getMin.setMin(newHomeFragment.getChildFragmentManager(), merchantConsultReviewModel, false, new Function1(newHomeFragment) {
            private final NewHomeFragment setMin;

            {
                this.setMin = r1;
            }

            public final Object invoke(Object obj) {
                return NewHomeFragment.onNavigationEvent(this.setMin);
            }
        });
    }

    static /* synthetic */ void length(NewHomeFragment newHomeFragment) {
        if (newHomeFragment.getMax instanceof HomeTabActivity) {
            ((HomeTabActivity) newHomeFragment.getMax).nextOnboardingStep();
        }
    }

    static /* synthetic */ void setMax(NewHomeFragment newHomeFragment) {
        newHomeFragment.toIntRange = true;
        NewPromoBannerView newPromoBannerView = newHomeFragment.promoBannerView;
        if (newPromoBannerView != null) {
            newPromoBannerView.hideBannerSkeleton();
        }
    }

    static /* synthetic */ void getMax(NewHomeFragment newHomeFragment, boolean z) {
        TextView textView;
        if (!z && (textView = newHomeFragment.tvBalance) != null && newHomeFragment.getBalancePresenter != null && textView.getText().toString().isEmpty()) {
            newHomeFragment.getBalancePresenter.getMin();
        }
    }

    static /* synthetic */ void setMin(NewHomeFragment newHomeFragment, boolean z, String str) {
        newHomeFragment.valueOf.setMax.getMax(Boolean.valueOf(z));
        if (z) {
            newHomeFragment.IsOverlapping = true;
            CurrencySwitchRichView currencySwitchRichView = newHomeFragment.currencySwitch;
            if (currencySwitchRichView != null) {
                currencySwitchRichView.setVisibility(0);
                newHomeFragment.currencySwitch.setForeignCurrencySymbol(str);
                newHomeFragment.globalNetworkPresenter.equals(str);
                return;
            }
            return;
        }
        newHomeFragment.IsOverlapping = false;
        newHomeFragment.getBalancePresenter.getMin();
    }

    static /* synthetic */ void getMax(NewHomeFragment newHomeFragment, initUC7zSo inituc7zso) {
        if (newHomeFragment.currencySwitch.isGlobalNetworkState()) {
            newHomeFragment.length(inituc7zso.getForexAmount(), newHomeFragment.currencySwitch.getCurrentCurrencySymbol());
        } else {
            newHomeFragment.length(setLineVisible.length(new CurrencyAmountModel(inituc7zso.getAmount())), "Rp");
        }
    }

    static /* synthetic */ void getMin(NewHomeFragment newHomeFragment, GnContentModel gnContentModel, String str) {
        Intent intent = new Intent(newHomeFragment.getContext(), OnboardingGlobalNetworkSheetActivity.class);
        intent.putExtra(OnboardingGlobalNetworkSheetActivity.EXTRA_GN_CONTENT, gnContentModel);
        intent.putExtra(OnboardingGlobalNetworkSheetActivity.EXTRA_GN_COUNTRY_CODE, str);
        newHomeFragment.startActivityForResult(intent, setMin);
    }

    static /* synthetic */ void equals(NewHomeFragment newHomeFragment) {
        List<? extends setUseAmcsLite> list;
        View promotedServiceView = newHomeFragment.serviceCardView.getPromotedServiceView();
        if (promotedServiceView == null) {
            list = Collections.emptyList();
        } else {
            getUseSecurityGuard getusesecurityguard = new getUseSecurityGuard((float) setMax);
            getUseAmcsLite getuseamcslite = new getUseAmcsLite(promotedServiceView, (float) ((int) (Resources.getSystem().getDisplayMetrics().density * 4.0f)), (float) ((int) (Resources.getSystem().getDisplayMetrics().density * 4.0f)), (int) (Resources.getSystem().getDisplayMetrics().density * 2.0f), (int) (Resources.getSystem().getDisplayMetrics().density * 2.0f), (int) (Resources.getSystem().getDisplayMetrics().density * 2.0f), (int) (Resources.getSystem().getDisplayMetrics().density * 2.0f));
            ArrayList arrayList = new ArrayList();
            arrayList.add(newHomeFragment.getMin(newHomeFragment.currencySwitch, getusesecurityguard, R.string.gn_title_tooltip_1, R.string.gn_desc_tooltip_1, 0));
            arrayList.add(newHomeFragment.getMin(promotedServiceView, getuseamcslite, R.string.gn_title_tooltip_2, R.string.gn_desc_tooltip_2, 0));
            arrayList.add(newHomeFragment.getMin(newHomeFragment.getMax.findViewById(R.id.f72812131365916), getusesecurityguard, R.string.gn_title_tooltip_3, R.string.gn_desc_tooltip_3, 0));
            list = arrayList;
        }
        if (!list.isEmpty()) {
            PhotoView.GridDetector gridDetector = new PhotoView.GridDetector(newHomeFragment.getMax);
            gridDetector.values = list;
            ((PhotoView.GridDetector) ((PhotoView.GridDetector) ((PhotoView.GridDetector) gridDetector.length(false)).setMin((float) ((int) (Resources.getSystem().getDisplayMetrics().density * 16.0f)))).setMin((PhotoView.FlingRunnable) new getMaxTextureSize() {
                public final void onFinished(int i) {
                    if (!NewHomeFragment.this.invoke()) {
                        NewHomeFragment.FastBitmap$CoordinateSystem(NewHomeFragment.this);
                    }
                    NewHomeFragment.this.valueOf.length.getMax(Boolean.TRUE);
                }
            })).setMin();
        }
    }

    static /* synthetic */ void FastBitmap$CoordinateSystem(NewHomeFragment newHomeFragment) {
        isNfcEnable max;
        TinyAppHostApduService.AnonymousClass1 r0 = new Object(newHomeFragment.dynamicUrlWrapper) {
            private final getShortName setMax;

            {
                this.setMax = r1;
            }

            public final isNfcEnable setMax(Context context, NotificationData notificationData) {
                String str = notificationData.getMax;
                if (str == null) {
                    return null;
                }
                char c = 65535;
                switch (str.hashCode()) {
                    case -2035039290:
                        if (str.equals("INNER_URL")) {
                            c = 3;
                            break;
                        }
                        break;
                    case -1983828400:
                        if (str.equals(RedirectType.TWILIO_CHALLENGE)) {
                            c = 7;
                            break;
                        }
                        break;
                    case -805752590:
                        if (str.equals("TRANSACTION_DETAIL")) {
                            c = 0;
                            break;
                        }
                        break;
                    case 66575:
                        if (str.equals(RedirectType.CDP)) {
                            c = 2;
                            break;
                        }
                        break;
                    case 191796002:
                        if (str.equals("VOUCHER_DETAIL")) {
                            c = 1;
                            break;
                        }
                        break;
                    case 1469380567:
                        if (str.equals(RedirectType.OCR_RECEIPT)) {
                            c = 6;
                            break;
                        }
                        break;
                    case 1544398073:
                        if (str.equals("ipgRegistration")) {
                            c = 5;
                            break;
                        }
                        break;
                    case 2107599432:
                        if (str.equals(RedirectType.GN_AML)) {
                            c = 4;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        return new contact(context, notificationData);
                    case 1:
                        return 
                        /*  JADX ERROR: Method code generation error
                            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x009c: RETURN  
                              (wrap: o.ChoosePhoneContactBridgeExtension$1 : 0x0099: CONSTRUCTOR  (r0v2 o.ChoosePhoneContactBridgeExtension$1) = 
                              (r4v0 'context' android.content.Context)
                              (r5v0 'notificationData' id.dana.notification.NotificationData)
                              (wrap: o.getShortName : 0x0097: IGET  (r1v2 o.getShortName) = (r3v0 'this' o.TinyAppHostApduService$1 A[THIS]) o.TinyAppHostApduService.1.setMax o.getShortName)
                             call: o.ChoosePhoneContactBridgeExtension.1.<init>(android.content.Context, id.dana.notification.NotificationData, o.getShortName):void type: CONSTRUCTOR)
                             in method: o.TinyAppHostApduService.1.setMax(android.content.Context, id.dana.notification.NotificationData):o.isNfcEnable, dex: classes3.dex
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:256)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                            	at jadx.core.codegen.RegionGen.makeSwitch(RegionGen.java:298)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:64)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                            	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                            	at java.util.ArrayList.forEach(ArrayList.java:1259)
                            	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                            	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                            	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                            	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                            	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                            	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                            	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                            	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                            	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                            	at java.util.ArrayList.forEach(ArrayList.java:1259)
                            	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                            	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                            	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                            	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                            	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                            	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                            	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                            	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                            	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                            	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                            	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                            	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                            	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                            Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0099: CONSTRUCTOR  (r0v2 o.ChoosePhoneContactBridgeExtension$1) = 
                              (r4v0 'context' android.content.Context)
                              (r5v0 'notificationData' id.dana.notification.NotificationData)
                              (wrap: o.getShortName : 0x0097: IGET  (r1v2 o.getShortName) = (r3v0 'this' o.TinyAppHostApduService$1 A[THIS]) o.TinyAppHostApduService.1.setMax o.getShortName)
                             call: o.ChoosePhoneContactBridgeExtension.1.<init>(android.content.Context, id.dana.notification.NotificationData, o.getShortName):void type: CONSTRUCTOR in method: o.TinyAppHostApduService.1.setMax(android.content.Context, id.dana.notification.NotificationData):o.isNfcEnable, dex: classes3.dex
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:256)
                            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:314)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                            	... 64 more
                            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: o.ChoosePhoneContactBridgeExtension, state: NOT_LOADED
                            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:260)
                            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:606)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                            	... 68 more
                            */
                        /*
                            this = this;
                            java.lang.String r0 = r5.getMax
                            if (r0 == 0) goto L_0x00a3
                            r1 = -1
                            int r2 = r0.hashCode()
                            switch(r2) {
                                case -2035039290: goto L_0x0053;
                                case -1983828400: goto L_0x0049;
                                case -805752590: goto L_0x003f;
                                case 66575: goto L_0x0035;
                                case 191796002: goto L_0x002b;
                                case 1469380567: goto L_0x0021;
                                case 1544398073: goto L_0x0017;
                                case 2107599432: goto L_0x000d;
                                default: goto L_0x000c;
                            }
                        L_0x000c:
                            goto L_0x005c
                        L_0x000d:
                            java.lang.String r2 = "GN_AML"
                            boolean r0 = r0.equals(r2)
                            if (r0 == 0) goto L_0x005c
                            r1 = 4
                            goto L_0x005c
                        L_0x0017:
                            java.lang.String r2 = "ipgRegistration"
                            boolean r0 = r0.equals(r2)
                            if (r0 == 0) goto L_0x005c
                            r1 = 5
                            goto L_0x005c
                        L_0x0021:
                            java.lang.String r2 = "OCR_RECEIPT"
                            boolean r0 = r0.equals(r2)
                            if (r0 == 0) goto L_0x005c
                            r1 = 6
                            goto L_0x005c
                        L_0x002b:
                            java.lang.String r2 = "VOUCHER_DETAIL"
                            boolean r0 = r0.equals(r2)
                            if (r0 == 0) goto L_0x005c
                            r1 = 1
                            goto L_0x005c
                        L_0x0035:
                            java.lang.String r2 = "CDP"
                            boolean r0 = r0.equals(r2)
                            if (r0 == 0) goto L_0x005c
                            r1 = 2
                            goto L_0x005c
                        L_0x003f:
                            java.lang.String r2 = "TRANSACTION_DETAIL"
                            boolean r0 = r0.equals(r2)
                            if (r0 == 0) goto L_0x005c
                            r1 = 0
                            goto L_0x005c
                        L_0x0049:
                            java.lang.String r2 = "TWILIO_CHALLENGE"
                            boolean r0 = r0.equals(r2)
                            if (r0 == 0) goto L_0x005c
                            r1 = 7
                            goto L_0x005c
                        L_0x0053:
                            java.lang.String r2 = "INNER_URL"
                            boolean r0 = r0.equals(r2)
                            if (r0 == 0) goto L_0x005c
                            r1 = 3
                        L_0x005c:
                            switch(r1) {
                                case 0: goto L_0x009d;
                                case 1: goto L_0x0095;
                                case 2: goto L_0x008f;
                                case 3: goto L_0x0089;
                                case 4: goto L_0x0083;
                                case 5: goto L_0x0071;
                                case 6: goto L_0x006b;
                                case 7: goto L_0x0065;
                                default: goto L_0x005f;
                            }
                        L_0x005f:
                            o.HCEBridgeExtension$1 r0 = new o.HCEBridgeExtension$1
                            r0.<init>(r4, r5)
                            return r0
                        L_0x0065:
                            o.makePhoneCall r0 = new o.makePhoneCall
                            r0.<init>(r4, r5)
                            return r0
                        L_0x006b:
                            o.processCommandApdu r0 = new o.processCommandApdu
                            r0.<init>(r4, r5)
                            return r0
                        L_0x0071:
                            boolean r0 = r5.getMax()
                            if (r0 == 0) goto L_0x007d
                            o.TinyAppConstants r0 = new o.TinyAppConstants
                            r0.<init>(r4, r5)
                            return r0
                        L_0x007d:
                            o.HCEBridgeExtension$1 r0 = new o.HCEBridgeExtension$1
                            r0.<init>(r4, r5)
                            return r0
                        L_0x0083:
                            o.hasFeatureNfc r0 = new o.hasFeatureNfc
                            r0.<init>(r4, r5)
                            return r0
                        L_0x0089:
                            o.MakePhoneCallBridgeExtension r0 = new o.MakePhoneCallBridgeExtension
                            r0.<init>(r4, r5)
                            return r0
                        L_0x008f:
                            o.byteArrayToHexString r0 = new o.byteArrayToHexString
                            r0.<init>(r4, r5)
                            return r0
                        L_0x0095:
                            o.ChoosePhoneContactBridgeExtension$1 r0 = new o.ChoosePhoneContactBridgeExtension$1
                            o.getShortName r1 = r3.setMax
                            r0.<init>(r4, r5, r1)
                            return r0
                        L_0x009d:
                            o.contact r0 = new o.contact
                            r0.<init>(r4, r5)
                            return r0
                        L_0x00a3:
                            r4 = 0
                            return r4
                        */
                        throw new UnsupportedOperationException("Method not decompiled: o.TinyAppHostApduService.AnonymousClass1.setMax(android.content.Context, id.dana.notification.NotificationData):o.isNfcEnable");
                    }
                };
                NotificationData notificationData = new NotificationData();
                notificationData.getMax = RedirectType.GN_AML;
                notificationData.setMax = newHomeFragment.getString(R.string.gn_title_notification);
                notificationData.getMin = newHomeFragment.getString(R.string.gn_message_notification);
                if (newHomeFragment.getActivity() != null && (max = r0.setMax(newHomeFragment.getActivity(), notificationData)) != null) {
                    max.setMax();
                }
            }

            static /* synthetic */ void toDoubleRange(NewHomeFragment newHomeFragment) {
                String str = getStartDelay.IsOverlapping().getMin;
                if (str == null) {
                    str = "";
                }
                if (!str.isEmpty()) {
                    DanaH5.startContainerFullUrl(str, new setCancelOnTouchOutside$core() {
                        public final void onContainerDestroyed(@Nullable Bundle bundle) {
                            if (Objects.equals(getStartDelay.IsOverlapping().isInside, NewHomeFragment.this.onNavigationEvent)) {
                                NewHomeFragment.values();
                            }
                        }

                        public final void onContainerCreated(@Nullable Bundle bundle) {
                            Integer unused = NewHomeFragment.this.onNavigationEvent = getStartDelay.IsOverlapping().isInside;
                        }
                    });
                }
            }

            static /* synthetic */ void toFloatRange(NewHomeFragment newHomeFragment, boolean z) {
                if (z) {
                    newHomeFragment.equals.getMax();
                }
            }

            static /* synthetic */ void isInside(NewHomeFragment newHomeFragment, boolean z) {
                Intent max = newHomeFragment.setMax(z ? SendMoneyActivity.class : RecipientActivity.class, TrackerKey.SourceType.FOUR_KING_KONG);
                max.putExtra("transferScenario", "sendMoney");
                newHomeFragment.startActivity(max);
            }

            static /* synthetic */ void invoke(NewHomeFragment newHomeFragment) {
                DialogPermission dialogPermission = newHomeFragment.FastBitmap$CoordinateSystem;
                if (dialogPermission != null) {
                    dialogPermission.setMax();
                    newHomeFragment.permissionStatePresenter.length(true);
                }
            }

            static /* synthetic */ void invokeSuspend(NewHomeFragment newHomeFragment) {
                if (setStateOn.getMin(newHomeFragment.getContext(), "android.permission.ACCESS_FINE_LOCATION")) {
                    BLEBridgeExtension.AnonymousClass6 r2 = newHomeFragment.geofencePresenter;
                    r2.getMax.execute(new BLEBridgeExtension.AnonymousClass6.setMax(r2));
                }
            }

            static /* synthetic */ void Mean$Arithmetic(NewHomeFragment newHomeFragment) {
                LoadingLottieAnimationView loadingLottieAnimationView = newHomeFragment.toString;
                if (loadingLottieAnimationView != null) {
                    loadingLottieAnimationView.setupLoopMinMaxFrame(loadingLottieAnimationView);
                    if (newHomeFragment.toIntRange) {
                        LoadingLottieAnimationView loadingLottieAnimationView2 = newHomeFragment.toString;
                        loadingLottieAnimationView2.setMaxFrame(loadingLottieAnimationView2.getOutroMaxFrame());
                        newHomeFragment.toString.setLoopFinished(true);
                    }
                }
            }

            static /* synthetic */ void values() {
                if (getStartDelay.IsOverlapping().setMin()) {
                    getStartDelay.IsOverlapping().setMax();
                }
            }

            public static /* synthetic */ Unit onNavigationEvent(NewHomeFragment newHomeFragment) {
                if (!(newHomeFragment.getMax instanceof HomeTabActivity)) {
                    return null;
                }
                ((HomeTabActivity) newHomeFragment.getMax).nextOnboardingStep();
                return null;
            }

            public static /* synthetic */ void getCause(NewHomeFragment newHomeFragment) {
                if (getStartDelay.IsOverlapping().setMin()) {
                    getStartDelay.IsOverlapping().setMax();
                }
                newHomeFragment.Mean$Arithmetic.setMax();
            }

            public static /* synthetic */ void onRelationshipValidationResult(NewHomeFragment newHomeFragment) {
                getStartDelay.IsOverlapping().getMax = Boolean.TRUE;
                newHomeFragment.logoutPresenter.length();
            }

            public static /* synthetic */ void equals(NewHomeFragment newHomeFragment, boolean z) {
                newHomeFragment.globalNetworkPresenter.setMax(z);
                newHomeFragment.serviceCardView.refreshView();
            }

            public static /* synthetic */ void length(NewHomeFragment newHomeFragment, Boolean bool) {
                Object obj = newHomeFragment.valueOf.getMin.setMin;
                if (obj == LiveData.setMax) {
                    obj = null;
                }
                String str = (String) obj;
                newHomeFragment.invokeSuspend = str;
                if (Boolean.TRUE.equals(bool)) {
                    newHomeFragment.globalNetworkPresenter.length(str);
                }
            }

            public static /* synthetic */ void setMax(NewHomeFragment newHomeFragment, int i) {
                newHomeFragment.ptrHome.setEnabled(i == 0);
            }

            public static /* synthetic */ void toDoubleRange() {
                if (getStartDelay.IsOverlapping().setMin()) {
                    getStartDelay.IsOverlapping().setMax();
                }
            }
        }
