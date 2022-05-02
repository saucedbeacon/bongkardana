package o;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H&J0\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00040\u00032\u0006\u0010\b\u001a\u00020\u00052\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\nH&J\u0014\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H&J\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u00032\u0006\u0010\u000e\u001a\u00020\u0005H&J\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\u00032\u0006\u0010\u000e\u001a\u00020\u0005H&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0010À\u0006\u0001"}, d2 = {"Lid/dana/domain/announcement/AnnouncementRepository;", "", "getAnnouncementGnIds", "Lio/reactivex/Observable;", "", "", "getAnnouncements", "Lid/dana/domain/announcement/model/Announcement;", "type", "extendInfo", "", "getTrackedAnnouncementsGnId", "saveAnnouncementGnId", "", "id", "saveTrackedAnnouncementGnId", "domain_release"}, k = 1, mv = {1, 4, 2})
public interface toolbarMenuClicked {
    @NotNull
    TitleBarRightButtonView.AnonymousClass1<List<String>> getAnnouncementGnIds();

    @NotNull
    TitleBarRightButtonView.AnonymousClass1<List<getIcontype>> getAnnouncements(@NotNull String str, @NotNull Map<String, String> map);

    @NotNull
    TitleBarRightButtonView.AnonymousClass1<List<String>> getTrackedAnnouncementsGnId();

    @NotNull
    TitleBarRightButtonView.AnonymousClass1<Boolean> saveAnnouncementGnId(@NotNull String str);

    @NotNull
    TitleBarRightButtonView.AnonymousClass1<Boolean> saveTrackedAnnouncementGnId(@NotNull String str);
}
