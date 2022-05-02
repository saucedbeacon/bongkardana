package o;

import id.dana.data.constant.BranchLinkConstant;
import id.dana.data.foundation.logger.log.DanaLogConstants;
import id.dana.di.PerActivity;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o.queryAppInfo;
import o.setForegroundAsync;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\fH\u0016J\b\u0010\u0010\u001a\u00020\fH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lid/dana/contract/promoquest/quest/MissionPresenter;", "Lid/dana/contract/promoquest/quest/MissionContract$Presenter;", "view", "Lid/dana/contract/promoquest/quest/MissionContract$View;", "getMissionDetail", "Lid/dana/domain/promoquest/interactor/GetMissionDetail;", "getTnCReferralMissionConfig", "Lid/dana/domain/featureconfig/interactor/GetTnCReferralMissionConfig;", "mapper", "Lid/dana/promoquest/mapper/PromoQuestMapper;", "(Lid/dana/contract/promoquest/quest/MissionContract$View;Lid/dana/domain/promoquest/interactor/GetMissionDetail;Lid/dana/domain/featureconfig/interactor/GetTnCReferralMissionConfig;Lid/dana/promoquest/mapper/PromoQuestMapper;)V", "getMission", "", "missionId", "", "getTnC", "onDestroy", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
@PerActivity
public final class startWork implements setForegroundAsync.getMin {
    /* access modifiers changed from: private */
    public final setForegroundAsync.length getMax;
    /* access modifiers changed from: private */
    public final openInBrowser getMin;
    private final freeMemory setMax;
    private final queryAppInfo setMin;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lid/dana/domain/promoquest/model/Mission;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class getMax extends Lambda implements Function1<queryAppAppInfos, Unit> {
        final /* synthetic */ startWork this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        getMax(startWork startwork) {
            super(1);
            this.this$0 = startwork;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((queryAppAppInfos) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@Nullable queryAppAppInfos queryappappinfos) {
            this.this$0.getMax.dismissProgress();
            if (queryappappinfos != null) {
                setForegroundAsync.length min = this.this$0.getMax;
                openInBrowser unused = this.this$0.getMin;
                Intrinsics.checkNotNullParameter(queryappappinfos, "mission");
                min.getMin(openInBrowser.setMax(queryappappinfos));
                if (queryappappinfos != null) {
                    return;
                }
            }
            this.this$0.getMax.getMin();
            updateActionSheetContent.e(DanaLogConstants.TAG.MISSION_DETAIL_TAG, "Mission Null");
            Unit unit = Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class getMin extends Lambda implements Function1<String, Unit> {
        final /* synthetic */ startWork this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        getMin(startWork startwork) {
            super(1);
            this.this$0 = startwork;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "it");
            this.this$0.getMax.length(str);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class length extends Lambda implements Function1<Throwable, Unit> {
        final /* synthetic */ startWork this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        length(startWork startwork) {
            super(1);
            this.this$0 = startwork;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "it");
            updateActionSheetContent.w(DanaLogConstants.TAG.MISSION_DETAIL_TAG, th.getMessage());
            this.this$0.getMax.dismissProgress();
            this.this$0.getMax.getMin();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class setMax extends Lambda implements Function1<Throwable, Unit> {
        public static final setMax INSTANCE = new setMax();

        setMax() {
            super(1);
        }

        public final void invoke(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "it");
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return Unit.INSTANCE;
        }
    }

    @Inject
    public startWork(@NotNull setForegroundAsync.length length2, @NotNull queryAppInfo queryappinfo, @NotNull freeMemory freememory, @NotNull openInBrowser openinbrowser) {
        Intrinsics.checkNotNullParameter(length2, "view");
        Intrinsics.checkNotNullParameter(queryappinfo, "getMissionDetail");
        Intrinsics.checkNotNullParameter(freememory, "getTnCReferralMissionConfig");
        Intrinsics.checkNotNullParameter(openinbrowser, "mapper");
        this.getMax = length2;
        this.setMin = queryappinfo;
        this.setMax = freememory;
        this.getMin = openinbrowser;
    }

    public final void setMin(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, BranchLinkConstant.Params.MISSION_ID);
        this.getMax.showProgress();
        this.setMin.execute(queryAppInfo.getMin.Companion.create(str, true), new getMax(this), new length(this));
    }

    public final void getMin() {
        this.setMax.execute(onReceivedIcon.INSTANCE, new getMin(this), setMax.INSTANCE);
    }

    public final void setMax() {
        this.setMin.dispose();
    }
}
