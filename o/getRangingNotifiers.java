package o;

import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000eB\u001f\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\f2\u0006\u0010\r\u001a\u00020\u0003H\u0014R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lid/dana/domain/sendmoney/interactor/InitWithdraw;", "Lid/dana/domain/UseCase;", "Lid/dana/domain/sendmoney/model/WithdrawInit;", "Lid/dana/domain/sendmoney/interactor/InitWithdraw$Param;", "threadExecutor", "Lid/dana/domain/ThreadExecutor;", "postExecutionThread", "Lid/dana/domain/PostExecutionThread;", "sendMoneyRepository", "Lid/dana/domain/sendmoney/repository/SendMoneyRepository;", "(Lid/dana/domain/ThreadExecutor;Lid/dana/domain/PostExecutionThread;Lid/dana/domain/sendmoney/repository/SendMoneyRepository;)V", "buildUseCaseObservable", "Lio/reactivex/Observable;", "params", "Param", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class getRangingNotifiers extends parseFailed<ensureMaxSize, setMin> {
    private final fromInt sendMoneyRepository;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public getRangingNotifiers(@NotNull appxLoadFailed appxloadfailed, @NotNull getScheme getscheme, @NotNull fromInt fromint) {
        super(appxloadfailed, getscheme);
        Intrinsics.checkNotNullParameter(appxloadfailed, "threadExecutor");
        Intrinsics.checkNotNullParameter(getscheme, "postExecutionThread");
        Intrinsics.checkNotNullParameter(fromint, "sendMoneyRepository");
        this.sendMoneyRepository = fromint;
    }

    /* access modifiers changed from: protected */
    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<ensureMaxSize> buildUseCaseObservable(@NotNull setMin setmin) {
        Intrinsics.checkNotNullParameter(setmin, "params");
        TitleBarRightButtonView.AnonymousClass1<ensureMaxSize> withdrawInit = this.sendMoneyRepository.withdrawInit(Boolean.valueOf(setmin.getNeedCertifiedUser()), setmin.getPayMethod());
        Intrinsics.checkNotNullExpressionValue(withdrawInit, "sendMoneyRepository.with…edUser, params.payMethod)");
        return withdrawInit;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, d2 = {"Lid/dana/domain/sendmoney/interactor/InitWithdraw$Param;", "", "needCertifiedUser", "", "payMethod", "", "(ZLjava/lang/String;)V", "getNeedCertifiedUser", "()Z", "getPayMethod", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "domain_release"}, k = 1, mv = {1, 4, 2})
    public static final class setMin {
        private final boolean needCertifiedUser;
        @NotNull
        private final String payMethod;

        public static /* synthetic */ setMin copy$default(setMin setmin, boolean z, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                z = setmin.needCertifiedUser;
            }
            if ((i & 2) != 0) {
                str = setmin.payMethod;
            }
            return setmin.copy(z, str);
        }

        public final boolean component1() {
            return this.needCertifiedUser;
        }

        @NotNull
        public final String component2() {
            return this.payMethod;
        }

        @NotNull
        public final setMin copy(boolean z, @NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "payMethod");
            return new setMin(z, str);
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof setMin)) {
                return false;
            }
            setMin setmin = (setMin) obj;
            return this.needCertifiedUser == setmin.needCertifiedUser && Intrinsics.areEqual((Object) this.payMethod, (Object) setmin.payMethod);
        }

        public final int hashCode() {
            boolean z = this.needCertifiedUser;
            if (z) {
                z = true;
            }
            int i = (z ? 1 : 0) * true;
            String str = this.payMethod;
            return i + (str != null ? str.hashCode() : 0);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("Param(needCertifiedUser=");
            sb.append(this.needCertifiedUser);
            sb.append(", payMethod=");
            sb.append(this.payMethod);
            sb.append(")");
            return sb.toString();
        }

        public setMin(boolean z, @NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "payMethod");
            this.needCertifiedUser = z;
            this.payMethod = str;
        }

        public final boolean getNeedCertifiedUser() {
            return this.needCertifiedUser;
        }

        @NotNull
        public final String getPayMethod() {
            return this.payMethod;
        }
    }
}
