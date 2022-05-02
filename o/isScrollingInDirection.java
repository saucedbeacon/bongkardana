package o;

import android.content.ContentResolver;
import id.dana.sendmoney.model.RecentBankModel;
import id.dana.sendmoney.model.RecipientViewModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import o.OverScrollerCopyed;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0014\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a0\u0018H\u0016J\u000e\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u001cH\u0016J\u000e\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001a0\u001cH\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR \u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\n\"\u0004\b\u0016\u0010\f¨\u0006\u001e"}, d2 = {"Lid/dana/sendmoney_v2/recipient/datasource/BankDataSourceFactory;", "Lid/dana/sendmoney_v2/recipient/datasource/RecipientDataSourceFactory;", "contentResolver", "Landroid/content/ContentResolver;", "(Landroid/content/ContentResolver;)V", "getContentResolver", "()Landroid/content/ContentResolver;", "emptyBankSearchResult", "", "getEmptyBankSearchResult", "()Z", "setEmptyBankSearchResult", "(Z)V", "recentBankModels", "", "Lid/dana/sendmoney/model/RecentBankModel;", "getRecentBankModels", "()Ljava/util/List;", "setRecentBankModels", "(Ljava/util/List;)V", "showAllBank", "getShowAllBank", "setShowAllBank", "create", "Landroidx/paging/DataSource;", "", "Lid/dana/sendmoney/model/RecipientViewModel;", "getItemsToBeDisplayed", "", "getRecipient", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class isScrollingInDirection extends OverScrollerCopyed.SplineOverScroller {
    @NotNull
    public List<RecentBankModel> getMin = CollectionsKt.emptyList();
    public boolean length;
    @NotNull
    private final ContentResolver setMin;

    public isScrollingInDirection(@NotNull ContentResolver contentResolver) {
        Intrinsics.checkNotNullParameter(contentResolver, "contentResolver");
        this.setMin = contentResolver;
    }

    @NotNull
    public final removeItemAtInt<Integer, RecipientViewModel> setMin() {
        return new acquirePermissions(new setFinalPosition(new notifyEdgeReached(new continueWhenFinished(new getMediaSubType(), false), 10, false, getMin()), this.getMin, getMax(), getMin()).getMin());
    }
}
