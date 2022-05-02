package o;

import id.dana.domain.statement.StatementType;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AppNode;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u0010B\u000f\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u001c\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\t2\u0006\u0010\n\u001a\u00020\u0004H\u0016J\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0018\u0010\u000f\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000eH\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lid/dana/domain/statement/interactor/GetAllStatementSummary;", "Lid/dana/domain/core/usecase/BaseUseCase;", "", "Lid/dana/domain/statement/model/UserStatement;", "Lid/dana/domain/statement/interactor/GetAllStatementSummary$Params;", "userStatementRepository", "Lid/dana/domain/statement/UserStatementRepository;", "(Lid/dana/domain/statement/UserStatementRepository;)V", "buildUseCase", "Lio/reactivex/Observable;", "params", "createSummaryFeeder", "statement", "statementType", "Lid/dana/domain/statement/StatementType;", "createSummaryHeader", "Params", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class setLoggingEnabled extends APWebChromeClient<List<? extends startScan>, getMax> {
    private final getBackgroundFlag userStatementRepository;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Lid/dana/domain/statement/model/UserStatement;", "income", "expense", "apply"}, k = 3, mv = {1, 4, 2})
    static final class setMax<T1, T2, R> implements removeNode<startScan, startScan, List<startScan>> {
        final /* synthetic */ setLoggingEnabled setMax;

        setMax(setLoggingEnabled setloggingenabled) {
            this.setMax = setloggingenabled;
        }

        public final /* synthetic */ Object setMax(Object obj, Object obj2) {
            startScan startscan = (startScan) obj;
            startScan startscan2 = (startScan) obj2;
            Intrinsics.checkNotNullParameter(startscan, "income");
            Intrinsics.checkNotNullParameter(startscan2, "expense");
            List arrayList = new ArrayList();
            arrayList.add(this.setMax.createSummaryHeader(startscan, StatementType.INCOME));
            arrayList.add(this.setMax.createSummaryFeeder(startscan, StatementType.INCOME));
            arrayList.add(this.setMax.createSummaryHeader(startscan2, StatementType.EXPENSE));
            arrayList.add(this.setMax.createSummaryFeeder(startscan2, StatementType.EXPENSE));
            return arrayList;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public setLoggingEnabled(@NotNull getBackgroundFlag getbackgroundflag) {
        super((hasCornerMarking) null, (hasCornerMarking) null, 3, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(getbackgroundflag, "userStatementRepository");
        this.userStatementRepository = getbackgroundflag;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<List<startScan>> buildUseCase(@NotNull getMax getmax) {
        Intrinsics.checkNotNullParameter(getmax, "params");
        TitleBarRightButtonView.AnonymousClass1<R> zipWith = this.userStatementRepository.getStatementSummary(getmax.getDate(), getmax.getInterval(), StatementType.INCOME.name()).zipWith(this.userStatementRepository.getStatementSummary(getmax.getDate(), getmax.getInterval(), StatementType.EXPENSE.name()), new setMax(this));
        Intrinsics.checkNotNullExpressionValue(zipWith, "userStatementRepository.…tSummaries\n            })");
        return zipWith;
    }

    /* access modifiers changed from: private */
    public final startScan createSummaryHeader(startScan startscan, StatementType statementType) {
        return new startScan(startscan.getAccumulateAmount(), startscan.getUserStatement(), statementType.name(), 0);
    }

    /* access modifiers changed from: private */
    public final startScan createSummaryFeeder(startScan startscan, StatementType statementType) {
        return new startScan(startscan.getAccumulateAmount(), startscan.getUserStatement(), statementType.name(), 1);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\t"}, d2 = {"Lid/dana/domain/statement/interactor/GetAllStatementSummary$Params;", "", "date", "", "interval", "(Ljava/lang/String;Ljava/lang/String;)V", "getDate", "()Ljava/lang/String;", "getInterval", "domain_release"}, k = 1, mv = {1, 4, 2})
    public static final class getMax {
        @NotNull
        private final String date;
        @NotNull
        private final String interval;

        public getMax(@NotNull String str, @NotNull String str2) {
            Intrinsics.checkNotNullParameter(str, AppNode.AnonymousClass2.KEY_DATE);
            Intrinsics.checkNotNullParameter(str2, "interval");
            this.date = str;
            this.interval = str2;
        }

        @NotNull
        public final String getDate() {
            return this.date;
        }

        @NotNull
        public final String getInterval() {
            return this.interval;
        }
    }
}
