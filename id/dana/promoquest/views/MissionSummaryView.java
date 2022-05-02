package id.dana.promoquest.views;

import android.annotation.TargetApi;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.OnClick;
import com.ap.zoloz.hummer.biz.HummerConstants;
import id.dana.R;
import id.dana.base.BaseRichView;
import id.dana.di.modules.MissionSummaryModule;
import id.dana.promoquest.activity.MissionListActivity;
import id.dana.promoquest.model.MissionModel;
import id.dana.tracker.TrackerKey;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmDefault;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AppxNgResourcePackage;
import o.PrepareException;
import o.getBackgroundExecutor;
import o.loadLocalImage;
import o.onDelete;
import o.onItemsChanged;
import o.resetInternal;
import o.restorePresenterStates;
import o.stopIgnoring;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B%\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bB)\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0002\u0010\nJ\u0006\u0010\u0013\u001a\u00020\u0014J\b\u0010\u0015\u001a\u00020\u0007H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0002J\b\u0010\u0018\u001a\u00020\u0014H\u0002J\u0012\u0010\u0019\u001a\u00020\u00142\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u0014H\u0007J\b\u0010\u001d\u001a\u00020\u0014H\u0016J\b\u0010\u001e\u001a\u00020\u0014H\u0002J\u0010\u0010\u001f\u001a\u00020\u00142\u0006\u0010 \u001a\u00020!H\u0002J\u0006\u0010\"\u001a\u00020\u0014J\u0016\u0010#\u001a\u00020\u00142\f\u0010$\u001a\b\u0012\u0004\u0012\u00020&0%H\u0002J\u0010\u0010'\u001a\u00020\u00142\u0006\u0010(\u001a\u00020&H\u0002R\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0012X.¢\u0006\u0002\n\u0000¨\u0006)"}, d2 = {"Lid/dana/promoquest/views/MissionSummaryView;", "Lid/dana/base/BaseRichView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "missionSummaryPresenter", "Lid/dana/contract/promoquest/quest/MissionSummaryContract$Presenter;", "getMissionSummaryPresenter", "()Lid/dana/contract/promoquest/quest/MissionSummaryContract$Presenter;", "setMissionSummaryPresenter", "(Lid/dana/contract/promoquest/quest/MissionSummaryContract$Presenter;)V", "receiver", "Landroid/content/BroadcastReceiver;", "checkPromoQuest", "", "getLayout", "getSummaryModule", "Lid/dana/di/modules/MissionSummaryModule;", "initAdapter", "injectComponent", "applicationComponent", "Lid/dana/di/component/ApplicationComponent;", "onViewAllClicked", "setup", "setupReceiver", "showPromoQuestFeature", "show", "", "unregisterReceiver", "updateData", "missionSummaryModels", "", "Lid/dana/promoquest/model/MissionModel;", "updateMission", "newMission", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class MissionSummaryView extends BaseRichView {
    private HashMap getMax;
    private BroadcastReceiver length;
    @Inject
    public getBackgroundExecutor.setMin missionSummaryPresenter;

    @JvmOverloads
    public MissionSummaryView(@NotNull Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
    }

    @JvmOverloads
    public MissionSummaryView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
    }

    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.getMax;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public final View _$_findCachedViewById(int i) {
        if (this.getMax == null) {
            this.getMax = new HashMap();
        }
        View view = (View) this.getMax.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.getMax.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final int getLayout() {
        return R.layout.view_promo_quest;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MissionSummaryView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public MissionSummaryView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @TargetApi(21)
    public MissionSummaryView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
    }

    @NotNull
    public final getBackgroundExecutor.setMin getMissionSummaryPresenter() {
        getBackgroundExecutor.setMin setmin = this.missionSummaryPresenter;
        if (setmin == null) {
            Intrinsics.throwUninitializedPropertyAccessException("missionSummaryPresenter");
        }
        return setmin;
    }

    public final void setMissionSummaryPresenter(@NotNull getBackgroundExecutor.setMin setmin) {
        Intrinsics.checkNotNullParameter(setmin, "<set-?>");
        this.missionSummaryPresenter = setmin;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016J\u001e\u0010\u0007\u001a\u00020\u00032\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\u0005H\u0016¨\u0006\f"}, d2 = {"id/dana/promoquest/views/MissionSummaryView$getSummaryModule$1", "Lid/dana/contract/promoquest/quest/MissionSummaryContract$View;", "onCheckPromoQuestFeature", "", "promoQuestFeatureEnable", "", "onFailedGetMissionSummaries", "onSuccessGetMissionSummaries", "missionSummaryModels", "", "Lid/dana/promoquest/model/MissionModel;", "referralQuestExists", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMin implements getBackgroundExecutor.length {
        final /* synthetic */ MissionSummaryView getMin;

        @JvmDefault
        public final void dismissProgress() {
        }

        @JvmDefault
        public final void onError(@Nullable String str) {
        }

        @JvmDefault
        public final void showProgress() {
        }

        setMin(MissionSummaryView missionSummaryView) {
            this.getMin = missionSummaryView;
        }

        public final void getMax(@NotNull List<MissionModel> list, boolean z) {
            Intrinsics.checkNotNullParameter(list, "missionSummaryModels");
            MissionSummaryView.access$showPromoQuestFeature(this.getMin, true);
            MissionSummaryView.access$updateData(this.getMin, list);
        }

        public final void getMax() {
            MissionSummaryView.access$showPromoQuestFeature(this.getMin, false);
        }

        public final void setMax(boolean z) {
            if (z) {
                this.getMin.getMissionSummaryPresenter().length();
            } else {
                MissionSummaryView.access$showPromoQuestFeature(this.getMin, false);
            }
        }
    }

    public final void checkPromoQuest() {
        getBackgroundExecutor.setMin setmin = this.missionSummaryPresenter;
        if (setmin == null) {
            Intrinsics.throwUninitializedPropertyAccessException("missionSummaryPresenter");
        }
        setmin.setMin();
    }

    public final void unregisterReceiver() {
        restorePresenterStates length2 = restorePresenterStates.length(getContext());
        BroadcastReceiver broadcastReceiver = this.length;
        if (broadcastReceiver == null) {
            Intrinsics.throwUninitializedPropertyAccessException("receiver");
        }
        length2.setMax(broadcastReceiver);
    }

    @OnClick({2131362158})
    public final void onViewAllClicked() {
        Intent intent = new Intent(getBaseActivity(), MissionListActivity.class);
        intent.putExtra("source", TrackerKey.SourceType.PROMO_QUEST_AT_HOME);
        getContext().startActivity(intent);
    }

    public final void setup() {
        new onItemsChanged().setMax((RecyclerView) _$_findCachedViewById(resetInternal.setMax.setButtonDrawable));
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(resetInternal.setMax.setButtonDrawable);
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 0, false));
        recyclerView.setClipToPadding(false);
        recyclerView.setAdapter(new loadLocalImage());
        checkPromoQuest();
        this.length = new MissionSummaryView$setupReceiver$1(this);
        restorePresenterStates length2 = restorePresenterStates.length(getContext());
        BroadcastReceiver broadcastReceiver = this.length;
        if (broadcastReceiver == null) {
            Intrinsics.throwUninitializedPropertyAccessException("receiver");
        }
        length2.setMax(broadcastReceiver, new IntentFilter("PromoQuest.RECEIVE_MISSION"));
    }

    public final void injectComponent(@Nullable PrepareException.AnonymousClass1 r4) {
        AppxNgResourcePackage.length length2 = new AppxNgResourcePackage.length((byte) 0);
        if (r4 != null) {
            length2.length = r4;
            length2.setMin = new MissionSummaryModule(new setMin(this));
            stopIgnoring.setMin(length2.setMin, MissionSummaryModule.class);
            stopIgnoring.setMin(length2.length, PrepareException.AnonymousClass1.class);
            new AppxNgResourcePackage(length2.setMin, length2.length, (byte) 0).getMax(this);
            onDelete.getMin[] getminArr = new onDelete.getMin[1];
            getBackgroundExecutor.setMin setmin = this.missionSummaryPresenter;
            if (setmin == null) {
                Intrinsics.throwUninitializedPropertyAccessException("missionSummaryPresenter");
            }
            getminArr[0] = setmin;
            registerPresenter(getminArr);
            return;
        }
        throw null;
    }

    public static final /* synthetic */ void access$updateMission(MissionSummaryView missionSummaryView, MissionModel missionModel) {
        List max;
        RecyclerView recyclerView = (RecyclerView) missionSummaryView._$_findCachedViewById(resetInternal.setMax.setButtonDrawable);
        Integer num = null;
        RecyclerView.Adapter adapter = recyclerView != null ? recyclerView.getAdapter() : null;
        if (!(adapter instanceof loadLocalImage)) {
            adapter = null;
        }
        loadLocalImage loadlocalimage = (loadLocalImage) adapter;
        if (loadlocalimage != null && (max = loadlocalimage.getMax()) != null) {
            Iterator it = max.iterator();
            boolean z = false;
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                } else if (Intrinsics.areEqual((Object) ((MissionModel) it.next()).setMax, (Object) missionModel.setMax)) {
                    break;
                } else {
                    i++;
                }
            }
            Integer valueOf = Integer.valueOf(i);
            if (valueOf.intValue() >= 0) {
                z = true;
            }
            if (z) {
                num = valueOf;
            }
            if (num != null) {
                int intValue = num.intValue();
                List max2 = loadlocalimage.getMax();
                Intrinsics.checkNotNullExpressionValue(max2, "adapter.items");
                List mutableList = CollectionsKt.toMutableList(max2);
                mutableList.set(intValue, missionModel);
                loadlocalimage.getMin(mutableList);
                loadlocalimage.notifyItemInserted(intValue);
            }
        }
    }

    public static final /* synthetic */ void access$showPromoQuestFeature(MissionSummaryView missionSummaryView, boolean z) {
        ConstraintLayout constraintLayout = (ConstraintLayout) missionSummaryView._$_findCachedViewById(resetInternal.setMax.setExpandedActionViewsExclusive);
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "rl_promo_container");
        constraintLayout.setVisibility(z ? 0 : 8);
    }

    public static final /* synthetic */ void access$updateData(MissionSummaryView missionSummaryView, List list) {
        RecyclerView recyclerView = (RecyclerView) missionSummaryView._$_findCachedViewById(resetInternal.setMax.setButtonDrawable);
        RecyclerView.Adapter adapter = null;
        RecyclerView.Adapter adapter2 = recyclerView != null ? recyclerView.getAdapter() : null;
        if (adapter2 instanceof loadLocalImage) {
            adapter = adapter2;
        }
        loadLocalImage loadlocalimage = (loadLocalImage) adapter;
        if (loadlocalimage != null) {
            loadlocalimage.getMin(list);
        }
    }
}
