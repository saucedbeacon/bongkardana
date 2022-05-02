package o;

import java.util.List;
import kotlin.Metadata;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u001c\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00032\u0006\u0010\b\u001a\u00020\tH&J\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00032\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\u0006H&J\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00032\u0006\u0010\u000e\u001a\u00020\u000fH&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0010À\u0006\u0001"}, d2 = {"Lid/dana/domain/geofence/GeoFenceRepository;", "", "getCurrentPOICacheTime", "Lio/reactivex/Observable;", "", "getListPoi", "", "Lid/dana/domain/geofence/model/Poi;", "location", "", "notifyPOIs", "", "poiIds", "setRetryInterval", "maxRetry", "", "domain_release"}, k = 1, mv = {1, 4, 2})
public interface onDownloadResult {
    @NotNull
    TitleBarRightButtonView.AnonymousClass1<Long> getCurrentPOICacheTime();

    @NotNull
    TitleBarRightButtonView.AnonymousClass1<List<H5Data>> getListPoi(@NotNull String str);

    @NotNull
    TitleBarRightButtonView.AnonymousClass1<Boolean> notifyPOIs(@NotNull List<String> list);

    @NotNull
    TitleBarRightButtonView.AnonymousClass1<Boolean> setRetryInterval(int i);
}
