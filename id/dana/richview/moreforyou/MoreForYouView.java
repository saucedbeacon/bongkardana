package id.dana.richview.moreforyou;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ap.zoloz.hummer.biz.HummerConstants;
import id.dana.R;
import id.dana.base.BaseRichView;
import id.dana.component.buttoncomponent.DanaButtonSecondaryView;
import id.dana.contract.deeplink.DeepLinkModule;
import id.dana.contract.deeplink.FeatureModule;
import id.dana.contract.services.ServicesModule;
import id.dana.contract.shortener.RestoreUrlModule;
import id.dana.contract.staticqr.ScanQrModule;
import id.dana.danah5.DanaH5;
import id.dana.di.modules.MoreForYouModule;
import id.dana.di.modules.OauthModule;
import id.dana.richview.HomeWidgetBase;
import id.dana.richview.LogoProgressView;
import java.util.HashMap;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmDefault;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o.CameraParams;
import o.Ignore;
import o.IntRange;
import o.PrepareException;
import o.getAspectRatio;
import o.getDuration;
import o.getScrimColor;
import o.isShowMenu;
import o.onDetachedFromLayoutParams;
import o.onPrepareDone;
import o.resetInternal;
import o.setQuality;
import o.setShadowResourceRight;
import o.stopIgnoring;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u0000 A2\u00020\u0001:\u0001AB%\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bB)\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0002\u0010\u000bJ\b\u0010*\u001a\u00020+H\u0002J\u0016\u0010,\u001a\u00020+2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020+0.H\u0002J\u0016\u0010/\u001a\u00020+2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020+0.H\u0002J\b\u00100\u001a\u00020+H\u0002J\u001e\u00101\u001a\u00020(2\u0006\u00102\u001a\u00020\u00072\f\u0010-\u001a\b\u0012\u0004\u0012\u00020+0.H\u0002J\b\u00103\u001a\u00020\u0007H\u0016J\b\u00104\u001a\u00020\u0007H\u0002J\b\u00105\u001a\u00020+H\u0002J\b\u00106\u001a\u00020+H\u0002J\b\u00107\u001a\u00020+H\u0002J\b\u00108\u001a\u00020+H\u0002J\b\u00109\u001a\u00020+H\u0002J\u0010\u0010:\u001a\u00020+2\u0006\u0010;\u001a\u00020<H\u0002J\u0006\u0010=\u001a\u00020+J\b\u0010>\u001a\u00020+H\u0016J\b\u0010?\u001a\u00020+H\u0002J\b\u0010@\u001a\u00020+H\u0002R\u000e\u0010\f\u001a\u00020\rX.¢\u0006\u0002\n\u0000R$\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000f@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0015\u001a\u00020\u000fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X.¢\u0006\u0002\n\u0000R\u001e\u0010\u001a\u001a\u00020\u001b8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001e\u0010 \u001a\u00020!8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u000e\u0010&\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010'\u001a\u0004\u0018\u00010(X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010)\u001a\u0004\u0018\u00010(X\u000e¢\u0006\u0002\n\u0000¨\u0006B"}, d2 = {"Lid/dana/richview/moreforyou/MoreForYouView;", "Lid/dana/base/BaseRichView;", "context", "Landroid/content/Context;", "attributeSet", "Landroid/util/AttributeSet;", "defStyleArr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "attrs", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "adapter", "Lid/dana/richview/moreforyou/MoreForYouAdapter;", "value", "", "investmentMoreForYouEnable", "getInvestmentMoreForYouEnable", "()Z", "setInvestmentMoreForYouEnable", "(Z)V", "isExpanded", "layoutManager", "Landroidx/recyclerview/widget/LinearLayoutManager;", "moreForYouItemSkeleton", "Lcom/ethanhua/skeleton/SkeletonScreen;", "presenter", "Lid/dana/richview/moreforyou/MoreForYouContract$Presenter;", "getPresenter", "()Lid/dana/richview/moreforyou/MoreForYouContract$Presenter;", "setPresenter", "(Lid/dana/richview/moreforyou/MoreForYouContract$Presenter;)V", "readDeepLinkPropertiesPresenter", "Lid/dana/contract/deeplink/ReadLinkPropertiesContract$Presenter;", "getReadDeepLinkPropertiesPresenter", "()Lid/dana/contract/deeplink/ReadLinkPropertiesContract$Presenter;", "setReadDeepLinkPropertiesPresenter", "(Lid/dana/contract/deeplink/ReadLinkPropertiesContract$Presenter;)V", "recyclerViewHeight", "slideDownAnimation", "Landroid/animation/ValueAnimator;", "slideUpAnimation", "adjustViewHeightAccordingToFirstItemHeight", "", "animateSlideDown", "onAnimationEnd", "Lkotlin/Function0;", "animateSlideUp", "checkInvestmentStatus", "generateAnimationValueAnimator", "resultHeight", "getLayout", "getMoreForYouFirstItemHeight", "hideMoreForYouItemSkeleton", "hideProgressBar", "initButton", "initInjection", "initRecyclerView", "openH5Container", "url", "", "refreshContent", "setup", "showMoreForYouItemSkeleton", "showProgressBar", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class MoreForYouView extends BaseRichView {
    @NotNull
    public static final length Companion = new length((byte) 0);
    private HashMap IsOverlapping;
    /* access modifiers changed from: private */
    public onDetachedFromLayoutParams equals;
    private LinearLayoutManager getMax;
    /* access modifiers changed from: private */
    public int getMin;
    /* access modifiers changed from: private */
    public boolean isInside;
    private ValueAnimator length;
    @Inject
    public getAspectRatio.getMax presenter;
    @Inject
    public getDuration.length readDeepLinkPropertiesPresenter;
    private ValueAnimator setMax;
    /* access modifiers changed from: private */
    public setQuality setMin;
    private boolean toIntRange;

    @JvmOverloads
    public MoreForYouView(@NotNull Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
    }

    @JvmOverloads
    public MoreForYouView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
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
        return R.layout.view_more_for_you;
    }

    public static final /* synthetic */ setQuality access$getAdapter$p(MoreForYouView moreForYouView) {
        setQuality setquality = moreForYouView.setMin;
        if (setquality == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
        }
        return setquality;
    }

    public static final /* synthetic */ onDetachedFromLayoutParams access$getMoreForYouItemSkeleton$p(MoreForYouView moreForYouView) {
        onDetachedFromLayoutParams ondetachedfromlayoutparams = moreForYouView.equals;
        if (ondetachedfromlayoutparams == null) {
            Intrinsics.throwUninitializedPropertyAccessException("moreForYouItemSkeleton");
        }
        return ondetachedfromlayoutparams;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MoreForYouView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public MoreForYouView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
    }

    @NotNull
    public final getAspectRatio.getMax getPresenter() {
        getAspectRatio.getMax getmax = this.presenter;
        if (getmax == null) {
            Intrinsics.throwUninitializedPropertyAccessException("presenter");
        }
        return getmax;
    }

    public final void setPresenter(@NotNull getAspectRatio.getMax getmax) {
        Intrinsics.checkNotNullParameter(getmax, "<set-?>");
        this.presenter = getmax;
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

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @TargetApi(21)
    public MoreForYouView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
    }

    public final boolean getInvestmentMoreForYouEnable() {
        return this.toIntRange;
    }

    public final void setInvestmentMoreForYouEnable(boolean z) {
        this.toIntRange = z;
        getMin();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005¸\u0006\u0000"}, d2 = {"com/andrognito/flashbar/util/CommonUtilsKt$afterMeasured$1", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V", "onGlobalLayout", "", "flashbar_release"}, k = 1, mv = {1, 4, 2})
    public static final class isInside implements ViewTreeObserver.OnGlobalLayoutListener {
        final /* synthetic */ MoreForYouView getMax;
        final /* synthetic */ View setMax;

        public isInside(View view, MoreForYouView moreForYouView) {
            this.setMax = view;
            this.getMax = moreForYouView;
        }

        public final void onGlobalLayout() {
            if (this.setMax.getMeasuredWidth() > 0 && this.setMax.getMeasuredHeight() > 0) {
                if (Build.VERSION.SDK_INT >= 16) {
                    this.setMax.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                } else {
                    this.setMax.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                }
                MoreForYouView moreForYouView = this.getMax;
                RecyclerView recyclerView = (RecyclerView) ((RecyclerView) this.setMax).findViewById(resetInternal.setMax.setCheckMarkDrawable);
                Intrinsics.checkNotNullExpressionValue(recyclerView, "rv_more_for_you");
                moreForYouView.getMin = recyclerView.getMeasuredHeight();
                MoreForYouView.access$adjustViewHeightAccordingToFirstItemHeight(this.getMax);
            }
        }
    }

    private final void getMax() {
        if (this.equals == null) {
            getScrimColor.getMax getmax = new getScrimColor.getMax((RecyclerView) _$_findCachedViewById(resetInternal.setMax.setCheckMarkDrawable));
            getmax.getMax = R.layout.skeleton_item_more_for_you;
            setQuality setquality = this.setMin;
            if (setquality == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapter");
            }
            getmax.length = setquality;
            getmax.toFloatRange = IntRange.setMax(getmax.setMax.getContext(), R.color.f24782131100433);
            getmax.getMin = true;
            getmax.toIntRange = 0;
            getmax.IsOverlapping = 1500;
            getmax.setMin = 1;
            getScrimColor getscrimcolor = new getScrimColor(getmax, (byte) 0);
            getscrimcolor.getMin();
            Intrinsics.checkNotNullExpressionValue(getscrimcolor, "Skeleton.bind(rv_more_fo…)\n                .show()");
            this.equals = getscrimcolor;
            return;
        }
        onDetachedFromLayoutParams ondetachedfromlayoutparams = this.equals;
        if (ondetachedfromlayoutparams == null) {
            Intrinsics.throwUninitializedPropertyAccessException("moreForYouItemSkeleton");
        }
        ondetachedfromlayoutparams.getMin();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\t¸\u0006\u000b"}, d2 = {"androidx/core/animation/AnimatorKt$addListener$listener$1", "Landroid/animation/Animator$AnimatorListener;", "onAnimationCancel", "", "animator", "Landroid/animation/Animator;", "onAnimationEnd", "onAnimationRepeat", "onAnimationStart", "core-ktx_release", "androidx/core/animation/AnimatorKt$doOnEnd$$inlined$addListener$default$1", "id/dana/richview/moreforyou/MoreForYouView$$special$$inlined$doOnEnd$1"}, k = 1, mv = {1, 4, 2}, xi = 48)
    public static final class setMin implements Animator.AnimatorListener {
        final /* synthetic */ Function0 getMax;
        final /* synthetic */ MoreForYouView setMin;

        public final void onAnimationCancel(@NotNull Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "animator");
        }

        public final void onAnimationRepeat(@NotNull Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "animator");
        }

        public final void onAnimationStart(@NotNull Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "animator");
        }

        public setMin(MoreForYouView moreForYouView, Function0 function0) {
            this.setMin = moreForYouView;
            this.getMax = function0;
        }

        public final void onAnimationEnd(@NotNull Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "animator");
            this.getMax.invoke();
        }
    }

    private final ValueAnimator setMax(int i, Function0<Unit> function0) {
        View view = getView();
        Intrinsics.checkNotNullExpressionValue(view, "view");
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{view.getMeasuredHeight(), i});
        ofInt.setTarget(getView());
        ofInt.addUpdateListener(new getMin(this, function0));
        ofInt.addListener(new setMin(this, function0));
        ofInt.setDuration(300);
        Intrinsics.checkNotNullExpressionValue(ofInt, "ValueAnimator.ofInt(view…NIMATE_DURATION\n        }");
        return ofInt;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "onAnimationUpdate", "id/dana/richview/moreforyou/MoreForYouView$generateAnimationValueAnimator$1$1"}, k = 3, mv = {1, 4, 2})
    static final class getMin implements ValueAnimator.AnimatorUpdateListener {
        final /* synthetic */ MoreForYouView length;
        final /* synthetic */ Function0 setMin;

        getMin(MoreForYouView moreForYouView, Function0 function0) {
            this.length = moreForYouView;
            this.setMin = function0;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            View access$getView = this.length.getView();
            Intrinsics.checkNotNullExpressionValue(access$getView, "view");
            ViewGroup.LayoutParams layoutParams = access$getView.getLayoutParams();
            Intrinsics.checkNotNullExpressionValue(layoutParams, "view.layoutParams");
            Intrinsics.checkNotNullExpressionValue(valueAnimator, "it");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                layoutParams.height = ((Integer) animatedValue).intValue();
                View access$getView2 = this.length.getView();
                Intrinsics.checkNotNullExpressionValue(access$getView2, "view");
                access$getView2.setLayoutParams(layoutParams);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "position", "", "onItemClick"}, k = 3, mv = {1, 4, 2})
    static final class equals implements Ignore.setMin {
        final /* synthetic */ MoreForYouView setMax;

        equals(MoreForYouView moreForYouView) {
            this.setMax = moreForYouView;
        }

        public final void length(int i) {
            CameraParams min = MoreForYouView.access$getAdapter$p(this.setMax).setMin(i);
            MoreForYouView moreForYouView = this.setMax;
            String str = min.getMax;
            if (str == null) {
                str = "";
            }
            MoreForYouView.access$openH5Container(moreForYouView, str);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0016\u0010\u0004\u001a\u00020\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016¨\u0006\b"}, d2 = {"id/dana/richview/moreforyou/MoreForYouView$initInjection$1", "Lid/dana/richview/moreforyou/MoreForYouContract$View;", "onGetMoreForYouError", "", "onGetMoreForYouSuccess", "listOfItem", "", "Lid/dana/richview/moreforyou/model/MoreForYouModel;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMax implements getAspectRatio.length {
        final /* synthetic */ MoreForYouView getMin;

        @JvmDefault
        public final void dismissProgress() {
        }

        @JvmDefault
        public final void onError(@Nullable String str) {
        }

        @JvmDefault
        public final void showProgress() {
        }

        setMax(MoreForYouView moreForYouView) {
            this.getMin = moreForYouView;
        }

        public final void length(@NotNull List<CameraParams> list) {
            DanaButtonSecondaryView buttonView;
            Intrinsics.checkNotNullParameter(list, "listOfItem");
            MoreForYouView.access$hideProgressBar(this.getMin);
            MoreForYouView.access$hideMoreForYouItemSkeleton(this.getMin);
            if (list.isEmpty()) {
                HomeWidgetBase homeWidgetBase = (HomeWidgetBase) this.getMin._$_findCachedViewById(resetInternal.setMax.XmlRes);
                if (homeWidgetBase != null) {
                    homeWidgetBase.dismissWidget();
                    return;
                }
                return;
            }
            HomeWidgetBase homeWidgetBase2 = (HomeWidgetBase) this.getMin._$_findCachedViewById(resetInternal.setMax.XmlRes);
            int i = 0;
            if (homeWidgetBase2 != null) {
                View view = homeWidgetBase2;
                Intrinsics.checkNotNullParameter(view, "<this>");
                view.setVisibility(0);
            }
            HomeWidgetBase homeWidgetBase3 = (HomeWidgetBase) this.getMin._$_findCachedViewById(resetInternal.setMax.XmlRes);
            if (!(homeWidgetBase3 == null || (buttonView = homeWidgetBase3.getButtonView()) == null)) {
                View view2 = buttonView;
                boolean z = true;
                if (list.size() <= 1) {
                    z = false;
                }
                Intrinsics.checkNotNullParameter(view2, "<this>");
                if (!z) {
                    i = 8;
                }
                view2.setVisibility(i);
            }
            MoreForYouView.access$getAdapter$p(this.getMin).getMin(list);
            this.getMin.getMin();
        }

        public final void getMin() {
            MoreForYouView.access$hideProgressBar(this.getMin);
            MoreForYouView.access$hideMoreForYouItemSkeleton(this.getMin);
            HomeWidgetBase homeWidgetBase = (HomeWidgetBase) this.getMin._$_findCachedViewById(resetInternal.setMax.XmlRes);
            if (homeWidgetBase != null) {
                homeWidgetBase.dismissWidget();
            }
        }
    }

    /* access modifiers changed from: private */
    public final void getMin() {
        if (!this.toIntRange) {
            setQuality setquality = this.setMin;
            if (setquality == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapter");
            }
            if (setquality.getItemCount() > 0) {
                setQuality setquality2 = this.setMin;
                if (setquality2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("adapter");
                }
                int length2 = setquality2.length("DANA_REKSA_FUNDTASTIC");
                if (length2 != -1) {
                    setQuality setquality3 = this.setMin;
                    if (setquality3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("adapter");
                    }
                    setquality3.getMax(length2);
                }
            }
        }
    }

    public final void refreshContent() {
        HomeWidgetBase homeWidgetBase = (HomeWidgetBase) _$_findCachedViewById(resetInternal.setMax.XmlRes);
        if (homeWidgetBase != null) {
            View view = homeWidgetBase;
            Intrinsics.checkNotNullParameter(view, "<this>");
            view.setVisibility(0);
        }
        getAspectRatio.getMax getmax = this.presenter;
        if (getmax == null) {
            Intrinsics.throwUninitializedPropertyAccessException("presenter");
        }
        getmax.length();
        getMax();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class getMax implements View.OnClickListener {
        final /* synthetic */ MoreForYouView getMax;

        getMax(MoreForYouView moreForYouView) {
            this.getMax = moreForYouView;
        }

        public final void onClick(View view) {
            if (((RecyclerView) this.getMax._$_findCachedViewById(resetInternal.setMax.setCheckMarkDrawable)) == null) {
                return;
            }
            if (this.getMax.isInside) {
                MoreForYouView.access$animateSlideUp(this.getMax, new C0048getMax(this));
            } else {
                MoreForYouView.access$animateSlideDown(this.getMax, new setMin(this));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "invoke", "id/dana/richview/moreforyou/MoreForYouView$initButton$1$1$1"}, k = 3, mv = {1, 4, 2})
        /* renamed from: id.dana.richview.moreforyou.MoreForYouView$getMax$getMax  reason: collision with other inner class name */
        static final class C0048getMax extends Lambda implements Function0<Unit> {
            final /* synthetic */ getMax this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0048getMax(getMax getmax) {
                super(0);
                this.this$0 = getmax;
            }

            public final void invoke() {
                HomeWidgetBase homeWidgetBase = (HomeWidgetBase) this.this$0.getMax._$_findCachedViewById(resetInternal.setMax.XmlRes);
                if (homeWidgetBase != null) {
                    String string = this.this$0.getMax.getResources().getString(R.string.more_for_you_show);
                    Intrinsics.checkNotNullExpressionValue(string, "resources.getString(\n   …string.more_for_you_show)");
                    homeWidgetBase.setButtonText(string);
                }
                this.this$0.getMax.isInside = !this.this$0.getMax.isInside;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "invoke", "id/dana/richview/moreforyou/MoreForYouView$initButton$1$1$2"}, k = 3, mv = {1, 4, 2})
        static final class setMin extends Lambda implements Function0<Unit> {
            final /* synthetic */ getMax this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            setMin(getMax getmax) {
                super(0);
                this.this$0 = getmax;
            }

            public final void invoke() {
                HomeWidgetBase homeWidgetBase = (HomeWidgetBase) this.this$0.getMax._$_findCachedViewById(resetInternal.setMax.XmlRes);
                if (homeWidgetBase != null) {
                    String string = this.this$0.getMax.getResources().getString(R.string.more_for_you_hide);
                    Intrinsics.checkNotNullExpressionValue(string, "resources.getString(\n   …string.more_for_you_hide)");
                    homeWidgetBase.setButtonText(string);
                }
                this.this$0.getMax.isInside = !this.this$0.getMax.isInside;
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lid/dana/richview/moreforyou/MoreForYouView$Companion;", "", "()V", "ANIMATE_DURATION", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class length {
        private length() {
        }

        public /* synthetic */ length(byte b) {
            this();
        }
    }

    public final void setup() {
        onPrepareDone.setMin setmin = new onPrepareDone.setMin((byte) 0);
        PrepareException.AnonymousClass1 applicationComponent = getApplicationComponent();
        if (applicationComponent != null) {
            setmin.isInside = applicationComponent;
            setmin.getMax = new MoreForYouModule(new setMax(this));
            DeepLinkModule.setMin max = DeepLinkModule.getMax();
            max.getMax = getBaseActivity();
            setmin.setMax = new DeepLinkModule(max, (byte) 0);
            ScanQrModule.setMin max2 = ScanQrModule.getMax();
            max2.setMin = getBaseActivity();
            setmin.setMin = new ScanQrModule(max2, (byte) 0);
            RestoreUrlModule.setMin min = RestoreUrlModule.setMin();
            min.getMax = getBaseActivity();
            setmin.getMin = new RestoreUrlModule(min, (byte) 0);
            FeatureModule.length length2 = FeatureModule.length();
            length2.setMax = getBaseActivity();
            setmin.length = new FeatureModule(length2, (byte) 0);
            OauthModule.getMax min2 = OauthModule.setMin();
            min2.setMin = getBaseActivity();
            setmin.toFloatRange = new OauthModule(min2, (byte) 0);
            stopIgnoring.setMin(setmin.getMax, MoreForYouModule.class);
            stopIgnoring.setMin(setmin.setMax, DeepLinkModule.class);
            stopIgnoring.setMin(setmin.setMin, ScanQrModule.class);
            stopIgnoring.setMin(setmin.getMin, RestoreUrlModule.class);
            stopIgnoring.setMin(setmin.length, FeatureModule.class);
            stopIgnoring.setMin(setmin.toFloatRange, OauthModule.class);
            if (setmin.toIntRange == null) {
                setmin.toIntRange = new ServicesModule();
            }
            stopIgnoring.setMin(setmin.isInside, PrepareException.AnonymousClass1.class);
            new onPrepareDone(setmin.getMax, setmin.setMax, setmin.setMin, setmin.getMin, setmin.length, setmin.toFloatRange, setmin.toIntRange, setmin.isInside, (byte) 0).setMax(this);
            HomeWidgetBase homeWidgetBase = (HomeWidgetBase) _$_findCachedViewById(resetInternal.setMax.XmlRes);
            if (homeWidgetBase != null) {
                homeWidgetBase.setOnButtonClickListener(new getMax(this));
            }
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, HummerConstants.CONTEXT);
            setQuality setquality = new setQuality(context);
            this.setMin = setquality;
            if (setquality == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapter");
            }
            setquality.getMax((Ignore.setMin) new equals(this));
            RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(resetInternal.setMax.setCheckMarkDrawable);
            if (recyclerView != null) {
                View view = recyclerView;
                view.getViewTreeObserver().addOnGlobalLayoutListener(new isInside(view, this));
            }
            this.getMax = new LinearLayoutManager(getContext());
            RecyclerView recyclerView2 = (RecyclerView) _$_findCachedViewById(resetInternal.setMax.setCheckMarkDrawable);
            if (recyclerView2 != null) {
                LinearLayoutManager linearLayoutManager = this.getMax;
                if (linearLayoutManager == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("layoutManager");
                }
                recyclerView2.setLayoutManager(linearLayoutManager);
            }
            RecyclerView recyclerView3 = (RecyclerView) _$_findCachedViewById(resetInternal.setMax.setCheckMarkDrawable);
            if (recyclerView3 != null) {
                recyclerView3.addItemDecoration(new setShadowResourceRight(getContext(), R.dimen.f26272131165275));
            }
            RecyclerView recyclerView4 = (RecyclerView) _$_findCachedViewById(resetInternal.setMax.setCheckMarkDrawable);
            if (recyclerView4 != null) {
                setQuality setquality2 = this.setMin;
                if (setquality2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("adapter");
                }
                recyclerView4.setAdapter(setquality2);
            }
            RecyclerView recyclerView5 = (RecyclerView) _$_findCachedViewById(resetInternal.setMax.setCheckMarkDrawable);
            if (recyclerView5 != null) {
                recyclerView5.setNestedScrollingEnabled(false);
            }
            LinearLayout linearLayout = (LinearLayout) _$_findCachedViewById(resetInternal.setMax.getActionItems);
            if (linearLayout != null) {
                View view2 = linearLayout;
                Intrinsics.checkNotNullParameter(view2, "<this>");
                view2.setVisibility(0);
            }
            LogoProgressView logoProgressView = (LogoProgressView) _$_findCachedViewById(resetInternal.setMax.setActionBarVisibilityCallback);
            if (logoProgressView != null) {
                logoProgressView.startRefresh();
            }
            getAspectRatio.getMax getmax = this.presenter;
            if (getmax == null) {
                Intrinsics.throwUninitializedPropertyAccessException("presenter");
            }
            getmax.length();
            getMax();
            return;
        }
        throw null;
    }

    public static final /* synthetic */ void access$openH5Container(MoreForYouView moreForYouView, String str) {
        if (isShowMenu.length(str)) {
            getDuration.length length2 = moreForYouView.readDeepLinkPropertiesPresenter;
            if (length2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("readDeepLinkPropertiesPresenter");
            }
            length2.setMax(str);
            return;
        }
        DanaH5.startContainerFullUrl(str);
    }

    public static final /* synthetic */ void access$adjustViewHeightAccordingToFirstItemHeight(MoreForYouView moreForYouView) {
        View view = moreForYouView.getView();
        ViewGroup.LayoutParams layoutParams = view != null ? view.getLayoutParams() : null;
        if (layoutParams != null) {
            View view2 = moreForYouView.getView();
            Intrinsics.checkNotNullExpressionValue(view2, "view");
            int measuredHeight = view2.getMeasuredHeight() - moreForYouView.getMin;
            LinearLayoutManager linearLayoutManager = moreForYouView.getMax;
            if (linearLayoutManager == null) {
                Intrinsics.throwUninitializedPropertyAccessException("layoutManager");
            }
            int i = 0;
            View findViewByPosition = linearLayoutManager.findViewByPosition(0);
            if (findViewByPosition != null) {
                i = findViewByPosition.getHeight();
            }
            layoutParams.height = measuredHeight + i;
        }
        View view3 = moreForYouView.getView();
        if (view3 != null) {
            view3.setLayoutParams(layoutParams);
        }
    }

    public static final /* synthetic */ void access$hideProgressBar(MoreForYouView moreForYouView) {
        LinearLayout linearLayout = (LinearLayout) moreForYouView._$_findCachedViewById(resetInternal.setMax.getActionItems);
        if (linearLayout != null) {
            View view = linearLayout;
            Intrinsics.checkNotNullParameter(view, "<this>");
            view.setVisibility(8);
        }
        LogoProgressView logoProgressView = (LogoProgressView) moreForYouView._$_findCachedViewById(resetInternal.setMax.setActionBarVisibilityCallback);
        if (logoProgressView != null) {
            logoProgressView.stopRefresh();
        }
    }

    public static final /* synthetic */ void access$hideMoreForYouItemSkeleton(MoreForYouView moreForYouView) {
        if (moreForYouView.equals != null) {
            onDetachedFromLayoutParams ondetachedfromlayoutparams = moreForYouView.equals;
            if (ondetachedfromlayoutparams == null) {
                Intrinsics.throwUninitializedPropertyAccessException("moreForYouItemSkeleton");
            }
            ondetachedfromlayoutparams.length();
        }
    }

    public static final /* synthetic */ void access$animateSlideUp(MoreForYouView moreForYouView, Function0 function0) {
        ValueAnimator valueAnimator = moreForYouView.length;
        if (valueAnimator == null || valueAnimator == null || !valueAnimator.isStarted()) {
            LinearLayoutManager linearLayoutManager = moreForYouView.getMax;
            if (linearLayoutManager == null) {
                Intrinsics.throwUninitializedPropertyAccessException("layoutManager");
            }
            int i = 0;
            View findViewByPosition = linearLayoutManager.findViewByPosition(0);
            if (findViewByPosition != null) {
                i = findViewByPosition.getHeight();
            }
            View view = moreForYouView.getView();
            Intrinsics.checkNotNullExpressionValue(view, "view");
            ValueAnimator max = moreForYouView.setMax((view.getMeasuredHeight() - moreForYouView.getMin) + i, function0);
            moreForYouView.length = max;
            if (max != null) {
                max.start();
            }
        }
    }

    public static final /* synthetic */ void access$animateSlideDown(MoreForYouView moreForYouView, Function0 function0) {
        ValueAnimator valueAnimator = moreForYouView.setMax;
        if (valueAnimator == null || valueAnimator == null || !valueAnimator.isStarted()) {
            LinearLayoutManager linearLayoutManager = moreForYouView.getMax;
            if (linearLayoutManager == null) {
                Intrinsics.throwUninitializedPropertyAccessException("layoutManager");
            }
            int i = 0;
            View findViewByPosition = linearLayoutManager.findViewByPosition(0);
            if (findViewByPosition != null) {
                i = findViewByPosition.getHeight();
            }
            View view = moreForYouView.getView();
            Intrinsics.checkNotNullExpressionValue(view, "view");
            ValueAnimator max = moreForYouView.setMax((view.getMeasuredHeight() + moreForYouView.getMin) - i, function0);
            moreForYouView.setMax = max;
            if (max != null) {
                max.start();
            }
        }
    }
}
