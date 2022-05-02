package id.dana.sendmoney_v2.recipient.activity;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.FragmentManager;
import com.alibaba.ariver.kernel.ipc.IpcMessageConstants;
import com.ap.zoloz.hummer.biz.HummerConstants;
import id.dana.R;
import id.dana.danah5.DanaH5;
import id.dana.data.foundation.logger.log.DanaLogConstants;
import id.dana.di.modules.RecipientActivityModule;
import id.dana.di.modules.ReferralTrackerModule;
import id.dana.di.modules.SendMoneyModule;
import id.dana.model.CurrencyAmountModel;
import id.dana.referral.model.MyReferralConsult;
import id.dana.referral.model.ReferralCampaignInfo;
import id.dana.referral.view.ReferralPopupDialog;
import id.dana.sendmoney.model.QrTransferModel;
import id.dana.sendmoney.model.RecipientModel;
import id.dana.sendmoney.model.WithdrawOTCModel;
import id.dana.sendmoney_v2.recipient.view.RecipientView;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmDefault;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.StringCompanionObject;
import o.APWebSettings;
import o.ConstraintProxy$StorageNotLowProxy;
import o.DiagnosticsReceiver;
import o.PrepareException;
import o.dispatchOnCancelled;
import o.enqueueWorkRequests;
import o.getDataFieldCount;
import o.handlePerformanceLog;
import o.increaseCount;
import o.isShowMenu;
import o.onCancelLoad;
import o.onCanceled;
import o.onDelete;
import o.onSelectCanceled;
import o.postWebMessage;
import o.resetInternal;
import o.setActivity;
import o.stopIgnoring;
import o.updateActionSheetContent;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000_\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0013\u0018\u0000 42\u00020\u0001:\u00014B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u001f\u001a\u00020 H\u0014J\b\u0010!\u001a\u00020\"H\u0002J\b\u0010#\u001a\u00020$H\u0002J\b\u0010%\u001a\u00020&H\u0002J\b\u0010'\u001a\u00020 H\u0016J\b\u0010(\u001a\u00020 H\u0002J\b\u0010)\u001a\u00020 H\u0014J\b\u0010*\u001a\u00020 H\u0014J\u0012\u0010+\u001a\u00020 2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016J\b\u0010,\u001a\u00020 H\u0014J\b\u0010-\u001a\u00020 H\u0002J\u0010\u0010.\u001a\u00020 2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0006\u0010/\u001a\u00020 J\u0010\u00100\u001a\u00020 2\u0006\u00101\u001a\u000202H\u0002J\u0010\u00103\u001a\u00020 2\u0006\u0010\r\u001a\u00020\u000eH\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX.¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X.¢\u0006\u0002\n\u0000R\u001b\u0010\u0012\u001a\u00020\u00138BX\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0018\u001a\u00020\u00198\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u000e\u0010\u001e\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000¨\u00065"}, d2 = {"Lid/dana/sendmoney_v2/recipient/activity/ContactRecipientActivity;", "Lid/dana/sendmoney_v2/recipient/activity/BaseRecipientActivity;", "()V", "calculatorPresenter", "Lid/dana/contract/sendmoney/CalculatorContract$Presenter;", "getCalculatorPresenter", "()Lid/dana/contract/sendmoney/CalculatorContract$Presenter;", "setCalculatorPresenter", "(Lid/dana/contract/sendmoney/CalculatorContract$Presenter;)V", "campaignId", "", "isSelectedRecipientIsDanaUser", "", "recipientModel", "Lid/dana/sendmoney/model/RecipientModel;", "referralChecked", "referralPopupDialog", "Lid/dana/referral/view/ReferralPopupDialog;", "referralPopupDialogListener", "id/dana/sendmoney_v2/recipient/activity/ContactRecipientActivity$referralPopupDialogListener$2$1", "getReferralPopupDialogListener", "()Lid/dana/sendmoney_v2/recipient/activity/ContactRecipientActivity$referralPopupDialogListener$2$1;", "referralPopupDialogListener$delegate", "Lkotlin/Lazy;", "referralTrackerPresenter", "Lid/dana/contract/referraltracker/ReferralTrackerContract$Presenter;", "getReferralTrackerPresenter", "()Lid/dana/contract/referraltracker/ReferralTrackerContract$Presenter;", "setReferralTrackerPresenter", "(Lid/dana/contract/referraltracker/ReferralTrackerContract$Presenter;)V", "sendMoneyHowToUrl", "configToolbar", "", "getRecipientActivityModule", "Lid/dana/di/modules/RecipientActivityModule;", "getReferralTrackerModule", "Lid/dana/di/modules/ReferralTrackerModule;", "getSendMoneyModule", "Lid/dana/di/modules/SendMoneyModule;", "init", "initData", "initInjector", "initRecipientView", "onRecipientSelected", "onResume", "openHowToUrl", "processRecipientListData", "saveLastReferralCampaignAndDismissDialog", "showReferralPopup", "prizeAmount", "Lid/dana/model/CurrencyAmountModel;", "showUnregisteredUserDialog", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class ContactRecipientActivity extends BaseRecipientActivity {
    @NotNull
    public static final getMax Companion = new getMax((byte) 0);
    /* access modifiers changed from: private */
    public boolean IsOverlapping;
    @Inject
    public DiagnosticsReceiver.getMin calculatorPresenter;
    /* access modifiers changed from: private */
    public RecipientModel equals;
    /* access modifiers changed from: private */
    public boolean getMax;
    private ReferralPopupDialog getMin;
    private HashMap isInside;
    @Inject
    public ConstraintProxy$StorageNotLowProxy.setMin referralTrackerPresenter;
    /* access modifiers changed from: private */
    public String setMax = "";
    private final Lazy toFloatRange = LazyKt.lazy(new toIntRange(this));
    /* access modifiers changed from: private */
    public String toIntRange = "";

    @JvmStatic
    @NotNull
    public static final Intent createTransferIntent(@NotNull Context context, @NotNull QrTransferModel qrTransferModel, @NotNull String str) {
        return getMax.length(context, qrTransferModel, str);
    }

    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.isInside;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public final View _$_findCachedViewById(int i) {
        int min;
        int length2;
        Context baseContext = getBaseContext();
        Context context = null;
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || i == (length2 = dispatchOnCancelled.length(applicationContext, i)))) {
            onCanceled oncanceled = new onCanceled(i, length2, 4);
            onCancelLoad.setMax(-1929091188, oncanceled);
            onCancelLoad.getMin(-1929091188, oncanceled);
        }
        Context baseContext2 = getBaseContext();
        if (baseContext2 != null) {
            context = baseContext2.getApplicationContext();
        }
        if (!(context == null || i == (min = dispatchOnCancelled.getMin(context, i)))) {
            onCanceled oncanceled2 = new onCanceled(i, min, 32);
            onCancelLoad.setMax(-1929091188, oncanceled2);
            onCancelLoad.getMin(-1929091188, oncanceled2);
        }
        if (this.isInside == null) {
            this.isInside = new HashMap();
        }
        View view = (View) this.isInside.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.isInside.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public static final /* synthetic */ RecipientModel access$getRecipientModel$p(ContactRecipientActivity contactRecipientActivity) {
        RecipientModel recipientModel = contactRecipientActivity.equals;
        if (recipientModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("recipientModel");
        }
        return recipientModel;
    }

    @NotNull
    public final ConstraintProxy$StorageNotLowProxy.setMin getReferralTrackerPresenter() {
        ConstraintProxy$StorageNotLowProxy.setMin setmin = this.referralTrackerPresenter;
        if (setmin == null) {
            Intrinsics.throwUninitializedPropertyAccessException("referralTrackerPresenter");
        }
        return setmin;
    }

    public final void setReferralTrackerPresenter(@NotNull ConstraintProxy$StorageNotLowProxy.setMin setmin) {
        Intrinsics.checkNotNullParameter(setmin, "<set-?>");
        this.referralTrackerPresenter = setmin;
    }

    @NotNull
    public final DiagnosticsReceiver.getMin getCalculatorPresenter() {
        DiagnosticsReceiver.getMin getmin = this.calculatorPresenter;
        if (getmin == null) {
            Intrinsics.throwUninitializedPropertyAccessException("calculatorPresenter");
        }
        return getmin;
    }

    public final void setCalculatorPresenter(@NotNull DiagnosticsReceiver.getMin getmin) {
        Intrinsics.checkNotNullParameter(getmin, "<set-?>");
        this.calculatorPresenter = getmin;
    }

    public final void configToolbar() {
        super.configToolbar();
        setCenterTitle(getString(R.string.sendmoney_summary_x2p_toolbar_title));
    }

    public final void init() {
        super.init();
        Intent intent = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, IpcMessageConstants.EXTRA_INTENT);
        setData(intent.getExtras());
        getRecipientPresenter().getMax();
        getRecipientPresenter().getMin();
    }

    /* access modifiers changed from: protected */
    public final void initRecipientView() {
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(1139841529, oncanceled);
            onCancelLoad.getMin(1139841529, oncanceled);
        }
        RecipientView recipientView = (RecipientView) _$_findCachedViewById(resetInternal.setMax.evictionCount);
        if (recipientView != null) {
            recipientView.setRecipientContactType(2);
            recipientView.setEnableViewSection(true);
            recipientView.setRecipientSelectedListener(this);
            recipientView.setOnContactSyncEnabled(new getMin(recipientView));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class getMin extends Lambda implements Function0<Unit> {
        final /* synthetic */ RecipientView $this_apply;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        getMin(RecipientView recipientView) {
            super(0);
            this.$this_apply = recipientView;
        }

        public final void invoke() {
            StringBuilder sb = new StringBuilder(DanaLogConstants.Prefix.CONTACT_SYNC_PREFIX);
            sb.append(this.$this_apply.getClass().getName());
            sb.append(":init");
            updateActionSheetContent.d(DanaLogConstants.TAG.SYNC_CONTACT_TAG, sb.toString());
            this.$this_apply.checkContactSyncState();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u001a\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00052\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016¨\u0006\r"}, d2 = {"id/dana/sendmoney_v2/recipient/activity/ContactRecipientActivity$getRecipientActivityModule$1", "Lid/dana/contract/sendmoney/RecipientContract$View;", "onFinishCheckReferralSendMoney", "", "enable", "", "howToUrl", "", "onGetFeatureBelowKitkatConfigSuccess", "onSuccessRemoveRecentTransaction", "success", "recentRecipientModel", "Lid/dana/sendmoney/model/RecentRecipientModel;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMax implements enqueueWorkRequests.setMax {
        final /* synthetic */ ContactRecipientActivity setMax;

        @JvmDefault
        public final void dismissProgress() {
        }

        @JvmDefault
        public final void onError(@Nullable String str) {
        }

        public final void onSuccessRemoveRecentTransaction(boolean z, @Nullable increaseCount increasecount) {
        }

        @JvmDefault
        public final void showProgress() {
        }

        setMax(ContactRecipientActivity contactRecipientActivity) {
            this.setMax = contactRecipientActivity;
        }

        public final void onGetFeatureBelowKitkatConfigSuccess(boolean z) {
            this.setMax.setBelowKitkatDialog(z);
        }

        public final void onFinishCheckReferralSendMoney(boolean z, @Nullable String str) {
            if (z) {
                ContactRecipientActivity contactRecipientActivity = this.setMax;
                if (str == null) {
                    str = "";
                }
                contactRecipientActivity.toIntRange = str;
                this.setMax.getReferralTrackerPresenter().getMax();
                RecipientView recipientView = (RecipientView) this.setMax._$_findCachedViewById(resetInternal.setMax.evictionCount);
                if (recipientView != null) {
                    recipientView.setEnableInvite(true);
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000E\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\bH\u0016J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0006H\u0016J\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0003H\u0016J\u0010\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0010\u0010\u0017\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH\u0016J\u0016\u0010\u0018\u001a\u00020\u00032\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aH\u0016J\b\u0010\u001c\u001a\u00020\u0003H\u0016¨\u0006\u001d"}, d2 = {"id/dana/sendmoney_v2/recipient/activity/ContactRecipientActivity$getReferralTrackerModule$1", "Lid/dana/contract/referraltracker/ReferralTrackerContract$View;", "dismissProgress", "", "onCheckRegisteredUser", "isRegistered", "", "phoneNumber", "", "onError", "errorMessage", "onFinishCheckLatestReferralCampaign", "myReferralConsult", "Lid/dana/referral/model/MyReferralConsult;", "onGetContactSyncFeature", "enable", "onGetDeeplinkReferralSuccess", "deepLinkReferral", "Lid/dana/domain/deeplink/model/DeepLink;", "onGetMessageTemplateError", "onGetMessageTemplateSuccess", "message", "Lid/dana/domain/featureconfig/model/ReferralMessageTemplateConfig;", "onGetReferralConsultSuccess", "setReferralWidgetFeatureValue", "referralWidgetModels", "", "Lid/dana/model/ReferralWidgetModel;", "showProgress", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class length implements ConstraintProxy$StorageNotLowProxy.setMax {
        final /* synthetic */ ContactRecipientActivity setMax;

        public final void dismissProgress() {
        }

        public final void onCheckRegisteredUser(boolean z, @NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "phoneNumber");
        }

        public final void onError(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "errorMessage");
        }

        public final void onGetContactSyncFeature(boolean z) {
        }

        public final void onGetDeeplinkReferralSuccess(@NotNull APWebSettings aPWebSettings) {
            Intrinsics.checkNotNullParameter(aPWebSettings, "deepLinkReferral");
        }

        public final void onGetMessageTemplateError() {
        }

        public final void onGetMessageTemplateSuccess(@NotNull postWebMessage postwebmessage) {
            Intrinsics.checkNotNullParameter(postwebmessage, "message");
        }

        public final void onGetReferralConsultSuccess(@NotNull MyReferralConsult myReferralConsult) {
            Intrinsics.checkNotNullParameter(myReferralConsult, "myReferralConsult");
        }

        public final void setReferralWidgetFeatureValue(@NotNull List<? extends handlePerformanceLog> list) {
            Intrinsics.checkNotNullParameter(list, "referralWidgetModels");
        }

        public final void showProgress() {
        }

        length(ContactRecipientActivity contactRecipientActivity) {
            this.setMax = contactRecipientActivity;
        }

        public final void onFinishCheckLatestReferralCampaign(@NotNull MyReferralConsult myReferralConsult) {
            Intrinsics.checkNotNullParameter(myReferralConsult, "myReferralConsult");
            ContactRecipientActivity contactRecipientActivity = this.setMax;
            ReferralCampaignInfo referralCampaignInfo = myReferralConsult.setMin;
            Intrinsics.checkNotNullExpressionValue(referralCampaignInfo, "myReferralConsult.referrerCampaignInfo");
            String str = referralCampaignInfo.length;
            Intrinsics.checkNotNullExpressionValue(str, "myReferralConsult.referrerCampaignInfo.campaignId");
            contactRecipientActivity.setMax = str;
            ContactRecipientActivity contactRecipientActivity2 = this.setMax;
            ReferralCampaignInfo referralCampaignInfo2 = myReferralConsult.setMin;
            Intrinsics.checkNotNullExpressionValue(referralCampaignInfo2, "myReferralConsult.referrerCampaignInfo");
            CurrencyAmountModel currencyAmountModel = referralCampaignInfo2.getMin;
            Intrinsics.checkNotNullExpressionValue(currencyAmountModel, "myReferralConsult.referrerCampaignInfo.prizeAmount");
            ContactRecipientActivity.access$showReferralPopup(contactRecipientActivity2, currencyAmountModel);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000;\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0012\u0010\u0004\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00032\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J\u0012\u0010\n\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J\u0012\u0010\r\u001a\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u0003H\u0016J\u001c\u0010\u0011\u001a\u00020\u00032\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\u0015\u001a\u00020\u00032\b\u0010\u0016\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\u0017\u001a\u00020\u00032\b\u0010\u0018\u001a\u0004\u0018\u00010\u0006H\u0016J:\u0010\u0019\u001a\u00020\u00032\b\u0010\u001a\u001a\u0004\u0018\u00010\u00062\b\u0010\u001b\u001a\u0004\u0018\u00010\u00062\b\u0010\u001c\u001a\u0004\u0018\u00010\u00062\b\u0010\u001d\u001a\u0004\u0018\u00010\u00062\b\u0010\u001e\u001a\u0004\u0018\u00010\u0006H\u0016J\b\u0010\u001f\u001a\u00020\u0003H\u0016J\b\u0010 \u001a\u00020\u0003H\u0016J\u0012\u0010!\u001a\u00020\u00032\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016¨\u0006\""}, d2 = {"id/dana/sendmoney_v2/recipient/activity/ContactRecipientActivity$getSendMoneyModule$1", "Lid/dana/contract/sendmoney/CalculatorContract$View;", "dismissProgress", "", "onError", "errorMessage", "", "onInitCallback", "transferInit", "Lid/dana/domain/sendmoney/model/TransferInit;", "onInitError", "throwable", "", "onInitTransferOTCSuccess", "withdrawOTCModel", "Lid/dana/sendmoney/model/WithdrawOTCModel;", "onInitTransferSuccess", "onLimitBelowFreeMinAmount", "recipientModel", "Lid/dana/sendmoney/model/RecipientModel;", "freeMinAmount", "onMaximumAmountReached", "limitMaxAmount", "onMinimumAmountReached", "limitMinAmount", "onRecipientIsDanaUser", "userId", "phoneNumber", "nickname", "maskedPhoneNumber", "imageUrl", "onTransferMethodEmpty", "showProgress", "showSummaryPage", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMin implements DiagnosticsReceiver.length {
        final /* synthetic */ ContactRecipientActivity setMax;

        public final void dismissProgress() {
        }

        public final void onInitCallback(@Nullable getDataFieldCount getdatafieldcount) {
        }

        public final void onInitTransferOTCSuccess(@Nullable WithdrawOTCModel withdrawOTCModel) {
        }

        public final void onLimitBelowFreeMinAmount(@Nullable RecipientModel recipientModel, @Nullable String str) {
        }

        public final void onMaximumAmountReached(@Nullable String str) {
        }

        public final void onMinimumAmountReached(@Nullable String str) {
        }

        public final void onTransferMethodEmpty() {
        }

        public final void showProgress() {
        }

        public final void showSummaryPage(@Nullable RecipientModel recipientModel) {
        }

        setMin(ContactRecipientActivity contactRecipientActivity) {
            this.setMax = contactRecipientActivity;
        }

        public final void onRecipientIsDanaUser(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5) {
            ContactRecipientActivity.access$getRecipientModel$p(this.setMax).toDoubleRange = true;
            RecipientModel access$getRecipientModel$p = ContactRecipientActivity.access$getRecipientModel$p(this.setMax);
            if (str5 == null) {
                str5 = "";
            }
            access$getRecipientModel$p.getMin = str5;
            this.setMax.IsOverlapping = true;
            ContactRecipientActivity contactRecipientActivity = this.setMax;
            contactRecipientActivity.openSummary(ContactRecipientActivity.access$getRecipientModel$p(contactRecipientActivity));
        }

        public final void onInitTransferSuccess() {
            ContactRecipientActivity.access$getRecipientModel$p(this.setMax).toDoubleRange = false;
            if (!this.setMax.IsOverlapping) {
                ContactRecipientActivity contactRecipientActivity = this.setMax;
                ContactRecipientActivity.access$showUnregisteredUserDialog(contactRecipientActivity, ContactRecipientActivity.access$getRecipientModel$p(contactRecipientActivity));
            }
        }

        public final void onInitError(@Nullable Throwable th) {
            ContactRecipientActivity.access$getRecipientModel$p(this.setMax).toDoubleRange = false;
            if (!this.setMax.IsOverlapping) {
                ContactRecipientActivity contactRecipientActivity = this.setMax;
                ContactRecipientActivity.access$showUnregisteredUserDialog(contactRecipientActivity, ContactRecipientActivity.access$getRecipientModel$p(contactRecipientActivity));
            }
        }

        public final void onError(@Nullable String str) {
            ContactRecipientActivity contactRecipientActivity = this.setMax;
            contactRecipientActivity.openSummary(ContactRecipientActivity.access$getRecipientModel$p(contactRecipientActivity));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\t\n\u0000\n\u0002\b\u0003*\u0001\u0001\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "id/dana/sendmoney_v2/recipient/activity/ContactRecipientActivity$referralPopupDialogListener$2$1", "invoke", "()Lid/dana/sendmoney_v2/recipient/activity/ContactRecipientActivity$referralPopupDialogListener$2$1;"}, k = 3, mv = {1, 4, 2})
    static final class toIntRange extends Lambda implements Function0<AnonymousClass5> {
        final /* synthetic */ ContactRecipientActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        toIntRange(ContactRecipientActivity contactRecipientActivity) {
            super(0);
            this.this$0 = contactRecipientActivity;
        }

        @NotNull
        public final AnonymousClass5 invoke() {
            return new ReferralPopupDialog.getMax(this) {
                final /* synthetic */ toIntRange getMax;

                {
                    this.getMax = r1;
                }

                public final void getMax(boolean z) {
                    this.getMax.this$0.getMax = z;
                }

                public final void getMax() {
                    this.getMax.this$0.disableClick();
                    this.getMax.this$0.saveLastReferralCampaignAndDismissDialog();
                    ContactRecipientActivity.access$openHowToUrl(this.getMax.this$0);
                }

                public final void setMin() {
                    this.getMax.this$0.saveLastReferralCampaignAndDismissDialog();
                }
            };
        }
    }

    public final void saveLastReferralCampaignAndDismissDialog() {
        if (this.getMax) {
            ConstraintProxy$StorageNotLowProxy.setMin setmin = this.referralTrackerPresenter;
            if (setmin == null) {
                Intrinsics.throwUninitializedPropertyAccessException("referralTrackerPresenter");
            }
            setmin.getMin(this.setMax);
        }
        ReferralPopupDialog referralPopupDialog = this.getMin;
        if (referralPopupDialog == null) {
            Intrinsics.throwUninitializedPropertyAccessException("referralPopupDialog");
        }
        referralPopupDialog.setMax();
    }

    public final void onResume() {
        super.onResume();
        RecipientView recipientView = (RecipientView) _$_findCachedViewById(resetInternal.setMax.evictionCount);
        if (recipientView != null) {
            recipientView.initRecipientView();
        }
    }

    public final void onRecipientSelected(@Nullable RecipientModel recipientModel) {
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(-33174529, oncanceled);
            onCancelLoad.getMin(-33174529, oncanceled);
        }
        if (!isClickable()) {
            recipientModel = null;
        }
        if (recipientModel != null) {
            processRecipientListData(recipientModel);
            recipientModel.onNavigationEvent = "contact";
            recipientModel.hashCode = true;
            this.equals = recipientModel;
            if (recipientModel.isInside()) {
                openSummary(recipientModel);
                return;
            }
            this.IsOverlapping = false;
            DiagnosticsReceiver.getMin getmin = this.calculatorPresenter;
            if (getmin == null) {
                Intrinsics.throwUninitializedPropertyAccessException("calculatorPresenter");
            }
            getmin.length("BALANCE", recipientModel);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class isInside extends Lambda implements Function0<Unit> {
        final /* synthetic */ RecipientModel $recipientModel;
        final /* synthetic */ ContactRecipientActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        isInside(ContactRecipientActivity contactRecipientActivity, RecipientModel recipientModel) {
            super(0);
            this.this$0 = contactRecipientActivity;
            this.$recipientModel = recipientModel;
        }

        public final void invoke() {
            this.this$0.openSummary(this.$recipientModel);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007¨\u0006\u000b"}, d2 = {"Lid/dana/sendmoney_v2/recipient/activity/ContactRecipientActivity$Companion;", "", "()V", "createTransferIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "qrTransferModel", "Lid/dana/sendmoney/model/QrTransferModel;", "transactionType", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMax {
        private getMax() {
        }

        public /* synthetic */ getMax(byte b) {
            this();
        }

        @JvmStatic
        @NotNull
        public static Intent length(@NotNull Context context, @NotNull QrTransferModel qrTransferModel, @NotNull String str) {
            Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
            Intrinsics.checkNotNullParameter(qrTransferModel, "qrTransferModel");
            Intrinsics.checkNotNullParameter(str, "transactionType");
            Intent intent = new Intent(context, ContactRecipientActivity.class);
            intent.putExtra("scanner_data", qrTransferModel);
            intent.putExtra("transactionType", str);
            return intent;
        }
    }

    /* access modifiers changed from: protected */
    public final void initInjector() {
        setActivity.length length2 = new setActivity.length((byte) 0);
        PrepareException.AnonymousClass1 applicationComponent = getApplicationComponent();
        if (applicationComponent != null) {
            length2.getMin = applicationComponent;
            length2.setMax = new RecipientActivityModule(new setMax(this));
            length2.setMin = new ReferralTrackerModule(new length(this));
            length2.length = new SendMoneyModule(new setMin(this));
            stopIgnoring.setMin(length2.setMax, RecipientActivityModule.class);
            stopIgnoring.setMin(length2.setMin, ReferralTrackerModule.class);
            stopIgnoring.setMin(length2.length, SendMoneyModule.class);
            stopIgnoring.setMin(length2.getMin, PrepareException.AnonymousClass1.class);
            new setActivity(length2.setMax, length2.setMin, length2.length, length2.getMin, (byte) 0).getMin(this);
            onDelete.getMin[] getminArr = new onDelete.getMin[3];
            getminArr[0] = getRecipientPresenter();
            ConstraintProxy$StorageNotLowProxy.setMin setmin = this.referralTrackerPresenter;
            if (setmin == null) {
                Intrinsics.throwUninitializedPropertyAccessException("referralTrackerPresenter");
            }
            getminArr[1] = setmin;
            DiagnosticsReceiver.getMin getmin = this.calculatorPresenter;
            if (getmin == null) {
                Intrinsics.throwUninitializedPropertyAccessException("calculatorPresenter");
            }
            getminArr[2] = getmin;
            registerPresenter(getminArr);
            return;
        }
        throw null;
    }

    public final void processRecipientListData(@NotNull RecipientModel recipientModel) {
        Intrinsics.checkNotNullParameter(recipientModel, "recipientModel");
        recipientModel.getCause = "sendMoney";
        super.processRecipientListData(recipientModel);
    }

    public static final /* synthetic */ void access$showReferralPopup(ContactRecipientActivity contactRecipientActivity, CurrencyAmountModel currencyAmountModel) {
        ReferralPopupDialog.length length2 = new ReferralPopupDialog.length(contactRecipientActivity);
        length2.getMax = contactRecipientActivity.getString(R.string.referral_popup_title);
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String string = contactRecipientActivity.getString(R.string.referral_popup_description);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.referral_popup_description)");
        String format = String.format(string, Arrays.copyOf(new Object[]{currencyAmountModel.setMax()}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
        length2.getMin = format;
        length2.length = contactRecipientActivity.getString(R.string.referral_checkbox_description);
        length2.toFloatRange = (toIntRange.AnonymousClass5) contactRecipientActivity.toFloatRange.getValue();
        ReferralPopupDialog referralPopupDialog = new ReferralPopupDialog(length2.setMax, length2.setMin, length2, (byte) 0);
        Intrinsics.checkNotNullExpressionValue(referralPopupDialog, "ReferralPopupDialog.Buil…ner)\n            .build()");
        contactRecipientActivity.getMin = referralPopupDialog;
        if (referralPopupDialog == null) {
            Intrinsics.throwUninitializedPropertyAccessException("referralPopupDialog");
        }
        referralPopupDialog.setMin();
    }

    public static final /* synthetic */ void access$showUnregisteredUserDialog(ContactRecipientActivity contactRecipientActivity, RecipientModel recipientModel) {
        if (contactRecipientActivity.isActivityAvailable()) {
            onSelectCanceled onselectcanceled = new onSelectCanceled((Function0) null, new isInside(contactRecipientActivity, recipientModel), 1);
            onselectcanceled.getMax = R.drawable.ic_illustration_unregistered_number;
            AppCompatImageView appCompatImageView = (AppCompatImageView) onselectcanceled.setMax(resetInternal.setMax.setSupportProgressBarVisibility);
            if (appCompatImageView != null) {
                onSelectCanceled.setMin(appCompatImageView, onselectcanceled.getMax);
            }
            String string = contactRecipientActivity.getString(R.string.sendmoney_unregistered_user_dialog_title);
            Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.sendm…stered_user_dialog_title)");
            onselectcanceled.length(string);
            String string2 = contactRecipientActivity.getString(R.string.sendmoney_unregistered_user_dialog_description);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.sendm…_user_dialog_description)");
            onselectcanceled.getMax(string2);
            String string3 = contactRecipientActivity.getString(R.string.sendmoney_unregistered_user_positive_button);
            Intrinsics.checkNotNullExpressionValue(string3, "getString(R.string.sendm…red_user_positive_button)");
            onselectcanceled.setMin(string3);
            String string4 = contactRecipientActivity.getString(R.string.sendmoney_unregistered_user_negative_button);
            Intrinsics.checkNotNullExpressionValue(string4, "getString(R.string.sendm…red_user_negative_button)");
            onselectcanceled.getMin(string4);
            FragmentManager supportFragmentManager = contactRecipientActivity.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "supportFragmentManager");
            onselectcanceled.getMin(supportFragmentManager);
        }
    }

    public static final /* synthetic */ void access$openHowToUrl(ContactRecipientActivity contactRecipientActivity) {
        String min = isShowMenu.setMin(contactRecipientActivity.toIntRange);
        Intrinsics.checkNotNullExpressionValue(min, "UrlUtil.getCleanUrl(sendMoneyHowToUrl)");
        DanaH5.startContainerFullUrl(min);
    }
}
