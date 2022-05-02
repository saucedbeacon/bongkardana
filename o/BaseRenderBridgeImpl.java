package o;

import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;

@Singleton
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0002J\b\u0010\t\u001a\u00020\bH\u0002J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000eH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lid/dana/data/openbankaccount/repository/ConfigOpenBankAccountEntityRepository;", "Lid/dana/domain/openbankaccount/ConfigBankAccountRepository;", "configOpenBankAccountDataFactory", "Lid/dana/data/openbankaccount/repository/source/ConfigOpenBankAccountDataFactory;", "configBankAccountResultMapper", "Lid/dana/data/openbankaccount/mapper/ConfigBankAccountResultMapper;", "(Lid/dana/data/openbankaccount/repository/source/ConfigOpenBankAccountDataFactory;Lid/dana/data/openbankaccount/mapper/ConfigBankAccountResultMapper;)V", "createConfig", "Lid/dana/data/openbankaccount/ConfigOpenBankAccountEntityData;", "createDefaultConfig", "createDefaultConfigIfEmpty", "Lio/reactivex/ObservableSource;", "Lid/dana/domain/openbankaccount/model/ConfigBankAccount;", "getConfig", "Lio/reactivex/Observable;", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class BaseRenderBridgeImpl implements NetworkUtils {
    private final EventSendInterceptorPoint configBankAccountResultMapper;
    private final doCheckPermission configOpenBankAccountDataFactory;

    @Inject
    public BaseRenderBridgeImpl(@NotNull doCheckPermission docheckpermission, @NotNull EventSendInterceptorPoint eventSendInterceptorPoint) {
        Intrinsics.checkNotNullParameter(docheckpermission, "configOpenBankAccountDataFactory");
        Intrinsics.checkNotNullParameter(eventSendInterceptorPoint, "configBankAccountResultMapper");
        this.configOpenBankAccountDataFactory = docheckpermission;
        this.configBankAccountResultMapper = eventSendInterceptorPoint;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<fileType> getConfig() {
        TitleBarRightButtonView.AnonymousClass1<R> onErrorResumeNext = createConfig().getConfig().map(new DefaultApiContext(new length(this.configBankAccountResultMapper))).onErrorResumeNext(createDefaultConfigIfEmpty());
        Intrinsics.checkNotNullExpressionValue(onErrorResumeNext, "createConfig()\n         …teDefaultConfigIfEmpty())");
        return onErrorResumeNext;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lid/dana/domain/openbankaccount/model/ConfigBankAccount;", "kotlin.jvm.PlatformType", "p1", "Lid/dana/data/openbankaccount/model/OpenBankAccountConfigData;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final /* synthetic */ class length extends FunctionReferenceImpl implements Function1<AnonymousClass1, fileType> {
        length(EventSendInterceptorPoint eventSendInterceptorPoint) {
            super(1, eventSendInterceptorPoint, EventSendInterceptorPoint.class, "apply", "apply(Ljava/lang/Object;)Ljava/lang/Object;", 0);
        }

        public final fileType invoke(AnonymousClass1 r2) {
            return (fileType) ((EventSendInterceptorPoint) this.receiver).apply(r2);
        }
    }

    private final TitleBarRightButtonView.AnonymousClass4<fileType> createDefaultConfigIfEmpty() {
        TitleBarRightButtonView.AnonymousClass1<R> map = createDefaultConfig().getConfig().map(new DefaultApiContext(new setMax(this.configBankAccountResultMapper)));
        Intrinsics.checkNotNullExpressionValue(map, "createDefaultConfig()\n  …countResultMapper::apply)");
        return map;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lid/dana/domain/openbankaccount/model/ConfigBankAccount;", "kotlin.jvm.PlatformType", "p1", "Lid/dana/data/openbankaccount/model/OpenBankAccountConfigData;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final /* synthetic */ class setMax extends FunctionReferenceImpl implements Function1<AnonymousClass1, fileType> {
        setMax(EventSendInterceptorPoint eventSendInterceptorPoint) {
            super(1, eventSendInterceptorPoint, EventSendInterceptorPoint.class, "apply", "apply(Ljava/lang/Object;)Ljava/lang/Object;", 0);
        }

        public final fileType invoke(AnonymousClass1 r2) {
            return (fileType) ((EventSendInterceptorPoint) this.receiver).apply(r2);
        }
    }

    private final BridgeAccessPoint createConfig() {
        return this.configOpenBankAccountDataFactory.createData("network");
    }

    private final BridgeAccessPoint createDefaultConfig() {
        return this.configOpenBankAccountDataFactory.createData("local");
    }
}
