package o;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class getPermissionAppId extends uncheckItems<parsePermissionJson> {
    private final getAggregationMainAppIdForH5Page networkUrlShortensEntityData;

    @Inject
    public getPermissionAppId(getAggregationMainAppIdForH5Page getaggregationmainappidforh5page) {
        this.networkUrlShortensEntityData = getaggregationmainappidforh5page;
    }

    public parsePermissionJson createData(String str) {
        return this.networkUrlShortensEntityData;
    }
}
