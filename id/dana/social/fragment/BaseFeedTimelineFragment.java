package id.dana.social.fragment;

import android.animation.Animator;
import android.view.View;
import androidx.annotation.CallSuper;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$Mean$Arithmetic;
import butterknife.BindView;
import butterknife.OnClick;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import id.dana.R;
import id.dana.richview.LoadingLottieAnimationView;
import id.dana.social.model.FeedModel;
import id.dana.social.model.RelationshipItemModel;
import in.srain.cube.views.ptr.PtrClassicFrameLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import o.FtsOptions$Order;
import o.Ignore;
import o.TitleBarRightButtonView;
import o.access$1602;
import o.dispatchOnCancelled;
import o.hideProgress;
import o.initContent;
import o.initStyleByTheme;
import o.onCancelLoad;
import o.onCanceled;
import o.removeStateDidChangeHandler;
import o.resetInternal;
import o.setEmptyView;
import o.setFocusableInTouchMode;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\b&\u0018\u0000 X2\u00020\u0001:\u0001XB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010&\u001a\u00020'H\u0004J\b\u0010(\u001a\u00020'H\u0004J\b\u0010)\u001a\u00020'H\u0007J\b\u0010*\u001a\u00020\u0004H\u0004J\b\u0010+\u001a\u00020'H\u0002J\b\u0010,\u001a\u00020'H\u0002J\b\u0010-\u001a\u00020'H\u0004J\u000e\u0010.\u001a\u00020'2\u0006\u0010/\u001a\u000200J\u0010\u00101\u001a\u00020'2\u0006\u00102\u001a\u000203H\u0002J\f\u00104\u001a\u0006\u0012\u0002\b\u000305H\u0015J\b\u00106\u001a\u00020\nH\u0002J\n\u00107\u001a\u0004\u0018\u00010\nH\u0004J\b\u00108\u001a\u000203H\u0002J\b\u00109\u001a\u000203H\u0014J\u000e\u0010:\u001a\b\u0012\u0004\u0012\u00020\n0;H\u0004J\b\u0010<\u001a\u00020=H&J\b\u0010>\u001a\u00020'H\u0014J\b\u0010?\u001a\u00020'H\u0002J\b\u0010@\u001a\u00020'H\u0002J\b\u0010A\u001a\u00020\u0004H&J\b\u0010B\u001a\u00020\u0004H\u0004J\b\u0010C\u001a\u00020\u0004H\u0004J\b\u0010D\u001a\u00020\u0004H&J\b\u0010E\u001a\u00020\u0004H\u0002J\b\u0010F\u001a\u00020\u0004H\u0002J\b\u0010G\u001a\u00020\u0004H\u0002J\b\u0010H\u001a\u00020'H\u0016J\b\u0010I\u001a\u00020'H\u0016J\b\u0010J\u001a\u00020'H\u0002J\u0010\u0010K\u001a\u00020'2\u0006\u00102\u001a\u000203H\u0016J\b\u0010L\u001a\u00020'H\u0016J\b\u0010M\u001a\u00020'H\u0014J\u0010\u0010N\u001a\u00020'2\u0006\u0010O\u001a\u000200H\u0004J\b\u0010P\u001a\u00020'H\u0002J\b\u0010Q\u001a\u00020'H\u0004J\u0010\u0010R\u001a\u00020'2\u0006\u0010S\u001a\u00020\u0004H\u0002J\b\u0010T\u001a\u00020'H\u0002J\b\u0010U\u001a\u00020'H\u0016J\b\u0010V\u001a\u00020'H\u0004J\b\u0010W\u001a\u00020'H\u0004R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X.¢\u0006\u0002\n\u0000R$\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0004@DX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\u001e\u0010\u0015\u001a\u00020\u00168\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR \u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\n0\u001cX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u0014\u0010!\u001a\u00020\"X\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u000e\u0010%\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006Y"}, d2 = {"Lid/dana/social/fragment/BaseFeedTimelineFragment;", "Lid/dana/base/BaseFragment;", "()V", "fetchingFeeds", "", "getFetchingFeeds", "()Z", "setFetchingFeeds", "(Z)V", "headerFeedModel", "Lid/dana/social/model/FeedViewHolderModel;", "getHeaderFeedModel", "()Lid/dana/social/model/FeedViewHolderModel;", "setHeaderFeedModel", "(Lid/dana/social/model/FeedViewHolderModel;)V", "lavLoadingAnimation", "Lid/dana/richview/LoadingLottieAnimationView;", "value", "pullToRefreshEnable", "getPullToRefreshEnable", "setPullToRefreshEnable", "rvFeeds", "Landroidx/recyclerview/widget/RecyclerView;", "getRvFeeds", "()Landroidx/recyclerview/widget/RecyclerView;", "setRvFeeds", "(Landroidx/recyclerview/widget/RecyclerView;)V", "socialFeeds", "", "getSocialFeeds", "()Ljava/util/List;", "setSocialFeeds", "(Ljava/util/List;)V", "socialFeedsAdapter", "Lid/dana/social/adapter/SocialFeedsAdapter;", "getSocialFeedsAdapter", "()Lid/dana/social/adapter/SocialFeedsAdapter;", "stopRefreshAnimationOnRepeat", "appendLoadMore", "", "appendLoading", "backToTop", "canScrollToLoadMore", "checkLoopingAnimationFinished", "createFeeds", "createShimmer", "doDisableLoadMoreWithDuration", "delayInMilliseconds", "", "doSmoothScroll", "position", "", "getAdapter", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "getFetchingFeedViewModel", "getHeader", "getLastItemPosition", "getLayout", "getShimmer", "", "getSocialFeedClickListener", "Lid/dana/social/adapter/SocialFeedClickListener;", "init", "initPullToRefreshComponent", "initPullToRefreshHeaderView", "isCurrentUserFeedPage", "isFeedsAdapterEmpty", "isFirstItemVisible", "isHasMore", "isLastItemFeed", "isLastItemLoadMore", "isLoadingAnimationInitialized", "onHeaderClicked", "onRefresh", "onRvFeedsScrolled", "onSocialItemClicked", "onTouchBottom", "refreshAdapter", "removeFetchingDataView", "disableLoadMoreDuration", "removeLoadMore", "resetSocialAdapter", "setCvBackToTopVisibility", "visible", "setFetchingFeedsFalse", "showEmptyState", "stopRefresh", "updateHeader", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public abstract class BaseFeedTimelineFragment extends FtsOptions$Order {
    @NotNull
    public static final length isInside = new length((byte) 0);
    @NotNull
    private List<setEmptyView> IsOverlapping = new ArrayList();
    /* access modifiers changed from: private */
    public boolean equals;
    LoadingLottieAnimationView getMin;
    @BindView(2131364507)
    public RecyclerView rvFeeds;
    @NotNull
    final initStyleByTheme setMax = new initStyleByTheme();
    @NotNull
    setEmptyView setMin;
    private boolean toFloatRange = true;
    /* access modifiers changed from: private */
    public boolean toIntRange;
    private HashMap toString;

    public abstract boolean FastBitmap$CoordinateSystem();

    public void ICustomTabsCallback$Default() {
        HashMap hashMap = this.toString;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public void ICustomTabsCallback$Stub() {
    }

    public abstract boolean asInterface();

    @NotNull
    public abstract initContent equals();

    public void extraCallbackWithResult() {
    }

    public View getMin(int i) {
        if (this.toString == null) {
            this.toString = new HashMap();
        }
        View view = (View) this.toString.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.toString.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        ICustomTabsCallback$Default();
    }

    public int setMin() {
        return R.layout.fragment_me_feed;
    }

    public void valueOf() {
    }

    public BaseFeedTimelineFragment() {
        FeedModel.setMax setmax = FeedModel.Grayscale$Algorithm;
        Intrinsics.checkNotNullParameter("", "userId");
        HashMap hashMap = r2;
        HashMap hashMap2 = new HashMap();
        hashMap2.put("kyc_level", "KYC0");
        FeedModel.setMax setmax2 = FeedModel.Grayscale$Algorithm;
        hashMap2.put("show_privacy_key", "hide");
        Unit unit = Unit.INSTANCE;
        this.setMin = new setEmptyView(2, new FeedModel("", "%fetching%", (String) null, (Long) null, (String) null, (String) null, false, hashMap, (String) null, (String) null, false, 0, (List) null, (List) null, (String) null, (String) null, 65372), (setFocusableInTouchMode) null, (List) null, (RelationshipItemModel) null, 28);
    }

    public static final /* synthetic */ LoadingLottieAnimationView length(BaseFeedTimelineFragment baseFeedTimelineFragment) {
        LoadingLottieAnimationView loadingLottieAnimationView = baseFeedTimelineFragment.getMin;
        if (loadingLottieAnimationView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("lavLoadingAnimation");
        }
        return loadingLottieAnimationView;
    }

    /* access modifiers changed from: protected */
    @NotNull
    public final List<setEmptyView> getMax() {
        return this.IsOverlapping;
    }

    /* access modifiers changed from: protected */
    public final boolean toDoubleRange() {
        return this.toFloatRange;
    }

    /* access modifiers changed from: protected */
    public final void setMax(boolean z) {
        this.toFloatRange = z;
        PtrClassicFrameLayout ptrClassicFrameLayout = (PtrClassicFrameLayout) getMin(resetInternal.setMax.onWindowSystemUiVisibilityChanged);
        if (ptrClassicFrameLayout != null) {
            ptrClassicFrameLayout.setEnabled(z && Grayscale$Algorithm());
        }
    }

    /* access modifiers changed from: protected */
    public final void invokeSuspend() {
        this.equals = true;
    }

    /* access modifiers changed from: protected */
    public final boolean values() {
        return this.equals;
    }

    @OnClick({2131362639})
    public final void backToTop() {
        if (!Mean$Arithmetic()) {
            int max = dispatchOnCancelled.setMax(0);
            if (max != 0) {
                onCanceled oncanceled = new onCanceled(0, max, 1);
                onCancelLoad.setMax(-1403098753, oncanceled);
                onCancelLoad.getMin(-1403098753, oncanceled);
            }
            RecyclerView recyclerView = this.rvFeeds;
            if (recyclerView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("rvFeeds");
            }
            RecyclerView.IsOverlapping layoutManager = recyclerView.getLayoutManager();
            if (layoutManager != null) {
                RecyclerView recyclerView2 = this.rvFeeds;
                if (recyclerView2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("rvFeeds");
                }
                layoutManager.smoothScrollToPosition(recyclerView2, new RecyclerView$Mean$Arithmetic(), 0);
            }
        }
        CardView cardView = (CardView) getMin(resetInternal.setMax.CallSuper);
        Intrinsics.checkNotNullExpressionValue(cardView, "cv_back_to_top");
        cardView.setVisibility(8);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x005b, code lost:
        r0 = r0.getHeaderView();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setMax() {
        /*
            r4 = this;
            o.initStyleByTheme r0 = r4.setMax
            o.initContent r1 = r4.equals()
            java.lang.String r2 = "<set-?>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)
            r0.setMin = r1
            o.initStyleByTheme r0 = r4.setMax
            boolean r1 = r4.FastBitmap$CoordinateSystem()
            r2 = 1
            r1 = r1 ^ r2
            r0.getMin = r1
            int r0 = o.resetInternal.setMax.onWindowSystemUiVisibilityChanged
            android.view.View r0 = r4.getMin((int) r0)
            in.srain.cube.views.ptr.PtrClassicFrameLayout r0 = (in.srain.cube.views.ptr.PtrClassicFrameLayout) r0
            if (r0 == 0) goto L_0x002b
            id.dana.social.fragment.BaseFeedTimelineFragment$getMax r1 = new id.dana.social.fragment.BaseFeedTimelineFragment$getMax
            r1.<init>(r4)
            o.access$1602 r1 = (o.access$1602) r1
            r0.setPtrHandler(r1)
        L_0x002b:
            int r0 = o.resetInternal.setMax.onWindowSystemUiVisibilityChanged
            android.view.View r0 = r4.getMin((int) r0)
            in.srain.cube.views.ptr.PtrClassicFrameLayout r0 = (in.srain.cube.views.ptr.PtrClassicFrameLayout) r0
            if (r0 == 0) goto L_0x0038
            r0.disableWhenHorizontalMove(r2)
        L_0x0038:
            int r0 = o.resetInternal.setMax.onWindowSystemUiVisibilityChanged
            android.view.View r0 = r4.getMin((int) r0)
            in.srain.cube.views.ptr.PtrClassicFrameLayout r0 = (in.srain.cube.views.ptr.PtrClassicFrameLayout) r0
            r1 = 0
            if (r0 == 0) goto L_0x0051
            android.view.LayoutInflater r2 = r4.getLayoutInflater()
            r3 = 2131559465(0x7f0d0429, float:1.8744275E38)
            android.view.View r2 = r2.inflate(r3, r1)
            r0.setHeaderView(r2)
        L_0x0051:
            int r0 = o.resetInternal.setMax.onWindowSystemUiVisibilityChanged
            android.view.View r0 = r4.getMin((int) r0)
            in.srain.cube.views.ptr.PtrClassicFrameLayout r0 = (in.srain.cube.views.ptr.PtrClassicFrameLayout) r0
            if (r0 == 0) goto L_0x006b
            android.view.View r0 = r0.getHeaderView()
            if (r0 == 0) goto L_0x006b
            r2 = 2131363718(0x7f0a0786, float:1.8347253E38)
            android.view.View r0 = r0.findViewById(r2)
            id.dana.richview.LoadingLottieAnimationView r0 = (id.dana.richview.LoadingLottieAnimationView) r0
            goto L_0x006c
        L_0x006b:
            r0 = r1
        L_0x006c:
            if (r0 == 0) goto L_0x0081
            r4.getMin = r0
            if (r0 != 0) goto L_0x0077
            java.lang.String r2 = "lavLoadingAnimation"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
        L_0x0077:
            id.dana.social.fragment.BaseFeedTimelineFragment$getMin r2 = new id.dana.social.fragment.BaseFeedTimelineFragment$getMin
            r2.<init>(r4)
            android.animation.Animator$AnimatorListener r2 = (android.animation.Animator.AnimatorListener) r2
            r0.addAnimatorListener(r2)
        L_0x0081:
            int r0 = o.resetInternal.setMax.setAutoSizeTextTypeUniformWithConfiguration
            android.view.View r0 = r4.getMin((int) r0)
            androidx.recyclerview.widget.RecyclerView r0 = (androidx.recyclerview.widget.RecyclerView) r0
            id.dana.social.fragment.BaseFeedTimelineFragment$equals r2 = new id.dana.social.fragment.BaseFeedTimelineFragment$equals
            r2.<init>(r4)
            androidx.recyclerview.widget.RecyclerView$toIntRange r2 = (androidx.recyclerview.widget.RecyclerView.toIntRange) r2
            r0.addOnScrollListener(r2)
            int r0 = o.resetInternal.setMax.setAutoSizeTextTypeUniformWithConfiguration
            android.view.View r0 = r4.getMin((int) r0)
            androidx.recyclerview.widget.RecyclerView r0 = (androidx.recyclerview.widget.RecyclerView) r0
            androidx.recyclerview.widget.LinearLayoutManager r2 = new androidx.recyclerview.widget.LinearLayoutManager
            android.content.Context r3 = r0.getContext()
            r2.<init>(r3)
            androidx.recyclerview.widget.RecyclerView$IsOverlapping r2 = (androidx.recyclerview.widget.RecyclerView.IsOverlapping) r2
            r0.setLayoutManager(r2)
            androidx.recyclerview.widget.RecyclerView$Adapter r2 = r4.invoke()
            r0.setAdapter(r2)
            r0.setAnimation(r1)
            o.initStyleByTheme r0 = r4.setMax
            id.dana.social.fragment.BaseFeedTimelineFragment$setMax r1 = new id.dana.social.fragment.BaseFeedTimelineFragment$setMax
            r1.<init>(r4)
            o.Ignore$setMin r1 = (o.Ignore.setMin) r1
            r0.getMax((o.Ignore.setMin) r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: id.dana.social.fragment.BaseFeedTimelineFragment.setMax():void");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J \u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0007H\u0016¨\u0006\u000b"}, d2 = {"id/dana/social/fragment/BaseFeedTimelineFragment$onRvFeedsScrolled$1", "Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;", "onScrollStateChanged", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "newState", "", "onScrolled", "dx", "dy", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class equals extends RecyclerView.toIntRange {
        final /* synthetic */ BaseFeedTimelineFragment setMin;

        equals(BaseFeedTimelineFragment baseFeedTimelineFragment) {
            this.setMin = baseFeedTimelineFragment;
        }

        public final void onScrolled(@NotNull RecyclerView recyclerView, int i, int i2) {
            Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
            super.onScrolled(recyclerView, i, i2);
            boolean Grayscale$Algorithm = this.setMin.Grayscale$Algorithm();
            boolean z = true;
            BaseFeedTimelineFragment.setMax(this.setMin, i2 < 0 && !Grayscale$Algorithm);
            PtrClassicFrameLayout ptrClassicFrameLayout = (PtrClassicFrameLayout) this.setMin.getMin(resetInternal.setMax.onWindowSystemUiVisibilityChanged);
            if (ptrClassicFrameLayout != null) {
                if (!Grayscale$Algorithm || !this.setMin.toDoubleRange()) {
                    z = false;
                }
                ptrClassicFrameLayout.setEnabled(z);
            }
        }

        public final void onScrollStateChanged(@NotNull RecyclerView recyclerView, int i) {
            Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
            super.onScrollStateChanged(recyclerView, i);
            if (!recyclerView.canScrollVertically(TsExtractor.TS_STREAM_TYPE_HDMV_DTS) && this.setMin.asInterface()) {
                this.setMin.extraCallbackWithResult();
            }
        }
    }

    /* access modifiers changed from: protected */
    @NotNull
    @CallSuper
    public RecyclerView.Adapter<?> invoke() {
        initStyleByTheme initstylebytheme = this.setMax;
        initstylebytheme.getMin(new ArrayList());
        return initstylebytheme;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "onItemClick"}, k = 3, mv = {1, 4, 2})
    static final class setMax implements Ignore.setMin {
        final /* synthetic */ BaseFeedTimelineFragment setMin;

        setMax(BaseFeedTimelineFragment baseFeedTimelineFragment) {
            this.setMin = baseFeedTimelineFragment;
        }

        public final void length(int i) {
            BaseFeedTimelineFragment baseFeedTimelineFragment = this.setMin;
            if (baseFeedTimelineFragment.setMax.getItemCount() > i) {
                int i2 = ((setEmptyView) baseFeedTimelineFragment.setMax.setMin(i)).getMin;
                if (i2 == 2) {
                    baseFeedTimelineFragment.valueOf();
                } else if (i2 == 7) {
                    if (!baseFeedTimelineFragment.Mean$Arithmetic() && baseFeedTimelineFragment.onNavigationEvent()) {
                        baseFeedTimelineFragment.setMax.getMax(baseFeedTimelineFragment.setMax.getItemCount() - 1);
                    }
                    baseFeedTimelineFragment.extraCallbackWithResult();
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J&\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J\u0012\u0010\t\u001a\u00020\n2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u000b"}, d2 = {"id/dana/social/fragment/BaseFeedTimelineFragment$initPullToRefreshComponent$1", "Lin/srain/cube/views/ptr/PtrHandler;", "checkCanDoRefresh", "", "frame", "Lin/srain/cube/views/ptr/PtrFrameLayout;", "content", "Landroid/view/View;", "header", "onRefreshBegin", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMax implements access$1602 {
        final /* synthetic */ BaseFeedTimelineFragment setMax;

        getMax(BaseFeedTimelineFragment baseFeedTimelineFragment) {
            this.setMax = baseFeedTimelineFragment;
        }

        public final void getMax() {
            if (this.setMax.setDefaultImpl()) {
                BaseFeedTimelineFragment.length(this.setMax).playAnimation();
            }
            this.setMax.ICustomTabsCallback$Stub();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\t¸\u0006\u0000"}, d2 = {"id/dana/social/fragment/BaseFeedTimelineFragment$initPullToRefreshHeaderView$1$1", "Landroid/animation/Animator$AnimatorListener;", "onAnimationCancel", "", "animation", "Landroid/animation/Animator;", "onAnimationEnd", "onAnimationRepeat", "onAnimationStart", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMin implements Animator.AnimatorListener {
        final /* synthetic */ BaseFeedTimelineFragment length;

        public final void onAnimationEnd(@NotNull Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "animation");
        }

        getMin(BaseFeedTimelineFragment baseFeedTimelineFragment) {
            this.length = baseFeedTimelineFragment;
        }

        public final void onAnimationStart(@NotNull Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "animation");
            LoadingLottieAnimationView length2 = BaseFeedTimelineFragment.length(this.length);
            length2.setupIntroMinMaxFrame(length2);
        }

        public final void onAnimationCancel(@NotNull Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "animation");
            PtrClassicFrameLayout ptrClassicFrameLayout = (PtrClassicFrameLayout) this.length.getMin(resetInternal.setMax.onWindowSystemUiVisibilityChanged);
            if (ptrClassicFrameLayout != null) {
                BaseFeedTimelineFragment.length(this.length).setLoopFinished(false);
                this.length.toIntRange = false;
                ptrClassicFrameLayout.refreshComplete();
            }
        }

        public final void onAnimationRepeat(@NotNull Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "animation");
            if (this.length.setDefaultImpl()) {
                LoadingLottieAnimationView length2 = BaseFeedTimelineFragment.length(this.length);
                if (length2.isLoopFinished()) {
                    length2.cancelAnimation();
                } else {
                    BaseFeedTimelineFragment.getMax(this.length);
                }
            }
        }
    }

    /* access modifiers changed from: private */
    public final boolean setDefaultImpl() {
        return this.getMin != null;
    }

    /* access modifiers changed from: protected */
    public final boolean Grayscale$Algorithm() {
        RecyclerView recyclerView = this.rvFeeds;
        if (recyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rvFeeds");
        }
        RecyclerView.IsOverlapping layoutManager = recyclerView.getLayoutManager();
        if (layoutManager != null) {
            return ((LinearLayoutManager) layoutManager).findFirstCompletelyVisibleItemPosition() == 0;
        }
        throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
    }

    /* access modifiers changed from: package-private */
    public final boolean Mean$Arithmetic() {
        return this.setMax.getItemCount() <= 0;
    }

    /* access modifiers changed from: protected */
    public final void create() {
        if (!Mean$Arithmetic()) {
            initStyleByTheme initstylebytheme = this.setMax;
            if (((setEmptyView) initstylebytheme.setMin(initstylebytheme.getItemCount() - 1)).getMin == 6) {
                initStyleByTheme initstylebytheme2 = this.setMax;
                initstylebytheme2.getMax(initstylebytheme2.getItemCount() - 1);
            }
        }
        ICustomTabsCallback();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 4, 2})
    static final class setMin implements removeStateDidChangeHandler {
        final /* synthetic */ BaseFeedTimelineFragment getMax;

        setMin(BaseFeedTimelineFragment baseFeedTimelineFragment) {
            this.getMax = baseFeedTimelineFragment;
        }

        public final void getMax() {
            this.getMax.equals = false;
        }
    }

    public final void ICustomTabsCallback() {
        length(TitleBarRightButtonView.AnonymousClass1.timer(500, TimeUnit.MILLISECONDS).doOnComplete(new setMin(this)).subscribeOn(hideProgress.length()).subscribe());
    }

    /* access modifiers changed from: protected */
    public final void getCause() {
        if (!Mean$Arithmetic() && ICustomTabsCallback$Stub$Proxy() && !onNavigationEvent()) {
            this.setMax.getMax(new setEmptyView(7, (FeedModel) null, (setFocusableInTouchMode) null, (List) null, (RelationshipItemModel) null, 28));
        }
    }

    /* access modifiers changed from: protected */
    public final void b() {
        if (ICustomTabsCallback$Stub$Proxy()) {
            this.setMax.getMax(new setEmptyView(6, (FeedModel) null, (setFocusableInTouchMode) null, (List) null, (RelationshipItemModel) null, 28));
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean onNavigationEvent() {
        if (Mean$Arithmetic()) {
            return false;
        }
        initStyleByTheme initstylebytheme = this.setMax;
        if (((setEmptyView) initstylebytheme.setMin(initstylebytheme.getItemCount() - 1)).getMin == 7) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public final boolean onPostMessage() {
        return !Mean$Arithmetic() && !this.equals && ICustomTabsCallback$Stub$Proxy();
    }

    private final boolean ICustomTabsCallback$Stub$Proxy() {
        initStyleByTheme initstylebytheme = this.setMax;
        setEmptyView setemptyview = (setEmptyView) initstylebytheme.setMin(initstylebytheme.getItemCount() - 1);
        if (setemptyview == null) {
            return false;
        }
        if (setemptyview.getMin == 5 || setemptyview.getMin == 9) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public final void extraCallback() {
        this.setMax.getMin(new ArrayList());
        this.IsOverlapping = new ArrayList();
    }

    @NotNull
    protected static List<setEmptyView> onRelationshipValidationResult() {
        List<setEmptyView> arrayList = new ArrayList<>();
        for (int i = 0; i <= 2; i++) {
            FeedModel.setMax setmax = FeedModel.Grayscale$Algorithm;
            arrayList.add(new setEmptyView(0, (FeedModel) null, (setFocusableInTouchMode) null, (List) null, (RelationshipItemModel) null, 30));
        }
        return arrayList;
    }

    /* access modifiers changed from: protected */
    public final void onTransact() {
        initStyleByTheme initstylebytheme = this.setMax;
        List arrayList = new ArrayList();
        arrayList.addAll(this.IsOverlapping);
        Unit unit = Unit.INSTANCE;
        initstylebytheme.getMin(arrayList);
    }

    /* access modifiers changed from: protected */
    public final void asBinder() {
        this.setMax.getMax().addAll(onRelationshipValidationResult());
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lid/dana/social/fragment/BaseFeedTimelineFragment$Companion;", "", "()V", "FIRST_POSITION", "", "PAGE_SIZE", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class length {
        private length() {
        }

        public /* synthetic */ length(byte b) {
            this();
        }
    }

    public void onMessageChannelReady() {
        this.setMax.getMin(new ArrayList());
        this.IsOverlapping = new ArrayList();
        initStyleByTheme initstylebytheme = this.setMax;
        List arrayList = new ArrayList();
        arrayList.add(new setEmptyView(4, (FeedModel) null, (setFocusableInTouchMode) null, (List) null, (RelationshipItemModel) null, 28));
        Unit unit = Unit.INSTANCE;
        initstylebytheme.getMin(arrayList);
    }

    public static final /* synthetic */ void setMax(BaseFeedTimelineFragment baseFeedTimelineFragment, boolean z) {
        CardView cardView = (CardView) baseFeedTimelineFragment.getMin(resetInternal.setMax.CallSuper);
        Intrinsics.checkNotNullExpressionValue(cardView, "cv_back_to_top");
        cardView.setVisibility(z ? 0 : 8);
    }

    public static final /* synthetic */ void getMax(BaseFeedTimelineFragment baseFeedTimelineFragment) {
        LoadingLottieAnimationView loadingLottieAnimationView = baseFeedTimelineFragment.getMin;
        if (loadingLottieAnimationView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("lavLoadingAnimation");
        }
        loadingLottieAnimationView.setupLoopMinMaxFrame(loadingLottieAnimationView);
        if (baseFeedTimelineFragment.toIntRange) {
            loadingLottieAnimationView.setMaxFrame(loadingLottieAnimationView.getOutroMaxFrame());
            loadingLottieAnimationView.setLoopFinished(true);
        }
    }
}
