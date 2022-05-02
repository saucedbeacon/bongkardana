package id.dana.globalsearch.model;

import androidx.annotation.Keep;
import id.dana.contract.deeplink.path.FeatureParams;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007R\u001a\u0010\t\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u00020\n8FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000e¨\u0006\u0012"}, d2 = {"Lid/dana/globalsearch/model/SearchPerCategoryRequestModel;", "", "keyword", "", "category", "(Ljava/lang/String;Ljava/lang/String;)V", "getCategory", "()Ljava/lang/String;", "getKeyword", "maxPage", "", "getMaxPage", "()I", "setMaxPage", "(I)V", "page", "getPage", "setPage", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
@Keep
public final class SearchPerCategoryRequestModel {
    @NotNull
    private final String category;
    @NotNull
    private final String keyword;
    private int maxPage;
    private int page = 1;

    public SearchPerCategoryRequestModel(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, FeatureParams.KEYWORD);
        Intrinsics.checkNotNullParameter(str2, "category");
        this.keyword = str;
        this.category = str2;
    }

    @NotNull
    public final String getKeyword() {
        return this.keyword;
    }

    @NotNull
    public final String getCategory() {
        return this.category;
    }

    public final void setPage(int i) {
        this.page = i;
    }

    public final int getPage() {
        int i = this.page;
        this.page = i + 1;
        return i;
    }

    public final int getMaxPage() {
        return this.maxPage;
    }

    public final void setMaxPage(int i) {
        int max = dispatchOnCancelled.setMax(i);
        if (i != max) {
            onCanceled oncanceled = new onCanceled(i, max, 1);
            onCancelLoad.setMax(492905868, oncanceled);
            onCancelLoad.getMin(492905868, oncanceled);
        }
        this.maxPage = i;
    }
}
