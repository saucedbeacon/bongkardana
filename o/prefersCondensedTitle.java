package o;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.VisibleForTesting;
import java.util.concurrent.atomic.AtomicBoolean;

public final class prefersCondensedTitle {
    private static AtomicBoolean getMin = new AtomicBoolean(false);

    public static void length(Context context) {
        if (!getMin.getAndSet(true)) {
            ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new getMin());
        }
    }

    @VisibleForTesting
    static class getMin extends getItemData {
        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public final void onActivityStopped(Activity activity) {
        }

        getMin() {
        }

        public final void onActivityCreated(Activity activity, Bundle bundle) {
            invokeItem.setMin(activity);
        }
    }
}
