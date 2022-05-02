package id.dana.nearbyme.merchantreview;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.activity.result.ActivityResult;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LiveData;
import androidx.work.BackoffPolicy;
import com.alibaba.ariver.kernel.ipc.IpcMessageConstants;
import com.alibaba.griver.core.jsapi.device.location.RequestPermission;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import id.dana.DanaApplication;
import id.dana.R;
import id.dana.base.extension.WorkManagerFailure;
import id.dana.lib.gcontainer.app.bridge.imagepicker.ImagePickerEvent;
import id.dana.nearbyme.di.module.MerchantReviewFormModule;
import id.dana.nearbyme.merchantreview.CreateReviewWorker;
import id.dana.nearbyme.merchantreview.MerchantReviewMainView;
import id.dana.nearbyme.merchantreview.MerchantReviewPhotosView;
import id.dana.nearbyme.merchantreview.UploadImageWorker;
import id.dana.nearbyme.merchantreview.ViewRatingStarBar;
import id.dana.nearbyme.merchantreview.model.MerchantConsultReviewModel;
import id.dana.nearbyme.merchantreview.model.MerchantReviewDialogDismissState;
import id.dana.nearbyme.merchantreview.model.MerchantReviewTagModel;
import id.dana.sendmoney.feed.ShareToFeedsView;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o.AndroidWebView;
import o.GriverStartClientProxy;
import o.GriverWebChromeClientExtension;
import o.IPostMessageService;
import o.ITrustedWebActivityCallback;
import o.PrepareException;
import o.addError;
import o.hasError;
import o.invalidateDrawable;
import o.j;
import o.k;
import o.name;
import o.onNavigationState;
import o.resetInternal;
import o.setAutoSizeTextTypeUniformWithPresetSizes;
import o.setBackgroundDrawable;
import o.setColorFilter;
import o.setTextSize;
import o.stopIgnoring;
import o.updateAppearance;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 S2\u00020\u00012\u00020\u0002:\u0001SB\u0005¢\u0006\u0002\u0010\u0003J\u000f\u0010\u001e\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0002\u0010\u001fJ\u0010\u0010 \u001a\n \u0007*\u0004\u0018\u00010!0!H\u0002J\u0012\u0010\"\u001a\u00020\u000b2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J\b\u0010%\u001a\u00020\u000bH\u0016J\u0010\u0010&\u001a\u00020\u000b2\u0006\u0010'\u001a\u00020(H\u0016J\u0012\u0010)\u001a\u00020\u000b2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J&\u0010*\u001a\u0004\u0018\u00010+2\u0006\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010/2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J\b\u00100\u001a\u00020\u000bH\u0016J\u0010\u0010\b\u001a\u00020\u000b2\u0006\u0010'\u001a\u00020(H\u0016J-\u00101\u001a\u00020\u000b2\u0006\u00102\u001a\u0002032\u000e\u00104\u001a\n\u0012\u0006\b\u0001\u0012\u000206052\u0006\u00107\u001a\u000208H\u0016¢\u0006\u0002\u00109J\u001a\u0010:\u001a\u00020\u000b2\u0006\u0010;\u001a\u00020+2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J\b\u0010<\u001a\u00020\u000bH\u0002J\u0016\u0010=\u001a\u0010\u0012\f\u0012\n \u0007*\u0004\u0018\u00010?0?0>H\u0002J\b\u0010@\u001a\u00020\u000bH\u0002J\b\u0010A\u001a\u00020\u000bH\u0002J\n\u0010B\u001a\u0004\u0018\u00010CH\u0002J\b\u0010D\u001a\u00020\u000bH\u0002J\u000f\u0010E\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0002\u0010\u001fJ\u000f\u0010F\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0002\u0010\u001fJ\u000f\u0010G\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0002\u0010\u001fJ\b\u0010H\u001a\u00020\u000bH\u0002J\u0010\u0010I\u001a\u00020\u000b2\u0006\u0010J\u001a\u00020\u0006H\u0016J\u001b\u0010K\u001a\u00020\u000b2\f\u0010L\u001a\b\u0012\u0004\u0012\u00020605H\u0016¢\u0006\u0002\u0010MJ\u000f\u0010N\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0002\u0010\u001fJ\b\u0010O\u001a\u00020\u000bH\u0002J\b\u0010P\u001a\u00020\u000bH\u0002J\f\u0010Q\u001a\u00020R*\u00020\u001dH\u0002R\u001c\u0010\u0004\u001a\u0010\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00060\u00060\u0005X\u0004¢\u0006\u0002\n\u0000R&\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0010\u001a\u00020\u00118\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0016\u001a\u00020\u00178\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u000e\u0010\u001c\u001a\u00020\u001dX.¢\u0006\u0002\n\u0000¨\u0006T"}, d2 = {"Lid/dana/nearbyme/merchantreview/MerchantReviewDialogFragment;", "Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;", "Lid/dana/nearbyme/merchantreview/MerchantReviewPhotosView$PhotosViewInteraction;", "()V", "imageLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "kotlin.jvm.PlatformType", "onDismiss", "Lkotlin/Function1;", "Lid/dana/nearbyme/merchantreview/model/MerchantReviewDialogDismissState;", "", "getOnDismiss", "()Lkotlin/jvm/functions/Function1;", "setOnDismiss", "(Lkotlin/jvm/functions/Function1;)V", "presenter", "Lid/dana/nearbyme/merchantreview/MerchantReviewFormContract$Presenter;", "getPresenter", "()Lid/dana/nearbyme/merchantreview/MerchantReviewFormContract$Presenter;", "setPresenter", "(Lid/dana/nearbyme/merchantreview/MerchantReviewFormContract$Presenter;)V", "tracker", "Lid/dana/nearbyme/merchantreview/tracker/MerchantReviewFormAnalyticTracker;", "getTracker", "()Lid/dana/nearbyme/merchantreview/tracker/MerchantReviewFormAnalyticTracker;", "setTracker", "(Lid/dana/nearbyme/merchantreview/tracker/MerchantReviewFormAnalyticTracker;)V", "viewState", "Lid/dana/nearbyme/merchantreview/MerchantReviewViewState;", "determineExpansionState", "()Lkotlin/Unit;", "getApplicationComponent", "Lid/dana/di/component/ApplicationComponent;", "onActivityCreated", "savedInstanceState", "Landroid/os/Bundle;", "onAddPhotoClick", "onCancel", "dialog", "Landroid/content/DialogInterface;", "onCreate", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroy", "onRequestPermissionsResult", "requestCode", "", "permissions", "", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "onViewCreated", "view", "setFullScreenDialog", "setupBottomSheet", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "Landroid/widget/FrameLayout;", "setupDependency", "setupHeaderView", "setupMerchantRatingView", "Lid/dana/nearbyme/merchantreview/MerchantReviewRatingView;", "setupPhotosView", "setupReviewView", "setupSentimentObserver", "setupSubmitButton", "setupViewState", "startImageIntent", "intent", "startRequestPermission", "requiredPermission", "([Ljava/lang/String;)V", "submitReview", "trackActivity", "trackReviewSubmit", "toCreateReviewParam", "Lid/dana/nearbyme/merchantreview/CreateReviewWorker$Param;", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class MerchantReviewDialogFragment extends BottomSheetDialogFragment implements MerchantReviewPhotosView.setMax {
    @NotNull
    public static final getMin length = new getMin((byte) 0);
    public static MerchantConsultReviewModel setMax;
    @NotNull
    Function1<? super MerchantReviewDialogDismissState, Unit> getMax = setMin.INSTANCE;
    private AndroidWebView.a getMin;
    @Inject
    public j.AnonymousClass1.length presenter;
    private final ITrustedWebActivityCallback<Intent> setMin;
    private HashMap toFloatRange;
    @Inject
    public addError tracker;

    public final View setMin(int i) {
        if (this.toFloatRange == null) {
            this.toFloatRange = new HashMap();
        }
        View view = (View) this.toFloatRange.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.toFloatRange.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "p1", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final /* synthetic */ class hashCode extends FunctionReferenceImpl implements Function1<Integer, Unit> {
        hashCode(MerchantReviewRatingView merchantReviewRatingView) {
            super(1, merchantReviewRatingView, MerchantReviewRatingView.class, "setStarRating", "setStarRating(I)V", 0);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            invoke(((Number) obj).intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(int i) {
            ((MerchantReviewRatingView) this.receiver).setStarRating(i);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroidx/activity/result/ActivityResult;", "kotlin.jvm.PlatformType", "onActivityResult"}, k = 3, mv = {1, 4, 2})
    static final class length<O> implements IPostMessageService.Default<ActivityResult> {
        final /* synthetic */ MerchantReviewDialogFragment length;

        length(MerchantReviewDialogFragment merchantReviewDialogFragment) {
            this.length = merchantReviewDialogFragment;
        }

        public final /* synthetic */ void onActivityResult(Object obj) {
            MerchantReviewPhotosView merchantReviewPhotosView;
            ActivityResult activityResult = (ActivityResult) obj;
            Intrinsics.checkNotNullExpressionValue(activityResult, "it");
            if (activityResult.getMax == -1 && (merchantReviewPhotosView = (MerchantReviewPhotosView) this.length.setMin(resetInternal.setMax.MotionHelper)) != null) {
                merchantReviewPhotosView.activityForResult(activityResult.length);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lid/dana/nearbyme/merchantreview/model/MerchantReviewDialogDismissState;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class setMin extends Lambda implements Function1<MerchantReviewDialogDismissState, Unit> {
        public static final setMin INSTANCE = new setMin();

        setMin() {
            super(1);
        }

        public final void invoke(@NotNull MerchantReviewDialogDismissState merchantReviewDialogDismissState) {
            Intrinsics.checkNotNullParameter(merchantReviewDialogDismissState, "it");
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((MerchantReviewDialogDismissState) obj);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "p1", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final /* synthetic */ class toDoubleRange extends FunctionReferenceImpl implements Function1<Boolean, Unit> {
        toDoubleRange(AppCompatButton appCompatButton) {
            super(1, appCompatButton, AppCompatButton.class, "setEnabled", "setEnabled(Z)V", 0);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            invoke(((Boolean) obj).booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z) {
            ((AppCompatButton) this.receiver).setEnabled(z);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "p1", "Lid/dana/nearbyme/merchantreview/model/SentimentState;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final /* synthetic */ class toString extends FunctionReferenceImpl implements Function1<GriverWebChromeClientExtension, Unit> {
        toString(MerchantReviewSentimentView merchantReviewSentimentView) {
            super(1, merchantReviewSentimentView, MerchantReviewSentimentView.class, "updateSentiment", "updateSentiment(Lid/dana/nearbyme/merchantreview/model/SentimentState;)V", 0);
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((GriverWebChromeClientExtension) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull GriverWebChromeClientExtension griverWebChromeClientExtension) {
            Intrinsics.checkNotNullParameter(griverWebChromeClientExtension, "p1");
            ((MerchantReviewSentimentView) this.receiver).updateSentiment(griverWebChromeClientExtension);
        }
    }

    public MerchantReviewDialogFragment() {
        ITrustedWebActivityCallback<Intent> registerForActivityResult = registerForActivityResult(new ITrustedWebActivityCallback.Stub.Proxy.getMin(), new length(this));
        Intrinsics.checkNotNullExpressionValue(registerForActivityResult, "registerForActivityResul…(it.data)\n        }\n    }");
        this.setMin = registerForActivityResult;
    }

    public static final /* synthetic */ AndroidWebView.a getMax(MerchantReviewDialogFragment merchantReviewDialogFragment) {
        AndroidWebView.a aVar = merchantReviewDialogFragment.getMin;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewState");
        }
        return aVar;
    }

    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setStyle(0, R.style.f78502131951920);
    }

    @Nullable
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.view_merchant_review, viewGroup, false);
    }

    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        MerchantReviewMainView merchantReviewMainView = (MerchantReviewMainView) setMin(resetInternal.setMax.onTransitionStarted);
        if (merchantReviewMainView != null) {
            merchantReviewMainView.setOnEditTextClickListener(new setMax(this));
        }
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.setOnShowListener(new getMax(this));
        }
        ((ShareToFeedsView) setMin(resetInternal.setMax.setPrompt)).setOnActivateButtonClickListener(new IsOverlapping(this));
        view.getViewTreeObserver().addOnGlobalLayoutListener(new toIntRange(this, view));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class setMax implements View.OnClickListener {
        final /* synthetic */ MerchantReviewDialogFragment getMax;

        setMax(MerchantReviewDialogFragment merchantReviewDialogFragment) {
            this.getMax = merchantReviewDialogFragment;
        }

        public final void onClick(View view) {
            NestedScrollView nestedScrollView = (NestedScrollView) this.getMax.setMin(resetInternal.setMax.ActionBarContextView);
            if (nestedScrollView != null) {
                MerchantReviewMainView merchantReviewMainView = (MerchantReviewMainView) this.getMax.setMin(resetInternal.setMax.onTransitionStarted);
                Intrinsics.checkNotNullExpressionValue(merchantReviewMainView, "view_review");
                nestedScrollView.scrollTo(0, merchantReviewMainView.getBottom());
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "onShow"}, k = 3, mv = {1, 4, 2})
    static final class getMax implements DialogInterface.OnShowListener {
        final /* synthetic */ MerchantReviewDialogFragment getMax;

        getMax(MerchantReviewDialogFragment merchantReviewDialogFragment) {
            this.getMax = merchantReviewDialogFragment;
        }

        public final void onShow(DialogInterface dialogInterface) {
            MerchantReviewDialogFragment.length(this.getMax);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class IsOverlapping implements View.OnClickListener {
        final /* synthetic */ MerchantReviewDialogFragment getMax;

        IsOverlapping(MerchantReviewDialogFragment merchantReviewDialogFragment) {
            this.getMax = merchantReviewDialogFragment;
        }

        public final void onClick(View view) {
            j.AnonymousClass1.length length = this.getMax.presenter;
            if (length == null) {
                Intrinsics.throwUninitializedPropertyAccessException("presenter");
            }
            length.setMin();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"id/dana/nearbyme/merchantreview/MerchantReviewDialogFragment$onViewCreated$4", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "onGlobalLayout", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class toIntRange implements ViewTreeObserver.OnGlobalLayoutListener {
        final /* synthetic */ View length;
        final /* synthetic */ MerchantReviewDialogFragment setMax;

        toIntRange(MerchantReviewDialogFragment merchantReviewDialogFragment, View view) {
            this.setMax = merchantReviewDialogFragment;
            this.length = view;
        }

        public final void onGlobalLayout() {
            View findViewById;
            this.length.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            Dialog dialog = this.setMax.getDialog();
            if (dialog != null && (findViewById = dialog.findViewById(R.id.f42162131362710)) != null) {
                BottomSheetBehavior from = BottomSheetBehavior.from(findViewById);
                Intrinsics.checkNotNullExpressionValue(from, "BottomSheetBehavior.from(bottomSheet)");
                from.setState(3);
            }
        }
    }

    public final void onActivityCreated(@Nullable Bundle bundle) {
        String str;
        super.onActivityCreated(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            MerchantConsultReviewModel merchantConsultReviewModel = (MerchantConsultReviewModel) arguments.getParcelable("MERCHANT_REVIEW_DATA_KEY");
            if (merchantConsultReviewModel != null) {
                Intrinsics.checkNotNullExpressionValue(merchantConsultReviewModel, "merchantReview");
                this.getMin = new AndroidWebView.a(merchantConsultReviewModel);
            }
            AndroidWebView.a aVar = this.getMin;
            if (aVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewState");
            }
            aVar.setMax.getMax(Integer.valueOf(arguments.getInt("MERCHANT_REVIEW_STAR_COUNT_KEY")));
        } else {
            dismiss();
        }
        BottomSheetBehavior from = BottomSheetBehavior.from((FrameLayout) setMin(resetInternal.setMax.RequiresPermission));
        Resources system = Resources.getSystem();
        Intrinsics.checkNotNullExpressionValue(system, "Resources.getSystem()");
        from.setPeekHeight(system.getDisplayMetrics().heightPixels);
        from.setState(3);
        from.addBottomSheetCallback(new isInside(this));
        Intrinsics.checkNotNullExpressionValue(from, "BottomSheetBehavior.from…        }\n        )\n    }");
        AndroidWebView.a aVar2 = this.getMin;
        if (aVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewState");
        }
        AppCompatImageView appCompatImageView = (AppCompatImageView) setMin(resetInternal.setMax.invalidateDrawable);
        String str2 = "";
        if (appCompatImageView != null) {
            ImageView imageView = appCompatImageView;
            String str3 = aVar2.toFloatRange.setMax.hashCode;
            if (str3 == null) {
                str3 = str2;
            }
            k.AnonymousClass3.length(imageView, str3);
        }
        AppCompatTextView appCompatTextView = (AppCompatTextView) setMin(resetInternal.setMax.getContentInsetEnd);
        if (appCompatTextView != null) {
            String str4 = aVar2.toFloatRange.setMax.invoke;
            if (str4 == null) {
                str4 = str2;
            }
            appCompatTextView.setText(str4);
        }
        AppCompatTextView appCompatTextView2 = (AppCompatTextView) setMin(resetInternal.setMax.PostMessageService$1);
        if (appCompatTextView2 != null) {
            if (aVar2.toFloatRange.setMax.onTransact != null) {
                Long l = aVar2.toFloatRange.setMax.onTransact;
                Intrinsics.checkNotNullExpressionValue(l, "merchantConsultReviewMod…shopModel.transactionDate");
                str = new SimpleDateFormat("dd MMM yyyy • HH:mm", Locale.US).format(new Date(l.longValue()));
                Intrinsics.checkNotNullExpressionValue(str, "DateTimeUtil.convertDate…GC_DATE_FORMAT,Locale.US)");
            } else {
                str = str2;
            }
            appCompatTextView2.setText(str);
        }
        MerchantReviewRatingView merchantReviewRatingView = (MerchantReviewRatingView) setMin(resetInternal.setMax.calcCenters);
        if (merchantReviewRatingView != null) {
            AndroidWebView.a aVar3 = this.getMin;
            if (aVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewState");
            }
            aVar3.setMax.getMax(getViewLifecycleOwner(), new onNavigationState(new hashCode(merchantReviewRatingView)));
            merchantReviewRatingView.setClickListener(new equals(this));
        }
        MerchantReviewSentimentView merchantReviewSentimentView = (MerchantReviewSentimentView) setMin(resetInternal.setMax.setProgress);
        if (merchantReviewSentimentView != null) {
            AndroidWebView.a aVar4 = this.getMin;
            if (aVar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewState");
            }
            aVar4.getMax.getMax(getViewLifecycleOwner(), new onNavigationState(new toString(merchantReviewSentimentView)));
            Unit unit = Unit.INSTANCE;
        }
        MerchantReviewMainView merchantReviewMainView = (MerchantReviewMainView) setMin(resetInternal.setMax.onTransitionStarted);
        if (merchantReviewMainView != null) {
            merchantReviewMainView.setTextListener(new values(this));
            Unit unit2 = Unit.INSTANCE;
        }
        MerchantReviewPhotosView merchantReviewPhotosView = (MerchantReviewPhotosView) setMin(resetInternal.setMax.MotionHelper);
        if (merchantReviewPhotosView != null) {
            merchantReviewPhotosView.setListener(this);
        }
        AppCompatButton appCompatButton = (AppCompatButton) setMin(resetInternal.setMax.MediaDescriptionCompat);
        if (appCompatButton != null) {
            appCompatButton.setOnClickListener(new MerchantReviewDialogFragment$FastBitmap$CoordinateSystem(appCompatButton, this));
            AndroidWebView.a aVar5 = this.getMin;
            if (aVar5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewState");
            }
            aVar5.equals.getMax(getViewLifecycleOwner(), new onNavigationState(new toDoubleRange(appCompatButton)));
            Unit unit3 = Unit.INSTANCE;
        }
        GriverStartClientProxy.setMin setmin = new GriverStartClientProxy.setMin((byte) 0);
        FragmentActivity activity = getActivity();
        Context applicationContext = activity != null ? activity.getApplicationContext() : null;
        if (applicationContext != null) {
            PrepareException.AnonymousClass1 applicationComponent = ((DanaApplication) applicationContext).getApplicationComponent();
            if (applicationComponent != null) {
                setmin.length = applicationComponent;
                setmin.getMin = new MerchantReviewFormModule();
                if (setmin.getMin == null) {
                    setmin.getMin = new MerchantReviewFormModule();
                }
                stopIgnoring.setMin(setmin.length, PrepareException.AnonymousClass1.class);
                new GriverStartClientProxy(setmin.getMin, setmin.length, (byte) 0).getMin(this);
                addError adderror = this.tracker;
                if (adderror == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("tracker");
                }
                MerchantConsultReviewModel merchantConsultReviewModel2 = setMax;
                if (merchantConsultReviewModel2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("consultReviewModel");
                }
                String str5 = merchantConsultReviewModel2.getMax;
                MerchantConsultReviewModel merchantConsultReviewModel3 = setMax;
                if (merchantConsultReviewModel3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("consultReviewModel");
                }
                String str6 = merchantConsultReviewModel3.setMax.asInterface;
                if (str6 == null) {
                    str6 = str2;
                }
                MerchantConsultReviewModel merchantConsultReviewModel4 = setMax;
                if (merchantConsultReviewModel4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("consultReviewModel");
                }
                String str7 = merchantConsultReviewModel4.setMax.Grayscale$Algorithm;
                if (str7 == null) {
                    str7 = str2;
                }
                MerchantConsultReviewModel merchantConsultReviewModel5 = setMax;
                if (merchantConsultReviewModel5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("consultReviewModel");
                }
                String str8 = merchantConsultReviewModel5.setMax.invoke;
                if (str8 != null) {
                    str2 = str8;
                }
                adderror.length(str5, str6, str7, str2);
                return;
            }
            throw null;
        }
        throw new NullPointerException("null cannot be cast to non-null type id.dana.DanaApplication");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH\u0016¨\u0006\u000b¸\u0006\u0000"}, d2 = {"id/dana/nearbyme/merchantreview/MerchantReviewDialogFragment$setupBottomSheet$1$1", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior$BottomSheetCallback;", "onSlide", "", "view", "Landroid/view/View;", "offset", "", "onStateChanged", "state", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class isInside extends BottomSheetBehavior.BottomSheetCallback {
        final /* synthetic */ MerchantReviewDialogFragment getMin;

        public final void onSlide(@NotNull View view, float f) {
            Intrinsics.checkNotNullParameter(view, "view");
        }

        isInside(MerchantReviewDialogFragment merchantReviewDialogFragment) {
            this.getMin = merchantReviewDialogFragment;
        }

        public final void onStateChanged(@NotNull View view, int i) {
            Intrinsics.checkNotNullParameter(view, "view");
            if (i == 1) {
                ConstraintLayout constraintLayout = (ConstraintLayout) this.getMin.setMin(resetInternal.setMax.ensureViewModelStore);
                if (constraintLayout != null) {
                    constraintLayout.setVisibility(0);
                }
                AppCompatButton appCompatButton = (AppCompatButton) this.getMin.setMin(resetInternal.setMax.MediaDescriptionCompat);
                if (appCompatButton != null) {
                    appCompatButton.setVisibility(0);
                }
            } else if (i == 5) {
                this.getMin.dismiss();
            }
        }
    }

    public final void onCancel(@NotNull DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(dialogInterface, ImagePickerEvent.DIALOG);
        super.onCancel(dialogInterface);
        AndroidWebView.a aVar = this.getMin;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewState");
        }
        MerchantReviewDialogDismissState merchantReviewDialogDismissState = MerchantReviewDialogDismissState.DISMISSED_BY_CANCEL;
        Intrinsics.checkNotNullParameter(merchantReviewDialogDismissState, "<set-?>");
        aVar.getMin = merchantReviewDialogDismissState;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0000"}, d2 = {"id/dana/nearbyme/merchantreview/MerchantReviewDialogFragment$setupMerchantRatingView$1$2", "Lid/dana/nearbyme/merchantreview/ViewRatingStarBar$ClickListener;", "onStarClick", "", "rating", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class equals implements ViewRatingStarBar.setMax {
        final /* synthetic */ MerchantReviewDialogFragment setMin;

        equals(MerchantReviewDialogFragment merchantReviewDialogFragment) {
            this.setMin = merchantReviewDialogFragment;
        }

        public final void setMin(int i) {
            MerchantReviewDialogFragment.getMax(this.setMin).setMax.getMax(Integer.valueOf(i));
            ConstraintLayout constraintLayout = (ConstraintLayout) this.setMin.setMin(resetInternal.setMax.ensureViewModelStore);
            if (constraintLayout != null) {
                constraintLayout.setVisibility(0);
            }
            AppCompatButton appCompatButton = (AppCompatButton) this.setMin.setMin(resetInternal.setMax.MediaDescriptionCompat);
            if (appCompatButton != null) {
                appCompatButton.setVisibility(0);
            }
            BottomSheetBehavior from = BottomSheetBehavior.from((FrameLayout) this.setMin.setMin(resetInternal.setMax.RequiresPermission));
            Intrinsics.checkNotNullExpressionValue(from, "BottomSheetBehavior.from(fl_bottom_sheet)");
            from.setState(3);
            MerchantReviewDialogFragment.getMin(this.setMin);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 4, 2})
    static final class toFloatRange implements Runnable {
        final /* synthetic */ View setMin;

        toFloatRange(View view) {
            this.setMin = view;
        }

        public final void run() {
            ViewParent parent = this.setMin.getParent();
            if (parent != null) {
                ViewGroup.LayoutParams layoutParams = ((View) parent).getLayoutParams();
                if (layoutParams != null) {
                    CoordinatorLayout.Behavior behavior = ((CoordinatorLayout.length) layoutParams).setMin;
                    if (behavior != null) {
                        ((BottomSheetBehavior) behavior).setPeekHeight(this.setMin.getMeasuredHeight());
                        return;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetBehavior<android.view.View!>");
                }
                throw new NullPointerException("null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"id/dana/nearbyme/merchantreview/MerchantReviewDialogFragment$setupReviewView$1", "Lid/dana/nearbyme/merchantreview/MerchantReviewMainView$TextListener;", "onTextChanged", "", "text", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class values implements MerchantReviewMainView.length {
        final /* synthetic */ MerchantReviewDialogFragment setMax;

        values(MerchantReviewDialogFragment merchantReviewDialogFragment) {
            this.setMax = merchantReviewDialogFragment;
        }

        public final void setMin(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "text");
            AndroidWebView.a max = MerchantReviewDialogFragment.getMax(this.setMax);
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            max.length = str;
            MerchantReviewDialogFragment.getMax(this.setMax).setMin.getMax(Boolean.valueOf(str.length() > 150));
        }
    }

    public final void onDismiss(@NotNull DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(dialogInterface, ImagePickerEvent.DIALOG);
        super.onDismiss(dialogInterface);
        AndroidWebView.a aVar = this.getMin;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewState");
        }
        for (MerchantReviewTagModel merchantReviewTagModel : aVar.toFloatRange.getMin) {
            merchantReviewTagModel.length = false;
        }
        for (MerchantReviewTagModel merchantReviewTagModel2 : aVar.toFloatRange.length) {
            merchantReviewTagModel2.length = false;
        }
        Function1<? super MerchantReviewDialogDismissState, Unit> function1 = this.getMax;
        AndroidWebView.a aVar2 = this.getMin;
        if (aVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewState");
        }
        function1.invoke(aVar2.getMin);
    }

    /* access modifiers changed from: private */
    public final Unit getMax() {
        List<String> photos;
        Unit unit;
        MerchantReviewPhotosView merchantReviewPhotosView = (MerchantReviewPhotosView) setMin(resetInternal.setMax.MotionHelper);
        if (!(merchantReviewPhotosView == null || (photos = merchantReviewPhotosView.getPhotos()) == null)) {
            if (!(!photos.isEmpty())) {
                photos = null;
            }
            if (photos != null) {
                Context context = getContext();
                if (context != null) {
                    AndroidWebView.a aVar = this.getMin;
                    if (aVar == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("viewState");
                    }
                    CreateReviewWorker.getMin min = setMin(aVar);
                    Intrinsics.checkNotNullParameter(context, "$this$uploadImagesThenCreateReview");
                    Intrinsics.checkNotNullParameter(photos, "images");
                    Intrinsics.checkNotNullParameter(min, "param");
                    try {
                        setTextSize max = setTextSize.getMax(context);
                        Intrinsics.checkNotNullExpressionValue(max, "WorkManager.getInstance(this)");
                        UploadImageWorker.length length2 = UploadImageWorker.getMin;
                        Intrinsics.checkNotNullParameter(photos, "imageUris");
                        Iterable<String> iterable = photos;
                        Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
                        for (String put : iterable) {
                            setBackgroundDrawable.getMin getmin = (setBackgroundDrawable.getMin) new setBackgroundDrawable.getMin(UploadImageWorker.class).length(BackoffPolicy.LINEAR, TimeUnit.MILLISECONDS);
                            UploadImageWorker.length length3 = UploadImageWorker.getMin;
                            updateAppearance.getMin getmin2 = new updateAppearance.getMin();
                            getmin2.length.put("imageFile", put);
                            updateAppearance updateappearance = new updateAppearance((Map<String, ?>) getmin2.length);
                            updateAppearance.setMax(updateappearance);
                            Intrinsics.checkNotNullExpressionValue(updateappearance, "Data.Builder().putString…IMAGE_FILE, this).build()");
                            getmin.setMin.setMin = updateappearance;
                            arrayList.add((setBackgroundDrawable) ((setBackgroundDrawable.getMin) getmin.getMax()).setMin());
                        }
                        setAutoSizeTextTypeUniformWithPresetSizes max2 = max.setMax((List) arrayList);
                        CreateReviewWorker.setMin setmin = CreateReviewWorker.setMin;
                        max2.length(Collections.singletonList(CreateReviewWorker.setMin.setMax(min))).setMin();
                    } catch (Exception e) {
                        try {
                            FirebaseCrashlytics.getInstance().recordException(new WorkManagerFailure(e));
                        } catch (Exception unused) {
                        }
                    }
                    unit = Unit.INSTANCE;
                } else {
                    unit = null;
                }
                if (unit != null) {
                    return unit;
                }
            }
        }
        Context context2 = getContext();
        if (context2 == null) {
            return null;
        }
        AndroidWebView.a aVar2 = this.getMin;
        if (aVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewState");
        }
        CreateReviewWorker.getMin min2 = setMin(aVar2);
        Intrinsics.checkNotNullParameter(context2, "$this$createReview");
        Intrinsics.checkNotNullParameter(min2, "param");
        try {
            setTextSize max3 = setTextSize.getMax(context2);
            Intrinsics.checkNotNullExpressionValue(max3, "WorkManager.getInstance(this)");
            CreateReviewWorker.setMin setmin2 = CreateReviewWorker.setMin;
            max3.setMax(Collections.singletonList(CreateReviewWorker.setMin.setMax(min2))).setMin();
        } catch (Exception e2) {
            try {
                FirebaseCrashlytics.getInstance().recordException(new WorkManagerFailure(e2));
            } catch (Exception unused2) {
            }
        }
        return Unit.INSTANCE;
    }

    public final void onDestroy() {
        j.AnonymousClass1.length length2 = this.presenter;
        if (length2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("presenter");
        }
        length2.getMax();
        j.AnonymousClass1.length length3 = this.presenter;
        if (length3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("presenter");
        }
        AndroidWebView.a aVar = this.getMin;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewState");
        }
        String str = aVar.toFloatRange.setMax.b;
        if (str == null) {
            str = "";
        }
        length3.getMin(str);
        super.onDestroy();
    }

    public final void setMin() {
        MerchantReviewPhotosView merchantReviewPhotosView = (MerchantReviewPhotosView) setMin(resetInternal.setMax.MotionHelper);
        if (merchantReviewPhotosView != null) {
            merchantReviewPhotosView.checkForPermission();
        }
    }

    public final void getMin(@NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(intent, IpcMessageConstants.EXTRA_INTENT);
        this.setMin.getMin(intent, (name) null);
    }

    public final void setMax(@NotNull String[] strArr) {
        Intrinsics.checkNotNullParameter(strArr, "requiredPermission");
        requestPermissions(strArr, 1002);
    }

    public final void onRequestPermissionsResult(int i, @NotNull String[] strArr, @NotNull int[] iArr) {
        Intrinsics.checkNotNullParameter(strArr, RequestPermission.PERMISSIONS);
        Intrinsics.checkNotNullParameter(iArr, RequestPermission.GRANT_RESULTS);
        super.onRequestPermissionsResult(i, strArr, iArr);
        MerchantReviewPhotosView merchantReviewPhotosView = (MerchantReviewPhotosView) setMin(resetInternal.setMax.MotionHelper);
        if (merchantReviewPhotosView != null) {
            merchantReviewPhotosView.onRequestPermissionResult(i, iArr);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003c, code lost:
        r0 = (androidx.appcompat.widget.AppCompatCheckBox) r0._$_findCachedViewById(o.resetInternal.setMax.getPackageName);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final id.dana.nearbyme.merchantreview.CreateReviewWorker.getMin setMin(o.AndroidWebView.a r9) {
        /*
            r8 = this;
            id.dana.nearbyme.merchantreview.CreateReviewWorker$getMin r7 = new id.dana.nearbyme.merchantreview.CreateReviewWorker$getMin
            java.lang.String r1 = r9.length
            o.CascadingMenuPopup$HorizPosition<java.lang.Integer> r0 = r9.setMax
            java.lang.Object r0 = r0.setMin
            java.lang.Object r2 = androidx.lifecycle.LiveData.setMax
            if (r0 == r2) goto L_0x000d
            goto L_0x000e
        L_0x000d:
            r0 = 0
        L_0x000e:
            java.lang.Integer r0 = (java.lang.Integer) r0
            r2 = 0
            if (r0 != 0) goto L_0x0017
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
        L_0x0017:
            java.lang.String r3 = "rating.value ?: 0"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r3)
            int r3 = r0.intValue()
            java.util.List r4 = r9.getMin()
            java.util.List r5 = r9.length()
            id.dana.nearbyme.merchantreview.model.MerchantConsultReviewModel r9 = r9.toFloatRange
            id.dana.nearbyme.model.ShopModel r9 = r9.setMax
            java.lang.String r9 = r9.b
            if (r9 != 0) goto L_0x0032
            java.lang.String r9 = ""
        L_0x0032:
            int r0 = o.resetInternal.setMax.setPrompt
            android.view.View r0 = r8.setMin((int) r0)
            id.dana.sendmoney.feed.ShareToFeedsView r0 = (id.dana.sendmoney.feed.ShareToFeedsView) r0
            if (r0 == 0) goto L_0x004c
            int r6 = o.resetInternal.setMax.getPackageName
            android.view.View r0 = r0._$_findCachedViewById(r6)
            androidx.appcompat.widget.AppCompatCheckBox r0 = (androidx.appcompat.widget.AppCompatCheckBox) r0
            if (r0 == 0) goto L_0x004c
            boolean r0 = r0.isChecked()
            r6 = r0
            goto L_0x004d
        L_0x004c:
            r6 = 0
        L_0x004d:
            r0 = r7
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: id.dana.nearbyme.merchantreview.MerchantReviewDialogFragment.setMin(o.AndroidWebView$a):id.dana.nearbyme.merchantreview.CreateReviewWorker$getMin");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J,\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00122\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u0014H\u0002J4\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00122\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u0014H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u00020\tX.¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u001b"}, d2 = {"Lid/dana/nearbyme/merchantreview/MerchantReviewDialogFragment$Companion;", "", "()V", "MERCHANT_REVIEW_DATA_KEY", "", "MERCHANT_REVIEW_FULL_EXPAND", "MERCHANT_REVIEW_STAR_COUNT_KEY", "TAG", "consultReviewModel", "Lid/dana/nearbyme/merchantreview/model/MerchantConsultReviewModel;", "getConsultReviewModel", "()Lid/dana/nearbyme/merchantreview/model/MerchantConsultReviewModel;", "setConsultReviewModel", "(Lid/dana/nearbyme/merchantreview/model/MerchantConsultReviewModel;)V", "buildDialog", "Lid/dana/nearbyme/merchantreview/MerchantReviewDialogFragment;", "modelConsult", "fullExpand", "", "onDismiss", "Lkotlin/Function1;", "Lid/dana/nearbyme/merchantreview/model/MerchantReviewDialogDismissState;", "", "show", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "consultReviewData", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMin {
        private getMin() {
        }

        public /* synthetic */ getMin(byte b) {
            this();
        }

        private static MerchantReviewDialogFragment setMin(MerchantConsultReviewModel merchantConsultReviewModel, boolean z, Function1<? super MerchantReviewDialogDismissState, Unit> function1) {
            MerchantReviewDialogFragment merchantReviewDialogFragment = new MerchantReviewDialogFragment();
            Bundle bundle = new Bundle();
            bundle.putParcelable("MERCHANT_REVIEW_DATA_KEY", merchantConsultReviewModel);
            bundle.putInt("MERCHANT_REVIEW_STAR_COUNT_KEY", merchantConsultReviewModel.setMin);
            bundle.putBoolean("MERCHANT_REVIEW_FULL_EXPAND", z);
            Unit unit = Unit.INSTANCE;
            merchantReviewDialogFragment.setArguments(bundle);
            Intrinsics.checkNotNullParameter(function1, "<set-?>");
            merchantReviewDialogFragment.getMax = function1;
            return merchantReviewDialogFragment;
        }

        @JvmStatic
        public static void setMin(@NotNull FragmentManager fragmentManager, @NotNull MerchantConsultReviewModel merchantConsultReviewModel, boolean z, @NotNull Function1<? super MerchantReviewDialogDismissState, Unit> function1) {
            Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
            Intrinsics.checkNotNullParameter(merchantConsultReviewModel, "consultReviewData");
            Intrinsics.checkNotNullParameter(function1, "onDismiss");
            setColorFilter setcolorfilter = new setColorFilter(fragmentManager);
            Intrinsics.checkNotNullExpressionValue(setcolorfilter, "fragmentManager.beginTransaction()");
            if (fragmentManager.findFragmentByTag("MerchantReviewDialog") == null) {
                setMin(merchantConsultReviewModel, z, function1).show((invalidateDrawable) setcolorfilter, "MerchantReviewDialog");
                Intrinsics.checkNotNullParameter(merchantConsultReviewModel, "<set-?>");
                MerchantReviewDialogFragment.setMax = merchantConsultReviewModel;
            }
        }
    }

    public static final /* synthetic */ Unit length(MerchantReviewDialogFragment merchantReviewDialogFragment) {
        Bundle arguments = merchantReviewDialogFragment.getArguments();
        if (arguments != null) {
            Boolean valueOf = Boolean.valueOf(arguments.getBoolean("MERCHANT_REVIEW_FULL_EXPAND"));
            if (!valueOf.booleanValue()) {
                valueOf = null;
            }
            if (valueOf != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) merchantReviewDialogFragment.setMin(resetInternal.setMax.ensureViewModelStore);
                if (constraintLayout != null) {
                    constraintLayout.setVisibility(0);
                }
                AppCompatButton appCompatButton = (AppCompatButton) merchantReviewDialogFragment.setMin(resetInternal.setMax.MediaDescriptionCompat);
                if (appCompatButton != null) {
                    appCompatButton.setVisibility(0);
                }
                BottomSheetBehavior from = BottomSheetBehavior.from((FrameLayout) merchantReviewDialogFragment.setMin(resetInternal.setMax.RequiresPermission));
                Intrinsics.checkNotNullExpressionValue(from, "BottomSheetBehavior.from(fl_bottom_sheet)");
                from.setState(3);
                return Unit.INSTANCE;
            }
        }
        return null;
    }

    public static final /* synthetic */ void getMin(MerchantReviewDialogFragment merchantReviewDialogFragment) {
        ViewGroup.LayoutParams layoutParams;
        Dialog dialog = merchantReviewDialogFragment.getDialog();
        View findViewById = dialog != null ? dialog.findViewById(R.id.f42162131362710) : null;
        if (!(findViewById == null || (layoutParams = findViewById.getLayoutParams()) == null)) {
            layoutParams.height = -1;
        }
        View view = merchantReviewDialogFragment.getView();
        if (view != null) {
            view.post(new toFloatRange(view));
        }
    }

    public static final /* synthetic */ void setMax(MerchantReviewDialogFragment merchantReviewDialogFragment) {
        List<MerchantReviewTagModel> list;
        String str;
        String str2;
        MerchantReviewDialogFragment merchantReviewDialogFragment2 = merchantReviewDialogFragment;
        addError adderror = merchantReviewDialogFragment2.tracker;
        if (adderror == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tracker");
        }
        AndroidWebView.a aVar = merchantReviewDialogFragment2.getMin;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewState");
        }
        MerchantReviewSentimentView merchantReviewSentimentView = (MerchantReviewSentimentView) merchantReviewDialogFragment2.setMin(resetInternal.setMax.setProgress);
        if (merchantReviewSentimentView == null || (list = merchantReviewSentimentView.getSelectedTags()) == null) {
            list = CollectionsKt.emptyList();
        }
        Intrinsics.checkNotNullParameter(list, "selectedTags");
        String str3 = aVar.toFloatRange.getMax;
        String str4 = aVar.toFloatRange.setMax.asInterface;
        String str5 = str4 == null ? "" : str4;
        String str6 = aVar.toFloatRange.setMax.Grayscale$Algorithm;
        if (str6 == null) {
            str = "";
        } else {
            str = str6;
        }
        String str7 = aVar.toFloatRange.setMax.invoke;
        if (str7 == null) {
            str2 = "";
        } else {
            str2 = str7;
        }
        Object obj = aVar.setMax.setMin;
        if (obj == LiveData.setMax) {
            obj = null;
        }
        Integer num = (Integer) obj;
        if (num == null) {
            num = 0;
        }
        adderror.setMax(new hasError(str3, str5, str, str2, String.valueOf(num.intValue()), CollectionsKt.joinToString$default(list, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, AndroidWebView.a.getMin.INSTANCE, 30, (Object) null), aVar.length.length() > 0));
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        HashMap hashMap = this.toFloatRange;
        if (hashMap != null) {
            hashMap.clear();
        }
    }
}
