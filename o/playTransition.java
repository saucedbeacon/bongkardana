package o;

import android.app.Activity;
import android.content.Intent;
import id.dana.promocenter.views.PromoCenterActivity;
import java.util.Map;

public final class playTransition {
    public playTransition(Activity activity, Map<String, String> map) {
        String str = map.get("categoryId");
        int length = str != null ? str.length() : 0;
        int max = dispatchOnCancelled.setMax(length);
        if (length != max) {
            onCanceled oncanceled = new onCanceled(length, max, 1);
            onCancelLoad.setMax(1889713471, oncanceled);
            onCancelLoad.getMin(1889713471, oncanceled);
        }
        Intent intent = new Intent(activity, PromoCenterActivity.class);
        intent.putExtra("categoryId", str);
        activity.startActivity(intent);
    }
}
