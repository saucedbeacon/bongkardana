package id.dana.home;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.core.widget.NestedScrollView;
import androidx.lifecycle.LiveData;
import butterknife.BindView;
import butterknife.OnClick;
import com.google.android.material.appbar.AppBarLayout;
import id.dana.R;
import id.dana.appwidget.DanaQuickActionWidgetProvider;
import id.dana.danah5.DanaH5;
import id.dana.dialog.DialogPermission;
import id.dana.domain.usereducation.BottomSheetOnBoardingScenario;
import id.dana.globalnetwork.currency.CurrencySwitchRichView;
import id.dana.globalnetwork.view.OnboardingGlobalNetworkSheetActivity;
import id.dana.globalsearch.view.widget.GlobalSearchHintView;
import id.dana.home.HomeFragment;
import id.dana.home.news.NewsFeedsView;
import id.dana.home.tab.HomeTabFragment;
import id.dana.home.view.GridMenuView;
import id.dana.home.view.SavedCardIndicatorLottieAnimationView;
import id.dana.model.CurrencyAmountModel;
import id.dana.model.GnContentModel;
import id.dana.myprofile.SettingMoreProfileActivity;
import id.dana.nearbyme.NearbyMeView;
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
import id.dana.richview.PromoBannerView;
import id.dana.richview.SurveyView;
import id.dana.richview.exploredana.ExploreDanaView;
import id.dana.richview.homereferral.HomeReferralView;
import id.dana.richview.servicescard.ServiceCardView;
import id.dana.sendmoney.RecipientActivity;
import id.dana.sendmoney_v2.landing.SendMoneyActivity;
import id.dana.social.view.SocialWidgetView;
import id.dana.tracker.TrackerKey;
import id.dana.tracker.mixpanel.TopupSource;
import in.srain.cube.views.ptr.PtrClassicFrameLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
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
import o.GriverProgressBar;
import o.GriverResourceLoadExtension;
import o.IComponent;
import o.InputBridgeExtension;
import o.PhotoView;
import o.RedDotManager;
import o.TinyAppHostApduService;
import o.VersionedParcelize;
import o.ViewPager2;
import o.access$1402;
import o.access$1602;
import o.convertDipToPx;
import o.convertSpToPx;
import o.dispatchOnCancelled;
import o.fakeDragBy;
import o.genTextSelector;
import o.getAlpha;
import o.getEnv;
import o.getMaxTextureSize;
import o.getSecureSignatureComp;
import o.getSelectedIndex;
import o.getShortName;
import o.getStartDelay;
import o.getUseAmcsLite;
import o.getUseSecurityGuard;
import o.h5PageReload;
import o.hideProgress;
import o.inTransaction;
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

public class HomeFragment extends FtsOptions$Order implements access$1602 {
    public static final int getMin = ((int) (Resources.getSystem().getDisplayMetrics().density * 36.0f));
    private static final int setMax = ((int) (Resources.getSystem().getDisplayMetrics().density * 29.0f));
    public static final int setMin = CornerMarkingDataProvider.AnonymousClass2.setMax();
    /* access modifiers changed from: private */
    public LoadingLottieAnimationView FastBitmap$CoordinateSystem;
    /* access modifiers changed from: private */
    public boolean Grayscale$Algorithm;
    private GriverResourceLoadExtension.AnonymousClass1 IsOverlapping;
    private GriverManifest.AnonymousClass36 Mean$Arithmetic;
    @BindView(2131361904)
    AppBarLayout appBarLayout;
    /* access modifiers changed from: private */
    public MatchPhoneNumberDialog create;
    @BindView(2131362618)
    CurrencySwitchRichView currencySwitch;
    @BindView(2131365627)
    TextView currencyTv;
    @Inject
    public getShortName dynamicUrlWrapper;
    private ExploreDanaView equals;
    @Inject
    public BLEBridgeExtension.AnonymousClass9 geoFenceManager;
    @Inject
    public BLEBridgeExtension.AnonymousClass6 geofencePresenter;
    @Inject
    public parameters.setMax getBalancePresenter;
    /* access modifiers changed from: private */
    public Integer getCause;
    @Inject
    public onNext.setMin globalNetworkPresenter;
    @BindView(2131365877)
    public GlobalSearchHintView globalSearchHintView;
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
    /* access modifiers changed from: private */
    public setStateOn hashCode;
    @Inject
    public VersionedParcelize.getMax homeInfoContractPresenter;
    @BindView(2131365881)
    HomeReferralView homeReferralView;
    @BindView(2131364053)
    ImageView inboxMenuBar;
    /* access modifiers changed from: private */
    public boolean invoke;
    private String invokeSuspend;
    /* access modifiers changed from: private */
    public setStateOn isInside;
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
    @BindView(2131365904)
    NearbyMeView nearbyMeView;
    @BindView(2131364145)
    NestedScrollView nestedScrollView;
    @BindView(2131365906)
    NewsFeedsView newsFeedsView;
    @Inject
    public getSelectedIndex.length onBoardingPresenter;
    private boolean onNavigationEvent;
    @Inject
    public resetTouch ottVerifyPresenter;
    @Inject
    public ViewPager2.OffscreenPageLimit.length permissionStatePresenter;
    @BindView(2131361930)
    PromoBannerView promoBannerView;
    @BindView(2131364301)
    PtrClassicFrameLayout ptrHome;
    @Inject
    public fakeDragBy.length queryPayMethodPresenter;
    @Inject
    public onFailure.getMin sendMoneyV2Presenter;
    @BindView(2131365952)
    ServiceCardView serviceCardView;
    @Inject
    public CustomPopMenuExtension sessionExpiredManager;
    @BindView(2131365960)
    SocialWidgetView socialWidgetView;
    @BindView(2131365968)
    SurveyView surveyView;
    /* access modifiers changed from: private */
    public DefaultBlueToothProxy toDoubleRange;
    private final IComponent<Boolean> toFloatRange;
    private final length toIntRange;
    /* access modifiers changed from: private */
    public DialogPermission toString;
    @BindView(2131365119)
    TextView tvBalance;
    @BindView(2131365291)
    TextView tvHiddenPayContent;
    @Inject
    public restoreState.length unreadInboxPresenter;
    /* access modifiers changed from: private */
    public String valueOf;
    /* access modifiers changed from: private */
    public GriverManifest.AnonymousClass53 values;
    @BindView(2131365843)
    View viewBalanceClickArea;

    public interface length {
        void getMax();

        void length();

        void setMax();
    }

    public final int setMin() {
        return R.layout.fragment_home;
    }

    public HomeFragment() {
        this((length) null);
    }

