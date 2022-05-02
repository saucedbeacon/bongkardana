package o;

import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\nB\u000f\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\b2\u0006\u0010\t\u001a\u00020\u0003H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lid/dana/domain/kycrenewal/interactor/SaveKycRenewalCheckShow;", "Lid/dana/domain/core/usecase/BaseUseCase;", "", "Lid/dana/domain/kycrenewal/interactor/SaveKycRenewalCheckShow$Param;", "kycRenewalRepository", "Lid/dana/domain/kycrenewal/KycRenewalRepository;", "(Lid/dana/domain/kycrenewal/KycRenewalRepository;)V", "buildUseCase", "Lio/reactivex/Observable;", "params", "Param", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class newThread extends APWebChromeClient<Boolean, length> {
    private final AbstractPriorityRunnable kycRenewalRepository;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public newThread(@NotNull AbstractPriorityRunnable abstractPriorityRunnable) {
        super((hasCornerMarking) null, (hasCornerMarking) null, 3, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(abstractPriorityRunnable, "kycRenewalRepository");
        this.kycRenewalRepository = abstractPriorityRunnable;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> buildUseCase(@NotNull length length2) {
        Intrinsics.checkNotNullParameter(length2, "params");
        return this.kycRenewalRepository.saveShowKYCRenewalDialog(length2.getShow(), length2.getTimeStamp());
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lid/dana/domain/kycrenewal/interactor/SaveKycRenewalCheckShow$Param;", "", "show", "", "timeStamp", "", "(ZJ)V", "getShow", "()Z", "getTimeStamp", "()J", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "domain_release"}, k = 1, mv = {1, 4, 2})
    public static final class length {
        private final boolean show;
        private final long timeStamp;

        public static /* synthetic */ length copy$default(length length, boolean z, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                z = length.show;
            }
            if ((i & 2) != 0) {
                j = length.timeStamp;
            }
            return length.copy(z, j);
        }

        public final boolean component1() {
            return this.show;
        }

        public final long component2() {
            return this.timeStamp;
        }

        @NotNull
        public final length copy(boolean z, long j) {
            return new length(z, j);
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof length)) {
                return false;
            }
            length length = (length) obj;
            return this.show == length.show && this.timeStamp == length.timeStamp;
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("Param(show=");
            sb.append(this.show);
            sb.append(", timeStamp=");
            sb.append(this.timeStamp);
            sb.append(")");
            return sb.toString();
        }

        public length(boolean z, long j) {
            this.show = z;
            this.timeStamp = j;
        }

        public final boolean getShow() {
            return this.show;
        }

        public final long getTimeStamp() {
            return this.timeStamp;
        }

        public final int hashCode() {
            boolean z = this.show;
            if (z) {
                z = true;
            }
            return ((z ? 1 : 0) * true) + Long.valueOf(this.timeStamp).hashCode();
        }
    }
}
