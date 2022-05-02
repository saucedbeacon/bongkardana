package o;

import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import id.dana.base.BaseActivity;
import id.dana.tracker.TrackerKey;
import java.util.Map;

public class captureEndValues {
    protected static Intent setMin(Activity activity, Map<String, String> map, Class<?> cls) {
        Intent intent = new Intent(activity, cls);
        if (!map.isEmpty()) {
            String max = getMax(map, activity);
            if (!TextUtils.isEmpty(max)) {
                intent.putExtra("source", max);
            }
        }
        return intent;
    }

    protected static String getMax(Map<String, String> map, Activity activity) {
        String str = map != null ? map.get("source") : null;
        if (TextUtils.isEmpty(str) && (activity instanceof BaseActivity)) {
            str = ((BaseActivity) activity).getSource();
        }
        return TextUtils.isEmpty(str) ? TrackerKey.SourceType.DEEP_LINK : str;
    }
}
