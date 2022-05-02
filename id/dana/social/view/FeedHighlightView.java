package id.dana.social.view;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ap.zoloz.hummer.biz.HummerConstants;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import id.dana.R;
import id.dana.base.BaseRichView;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import o.GriverRpcExtensionImpl;
import o.WebSocketBridgeCallback;
import o.access$1702;
import o.getContextMenuInfo;
import o.reclaimScrapViews;
import o.resetInternal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B%\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bB)\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0002\u0010\nJ\b\u0010\u0015\u001a\u00020\u0007H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0002J\u000e\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0014J\b\u0010\u001a\u001a\u00020\u0017H\u0002J\b\u0010\u001b\u001a\u00020\u0017H\u0002J\u0016\u0010\u001c\u001a\u00020\u00172\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eH\u0002J\b\u0010 \u001a\u00020\u0017H\u0016J\u0006\u0010!\u001a\u00020\u0017J\u000f\u0010\"\u001a\u0004\u0018\u00010\u0017H\u0002¢\u0006\u0002\u0010#J\f\u0010$\u001a\u00020%*\u00020&H\u0002R\u000e\u0010\u000b\u001a\u00020\fX.¢\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u00020\u000eX.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0013\u001a\u00020\u0014X.¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lid/dana/social/view/FeedHighlightView;", "Lid/dana/base/BaseRichView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "feedHighlightAdapter", "Lid/dana/social/adapter/FeedHighlightAdapter;", "listener", "Lid/dana/social/adapter/MyFeedHighlightListener;", "getListener", "()Lid/dana/social/adapter/MyFeedHighlightListener;", "setListener", "(Lid/dana/social/adapter/MyFeedHighlightListener;)V", "myFeedHighlightModel", "Lid/dana/social/model/MyFeedHighlightModel;", "getLayout", "onRefresh", "", "render", "data", "renderEmptyState", "renderLoadingState", "renderSuccessState", "items", "", "Lid/dana/social/model/FeedHighlightModel;", "setup", "setupAdapter", "setupRecyclerView", "()Lkotlin/Unit;", "isScrolledToLast", "", "Landroidx/recyclerview/widget/RecyclerView;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class FeedHighlightView extends BaseRichView {
    /* access modifiers changed from: private */
    public GriverRpcExtensionImpl getMax;
    /* access modifiers changed from: private */
    public access$1702 getMin;
    public WebSocketBridgeCallback listener;
    private HashMap setMax;

    @JvmOverloads
    public FeedHighlightView(@NotNull Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
    }

    @JvmOverloads
    public FeedHighlightView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
    }

    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.setMax;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public final View _$_findCachedViewById(int i) {
        if (this.setMax == null) {
            this.setMax = new HashMap();
        }
        View view = (View) this.setMax.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.setMax.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final int getLayout() {
        return R.layout.view_feed_highlight;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "p1", "Lid/dana/social/model/FeedHighlightModel;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final /* synthetic */ class getMin extends FunctionReferenceImpl implements Function1<getContextMenuInfo, Unit> {
        getMin(WebSocketBridgeCallback webSocketBridgeCallback) {
            super(1, webSocketBridgeCallback, WebSocketBridgeCallback.class, "onClick", "onClick(Lid/dana/social/model/FeedHighlightModel;)V", 0);
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((getContextMenuInfo) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull getContextMenuInfo getcontextmenuinfo) {
            Intrinsics.checkNotNullParameter(getcontextmenuinfo, "p1");
            ((WebSocketBridgeCallback) this.receiver).setMin(getcontextmenuinfo);
        }
    }

    public static final /* synthetic */ GriverRpcExtensionImpl access$getFeedHighlightAdapter$p(FeedHighlightView feedHighlightView) {
        GriverRpcExtensionImpl griverRpcExtensionImpl = feedHighlightView.getMax;
        if (griverRpcExtensionImpl == null) {
            Intrinsics.throwUninitializedPropertyAccessException("feedHighlightAdapter");
        }
        return griverRpcExtensionImpl;
    }

    public static final /* synthetic */ access$1702 access$getMyFeedHighlightModel$p(FeedHighlightView feedHighlightView) {
        access$1702 access_1702 = feedHighlightView.getMin;
        if (access_1702 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("myFeedHighlightModel");
        }
        return access_1702;
    }

    @NotNull
    public final WebSocketBridgeCallback getListener() {
        WebSocketBridgeCallback webSocketBridgeCallback = this.listener;
        if (webSocketBridgeCallback == null) {
            Intrinsics.throwUninitializedPropertyAccessException(ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        }
        return webSocketBridgeCallback;
    }

    public final void setListener(@NotNull WebSocketBridgeCallback webSocketBridgeCallback) {
        Intrinsics.checkNotNullParameter(webSocketBridgeCallback, "<set-?>");
        this.listener = webSocketBridgeCallback;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FeedHighlightView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public FeedHighlightView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @TargetApi(21)
    public FeedHighlightView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
    }

    public final void setup() {
        getMax();
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(resetInternal.setMax.getAutoSizeMaxTextSize);
        if (recyclerView != null) {
            recyclerView.addOnScrollListener(new setMax(recyclerView, this));
            Unit unit = Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final /* synthetic */ class getMax extends FunctionReferenceImpl implements Function0<Unit> {
        getMax(FeedHighlightView feedHighlightView) {
            super(0, feedHighlightView, FeedHighlightView.class, "onRefresh", "onRefresh()V", 0);
        }

        public final void invoke() {
            FeedHighlightView.access$onRefresh((FeedHighlightView) this.receiver);
        }
    }

    public final void render(@NotNull access$1702 access_1702) {
        getContextMenuInfo getcontextmenuinfo;
        List max;
        Intrinsics.checkNotNullParameter(access_1702, "data");
        FeedHighlightView feedHighlightView = this;
        Function0<Unit> getmax = new getMax(feedHighlightView);
        Intrinsics.checkNotNullParameter(getmax, "<set-?>");
        access_1702.getMax = getmax;
        Unit unit = Unit.INSTANCE;
        this.getMin = access_1702;
        reclaimScrapViews reclaimscrapviews = access_1702.setMin;
        if (reclaimscrapviews instanceof reclaimScrapViews.length) {
            getMax();
        } else if (reclaimscrapviews instanceof reclaimScrapViews.setMax) {
            List<getContextMenuInfo> list = ((reclaimScrapViews.setMax) access_1702.setMin).length;
            if ((list.isEmpty() ? list : null) != null) {
                setMax();
                return;
            }
            AppCompatTextView appCompatTextView = (AppCompatTextView) feedHighlightView._$_findCachedViewById(resetInternal.setMax.CustomTabsIntent$ShareState);
            if (appCompatTextView != null) {
                appCompatTextView.setVisibility(0);
            }
            ConstraintLayout constraintLayout = (ConstraintLayout) feedHighlightView._$_findCachedViewById(resetInternal.setMax.IResultReceiver$Default);
            if (constraintLayout != null) {
                constraintLayout.setVisibility(8);
            }
            ConstraintLayout constraintLayout2 = (ConstraintLayout) feedHighlightView._$_findCachedViewById(resetInternal.setMax.IResultReceiver$Stub);
            if (constraintLayout2 != null) {
                constraintLayout2.setVisibility(0);
            }
            GriverRpcExtensionImpl griverRpcExtensionImpl = feedHighlightView.getMax;
            if (griverRpcExtensionImpl == null) {
                Intrinsics.throwUninitializedPropertyAccessException("feedHighlightAdapter");
            }
            List max2 = griverRpcExtensionImpl.getMax();
            if (!(max2 == null || (getcontextmenuinfo = (getContextMenuInfo) CollectionsKt.lastOrNull(max2)) == null)) {
                if (getcontextmenuinfo.length == 1 && (max = griverRpcExtensionImpl.getMax()) != null) {
                    max.remove(CollectionsKt.getLastIndex(max));
                    griverRpcExtensionImpl.notifyItemRemoved(max.size());
                }
                Unit unit2 = Unit.INSTANCE;
            }
            GriverRpcExtensionImpl griverRpcExtensionImpl2 = feedHighlightView.getMax;
            if (griverRpcExtensionImpl2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("feedHighlightAdapter");
            }
            access$1702 access_17022 = feedHighlightView.getMin;
            if (access_17022 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("myFeedHighlightModel");
            }
            boolean min = access_17022.setMin();
            Intrinsics.checkNotNullParameter(list, "data");
            if (min) {
                list = CollectionsKt.plus(list, new getContextMenuInfo((String) null, (String) null, (String) null, false, (HashMap) null, 1, (String) null, 95));
            }
            if (griverRpcExtensionImpl2.getItemCount() == 0) {
                griverRpcExtensionImpl2.getMin(list);
                return;
            }
            int itemCount = griverRpcExtensionImpl2.getItemCount();
            griverRpcExtensionImpl2.getMax().addAll(list);
            griverRpcExtensionImpl2.notifyItemInserted(itemCount);
        } else if ((reclaimscrapviews instanceof reclaimScrapViews.getMin) || (reclaimscrapviews instanceof reclaimScrapViews.getMax)) {
            setMax();
        }
    }

    private final void getMax() {
        AppCompatTextView appCompatTextView = (AppCompatTextView) _$_findCachedViewById(resetInternal.setMax.CustomTabsIntent$ShareState);
        if (appCompatTextView != null) {
            appCompatTextView.setVisibility(0);
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) _$_findCachedViewById(resetInternal.setMax.IResultReceiver$Default);
        if (constraintLayout != null) {
            constraintLayout.setVisibility(0);
        }
        ConstraintLayout constraintLayout2 = (ConstraintLayout) _$_findCachedViewById(resetInternal.setMax.IResultReceiver$Stub);
        Intrinsics.checkNotNullExpressionValue(constraintLayout2, "cl_highlight");
        constraintLayout2.setVisibility(8);
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(resetInternal.setMax.getAutoSizeMaxTextSize);
        if (recyclerView != null) {
            recyclerView.scrollToPosition(0);
        }
    }

    private final void setMax() {
        if (this.getMax != null) {
            GriverRpcExtensionImpl griverRpcExtensionImpl = this.getMax;
            if (griverRpcExtensionImpl == null) {
                Intrinsics.throwUninitializedPropertyAccessException("feedHighlightAdapter");
            }
            Collection max = griverRpcExtensionImpl.getMax();
            if (!(max == null || max.isEmpty())) {
                return;
            }
        }
        AppCompatTextView appCompatTextView = (AppCompatTextView) _$_findCachedViewById(resetInternal.setMax.CustomTabsIntent$ShareState);
        if (appCompatTextView != null) {
            appCompatTextView.setVisibility(8);
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) _$_findCachedViewById(resetInternal.setMax.IResultReceiver$Default);
        if (constraintLayout != null) {
            constraintLayout.setVisibility(8);
        }
        ConstraintLayout constraintLayout2 = (ConstraintLayout) _$_findCachedViewById(resetInternal.setMax.IResultReceiver$Stub);
        if (constraintLayout2 != null) {
            constraintLayout2.setVisibility(8);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b¸\u0006\u0000"}, d2 = {"id/dana/social/view/FeedHighlightView$setupRecyclerView$1$1", "Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;", "onScrollStateChanged", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "newState", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMax extends RecyclerView.toIntRange {
        final /* synthetic */ FeedHighlightView setMax;
        final /* synthetic */ RecyclerView setMin;

        setMax(RecyclerView recyclerView, FeedHighlightView feedHighlightView) {
            this.setMin = recyclerView;
            this.setMax = feedHighlightView;
        }

        public final void onScrollStateChanged(@NotNull RecyclerView recyclerView, int i) {
            Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
            super.onScrollStateChanged(recyclerView, i);
            if (this.setMax.getMin != null) {
                access$1702 access$getMyFeedHighlightModel$p = FeedHighlightView.access$getMyFeedHighlightModel$p(this.setMax);
                if (FeedHighlightView.getMax(this.setMin) && access$getMyFeedHighlightModel$p.getMax()) {
                    access$getMyFeedHighlightModel$p.length = true;
                    this.setMax.getListener().length(access$getMyFeedHighlightModel$p.setMax);
                }
            }
        }
    }

    public final void setupAdapter() {
        WebSocketBridgeCallback webSocketBridgeCallback = this.listener;
        if (webSocketBridgeCallback == null) {
            Intrinsics.throwUninitializedPropertyAccessException(ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        }
        this.getMax = new GriverRpcExtensionImpl(new getMin(webSocketBridgeCallback));
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(resetInternal.setMax.getAutoSizeMaxTextSize);
        if (recyclerView != null) {
            GriverRpcExtensionImpl griverRpcExtensionImpl = this.getMax;
            if (griverRpcExtensionImpl == null) {
                Intrinsics.throwUninitializedPropertyAccessException("feedHighlightAdapter");
            }
            recyclerView.setAdapter(griverRpcExtensionImpl);
        }
    }

    /* access modifiers changed from: private */
    public static boolean getMax(RecyclerView recyclerView) {
        RecyclerView.IsOverlapping layoutManager = recyclerView.getLayoutManager();
        if (!(layoutManager instanceof LinearLayoutManager)) {
            layoutManager = null;
        }
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
        if (linearLayoutManager == null || linearLayoutManager.findLastVisibleItemPosition() != linearLayoutManager.getItemCount() - 1) {
            return false;
        }
        return true;
    }

    public static final /* synthetic */ void access$onRefresh(FeedHighlightView feedHighlightView) {
        GriverRpcExtensionImpl griverRpcExtensionImpl = feedHighlightView.getMax;
        if (griverRpcExtensionImpl == null) {
            Intrinsics.throwUninitializedPropertyAccessException("feedHighlightAdapter");
        }
        griverRpcExtensionImpl.getMin();
        feedHighlightView.getMax();
    }
}
