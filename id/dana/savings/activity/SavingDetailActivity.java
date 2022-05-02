package id.dana.savings.activity;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.Window;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$Mean$Arithmetic;
import id.dana.R;
import id.dana.base.BaseActivity;
import id.dana.base.EmptyStateRecyclerView;
import id.dana.component.buttoncomponent.DanaButtonPrimaryView;
import id.dana.component.buttoncomponent.DanaButtonSecondaryView;
import id.dana.danah5.DanaH5;
import id.dana.danah5.akulaku.AkuEventParamsKey;
import id.dana.data.constant.BranchLinkConstant;
import id.dana.di.modules.CheckoutH5EventModule;
import id.dana.di.modules.SavingDetailModule;
import id.dana.di.modules.SavingTopUpModule;
import id.dana.domain.usereducation.BottomSheetOnBoardingScenario;
import id.dana.model.CurrencyAmountModel;
import id.dana.nearbyme.merchantdetail.model.MoneyViewModel;
import id.dana.savings.activity.SavingUpdateActivity;
import id.dana.savings.model.SavingCategoryModel;
import id.dana.savings.model.SavingDetailModel;
import id.dana.savings.model.SavingModel;
import id.dana.savings.model.TopUpModel;
import id.dana.savings.withdrawal.WithdrawalSavingBottomSheetDialog;
import id.dana.tracker.TrackerKey;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmDefault;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.math.MathKt;
import kotlin.text.StringsKt;
import o.Beacon;
import o.CameraView;
import o.CornerMarkingDataProvider;
import o.GriverCaptureActivity;
import o.GriverManifest;
import o.Ignore;
import o.IntRange;
import o.Popup;
import o.PrepareException;
import o.SightCameraView;
import o.TouchInterceptFrameLayout;
import o.containsFavoriteMenuItem;
import o.convertDipToPx;
import o.convertSpToPx;
import o.dispatchOnCancelled;
import o.doDismissWithAnimation;
import o.enableEventbus;
import o.genTextSelector;
import o.getBluetoothAdapterState;
import o.getCacheKey;
import o.getInsetDodgeRect;
import o.isOriginHasAppInfo;
import o.notifyCameraOpen;
import o.onCancelLoad;
import o.onCanceled;
import o.onDelete;
import o.onSelectCanceled;
import o.onSucc;
import o.onSurfaceTextureUpdated;
import o.resetInternal;
import o.setCancelOnTouchOutside$core;
import o.setCancelText;
import o.setLatitude;
import o.setLineVisible;
import o.setOnMenuWindowDismissListener;
import o.setOnTapListener;
import o.setProgressViewOffset;
import o.setShadowResourceRight;
import o.setVideoCurTimeStamp;
import o.stopIgnoring;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000¼\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 2\u00020\u0001:\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020\n2\u0006\u0010/\u001a\u000200H\u0002J\b\u00101\u001a\u00020-H\u0014J\b\u00102\u001a\u00020-H\u0002J\u0010\u00103\u001a\u00020-2\u0006\u00104\u001a\u000205H\u0002J\b\u00106\u001a\u00020-H\u0002J\b\u00107\u001a\u00020-H\u0002J\u001c\u00108\u001a\u0002092\b\u0010:\u001a\u0004\u0018\u0001052\b\u0010;\u001a\u0004\u0018\u000105H\u0002J\b\u0010<\u001a\u00020=H\u0002J\b\u0010>\u001a\u000205H\u0002J\b\u0010?\u001a\u00020@H\u0002J\b\u0010A\u001a\u00020@H\u0016J\b\u0010B\u001a\u00020CH\u0002J\b\u0010D\u001a\u00020EH\u0002J\b\u0010F\u001a\u00020GH\u0002J\b\u0010H\u001a\u000209H\u0002J\u0010\u0010I\u001a\u0002052\u0006\u0010J\u001a\u000205H\u0002J\b\u0010K\u001a\u00020-H\u0016J\b\u0010L\u001a\u00020-H\u0002J\u0010\u0010M\u001a\u00020-2\u0006\u0010N\u001a\u00020\nH\u0002J\b\u0010O\u001a\u00020-H\u0002J\b\u0010P\u001a\u00020-H\u0002J\u000f\u0010Q\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0002\u0010RJ\"\u0010S\u001a\u00020-2\u0006\u0010T\u001a\u00020@2\u0006\u0010U\u001a\u00020@2\b\u0010V\u001a\u0004\u0018\u00010WH\u0014J\u0012\u0010X\u001a\u00020-2\b\u0010Y\u001a\u0004\u0018\u00010ZH\u0002J\b\u0010[\u001a\u00020-H\u0002J\u0010\u0010\\\u001a\u00020-2\b\u0010]\u001a\u0004\u0018\u000105J\b\u0010^\u001a\u00020-H\u0002J\b\u0010_\u001a\u00020-H\u0014J\b\u0010`\u001a\u00020-H\u0002J\u0010\u0010a\u001a\u00020-2\u0006\u0010b\u001a\u000205H\u0002J\u0010\u0010c\u001a\u00020-2\u0006\u0010d\u001a\u000205H\u0002J\b\u0010e\u001a\u00020-H\u0002J\u0018\u0010f\u001a\u00020-2\u0006\u00104\u001a\u0002052\u0006\u0010g\u001a\u000205H\u0002J\b\u0010h\u001a\u00020-H\u0002J\u0010\u0010i\u001a\u00020-2\u0006\u0010.\u001a\u00020\nH\u0002J\u0010\u0010j\u001a\u00020-2\u0006\u0010N\u001a\u00020kH\u0002J\u0010\u0010l\u001a\u00020-2\u0006\u0010m\u001a\u000205H\u0002J\u0010\u0010n\u001a\u00020-2\u0006\u0010o\u001a\u00020@H\u0002J\u0010\u0010p\u001a\u00020-2\u0006\u0010/\u001a\u000200H\u0002J\u0018\u0010q\u001a\u00020-2\u0006\u0010r\u001a\u00020k2\u0006\u0010/\u001a\u000200H\u0002J\u0010\u0010s\u001a\u00020-2\u0006\u0010t\u001a\u000205H\u0002J\b\u0010u\u001a\u00020-H\u0002J\b\u0010v\u001a\u00020-H\u0002J\b\u0010w\u001a\u00020-H\u0002J\b\u0010x\u001a\u00020-H\u0002J\b\u0010y\u001a\u00020-H\u0002J\f\u0010z\u001a\u00020-*\u00020\u0018H\u0002J\f\u0010{\u001a\u00020-*\u000200H\u0002J\u0018\u0010|\u001a\b\u0012\u0004\u0012\u00020~0}*\b\u0012\u0004\u0012\u00020~0}H\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX.¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX.¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R#\u0010\u0010\u001a\n \u0012*\u0004\u0018\u00010\u00110\u00118BX\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0017\u001a\u00020\u0018X.¢\u0006\u0002\n\u0000R\"\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a@BX\u000e¢\u0006\b\n\u0000\"\u0004\b\u001c\u0010\u001dR\u001e\u0010\u001e\u001a\u00020\u001f8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001e\u0010$\u001a\u00020%8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u0010\u0010*\u001a\u0004\u0018\u00010+X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0001"}, d2 = {"Lid/dana/savings/activity/SavingDetailActivity;", "Lid/dana/base/BaseActivity;", "()V", "checkoutH5EventPresenter", "Lid/dana/h5event/CheckoutH5EventContract$Presenter;", "getCheckoutH5EventPresenter", "()Lid/dana/h5event/CheckoutH5EventContract$Presenter;", "setCheckoutH5EventPresenter", "(Lid/dana/h5event/CheckoutH5EventContract$Presenter;)V", "checkoutH5EventSuccess", "", "customSnackBar", "Lid/dana/component/customsnackbarcomponent/CustomSnackbar;", "historyAdapter", "Lid/dana/savings/adapter/HistoryAdapter;", "loadingHistory", "pageSkeleton", "Lcom/ethanhua/skeleton/ViewSkeletonScreen;", "kotlin.jvm.PlatformType", "getPageSkeleton", "()Lcom/ethanhua/skeleton/ViewSkeletonScreen;", "pageSkeleton$delegate", "Lkotlin/Lazy;", "savingCategoryModel", "Lid/dana/savings/model/SavingCategoryModel;", "value", "Lid/dana/savings/model/SavingDetailModel;", "savingDetailModel", "setSavingDetailModel", "(Lid/dana/savings/model/SavingDetailModel;)V", "savingDetailPresenter", "Lid/dana/savings/presenter/SavingDetailPresenter;", "getSavingDetailPresenter", "()Lid/dana/savings/presenter/SavingDetailPresenter;", "setSavingDetailPresenter", "(Lid/dana/savings/presenter/SavingDetailPresenter;)V", "savingTopUpPresenter", "Lid/dana/savings/presenter/SavingTopUpPresenter;", "getSavingTopUpPresenter", "()Lid/dana/savings/presenter/SavingTopUpPresenter;", "setSavingTopUpPresenter", "(Lid/dana/savings/presenter/SavingTopUpPresenter;)V", "topUpSavingDialogFragment", "Lid/dana/savings/view/TopUpSavingDialogFragment;", "checkGoalHasAchieved", "", "achieved", "savingModel", "Lid/dana/savings/model/SavingModel;", "configToolbar", "fetchMoreHistoryTopUp", "fetchSavingDetails", "savingId", "", "finishGoalSavingDetail", "finishRevokeGoalSaving", "getAchievedDaysCount", "", "achievedTime", "createdTime", "getCheckoutH5EventModule", "Lid/dana/di/modules/CheckoutH5EventModule;", "getGoalUpdatedSuccessString", "getLastItemPosition", "", "getLayout", "getOnHistoryItemClickListener", "Lid/dana/base/BaseRecyclerViewHolder$OnItemClickListener;", "getSavingDetailModule", "Lid/dana/di/modules/SavingDetailModule;", "getSavingTopUpModule", "Lid/dana/di/modules/SavingTopUpModule;", "getTopUpHistoryCurrentPage", "getTransactionDetailContentUrl", "bizOrderId", "init", "initComponent", "initHistoryTitleVisibility", "currentAmount", "initRecyclerView", "initViews", "isPostToFeed", "()Ljava/lang/Boolean;", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onClickTopUp", "savingTopUpInitModel", "Lid/dana/savings/model/SavingTopUpInitModel;", "onEditButtonClicked", "onError", "errorMessage", "onOpenH5Withdraw", "onResume", "onSavingUpdated", "openH5Container", "url", "openH5WithdrawContainer", "redirectUrl", "prepareBundle", "requestTopUp", "fundAmount", "revokeSaving", "setGoalTitleTextAlignment", "setSavingAmount", "Lid/dana/nearbyme/merchantdetail/model/MoneyViewModel;", "setSavingIcon", "iconUrl", "setSavingProgress", "savingProgress", "setSavingSubtitleAchieved", "setSavingTarget", "savingTarget", "setSavingTitle", "title", "showRemoveSavingDialog", "showUpdateSavingSuccessNotification", "showWithdrawConfirmationBottomSheet", "showWithdrawalSavingBottomDialog", "trackingGoalCancelled", "setCategoryModel", "setSavingDetails", "setTopUpModels", "", "Lid/dana/savings/model/TopUpModel;", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class SavingDetailActivity extends BaseActivity {
    @NotNull
    public static final getMin Companion = new getMin((byte) 0);
    public static final int DEFAUL_THRESHOLD = 10;
    @NotNull
    public static final String EXTRA_REVOKED_SAVING = "extra_revoked_saving";
    public static final int MIN_HISTORY_TOP_UP_ITEMS = 0;
    public static final int REQUEST_CODE_EDIT_SAVING = 1000;
    public static final long TOP_UP_VIEW_SIZE = 20;
    private final Lazy IsOverlapping = LazyKt.lazy(new toString(this));
    @Inject
    public GriverManifest.AnonymousClass22.getMin checkoutH5EventPresenter;
    /* access modifiers changed from: private */
    public SavingDetailModel equals;
    /* access modifiers changed from: private */
    public notifyCameraOpen getMax;
    /* access modifiers changed from: private */
    public setProgressViewOffset getMin;
    /* access modifiers changed from: private */
    public TouchInterceptFrameLayout.TapListener isInside;
    @Inject
    public SightCameraView.BufferType savingDetailPresenter;
    @Inject
    public setOnTapListener savingTopUpPresenter;
    private SavingCategoryModel setMax;
    private HashMap toDoubleRange;
    /* access modifiers changed from: private */
    public boolean toFloatRange;
    /* access modifiers changed from: private */
    public boolean toIntRange;

    public final void _$_clearFindViewByIdCache() {
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(-1729786304, oncanceled);
            onCancelLoad.getMin(-1729786304, oncanceled);
        }
        HashMap hashMap = this.toDoubleRange;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public final View _$_findCachedViewById(int i) {
        if (this.toDoubleRange == null) {
            this.toDoubleRange = new HashMap();
        }
        View view = (View) this.toDoubleRange.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.toDoubleRange.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final int getLayout() {
        return R.layout.activity_saving_details;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0007¸\u0006\u0000"}, d2 = {"id/dana/base/callback/DanaH5CallbackKt$withDanaH5Callback$1", "Lid/dana/danah5/DanaH5Listener;", "onContainerCreated", "", "bundle", "Landroid/os/Bundle;", "onContainerDestroyed", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class values implements setCancelOnTouchOutside$core {
        final /* synthetic */ SavingDetailActivity getMin;

        public values(SavingDetailActivity savingDetailActivity) {
            this.getMin = savingDetailActivity;
        }

        public final void onContainerCreated(@Nullable Bundle bundle) {
            SavingDetailActivity.access$onOpenH5Withdraw(this.getMin);
        }

        public final void onContainerDestroyed(@Nullable Bundle bundle) {
            this.getMin.getCheckoutH5EventPresenter().length();
            if (this.getMin.toFloatRange) {
                this.getMin.finish();
            }
        }
    }

    public static final /* synthetic */ setProgressViewOffset access$getCustomSnackBar$p(SavingDetailActivity savingDetailActivity) {
        setProgressViewOffset setprogressviewoffset = savingDetailActivity.getMin;
        if (setprogressviewoffset == null) {
            Intrinsics.throwUninitializedPropertyAccessException("customSnackBar");
        }
        return setprogressviewoffset;
    }

    public static final /* synthetic */ notifyCameraOpen access$getHistoryAdapter$p(SavingDetailActivity savingDetailActivity) {
        notifyCameraOpen notifycameraopen = savingDetailActivity.getMax;
        if (notifycameraopen == null) {
            Intrinsics.throwUninitializedPropertyAccessException("historyAdapter");
        }
        return notifycameraopen;
    }

    public static final /* synthetic */ void access$requestTopUp(SavingDetailActivity savingDetailActivity, String str, String str2) {
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(-84963506, oncanceled);
            onCancelLoad.getMin(-84963506, oncanceled);
        }
        setOnTapListener setontaplistener = savingDetailActivity.savingTopUpPresenter;
        if (setontaplistener == null) {
            Intrinsics.throwUninitializedPropertyAccessException("savingTopUpPresenter");
        }
        Intrinsics.checkNotNullParameter(str, "savingId");
        Intrinsics.checkNotNullParameter(str2, "fundAmount");
        setontaplistener.length.showProgress();
        setontaplistener.setMax.execute(new setLatitude.getMax(str, str2), new setOnTapListener.getMin(setontaplistener), new setOnTapListener.setMax(setontaplistener));
    }

    public static final /* synthetic */ void access$showWithdrawConfirmationBottomSheet(SavingDetailActivity savingDetailActivity) {
        SavingDetailModel savingDetailModel;
        SavingModel savingModel;
        MoneyViewModel moneyViewModel;
        int length2;
        int min;
        Context baseContext = savingDetailActivity.getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length2 = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length2)))) {
            onCanceled oncanceled = new onCanceled(length2, min, 32);
            onCancelLoad.setMax(513375429, oncanceled);
            onCancelLoad.getMin(513375429, oncanceled);
        }
        if (savingDetailActivity.isActivityAvailable() && (savingDetailModel = savingDetailActivity.equals) != null && (savingModel = savingDetailModel.getMin) != null && (moneyViewModel = savingModel.length) != null) {
            onSelectCanceled onselectcanceled = new onSelectCanceled(new SavingDetailActivity$Grayscale$Algorithm(savingDetailActivity), new invokeSuspend(moneyViewModel, savingDetailActivity));
            Context baseContext2 = savingDetailActivity.getBaseContext();
            if (baseContext2 != null) {
                onselectcanceled.getMax = R.drawable.ic_withdraw_confirmation;
                AppCompatImageView appCompatImageView = (AppCompatImageView) onselectcanceled.setMax(resetInternal.setMax.setSupportProgressBarVisibility);
                if (appCompatImageView != null) {
                    onSelectCanceled.setMin(appCompatImageView, onselectcanceled.getMax);
                }
                String string = baseContext2.getString(R.string.saving_withdraw_confirmation_title);
                Intrinsics.checkNotNullExpressionValue(string, "it.getString(R.string.sa…hdraw_confirmation_title)");
                onselectcanceled.length(string);
                String string2 = baseContext2.getString(R.string.saving_withdraw_confirmation_desc);
                Intrinsics.checkNotNullExpressionValue(string2, "it.getString(R.string.sa…thdraw_confirmation_desc)");
                onselectcanceled.getMax(string2);
                String string3 = baseContext2.getString(R.string.saving_withdraw_confirmation_positive_btn);
                Intrinsics.checkNotNullExpressionValue(string3, "it.getString(\n          …onfirmation_positive_btn)");
                onselectcanceled.getMin(string3);
                String string4 = baseContext2.getString(R.string.saving_withdraw_confirmation_negative_btn);
                Intrinsics.checkNotNullExpressionValue(string4, "it.getString(\n          …onfirmation_negative_btn)");
                onselectcanceled.setMin(string4);
            }
            FragmentManager supportFragmentManager = savingDetailActivity.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "supportFragmentManager");
            onselectcanceled.getMin(supportFragmentManager);
        }
    }

    public static final /* synthetic */ void access$showWithdrawalSavingBottomDialog(SavingDetailActivity savingDetailActivity) {
        SavingModel savingModel;
        int length2;
        Context baseContext = savingDetailActivity.getBaseContext();
        Boolean bool = null;
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        boolean z = false;
        if (!(applicationContext == null || (length2 = dispatchOnCancelled.length(applicationContext, 0)) == 0)) {
            onCanceled oncanceled = new onCanceled(0, length2, 4);
            onCancelLoad.setMax(729436864, oncanceled);
            onCancelLoad.getMin(729436864, oncanceled);
        }
        WithdrawalSavingBottomSheetDialog withdrawalSavingBottomSheetDialog = new WithdrawalSavingBottomSheetDialog();
        SavingDetailModel savingDetailModel = savingDetailActivity.equals;
        if (savingDetailModel != null && (savingModel = savingDetailModel.getMin) != null) {
            Intrinsics.checkNotNullParameter(savingModel, "<set-?>");
            withdrawalSavingBottomSheetDialog.getMin = savingModel;
            CheckBox checkBox = (CheckBox) savingDetailActivity._$_findCachedViewById(resetInternal.setMax.onSessionReady);
            if (checkBox != null) {
                bool = Boolean.valueOf(checkBox.isChecked());
            }
            if (bool != null) {
                z = bool.booleanValue();
            }
            withdrawalSavingBottomSheetDialog.toFloatRange = z;
            WithdrawalSavingBottomSheetDialog.length valueof = new valueOf(savingDetailActivity, withdrawalSavingBottomSheetDialog);
            Intrinsics.checkNotNullParameter(valueof, "<set-?>");
            withdrawalSavingBottomSheetDialog.getMax = valueof;
            withdrawalSavingBottomSheetDialog.show(savingDetailActivity.getSupportFragmentManager(), "WithdrawalDestinationFragment");
        }
    }

    public static final /* synthetic */ void access$trackingGoalCancelled(SavingDetailActivity savingDetailActivity) {
        int length2;
        int min;
        Context baseContext = savingDetailActivity.getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length2 = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length2)))) {
            onCanceled oncanceled = new onCanceled(length2, min, 32);
            onCancelLoad.setMax(-1937623522, oncanceled);
            onCancelLoad.getMin(-1937623522, oncanceled);
        }
        convertDipToPx.length length3 = new convertDipToPx.length(savingDetailActivity.getApplicationContext());
        length3.getMax = TrackerKey.Event.GOAL_SAVINGS_CANCELLED;
        length3.setMin();
        convertDipToPx convertdiptopx = new convertDipToPx(length3, (byte) 0);
        List length4 = convertdiptopx.length != null ? convertdiptopx.length.length : new ArrayList();
        genTextSelector.setMax((convertSpToPx[]) length4.toArray(new convertSpToPx[length4.size()]));
    }

    @NotNull
    public final SightCameraView.BufferType getSavingDetailPresenter() {
        SightCameraView.BufferType bufferType = this.savingDetailPresenter;
        if (bufferType == null) {
            Intrinsics.throwUninitializedPropertyAccessException("savingDetailPresenter");
        }
        return bufferType;
    }

    public final void setSavingDetailPresenter(@NotNull SightCameraView.BufferType bufferType) {
        Intrinsics.checkNotNullParameter(bufferType, "<set-?>");
        this.savingDetailPresenter = bufferType;
    }

    @NotNull
    public final setOnTapListener getSavingTopUpPresenter() {
        setOnTapListener setontaplistener = this.savingTopUpPresenter;
        if (setontaplistener == null) {
            Intrinsics.throwUninitializedPropertyAccessException("savingTopUpPresenter");
        }
        return setontaplistener;
    }

    public final void setSavingTopUpPresenter(@NotNull setOnTapListener setontaplistener) {
        Intrinsics.checkNotNullParameter(setontaplistener, "<set-?>");
        this.savingTopUpPresenter = setontaplistener;
    }

    @NotNull
    public final GriverManifest.AnonymousClass22.getMin getCheckoutH5EventPresenter() {
        int max;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || -697585643 == (max = dispatchOnCancelled.getMax(applicationContext, -697585643)))) {
            onCanceled oncanceled = new onCanceled(-697585643, max, 512);
            onCancelLoad.setMax(-697585643, oncanceled);
            onCancelLoad.getMin(-697585643, oncanceled);
        }
        GriverManifest.AnonymousClass22.getMin getmin = this.checkoutH5EventPresenter;
        if (getmin == null) {
            Intrinsics.throwUninitializedPropertyAccessException("checkoutH5EventPresenter");
        }
        return getmin;
    }

    public final void setCheckoutH5EventPresenter(@NotNull GriverManifest.AnonymousClass22.getMin getmin) {
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(-658360023, oncanceled);
            onCancelLoad.getMin(-658360023, oncanceled);
        }
        Intrinsics.checkNotNullParameter(getmin, "<set-?>");
        this.checkoutH5EventPresenter = getmin;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ethanhua/skeleton/ViewSkeletonScreen;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class toString extends Lambda implements Function0<getInsetDodgeRect> {
        final /* synthetic */ SavingDetailActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        toString(SavingDetailActivity savingDetailActivity) {
            super(0);
            this.this$0 = savingDetailActivity;
        }

        public final getInsetDodgeRect invoke() {
            return containsFavoriteMenuItem.getMin((ConstraintLayout) this.this$0._$_findCachedViewById(resetInternal.setMax.MediaSessionCompat$ResultReceiverWrapper), R.layout.activity_skeleton_saving_details);
        }
    }

    public final void init() {
        SavingModel savingModel;
        String stringExtra;
        int max;
        boolean z = false;
        int max2 = dispatchOnCancelled.getMax(0);
        if (max2 != 0) {
            onCanceled oncanceled = new onCanceled(0, max2, 16);
            onCancelLoad.setMax(1696346210, oncanceled);
            onCancelLoad.getMin(1696346210, oncanceled);
        }
        getCacheKey.setMin setmin = new getCacheKey.setMin((byte) 0);
        PrepareException.AnonymousClass1 applicationComponent = getApplicationComponent();
        String str = null;
        if (applicationComponent != null) {
            setmin.setMin = applicationComponent;
            setmin.getMax = new SavingDetailModule(new setMin(this));
            setmin.length = new SavingTopUpModule(new getMax(this));
            setmin.setMax = new CheckoutH5EventModule(new setMax(this));
            stopIgnoring.setMin(setmin.getMax, SavingDetailModule.class);
            stopIgnoring.setMin(setmin.length, SavingTopUpModule.class);
            stopIgnoring.setMin(setmin.setMax, CheckoutH5EventModule.class);
            stopIgnoring.setMin(setmin.setMin, PrepareException.AnonymousClass1.class);
            new getCacheKey(setmin.getMax, setmin.length, setmin.setMax, setmin.setMin, (byte) 0).getMin(this);
            onDelete.getMin[] getminArr = new onDelete.getMin[2];
            SightCameraView.BufferType bufferType = this.savingDetailPresenter;
            if (bufferType == null) {
                Intrinsics.throwUninitializedPropertyAccessException("savingDetailPresenter");
            }
            getminArr[0] = bufferType;
            setOnTapListener setontaplistener = this.savingTopUpPresenter;
            if (setontaplistener == null) {
                Intrinsics.throwUninitializedPropertyAccessException("savingTopUpPresenter");
            }
            getminArr[1] = setontaplistener;
            registerPresenter(getminArr);
            View _$_findCachedViewById = _$_findCachedViewById(resetInternal.setMax.getContext);
            Intrinsics.checkNotNullExpressionValue(_$_findCachedViewById, "include");
            TextView textView = (TextView) _$_findCachedViewById.findViewById(resetInternal.setMax.getOverflowIcon);
            if (textView != null) {
                textView.setOnClickListener(new equals(this));
            }
            DanaButtonPrimaryView danaButtonPrimaryView = (DanaButtonPrimaryView) _$_findCachedViewById(resetInternal.setMax.MediaBrowserCompat$ItemReceiver);
            if (danaButtonPrimaryView != null) {
                danaButtonPrimaryView.setOnClickListener(new IsOverlapping(this));
            }
            DanaButtonPrimaryView danaButtonPrimaryView2 = (DanaButtonPrimaryView) _$_findCachedViewById(resetInternal.setMax.RatingCompat$Style);
            if (danaButtonPrimaryView2 != null) {
                danaButtonPrimaryView2.setOnClickListener(new toFloatRange(this));
            }
            DanaButtonSecondaryView danaButtonSecondaryView = (DanaButtonSecondaryView) _$_findCachedViewById(resetInternal.setMax.RatingCompat$StarStyle);
            if (danaButtonSecondaryView != null) {
                danaButtonSecondaryView.setOnClickListener(new SavingDetailActivity$FastBitmap$CoordinateSystem(this));
            }
            LinearLayout linearLayout = (LinearLayout) _$_findCachedViewById(resetInternal.setMax.findItem);
            if (linearLayout != null) {
                if (CornerMarkingDataProvider.length()) {
                    linearLayout.setOutlineProvider(ViewOutlineProvider.BACKGROUND);
                }
                View view = linearLayout;
                Intrinsics.checkNotNullParameter(view, "$this$elevate");
                Resources system = Resources.getSystem();
                Intrinsics.checkNotNullExpressionValue(system, "Resources.getSystem()");
                getBluetoothAdapterState.getMin(view, (int) TypedValue.applyDimension(1, 4.0f, system.getDisplayMetrics()));
            }
            Context baseContext = getBaseContext();
            Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
            if (!(applicationContext == null || -1814769917 == (max = dispatchOnCancelled.getMax(applicationContext, -1814769917)))) {
                onCanceled oncanceled2 = new onCanceled(-1814769917, max, 512);
                onCancelLoad.setMax(-1814769917, oncanceled2);
                onCancelLoad.getMin(-1814769917, oncanceled2);
            }
            EmptyStateRecyclerView emptyStateRecyclerView = (EmptyStateRecyclerView) _$_findCachedViewById(resetInternal.setMax.getAutoSizeTextAvailableSizes);
            if (emptyStateRecyclerView != null) {
                emptyStateRecyclerView.setEmptyView((TextView) _$_findCachedViewById(resetInternal.setMax.onPopulateAccessibilityEvent));
                notifyCameraOpen notifycameraopen = new notifyCameraOpen();
                emptyStateRecyclerView.addOnScrollListener(new isInside(emptyStateRecyclerView, this));
                this.getMax = notifycameraopen;
                notifycameraopen.getMax((Ignore.setMin) new length(this));
                Unit unit = Unit.INSTANCE;
                emptyStateRecyclerView.setAdapter(notifycameraopen);
                emptyStateRecyclerView.setLayoutManager(new LinearLayoutManager(emptyStateRecyclerView.getContext(), 1, false));
                emptyStateRecyclerView.addItemDecoration(new toIntRange(emptyStateRecyclerView, emptyStateRecyclerView.getContext(), IntRange.setMax(emptyStateRecyclerView.getContext(), R.color.f20352131099947), (float) ((int) (Resources.getSystem().getDisplayMetrics().density * 16.0f))));
            }
            Intent intent = getIntent();
            if (intent == null || !intent.hasExtra("goals_id")) {
                Intent intent2 = getIntent();
                if (!(intent2 == null || (savingModel = (SavingModel) intent2.getParcelableExtra(SavingCreateActivity.EXTRA_SAVING)) == null)) {
                    SavingCategoryModel savingCategoryModel = savingModel.toIntRange;
                    if (savingCategoryModel != null) {
                        getMax(savingCategoryModel);
                    }
                    setMin(savingModel);
                    String str2 = savingModel.getMax;
                    SightCameraView.BufferType bufferType2 = this.savingDetailPresenter;
                    if (bufferType2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("savingDetailPresenter");
                    }
                    bufferType2.getMin(str2);
                    if (savingModel != null) {
                        return;
                    }
                }
                SavingDetailActivity savingDetailActivity = this;
                savingDetailActivity.setResult(0);
                savingDetailActivity.finish();
                Unit unit2 = Unit.INSTANCE;
                return;
            }
            Intent intent3 = getIntent();
            if (!(intent3 == null || (stringExtra = intent3.getStringExtra("goals_id")) == null)) {
                Intrinsics.checkNotNullExpressionValue(stringExtra, "it");
                if (stringExtra.length() > 0) {
                    z = true;
                }
                if (!z) {
                    stringExtra = null;
                }
                if (stringExtra != null) {
                    ((getInsetDodgeRect) this.IsOverlapping.getValue()).getMin();
                    Intrinsics.checkNotNullExpressionValue(stringExtra, "it");
                    SightCameraView.BufferType bufferType3 = this.savingDetailPresenter;
                    if (bufferType3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("savingDetailPresenter");
                    }
                    bufferType3.getMin(stringExtra);
                    Intent intent4 = getIntent();
                    if (intent4 != null) {
                        str = intent4.getStringExtra("action");
                    }
                    if (StringsKt.equals(str, BottomSheetOnBoardingScenario.TOP_UP, true)) {
                        setOnTapListener setontaplistener2 = this.savingTopUpPresenter;
                        if (setontaplistener2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("savingTopUpPresenter");
                        }
                        setontaplistener2.getMax(stringExtra);
                        return;
                    }
                    return;
                }
            }
            finish();
            return;
        }
        throw null;
    }

    public final void configToolbar() {
        setTitle(getString(R.string.detail_title_saving));
        setMenuLeftButton((int) R.drawable.btn_arrow_left);
        setMenuRightButton(getString(R.string.edit_savings_btn));
    }

    public final void onActivityResult(int i, int i2, @Nullable Intent intent) {
        int length2;
        int min;
        int length3;
        SavingModel savingModel;
        int max = dispatchOnCancelled.setMax(i);
        if (i != max) {
            onCanceled oncanceled = new onCanceled(i, max, 1);
            onCancelLoad.setMax(1414807037, oncanceled);
            onCancelLoad.getMin(1414807037, oncanceled);
        }
        super.onActivityResult(i, i2, intent);
        if (i != 1000) {
            return;
        }
        if (i2 == 1001) {
            int max2 = dispatchOnCancelled.getMax(0);
            if (max2 != 0) {
                onCanceled oncanceled2 = new onCanceled(0, max2, 16);
                onCancelLoad.setMax(-1504265617, oncanceled2);
                onCancelLoad.getMin(-1504265617, oncanceled2);
            }
            SavingDetailModel savingDetailModel = this.equals;
            if (savingDetailModel != null && (savingModel = savingDetailModel.getMin) != null) {
                String str = savingModel.getMax;
                SightCameraView.BufferType bufferType = this.savingDetailPresenter;
                if (bufferType == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("savingDetailPresenter");
                }
                bufferType.getMin(str);
                String string = getResources().getString(R.string.toast_edit_saving_goal_success);
                Intrinsics.checkNotNullExpressionValue(string, "resources.getString(\n   …edit_saving_goal_success)");
                setCancelText.length(this, R.drawable.ic_success, R.drawable.bg_rounded_toast_success, string, 48, 60, true, (String) null, 256);
            }
        } else if (i2 == 1002) {
            Context baseContext = getBaseContext();
            Context context = null;
            Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
            if (!(applicationContext == null || (length3 = dispatchOnCancelled.length(applicationContext, 0)) == 0)) {
                onCanceled oncanceled3 = new onCanceled(0, length3, 4);
                onCancelLoad.setMax(1003035772, oncanceled3);
                onCancelLoad.getMin(1003035772, oncanceled3);
            }
            int max3 = dispatchOnCancelled.getMax(0);
            if (max3 != 0) {
                onCanceled oncanceled4 = new onCanceled(0, max3, 16);
                onCancelLoad.setMax(1003035772, oncanceled4);
                onCancelLoad.getMin(1003035772, oncanceled4);
            }
            Context baseContext2 = getBaseContext();
            if (baseContext2 != null) {
                context = baseContext2.getApplicationContext();
            }
            if (!(context == null || (length2 = context.fileList().length) == (min = dispatchOnCancelled.getMin(context, length2)))) {
                onCanceled oncanceled5 = new onCanceled(length2, min, 32);
                onCancelLoad.setMax(1003035772, oncanceled5);
                onCancelLoad.getMin(1003035772, oncanceled5);
            }
            Intent intent2 = new Intent();
            intent2.putExtra(EXTRA_REVOKED_SAVING, this.equals);
            setResult(1002, intent2);
            finish();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00005\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0012\u0010\u0004\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\b\u0010\u0007\u001a\u00020\u0003H\u0016J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH\u0016J\u0016\u0010\u000e\u001a\u00020\u00032\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0016¨\u0006\u0012"}, d2 = {"id/dana/savings/activity/SavingDetailActivity$getSavingDetailModule$1", "Lid/dana/savings/contract/SavingDetailContract$View;", "dismissProgress", "", "onError", "errorMessage", "", "onFailedGetMoreTopUpHistory", "onGetSavingDetails", "savingDetailModel", "Lid/dana/savings/model/SavingDetailModel;", "onRevokeSaving", "needWithdraw", "", "onSuccessGetMoreTopUpHistory", "historyTopUps", "", "Lid/dana/savings/model/TopUpModel;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMin implements enableEventbus.setMax {
        final /* synthetic */ SavingDetailActivity getMax;

        @JvmDefault
        public final void showProgress() {
        }

        setMin(SavingDetailActivity savingDetailActivity) {
            this.getMax = savingDetailActivity;
        }

        public final void dismissProgress() {
            SavingDetailActivity.access$getPageSkeleton$p(this.getMax).length();
        }

        public final void length(@NotNull SavingDetailModel savingDetailModel) {
            Intrinsics.checkNotNullParameter(savingDetailModel, "savingDetailModel");
            SavingDetailActivity.access$setSavingDetailModel$p(this.getMax, savingDetailModel);
        }

        public final void onError(@Nullable String str) {
            this.getMax.onError(str);
        }

        public final void setMin() {
            SavingDetailActivity.access$trackingGoalCancelled(this.getMax);
            SavingDetailActivity.access$finishRevokeGoalSaving(this.getMax);
        }

        public final void getMax(@NotNull List<TopUpModel> list) {
            Intrinsics.checkNotNullParameter(list, "historyTopUps");
            notifyCameraOpen access$getHistoryAdapter$p = SavingDetailActivity.access$getHistoryAdapter$p(this.getMax);
            this.getMax.toIntRange = false;
            access$getHistoryAdapter$p.getMax(SavingDetailActivity.access$getLastItemPosition(this.getMax));
            access$getHistoryAdapter$p.length(list);
        }

        public final void setMax() {
            notifyCameraOpen access$getHistoryAdapter$p = SavingDetailActivity.access$getHistoryAdapter$p(this.getMax);
            this.getMax.toIntRange = false;
            access$getHistoryAdapter$p.getMax(SavingDetailActivity.access$getLastItemPosition(this.getMax));
            access$getHistoryAdapter$p.getMax(new TopUpModel((String) null, (MoneyViewModel) null, (String) null, (String) null, (String) null, (Map) null, 2, 63));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0005H\u0016J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0005H\u0016¨\u0006\r"}, d2 = {"id/dana/savings/activity/SavingDetailActivity$getSavingTopUpModule$1", "Lid/dana/savings/contract/SavingTopUpContract$View;", "onError", "", "errorMessage", "", "onInitSavingTopUp", "savingTopUpInitModel", "Lid/dana/savings/model/SavingTopUpInitModel;", "onTopUpExceedLimitNonKyc", "message", "onTopUpSaving", "checkoutUrl", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMax implements setVideoCurTimeStamp.setMin {
        final /* synthetic */ SavingDetailActivity getMax;

        @JvmDefault
        public final void dismissProgress() {
        }

        @JvmDefault
        public final void showProgress() {
        }

        getMax(SavingDetailActivity savingDetailActivity) {
            this.getMax = savingDetailActivity;
        }

        public final void setMax(@NotNull onSurfaceTextureUpdated onsurfacetextureupdated) {
            Intrinsics.checkNotNullParameter(onsurfacetextureupdated, "savingTopUpInitModel");
            SavingDetailActivity.access$onClickTopUp(this.getMax, onsurfacetextureupdated);
        }

        public final void setMax(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "checkoutUrl");
            DanaH5.startContainerFullUrl(str);
            TouchInterceptFrameLayout.TapListener access$getTopUpSavingDialogFragment$p = this.getMax.isInside;
            if (access$getTopUpSavingDialogFragment$p != null) {
                access$getTopUpSavingDialogFragment$p.dismiss();
            }
            convertDipToPx.length length = new convertDipToPx.length(this.getMax.getApplicationContext());
            length.getMax = TrackerKey.Event.GOAL_SAVINGS_TOPUP_CREATION;
            length.setMin();
            convertDipToPx convertdiptopx = new convertDipToPx(length, (byte) 0);
            List length2 = convertdiptopx.length != null ? convertdiptopx.length.length : new ArrayList();
            genTextSelector.setMax((convertSpToPx[]) length2.toArray(new convertSpToPx[length2.size()]));
        }

        public final void length(@NotNull String str) {
            TextView textView;
            Intrinsics.checkNotNullParameter(str, "message");
            TouchInterceptFrameLayout.TapListener access$getTopUpSavingDialogFragment$p = this.getMax.isInside;
            if (!(access$getTopUpSavingDialogFragment$p == null || (textView = (TextView) access$getTopUpSavingDialogFragment$p.setMin(resetInternal.setMax.tv_warning_note)) == null)) {
                textView.setText(str);
            }
            TouchInterceptFrameLayout.TapListener access$getTopUpSavingDialogFragment$p2 = this.getMax.isInside;
            if (access$getTopUpSavingDialogFragment$p2 != null) {
                access$getTopUpSavingDialogFragment$p2.equals();
            }
        }

        public final void onError(@Nullable String str) {
            this.getMax.onError(str);
        }
    }

    public final void onError(@Nullable String str) {
        int max;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || 2041709390 == (max = dispatchOnCancelled.getMax(applicationContext, 2041709390)))) {
            onCanceled oncanceled = new onCanceled(2041709390, max, 512);
            onCancelLoad.setMax(2041709390, oncanceled);
            onCancelLoad.getMin(2041709390, oncanceled);
        }
        TouchInterceptFrameLayout.TapListener tapListener = this.isInside;
        if (tapListener != null) {
            tapListener.dismiss();
        }
        Window window = getWindow();
        Intrinsics.checkNotNullExpressionValue(window, "window");
        View findViewById = window.getDecorView().findViewById(16908290);
        Intrinsics.checkNotNullExpressionValue(findViewById, "window.decorView.findVie…yId(android.R.id.content)");
        setProgressViewOffset.setMax setmax = new setProgressViewOffset.setMax((ViewGroup) findViewById);
        setmax.getMax = str;
        setmax.setMax = getString(R.string.pop_up_positive_button_saving_limit_info);
        setmax.toIntRange = 0;
        setmax.setMin = R.drawable.ic_warning_orange;
        setmax.getMin = R.drawable.bg_rectangle_tangerine;
        setmax.length = new hashCode(this);
        setProgressViewOffset max2 = setmax.getMax();
        this.getMin = max2;
        if (max2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("customSnackBar");
        }
        max2.show();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class hashCode implements View.OnClickListener {
        final /* synthetic */ SavingDetailActivity getMax;

        hashCode(SavingDetailActivity savingDetailActivity) {
            this.getMax = savingDetailActivity;
        }

        public final void onClick(View view) {
            SavingDetailActivity.access$getCustomSnackBar$p(this.getMax).dismiss();
        }
    }

    public final void onResume() {
        SavingModel savingModel;
        String str;
        SavingModel savingModel2;
        MoneyViewModel moneyViewModel;
        int length2;
        int min;
        Context baseContext = getBaseContext();
        String str2 = null;
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length2 = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length2)))) {
            onCanceled oncanceled = new onCanceled(length2, min, 32);
            onCancelLoad.setMax(1964607727, oncanceled);
            onCancelLoad.getMin(1964607727, oncanceled);
        }
        super.onResume();
        SavingDetailModel savingDetailModel = this.equals;
        if (!(savingDetailModel == null || (savingModel2 = savingDetailModel.getMin) == null || (moneyViewModel = savingModel2.length) == null)) {
            str2 = moneyViewModel.setMin;
        }
        setMax(Intrinsics.areEqual((Object) str2, (Object) "0"));
        SavingDetailModel savingDetailModel2 = this.equals;
        if (savingDetailModel2 != null && (savingModel = savingDetailModel2.getMin) != null && (str = savingModel.getMax) != null) {
            SightCameraView.BufferType bufferType = this.savingDetailPresenter;
            if (bufferType == null) {
                Intrinsics.throwUninitializedPropertyAccessException("savingDetailPresenter");
            }
            bufferType.getMin(str);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "success", "", "onGetCheckoutH5EventSuccess"}, k = 3, mv = {1, 4, 2})
    static final class setMax implements GriverManifest.AnonymousClass22.length {
        final /* synthetic */ SavingDetailActivity setMax;

        setMax(SavingDetailActivity savingDetailActivity) {
            this.setMax = savingDetailActivity;
        }

        public final void setMin(boolean z) {
            this.setMax.toFloatRange = z;
        }
    }

    private final void getMax(SavingCategoryModel savingCategoryModel) {
        int length2;
        int min;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length2 = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length2)))) {
            onCanceled oncanceled = new onCanceled(length2, min, 32);
            onCancelLoad.setMax(-1235684589, oncanceled);
            onCancelLoad.getMin(-1235684589, oncanceled);
        }
        this.setMax = savingCategoryModel;
    }

    private final void setMin(SavingModel savingModel) {
        double d;
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(1042810242, oncanceled);
            onCancelLoad.getMin(1042810242, oncanceled);
        }
        getMin(CameraView.WrapperListener.getMin(savingModel), savingModel);
        length(savingModel.getMin);
        SavingCategoryModel savingCategoryModel = this.setMax;
        if (savingCategoryModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("savingCategoryModel");
        }
        setMax(savingCategoryModel.getMax(CameraView.WrapperListener.getMax(savingModel)));
        MoneyViewModel moneyViewModel = savingModel.length;
        TextView textView = (TextView) _$_findCachedViewById(resetInternal.setMax.getSwitchMinWidth);
        if (textView != null) {
            CurrencyAmountModel currencyAmountModel = new CurrencyAmountModel(moneyViewModel.setMin);
            currencyAmountModel.length = "IDR";
            textView.setText(setLineVisible.length(currencyAmountModel));
        }
        Intrinsics.checkNotNullParameter(savingModel, "$this$getDisplayDetailAmountPercentage");
        String cleanAll = isOriginHasAppInfo.getCleanAll(savingModel.length.setMin);
        if (cleanAll == null) {
            cleanAll = "0";
        }
        Long longOrNull = StringsKt.toLongOrNull(cleanAll);
        long j = 0;
        if ((longOrNull != null ? longOrNull.longValue() : 0) <= 0) {
            d = 1.0d;
        } else {
            Intrinsics.checkNotNullParameter(savingModel, "$this$getAmountPercentage");
            String cleanAll2 = isOriginHasAppInfo.getCleanAll(savingModel.length.setMin);
            if (cleanAll2 == null) {
                cleanAll2 = "0";
            }
            Long longOrNull2 = StringsKt.toLongOrNull(cleanAll2);
            long longValue = (longOrNull2 != null ? longOrNull2.longValue() : 0) * 100;
            String cleanAll3 = isOriginHasAppInfo.getCleanAll(savingModel.setMax.setMin);
            if (cleanAll3 == null) {
                cleanAll3 = "0";
            }
            Long longOrNull3 = StringsKt.toLongOrNull(cleanAll3);
            if (longOrNull3 != null) {
                j = longOrNull3.longValue();
            }
            d = (double) (longValue / j);
        }
        int i = (int) d;
        ProgressBar progressBar = (ProgressBar) _$_findCachedViewById(resetInternal.setMax.ActionBarOverlayLayout);
        if (progressBar != null) {
            progressBar.setProgress(i);
        }
        setMax(savingModel.setMax, savingModel);
        setMax(Intrinsics.areEqual((Object) savingModel.length.setMin, (Object) "0"));
    }

    private final void setMax(boolean z) {
        if (z) {
            TextView textView = (TextView) _$_findCachedViewById(resetInternal.setMax.getTitleMarginTop);
            if (textView != null) {
                textView.setVisibility(8);
                return;
            }
            return;
        }
        TextView textView2 = (TextView) _$_findCachedViewById(resetInternal.setMax.getTitleMarginTop);
        if (textView2 != null) {
            textView2.setVisibility(0);
        }
    }

    private final void getMin(boolean z, SavingModel savingModel) {
        int i = 0;
        if (z) {
            length(z);
            getMin(savingModel);
            setMenuRightButtonEnabled(false);
        }
        LinearLayout linearLayout = (LinearLayout) _$_findCachedViewById(resetInternal.setMax.setShortcutsVisible);
        if (linearLayout != null) {
            View view = linearLayout;
            boolean z2 = !z;
            Intrinsics.checkNotNullParameter(view, "<this>");
            view.setVisibility(z2 ? 0 : 8);
        }
        ProgressBar progressBar = (ProgressBar) _$_findCachedViewById(resetInternal.setMax.ActionBarOverlayLayout);
        if (progressBar != null) {
            View view2 = progressBar;
            boolean z3 = !z;
            Intrinsics.checkNotNullParameter(view2, "<this>");
            view2.setVisibility(z3 ? 0 : 8);
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) _$_findCachedViewById(resetInternal.setMax.getLastCustomNonConfigurationInstance);
        if (constraintLayout != null) {
            View view3 = constraintLayout;
            boolean z4 = !z;
            Intrinsics.checkNotNullParameter(view3, "<this>");
            view3.setVisibility(z4 ? 0 : 8);
        }
        RelativeLayout relativeLayout = (RelativeLayout) _$_findCachedViewById(resetInternal.setMax.setOverflowReserved);
        if (relativeLayout != null) {
            View view4 = relativeLayout;
            Intrinsics.checkNotNullParameter(view4, "<this>");
            view4.setVisibility(z ? 0 : 8);
        }
        ConstraintLayout constraintLayout2 = (ConstraintLayout) _$_findCachedViewById(resetInternal.setMax.sendCustomAction);
        if (constraintLayout2 != null) {
            View view5 = constraintLayout2;
            Intrinsics.checkNotNullParameter(view5, "<this>");
            if (!z) {
                i = 8;
            }
            view5.setVisibility(i);
        }
    }

    private final void length(boolean z) {
        int length2;
        int min;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length2 = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length2)))) {
            onCanceled oncanceled = new onCanceled(length2, min, 32);
            onCancelLoad.setMax(631973922, oncanceled);
            onCancelLoad.getMin(631973922, oncanceled);
        }
        TextView textView = (TextView) _$_findCachedViewById(resetInternal.setMax.CustomTabsIntent$ShareState);
        if (textView != null) {
            textView.setTextAlignment(z ? 4 : 2);
        }
    }

    private final void setMax(String str) {
        int length2;
        int min;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length2 = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length2)))) {
            onCanceled oncanceled = new onCanceled(length2, min, 32);
            onCancelLoad.setMax(-102104940, oncanceled);
            onCancelLoad.getMin(-102104940, oncanceled);
        }
        ImageView imageView = (ImageView) _$_findCachedViewById(resetInternal.setMax.setupDialog);
        if (imageView != null) {
            Popup.setMin(str, imageView, new invoke(this, str));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00060\u0006H\n¢\u0006\u0002\b\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", "optimizedUrl", "", "kotlin.jvm.PlatformType", "ivContainer", "Landroid/widget/ImageView;", "onUrlOptimized", "id/dana/savings/activity/SavingDetailActivity$setSavingIcon$1$1"}, k = 3, mv = {1, 4, 2})
    static final class invoke implements Popup.getMax {
        final /* synthetic */ String getMin;
        final /* synthetic */ SavingDetailActivity length;

        invoke(SavingDetailActivity savingDetailActivity, String str) {
            this.length = savingDetailActivity;
            this.getMin = str;
        }

        public final void setMin(String str, ImageView imageView) {
            new doDismissWithAnimation().getMax(this.length.getBaseContext(), imageView, str, 0, (setOnMenuWindowDismissListener.length) null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class equals implements View.OnClickListener {
        final /* synthetic */ SavingDetailActivity getMax;

        equals(SavingDetailActivity savingDetailActivity) {
            this.getMax = savingDetailActivity;
        }

        public final void onClick(View view) {
            SavingDetailActivity.access$onEditButtonClicked(this.getMax);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class IsOverlapping implements View.OnClickListener {
        final /* synthetic */ SavingDetailActivity getMax;

        IsOverlapping(SavingDetailActivity savingDetailActivity) {
            this.getMax = savingDetailActivity;
        }

        public final void onClick(View view) {
            SavingModel savingModel;
            String str;
            SavingDetailModel access$getSavingDetailModel$p = this.getMax.equals;
            if (access$getSavingDetailModel$p != null && (savingModel = access$getSavingDetailModel$p.getMin) != null && (str = savingModel.getMax) != null) {
                this.getMax.getSavingTopUpPresenter().getMax(str);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class toFloatRange implements View.OnClickListener {
        final /* synthetic */ SavingDetailActivity setMin;

        toFloatRange(SavingDetailActivity savingDetailActivity) {
            this.setMin = savingDetailActivity;
        }

        public final void onClick(View view) {
            SavingDetailActivity.access$showWithdrawalSavingBottomDialog(this.setMin);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "invoke", "id/dana/savings/activity/SavingDetailActivity$showWithdrawConfirmationBottomSheet$1$2"}, k = 3, mv = {1, 4, 2})
    static final class invokeSuspend extends Lambda implements Function0<Unit> {
        final /* synthetic */ MoneyViewModel $it;
        final /* synthetic */ SavingDetailActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        invokeSuspend(MoneyViewModel moneyViewModel, SavingDetailActivity savingDetailActivity) {
            super(0);
            this.$it = moneyViewModel;
            this.this$0 = savingDetailActivity;
        }

        public final void invoke() {
            String cleanAll = isOriginHasAppInfo.getCleanAll(this.$it.setMin);
            if (cleanAll == null) {
                cleanAll = "0";
            }
            Long longOrNull = StringsKt.toLongOrNull(cleanAll);
            if ((longOrNull != null ? longOrNull.longValue() : 0) > 0) {
                SavingDetailActivity.access$showWithdrawalSavingBottomDialog(this.this$0);
            } else {
                new onSucc(new SavingDetailActivity$Mean$Arithmetic(this.this$0)).show(this.this$0.getSupportFragmentManager(), "RemoveSavingGoalDialogFragment");
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0000"}, d2 = {"id/dana/savings/activity/SavingDetailActivity$showWithdrawalSavingBottomDialog$1$1", "Lid/dana/savings/withdrawal/WithdrawalSavingBottomSheetDialog$WithdrawListener;", "onClickWithdraw", "", "redirectUrl", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class valueOf implements WithdrawalSavingBottomSheetDialog.length {
        final /* synthetic */ WithdrawalSavingBottomSheetDialog getMax;
        final /* synthetic */ SavingDetailActivity setMin;

        valueOf(SavingDetailActivity savingDetailActivity, WithdrawalSavingBottomSheetDialog withdrawalSavingBottomSheetDialog) {
            this.setMin = savingDetailActivity;
            this.getMax = withdrawalSavingBottomSheetDialog;
        }

        public final void length(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, BranchLinkConstant.OauthParams.REDIRECT_URL);
            DanaH5.startContainerFullUrl(str, new values(this.setMin));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0000"}, d2 = {"id/dana/savings/activity/SavingDetailActivity$onClickTopUp$1$1", "Lid/dana/savings/view/TopUpSavingDialogFragment$TopUpListener;", "onClickTopUp", "", "fundAmount", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class toDoubleRange implements TouchInterceptFrameLayout.TapListener.setMax {
        final /* synthetic */ SavingDetailActivity setMax;

        toDoubleRange(SavingDetailActivity savingDetailActivity) {
            this.setMax = savingDetailActivity;
        }

        public final void setMin(@NotNull String str) {
            String str2;
            SavingModel savingModel;
            Intrinsics.checkNotNullParameter(str, "fundAmount");
            SavingDetailActivity savingDetailActivity = this.setMax;
            SavingDetailModel access$getSavingDetailModel$p = savingDetailActivity.equals;
            if (access$getSavingDetailModel$p == null || (savingModel = access$getSavingDetailModel$p.getMin) == null) {
                str2 = null;
            } else {
                str2 = savingModel.getMax;
            }
            if (str2 == null) {
                str2 = "";
            }
            SavingDetailActivity.access$requestTopUp(savingDetailActivity, str2, str);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0007"}, d2 = {"id/dana/savings/activity/SavingDetailActivity$initRecyclerView$1$1$1", "Lid/dana/richview/EndlessOnScrollListener;", "getDefaultThreshold", "", "onLoadMore", "", "app_productionRelease", "id/dana/savings/activity/SavingDetailActivity$$special$$inlined$apply$lambda$1"}, k = 1, mv = {1, 4, 2})
    public static final class isInside extends GriverCaptureActivity.AnonymousClass15 {
        final /* synthetic */ SavingDetailActivity getMin;
        final /* synthetic */ EmptyStateRecyclerView setMax;

        public final int setMax() {
            return 10;
        }

        isInside(EmptyStateRecyclerView emptyStateRecyclerView, SavingDetailActivity savingDetailActivity) {
            this.setMax = emptyStateRecyclerView;
            this.getMin = savingDetailActivity;
        }

        public final void getMax() {
            SavingDetailActivity.access$fetchMoreHistoryTopUp(this.getMin);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\f"}, d2 = {"id/dana/savings/activity/SavingDetailActivity$initRecyclerView$1$2", "Lid/dana/common/DividerItemDecoration;", "getItemOffsets", "", "outRect", "Landroid/graphics/Rect;", "view", "Landroid/view/View;", "parent", "Landroidx/recyclerview/widget/RecyclerView;", "state", "Landroidx/recyclerview/widget/RecyclerView$State;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class toIntRange extends setShadowResourceRight {
        final /* synthetic */ EmptyStateRecyclerView length;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        toIntRange(EmptyStateRecyclerView emptyStateRecyclerView, Context context, int i, float f) {
            super(context, i, f, 0);
            this.length = emptyStateRecyclerView;
        }

        public final void getItemOffsets(@NotNull Rect rect, @NotNull View view, @NotNull RecyclerView recyclerView, @NotNull RecyclerView$Mean$Arithmetic recyclerView$Mean$Arithmetic) {
            int i;
            Intrinsics.checkNotNullParameter(rect, "outRect");
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(recyclerView, "parent");
            Intrinsics.checkNotNullParameter(recyclerView$Mean$Arithmetic, "state");
            super.getItemOffsets(rect, view, recyclerView, recyclerView$Mean$Arithmetic);
            int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
            if (recyclerView$Mean$Arithmetic.equals) {
                i = recyclerView$Mean$Arithmetic.setMax - recyclerView$Mean$Arithmetic.getMax;
            } else {
                i = recyclerView$Mean$Arithmetic.setMin;
            }
            if (childAdapterPosition == i - 1) {
                rect.setEmpty();
            } else {
                super.getItemOffsets(rect, view, recyclerView, recyclerView$Mean$Arithmetic);
            }
        }
    }

    private final void length(String str) {
        int length2;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length2 = dispatchOnCancelled.length(applicationContext, 0)) == 0)) {
            onCanceled oncanceled = new onCanceled(0, length2, 4);
            onCancelLoad.setMax(-883876163, oncanceled);
            onCancelLoad.getMin(-883876163, oncanceled);
        }
        TextView textView = (TextView) _$_findCachedViewById(resetInternal.setMax.CustomTabsIntent$ShareState);
        if (textView != null) {
            textView.setText(str);
        }
    }

    private final void setMax(MoneyViewModel moneyViewModel, SavingModel savingModel) {
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(377903511, oncanceled);
            onCancelLoad.getMin(377903511, oncanceled);
        }
        TextView textView = (TextView) _$_findCachedViewById(resetInternal.setMax.onBind);
        if (textView != null) {
            String string = getString(R.string.saving_progress_text);
            Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.saving_progress_text)");
            Object[] objArr = new Object[2];
            Intrinsics.checkNotNullParameter(savingModel, "$this$getAmountPercentage");
            String cleanAll = isOriginHasAppInfo.getCleanAll(savingModel.length.setMin);
            String str = "0";
            if (cleanAll == null) {
                cleanAll = str;
            }
            Long longOrNull = StringsKt.toLongOrNull(cleanAll);
            long j = 0;
            long longValue = (longOrNull != null ? longOrNull.longValue() : 0) * 100;
            String cleanAll2 = isOriginHasAppInfo.getCleanAll(savingModel.setMax.setMin);
            if (cleanAll2 != null) {
                str = cleanAll2;
            }
            Long longOrNull2 = StringsKt.toLongOrNull(str);
            if (longOrNull2 != null) {
                j = longOrNull2.longValue();
            }
            objArr[0] = Integer.valueOf(MathKt.roundToInt((double) (longValue / j)));
            CurrencyAmountModel currencyAmountModel = new CurrencyAmountModel(moneyViewModel.setMin);
            currencyAmountModel.length = "IDR";
            objArr[1] = setLineVisible.length(currencyAmountModel);
            String format = String.format(string, Arrays.copyOf(objArr, 2));
            Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(this, *args)");
            textView.setText(format);
        }
    }

    private final void getMin(SavingModel savingModel) {
        TextView textView = (TextView) _$_findCachedViewById(resetInternal.setMax.setApplicationContext);
        if (textView != null) {
            MoneyViewModel moneyViewModel = savingModel.setMax;
            StringBuilder sb = new StringBuilder();
            sb.append(moneyViewModel.getMin);
            sb.append(moneyViewModel.setMin);
            textView.setText(getString(R.string.goal_achieved_detail_title, new Object[]{sb.toString()}));
        }
        TextView textView2 = (TextView) _$_findCachedViewById(resetInternal.setMax.CustomTabsIntent$ColorScheme);
        if (textView2 != null) {
            Object[] objArr = new Object[1];
            String str = savingModel.equals;
            String str2 = savingModel.IsOverlapping;
            if (this.savingDetailPresenter == null) {
                Intrinsics.throwUninitializedPropertyAccessException("savingDetailPresenter");
            }
            objArr[0] = Long.valueOf(SightCameraView.BufferType.length(String.valueOf(str), String.valueOf(str2)));
            textView2.setText(getString(R.string.goal_achieved_detail, objArr));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "position", "", "onItemClick"}, k = 3, mv = {1, 4, 2})
    static final class length implements Ignore.setMin {
        final /* synthetic */ SavingDetailActivity getMax;

        length(SavingDetailActivity savingDetailActivity) {
            this.getMax = savingDetailActivity;
        }

        public final void length(int i) {
            TopUpModel topUpModel = (TopUpModel) SavingDetailActivity.access$getHistoryAdapter$p(this.getMax).setMin(i);
            int i2 = topUpModel.getMin;
            if (i2 == 0) {
                SavingDetailActivity savingDetailActivity = this.getMax;
                DanaH5.startContainerFullUrl(SavingDetailActivity.access$getTransactionDetailContentUrl(savingDetailActivity, topUpModel.setMax));
            } else if (i2 == 2) {
                SavingDetailActivity.access$fetchMoreHistoryTopUp(this.getMax);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J*\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00042\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0015J\u001e\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0019R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eXT¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lid/dana/savings/activity/SavingDetailActivity$Companion;", "", "()V", "ACTION", "", "DEFAUL_THRESHOLD", "", "EXTRA_REVOKED_SAVING", "EXTRA_SAVING", "GOALS_ID", "MIN_HISTORY_TOP_UP_ITEMS", "REQUEST_CODE_EDIT_SAVING", "TOP_UP", "TOP_UP_VIEW_SIZE", "", "startActivity", "", "activity", "Lid/dana/base/BaseActivity;", "goalsId", "params", "", "startActivityForResult", "requestCode", "savingModel", "Lid/dana/savings/model/SavingModel;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMin {
        private getMin() {
        }

        public /* synthetic */ getMin(byte b) {
            this();
        }

        public static void setMax(@NotNull BaseActivity baseActivity, @NotNull SavingModel savingModel) {
            Intrinsics.checkNotNullParameter(baseActivity, AkuEventParamsKey.KEY_ACTIVITY);
            Intrinsics.checkNotNullParameter(savingModel, "savingModel");
            Intent intentClassWithTracking = baseActivity.getIntentClassWithTracking(SavingDetailActivity.class);
            intentClassWithTracking.putExtra(SavingCreateActivity.EXTRA_SAVING, savingModel);
            baseActivity.startActivityForResult(intentClassWithTracking, 2003);
        }

        public static void setMax(@NotNull BaseActivity baseActivity, @NotNull String str, @NotNull Map<String, String> map) {
            Intrinsics.checkNotNullParameter(baseActivity, AkuEventParamsKey.KEY_ACTIVITY);
            Intrinsics.checkNotNullParameter(str, "goalsId");
            Intrinsics.checkNotNullParameter(map, "params");
            Intent putExtra = baseActivity.getIntentClassWithTracking(SavingDetailActivity.class).putExtra("goals_id", str);
            Intrinsics.checkNotNullExpressionValue(putExtra, "activity.getIntentClassW…tExtra(GOALS_ID, goalsId)");
            String str2 = map.get("action");
            if (str2 != null) {
                if (!(str2.length() > 0)) {
                    str2 = null;
                }
                if (str2 != null) {
                    putExtra.putExtra("action", str2);
                }
            }
            baseActivity.startActivity(putExtra);
        }
    }

    public static final /* synthetic */ getInsetDodgeRect access$getPageSkeleton$p(SavingDetailActivity savingDetailActivity) {
        return (getInsetDodgeRect) savingDetailActivity.IsOverlapping.getValue();
    }

    public static final /* synthetic */ void access$setSavingDetailModel$p(SavingDetailActivity savingDetailActivity, SavingDetailModel savingDetailModel) {
        List<TopUpModel> list;
        SavingModel savingModel;
        SavingModel savingModel2;
        SavingCategoryModel savingCategoryModel;
        savingDetailActivity.equals = savingDetailModel;
        if (!(savingDetailModel == null || (savingModel2 = savingDetailModel.getMin) == null || (savingCategoryModel = savingModel2.toIntRange) == null)) {
            savingDetailActivity.getMax(savingCategoryModel);
        }
        SavingDetailModel savingDetailModel2 = savingDetailActivity.equals;
        if (!(savingDetailModel2 == null || (savingModel = savingDetailModel2.getMin) == null)) {
            savingDetailActivity.setMin(savingModel);
        }
        SavingDetailModel savingDetailModel3 = savingDetailActivity.equals;
        if (savingDetailModel3 != null && (list = savingDetailModel3.setMin) != null) {
            notifyCameraOpen notifycameraopen = savingDetailActivity.getMax;
            if (notifycameraopen == null) {
                Intrinsics.throwUninitializedPropertyAccessException("historyAdapter");
            }
            notifycameraopen.getMin(list);
        }
    }

    public static final /* synthetic */ void access$finishRevokeGoalSaving(SavingDetailActivity savingDetailActivity) {
        savingDetailActivity.setResult(1002);
        savingDetailActivity.finish();
    }

    public static final /* synthetic */ int access$getLastItemPosition(SavingDetailActivity savingDetailActivity) {
        notifyCameraOpen notifycameraopen = savingDetailActivity.getMax;
        if (notifycameraopen == null) {
            Intrinsics.throwUninitializedPropertyAccessException("historyAdapter");
        }
        return notifycameraopen.getItemCount() - 1;
    }

    public static final /* synthetic */ void access$onClickTopUp(SavingDetailActivity savingDetailActivity, onSurfaceTextureUpdated onsurfacetextureupdated) {
        if (onsurfacetextureupdated != null) {
            TouchInterceptFrameLayout.TapListener tapListener = new TouchInterceptFrameLayout.TapListener();
            savingDetailActivity.isInside = tapListener;
            if (tapListener != null) {
                tapListener.getMax = onsurfacetextureupdated;
            }
            TouchInterceptFrameLayout.TapListener tapListener2 = savingDetailActivity.isInside;
            if (tapListener2 != null) {
                TouchInterceptFrameLayout.TapListener.setMax todoublerange = new toDoubleRange(savingDetailActivity);
                Intrinsics.checkNotNullParameter(todoublerange, "<set-?>");
                tapListener2.getMin = todoublerange;
            }
            TouchInterceptFrameLayout.TapListener tapListener3 = savingDetailActivity.isInside;
            if (tapListener3 != null) {
                tapListener3.show(savingDetailActivity.getSupportFragmentManager(), "TopUpDialogFragment");
            }
        }
    }

    public static final /* synthetic */ void access$onEditButtonClicked(SavingDetailActivity savingDetailActivity) {
        SavingModel savingModel;
        SavingDetailModel savingDetailModel = savingDetailActivity.equals;
        if (savingDetailModel != null && (savingModel = savingDetailModel.getMin) != null) {
            SavingUpdateActivity.setMax setmax = SavingUpdateActivity.Companion;
            SavingUpdateActivity.setMax.setMin(savingDetailActivity, 1000, savingModel);
        }
    }

    public static final /* synthetic */ void access$revokeSaving(SavingDetailActivity savingDetailActivity) {
        SavingModel savingModel;
        String str;
        SavingDetailModel savingDetailModel = savingDetailActivity.equals;
        if (savingDetailModel != null && (savingModel = savingDetailModel.getMin) != null && (str = savingModel.getMax) != null) {
            SightCameraView.BufferType bufferType = savingDetailActivity.savingDetailPresenter;
            if (bufferType == null) {
                Intrinsics.throwUninitializedPropertyAccessException("savingDetailPresenter");
            }
            Intrinsics.checkNotNullParameter(str, "savingId");
            bufferType.setMax.showProgress();
            bufferType.setMin.execute(str, new SightCameraView.BufferType.length(bufferType), new SightCameraView.BufferType.toFloatRange(bufferType));
        }
    }

    public static final /* synthetic */ void access$onOpenH5Withdraw(SavingDetailActivity savingDetailActivity) {
        savingDetailActivity.toFloatRange = false;
        GriverManifest.AnonymousClass22.getMin getmin = savingDetailActivity.checkoutH5EventPresenter;
        if (getmin == null) {
            Intrinsics.throwUninitializedPropertyAccessException("checkoutH5EventPresenter");
        }
        getmin.getMin();
    }

    public static final /* synthetic */ void access$fetchMoreHistoryTopUp(SavingDetailActivity savingDetailActivity) {
        SavingModel savingModel;
        SavingDetailModel savingDetailModel = savingDetailActivity.equals;
        if (savingDetailModel != null) {
            if (!(savingDetailModel.setMin() && !savingDetailActivity.toIntRange)) {
                savingDetailModel = null;
            }
            if (savingDetailModel != null && (savingModel = savingDetailModel.getMin) != null) {
                savingDetailActivity.toIntRange = true;
                notifyCameraOpen notifycameraopen = savingDetailActivity.getMax;
                if (notifycameraopen == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("historyAdapter");
                }
                notifycameraopen.getMax(new TopUpModel((String) null, (MoneyViewModel) null, (String) null, (String) null, (String) null, (Map) null, 1, 63));
                SightCameraView.BufferType bufferType = savingDetailActivity.savingDetailPresenter;
                if (bufferType == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("savingDetailPresenter");
                }
                String str = savingModel.getMax;
                if (savingDetailActivity.savingDetailPresenter == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("savingDetailPresenter");
                }
                Intrinsics.checkNotNullParameter(str, "savingId");
                bufferType.getMin.execute(new Beacon.Builder.setMax(str, (long) bufferType.getMax, 20), new SightCameraView.BufferType.getMax(bufferType), new SightCameraView.BufferType.getMin(bufferType));
            }
        }
    }

    public static final /* synthetic */ String access$getTransactionDetailContentUrl(SavingDetailActivity savingDetailActivity, String str) {
        StringBuilder sb = new StringBuilder("https://m.dana.id");
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String format = String.format("/m/portal/transaction?bizOrderId=%s&isClosable=true", Arrays.copyOf(new Object[]{str}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
        sb.append(format);
        return sb.toString();
    }
}
