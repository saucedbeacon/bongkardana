package o;

import id.dana.data.foundation.logger.log.DanaLogConstants;
import id.dana.promoquest.activity.MissionListActivity;
import id.dana.promoquest.model.MissionModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o.getBackgroundExecutor;
import o.saveAppInfo;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\b\u0010\u0002\u001a\u00020\u000bH\u0016J\u0014\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fJ\u0016\u0010\u0011\u001a\u00020\u000b2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0002J\b\u0010\u0013\u001a\u00020\u000bH\u0016J\b\u0010\u0014\u001a\u00020\u000bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lid/dana/contract/promoquest/quest/MissionSummaryPresenter;", "Lid/dana/contract/promoquest/quest/MissionSummaryContract$Presenter;", "checkPromoQuestFeature", "Lid/dana/domain/featureconfig/interactor/CheckPromoQuestFeature;", "getMissions", "Lid/dana/domain/promoquest/interactor/GetMissions;", "promoQuestMapper", "Lid/dana/promoquest/mapper/PromoQuestMapper;", "view", "Lid/dana/contract/promoquest/quest/MissionSummaryContract$View;", "(Lid/dana/domain/featureconfig/interactor/CheckPromoQuestFeature;Lid/dana/domain/promoquest/interactor/GetMissions;Lid/dana/promoquest/mapper/PromoQuestMapper;Lid/dana/contract/promoquest/quest/MissionSummaryContract$View;)V", "", "checkReferralQuestExists", "", "activeMissions", "", "Lid/dana/promoquest/model/MissionModel;", "filterMissionSummariesAndSetData", "missionModels", "getMissionSummaries", "onDestroy", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class isRunInForeground implements getBackgroundExecutor.setMin {
    @NotNull
    public static final getMax length = new getMax((byte) 0);
    /* access modifiers changed from: private */
    public final openInBrowser getMax;
    /* access modifiers changed from: private */
    public final getBackgroundExecutor.length getMin;
    private final saveAppInfo setMax;
    private final getUserAgentString setMin;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class getMin extends Lambda implements Function1<Boolean, Unit> {
        final /* synthetic */ isRunInForeground this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        getMin(isRunInForeground isruninforeground) {
            super(1);
            this.this$0 = isruninforeground;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            invoke(((Boolean) obj).booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z) {
            this.this$0.getMin.setMax(z);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class isInside extends Lambda implements Function1<Throwable, Unit> {
        final /* synthetic */ isRunInForeground this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        isInside(isRunInForeground isruninforeground) {
            super(1);
            this.this$0 = isruninforeground;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "it");
            this.this$0.getMin.dismissProgress();
            this.this$0.getMin.getMax();
            updateActionSheetContent.logNetworkException(DanaLogConstants.Prefix.GET_MISSION_SUMMARIES, DanaLogConstants.ExceptionType.PROMO_QUEST_EXCEPTION, th);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class length extends Lambda implements Function1<Throwable, Unit> {
        final /* synthetic */ isRunInForeground this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        length(isRunInForeground isruninforeground) {
            super(1);
            this.this$0 = isruninforeground;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "it");
            this.this$0.getMin.setMax(false);
            StringBuilder sb = new StringBuilder("onError: ");
            sb.append(th.getMessage());
            updateActionSheetContent.e(DanaLogConstants.TAG.PROMO_QUEST, sb.toString());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "Lid/dana/domain/promoquest/model/Mission;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class setMin extends Lambda implements Function1<List<? extends queryAppAppInfos>, Unit> {
        final /* synthetic */ isRunInForeground this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        setMin(isRunInForeground isruninforeground) {
            super(1);
            this.this$0 = isruninforeground;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((List<queryAppAppInfos>) (List) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull List<queryAppAppInfos> list) {
            Intrinsics.checkNotNullParameter(list, "it");
            this.this$0.getMin.dismissProgress();
            openInBrowser unused = this.this$0.getMax;
            List<MissionModel> max = openInBrowser.setMax(list);
            if (max.isEmpty()) {
                this.this$0.getMin.getMax();
            } else {
                isRunInForeground.setMin(this.this$0, max);
            }
        }
    }

    @Inject
    public isRunInForeground(@NotNull getUserAgentString getuseragentstring, @NotNull saveAppInfo saveappinfo, @NotNull openInBrowser openinbrowser, @NotNull getBackgroundExecutor.length length2) {
        Intrinsics.checkNotNullParameter(getuseragentstring, "checkPromoQuestFeature");
        Intrinsics.checkNotNullParameter(saveappinfo, "getMissions");
        Intrinsics.checkNotNullParameter(openinbrowser, "promoQuestMapper");
        Intrinsics.checkNotNullParameter(length2, "view");
        this.setMin = getuseragentstring;
        this.setMax = saveappinfo;
        this.getMax = openinbrowser;
        this.getMin = length2;
    }

    public final void length() {
        this.getMin.showProgress();
        this.setMax.execute(saveAppInfo.getMin.Companion.create(10, 1), new setMin(this), new isInside(this));
    }

    private static boolean length(@NotNull List<MissionModel> list) {
        Intrinsics.checkNotNullParameter(list, MissionListActivity.ACTIVE_MISSIONS_KEY);
        Collection arrayList = new ArrayList();
        for (Object next : list) {
            if (Intrinsics.areEqual((Object) ((MissionModel) next).setMax, (Object) "REFERRAL_MISSION_ID")) {
                arrayList.add(next);
            }
        }
        return !((List) arrayList).isEmpty();
    }

    public final void setMin() {
        this.setMin.execute(onReceivedIcon.INSTANCE, new getMin(this), new length(this));
    }

    public final void setMax() {
        this.setMax.dispose();
        this.setMin.dispose();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lid/dana/contract/promoquest/quest/MissionSummaryPresenter$Companion;", "", "()V", "PAGE_NUMBER", "", "PAGE_SIZE", "REFERRAL_MISSION_ID", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMax {
        private getMax() {
        }

        public /* synthetic */ getMax(byte b) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2"}, k = 3, mv = {1, 4, 2})
    public static final class setMax<T> implements Comparator<T> {
        public final int compare(T t, T t2) {
            long j;
            Date date = ((MissionModel) t).length;
            long j2 = 0;
            if (date != null) {
                j = date.getTime();
            } else {
                j = 0;
            }
            Comparable valueOf = Long.valueOf(j);
            Date date2 = ((MissionModel) t2).length;
            if (date2 != null) {
                j2 = date2.getTime();
            }
            return ComparisonsKt.compareValues(valueOf, Long.valueOf(j2));
        }
    }

    public static final /* synthetic */ void setMin(isRunInForeground isruninforeground, List list) {
        Collection arrayList = new ArrayList();
        for (Object next : list) {
            if (((MissionModel) next).getMax()) {
                arrayList.add(next);
            }
        }
        List sortedWith = CollectionsKt.sortedWith((List) arrayList, new setMax());
        if (!sortedWith.isEmpty()) {
            isruninforeground.getMin.getMax(CollectionsKt.take(sortedWith, 5), length(sortedWith));
        } else {
            isruninforeground.getMin.getMax();
        }
    }
}
