package o;

import android.app.Activity;
import android.content.Intent;
import id.dana.danah5.akulaku.AkuEventParamsKey;
import id.dana.data.foundation.logger.log.DanaLogConstants;
import id.dana.promoquest.activity.MissionDetailActivity;
import id.dana.promoquest.activity.MissionListActivity;
import id.dana.promoquest.model.MissionModel;
import id.dana.tracker.TrackerKey;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010\u0007\u001a\u00020\bJ\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002J&\u0010\u000e\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010J\u000e\u0010\u0012\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lid/dana/contract/deeplink/path/FeaturePromoQuest;", "", "getMissionDetail", "Lid/dana/domain/promoquest/interactor/GetMissionDetail;", "promoQuestMapper", "Lid/dana/promoquest/mapper/PromoQuestMapper;", "(Lid/dana/domain/promoquest/interactor/GetMissionDetail;Lid/dana/promoquest/mapper/PromoQuestMapper;)V", "disposeUseCases", "", "openMissionDetail", "activity", "Landroid/app/Activity;", "missionModel", "Lid/dana/promoquest/model/MissionModel;", "openMissionDetailNorMissionList", "params", "", "", "openMissionList", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class getTransitionValues {
    /* access modifiers changed from: private */
    public final openInBrowser length;
    final queryAppInfo setMin;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "id/dana/contract/deeplink/path/FeaturePromoQuest$openMissionDetailNorMissionList$1$2"}, k = 3, mv = {1, 4, 2})
    static final class length extends Lambda implements Function1<Throwable, Unit> {
        final /* synthetic */ Activity $activity$inlined;
        final /* synthetic */ getTransitionValues this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        length(getTransitionValues gettransitionvalues, Activity activity) {
            super(1);
            this.this$0 = gettransitionvalues;
            this.$activity$inlined = activity;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "it");
            getTransitionValues.length(this.$activity$inlined);
            updateActionSheetContent.e(DanaLogConstants.ExceptionType.MISSION_DETAIL_DEEPLINK_EXCEPTION, th.getMessage());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", "missionDetail", "Lid/dana/domain/promoquest/model/Mission;", "invoke", "id/dana/contract/deeplink/path/FeaturePromoQuest$openMissionDetailNorMissionList$1$1"}, k = 3, mv = {1, 4, 2})
    static final class setMin extends Lambda implements Function1<queryAppAppInfos, Unit> {
        final /* synthetic */ Activity $activity$inlined;
        final /* synthetic */ String $this_apply;
        final /* synthetic */ getTransitionValues this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        setMin(String str, getTransitionValues gettransitionvalues, Activity activity) {
            super(1);
            this.$this_apply = str;
            this.this$0 = gettransitionvalues;
            this.$activity$inlined = activity;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((queryAppAppInfos) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@Nullable queryAppAppInfos queryappappinfos) {
            if (queryappappinfos != null) {
                Activity activity = this.$activity$inlined;
                openInBrowser unused = this.this$0.length;
                Intrinsics.checkNotNullParameter(queryappappinfos, "mission");
                getTransitionValues.getMax(activity, openInBrowser.setMax(queryappappinfos));
                if (queryappappinfos != null) {
                    return;
                }
            }
            getTransitionValues.length(this.$activity$inlined);
            updateActionSheetContent.e(DanaLogConstants.ExceptionType.MISSION_DETAIL_DEEPLINK_EXCEPTION, "mission detail null");
            Unit unit = Unit.INSTANCE;
        }
    }

    @Inject
    public getTransitionValues(@NotNull queryAppInfo queryappinfo, @NotNull openInBrowser openinbrowser) {
        Intrinsics.checkNotNullParameter(queryappinfo, "getMissionDetail");
        Intrinsics.checkNotNullParameter(openinbrowser, "promoQuestMapper");
        this.setMin = queryappinfo;
        this.length = openinbrowser;
    }

    public static void length(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, AkuEventParamsKey.KEY_ACTIVITY);
        Intent intent = new Intent(activity, MissionListActivity.class);
        intent.putExtra("source", TrackerKey.SourceType.PROMO_QUEST_DEEPLINK);
        activity.startActivity(intent);
    }

    public static final /* synthetic */ void getMax(Activity activity, MissionModel missionModel) {
        MissionDetailActivity.length length2 = MissionDetailActivity.Companion;
        Intrinsics.checkNotNullParameter(activity, AkuEventParamsKey.KEY_ACTIVITY);
        Intrinsics.checkNotNullParameter(missionModel, "mission");
        activity.startActivity(MissionDetailActivity.length.setMin(activity, missionModel));
    }
}
