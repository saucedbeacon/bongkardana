package id.dana.promoquest.fragment;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import butterknife.OnClick;
import id.dana.R;
import id.dana.component.buttoncomponent.DanaButtonPrimaryView;
import id.dana.promoquest.activity.MissionListActivity;
import id.dana.promoquest.model.MissionModel;
import java.lang.annotation.RetentionPolicy;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.Retention;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import o.FtsOptions$Order;
import o.IntRange;
import o.getScrimColor;
import o.onDetachedFromLayoutParams;
import o.resetInternal;
import o.restorePresenterStates;
import o.retrieveImageBytesFromFile;
import o.setShadowResourceRight;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\u0018\u0000 \"2\u00020\u0001:\u0002\"#B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0004H\u0002J\u0006\u0010\r\u001a\u00020\u000bJ\u0006\u0010\u000e\u001a\u00020\u000bJ\b\u0010\u000f\u001a\u00020\u000bH\u0007J\b\u0010\u0010\u001a\u00020\u0011H\u0014J\u0010\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\b\u0010\u0015\u001a\u00020\u000bH\u0014J\b\u0010\u0016\u001a\u00020\u000bH\u0016J\u0018\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u00042\b\b\u0002\u0010\u0019\u001a\u00020\u0011J\b\u0010\u001a\u001a\u00020\u000bH\u0002J\u0006\u0010\u001b\u001a\u00020\u000bJ\u0010\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J\u0014\u0010\u001f\u001a\u00020\u000b2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001e0!R\u0011\u0010\u0003\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X.¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Lid/dana/promoquest/fragment/MissionListFragment;", "Lid/dana/base/BaseFragment;", "()V", "isMissionsEmpty", "", "()Z", "receiver", "Landroid/content/BroadcastReceiver;", "skeleton", "Lcom/ethanhua/skeleton/SkeletonScreen;", "disableSwipeRefresh", "", "enable", "dismissProgress", "displayErrorPage", "fetchMissions", "getLayout", "", "handleMissionUpdate", "intent", "Landroid/content/Intent;", "init", "onDestroyView", "setMissionWarningVisibility", "visible", "warningType", "setupReceiver", "showProgress", "updateMission", "newMission", "Lid/dana/promoquest/model/MissionModel;", "updateMissions", "missionModels", "", "Companion", "MissionWarningType", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class MissionListFragment extends FtsOptions$Order {
    @NotNull
    public static final setMin getMin = new setMin((byte) 0);
    private BroadcastReceiver setMax;
    private onDetachedFromLayoutParams setMin;
    private HashMap toIntRange;

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
        return R.layout.fragment_promo_quest_mission_list;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "onRefresh", "id/dana/promoquest/fragment/MissionListFragment$init$2$1"}, k = 3, mv = {1, 4, 2})
    static final class getMin implements SwipeRefreshLayout.setMin {
        final /* synthetic */ MissionListFragment setMax;

        getMin(MissionListFragment missionListFragment) {
            this.setMax = missionListFragment;
        }

        public final void getMax() {
            this.setMax.fetchMissions();
            new Handler().postDelayed(new Runnable(this) {
                final /* synthetic */ getMin setMax;

                {
                    this.setMax = r1;
                }

                public final void run() {
                    SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) this.setMax.setMax.getMin(resetInternal.setMax.saveToolbarHierarchyState);
                    if (swipeRefreshLayout != null && swipeRefreshLayout.isRefreshing()) {
                        SwipeRefreshLayout swipeRefreshLayout2 = (SwipeRefreshLayout) this.setMax.setMax.getMin(resetInternal.setMax.saveToolbarHierarchyState);
                        Intrinsics.checkNotNullExpressionValue(swipeRefreshLayout2, "refresh_layout");
                        swipeRefreshLayout2.setRefreshing(false);
                    }
                }
            }, 1000);
        }
    }

    public final void onDestroyView() {
        Context context = getContext();
        Intrinsics.checkNotNull(context);
        restorePresenterStates length = restorePresenterStates.length(context);
        BroadcastReceiver broadcastReceiver = this.setMax;
        if (broadcastReceiver == null) {
            Intrinsics.throwUninitializedPropertyAccessException("receiver");
        }
        length.setMax(broadcastReceiver);
        super.onDestroyView();
        HashMap hashMap = this.toIntRange;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @OnClick({2131362145})
    public final void fetchMissions() {
        FragmentActivity activity = getActivity();
        String str = null;
        if (!(activity instanceof MissionListActivity)) {
            activity = null;
        }
        MissionListActivity missionListActivity = (MissionListActivity) activity;
        if (missionListActivity != null) {
            SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) getMin(resetInternal.setMax.saveToolbarHierarchyState);
            if (swipeRefreshLayout != null) {
                swipeRefreshLayout.setRefreshing(true);
                swipeRefreshLayout.setEnabled(true);
            }
            Bundle arguments = getArguments();
            if (arguments != null) {
                str = arguments.getString("TabAdapter.key");
            }
            missionListActivity.reloadMissions(str);
        }
    }

    public final void length(@NotNull List<MissionModel> list) {
        Intrinsics.checkNotNullParameter(list, "missionModels");
        RecyclerView recyclerView = (RecyclerView) getMin(resetInternal.setMax.setButtonDrawable);
        RecyclerView.Adapter adapter = null;
        RecyclerView.Adapter adapter2 = recyclerView != null ? recyclerView.getAdapter() : null;
        if (adapter2 instanceof retrieveImageBytesFromFile) {
            adapter = adapter2;
        }
        retrieveImageBytesFromFile retrieveimagebytesfromfile = (retrieveImageBytesFromFile) adapter;
        if (retrieveimagebytesfromfile != null) {
            Intrinsics.checkNotNullParameter(list, "<set-?>");
            retrieveimagebytesfromfile.setMax = list;
            retrieveimagebytesfromfile.notifyDataSetChanged();
        }
    }

    public final void getMax() {
        if (this.setMin == null) {
            getScrimColor.getMax getmax = new getScrimColor.getMax((RecyclerView) getMin(resetInternal.setMax.setButtonDrawable));
            RecyclerView recyclerView = (RecyclerView) getMin(resetInternal.setMax.setButtonDrawable);
            Intrinsics.checkNotNullExpressionValue(recyclerView, "rv_mission");
            getmax.length = recyclerView.getAdapter();
            getmax.getMax = R.layout.layout_promo_quest_mission_card_skeleton;
            getmax.IsOverlapping = 1500;
            getmax.setMin = 2;
            getmax.getMin = true;
            getmax.toFloatRange = IntRange.setMax(getmax.setMax.getContext(), R.color.f24782131100433);
            getmax.toIntRange = 0;
            getScrimColor getscrimcolor = new getScrimColor(getmax, (byte) 0);
            getscrimcolor.getMin();
            this.setMin = getscrimcolor;
        }
    }

    public final void equals() {
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) getMin(resetInternal.setMax.saveToolbarHierarchyState);
        if (swipeRefreshLayout != null) {
            swipeRefreshLayout.setRefreshing(false);
        }
        onDetachedFromLayoutParams ondetachedfromlayoutparams = this.setMin;
        if (ondetachedfromlayoutparams != null) {
            ondetachedfromlayoutparams.length();
        }
        this.setMin = null;
    }

    public final boolean values() {
        RecyclerView recyclerView = (RecyclerView) getMin(resetInternal.setMax.setButtonDrawable);
        RecyclerView.Adapter adapter = null;
        RecyclerView.Adapter adapter2 = recyclerView != null ? recyclerView.getAdapter() : null;
        if (adapter2 instanceof retrieveImageBytesFromFile) {
            adapter = adapter2;
        }
        retrieveImageBytesFromFile retrieveimagebytesfromfile = (retrieveImageBytesFromFile) adapter;
        return retrieveimagebytesfromfile == null || retrieveimagebytesfromfile.setMax.isEmpty();
    }

    public final void getMin(boolean z, int i) {
        if (!z) {
            RelativeLayout relativeLayout = (RelativeLayout) getMin(resetInternal.setMax.createNewMenuItem);
            if (relativeLayout != null) {
                relativeLayout.setVisibility(4);
            }
            RecyclerView recyclerView = (RecyclerView) getMin(resetInternal.setMax.setButtonDrawable);
            if (recyclerView != null) {
                recyclerView.setVisibility(0);
                return;
            }
            return;
        }
        if (i == 0) {
            ImageView imageView = (ImageView) getMin(resetInternal.setMax.setAlpha);
            if (imageView != null) {
                imageView.setImageResource(R.drawable.ic_problem);
            }
            TextView textView = (TextView) getMin(resetInternal.setMax.ShareTarget$EncodingType);
            if (textView != null) {
                textView.setText(getString(R.string.promo_quest_error_mission_title));
            }
            TextView textView2 = (TextView) getMin(resetInternal.setMax.tv_warning_note);
            if (textView2 != null) {
                textView2.setText(getString(R.string.promo_quest_error_mission_description));
            }
            DanaButtonPrimaryView danaButtonPrimaryView = (DanaButtonPrimaryView) getMin(resetInternal.setMax.MediaBrowserCompat$MediaItem$Flags);
            if (danaButtonPrimaryView != null) {
                danaButtonPrimaryView.setVisibility(0);
            }
        } else if (i == 1) {
            ImageView imageView2 = (ImageView) getMin(resetInternal.setMax.setAlpha);
            if (imageView2 != null) {
                imageView2.setImageResource(R.drawable.ic_new_quest);
            }
            TextView textView3 = (TextView) getMin(resetInternal.setMax.ShareTarget$EncodingType);
            if (textView3 != null) {
                textView3.setText(getString(R.string.promo_quest_no_active_mission_title));
            }
            TextView textView4 = (TextView) getMin(resetInternal.setMax.tv_warning_note);
            if (textView4 != null) {
                textView4.setText(getString(R.string.promo_quest_no_active_mission_description));
            }
            DanaButtonPrimaryView danaButtonPrimaryView2 = (DanaButtonPrimaryView) getMin(resetInternal.setMax.MediaBrowserCompat$MediaItem$Flags);
            if (danaButtonPrimaryView2 != null) {
                danaButtonPrimaryView2.setVisibility(8);
            }
        } else if (i == 2) {
            ImageView imageView3 = (ImageView) getMin(resetInternal.setMax.setAlpha);
            if (imageView3 != null) {
                imageView3.setImageResource(R.drawable.history);
            }
            TextView textView5 = (TextView) getMin(resetInternal.setMax.ShareTarget$EncodingType);
            if (textView5 != null) {
                textView5.setText(getString(R.string.promo_quest_no_completed_mission_title));
            }
            TextView textView6 = (TextView) getMin(resetInternal.setMax.tv_warning_note);
            if (textView6 != null) {
                textView6.setText(getString(R.string.promo_quest_no_completed_mission_description));
            }
            DanaButtonPrimaryView danaButtonPrimaryView3 = (DanaButtonPrimaryView) getMin(resetInternal.setMax.MediaBrowserCompat$MediaItem$Flags);
            if (danaButtonPrimaryView3 != null) {
                danaButtonPrimaryView3.setVisibility(8);
            }
        }
        RelativeLayout relativeLayout2 = (RelativeLayout) getMin(resetInternal.setMax.createNewMenuItem);
        if (relativeLayout2 != null) {
            relativeLayout2.setVisibility(0);
        }
        RecyclerView recyclerView2 = (RecyclerView) getMin(resetInternal.setMax.setButtonDrawable);
        if (recyclerView2 != null) {
            recyclerView2.setVisibility(4);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000¨\u0006\u0003"}, d2 = {"Lid/dana/promoquest/fragment/MissionListFragment$MissionWarningType;", "", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    @Retention(AnnotationRetention.SOURCE)
    @java.lang.annotation.Retention(RetentionPolicy.SOURCE)
    public @interface MissionWarningType {
        @NotNull
        public static final getMax Companion = getMax.setMax;
        public static final int MISSION_ERROR = 0;
        public static final int NO_ACTIVE_MISSION = 1;
        public static final int NO_PAST_MISSION = 2;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lid/dana/promoquest/fragment/MissionListFragment$MissionWarningType$Companion;", "", "()V", "MISSION_ERROR", "", "NO_ACTIVE_MISSION", "NO_PAST_MISSION", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
        public static final class getMax {
            static final /* synthetic */ getMax setMax = new getMax();

            private getMax() {
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lid/dana/promoquest/fragment/MissionListFragment$Companion;", "", "()V", "REFRESH_LAYOUT_DURATION", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMin {
        private setMin() {
        }

        public /* synthetic */ setMin(byte b) {
            this();
        }
    }

    public final void setMax() {
        this.setMax = new MissionListFragment$setupReceiver$1(this);
        Context context = getContext();
        if (context != null) {
            restorePresenterStates length = restorePresenterStates.length(context);
            BroadcastReceiver broadcastReceiver = this.setMax;
            if (broadcastReceiver == null) {
                Intrinsics.throwUninitializedPropertyAccessException("receiver");
            }
            length.setMax(broadcastReceiver, new IntentFilter("PromoQuest.RECEIVE_MISSION"));
        }
        RecyclerView recyclerView = (RecyclerView) getMin(resetInternal.setMax.setButtonDrawable);
        recyclerView.addItemDecoration(new setShadowResourceRight(recyclerView.getContext(), R.dimen.f26202131165266));
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.setAdapter(new retrieveImageBytesFromFile((byte) 0));
        getMax();
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) getMin(resetInternal.setMax.saveToolbarHierarchyState);
        swipeRefreshLayout.setColorSchemeColors(IntRange.setMax(swipeRefreshLayout.getContext(), R.color.f19022131099797));
        swipeRefreshLayout.setOnRefreshListener(new getMin(this));
    }

    public static final /* synthetic */ void length(MissionListFragment missionListFragment, Intent intent) {
        int i = 0;
        Object obj = null;
        if (intent.getBooleanExtra("PromoQuest.isNeedRefreshWholeList", false)) {
            Object activity = missionListFragment.getActivity();
            if (activity instanceof MissionListActivity) {
                obj = activity;
            }
            MissionListActivity missionListActivity = (MissionListActivity) obj;
            if (missionListActivity != null) {
                missionListActivity.reloadBothMissions();
                return;
            }
            return;
        }
        MissionModel missionModel = (MissionModel) intent.getParcelableExtra("PromoQuest.mission");
        if (missionModel != null) {
            Intrinsics.checkNotNullExpressionValue(missionModel, "intent.getParcelableExtr….MISSION_EXTRA) ?: return");
            RecyclerView recyclerView = (RecyclerView) missionListFragment.getMin(resetInternal.setMax.setButtonDrawable);
            Object adapter = recyclerView != null ? recyclerView.getAdapter() : null;
            if (adapter instanceof retrieveImageBytesFromFile) {
                obj = adapter;
            }
            retrieveImageBytesFromFile retrieveimagebytesfromfile = (retrieveImageBytesFromFile) obj;
            if (retrieveimagebytesfromfile != null) {
                Iterator<MissionModel> it = retrieveimagebytesfromfile.setMax.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        i = -1;
                        break;
                    } else if (Intrinsics.areEqual((Object) it.next().setMax, (Object) missionModel.setMax)) {
                        break;
                    } else {
                        i++;
                    }
                }
                if (i >= 0) {
                    List<MissionModel> mutableList = CollectionsKt.toMutableList(retrieveimagebytesfromfile.setMax);
                    mutableList.set(i, missionModel);
                    Intrinsics.checkNotNullParameter(mutableList, "<set-?>");
                    retrieveimagebytesfromfile.setMax = mutableList;
                    retrieveimagebytesfromfile.notifyDataSetChanged();
                }
            }
        }
    }
}
