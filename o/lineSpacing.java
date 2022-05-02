package o;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.listItems;
import o.updateListItems;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0002\u001a\u0010\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004*\u00020\u0005¨\u0006\u0006"}, d2 = {"toAnnouncement", "Lid/dana/domain/announcement/model/Announcement;", "Lid/dana/data/announcement/model/AnnouncementEntity;", "toListAnnouncement", "", "Lid/dana/data/announcement/repository/source/network/result/AnnouncementResult;", "data_productionRelease"}, k = 2, mv = {1, 4, 2})
public final class lineSpacing {
    @NotNull
    public static final List<getIcontype> toListAnnouncement(@NotNull populateText populatetext) {
        updateListItems.Cdefault announcements;
        List<listItems.Cdefault> recurringAnnouncement;
        Intrinsics.checkNotNullParameter(populatetext, "$this$toListAnnouncement");
        List<getIcontype> arrayList = new ArrayList<>();
        if (!(!populatetext.success || (announcements = populatetext.getAnnouncements()) == null || (recurringAnnouncement = announcements.getRecurringAnnouncement()) == null)) {
            for (listItems.Cdefault announcement : recurringAnnouncement) {
                arrayList.add(toAnnouncement(announcement));
            }
        }
        return arrayList;
    }

    private static final getIcontype toAnnouncement(listItems.Cdefault defaultR) {
        return new getIcontype(defaultR.getSubscriptionId(), defaultR.getTitle(), defaultR.getSubtitle(), defaultR.getWidgetType(), defaultR.getExpirationDate(), defaultR.getGmtCreate(), defaultR.getSubMerchantId(), defaultR.getGoodsName(), defaultR.getSubscriptionDueDate(), defaultR.getPaymentStatus(), defaultR.getTotalAmount(), defaultR.getExtInfo());
    }
}
