package o;

import android.content.Context;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.TitleBarRightButtonView;
import o.WorkerLog;
import o.b;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006H\u0016J\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00062\u0006\u0010\f\u001a\u00020\u0007H\u0016J\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00062\u0006\u0010\u000e\u001a\u00020\tH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lid/dana/data/requestmoney/repository/source/local/PreferenceRequestMoneyEntityData;", "Lid/dana/data/requestmoney/repository/RequestMoneyPreferenceEntityData;", "requestMoneyPreference", "Lid/dana/data/requestmoney/repository/source/local/RequestMoneyPreference;", "(Lid/dana/data/requestmoney/repository/source/local/RequestMoneyPreference;)V", "getNameCheckCount", "Lio/reactivex/Observable;", "", "getNameCheckExpiredTime", "", "setNameCheckCount", "", "count", "setNameCheckExpiredTime", "timestamp", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class PageSource {
    private final getSimpleNetworkType requestMoneyPreference;

    @Inject
    public PageSource(@NotNull getSimpleNetworkType getsimplenetworktype) {
        Intrinsics.checkNotNullParameter(getsimplenetworktype, "requestMoneyPreference");
        this.requestMoneyPreference = getsimplenetworktype;
    }

    public final class SourceType implements getAdapterPosition<WorkerLog.Builder> {
        private final b.C0007b<Context> contextProvider;
        private final b.C0007b<PluginInstallCallback> serializerProvider;

        public SourceType(b.C0007b<Context> bVar, b.C0007b<PluginInstallCallback> bVar2) {
            this.contextProvider = bVar;
            this.serializerProvider = bVar2;
        }

        public final WorkerLog.Builder get() {
            return newInstance(this.contextProvider.get(), this.serializerProvider.get());
        }

        public static SourceType create(b.C0007b<Context> bVar, b.C0007b<PluginInstallCallback> bVar2) {
            return new SourceType(bVar, bVar2);
        }

        public static WorkerLog.Builder newInstance(Context context, PluginInstallCallback pluginInstallCallback) {
            return new WorkerLog.Builder(context, pluginInstallCallback);
        }
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> setNameCheckCount(int i) {
        TitleBarRightButtonView.AnonymousClass1<Boolean> just = TitleBarRightButtonView.AnonymousClass1.just(Boolean.valueOf(this.requestMoneyPreference.setNameCheckCount(i)));
        Intrinsics.checkNotNullExpressionValue(just, "Observable.just(requestM…setNameCheckCount(count))");
        return just;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Integer> getNameCheckCount() {
        TitleBarRightButtonView.AnonymousClass1<Integer> just = TitleBarRightButtonView.AnonymousClass1.just(this.requestMoneyPreference.getNameCheckCount());
        Intrinsics.checkNotNullExpressionValue(just, "Observable.just(requestM…ence.getNameCheckCount())");
        return just;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> setNameCheckExpiredTime(long j) {
        TitleBarRightButtonView.AnonymousClass1<Boolean> just = TitleBarRightButtonView.AnonymousClass1.just(Boolean.valueOf(this.requestMoneyPreference.setNameCheckExpiredTime(j)));
        Intrinsics.checkNotNullExpressionValue(just, "Observable.just(requestM…ckExpiredTime(timestamp))");
        return just;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Long> getNameCheckExpiredTime() {
        TitleBarRightButtonView.AnonymousClass1<Long> just = TitleBarRightButtonView.AnonymousClass1.just(this.requestMoneyPreference.getNameCheckExpiredTime());
        Intrinsics.checkNotNullExpressionValue(just, "Observable.just(requestM…etNameCheckExpiredTime())");
        return just;
    }
}
