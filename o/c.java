package o;

import com.alibaba.fastjson.JSONObject;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;

final class c implements RedDotDrawable {
    private final handleMessage length;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J&\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH&J&\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00032\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\tH&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000fÀ\u0006\u0001"}, d2 = {"Lid/dana/data/statement/repository/source/UserStatementEntityData;", "", "accumulateStatementDetail", "Lio/reactivex/Observable;", "Lid/dana/data/statement/repository/source/network/response/StatementDetailResult;", "timeStart", "", "timeEnd", "detailType", "", "accumulateStatementSummary", "Lid/dana/data/statement/repository/source/network/response/UserAccumulateQuerySummaryResult;", "date", "timeInterval", "summaryType", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
    /* renamed from: o.c$5  reason: invalid class name */
    public interface AnonymousClass5 {
        @NotNull
        TitleBarRightButtonView.AnonymousClass1<PackageDownloadRequest> setMax(long j, long j2, @NotNull String str);

        @NotNull
        TitleBarRightButtonView.AnonymousClass1<getFileName> setMin(@NotNull String str, @NotNull String str2, @NotNull String str3);
    }

    final class a implements Function1 {
        public static final a setMax = new a();

        public final Object invoke(Object obj) {
            return updateActionSheetContent.e(GriverExtensionRegistry.class.getSimpleName(), ((Throwable) obj).getMessage());
        }
    }

    public c(handleMessage handlemessage) {
        this.length = handlemessage;
    }

    public final Object apply(Object obj) {
        return this.length.convertJsonToSplashAnimationResult((JSONObject) obj);
    }
}
