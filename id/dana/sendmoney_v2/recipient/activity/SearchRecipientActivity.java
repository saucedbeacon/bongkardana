package id.dana.sendmoney_v2.recipient.activity;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.FragmentManager;
import id.dana.R;
import id.dana.bank.BankSelectorActivity;
import id.dana.danah5.DanaH5;
import id.dana.data.foundation.logger.log.DanaLogConstants;
import id.dana.di.modules.BillerX2BModule;
import id.dana.di.modules.RecipientActivityModule;
import id.dana.di.modules.SendMoneyModule;
import id.dana.richview.SearchView;
import id.dana.sendmoney.model.RecipientModel;
import id.dana.sendmoney.model.WithdrawOTCModel;
import id.dana.sendmoney_v2.recipient.view.RecipientView;
import id.dana.tracker.TrackerKey;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmDefault;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o.ConstraintTrackingWorker;
import o.CornerMarkingDataProvider;
import o.DiagnosticsReceiver;
import o.IWorkManagerImplCallback;
import o.PhotoSelectListener;
import o.PrepareException;
import o.RedDotManager;
import o.convertDipToPx;
import o.convertSpToPx;
import o.dispatchOnCancelled;
import o.drawHorizontalDivider;
import o.enqueueWorkRequests;
import o.genTextSelector;
import o.getCurrX;
import o.getDataFieldCount;
import o.getDeployVersion;
import o.getExtraDataParsers;
import o.increaseCount;
import o.isBaselineAligned;
import o.onCancelLoad;
import o.onCanceled;
import o.onDelete;
import o.onSelectCanceled;
import o.putData;
import o.resetInternal;
import o.stopIgnoring;
import o.updateActionSheetContent;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\"\u001a\u00020#H\u0014J\b\u0010$\u001a\u00020#H\u0016J\b\u0010%\u001a\u00020#H\u0014J\b\u0010&\u001a\u00020#H\u0014J\u0010\u0010'\u001a\u00020#2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\u0010\u0010(\u001a\u00020#2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\b\u0010)\u001a\u00020#H\u0002J\u0010\u0010*\u001a\u00020#2\u0006\u0010+\u001a\u00020,H\u0002J\u0010\u0010-\u001a\u00020#2\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\u0016\u0010.\u001a\u00020#2\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u000200J\b\u00102\u001a\u00020#H\u0002R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0015\u001a\u00020\u0016X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\u00020\u00188BX\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u000e\u0010\u001b\u001a\u00020\u001cX.¢\u0006\u0002\n\u0000R\u001b\u0010\u001d\u001a\u00020\u001e8BX\u0002¢\u0006\f\n\u0004\b!\u0010\b\u001a\u0004\b\u001f\u0010 ¨\u00063"}, d2 = {"Lid/dana/sendmoney_v2/recipient/activity/SearchRecipientActivity;", "Lid/dana/sendmoney_v2/recipient/activity/BaseRecipientActivity;", "()V", "billerX2BModule", "Lid/dana/di/modules/BillerX2BModule;", "getBillerX2BModule", "()Lid/dana/di/modules/BillerX2BModule;", "billerX2BModule$delegate", "Lkotlin/Lazy;", "billerX2BPresenter", "Lid/dana/contract/sendmoney/v2/BillerX2BContract$Presenter;", "getBillerX2BPresenter", "()Lid/dana/contract/sendmoney/v2/BillerX2BContract$Presenter;", "setBillerX2BPresenter", "(Lid/dana/contract/sendmoney/v2/BillerX2BContract$Presenter;)V", "calculatorPresenter", "Lid/dana/contract/sendmoney/CalculatorContract$Presenter;", "getCalculatorPresenter", "()Lid/dana/contract/sendmoney/CalculatorContract$Presenter;", "setCalculatorPresenter", "(Lid/dana/contract/sendmoney/CalculatorContract$Presenter;)V", "isSelectedRecipientIsDanaUser", "", "recipientActivityModule", "Lid/dana/di/modules/RecipientActivityModule;", "getRecipientActivityModule", "()Lid/dana/di/modules/RecipientActivityModule;", "recipientModel", "Lid/dana/sendmoney/model/RecipientModel;", "sendMoneyModule", "Lid/dana/di/modules/SendMoneyModule;", "getSendMoneyModule", "()Lid/dana/di/modules/SendMoneyModule;", "sendMoneyModule$delegate", "configToolbar", "", "init", "initInjector", "initRecipientView", "onRecipientSelected", "openSummary", "showBelowKitkatDialogWarning", "showBillerX2BDialog", "billerX2BModel", "Lid/dana/sendmoney_v2/model/BillerX2BModel;", "showUnregisteredUserDialog", "startAddBankAccountActivity", "bankId", "", "bankNumber", "trackSendMoneySearch", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class SearchRecipientActivity extends BaseRecipientActivity {
    private final Lazy IsOverlapping = LazyKt.lazy(new getMin(this));
    @Inject
    public IWorkManagerImplCallback.Stub.Proxy.getMin billerX2BPresenter;
    @Inject
    public DiagnosticsReceiver.getMin calculatorPresenter;
    private HashMap equals;
    private final Lazy getMax = LazyKt.lazy(new length(this));
    /* access modifiers changed from: private */
    public boolean getMin;
    /* access modifiers changed from: private */
    public RecipientModel setMax;

    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.equals;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public final View _$_findCachedViewById(int i) {
        if (this.equals == null) {
            this.equals = new HashMap();
        }
        View view = (View) this.equals.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.equals.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public static final /* synthetic */ RecipientModel access$getRecipientModel$p(SearchRecipientActivity searchRecipientActivity) {
        RecipientModel recipientModel = searchRecipientActivity.setMax;
        if (recipientModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("recipientModel");
        }
        return recipientModel;
    }

    @NotNull
    public final IWorkManagerImplCallback.Stub.Proxy.getMin getBillerX2BPresenter() {
        IWorkManagerImplCallback.Stub.Proxy.getMin getmin = this.billerX2BPresenter;
        if (getmin == null) {
            Intrinsics.throwUninitializedPropertyAccessException("billerX2BPresenter");
        }
        return getmin;
    }

    public final void setBillerX2BPresenter(@NotNull IWorkManagerImplCallback.Stub.Proxy.getMin getmin) {
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(1184369478, oncanceled);
            onCancelLoad.getMin(1184369478, oncanceled);
        }
        Intrinsics.checkNotNullParameter(getmin, "<set-?>");
        this.billerX2BPresenter = getmin;
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
        setCenterTitle(getString(R.string.sendmoney_searching));
    }

    public final void init() {
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(1614612003, oncanceled);
            onCancelLoad.getMin(1614612003, oncanceled);
        }
        super.init();
        RecipientView recipientView = (RecipientView) _$_findCachedViewById(resetInternal.setMax.evictionCount);
        if (recipientView != null) {
            recipientView.initRecipientView();
        }
        convertDipToPx.length length2 = new convertDipToPx.length(getApplicationContext());
        length2.getMax = TrackerKey.Event.SEND_MONEY_SEARCH;
        length2.setMin();
        convertDipToPx convertdiptopx = new convertDipToPx(length2, (byte) 0);
        List length3 = convertdiptopx.length != null ? convertdiptopx.length.length : new ArrayList();
        genTextSelector.setMax((convertSpToPx[]) length3.toArray(new convertSpToPx[length3.size()]));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u001a\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00052\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016¨\u0006\r"}, d2 = {"id/dana/sendmoney_v2/recipient/activity/SearchRecipientActivity$recipientActivityModule$1", "Lid/dana/contract/sendmoney/RecipientContract$View;", "onFinishCheckReferralSendMoney", "", "enable", "", "howToUrl", "", "onGetFeatureBelowKitkatConfigSuccess", "onSuccessRemoveRecentTransaction", "success", "recentRecipientModel", "Lid/dana/sendmoney/model/RecentRecipientModel;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMin implements enqueueWorkRequests.setMax {
        final /* synthetic */ SearchRecipientActivity getMax;

        @JvmDefault
        public final void dismissProgress() {
        }

        @JvmDefault
        public final void onError(@Nullable String str) {
        }

        public final void onFinishCheckReferralSendMoney(boolean z, @NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "howToUrl");
        }

        public final void onSuccessRemoveRecentTransaction(boolean z, @Nullable increaseCount increasecount) {
        }

        @JvmDefault
        public final void showProgress() {
        }

        setMin(SearchRecipientActivity searchRecipientActivity) {
            this.getMax = searchRecipientActivity;
        }

        public final void onGetFeatureBelowKitkatConfigSuccess(boolean z) {
            this.getMax.setBelowKitkatDialog(z);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lid/dana/di/modules/BillerX2BModule;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class length extends Lambda implements Function0<BillerX2BModule> {
        final /* synthetic */ SearchRecipientActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        length(SearchRecipientActivity searchRecipientActivity) {
            super(0);
            this.this$0 = searchRecipientActivity;
        }

        @NotNull
        public final BillerX2BModule invoke() {
            return new BillerX2BModule(new IWorkManagerImplCallback.Stub.Proxy.getMax(this) {
                final /* synthetic */ length getMin;

                @JvmDefault
                public final void dismissProgress() {
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

                {
                    this.getMin = r1;
                }

                public final void getMin(@NotNull getCurrX getcurrx) {
                    Intrinsics.checkNotNullParameter(getcurrx, "billerX2BModel");
                    if (this.getMin.this$0.isClickable()) {
                        new getDeployVersion(this.getMin.this$0, new getMax(this.getMin.this$0, getcurrx)).setMax();
                    }
                }

                public final void setMax(@NotNull PhotoSelectListener photoSelectListener) {
                    Intrinsics.checkNotNullParameter(photoSelectListener, "recipientModel");
                    if (this.getMin.this$0.isClickable() && (photoSelectListener instanceof RecipientModel)) {
                        RecipientModel recipientModel = (RecipientModel) photoSelectListener;
                        this.getMin.this$0.processRecipientListData(recipientModel);
                        this.getMin.this$0.openSummary(recipientModel);
                    }
                }

                public final void getMin(@NotNull String str) {
                    Intrinsics.checkNotNullParameter(str, "url");
                    DanaH5.startContainerFullUrl(str);
                }

                public final void getMin(@NotNull PhotoSelectListener photoSelectListener) {
                    Intrinsics.checkNotNullParameter(photoSelectListener, "recipientModel");
                    this.getMin.this$0.addDisposable(ConstraintTrackingWorker.getMax(this.getMin.this$0).subscribe(new getMin(this, photoSelectListener)));
                }

                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept", "(Ljava/lang/Long;)V"}, k = 3, mv = {1, 4, 2})
                /* renamed from: id.dana.sendmoney_v2.recipient.activity.SearchRecipientActivity$length$4$getMin */
                static final class getMin<T> implements RedDotManager<Long> {
                    final /* synthetic */ PhotoSelectListener getMax;
                    final /* synthetic */ AnonymousClass4 setMin;

                    getMin(AnonymousClass4 r1, PhotoSelectListener photoSelectListener) {
                        this.setMin = r1;
                        this.getMax = photoSelectListener;
                    }

                    public final /* synthetic */ void accept(Object obj) {
                        this.setMin.setMax(this.getMax);
                    }
                }
            });
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lid/dana/di/modules/SendMoneyModule;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class getMin extends Lambda implements Function0<SendMoneyModule> {
        final /* synthetic */ SearchRecipientActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        getMin(SearchRecipientActivity searchRecipientActivity) {
            super(0);
            this.this$0 = searchRecipientActivity;
        }

        @NotNull
        public final SendMoneyModule invoke() {
            return new SendMoneyModule(new DiagnosticsReceiver.length(this) {
                final /* synthetic */ getMin getMin;

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

                {
                    this.getMin = r1;
                }

                public final void onRecipientIsDanaUser(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5) {
                    SearchRecipientActivity.access$getRecipientModel$p(this.getMin.this$0).toDoubleRange = true;
                    RecipientModel access$getRecipientModel$p = SearchRecipientActivity.access$getRecipientModel$p(this.getMin.this$0);
                    if (str5 == null) {
                        str5 = "";
                    }
                    access$getRecipientModel$p.getMin = str5;
                    this.getMin.this$0.getMin = true;
                    this.getMin.this$0.openSummary(SearchRecipientActivity.access$getRecipientModel$p(this.getMin.this$0));
                }

                public final void onInitTransferSuccess() {
                    SearchRecipientActivity.access$getRecipientModel$p(this.getMin.this$0).toDoubleRange = false;
                    if (!this.getMin.this$0.getMin) {
                        SearchRecipientActivity.access$showUnregisteredUserDialog(this.getMin.this$0, SearchRecipientActivity.access$getRecipientModel$p(this.getMin.this$0));
                    }
                }

                public final void onInitError(@Nullable Throwable th) {
                    SearchRecipientActivity.access$getRecipientModel$p(this.getMin.this$0).toDoubleRange = false;
                    if (!this.getMin.this$0.getMin) {
                        SearchRecipientActivity.access$showUnregisteredUserDialog(this.getMin.this$0, SearchRecipientActivity.access$getRecipientModel$p(this.getMin.this$0));
                    }
                }

                public final void onError(@Nullable String str) {
                    this.getMin.this$0.openSummary(SearchRecipientActivity.access$getRecipientModel$p(this.getMin.this$0));
                }
            });
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "dialogInterface", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "which", "", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class getMax implements DialogInterface.OnClickListener {
        final /* synthetic */ SearchRecipientActivity getMax;
        final /* synthetic */ getCurrX setMin;

        getMax(SearchRecipientActivity searchRecipientActivity, getCurrX getcurrx) {
            this.getMax = searchRecipientActivity;
            this.setMin = getcurrx;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            if (-1 == i) {
                this.getMax.getBillerX2BPresenter().length(this.setMin);
                dialogInterface.dismiss();
            }
        }
    }

    public final void openSummary(@NotNull RecipientModel recipientModel) {
        Intrinsics.checkNotNullParameter(recipientModel, "recipientModel");
        if (CornerMarkingDataProvider.getMax() || !getBelowKitkatDialog()) {
            super.openSummary(recipientModel);
        } else {
            isBaselineAligned.positiveButton$default(isBaselineAligned.message$default(new isBaselineAligned(this, (drawHorizontalDivider) null, 2, (DefaultConstructorMarker) null), Integer.valueOf(R.string.dialog_warning_below_kitkat), (CharSequence) null, (Function1) null, 6, (Object) null), (Integer) null, (CharSequence) null, (Function1) null, 7, (Object) null).cancelable(false).show();
        }
    }

    public final void startAddBankAccountActivity(@NotNull String str, @NotNull String str2) {
        int length2;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length2 = dispatchOnCancelled.length(applicationContext, 0)) == 0)) {
            onCanceled oncanceled = new onCanceled(0, length2, 4);
            onCancelLoad.setMax(-753474206, oncanceled);
            onCancelLoad.getMin(-753474206, oncanceled);
        }
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled2 = new onCanceled(0, max, 16);
            onCancelLoad.setMax(-753474206, oncanceled2);
            onCancelLoad.getMin(-753474206, oncanceled2);
        }
        Intrinsics.checkNotNullParameter(str, "bankId");
        Intrinsics.checkNotNullParameter(str2, "bankNumber");
        Bundle bundle = new Bundle();
        bundle.putBoolean(BankSelectorActivity.EXTRA_BELOW_KITKAT, getBelowKitkatDialog());
        String stringExtra = getIntent().getStringExtra("transferScenario");
        if (stringExtra == null) {
            stringExtra = "";
        }
        bundle.putString(BankSelectorActivity.EXTRA_TRANSFER_SCENARIO, stringExtra);
        BankSelectorActivity.getMin getmin = BankSelectorActivity.Companion;
        startActivity(BankSelectorActivity.getMin.getMin(this, str, str2, false, false, true, bundle, 24));
    }

    /* access modifiers changed from: protected */
    public final void initRecipientView() {
        RecipientView recipientView = (RecipientView) _$_findCachedViewById(resetInternal.setMax.evictionCount);
        if (recipientView != null) {
            recipientView.setRecipientContactType(3);
            recipientView.setEnableViewSection(false);
            recipientView.setRecipientSelectedListener(this);
            recipientView.setOnContactSyncEnabled(new setMax(recipientView));
            SearchView searchView = (SearchView) recipientView._$_findCachedViewById(resetInternal.setMax.viewSearch);
            if (searchView != null) {
                searchView.focusEtSearchContact();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class setMax extends Lambda implements Function0<Unit> {
        final /* synthetic */ RecipientView $this_apply;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        setMax(RecipientView recipientView) {
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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class equals extends Lambda implements Function0<Unit> {
        final /* synthetic */ RecipientModel $recipientModel;
        final /* synthetic */ SearchRecipientActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        equals(SearchRecipientActivity searchRecipientActivity, RecipientModel recipientModel) {
            super(0);
            this.this$0 = searchRecipientActivity;
            this.$recipientModel = recipientModel;
        }

        public final void invoke() {
            this.this$0.openSummary(this.$recipientModel);
        }
    }

    /* access modifiers changed from: protected */
    public final void initInjector() {
        int length2;
        int min;
        putData.getMin getmin = new putData.getMin((byte) 0);
        PrepareException.AnonymousClass1 applicationComponent = getApplicationComponent();
        if (applicationComponent != null) {
            getmin.length = applicationComponent;
            getmin.setMax = new RecipientActivityModule(new setMin(this));
            SendMoneyModule sendMoneyModule = (SendMoneyModule) this.IsOverlapping.getValue();
            if (sendMoneyModule != null) {
                getmin.getMin = sendMoneyModule;
                int max = dispatchOnCancelled.getMax(0);
                if (max != 0) {
                    onCanceled oncanceled = new onCanceled(0, max, 16);
                    onCancelLoad.setMax(-1883000295, oncanceled);
                    onCancelLoad.getMin(-1883000295, oncanceled);
                }
                Context baseContext = getBaseContext();
                Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
                if (!(applicationContext == null || (length2 = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length2)))) {
                    onCanceled oncanceled2 = new onCanceled(length2, min, 32);
                    onCancelLoad.setMax(-1883000295, oncanceled2);
                    onCancelLoad.getMin(-1883000295, oncanceled2);
                }
                BillerX2BModule billerX2BModule = (BillerX2BModule) this.getMax.getValue();
                if (billerX2BModule != null) {
                    getmin.setMin = billerX2BModule;
                    stopIgnoring.setMin(getmin.setMax, RecipientActivityModule.class);
                    stopIgnoring.setMin(getmin.setMin, BillerX2BModule.class);
                    stopIgnoring.setMin(getmin.getMin, SendMoneyModule.class);
                    stopIgnoring.setMin(getmin.length, PrepareException.AnonymousClass1.class);
                    new putData(getmin.setMax, getmin.setMin, getmin.getMin, getmin.length, (byte) 0).length(this);
                    onDelete.getMin[] getminArr = new onDelete.getMin[2];
                    getminArr[0] = getRecipientPresenter();
                    IWorkManagerImplCallback.Stub.Proxy.getMin getmin2 = this.billerX2BPresenter;
                    if (getmin2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("billerX2BPresenter");
                    }
                    getminArr[1] = getmin2;
                    registerPresenter(getminArr);
                    return;
                }
                throw null;
            }
            throw null;
        }
        throw null;
    }

    public final void onRecipientSelected(@NotNull RecipientModel recipientModel) {
        Intrinsics.checkNotNullParameter(recipientModel, "recipientModel");
        if (Intrinsics.areEqual((Object) recipientModel.onNavigationEvent, (Object) "bank")) {
            IWorkManagerImplCallback.Stub.Proxy.getMin getmin = this.billerX2BPresenter;
            if (getmin == null) {
                Intrinsics.throwUninitializedPropertyAccessException("billerX2BPresenter");
            }
            getmin.length((PhotoSelectListener) recipientModel);
        } else if (!Intrinsics.areEqual((Object) recipientModel.onNavigationEvent, (Object) "contact") || recipientModel.isInside()) {
            recipientModel.hashCode = true;
            processRecipientListData(recipientModel);
            openSummary(recipientModel);
        } else {
            this.setMax = recipientModel;
            recipientModel.hashCode = true;
            this.getMin = false;
            DiagnosticsReceiver.getMin getmin2 = this.calculatorPresenter;
            if (getmin2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("calculatorPresenter");
            }
            getmin2.length("BALANCE", recipientModel);
        }
    }

    public static final /* synthetic */ void access$showUnregisteredUserDialog(SearchRecipientActivity searchRecipientActivity, RecipientModel recipientModel) {
        if (searchRecipientActivity.isActivityAvailable()) {
            FragmentManager supportFragmentManager = searchRecipientActivity.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "supportFragmentManager");
            if (!supportFragmentManager.setMin()) {
                onSelectCanceled onselectcanceled = new onSelectCanceled((Function0) null, new equals(searchRecipientActivity, recipientModel), 1);
                onselectcanceled.getMax = R.drawable.ic_illustration_unregistered_number;
                AppCompatImageView appCompatImageView = (AppCompatImageView) onselectcanceled.setMax(resetInternal.setMax.setSupportProgressBarVisibility);
                if (appCompatImageView != null) {
                    onSelectCanceled.setMin(appCompatImageView, onselectcanceled.getMax);
                }
                String string = searchRecipientActivity.getString(R.string.sendmoney_unregistered_user_dialog_title);
                Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.sendm…stered_user_dialog_title)");
                onselectcanceled.length(string);
                String string2 = searchRecipientActivity.getString(R.string.sendmoney_unregistered_user_dialog_description);
                Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.sendm…_user_dialog_description)");
                onselectcanceled.getMax(string2);
                String string3 = searchRecipientActivity.getString(R.string.sendmoney_unregistered_user_positive_button);
                Intrinsics.checkNotNullExpressionValue(string3, "getString(R.string.sendm…red_user_positive_button)");
                onselectcanceled.setMin(string3);
                String string4 = searchRecipientActivity.getString(R.string.sendmoney_unregistered_user_negative_button);
                Intrinsics.checkNotNullExpressionValue(string4, "getString(R.string.sendm…red_user_negative_button)");
                onselectcanceled.getMin(string4);
                FragmentManager supportFragmentManager2 = searchRecipientActivity.getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager2, "supportFragmentManager");
                onselectcanceled.getMin(supportFragmentManager2);
            }
        }
    }
}
