package o;

import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000eB\u001f\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\f2\u0006\u0010\r\u001a\u00020\u0003H\u0016R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lid/dana/domain/ipg/interactor/GetIpgClickedAgree;", "Lid/dana/domain/UseCase;", "", "Lid/dana/domain/ipg/interactor/GetIpgClickedAgree$Params;", "threadExecutor", "Lid/dana/domain/ThreadExecutor;", "postExecutionThread", "Lid/dana/domain/PostExecutionThread;", "ipgRepository", "Lid/dana/domain/ipg/IpgRepository;", "(Lid/dana/domain/ThreadExecutor;Lid/dana/domain/PostExecutionThread;Lid/dana/domain/ipg/IpgRepository;)V", "buildUseCaseObservable", "Lio/reactivex/Observable;", "params", "Params", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class getEnvironment extends parseFailed<Boolean, setMax> {
    private final setEnvironment ipgRepository;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public getEnvironment(@NotNull appxLoadFailed appxloadfailed, @NotNull getScheme getscheme, @NotNull setEnvironment setenvironment) {
        super(appxloadfailed, getscheme);
        Intrinsics.checkNotNullParameter(appxloadfailed, "threadExecutor");
        Intrinsics.checkNotNullParameter(getscheme, "postExecutionThread");
        Intrinsics.checkNotNullParameter(setenvironment, "ipgRepository");
        this.ipgRepository = setenvironment;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\u0010"}, d2 = {"Lid/dana/domain/ipg/interactor/GetIpgClickedAgree$Params;", "", "userConsentConfigKey", "", "(Ljava/lang/String;)V", "getUserConsentConfigKey", "()Ljava/lang/String;", "setUserConsentConfigKey", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "domain_release"}, k = 1, mv = {1, 4, 2})
    public static final class setMax {
        @NotNull
        private String userConsentConfigKey;

        public static /* synthetic */ setMax copy$default(setMax setmax, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = setmax.userConsentConfigKey;
            }
            return setmax.copy(str);
        }

        @NotNull
        public final String component1() {
            return this.userConsentConfigKey;
        }

        @NotNull
        public final setMax copy(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "userConsentConfigKey");
            return new setMax(str);
        }

        public final boolean equals(@Nullable Object obj) {
            if (this != obj) {
                return (obj instanceof setMax) && Intrinsics.areEqual((Object) this.userConsentConfigKey, (Object) ((setMax) obj).userConsentConfigKey);
            }
            return true;
        }

        public final int hashCode() {
            String str = this.userConsentConfigKey;
            if (str != null) {
                return str.hashCode();
            }
            return 0;
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("Params(userConsentConfigKey=");
            sb.append(this.userConsentConfigKey);
            sb.append(")");
            return sb.toString();
        }

        public setMax(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "userConsentConfigKey");
            this.userConsentConfigKey = str;
        }

        @NotNull
        public final String getUserConsentConfigKey() {
            return this.userConsentConfigKey;
        }

        public final void setUserConsentConfigKey(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.userConsentConfigKey = str;
        }
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> buildUseCaseObservable(@NotNull setMax setmax) {
        Intrinsics.checkNotNullParameter(setmax, "params");
        return this.ipgRepository.isClickedAgree(setmax.getUserConsentConfigKey());
    }
}
