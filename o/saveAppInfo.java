package o;

import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.GriverAMCSAppUpdater;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u0016\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u000bB\u000f\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u001e\u0010\b\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00020\t2\u0006\u0010\n\u001a\u00020\u0004H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lid/dana/domain/promoquest/interactor/GetMissions;", "Lid/dana/domain/core/usecase/BaseUseCase;", "", "Lid/dana/domain/promoquest/model/Mission;", "Lid/dana/domain/promoquest/interactor/GetMissions$Params;", "promoQuestRepository", "Lid/dana/domain/promoquest/respository/PromoQuestRepository;", "(Lid/dana/domain/promoquest/respository/PromoQuestRepository;)V", "buildUseCase", "Lio/reactivex/Observable;", "params", "Params", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class saveAppInfo extends APWebChromeClient<List<? extends queryAppAppInfos>, getMin> {
    private final GriverAMCSAppUpdater.AnonymousClass1 promoQuestRepository;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public saveAppInfo(@NotNull GriverAMCSAppUpdater.AnonymousClass1 r3) {
        super((hasCornerMarking) null, (hasCornerMarking) null, 3, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(r3, "promoQuestRepository");
        this.promoQuestRepository = r3;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<List<queryAppAppInfos>> buildUseCase(@NotNull getMin getmin) {
        Intrinsics.checkNotNullParameter(getmin, "params");
        TitleBarRightButtonView.AnonymousClass1<List<queryAppAppInfos>> missions = this.promoQuestRepository.getMissions(getmin.getPageSize$domain_release(), getmin.getPageNumber$domain_release());
        Intrinsics.checkNotNullExpressionValue(missions, "promoQuestRepository.get…eSize, params.pageNumber)");
        return missions;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u0014\u0010\u0004\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\n"}, d2 = {"Lid/dana/domain/promoquest/interactor/GetMissions$Params;", "", "pageSize", "", "pageNumber", "(II)V", "getPageNumber$domain_release", "()I", "getPageSize$domain_release", "Companion", "domain_release"}, k = 1, mv = {1, 4, 2})
    public static final class getMin {
        @NotNull
        public static final setMax Companion = new setMax((DefaultConstructorMarker) null);
        private final int pageNumber;
        private final int pageSize;

        private getMin(int i, int i2) {
            this.pageSize = i;
            this.pageNumber = i2;
        }

        public /* synthetic */ getMin(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, i2);
        }

        public final int getPageSize$domain_release() {
            return this.pageSize;
        }

        public final int getPageNumber$domain_release() {
            return this.pageNumber;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006¨\u0006\b"}, d2 = {"Lid/dana/domain/promoquest/interactor/GetMissions$Params$Companion;", "", "()V", "create", "Lid/dana/domain/promoquest/interactor/GetMissions$Params;", "pageSize", "", "pageNumber", "domain_release"}, k = 1, mv = {1, 4, 2})
        public static final class setMax {
            private setMax() {
            }

            public /* synthetic */ setMax(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final getMin create(int i, int i2) {
                return new getMin(i, i2, (DefaultConstructorMarker) null);
            }
        }
    }
}
