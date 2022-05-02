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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u000bB\u000f\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u001c\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\t2\u0006\u0010\n\u001a\u00020\u0004H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lid/dana/domain/statement/interactor/GetTotalStatements;", "Lid/dana/domain/core/usecase/BaseUseCase;", "", "Lid/dana/domain/statement/model/TotalStatement;", "Lid/dana/domain/statement/interactor/GetTotalStatements$Params;", "userStatementRepository", "Lid/dana/domain/statement/UserStatementRepository;", "(Lid/dana/domain/statement/UserStatementRepository;)V", "buildUseCase", "Lio/reactivex/Observable;", "params", "Params", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class setLongScanForcingEnabled extends APWebChromeClient<List<? extends stopScan>, setMin> {
    private final getBackgroundFlag userStatementRepository;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "Ljava/util/ArrayList;", "Lid/dana/domain/statement/model/TotalStatement;", "Lkotlin/collections/ArrayList;", "income", "Lid/dana/domain/statement/model/UserStatement;", "expense", "apply"}, k = 3, mv = {1, 4, 2})
    static final class getMax<T1, T2, R> implements removeNode<startScan, startScan, ArrayList<stopScan>> {
        public static final getMax length = new getMax();

        getMax() {
        }

        public final /* synthetic */ Object setMax(Object obj, Object obj2) {
            startScan startscan = (startScan) obj;
            startScan startscan2 = (startScan) obj2;
            Intrinsics.checkNotNullParameter(startscan, "income");
            Intrinsics.checkNotNullParameter(startscan2, "expense");
            ArrayList arrayList = new ArrayList();
            StatementType statementType = StatementType.INCOME;
            String amount = startscan.getAccumulateAmount().getAmount();
            Intrinsics.checkNotNullExpressionValue(amount, "income.accumulateAmount.amount");
            String currency = startscan.getAccumulateAmount().getCurrency();
            Intrinsics.checkNotNullExpressionValue(currency, "income.accumulateAmount.currency");
            arrayList.add(new stopScan(statementType, amount, currency));
            StatementType statementType2 = StatementType.EXPENSE;
            String amount2 = startscan2.getAccumulateAmount().getAmount();
            Intrinsics.checkNotNullExpressionValue(amount2, "expense.accumulateAmount.amount");
            String currency2 = startscan2.getAccumulateAmount().getCurrency();
            Intrinsics.checkNotNullExpressionValue(currency2, "expense.accumulateAmount.currency");
            arrayList.add(new stopScan(statementType2, amount2, currency2));
            return arrayList;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public setLongScanForcingEnabled(@NotNull getBackgroundFlag getbackgroundflag) {
        super((hasCornerMarking) null, (hasCornerMarking) null, 3, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(getbackgroundflag, "userStatementRepository");
        this.userStatementRepository = getbackgroundflag;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<List<stopScan>> buildUseCase(@NotNull setMin setmin) {
        Intrinsics.checkNotNullParameter(setmin, "params");
        TitleBarRightButtonView.AnonymousClass1<R> zipWith = this.userStatementRepository.getStatementSummary(setmin.getDate(), setmin.getInterval(), StatementType.INCOME.toString()).zipWith(this.userStatementRepository.getStatementSummary(setmin.getDate(), setmin.getInterval(), StatementType.EXPENSE.toString()), getMax.length);
        Intrinsics.checkNotNullExpressionValue(zipWith, "userStatementRepository.…          }\n            )");
        return zipWith;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\t"}, d2 = {"Lid/dana/domain/statement/interactor/GetTotalStatements$Params;", "", "date", "", "interval", "(Ljava/lang/String;Ljava/lang/String;)V", "getDate", "()Ljava/lang/String;", "getInterval", "domain_release"}, k = 1, mv = {1, 4, 2})
    public static final class setMin {
        @NotNull
        private final String date;
        @NotNull
        private final String interval;

        public setMin(@NotNull String str, @NotNull String str2) {
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
