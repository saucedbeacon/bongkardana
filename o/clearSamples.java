package o;

import id.dana.domain.statement.StatementType;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\nB\u000f\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\b2\u0006\u0010\t\u001a\u00020\u0003H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lid/dana/domain/statement/interactor/GetStatementDetail;", "Lid/dana/domain/core/usecase/BaseUseCase;", "Lid/dana/domain/statement/model/UserStatementDetail;", "Lid/dana/domain/statement/interactor/GetStatementDetail$Params;", "userStatementRepository", "Lid/dana/domain/statement/UserStatementRepository;", "(Lid/dana/domain/statement/UserStatementRepository;)V", "buildUseCase", "Lio/reactivex/Observable;", "params", "Params", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class clearSamples extends APWebChromeClient<deferScanIfNeeded, getMin> {
    private final getBackgroundFlag userStatementRepository;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public clearSamples(@NotNull getBackgroundFlag getbackgroundflag) {
        super((hasCornerMarking) null, (hasCornerMarking) null, 3, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(getbackgroundflag, "userStatementRepository");
        this.userStatementRepository = getbackgroundflag;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<deferScanIfNeeded> buildUseCase(@NotNull getMin getmin) {
        Intrinsics.checkNotNullParameter(getmin, "params");
        return this.userStatementRepository.getStatementDetail(getmin.getDateStart(), getmin.getDateEnd(), getmin.getStatementType());
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0018"}, d2 = {"Lid/dana/domain/statement/interactor/GetStatementDetail$Params;", "", "dateStart", "", "dateEnd", "statementType", "Lid/dana/domain/statement/StatementType;", "(JJLid/dana/domain/statement/StatementType;)V", "getDateEnd", "()J", "getDateStart", "getStatementType", "()Lid/dana/domain/statement/StatementType;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "domain_release"}, k = 1, mv = {1, 4, 2})
    public static final class getMin {
        private final long dateEnd;
        private final long dateStart;
        @NotNull
        private final StatementType statementType;

        public static /* synthetic */ getMin copy$default(getMin getmin, long j, long j2, StatementType statementType2, int i, Object obj) {
            if ((i & 1) != 0) {
                j = getmin.dateStart;
            }
            long j3 = j;
            if ((i & 2) != 0) {
                j2 = getmin.dateEnd;
            }
            long j4 = j2;
            if ((i & 4) != 0) {
                statementType2 = getmin.statementType;
            }
            return getmin.copy(j3, j4, statementType2);
        }

        public final long component1() {
            return this.dateStart;
        }

        public final long component2() {
            return this.dateEnd;
        }

        @NotNull
        public final StatementType component3() {
            return this.statementType;
        }

        @NotNull
        public final getMin copy(long j, long j2, @NotNull StatementType statementType2) {
            Intrinsics.checkNotNullParameter(statementType2, "statementType");
            return new getMin(j, j2, statementType2);
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof getMin)) {
                return false;
            }
            getMin getmin = (getMin) obj;
            return this.dateStart == getmin.dateStart && this.dateEnd == getmin.dateEnd && Intrinsics.areEqual((Object) this.statementType, (Object) getmin.statementType);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("Params(dateStart=");
            sb.append(this.dateStart);
            sb.append(", dateEnd=");
            sb.append(this.dateEnd);
            sb.append(", statementType=");
            sb.append(this.statementType);
            sb.append(")");
            return sb.toString();
        }

        public getMin(long j, long j2, @NotNull StatementType statementType2) {
            Intrinsics.checkNotNullParameter(statementType2, "statementType");
            this.dateStart = j;
            this.dateEnd = j2;
            this.statementType = statementType2;
        }

        public final long getDateStart() {
            return this.dateStart;
        }

        public final long getDateEnd() {
            return this.dateEnd;
        }

        @NotNull
        public final StatementType getStatementType() {
            return this.statementType;
        }

        public final int hashCode() {
            int hashCode = ((Long.valueOf(this.dateStart).hashCode() * 31) + Long.valueOf(this.dateEnd).hashCode()) * 31;
            StatementType statementType2 = this.statementType;
            return hashCode + (statementType2 != null ? statementType2.hashCode() : 0);
        }
    }
}
