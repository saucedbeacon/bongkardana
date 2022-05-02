package id.dana.bank;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.activity.result.ActivityResult;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.ap.zoloz.hummer.biz.HummerConstants;
import com.bumptech.glide.Glide;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import id.dana.R;
import id.dana.base.BaseActivity;
import id.dana.component.buttoncomponent.DanaButtonPrimaryView;
import id.dana.contract.deeplink.path.FeatureParams;
import id.dana.danah5.DanaH5;
import id.dana.di.modules.BankSelectorModule;
import id.dana.di.modules.BillerX2BModule;
import id.dana.richview.LogoProgressView;
import id.dana.sendmoney.model.BankModel;
import id.dana.sendmoney.model.RecipientModel;
import id.dana.sendmoney.model.RecipientSource;
import id.dana.sendmoney.recipient.RecipientIdType;
import id.dana.sendmoney.summary.SummaryActivity;
import id.dana.tracker.TrackerKey;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmDefault;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import o.CornerMarkingDataProvider;
import o.ForeignKey;
import o.IPostMessageService;
import o.ITrustedWebActivityCallback;
import o.IWorkManagerImplCallback;
import o.IntRange;
import o.PhotoSelectListener;
import o.PrepareException;
import o.RedDotManager;
import o.TitleBarRightButtonView;
import o.associateBy;
import o.convertDipToPx;
import o.convertSpToPx;
import o.dispatchOnCancelled;
import o.drawHorizontalDivider;
import o.findUrlMappedAppId;
import o.genTextSelector;
import o.getCurrX;
import o.getDeployVersion;
import o.getExtraDataParsers;
import o.getInsetDodgeRect;
import o.getProxy;
import o.getSecureSignatureComp;
import o.hideProgress;
import o.insertAndReturnId;
import o.isBaselineAligned;
import o.isVivoY11;
import o.name;
import o.onCancelLoad;
import o.onCanceled;
import o.onDelete;
import o.onDetachedFromLayoutParams;
import o.onLoadChildren;
import o.removeNode;
import o.resetInternal;
import o.setMyBeaconListener;
import o.stopIgnoring;
import o.updateCornerMarking;
import o.x;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000¼\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00012\u00020\u0001:\u0004\u0001\u0001B\u0005¢\u0006\u0002\u0010\u0002J\n\u0010K\u001a\u0004\u0018\u00010DH\u0002J\u0012\u0010L\u001a\u0004\u0018\u00010D2\u0006\u0010M\u001a\u00020NH\u0002J\u0018\u0010O\u001a\u00020P2\u0006\u0010,\u001a\u00020\u00112\u0006\u0010M\u001a\u00020\nH\u0002J\b\u0010Q\u001a\u00020PH\u0014J\u001a\u0010R\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\n0S0\tH\u0002J\b\u0010T\u001a\u00020PH\u0002J\b\u0010U\u001a\u00020PH\u0002J\b\u0010V\u001a\u00020PH\u0002J\b\u0010W\u001a\u00020NH\u0002J\b\u0010X\u001a\u00020NH\u0002J\b\u0010Y\u001a\u00020NH\u0002J\b\u0010Z\u001a\u00020BH\u0016J\b\u0010[\u001a\u00020PH\u0002J\b\u0010\\\u001a\u00020\u0011H\u0002J\b\u0010]\u001a\u00020PH\u0002J\b\u0010^\u001a\u00020PH\u0016J\b\u0010_\u001a\u00020PH\u0002J\b\u0010`\u001a\u00020PH\u0002J\b\u0010a\u001a\u00020\u0011H\u0002J\u0018\u0010,\u001a\u00020\u00112\u0006\u0010b\u001a\u00020\u00112\u0006\u0010M\u001a\u00020\nH\u0002J\u0010\u0010c\u001a\u00020\u00112\u0006\u0010M\u001a\u00020\nH\u0002J\u0010\u0010d\u001a\u00020\u00112\u0006\u0010M\u001a\u00020\nH\u0002J\b\u0010e\u001a\u00020PH\u0002J\u0010\u0010f\u001a\u00020P2\u0006\u0010g\u001a\u00020+H\u0002J\u0010\u0010h\u001a\u00020P2\u0006\u0010i\u001a\u00020NH\u0002J\u0018\u0010j\u001a\u00020P2\u0006\u0010b\u001a\u00020\u00112\u0006\u0010M\u001a\u00020\nH\u0002J\b\u0010k\u001a\u00020PH\u0002J\b\u0010l\u001a\u00020PH\u0002J\u0010\u0010m\u001a\u00020P2\u0006\u0010n\u001a\u00020oH\u0002J\b\u0010p\u001a\u00020PH\u0002J\u0010\u0010q\u001a\u00020P2\u0006\u0010r\u001a\u00020NH\u0002J\u0018\u0010s\u001a\u00020P2\u0006\u0010t\u001a\u00020\u00112\u0006\u0010u\u001a\u00020NH\u0002J\b\u0010v\u001a\u00020PH\u0002J\b\u0010w\u001a\u00020PH\u0002J\b\u0010x\u001a\u00020PH\u0002J\b\u0010y\u001a\u00020PH\u0002J\b\u0010z\u001a\u00020PH\u0002J\b\u0010{\u001a\u00020PH\u0002J\b\u0010|\u001a\u00020PH\u0002J\b\u0010}\u001a\u00020PH\u0002J\b\u0010~\u001a\u00020PH\u0002J\b\u0010\u001a\u00020PH\u0002J\t\u0010\u0001\u001a\u00020PH\u0002J\t\u0010\u0001\u001a\u00020PH\u0002J\u0012\u0010\u0001\u001a\u00020P2\u0007\u0010\u0001\u001a\u00020\u0011H\u0002J\u001b\u0010\u0001\u001a\u00020P2\u0007\u0010\u0001\u001a\u00020\u00112\u0007\u0010\u0001\u001a\u00020NH\u0002J\u0012\u0010\u0001\u001a\u00020P2\u0007\u0010\u0001\u001a\u00020BH\u0002J\u0015\u0010\u0001\u001a\n \u000b*\u0004\u0018\u00010o0o*\u00020DH\u0002J\u001e\u0010\u0001\u001a\u00020P*\u00030\u00012\u0006\u0010t\u001a\u00020\u00112\u0006\u0010u\u001a\u00020NH\u0002J\u000e\u0010\u0001\u001a\u00020P*\u00030\u0001H\u0002R\u001e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@BX\u000e¢\u0006\b\n\u0000\"\u0004\b\u0006\u0010\u0007R?\u0010\b\u001a&\u0012\f\u0012\n \u000b*\u0004\u0018\u00010\n0\n \u000b*\u0012\u0012\f\u0012\n \u000b*\u0004\u0018\u00010\n0\n\u0018\u00010\t0\t8BX\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR?\u0010\u0010\u001a&\u0012\f\u0012\n \u000b*\u0004\u0018\u00010\u00110\u0011 \u000b*\u0012\u0012\f\u0012\n \u000b*\u0004\u0018\u00010\u00110\u0011\u0018\u00010\t0\t8BX\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u000f\u001a\u0004\b\u0012\u0010\rR\u001e\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u0014@BX\u000e¢\u0006\b\n\u0000\"\u0004\b\u0016\u0010\u0017R\u001b\u0010\u0018\u001a\u00020\u00198BX\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u000f\u001a\u0004\b\u001a\u0010\u001bR\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u001f\u001a\u00020 8BX\u0002¢\u0006\f\n\u0004\b#\u0010\u000f\u001a\u0004\b!\u0010\"R\u001e\u0010$\u001a\u00020%8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u000e\u0010*\u001a\u00020+X.¢\u0006\u0002\n\u0000R\u001e\u0010,\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u0011@BX\u000e¢\u0006\b\n\u0000\"\u0004\b-\u0010.R\u001c\u0010/\u001a\u0010\u0012\f\u0012\n \u000b*\u0004\u0018\u0001010100X\u0004¢\u0006\u0002\n\u0000R\u0016\u00102\u001a\n\u0012\u0004\u0012\u000204\u0018\u000103X\u000e¢\u0006\u0002\n\u0000R\u000e\u00105\u001a\u00020\u0011X\u000e¢\u0006\u0002\n\u0000R\u0014\u00106\u001a\u00020\u00118BX\u0004¢\u0006\u0006\u001a\u0004\b7\u00108R\u0010\u00109\u001a\u0004\u0018\u00010:X\u000e¢\u0006\u0002\n\u0000R\u001e\u0010;\u001a\u00020<8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\u000e\u0010A\u001a\u00020BX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010C\u001a\u00020\u0011X\u000e¢\u0006\u0002\n\u0000R\"\u0010E\u001a\u0004\u0018\u00010D2\b\u0010\u0003\u001a\u0004\u0018\u00010D@BX\u000e¢\u0006\b\n\u0000\"\u0004\bF\u0010GR\u000e\u0010H\u001a\u00020\u0011X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010I\u001a\u0004\u0018\u00010JX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0001"}, d2 = {"Lid/dana/bank/BankSelectorActivity;", "Lid/dana/base/BaseActivity;", "()V", "value", "Lid/dana/bank/BankSelectorActivity$BankCheckState;", "bankCheckState", "setBankCheckState", "(Lid/dana/bank/BankSelectorActivity$BankCheckState;)V", "bankNumberTextChangesObservable", "Lio/reactivex/Observable;", "", "kotlin.jvm.PlatformType", "getBankNumberTextChangesObservable", "()Lio/reactivex/Observable;", "bankNumberTextChangesObservable$delegate", "Lkotlin/Lazy;", "bankSelectedChangeObservable", "", "getBankSelectedChangeObservable", "bankSelectedChangeObservable$delegate", "Lid/dana/requestmoney/model/BankSelectorConfigModel;", "bankSelectorConfigModel", "setBankSelectorConfigModel", "(Lid/dana/requestmoney/model/BankSelectorConfigModel;)V", "bankSelectorModule", "Lid/dana/di/modules/BankSelectorModule;", "getBankSelectorModule", "()Lid/dana/di/modules/BankSelectorModule;", "bankSelectorModule$delegate", "billerX2BModel", "Lid/dana/sendmoney_v2/model/BillerX2BModel;", "billerX2BModule", "Lid/dana/di/modules/BillerX2BModule;", "getBillerX2BModule", "()Lid/dana/di/modules/BillerX2BModule;", "billerX2BModule$delegate", "billerX2BPresenter", "Lid/dana/contract/sendmoney/v2/BillerX2BContract$Presenter;", "getBillerX2BPresenter", "()Lid/dana/contract/sendmoney/v2/BillerX2BContract$Presenter;", "setBillerX2BPresenter", "(Lid/dana/contract/sendmoney/v2/BillerX2BContract$Presenter;)V", "checkedWithdrawNameCheckModel", "Lid/dana/sendmoney/model/WithdrawNameCheckModel;", "isValidBank", "setValidBank", "(Z)V", "launcher", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "listAllBillerX2B", "", "Lid/dana/domain/sendmoney/model/BillerX2B;", "loadDefaultBankFromRecent", "needToShowSenderDialog", "getNeedToShowSenderDialog", "()Z", "nickNameDialogFragment", "Lid/dana/bank/NickNameDialogFragment;", "presenter", "Lid/dana/bank/contract/BankSelectorContract$Presenter;", "getPresenter", "()Lid/dana/bank/contract/BankSelectorContract$Presenter;", "setPresenter", "(Lid/dana/bank/contract/BankSelectorContract$Presenter;)V", "retryCount", "", "savedBankQrCheck", "Lid/dana/sendmoney/model/BankModel;", "selectedBankModel", "setSelectedBankModel", "(Lid/dana/sendmoney/model/BankModel;)V", "showBankInfo", "skeletonScreen", "Lcom/ethanhua/skeleton/SkeletonScreen;", "buildCheckedBankModel", "buildSelectedBankModel", "bankNumber", "", "checkBillerX2BPrefix", "", "configToolbar", "createBankAndAccountNumberObservable", "Lkotlin/Pair;", "disableNeedSenderName", "doNameCheck", "getAllBillerX2B", "getBankAccountDesc", "getBtnActionText", "getInputtedBankNumber", "getLayout", "getNameCheckConfig", "hasPreFilledBank", "hideSkeleton", "init", "initPreFilledData", "injectComponent", "isSendMoney", "isBankSelected", "isValidBankLength", "isValidBankNumber", "observeBankAndAccountNumber", "onNameCheck", "withdrawNameCheckModel", "onNameCheckError", "errorMessage", "onSelectedBankAndBankNumberChanged", "openBankListActivity", "openBillerPage", "openSendMoneySummary", "recipientModel", "Lid/dana/sendmoney/model/RecipientModel;", "resetError", "setBankSelection", "bankName", "setButtonSubmitEnabled", "enabled", "text", "setup", "setupBtnSubmit", "setupDisplayName", "setupRetryBtn", "setupTvBankSelection", "showBankAccountInfo", "showBelowKitkatDialogWarning", "showBillerX2BDialog", "showCheckedBankInfo", "showSenderNameDialog", "submitSelectedBank", "toggleButtonSubmitLoading", "toggleEmptyState", "empty", "trackSendMoneyBankAccountNumberInput", "isSuccess", "failReason", "trackSubmitNameCheckCount", "count", "buildRecipientModel", "enable", "Lid/dana/component/buttoncomponent/DanaButtonPrimaryView;", "showSkeleton", "Landroid/view/View;", "BankCheckState", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class BankSelectorActivity extends BaseActivity {
    @NotNull
    public static final String BANK_NUMBER_REGEX = "^([0-9]){5,20}$";
    @NotNull
    public static final getMin Companion = new getMin((byte) 0);
    @NotNull
    public static final String EXTRA_BELOW_KITKAT = "EXTRA_BELOW_KITKAT";
    @NotNull
    public static final String EXTRA_SELECTED_BANK = "EXTRA_SELECTED_BANK";
    @NotNull
    public static final String EXTRA_SEND_MONEY_DATA = "EXTRA_SEND_MONEY_DATA";
    @NotNull
    public static final String EXTRA_TRANSFER_SCENARIO = "EXTRA_TRANSFER_SCENARIO";
    public static final long INTERVAL_MILLISECOND_NUMBER_CHECKER = 300;
    public static final int MINIMUM_DIGIT_PREFIX_CHECK = 4;
    /* access modifiers changed from: private */
    public BankCheckState FastBitmap$CoordinateSystem = BankCheckState.INITIAL;
    private final Lazy Grayscale$Algorithm = LazyKt.lazy(new getMax(this));
    private boolean IsOverlapping;
    private final ITrustedWebActivityCallback<Intent> Mean$Arithmetic;
    @Inject
    public IWorkManagerImplCallback.Stub.Proxy.getMin billerX2BPresenter;
    /* access modifiers changed from: private */
    public List<getExtraDataParsers> equals;
    /* access modifiers changed from: private */
    public int getMax;
    private getProxy getMin;
    /* access modifiers changed from: private */
    public x hashCode = new x();
    private final Lazy invoke = LazyKt.lazy(new setMin(this));
    private final Lazy invokeSuspend = LazyKt.lazy(new length(this));
    /* access modifiers changed from: private */
    public getCurrX isInside;
    private HashMap onNavigationEvent;
    @Inject
    public ForeignKey.getMin presenter;
    private insertAndReturnId setMax;
    private boolean toDoubleRange;
    private boolean toFloatRange;
    private onDetachedFromLayoutParams toIntRange;
    /* access modifiers changed from: private */
    public BankModel toString;
    private final Lazy valueOf = LazyKt.lazy(new setMax(this));
    private boolean values;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lid/dana/bank/BankSelectorActivity$BankCheckState;", "", "(Ljava/lang/String;I)V", "INITIAL", "VALID", "CHECKING", "ERROR", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public enum BankCheckState {
        INITIAL,
        VALID,
        CHECKING,
        ERROR
    }

    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.onNavigationEvent;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public final View _$_findCachedViewById(int i) {
        if (this.onNavigationEvent == null) {
            this.onNavigationEvent = new HashMap();
        }
        View view = (View) this.onNavigationEvent.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.onNavigationEvent.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final int getLayout() {
        int max;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (applicationContext == null || -1566077425 == (max = dispatchOnCancelled.getMax(applicationContext, -1566077425))) {
            return R.layout.activity_add_bank;
        }
        onCanceled oncanceled = new onCanceled(-1566077425, max, 512);
        onCancelLoad.setMax(-1566077425, oncanceled);
        onCancelLoad.getMin(-1566077425, oncanceled);
        return R.layout.activity_add_bank;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroidx/activity/result/ActivityResult;", "kotlin.jvm.PlatformType", "onActivityResult"}, k = 3, mv = {1, 4, 2})
    static final class IsOverlapping<O> implements IPostMessageService.Default<ActivityResult> {
        final /* synthetic */ BankSelectorActivity setMax;

        IsOverlapping(BankSelectorActivity bankSelectorActivity) {
            this.setMax = bankSelectorActivity;
        }

        public final /* synthetic */ void onActivityResult(Object obj) {
            Intent intent;
            BankModel bankModel;
            ActivityResult activityResult = (ActivityResult) obj;
            Intrinsics.checkNotNullExpressionValue(activityResult, "it");
            if (activityResult.getMax == -1 && (intent = activityResult.length) != null && (bankModel = (BankModel) intent.getParcelableExtra("data")) != null) {
                this.setMax.setMax(bankModel);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012&\u0010\u0002\u001a\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005 \u0006*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "it", "Lkotlin/Pair;", "", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 4, 2})
    static final class equals<T> implements RedDotManager<Pair<? extends Boolean, ? extends CharSequence>> {
        final /* synthetic */ BankSelectorActivity getMin;

        equals(BankSelectorActivity bankSelectorActivity) {
            this.getMin = bankSelectorActivity;
        }

        public final /* synthetic */ void accept(Object obj) {
            Pair pair = (Pair) obj;
            this.getMin.getMax(((Boolean) pair.getFirst()).booleanValue(), (CharSequence) pair.getSecond());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\r\n\u0002\b\u0004\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "Lkotlin/Pair;", "", "", "isBankSelected", "bankNumber", "apply", "(Ljava/lang/Boolean;Ljava/lang/CharSequence;)Lkotlin/Pair;"}, k = 3, mv = {1, 4, 2})
    static final class isInside<T1, T2, R> implements removeNode<Boolean, CharSequence, Pair<? extends Boolean, ? extends CharSequence>> {
        public static final isInside getMin = new isInside();

        isInside() {
        }

        public final /* synthetic */ Object setMax(Object obj, Object obj2) {
            Boolean bool = (Boolean) obj;
            CharSequence charSequence = (CharSequence) obj2;
            Intrinsics.checkNotNullParameter(bool, "isBankSelected");
            Intrinsics.checkNotNullParameter(charSequence, "bankNumber");
            return new Pair(bool, charSequence);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class toDoubleRange extends Lambda implements Function1<String, Unit> {
        final /* synthetic */ BankSelectorActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        toDoubleRange(BankSelectorActivity bankSelectorActivity) {
            super(1);
            this.this$0 = bankSelectorActivity;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "it");
            x access$getBankSelectorConfigModel$p = this.this$0.hashCode;
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            access$getBankSelectorConfigModel$p.setMax = str;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke", "id/dana/bank/BankSelectorActivity$setupBtnSubmit$1$1"}, k = 3, mv = {1, 4, 2})
    static final class toIntRange extends Lambda implements Function1<View, Unit> {
        final /* synthetic */ BankSelectorActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        toIntRange(BankSelectorActivity bankSelectorActivity) {
            super(1);
            this.this$0 = bankSelectorActivity;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((View) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "it");
            if (this.this$0.isInside != null) {
                new getDeployVersion(this.this$0, new values(this.this$0)).setMax();
            } else if (this.this$0.getMax()) {
                this.this$0.toFloatRange();
            } else if (this.this$0.FastBitmap$CoordinateSystem != BankCheckState.VALID || this.this$0.getMin()) {
                BankSelectorActivity.access$doNameCheck(this.this$0);
            } else {
                this.this$0.setMin();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class toString extends Lambda implements Function1<View, Unit> {
        final /* synthetic */ BankSelectorActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        toString(BankSelectorActivity bankSelectorActivity) {
            super(1);
            this.this$0 = bankSelectorActivity;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((View) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "it");
            BankSelectorActivity.access$getNameCheckConfig(this.this$0);
        }
    }

    public BankSelectorActivity() {
        ITrustedWebActivityCallback<Intent> registerForActivityResult = registerForActivityResult(new ITrustedWebActivityCallback.Stub.Proxy.getMin(), new IsOverlapping(this));
        Intrinsics.checkNotNullExpressionValue(registerForActivityResult, "registerForActivityResul…        }\n        }\n    }");
        this.Mean$Arithmetic = registerForActivityResult;
    }

    public static final /* synthetic */ void access$setBankSelectorConfigModel$p(BankSelectorActivity bankSelectorActivity, x xVar) {
        int length2;
        int min;
        Context baseContext = bankSelectorActivity.getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length2 = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length2)))) {
            onCanceled oncanceled = new onCanceled(length2, min, 32);
            onCancelLoad.setMax(-1296369194, oncanceled);
            onCancelLoad.getMin(-1296369194, oncanceled);
        }
        bankSelectorActivity.hashCode = xVar;
        bankSelectorActivity.getMin(false);
    }

    public static final /* synthetic */ void access$trackSubmitNameCheckCount(BankSelectorActivity bankSelectorActivity, int i) {
        int min;
        int max;
        Context baseContext = bankSelectorActivity.getBaseContext();
        Context context = null;
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || i == (max = dispatchOnCancelled.getMax(applicationContext, i)))) {
            onCanceled oncanceled = new onCanceled(i, max, 512);
            onCancelLoad.setMax(1111377990, oncanceled);
            onCancelLoad.getMin(1111377990, oncanceled);
        }
        Context baseContext2 = bankSelectorActivity.getBaseContext();
        if (baseContext2 != null) {
            context = baseContext2.getApplicationContext();
        }
        if (!(context == null || i == (min = dispatchOnCancelled.setMin(context, i)))) {
            onCanceled oncanceled2 = new onCanceled(i, min, 8);
            onCancelLoad.setMax(1111377990, oncanceled2);
            onCancelLoad.getMin(1111377990, oncanceled2);
        }
        int max2 = dispatchOnCancelled.getMax(0);
        if (max2 != 0) {
            onCanceled oncanceled3 = new onCanceled(0, max2, 16);
            onCancelLoad.setMax(1111377990, oncanceled3);
            onCancelLoad.getMin(1111377990, oncanceled3);
        }
        convertDipToPx.length length2 = new convertDipToPx.length(bankSelectorActivity);
        length2.getMax = TrackerKey.Event.REQUEST_MONEY_QR_BANK_ACCOUNT_NUMBER_INPUT;
        convertDipToPx.length max3 = length2.setMax("Source", TrackerKey.SourceType.QR_CARD).getMax(TrackerKey.Property.NUMBER_OF_ATTEMPTS, i);
        max3.setMin();
        convertDipToPx convertdiptopx = new convertDipToPx(max3, (byte) 0);
        List length3 = convertdiptopx.length != null ? convertdiptopx.length.length : new ArrayList();
        genTextSelector.setMax((convertSpToPx[]) length3.toArray(new convertSpToPx[length3.size()]));
    }

    @NotNull
    public final ForeignKey.getMin getPresenter() {
        ForeignKey.getMin getmin = this.presenter;
        if (getmin == null) {
            Intrinsics.throwUninitializedPropertyAccessException("presenter");
        }
        return getmin;
    }

    public final void setPresenter(@NotNull ForeignKey.getMin getmin) {
        int length2;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length2 = dispatchOnCancelled.length(applicationContext, 0)) == 0)) {
            onCanceled oncanceled = new onCanceled(0, length2, 4);
            onCancelLoad.setMax(-1347554655, oncanceled);
            onCancelLoad.getMin(-1347554655, oncanceled);
        }
        Intrinsics.checkNotNullParameter(getmin, "<set-?>");
        this.presenter = getmin;
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
        Intrinsics.checkNotNullParameter(getmin, "<set-?>");
        this.billerX2BPresenter = getmin;
    }

    /* access modifiers changed from: private */
    public final boolean getMax() {
        return this.hashCode.getMax() && !setMin(this.hashCode.setMax);
    }

    /* access modifiers changed from: private */
    public final void setMax(BankModel bankModel) {
        String str;
        this.toString = bankModel;
        if (bankModel != null) {
            str = bankModel.toIntRange;
        } else {
            str = null;
        }
        if (str == null) {
            str = "";
        }
        AppCompatTextView appCompatTextView = (AppCompatTextView) _$_findCachedViewById(resetInternal.setMax.drawDividersHorizontal);
        if (appCompatTextView != null) {
            appCompatTextView.setText(str);
        }
        TextInputEditText textInputEditText = (TextInputEditText) _$_findCachedViewById(resetInternal.setMax.attributeId);
        if (textInputEditText != null) {
            textInputEditText.post(new toFloatRange(this));
        }
        toFloatRange();
        TextInputLayout textInputLayout = (TextInputLayout) _$_findCachedViewById(resetInternal.setMax.setAllowStacking);
        if (textInputLayout != null) {
            textInputLayout.setError((CharSequence) null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 4, 2})
    static final class toFloatRange implements Runnable {
        final /* synthetic */ BankSelectorActivity getMin;

        toFloatRange(BankSelectorActivity bankSelectorActivity) {
            this.getMin = bankSelectorActivity;
        }

        public final void run() {
            TextInputEditText textInputEditText = (TextInputEditText) this.getMin._$_findCachedViewById(resetInternal.setMax.attributeId);
            if (textInputEditText != null) {
                EditText editText = textInputEditText;
                Intrinsics.checkNotNullParameter(editText, "$this$focus");
                editText.requestFocus();
                editText.setSelection(editText.getText().length());
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lio/reactivex/Observable;", "", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class setMax extends Lambda implements Function0<TitleBarRightButtonView.AnonymousClass1<CharSequence>> {
        final /* synthetic */ BankSelectorActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        setMax(BankSelectorActivity bankSelectorActivity) {
            super(0);
            this.this$0 = bankSelectorActivity;
        }

        public final TitleBarRightButtonView.AnonymousClass1<CharSequence> invoke() {
            return onLoadChildren.textChanges((TextInputEditText) this.this$0._$_findCachedViewById(resetInternal.setMax.attributeId)).skipInitialValue().debounce(300, TimeUnit.MILLISECONDS).subscribeOn(getSecureSignatureComp.setMin()).observeOn(hideProgress.length());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lio/reactivex/Observable;", "", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class getMax extends Lambda implements Function0<TitleBarRightButtonView.AnonymousClass1<Boolean>> {
        final /* synthetic */ BankSelectorActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        getMax(BankSelectorActivity bankSelectorActivity) {
            super(0);
            this.this$0 = bankSelectorActivity;
        }

        public final TitleBarRightButtonView.AnonymousClass1<Boolean> invoke() {
            return onLoadChildren.textChanges((AppCompatTextView) this.this$0._$_findCachedViewById(resetInternal.setMax.drawDividersHorizontal)).map(AnonymousClass4.setMax);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lid/dana/di/modules/BankSelectorModule;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class length extends Lambda implements Function0<BankSelectorModule> {
        final /* synthetic */ BankSelectorActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        length(BankSelectorActivity bankSelectorActivity) {
            super(0);
            this.this$0 = bankSelectorActivity;
        }

        @NotNull
        public final BankSelectorModule invoke() {
            return new BankSelectorModule(new ForeignKey.getMax(this) {
                final /* synthetic */ length getMin;

                {
                    this.getMin = r1;
                }

                public final void length(@NotNull x xVar) {
                    Intrinsics.checkNotNullParameter(xVar, "bankSelectorConfigModel");
                    BankSelectorActivity.access$setBankSelectorConfigModel$p(this.getMin.this$0, xVar);
                    if (this.getMin.this$0.length()) {
                        BankSelectorActivity.access$initPreFilledData(this.getMin.this$0);
                    } else {
                        this.getMin.this$0.setMax(xVar.equals);
                    }
                }

                public final void setMax(@NotNull String str) {
                    Intrinsics.checkNotNullParameter(str, "message");
                    this.getMin.this$0.getMin(true);
                }

                public final void showProgress() {
                    this.getMin.this$0.getMin(false);
                    ConstraintLayout constraintLayout = (ConstraintLayout) this.getMin.this$0._$_findCachedViewById(resetInternal.setMax.addQueueItem);
                    if (constraintLayout != null) {
                        BankSelectorActivity.access$showSkeleton(this.getMin.this$0, constraintLayout);
                    }
                }

                public final void dismissProgress() {
                    BankSelectorActivity.access$hideSkeleton(this.getMin.this$0);
                }

                public final void setMax(@NotNull getProxy getproxy) {
                    Intrinsics.checkNotNullParameter(getproxy, "withdrawNameCheckModel");
                    BankSelectorActivity.access$onNameCheck(this.getMin.this$0, getproxy);
                }

                public final void setMax() {
                    BankSelectorActivity bankSelectorActivity = this.getMin.this$0;
                    String string = this.getMin.this$0.getString(R.string.request_money_add_bank_name_check_limit_error);
                    Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.reque…k_name_check_limit_error)");
                    BankSelectorActivity.access$onNameCheckError(bankSelectorActivity, string);
                }

                public final void getMin(@NotNull getProxy getproxy) {
                    Intrinsics.checkNotNullParameter(getproxy, "withdrawNameCheckModel");
                    BankSelectorActivity bankSelectorActivity = this.getMin.this$0;
                    String string = this.getMin.this$0.getString(R.string.request_money_add_bank_exist_error);
                    Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.reque…ney_add_bank_exist_error)");
                    BankSelectorActivity.access$onNameCheckError(bankSelectorActivity, string);
                }

                public final void onError(@Nullable String str) {
                    BankSelectorActivity bankSelectorActivity = this.getMin.this$0;
                    if (str == null) {
                        str = "";
                    }
                    BankSelectorActivity.access$onNameCheckError(bankSelectorActivity, str);
                }

                public final void setMax(int i) {
                    this.getMin.this$0.getMax = i;
                    BankSelectorActivity.access$trackSubmitNameCheckCount(this.getMin.this$0, i);
                }
            });
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lid/dana/di/modules/BillerX2BModule;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class setMin extends Lambda implements Function0<BillerX2BModule> {
        final /* synthetic */ BankSelectorActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        setMin(BankSelectorActivity bankSelectorActivity) {
            super(0);
            this.this$0 = bankSelectorActivity;
        }

        @NotNull
        public final BillerX2BModule invoke() {
            return new BillerX2BModule(new IWorkManagerImplCallback.Stub.Proxy.getMax(this) {
                final /* synthetic */ setMin setMax;

                @JvmDefault
                public final void dismissProgress() {
                }

                public final void getMin(@NotNull PhotoSelectListener photoSelectListener) {
                    Intrinsics.checkNotNullParameter(photoSelectListener, "recipientModel");
                }

                public final void getMin(@NotNull getCurrX getcurrx) {
                    Intrinsics.checkNotNullParameter(getcurrx, "billerX2BModel");
                }

                @JvmDefault
                public final void onError(@Nullable String str) {
                }

                public final void setMax(@NotNull PhotoSelectListener photoSelectListener) {
                    Intrinsics.checkNotNullParameter(photoSelectListener, "recipientModel");
                }

                @JvmDefault
                public final void showProgress() {
                }

                {
                    this.setMax = r1;
                }

                public final void getMin(@NotNull String str) {
                    int length = str != null ? str.length() : 0;
                    int max = dispatchOnCancelled.setMax(length);
                    if (length != max) {
                        onCanceled oncanceled = new onCanceled(length, max, 1);
                        onCancelLoad.setMax(1119993267, oncanceled);
                        onCancelLoad.getMin(1119993267, oncanceled);
                    }
                    Intrinsics.checkNotNullParameter(str, "url");
                    if (!StringsKt.isBlank(str)) {
                        DanaH5.startContainerFullUrl(str);
                        this.setMax.this$0.finish();
                    }
                }

                public final void setMin(@NotNull String str) {
                    Intrinsics.checkNotNullParameter(str, "message");
                    this.setMax.this$0.setMin();
                }

                public final void setMax(@NotNull List<getExtraDataParsers> list) {
                    Intrinsics.checkNotNullParameter(list, "allBillerX2B");
                    this.setMax.this$0.equals = list;
                }
            });
        }
    }

    public final void configToolbar() {
        setCenterTitle(getString(R.string.request_money_add_bank_account_title));
        setMenuLeftButton((int) R.drawable.arrow_left_white_new);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x003a A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean length() {
        /*
            r4 = this;
            android.content.Intent r0 = r4.getIntent()
            r1 = 0
            if (r0 == 0) goto L_0x003b
            java.lang.String r2 = "bank_id"
            java.lang.String r2 = r0.getStringExtra(r2)
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r3 = 1
            if (r2 == 0) goto L_0x001b
            boolean r2 = kotlin.text.StringsKt.isBlank(r2)
            if (r2 == 0) goto L_0x0019
            goto L_0x001b
        L_0x0019:
            r2 = 0
            goto L_0x001c
        L_0x001b:
            r2 = 1
        L_0x001c:
            if (r2 == 0) goto L_0x0037
            java.lang.String r2 = "bank_number"
            java.lang.String r0 = r0.getStringExtra(r2)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            if (r0 == 0) goto L_0x0031
            boolean r0 = kotlin.text.StringsKt.isBlank(r0)
            if (r0 == 0) goto L_0x002f
            goto L_0x0031
        L_0x002f:
            r0 = 0
            goto L_0x0032
        L_0x0031:
            r0 = 1
        L_0x0032:
            if (r0 != 0) goto L_0x0035
            goto L_0x0037
        L_0x0035:
            r0 = 0
            goto L_0x0038
        L_0x0037:
            r0 = 1
        L_0x0038:
            if (r0 != r3) goto L_0x003b
            return r3
        L_0x003b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: id.dana.bank.BankSelectorActivity.length():boolean");
    }

    /* access modifiers changed from: private */
    public final void getMax(boolean z, CharSequence charSequence) {
        String str;
        boolean min = getMin(z, charSequence);
        this.isInside = null;
        if (min) {
            List arrayList = new ArrayList();
            List<getExtraDataParsers> list = this.equals;
            if (list != null) {
                Collection arrayList2 = new ArrayList();
                for (Object next : list) {
                    CharSequence instId = ((getExtraDataParsers) next).getInstId();
                    BankModel bankModel = this.toString;
                    if (bankModel != null) {
                        str = bankModel.getMin;
                    } else {
                        str = null;
                    }
                    if (StringsKt.contains$default(instId, (CharSequence) String.valueOf(str), false, 2, (Object) null)) {
                        arrayList2.add(next);
                    }
                }
                Iterable<getExtraDataParsers> iterable = (List) arrayList2;
                Collection arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
                for (getExtraDataParsers add : iterable) {
                    arrayList3.add(Boolean.valueOf(arrayList.add(add)));
                }
            }
            Collection arrayList4 = new ArrayList();
            for (Object next2 : arrayList) {
                if (StringsKt.startsWith$default(charSequence, (CharSequence) ((getExtraDataParsers) next2).getPrefix(), false, 2, (Object) null)) {
                    arrayList4.add(next2);
                }
            }
            Iterable<getExtraDataParsers> iterable2 = (List) arrayList4;
            Collection arrayList5 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable2, 10));
            for (getExtraDataParsers max : iterable2) {
                this.isInside = isVivoY11.setMax(max, charSequence.toString());
                arrayList5.add(Unit.INSTANCE);
            }
        }
        int max2 = dispatchOnCancelled.getMax(0);
        if (max2 != 0) {
            onCanceled oncanceled = new onCanceled(0, max2, 16);
            onCancelLoad.setMax(1519335682, oncanceled);
            onCancelLoad.getMin(1519335682, oncanceled);
        }
        this.values = min;
        setMax();
        TextInputLayout textInputLayout = (TextInputLayout) _$_findCachedViewById(resetInternal.setMax.setAllowStacking);
        if (textInputLayout != null) {
            textInputLayout.setError((CharSequence) null);
        }
    }

    private final void setMax() {
        String str;
        boolean z = true;
        int i = 0;
        boolean z2 = this.values && this.FastBitmap$CoordinateSystem != BankCheckState.CHECKING;
        if (this.FastBitmap$CoordinateSystem == BankCheckState.CHECKING) {
            str = "";
        } else {
            if (this.isInside == null) {
                str = getString(R.string.sendmoney_save_continue);
            } else {
                str = getString(R.string.send_money_to_biller_button);
            }
            Intrinsics.checkNotNullExpressionValue(str, "if (billerX2BModel == nu…d_money_to_biller_button)");
        }
        getMax(z2, str);
        LogoProgressView logoProgressView = (LogoProgressView) _$_findCachedViewById(resetInternal.setMax.setOptionalIconsVisible);
        if (logoProgressView != null) {
            if (this.FastBitmap$CoordinateSystem != BankCheckState.CHECKING) {
                z = false;
            }
            View view = logoProgressView;
            if (!z) {
                i = 8;
            }
            view.setVisibility(i);
            if (z) {
                logoProgressView.startRefresh();
            } else {
                logoProgressView.stopRefresh();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "dialogInterface", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "which", "", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class values implements DialogInterface.OnClickListener {
        final /* synthetic */ BankSelectorActivity getMax;

        values(BankSelectorActivity bankSelectorActivity) {
            this.getMax = bankSelectorActivity;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            if (-1 == i) {
                BankSelectorActivity.access$openBillerPage(this.getMax);
                dialogInterface.dismiss();
            }
        }
    }

    /* access modifiers changed from: private */
    public final void setMin() {
        BankModel bankModel;
        String str = "";
        setMax(true, str);
        BankModel bankModel2 = this.toString;
        if (bankModel2 != null) {
            BankModel.setMin setmin = new BankModel.setMin();
            String str2 = bankModel2.getMin;
            BankModel.setMin setmin2 = setmin;
            if (str2 == null) {
                str2 = str;
            }
            setmin2.setMax = str2;
            String str3 = bankModel2.toFloatRange;
            BankModel.setMin setmin3 = setmin2;
            if (str3 == null) {
                str3 = str;
            }
            setmin3.toFloatRange = str3;
            String str4 = bankModel2.IsOverlapping;
            BankModel.setMin setmin4 = setmin3;
            if (str4 == null) {
                str4 = str;
            }
            setmin4.toIntRange = str4;
            String str5 = bankModel2.setMin;
            BankModel.setMin setmin5 = setmin4;
            if (str5 == null) {
                str5 = str;
            }
            setmin5.getMin = str5;
            String isInside2 = isInside();
            BankModel.setMin setmin6 = setmin5;
            if (isInside2 == null) {
                isInside2 = str;
            }
            setmin6.getMax = isInside2;
            getProxy getproxy = this.getMin;
            if (getproxy == null) {
                Intrinsics.throwUninitializedPropertyAccessException("checkedWithdrawNameCheckModel");
            }
            String str6 = getproxy.setMin;
            if (str6 == null) {
                str6 = str;
            }
            BankModel.setMin setmin7 = setmin6;
            if (str6 == null) {
                str6 = str;
            }
            setmin7.IsOverlapping = str6;
            getProxy getproxy2 = this.getMin;
            if (getproxy2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("checkedWithdrawNameCheckModel");
            }
            String str7 = getproxy2.getMin;
            if (str7 == null) {
                str7 = str;
            }
            BankModel.setMin setmin8 = setmin7;
            if (str7 == null) {
                str7 = str;
            }
            setmin8.length = str7;
            getProxy getproxy3 = this.getMin;
            if (getproxy3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("checkedWithdrawNameCheckModel");
            }
            String str8 = getproxy3.getMax;
            if (str8 == null) {
                str8 = str;
            }
            BankModel.setMin setmin9 = setmin8;
            if (str8 != null) {
                str = str8;
            }
            setmin9.isInside = str;
            BankModel.setMin setmin10 = setmin9;
            setmin10.hashCode = true;
            bankModel = setmin10.length();
        } else {
            bankModel = null;
        }
        if (bankModel == null) {
            return;
        }
        if (!getMin()) {
            Intent intent = new Intent();
            intent.putExtra(EXTRA_SELECTED_BANK, bankModel);
            setResult(-1, intent);
            finish();
            return;
        }
        RecipientModel.length length2 = new RecipientModel.length("bank");
        length2.toFloatRange = bankModel.getMin;
        length2.FastBitmap$CoordinateSystem = RecipientIdType.INSTITUTION;
        length2.isInside = bankModel.equals;
        length2.Mean$Arithmetic = bankModel.isInside;
        length2.toIntRange = bankModel.getMax;
        length2.IsOverlapping = bankModel.getMax();
        length2.equals = bankModel.setMin;
        length2.ICustomTabsCallback = bankModel.isInside;
        length2.values = bankModel.toFloatRange;
        length2.toDoubleRange = bankModel.IsOverlapping;
        length2.getMin = bankModel.isInside;
        length2.setMax = RecipientSource.MANUAL_INPUT;
        length2.onNavigationEvent = bankModel.getMin();
        RecipientModel length3 = length2.length();
        BankCheckState bankCheckState = BankCheckState.INITIAL;
        if (bankCheckState != this.FastBitmap$CoordinateSystem) {
            this.FastBitmap$CoordinateSystem = bankCheckState;
            setMax();
        }
        Intent intent2 = getIntent();
        Bundle bundleExtra = intent2 != null ? intent2.getBundleExtra(EXTRA_SEND_MONEY_DATA) : null;
        if (bundleExtra == null) {
            return;
        }
        if (CornerMarkingDataProvider.getMax() || !bundleExtra.getBoolean(EXTRA_BELOW_KITKAT)) {
            length3.ICustomTabsCallback = "send_money";
            Intent intentClassWithTracking = getIntentClassWithTracking(SummaryActivity.class);
            intentClassWithTracking.putExtra("data", length3);
            intentClassWithTracking.putExtra("transferScenario", bundleExtra.getString(EXTRA_TRANSFER_SCENARIO));
            startActivity(intentClassWithTracking);
            return;
        }
        isBaselineAligned.positiveButton$default(isBaselineAligned.message$default(new isBaselineAligned(this, (drawHorizontalDivider) null, 2, (DefaultConstructorMarker) null), Integer.valueOf(R.string.dialog_warning_below_kitkat), (CharSequence) null, (Function1) null, 6, (Object) null), (Integer) null, (CharSequence) null, (Function1) null, 7, (Object) null).cancelable(false).show();
    }

    /* access modifiers changed from: private */
    public final boolean getMin() {
        return getIntent().getBundleExtra(EXTRA_SEND_MONEY_DATA) != null;
    }

    /* access modifiers changed from: private */
    public final void toFloatRange() {
        if (isActivityAvailable() && this.hashCode.getMax() && !(!StringsKt.isBlank(this.hashCode.setMax))) {
            if (this.setMax == null) {
                insertAndReturnId insertandreturnid = new insertAndReturnId((Function1<? super String, Unit>) new toDoubleRange(this));
                insertandreturnid.setCancelable(false);
                Unit unit = Unit.INSTANCE;
                this.setMax = insertandreturnid;
            }
            insertAndReturnId insertandreturnid2 = this.setMax;
            if (insertandreturnid2 != null) {
                FragmentManager supportFragmentManager = getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "supportFragmentManager");
                insertandreturnid2.length(supportFragmentManager);
            }
        }
    }

    private final boolean getMin(boolean z, CharSequence charSequence) {
        return z && length(charSequence) && setMin(charSequence);
    }

    private static boolean setMin(CharSequence charSequence) {
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(-157123004, oncanceled);
            onCancelLoad.getMin(-157123004, oncanceled);
        }
        return charSequence.toString().replaceAll("\\s+", "").length() > 4;
    }

    private final boolean length(CharSequence charSequence) {
        int length2;
        int min;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length2 = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length2)))) {
            onCanceled oncanceled = new onCanceled(length2, min, 32);
            onCancelLoad.setMax(-452959113, oncanceled);
            onCancelLoad.getMin(-452959113, oncanceled);
        }
        return Pattern.compile(BANK_NUMBER_REGEX).matcher(charSequence.toString().replaceAll("\\s+", "")).matches();
    }

    /* access modifiers changed from: private */
    public final void getMin(boolean z) {
        ConstraintLayout constraintLayout = (ConstraintLayout) _$_findCachedViewById(resetInternal.setMax.hasAttributeId);
        int i = 0;
        if (constraintLayout != null) {
            View view = constraintLayout;
            Intrinsics.checkNotNullParameter(view, "<this>");
            view.setVisibility(z ? 0 : 8);
        }
        ConstraintLayout constraintLayout2 = (ConstraintLayout) _$_findCachedViewById(resetInternal.setMax.addQueueItem);
        if (constraintLayout2 != null) {
            View view2 = constraintLayout2;
            boolean z2 = !z;
            Intrinsics.checkNotNullParameter(view2, "<this>");
            if (!z2) {
                i = 8;
            }
            view2.setVisibility(i);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        r0 = r0.getText();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.String isInside() {
        /*
            r1 = this;
            int r0 = o.resetInternal.setMax.attributeId
            android.view.View r0 = r1._$_findCachedViewById(r0)
            com.google.android.material.textfield.TextInputEditText r0 = (com.google.android.material.textfield.TextInputEditText) r0
            if (r0 == 0) goto L_0x0015
            android.text.Editable r0 = r0.getText()
            if (r0 == 0) goto L_0x0015
            java.lang.String r0 = r0.toString()
            goto L_0x0016
        L_0x0015:
            r0 = 0
        L_0x0016:
            if (r0 != 0) goto L_0x001a
            java.lang.String r0 = ""
        L_0x001a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: id.dana.bank.BankSelectorActivity.isInside():java.lang.String");
    }

    private final void getMax(DanaButtonPrimaryView danaButtonPrimaryView, boolean z, String str) {
        int max;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || 1352569128 == (max = dispatchOnCancelled.getMax(applicationContext, 1352569128)))) {
            onCanceled oncanceled = new onCanceled(1352569128, max, 512);
            onCancelLoad.setMax(1352569128, oncanceled);
            onCancelLoad.getMin(1352569128, oncanceled);
        }
        danaButtonPrimaryView.setClickable(z);
        danaButtonPrimaryView.setEnabled(z);
        danaButtonPrimaryView.setDanaButtonView(z ? 1 : 0, str, (String) null, (Drawable) null);
    }

    private final void getMax(boolean z, String str) {
        DanaButtonPrimaryView danaButtonPrimaryView = (DanaButtonPrimaryView) _$_findCachedViewById(resetInternal.setMax.newSessionWithExtras);
        if (danaButtonPrimaryView != null) {
            getMax(danaButtonPrimaryView, z && this.toString != null, str);
        }
    }

    private final void setMax(boolean z, String str) {
        convertDipToPx.length length2 = new convertDipToPx.length(this);
        length2.getMax = TrackerKey.Event.SEND_MONEY_BANK_ACCOUNT_NUMBER_INPUT;
        convertDipToPx.length max = length2.setMax("Source", TrackerKey.SourceType.QR_CARD).setMin(TrackerKey.Property.IS_SUCCESS, z).setMax(TrackerKey.Property.FAIL_REASON, str).getMax(TrackerKey.Property.NUMBER_OF_ATTEMPTS, this.getMax);
        max.setMin();
        convertDipToPx convertdiptopx = new convertDipToPx(max, (byte) 0);
        List length3 = convertdiptopx.length != null ? convertdiptopx.length.length : new ArrayList();
        genTextSelector.setMax((convertSpToPx[]) length3.toArray(new convertSpToPx[length3.size()]));
        this.getMax = 0;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JL\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00042\b\b\u0002\u0010\u0018\u001a\u00020\u00042\b\b\u0002\u0010\u0019\u001a\u00020\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u001c\u001a\u00020\u001a2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001eR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fXT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fXT¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000fXT¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u000fXT¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u000fXT¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lid/dana/bank/BankSelectorActivity$Companion;", "", "()V", "BANK_NUMBER_REGEX", "", "EXTRA_BELOW_KITKAT", "EXTRA_SAVED_BANK_QR_CHECK", "EXTRA_SELECTED_BANK", "EXTRA_SEND_MONEY_DATA", "EXTRA_SHOW_BANK_INFO", "EXTRA_TRANSFER_SCENARIO", "INTERVAL_MILLISECOND_NUMBER_CHECKER", "", "LOAD_DEFAULT_FROM_RECENT", "MINIMUM_DIGIT_PREFIX_CHECK", "", "SHIMMERING_ANGLE", "SHIMMERING_COLOR", "SHIMMERING_DURATION", "createIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "bankId", "bankNumber", "showBankInfo", "", "savedQrBankCheck", "loadDefaultBankFromRecent", "sendMoneyData", "Landroid/os/Bundle;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMin {
        private getMin() {
        }

        public /* synthetic */ getMin(byte b) {
            this();
        }

        public static /* synthetic */ Intent getMin(Context context, String str, String str2, boolean z, boolean z2, boolean z3, Bundle bundle, int i) {
            if ((i & 2) != 0) {
                str = "";
            }
            if ((i & 4) != 0) {
                str2 = "";
            }
            if ((i & 8) != 0) {
                z = false;
            }
            if ((i & 16) != 0) {
                z2 = false;
            }
            if ((i & 32) != 0) {
                z3 = false;
            }
            if ((i & 64) != 0) {
                bundle = null;
            }
            Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
            Intrinsics.checkNotNullParameter(str, "bankId");
            Intrinsics.checkNotNullParameter(str2, "bankNumber");
            Intent intent = new Intent(context, BankSelectorActivity.class);
            intent.putExtra(FeatureParams.BANK_ID, str);
            intent.putExtra("bank_number", str2);
            intent.putExtra("EXTRA_SHOW_BANK_INFO", z);
            intent.putExtra("EXTRA_SAVED_BANK_QR_CHECK", z2);
            intent.putExtra("LOAD_DEFAULT_FROM_RECENT", z3);
            intent.putExtra(BankSelectorActivity.EXTRA_SEND_MONEY_DATA, bundle);
            return intent;
        }
    }

    public final void init() {
        int length2;
        int min;
        int max;
        int length3;
        int min2;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length3 = applicationContext.fileList().length) == (min2 = dispatchOnCancelled.getMin(applicationContext, length3)))) {
            onCanceled oncanceled = new onCanceled(length3, min2, 32);
            onCancelLoad.setMax(1716428597, oncanceled);
            onCancelLoad.getMin(1716428597, oncanceled);
        }
        TitleBarRightButtonView.AnonymousClass1 combineLatest = TitleBarRightButtonView.AnonymousClass1.combineLatest((TitleBarRightButtonView.AnonymousClass1) this.Grayscale$Algorithm.getValue(), (TitleBarRightButtonView.AnonymousClass1) this.valueOf.getValue(), isInside.getMin);
        Intrinsics.checkNotNullExpressionValue(combineLatest, "Observable.combineLatest…)\n            }\n        )");
        addDisposable(combineLatest.subscribe(new equals(this)));
        int max2 = dispatchOnCancelled.getMax(0);
        if (max2 != 0) {
            onCanceled oncanceled2 = new onCanceled(0, max2, 16);
            onCancelLoad.setMax(-83308151, oncanceled2);
            onCancelLoad.getMin(-83308151, oncanceled2);
        }
        AppCompatTextView appCompatTextView = (AppCompatTextView) _$_findCachedViewById(resetInternal.setMax.drawDividersHorizontal);
        if (appCompatTextView != null) {
            appCompatTextView.setOnClickListener(new associateBy(new BankSelectorActivity$FastBitmap$CoordinateSystem(this)));
        }
        DanaButtonPrimaryView danaButtonPrimaryView = (DanaButtonPrimaryView) _$_findCachedViewById(resetInternal.setMax.newSessionWithExtras);
        if (danaButtonPrimaryView != null) {
            danaButtonPrimaryView.setOnClickListener(new associateBy(new toIntRange(this)));
        }
        DanaButtonPrimaryView danaButtonPrimaryView2 = (DanaButtonPrimaryView) _$_findCachedViewById(resetInternal.setMax.toIntRange);
        if (danaButtonPrimaryView2 != null) {
            danaButtonPrimaryView2.setOnClickListener(new associateBy(new toString(this)));
        }
        Intent intent = getIntent();
        this.toFloatRange = intent.getBooleanExtra("EXTRA_SHOW_BANK_INFO", false);
        intent.removeExtra("EXTRA_SHOW_BANK_INFO");
        this.IsOverlapping = intent.getBooleanExtra("EXTRA_SAVED_BANK_QR_CHECK", false);
        intent.removeExtra("EXTRA_SAVED_BANK_QR_CHECK");
        this.toDoubleRange = intent.getBooleanExtra("LOAD_DEFAULT_FROM_RECENT", false);
        intent.removeExtra("LOAD_DEFAULT_FROM_RECENT");
        Context baseContext2 = getBaseContext();
        Context applicationContext2 = baseContext2 != null ? baseContext2.getApplicationContext() : null;
        if (!(applicationContext2 == null || 1084068860 == (max = dispatchOnCancelled.getMax(applicationContext2, 1084068860)))) {
            onCanceled oncanceled3 = new onCanceled(1084068860, max, 512);
            onCancelLoad.setMax(1084068860, oncanceled3);
            onCancelLoad.getMin(1084068860, oncanceled3);
        }
        Context baseContext3 = getBaseContext();
        Context applicationContext3 = baseContext3 != null ? baseContext3.getApplicationContext() : null;
        if (!(applicationContext3 == null || (length2 = applicationContext3.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext3, length2)))) {
            onCanceled oncanceled4 = new onCanceled(length2, min, 32);
            onCancelLoad.setMax(1084068860, oncanceled4);
            onCancelLoad.getMin(1084068860, oncanceled4);
        }
        findUrlMappedAppId.setMin setmin = new findUrlMappedAppId.setMin((byte) 0);
        PrepareException.AnonymousClass1 applicationComponent = getApplicationComponent();
        if (applicationComponent != null) {
            setmin.length = applicationComponent;
            BankSelectorModule bankSelectorModule = (BankSelectorModule) this.invokeSuspend.getValue();
            if (bankSelectorModule != null) {
                setmin.getMax = bankSelectorModule;
                BillerX2BModule billerX2BModule = (BillerX2BModule) this.invoke.getValue();
                if (billerX2BModule != null) {
                    setmin.getMin = billerX2BModule;
                    stopIgnoring.setMin(setmin.getMax, BankSelectorModule.class);
                    stopIgnoring.setMin(setmin.getMin, BillerX2BModule.class);
                    stopIgnoring.setMin(setmin.length, PrepareException.AnonymousClass1.class);
                    new findUrlMappedAppId(setmin.getMax, setmin.getMin, setmin.length, (byte) 0).length(this);
                    onDelete.getMin[] getminArr = new onDelete.getMin[2];
                    ForeignKey.getMin getmin = this.presenter;
                    if (getmin == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("presenter");
                    }
                    getminArr[0] = getmin;
                    IWorkManagerImplCallback.Stub.Proxy.getMin getmin2 = this.billerX2BPresenter;
                    if (getmin2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("billerX2BPresenter");
                    }
                    getminArr[1] = getmin2;
                    registerPresenter(getminArr);
                    ForeignKey.getMin getmin3 = this.presenter;
                    if (getmin3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("presenter");
                    }
                    getmin3.setMax(this.toDoubleRange);
                    IWorkManagerImplCallback.Stub.Proxy.getMin getmin4 = this.billerX2BPresenter;
                    if (getmin4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("billerX2BPresenter");
                    }
                    getmin4.setMin();
                    return;
                }
                throw null;
            }
            throw null;
        }
        throw null;
    }

    public static final /* synthetic */ void access$openBankListActivity(BankSelectorActivity bankSelectorActivity) {
        if (!bankSelectorActivity.hashCode.setMin()) {
            bankSelectorActivity.Mean$Arithmetic.getMin(new Intent(bankSelectorActivity, BottomSheetBankListActivity.class), (name) null);
        }
    }

    public static final /* synthetic */ void access$setBankCheckState$p(BankSelectorActivity bankSelectorActivity, BankCheckState bankCheckState) {
        if (bankCheckState != bankSelectorActivity.FastBitmap$CoordinateSystem) {
            bankSelectorActivity.FastBitmap$CoordinateSystem = bankCheckState;
            bankSelectorActivity.setMax();
        }
    }

    public static final /* synthetic */ void access$doNameCheck(BankSelectorActivity bankSelectorActivity) {
        BankModel bankModel;
        BankCheckState bankCheckState = BankCheckState.CHECKING;
        if (bankCheckState != bankSelectorActivity.FastBitmap$CoordinateSystem) {
            bankSelectorActivity.FastBitmap$CoordinateSystem = bankCheckState;
            bankSelectorActivity.setMax();
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) bankSelectorActivity._$_findCachedViewById(resetInternal.setMax.getRatingType);
        if (constraintLayout != null) {
            View view = constraintLayout;
            Intrinsics.checkNotNullParameter(view, "<this>");
            view.setVisibility(8);
        }
        String isInside2 = bankSelectorActivity.isInside();
        BankModel bankModel2 = bankSelectorActivity.toString;
        if (bankModel2 != null) {
            BankModel.setMin setmin = new BankModel.setMin();
            String str = bankModel2.getMin;
            BankModel.setMin setmin2 = setmin;
            String str2 = "";
            if (str == null) {
                str = str2;
            }
            setmin2.setMax = str;
            BankModel.setMin setmin3 = setmin2;
            if (isInside2 == null) {
                isInside2 = str2;
            }
            setmin3.getMax = isInside2;
            String str3 = bankModel2.setMin;
            BankModel.setMin setmin4 = setmin3;
            if (str3 == null) {
                str3 = str2;
            }
            setmin4.getMin = str3;
            String str4 = bankModel2.toFloatRange;
            BankModel.setMin setmin5 = setmin4;
            if (str4 == null) {
                str4 = str2;
            }
            setmin5.toFloatRange = str4;
            String str5 = bankModel2.IsOverlapping;
            BankModel.setMin setmin6 = setmin5;
            if (str5 == null) {
                str5 = str2;
            }
            setmin6.toIntRange = str5;
            String str6 = bankSelectorActivity.hashCode.setMax;
            BankModel.setMin setmin7 = setmin6;
            if (str6 != null) {
                str2 = str6;
            }
            setmin7.isInside = str2;
            BankModel.setMin setmin8 = setmin7;
            setmin8.hashCode = true;
            bankModel = setmin8.length();
        } else {
            bankModel = null;
        }
        if (bankModel != null) {
            bankSelectorActivity.hashCode.IsOverlapping = bankSelectorActivity.IsOverlapping;
            ForeignKey.getMin getmin = bankSelectorActivity.presenter;
            if (getmin == null) {
                Intrinsics.throwUninitializedPropertyAccessException("presenter");
            }
            getmin.setMax(bankModel, bankSelectorActivity.hashCode);
        }
    }

    public static final /* synthetic */ void access$openBillerPage(BankSelectorActivity bankSelectorActivity) {
        getCurrX getcurrx = bankSelectorActivity.isInside;
        if (getcurrx != null) {
            BankCheckState bankCheckState = BankCheckState.CHECKING;
            if (bankCheckState != bankSelectorActivity.FastBitmap$CoordinateSystem) {
                bankSelectorActivity.FastBitmap$CoordinateSystem = bankCheckState;
                bankSelectorActivity.setMax();
            }
            IWorkManagerImplCallback.Stub.Proxy.getMin getmin = bankSelectorActivity.billerX2BPresenter;
            if (getmin == null) {
                Intrinsics.throwUninitializedPropertyAccessException("billerX2BPresenter");
            }
            getmin.length(getcurrx);
        }
    }

    public static final /* synthetic */ void access$getNameCheckConfig(BankSelectorActivity bankSelectorActivity) {
        ForeignKey.getMin getmin = bankSelectorActivity.presenter;
        if (getmin == null) {
            Intrinsics.throwUninitializedPropertyAccessException("presenter");
        }
        getmin.setMax(bankSelectorActivity.toDoubleRange);
    }

    public static final /* synthetic */ void access$initPreFilledData(BankSelectorActivity bankSelectorActivity) {
        Object obj;
        Intent intent = bankSelectorActivity.getIntent();
        String stringExtra = intent.getStringExtra(FeatureParams.BANK_ID);
        Editable editable = null;
        if (stringExtra != null) {
            Iterator it = bankSelectorActivity.hashCode.getMax.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (Intrinsics.areEqual((Object) ((BankModel) obj).getMin, (Object) stringExtra)) {
                    break;
                }
            }
            BankModel bankModel = (BankModel) obj;
            if (bankModel == null) {
                bankModel = bankSelectorActivity.hashCode.equals;
            }
            bankSelectorActivity.setMax(bankModel);
            intent.removeExtra(FeatureParams.BANK_ID);
        }
        String stringExtra2 = intent.getStringExtra("bank_number");
        if (stringExtra2 != null) {
            TextInputEditText textInputEditText = (TextInputEditText) bankSelectorActivity._$_findCachedViewById(resetInternal.setMax.attributeId);
            if (textInputEditText != null) {
                textInputEditText.setText(stringExtra2);
            }
            intent.removeExtra("bank_number");
        }
        boolean z = bankSelectorActivity.toString != null;
        TextInputEditText textInputEditText2 = (TextInputEditText) bankSelectorActivity._$_findCachedViewById(resetInternal.setMax.attributeId);
        if (textInputEditText2 != null) {
            editable = textInputEditText2.getText();
        }
        bankSelectorActivity.getMax(z, (CharSequence) String.valueOf(editable));
    }

    public static final /* synthetic */ void access$showSkeleton(BankSelectorActivity bankSelectorActivity, View view) {
        getInsetDodgeRect.setMax setmax = new getInsetDodgeRect.setMax(view);
        setmax.getMax = R.layout.layout_skeleton_add_user_bank;
        setmax.setMax = 1500;
        setmax.length = true;
        setmax.setMin = IntRange.setMax(setmax.getMin.getContext(), R.color.f24782131100433);
        setmax.isInside = 20;
        getInsetDodgeRect getinsetdodgerect = new getInsetDodgeRect(setmax, (byte) 0);
        getinsetdodgerect.getMin();
        bankSelectorActivity.toIntRange = getinsetdodgerect;
    }

    public static final /* synthetic */ void access$hideSkeleton(BankSelectorActivity bankSelectorActivity) {
        onDetachedFromLayoutParams ondetachedfromlayoutparams = bankSelectorActivity.toIntRange;
        if (ondetachedfromlayoutparams != null) {
            ondetachedfromlayoutparams.length();
        }
    }

    public static final /* synthetic */ void access$onNameCheck(BankSelectorActivity bankSelectorActivity, getProxy getproxy) {
        int length2;
        int length3;
        int min;
        bankSelectorActivity.getMin = getproxy;
        if (bankSelectorActivity.toFloatRange) {
            Context baseContext = bankSelectorActivity.getBaseContext();
            String str = null;
            Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
            if (!(applicationContext == null || (length3 = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length3)))) {
                onCanceled oncanceled = new onCanceled(length3, min, 32);
                onCancelLoad.setMax(-64266620, oncanceled);
                onCancelLoad.getMin(-64266620, oncanceled);
            }
            if (bankSelectorActivity.hashCode.getMax()) {
                bankSelectorActivity.hashCode.getMin = false;
            }
            Context baseContext2 = bankSelectorActivity.getBaseContext();
            Context applicationContext2 = baseContext2 != null ? baseContext2.getApplicationContext() : null;
            if (!(applicationContext2 == null || (length2 = dispatchOnCancelled.length(applicationContext2, 0)) == 0)) {
                onCanceled oncanceled2 = new onCanceled(0, length2, 4);
                onCancelLoad.setMax(-737485470, oncanceled2);
                onCancelLoad.getMin(-737485470, oncanceled2);
            }
            int max = dispatchOnCancelled.getMax(0);
            if (max != 0) {
                onCanceled oncanceled3 = new onCanceled(0, max, 16);
                onCancelLoad.setMax(-737485470, oncanceled3);
                onCancelLoad.getMin(-737485470, oncanceled3);
            }
            ConstraintLayout constraintLayout = (ConstraintLayout) bankSelectorActivity._$_findCachedViewById(resetInternal.setMax.getRatingType);
            if (constraintLayout != null) {
                View view = constraintLayout;
                Intrinsics.checkNotNullParameter(view, "<this>");
                view.setVisibility(0);
            }
            TextView textView = (TextView) bankSelectorActivity._$_findCachedViewById(resetInternal.setMax.drawHorizontalDivider);
            if (textView != null) {
                getProxy getproxy2 = bankSelectorActivity.getMin;
                if (getproxy2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("checkedWithdrawNameCheckModel");
                }
                textView.setText(getproxy2.getMax);
            }
            TextView textView2 = (TextView) bankSelectorActivity._$_findCachedViewById(resetInternal.setMax.drawVerticalDivider);
            String str2 = "";
            if (textView2 != null) {
                StringBuilder sb = new StringBuilder();
                BankModel bankModel = bankSelectorActivity.toString;
                String str3 = bankModel != null ? bankModel.setMin : null;
                if (str3 == null) {
                    str3 = str2;
                }
                sb.append(str3);
                sb.append(" | ");
                getProxy getproxy3 = bankSelectorActivity.getMin;
                if (getproxy3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("checkedWithdrawNameCheckModel");
                }
                String str4 = getproxy3.setMin;
                if (str4 == null) {
                    str4 = str2;
                }
                sb.append(str4);
                textView2.setText(sb.toString());
            }
            updateCornerMarking updatecornermarking = (updateCornerMarking) Glide.setMin((FragmentActivity) bankSelectorActivity);
            BankModel bankModel2 = bankSelectorActivity.toString;
            if (bankModel2 != null) {
                str = bankModel2.getMax();
            }
            if (str != null) {
                str2 = str;
            }
            updatecornermarking.setMax(str2).setMax((int) R.drawable.ic_bank_placeholder).setMin((int) R.drawable.ic_bank_placeholder).onRelationshipValidationResult().length((ImageView) (AppCompatImageView) bankSelectorActivity._$_findCachedViewById(resetInternal.setMax.setSupportProgressBarVisibility));
            setMyBeaconListener.setMin(bankSelectorActivity, (TextInputEditText) bankSelectorActivity._$_findCachedViewById(resetInternal.setMax.attributeId));
        } else {
            bankSelectorActivity.setMin();
        }
        BankCheckState bankCheckState = BankCheckState.VALID;
        if (bankCheckState != bankSelectorActivity.FastBitmap$CoordinateSystem) {
            bankSelectorActivity.FastBitmap$CoordinateSystem = bankCheckState;
            bankSelectorActivity.setMax();
        }
    }

    public static final /* synthetic */ void access$onNameCheckError(BankSelectorActivity bankSelectorActivity, String str) {
        BankCheckState bankCheckState = BankCheckState.ERROR;
        if (bankCheckState != bankSelectorActivity.FastBitmap$CoordinateSystem) {
            bankSelectorActivity.FastBitmap$CoordinateSystem = bankCheckState;
            bankSelectorActivity.setMax();
        }
        TextInputLayout textInputLayout = (TextInputLayout) bankSelectorActivity._$_findCachedViewById(resetInternal.setMax.setAllowStacking);
        if (textInputLayout != null) {
            textInputLayout.setError(str);
            textInputLayout.setErrorIconDrawable((Drawable) null);
        }
        bankSelectorActivity.setMax(false, str);
    }
}
