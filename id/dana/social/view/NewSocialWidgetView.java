package id.dana.social.view;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieAnimationView;
import com.ap.zoloz.hummer.biz.HummerConstants;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import id.dana.R;
import id.dana.base.BaseRichView;
import id.dana.richview.FriendshipHomeWidgetBase;
import id.dana.richview.LogoProgressView;
import id.dana.social.di.module.SocialWidgetModule;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import javax.inject.Named;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmDefault;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o.CircularProgressDrawable$ProgressDrawableSize;
import o.GriverProgressBar;
import o.GriverRpcUtils;
import o.IntRange;
import o.PrepareException;
import o.RedDotManager;
import o.TitleBarRightButtonView;
import o.WheelView;
import o.access$2202;
import o.access$2502;
import o.addSubTitleView;
import o.buildModelMapWithLock;
import o.getScrapView;
import o.hideProgress;
import o.isAP;
import o.onDelete;
import o.resetInternal;
import o.setButtonStyle;
import o.setCurrentIndex;
import o.setStateOn;
import o.setViewTypeCount;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0019\u0018\u0000 W2\u00020\u0001:\u0002WXB\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0010\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\tH\u0002J\b\u0010&\u001a\u00020$H\u0002J\b\u0010'\u001a\u00020$H\u0002J\b\u0010(\u001a\u00020$H\u0002J\b\u0010)\u001a\u00020\tH\u0016J\b\u0010*\u001a\u00020$H\u0002J\b\u0010+\u001a\u00020$H\u0002J\b\u0010,\u001a\u00020$H\u0002J\b\u0010-\u001a\u00020$H\u0002J\b\u0010.\u001a\u00020$H\u0002J\b\u0010/\u001a\u00020$H\u0002J\b\u00100\u001a\u00020$H\u0002J\b\u00101\u001a\u00020$H\u0002J\b\u00102\u001a\u00020$H\u0002J\u0010\u00103\u001a\u00020$2\u0006\u00104\u001a\u000205H\u0016J\u0016\u00106\u001a\u00020$2\f\u00107\u001a\b\u0012\u0004\u0012\u00020\r08H\u0002J\u0016\u00109\u001a\u00020$2\f\u0010:\u001a\b\u0012\u0004\u0012\u00020$0;H\u0002J\b\u0010<\u001a\u00020\u0011H\u0002J\u0006\u0010=\u001a\u00020$J\u000e\u0010>\u001a\u00020$2\u0006\u0010?\u001a\u00020@J\u0006\u0010A\u001a\u00020$J\u0006\u0010B\u001a\u00020$J\u0006\u0010C\u001a\u00020$J\u000e\u0010D\u001a\u00020$2\u0006\u0010E\u001a\u00020\u001dJ\b\u0010F\u001a\u00020$H\u0016J\b\u0010G\u001a\u00020$H\u0002J\b\u0010H\u001a\u00020$H\u0002J\b\u0010I\u001a\u00020$H\u0002J\b\u0010J\u001a\u00020$H\u0002J\b\u0010K\u001a\u00020$H\u0002J\b\u0010L\u001a\u00020$H\u0002J\b\u0010M\u001a\u00020$H\u0002J\b\u0010N\u001a\u00020$H\u0002J\b\u0010O\u001a\u00020$H\u0002J\b\u0010P\u001a\u00020$H\u0002J\b\u0010Q\u001a\u00020$H\u0002J\b\u0010R\u001a\u00020$H\u0002J\b\u0010S\u001a\u00020$H\u0002J\b\u0010T\u001a\u00020$H\u0002J\u0010\u0010U\u001a\u00020$2\u0006\u0010V\u001a\u00020\tH\u0002R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0014\u001a\u00020\u00158\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u000e\u0010\u001a\u001a\u00020\u001bX.¢\u0006\u0002\n\u0000R\u001a\u0010\u001c\u001a\u00020\u001dX.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u000e\u0010\"\u001a\u00020\u0011X\u000e¢\u0006\u0002\n\u0000¨\u0006Y"}, d2 = {"Lid/dana/social/view/NewSocialWidgetView;", "Lid/dana/base/BaseRichView;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "feedStack", "Ljava/util/Stack;", "Lid/dana/social/model/SocialFeedModel;", "getFeedStack", "()Ljava/util/Stack;", "isUpdateNotificationButton", "", "popFeedStackObservable", "Lio/reactivex/disposables/Disposable;", "presenter", "Lid/dana/social/presenter/NewSocialWidgetPresenter;", "getPresenter", "()Lid/dana/social/presenter/NewSocialWidgetPresenter;", "setPresenter", "(Lid/dana/social/presenter/NewSocialWidgetPresenter;)V", "realTimeFeedAdapter", "Lid/dana/social/adapter/RealTimeFeedAdapter;", "socialWidgetListener", "Lid/dana/social/view/NewSocialWidgetView$SocialWidgetListener;", "getSocialWidgetListener", "()Lid/dana/social/view/NewSocialWidgetView$SocialWidgetListener;", "setSocialWidgetListener", "(Lid/dana/social/view/NewSocialWidgetView$SocialWidgetListener;)V", "viewIsVisible", "adjustWidgetHeight", "", "height", "checkIfFeedIsLessThanMaximumSize", "checkIfFeedListIsEmpty", "disposePopFeedStackObservable", "getLayout", "hideActiveState", "hideEmptyState", "hideFeedWidget", "hideInactiveState", "hideLoadingState", "hideNoMoreFeed", "initRecyclerView", "initSocialFeedView", "initViewAllButton", "injectComponent", "applicationComponent", "Lid/dana/di/component/ApplicationComponent;", "insertFeedItemInBatch", "socialViewModelList", "", "invokeUpdateNotificationButton", "task", "Lkotlin/Function0;", "isHasContactPermission", "onActivityResume", "onRequestPermissionResult", "report", "Lid/dana/utils/permission/Permission$PermissionReport;", "onTabSwipeResume", "onUnselected", "refreshTimeline", "setWidgetListener", "listener", "setup", "setupActiveState", "setupInactiveState", "setupOnNewFeedAnimation", "setupOnViewVisibleListener", "setupRealTimeFeedAdapter", "setupRecyclerViewAttributes", "setupShowFeedItemObservable", "setupWidgetHeightBasedOnNumberOfItems", "showActiveState", "showEmptyState", "showFeedItemSerially", "showFeedWidget", "showInactiveState", "showNoMoreFeed", "showViewBasedOnStates", "state", "Companion", "SocialWidgetListener", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class NewSocialWidgetView extends BaseRichView {
    @NotNull
    public static final getMin Companion = new getMin((byte) 0);
    private boolean getMax;
    /* access modifiers changed from: private */
    public isAP getMin;
    private HashMap isInside;
    private GriverProgressBar.UpdateRunnable length;
    @Inject
    @Named("newSocialWidgetPresenter")
    public setViewTypeCount presenter;
    /* access modifiers changed from: private */
    public boolean setMax = true;
    @NotNull
    private final Stack<access$2502> setMin = new Stack<>();
    public length socialWidgetListener;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0001"}, d2 = {"Lid/dana/social/view/NewSocialWidgetView$SocialWidgetListener;", "", "onSeeAllButtonClick", "", "updateNotificationButton", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public interface length {
        void getMax();

        void setMax();
    }

    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.isInside;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public final View _$_findCachedViewById(int i) {
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

    public final int getLayout() {
        return R.layout.new_view_feeds_entry_point;
    }

    public final void onRequestPermissionResult(@NotNull setStateOn.setMin setmin) {
        Intrinsics.checkNotNullParameter(setmin, "report");
    }

    public static final /* synthetic */ isAP access$getRealTimeFeedAdapter$p(NewSocialWidgetView newSocialWidgetView) {
        isAP isap = newSocialWidgetView.getMin;
        if (isap == null) {
            Intrinsics.throwUninitializedPropertyAccessException("realTimeFeedAdapter");
        }
        return isap;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NewSocialWidgetView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NewSocialWidgetView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NewSocialWidgetView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
    }

    @NotNull
    public final length getSocialWidgetListener() {
        length length2 = this.socialWidgetListener;
        if (length2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("socialWidgetListener");
        }
        return length2;
    }

    public final void setSocialWidgetListener(@NotNull length length2) {
        Intrinsics.checkNotNullParameter(length2, "<set-?>");
        this.socialWidgetListener = length2;
    }

    @NotNull
    public final Stack<access$2502> getFeedStack() {
        return this.setMin;
    }

    public final void setWidgetListener(@NotNull length length2) {
        Intrinsics.checkNotNullParameter(length2, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.socialWidgetListener = length2;
    }

    @NotNull
    public final setViewTypeCount getPresenter() {
        setViewTypeCount setviewtypecount = this.presenter;
        if (setviewtypecount == null) {
            Intrinsics.throwUninitializedPropertyAccessException("presenter");
        }
        return setviewtypecount;
    }

    public final void setPresenter(@NotNull setViewTypeCount setviewtypecount) {
        Intrinsics.checkNotNullParameter(setviewtypecount, "<set-?>");
        this.presenter = setviewtypecount;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "onScrollChanged"}, k = 3, mv = {1, 4, 2})
    static final class setMax implements ViewTreeObserver.OnScrollChangedListener {
        final /* synthetic */ Rect length;
        final /* synthetic */ Rect setMax;
        final /* synthetic */ NewSocialWidgetView setMin;

        setMax(NewSocialWidgetView newSocialWidgetView, Rect rect, Rect rect2) {
            this.setMin = newSocialWidgetView;
            this.length = rect;
            this.setMax = rect2;
        }

        public final void onScrollChanged() {
            View access$getView = this.setMin.getView();
            Intrinsics.checkNotNullExpressionValue(access$getView, "view");
            if (access$getView.isShown()) {
                this.setMin.getView().getGlobalVisibleRect(this.length);
                this.setMin.setMax = this.length.intersect(this.setMax);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"id/dana/social/view/NewSocialWidgetView$setupRealTimeFeedAdapter$1", "Lid/dana/social/adapter/BaseSocialFeedInteraction;", "onItemClicked", "", "itemPosition", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class IsOverlapping extends GriverRpcUtils.AnonymousClass1 {
        final /* synthetic */ NewSocialWidgetView getMin;

        IsOverlapping(NewSocialWidgetView newSocialWidgetView) {
            this.getMin = newSocialWidgetView;
        }

        public final void setMax(int i) {
            Context context = this.getMin.getContext();
            Intrinsics.checkNotNullExpressionValue(context, HummerConstants.CONTEXT);
            setButtonStyle.getMin(context);
            this.getMin.getSocialWidgetListener().setMax();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class getMax implements View.OnClickListener {
        final /* synthetic */ NewSocialWidgetView length;

        getMax(NewSocialWidgetView newSocialWidgetView) {
            this.length = newSocialWidgetView;
        }

        public final void onClick(View view) {
            Context context = this.length.getContext();
            Intrinsics.checkNotNullExpressionValue(context, HummerConstants.CONTEXT);
            setButtonStyle.getMin(context);
            this.length.getSocialWidgetListener().setMax();
        }
    }

    /* access modifiers changed from: private */
    public final void setMin() {
        if (setMax()) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, HummerConstants.CONTEXT);
            setButtonStyle.getMin(context);
            setViewTypeCount setviewtypecount = this.presenter;
            if (setviewtypecount == null) {
                Intrinsics.throwUninitializedPropertyAccessException("presenter");
            }
            setviewtypecount.getMax(false);
            return;
        }
        setViewTypeCount setviewtypecount2 = this.presenter;
        if (setviewtypecount2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("presenter");
        }
        setviewtypecount2.toIntRange();
        getMin(1);
    }

    private final boolean setMax() {
        return IntRange.length((Context) getBaseActivity(), "android.permission.READ_CONTACTS") == 0;
    }

    public final void onTabSwipeResume() {
        setViewTypeCount setviewtypecount = this.presenter;
        if (setviewtypecount == null) {
            Intrinsics.throwUninitializedPropertyAccessException("presenter");
        }
        setviewtypecount.setMax.onNext(setviewtypecount.setMin);
        setViewTypeCount setviewtypecount2 = this.presenter;
        if (setviewtypecount2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("presenter");
        }
        setviewtypecount2.IsOverlapping();
    }

    public final void onActivityResume() {
        setMin();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\u0003H\u0016J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0006H\u0016J\b\u0010\r\u001a\u00020\u0003H\u0016J\b\u0010\u000e\u001a\u00020\u0003H\u0016J\b\u0010\u000f\u001a\u00020\u0003H\u0016¨\u0006\u0010"}, d2 = {"id/dana/social/view/NewSocialWidgetView$injectComponent$1", "Lid/dana/social/contract/SocialWidgetContract$View;", "onErrorInitSocialFeed", "", "onFinishGetFriendsTimeline", "socialFeedWrapperModel", "Lid/dana/social/model/SocialFeedWrapperModel;", "onFinishGetSocialConfig", "enable", "", "onFinishInitSocialFeed", "onFirstTimeGetTimeline", "socialFeedWrapper", "onLoadingInitFeed", "onNotActicateInitFeed", "onWidgetTimeLineError", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMin implements addSubTitleView.length {
        final /* synthetic */ NewSocialWidgetView setMin;

        @JvmDefault
        public final void dismissProgress() {
        }

        public final void getMin() {
        }

        @JvmDefault
        public final void onError(@Nullable String str) {
        }

        @JvmDefault
        public final void showProgress() {
        }

        setMin(NewSocialWidgetView newSocialWidgetView) {
            this.setMin = newSocialWidgetView;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 4, 2})
        static final class setMax extends Lambda implements Function0<Unit> {
            final /* synthetic */ setMin this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            setMax(setMin setmin) {
                super(0);
                this.this$0 = setmin;
            }

            public final void invoke() {
                NewSocialWidgetView.access$showFeedWidget(this.this$0.setMin);
                this.this$0.setMin.setMin();
                this.this$0.setMin.getSocialWidgetListener().getMax();
            }
        }

        public final void getMax(boolean z) {
            if (z) {
                NewSocialWidgetView.access$invokeUpdateNotificationButton(this.setMin, new setMax(this));
            } else {
                NewSocialWidgetView.access$hideFeedWidget(this.setMin);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 4, 2})
        /* renamed from: id.dana.social.view.NewSocialWidgetView$setMin$setMin  reason: collision with other inner class name */
        static final class C0050setMin extends Lambda implements Function0<Unit> {
            final /* synthetic */ setMin this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0050setMin(setMin setmin) {
                super(0);
                this.this$0 = setmin;
            }

            public final void invoke() {
                setViewTypeCount presenter = this.this$0.setMin.getPresenter();
                buildModelMapWithLock.execute$default(presenter.FastBitmap$CoordinateSystem, Unit.INSTANCE, (Function1) null, new getScrapView.getMin(presenter), 2, (Object) null);
                this.this$0.setMin.getSocialWidgetListener().getMax();
                this.this$0.setMin.getPresenter().toFloatRange();
            }
        }

        public final void getMax() {
            NewSocialWidgetView.access$invokeUpdateNotificationButton(this.setMin, new C0050setMin(this));
        }

        public final void setMin() {
            NewSocialWidgetView.access$disposePopFeedStackObservable(this.setMin);
            this.setMin.getFeedStack().clear();
            NewSocialWidgetView.access$getRealTimeFeedAdapter$p(this.setMin).getMax().clear();
            NewSocialWidgetView.access$getRealTimeFeedAdapter$p(this.setMin).notifyDataSetChanged();
            this.setMin.getPresenter().toIntRange();
            this.setMin.getMin(1);
        }

        public final void getMax(@NotNull access$2202 access_2202) {
            Intrinsics.checkNotNullParameter(access_2202, "socialFeedWrapperModel");
            this.setMin.getFeedStack().addAll(access_2202.setMin);
            NewSocialWidgetView.access$checkIfFeedIsLessThanMaximumSize(this.setMin);
        }

        public final void length() {
            this.setMin.getFeedStack().clear();
            this.setMin.getPresenter().toIntRange();
            this.setMin.getMin(1);
        }

        public final void setMax() {
            NewSocialWidgetView.access$checkIfFeedListIsEmpty(this.setMin);
        }

        public final void getMin(@NotNull access$2202 access_2202) {
            Intrinsics.checkNotNullParameter(access_2202, "socialFeedWrapper");
            if (access_2202.getMin()) {
                NewSocialWidgetView.access$getRealTimeFeedAdapter$p(this.setMin).getMin = false;
                NewSocialWidgetView.access$insertFeedItemInBatch(this.setMin, access_2202.setMin);
            } else {
                this.setMin.getFeedStack().addAll(access_2202.setMin);
                NewSocialWidgetView.access$setupShowFeedItemObservable(this.setMin);
                NewSocialWidgetView.access$checkIfFeedIsLessThanMaximumSize(this.setMin);
            }
            this.setMin.getPresenter().IsOverlapping();
        }
    }

    public final void injectComponent(@NotNull PrepareException.AnonymousClass1 r3) {
        Intrinsics.checkNotNullParameter(r3, "applicationComponent");
        r3.getMin(new SocialWidgetModule(new setMin(this))).getMin(this);
        onDelete.getMin[] getminArr = new onDelete.getMin[1];
        setViewTypeCount setviewtypecount = this.presenter;
        if (setviewtypecount == null) {
            Intrinsics.throwUninitializedPropertyAccessException("presenter");
        }
        getminArr[0] = setviewtypecount;
        registerPresenter(getminArr);
    }

    /* access modifiers changed from: private */
    public final void getMin(int i) {
        if (i == 0) {
            equals();
        } else if (i == 1) {
            IsOverlapping();
        } else if (i == 2) {
            toFloatRange();
        }
    }

    private final void getMin() {
        ConstraintLayout constraintLayout = (ConstraintLayout) _$_findCachedViewById(resetInternal.setMax.valueType);
        if (constraintLayout != null) {
            View view = constraintLayout;
            Intrinsics.checkNotNullParameter(view, "<this>");
            view.setVisibility(8);
        }
    }

    private final void length() {
        LogoProgressView logoProgressView = (LogoProgressView) _$_findCachedViewById(resetInternal.setMax.expandItemActionView);
        if (logoProgressView != null) {
            logoProgressView.stopRefresh();
        }
        LinearLayout linearLayout = (LinearLayout) _$_findCachedViewById(resetInternal.setMax.getExpandedItem);
        if (linearLayout != null) {
            View view = linearLayout;
            Intrinsics.checkNotNullParameter(view, "<this>");
            view.setVisibility(8);
        }
    }

    private final void getMax() {
        ConstraintLayout constraintLayout = (ConstraintLayout) _$_findCachedViewById(resetInternal.setMax.length);
        if (constraintLayout != null) {
            View view = constraintLayout;
            Intrinsics.checkNotNullParameter(view, "<this>");
            view.setVisibility(8);
        }
    }

    private final void toIntRange() {
        FrameLayout frameLayout = (FrameLayout) _$_findCachedViewById(resetInternal.setMax.setTitle);
        if (frameLayout != null) {
            View view = frameLayout;
            Intrinsics.checkNotNullParameter(view, "<this>");
            view.setVisibility(8);
        }
    }

    private final void isInside() {
        TextView textView = (TextView) _$_findCachedViewById(resetInternal.setMax.getCurrentContentInsetStart);
        if (textView != null) {
            View view = textView;
            Intrinsics.checkNotNullParameter(view, "<this>");
            view.setVisibility(8);
        }
    }

    private final void toFloatRange() {
        ViewGroup.LayoutParams layoutParams;
        FriendshipHomeWidgetBase friendshipHomeWidgetBase = (FriendshipHomeWidgetBase) _$_findCachedViewById(resetInternal.setMax.RawRes);
        if (friendshipHomeWidgetBase != null) {
            friendshipHomeWidgetBase.setWidgetHeaderVisible(false);
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) _$_findCachedViewById(resetInternal.setMax.valueType);
        if (constraintLayout != null) {
            View view = constraintLayout;
            Intrinsics.checkNotNullParameter(view, "<this>");
            view.setVisibility(0);
        }
        length();
        getMax();
        toIntRange();
        FriendshipHomeWidgetBase friendshipHomeWidgetBase2 = (FriendshipHomeWidgetBase) _$_findCachedViewById(resetInternal.setMax.RawRes);
        if (friendshipHomeWidgetBase2 != null && (layoutParams = friendshipHomeWidgetBase2.getLayoutParams()) != null) {
            layoutParams.height = -2;
        }
    }

    private final void IsOverlapping() {
        ViewGroup.LayoutParams layoutParams;
        FriendshipHomeWidgetBase friendshipHomeWidgetBase = (FriendshipHomeWidgetBase) _$_findCachedViewById(resetInternal.setMax.RawRes);
        if (friendshipHomeWidgetBase != null) {
            friendshipHomeWidgetBase.setWidgetHeaderVisible(true);
        }
        FrameLayout frameLayout = (FrameLayout) _$_findCachedViewById(resetInternal.setMax.setTitle);
        if (frameLayout != null) {
            View view = frameLayout;
            Intrinsics.checkNotNullParameter(view, "<this>");
            view.setVisibility(0);
        }
        getMax();
        length();
        getMin();
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "resources");
        int applyDimension = (int) TypedValue.applyDimension(1, 152.0f, resources.getDisplayMetrics());
        FriendshipHomeWidgetBase friendshipHomeWidgetBase2 = (FriendshipHomeWidgetBase) _$_findCachedViewById(resetInternal.setMax.RawRes);
        if (friendshipHomeWidgetBase2 != null && (layoutParams = friendshipHomeWidgetBase2.getLayoutParams()) != null) {
            layoutParams.height = applyDimension;
        }
    }

    private final void equals() {
        ViewGroup.LayoutParams layoutParams;
        FriendshipHomeWidgetBase friendshipHomeWidgetBase = (FriendshipHomeWidgetBase) _$_findCachedViewById(resetInternal.setMax.RawRes);
        if (friendshipHomeWidgetBase != null) {
            friendshipHomeWidgetBase.setWidgetHeaderVisible(false);
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) _$_findCachedViewById(resetInternal.setMax.length);
        if (constraintLayout != null) {
            View view = constraintLayout;
            Intrinsics.checkNotNullParameter(view, "<this>");
            view.setVisibility(0);
        }
        isInside();
        toIntRange();
        length();
        getMin();
        FriendshipHomeWidgetBase friendshipHomeWidgetBase2 = (FriendshipHomeWidgetBase) _$_findCachedViewById(resetInternal.setMax.RawRes);
        if (friendshipHomeWidgetBase2 != null && (layoutParams = friendshipHomeWidgetBase2.getLayoutParams()) != null) {
            layoutParams.height = -2;
        }
    }

    public final void refreshTimeline() {
        setViewTypeCount setviewtypecount = this.presenter;
        if (setviewtypecount == null) {
            Intrinsics.throwUninitializedPropertyAccessException("presenter");
        }
        setviewtypecount.setMin();
    }

    public final void onUnselected() {
        setViewTypeCount setviewtypecount = this.presenter;
        if (setviewtypecount == null) {
            Intrinsics.throwUninitializedPropertyAccessException("presenter");
        }
        new setViewTypeCount.setMax(setviewtypecount).dispose();
        setviewtypecount.length = false;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lid/dana/social/view/NewSocialWidgetView$Companion;", "", "()V", "ADD_ITEM_ANIMATION_DURATION", "", "STATE_ACTIVE", "", "STATE_EMPTY", "STATE_INACTIVE", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMin {
        private getMin() {
        }

        public /* synthetic */ getMin(byte b) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept", "(Ljava/lang/Long;)V"}, k = 3, mv = {1, 4, 2})
    static final class toFloatRange<T> implements RedDotManager<Long> {
        final /* synthetic */ NewSocialWidgetView setMin;

        toFloatRange(NewSocialWidgetView newSocialWidgetView) {
            this.setMin = newSocialWidgetView;
        }

        public final /* synthetic */ void accept(Object obj) {
            if ((!this.setMin.getFeedStack().isEmpty()) && this.setMin.setMax) {
                NewSocialWidgetView.access$getRealTimeFeedAdapter$p(this.setMin).getMin = true;
                NewSocialWidgetView.access$showFeedItemSerially(this.setMin);
            }
            NewSocialWidgetView.access$checkIfFeedListIsEmpty(this.setMin);
            NewSocialWidgetView.access$checkIfFeedIsLessThanMaximumSize(this.setMin);
        }
    }

    public final void setup() {
        ViewTreeObserver viewTreeObserver;
        FriendshipHomeWidgetBase friendshipHomeWidgetBase = (FriendshipHomeWidgetBase) _$_findCachedViewById(resetInternal.setMax.RawRes);
        if (friendshipHomeWidgetBase != null) {
            friendshipHomeWidgetBase.setOnClickListener(new getMax(this));
        }
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, HummerConstants.CONTEXT);
        this.getMin = new isAP(context, new IsOverlapping(this));
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(resetInternal.setMax.setSupportImageTintMode);
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
        }
        RecyclerView recyclerView2 = (RecyclerView) _$_findCachedViewById(resetInternal.setMax.setSupportImageTintMode);
        if (recyclerView2 != null) {
            recyclerView2.setLayoutManager(new NewSocialWidgetView$setupRecyclerViewAttributes$1(this, getContext()));
        }
        RecyclerView recyclerView3 = (RecyclerView) _$_findCachedViewById(resetInternal.setMax.setSupportImageTintMode);
        if (recyclerView3 != null) {
            isAP isap = this.getMin;
            if (isap == null) {
                Intrinsics.throwUninitializedPropertyAccessException("realTimeFeedAdapter");
            }
            recyclerView3.setAdapter(isap);
        }
        RecyclerView recyclerView4 = (RecyclerView) _$_findCachedViewById(resetInternal.setMax.setSupportImageTintMode);
        if (recyclerView4 != null) {
            recyclerView4.setNestedScrollingEnabled(false);
        }
        LinearLayout linearLayout = (LinearLayout) _$_findCachedViewById(resetInternal.setMax.AnimRes);
        ViewGroup.LayoutParams layoutParams = linearLayout != null ? linearLayout.getLayoutParams() : null;
        if (layoutParams != null) {
            isAP.length length2 = isAP.getMax;
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, HummerConstants.CONTEXT);
            Intrinsics.checkNotNullParameter(context2, HummerConstants.CONTEXT);
            setCurrentIndex.getMin getmin = setCurrentIndex.setMin;
            Intrinsics.checkNotNullParameter(context2, HummerConstants.CONTEXT);
            layoutParams.height = (context2.getResources().getDimensionPixelSize(R.dimen.f32182131165968) + (context2.getResources().getDimensionPixelSize(R.dimen.f32192131165969) * 2)) * 3;
        }
        LinearLayout linearLayout2 = (LinearLayout) _$_findCachedViewById(resetInternal.setMax.AnimRes);
        if (linearLayout2 != null) {
            linearLayout2.setLayoutParams(layoutParams);
        }
        RecyclerView recyclerView5 = (RecyclerView) _$_findCachedViewById(resetInternal.setMax.setSupportImageTintMode);
        if (recyclerView5 != null) {
            CircularProgressDrawable$ProgressDrawableSize circularProgressDrawable$ProgressDrawableSize = new CircularProgressDrawable$ProgressDrawableSize();
            circularProgressDrawable$ProgressDrawableSize.toIntRange = 1000;
            Unit unit = Unit.INSTANCE;
            recyclerView5.setItemAnimator(circularProgressDrawable$ProgressDrawableSize);
        }
        LottieAnimationView lottieAnimationView = (LottieAnimationView) _$_findCachedViewById(resetInternal.setMax.setMessage);
        if (lottieAnimationView != null) {
            if (WheelView.OnWheelViewListener.getMin()) {
                lottieAnimationView.setAnimation("json/lottie/feed_inactive_ID.json");
            } else {
                lottieAnimationView.setAnimation("json/lottie/feed_inactive_EN.json");
            }
            lottieAnimationView.playAnimation();
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        Rect rect = new Rect();
        Context context3 = getContext();
        if (context3 != null) {
            WindowManager windowManager = ((Activity) context3).getWindowManager();
            Intrinsics.checkNotNullExpressionValue(windowManager, "(context as Activity).windowManager");
            windowManager.getDefaultDisplay().getMetrics(displayMetrics);
            Rect rect2 = new Rect(0, 0, displayMetrics.widthPixels, displayMetrics.heightPixels);
            View view = getView();
            if (!(view == null || (viewTreeObserver = view.getViewTreeObserver()) == null)) {
                viewTreeObserver.addOnScrollChangedListener(new setMax(this, rect, rect2));
            }
            setViewTypeCount setviewtypecount = this.presenter;
            if (setviewtypecount == null) {
                Intrinsics.throwUninitializedPropertyAccessException("presenter");
            }
            setviewtypecount.setMin();
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.app.Activity");
    }

    public static final /* synthetic */ void access$showFeedItemSerially(NewSocialWidgetView newSocialWidgetView) {
        isAP isap = newSocialWidgetView.getMin;
        if (isap == null) {
            Intrinsics.throwUninitializedPropertyAccessException("realTimeFeedAdapter");
        }
        isap.getMax().add(0, newSocialWidgetView.setMin.pop());
        isAP isap2 = newSocialWidgetView.getMin;
        if (isap2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("realTimeFeedAdapter");
        }
        isap2.notifyItemInserted(0);
        RecyclerView recyclerView = (RecyclerView) newSocialWidgetView._$_findCachedViewById(resetInternal.setMax.setSupportImageTintMode);
        if (recyclerView != null) {
            recyclerView.scrollToPosition(0);
        }
        isAP isap3 = newSocialWidgetView.getMin;
        if (isap3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("realTimeFeedAdapter");
        }
        if (isap3.getItemCount() > 3) {
            isAP isap4 = newSocialWidgetView.getMin;
            if (isap4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("realTimeFeedAdapter");
            }
            List max = isap4.getMax();
            Intrinsics.checkNotNullExpressionValue(max, "realTimeFeedAdapter.items");
            int lastIndex = CollectionsKt.getLastIndex(max);
            isAP isap5 = newSocialWidgetView.getMin;
            if (isap5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("realTimeFeedAdapter");
            }
            isap5.getMax(lastIndex);
            isAP isap6 = newSocialWidgetView.getMin;
            if (isap6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("realTimeFeedAdapter");
            }
            isap6.notifyItemRemoved(lastIndex);
        }
    }

    public static final /* synthetic */ void access$checkIfFeedListIsEmpty(NewSocialWidgetView newSocialWidgetView) {
        isAP isap = newSocialWidgetView.getMin;
        if (isap == null) {
            Intrinsics.throwUninitializedPropertyAccessException("realTimeFeedAdapter");
        }
        if (!isap.getMax().isEmpty() || !newSocialWidgetView.setMin.isEmpty()) {
            newSocialWidgetView.getMin(0);
        } else {
            newSocialWidgetView.getMin(2);
        }
    }

    public static final /* synthetic */ void access$checkIfFeedIsLessThanMaximumSize(NewSocialWidgetView newSocialWidgetView) {
        isAP isap = newSocialWidgetView.getMin;
        if (isap == null) {
            Intrinsics.throwUninitializedPropertyAccessException("realTimeFeedAdapter");
        }
        List max = isap.getMax();
        Intrinsics.checkNotNullExpressionValue(max, "realTimeFeedAdapter.items");
        if (max.size() < 3) {
            TextView textView = (TextView) newSocialWidgetView._$_findCachedViewById(resetInternal.setMax.getCurrentContentInsetStart);
            if (textView != null) {
                View view = textView;
                Intrinsics.checkNotNullParameter(view, "<this>");
                view.setVisibility(0);
                return;
            }
            return;
        }
        newSocialWidgetView.isInside();
    }

    public static final /* synthetic */ void access$invokeUpdateNotificationButton(NewSocialWidgetView newSocialWidgetView, Function0 function0) {
        if (!newSocialWidgetView.getMax) {
            newSocialWidgetView.getMax = true;
            function0.invoke();
            newSocialWidgetView.getMax = false;
        }
    }

    public static final /* synthetic */ void access$showFeedWidget(NewSocialWidgetView newSocialWidgetView) {
        FriendshipHomeWidgetBase friendshipHomeWidgetBase = (FriendshipHomeWidgetBase) newSocialWidgetView._$_findCachedViewById(resetInternal.setMax.RawRes);
        if (friendshipHomeWidgetBase != null) {
            View view = friendshipHomeWidgetBase;
            Intrinsics.checkNotNullParameter(view, "<this>");
            view.setVisibility(0);
        }
    }

    public static final /* synthetic */ void access$hideFeedWidget(NewSocialWidgetView newSocialWidgetView) {
        FriendshipHomeWidgetBase friendshipHomeWidgetBase = (FriendshipHomeWidgetBase) newSocialWidgetView._$_findCachedViewById(resetInternal.setMax.RawRes);
        if (friendshipHomeWidgetBase != null) {
            View view = friendshipHomeWidgetBase;
            Intrinsics.checkNotNullParameter(view, "<this>");
            view.setVisibility(8);
        }
    }

    public static final /* synthetic */ void access$disposePopFeedStackObservable(NewSocialWidgetView newSocialWidgetView) {
        GriverProgressBar.UpdateRunnable updateRunnable = newSocialWidgetView.length;
        if (updateRunnable != null) {
            updateRunnable.dispose();
        }
        newSocialWidgetView.length = null;
    }

    public static final /* synthetic */ void access$insertFeedItemInBatch(NewSocialWidgetView newSocialWidgetView, List list) {
        if (!list.isEmpty()) {
            isAP isap = newSocialWidgetView.getMin;
            if (isap == null) {
                Intrinsics.throwUninitializedPropertyAccessException("realTimeFeedAdapter");
            }
            isap.getMin(list);
        }
    }

    public static final /* synthetic */ void access$setupShowFeedItemObservable(NewSocialWidgetView newSocialWidgetView) {
        if (newSocialWidgetView.length == null) {
            GriverProgressBar.UpdateRunnable subscribe = TitleBarRightButtonView.AnonymousClass1.interval(1, TimeUnit.SECONDS).observeOn(hideProgress.length()).doOnNext(new toFloatRange(newSocialWidgetView)).subscribe();
            newSocialWidgetView.length = subscribe;
            newSocialWidgetView.addDisposable(subscribe);
        }
    }
}
