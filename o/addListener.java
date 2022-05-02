package o;

import android.app.Activity;
import android.content.Intent;
import id.dana.service.ServicesActivity;
import java.util.Map;

public final class addListener {
    public addListener(Activity activity, Map<String, String> map) {
        Intent intent = new Intent(activity, ServicesActivity.class);
        if (!map.isEmpty()) {
            intent.putExtra(ServicesActivity.FILTER_SERVICES, map.get("services"));
            intent.putExtra(ServicesActivity.FILTER_BY, "key");
        }
        activity.startActivity(intent);
    }
}
