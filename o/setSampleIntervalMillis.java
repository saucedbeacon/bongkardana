package o;

import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AppNode;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\nB\u000f\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\b2\u0006\u0010\t\u001a\u00020\u0003H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lid/dana/domain/statement/interactor/GetStatementSummary;", "Lid/dana/domain/core/usecase/BaseUseCase;", "Lid/dana/domain/statement/model/UserStatement;", "Lid/dana/domain/statement/interactor/GetStatementSummary$Params;", "userStatementRepository", "Lid/dana/domain/statement/UserStatementRepository;", "(Lid/dana/domain/statement/UserStatementRepository;)V", "buildUseCase", "Lio/reactivex/Observable;", "params", "Params", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class setSampleIntervalMillis extends APWebChromeClient<startScan, setMin> {
    private final getBackgroundFlag userStatementRepository;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public setSampleIntervalMillis(@NotNull getBackgroundFlag getbackgroundflag) {
        super((hasCornerMarking) null, (hasCornerMarking) null, 3, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(getbackgroundflag, "userStatementRepository");
        this.userStatementRepository = getbackgroundflag;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<startScan> buildUseCase(@NotNull setMin setmin) {
        Intrinsics.checkNotNullParameter(setmin, "params");
        return this.userStatementRepository.getStatementSummary(setmin.getDate(), setmin.getInterval(), setmin.getStatementType());
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u000b"}, d2 = {"Lid/dana/domain/statement/interactor/GetStatementSummary$Params;", "", "date", "", "interval", "statementType", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDate", "()Ljava/lang/String;", "getInterval", "getStatementType", "domain_release"}, k = 1, mv = {1, 4, 2})
    public static final class setMin {
        @NotNull
        private final String date;
        @NotNull
        private final String interval;
        @NotNull
        private final String statementType;

        public setMin(@NotNull String str, @NotNull String str2, @NotNull String str3) {
            Intrinsics.checkNotNullParameter(str, AppNode.AnonymousClass2.KEY_DATE);
            Intrinsics.checkNotNullParameter(str2, "interval");
            Intrinsics.checkNotNullParameter(str3, "statementType");
            this.date = str;
            this.interval = str2;
            this.statementType = str3;
        }

        @NotNull
        public final String getDate() {
            return this.date;
        }

        @NotNull
        public final String getInterval() {
            return this.interval;
        }

        @NotNull
        public final String getStatementType() {
            return this.statementType;
        }
    }
}
