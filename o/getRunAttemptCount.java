package o;

import id.dana.data.foundation.logger.log.DanaLogConstants;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o.queryHighestAppInfo;
import o.setProgressAsync;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u0000 \u00152\u00020\u00012\u00020\u0002:\u0001\u0015B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\b\u0010\u000e\u001a\u00020\u000fH\u0002J\b\u0010\u0010\u001a\u00020\u000fH\u0016J\b\u0010\u0011\u001a\u00020\u000fH\u0002J\b\u0010\u0012\u001a\u00020\u000fH\u0016J\b\u0010\u0013\u001a\u00020\u000fH\u0016J\b\u0010\u0014\u001a\u00020\u000fH\u0016R\u000e\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lid/dana/contract/promoquest/mission/MissionListPresenter;", "Lid/dana/base/BasePresenter;", "Lid/dana/contract/promoquest/mission/MissionListContract$Presenter;", "getActiveMissions", "Lid/dana/domain/promoquest/interactor/GetMissionsWithQuestByStatus;", "getPastMissions", "view", "Lid/dana/contract/promoquest/mission/MissionListContract$View;", "promoQuestMapper", "Lid/dana/promoquest/mapper/PromoQuestMapper;", "(Lid/dana/domain/promoquest/interactor/GetMissionsWithQuestByStatus;Lid/dana/domain/promoquest/interactor/GetMissionsWithQuestByStatus;Lid/dana/contract/promoquest/mission/MissionListContract$View;Lid/dana/promoquest/mapper/PromoQuestMapper;)V", "activePageNumber", "", "pastPageNumber", "fetchActiveMissions", "", "fetchMissionsFirstTime", "fetchPastMissions", "onDestroy", "reloadActiveMissions", "reloadPastMissions", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class getRunAttemptCount extends registerCallback implements setProgressAsync.length {
    @NotNull
    public static final setMin getMax = new setMin((byte) 0);
    /* access modifiers changed from: private */
    public final setProgressAsync.setMax equals;
    private int getMin = 1;
    /* access modifiers changed from: private */
    public final openInBrowser isInside;
    private final queryHighestAppInfo length;
    private int setMax = 1;
    private final queryHighestAppInfo setMin;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "missions", "", "Lid/dana/domain/promoquest/model/Mission;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class getMax extends Lambda implements Function1<List<? extends queryAppAppInfos>, Unit> {
        final /* synthetic */ getRunAttemptCount this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        getMax(getRunAttemptCount getrunattemptcount) {
            super(1);
            this.this$0 = getrunattemptcount;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((List<queryAppAppInfos>) (List) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull List<queryAppAppInfos> list) {
            Intrinsics.checkNotNullParameter(list, "missions");
            this.this$0.equals.dismisssPastMissionProgress();
            setProgressAsync.setMax min = this.this$0.equals;
            openInBrowser unused = this.this$0.isInside;
            min.onFetchPastMissionSucceeded(openInBrowser.setMax(list));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class getMin extends Lambda implements Function1<Throwable, Unit> {
        final /* synthetic */ getRunAttemptCount this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        getMin(getRunAttemptCount getrunattemptcount) {
            super(1);
            this.this$0 = getrunattemptcount;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "it");
            this.this$0.equals.dismisssPastMissionProgress();
            this.this$0.equals.onFetchPastMissionFailed((String) null);
            updateActionSheetContent.logNetworkException(DanaLogConstants.Prefix.GET_PAST_MISSIONS, DanaLogConstants.ExceptionType.PROMO_QUEST_EXCEPTION, th);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class length extends Lambda implements Function1<Throwable, Unit> {
        final /* synthetic */ getRunAttemptCount this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        length(getRunAttemptCount getrunattemptcount) {
            super(1);
            this.this$0 = getrunattemptcount;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "it");
            this.this$0.equals.dismisssActiveMissionProgress();
            this.this$0.equals.onFetchActiveMissionFailed((String) null);
            updateActionSheetContent.logNetworkException(DanaLogConstants.Prefix.GET_ACTIVE_MISSIONS, DanaLogConstants.ExceptionType.PROMO_QUEST_EXCEPTION, th);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "missions", "", "Lid/dana/domain/promoquest/model/Mission;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class setMax extends Lambda implements Function1<List<? extends queryAppAppInfos>, Unit> {
        final /* synthetic */ getRunAttemptCount this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        setMax(getRunAttemptCount getrunattemptcount) {
            super(1);
            this.this$0 = getrunattemptcount;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((List<queryAppAppInfos>) (List) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull List<queryAppAppInfos> list) {
            Intrinsics.checkNotNullParameter(list, "missions");
            this.this$0.equals.dismisssActiveMissionProgress();
            setProgressAsync.setMax min = this.this$0.equals;
            openInBrowser unused = this.this$0.isInside;
            min.onFetchActiveMissionSucceeded(openInBrowser.setMax(list));
        }
    }

    @Inject
    public getRunAttemptCount(@NotNull queryHighestAppInfo queryhighestappinfo, @NotNull queryHighestAppInfo queryhighestappinfo2, @NotNull setProgressAsync.setMax setmax, @NotNull openInBrowser openinbrowser) {
        Intrinsics.checkNotNullParameter(queryhighestappinfo, "getActiveMissions");
        Intrinsics.checkNotNullParameter(queryhighestappinfo2, "getPastMissions");
        Intrinsics.checkNotNullParameter(setmax, "view");
        Intrinsics.checkNotNullParameter(openinbrowser, "promoQuestMapper");
        this.length = queryhighestappinfo;
        this.setMin = queryhighestappinfo2;
        this.equals = setmax;
        this.isInside = openinbrowser;
    }

    public final void setMax() {
        this.length.dispose();
        this.setMin.dispose();
    }

    public final void setMin() {
        getMin();
        IsOverlapping();
    }

    public final void getMax() {
        this.getMin = 1;
        getMin();
    }

    public final void length() {
        this.setMax = 1;
        IsOverlapping();
    }

    private final void getMin() {
        this.equals.showActiveMissionProgress();
        this.length.execute(queryHighestAppInfo.getMax.Companion.activeMissions(10, this.getMin), new setMax(this), new length(this));
    }

    private final void IsOverlapping() {
        this.equals.showPastMissionProgress();
        this.setMin.execute(queryHighestAppInfo.getMax.Companion.pastMissions(10, this.setMax), new getMax(this), new getMin(this));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lid/dana/contract/promoquest/mission/MissionListPresenter$Companion;", "", "()V", "ACTIVE_PAGE_SIZE", "", "INITIAL_ACTIVE_PAGE_NUMBER", "INITIAL_PAST_PAGE_NUMBER", "PAST_PAGE_SIZE", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMin {
        private setMin() {
        }

        public /* synthetic */ setMin(byte b) {
            this();
        }
    }
}
