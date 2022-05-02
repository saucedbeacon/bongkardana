package o;

import android.content.Context;
import com.ap.zoloz.hummer.biz.HummerConstants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001e\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00012\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, d2 = {"toFeedViewModelList", "", "Lid/dana/social/model/SocialFeedModel;", "Lid/dana/domain/social/model/ActivityResponse;", "context", "Landroid/content/Context;", "app_productionRelease"}, k = 2, mv = {1, 4, 2})
public final class getSelectedView {
    @NotNull
    public static final List<access$2502> getMax(@NotNull List<RssiFilter> list, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(list, "$this$toFeedViewModelList");
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        Iterable<RssiFilter> iterable = list;
        Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
        for (RssiFilter rssiFilter : iterable) {
            Intrinsics.checkNotNullParameter(rssiFilter, "$this$toSocialFeedModel");
            Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
            arrayList.add(new access$2502(rssiFilter.getId(), rssiFilter.getIconUrl(), rssiFilter.getContent(), rssiFilter.getRedirectType(), rssiFilter.getRedirectValue(), rssiFilter.getExtendInfo(), Long.valueOf(rssiFilter.getCreatedTime()), rssiFilter.getContentType()));
        }
        return (List) arrayList;
    }
}
