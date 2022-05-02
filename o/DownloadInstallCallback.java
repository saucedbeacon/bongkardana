package o;

import com.alipay.ap.mobileprod.service.facade.uniresultpage.model.MoneyView;
import com.alipayplus.mobile.component.domain.model.result.BaseRpcResult;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.AppNode;
import o.TitleBarRightButtonView;
import o.c;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J&\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\nH\u0016J&\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00042\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\nH\u0016J\b\u0010\u0010\u001a\u00020\u0011H\u0002¨\u0006\u0012"}, d2 = {"Lid/dana/data/statement/repository/source/mock/MockUserStatementEntityData;", "Lid/dana/data/statement/repository/source/UserStatementEntityData;", "()V", "accumulateStatementDetail", "Lio/reactivex/Observable;", "Lid/dana/data/statement/repository/source/network/response/StatementDetailResult;", "timeStart", "", "timeEnd", "detailType", "", "accumulateStatementSummary", "Lid/dana/data/statement/repository/source/network/response/UserAccumulateQuerySummaryResult;", "date", "timeInterval", "summaryType", "getRandomAmount", "Lcom/alipay/ap/mobileprod/service/facade/uniresultpage/model/MoneyView;", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class DownloadInstallCallback implements c.AnonymousClass5 {
    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<getFileName> setMin(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, AppNode.AnonymousClass2.KEY_DATE);
        Intrinsics.checkNotNullParameter(str2, "timeInterval");
        Intrinsics.checkNotNullParameter(str3, "summaryType");
        TitleBarRightButtonView.AnonymousClass1<getFileName> just = TitleBarRightButtonView.AnonymousClass1.just(new getFileName(new MoneyView(), new ArrayList()));
        Intrinsics.checkNotNullExpressionValue(just, "Observable.just(\n       …oneyView(), ArrayList()))");
        return just;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<PackageDownloadRequest> setMax(long j, long j2, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "detailType");
        ArrayList arrayList = new ArrayList();
        arrayList.add(new BaseRpcResult(1588266000000L, getMax()) {
            @NotNull
            private final MoneyView amount;
            private final long date;

            public final long getDate() {
                return this.date;
            }

            @NotNull
            public final MoneyView getAmount() {
                return this.amount;
            }

            {
                Intrinsics.checkNotNullParameter(r4, "amount");
                this.date = r2;
                this.amount = r4;
            }
        });
        arrayList.add(new BaseRpcResult(1588352400000L, getMax()) {
            @NotNull
            private final MoneyView amount;
            private final long date;

            public final long getDate() {
                return this.date;
            }

            @NotNull
            public final MoneyView getAmount() {
                return this.amount;
            }

            {
                Intrinsics.checkNotNullParameter(r4, "amount");
                this.date = r2;
                this.amount = r4;
            }
        });
        arrayList.add(new BaseRpcResult(1588438800000L, getMax()) {
            @NotNull
            private final MoneyView amount;
            private final long date;

            public final long getDate() {
                return this.date;
            }

            @NotNull
            public final MoneyView getAmount() {
                return this.amount;
            }

            {
                Intrinsics.checkNotNullParameter(r4, "amount");
                this.date = r2;
                this.amount = r4;
            }
        });
        arrayList.add(new BaseRpcResult(1588525200000L, getMax()) {
            @NotNull
            private final MoneyView amount;
            private final long date;

            public final long getDate() {
                return this.date;
            }

            @NotNull
            public final MoneyView getAmount() {
                return this.amount;
            }

            {
                Intrinsics.checkNotNullParameter(r4, "amount");
                this.date = r2;
                this.amount = r4;
            }
        });
        arrayList.add(new BaseRpcResult(1588611600000L, getMax()) {
            @NotNull
            private final MoneyView amount;
            private final long date;

            public final long getDate() {
                return this.date;
            }

            @NotNull
            public final MoneyView getAmount() {
                return this.amount;
            }

            {
                Intrinsics.checkNotNullParameter(r4, "amount");
                this.date = r2;
                this.amount = r4;
            }
        });
        arrayList.add(new BaseRpcResult(1588698000000L, getMax()) {
            @NotNull
            private final MoneyView amount;
            private final long date;

            public final long getDate() {
                return this.date;
            }

            @NotNull
            public final MoneyView getAmount() {
                return this.amount;
            }

            {
                Intrinsics.checkNotNullParameter(r4, "amount");
                this.date = r2;
                this.amount = r4;
            }
        });
        arrayList.add(new BaseRpcResult(1588784400000L, getMax()) {
            @NotNull
            private final MoneyView amount;
            private final long date;

            public final long getDate() {
                return this.date;
            }

            @NotNull
            public final MoneyView getAmount() {
                return this.amount;
            }

            {
                Intrinsics.checkNotNullParameter(r4, "amount");
                this.date = r2;
                this.amount = r4;
            }
        });
        arrayList.add(new BaseRpcResult(1588870800000L, getMax()) {
            @NotNull
            private final MoneyView amount;
            private final long date;

            public final long getDate() {
                return this.date;
            }

            @NotNull
            public final MoneyView getAmount() {
                return this.amount;
            }

            {
                Intrinsics.checkNotNullParameter(r4, "amount");
                this.date = r2;
                this.amount = r4;
            }
        });
        arrayList.add(new BaseRpcResult(1588957200000L, getMax()) {
            @NotNull
            private final MoneyView amount;
            private final long date;

            public final long getDate() {
                return this.date;
            }

            @NotNull
            public final MoneyView getAmount() {
                return this.amount;
            }

            {
                Intrinsics.checkNotNullParameter(r4, "amount");
                this.date = r2;
                this.amount = r4;
            }
        });
        arrayList.add(new BaseRpcResult(1589043600000L, getMax()) {
            @NotNull
            private final MoneyView amount;
            private final long date;

            public final long getDate() {
                return this.date;
            }

            @NotNull
            public final MoneyView getAmount() {
                return this.amount;
            }

            {
                Intrinsics.checkNotNullParameter(r4, "amount");
                this.date = r2;
                this.amount = r4;
            }
        });
        arrayList.add(new BaseRpcResult(1589130000000L, getMax()) {
            @NotNull
            private final MoneyView amount;
            private final long date;

            public final long getDate() {
                return this.date;
            }

            @NotNull
            public final MoneyView getAmount() {
                return this.amount;
            }

            {
                Intrinsics.checkNotNullParameter(r4, "amount");
                this.date = r2;
                this.amount = r4;
            }
        });
        arrayList.add(new BaseRpcResult(1589216400000L, getMax()) {
            @NotNull
            private final MoneyView amount;
            private final long date;

            public final long getDate() {
                return this.date;
            }

            @NotNull
            public final MoneyView getAmount() {
                return this.amount;
            }

            {
                Intrinsics.checkNotNullParameter(r4, "amount");
                this.date = r2;
                this.amount = r4;
            }
        });
        arrayList.add(new BaseRpcResult(1589302800000L, getMax()) {
            @NotNull
            private final MoneyView amount;
            private final long date;

            public final long getDate() {
                return this.date;
            }

            @NotNull
            public final MoneyView getAmount() {
                return this.amount;
            }

            {
                Intrinsics.checkNotNullParameter(r4, "amount");
                this.date = r2;
                this.amount = r4;
            }
        });
        TitleBarRightButtonView.AnonymousClass1<PackageDownloadRequest> just = TitleBarRightButtonView.AnonymousClass1.just(new PackageDownloadRequest(arrayList));
        Intrinsics.checkNotNullExpressionValue(just, "Observable.just(StatementDetailResult(details))");
        return just;
    }

    private static MoneyView getMax() {
        MoneyView moneyView = new MoneyView();
        moneyView.currency = "Rp";
        moneyView.currencyCode = "IDR";
        moneyView.amount = String.valueOf(setEntryInfo.randomInt(5000));
        return moneyView;
    }
}
