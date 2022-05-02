package id.dana.social.view;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.ap.zoloz.hummer.biz.HummerConstants;
import com.google.firebase.analytics.FirebaseAnalytics;
import id.dana.DanaApplication;
import id.dana.R;
import id.dana.base.BaseActivity;
import id.dana.base.BaseRichView;
import id.dana.social.AddReactionBottomSheetDialog;
import id.dana.social.di.module.ReactionsModule;
import id.dana.social.model.FeedModel;
import id.dana.social.model.ReactionCountModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import o.AUHorizontalListView;
import o.AUPopSupportPreemption;
import o.GriverRpcUtils;
import o.RunningAverageRssiFilter;
import o.SocketManifest;
import o.access$2302;
import o.access$2402;
import o.multiple;
import o.resetInternal;
import o.setLeftButtonFont;
import o.signRequest;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\u0018\u0000 W2\u00020\u0001:\u0001WB%\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bB)\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0002\u0010\nJ\u000e\u0010$\u001a\u00020%2\u0006\u0010\u000b\u001a\u00020\fJ\b\u0010&\u001a\u00020'H\u0002J\b\u0010(\u001a\u00020\u0007H\u0016J\b\u0010)\u001a\u00020*H\u0002J\b\u0010+\u001a\u00020,H\u0002J\b\u0010-\u001a\u00020%H\u0002J\b\u0010.\u001a\u00020%H\u0002J\u001e\u0010/\u001a\u00020\u001e2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u000201002\u0006\u00102\u001a\u000201H\u0002J\u0010\u00103\u001a\u00020%2\u0006\u00104\u001a\u000205H\u0002J\u0012\u00106\u001a\u00020%2\b\b\u0002\u00107\u001a\u000208H\u0002J\u0010\u00109\u001a\u00020%2\u0006\u0010\u000b\u001a\u00020\fH\u0002J \u0010:\u001a\u00020%2\u0006\u0010;\u001a\u00020<2\u0006\u00102\u001a\u0002012\u0006\u0010=\u001a\u00020>H\u0002J\u0010\u0010?\u001a\u00020%2\u0006\u0010;\u001a\u00020<H\u0002J\u0018\u0010@\u001a\u00020%2\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010A\u001a\u00020\u0007J\b\u0010B\u001a\u00020%H\u0016J\u0010\u0010C\u001a\u00020%2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u000e\u0010D\u001a\u00020%2\u0006\u0010\u000b\u001a\u00020\fJ\u0010\u0010E\u001a\u00020%2\u0006\u0010F\u001a\u00020\u001eH\u0002J\u0010\u0010G\u001a\u00020%2\u0006\u0010H\u001a\u00020\u001eH\u0002J\u0010\u0010I\u001a\u00020%2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0010\u0010J\u001a\u00020%2\u0006\u0010K\u001a\u000201H\u0002J\u0010\u0010L\u001a\u00020%2\u0006\u0010M\u001a\u00020\u001eH\u0002J\u0010\u0010N\u001a\u00020%2\u0006\u0010K\u001a\u000201H\u0002J\u0014\u0010O\u001a\u00020%*\u00020<2\u0006\u0010P\u001a\u000208H\u0002J\u001c\u0010Q\u001a\u00020%*\u00020<2\u0006\u0010R\u001a\u00020\u00072\u0006\u0010P\u001a\u000208H\u0002J\u0018\u0010S\u001a\b\u0012\u0004\u0012\u0002010\u001b*\b\u0012\u0004\u0012\u0002010\u001bH\u0002J \u0010T\u001a\b\u0012\u0004\u0012\u00020100*\b\u0012\u0004\u0012\u0002010\u001b2\u0006\u0010A\u001a\u00020\u0007H\u0002J\u0014\u0010U\u001a\u00020\u001e*\u00020\f2\u0006\u0010A\u001a\u00020\u0007H\u0002J\u0018\u0010V\u001a\b\u0012\u0004\u0012\u00020100*\b\u0012\u0004\u0012\u0002010\u001bH\u0002R\u000e\u0010\u000b\u001a\u00020\fX.¢\u0006\u0002\n\u0000R\u001e\u0010\r\u001a\u00020\u000e8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0013\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0014\u001a\u00020\u00158\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bX.¢\u0006\u0002\n\u0000R$\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u001e@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#¨\u0006X"}, d2 = {"Lid/dana/social/view/ReactionSectionView;", "Lid/dana/base/BaseRichView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "feedModel", "Lid/dana/social/model/FeedModel;", "friendshipAnalyticTracker", "Lid/dana/social/tracker/FriendshipAnalyticTracker;", "getFriendshipAnalyticTracker", "()Lid/dana/social/tracker/FriendshipAnalyticTracker;", "setFriendshipAnalyticTracker", "(Lid/dana/social/tracker/FriendshipAnalyticTracker;)V", "maxAllowedVisibleReactionItem", "presenter", "Lid/dana/social/contract/reaction/ReactionsContract$Presenter;", "getPresenter", "()Lid/dana/social/contract/reaction/ReactionsContract$Presenter;", "setPresenter", "(Lid/dana/social/contract/reaction/ReactionsContract$Presenter;)V", "reactions", "", "Lid/dana/social/model/ReactionModel;", "value", "", "showCommentCount", "getShowCommentCount", "()Z", "setShowCommentCount", "(Z)V", "addNewReaction", "", "getFeedReactionClickListener", "Lid/dana/social/adapter/FeedReactionClickListener;", "getLayout", "getOnReactionClickListener", "Lid/dana/social/adapter/SocialFeedClickListener;", "getReactionModuleView", "Lid/dana/social/contract/reaction/ReactionsContract$View;", "hideReactionsCounterText", "inject", "modifyCurrentReactionAdapterList", "", "Lid/dana/social/model/ReactionCountModel;", "newReaction", "onReactionAdded", "reactionResult", "Lid/dana/social/model/ReactionResultModel;", "openActivityReactionsBottomSheetDialog", "kind", "", "openAddReactionScreen", "prependNewReactionToAdapterAndScrollRecyclerView", "adapter", "Lid/dana/social/adapter/FeedReactionAdapter;", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "setReactionAdapterItems", "setReactionsContentView", "maxVisibleItem", "setup", "setupAddNewSaymojiButton", "setupDetailActivityView", "setupEmptyStateView", "reactionsAvilable", "setupMoreReactionsButton", "shouldShowMoreButton", "setupReactionAndCommentInfo", "toggleReaction", "reactionCountModel", "toggleReactionSectionVisibility", "visible", "trackEmojiAdd", "clearAllSelectedReaction", "feedId", "clearSelectedReaction", "reactPosition", "filterOnlyValidReactions", "getVisibleReactions", "isShowMoreReactionButton", "sortReactions", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class ReactionSectionView extends BaseRichView {
    @NotNull
    public static final getMax Companion = new getMax((byte) 0);
    public static final float MAX_REACTION_VIEW_WIDTH_IN_DP = 78.0f;
    @Inject
    public AUHorizontalListView.SelectionNotifier friendshipAnalyticTracker;
    private int getMax;
    /* access modifiers changed from: private */
    public FeedModel getMin;
    private HashMap length;
    @Inject
    public setLeftButtonFont.getMin presenter;
    /* access modifiers changed from: private */
    public List<access$2402> setMax;
    private boolean setMin;

    @JvmOverloads
    public ReactionSectionView(@NotNull Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
    }

    @JvmOverloads
    public ReactionSectionView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
    }

    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.length;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public final View _$_findCachedViewById(int i) {
        if (this.length == null) {
            this.length = new HashMap();
        }
        View view = (View) this.length.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.length.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final int getLayout() {
        return R.layout.view_feed_reaction_section;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lid/dana/social/model/ReactionResultModel;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class length extends Lambda implements Function1<access$2302, Unit> {
        final /* synthetic */ ReactionSectionView this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        length(ReactionSectionView reactionSectionView) {
            super(1);
            this.this$0 = reactionSectionView;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((access$2302) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull access$2302 access_2302) {
            Intrinsics.checkNotNullParameter(access_2302, "it");
            ReactionSectionView.access$onReactionAdded(this.this$0, access_2302);
        }
    }

    public static final /* synthetic */ FeedModel access$getFeedModel$p(ReactionSectionView reactionSectionView) {
        FeedModel feedModel = reactionSectionView.getMin;
        if (feedModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("feedModel");
        }
        return feedModel;
    }

    public static final /* synthetic */ List access$getReactions$p(ReactionSectionView reactionSectionView) {
        List<access$2402> list = reactionSectionView.setMax;
        if (list == null) {
            Intrinsics.throwUninitializedPropertyAccessException("reactions");
        }
        return list;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ReactionSectionView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ReactionSectionView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        this.getMax = 2;
        this.setMin = true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @TargetApi(21)
    public ReactionSectionView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        this.getMax = 2;
        this.setMin = true;
    }

    @NotNull
    public final setLeftButtonFont.getMin getPresenter() {
        setLeftButtonFont.getMin getmin = this.presenter;
        if (getmin == null) {
            Intrinsics.throwUninitializedPropertyAccessException("presenter");
        }
        return getmin;
    }

    public final void setPresenter(@NotNull setLeftButtonFont.getMin getmin) {
        Intrinsics.checkNotNullParameter(getmin, "<set-?>");
        this.presenter = getmin;
    }

    @NotNull
    public final AUHorizontalListView.SelectionNotifier getFriendshipAnalyticTracker() {
        AUHorizontalListView.SelectionNotifier selectionNotifier = this.friendshipAnalyticTracker;
        if (selectionNotifier == null) {
            Intrinsics.throwUninitializedPropertyAccessException("friendshipAnalyticTracker");
        }
        return selectionNotifier;
    }

    public final void setFriendshipAnalyticTracker(@NotNull AUHorizontalListView.SelectionNotifier selectionNotifier) {
        Intrinsics.checkNotNullParameter(selectionNotifier, "<set-?>");
        this.friendshipAnalyticTracker = selectionNotifier;
    }

    public final boolean getShowCommentCount() {
        return this.setMin;
    }

    public final void setShowCommentCount(boolean z) {
        this.setMin = z;
        if (this.getMin != null) {
            FeedModel feedModel = this.getMin;
            if (feedModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("feedModel");
            }
            setMax(feedModel);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0016¨\u0006\u0007"}, d2 = {"id/dana/social/view/ReactionSectionView$getReactionModuleView$1", "Lid/dana/social/contract/reaction/ReactionsContract$View;", "onReactionsLoaded", "", "reactions", "", "Lid/dana/social/model/ReactionModel;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMax implements setLeftButtonFont.setMin {
        final /* synthetic */ ReactionSectionView getMax;

        public final void equals() {
        }

        public final void getMin(@NotNull RunningAverageRssiFilter runningAverageRssiFilter) {
            Intrinsics.checkNotNullParameter(runningAverageRssiFilter, "deleteReactionResult");
        }

        public final void length(@NotNull access$2302 access_2302) {
            Intrinsics.checkNotNullParameter(access_2302, "reactionResultModel");
        }

        setMax(ReactionSectionView reactionSectionView) {
            this.getMax = reactionSectionView;
        }

        public final void setMax(@NotNull List<access$2402> list) {
            Intrinsics.checkNotNullParameter(list, "reactions");
            this.getMax.setMax = list;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"id/dana/social/view/ReactionSectionView$getOnReactionClickListener$1", "Lid/dana/social/adapter/BaseSocialFeedInteraction;", "onReactionClicked", "", "reactionCountModel", "Lid/dana/social/model/ReactionCountModel;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMin extends GriverRpcUtils.AnonymousClass1 {
        final /* synthetic */ ReactionSectionView getMin;

        setMin(ReactionSectionView reactionSectionView) {
            this.getMin = reactionSectionView;
        }

        public final void length(@NotNull ReactionCountModel reactionCountModel) {
            Intrinsics.checkNotNullParameter(reactionCountModel, "reactionCountModel");
            ReactionSectionView.access$toggleReaction(this.getMin, reactionCountModel);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2"}, k = 3, mv = {1, 4, 2})
    public static final class toIntRange<T> implements Comparator<T> {
        public final int compare(T t, T t2) {
            return ComparisonsKt.compareValues(Integer.valueOf(((ReactionCountModel) t).setMax), Integer.valueOf(((ReactionCountModel) t2).setMax));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1"}, k = 3, mv = {1, 4, 2})
    public static final class isInside<T> implements Comparator<T> {
        public final int compare(T t, T t2) {
            return ComparisonsKt.compareValues(Integer.valueOf(((ReactionCountModel) t2).setMax), Integer.valueOf(((ReactionCountModel) t).setMax));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "invoke", "id/dana/social/view/ReactionSectionView$toggleReaction$1$1"}, k = 3, mv = {1, 4, 2})
    static final class IsOverlapping extends Lambda implements Function0<Unit> {
        final /* synthetic */ Ref.IntRef $reactPosition;
        final /* synthetic */ ReactionCountModel $reactionCountModel$inlined;
        final /* synthetic */ SocketManifest $this_apply;
        final /* synthetic */ ReactionSectionView this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        IsOverlapping(SocketManifest socketManifest, Ref.IntRef intRef, ReactionSectionView reactionSectionView, ReactionCountModel reactionCountModel) {
            super(0);
            this.$this_apply = socketManifest;
            this.$reactPosition = intRef;
            this.this$0 = reactionSectionView;
            this.$reactionCountModel$inlined = reactionCountModel;
        }

        public final void invoke() {
            RecyclerView recyclerView = (RecyclerView) this.this$0._$_findCachedViewById(resetInternal.setMax.getSupportImageTintList);
            if (recyclerView != null) {
                recyclerView.scrollToPosition(0);
            }
            ReactionSectionView.access$getFeedModel$p(this.this$0).FastBitmap$CoordinateSystem.remove(this.$reactPosition.element);
            ReactionSectionView.access$getFeedModel$p(this.this$0).FastBitmap$CoordinateSystem.add(0, ReactionSectionView.access$getFeedModel$p(this.this$0).FastBitmap$CoordinateSystem.get(this.$reactPosition.element));
            this.this$0.getMax(this.$this_apply);
        }
    }

    private final void getMin(SocketManifest socketManifest, String str) {
        String str2;
        List max = socketManifest.getMax();
        Intrinsics.checkNotNullExpressionValue(max, FirebaseAnalytics.Param.ITEMS);
        Iterator it = max.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (((ReactionCountModel) it.next()).getMax()) {
                break;
            } else {
                i++;
            }
        }
        if (i != -1) {
            socketManifest.setMin(i, (Function0<Unit>) null);
            setLeftButtonFont.getMin getmin = this.presenter;
            if (getmin == null) {
                Intrinsics.throwUninitializedPropertyAccessException("presenter");
            }
            List max2 = socketManifest.getMax();
            Intrinsics.checkNotNullExpressionValue(max2, FirebaseAnalytics.Param.ITEMS);
            ReactionCountModel reactionCountModel = (ReactionCountModel) CollectionsKt.getOrNull(max2, i);
            if (reactionCountModel != null) {
                str2 = reactionCountModel.getMax;
            } else {
                str2 = null;
            }
            if (str2 == null) {
                str2 = "";
            }
            getmin.getMax(str2, str);
        }
    }

    public static /* synthetic */ void setReactionsContentView$default(ReactionSectionView reactionSectionView, FeedModel feedModel, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 30;
        }
        reactionSectionView.setReactionsContentView(feedModel, i);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00aa  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setReactionsContentView(@org.jetbrains.annotations.NotNull id.dana.social.model.FeedModel r6, int r7) {
        /*
            r5 = this;
            java.lang.String r0 = "feedModel"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            r5.getMin = r6
            if (r6 != 0) goto L_0x000c
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r0)
        L_0x000c:
            java.util.List<id.dana.social.model.ReactionCountModel> r6 = r6.FastBitmap$CoordinateSystem
            java.util.Collection r6 = (java.util.Collection) r6
            boolean r6 = r6.isEmpty()
            r1 = 1
            r6 = r6 ^ r1
            r2 = 0
            if (r6 != 0) goto L_0x0027
            id.dana.social.model.FeedModel r6 = r5.getMin
            if (r6 != 0) goto L_0x0020
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r0)
        L_0x0020:
            int r6 = r6.toDoubleRange
            if (r6 <= 0) goto L_0x0025
            goto L_0x0027
        L_0x0025:
            r6 = 0
            goto L_0x0028
        L_0x0027:
            r6 = 1
        L_0x0028:
            r5.setMin(r6)
            id.dana.social.model.FeedModel r6 = r5.getMin
            if (r6 != 0) goto L_0x0032
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r0)
        L_0x0032:
            java.util.List<id.dana.social.model.ReactionCountModel> r6 = r6.FastBitmap$CoordinateSystem
            java.util.Collection r6 = (java.util.Collection) r6
            boolean r6 = r6.isEmpty()
            r6 = r6 ^ r1
            int r3 = o.resetInternal.setMax.getSupportImageTintList
            android.view.View r3 = r5._$_findCachedViewById(r3)
            androidx.recyclerview.widget.RecyclerView r3 = (androidx.recyclerview.widget.RecyclerView) r3
            if (r3 == 0) goto L_0x0054
            android.view.View r3 = (android.view.View) r3
            java.lang.String r4 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r4)
            if (r6 == 0) goto L_0x004f
            goto L_0x0051
        L_0x004f:
            r2 = 8
        L_0x0051:
            r3.setVisibility(r2)
        L_0x0054:
            r5.getMax = r7
            o.SocketManifest r6 = new o.SocketManifest
            id.dana.social.view.ReactionSectionView$setMin r2 = new id.dana.social.view.ReactionSectionView$setMin
            r2.<init>(r5)
            o.initContent r2 = (o.initContent) r2
            id.dana.social.model.FeedModel r3 = r5.getMin
            if (r3 != 0) goto L_0x0066
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r0)
        L_0x0066:
            java.util.List<id.dana.social.model.ReactionCountModel> r3 = r3.FastBitmap$CoordinateSystem
            java.util.List r3 = getMin((java.util.List<id.dana.social.model.ReactionCountModel>) r3)
            java.util.List r3 = getMax((java.util.List<id.dana.social.model.ReactionCountModel>) r3)
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.List r3 = kotlin.collections.CollectionsKt.take(r3, r7)
            java.util.Collection r3 = (java.util.Collection) r3
            java.util.List r3 = kotlin.collections.CollectionsKt.toMutableList(r3)
            id.dana.social.view.ReactionSectionView$getMin r4 = new id.dana.social.view.ReactionSectionView$getMin
            r4.<init>(r5)
            o.signRequest r4 = (o.signRequest) r4
            r6.<init>(r2, r3, r4)
            r6.setHasStableIds(r1)
            int r1 = o.resetInternal.setMax.getSupportImageTintList
            android.view.View r1 = r5._$_findCachedViewById(r1)
            androidx.recyclerview.widget.RecyclerView r1 = (androidx.recyclerview.widget.RecyclerView) r1
            if (r1 == 0) goto L_0x0098
            androidx.recyclerview.widget.RecyclerView$Adapter r6 = (androidx.recyclerview.widget.RecyclerView.Adapter) r6
            r1.setAdapter(r6)
        L_0x0098:
            id.dana.social.model.FeedModel r6 = r5.getMin
            if (r6 != 0) goto L_0x009f
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r0)
        L_0x009f:
            boolean r6 = getMax(r6, r7)
            r5.length((boolean) r6)
            id.dana.social.model.FeedModel r6 = r5.getMin
            if (r6 != 0) goto L_0x00ad
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r0)
        L_0x00ad:
            r5.setMax((id.dana.social.model.FeedModel) r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: id.dana.social.view.ReactionSectionView.setReactionsContentView(id.dana.social.model.FeedModel, int):void");
    }

    public final void setupDetailActivityView(@NotNull FeedModel feedModel) {
        Intrinsics.checkNotNullParameter(feedModel, "feedModel");
        this.getMin = feedModel;
        if (feedModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("feedModel");
        }
        boolean z = !feedModel.FastBitmap$CoordinateSystem.isEmpty();
        TextView textView = (TextView) _$_findCachedViewById(resetInternal.setMax.getVerticalMargins);
        if (textView != null) {
            textView.setVisibility(8);
        }
        FeedModel feedModel2 = this.getMin;
        if (feedModel2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("feedModel");
        }
        View _$_findCachedViewById = _$_findCachedViewById(resetInternal.setMax.setTranslationY);
        if (_$_findCachedViewById != null) {
            _$_findCachedViewById.setVisibility(0);
        }
        ReactionView reactionView = (ReactionView) _$_findCachedViewById(resetInternal.setMax.haltActionBarHideOffsetAnimations);
        if (reactionView != null) {
            reactionView.setVisibility(4);
        }
        ReactionView reactionView2 = (ReactionView) _$_findCachedViewById(resetInternal.setMax.setHideOnContentScrollEnabled);
        if (reactionView2 != null) {
            reactionView2.setVisibility(0);
            reactionView2.setOnClickListener(new equals(this, feedModel2));
        }
        setMax(z);
        setLeftButtonFont.getMin getmin = this.presenter;
        if (getmin == null) {
            Intrinsics.throwUninitializedPropertyAccessException("presenter");
        }
        getmin.length();
    }

    private final void setMin(boolean z) {
        View _$_findCachedViewById = _$_findCachedViewById(resetInternal.setMax.updatePostLayout);
        int i = 0;
        if (_$_findCachedViewById != null) {
            Intrinsics.checkNotNullParameter(_$_findCachedViewById, "<this>");
            _$_findCachedViewById.setVisibility(z ? 0 : 8);
        }
        LinearLayout linearLayout = (LinearLayout) _$_findCachedViewById(resetInternal.setMax.trimToSize);
        if (linearLayout != null) {
            View view = linearLayout;
            Intrinsics.checkNotNullParameter(view, "<this>");
            view.setVisibility(z ? 0 : 8);
        }
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(resetInternal.setMax.getSupportImageTintList);
        if (recyclerView != null) {
            View view2 = recyclerView;
            Intrinsics.checkNotNullParameter(view2, "<this>");
            if (!z) {
                i = 8;
            }
            view2.setVisibility(i);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"id/dana/social/view/ReactionSectionView$getFeedReactionClickListener$1", "Lid/dana/social/adapter/FeedReactionClickListener;", "onFeedReactionLongClickListener", "", "kind", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMin implements signRequest {
        final /* synthetic */ ReactionSectionView length;

        getMin(ReactionSectionView reactionSectionView) {
            this.length = reactionSectionView;
        }

        public final void length(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "kind");
            this.length.length(str);
        }
    }

    private final void length(boolean z) {
        ReactionView reactionView = (ReactionView) _$_findCachedViewById(resetInternal.setMax.haltActionBarHideOffsetAnimations);
        if (reactionView != null) {
            View view = reactionView;
            Intrinsics.checkNotNullParameter(view, "<this>");
            view.setVisibility(z ? 0 : 8);
        }
        ReactionView reactionView2 = (ReactionView) _$_findCachedViewById(resetInternal.setMax.haltActionBarHideOffsetAnimations);
        if (reactionView2 != null) {
            reactionView2.setOnClickListener(new toFloatRange(this));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class toFloatRange implements View.OnClickListener {
        final /* synthetic */ ReactionSectionView getMin;

        toFloatRange(ReactionSectionView reactionSectionView) {
            this.getMin = reactionSectionView;
        }

        public final void onClick(View view) {
            ReactionSectionView.openActivityReactionsBottomSheetDialog$default(this.getMin, (String) null, 1, (Object) null);
        }
    }

    static /* synthetic */ void openActivityReactionsBottomSheetDialog$default(ReactionSectionView reactionSectionView, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        reactionSectionView.length(str);
    }

    /* access modifiers changed from: private */
    public final void length(String str) {
        FeedModel feedModel = this.getMin;
        if (feedModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("feedModel");
        }
        List<ReactionCountModel> mutableList = CollectionsKt.toMutableList(getMin(feedModel.FastBitmap$CoordinateSystem));
        Intrinsics.checkNotNullParameter(mutableList, "<set-?>");
        feedModel.FastBitmap$CoordinateSystem = mutableList;
        FeedModel feedModel2 = this.getMin;
        if (feedModel2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("feedModel");
        }
        ActivityReactionsBottomSheetDialog activityReactionsBottomSheetDialog = new ActivityReactionsBottomSheetDialog(feedModel2, str);
        BaseActivity baseActivity = getBaseActivity();
        Intrinsics.checkNotNullExpressionValue(baseActivity, "baseActivity");
        activityReactionsBottomSheetDialog.show(baseActivity.getSupportFragmentManager(), "");
    }

    /* access modifiers changed from: private */
    public final void getMin(FeedModel feedModel) {
        AddReactionBottomSheetDialog.length length2 = AddReactionBottomSheetDialog.getMin;
        Function1 length3 = new length(this);
        Intrinsics.checkNotNullParameter(feedModel, "feedModel");
        Intrinsics.checkNotNullParameter(length3, "onReacted");
        AddReactionBottomSheetDialog.isInside = length3;
        AddReactionBottomSheetDialog addReactionBottomSheetDialog = new AddReactionBottomSheetDialog();
        addReactionBottomSheetDialog.setArguments(multiple.getMin(new Pair("ARG_FEED", feedModel)));
        BaseActivity baseActivity = getBaseActivity();
        Intrinsics.checkNotNullExpressionValue(baseActivity, "baseActivity");
        addReactionBottomSheetDialog.show(baseActivity.getSupportFragmentManager(), "addReactionDialog");
    }

    private static boolean getMin(List<ReactionCountModel> list, ReactionCountModel reactionCountModel) {
        int i = 0;
        for (Object next : list) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            ReactionCountModel reactionCountModel2 = (ReactionCountModel) next;
            if (reactionCountModel2.getMax()) {
                reactionCountModel2.setMax--;
                reactionCountModel2.length = false;
                if (reactionCountModel2.setMax == 0) {
                    list.remove(i);
                    list.add(0, reactionCountModel);
                    return true;
                }
            }
            i = i2;
        }
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            if (Intrinsics.areEqual((Object) list.get(i3).getMin, (Object) reactionCountModel.getMin)) {
                list.get(i3).setMax++;
                list.get(i3).length = true;
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: private */
    public final void getMax(SocketManifest socketManifest) {
        FeedModel feedModel = this.getMin;
        if (feedModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("feedModel");
        }
        List<ReactionCountModel> max = getMax(feedModel.FastBitmap$CoordinateSystem);
        socketManifest.getMin(CollectionsKt.toMutableList(CollectionsKt.take(getMax(getMin(max)), this.getMax)));
    }

    private static List<ReactionCountModel> getMin(List<ReactionCountModel> list) {
        Collection arrayList = new ArrayList();
        for (Object next : list) {
            if (((ReactionCountModel) next).setMax > 0) {
                arrayList.add(next);
            }
        }
        return (List) arrayList;
    }

    private static List<ReactionCountModel> getMax(List<ReactionCountModel> list) {
        Iterable sortedWith = CollectionsKt.sortedWith(list, new isInside());
        Collection arrayList = new ArrayList();
        for (Object next : sortedWith) {
            if (((ReactionCountModel) next).getMax()) {
                arrayList.add(next);
            }
        }
        Collection sortedWith2 = CollectionsKt.sortedWith((List) arrayList, new toIntRange());
        Collection arrayList2 = new ArrayList();
        for (Object next2 : sortedWith) {
            if (!((ReactionCountModel) next2).getMax()) {
                arrayList2.add(next2);
            }
        }
        return CollectionsKt.toMutableList(CollectionsKt.plus(sortedWith2, (List) arrayList2));
    }

    public final void addNewReaction(@NotNull FeedModel feedModel) {
        Intrinsics.checkNotNullParameter(feedModel, "feedModel");
        getMin(feedModel);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "id/dana/social/view/ReactionSectionView$setupAddNewSaymojiButton$1$1"}, k = 3, mv = {1, 4, 2})
    static final class equals implements View.OnClickListener {
        final /* synthetic */ FeedModel setMax;
        final /* synthetic */ ReactionSectionView setMin;

        equals(ReactionSectionView reactionSectionView, FeedModel feedModel) {
            this.setMin = reactionSectionView;
            this.setMax = feedModel;
        }

        public final void onClick(View view) {
            this.setMin.getMin(this.setMax);
        }
    }

    private final void setMax(boolean z) {
        TextView textView;
        TextView textView2 = (TextView) _$_findCachedViewById(resetInternal.setMax.getVerticalMargins);
        int i = 0;
        if ((textView2 == null || textView2.getVisibility() != 0) && (textView = (TextView) _$_findCachedViewById(resetInternal.setMax.setCollapsible)) != null) {
            View view = textView;
            boolean z2 = !z;
            Intrinsics.checkNotNullParameter(view, "<this>");
            if (!z2) {
                i = 8;
            }
            view.setVisibility(i);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bXT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bXT¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lid/dana/social/view/ReactionSectionView$Companion;", "", "()V", "MAX_REACTION_ITEM_COUNT", "", "MAX_REACTION_VIEW_WIDTH_IN_DP", "", "REACTION_ITEM_NOT_FOUND", "", "TAG", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMax {
        private getMax() {
        }

        public /* synthetic */ getMax(byte b) {
            this();
        }
    }

    public final void setup() {
        BaseActivity baseActivity = getBaseActivity();
        Intrinsics.checkNotNullExpressionValue(baseActivity, "baseActivity");
        DanaApplication danaApplication = baseActivity.getDanaApplication();
        Intrinsics.checkNotNullExpressionValue(danaApplication, "baseActivity.danaApplication");
        AUPopSupportPreemption socialCommonComponent = danaApplication.getSocialCommonComponent();
        if (socialCommonComponent != null) {
            socialCommonComponent.setMax(new ReactionsModule(new setMax(this))).getMin(this);
        }
    }

    private final void setMax(FeedModel feedModel) {
        int i = 0;
        for (ReactionCountModel reactionCountModel : feedModel.FastBitmap$CoordinateSystem) {
            i += reactionCountModel.setMax;
        }
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, HummerConstants.CONTEXT);
        String quantityString = context.getResources().getQuantityString(R.plurals.f75322131755021, i, new Object[]{Integer.valueOf(i)});
        Intrinsics.checkNotNullExpressionValue(quantityString, "context.resources.getQua…ymojiTotalCount\n        )");
        int i2 = feedModel.toDoubleRange;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, HummerConstants.CONTEXT);
        String quantityString2 = context2.getResources().getQuantityString(R.plurals.f75312131755020, i2, new Object[]{Integer.valueOf(i2)});
        Intrinsics.checkNotNullExpressionValue(quantityString2, "context.resources.getQua…mmentTotalCount\n        )");
        if (i > 0 && i2 > 0 && this.setMin) {
            StringBuilder sb = new StringBuilder();
            sb.append(quantityString);
            sb.append(", ");
            sb.append(quantityString2);
            quantityString = sb.toString();
        } else if (i2 > 0 && this.setMin) {
            quantityString = quantityString2;
        } else if (i <= 0) {
            quantityString = "-";
        }
        TextView textView = (TextView) _$_findCachedViewById(resetInternal.setMax.getVerticalMargins);
        if (textView != null) {
            textView.setText(quantityString);
        }
    }

    private static boolean getMax(FeedModel feedModel, int i) {
        return feedModel.FastBitmap$CoordinateSystem.size() > i;
    }

    /* JADX WARNING: Removed duplicated region for block: B:109:0x01aa  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x01b6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final /* synthetic */ void access$toggleReaction(id.dana.social.view.ReactionSectionView r13, id.dana.social.model.ReactionCountModel r14) {
        /*
            int r0 = o.resetInternal.setMax.getSupportImageTintList
            android.view.View r0 = r13._$_findCachedViewById(r0)
            androidx.recyclerview.widget.RecyclerView r0 = (androidx.recyclerview.widget.RecyclerView) r0
            r1 = 0
            if (r0 == 0) goto L_0x0010
            androidx.recyclerview.widget.RecyclerView$Adapter r0 = r0.getAdapter()
            goto L_0x0011
        L_0x0010:
            r0 = r1
        L_0x0011:
            o.SocketManifest r0 = (o.SocketManifest) r0
            if (r0 == 0) goto L_0x01c2
            kotlin.jvm.internal.Ref$IntRef r2 = new kotlin.jvm.internal.Ref$IntRef
            r2.<init>()
            java.util.List r3 = r0.getMax()
            java.lang.String r4 = "items"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
            java.util.Iterator r3 = r3.iterator()
            r5 = 0
            r6 = 0
        L_0x0029:
            boolean r7 = r3.hasNext()
            r8 = -1
            if (r7 == 0) goto L_0x0044
            java.lang.Object r7 = r3.next()
            id.dana.social.model.ReactionCountModel r7 = (id.dana.social.model.ReactionCountModel) r7
            java.lang.String r7 = r7.getMin
            java.lang.String r9 = r14.getMin
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r7, (java.lang.Object) r9)
            if (r7 == 0) goto L_0x0041
            goto L_0x0045
        L_0x0041:
            int r6 = r6 + 1
            goto L_0x0029
        L_0x0044:
            r6 = -1
        L_0x0045:
            r2.element = r6
            int r3 = r0.getItemCount()
            int r6 = r2.element
            if (r6 == r8) goto L_0x01bb
            int r6 = r2.element
            id.dana.social.model.FeedModel r7 = r13.getMin
            java.lang.String r9 = "feedModel"
            if (r7 != 0) goto L_0x005a
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r9)
        L_0x005a:
            java.lang.String r7 = r7.setMin
            java.util.List r10 = r0.getMax()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, r4)
            java.util.Iterator r10 = r10.iterator()
            r11 = 0
        L_0x0068:
            boolean r12 = r10.hasNext()
            if (r12 == 0) goto L_0x007e
            java.lang.Object r12 = r10.next()
            id.dana.social.model.ReactionCountModel r12 = (id.dana.social.model.ReactionCountModel) r12
            boolean r12 = r12.getMax()
            if (r12 == 0) goto L_0x007b
            goto L_0x007f
        L_0x007b:
            int r11 = r11 + 1
            goto L_0x0068
        L_0x007e:
            r11 = -1
        L_0x007f:
            java.lang.String r10 = "presenter"
            java.lang.String r12 = ""
            if (r11 == r8) goto L_0x00aa
            if (r11 == r6) goto L_0x00aa
            r0.setMin((int) r11, (kotlin.jvm.functions.Function0<kotlin.Unit>) null)
            o.setLeftButtonFont$getMin r6 = r13.presenter
            if (r6 != 0) goto L_0x0091
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r10)
        L_0x0091:
            java.util.List r8 = r0.getMax()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r4)
            java.lang.Object r4 = kotlin.collections.CollectionsKt.getOrNull(r8, r11)
            id.dana.social.model.ReactionCountModel r4 = (id.dana.social.model.ReactionCountModel) r4
            if (r4 == 0) goto L_0x00a3
            java.lang.String r4 = r4.getMax
            goto L_0x00a4
        L_0x00a3:
            r4 = r1
        L_0x00a4:
            if (r4 != 0) goto L_0x00a7
            r4 = r12
        L_0x00a7:
            r6.getMax(r4, r7)
        L_0x00aa:
            int r4 = r0.getItemCount()
            r6 = 1
            if (r3 <= r4) goto L_0x00b6
            int r3 = r2.element
            int r3 = r3 - r6
            r2.element = r3
        L_0x00b6:
            java.util.List r3 = r0.getMax()
            int r4 = r2.element
            java.lang.Object r3 = r3.get(r4)
            id.dana.social.model.ReactionCountModel r3 = (id.dana.social.model.ReactionCountModel) r3
            boolean r3 = r3.getMax()
            java.util.List r4 = r0.getMax()
            int r7 = r2.element
            java.lang.Object r4 = r4.get(r7)
            id.dana.social.model.ReactionCountModel r4 = (id.dana.social.model.ReactionCountModel) r4
            int r4 = r4.setMax
            if (r3 == 0) goto L_0x010d
            o.setLeftButtonFont$getMin r1 = r13.presenter
            if (r1 != 0) goto L_0x00dd
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r10)
        L_0x00dd:
            java.lang.String r3 = r14.getMax
            if (r3 != 0) goto L_0x00e2
            goto L_0x00e3
        L_0x00e2:
            r12 = r3
        L_0x00e3:
            id.dana.social.model.FeedModel r3 = r13.getMin
            if (r3 != 0) goto L_0x00ea
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r9)
        L_0x00ea:
            java.lang.String r3 = r3.setMin
            r1.getMax(r12, r3)
            if (r4 > r6) goto L_0x0176
            id.dana.social.model.FeedModel r1 = r13.getMin
            if (r1 != 0) goto L_0x00f8
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r9)
        L_0x00f8:
            java.util.List<id.dana.social.model.OwnReactionModel> r1 = r1.toString
            r1.clear()
            id.dana.social.model.FeedModel r1 = r13.getMin
            if (r1 != 0) goto L_0x0104
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r9)
        L_0x0104:
            java.util.List<id.dana.social.model.ReactionCountModel> r1 = r1.FastBitmap$CoordinateSystem
            int r3 = r2.element
            r1.remove(r3)
            goto L_0x0176
        L_0x010d:
            o.setLeftButtonFont$getMin r3 = r13.presenter
            if (r3 != 0) goto L_0x0114
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r10)
        L_0x0114:
            id.dana.social.model.FeedModel r4 = r13.getMin
            if (r4 != 0) goto L_0x011b
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r9)
        L_0x011b:
            java.lang.String r4 = r4.toFloatRange
            if (r4 != 0) goto L_0x0120
            r4 = r12
        L_0x0120:
            java.lang.String r7 = r14.getMin
            r3.getMin(r4, r7)
            r3 = r13
            id.dana.social.view.ReactionSectionView r3 = (id.dana.social.view.ReactionSectionView) r3
            java.util.List<o.access$2402> r3 = r3.setMax
            if (r3 == 0) goto L_0x0176
            java.util.List<o.access$2402> r3 = r13.setMax
            if (r3 != 0) goto L_0x0135
            java.lang.String r4 = "reactions"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r4)
        L_0x0135:
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.Iterator r3 = r3.iterator()
        L_0x013b:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0153
            java.lang.Object r4 = r3.next()
            r7 = r4
            o.access$2402 r7 = (o.access$2402) r7
            java.lang.String r7 = r7.setMin
            java.lang.String r8 = r14.getMin
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r7, (java.lang.Object) r8)
            if (r7 == 0) goto L_0x013b
            goto L_0x0154
        L_0x0153:
            r4 = r1
        L_0x0154:
            o.access$2402 r4 = (o.access$2402) r4
            o.AUHorizontalListView$SelectionNotifier r3 = r13.friendshipAnalyticTracker
            if (r3 != 0) goto L_0x015f
            java.lang.String r7 = "friendshipAnalyticTracker"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r7)
        L_0x015f:
            id.dana.social.model.FeedModel r7 = r13.getMin
            if (r7 != 0) goto L_0x0166
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r9)
        L_0x0166:
            java.lang.String r7 = r7.toIntRange
            if (r7 != 0) goto L_0x016b
            r7 = r12
        L_0x016b:
            if (r4 == 0) goto L_0x016f
            java.lang.String r1 = r4.getMax
        L_0x016f:
            if (r1 != 0) goto L_0x0172
            goto L_0x0173
        L_0x0172:
            r12 = r1
        L_0x0173:
            r3.getMin(r7, r12)
        L_0x0176:
            int r1 = r2.element
            id.dana.social.view.ReactionSectionView$IsOverlapping r3 = new id.dana.social.view.ReactionSectionView$IsOverlapping
            r3.<init>(r0, r2, r13, r14)
            kotlin.jvm.functions.Function0 r3 = (kotlin.jvm.functions.Function0) r3
            r0.setMin((int) r1, (kotlin.jvm.functions.Function0<kotlin.Unit>) r3)
            id.dana.social.model.FeedModel r14 = r13.getMin
            if (r14 != 0) goto L_0x0189
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r9)
        L_0x0189:
            java.util.List<id.dana.social.model.ReactionCountModel> r14 = r14.FastBitmap$CoordinateSystem
            java.util.Collection r14 = (java.util.Collection) r14
            boolean r14 = r14.isEmpty()
            r14 = r14 ^ r6
            if (r14 != 0) goto L_0x01a2
            id.dana.social.model.FeedModel r14 = r13.getMin
            if (r14 != 0) goto L_0x019b
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r9)
        L_0x019b:
            int r14 = r14.toDoubleRange
            if (r14 <= 0) goto L_0x01a0
            goto L_0x01a2
        L_0x01a0:
            r14 = 0
            goto L_0x01a3
        L_0x01a2:
            r14 = 1
        L_0x01a3:
            r13.setMin(r14)
            id.dana.social.model.FeedModel r14 = r13.getMin
            if (r14 != 0) goto L_0x01ad
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r9)
        L_0x01ad:
            r13.setMax((id.dana.social.model.FeedModel) r14)
            int r14 = r0.getItemCount()
            if (r14 <= 0) goto L_0x01b7
            r5 = 1
        L_0x01b7:
            r13.setMax((boolean) r5)
            return
        L_0x01bb:
            java.lang.String r13 = "ReactionSectionView"
            java.lang.String r14 = "Reaction item not found on RV Adapter"
            o.updateActionSheetContent.d(r13, r14)
        L_0x01c2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: id.dana.social.view.ReactionSectionView.access$toggleReaction(id.dana.social.view.ReactionSectionView, id.dana.social.model.ReactionCountModel):void");
    }

    public static final /* synthetic */ void access$onReactionAdded(ReactionSectionView reactionSectionView, access$2302 access_2302) {
        RecyclerView recyclerView = (RecyclerView) reactionSectionView._$_findCachedViewById(resetInternal.setMax.getSupportImageTintList);
        if (recyclerView != null && (recyclerView.getAdapter() instanceof SocketManifest)) {
            RecyclerView.Adapter adapter = recyclerView.getAdapter();
            if (adapter != null) {
                SocketManifest socketManifest = (SocketManifest) adapter;
                FeedModel feedModel = reactionSectionView.getMin;
                if (feedModel == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("feedModel");
                }
                reactionSectionView.getMin(socketManifest, feedModel.setMin);
                ReactionCountModel reactionCountModel = new ReactionCountModel(access_2302.setMin);
                FeedModel feedModel2 = reactionSectionView.getMin;
                if (feedModel2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("feedModel");
                }
                boolean z = false;
                if (getMin(feedModel2.FastBitmap$CoordinateSystem, reactionCountModel)) {
                    reactionSectionView.getMax(socketManifest);
                } else {
                    socketManifest.setMin(reactionCountModel);
                    recyclerView.smoothScrollToPosition(0);
                    FeedModel feedModel3 = reactionSectionView.getMin;
                    if (feedModel3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("feedModel");
                    }
                    feedModel3.FastBitmap$CoordinateSystem.add(0, reactionCountModel);
                    if (socketManifest.getItemCount() > reactionSectionView.getMax) {
                        reactionSectionView.getMax(socketManifest);
                        FeedModel feedModel4 = reactionSectionView.getMin;
                        if (feedModel4 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("feedModel");
                        }
                        reactionSectionView.length(getMax(feedModel4, reactionSectionView.getMax));
                    }
                }
                if (socketManifest.getItemCount() > 0) {
                    z = true;
                }
                reactionSectionView.setMin(z);
                FeedModel feedModel5 = reactionSectionView.getMin;
                if (feedModel5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("feedModel");
                }
                reactionSectionView.setMax(feedModel5);
                FeedModel feedModel6 = reactionSectionView.getMin;
                if (feedModel6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("feedModel");
                }
                reactionSectionView.setMax(!feedModel6.FastBitmap$CoordinateSystem.isEmpty());
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type id.dana.social.adapter.FeedReactionAdapter");
        }
    }
}
