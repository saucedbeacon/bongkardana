package o;

import java.util.List;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.TitleBarRightButtonView;
import o.WorkerLog;
import o.b;
import org.jetbrains.annotations.NotNull;

@Singleton
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lid/dana/data/requestmoney/repository/RequestMoneyEntityDataFactory;", "Lid/dana/data/AbstractEntityDataFactory;", "Lid/dana/data/requestmoney/repository/RequestMoneyEntityData;", "amcsRequestMoneyEntityData", "Lid/dana/data/requestmoney/repository/source/amcs/AmcsRequestMoneyEntityData;", "defaultRequestMoneyEntityData", "Lid/dana/data/requestmoney/repository/source/local/DefaultRequestMoneyEntityData;", "(Lid/dana/data/requestmoney/repository/source/amcs/AmcsRequestMoneyEntityData;Lid/dana/data/requestmoney/repository/source/local/DefaultRequestMoneyEntityData;)V", "createData", "source", "", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class PageLog extends uncheckItems<AnonymousClass1> {
    private final WorkerLog amcsRequestMoneyEntityData;
    private final WorkerLog.Builder defaultRequestMoneyEntityData;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u0014\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0003H&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Lid/dana/data/requestmoney/repository/RequestMoneyEntityData;", "", "getNameCheckConfig", "Lio/reactivex/Observable;", "Lid/dana/data/requestmoney/repository/model/NameCheckConfigEntity;", "getTopFeatureBanks", "", "", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
    /* renamed from: o.PageLog$1  reason: invalid class name */
    public interface AnonymousClass1 {
        @NotNull
        TitleBarRightButtonView.AnonymousClass1<setToken> getNameCheckConfig();

        @NotNull
        TitleBarRightButtonView.AnonymousClass1<List<String>> getTopFeatureBanks();
    }

    public final class Builder implements getAdapterPosition<setRefer> {
        private final b.C0007b<getSimpleNetworkType> requestMoneyPreferenceProvider;

        public Builder(b.C0007b<getSimpleNetworkType> bVar) {
            this.requestMoneyPreferenceProvider = bVar;
        }

        public final setRefer get() {
            return newInstance(this.requestMoneyPreferenceProvider.get());
        }

        public static Builder create(b.C0007b<getSimpleNetworkType> bVar) {
            return new Builder(bVar);
        }

        public static setRefer newInstance(getSimpleNetworkType getsimplenetworktype) {
            return new setRefer(getsimplenetworktype);
        }
    }

    @Inject
    public PageLog(@NotNull WorkerLog workerLog, @NotNull WorkerLog.Builder builder) {
        Intrinsics.checkNotNullParameter(workerLog, "amcsRequestMoneyEntityData");
        Intrinsics.checkNotNullParameter(builder, "defaultRequestMoneyEntityData");
        this.amcsRequestMoneyEntityData = workerLog;
        this.defaultRequestMoneyEntityData = builder;
    }

    @NotNull
    public final AnonymousClass1 createData(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "source");
        if (Intrinsics.areEqual((Object) "network", (Object) str)) {
            return this.amcsRequestMoneyEntityData;
        }
        return this.defaultRequestMoneyEntityData;
    }
}
