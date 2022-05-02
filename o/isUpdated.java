package o;

import id.dana.model.CdpContentModel;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\u001a\u000e\u0010\u0003\u001a\u0004\u0018\u00010\u0001*\u00020\u0004H\u0002\u001a\u000e\u0010\u0005\u001a\u0004\u0018\u00010\u0001*\u00020\u0004H\u0002\u001a\n\u0010\u0006\u001a\u00020\u0007*\u00020\u0004\u001a\n\u0010\b\u001a\u00020\t*\u00020\u0004\u001a\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b*\b\u0012\u0004\u0012\u00020\u00040\u000b\"\u000e\u0010\u0000\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"EN_DESC_SINGLE", "", "EN_TITLE", "getAnnouncementSubtitle", "Lid/dana/domain/announcement/model/Announcement;", "getAnnouncementTitle", "toAnnouncementModel", "Lid/dana/announcement/model/AnnouncementModel;", "toCdpModel", "Lid/dana/model/CdpContentModel;", "toListAnnouncementModel", "", "app_productionRelease"}, k = 2, mv = {1, 4, 2})
public final class isUpdated {
    @NotNull
    public static final CdpContentModel setMax(@NotNull getIcontype geticontype) {
        String str;
        String str2;
        Intrinsics.checkNotNullParameter(geticontype, "$this$toCdpModel");
        CdpContentModel cdpContentModel = new CdpContentModel();
        cdpContentModel.getMin = geticontype.getId();
        cdpContentModel.getMax = geticontype.getTitle();
        cdpContentModel.setMin = geticontype.getWidgetType();
        cdpContentModel.setMax = geticontype.getSubtitle();
        cdpContentModel.toDoubleRange = "";
        cdpContentModel.Mean$Arithmetic = geticontype.getSubMerchantId();
        Map<String, String> extInfo = geticontype.getExtInfo();
        if (extInfo == null || (str = extInfo.get("EN_TITLE")) == null) {
            str = geticontype.getTitle();
        }
        cdpContentModel.Grayscale$Algorithm = str;
        Map<String, String> extInfo2 = geticontype.getExtInfo();
        if (extInfo2 == null || (str2 = extInfo2.get("EN_DESC_SINGLE")) == null) {
            str2 = geticontype.getSubtitle();
        }
        cdpContentModel.valueOf = str2;
        cdpContentModel.getCause = geticontype.getGoodsName();
        cdpContentModel.ICustomTabsCallback = geticontype.getSubscriptionDueDate();
        cdpContentModel.b = geticontype.getPaymentStatus();
        cdpContentModel.onNavigationEvent = geticontype.getTotalAmount();
        return cdpContentModel;
    }
}
