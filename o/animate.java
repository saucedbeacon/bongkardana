package o;

import android.app.Activity;
import android.content.Intent;
import id.dana.requestmoney.RequestMoneyActivity;
import java.util.Map;

public final class animate extends captureEndValues {
    public animate(Activity activity, Map<String, String> map) {
        Intent min = setMin(activity, map, RequestMoneyActivity.class);
        if (!map.isEmpty()) {
            min.putExtra("amount", map.get("amount"));
        }
        activity.startActivity(min);
    }
}
