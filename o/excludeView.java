package o;

import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import id.dana.contract.deeplink.path.FeatureParams;
import id.dana.nearbyme.NearbyMeActivity;
import id.dana.nearbyrevamp.NewNearbyMeActivity;
import java.util.Map;

public final class excludeView {
    public excludeView(Activity activity, Map<String, String> map) {
        Intent intent;
        if (Boolean.parseBoolean(map.get(FeatureParams.NEARBY_REVAMP).trim())) {
            intent = new Intent(activity, NewNearbyMeActivity.class);
        } else {
            intent = new Intent(activity, NearbyMeActivity.class);
        }
        if (!map.isEmpty()) {
            intent.putExtra(NearbyMeActivity.EXTRA_SEARCH_KEYWORD, map.get(FeatureParams.KEYWORD));
            intent.putExtra("EXTRA_SHOP_ID", map.get(FeatureParams.SHOP_ID));
            intent.putExtra("EXTRA_MERCHANT_ID", map.get("merchantId"));
            intent.putExtra(NearbyMeActivity.EXTRA_CATEGORY, map.get("category"));
            String str = map.get("lat");
            String str2 = map.get("long");
            String str3 = map.get("source");
            if (!TextUtils.isEmpty(str3)) {
                intent.putExtra("EXTRA_SOURCE", str3);
            }
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                intent.putExtra(NearbyMeActivity.EXTRA_LOCATION_LAT, Double.parseDouble(str));
                intent.putExtra(NearbyMeActivity.EXTRA_LOCATION_LON, Double.parseDouble(str2));
            }
        }
        activity.startActivity(intent);
    }
}
