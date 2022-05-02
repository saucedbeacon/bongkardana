package o;

import id.dana.data.constant.BranchLinkConstant;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.GriverAMCSAppUpdater;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\nB\u000f\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0018\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\u0003H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lid/dana/domain/promoquest/interactor/GetMissionDetail;", "Lid/dana/domain/core/usecase/BaseUseCase;", "Lid/dana/domain/promoquest/model/Mission;", "Lid/dana/domain/promoquest/interactor/GetMissionDetail$Params;", "questRepository", "Lid/dana/domain/promoquest/respository/PromoQuestRepository;", "(Lid/dana/domain/promoquest/respository/PromoQuestRepository;)V", "buildUseCase", "Lio/reactivex/Observable;", "params", "Params", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class queryAppInfo extends APWebChromeClient<queryAppAppInfos, getMin> {
    private final GriverAMCSAppUpdater.AnonymousClass1 questRepository;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public queryAppInfo(@NotNull GriverAMCSAppUpdater.AnonymousClass1 r3) {
        super((hasCornerMarking) null, (hasCornerMarking) null, 3, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(r3, "questRepository");
        this.questRepository = r3;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<queryAppAppInfos> buildUseCase(@NotNull getMin getmin) {
        Intrinsics.checkNotNullParameter(getmin, "params");
        TitleBarRightButtonView.AnonymousClass1<queryAppAppInfos> missionDetail = this.questRepository.getMissionDetail(getmin.getMissionId$domain_release(), getmin.getWithMissionInfo$domain_release());
        Intrinsics.checkNotNullExpressionValue(missionDetail, "questRepository.getMissi…, params.withMissionInfo)");
        return missionDetail;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lid/dana/domain/promoquest/interactor/GetMissionDetail$Params;", "", "missionId", "", "withMissionInfo", "", "(Ljava/lang/String;Z)V", "getMissionId$domain_release", "()Ljava/lang/String;", "getWithMissionInfo$domain_release", "()Z", "Companion", "domain_release"}, k = 1, mv = {1, 4, 2})
    public static final class getMin {
        @NotNull
        public static final setMin Companion = new setMin((DefaultConstructorMarker) null);
        @NotNull
        private final String missionId;
        private final boolean withMissionInfo;

        @JvmStatic
        @NotNull
        public static final getMin create(@NotNull String str, boolean z) {
            return Companion.create(str, z);
        }

        private getMin(String str, boolean z) {
            this.missionId = str;
            this.withMissionInfo = z;
        }

        public /* synthetic */ getMin(String str, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, z);
        }

        @NotNull
        public final String getMissionId$domain_release() {
            return this.missionId;
        }

        public final boolean getWithMissionInfo$domain_release() {
            return this.withMissionInfo;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0007¨\u0006\t"}, d2 = {"Lid/dana/domain/promoquest/interactor/GetMissionDetail$Params$Companion;", "", "()V", "create", "Lid/dana/domain/promoquest/interactor/GetMissionDetail$Params;", "missionId", "", "withMissionInfo", "", "domain_release"}, k = 1, mv = {1, 4, 2})
        public static final class setMin {
            private setMin() {
            }

            public /* synthetic */ setMin(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public static /* synthetic */ getMin create$default(setMin setmin, String str, boolean z, int i, Object obj) {
                if ((i & 2) != 0) {
                    z = false;
                }
                return setmin.create(str, z);
            }

            @JvmStatic
            @NotNull
            public final getMin create(@NotNull String str, boolean z) {
                Intrinsics.checkNotNullParameter(str, BranchLinkConstant.Params.MISSION_ID);
                return new getMin(str, z, (DefaultConstructorMarker) null);
            }
        }
    }
}
