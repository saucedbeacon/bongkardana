package o;

import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000eB\u001f\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\f2\u0006\u0010\r\u001a\u00020\u0003H\u0016R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lid/dana/domain/ipg/interactor/SaveIpgClickedAgree;", "Lid/dana/domain/UseCase;", "", "Lid/dana/domain/ipg/interactor/SaveIpgClickedAgree$Params;", "threadExecutor", "Lid/dana/domain/ThreadExecutor;", "postExecutionThread", "Lid/dana/domain/PostExecutionThread;", "ipgRepository", "Lid/dana/domain/ipg/IpgRepository;", "(Lid/dana/domain/ThreadExecutor;Lid/dana/domain/PostExecutionThread;Lid/dana/domain/ipg/IpgRepository;)V", "buildUseCaseObservable", "Lio/reactivex/Observable;", "params", "Params", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class setDebuggable extends parseFailed<Boolean, getMax> {
    private final setEnvironment ipgRepository;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public setDebuggable(@NotNull appxLoadFailed appxloadfailed, @NotNull getScheme getscheme, @NotNull setEnvironment setenvironment) {
        super(appxloadfailed, getscheme);
        Intrinsics.checkNotNullParameter(appxloadfailed, "threadExecutor");
        Intrinsics.checkNotNullParameter(getscheme, "postExecutionThread");
        Intrinsics.checkNotNullParameter(setenvironment, "ipgRepository");
        this.ipgRepository = setenvironment;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\t¨\u0006\u0015"}, d2 = {"Lid/dana/domain/ipg/interactor/SaveIpgClickedAgree$Params;", "", "userConsentConfigKey", "", "userConsentSyncKey", "(Ljava/lang/String;Ljava/lang/String;)V", "getUserConsentConfigKey", "()Ljava/lang/String;", "setUserConsentConfigKey", "(Ljava/lang/String;)V", "getUserConsentSyncKey", "setUserConsentSyncKey", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "domain_release"}, k = 1, mv = {1, 4, 2})
    public static final class getMax {
        @NotNull
        private String userConsentConfigKey;
        @NotNull
        private String userConsentSyncKey;

        public static /* synthetic */ getMax copy$default(getMax getmax, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = getmax.userConsentConfigKey;
            }
            if ((i & 2) != 0) {
                str2 = getmax.userConsentSyncKey;
            }
            return getmax.copy(str, str2);
        }

        @NotNull
        public final String component1() {
            return this.userConsentConfigKey;
        }

        @NotNull
        public final String component2() {
            return this.userConsentSyncKey;
        }

        @NotNull
        public final getMax copy(@NotNull String str, @NotNull String str2) {
            Intrinsics.checkNotNullParameter(str, "userConsentConfigKey");
            Intrinsics.checkNotNullParameter(str2, "userConsentSyncKey");
            return new getMax(str, str2);
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof getMax)) {
                return false;
            }
            getMax getmax = (getMax) obj;
            return Intrinsics.areEqual((Object) this.userConsentConfigKey, (Object) getmax.userConsentConfigKey) && Intrinsics.areEqual((Object) this.userConsentSyncKey, (Object) getmax.userConsentSyncKey);
        }

        public final int hashCode() {
            String str = this.userConsentConfigKey;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.userConsentSyncKey;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return hashCode + i;
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("Params(userConsentConfigKey=");
            sb.append(this.userConsentConfigKey);
            sb.append(", userConsentSyncKey=");
            sb.append(this.userConsentSyncKey);
            sb.append(")");
            return sb.toString();
        }

        public getMax(@NotNull String str, @NotNull String str2) {
            Intrinsics.checkNotNullParameter(str, "userConsentConfigKey");
            Intrinsics.checkNotNullParameter(str2, "userConsentSyncKey");
            this.userConsentConfigKey = str;
            this.userConsentSyncKey = str2;
        }

        @NotNull
        public final String getUserConsentConfigKey() {
            return this.userConsentConfigKey;
        }

        public final void setUserConsentConfigKey(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.userConsentConfigKey = str;
        }

        @NotNull
        public final String getUserConsentSyncKey() {
            return this.userConsentSyncKey;
        }

        public final void setUserConsentSyncKey(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.userConsentSyncKey = str;
        }
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> buildUseCaseObservable(@NotNull getMax getmax) {
        Intrinsics.checkNotNullParameter(getmax, "params");
        return this.ipgRepository.saveClickedAgree(getmax.getUserConsentConfigKey(), getmax.getUserConsentSyncKey());
    }
}