    private HomeFragment(length length2) {
        this.toFloatRange = IComponent.setMax();
        this.toIntRange = length2;
    }

    public static HomeFragment setMin(length length2) {
        return new HomeFragment(length2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:75:0x03b1  */
    /* JADX WARNING: Removed duplicated region for block: B:94:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setMax() {
        /*
            r15 = this;
            java.lang.String r0 = "FCMPush"
            android.view.View r1 = r15.getView()
            if (r1 == 0) goto L_0x0017
            android.view.View r1 = r15.getView()
            r2 = 2131365867(0x7f0a0feb, float:1.8351611E38)
            android.view.View r1 = r1.findViewById(r2)
            id.dana.richview.exploredana.ExploreDanaView r1 = (id.dana.richview.exploredana.ExploreDanaView) r1
            r15.equals = r1
        L_0x0017:
            androidx.fragment.app.FragmentActivity r1 = r15.getActivity()
            if (r1 != 0) goto L_0x001e
            return
        L_0x001e:
            o.onFinishInflate r1 = new o.onFinishInflate
            androidx.fragment.app.FragmentActivity r2 = r15.getActivity()
            o.onFinishInflate$setMin r3 = new o.onFinishInflate$setMin
            r3.<init>()
            r1.<init>((o.ListMenuItemView) r2, (o.onFinishInflate.setMax) r3)
            java.lang.Class<o.GriverManifest$36> r2 = o.GriverManifest.AnonymousClass36.class
            o.setGroupDividerEnabled r1 = r1.setMax(r2)
            o.GriverManifest$36 r1 = (o.GriverManifest.AnonymousClass36) r1
            r15.Mean$Arithmetic = r1
            androidx.fragment.app.FragmentActivity r1 = r15.getActivity()
            id.dana.home.HomeTabActivity r1 = (id.dana.home.HomeTabActivity) r1
            o.GriverManifest$53 r1 = r1.getSwipeDelegateListener()
            r15.values = r1
            o.GriverResourceLoadExtension$1 r1 = r15.IsOverlapping
            r2 = 0
            r3 = 0
            if (r1 != 0) goto L_0x010f
            o.loadSnapshotFile$setMax r1 = new o.loadSnapshotFile$setMax
            r1.<init>(r3)
            id.dana.base.BaseActivity r4 = r15.getMax
            if (r4 == 0) goto L_0x0058
            id.dana.base.BaseActivity r4 = r15.getMax
            o.PrepareException$1 r4 = r4.getApplicationComponent()
            goto L_0x0059
        L_0x0058:
            r4 = r2
        L_0x0059:
            if (r4 == 0) goto L_0x010e
            o.PrepareException$1 r4 = (o.PrepareException.AnonymousClass1) r4
            r1.hashCode = r4
            id.dana.contract.permission.PermissionStateModule r4 = new id.dana.contract.permission.PermissionStateModule
            id.dana.home.HomeFragment$24 r5 = new id.dana.home.HomeFragment$24
            r5.<init>()
            r4.<init>(r5)
            id.dana.contract.permission.PermissionStateModule r4 = (id.dana.contract.permission.PermissionStateModule) r4
            r1.setMin = r4
            id.dana.contract.user.GetBalanceModule r4 = new id.dana.contract.user.GetBalanceModule
            id.dana.home.HomeFragment$22 r5 = new id.dana.home.HomeFragment$22
            r5.<init>()
            r4.<init>(r5)
            id.dana.contract.user.GetBalanceModule r4 = (id.dana.contract.user.GetBalanceModule) r4
            r1.getMin = r4
            id.dana.contract.inbox.UnreadInboxModule r4 = new id.dana.contract.inbox.UnreadInboxModule
            id.dana.home.HomeFragment$23 r5 = new id.dana.home.HomeFragment$23
            r5.<init>()
            r4.<init>(r5)
            id.dana.contract.inbox.UnreadInboxModule r4 = (id.dana.contract.inbox.UnreadInboxModule) r4
            r1.getMax = r4
            id.dana.contract.payasset.QueryPayMethodModule r4 = new id.dana.contract.payasset.QueryPayMethodModule
            id.dana.home.HomeFragment$1 r5 = new id.dana.home.HomeFragment$1
            r5.<init>()
            r4.<init>(r5)
            id.dana.contract.payasset.QueryPayMethodModule r4 = (id.dana.contract.payasset.QueryPayMethodModule) r4
            r1.setMax = r4
            id.dana.contract.homeinfo.HomeInfoModule r4 = new id.dana.contract.homeinfo.HomeInfoModule
            id.dana.home.HomeFragment$5 r5 = new id.dana.home.HomeFragment$5
            r5.<init>()
            r4.<init>(r5)
            id.dana.contract.homeinfo.HomeInfoModule r4 = (id.dana.contract.homeinfo.HomeInfoModule) r4
            r1.length = r4
            id.dana.di.modules.BottomSheetOnBoardingModule r4 = new id.dana.di.modules.BottomSheetOnBoardingModule
            id.dana.home.HomeFragment$3 r5 = new id.dana.home.HomeFragment$3
            r5.<init>()
            r4.<init>(r5)
            id.dana.di.modules.BottomSheetOnBoardingModule r4 = (id.dana.di.modules.BottomSheetOnBoardingModule) r4
            r1.isInside = r4
            id.dana.di.modules.GeofenceModule r4 = new id.dana.di.modules.GeofenceModule
            id.dana.home.HomeFragment$4 r5 = new id.dana.home.HomeFragment$4
            r5.<init>()
            r4.<init>(r5)
            id.dana.di.modules.GeofenceModule r4 = (id.dana.di.modules.GeofenceModule) r4
            r1.IsOverlapping = r4
            id.dana.di.modules.GlobalNetworkModule r4 = new id.dana.di.modules.GlobalNetworkModule
            id.dana.home.HomeFragment$6 r5 = new id.dana.home.HomeFragment$6
            r5.<init>()
            r4.<init>(r5)
            id.dana.di.modules.GlobalNetworkModule r4 = (id.dana.di.modules.GlobalNetworkModule) r4
            r1.toIntRange = r4
            id.dana.di.modules.LogoutModule r4 = new id.dana.di.modules.LogoutModule
            id.dana.home.HomeFragment$8 r5 = new id.dana.home.HomeFragment$8
            r5.<init>()
            r4.<init>(r5)
            id.dana.di.modules.LogoutModule r4 = (id.dana.di.modules.LogoutModule) r4
            r1.equals = r4
            id.dana.contract.ott.OttVerifyModule r4 = new id.dana.contract.ott.OttVerifyModule
            id.dana.home.HomeFragment$9 r5 = new id.dana.home.HomeFragment$9
            r5.<init>()
            r4.<init>(r5)
            id.dana.contract.ott.OttVerifyModule r4 = (id.dana.contract.ott.OttVerifyModule) r4
            r1.toFloatRange = r4
            id.dana.contract.globalsearch.GlobalSearchModule r4 = new id.dana.contract.globalsearch.GlobalSearchModule
            id.dana.home.HomeFragment$7 r5 = new id.dana.home.HomeFragment$7
            r5.<init>()
            r4.<init>(r5)
            id.dana.contract.globalsearch.GlobalSearchModule r4 = (id.dana.contract.globalsearch.GlobalSearchModule) r4
            r1.toDoubleRange = r4
            id.dana.sendmoney.di.module.SendMoneyV2Module r4 = new id.dana.sendmoney.di.module.SendMoneyV2Module
            id.dana.home.HomeFragment$25 r5 = new id.dana.home.HomeFragment$25
            r5.<init>()
            r4.<init>(r5)
            id.dana.sendmoney.di.module.SendMoneyV2Module r4 = (id.dana.sendmoney.di.module.SendMoneyV2Module) r4
            r1.toString = r4
            o.GriverResourceLoadExtension$1 r1 = r1.setMax()
            r15.IsOverlapping = r1
            goto L_0x010f
        L_0x010e:
            throw r2
        L_0x010f:
            o.GriverResourceLoadExtension$1 r1 = r15.IsOverlapping
            r1.setMin(r15)
            r1 = 7
            o.onDelete$getMin[] r1 = new o.onDelete.getMin[r1]
            o.parameters$setMax r4 = r15.getBalancePresenter
            r1[r3] = r4
            o.restoreState$length r4 = r15.unreadInboxPresenter
            r5 = 1
            r1[r5] = r4
            o.fakeDragBy$length r4 = r15.queryPayMethodPresenter
            r6 = 2
            r1[r6] = r4
            o.VersionedParcelize$getMax r4 = r15.homeInfoContractPresenter
            r7 = 3
            r1[r7] = r4
            o.getSelectedIndex$length r4 = r15.onBoardingPresenter
            r8 = 4
            r1[r8] = r4
            o.getAlpha$length r4 = r15.globalSearchPresenter
            r9 = 5
            r1[r9] = r4
            r4 = 6
            o.onFailure$getMin r10 = r15.sendMoneyV2Presenter
            r1[r4] = r10
            r15.getMin(r1)
            o.setStateOn$getMin r1 = new o.setStateOn$getMin
            r1.<init>((androidx.fragment.app.Fragment) r15)
            java.lang.String r4 = "android.permission.ACCESS_FINE_LOCATION"
            java.lang.String r10 = "android.permission.ACCESS_COARSE_LOCATION"
            java.lang.String[] r10 = new java.lang.String[]{r4, r10}
            java.util.List<java.lang.String> r11 = r1.length
            java.util.Collections.addAll(r11, r10)
            id.dana.home.HomeFragment$11 r10 = new id.dana.home.HomeFragment$11
            r10.<init>()
            r1.getMax = r10
            o.setStateOn r10 = new o.setStateOn
            r10.<init>(r1, r3)
            r15.isInside = r10
            o.setStateOn$getMin r1 = new o.setStateOn$getMin
            r1.<init>((androidx.fragment.app.Fragment) r15)
            java.util.List<java.lang.String> r10 = r1.length
            java.lang.String r11 = "android.permission.READ_CONTACTS"
            r10.add(r11)
            id.dana.home.HomeFragment$14 r10 = new id.dana.home.HomeFragment$14
            r10.<init>()
            r1.getMax = r10
            o.setStateOn r10 = new o.setStateOn
            r10.<init>(r1, r3)
            r15.hashCode = r10
            in.srain.cube.views.ptr.PtrClassicFrameLayout r1 = r15.ptrHome
            r1.setPtrHandler(r15)
            in.srain.cube.views.ptr.PtrClassicFrameLayout r1 = r15.ptrHome
            r1.disableWhenHorizontalMove(r5)
            in.srain.cube.views.ptr.PtrClassicFrameLayout r1 = r15.ptrHome
            android.view.LayoutInflater r3 = r15.getLayoutInflater()
            r5 = 2131559465(0x7f0d0429, float:1.8744275E38)
            android.view.View r2 = r3.inflate(r5, r2)
            r1.setHeaderView(r2)
            in.srain.cube.views.ptr.PtrClassicFrameLayout r1 = r15.ptrHome
            android.view.View r1 = r1.getHeaderView()
            r2 = 2131363718(0x7f0a0786, float:1.8347253E38)
            android.view.View r1 = r1.findViewById(r2)
            id.dana.richview.LoadingLottieAnimationView r1 = (id.dana.richview.LoadingLottieAnimationView) r1
            r15.FastBitmap$CoordinateSystem = r1
            id.dana.home.HomeFragment$16 r2 = new id.dana.home.HomeFragment$16
            r2.<init>()
            r1.addAnimatorListener(r2)
            o.DefaultBlueToothProxy r1 = new o.DefaultBlueToothProxy
            androidx.fragment.app.FragmentActivity r2 = r15.getActivity()
            r1.<init>(r2)
            r15.toDoubleRange = r1
            o.onNext$setMin r1 = r15.globalNetworkPresenter
            java.lang.String r2 = "ID"
            r1.equals(r2)
            id.dana.globalnetwork.currency.CurrencySwitchRichView r1 = r15.currencySwitch
            r1.setLocalCurrencySymbol(r2)
            id.dana.globalnetwork.currency.CurrencySwitchRichView r1 = r15.currencySwitch
            o.GriverManifest$26 r2 = new o.GriverManifest$26
            r2.<init>(r15)
            r1.setSwitchStateListener(r2)
            o.GriverManifest$36 r1 = r15.Mean$Arithmetic
            o.CascadingMenuPopup$HorizPosition<java.lang.Boolean> r1 = r1.setMax
            boolean r2 = r1.setMax()
            if (r2 != 0) goto L_0x01e5
            o.setChecked r2 = r15.getViewLifecycleOwner()
            id.dana.globalnetwork.currency.CurrencySwitchRichView r3 = r15.currencySwitch
            java.util.Objects.requireNonNull(r3)
            o.GriverManifest$21 r5 = new o.GriverManifest$21
            r5.<init>(r3)
            r1.getMax(r2, r5)
        L_0x01e5:
            r15.o_()
            o.fakeDragBy$length r1 = r15.queryPayMethodPresenter
            if (r1 == 0) goto L_0x01ef
            r1.equals()
        L_0x01ef:
            androidx.fragment.app.FragmentActivity r1 = r15.getActivity()
            android.content.Intent r1 = r1.getIntent()
            android.os.Bundle r1 = r1.getExtras()
            if (r1 == 0) goto L_0x02a2
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            java.util.Set r3 = r1.keySet()
            java.util.Iterator r3 = r3.iterator()
        L_0x020a:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x024b
            java.lang.Object r5 = r3.next()
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r10 = r1.getString(r5)     // Catch:{ ClassCastException -> 0x023c }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r12 = "Notification data ["
            r11.<init>(r12)
            r11.append(r5)
            java.lang.String r12 = " : "
            r11.append(r12)
            r11.append(r10)
            java.lang.String r12 = "]"
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            o.updateActionSheetContent.d(r0, r11)
            r2.put(r5, r10)
            goto L_0x020a
        L_0x023c:
            r10 = move-exception
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.String r11 = "getNotificationData error. key = "
            java.lang.String r5 = r11.concat(r5)
            o.updateActionSheetContent.e(r0, r5, r10)
            goto L_0x020a
        L_0x024b:
            o.TinyAppHostApduService$1 r0 = new o.TinyAppHostApduService$1
            o.getShortName r3 = r15.dynamicUrlWrapper
            r0.<init>(r3)
            java.lang.String r3 = "iconUrl"
            java.lang.String r3 = r1.getString(r3)
            java.lang.String r5 = "contentType"
            java.lang.String r5 = r1.getString(r5)
            java.lang.String r10 = "redirectType"
            java.lang.String r10 = r1.getString(r10)
            java.lang.String r11 = "redirectValue"
            java.lang.String r11 = r1.getString(r11)
            java.lang.String r12 = "imageUrl"
            java.lang.String r12 = r1.getString(r12)
            java.lang.String r13 = "contextCode"
            java.lang.String r13 = r1.getString(r13)
            java.lang.String r14 = "contextValue"
            java.lang.String r1 = r1.getString(r14)
            id.dana.notification.NotificationData r14 = new id.dana.notification.NotificationData
            r14.<init>()
            r14.length = r5
            r14.setMin = r3
            r14.getMax = r10
            r14.toFloatRange = r11
            r14.IsOverlapping = r12
            r14.equals = r13
            r14.hashCode = r1
            r14.FastBitmap$CoordinateSystem = r2
            androidx.fragment.app.FragmentActivity r1 = r15.getActivity()
            o.isNfcEnable r0 = r0.setMax(r1, r14)
            if (r0 == 0) goto L_0x02a2
            androidx.fragment.app.FragmentActivity r1 = r15.getActivity()
            r0.setMax(r1)
        L_0x02a2:
            boolean r0 = o.CornerMarkingDataProvider.IsOverlapping()
            if (r0 == 0) goto L_0x02b7
            android.content.Context r0 = r15.getContext()
            boolean r0 = o.setStateOn.getMin(r0, r4)
            if (r0 != 0) goto L_0x02b7
            o.ViewPager2$OffscreenPageLimit$length r0 = r15.permissionStatePresenter
            r0.length()
        L_0x02b7:
            id.dana.nearbyme.NearbyMeView r0 = r15.nearbyMeView
            id.dana.home.HomeFragment$20 r1 = new id.dana.home.HomeFragment$20
            r1.<init>()
            r0.setOnNearbyMeEntryView(r1)
            id.dana.nearbyme.NearbyMeView r0 = r15.nearbyMeView
            java.lang.String r1 = "Home"
            r0.setSource(r1)
            id.dana.social.view.SocialWidgetView r0 = r15.socialWidgetView
            id.dana.home.HomeFragment$2 r1 = new id.dana.home.HomeFragment$2
            r1.<init>()
            r0.setWidgetListener(r1)
            androidx.core.widget.NestedScrollView r0 = r15.nestedScrollView
            id.dana.home.HomeFragment$15 r1 = new id.dana.home.HomeFragment$15
            o.IComponent<java.lang.Boolean> r2 = r15.toFloatRange
            r1.<init>(r2)
            r0.setOnScrollChangeListener(r1)
            r15.FastBitmap$CoordinateSystem()
            android.content.Context r0 = r15.getContext()
            boolean r0 = o.setStateOn.getMin(r0, r4)
            if (r0 == 0) goto L_0x02f9
            o.BLEBridgeExtension$6 r0 = r15.geofencePresenter
            o.flingScroll r1 = r0.getMax
            o.BLEBridgeExtension$6$setMax r2 = new o.BLEBridgeExtension$6$setMax
            r2.<init>(r0)
            o.setGlobalUserData r2 = (o.setGlobalUserData) r2
            r1.execute(r2)
        L_0x02f9:
            o.onNext$setMin r0 = r15.globalNetworkPresenter
            r0.length()
            o.parameters$setMax r0 = r15.getBalancePresenter
            r0.getMin()
            o.onNext$setMin r0 = r15.globalNetworkPresenter
            r0.toDoubleRange()
            r15.FastBitmap$CoordinateSystem()
            android.content.Context r0 = r15.getContext()
            boolean r0 = o.setStateOn.getMin(r0, r4)
            if (r0 == 0) goto L_0x0323
            o.BLEBridgeExtension$6 r0 = r15.geofencePresenter
            o.flingScroll r1 = r0.getMax
            o.BLEBridgeExtension$6$setMax r2 = new o.BLEBridgeExtension$6$setMax
            r2.<init>(r0)
            o.setGlobalUserData r2 = (o.setGlobalUserData) r2
            r1.execute(r2)
        L_0x0323:
            o.getStartDelay r0 = o.getStartDelay.IsOverlapping()
            boolean r1 = r0.getMax()
            java.lang.String r2 = ""
            if (r1 == 0) goto L_0x0349
            java.lang.String r1 = r0.setMax
            if (r1 != 0) goto L_0x0334
            r1 = r2
        L_0x0334:
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x0349
            o.resetTouch r0 = r15.ottVerifyPresenter
            o.GriverOpenAuthExtension$RevokeCallback r1 = r0.setMin
            o.resetTouch$setMax r2 = new o.resetTouch$setMax
            r2.<init>(r0)
            o.setGlobalUserData r2 = (o.setGlobalUserData) r2
            r1.execute(r2)
            goto L_0x038a
        L_0x0349:
            boolean r1 = r0.getMax()
            if (r1 == 0) goto L_0x038a
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r0.toFloatRange = r1
            o.getStartDelay r0 = o.getStartDelay.IsOverlapping()
            java.lang.String r0 = r0.setMin
            if (r0 != 0) goto L_0x035c
            r0 = r2
        L_0x035c:
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0372
            o.resetTouch r0 = r15.ottVerifyPresenter
            o.getStartDelay r1 = o.getStartDelay.IsOverlapping()
            java.lang.String r1 = r1.setMin
            if (r1 != 0) goto L_0x036d
            goto L_0x036e
        L_0x036d:
            r2 = r1
        L_0x036e:
            r0.getMin((java.lang.String) r2)
            goto L_0x038a
        L_0x0372:
            o.getStartDelay r0 = o.getStartDelay.IsOverlapping()
            java.lang.String r0 = r0.getMin
            if (r0 != 0) goto L_0x037b
            goto L_0x037c
        L_0x037b:
            r2 = r0
        L_0x037c:
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x038a
            id.dana.home.HomeFragment$19 r0 = new id.dana.home.HomeFragment$19
            r0.<init>()
            id.dana.danah5.DanaH5.startContainerFullUrl(r2, r0)
        L_0x038a:
            o.onNext$setMin r0 = r15.globalNetworkPresenter
            r0.length()
            o.parameters$setMax r0 = r15.getBalancePresenter
            r0.getMin()
            o.VersionedParcelize$getMax r0 = r15.homeInfoContractPresenter
            r0.getMax()
            o.getAlpha$length r0 = r15.globalSearchPresenter
            r0.getMax()
            androidx.fragment.app.FragmentActivity r0 = r15.getActivity()
            boolean r0 = r0 instanceof id.dana.home.HomeTabActivity
            if (r0 == 0) goto L_0x03e1
            androidx.fragment.app.FragmentActivity r0 = r15.getActivity()
            android.content.Intent r0 = r0.getIntent()
            if (r0 != 0) goto L_0x03b1
            goto L_0x03e1
        L_0x03b1:
            androidx.fragment.app.FragmentActivity r0 = r15.getActivity()
            android.content.Intent r0 = r0.getIntent()
            android.os.Bundle r0 = r0.getExtras()
            int r0 = id.dana.appshortcut.DanaAppShortcut.getMin((android.os.Bundle) r0)
            if (r0 == r6) goto L_0x03dc
            if (r0 == r7) goto L_0x03d6
            if (r0 == r8) goto L_0x03d0
            if (r0 == r9) goto L_0x03ca
            goto L_0x03cf
        L_0x03ca:
            android.view.View r0 = r15.viewBalanceClickArea
            r0.performClick()
        L_0x03cf:
            return
        L_0x03d0:
            id.dana.home.view.GridMenuView r0 = r15.gmvRequest
            r0.performClick()
            return
        L_0x03d6:
            id.dana.home.view.GridMenuView r0 = r15.gmvSend
            r0.performClick()
            return
        L_0x03dc:
            id.dana.home.view.GridMenuView r0 = r15.gmvTopup
            r0.performClick()
        L_0x03e1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: id.dana.home.HomeFragment.setMax():void");
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
        this.socialWidgetView.onResume();
        fakeDragBy.length length2 = this.queryPayMethodPresenter;
        if (length2 != null) {
            length2.length();
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
    }

    public void onPause() {
        this.queryPayMethodPresenter.toFloatRange();
        super.onPause();
    }

    public void onDestroyView() {
        PromoBannerView promoBannerView2 = this.promoBannerView;
        if (promoBannerView2 != null) {
            promoBannerView2.unbindAdapter();
        }
        MissionSummaryView missionSummaryView2 = this.missionSummaryView;
        if (missionSummaryView2 != null) {
            missionSummaryView2.unregisterReceiver();
        }
        super.onDestroyView();
    }

    public final void o_() {
        restoreState.length length2 = this.unreadInboxPresenter;
        if (length2 != null) {
            length2.length();
        }
        fakeDragBy.length length3 = this.queryPayMethodPresenter;
        if (length3 != null) {
            length3.length();
        }
        super.o_();
    }

    public final void IsOverlapping() {
        parameters.setMax setmax = this.getBalancePresenter;
        if (setmax != null) {
            setmax.length();
        }
        super.IsOverlapping();
    }

    public final void getMin(String str, String str2, Boolean bool) {
        if (str != null && str2 != null && bool != null) {
            this.homeInfoContractPresenter.length(str, str2, bool.booleanValue());
        } else if (this.getMax instanceof HomeTabActivity) {
            ((HomeTabActivity) this.getMax).nextOnboardingStep();
        }
    }

    private void FastBitmap$CoordinateSystem() {
        AnonymousClass17 r0 = new observedEntities(this.getMax) {
            public final void getMin(View view) {
                HomeFragment homeFragment = HomeFragment.this;
                switch (view.getId()) {
                    case R.id.f44752131363010 /*2131363010*/:
                        homeFragment.startActivity(homeFragment.setMax(RequestMoneyActivity.class, TrackerKey.SourceType.FOUR_KING_KONG));
                        return;
                    case R.id.f44772131363012 /*2131363012*/:
                        homeFragment.sendMoneyV2Presenter.setMin();
                        return;
                    case R.id.f44782131363013 /*2131363013*/:
                        homeFragment.onClickTopup();
                        return;
                    case R.id.f72082131365843 /*2131365843*/:
                        homeFragment.startActivity(new Intent(homeFragment.getActivity(), WalletActivity.class));
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
        } else if (ExploreDanaView.EXPLORE_DANA_REQUEST_CODE == i) {
            ExploreDanaView exploreDanaView = this.equals;
            if (exploreDanaView != null) {
                exploreDanaView.onActivityResult(i2, intent);
            }
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
        if (!this.isInside.getMin(i, strArr, iArr)) {
            super.onRequestPermissionsResult(i, strArr, iArr);
        }
        if (!this.hashCode.getMin(i, strArr, iArr)) {
            super.onRequestPermissionsResult(i, strArr, iArr);
        }
    }

    /* access modifiers changed from: private */
    public boolean values() {
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

    @OnClick({2131364053})
    public void onClickInbox() {
        GriverManifest.AnonymousClass53 r0 = this.values;
        if (r0 != null) {
            r0.getMax(TrackerKey.SourceType.INBOX_ICON, false);
        }
    }

    @OnClick({2131363011})
    public void onClickScan() {
        GriverManifest.AnonymousClass53 r0 = this.values;
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
        LoadingLottieAnimationView loadingLottieAnimationView = this.FastBitmap$CoordinateSystem;
        if (loadingLottieAnimationView != null) {
            loadingLottieAnimationView.playAnimation();
        }
        int i = 0;
        NewsFeedsView newsFeedsView2 = this.newsFeedsView;
        if (newsFeedsView2 != null) {
            i = newsFeedsView2.getPageSize();
            this.newsFeedsView.refreshFeeds(i, (String) null, Boolean.TRUE);
        }
        NearbyMeView nearbyMeView2 = this.nearbyMeView;
        if (nearbyMeView2 != null && nearbyMeView2.getVisibility() == 0) {
            this.nearbyMeView.checkPermission(true);
        }
        MissionSummaryView missionSummaryView2 = this.missionSummaryView;
        if (missionSummaryView2 != null) {
            missionSummaryView2.checkPromoQuest();
        }
        this.homeInfoContractPresenter.length(i);
        this.homeReferralView.checkReferralQuestExists();
        this.socialWidgetView.refreshTimeline();
        this.promoBannerView.refreshView();
    }

    public final setUseAmcsLite getMin(View view, getEnv getenv, int i, int i2, int i3) {
        return ((setUseSecurityGuard) ((setUseSecurityGuard) ((setUseSecurityGuard) new setUseSecurityGuard(this.getMax).getMax(view)).setMin(getenv)).getMin(new access$1402(getResources().getString(i), getResources().getString(i2), i3))).getMin();
    }

    private void setMin(boolean z) {
        convertDipToPx.length length2 = new convertDipToPx.length(getContext());
        length2.getMax = TrackerKey.Event.HOME_POP_UP_ACTION;
        convertDipToPx.length min = length2.setMin(TrackerKey.Property.IS_CONFIRM, z);
        min.setMin();
        convertDipToPx convertdiptopx = new convertDipToPx(min, (byte) 0);
        List length3 = convertdiptopx.length != null ? convertdiptopx.length.length : new ArrayList();
        genTextSelector.setMax((convertSpToPx[]) length3.toArray(new convertSpToPx[length3.size()]));
    }

    public static abstract class getMin implements NestedScrollView.setMax {
        private final IComponent<Boolean> setMax;

        /* access modifiers changed from: package-private */
        public abstract void getMin(GriverProgressBar.UpdateRunnable updateRunnable);

        /* access modifiers changed from: package-private */
        public abstract void setMax();

        public getMin(IComponent<Boolean> iComponent) {
            this.setMax = iComponent;
            getMin(iComponent.debounce(SettingMoreProfileActivity.TOAST_DURATION, TimeUnit.MILLISECONDS).subscribeOn(getSecureSignatureComp.getMin()).observeOn(hideProgress.length()).subscribe(new RedDotManager(this) {
                private final HomeFragment.getMin getMin;

                {
                    this.getMin = r1;
                }

                public final void accept(Object obj) {
                    this.getMin.setMax();
                }
            }));
        }

        public void setMax(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4) {
            this.setMax.onNext(Boolean.TRUE);
        }
    }

    public final void equals() {
        convertDipToPx.length length2 = new convertDipToPx.length(getContext());
        length2.getMax = TrackerKey.Event.HOME_POP_UP_OPEN;
        convertDipToPx.length max = length2.setMax("Purpose", "Login Binding Payment");
        max.setMin();
        convertDipToPx convertdiptopx = new convertDipToPx(max, (byte) 0);
        List length3 = convertdiptopx.length != null ? convertdiptopx.length.length : new ArrayList();
        genTextSelector.setMax((convertSpToPx[]) length3.toArray(new convertSpToPx[length3.size()]));
        MatchPhoneNumberDialog.getMin getmin = new MatchPhoneNumberDialog.getMin(getContext(), new DialogInterface.OnDismissListener(this) {
            private final HomeFragment length;

            {
                this.length = r1;
            }

            public final void onDismiss(DialogInterface dialogInterface) {
                HomeFragment.extraCallback(this.length);
            }
        });
        getmin.getMin = new View.OnClickListener(this) {
            private final HomeFragment getMax;

            {
                this.getMax = r1;
            }

            public final void onClick(View view) {
                HomeFragment.onRelationshipValidationResult(this.getMax);
            }
        };
        getmin.setMin = new View.OnClickListener(this) {
            private final HomeFragment setMax;

            {
                this.setMax = r1;
            }

            public final void onClick(View view) {
                HomeFragment.onMessageChannelReady(this.setMax);
            }
        };
        MatchPhoneNumberDialog matchPhoneNumberDialog = new MatchPhoneNumberDialog(getmin.getMax, getmin.setMax, getmin, (byte) 0);
        this.create = matchPhoneNumberDialog;
        matchPhoneNumberDialog.setMin();
    }

    static /* synthetic */ void equals(HomeFragment homeFragment) {
        LoadingLottieAnimationView loadingLottieAnimationView = homeFragment.FastBitmap$CoordinateSystem;
        if (loadingLottieAnimationView != null) {
            loadingLottieAnimationView.setupLoopMinMaxFrame(loadingLottieAnimationView);
            if (homeFragment.Grayscale$Algorithm) {
                LoadingLottieAnimationView loadingLottieAnimationView2 = homeFragment.FastBitmap$CoordinateSystem;
                loadingLottieAnimationView2.setMaxFrame(loadingLottieAnimationView2.getOutroMaxFrame());
                homeFragment.FastBitmap$CoordinateSystem.setLoopFinished(true);
            }
        }
    }

    static /* synthetic */ void setMax(HomeFragment homeFragment, boolean z) {
        Intent max = homeFragment.setMax(z ? SendMoneyActivity.class : RecipientActivity.class, TrackerKey.SourceType.FOUR_KING_KONG);
        max.putExtra("transferScenario", "sendMoney");
        homeFragment.startActivity(max);
    }

    static /* synthetic */ void toFloatRange(HomeFragment homeFragment) {
        if (homeFragment.getContext() != null && homeFragment.toString == null) {
            DialogPermission max = setAcParams.getMax(homeFragment.getContext(), "location", new DialogPermission.length() {
                public final void onDialogDismissed() {
                }

                public final void onPositiveButtonClicked() {
                    HomeFragment.this.isInside.setMin();
                    HomeFragment.this.toString.setMax();
                }

                public final void onNegativeButtonClicked() {
                    HomeFragment.Grayscale$Algorithm(HomeFragment.this);
                }
            });
            homeFragment.toString = max;
            max.setMin();
        }
    }

    static /* synthetic */ void isInside(HomeFragment homeFragment) {
        DefaultBlueToothProxy defaultBlueToothProxy = homeFragment.toDoubleRange;
        if (defaultBlueToothProxy != null) {
            defaultBlueToothProxy.dismiss();
        }
    }

    static /* synthetic */ void getMax(HomeFragment homeFragment, String str, String str2) {
        homeFragment.llPayContent.setVisibility(0);
        homeFragment.currencyTv.setVisibility(0);
        homeFragment.currencyTv.setText(str2);
        homeFragment.tvBalance.setText(str);
        DefaultBlueToothProxy defaultBlueToothProxy = homeFragment.toDoubleRange;
        if (defaultBlueToothProxy != null) {
            defaultBlueToothProxy.dismiss();
        }
    }

    static /* synthetic */ void getMin(HomeFragment homeFragment, CurrencyAmountModel currencyAmountModel) {
        if (homeFragment.getContext() != null) {
            DanaQuickActionWidgetProvider.refreshQuickActionWidgets(homeFragment.getContext(), currencyAmountModel);
        }
    }

    static /* synthetic */ void toIntRange(HomeFragment homeFragment) {
        CascadingMenuPopup$HorizPosition<Boolean> cascadingMenuPopup$HorizPosition = homeFragment.Mean$Arithmetic.getMax;
        if (!cascadingMenuPopup$HorizPosition.setMax()) {
            cascadingMenuPopup$HorizPosition.getMax(homeFragment.getViewLifecycleOwner(), new onMeasure(homeFragment) {
                private final HomeFragment setMax;

                {
                    this.setMax = r1;
                }

                public final void onChanged(Object obj) {
                    HomeFragment.setMax(this.setMax, (Boolean) obj);
                }
            });
        }
    }

    static /* synthetic */ void getMin(HomeFragment homeFragment, boolean z) {
        int i = 0;
        homeFragment.tvBalance.setVisibility(z ? 0 : 8);
        TextView textView = homeFragment.tvHiddenPayContent;
        if (z) {
            i = 8;
        }
        textView.setVisibility(i);
    }

    static /* synthetic */ void getMax(HomeFragment homeFragment, boolean z) {
        ImageView imageView = homeFragment.inboxMenuBar;
        if (imageView != null) {
            imageView.setSelected(z);
        }
    }

    static /* synthetic */ void setMin(HomeFragment homeFragment, boolean z) {
        SavedCardIndicatorLottieAnimationView savedCardIndicatorLottieAnimationView = homeFragment.lavSavedCardIndicator;
        if (savedCardIndicatorLottieAnimationView != null) {
            savedCardIndicatorLottieAnimationView.setHasSavedCard(z);
        }
    }

    static /* synthetic */ void getMin(HomeFragment homeFragment, InputBridgeExtension inputBridgeExtension) {
        TextView textView;
        if (inputBridgeExtension != null && inputBridgeExtension.setMax != null && (textView = homeFragment.tvBalance) != null && !homeFragment.onNavigationEvent) {
            textView.setText(setLineVisible.length(new CurrencyAmountModel(inputBridgeExtension.setMax.getMax)));
        }
    }

    static /* synthetic */ void getMin(HomeFragment homeFragment, h5PageReload h5pagereload) {
        ImageView imageView;
        if (h5pagereload != null && h5pagereload.length() && (imageView = homeFragment.inboxMenuBar) != null) {
            imageView.setSelected(h5pagereload.getMin());
        }
    }

    static /* synthetic */ void setMin(HomeFragment homeFragment, MerchantConsultReviewModel merchantConsultReviewModel) {
        MerchantReviewDialogFragment.getMin getmin = MerchantReviewDialogFragment.length;
        MerchantReviewDialogFragment.getMin.setMin(homeFragment.getChildFragmentManager(), merchantConsultReviewModel, false, new Function1(homeFragment) {
            private final HomeFragment setMax;

            {
                this.setMax = r1;
            }

            public final Object invoke(Object obj) {
                return HomeFragment.onPostMessage(this.setMax);
            }
        });
    }

    static /* synthetic */ void IsOverlapping(HomeFragment homeFragment) {
        homeFragment.Grayscale$Algorithm = true;
        PromoBannerView promoBannerView2 = homeFragment.promoBannerView;
        if (promoBannerView2 != null) {
            promoBannerView2.hideBannerSkeleton();
        }
    }

    static /* synthetic */ void values(HomeFragment homeFragment) {
        if (homeFragment.getMax instanceof HomeTabActivity) {
            ((HomeTabActivity) homeFragment.getMax).nextOnboardingStep();
        }
    }

    static /* synthetic */ void getMin(HomeFragment homeFragment, boolean z, String str) {
        homeFragment.Mean$Arithmetic.setMax.getMax(Boolean.valueOf(z));
        if (z) {
            homeFragment.onNavigationEvent = true;
            int length2 = str != null ? str.length() : 0;
            int max = dispatchOnCancelled.setMax(length2);
            if (length2 != max) {
                onCanceled oncanceled = new onCanceled(length2, max, 1);
                onCancelLoad.setMax(-1045186234, oncanceled);
                onCancelLoad.getMin(-1045186234, oncanceled);
            }
            CurrencySwitchRichView currencySwitchRichView = homeFragment.currencySwitch;
            if (currencySwitchRichView != null) {
                currencySwitchRichView.setVisibility(0);
                homeFragment.currencySwitch.setForeignCurrencySymbol(str);
                homeFragment.globalNetworkPresenter.equals(str);
                return;
            }
            return;
        }
        homeFragment.onNavigationEvent = false;
        homeFragment.getBalancePresenter.getMin();
    }

    static /* synthetic */ void setMin(HomeFragment homeFragment, GnContentModel gnContentModel, String str) {
        Intent intent = new Intent(homeFragment.getContext(), OnboardingGlobalNetworkSheetActivity.class);
        intent.putExtra(OnboardingGlobalNetworkSheetActivity.EXTRA_GN_CONTENT, gnContentModel);
        intent.putExtra(OnboardingGlobalNetworkSheetActivity.EXTRA_GN_COUNTRY_CODE, str);
        homeFragment.startActivityForResult(intent, setMin);
    }

    static /* synthetic */ void toString(HomeFragment homeFragment) {
        List<? extends setUseAmcsLite> list;
        View promotedServiceView = homeFragment.serviceCardView.getPromotedServiceView();
        if (promotedServiceView == null) {
            list = Collections.emptyList();
        } else {
            getUseSecurityGuard getusesecurityguard = new getUseSecurityGuard((float) setMax);
            getUseAmcsLite getuseamcslite = new getUseAmcsLite(promotedServiceView, (float) ((int) (Resources.getSystem().getDisplayMetrics().density * 4.0f)), (float) ((int) (Resources.getSystem().getDisplayMetrics().density * 4.0f)), (int) (Resources.getSystem().getDisplayMetrics().density * 2.0f), (int) (Resources.getSystem().getDisplayMetrics().density * 2.0f), (int) (Resources.getSystem().getDisplayMetrics().density * 2.0f), (int) (Resources.getSystem().getDisplayMetrics().density * 2.0f));
            ArrayList arrayList = new ArrayList();
            arrayList.add(homeFragment.getMin(homeFragment.currencySwitch, getusesecurityguard, R.string.gn_title_tooltip_1, R.string.gn_desc_tooltip_1, 0));
            arrayList.add(homeFragment.getMin(promotedServiceView, getuseamcslite, R.string.gn_title_tooltip_2, R.string.gn_desc_tooltip_2, 0));
            arrayList.add(homeFragment.getMin(homeFragment.getMax.findViewById(R.id.f72812131365916), getusesecurityguard, R.string.gn_title_tooltip_3, R.string.gn_desc_tooltip_3, 0));
            list = arrayList;
        }
        if (!list.isEmpty()) {
            PhotoView.GridDetector gridDetector = new PhotoView.GridDetector(homeFragment.getMax);
            gridDetector.values = list;
            ((PhotoView.GridDetector) ((PhotoView.GridDetector) ((PhotoView.GridDetector) gridDetector.length(false)).setMin((float) ((int) (Resources.getSystem().getDisplayMetrics().density * 16.0f)))).setMin((PhotoView.FlingRunnable) new getMaxTextureSize() {
                public final void onFinished(int i) {
                    if (!HomeFragment.this.values()) {
                        HomeFragment.onNavigationEvent(HomeFragment.this);
                    }
                    HomeFragment.this.Mean$Arithmetic.length.getMax(Boolean.TRUE);
                }
            })).setMin();
        }
    }

    static /* synthetic */ void setMax(HomeFragment homeFragment, boolean z, String str, boolean z2, String str2) {
        boolean z3 = z2 && !str2.equals("ID");
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
                HomeFragment.this.o_();
            }
        });
    }

    static /* synthetic */ void Mean$Arithmetic(HomeFragment homeFragment) {
        String str = getStartDelay.IsOverlapping().getMin;
        if (str == null) {
            str = "";
        }
        if (!str.isEmpty()) {
            DanaH5.startContainerFullUrl(str, new setCancelOnTouchOutside$core() {
                public final void onContainerDestroyed(@Nullable Bundle bundle) {
                    if (Objects.equals(getStartDelay.IsOverlapping().isInside, HomeFragment.this.getCause)) {
                        HomeFragment.getCause(HomeFragment.this);
                    }
                }

                public final void onContainerCreated(@Nullable Bundle bundle) {
                    Integer unused = HomeFragment.this.getCause = getStartDelay.IsOverlapping().isInside;
                }
            });
        }
    }

    static /* synthetic */ void getMin(HomeFragment homeFragment, boolean z, boolean z2) {
        homeFragment.globalSearchHintView.setEnable(z, z2);
        if (z) {
            homeFragment.globalSearchHintView.setOnClickListener(new View.OnClickListener(homeFragment) {
                private final HomeFragment length;

                {
                    this.length = r1;
                }

                public final void onClick(View view) {
                    this.length.toIntRange.length();
                }
            });
            homeFragment.toIntRange.getMax();
        }
    }

    static /* synthetic */ void Grayscale$Algorithm(HomeFragment homeFragment) {
        DialogPermission dialogPermission = homeFragment.toString;
        if (dialogPermission != null) {
            dialogPermission.setMax();
            homeFragment.permissionStatePresenter.length(true);
        }
    }

    static /* synthetic */ void valueOf(HomeFragment homeFragment) {
        if (setStateOn.getMin(homeFragment.getContext(), "android.permission.ACCESS_FINE_LOCATION")) {
            BLEBridgeExtension.AnonymousClass6 r2 = homeFragment.geofencePresenter;
            r2.getMax.execute(new BLEBridgeExtension.AnonymousClass6.setMax(r2));
        }
    }

    static /* synthetic */ void onNavigationEvent(HomeFragment homeFragment) {
        isNfcEnable max;
        TinyAppHostApduService.AnonymousClass1 r0 = new Object(homeFragment.dynamicUrlWrapper) {
            private final getShortName setMax;

            {
                this.setMax = r1;
            }

            public final o.isNfcEnable setMax(android.content.Context r4, id.dana.notification.NotificationData r5) {
                /*
                    r3 = this;
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
        notificationData.setMax = homeFragment.getString(R.string.gn_title_notification);
        notificationData.getMin = homeFragment.getString(R.string.gn_message_notification);
        if (homeFragment.getActivity() != null && (max = r0.setMax(homeFragment.getActivity(), notificationData)) != null) {
            max.setMax();
        }
    }

    static /* synthetic */ void getCause(HomeFragment homeFragment) {
        if (getStartDelay.IsOverlapping().setMin()) {
            getStartDelay.IsOverlapping().setMax();
            homeFragment.getMax.finishAffinity();
        }
    }

    public static /* synthetic */ void onMessageChannelReady(HomeFragment homeFragment) {
        homeFragment.setMin(true);
        getStartDelay.IsOverlapping().getMax = Boolean.TRUE;
        homeFragment.logoutPresenter.length();
    }

    public static /* synthetic */ Unit onPostMessage(HomeFragment homeFragment) {
        if (!(homeFragment.getMax instanceof HomeTabActivity)) {
            return null;
        }
        ((HomeTabActivity) homeFragment.getMax).nextOnboardingStep();
        return null;
    }

    public static /* synthetic */ void IsOverlapping(HomeFragment homeFragment, boolean z) {
        homeFragment.globalNetworkPresenter.setMax(z);
        homeFragment.serviceCardView.refreshView();
    }

    public static /* synthetic */ void extraCallback(HomeFragment homeFragment) {
        if (getStartDelay.IsOverlapping().setMin()) {
            getStartDelay.IsOverlapping().setMax();
            homeFragment.getMax.finishAffinity();
        }
    }

    public static /* synthetic */ void onRelationshipValidationResult(HomeFragment homeFragment) {
        homeFragment.setMin(false);
        if (getStartDelay.IsOverlapping().setMin()) {
            getStartDelay.IsOverlapping().setMax();
            homeFragment.getMax.finishAffinity();
        }
        homeFragment.create.setMax();
    }

    public static /* synthetic */ void setMax(HomeFragment homeFragment, Boolean bool) {
        Object obj = homeFragment.Mean$Arithmetic.getMin.setMin;
        if (obj == LiveData.setMax) {
            obj = null;
        }
        String str = (String) obj;
        homeFragment.invokeSuspend = str;
        if (Boolean.TRUE.equals(bool)) {
            homeFragment.globalNetworkPresenter.length(str);
        }
    }
}
