package id.dana.social.view.fragment;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import id.dana.DanaApplication;
import id.dana.R;
import id.dana.base.BaseActivity;
import id.dana.richview.LogoProgressView;
import id.dana.social.di.module.ActivityReactionsModule;
import id.dana.social.model.ReactionCountModel;
import java.util.HashMap;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.JvmDefault;
import kotlin.jvm.internal.Intrinsics;
import o.AUPopSupportPreemption;
import o.AUSegment;
import o.FtsOptions$Order;
import o.initAmcs;
import o.onDelete;
import o.recycleOnMeasure;
import o.resetInternal;
import o.setBuildNumber;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\b\u0010\u0010\u001a\u00020\u0011H\u0014J\b\u0010\u0012\u001a\u00020\u0013H\u0014J\b\u0010\u0014\u001a\u00020\u0013H\u0002J\b\u0010\u0015\u001a\u00020\u0013H\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0002J\b\u0010\u0018\u001a\u00020\u0013H\u0002J\u000e\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u0017J\b\u0010\u001b\u001a\u00020\u0013H\u0002J\b\u0010\u001c\u001a\u00020\u0013H\u0002J\b\u0010\u001d\u001a\u00020\u0013H\u0002J\b\u0010\u001e\u001a\u00020\u0013H\u0002J\u0018\u0010\u001f\u001a\u00020\u00132\u000e\u0010 \u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010!H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX.¢\u0006\u0002\n\u0000R\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0006\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lid/dana/social/view/fragment/ActivityReactionsListFragment;", "Lid/dana/base/BaseFragment;", "activityId", "", "reactionCountModel", "Lid/dana/social/model/ReactionCountModel;", "name", "(Ljava/lang/String;Lid/dana/social/model/ReactionCountModel;Ljava/lang/String;)V", "activityReactionsAdapter", "Lid/dana/social/adapter/ActivityReactionsAdapter;", "activityReactionsPresenter", "Lid/dana/social/contract/ActivityReactionsContract$Presenter;", "getActivityReactionsPresenter", "()Lid/dana/social/contract/ActivityReactionsContract$Presenter;", "setActivityReactionsPresenter", "(Lid/dana/social/contract/ActivityReactionsContract$Presenter;)V", "getLayout", "", "init", "", "initComponent", "initScrollListener", "isLastItemVisible", "", "setReactionName", "setRecyclerScrollEnabled", "recyclerScrollEnabled", "setupAdapter", "setupRecyclerView", "startLoading", "stopAnimation", "updateAdapterItems", "users", "", "Lid/dana/social/model/ActivityReactionsUserModel;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class ActivityReactionsListFragment extends FtsOptions$Order {
    private final String IsOverlapping;
    @Inject
    public AUSegment.TabSwitchListener.getMin activityReactionsPresenter;
    /* access modifiers changed from: private */
    public final ReactionCountModel getMin;
    private HashMap isInside;
    private initAmcs setMax;
    /* access modifiers changed from: private */
    public final String setMin;

    public final int setMin() {
        return R.layout.view_activity_reactions_list;
    }

    public final View setMin(int i) {
        if (this.isInside == null) {
            this.isInside = new HashMap();
        }
        View view = (View) this.isInside.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.isInside.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public ActivityReactionsListFragment(@NotNull String str, @NotNull ReactionCountModel reactionCountModel, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, setBuildNumber.EXTEND_INFO_ACTIVITY_ID);
        Intrinsics.checkNotNullParameter(reactionCountModel, "reactionCountModel");
        Intrinsics.checkNotNullParameter(str2, "name");
        this.setMin = str;
        this.getMin = reactionCountModel;
        this.IsOverlapping = str2;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016¨\u0006\t"}, d2 = {"id/dana/social/view/fragment/ActivityReactionsListFragment$initScrollListener$1", "Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;", "onScrolled", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "dx", "", "dy", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class length extends RecyclerView.toIntRange {
        final /* synthetic */ ActivityReactionsListFragment length;

        length(ActivityReactionsListFragment activityReactionsListFragment) {
            this.length = activityReactionsListFragment;
        }

        public final void onScrolled(@NotNull RecyclerView recyclerView, int i, int i2) {
            Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
            super.onScrolled(recyclerView, i, i2);
            if (this.length.getMax()) {
                AUSegment.TabSwitchListener.getMin getmin = this.length.activityReactionsPresenter;
                if (getmin == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("activityReactionsPresenter");
                }
                getmin.getMax(this.length.setMin, this.length.getMin.getMin);
            }
        }
    }

    /* access modifiers changed from: private */
    public final boolean getMax() {
        RecyclerView recyclerView = (RecyclerView) setMin(resetInternal.setMax.getSupportBackgroundTintMode);
        RecyclerView.IsOverlapping layoutManager = recyclerView != null ? recyclerView.getLayoutManager() : null;
        if (layoutManager != null) {
            int findLastCompletelyVisibleItemPosition = ((LinearLayoutManager) layoutManager).findLastCompletelyVisibleItemPosition();
            AUSegment.TabSwitchListener.getMin getmin = this.activityReactionsPresenter;
            if (getmin == null) {
                Intrinsics.throwUninitializedPropertyAccessException("activityReactionsPresenter");
            }
            return findLastCompletelyVisibleItemPosition == getmin.getMin();
        }
        throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005H\u0016J\b\u0010\u0007\u001a\u00020\u0003H\u0016¨\u0006\b"}, d2 = {"id/dana/social/view/fragment/ActivityReactionsListFragment$initComponent$1", "Lid/dana/social/contract/ActivityReactionsContract$View;", "onGetActivityReactions", "", "users", "", "Lid/dana/social/model/ActivityReactionsUserModel;", "onGetMyActivityReactionInfo", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMin implements AUSegment.TabSwitchListener.getMax {
        final /* synthetic */ ActivityReactionsListFragment setMax;

        @JvmDefault
        public final void dismissProgress() {
        }

        @JvmDefault
        public final void onError(@Nullable String str) {
        }

        @JvmDefault
        public final void showProgress() {
        }

        getMin(ActivityReactionsListFragment activityReactionsListFragment) {
            this.setMax = activityReactionsListFragment;
        }

        public final void getMax() {
            AUSegment.TabSwitchListener.getMin getmin = this.setMax.activityReactionsPresenter;
            if (getmin == null) {
                Intrinsics.throwUninitializedPropertyAccessException("activityReactionsPresenter");
            }
            getmin.setMin(this.setMax.setMin, this.setMax.getMin.getMin, false);
        }

        public final void setMin(@Nullable List<recycleOnMeasure> list) {
            ActivityReactionsListFragment.setMax(this.setMax);
            ActivityReactionsListFragment.getMin(this.setMax, list);
        }
    }

    public final void setMax() {
        BaseActivity baseActivity = this.getMax;
        Intrinsics.checkNotNullExpressionValue(baseActivity, "baseActivity");
        DanaApplication danaApplication = baseActivity.getDanaApplication();
        Intrinsics.checkNotNullExpressionValue(danaApplication, "baseActivity.danaApplication");
        AUPopSupportPreemption socialCommonComponent = danaApplication.getSocialCommonComponent();
        if (socialCommonComponent != null) {
            socialCommonComponent.getMax(new ActivityReactionsModule(new getMin(this))).getMin(this);
        }
        onDelete.getMin[] getminArr = new onDelete.getMin[1];
        AUSegment.TabSwitchListener.getMin getmin = this.activityReactionsPresenter;
        if (getmin == null) {
            Intrinsics.throwUninitializedPropertyAccessException("activityReactionsPresenter");
        }
        getminArr[0] = getmin;
        getMin(getminArr);
        ((LogoProgressView) setMin(resetInternal.setMax.getParentMenu)).startRefresh();
        this.setMax = new initAmcs();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(), 1, false);
        RecyclerView recyclerView = (RecyclerView) setMin(resetInternal.setMax.getSupportBackgroundTintMode);
        if (recyclerView != null) {
            recyclerView.setNestedScrollingEnabled(true);
            recyclerView.setLayoutManager(linearLayoutManager);
            initAmcs initamcs = this.setMax;
            if (initamcs == null) {
                Intrinsics.throwUninitializedPropertyAccessException("activityReactionsAdapter");
            }
            recyclerView.setAdapter(initamcs);
        }
        ((RecyclerView) setMin(resetInternal.setMax.getSupportBackgroundTintMode)).addOnScrollListener(new length(this));
        TextView textView = (TextView) setMin(resetInternal.setMax.getSubtitleTextView);
        if (textView != null) {
            String str = this.IsOverlapping;
            if (str != null) {
                String upperCase = str.toUpperCase();
                Intrinsics.checkNotNullExpressionValue(upperCase, "(this as java.lang.String).toUpperCase()");
                textView.setText(upperCase);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
        }
        AUSegment.TabSwitchListener.getMin getmin2 = this.activityReactionsPresenter;
        if (getmin2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("activityReactionsPresenter");
        }
        getmin2.setMin(this.getMin.getMax());
        AUSegment.TabSwitchListener.getMin getmin3 = this.activityReactionsPresenter;
        if (getmin3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("activityReactionsPresenter");
        }
        getmin3.length();
    }

    public static final /* synthetic */ void setMax(ActivityReactionsListFragment activityReactionsListFragment) {
        ((LogoProgressView) activityReactionsListFragment.setMin(resetInternal.setMax.getParentMenu)).stopRefresh();
        LogoProgressView logoProgressView = (LogoProgressView) activityReactionsListFragment.setMin(resetInternal.setMax.getParentMenu);
        Intrinsics.checkNotNullExpressionValue(logoProgressView, "lpv_activity_reactions");
        logoProgressView.setVisibility(8);
        RecyclerView recyclerView = (RecyclerView) activityReactionsListFragment.setMin(resetInternal.setMax.getSupportBackgroundTintMode);
        Intrinsics.checkNotNullExpressionValue(recyclerView, "rv_activity_reactions");
        recyclerView.setVisibility(0);
    }

    public static final /* synthetic */ void getMin(ActivityReactionsListFragment activityReactionsListFragment, List list) {
        initAmcs initamcs = activityReactionsListFragment.setMax;
        if (initamcs == null) {
            Intrinsics.throwUninitializedPropertyAccessException("activityReactionsAdapter");
        }
        initamcs.length(list);
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        HashMap hashMap = this.isInside;
        if (hashMap != null) {
            hashMap.clear();
        }
    }
}
