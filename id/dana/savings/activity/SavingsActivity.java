package id.dana.savings.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import id.dana.R;
import id.dana.base.EmptyStateRecyclerView;
import id.dana.component.buttoncomponent.DanaButtonPrimaryView;
import id.dana.component.buttoncomponent.DanaButtonSecondaryView;
import id.dana.danah5.DanaH5;
import id.dana.di.modules.BottomSheetOnBoardingModule;
import id.dana.di.modules.SavingConfigModule;
import id.dana.di.modules.SavingModule;
import id.dana.dialog.DialogWithImage;
import id.dana.domain.usereducation.BottomSheetOnBoardingScenario;
import id.dana.nearbyme.merchantdetail.model.MoneyViewModel;
import id.dana.savings.activity.SavingCreateActivity;
import id.dana.savings.activity.SavingDetailActivity;
import id.dana.savings.model.SavingDetailModel;
import id.dana.savings.model.SavingModel;
import id.dana.savings.view.TotalSavingAmountView;
import id.dana.usereducation.model.ContentOnBoardingModel;
import java.util.ArrayList;
import java.util.Arrays;
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
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o.CameraView;
import o.CaptureBtn;
import o.CornerMarkingDataProvider;
import o.Ignore;
import o.IntRange;
import o.PrepareException;
import o.SightCameraView;
import o.SlidingPaneLayout;
import o.dispatchOnCancelled;
import o.getInsetDodgeRect;
import o.getPreParsedPackage;
import o.getProgressViewStartOffset;
import o.getRegionExitPeriod;
import o.isOriginHasAppInfo;
import o.notifyError;
import o.notifyPrepared;
import o.notifySdcardError;
import o.onCancelLoad;
import o.onCanceled;
import o.onDelete;
import o.onDetachedFromLayoutParams;
import o.onSurfaceTextureSizeChanged;
import o.resetInternal;
import o.setCancelText;
import o.setProgressViewOffset;
import o.stopIgnoring;
import o.updateCornerMarking;
import o.updateScreenRotation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000¼\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 q2\u00020\u0001:\u0001qB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\"\u001a\u00020#H\u0014J\u0010\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'H\u0002J\u0010\u0010(\u001a\u00020%2\u0006\u0010)\u001a\u00020'H\u0002J,\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010-2\b\u0010.\u001a\u0004\u0018\u00010%2\u0006\u0010/\u001a\u00020+2\u0006\u00100\u001a\u00020+H\u0002J\b\u00101\u001a\u00020+H\u0016J\u000e\u00102\u001a\b\u0012\u0004\u0012\u00020403H\u0016J\b\u00105\u001a\u00020%H\u0016J\b\u00106\u001a\u00020%H\u0016J\b\u00107\u001a\u00020%H\u0016J\b\u00108\u001a\u000209H\u0002J\b\u0010:\u001a\u00020;H\u0002J\b\u0010<\u001a\u00020#H\u0002J\b\u0010=\u001a\u00020>H\u0002J\b\u0010?\u001a\u00020#H\u0002J\b\u0010@\u001a\u00020#H\u0016J\b\u0010A\u001a\u00020#H\u0002J\b\u0010B\u001a\u00020#H\u0002J\b\u0010C\u001a\u00020#H\u0002J\b\u0010D\u001a\u00020#H\u0002J\b\u0010E\u001a\u00020FH\u0002J\b\u0010G\u001a\u00020FH\u0002J\"\u0010H\u001a\u00020#2\u0006\u0010I\u001a\u00020+2\u0006\u0010J\u001a\u00020+2\b\u0010K\u001a\u0004\u0018\u00010LH\u0014J\b\u0010M\u001a\u00020#H\u0002J\b\u0010N\u001a\u00020#H\u0014J\u0010\u0010O\u001a\u00020#2\u0006\u0010P\u001a\u00020%H\u0002J\b\u0010Q\u001a\u00020#H\u0002J\u0010\u0010R\u001a\u00020#2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0016\u0010S\u001a\u00020#2\f\u0010T\u001a\b\u0012\u0004\u0012\u00020U03H\u0002J\u0010\u0010V\u001a\u00020#2\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u0016\u0010W\u001a\u00020#2\f\u0010X\u001a\b\u0012\u0004\u0012\u00020'03H\u0002J\u0010\u0010Y\u001a\u00020#2\u0006\u0010Z\u001a\u00020+H\u0002J\u0010\u0010[\u001a\u00020#2\u0006\u0010\\\u001a\u00020FH\u0002J\u0010\u0010]\u001a\u00020#2\u0006\u0010^\u001a\u00020%H\u0002J\u0006\u0010_\u001a\u00020#J\u0010\u0010`\u001a\u00020#2\u0006\u0010a\u001a\u00020FH\u0002J\b\u0010b\u001a\u00020#H\u0002J\b\u0010c\u001a\u00020#H\u0002J\f\u0010d\u001a\u00020#*\u00020LH\u0002J\u0014\u0010e\u001a\u00020#*\u00020f2\u0006\u0010g\u001a\u00020+H\u0002J\u0014\u0010e\u001a\u00020#*\u00020f2\u0006\u0010g\u001a\u00020%H\u0002J\f\u0010h\u001a\u00020#*\u00020LH\u0002J\u001c\u0010i\u001a\u00020#*\u00020j2\u0006\u0010k\u001a\u00020l2\u0006\u0010m\u001a\u00020FH\u0002J\f\u0010n\u001a\u00020#*\u00020oH\u0002J\f\u0010p\u001a\u00020#*\u00020'H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX.¢\u0006\u0002\n\u0000R\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0011\u001a\u00020\u00128\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0019\u001a\u00020\u001a8BX\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001b\u0010\u001cR\u001b\u0010\u001f\u001a\u00020\u001a8BX\u0002¢\u0006\f\n\u0004\b!\u0010\u001e\u001a\u0004\b \u0010\u001c¨\u0006r"}, d2 = {"Lid/dana/savings/activity/SavingsActivity;", "Lid/dana/savings/activity/OnBoardingActivity;", "()V", "customSnackBar", "Lid/dana/component/customsnackbarcomponent/CustomSnackbar;", "savingAdapter", "Lid/dana/savings/adapter/SavingAdapter;", "savingBenefitAdapter", "Lid/dana/savings/adapter/SavingBenefitAdapter;", "savingConfigPresenter", "Lid/dana/savings/presenter/SavingConfigPresenter;", "getSavingConfigPresenter", "()Lid/dana/savings/presenter/SavingConfigPresenter;", "setSavingConfigPresenter", "(Lid/dana/savings/presenter/SavingConfigPresenter;)V", "savingEmptyStateModel", "Lid/dana/savings/model/SavingEmptyStateModel;", "savingPresenter", "Lid/dana/savings/contract/SavingContract$Presenter;", "getSavingPresenter", "()Lid/dana/savings/contract/SavingContract$Presenter;", "setSavingPresenter", "(Lid/dana/savings/contract/SavingContract$Presenter;)V", "savingSummaryModel", "Lid/dana/savings/model/SavingSummaryModel;", "skeletonGoalList", "Lcom/ethanhua/skeleton/SkeletonScreen;", "getSkeletonGoalList", "()Lcom/ethanhua/skeleton/SkeletonScreen;", "skeletonGoalList$delegate", "Lkotlin/Lazy;", "skeletonTotalAmount", "getSkeletonTotalAmount", "skeletonTotalAmount$delegate", "configToolbar", "", "getGoalCratedSuccessString", "", "createdSaving", "Lid/dana/savings/model/SavingModel;", "getGoalRevokedSuccessString", "revokedSaving", "getItemHeight", "", "context", "Landroid/content/Context;", "text", "textSize", "deviceWidth", "getLayout", "getOnBoardingContents", "", "Lid/dana/usereducation/model/ContentOnBoardingModel;", "getOnBoardingListViewTitleStringRes", "getOnBoardingPageViewTitleStringRes", "getOnBoardingScenario", "getOnItemClickListener", "Lid/dana/base/BaseRecyclerViewHolder$OnItemClickListener;", "getSavingConfigModule", "Lid/dana/di/modules/SavingConfigModule;", "getSavingEmptyState", "getSavingModule", "Lid/dana/di/modules/SavingModule;", "getSavingSummary", "init", "initBenefitRecyclerView", "initButton", "initComponent", "initRecyclerView", "isExceedAmountLimit", "", "isExceedItemLimit", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onBtnAddClicked", "onResume", "openH5Container", "url", "openKycContainer", "setEmptyState", "setSavingBenefit", "savingBenefit", "Lid/dana/savings/model/SavingBenefitModel;", "setSavingSummary", "setSavings", "savings", "setTotalSavingAmount", "amount", "showEmptyState", "isEmpty", "showErrorSnackbar", "errorMessage", "showSavingLimitDialog", "showShimmer", "show", "showUpgradeToKycDialog", "startSavingCreateActivity", "checkSavingCreated", "loadImage", "Landroid/widget/ImageView;", "icon", "onSavingRevoked", "setVisibilityOnScrollable", "Lid/dana/component/buttoncomponent/DanaButtonSecondaryView;", "nestedScrollView", "Landroidx/core/widget/NestedScrollView;", "showWhenScrollable", "showRevokeSavingSuccessNotification", "Lid/dana/savings/model/SavingDetailModel;", "showSuccessSavingGoalNotification", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class SavingsActivity extends OnBoardingActivity {
    public static final int BENEFIT_DESC_SIZE = 12;
    public static final int BENEFIT_TITLE_SIZE = 14;
    @NotNull
    public static final setMax Companion = new setMax((byte) 0);
    public static final int REQUEST_CODE_CREATE_SAVING = 2002;
    public static final int REQUEST_CODE_DETAIL_SAVING = 2003;
    public static final int RV_BENEFIT_WIDTH = 140;
    public static final int SHIMMER_ANGLE = 20;
    public static final int SHIMMER_DURATION = 1500;
    public static final int SHIMMER_ITEM_COUNT = 1;
    private HashMap IsOverlapping;
    private final Lazy equals = LazyKt.lazy(new SavingsActivity$FastBitmap$CoordinateSystem(this));
    /* access modifiers changed from: private */
    public notifyError getMax;
    /* access modifiers changed from: private */
    public SightCameraView getMin;
    /* access modifiers changed from: private */
    public setProgressViewOffset isInside;
    @Inject
    public SightCameraView.OnRecordListener savingConfigPresenter;
    @Inject
    public updateScreenRotation.setMin savingPresenter;
    private onSurfaceTextureSizeChanged setMax;
    private final Lazy toFloatRange = LazyKt.lazy(new values(this));
    private notifySdcardError toIntRange;

    private final onDetachedFromLayoutParams getMax() {
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(-2045363713, oncanceled);
            onCancelLoad.getMin(-2045363713, oncanceled);
        }
        return (onDetachedFromLayoutParams) this.toFloatRange.getValue();
    }

    @JvmStatic
    public static final void startActivity(@Nullable Activity activity) {
        setMax.setMin(activity);
    }

    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.IsOverlapping;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public final View _$_findCachedViewById(int i) {
        if (this.IsOverlapping == null) {
            this.IsOverlapping = new HashMap();
        }
        View view = (View) this.IsOverlapping.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.IsOverlapping.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final int getLayout() {
        return R.layout.activity_savings;
    }

    @NotNull
    public final String getOnBoardingScenario() {
        int length2;
        int min;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (applicationContext == null || (length2 = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length2))) {
            return BottomSheetOnBoardingScenario.SAVING_GOAL;
        }
        onCanceled oncanceled = new onCanceled(length2, min, 32);
        onCancelLoad.setMax(1604565598, oncanceled);
        onCancelLoad.getMin(1604565598, oncanceled);
        return BottomSheetOnBoardingScenario.SAVING_GOAL;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class toFloatRange extends Lambda implements Function1<View, Unit> {
        final /* synthetic */ SavingsActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        toFloatRange(SavingsActivity savingsActivity) {
            super(1);
            this.this$0 = savingsActivity;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((View) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "it");
            SavingsActivity.access$openKycContainer(this.this$0);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class toIntRange extends Lambda implements Function1<View, Unit> {
        public static final toIntRange INSTANCE = new toIntRange();

        toIntRange() {
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

    public static final /* synthetic */ setProgressViewOffset access$getCustomSnackBar$p(SavingsActivity savingsActivity) {
        setProgressViewOffset setprogressviewoffset = savingsActivity.isInside;
        if (setprogressviewoffset == null) {
            Intrinsics.throwUninitializedPropertyAccessException("customSnackBar");
        }
        return setprogressviewoffset;
    }

    public static final /* synthetic */ notifyError access$getSavingAdapter$p(SavingsActivity savingsActivity) {
        notifyError notifyerror = savingsActivity.getMax;
        if (notifyerror == null) {
            Intrinsics.throwUninitializedPropertyAccessException("savingAdapter");
        }
        return notifyerror;
    }

    public static final /* synthetic */ void access$openKycContainer(SavingsActivity savingsActivity) {
        int length2;
        int min;
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(-410035719, oncanceled);
            onCancelLoad.getMin(-410035719, oncanceled);
        }
        Context baseContext = savingsActivity.getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length2 = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length2)))) {
            onCanceled oncanceled2 = new onCanceled(length2, min, 32);
            onCancelLoad.setMax(-410035719, oncanceled2);
            onCancelLoad.getMin(-410035719, oncanceled2);
        }
        DanaH5.startContainerFullUrl("https://m.dana.id/m/kyc/landingPage?entryPoint=goalSaving");
    }

    public static final /* synthetic */ void access$setEmptyState(SavingsActivity savingsActivity, onSurfaceTextureSizeChanged onsurfacetexturesizechanged) {
        int length2;
        int min;
        int length3;
        int min2;
        int length4;
        int min3;
        Context baseContext = savingsActivity.getBaseContext();
        Context context = null;
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length4 = applicationContext.fileList().length) == (min3 = dispatchOnCancelled.getMin(applicationContext, length4)))) {
            onCanceled oncanceled = new onCanceled(length4, min3, 32);
            onCancelLoad.setMax(-226630946, oncanceled);
            onCancelLoad.getMin(-226630946, oncanceled);
        }
        savingsActivity.setMax = onsurfacetexturesizechanged;
        List<CaptureBtn.AnonymousClass1> list = onsurfacetexturesizechanged.setMax;
        int i = 0;
        for (CaptureBtn.AnonymousClass1 next : list) {
            Context context2 = savingsActivity;
            Context baseContext2 = savingsActivity.getBaseContext();
            Intrinsics.checkNotNullExpressionValue(baseContext2, "baseContext");
            int max = getMax(context2, CornerMarkingDataProvider.AnonymousClass3.setMin(baseContext2, next.setMax, next.setMax), 14, (int) (Resources.getSystem().getDisplayMetrics().density * 140.0f));
            Context baseContext3 = savingsActivity.getBaseContext();
            Intrinsics.checkNotNullExpressionValue(baseContext3, "baseContext");
            int max2 = max + getMax(context2, CornerMarkingDataProvider.AnonymousClass3.setMin(baseContext3, next.getMin, next.getMin), 12, (int) (Resources.getSystem().getDisplayMetrics().density * 140.0f));
            if (max2 > i) {
                i = max2;
            }
        }
        notifySdcardError notifysdcarderror = savingsActivity.toIntRange;
        if (notifysdcarderror == null) {
            Intrinsics.throwUninitializedPropertyAccessException("savingBenefitAdapter");
        }
        notifysdcarderror.getMin(list);
        notifySdcardError notifysdcarderror2 = savingsActivity.toIntRange;
        if (notifysdcarderror2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("savingBenefitAdapter");
        }
        int max3 = dispatchOnCancelled.setMax(i);
        if (i != max3) {
            onCanceled oncanceled2 = new onCanceled(i, max3, 1);
            onCancelLoad.setMax(665255053, oncanceled2);
            onCancelLoad.getMin(665255053, oncanceled2);
        }
        notifysdcarderror2.getMax = i;
        TextView textView = (TextView) savingsActivity._$_findCachedViewById(resetInternal.setMax.setShowText);
        if (textView != null) {
            Context baseContext4 = savingsActivity.getBaseContext();
            Intrinsics.checkNotNullExpressionValue(baseContext4, "baseContext");
            textView.setText(CornerMarkingDataProvider.AnonymousClass3.setMin(baseContext4, onsurfacetexturesizechanged.setMin.setMin, onsurfacetexturesizechanged.setMin.setMin));
        }
        TextView textView2 = (TextView) savingsActivity._$_findCachedViewById(resetInternal.setMax.getShowText);
        if (textView2 != null) {
            Context baseContext5 = savingsActivity.getBaseContext();
            Intrinsics.checkNotNullExpressionValue(baseContext5, "baseContext");
            textView2.setText(CornerMarkingDataProvider.AnonymousClass3.setMin(baseContext5, onsurfacetexturesizechanged.setMin.getMax, onsurfacetexturesizechanged.setMin.getMax));
        }
        Context baseContext6 = savingsActivity.getBaseContext();
        Intrinsics.checkNotNullExpressionValue(baseContext6, "baseContext");
        int length5 = CornerMarkingDataProvider.AnonymousClass3.length(baseContext6, onsurfacetexturesizechanged.setMin.setMax);
        if (length5 > 0) {
            ImageView imageView = (ImageView) savingsActivity._$_findCachedViewById(resetInternal.setMax.createRadioButton);
            if (imageView != null) {
                Context baseContext7 = savingsActivity.getBaseContext();
                if (baseContext7 != null) {
                    context = baseContext7.getApplicationContext();
                }
                if (!(context == null || (length3 = context.fileList().length) == (min2 = dispatchOnCancelled.getMin(context, length3)))) {
                    onCanceled oncanceled3 = new onCanceled(length3, min2, 32);
                    onCancelLoad.setMax(1951397779, oncanceled3);
                    onCancelLoad.getMin(1951397779, oncanceled3);
                }
                Context context3 = imageView.getContext();
                if (context3 != null) {
                    ((updateCornerMarking) Glide.getMax(context3)).length(Integer.valueOf(length5)).setMax((int) R.drawable.ic_savings_empty).setMin((int) R.drawable.ic_savings_empty).length(imageView);
                    return;
                }
                return;
            }
            return;
        }
        ImageView imageView2 = (ImageView) savingsActivity._$_findCachedViewById(resetInternal.setMax.createRadioButton);
        if (imageView2 != null) {
            String str = onsurfacetexturesizechanged.setMin.setMax;
            Context baseContext8 = savingsActivity.getBaseContext();
            if (baseContext8 != null) {
                context = baseContext8.getApplicationContext();
            }
            if (!(context == null || (length2 = context.fileList().length) == (min = dispatchOnCancelled.getMin(context, length2)))) {
                onCanceled oncanceled4 = new onCanceled(length2, min, 32);
                onCancelLoad.setMax(-678108726, oncanceled4);
                onCancelLoad.getMin(-678108726, oncanceled4);
            }
            Context context4 = imageView2.getContext();
            if (context4 != null) {
                ((updateCornerMarking) Glide.getMax(context4)).setMax(str).setMax((int) R.drawable.ic_savings_empty).setMin((int) R.drawable.ic_savings_empty).length(imageView2);
            }
        }
    }

    public static final /* synthetic */ void access$setSavings(SavingsActivity savingsActivity, List list) {
        TextView textView;
        MoneyViewModel moneyViewModel;
        int i = 0;
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(-70405957, oncanceled);
            onCancelLoad.getMin(-70405957, oncanceled);
        }
        notifyError notifyerror = savingsActivity.getMax;
        if (notifyerror == null) {
            Intrinsics.throwUninitializedPropertyAccessException("savingAdapter");
        }
        notifyerror.getMin(list);
        boolean isEmpty = list.isEmpty();
        LinearLayout linearLayout = (LinearLayout) savingsActivity._$_findCachedViewById(resetInternal.setMax.findItemWithShortcutForKey);
        if (linearLayout != null) {
            View view = linearLayout;
            Intrinsics.checkNotNullParameter(view, "<this>");
            view.setVisibility(isEmpty ? 0 : 8);
        }
        NestedScrollView nestedScrollView = (NestedScrollView) savingsActivity._$_findCachedViewById(resetInternal.setMax.killMode);
        if (nestedScrollView != null) {
            View view2 = nestedScrollView;
            boolean z = !isEmpty;
            Intrinsics.checkNotNullParameter(view2, "<this>");
            view2.setVisibility(z ? 0 : 8);
        }
        NestedScrollView nestedScrollView2 = (NestedScrollView) savingsActivity._$_findCachedViewById(resetInternal.setMax.killMode);
        if (nestedScrollView2 == null || nestedScrollView2.getVisibility() != 0) {
            View _$_findCachedViewById = savingsActivity._$_findCachedViewById(resetInternal.setMax.isInTouchMode);
            if (!(_$_findCachedViewById == null || (textView = (TextView) _$_findCachedViewById.findViewById(resetInternal.setMax.getOverflowIcon)) == null)) {
                View view3 = textView;
                Intrinsics.checkNotNullParameter(view3, "<this>");
                view3.setVisibility(8);
            }
            TotalSavingAmountView totalSavingAmountView = (TotalSavingAmountView) savingsActivity._$_findCachedViewById(resetInternal.setMax.onTransitionTrigger);
            if (totalSavingAmountView != null) {
                View view4 = totalSavingAmountView;
                Intrinsics.checkNotNullParameter(view4, "<this>");
                view4.setVisibility(8);
            }
        } else {
            savingsActivity.setMenuRightButton((int) R.drawable.ic_tooltip_help);
            SightCameraView sightCameraView = savingsActivity.getMin;
            if (!(sightCameraView == null || (moneyViewModel = sightCameraView.length) == null)) {
                String cleanAll = isOriginHasAppInfo.getCleanAll(moneyViewModel.setMin);
                if (cleanAll == null) {
                    cleanAll = "0";
                }
                if (cleanAll != null) {
                    int parseInt = Integer.parseInt(cleanAll);
                    TotalSavingAmountView totalSavingAmountView2 = (TotalSavingAmountView) savingsActivity._$_findCachedViewById(resetInternal.setMax.onTransitionTrigger);
                    if (totalSavingAmountView2 != null) {
                        totalSavingAmountView2.setAmount(parseInt);
                    }
                }
            }
            TotalSavingAmountView totalSavingAmountView3 = (TotalSavingAmountView) savingsActivity._$_findCachedViewById(resetInternal.setMax.onTransitionTrigger);
            if (totalSavingAmountView3 != null) {
                View view5 = totalSavingAmountView3;
                Intrinsics.checkNotNullParameter(view5, "<this>");
                view5.setVisibility(0);
            }
        }
        DanaButtonPrimaryView danaButtonPrimaryView = (DanaButtonPrimaryView) savingsActivity._$_findCachedViewById(resetInternal.setMax.receiveFile);
        if (danaButtonPrimaryView != null) {
            View view6 = danaButtonPrimaryView;
            Intrinsics.checkNotNullParameter(view6, "<this>");
            if (!isEmpty) {
                i = 8;
            }
            view6.setVisibility(i);
        }
    }

    public static final /* synthetic */ void access$showUpgradeToKycDialog(SavingsActivity savingsActivity) {
        int max;
        Context baseContext = savingsActivity.getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || 263502092 == (max = dispatchOnCancelled.getMax(applicationContext, 263502092)))) {
            onCanceled oncanceled = new onCanceled(263502092, max, 512);
            onCancelLoad.setMax(263502092, oncanceled);
            onCancelLoad.getMin(263502092, oncanceled);
        }
        int max2 = dispatchOnCancelled.getMax(0);
        if (max2 != 0) {
            onCanceled oncanceled2 = new onCanceled(0, max2, 16);
            onCancelLoad.setMax(263502092, oncanceled2);
            onCancelLoad.getMin(263502092, oncanceled2);
        }
        getProgressViewStartOffset.getMax getmax = new getProgressViewStartOffset.getMax(savingsActivity);
        getmax.toFloatRange = savingsActivity.getString(R.string.saving_withdrawal_title_dialog);
        getProgressViewStartOffset.getMax getmax2 = getmax;
        getmax2.isInside = savingsActivity.getString(R.string.pop_up_description_saving_limit_about_info_non_kyc);
        getProgressViewStartOffset.getMax getmax3 = getmax2;
        getmax3.setMax = R.drawable.ic_premium_feature;
        getProgressViewStartOffset.getMax getmax4 = getmax3;
        getmax4.toIntRange = 0;
        getProgressViewStartOffset.getMax min = getmax4.IsOverlapping().setMax(false).getMax(savingsActivity.getString(R.string.saving_withdrawal_negative_dialog), toIntRange.INSTANCE).setMin(savingsActivity.getString(R.string.upgrade), new toFloatRange(savingsActivity));
        new getProgressViewStartOffset(min.invoke, min.length, min, min.equals, (byte) 0).getMin().show();
    }

    public static final /* synthetic */ void access$startSavingCreateActivity(SavingsActivity savingsActivity) {
        int length2;
        int min;
        Context baseContext = savingsActivity.getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length2 = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length2)))) {
            onCanceled oncanceled = new onCanceled(length2, min, 32);
            onCancelLoad.setMax(348844640, oncanceled);
            onCancelLoad.getMin(348844640, oncanceled);
        }
        SavingCreateActivity.getMax getmax = SavingCreateActivity.Companion;
        SavingCreateActivity.getMax.length(savingsActivity, 2002);
        savingsActivity.setIntent(savingsActivity.getIntentClassWithTracking(SavingCreateActivity.class));
    }

    @NotNull
    public final updateScreenRotation.setMin getSavingPresenter() {
        int length2;
        int min;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length2 = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length2)))) {
            onCanceled oncanceled = new onCanceled(length2, min, 32);
            onCancelLoad.setMax(1746714680, oncanceled);
            onCancelLoad.getMin(1746714680, oncanceled);
        }
        updateScreenRotation.setMin setmin = this.savingPresenter;
        if (setmin == null) {
            Intrinsics.throwUninitializedPropertyAccessException("savingPresenter");
        }
        return setmin;
    }

    public final void setSavingPresenter(@NotNull updateScreenRotation.setMin setmin) {
        Intrinsics.checkNotNullParameter(setmin, "<set-?>");
        this.savingPresenter = setmin;
    }

    @NotNull
    public final SightCameraView.OnRecordListener getSavingConfigPresenter() {
        SightCameraView.OnRecordListener onRecordListener = this.savingConfigPresenter;
        if (onRecordListener == null) {
            Intrinsics.throwUninitializedPropertyAccessException("savingConfigPresenter");
        }
        return onRecordListener;
    }

    public final void setSavingConfigPresenter(@NotNull SightCameraView.OnRecordListener onRecordListener) {
        Intrinsics.checkNotNullParameter(onRecordListener, "<set-?>");
        this.savingConfigPresenter = onRecordListener;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ethanhua/skeleton/ViewSkeletonScreen;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class values extends Lambda implements Function0<getInsetDodgeRect> {
        final /* synthetic */ SavingsActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        values(SavingsActivity savingsActivity) {
            super(0);
            this.this$0 = savingsActivity;
        }

        public final getInsetDodgeRect invoke() {
            TotalSavingAmountView totalSavingAmountView = (TotalSavingAmountView) this.this$0._$_findCachedViewById(resetInternal.setMax.onTransitionTrigger);
            getInsetDodgeRect.setMax setmax = new getInsetDodgeRect.setMax(totalSavingAmountView != null ? (TextView) totalSavingAmountView._$_findCachedViewById(resetInternal.setMax.setSubtitleTextAppearance) : null);
            setmax.getMax = R.layout.view_total_amount_skeleton;
            setmax.setMax = 1500;
            setmax.length = true;
            setmax.setMin = IntRange.setMax(setmax.getMin.getContext(), R.color.f24782131100433);
            setmax.isInside = 20;
            getInsetDodgeRect getinsetdodgerect = new getInsetDodgeRect(setmax, (byte) 0);
            getinsetdodgerect.getMin();
            return getinsetdodgerect;
        }
    }

    public final void configToolbar() {
        setTitle(getString(R.string.title_saving));
        setMenuLeftButton((int) R.drawable.btn_arrow_left);
    }

    @NotNull
    public final String getOnBoardingPageViewTitleStringRes() {
        String string = getString(R.string.bottom_on_boarding_page_title_saving_goal);
        Intrinsics.checkNotNullExpressionValue(string, "getString(\n        R.str…g_page_title_saving_goal)");
        return string;
    }

    @NotNull
    public final String getOnBoardingListViewTitleStringRes() {
        String string = getString(R.string.bottom_on_boarding_list_title_saving_goal);
        Intrinsics.checkNotNullExpressionValue(string, "getString(\n        R.str…g_list_title_saving_goal)");
        return string;
    }

    @NotNull
    public final List<ContentOnBoardingModel> getOnBoardingContents() {
        List<CaptureBtn.AnonymousClass1> list;
        List<ContentOnBoardingModel> arrayList = new ArrayList<>();
        onSurfaceTextureSizeChanged onsurfacetexturesizechanged = this.setMax;
        if (!(onsurfacetexturesizechanged == null || (list = onsurfacetexturesizechanged.setMax) == null)) {
            for (CaptureBtn.AnonymousClass1 next : list) {
                Context baseContext = getBaseContext();
                Intrinsics.checkNotNullExpressionValue(baseContext, "baseContext");
                int length2 = CornerMarkingDataProvider.AnonymousClass3.length(baseContext, next.length);
                if (length2 > 0) {
                    Context baseContext2 = getBaseContext();
                    Intrinsics.checkNotNullExpressionValue(baseContext2, "baseContext");
                    String min = CornerMarkingDataProvider.AnonymousClass3.setMin(baseContext2, next.setMax, next.setMax);
                    Context baseContext3 = getBaseContext();
                    Intrinsics.checkNotNullExpressionValue(baseContext3, "baseContext");
                    arrayList.add(new ContentOnBoardingModel(length2, min, CornerMarkingDataProvider.AnonymousClass3.setMin(baseContext3, next.getMin, next.getMin)));
                } else {
                    String str = next.length;
                    Context baseContext4 = getBaseContext();
                    Intrinsics.checkNotNullExpressionValue(baseContext4, "baseContext");
                    String min2 = CornerMarkingDataProvider.AnonymousClass3.setMin(baseContext4, next.setMax, next.setMax);
                    Context baseContext5 = getBaseContext();
                    Intrinsics.checkNotNullExpressionValue(baseContext5, "baseContext");
                    arrayList.add(new ContentOnBoardingModel(str, min2, CornerMarkingDataProvider.AnonymousClass3.setMin(baseContext5, next.getMin, next.getMin)));
                }
            }
        }
        return arrayList;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "id/dana/savings/activity/SavingsActivity$initButton$1$1"}, k = 3, mv = {1, 4, 2})
    static final class length implements View.OnClickListener {
        final /* synthetic */ SavingsActivity getMax;

        length(SavingsActivity savingsActivity) {
            this.getMax = savingsActivity;
        }

        public final void onClick(View view) {
            SavingsActivity.access$onBtnAddClicked(this.getMax);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "id/dana/savings/activity/SavingsActivity$initButton$2$1"}, k = 3, mv = {1, 4, 2})
    static final class isInside implements View.OnClickListener {
        final /* synthetic */ SavingsActivity setMax;

        isInside(SavingsActivity savingsActivity) {
            this.setMax = savingsActivity;
        }

        public final void onClick(View view) {
            SavingsActivity.access$onBtnAddClicked(this.setMax);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"id/dana/savings/activity/SavingsActivity$getSavingConfigModule$1", "Lid/dana/savings/contract/SavingConfigContract$View;", "onSavingBalanceVisibility", "", "visibility", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMin implements notifyPrepared.length {
        final /* synthetic */ SavingsActivity getMin;

        @JvmDefault
        public final void dismissProgress() {
        }

        @JvmDefault
        public final void onError(@Nullable String str) {
        }

        @JvmDefault
        public final void showProgress() {
        }

        getMin(SavingsActivity savingsActivity) {
            this.getMin = savingsActivity;
        }

        public final void setMin(boolean z) {
            List<SavingModel> list;
            SightCameraView access$getSavingSummaryModel$p = this.getMin.getMin;
            if (access$getSavingSummaryModel$p != null && (list = access$getSavingSummaryModel$p.getMin) != null) {
                Iterable<SavingModel> iterable = list;
                Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
                for (SavingModel savingModel : iterable) {
                    savingModel.isInside = z;
                    arrayList.add(savingModel);
                }
                SavingsActivity.access$setSavings(this.getMin, (List) arrayList);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00009\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0003H\u0016¨\u0006\u0013"}, d2 = {"id/dana/savings/activity/SavingsActivity$getSavingModule$1", "Lid/dana/savings/contract/SavingViewListener;", "onError", "", "errorMessage", "", "onGetKycStatus", "isKyc", "", "onGetSavingEmptyState", "savingEmptyStateModel", "Lid/dana/savings/model/SavingEmptyStateModel;", "onGetSavingSummary", "savingSummaryModel", "Lid/dana/savings/model/SavingSummaryModel;", "onInitSuccess", "savingCreateInit", "Lid/dana/domain/saving/model/SavingCreateInit;", "onReachMaximum", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMax extends CameraView.AnonymousClass2 {
        final /* synthetic */ SavingsActivity getMin;

        getMax(SavingsActivity savingsActivity) {
            this.getMin = savingsActivity;
        }

        public final void getMax(@NotNull SightCameraView sightCameraView) {
            Intrinsics.checkNotNullParameter(sightCameraView, "savingSummaryModel");
            this.getMin.getMax(false);
            SavingsActivity.access$setSavingSummary(this.getMin, sightCameraView);
        }

        public final void setMax(boolean z) {
            if (!z) {
                SavingsActivity.access$showUpgradeToKycDialog(this.getMin);
            } else {
                this.getMin.showSavingLimitDialog();
            }
        }

        public final void setMax(@NotNull getRegionExitPeriod getregionexitperiod) {
            Intrinsics.checkNotNullParameter(getregionexitperiod, "savingCreateInit");
            SavingsActivity.access$startSavingCreateActivity(this.getMin);
        }

        public final void getMin() {
            this.getMin.showSavingLimitDialog();
        }

        public final void setMin(@NotNull onSurfaceTextureSizeChanged onsurfacetexturesizechanged) {
            Intrinsics.checkNotNullParameter(onsurfacetexturesizechanged, "savingEmptyStateModel");
            SavingsActivity.access$setEmptyState(this.getMin, onsurfacetexturesizechanged);
        }

        public final void onError(@Nullable String str) {
            SavingsActivity savingsActivity = this.getMin;
            if (str == null) {
                str = "";
            }
            SavingsActivity.access$showErrorSnackbar(savingsActivity, str);
        }
    }

    public final void onResume() {
        super.onResume();
        getMax(true);
        updateScreenRotation.setMin setmin = this.savingPresenter;
        if (setmin == null) {
            Intrinsics.throwUninitializedPropertyAccessException("savingPresenter");
        }
        setmin.setMin();
        updateScreenRotation.setMin setmin2 = this.savingPresenter;
        if (setmin2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("savingPresenter");
        }
        setmin2.IsOverlapping();
    }

    private static int getMax(Context context, String str, int i, int i2) {
        int length2 = str != null ? str.length() : 0;
        int max = dispatchOnCancelled.setMax(length2);
        if (length2 != max) {
            onCanceled oncanceled = new onCanceled(length2, max, 1);
            onCancelLoad.setMax(-907150220, oncanceled);
            onCancelLoad.getMin(-907150220, oncanceled);
        }
        TextView textView = new TextView(context);
        textView.setText(str);
        textView.setTextSize(1, (float) i);
        textView.measure(View.MeasureSpec.makeMeasureSpec(i2, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
        return textView.getMeasuredHeight();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "onGlobalLayout"}, k = 3, mv = {1, 4, 2})
    static final class IsOverlapping implements ViewTreeObserver.OnGlobalLayoutListener {
        final /* synthetic */ boolean getMax;
        final /* synthetic */ NestedScrollView length;
        final /* synthetic */ DanaButtonSecondaryView setMin;

        IsOverlapping(DanaButtonSecondaryView danaButtonSecondaryView, boolean z, NestedScrollView nestedScrollView) {
            this.setMin = danaButtonSecondaryView;
            this.getMax = z;
            this.length = nestedScrollView;
        }

        public final void onGlobalLayout() {
            int i = 0;
            if (this.getMax) {
                View view = this.setMin;
                if (!this.length.canScrollVertically(1)) {
                    i = 8;
                }
                view.setVisibility(i);
                return;
            }
            View view2 = this.setMin;
            if (!(true ^ this.length.canScrollVertically(1))) {
                i = 8;
            }
            view2.setVisibility(i);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "position", "", "onItemClick"}, k = 3, mv = {1, 4, 2})
    static final class setMin implements Ignore.setMin {
        final /* synthetic */ SavingsActivity setMin;

        setMin(SavingsActivity savingsActivity) {
            this.setMin = savingsActivity;
        }

        public final void length(int i) {
            SavingModel savingModel = (SavingModel) SavingsActivity.access$getSavingAdapter$p(this.setMin).setMin(i);
            if (savingModel != null) {
                SavingDetailActivity.getMin getmin = SavingDetailActivity.Companion;
                SavingDetailActivity.getMin.setMax(this.setMin, savingModel);
            }
        }
    }

    /* access modifiers changed from: private */
    public final void getMax(boolean z) {
        ImageView imageView;
        ImageView imageView2;
        ImageView imageView3;
        ImageView imageView4;
        if (z) {
            setMenuRightButton((int) R.drawable.ic_tooltip_help);
            TotalSavingAmountView totalSavingAmountView = (TotalSavingAmountView) _$_findCachedViewById(resetInternal.setMax.onTransitionTrigger);
            if (totalSavingAmountView != null) {
                View view = totalSavingAmountView;
                Intrinsics.checkNotNullParameter(view, "<this>");
                view.setVisibility(0);
            }
            TotalSavingAmountView totalSavingAmountView2 = (TotalSavingAmountView) _$_findCachedViewById(resetInternal.setMax.onTransitionTrigger);
            if (!(totalSavingAmountView2 == null || (imageView4 = (ImageView) totalSavingAmountView2._$_findCachedViewById(resetInternal.setMax.draw)) == null)) {
                View view2 = imageView4;
                Intrinsics.checkNotNullParameter(view2, "<this>");
                view2.setVisibility(0);
            }
            TotalSavingAmountView totalSavingAmountView3 = (TotalSavingAmountView) _$_findCachedViewById(resetInternal.setMax.onTransitionTrigger);
            if (!(totalSavingAmountView3 == null || (imageView3 = (ImageView) totalSavingAmountView3._$_findCachedViewById(resetInternal.setMax.setChangingConfigurations)) == null)) {
                View view3 = imageView3;
                Intrinsics.checkNotNullParameter(view3, "<this>");
                view3.setVisibility(8);
            }
            DanaButtonSecondaryView danaButtonSecondaryView = (DanaButtonSecondaryView) _$_findCachedViewById(resetInternal.setMax.ITrustedWebActivityCallback);
            if (danaButtonSecondaryView != null) {
                View view4 = danaButtonSecondaryView;
                Intrinsics.checkNotNullParameter(view4, "<this>");
                view4.setVisibility(0);
            }
            getMax().getMin();
            ((onDetachedFromLayoutParams) this.equals.getValue()).getMin();
            return;
        }
        TotalSavingAmountView totalSavingAmountView4 = (TotalSavingAmountView) _$_findCachedViewById(resetInternal.setMax.onTransitionTrigger);
        if (!(totalSavingAmountView4 == null || (imageView2 = (ImageView) totalSavingAmountView4._$_findCachedViewById(resetInternal.setMax.draw)) == null)) {
            View view5 = imageView2;
            Intrinsics.checkNotNullParameter(view5, "<this>");
            view5.setVisibility(8);
        }
        TotalSavingAmountView totalSavingAmountView5 = (TotalSavingAmountView) _$_findCachedViewById(resetInternal.setMax.onTransitionTrigger);
        if (!(totalSavingAmountView5 == null || (imageView = (ImageView) totalSavingAmountView5._$_findCachedViewById(resetInternal.setMax.setChangingConfigurations)) == null)) {
            View view6 = imageView;
            Intrinsics.checkNotNullParameter(view6, "<this>");
            view6.setVisibility(0);
        }
        DanaButtonSecondaryView danaButtonSecondaryView2 = (DanaButtonSecondaryView) _$_findCachedViewById(resetInternal.setMax.ITrustedWebActivityCallback);
        if (danaButtonSecondaryView2 != null) {
            View view7 = danaButtonSecondaryView2;
            Intrinsics.checkNotNullParameter(view7, "<this>");
            view7.setVisibility(8);
        }
        getMax().length();
        ((onDetachedFromLayoutParams) this.equals.getValue()).length();
    }

    public final void showSavingLimitDialog() {
        int length2;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length2 = dispatchOnCancelled.length(applicationContext, 0)) == 0)) {
            onCanceled oncanceled = new onCanceled(0, length2, 4);
            onCancelLoad.setMax(281111827, oncanceled);
            onCancelLoad.getMin(281111827, oncanceled);
        }
        DialogWithImage.getMin getmin = new DialogWithImage.getMin();
        getmin.toFloatRange = R.drawable.ic_faceenrol_invalid;
        getmin.getMax = getString(R.string.pop_up_title_saving_limit_decline);
        getmin.setMin = getString(R.string.pop_up_description_saving_limit_decline);
        getmin.getMin = getString(R.string.pop_up_positive_button_saving_limit_info);
        new DialogWithImage(this, getmin.setMax, getmin, (byte) 0).setMin();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class equals implements View.OnClickListener {
        final /* synthetic */ SavingsActivity length;

        equals(SavingsActivity savingsActivity) {
            this.length = savingsActivity;
        }

        public final void onClick(View view) {
            SavingsActivity.access$getCustomSnackBar$p(this.length).dismiss();
        }
    }

    private final boolean getMin() {
        notifyError notifyerror = this.getMax;
        if (notifyerror == null) {
            Intrinsics.throwUninitializedPropertyAccessException("savingAdapter");
        }
        return notifyerror.getItemCount() == 10;
    }

    private final boolean length() {
        String str;
        MoneyViewModel moneyViewModel;
        SightCameraView sightCameraView = this.getMin;
        if (sightCameraView == null || (moneyViewModel = sightCameraView.getMax) == null) {
            str = null;
        } else {
            str = moneyViewModel.setMin;
        }
        return Intrinsics.areEqual((Object) str, (Object) "0");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lid/dana/savings/activity/SavingsActivity$Companion;", "", "()V", "BENEFIT_DESC_SIZE", "", "BENEFIT_TITLE_SIZE", "REQUEST_CODE_CREATE_SAVING", "REQUEST_CODE_DETAIL_SAVING", "RV_BENEFIT_WIDTH", "SHIMMER_ANGLE", "SHIMMER_DURATION", "SHIMMER_ITEM_COUNT", "startActivity", "", "activity", "Landroid/app/Activity;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMax {
        private setMax() {
        }

        public /* synthetic */ setMax(byte b) {
            this();
        }

        @JvmStatic
        public static void setMin(@Nullable Activity activity) {
            if (activity != null) {
                activity.startActivity(new Intent(activity, SavingsActivity.class));
            }
        }
    }

    public final void init() {
        int length2;
        int length3;
        int min;
        getPreParsedPackage.getMax getmax = new getPreParsedPackage.getMax((byte) 0);
        PrepareException.AnonymousClass1 applicationComponent = getApplicationComponent();
        Context context = null;
        if (applicationComponent != null) {
            getmax.setMax = applicationComponent;
            getmax.getMax = new SavingConfigModule(new getMin(this));
            getmax.length = new SavingModule(new getMax(this));
            BottomSheetOnBoardingModule bottomOnBoardingModule = getBottomOnBoardingModule();
            if (bottomOnBoardingModule != null) {
                getmax.getMin = bottomOnBoardingModule;
                stopIgnoring.setMin(getmax.length, SavingModule.class);
                stopIgnoring.setMin(getmax.getMin, BottomSheetOnBoardingModule.class);
                stopIgnoring.setMin(getmax.getMax, SavingConfigModule.class);
                stopIgnoring.setMin(getmax.setMax, PrepareException.AnonymousClass1.class);
                new getPreParsedPackage(getmax.length, getmax.getMin, getmax.getMax, getmax.setMax, (byte) 0).getMax(this);
                onDelete.getMin[] getminArr = new onDelete.getMin[2];
                updateScreenRotation.setMin setmin = this.savingPresenter;
                if (setmin == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("savingPresenter");
                }
                getminArr[0] = setmin;
                SightCameraView.OnRecordListener onRecordListener = this.savingConfigPresenter;
                if (onRecordListener == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("savingConfigPresenter");
                }
                getminArr[1] = onRecordListener;
                registerPresenter(getminArr);
                RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(resetInternal.setMax.setTextAppearance);
                if (recyclerView != null) {
                    notifySdcardError notifysdcarderror = new notifySdcardError();
                    recyclerView.setAdapter(notifysdcarderror);
                    Unit unit = Unit.INSTANCE;
                    this.toIntRange = notifysdcarderror;
                    recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 0, false));
                    recyclerView.addItemDecoration(new SlidingPaneLayout.SavedState(16));
                }
                Context baseContext = getBaseContext();
                Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
                if (!(applicationContext == null || (length3 = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length3)))) {
                    onCanceled oncanceled = new onCanceled(length3, min, 32);
                    onCancelLoad.setMax(1148996075, oncanceled);
                    onCancelLoad.getMin(1148996075, oncanceled);
                }
                EmptyStateRecyclerView emptyStateRecyclerView = (EmptyStateRecyclerView) _$_findCachedViewById(resetInternal.setMax.AppCompatImageView);
                if (emptyStateRecyclerView != null) {
                    notifyError notifyerror = new notifyError();
                    notifyerror.getMax((Ignore.setMin) new setMin(this));
                    Unit unit2 = Unit.INSTANCE;
                    this.getMax = notifyerror;
                    if (notifyerror == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("savingAdapter");
                    }
                    emptyStateRecyclerView.setAdapter(notifyerror);
                    emptyStateRecyclerView.setLayoutManager(new LinearLayoutManager(emptyStateRecyclerView.getContext(), 1, false));
                    emptyStateRecyclerView.setNestedScrollingEnabled(false);
                    emptyStateRecyclerView.addItemDecoration(new SlidingPaneLayout.LayoutParams((int) (Resources.getSystem().getDisplayMetrics().density * 12.0f)));
                }
                DanaButtonSecondaryView danaButtonSecondaryView = (DanaButtonSecondaryView) _$_findCachedViewById(resetInternal.setMax.ICustomTabsService$Stub$Proxy);
                if (danaButtonSecondaryView != null) {
                    danaButtonSecondaryView.setOnClickListener(new length(this));
                    NestedScrollView nestedScrollView = (NestedScrollView) _$_findCachedViewById(resetInternal.setMax.killMode);
                    Intrinsics.checkNotNullExpressionValue(nestedScrollView, "nsv_savings");
                    ViewTreeObserver viewTreeObserver = nestedScrollView.getViewTreeObserver();
                    if (viewTreeObserver != null) {
                        viewTreeObserver.addOnGlobalLayoutListener(new IsOverlapping(danaButtonSecondaryView, false, nestedScrollView));
                    }
                }
                DanaButtonSecondaryView danaButtonSecondaryView2 = (DanaButtonSecondaryView) _$_findCachedViewById(resetInternal.setMax.IPostMessageService$Default);
                if (danaButtonSecondaryView2 != null) {
                    danaButtonSecondaryView2.setOnClickListener(new isInside(this));
                    NestedScrollView nestedScrollView2 = (NestedScrollView) _$_findCachedViewById(resetInternal.setMax.killMode);
                    Intrinsics.checkNotNullExpressionValue(nestedScrollView2, "nsv_savings");
                    ViewTreeObserver viewTreeObserver2 = nestedScrollView2.getViewTreeObserver();
                    if (viewTreeObserver2 != null) {
                        viewTreeObserver2.addOnGlobalLayoutListener(new IsOverlapping(danaButtonSecondaryView2, true, nestedScrollView2));
                    }
                }
                Context baseContext2 = getBaseContext();
                if (baseContext2 != null) {
                    context = baseContext2.getApplicationContext();
                }
                if (!(context == null || (length2 = dispatchOnCancelled.length(context, 0)) == 0)) {
                    onCanceled oncanceled2 = new onCanceled(0, length2, 4);
                    onCancelLoad.setMax(-192660433, oncanceled2);
                    onCancelLoad.getMin(-192660433, oncanceled2);
                }
                getMax(true);
                updateScreenRotation.setMin setmin2 = this.savingPresenter;
                if (setmin2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("savingPresenter");
                }
                setmin2.setMin();
                updateScreenRotation.setMin setmin3 = this.savingPresenter;
                if (setmin3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("savingPresenter");
                }
                setmin3.IsOverlapping();
                return;
            }
            throw null;
        }
        throw null;
    }

    public final void onActivityResult(int i, int i2, @Nullable Intent intent) {
        SavingModel savingModel;
        int length2;
        int min;
        int i3 = i;
        int i4 = i2;
        Intent intent2 = intent;
        if (-1 == i4 && i3 == 2002) {
            if (!(intent2 == null || (savingModel = (SavingModel) intent2.getParcelableExtra(SavingCreateActivity.EXTRA_CREATED_SAVING)) == null)) {
                Activity activity = this;
                int max = dispatchOnCancelled.getMax(0);
                if (max != 0) {
                    onCanceled oncanceled = new onCanceled(0, max, 16);
                    onCancelLoad.setMax(586143528, oncanceled);
                    onCancelLoad.getMin(586143528, oncanceled);
                }
                Context baseContext = getBaseContext();
                Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
                if (!(applicationContext == null || (length2 = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length2)))) {
                    onCanceled oncanceled2 = new onCanceled(length2, min, 32);
                    onCancelLoad.setMax(586143528, oncanceled2);
                    onCancelLoad.getMin(586143528, oncanceled2);
                }
                String string = getResources().getString(R.string.toast_create_saving_goal_success);
                Intrinsics.checkNotNullExpressionValue(string, "resources.getString(\n   …eate_saving_goal_success)");
                String format = String.format(string, Arrays.copyOf(new Object[]{savingModel.getMin}, 1));
                Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(this, *args)");
                setCancelText.length(activity, R.drawable.ic_success, R.drawable.bg_rounded_toast_success, format, 48, 60, true, (String) null, 256);
            }
        } else if (1002 == i4 && i3 == 2003 && intent2 != null) {
            int max2 = dispatchOnCancelled.getMax(0);
            if (max2 != 0) {
                onCanceled oncanceled3 = new onCanceled(0, max2, 16);
                onCancelLoad.setMax(238277185, oncanceled3);
                onCancelLoad.getMin(238277185, oncanceled3);
            }
            SavingDetailModel savingDetailModel = (SavingDetailModel) intent2.getParcelableExtra(SavingDetailActivity.EXTRA_REVOKED_SAVING);
            if (savingDetailModel != null) {
                setCancelText setcanceltext = setCancelText.length;
                SavingModel savingModel2 = savingDetailModel.getMin;
                String string2 = getResources().getString(R.string.toast_revoke_saving_goal_success);
                Intrinsics.checkNotNullExpressionValue(string2, "resources.getString(\n   …voke_saving_goal_success)");
                String format2 = String.format(string2, Arrays.copyOf(new Object[]{savingModel2.getMin}, 1));
                Intrinsics.checkNotNullExpressionValue(format2, "java.lang.String.format(this, *args)");
                setCancelText.setMax(this, R.drawable.bg_rounded_toast_payment_auth, format2, 48, 60);
            }
        }
        super.onActivityResult(i, i2, intent);
    }

    public static final /* synthetic */ void access$onBtnAddClicked(SavingsActivity savingsActivity) {
        if (savingsActivity.getMin == null) {
            return;
        }
        if (savingsActivity.getMin() || savingsActivity.length()) {
            updateScreenRotation.setMin setmin = savingsActivity.savingPresenter;
            if (setmin == null) {
                Intrinsics.throwUninitializedPropertyAccessException("savingPresenter");
            }
            setmin.length();
            return;
        }
        updateScreenRotation.setMin setmin2 = savingsActivity.savingPresenter;
        if (setmin2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("savingPresenter");
        }
        setmin2.getMax();
    }

    public static final /* synthetic */ void access$setSavingSummary(SavingsActivity savingsActivity, SightCameraView sightCameraView) {
        savingsActivity.getMin = sightCameraView;
        String cleanAll = isOriginHasAppInfo.getCleanAll(sightCameraView.length.setMin);
        if (cleanAll == null) {
            cleanAll = "0";
        }
        int parseInt = Integer.parseInt(cleanAll);
        TotalSavingAmountView totalSavingAmountView = (TotalSavingAmountView) savingsActivity._$_findCachedViewById(resetInternal.setMax.onTransitionTrigger);
        if (totalSavingAmountView != null) {
            totalSavingAmountView.setAmount(parseInt);
        }
        SightCameraView.OnRecordListener onRecordListener = savingsActivity.savingConfigPresenter;
        if (onRecordListener == null) {
            Intrinsics.throwUninitializedPropertyAccessException("savingConfigPresenter");
        }
        onRecordListener.getMin();
    }

    public static final /* synthetic */ void access$showErrorSnackbar(SavingsActivity savingsActivity, String str) {
        Window window = savingsActivity.getWindow();
        Intrinsics.checkNotNullExpressionValue(window, "window");
        View findViewById = window.getDecorView().findViewById(16908290);
        Intrinsics.checkNotNullExpressionValue(findViewById, "window.decorView.findVie…yId(android.R.id.content)");
        setProgressViewOffset.setMax setmax = new setProgressViewOffset.setMax((ViewGroup) findViewById);
        setmax.getMax = str;
        setmax.setMax = savingsActivity.getString(R.string.pop_up_positive_button_saving_limit_info);
        setmax.toIntRange = 0;
        setmax.setMin = R.drawable.ic_warning_orange;
        setmax.getMin = R.drawable.bg_rectangle_tangerine;
        setmax.length = new equals(savingsActivity);
        setProgressViewOffset max = setmax.getMax();
        savingsActivity.isInside = max;
        if (max == null) {
            Intrinsics.throwUninitializedPropertyAccessException("customSnackBar");
        }
        max.show();
    }
}
