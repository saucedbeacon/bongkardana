package id.dana.sendmoney_v2.recipient.activity;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.ariver.kernel.ipc.IpcMessageConstants;
import id.dana.R;
import id.dana.bank.BankSelectorActivity;
import id.dana.danah5.DanaH5;
import id.dana.di.modules.BillerX2BModule;
import id.dana.di.modules.RecipientActivityModule;
import id.dana.sendmoney.model.QrRequestBankTransferModel;
import id.dana.sendmoney.model.QrTransferModel;
import id.dana.sendmoney.model.RecipientModel;
import id.dana.sendmoney.recipient.RecipientIdType;
import id.dana.sendmoney_v2.recipient.view.RecipientView;
import java.util.HashMap;
import java.util.List;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.JvmDefault;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o.ConstraintTrackingWorker;
import o.CornerMarkingDataProvider;
import o.IWorkManagerImplCallback;
import o.PhotoSelectListener;
import o.PrepareException;
import o.RedDotManager;
import o.dispatchOnCancelled;
import o.drawHorizontalDivider;
import o.enqueueWorkRequests;
import o.getConfigVariable;
import o.getCurrX;
import o.getDeployVersion;
import o.getExtraDataParsers;
import o.increaseCount;
import o.isBaselineAligned;
import o.onCancelLoad;
import o.onCanceled;
import o.onDelete;
import o.resetInternal;
import o.setProgressViewOffset;
import o.setUnit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 G2\u00020\u00012\u00020\u0002:\u0001GB\u0005¢\u0006\u0002\u0010\u0003J\b\u0010!\u001a\u00020\"H\u0014J\b\u0010#\u001a\u00020$H\u0002J\u0010\u0010%\u001a\u00020\"2\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\b\u0010&\u001a\u00020\"H\u0016J\b\u0010'\u001a\u00020\"H\u0014J\b\u0010(\u001a\u00020\"H\u0014J\"\u0010)\u001a\u00020\"2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020+2\b\u0010-\u001a\u0004\u0018\u00010.H\u0014J\u0018\u0010/\u001a\u00020\"2\u0006\u00100\u001a\u00020\u00132\u0006\u00101\u001a\u00020$H\u0016J\u0010\u00102\u001a\u00020\"2\u0006\u00100\u001a\u00020\u0013H\u0016J\u0010\u00103\u001a\u00020\"2\u0006\u00104\u001a\u00020\u001cH\u0016J\u0018\u00105\u001a\u00020\"2\u0006\u00106\u001a\u00020\u00132\u0006\u00107\u001a\u000208H\u0016J\u000e\u00109\u001a\u00020\"2\u0006\u00104\u001a\u00020\u001cJ\u0010\u0010:\u001a\u00020\"2\u0006\u00104\u001a\u00020\u001cH\u0016J\b\u0010;\u001a\u00020\"H\u0002J\u0010\u0010<\u001a\u00020\"2\u0006\u0010=\u001a\u00020>H\u0002J\u0006\u0010?\u001a\u00020\"J \u0010@\u001a\u00020\"2\u0006\u0010A\u001a\u00020$2\u0006\u0010B\u001a\u00020$2\b\b\u0002\u0010\u0012\u001a\u00020\u0013J\u0014\u0010C\u001a\n D*\u0004\u0018\u00010\u001c0\u001c*\u00020EH\u0002J\f\u0010F\u001a\u00020\"*\u00020\u001aH\u0014R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0014\u001a\u00020\u00158FX\u0002¢\u0006\f\n\u0004\b\u0018\u0010\t\u001a\u0004\b\u0016\u0010\u0017R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u0006H"}, d2 = {"Lid/dana/sendmoney_v2/recipient/activity/BankRecipientActivity;", "Lid/dana/sendmoney_v2/recipient/activity/BaseRecipientActivity;", "Lid/dana/contract/sendmoney/RecipientContract$View;", "()V", "billerX2BModule", "Lid/dana/di/modules/BillerX2BModule;", "getBillerX2BModule", "()Lid/dana/di/modules/BillerX2BModule;", "billerX2BModule$delegate", "Lkotlin/Lazy;", "billerX2BPresenter", "Lid/dana/contract/sendmoney/v2/BillerX2BContract$Presenter;", "getBillerX2BPresenter", "()Lid/dana/contract/sendmoney/v2/BillerX2BContract$Presenter;", "setBillerX2BPresenter", "(Lid/dana/contract/sendmoney/v2/BillerX2BContract$Presenter;)V", "customSnackBar", "Lid/dana/component/customsnackbarcomponent/CustomSnackbar;", "finishOnAddBankCanceled", "", "manageBankAccountBottomSheet", "Lid/dana/sendmoney_v2/recipient/activity/ManageRecentBankAccountBottomSheet;", "getManageBankAccountBottomSheet", "()Lid/dana/sendmoney_v2/recipient/activity/ManageRecentBankAccountBottomSheet;", "manageBankAccountBottomSheet$delegate", "qrTransferModel", "Lid/dana/sendmoney/model/QrTransferModel;", "recipientSelectedMoreAction", "Lid/dana/sendmoney/model/RecipientModel;", "getRecipientSelectedMoreAction", "()Lid/dana/sendmoney/model/RecipientModel;", "setRecipientSelectedMoreAction", "(Lid/dana/sendmoney/model/RecipientModel;)V", "configToolbar", "", "getBankRecipientName", "", "handleRequestMoneyToBank", "init", "initInjector", "initRecipientView", "onActivityResult", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "onFinishCheckReferralSendMoney", "enable", "howToUrl", "onGetFeatureBelowKitkatConfigSuccess", "onRecipientSelected", "recipientModel", "onSuccessRemoveRecentTransaction", "success", "recentRecipientModel", "Lid/dana/sendmoney/model/RecentRecipientModel;", "openManageBankBottomSheet", "openSummary", "showBelowKitkatDialogWarning", "showBillerX2BDialog", "billerX2BModel", "Lid/dana/sendmoney_v2/model/BillerX2BModel;", "showSnackbarRemoved", "startAddBankAccountActivity", "bankId", "bankNumber", "buildRecipientModel", "kotlin.jvm.PlatformType", "Lid/dana/sendmoney/model/QrRequestBankTransferModel;", "handleTransferData", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class BankRecipientActivity extends BaseRecipientActivity implements enqueueWorkRequests.setMax {
    @NotNull
    public static final length Companion = new length((byte) 0);
    @Inject
    public IWorkManagerImplCallback.Stub.Proxy.getMin billerX2BPresenter;
    private final Lazy equals = LazyKt.lazy(new getMax(this));
    /* access modifiers changed from: private */
    public QrTransferModel getMax;
    private boolean getMin;
    @NotNull
    private final Lazy isInside = LazyKt.lazy(getMin.INSTANCE);
    @Nullable
    private RecipientModel setMax;
    private HashMap toFloatRange;
    /* access modifiers changed from: private */
    public setProgressViewOffset toIntRange;

    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.toFloatRange;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public final View _$_findCachedViewById(int i) {
        int max;
        int max2;
        Context baseContext = getBaseContext();
        Context context = null;
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || i == (max2 = dispatchOnCancelled.setMax(applicationContext, i, 0)))) {
            onCanceled oncanceled = new onCanceled(i, max2, 2);
            onCancelLoad.setMax(1354026250, oncanceled);
            onCancelLoad.getMin(1354026250, oncanceled);
        }
        Context baseContext2 = getBaseContext();
        if (baseContext2 != null) {
            context = baseContext2.getApplicationContext();
        }
        if (!(context == null || 1354026250 == (max = dispatchOnCancelled.getMax(context, 1354026250)))) {
            onCanceled oncanceled2 = new onCanceled(1354026250, max, 512);
            onCancelLoad.setMax(1354026250, oncanceled2);
            onCancelLoad.getMin(1354026250, oncanceled2);
        }
        if (this.toFloatRange == null) {
            this.toFloatRange = new HashMap();
        }
        View view = (View) this.toFloatRange.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.toFloatRange.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @JvmDefault
    public final void dismissProgress() {
    }

    @NotNull
    public final ManageRecentBankAccountBottomSheet getManageBankAccountBottomSheet() {
        return (ManageRecentBankAccountBottomSheet) this.isInside.getValue();
    }

    @JvmDefault
    public final void onError(@Nullable String str) {
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(1238706964, oncanceled);
            onCancelLoad.getMin(1238706964, oncanceled);
        }
    }

    public final void onFinishCheckReferralSendMoney(boolean z, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "howToUrl");
    }

    public final void onSuccessRemoveRecentTransaction(boolean z, @NotNull increaseCount increasecount) {
        int length2;
        int min;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length2 = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length2)))) {
            onCanceled oncanceled = new onCanceled(length2, min, 32);
            onCancelLoad.setMax(364147416, oncanceled);
            onCancelLoad.getMin(364147416, oncanceled);
        }
        Intrinsics.checkNotNullParameter(increasecount, "recentRecipientModel");
    }

    @JvmDefault
    public final void showProgress() {
    }

    public static final /* synthetic */ setProgressViewOffset access$getCustomSnackBar$p(BankRecipientActivity bankRecipientActivity) {
        setProgressViewOffset setprogressviewoffset = bankRecipientActivity.toIntRange;
        if (setprogressviewoffset == null) {
            Intrinsics.throwUninitializedPropertyAccessException("customSnackBar");
        }
        return setprogressviewoffset;
    }

    @NotNull
    public final IWorkManagerImplCallback.Stub.Proxy.getMin getBillerX2BPresenter() {
        int length2;
        int min;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length2 = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length2)))) {
            onCanceled oncanceled = new onCanceled(length2, min, 32);
            onCancelLoad.setMax(1167720150, oncanceled);
            onCancelLoad.getMin(1167720150, oncanceled);
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

    @Nullable
    public final RecipientModel getRecipientSelectedMoreAction() {
        return this.setMax;
    }

    public final void setRecipientSelectedMoreAction(@Nullable RecipientModel recipientModel) {
        this.setMax = recipientModel;
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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lid/dana/di/modules/BillerX2BModule;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class getMax extends Lambda implements Function0<BillerX2BModule> {
        final /* synthetic */ BankRecipientActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        getMax(BankRecipientActivity bankRecipientActivity) {
            super(0);
            this.this$0 = bankRecipientActivity;
        }

        @NotNull
        public final BillerX2BModule invoke() {
            return new BillerX2BModule(new IWorkManagerImplCallback.Stub.Proxy.getMax(this) {
                final /* synthetic */ getMax getMin;

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
                        new getDeployVersion(this.getMin.this$0, new setMax(this.getMin.this$0, getcurrx)).setMax();
                    }
                }

                public final void setMax(@NotNull PhotoSelectListener photoSelectListener) {
                    Intrinsics.checkNotNullParameter(photoSelectListener, "recipientModel");
                    if (this.getMin.this$0.isClickable() && (photoSelectListener instanceof RecipientModel)) {
                        QrTransferModel access$getQrTransferModel$p = this.getMin.this$0.getMax;
                        if (access$getQrTransferModel$p != null) {
                            if (!access$getQrTransferModel$p.equals()) {
                                access$getQrTransferModel$p = null;
                            }
                            if (access$getQrTransferModel$p != null) {
                                ((RecipientModel) photoSelectListener).valueOf = access$getQrTransferModel$p.getMin();
                            }
                        }
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
                /* renamed from: id.dana.sendmoney_v2.recipient.activity.BankRecipientActivity$getMax$3$getMin */
                static final class getMin<T> implements RedDotManager<Long> {
                    final /* synthetic */ AnonymousClass3 getMin;
                    final /* synthetic */ PhotoSelectListener length;

                    getMin(AnonymousClass3 r1, PhotoSelectListener photoSelectListener) {
                        this.getMin = r1;
                        this.length = photoSelectListener;
                    }

                    public final /* synthetic */ void accept(Object obj) {
                        this.getMin.setMax(this.length);
                    }
                }
            });
        }
    }

    public final void configToolbar() {
        super.configToolbar();
        setCenterTitle(getString(R.string.sendmoney_summary_x2b_toolbar_title));
    }

    public final void init() {
        int length2;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length2 = dispatchOnCancelled.length(applicationContext, 0)) == 0)) {
            onCanceled oncanceled = new onCanceled(0, length2, 4);
            onCancelLoad.setMax(1720397021, oncanceled);
            onCancelLoad.getMin(1720397021, oncanceled);
        }
        super.init();
        Intent intent = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, IpcMessageConstants.EXTRA_INTENT);
        setData(intent.getExtras());
        getRecipientPresenter().getMax();
        RecipientView recipientView = (RecipientView) _$_findCachedViewById(resetInternal.setMax.evictionCount);
        if (recipientView != null) {
            recipientView.initRecipientView();
        }
    }

    /* access modifiers changed from: protected */
    public final void initRecipientView() {
        RecipientView recipientView = (RecipientView) _$_findCachedViewById(resetInternal.setMax.evictionCount);
        if (recipientView != null) {
            recipientView.setRecipientContactType(1);
            recipientView.setRecipientSelectedListener(this);
        }
    }

    /* access modifiers changed from: protected */
    public final void initInjector() {
        int length2;
        int min;
        getConfigVariable.length length3 = getConfigVariable.length();
        PrepareException.AnonymousClass1 applicationComponent = getApplicationComponent();
        if (applicationComponent != null) {
            length3.getMax = applicationComponent;
            length3.getMin = new RecipientActivityModule(this);
            Context baseContext = getBaseContext();
            Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
            if (!(applicationContext == null || (length2 = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length2)))) {
                onCanceled oncanceled = new onCanceled(length2, min, 32);
                onCancelLoad.setMax(2052405075, oncanceled);
                onCancelLoad.getMin(2052405075, oncanceled);
            }
            BillerX2BModule billerX2BModule = (BillerX2BModule) this.equals.getValue();
            if (billerX2BModule != null) {
                length3.setMin = billerX2BModule;
                length3.getMin().getMax(this);
                onDelete.getMin[] getminArr = new onDelete.getMin[2];
                getminArr[0] = getRecipientPresenter();
                IWorkManagerImplCallback.Stub.Proxy.getMin getmin = this.billerX2BPresenter;
                if (getmin == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("billerX2BPresenter");
                }
                getminArr[1] = getmin;
                registerPresenter(getminArr);
                return;
            }
            throw null;
        }
        throw null;
    }

    public final void onActivityResult(int i, int i2, @Nullable Intent intent) {
        int max;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || i == (max = dispatchOnCancelled.setMax(applicationContext, i, 0)))) {
            onCanceled oncanceled = new onCanceled(i, max, 2);
            onCancelLoad.setMax(384501171, oncanceled);
            onCancelLoad.getMin(384501171, oncanceled);
        }
        super.onActivityResult(i, i2, intent);
        if (i2 == -1) {
            if (i == 69) {
                ((RecipientView) _$_findCachedViewById(resetInternal.setMax.evictionCount)).getSortingSendMoneyPresenter().getMax();
                ((RecipientView) _$_findCachedViewById(resetInternal.setMax.evictionCount)).getSavedBankPresenter().length();
            }
        } else if (i2 == 0 && this.getMin) {
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public final void handleTransferData(@NotNull QrTransferModel qrTransferModel) {
        int max;
        Context baseContext = getBaseContext();
        QrRequestBankTransferModel qrRequestBankTransferModel = null;
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || 350898184 == (max = dispatchOnCancelled.getMax(applicationContext, 350898184)))) {
            onCanceled oncanceled = new onCanceled(350898184, max, 512);
            onCancelLoad.setMax(350898184, oncanceled);
            onCancelLoad.getMin(350898184, oncanceled);
        }
        Intrinsics.checkNotNullParameter(qrTransferModel, "$this$handleTransferData");
        this.getMax = qrTransferModel;
        if (qrTransferModel.FastBitmap$CoordinateSystem()) {
            if (qrTransferModel instanceof QrRequestBankTransferModel) {
                qrRequestBankTransferModel = qrTransferModel;
            }
            QrRequestBankTransferModel qrRequestBankTransferModel2 = qrRequestBankTransferModel;
            if (qrRequestBankTransferModel2 != null) {
                RecipientModel.length length2 = new RecipientModel.length("bank");
                length2.FastBitmap$CoordinateSystem = RecipientIdType.INSTITUTION;
                length2.isInside = qrRequestBankTransferModel2.getMax;
                length2.toIntRange = qrRequestBankTransferModel2.length;
                length2.toFloatRange = qrRequestBankTransferModel2.isInside;
                length2.invoke = qrRequestBankTransferModel2.toIntRange;
                length2.Grayscale$Algorithm = qrRequestBankTransferModel2.IsOverlapping;
                length2.values = qrRequestBankTransferModel2.equals;
                length2.toDoubleRange = qrRequestBankTransferModel2.toFloatRange;
                length2.equals = qrRequestBankTransferModel2.FastBitmap$CoordinateSystem;
                String str = qrRequestBankTransferModel2.setMin;
                String str2 = "";
                if (str == null) {
                    str = str2;
                }
                length2.IsOverlapping = str;
                length2.length = qrRequestBankTransferModel2.setMax;
                length2.getMax = qrRequestBankTransferModel2.equals();
                length2.hashCode = getTransferScenario((QrTransferModel) qrRequestBankTransferModel2);
                length2.toString = getTransactionType();
                RecipientModel length3 = length2.length();
                String length4 = qrTransferModel.length();
                if (length4 != null) {
                    str2 = length4;
                }
                openSummary(length3, str2);
            }
            RecipientView recipientView = (RecipientView) _$_findCachedViewById(resetInternal.setMax.evictionCount);
            if (recipientView != null) {
                recipientView.setFirstTime(false);
                return;
            }
            return;
        }
        RecipientView recipientView2 = (RecipientView) _$_findCachedViewById(resetInternal.setMax.evictionCount);
        if (recipientView2 != null) {
            String stringExtra = getIntent().getStringExtra("recipientType");
            Intrinsics.checkNotNull(stringExtra);
            Intrinsics.checkNotNullExpressionValue(stringExtra, "intent.getStringExtra(Variables.RECIPIENT_TYPE)!!");
            recipientView2.redirectDeeplink(stringExtra);
        }
    }

    public final void onRecipientSelected(@NotNull RecipientModel recipientModel) {
        int length2;
        int min;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length2 = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length2)))) {
            onCanceled oncanceled = new onCanceled(length2, min, 32);
            onCancelLoad.setMax(-1369169711, oncanceled);
            onCancelLoad.getMin(-1369169711, oncanceled);
        }
        Intrinsics.checkNotNullParameter(recipientModel, "recipientModel");
        IWorkManagerImplCallback.Stub.Proxy.getMin getmin = this.billerX2BPresenter;
        if (getmin == null) {
            Intrinsics.throwUninitializedPropertyAccessException("billerX2BPresenter");
        }
        getmin.length((PhotoSelectListener) recipientModel);
    }

    public final void openManageBankBottomSheet(@NotNull RecipientModel recipientModel) {
        Intrinsics.checkNotNullParameter(recipientModel, "recipientModel");
        this.setMax = recipientModel;
        getManageBankAccountBottomSheet().show(getSupportFragmentManager(), "MANAGE_SAVED_BANK");
    }

    public final void onGetFeatureBelowKitkatConfigSuccess(boolean z) {
        setBelowKitkatDialog(z);
    }

    public final void openSummary(@NotNull RecipientModel recipientModel) {
        Intrinsics.checkNotNullParameter(recipientModel, "recipientModel");
        if (CornerMarkingDataProvider.getMax() || !getBelowKitkatDialog()) {
            super.openSummary(recipientModel);
        } else {
            isBaselineAligned.positiveButton$default(isBaselineAligned.message$default(new isBaselineAligned(this, (drawHorizontalDivider) null, 2, (DefaultConstructorMarker) null), Integer.valueOf(R.string.dialog_warning_below_kitkat), (CharSequence) null, (Function1) null, 6, (Object) null), (Integer) null, (CharSequence) null, (Function1) null, 7, (Object) null).cancelable(false).show();
        }
    }

    public static /* synthetic */ void startAddBankAccountActivity$default(BankRecipientActivity bankRecipientActivity, String str, String str2, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        bankRecipientActivity.startAddBankAccountActivity(str, str2, z);
    }

    public final void startAddBankAccountActivity(@NotNull String str, @NotNull String str2, boolean z) {
        int length2;
        int min;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length2 = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length2)))) {
            onCanceled oncanceled = new onCanceled(length2, min, 32);
            onCancelLoad.setMax(1812651856, oncanceled);
            onCancelLoad.getMin(1812651856, oncanceled);
        }
        Intrinsics.checkNotNullParameter(str, "bankId");
        Intrinsics.checkNotNullParameter(str2, "bankNumber");
        this.getMin = z;
        Bundle bundle = new Bundle();
        bundle.putBoolean(BankSelectorActivity.EXTRA_BELOW_KITKAT, getBelowKitkatDialog());
        bundle.putString(BankSelectorActivity.EXTRA_TRANSFER_SCENARIO, getIntent().getStringExtra("transferScenario"));
        BankSelectorActivity.getMin getmin = BankSelectorActivity.Companion;
        startActivity(BankSelectorActivity.getMin.getMin(this, str, str2, false, false, true, bundle, 24));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "dialogInterface", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "which", "", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class setMax implements DialogInterface.OnClickListener {
        final /* synthetic */ BankRecipientActivity getMin;
        final /* synthetic */ getCurrX setMin;

        setMax(BankRecipientActivity bankRecipientActivity, getCurrX getcurrx) {
            this.getMin = bankRecipientActivity;
            this.setMin = getcurrx;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            if (-1 == i) {
                this.getMin.getBillerX2BPresenter().length(this.setMin);
                dialogInterface.dismiss();
            }
        }
    }

    public final void showSnackbarRemoved() {
        String str;
        int length2;
        int min;
        Context baseContext = getBaseContext();
        String str2 = null;
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length2 = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length2)))) {
            onCanceled oncanceled = new onCanceled(length2, min, 32);
            onCancelLoad.setMax(-69930763, oncanceled);
            onCancelLoad.getMin(-69930763, oncanceled);
        }
        View findViewById = findViewById(16908290);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(android.R.id.content)");
        setProgressViewOffset.setMax setmax = new setProgressViewOffset.setMax((ViewGroup) findViewById);
        StringBuilder sb = new StringBuilder();
        RecipientModel recipientModel = this.setMax;
        if (recipientModel == null || (str = recipientModel.setMin) == null) {
            RecipientModel recipientModel2 = this.setMax;
            if (recipientModel2 != null) {
                str2 = recipientModel2.length();
            }
            str = String.valueOf(str2);
        }
        sb.append(str);
        sb.append(" ");
        sb.append(getString(R.string.send_money_wording_snackbar_remove_saved_bank));
        setmax.getMax = sb.toString();
        setmax.setMax = getString(R.string.send_money_undo);
        setmax.toIntRange = 0;
        setmax.getMin = R.drawable.bg_rounded_border_green_50;
        setmax.length = new setMin(this);
        setProgressViewOffset max = setmax.getMax();
        this.toIntRange = max;
        if (max == null) {
            Intrinsics.throwUninitializedPropertyAccessException("customSnackBar");
        }
        max.show();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class setMin implements View.OnClickListener {
        final /* synthetic */ BankRecipientActivity getMax;

        setMin(BankRecipientActivity bankRecipientActivity) {
            this.getMax = bankRecipientActivity;
        }

        public final void onClick(View view) {
            setUnit.getMin getmin = this.getMax.getManageBankAccountBottomSheet().presenter;
            if (getmin == null) {
                Intrinsics.throwUninitializedPropertyAccessException("presenter");
            }
            RecipientModel recipientModel = this.getMax.getManageBankAccountBottomSheet().getMin;
            if (recipientModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("recipientModelBackUp");
            }
            RecipientModel recipientModel2 = this.getMax.getManageBankAccountBottomSheet().getMin;
            if (recipientModel2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("recipientModelBackUp");
            }
            getmin.getMin(recipientModel, recipientModel2.setMin, true);
            BankRecipientActivity.access$getCustomSnackBar$p(this.getMax).dismiss();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n¨\u0006\u000b"}, d2 = {"Lid/dana/sendmoney_v2/recipient/activity/BankRecipientActivity$Companion;", "", "()V", "createTransferIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "qrTransferModel", "Lid/dana/sendmoney/model/QrTransferModel;", "transactionType", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class length {
        private length() {
        }

        public /* synthetic */ length(byte b) {
            this();
        }
    }
}
