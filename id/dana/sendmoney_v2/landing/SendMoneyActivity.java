package id.dana.sendmoney_v2.landing;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.FragmentManager;
import com.alibaba.ariver.kernel.ipc.IpcMessageConstants;
import id.dana.R;
import id.dana.base.BaseActivity;
import id.dana.contract.deeplink.DeepLinkModule;
import id.dana.contract.deeplink.FeatureModule;
import id.dana.contract.services.ServicesModule;
import id.dana.contract.shortener.RestoreUrlModule;
import id.dana.contract.staticqr.ScanQrModule;
import id.dana.danah5.DanaH5;
import id.dana.data.constant.BranchLinkConstant;
import id.dana.data.foundation.logger.log.DanaLogConstants;
import id.dana.di.modules.BillerX2BModule;
import id.dana.di.modules.BottomSheetOnBoardingModule;
import id.dana.di.modules.OauthModule;
import id.dana.di.modules.RecipientActivityModule;
import id.dana.domain.usereducation.BottomSheetOnBoardingScenario;
import id.dana.model.SendMoneyHomeMenuModel;
import id.dana.model.ThirdPartyService;
import id.dana.sendmoney.model.QrTransferModel;
import id.dana.sendmoney.model.RecipientModel;
import id.dana.sendmoney.summary.SummaryActivity;
import id.dana.sendmoney_v2.landing.di.module.SendMoneyLandingModule;
import id.dana.sendmoney_v2.landing.view.RecentTransactionView;
import id.dana.sendmoney_v2.landing.view.RecipientSelectorView;
import id.dana.sendmoney_v2.recipient.activity.ManageRecentBankAccountBottomSheet;
import id.dana.splitbill.view.SplitBillIntroductionActivity;
import id.dana.tracker.TrackerKey;
import id.dana.usereducation.BottomSheetHelpActivity;
import id.dana.usereducation.constant.BottomSheetType;
import id.dana.usereducation.model.ContentOnBoardingModel;
import id.dana.usereducation.model.OnBoardingModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmDefault;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import o.BluetoothUuid;
import o.CornerMarkingDataProvider;
import o.DecodeWrapper;
import o.IWorkManagerImplCallback;
import o.ImageObserver;
import o.PhotoSelectListener;
import o.PhotoView;
import o.PrepareException;
import o.SwipeRefreshLayout;
import o.access$1402;
import o.active;
import o.convertDipToPx;
import o.convertSpToPx;
import o.dispatchOnCancelled;
import o.drawHorizontalDivider;
import o.enqueueWorkRequests;
import o.genTextSelector;
import o.getCurrX;
import o.getDataFieldCount;
import o.getDeployVersion;
import o.getDuration;
import o.getExtraDataParsers;
import o.getMaxTextureSize;
import o.getProgressViewStartOffset;
import o.getSelectedIndex;
import o.getTitleIcon_White;
import o.getUseSecurityGuard;
import o.increaseCount;
import o.initRect;
import o.isBaselineAligned;
import o.isPowerOfTwo;
import o.isShowMenu;
import o.onCancelLoad;
import o.onCanceled;
import o.onDelete;
import o.onSelectCanceled;
import o.resetInternal;
import o.setMediaId;
import o.setTitleBarBackDrawable;
import o.setUseAmcsLite;
import o.setUseSecurityGuard;
import o.stopIgnoring;
import o.style;
import o.updateActionSheetContent;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Ø\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u0000 \u00012\u00020\u0001:\u0002\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010J\u001a\u00020K2\u0006\u0010L\u001a\u00020\u0004H\u0002J\b\u0010M\u001a\u00020KH\u0014J\u000e\u0010N\u001a\b\u0012\u0004\u0012\u00020P0OH\u0002J\b\u0010Q\u001a\u00020RH\u0002J\u0012\u0010S\u001a\u0004\u0018\u00010T2\u0006\u0010U\u001a\u00020VH\u0002J\b\u0010W\u001a\u00020XH\u0016J\u000e\u0010Y\u001a\b\u0012\u0004\u0012\u00020P0OH\u0002J\n\u0010Z\u001a\u0004\u0018\u00010TH\u0002J\b\u0010[\u001a\u00020KH\u0002J\b\u0010\\\u001a\u00020KH\u0016J\b\u0010]\u001a\u00020KH\u0002J\b\u0010^\u001a\u00020\u0004H\u0002J\b\u0010_\u001a\u00020KH\u0002J\"\u0010`\u001a\u00020K2\u0006\u0010a\u001a\u00020X2\u0006\u0010b\u001a\u00020X2\b\u0010c\u001a\u0004\u0018\u00010dH\u0014J\u0012\u0010e\u001a\u00020K2\b\u0010f\u001a\u0004\u0018\u00010VH\u0016J\u0010\u0010g\u001a\u00020K2\u0006\u0010h\u001a\u00020iH\u0002J\u0010\u0010j\u001a\u00020K2\u0006\u0010k\u001a\u00020lH\u0002J\b\u0010m\u001a\u00020KH\u0014J\b\u0010n\u001a\u00020KH\u0002J\b\u0010o\u001a\u00020KH\u0002J\u0010\u0010p\u001a\u00020K2\u0006\u0010q\u001a\u00020rH\u0002J\u000e\u0010s\u001a\u00020K2\u0006\u0010t\u001a\u000205J\u0010\u0010u\u001a\u00020K2\u0006\u0010h\u001a\u00020iH\u0002J\u0010\u0010v\u001a\u00020K2\u0006\u0010k\u001a\u00020lH\u0002J\u000f\u0010w\u001a\u0004\u0018\u00010KH\u0002¢\u0006\u0002\u0010xJ\b\u0010y\u001a\u00020KH\u0002J\b\u0010z\u001a\u00020KH\u0002J\b\u0010{\u001a\u00020KH\u0002J\b\u0010|\u001a\u00020KH\u0002J\u0010\u0010}\u001a\u00020K2\u0006\u0010~\u001a\u00020H\u0002J\u000f\u0010\u0001\u001a\u00020K2\u0006\u0010t\u001a\u000205J\t\u0010\u0001\u001a\u00020KH\u0002J\t\u0010\u0001\u001a\u00020KH\u0002J\u0014\u0010\u0001\u001a\u00020K2\t\u0010\u0001\u001a\u0004\u0018\u00010TH\u0002J\u0011\u0010\u0001\u001a\u00020K2\u0006\u0010t\u001a\u000205H\u0002J\t\u0010\u0001\u001a\u00020KH\u0002J\t\u0010\u0001\u001a\u00020KH\u0002J\u0012\u0010\u0001\u001a\u00020K2\u0007\u0010\u0001\u001a\u00020rH\u0002J\u0012\u0010\u0001\u001a\u00020K2\u0007\u0010\u0001\u001a\u00020rH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u00068BX\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00108BX\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0013\u001a\u00020\u00148\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001e\u0010\u0019\u001a\u00020\u001a8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001b\u0010\u001f\u001a\u00020 8BX\u0002¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b!\u0010\"R\u001b\u0010%\u001a\u00020&8BX\u0002¢\u0006\f\n\u0004\b)\u0010$\u001a\u0004\b'\u0010(R\u001e\u0010*\u001a\u00020+8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u0014\u00100\u001a\u0002018BX\u0004¢\u0006\u0006\u001a\u0004\b2\u00103R\u001c\u00104\u001a\u0004\u0018\u000105X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\u001e\u0010:\u001a\u00020;8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\u0010\u0010@\u001a\u0004\u0018\u00010AX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010B\u001a\u00020C8BX\u0004¢\u0006\u0006\u001a\u0004\bD\u0010ER\u000e\u0010F\u001a\u00020GX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010H\u001a\u0004\u0018\u00010IX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0001"}, d2 = {"Lid/dana/sendmoney_v2/landing/SendMoneyActivity;", "Lid/dana/base/BaseActivity;", "()V", "belowKitkatDialog", "", "billerX2BModule", "Lid/dana/di/modules/BillerX2BModule;", "getBillerX2BModule", "()Lid/dana/di/modules/BillerX2BModule;", "billerX2BPresenter", "Lid/dana/contract/sendmoney/v2/BillerX2BContract$Presenter;", "getBillerX2BPresenter", "()Lid/dana/contract/sendmoney/v2/BillerX2BContract$Presenter;", "setBillerX2BPresenter", "(Lid/dana/contract/sendmoney/v2/BillerX2BContract$Presenter;)V", "bottomSheetOnBoardingModule", "Lid/dana/di/modules/BottomSheetOnBoardingModule;", "getBottomSheetOnBoardingModule", "()Lid/dana/di/modules/BottomSheetOnBoardingModule;", "bottomSheetOnBoardingPresenter", "Lid/dana/usereducation/BottomSheetOnBoardingContract$Presenter;", "getBottomSheetOnBoardingPresenter", "()Lid/dana/usereducation/BottomSheetOnBoardingContract$Presenter;", "setBottomSheetOnBoardingPresenter", "(Lid/dana/usereducation/BottomSheetOnBoardingContract$Presenter;)V", "kycAndDebitPayOptionPresenter", "Lid/dana/sendmoney_v2/landing/contract/KycAndDebitPayOptionContract$Presenter;", "getKycAndDebitPayOptionPresenter", "()Lid/dana/sendmoney_v2/landing/contract/KycAndDebitPayOptionContract$Presenter;", "setKycAndDebitPayOptionPresenter", "(Lid/dana/sendmoney_v2/landing/contract/KycAndDebitPayOptionContract$Presenter;)V", "manageBankAccountBottomSheet", "Lid/dana/sendmoney_v2/recipient/activity/ManageRecentBankAccountBottomSheet;", "getManageBankAccountBottomSheet", "()Lid/dana/sendmoney_v2/recipient/activity/ManageRecentBankAccountBottomSheet;", "manageBankAccountBottomSheet$delegate", "Lkotlin/Lazy;", "onBoardingManageQuickActionBottomSheet", "Lid/dana/sendmoney_v2/landing/view/OnboardingManageQuickActionBottomSheet;", "getOnBoardingManageQuickActionBottomSheet", "()Lid/dana/sendmoney_v2/landing/view/OnboardingManageQuickActionBottomSheet;", "onBoardingManageQuickActionBottomSheet$delegate", "readDeepLinkPropertiesPresenter", "Lid/dana/contract/deeplink/ReadLinkPropertiesContract$Presenter;", "getReadDeepLinkPropertiesPresenter", "()Lid/dana/contract/deeplink/ReadLinkPropertiesContract$Presenter;", "setReadDeepLinkPropertiesPresenter", "(Lid/dana/contract/deeplink/ReadLinkPropertiesContract$Presenter;)V", "recipientActivityModule", "Lid/dana/di/modules/RecipientActivityModule;", "getRecipientActivityModule", "()Lid/dana/di/modules/RecipientActivityModule;", "recipientHoldClickAction", "Lid/dana/sendmoney/model/RecentRecipientModel;", "getRecipientHoldClickAction", "()Lid/dana/sendmoney/model/RecentRecipientModel;", "setRecipientHoldClickAction", "(Lid/dana/sendmoney/model/RecentRecipientModel;)V", "recipientPresenter", "Lid/dana/contract/sendmoney/RecipientContract$Presenter;", "getRecipientPresenter", "()Lid/dana/contract/sendmoney/RecipientContract$Presenter;", "setRecipientPresenter", "(Lid/dana/contract/sendmoney/RecipientContract$Presenter;)V", "sendMoneyLandingComponent", "Lid/dana/sendmoney_v2/landing/di/component/SendMoneyLandingComponent;", "sendMoneyLandingModule", "Lid/dana/sendmoney_v2/landing/di/module/SendMoneyLandingModule;", "getSendMoneyLandingModule", "()Lid/dana/sendmoney_v2/landing/di/module/SendMoneyLandingModule;", "sendMoneyScenarioDirector", "Lid/dana/sendmoney_v2/director/SendMoneyScenarioDirectorV2;", "showcase", "Lid/dana/showcase/Showcase;", "checkShowOnBoardingHideQuickAction", "", "isShowFirstTime", "configToolbar", "createContentsOnBoarding", "", "Lid/dana/usereducation/model/ContentOnBoardingModel;", "createOnBoardingModel", "Lid/dana/usereducation/model/OnBoardingModel;", "createTargetFrom", "Lid/dana/showcase/target/Target;", "targetView", "Landroid/view/View;", "getLayout", "", "getOnBoardingContent", "getTooltipTarget", "handleDeeplinkWhenActivityAlreadyOpened", "init", "initInjector", "intentHasResumeFlag", "loadData", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onClickRightMenuButton", "view", "onMenuSelected", "menu", "Lid/dana/model/SendMoneyHomeMenuModel;", "onRecipientSelected", "recipientModel", "Lid/dana/sendmoney/model/RecipientModel;", "onResume", "openBottomSheetOnBoardingViewList", "openBottomSheetOnBoardingViewPage", "openH5Container", "url", "", "openManageRecentBottomSheet", "recentRecipientModel", "openSendMoney", "openSummary", "refreshRecentTransaction", "()Lkotlin/Unit;", "setupQrTracker", "setupRecentTransactionView", "setupRecipientSelectorView", "showBelowKitkatDialogWarning", "showBillerX2BDialog", "billerX2BModel", "Lid/dana/sendmoney_v2/model/BillerX2BModel;", "showDialogConfirmationRemoveQuickAction", "showKycDialog", "showOnBoardingQuickActionBottomSheet", "showShowcase", "target", "showToastAfterRemoveQuickSend", "trackSendMoneyHelpOpen", "trackSendMoneyOpen", "trackSendMoneySelect", "destinationType", "trackSendMoneySelectFromType", "action", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class SendMoneyActivity extends BaseActivity {
    @NotNull
    public static final setMax Companion = new setMax((byte) 0);
    private static final int isInside = CornerMarkingDataProvider.AnonymousClass2.setMax();
    @Nullable
    private increaseCount IsOverlapping;
    @Inject
    public IWorkManagerImplCallback.Stub.Proxy.getMin billerX2BPresenter;
    @Inject
    public getSelectedIndex.length bottomSheetOnBoardingPresenter;
    private final Lazy equals = LazyKt.lazy(getMin.INSTANCE);
    /* access modifiers changed from: private */
    public boolean getMax;
    private ImageObserver.AnonymousClass2 getMin;
    @Inject
    public getTitleIcon_White.getMax kycAndDebitPayOptionPresenter;
    @Inject
    public getDuration.length readDeepLinkPropertiesPresenter;
    @Inject
    public enqueueWorkRequests.length recipientPresenter;
    private final setTitleBarBackDrawable setMax = new setTitleBarBackDrawable(this);
    /* access modifiers changed from: private */
    public PhotoView.PhotoInter toFloatRange;
    private final Lazy toIntRange = LazyKt.lazy(isInside.INSTANCE);
    private HashMap values;

    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.values;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public final View _$_findCachedViewById(int i) {
        if (this.values == null) {
            this.values = new HashMap();
        }
        View view = (View) this.values.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.values.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class hashCode extends Lambda implements Function1<View, Unit> {
        public static final hashCode INSTANCE = new hashCode();

        hashCode() {
            super(1);
        }

        public final void invoke(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "it");
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((View) obj);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0015\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "p1", "Lid/dana/sendmoney/model/RecipientModel;", "Lkotlin/ParameterName;", "name", "recipientModel", "invoke"}, k = 3, mv = {1, 4, 2})
    static final /* synthetic */ class toIntRange extends FunctionReferenceImpl implements Function1<RecipientModel, Unit> {
        toIntRange(SendMoneyActivity sendMoneyActivity) {
            super(1, sendMoneyActivity, SendMoneyActivity.class, "onRecipientSelected", "onRecipientSelected(Lid/dana/sendmoney/model/RecipientModel;)V", 0);
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((RecipientModel) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull RecipientModel recipientModel) {
            Intrinsics.checkNotNullParameter(recipientModel, "p1");
            SendMoneyActivity.access$onRecipientSelected((SendMoneyActivity) this.receiver, recipientModel);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0015\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "p1", "Lid/dana/model/SendMoneyHomeMenuModel;", "Lkotlin/ParameterName;", "name", "menu", "invoke"}, k = 3, mv = {1, 4, 2})
    static final /* synthetic */ class toString extends FunctionReferenceImpl implements Function1<SendMoneyHomeMenuModel, Unit> {
        toString(SendMoneyActivity sendMoneyActivity) {
            super(1, sendMoneyActivity, SendMoneyActivity.class, "onMenuSelected", "onMenuSelected(Lid/dana/model/SendMoneyHomeMenuModel;)V", 0);
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((SendMoneyHomeMenuModel) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull SendMoneyHomeMenuModel sendMoneyHomeMenuModel) {
            Intrinsics.checkNotNullParameter(sendMoneyHomeMenuModel, "p1");
            SendMoneyActivity.access$onMenuSelected((SendMoneyActivity) this.receiver, sendMoneyHomeMenuModel);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class values extends Lambda implements Function1<View, Unit> {
        final /* synthetic */ increaseCount $recentRecipientModel;
        final /* synthetic */ SendMoneyActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        values(SendMoneyActivity sendMoneyActivity, increaseCount increasecount) {
            super(1);
            this.this$0 = sendMoneyActivity;
            this.$recentRecipientModel = increasecount;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((View) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "it");
            this.this$0.getRecipientPresenter().getMin(this.$recentRecipientModel);
        }
    }

    public static final /* synthetic */ void access$showKycDialog(SendMoneyActivity sendMoneyActivity) {
        int length2;
        int min;
        Context baseContext = sendMoneyActivity.getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length2 = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length2)))) {
            onCanceled oncanceled = new onCanceled(length2, min, 32);
            onCancelLoad.setMax(-948495324, oncanceled);
            onCancelLoad.getMin(-948495324, oncanceled);
        }
        if (sendMoneyActivity.isActivityAvailable()) {
            onSelectCanceled onselectcanceled = new onSelectCanceled((Function0) null, toDoubleRange.INSTANCE, 1);
            Context baseContext2 = sendMoneyActivity.getBaseContext();
            if (baseContext2 != null) {
                onselectcanceled.getMax = R.drawable.ic_upgrade_to_kyc_bottomsheet;
                AppCompatImageView appCompatImageView = (AppCompatImageView) onselectcanceled.setMax(resetInternal.setMax.setSupportProgressBarVisibility);
                if (appCompatImageView != null) {
                    onSelectCanceled.setMin(appCompatImageView, onselectcanceled.getMax);
                }
                String string = baseContext2.getString(R.string.upgrade_to_dana_premium);
                Intrinsics.checkNotNullExpressionValue(string, "it.getString(R.string.upgrade_to_dana_premium)");
                onselectcanceled.length(string);
                String string2 = baseContext2.getString(R.string.sendmoney_upgrade_kyc_dialog_description);
                Intrinsics.checkNotNullExpressionValue(string2, "it.getString(R.string.se…e_kyc_dialog_description)");
                onselectcanceled.getMax(string2);
                String string3 = baseContext2.getString(R.string.sendmoney_upgrade_kyc_dialog_button_positive);
                Intrinsics.checkNotNullExpressionValue(string3, "it.getString(R.string.se…c_dialog_button_positive)");
                onselectcanceled.setMin(string3);
                String string4 = baseContext2.getString(R.string.sendmoney_upgrade_kyc_dialog_button_negative);
                Intrinsics.checkNotNullExpressionValue(string4, "it.getString(R.string.se…c_dialog_button_negative)");
                onselectcanceled.getMin(string4);
            }
            FragmentManager supportFragmentManager = sendMoneyActivity.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "supportFragmentManager");
            onselectcanceled.getMin(supportFragmentManager);
        }
    }

    @NotNull
    public final enqueueWorkRequests.length getRecipientPresenter() {
        enqueueWorkRequests.length length2 = this.recipientPresenter;
        if (length2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("recipientPresenter");
        }
        return length2;
    }

    public final void setRecipientPresenter(@NotNull enqueueWorkRequests.length length2) {
        Intrinsics.checkNotNullParameter(length2, "<set-?>");
        this.recipientPresenter = length2;
    }

    @NotNull
    public final IWorkManagerImplCallback.Stub.Proxy.getMin getBillerX2BPresenter() {
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(-900088881, oncanceled);
            onCancelLoad.getMin(-900088881, oncanceled);
        }
        IWorkManagerImplCallback.Stub.Proxy.getMin getmin = this.billerX2BPresenter;
        if (getmin == null) {
            Intrinsics.throwUninitializedPropertyAccessException("billerX2BPresenter");
        }
        return getmin;
    }

    public final void setBillerX2BPresenter(@NotNull IWorkManagerImplCallback.Stub.Proxy.getMin getmin) {
        Intrinsics.checkNotNullParameter(getmin, "<set-?>");
        this.billerX2BPresenter = getmin;
    }

    @NotNull
    public final getSelectedIndex.length getBottomSheetOnBoardingPresenter() {
        getSelectedIndex.length length2 = this.bottomSheetOnBoardingPresenter;
        if (length2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bottomSheetOnBoardingPresenter");
        }
        return length2;
    }

    public final void setBottomSheetOnBoardingPresenter(@NotNull getSelectedIndex.length length2) {
        Intrinsics.checkNotNullParameter(length2, "<set-?>");
        this.bottomSheetOnBoardingPresenter = length2;
    }

    @NotNull
    public final getDuration.length getReadDeepLinkPropertiesPresenter() {
        getDuration.length length2 = this.readDeepLinkPropertiesPresenter;
        if (length2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("readDeepLinkPropertiesPresenter");
        }
        return length2;
    }

    public final void setReadDeepLinkPropertiesPresenter(@NotNull getDuration.length length2) {
        Intrinsics.checkNotNullParameter(length2, "<set-?>");
        this.readDeepLinkPropertiesPresenter = length2;
    }

    @NotNull
    public final getTitleIcon_White.getMax getKycAndDebitPayOptionPresenter() {
        getTitleIcon_White.getMax getmax = this.kycAndDebitPayOptionPresenter;
        if (getmax == null) {
            Intrinsics.throwUninitializedPropertyAccessException("kycAndDebitPayOptionPresenter");
        }
        return getmax;
    }

    public final void setKycAndDebitPayOptionPresenter(@NotNull getTitleIcon_White.getMax getmax) {
        Intrinsics.checkNotNullParameter(getmax, "<set-?>");
        this.kycAndDebitPayOptionPresenter = getmax;
    }

    @Nullable
    public final increaseCount getRecipientHoldClickAction() {
        return this.IsOverlapping;
    }

    public final void setRecipientHoldClickAction(@Nullable increaseCount increasecount) {
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(998153190, oncanceled);
            onCancelLoad.getMin(998153190, oncanceled);
        }
        this.IsOverlapping = increasecount;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lid/dana/sendmoney_v2/recipient/activity/ManageRecentBankAccountBottomSheet;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class getMin extends Lambda implements Function0<ManageRecentBankAccountBottomSheet> {
        public static final getMin INSTANCE = new getMin();

        getMin() {
            super(0);
        }

        @NotNull
        public final ManageRecentBankAccountBottomSheet invoke() {
            return new ManageRecentBankAccountBottomSheet();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lid/dana/sendmoney_v2/landing/view/OnboardingManageQuickActionBottomSheet;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class isInside extends Lambda implements Function0<isPowerOfTwo> {
        public static final isInside INSTANCE = new isInside();

        isInside() {
            super(0);
        }

        @NotNull
        public final isPowerOfTwo invoke() {
            return new isPowerOfTwo();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\fH\u0016¨\u0006\r"}, d2 = {"id/dana/sendmoney_v2/landing/SendMoneyActivity$recipientActivityModule$1", "Lid/dana/contract/sendmoney/RecipientContract$View;", "onFinishCheckReferralSendMoney", "", "enable", "", "howToUrl", "", "onGetFeatureBelowKitkatConfigSuccess", "onSuccessRemoveRecentTransaction", "success", "recentRecipientModel", "Lid/dana/sendmoney/model/RecentRecipientModel;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class toFloatRange implements enqueueWorkRequests.setMax {
        final /* synthetic */ SendMoneyActivity getMin;

        @JvmDefault
        public final void dismissProgress() {
        }

        @JvmDefault
        public final void onError(@Nullable String str) {
        }

        public final void onFinishCheckReferralSendMoney(boolean z, @Nullable String str) {
        }

        @JvmDefault
        public final void showProgress() {
        }

        toFloatRange(SendMoneyActivity sendMoneyActivity) {
            this.getMin = sendMoneyActivity;
        }

        public final void onGetFeatureBelowKitkatConfigSuccess(boolean z) {
            this.getMin.getMax = z;
        }

        public final void onSuccessRemoveRecentTransaction(boolean z, @NotNull increaseCount increasecount) {
            Intrinsics.checkNotNullParameter(increasecount, "recentRecipientModel");
            SendMoneyActivity.access$showToastAfterRemoveQuickSend(this.getMin, increasecount);
            ((RecentTransactionView) this.getMin._$_findCachedViewById(resetInternal.setMax.hasIcon)).updateRecentTransaction();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0016\u0010\r\u001a\u00020\u00032\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0016¨\u0006\u0011"}, d2 = {"id/dana/sendmoney_v2/landing/SendMoneyActivity$billerX2BModule$1", "Lid/dana/contract/sendmoney/v2/BillerX2BContract$View;", "onBillerUrlConstructed", "", "url", "", "onErrorCheckPrefix", "recipientModel", "Lid/dana/sendmoney/model/BaseRecipientModel;", "onErrorQueryPrefix", "onPrefixExist", "billerX2BModel", "Lid/dana/sendmoney_v2/model/BillerX2BModel;", "onSuccessGetAllBillerX2B", "allBillerX2B", "", "Lid/dana/domain/sendmoney/model/BillerX2B;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMax implements IWorkManagerImplCallback.Stub.Proxy.getMax {
        final /* synthetic */ SendMoneyActivity getMax;

        @JvmDefault
        public final void dismissProgress() {
        }

        public final void getMin(@NotNull PhotoSelectListener photoSelectListener) {
            Intrinsics.checkNotNullParameter(photoSelectListener, "recipientModel");
        }

        @JvmDefault
        public final void onError(@Nullable String str) {
        }

        public final void setMax(@NotNull List<getExtraDataParsers> list) {
            Intrinsics.checkNotNullParameter(list, "allBillerX2B");
        }

        @JvmDefault
        public final void setMin(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "message");
        }

        @JvmDefault
        public final void showProgress() {
        }

        getMax(SendMoneyActivity sendMoneyActivity) {
            this.getMax = sendMoneyActivity;
        }

        public final void getMin(@NotNull getCurrX getcurrx) {
            Intrinsics.checkNotNullParameter(getcurrx, "billerX2BModel");
            if (this.getMax.isClickable()) {
                new getDeployVersion(this.getMax, new SendMoneyActivity$FastBitmap$CoordinateSystem(this.getMax, getcurrx)).setMax();
            }
        }

        public final void setMax(@NotNull PhotoSelectListener photoSelectListener) {
            Intrinsics.checkNotNullParameter(photoSelectListener, "recipientModel");
            if (this.getMax.isClickable() && (photoSelectListener instanceof RecipientModel)) {
                SendMoneyActivity.access$openSummary(this.getMax, (RecipientModel) photoSelectListener);
            }
        }

        public final void getMin(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "url");
            if ((StringsKt.isBlank(str) ^ true ? str : null) != null) {
                DanaH5.startContainerFullUrl(str);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0012\u0010\u0004\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J$\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006H\u0016J\b\u0010\f\u001a\u00020\u0003H\u0016¨\u0006\r"}, d2 = {"id/dana/sendmoney_v2/landing/SendMoneyActivity$bottomSheetOnBoardingModule$1", "Lid/dana/usereducation/BottomSheetOnBoardingContract$View;", "dismissProgress", "", "onError", "errorMessage", "", "onGetBottomSheetOnBoardingAvailability", "show", "", "url", "scenario", "showProgress", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class length implements getSelectedIndex.setMax {
        final /* synthetic */ SendMoneyActivity setMax;

        public final void dismissProgress() {
        }

        public final void onGetBottomSheetOnBoardingAvailability(boolean z, @Nullable String str) {
        }

        public final void showProgress() {
        }

        length(SendMoneyActivity sendMoneyActivity) {
            this.setMax = sendMoneyActivity;
        }

        public final void setMax(boolean z, @Nullable String str) {
            if (str != null) {
                int hashCode = str.hashCode();
                if (hashCode != -1259411291) {
                    if (hashCode != 821988681 || !str.equals("send_money")) {
                        return;
                    }
                    if (z) {
                        SendMoneyActivity.access$openBottomSheetOnBoardingViewPage(this.setMax);
                    } else {
                        this.setMax.getBottomSheetOnBoardingPresenter().setMin(BottomSheetOnBoardingScenario.HIDE_QUICK_ACTION);
                    }
                } else if (str.equals(BottomSheetOnBoardingScenario.HIDE_QUICK_ACTION)) {
                    SendMoneyActivity.access$checkShowOnBoardingHideQuickAction(this.setMax, z);
                }
            }
        }

        public final void onError(@Nullable String str) {
            StringBuilder sb = new StringBuilder();
            sb.append(getClass().getName());
            sb.append("on Error: ");
            sb.append(str);
            updateActionSheetContent.e(DanaLogConstants.TAG.USER_EDUCATION_TAG, sb.toString());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0012\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J\u0012\u0010\f\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016¨\u0006\r"}, d2 = {"id/dana/sendmoney_v2/landing/SendMoneyActivity$sendMoneyLandingModule$1", "Lid/dana/sendmoney_v2/landing/contract/KycAndDebitPayOptionContract$View;", "onError", "", "errorMessage", "", "onGetInitValue", "transferInit", "Lid/dana/domain/sendmoney/model/TransferInit;", "onInvalidKycAndDebitPayOption", "param", "", "onValidKycAndDebitPayOption", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class IsOverlapping implements getTitleIcon_White.getMin {
        final /* synthetic */ SendMoneyActivity getMin;

        @JvmDefault
        public final void dismissProgress() {
        }

        @JvmDefault
        public final void showProgress() {
        }

        IsOverlapping(SendMoneyActivity sendMoneyActivity) {
            this.getMin = sendMoneyActivity;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "onDismiss"}, k = 3, mv = {1, 4, 2})
        static final class getMin implements DialogInterface.OnDismissListener {
            final /* synthetic */ IsOverlapping setMin;

            getMin(IsOverlapping isOverlapping) {
                this.setMin = isOverlapping;
            }

            public final void onDismiss(DialogInterface dialogInterface) {
                this.setMin.getMin.enableClick();
            }
        }

        public final void onError(@Nullable String str) {
            SendMoneyActivity sendMoneyActivity = this.getMin;
            if (str == null) {
                str = "";
            }
            sendMoneyActivity.showWarningDialog(str, new getMin(this));
        }

        public final void setMax(@Nullable Object obj) {
            if (obj instanceof SendMoneyHomeMenuModel) {
                this.getMin.getMin((SendMoneyHomeMenuModel) obj);
            } else if (obj instanceof RecipientModel) {
                SendMoneyActivity.access$openSummary(this.getMin, (RecipientModel) obj);
            }
        }

        public final void getMax() {
            SendMoneyActivity.access$showKycDialog(this.getMin);
        }

        public final void setMin(@NotNull getDataFieldCount getdatafieldcount) {
            Intrinsics.checkNotNullParameter(getdatafieldcount, "transferInit");
            List<BluetoothUuid> transferMethod = getdatafieldcount.getTransferMethod();
            Intrinsics.checkNotNullExpressionValue(transferMethod, "transferInit.transferMethod");
            Collection arrayList = new ArrayList();
            for (Object next : transferMethod) {
                BluetoothUuid bluetoothUuid = (BluetoothUuid) next;
                Intrinsics.checkNotNullExpressionValue(bluetoothUuid, "it");
                if (Intrinsics.areEqual((Object) bluetoothUuid.getTransferMethod(), (Object) "BANK_TRANSFER")) {
                    arrayList.add(next);
                }
            }
            List list = (List) arrayList;
            if (!list.isEmpty()) {
                Object obj = list.get(0);
                Intrinsics.checkNotNullExpressionValue(obj, "this[0]");
                ((RecipientSelectorView) this.getMin._$_findCachedViewById(resetInternal.setMax.setUiOptions)).updateHomeMenus((int) ((BluetoothUuid) obj).getFreeRemainedTimes());
            }
        }
    }

    public final void onResume() {
        setMediaId.setMax presenter;
        super.onResume();
        if (length()) {
            getIntent().removeExtra("bundle_extra_for_resume");
            setTitleBarBackDrawable settitlebarbackdrawable = this.setMax;
            Intent intent = getIntent();
            Intrinsics.checkNotNullExpressionValue(intent, IpcMessageConstants.EXTRA_INTENT);
            settitlebarbackdrawable.setMax(intent.getExtras());
        }
        RecentTransactionView recentTransactionView = (RecentTransactionView) _$_findCachedViewById(resetInternal.setMax.hasIcon);
        if (recentTransactionView != null && (presenter = recentTransactionView.getPresenter()) != null) {
            presenter.setMin("");
            Unit unit = Unit.INSTANCE;
        }
    }

    public final int getLayout() {
        int length2;
        int min;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length2 = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length2)))) {
            onCanceled oncanceled = new onCanceled(length2, min, 32);
            onCancelLoad.setMax(-11665923, oncanceled);
            onCancelLoad.getMin(-11665923, oncanceled);
        }
        setTitleBarBackDrawable settitlebarbackdrawable = this.setMax;
        Intent intent = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, IpcMessageConstants.EXTRA_INTENT);
        settitlebarbackdrawable.setMax(intent.getExtras());
        return R.layout.activity_send_money_landing;
    }

    public final void configToolbar() {
        setCenterTitle(getString(R.string.sendmoney_landing_toolbar_title));
        setMenuLeftButton((int) R.drawable.btn_arrow_left);
        setMenuRightButton((int) R.drawable.ic_tooltip_help);
        setMenuRightContentDescription(getString(R.string.iconQuickSendHelp));
    }

    public final void onClickRightMenuButton(@Nullable View view) {
        int length2;
        int min;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length2 = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length2)))) {
            onCanceled oncanceled = new onCanceled(length2, min, 32);
            onCancelLoad.setMax(366299960, oncanceled);
            onCancelLoad.getMin(366299960, oncanceled);
        }
        BottomSheetHelpActivity.getMin getmin = BottomSheetHelpActivity.Companion;
        String string = getString(R.string.bottom_on_boarding_send_money_title);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.botto…oarding_send_money_title)");
        startActivity(BottomSheetHelpActivity.getMin.length(this, new OnBoardingModel(string, BottomSheetType.LIST, setMin(), "send_money"), true));
        convertDipToPx.length length3 = new convertDipToPx.length(getApplicationContext());
        length3.getMax = TrackerKey.Event.SEND_MONEY_HELP_OPEN;
        length3.setMin();
        convertDipToPx convertdiptopx = new convertDipToPx(length3, (byte) 0);
        List length4 = convertdiptopx.length != null ? convertdiptopx.length.length : new ArrayList();
        genTextSelector.setMax((convertSpToPx[]) length4.toArray(new convertSpToPx[length4.size()]));
    }

    public final void init() {
        int max;
        int max2;
        Context baseContext = getBaseContext();
        Context context = null;
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || -1753414262 == (max2 = dispatchOnCancelled.getMax(applicationContext, -1753414262)))) {
            onCanceled oncanceled = new onCanceled(-1753414262, max2, 512);
            onCancelLoad.setMax(-1753414262, oncanceled);
            onCancelLoad.getMin(-1753414262, oncanceled);
        }
        if (this.getMin == null) {
            active.length length2 = new active.length((byte) 0);
            PrepareException.AnonymousClass1 applicationComponent = getApplicationComponent();
            if (applicationComponent != null) {
                length2.FastBitmap$CoordinateSystem = applicationComponent;
                length2.IsOverlapping = new SendMoneyLandingModule(new IsOverlapping(this));
                length2.length = new RecipientActivityModule(new toFloatRange(this));
                Context baseContext2 = getBaseContext();
                if (baseContext2 != null) {
                    context = baseContext2.getApplicationContext();
                }
                if (!(context == null || 125293796 == (max = dispatchOnCancelled.getMax(context, 125293796)))) {
                    onCanceled oncanceled2 = new onCanceled(125293796, max, 512);
                    onCancelLoad.setMax(125293796, oncanceled2);
                    onCancelLoad.getMin(125293796, oncanceled2);
                }
                int max3 = dispatchOnCancelled.getMax(0);
                if (max3 != 0) {
                    onCanceled oncanceled3 = new onCanceled(0, max3, 16);
                    onCancelLoad.setMax(125293796, oncanceled3);
                    onCancelLoad.getMin(125293796, oncanceled3);
                }
                length2.setMin = new BottomSheetOnBoardingModule(new length(this));
                length2.isInside = new ServicesModule((style.getMin) new setMin());
                DeepLinkModule.setMin max4 = DeepLinkModule.getMax();
                Activity activity = this;
                max4.getMax = activity;
                max4.length = "Send Money";
                length2.getMax = new DeepLinkModule(max4, (byte) 0);
                ScanQrModule.setMin max5 = ScanQrModule.getMax();
                max5.setMin = activity;
                length2.getMin = new ScanQrModule(max5, (byte) 0);
                RestoreUrlModule.setMin min = RestoreUrlModule.setMin();
                min.getMax = activity;
                length2.setMax = new RestoreUrlModule(min, (byte) 0);
                FeatureModule.length length3 = FeatureModule.length();
                length3.setMax = activity;
                length2.equals = new FeatureModule(length3, (byte) 0);
                OauthModule.getMax min2 = OauthModule.setMin();
                min2.setMin = activity;
                length2.toFloatRange = new OauthModule(min2, (byte) 0);
                length2.toIntRange = new BillerX2BModule(new getMax(this));
                stopIgnoring.setMin(length2.length, RecipientActivityModule.class);
                stopIgnoring.setMin(length2.setMin, BottomSheetOnBoardingModule.class);
                stopIgnoring.setMin(length2.getMax, DeepLinkModule.class);
                stopIgnoring.setMin(length2.getMin, ScanQrModule.class);
                stopIgnoring.setMin(length2.setMax, RestoreUrlModule.class);
                stopIgnoring.setMin(length2.equals, FeatureModule.class);
                stopIgnoring.setMin(length2.toFloatRange, OauthModule.class);
                if (length2.isInside == null) {
                    length2.isInside = new ServicesModule();
                }
                stopIgnoring.setMin(length2.IsOverlapping, SendMoneyLandingModule.class);
                stopIgnoring.setMin(length2.toIntRange, BillerX2BModule.class);
                stopIgnoring.setMin(length2.FastBitmap$CoordinateSystem, PrepareException.AnonymousClass1.class);
                this.getMin = new active(length2.length, length2.setMin, length2.getMax, length2.getMin, length2.setMax, length2.equals, length2.toFloatRange, length2.isInside, length2.IsOverlapping, length2.toIntRange, length2.FastBitmap$CoordinateSystem, (byte) 0);
            } else {
                throw null;
            }
        }
        ImageObserver.AnonymousClass2 r1 = this.getMin;
        if (r1 != null) {
            r1.getMax(this);
        }
        onDelete.getMin[] getminArr = new onDelete.getMin[5];
        enqueueWorkRequests.length length4 = this.recipientPresenter;
        if (length4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("recipientPresenter");
        }
        getminArr[0] = length4;
        getSelectedIndex.length length5 = this.bottomSheetOnBoardingPresenter;
        if (length5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bottomSheetOnBoardingPresenter");
        }
        getminArr[1] = length5;
        getDuration.length length6 = this.readDeepLinkPropertiesPresenter;
        if (length6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("readDeepLinkPropertiesPresenter");
        }
        getminArr[2] = length6;
        getTitleIcon_White.getMax getmax = this.kycAndDebitPayOptionPresenter;
        if (getmax == null) {
            Intrinsics.throwUninitializedPropertyAccessException("kycAndDebitPayOptionPresenter");
        }
        getminArr[3] = getmax;
        IWorkManagerImplCallback.Stub.Proxy.getMin getmin = this.billerX2BPresenter;
        if (getmin == null) {
            Intrinsics.throwUninitializedPropertyAccessException("billerX2BPresenter");
        }
        getminArr[4] = getmin;
        registerPresenter(getminArr);
        int max6 = dispatchOnCancelled.getMax(0);
        if (max6 != 0) {
            onCanceled oncanceled4 = new onCanceled(0, max6, 16);
            onCancelLoad.setMax(-1089530199, oncanceled4);
            onCancelLoad.getMin(-1089530199, oncanceled4);
        }
        RecentTransactionView recentTransactionView = (RecentTransactionView) _$_findCachedViewById(resetInternal.setMax.hasIcon);
        if (recentTransactionView != null) {
            recentTransactionView.setOnRecipientSelected(new toIntRange(this));
        }
        RecentTransactionView recentTransactionView2 = (RecentTransactionView) _$_findCachedViewById(resetInternal.setMax.hasIcon);
        if (recentTransactionView2 != null) {
            recentTransactionView2.setOnGestureHoldLongClickListener(new equals(this));
        }
        RecipientSelectorView recipientSelectorView = (RecipientSelectorView) _$_findCachedViewById(resetInternal.setMax.setUiOptions);
        if (recipientSelectorView != null) {
            recipientSelectorView.setOnMenuSelected(new toString(this));
        }
        DecodeWrapper.getMin("Send Money");
        enqueueWorkRequests.length length7 = this.recipientPresenter;
        if (length7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("recipientPresenter");
        }
        length7.getMax();
        getTitleIcon_White.getMax getmax2 = this.kycAndDebitPayOptionPresenter;
        if (getmax2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("kycAndDebitPayOptionPresenter");
        }
        getmax2.getMax();
        getSelectedIndex.length length8 = this.bottomSheetOnBoardingPresenter;
        if (length8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bottomSheetOnBoardingPresenter");
        }
        length8.setMin("send_money");
        convertDipToPx.length length9 = new convertDipToPx.length(getApplicationContext());
        length9.getMax = TrackerKey.Event.SEND_MONEY_OPEN;
        convertDipToPx.length max7 = length9.setMax("Source", getSource());
        max7.setMin();
        genTextSelector.getMax(new convertDipToPx(max7, (byte) 0));
    }

    public final void onActivityResult(int i, int i2, @Nullable Intent intent) {
        int length2;
        int min;
        int length3;
        int min2;
        Context baseContext = getBaseContext();
        Context context = null;
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length3 = applicationContext.fileList().length) == (min2 = dispatchOnCancelled.getMin(applicationContext, length3)))) {
            onCanceled oncanceled = new onCanceled(length3, min2, 32);
            onCancelLoad.setMax(250326772, oncanceled);
            onCancelLoad.getMin(250326772, oncanceled);
        }
        super.onActivityResult(i, i2, intent);
        if (-1 == i2 && DecodeWrapper.AnonymousClass2.length == i && intent != null) {
            this.setMax.setMax(intent.getExtras());
        }
        if (-1 == i2 && isInside == i) {
            TextView textView = (TextView) _$_findCachedViewById(resetInternal.setMax.getOverflowIcon);
            Intrinsics.checkNotNullExpressionValue(textView, "right_button");
            View view = textView;
            Context baseContext2 = getBaseContext();
            if (baseContext2 != null) {
                context = baseContext2.getApplicationContext();
            }
            if (!(context == null || (length2 = context.fileList().length) == (min = dispatchOnCancelled.getMin(context, length2)))) {
                onCanceled oncanceled2 = new onCanceled(length2, min, 32);
                onCancelLoad.setMax(-1337447174, oncanceled2);
                onCancelLoad.getMin(-1337447174, oncanceled2);
            }
            Activity activity = this;
            setUseAmcsLite min3 = ((setUseSecurityGuard) ((setUseSecurityGuard) ((setUseSecurityGuard) new setUseSecurityGuard(activity).setMax(view)).setMin(new getUseSecurityGuard((float) SplitBillIntroductionActivity.SPOTLIGHT_SIZE))).getMin(new access$1402(getResources().getString(R.string.tooltip_highlight_title), getResources().getString(R.string.tooltip_highlight_description_send_money)))).getMin();
            if (this.toFloatRange == null) {
                initRect initrect = new initRect(activity);
                initrect.toString = min3;
                this.toFloatRange = ((initRect) ((initRect) ((initRect) initrect.setMax((int) (Resources.getSystem().getDisplayMetrics().density * 16.0f))).length(false)).setMin((PhotoView.FlingRunnable) new valueOf(this))).length();
            }
            getSelectedIndex.length length4 = this.bottomSheetOnBoardingPresenter;
            if (length4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("bottomSheetOnBoardingPresenter");
            }
            length4.getMax("send_money");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"id/dana/sendmoney_v2/landing/SendMoneyActivity$showShowcase$1", "Lid/dana/showcase/AbstractOnShowcaseStateListener;", "onFinished", "", "actionType", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class valueOf extends getMaxTextureSize {
        final /* synthetic */ SendMoneyActivity setMax;

        valueOf(SendMoneyActivity sendMoneyActivity) {
            this.setMax = sendMoneyActivity;
        }

        public final void onFinished(int i) {
            this.setMax.toFloatRange = null;
            this.setMax.getBottomSheetOnBoardingPresenter().setMin(BottomSheetOnBoardingScenario.HIDE_QUICK_ACTION);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"id/dana/sendmoney_v2/landing/SendMoneyActivity$setupRecentTransactionView$2", "Lid/dana/sendmoney_v2/landing/view/RecentTransactionView$GestureHoldClickListener;", "onLongClick", "", "recentRecipientModel", "Lid/dana/sendmoney/model/RecentRecipientModel;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class equals implements RecentTransactionView.setMin {
        final /* synthetic */ SendMoneyActivity getMin;

        equals(SendMoneyActivity sendMoneyActivity) {
            this.getMin = sendMoneyActivity;
        }

        public final void length(@NotNull increaseCount increasecount) {
            Intrinsics.checkNotNullParameter(increasecount, "recentRecipientModel");
            this.getMin.openManageRecentBottomSheet(increasecount);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class toDoubleRange extends Lambda implements Function0<Unit> {
        public static final toDoubleRange INSTANCE = new toDoubleRange();

        toDoubleRange() {
            super(0);
        }

        public final void invoke() {
            DanaH5.startContainerFullUrl("https://m.dana.id/m/kyc/landingPage?entryPoint=sendMoney");
        }
    }

    private final List<ContentOnBoardingModel> setMin() {
        String string = getString(R.string.bottom_on_boarding_send_money_first_subtitle);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.botto…end_money_first_subtitle)");
        String string2 = getString(R.string.bottom_on_boarding_send_money_first_body_text);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.botto…nd_money_first_body_text)");
        String string3 = getString(R.string.bottom_on_boarding_send_money_second_subtitle);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(R.string.botto…nd_money_second_subtitle)");
        String string4 = getString(R.string.bottom_on_boarding_send_money_second_body_text);
        Intrinsics.checkNotNullExpressionValue(string4, "getString(R.string.botto…d_money_second_body_text)");
        String string5 = getString(R.string.bottom_on_boarding_send_money_third_subtitle);
        Intrinsics.checkNotNullExpressionValue(string5, "getString(R.string.botto…end_money_third_subtitle)");
        String string6 = getString(R.string.bottom_on_boarding_send_money_third_body_text);
        Intrinsics.checkNotNullExpressionValue(string6, "getString(R.string.botto…nd_money_third_body_text)");
        String string7 = getString(R.string.bottom_on_boarding_send_money_fourth_subtitle);
        Intrinsics.checkNotNullExpressionValue(string7, "getString(R.string.botto…nd_money_fourth_subtitle)");
        String string8 = getString(R.string.bottom_on_boarding_send_money_fourth_body_text);
        Intrinsics.checkNotNullExpressionValue(string8, "getString(R.string.botto…d_money_fourth_body_text)");
        return CollectionsKt.listOf(new ContentOnBoardingModel((int) R.drawable.on_boarding_enter_pin, string, string2), new ContentOnBoardingModel((int) R.drawable.ic_illustration_general_new_card, string3, string4), new ContentOnBoardingModel((int) R.drawable.ic_illustration_general_direct_cashout, string5, string6), new ContentOnBoardingModel((int) R.drawable.ic_illustration_general_secured_trx, string7, string8));
    }

    /* access modifiers changed from: private */
    public final void getMin(SendMoneyHomeMenuModel sendMoneyHomeMenuModel) {
        Bundle bundleWithSource = getBundleWithSource();
        bundleWithSource.putString("recipientType", sendMoneyHomeMenuModel.length);
        bundleWithSource.putString("iconUrl", sendMoneyHomeMenuModel.equals);
        this.setMax.length(bundleWithSource);
        String str = sendMoneyHomeMenuModel.length;
        int hashCode2 = str.hashCode();
        if (hashCode2 != -276836809) {
            if (hashCode2 != 3016252) {
                if (hashCode2 == 3052376 && str.equals("chat")) {
                    length("LINK");
                }
            } else if (str.equals("bank")) {
                length(TrackerKey.RecipientDestinationTypeProperty.BANK);
            }
        } else if (str.equals("phonenumber")) {
            length(TrackerKey.RecipientDestinationTypeProperty.DANA_BALANCE);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"id/dana/sendmoney_v2/landing/SendMoneyActivity$initInjector$1", "Lid/dana/contract/services/ServicesContract$View;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMin implements style.getMin {
        @JvmDefault
        public final void dismissProgress() {
        }

        @JvmDefault
        public final void getMax(@NotNull ThirdPartyService thirdPartyService) {
            Intrinsics.checkNotNullParameter(thirdPartyService, "thirdPartyService");
        }

        @JvmDefault
        public final void getMax(@NotNull ThirdPartyService thirdPartyService, @NotNull String str) {
            Intrinsics.checkNotNullParameter(thirdPartyService, "thirdPartyService");
            Intrinsics.checkNotNullParameter(str, "authCode");
        }

        @JvmDefault
        public final void getMax(@NotNull List<ThirdPartyService> list) {
            Intrinsics.checkNotNullParameter(list, "thirdPartyServices");
        }

        @JvmDefault
        public final void getMin(@NotNull List<ThirdPartyService> list) {
            Intrinsics.checkNotNullParameter(list, "thirdPartyServices");
        }

        @JvmDefault
        public final void length() {
        }

        @JvmDefault
        public final void onError(@Nullable String str) {
        }

        @JvmDefault
        public final void setMax(@NotNull List<ThirdPartyService> list) {
            Intrinsics.checkNotNullParameter(list, "thirdPartyServices");
        }

        @JvmDefault
        public final void setMax(boolean z) {
        }

        @JvmDefault
        public final void setMin() {
        }

        @JvmDefault
        public final void setMin(@NotNull ThirdPartyService thirdPartyService) {
            Intrinsics.checkNotNullParameter(thirdPartyService, "thirdPartyService");
        }

        @JvmDefault
        public final void setMin(@NotNull List<ThirdPartyService> list) {
            Intrinsics.checkNotNullParameter(list, "thirdPartyServices");
        }

        @JvmDefault
        public final void showProgress() {
        }

        setMin() {
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r0.getExtras();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean length() {
        /*
            r2 = this;
            android.content.Intent r0 = r2.getIntent()
            if (r0 == 0) goto L_0x0016
            android.os.Bundle r0 = r0.getExtras()
            if (r0 == 0) goto L_0x0016
            java.lang.String r1 = "bundle_extra_for_resume"
            boolean r0 = r0.getBoolean(r1)
            r1 = 1
            if (r0 != r1) goto L_0x0016
            return r1
        L_0x0016:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: id.dana.sendmoney_v2.landing.SendMoneyActivity.length():boolean");
    }

    private final void length(String str) {
        int length2;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length2 = dispatchOnCancelled.length(applicationContext, 0)) == 0)) {
            onCanceled oncanceled = new onCanceled(0, length2, 4);
            onCancelLoad.setMax(-25320159, oncanceled);
            onCancelLoad.getMin(-25320159, oncanceled);
        }
        convertDipToPx.length length3 = new convertDipToPx.length(getApplicationContext());
        length3.getMax = TrackerKey.Event.SEND_MONEY_SELECT;
        convertDipToPx.length min = length3.setMax(TrackerKey.SendMoneyProperties.RECIPIENT_DESTINATION_TYPE, str).setMin(TrackerKey.SendMoneyProperties.LAST_TRANSACTION, false);
        min.setMin();
        convertDipToPx convertdiptopx = new convertDipToPx(min, (byte) 0);
        List length4 = convertdiptopx.length != null ? convertdiptopx.length.length : new ArrayList();
        genTextSelector.setMax((convertSpToPx[]) length4.toArray(new convertSpToPx[length4.size()]));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J.\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\fJ8\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\fJ.\u0010\u000f\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u0010\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lid/dana/sendmoney_v2/landing/SendMoneyActivity$Companion;", "", "()V", "ALL_BANK_REQUEST_CODE", "", "createTransferIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "qrTransferModel", "Lid/dana/sendmoney/model/QrTransferModel;", "transactionType", "", "source", "recipientType", "createTransferSplitBillIntent", "splitBillId", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMax {
        private setMax() {
        }

        public /* synthetic */ setMax(byte b) {
            this();
        }

        @NotNull
        public static Intent getMin(@Nullable Context context, @Nullable QrTransferModel qrTransferModel, @Nullable String str, @Nullable String str2) {
            Intent intent = new Intent(context, SendMoneyActivity.class);
            intent.putExtra("scanner_data", qrTransferModel);
            intent.putExtra("transactionType", str);
            intent.putExtra("recipientType", BranchLinkConstant.ActionTarget.SEND_MONEY_PHONE);
            intent.putExtra("source", str2);
            return intent;
        }

        @NotNull
        public static Intent setMax(@Nullable Context context, @Nullable QrTransferModel qrTransferModel, @Nullable String str, @Nullable String str2, @Nullable String str3) {
            Intent intent = new Intent(context, SendMoneyActivity.class);
            intent.putExtra("scanner_data", qrTransferModel);
            intent.putExtra("transactionType", str);
            intent.putExtra("recipientType", str3);
            intent.putExtra("source", str2);
            return intent;
        }
    }

    public final void openManageRecentBottomSheet(@NotNull increaseCount increasecount) {
        Intrinsics.checkNotNullParameter(increasecount, "recentRecipientModel");
        this.IsOverlapping = increasecount;
        if (isActivityAvailable()) {
            ((ManageRecentBankAccountBottomSheet) this.equals.getValue()).show(getSupportFragmentManager(), "MANAGE_QUICK_ACTION");
        }
    }

    public final void showDialogConfirmationRemoveQuickAction(@NotNull increaseCount increasecount) {
        Intrinsics.checkNotNullParameter(increasecount, "recentRecipientModel");
        if (isActivityAvailable()) {
            getProgressViewStartOffset.getMax getmax = new getProgressViewStartOffset.getMax(this);
            getmax.toFloatRange = getString(R.string.send_money_text_title_dialog_quick_action);
            getProgressViewStartOffset.getMax getmax2 = getmax;
            getmax2.isInside = getString(R.string.send_money_text_desc_dialog_delete_quick_action);
            getProgressViewStartOffset.getMax max = getmax2.IsOverlapping().setMax(false);
            max.toIntRange = 0;
            max.getMax(getString(R.string.option_cancel), hashCode.INSTANCE).setMin(getString(R.string.option_delete), new values(this, increasecount)).equals();
        }
    }

    public static final /* synthetic */ void access$showToastAfterRemoveQuickSend(SendMoneyActivity sendMoneyActivity, increaseCount increasecount) {
        String str;
        if (increasecount.setMin == null || increasecount.length() == null) {
            str = increasecount.isInside;
        } else {
            str = increasecount.setMin.replaceAll("\\*", "•");
            if (str == null) {
                str = increasecount.length().replaceAll("\\*", "•");
            }
        }
        SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.setMax;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(' ');
        sb.append(sendMoneyActivity.getString(R.string.send_money_text_toast_remove_quick_action));
        SwipeRefreshLayout.length(sendMoneyActivity, R.drawable.ic_success, R.drawable.bg_rounded_border_green_50, sb.toString());
    }

    public static final /* synthetic */ void access$openSummary(SendMoneyActivity sendMoneyActivity, RecipientModel recipientModel) {
        int length2;
        int min;
        if (Intrinsics.areEqual((Object) "contact", (Object) recipientModel.onNavigationEvent)) {
            recipientModel.getCause = "sendMoney";
        }
        recipientModel.ICustomTabsCallback = "send_money";
        if (!Intrinsics.areEqual((Object) "bank", (Object) recipientModel.onNavigationEvent) || CornerMarkingDataProvider.getMax() || !sendMoneyActivity.getMax) {
            Intent intentClassWithTracking = sendMoneyActivity.getIntentClassWithTracking(SummaryActivity.class);
            intentClassWithTracking.putExtra("data", recipientModel);
            intentClassWithTracking.putExtra("transferScenario", sendMoneyActivity.getIntent().getStringExtra("transferScenario"));
            sendMoneyActivity.startActivity(intentClassWithTracking);
            return;
        }
        Context baseContext = sendMoneyActivity.getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length2 = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length2)))) {
            onCanceled oncanceled = new onCanceled(length2, min, 32);
            onCancelLoad.setMax(-1523240754, oncanceled);
            onCancelLoad.getMin(-1523240754, oncanceled);
        }
        if (sendMoneyActivity.isActivityAvailable()) {
            isBaselineAligned.positiveButton$default(isBaselineAligned.message$default(new isBaselineAligned(sendMoneyActivity, (drawHorizontalDivider) null, 2, (DefaultConstructorMarker) null), Integer.valueOf(R.string.dialog_warning_below_kitkat), (CharSequence) null, (Function1) null, 6, (Object) null), (Integer) null, (CharSequence) null, (Function1) null, 7, (Object) null).cancelable(false).show();
        }
    }

    public static final /* synthetic */ void access$openBottomSheetOnBoardingViewPage(SendMoneyActivity sendMoneyActivity) {
        BottomSheetHelpActivity.getMin getmin = BottomSheetHelpActivity.Companion;
        String string = sendMoneyActivity.getString(R.string.bottom_on_boarding_send_money_title);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.botto…oarding_send_money_title)");
        sendMoneyActivity.startActivityForResult(BottomSheetHelpActivity.getMin.length(sendMoneyActivity, new OnBoardingModel(string, BottomSheetType.LIST, sendMoneyActivity.setMin(), "send_money"), true), isInside);
    }

    public static final /* synthetic */ void access$checkShowOnBoardingHideQuickAction(SendMoneyActivity sendMoneyActivity, boolean z) {
        try {
            if (!((RecentTransactionView) sendMoneyActivity._$_findCachedViewById(resetInternal.setMax.hasIcon)).isRecentTransactionEmpty() && z) {
                isPowerOfTwo.getMin sendMoneyActivity$Mean$Arithmetic = new SendMoneyActivity$Mean$Arithmetic(sendMoneyActivity);
                Intrinsics.checkNotNullParameter(sendMoneyActivity$Mean$Arithmetic, "onClickListener");
                ((isPowerOfTwo) sendMoneyActivity.toIntRange.getValue()).getMin = sendMoneyActivity$Mean$Arithmetic;
                if (sendMoneyActivity.isActivityAvailable()) {
                    ((isPowerOfTwo) sendMoneyActivity.toIntRange.getValue()).show(sendMoneyActivity.getSupportFragmentManager(), "onboarding");
                }
                getSelectedIndex.length length2 = sendMoneyActivity.bottomSheetOnBoardingPresenter;
                if (length2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("bottomSheetOnBoardingPresenter");
                }
                length2.getMax(BottomSheetOnBoardingScenario.HIDE_QUICK_ACTION);
            }
        } catch (Exception e) {
            updateActionSheetContent.e(DanaLogConstants.TAG.SEND_MONEY_TAG, e.getMessage());
        }
    }

    public static final /* synthetic */ void access$onRecipientSelected(SendMoneyActivity sendMoneyActivity, RecipientModel recipientModel) {
        if (Intrinsics.areEqual((Object) recipientModel.onNavigationEvent, (Object) "bank")) {
            IWorkManagerImplCallback.Stub.Proxy.getMin getmin = sendMoneyActivity.billerX2BPresenter;
            if (getmin == null) {
                Intrinsics.throwUninitializedPropertyAccessException("billerX2BPresenter");
            }
            getmin.length((PhotoSelectListener) recipientModel);
            return;
        }
        recipientModel.b = "userid";
        getTitleIcon_White.getMax getmax = sendMoneyActivity.kycAndDebitPayOptionPresenter;
        if (getmax == null) {
            Intrinsics.throwUninitializedPropertyAccessException("kycAndDebitPayOptionPresenter");
        }
        getmax.setMax(recipientModel);
    }

    public static final /* synthetic */ void access$onMenuSelected(SendMoneyActivity sendMoneyActivity, SendMoneyHomeMenuModel sendMoneyHomeMenuModel) {
        if (sendMoneyHomeMenuModel.getMin() || sendMoneyHomeMenuModel.getMax() || sendMoneyHomeMenuModel.length()) {
            getTitleIcon_White.getMax getmax = sendMoneyActivity.kycAndDebitPayOptionPresenter;
            if (getmax == null) {
                Intrinsics.throwUninitializedPropertyAccessException("kycAndDebitPayOptionPresenter");
            }
            getmax.setMax(sendMoneyHomeMenuModel);
        } else if (!StringsKt.isBlank(sendMoneyHomeMenuModel.setMax)) {
            String str = sendMoneyHomeMenuModel.setMax;
            int max = dispatchOnCancelled.getMax(0);
            if (max != 0) {
                onCanceled oncanceled = new onCanceled(0, max, 16);
                onCancelLoad.setMax(-1404447664, oncanceled);
                onCancelLoad.getMin(-1404447664, oncanceled);
            }
            if (isShowMenu.length(str)) {
                getDuration.length length2 = sendMoneyActivity.readDeepLinkPropertiesPresenter;
                if (length2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("readDeepLinkPropertiesPresenter");
                }
                length2.setMax(str);
                return;
            }
            DanaH5.startContainerFullUrl(str);
        } else {
            sendMoneyActivity.getMin(sendMoneyHomeMenuModel);
        }
    }

    public static final /* synthetic */ isPowerOfTwo access$getOnBoardingManageQuickActionBottomSheet$p(SendMoneyActivity sendMoneyActivity) {
        return (isPowerOfTwo) sendMoneyActivity.toIntRange.getValue();
    }
}
