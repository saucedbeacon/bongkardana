package o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004*\b\u0012\u0004\u0012\u00020\u00020\u0004¨\u0006\u0005"}, d2 = {"toSocialLink", "Lid/dana/domain/sendmoney/x2l/model/SocialLink;", "Lid/dana/data/sendmoney/x2l/model/SocialLinkEntity;", "toSocialLinks", "", "data_productionRelease"}, k = 2, mv = {1, 4, 2})
public final class getSingletonServiceBeanManager {
    @NotNull
    public static final fromBytes toSocialLink(@NotNull IPCContextManager iPCContextManager) {
        Intrinsics.checkNotNullParameter(iPCContextManager, "$this$toSocialLink");
        String title = iPCContextManager.getTitle();
        String str = "";
        if (title == null) {
            title = str;
        }
        String subTitle = iPCContextManager.getSubTitle();
        if (subTitle == null) {
            subTitle = str;
        }
        String action = iPCContextManager.getAction();
        if (action == null) {
            action = str;
        }
        String icon = iPCContextManager.getIcon();
        if (icon != null) {
            str = icon;
        }
        return new fromBytes(title, subTitle, action, str);
    }

    @NotNull
    public static final List<fromBytes> toSocialLinks(@NotNull List<IPCContextManager> list) {
        Intrinsics.checkNotNullParameter(list, "$this$toSocialLinks");
        Iterable<IPCContextManager> iterable = list;
        Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
        for (IPCContextManager socialLink : iterable) {
            arrayList.add(toSocialLink(socialLink));
        }
        return (List) arrayList;
    }
}
