package o;

import id.dana.contract.deeplink.path.FeatureParams;
import id.dana.domain.globalsearch.model.PaySearchInfo;
import id.dana.globalsearch.model.RecentAutoComplete;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u001e\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u001a&\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00070\u00022\u0006\u0010\b\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\t"}, d2 = {"toRecentAutoComplete", "", "", "Lid/dana/domain/globalsearch/model/PaySearchInfo;", "lists", "", "Lid/dana/globalsearch/model/RecentAutoComplete;", "", "keyword", "app_productionRelease"}, k = 2, mv = {1, 4, 2})
public final class getBridgeManifests {
    public static final void getMin(@NotNull List<String> list, @NotNull String str, @NotNull List<RecentAutoComplete> list2) {
        Intrinsics.checkNotNullParameter(list, "$this$toRecentAutoComplete");
        Intrinsics.checkNotNullParameter(str, FeatureParams.KEYWORD);
        Intrinsics.checkNotNullParameter(list2, "lists");
        Collection arrayList = new ArrayList();
        for (Object next : list) {
            if (StringsKt.contains$default((CharSequence) (String) next, (CharSequence) str, false, 2, (Object) null)) {
                arrayList.add(next);
            }
        }
        for (String recentAutoComplete : (List) arrayList) {
            list2.add(new RecentAutoComplete(recentAutoComplete, (String) null, "RECENT", 2, (DefaultConstructorMarker) null));
        }
    }

    public static final void getMax(@NotNull List<PaySearchInfo> list, @NotNull List<RecentAutoComplete> list2) {
        Intrinsics.checkNotNullParameter(list, "$this$toRecentAutoComplete");
        Intrinsics.checkNotNullParameter(list2, "lists");
        for (PaySearchInfo paySearchInfo : list) {
            list2.add(new RecentAutoComplete(paySearchInfo.getName(), paySearchInfo.getCategory(), "AUTOCOMPLETE"));
        }
    }
}
