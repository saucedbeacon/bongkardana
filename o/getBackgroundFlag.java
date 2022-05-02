package o;

import id.dana.domain.statement.StatementType;
import kotlin.Metadata;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J&\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH&J&\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00032\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0010À\u0006\u0001"}, d2 = {"Lid/dana/domain/statement/UserStatementRepository;", "", "getStatementDetail", "Lio/reactivex/Observable;", "Lid/dana/domain/statement/model/UserStatementDetail;", "dateStart", "", "dateEnd", "detailStatementType", "Lid/dana/domain/statement/StatementType;", "getStatementSummary", "Lid/dana/domain/statement/model/UserStatement;", "date", "", "timeInterval", "summaryStatementType", "domain_release"}, k = 1, mv = {1, 4, 2})
public interface getBackgroundFlag {
    @NotNull
    TitleBarRightButtonView.AnonymousClass1<deferScanIfNeeded> getStatementDetail(long j, long j2, @NotNull StatementType statementType);

    @NotNull
    TitleBarRightButtonView.AnonymousClass1<startScan> getStatementSummary(@NotNull String str, @NotNull String str2, @NotNull String str3);
}
