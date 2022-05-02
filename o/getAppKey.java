package o;

import id.dana.data.Source;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o.BeaconLocalBroadcastProcessor;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;

@Singleton
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0016R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u000b\u001a\u00020\u00068BX\u0002¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\f\u0010\b¨\u0006\u0011"}, d2 = {"Lid/dana/data/saving/repository/SavingConfigEntityDataRepository;", "Lid/dana/domain/saving/SavingConfigRepository;", "savingConfigEntityDataFactory", "Lid/dana/data/saving/repository/SavingConfigEntityDataFactory;", "(Lid/dana/data/saving/repository/SavingConfigEntityDataFactory;)V", "defaultConfigEntityData", "Lid/dana/data/saving/repository/SavingConfigEntityData;", "getDefaultConfigEntityData", "()Lid/dana/data/saving/repository/SavingConfigEntityData;", "defaultConfigEntityData$delegate", "Lkotlin/Lazy;", "splitConfigEntityData", "getSplitConfigEntityData", "splitConfigEntityData$delegate", "getSavingEmptyState", "Lio/reactivex/Observable;", "Lid/dana/domain/saving/model/SavingEmptyState;", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class getAppKey implements isExtraBeaconData {
    private final Lazy defaultConfigEntityData$delegate = LazyKt.lazy(new getMax(this));
    /* access modifiers changed from: private */
    public final getGwUrl savingConfigEntityDataFactory;
    private final Lazy splitConfigEntityData$delegate = LazyKt.lazy(new setMax(this));

    private final getStatusCode getDefaultConfigEntityData() {
        return (getStatusCode) this.defaultConfigEntityData$delegate.getValue();
    }

    private final getStatusCode getSplitConfigEntityData() {
        return (getStatusCode) this.splitConfigEntityData$delegate.getValue();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lid/dana/domain/saving/model/SavingEmptyState;", "kotlin.jvm.PlatformType", "it", "Lid/dana/data/saving/model/SavingEmptyStateEntity;", "apply"}, k = 3, mv = {1, 4, 2})
    static final class setMin<T, R> implements RedDotDrawable<url, BeaconLocalBroadcastProcessor.AnonymousClass1> {
        public static final setMin setMin = new setMin();

        setMin() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            url url = (url) obj;
            Intrinsics.checkNotNullParameter(url, "it");
            return getDownloadUrl.toSavingEmptyState(url);
        }
    }

    @Inject
    public getAppKey(@NotNull getGwUrl getgwurl) {
        Intrinsics.checkNotNullParameter(getgwurl, "savingConfigEntityDataFactory");
        this.savingConfigEntityDataFactory = getgwurl;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lid/dana/data/saving/repository/SavingConfigEntityData;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class setMax extends Lambda implements Function0<getStatusCode> {
        final /* synthetic */ getAppKey this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        setMax(getAppKey getappkey) {
            super(0);
            this.this$0 = getappkey;
        }

        @NotNull
        public final getStatusCode invoke() {
            return this.this$0.savingConfigEntityDataFactory.createData(Source.SPLIT);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lid/dana/data/saving/repository/SavingConfigEntityData;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class getMax extends Lambda implements Function0<getStatusCode> {
        final /* synthetic */ getAppKey this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        getMax(getAppKey getappkey) {
            super(0);
            this.this$0 = getappkey;
        }

        @NotNull
        public final getStatusCode invoke() {
            return this.this$0.savingConfigEntityDataFactory.createData("local");
        }
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<BeaconLocalBroadcastProcessor.AnonymousClass1> getSavingEmptyState() {
        TitleBarRightButtonView.AnonymousClass1<R> map = getSplitConfigEntityData().getSavingEmptyState().onErrorResumeNext(getDefaultConfigEntityData().getSavingEmptyState()).map(setMin.setMin);
        Intrinsics.checkNotNullExpressionValue(map, "splitConfigEntityData.ge…mptyState()\n            }");
        return map;
    }
}
