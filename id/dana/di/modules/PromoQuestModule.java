package id.dana.di.modules;

import dagger.Module;
import dagger.Provides;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.getRunAttemptCount;
import o.setProgressAsync;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0003H\u0007J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lid/dana/di/modules/PromoQuestModule;", "", "contractView", "Lid/dana/contract/promoquest/mission/MissionListContract$View;", "(Lid/dana/contract/promoquest/mission/MissionListContract$View;)V", "provideMissionView", "providePresenter", "Lid/dana/contract/promoquest/mission/MissionListContract$Presenter;", "missionListPresenter", "Lid/dana/contract/promoquest/mission/MissionListPresenter;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
@Module
public final class PromoQuestModule {
    private final setProgressAsync.setMax length;

    public PromoQuestModule(@NotNull setProgressAsync.setMax setmax) {
        Intrinsics.checkNotNullParameter(setmax, "contractView");
        this.length = setmax;
    }

    @NotNull
    @Provides
    public final setProgressAsync.setMax getMin() {
        return this.length;
    }

    @NotNull
    @Provides
    public final setProgressAsync.length getMin(@NotNull getRunAttemptCount getrunattemptcount) {
        Intrinsics.checkNotNullParameter(getrunattemptcount, "missionListPresenter");
        return getrunattemptcount;
    }
}
