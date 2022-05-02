package id.dana.news;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import id.dana.R;
import id.dana.contract.deeplink.DeepLinkModule;
import id.dana.contract.deeplink.FeatureModule;
import id.dana.contract.services.ServicesModule;
import id.dana.contract.shortener.RestoreUrlModule;
import id.dana.contract.staticqr.ScanQrModule;
import id.dana.danah5.DanaH5;
import id.dana.di.modules.LatestNewsModule;
import id.dana.di.modules.OauthModule;
import id.dana.tracker.TrackerKey;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o.AddPhoneContactBridgeExtension;
import o.BLEBridgeExtension;
import o.FtsOptions$Order;
import o.HCEBridgeExtension;
import o.IntRange;
import o.PrepareException;
import o.SnapshotSaveExtension;
import o.convertDipToPx;
import o.convertSpToPx;
import o.genTextSelector;
import o.getDuration;
import o.getScrimColor;
import o.isShowMenu;
import o.onProcess;
import o.resetInternal;
import o.stopIgnoring;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u0000 .2\u00020\u0001:\u0001.B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002J\b\u0010\u001e\u001a\u00020\u001cH\u0014J\b\u0010\u001f\u001a\u00020 H\u0002J\b\u0010!\u001a\u00020 H\u0014J\u0010\u0010\"\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\u001cH\u0002J\u0010\u0010$\u001a\u00020 2\u0006\u0010%\u001a\u00020&H\u0002J\b\u0010'\u001a\u00020 H\u0002J\b\u0010(\u001a\u00020 H\u0002J\b\u0010)\u001a\u00020 H\u0002J\b\u0010*\u001a\u00020 H\u0002J\b\u0010+\u001a\u00020 H\u0002J\u0010\u0010,\u001a\u00020 2\u0006\u0010-\u001a\u00020&H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0007\u001a\u00020\b8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX.¢\u0006\u0002\n\u0000R\u001e\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0015\u001a\u0004\u0018\u00010\u00168BX\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0017\u0010\u0018¨\u0006/"}, d2 = {"Lid/dana/news/LatestNewsFragment;", "Lid/dana/base/BaseFragment;", "()V", "isLoading", "", "latestNewsAdapter", "Lid/dana/news/adapter/LatestNewsAdapter;", "latestNewsPresenter", "Lid/dana/news/LatestNewsContract$Presenter;", "getLatestNewsPresenter", "()Lid/dana/news/LatestNewsContract$Presenter;", "setLatestNewsPresenter", "(Lid/dana/news/LatestNewsContract$Presenter;)V", "layoutManager", "Landroidx/recyclerview/widget/LinearLayoutManager;", "readDeepLinkPropertiesPresenter", "Lid/dana/contract/deeplink/ReadLinkPropertiesContract$Presenter;", "getReadDeepLinkPropertiesPresenter", "()Lid/dana/contract/deeplink/ReadLinkPropertiesContract$Presenter;", "setReadDeepLinkPropertiesPresenter", "(Lid/dana/contract/deeplink/ReadLinkPropertiesContract$Presenter;)V", "skeletonScreen", "Lcom/ethanhua/skeleton/RecyclerViewSkeletonScreen;", "getSkeletonScreen", "()Lcom/ethanhua/skeleton/RecyclerViewSkeletonScreen;", "skeletonScreen$delegate", "Lkotlin/Lazy;", "computeThresholdNumber", "", "itemCount", "getLayout", "hideSkeleton", "", "init", "isThresholdReached", "threshold", "openH5Container", "url", "", "setRecyclerViewOnScrollListener", "setupAdapter", "setupInjection", "setupRecyclerView", "showSkeleton", "trackNewsOpen", "activityTitle", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class LatestNewsFragment extends FtsOptions$Order {
    @NotNull
    public static final setMin getMin = new setMin((byte) 0);
    /* access modifiers changed from: private */
    public boolean IsOverlapping;
    @Inject
    public AddPhoneContactBridgeExtension.AnonymousClass3.setMin latestNewsPresenter;
    @Inject
    public getDuration.length readDeepLinkPropertiesPresenter;
    /* access modifiers changed from: private */
    public final HCEBridgeExtension setMax = new HCEBridgeExtension(CollectionsKt.emptyList());
    private LinearLayoutManager setMin;
    private final Lazy toFloatRange = LazyKt.lazy(new setMax(this));
    private HashMap toIntRange;

    public static final /* synthetic */ int setMax(int i) {
        if (i < 2) {
            return 2;
        }
        return i - 2;
    }

    public final View getMin(int i) {
        if (this.toIntRange == null) {
            this.toIntRange = new HashMap();
        }
        View view = (View) this.toIntRange.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.toIntRange.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final int setMin() {
        return R.layout.fragment_latest_news;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ethanhua/skeleton/RecyclerViewSkeletonScreen;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class setMax extends Lambda implements Function0<getScrimColor> {
        final /* synthetic */ LatestNewsFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        setMax(LatestNewsFragment latestNewsFragment) {
            super(0);
            this.this$0 = latestNewsFragment;
        }

        @Nullable
        public final getScrimColor invoke() {
            if (((RecyclerView) this.this$0.getMin(resetInternal.setMax.setSupportButtonTintMode)) == null) {
                return null;
            }
            getScrimColor.getMax getmax = new getScrimColor.getMax((RecyclerView) this.this$0.getMin(resetInternal.setMax.setSupportButtonTintMode));
            getmax.length = this.this$0.setMax;
            getmax.setMin = 15;
            getmax.getMax = R.layout.latest_news_item_skeleton;
            getmax.IsOverlapping = 1500;
            getmax.getMin = true;
            getmax.toFloatRange = IntRange.setMax(getmax.setMax.getContext(), R.color.f24782131100433);
            getScrimColor getscrimcolor = new getScrimColor(getmax, (byte) 0);
            getscrimcolor.getMin();
            return getscrimcolor;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0012\u0010\u0004\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u001f\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0002\u0010\fJ\u0012\u0010\r\u001a\u00020\u00032\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH\u0016J\b\u0010\u000f\u001a\u00020\u0003H\u0016¨\u0006\u0010"}, d2 = {"id/dana/news/LatestNewsFragment$setupInjection$component$1", "Lid/dana/news/LatestNewsContract$View;", "dismissProgress", "", "onError", "errorMessage", "", "onGetDefaultFeedFromConfigSuccess", "feedsModel", "Lid/dana/feeds/model/FeedsModel;", "isFromRefresh", "", "(Lid/dana/feeds/model/FeedsModel;Ljava/lang/Boolean;)V", "onGetFeeds", "onScrollLoadMoreFeedSucccess", "showProgress", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMax implements AddPhoneContactBridgeExtension.AnonymousClass3.length {
        final /* synthetic */ LatestNewsFragment setMax;

        public final void dismissProgress() {
        }

        public final void onError(@Nullable String str) {
        }

        public final void showProgress() {
        }

        getMax(LatestNewsFragment latestNewsFragment) {
            this.setMax = latestNewsFragment;
        }

        public final void length(@Nullable BLEBridgeExtension.AnonymousClass10 r4) {
            LatestNewsFragment.getMax(this.setMax);
            if (r4 != null) {
                this.setMax.IsOverlapping = false;
                HCEBridgeExtension length = this.setMax.setMax;
                List<onProcess> list = r4.setMax;
                if (list == null) {
                    list = CollectionsKt.emptyList();
                }
                length.getMin(list);
                HCEBridgeExtension length2 = this.setMax.setMax;
                String str = r4.getMax;
                Intrinsics.checkNotNullExpressionValue(str, "feedsModel.maxId");
                Intrinsics.checkNotNullParameter(str, "<set-?>");
                length2.getMin = str;
                this.setMax.setMax.getMax = r4.setMax();
            }
        }

        public final void getMax(@NotNull BLEBridgeExtension.AnonymousClass10 r4) {
            Intrinsics.checkNotNullParameter(r4, "feedsModel");
            this.setMax.IsOverlapping = false;
            HCEBridgeExtension length = this.setMax.setMax;
            List<onProcess> list = r4.setMax;
            if (list == null) {
                list = CollectionsKt.emptyList();
            }
            length.length(list);
            HCEBridgeExtension length2 = this.setMax.setMax;
            String str = r4.getMax;
            Intrinsics.checkNotNullExpressionValue(str, "feedsModel.maxId");
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            length2.getMin = str;
            this.setMax.setMax.getMax = r4.setMax();
        }

        public final void setMax(@NotNull BLEBridgeExtension.AnonymousClass10 r2, @Nullable Boolean bool) {
            Intrinsics.checkNotNullParameter(r2, "feedsModel");
            this.setMax.IsOverlapping = false;
            if (r2.setMax == null || r2.setMax.isEmpty()) {
                LatestNewsFragment.setMax(this.setMax);
                AddPhoneContactBridgeExtension.AnonymousClass3.setMin setmin = this.setMax.latestNewsPresenter;
                if (setmin == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("latestNewsPresenter");
                }
                setmin.getMax(15, (String) null);
                return;
            }
            LatestNewsFragment.getMax(this.setMax);
            this.setMax.setMax.getMin(r2.setMax);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016¨\u0006\t"}, d2 = {"id/dana/news/LatestNewsFragment$setRecyclerViewOnScrollListener$1", "Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;", "onScrolled", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "dx", "", "dy", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMin extends RecyclerView.toIntRange {
        final /* synthetic */ LatestNewsFragment getMin;

        getMin(LatestNewsFragment latestNewsFragment) {
            this.getMin = latestNewsFragment;
        }

        public final void onScrolled(@NotNull RecyclerView recyclerView, int i, int i2) {
            Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
            super.onScrolled(recyclerView, i, i2);
            if (this.getMin.setMin(LatestNewsFragment.setMax(this.getMin.setMax.getItemCount())) && this.getMin.setMax.setMin() && !this.getMin.IsOverlapping) {
                AddPhoneContactBridgeExtension.AnonymousClass3.setMin setmin = this.getMin.latestNewsPresenter;
                if (setmin == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("latestNewsPresenter");
                }
                setmin.getMin(this.getMin.setMax.getMin);
                this.getMin.IsOverlapping = true;
            }
        }
    }

    /* access modifiers changed from: private */
    public final boolean setMin(int i) {
        LinearLayoutManager linearLayoutManager = this.setMin;
        if (linearLayoutManager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("layoutManager");
        }
        return linearLayoutManager.findLastCompletelyVisibleItemPosition() >= i;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016¨\u0006\u0007"}, d2 = {"id/dana/news/LatestNewsFragment$setupAdapter$1", "Lid/dana/news/adapter/LatestNewsAdapter$NewsActions;", "onClickFeed", "", "activityModel", "Lid/dana/feeds/model/ActivityModel;", "onClickHasMore", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class length implements HCEBridgeExtension.setMin {
        final /* synthetic */ LatestNewsFragment getMax;

        length(LatestNewsFragment latestNewsFragment) {
            this.getMax = latestNewsFragment;
        }

        public final void setMin(@NotNull onProcess onprocess) {
            Intrinsics.checkNotNullParameter(onprocess, "activityModel");
            String str = onprocess.toDoubleRange;
            if (str != null) {
                this.getMax.p_();
                LatestNewsFragment.getMin(this.getMax, str);
                LatestNewsFragment latestNewsFragment = this.getMax;
                String str2 = onprocess.getMin;
                Intrinsics.checkNotNullExpressionValue(str2, "activityModel.activityTitle");
                LatestNewsFragment.setMin(latestNewsFragment, str2);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lid/dana/news/LatestNewsFragment$Companion;", "", "()V", "NUMBER_OF_LAST_ITEM_TO_BE_SEEN_TO_LOAD_MORE", "", "NUMBER_OF_NEWS_TOBE_FETCHED", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMin {
        private setMin() {
        }

        public /* synthetic */ setMin(byte b) {
            this();
        }
    }

    public final void setMax() {
        PrepareException.AnonymousClass1 r2;
        SnapshotSaveExtension.AnonymousClass1.getMin getmin = new SnapshotSaveExtension.AnonymousClass1.getMin((byte) 0);
        if (this.getMax != null) {
            r2 = this.getMax.getApplicationComponent();
        } else {
            r2 = null;
        }
        if (r2 != null) {
            getmin.equals = r2;
            DeepLinkModule.setMin max = DeepLinkModule.getMax();
            max.getMax = getActivity();
            getmin.length = new DeepLinkModule(max, (byte) 0);
            ScanQrModule.setMin max2 = ScanQrModule.getMax();
            max2.setMin = getActivity();
            getmin.setMin = new ScanQrModule(max2, (byte) 0);
            RestoreUrlModule.setMin min = RestoreUrlModule.setMin();
            min.getMax = getActivity();
            getmin.getMin = new RestoreUrlModule(min, (byte) 0);
            FeatureModule.length length2 = FeatureModule.length();
            length2.setMax = getActivity();
            getmin.setMax = new FeatureModule(length2, (byte) 0);
            OauthModule.getMax min2 = OauthModule.setMin();
            min2.setMin = getActivity();
            getmin.toFloatRange = new OauthModule(min2, (byte) 0);
            getmin.getMax = new LatestNewsModule(new getMax(this));
            stopIgnoring.setMin(getmin.getMax, LatestNewsModule.class);
            stopIgnoring.setMin(getmin.length, DeepLinkModule.class);
            stopIgnoring.setMin(getmin.setMin, ScanQrModule.class);
            stopIgnoring.setMin(getmin.getMin, RestoreUrlModule.class);
            stopIgnoring.setMin(getmin.setMax, FeatureModule.class);
            stopIgnoring.setMin(getmin.toFloatRange, OauthModule.class);
            if (getmin.toIntRange == null) {
                getmin.toIntRange = new ServicesModule();
            }
            stopIgnoring.setMin(getmin.equals, PrepareException.AnonymousClass1.class);
            new SnapshotSaveExtension.AnonymousClass1(getmin.getMax, getmin.length, getmin.setMin, getmin.getMin, getmin.setMax, getmin.toFloatRange, getmin.toIntRange, getmin.equals, (byte) 0).length(this);
            this.setMax.setMin = new length(this);
            this.setMin = new LinearLayoutManager(getContext());
            RecyclerView recyclerView = (RecyclerView) getMin(resetInternal.setMax.setSupportButtonTintMode);
            if (recyclerView != null) {
                LinearLayoutManager linearLayoutManager = this.setMin;
                if (linearLayoutManager == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("layoutManager");
                }
                recyclerView.setLayoutManager(linearLayoutManager);
            }
            RecyclerView recyclerView2 = (RecyclerView) getMin(resetInternal.setMax.setSupportButtonTintMode);
            if (recyclerView2 != null) {
                recyclerView2.setAdapter(this.setMax);
            }
            getScrimColor getscrimcolor = (getScrimColor) this.toFloatRange.getValue();
            if (getscrimcolor != null) {
                getscrimcolor.getMin();
            }
            AddPhoneContactBridgeExtension.AnonymousClass3.setMin setmin = this.latestNewsPresenter;
            if (setmin == null) {
                Intrinsics.throwUninitializedPropertyAccessException("latestNewsPresenter");
            }
            setmin.length(Boolean.TRUE);
            return;
        }
        throw null;
    }

    public static final /* synthetic */ void getMax(LatestNewsFragment latestNewsFragment) {
        getScrimColor getscrimcolor = (getScrimColor) latestNewsFragment.toFloatRange.getValue();
        if (getscrimcolor != null) {
            getscrimcolor.getMax.setAdapter(getscrimcolor.length);
        }
    }

    public static final /* synthetic */ void setMax(LatestNewsFragment latestNewsFragment) {
        RecyclerView recyclerView = (RecyclerView) latestNewsFragment.getMin(resetInternal.setMax.setSupportButtonTintMode);
        if (recyclerView != null) {
            recyclerView.addOnScrollListener(new getMin(latestNewsFragment));
        }
    }

    public static final /* synthetic */ void getMin(LatestNewsFragment latestNewsFragment, String str) {
        if (isShowMenu.length(str)) {
            getDuration.length length2 = latestNewsFragment.readDeepLinkPropertiesPresenter;
            if (length2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("readDeepLinkPropertiesPresenter");
            }
            length2.setMax(str);
            return;
        }
        DanaH5.startContainerFullUrl(str);
    }

    public static final /* synthetic */ void setMin(LatestNewsFragment latestNewsFragment, String str) {
        convertDipToPx.length length2 = new convertDipToPx.length(latestNewsFragment.getContext());
        length2.getMax = TrackerKey.Event.DANA_NEWS_OPEN;
        convertDipToPx.length max = length2.setMax(TrackerKey.NewsProperty.NEWS_TITLE, str);
        max.setMin();
        convertDipToPx convertdiptopx = new convertDipToPx(max, (byte) 0);
        List length3 = convertdiptopx.length != null ? convertdiptopx.length.length : new ArrayList();
        genTextSelector.setMax((convertSpToPx[]) length3.toArray(new convertSpToPx[length3.size()]));
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        HashMap hashMap = this.toIntRange;
        if (hashMap != null) {
            hashMap.clear();
        }
    }
}
