package id.dana.globalsearch.tracker.model;

import androidx.annotation.Keep;
import id.dana.contract.deeplink.path.FeatureParams;
import id.dana.tracker.TrackerKey;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0004J\u0016\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0018J\u000e\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u001bJ\u0010\u0010\u0019\u001a\u00020\u00132\b\u0010\u001c\u001a\u0004\u0018\u00010\u0004R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001a\u0010\u000f\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\b¨\u0006\u001d"}, d2 = {"Lid/dana/globalsearch/tracker/model/SearchResultOpenTrackerModel;", "", "()V", "keywordResult", "", "getKeywordResult", "()Ljava/lang/String;", "setKeywordResult", "(Ljava/lang/String;)V", "keywordUsage", "getKeywordUsage", "setKeywordUsage", "resultStatus", "getResultStatus", "setResultStatus", "suggestionOrder", "getSuggestionOrder", "setSuggestionOrder", "setKeywordResultType", "", "keyword", "setKeywordUsageType", "autoCompleteType", "position", "", "setResultStatusType", "locationPermissionEnable", "", "errorMessage", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
@Keep
public final class SearchResultOpenTrackerModel {
    @NotNull
    private String keywordResult = "";
    @NotNull
    private String keywordUsage = "";
    @NotNull
    private String resultStatus = "";
    @NotNull
    private String suggestionOrder = "";

    @NotNull
    public final String getResultStatus() {
        return this.resultStatus;
    }

    public final void setResultStatus(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.resultStatus = str;
    }

    @NotNull
    public final String getKeywordUsage() {
        return this.keywordUsage;
    }

    public final void setKeywordUsage(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.keywordUsage = str;
    }

    @NotNull
    public final String getKeywordResult() {
        return this.keywordResult;
    }

    public final void setKeywordResult(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.keywordResult = str;
    }

    @NotNull
    public final String getSuggestionOrder() {
        return this.suggestionOrder;
    }

    public final void setSuggestionOrder(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.suggestionOrder = str;
    }

    public final void setResultStatusType(@Nullable String str) {
        this.resultStatus = Intrinsics.areEqual((Object) str, (Object) "003") ? TrackerKey.ResultStatusType.NO_RESULT_PAGE : TrackerKey.ResultStatusType.ERROR_PAGE;
    }

    public final void setResultStatusType(boolean z) {
        this.resultStatus = z ? TrackerKey.ResultStatusType.RESULT_WITH_LOCATION : TrackerKey.ResultStatusType.RESULT_NO_LOCATION;
    }

    public final void setKeywordUsageType(@NotNull String str, int i) {
        Intrinsics.checkNotNullParameter(str, "autoCompleteType");
        if (!Intrinsics.areEqual((Object) "RECENT", (Object) str)) {
            this.keywordUsage = TrackerKey.KeywordType.SUGGESTION;
            this.suggestionOrder = i != 0 ? i != 1 ? i != 2 ? i != 3 ? TrackerKey.SuggestionOrderType.ORDER_MORE_THAN_FOUR : TrackerKey.SuggestionOrderType.ORDER_FOUR : TrackerKey.SuggestionOrderType.ORDER_THREE : TrackerKey.SuggestionOrderType.ORDER_TWO : TrackerKey.SuggestionOrderType.ORDER_ONE;
            return;
        }
        this.keywordUsage = TrackerKey.KeywordType.HISTORY;
    }

    public final void setKeywordResultType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, FeatureParams.KEYWORD);
        this.keywordResult = str;
    }
}
