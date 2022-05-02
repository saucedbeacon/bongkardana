package o;

import id.dana.domain.homeinfo.ThirdPartyServiceResponse;
import java.util.List;
import o.NullBeaconDataFactory;
import o.TitleBarRightButtonView;

public interface toUuidString {
    TitleBarRightButtonView.AnonymousClass1<List<String>> getAllCategories();

    TitleBarRightButtonView.AnonymousClass1<List<NullBeaconDataFactory.AnonymousClass1>> getAllServices();

    TitleBarRightButtonView.AnonymousClass1<List<ThirdPartyServiceResponse>> getDefaultSkuExplore(List<String> list);

    TitleBarRightButtonView.AnonymousClass1<List<NullBeaconDataFactory.AnonymousClass1>> getExploreServices(List<String> list);

    TitleBarRightButtonView.AnonymousClass1<NullBeaconDataFactory.AnonymousClass1> getFavoriteServices(boolean z);

    TitleBarRightButtonView.AnonymousClass1<List<ThirdPartyServiceResponse>> getRawServices();

    TitleBarRightButtonView.AnonymousClass1<ThirdPartyServiceResponse> getServiceByKey(String str);

    TitleBarRightButtonView.AnonymousClass1<List<NullBeaconDataFactory.AnonymousClass1>> getServicesByCategoryKey(List<String> list);

    TitleBarRightButtonView.AnonymousClass1<List<NullBeaconDataFactory.AnonymousClass1>> getServicesByKey(List<String> list);

    TitleBarRightButtonView.AnonymousClass1<List<NullBeaconDataFactory.AnonymousClass1>> getServicesByName(List<String> list);

    TitleBarRightButtonView.AnonymousClass1<Boolean> saveFavoriteServices(List<String> list);
}
