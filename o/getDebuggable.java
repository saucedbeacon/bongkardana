package o;

import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000eB\u001f\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\f2\u0006\u0010\r\u001a\u00020\u0003H\u0016R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lid/dana/domain/ipg/interactor/GetIpgRegistrationUrl;", "Lid/dana/domain/UseCase;", "Lid/dana/domain/ipg/IpgRegistrationUrl;", "Lid/dana/domain/ipg/interactor/GetIpgRegistrationUrl$Params;", "threadExecutor", "Lid/dana/domain/ThreadExecutor;", "postExecutionThread", "Lid/dana/domain/PostExecutionThread;", "ipgRepository", "Lid/dana/domain/ipg/IpgRepository;", "(Lid/dana/domain/ThreadExecutor;Lid/dana/domain/PostExecutionThread;Lid/dana/domain/ipg/IpgRepository;)V", "buildUseCaseObservable", "Lio/reactivex/Observable;", "params", "Params", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class getDebuggable extends parseFailed<setWorkSpaceId, getMax> {
    private final setEnvironment ipgRepository;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public getDebuggable(@NotNull appxLoadFailed appxloadfailed, @NotNull getScheme getscheme, @NotNull setEnvironment setenvironment) {
        super(appxloadfailed, getscheme);
        Intrinsics.checkNotNullParameter(appxloadfailed, "threadExecutor");
        Intrinsics.checkNotNullParameter(getscheme, "postExecutionThread");
        Intrinsics.checkNotNullParameter(setenvironment, "ipgRepository");
        this.ipgRepository = setenvironment;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\t"}, d2 = {"Lid/dana/domain/ipg/interactor/GetIpgRegistrationUrl$Params;", "", "deviceId", "", "bizType", "(Ljava/lang/String;Ljava/lang/String;)V", "getBizType", "()Ljava/lang/String;", "getDeviceId", "domain_release"}, k = 1, mv = {1, 4, 2})
    public static final class getMax {
        @NotNull
        private final String bizType;
        @NotNull
        private final String deviceId;

        public getMax(@NotNull String str, @NotNull String str2) {
            Intrinsics.checkNotNullParameter(str, "deviceId");
            Intrinsics.checkNotNullParameter(str2, "bizType");
            this.deviceId = str;
            this.bizType = str2;
        }

        @NotNull
        public final String getBizType() {
            return this.bizType;
        }

        @NotNull
        public final String getDeviceId() {
            return this.deviceId;
        }
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<setWorkSpaceId> buildUseCaseObservable(@NotNull getMax getmax) {
        Intrinsics.checkNotNullParameter(getmax, "params");
        return this.ipgRepository.getIpgRegistrationUrl(getmax.getDeviceId(), getmax.getBizType());
    }
}
