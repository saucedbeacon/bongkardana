package o;

import java.util.List;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o.PageLog;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0016J\u000e\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0016H\u0016J\u000e\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0016H\u0016J\u0014\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u001d0\u0016H\u0016J\u0016\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u00162\u0006\u0010!\u001a\u00020\u0017H\u0016J\u0016\u0010\"\u001a\b\u0012\u0004\u0012\u00020 0\u00162\u0006\u0010#\u001a\u00020\u0019H\u0016R\u001b\u0010\u0007\u001a\u00020\b8BX\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u001b\u0010\r\u001a\u00020\b8BX\u0002¢\u0006\f\n\u0004\b\u000f\u0010\f\u001a\u0004\b\u000e\u0010\nR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0002¢\u0006\f\n\u0004\b\u0014\u0010\f\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Lid/dana/data/requestmoney/RequestMoneyEntityRepository;", "Lid/dana/domain/requestmoney/RequestMoneyRepository;", "requestMoneyEntityDataFactory", "Lid/dana/data/requestmoney/repository/RequestMoneyEntityDataFactory;", "requestMoneyPreferenceEntityDataFactory", "Lid/dana/data/requestmoney/repository/RequestMoneyPreferenceEntityDataFactory;", "(Lid/dana/data/requestmoney/repository/RequestMoneyEntityDataFactory;Lid/dana/data/requestmoney/repository/RequestMoneyPreferenceEntityDataFactory;)V", "localRequestMoneyEntityData", "Lid/dana/data/requestmoney/repository/RequestMoneyEntityData;", "getLocalRequestMoneyEntityData", "()Lid/dana/data/requestmoney/repository/RequestMoneyEntityData;", "localRequestMoneyEntityData$delegate", "Lkotlin/Lazy;", "networkRequestMoneyEntityData", "getNetworkRequestMoneyEntityData", "networkRequestMoneyEntityData$delegate", "preferenceRequestMoneyEntityData", "Lid/dana/data/requestmoney/repository/source/local/PreferenceRequestMoneyEntityData;", "getPreferenceRequestMoneyEntityData", "()Lid/dana/data/requestmoney/repository/source/local/PreferenceRequestMoneyEntityData;", "preferenceRequestMoneyEntityData$delegate", "getNameCheckCount", "Lio/reactivex/Observable;", "", "getNameCheckExpiredTime", "", "getNamecheckConfig", "Lid/dana/domain/requestmoney/model/NameCheckConfig;", "getTopFeaturedBanks", "", "", "setNameCheckCount", "", "count", "setNameCheckExpiredTime", "timestamp", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class getTypeSting implements getId3 {
    private final Lazy localRequestMoneyEntityData$delegate = LazyKt.lazy(new length(this));
    private final Lazy networkRequestMoneyEntityData$delegate = LazyKt.lazy(new getMax(this));
    private final Lazy preferenceRequestMoneyEntityData$delegate = LazyKt.lazy(new setMax(this));
    /* access modifiers changed from: private */
    public final PageLog requestMoneyEntityDataFactory;
    /* access modifiers changed from: private */
    public final setRefer requestMoneyPreferenceEntityDataFactory;

    private final PageLog.AnonymousClass1 getLocalRequestMoneyEntityData() {
        return (PageLog.AnonymousClass1) this.localRequestMoneyEntityData$delegate.getValue();
    }

    private final PageLog.AnonymousClass1 getNetworkRequestMoneyEntityData() {
        return (PageLog.AnonymousClass1) this.networkRequestMoneyEntityData$delegate.getValue();
    }

    private final PageSource getPreferenceRequestMoneyEntityData() {
        return (PageSource) this.preferenceRequestMoneyEntityData$delegate.getValue();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lid/dana/domain/requestmoney/model/NameCheckConfig;", "kotlin.jvm.PlatformType", "it", "Lid/dana/data/requestmoney/repository/model/NameCheckConfigEntity;", "apply"}, k = 3, mv = {1, 4, 2})
    static final class setMin<T, R> implements RedDotDrawable<setToken, isMultiFrameBeacon> {
        public static final setMin getMax = new setMin();

        setMin() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            setToken settoken = (setToken) obj;
            Intrinsics.checkNotNullParameter(settoken, "it");
            return setAppStartSessionToken.toNameCheckConfig(settoken);
        }
    }

    @Inject
    public getTypeSting(@NotNull PageLog pageLog, @NotNull setRefer setrefer) {
        Intrinsics.checkNotNullParameter(pageLog, "requestMoneyEntityDataFactory");
        Intrinsics.checkNotNullParameter(setrefer, "requestMoneyPreferenceEntityDataFactory");
        this.requestMoneyEntityDataFactory = pageLog;
        this.requestMoneyPreferenceEntityDataFactory = setrefer;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lid/dana/data/requestmoney/repository/RequestMoneyEntityData;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class getMax extends Lambda implements Function0<PageLog.AnonymousClass1> {
        final /* synthetic */ getTypeSting this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        getMax(getTypeSting gettypesting) {
            super(0);
            this.this$0 = gettypesting;
        }

        @NotNull
        public final PageLog.AnonymousClass1 invoke() {
            return this.this$0.requestMoneyEntityDataFactory.createData("network");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lid/dana/data/requestmoney/repository/RequestMoneyEntityData;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class length extends Lambda implements Function0<PageLog.AnonymousClass1> {
        final /* synthetic */ getTypeSting this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        length(getTypeSting gettypesting) {
            super(0);
            this.this$0 = gettypesting;
        }

        @NotNull
        public final PageLog.AnonymousClass1 invoke() {
            return this.this$0.requestMoneyEntityDataFactory.createData("local");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lid/dana/data/requestmoney/repository/source/local/PreferenceRequestMoneyEntityData;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class setMax extends Lambda implements Function0<PageSource> {
        final /* synthetic */ getTypeSting this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        setMax(getTypeSting gettypesting) {
            super(0);
            this.this$0 = gettypesting;
        }

        @NotNull
        public final PageSource invoke() {
            return this.this$0.requestMoneyPreferenceEntityDataFactory.createData("local");
        }
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<List<String>> getTopFeaturedBanks() {
        TitleBarRightButtonView.AnonymousClass1<List<String>> onErrorResumeNext = getNetworkRequestMoneyEntityData().getTopFeatureBanks().onErrorResumeNext(getLocalRequestMoneyEntityData().getTopFeatureBanks());
        Intrinsics.checkNotNullExpressionValue(onErrorResumeNext, "networkRequestMoneyEntit…ata.getTopFeatureBanks())");
        return onErrorResumeNext;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<isMultiFrameBeacon> getNamecheckConfig() {
        TitleBarRightButtonView.AnonymousClass1<R> map = getNetworkRequestMoneyEntityData().getNameCheckConfig().onErrorResumeNext(getLocalRequestMoneyEntityData().getNameCheckConfig()).map(setMin.getMax);
        Intrinsics.checkNotNullExpressionValue(map, "networkRequestMoneyEntit… it.toNameCheckConfig() }");
        return map;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Integer> getNameCheckCount() {
        return getPreferenceRequestMoneyEntityData().getNameCheckCount();
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> setNameCheckCount(int i) {
        return getPreferenceRequestMoneyEntityData().setNameCheckCount(i);
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Long> getNameCheckExpiredTime() {
        return getPreferenceRequestMoneyEntityData().getNameCheckExpiredTime();
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> setNameCheckExpiredTime(long j) {
        return getPreferenceRequestMoneyEntityData().setNameCheckExpiredTime(j);
    }
}
