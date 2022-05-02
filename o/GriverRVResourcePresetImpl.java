package o;

import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\rB\u000f\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0003H\u0016R\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\u0006¨\u0006\u000e"}, d2 = {"Lid/dana/domain/recentbank/interactor/RemoveRecentSavedBank;", "Lid/dana/domain/core/usecase/BaseUseCase;", "", "Lid/dana/domain/recentbank/interactor/RemoveRecentSavedBank$Params;", "repository", "Lid/dana/domain/recentrecipient/repository/RecentRecipientRepository;", "(Lid/dana/domain/recentrecipient/repository/RecentRecipientRepository;)V", "getRepository", "()Lid/dana/domain/recentrecipient/repository/RecentRecipientRepository;", "setRepository", "buildUseCase", "Lio/reactivex/Observable;", "params", "Params", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class GriverRVResourcePresetImpl extends APWebChromeClient<Boolean, getMin> {
    @NotNull
    private GriverWhiteScreenStageMonitor repository;

    @NotNull
    public final GriverWhiteScreenStageMonitor getRepository() {
        return this.repository;
    }

    public final void setRepository(@NotNull GriverWhiteScreenStageMonitor griverWhiteScreenStageMonitor) {
        Intrinsics.checkNotNullParameter(griverWhiteScreenStageMonitor, "<set-?>");
        this.repository = griverWhiteScreenStageMonitor;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public GriverRVResourcePresetImpl(@NotNull GriverWhiteScreenStageMonitor griverWhiteScreenStageMonitor) {
        super((hasCornerMarking) null, (hasCornerMarking) null, 3, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(griverWhiteScreenStageMonitor, "repository");
        this.repository = griverWhiteScreenStageMonitor;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lid/dana/domain/recentbank/interactor/RemoveRecentSavedBank$Params;", "", "recentBank", "Lid/dana/domain/recentrecipient/model/RecentBankRecipient;", "(Lid/dana/domain/recentrecipient/model/RecentBankRecipient;)V", "getRecentBank$domain_release", "()Lid/dana/domain/recentrecipient/model/RecentBankRecipient;", "Companion", "domain_release"}, k = 1, mv = {1, 4, 2})
    public static final class getMin {
        @NotNull
        public static final setMin Companion = new setMin((DefaultConstructorMarker) null);
        @NotNull
        private final GriverFullLinkStageMonitor recentBank;

        @JvmStatic
        @NotNull
        public static final getMin create(@NotNull GriverFullLinkStageMonitor griverFullLinkStageMonitor) {
            return Companion.create(griverFullLinkStageMonitor);
        }

        private getMin(GriverFullLinkStageMonitor griverFullLinkStageMonitor) {
            this.recentBank = griverFullLinkStageMonitor;
        }

        public /* synthetic */ getMin(GriverFullLinkStageMonitor griverFullLinkStageMonitor, DefaultConstructorMarker defaultConstructorMarker) {
            this(griverFullLinkStageMonitor);
        }

        @NotNull
        public final GriverFullLinkStageMonitor getRecentBank$domain_release() {
            return this.recentBank;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lid/dana/domain/recentbank/interactor/RemoveRecentSavedBank$Params$Companion;", "", "()V", "create", "Lid/dana/domain/recentbank/interactor/RemoveRecentSavedBank$Params;", "recentBank", "Lid/dana/domain/recentrecipient/model/RecentBankRecipient;", "domain_release"}, k = 1, mv = {1, 4, 2})
        public static final class setMin {
            private setMin() {
            }

            public /* synthetic */ setMin(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @JvmStatic
            @NotNull
            public final getMin create(@NotNull GriverFullLinkStageMonitor griverFullLinkStageMonitor) {
                Intrinsics.checkNotNullParameter(griverFullLinkStageMonitor, "recentBank");
                return new getMin(griverFullLinkStageMonitor, (DefaultConstructorMarker) null);
            }
        }
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> buildUseCase(@NotNull getMin getmin) {
        Intrinsics.checkNotNullParameter(getmin, "params");
        TitleBarRightButtonView.AnonymousClass1<Boolean> removeRecentBankAndSyncToUserConfig = this.repository.removeRecentBankAndSyncToUserConfig(getmin.getRecentBank$domain_release());
        Intrinsics.checkNotNullExpressionValue(removeRecentBankAndSyncToUserConfig, "repository.removeRecentB…Config(params.recentBank)");
        return removeRecentBankAndSyncToUserConfig;
    }
}
