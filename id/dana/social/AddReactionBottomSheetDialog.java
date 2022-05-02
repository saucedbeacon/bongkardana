package id.dana.social;

import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.DefaultLoadControl;
import id.dana.DanaApplication;
import id.dana.R;
import id.dana.base.BaseActivity;
import id.dana.social.di.module.ReactionsModule;
import id.dana.social.model.FeedModel;
import java.util.HashMap;
import java.util.List;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o.AUHorizontalListView;
import o.AULoadingView;
import o.AUPopSupportPreemption;
import o.IntRange;
import o.RunningAverageRssiFilter;
import o.access$2302;
import o.access$2402;
import o.getScrimColor;
import o.order;
import o.resetInternal;
import o.setLeftButtonFont;
import o.setShadowResourceRight;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\u0018\u0000 12\u00020\u00012\u00020\u0002:\u00011B\u0005¢\u0006\u0002\u0010\u0003J\n\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0014J\b\u0010\u001f\u001a\u00020 H\u0014J\b\u0010!\u001a\u00020\"H\u0014J\b\u0010#\u001a\u00020$H\u0002J\b\u0010%\u001a\u00020&H\u0014J\b\u0010'\u001a\u00020$H\u0014J\u0010\u0010(\u001a\u00020$2\u0006\u0010)\u001a\u00020*H\u0002J\b\u0010+\u001a\u00020$H\u0016J\u0016\u0010,\u001a\u00020$2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020*0.H\u0016J\b\u0010/\u001a\u00020$H\u0014J\b\u00100\u001a\u00020$H\u0002R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0010\u001a\u00020\u00118\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0016\u001a\u00020\u0017X.¢\u0006\u0002\n\u0000R\u001d\u0010\u0018\u001a\u0004\u0018\u00010\u00198BX\u0002¢\u0006\f\n\u0004\b\u001c\u0010\t\u001a\u0004\b\u001a\u0010\u001b¨\u00062"}, d2 = {"Lid/dana/social/AddReactionBottomSheetDialog;", "Lid/dana/base/BaseBottomSheetDialogFragment;", "Lid/dana/social/contract/reaction/ReactionsContract$View;", "()V", "feedModel", "Lid/dana/social/model/FeedModel;", "getFeedModel", "()Lid/dana/social/model/FeedModel;", "feedModel$delegate", "Lkotlin/Lazy;", "friendshipAnalyticTracker", "Lid/dana/social/tracker/FriendshipAnalyticTracker;", "getFriendshipAnalyticTracker", "()Lid/dana/social/tracker/FriendshipAnalyticTracker;", "setFriendshipAnalyticTracker", "(Lid/dana/social/tracker/FriendshipAnalyticTracker;)V", "presenter", "Lid/dana/social/contract/reaction/ReactionsContract$Presenter;", "getPresenter", "()Lid/dana/social/contract/reaction/ReactionsContract$Presenter;", "setPresenter", "(Lid/dana/social/contract/reaction/ReactionsContract$Presenter;)V", "reactionListAdapter", "Lid/dana/social/adapter/ReactionListAdapter;", "skeletonShimmering", "Lcom/ethanhua/skeleton/RecyclerViewSkeletonScreen;", "getSkeletonShimmering", "()Lcom/ethanhua/skeleton/RecyclerViewSkeletonScreen;", "skeletonShimmering$delegate", "getBottomSheet", "", "getDimAmount", "", "getLayout", "", "inject", "", "isFullDialogHeightRequired", "", "onDismiss", "onReactionClicked", "reactionModel", "Lid/dana/social/model/ReactionModel;", "onReactionsLoadError", "onReactionsLoaded", "reactions", "", "onShow", "setupReactionListView", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class AddReactionBottomSheetDialog extends order implements setLeftButtonFont.setMin {
    @NotNull
    public static final length getMin = new length((byte) 0);
    /* access modifiers changed from: private */
    public static Function1<? super access$2302, Unit> isInside;
    private HashMap equals;
    @Inject
    public AUHorizontalListView.SelectionNotifier friendshipAnalyticTracker;
    private AULoadingView getMax;
    @Inject
    public setLeftButtonFont.getMin presenter;
    private final Lazy toFloatRange = LazyKt.lazy(new getMin(this));
    private final Lazy toIntRange = LazyKt.lazy(new getMax(this));

    public final /* bridge */ /* synthetic */ FrameLayout getMax() {
        return null;
    }

    public final int getMin() {
        return R.layout.bottom_sheet_reaction_list;
    }

    public final void getMin(@NotNull RunningAverageRssiFilter runningAverageRssiFilter) {
        Intrinsics.checkNotNullParameter(runningAverageRssiFilter, "deleteReactionResult");
    }

    public final float length() {
        return 0.5f;
    }

    public final View length(int i) {
        if (this.equals == null) {
            this.equals = new HashMap();
        }
        View view = (View) this.equals.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.equals.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final void length(@NotNull access$2302 access_2302) {
        Intrinsics.checkNotNullParameter(access_2302, "reactionResultModel");
    }

    public final boolean t_() {
        return false;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lid/dana/social/model/ReactionModel;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class setMax extends Lambda implements Function1<access$2402, Unit> {
        final /* synthetic */ AddReactionBottomSheetDialog this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        setMax(AddReactionBottomSheetDialog addReactionBottomSheetDialog) {
            super(1);
            this.this$0 = addReactionBottomSheetDialog;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((access$2402) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull access$2402 access_2402) {
            Intrinsics.checkNotNullParameter(access_2402, "it");
            AddReactionBottomSheetDialog.getMin(this.this$0, access_2402);
        }
    }

    public static final /* synthetic */ AULoadingView getMin(AddReactionBottomSheetDialog addReactionBottomSheetDialog) {
        AULoadingView aULoadingView = addReactionBottomSheetDialog.getMax;
        if (aULoadingView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("reactionListAdapter");
        }
        return aULoadingView;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lid/dana/social/model/FeedModel;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class getMin extends Lambda implements Function0<FeedModel> {
        final /* synthetic */ AddReactionBottomSheetDialog this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        getMin(AddReactionBottomSheetDialog addReactionBottomSheetDialog) {
            super(0);
            this.this$0 = addReactionBottomSheetDialog;
        }

        @Nullable
        public final FeedModel invoke() {
            Bundle arguments = this.this$0.getArguments();
            if (arguments != null) {
                return (FeedModel) arguments.getParcelable("ARG_FEED");
            }
            return null;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ethanhua/skeleton/RecyclerViewSkeletonScreen;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class getMax extends Lambda implements Function0<getScrimColor> {
        final /* synthetic */ AddReactionBottomSheetDialog this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        getMax(AddReactionBottomSheetDialog addReactionBottomSheetDialog) {
            super(0);
            this.this$0 = addReactionBottomSheetDialog;
        }

        @Nullable
        public final getScrimColor invoke() {
            RecyclerView recyclerView = (RecyclerView) this.this$0.length(resetInternal.setMax.AppCompatImageButton);
            if (recyclerView == null) {
                return null;
            }
            getScrimColor.getMax getmax = new getScrimColor.getMax(recyclerView);
            getmax.length = AddReactionBottomSheetDialog.getMin(this.this$0);
            getmax.getMax = R.layout.viewholder_reaction_emoji_skeleton;
            getmax.IsOverlapping = DefaultLoadControl.DEFAULT_BUFFER_FOR_PLAYBACK_MS;
            getmax.setMin = 30;
            getmax.getMin = true;
            getmax.toFloatRange = IntRange.setMax(getmax.setMax.getContext(), R.color.f24782131100433);
            getmax.toIntRange = 20;
            getScrimColor getscrimcolor = new getScrimColor(getmax, (byte) 0);
            getscrimcolor.getMin();
            return getscrimcolor;
        }
    }

    public final void setMin() {
        super.setMin();
        BaseActivity baseActivity = this.setMax;
        Intrinsics.checkNotNullExpressionValue(baseActivity, "baseActivity");
        DanaApplication danaApplication = baseActivity.getDanaApplication();
        Intrinsics.checkNotNullExpressionValue(danaApplication, "baseActivity.danaApplication");
        AUPopSupportPreemption socialCommonComponent = danaApplication.getSocialCommonComponent();
        if (socialCommonComponent != null) {
            socialCommonComponent.setMax(new ReactionsModule(this)).getMax(this);
        }
        this.getMax = new AULoadingView(CollectionsKt.emptyList(), new setMax(this));
        RecyclerView recyclerView = (RecyclerView) length(resetInternal.setMax.AppCompatImageButton);
        if (recyclerView != null) {
            recyclerView.addItemDecoration(new setShadowResourceRight(requireContext(), (int) R.dimen.f26272131165275, 80));
            recyclerView.setLayoutManager(new GridLayoutManager(requireContext(), 6));
            AULoadingView aULoadingView = this.getMax;
            if (aULoadingView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("reactionListAdapter");
            }
            recyclerView.setAdapter(aULoadingView);
        }
        setLeftButtonFont.getMin getmin = this.presenter;
        if (getmin == null) {
            Intrinsics.throwUninitializedPropertyAccessException("presenter");
        }
        getmin.length();
        getScrimColor getscrimcolor = (getScrimColor) this.toIntRange.getValue();
        if (getscrimcolor != null) {
            getscrimcolor.getMin();
        }
    }

    public final void IsOverlapping() {
        super.IsOverlapping();
        dismiss();
    }

    public final void setMax(@NotNull List<access$2402> list) {
        Intrinsics.checkNotNullParameter(list, "reactions");
        AULoadingView aULoadingView = this.getMax;
        if (aULoadingView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("reactionListAdapter");
        }
        aULoadingView.getMin(list);
        getScrimColor getscrimcolor = (getScrimColor) this.toIntRange.getValue();
        if (getscrimcolor != null) {
            getscrimcolor.getMax.setAdapter(getscrimcolor.length);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J3\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112!\u0010\u0012\u001a\u001d\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r0\bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R)\u0010\u0007\u001a\u001d\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r0\bX.¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lid/dana/social/AddReactionBottomSheetDialog$Companion;", "", "()V", "ARG_FEED", "", "EMOJI_GRID_COUNT", "", "onReactedFunction", "Lkotlin/Function1;", "Lid/dana/social/model/ReactionResultModel;", "Lkotlin/ParameterName;", "name", "reactionResModel", "", "newInstance", "Lid/dana/social/AddReactionBottomSheetDialog;", "feedModel", "Lid/dana/social/model/FeedModel;", "onReacted", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class length {
        private length() {
        }

        public /* synthetic */ length(byte b) {
            this();
        }
    }

    public final void equals() {
        getScrimColor getscrimcolor = (getScrimColor) this.toIntRange.getValue();
        if (getscrimcolor != null) {
            getscrimcolor.getMax.setAdapter(getscrimcolor.length);
        }
    }

    public static final /* synthetic */ void getMin(AddReactionBottomSheetDialog addReactionBottomSheetDialog, access$2402 access_2402) {
        FeedModel feedModel = (FeedModel) addReactionBottomSheetDialog.toFloatRange.getValue();
        if (feedModel != null) {
            Function1<? super access$2302, Unit> function1 = isInside;
            if (function1 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("onReactedFunction");
            }
            function1.invoke(new access$2302(feedModel.setMin, access_2402.setMin));
            setLeftButtonFont.getMin getmin = addReactionBottomSheetDialog.presenter;
            if (getmin == null) {
                Intrinsics.throwUninitializedPropertyAccessException("presenter");
            }
            String str = feedModel.toFloatRange;
            String str2 = "";
            if (str == null) {
                str = str2;
            }
            getmin.getMin(str, access_2402.setMin);
            AUHorizontalListView.SelectionNotifier selectionNotifier = addReactionBottomSheetDialog.friendshipAnalyticTracker;
            if (selectionNotifier == null) {
                Intrinsics.throwUninitializedPropertyAccessException("friendshipAnalyticTracker");
            }
            String str3 = feedModel.toIntRange;
            if (str3 != null) {
                str2 = str3;
            }
            selectionNotifier.getMin(str2, access_2402.getMax);
        }
        addReactionBottomSheetDialog.dismissAllowingStateLoss();
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        HashMap hashMap = this.equals;
        if (hashMap != null) {
            hashMap.clear();
        }
    }
}
