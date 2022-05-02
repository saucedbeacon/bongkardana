package o;

import android.content.Context;
import android.os.Bundle;
import com.google.firebase.analytics.FirebaseAnalytics;

public final class getActivityByContext implements convertSpToPx {
    Bundle getMin;
    Context setMax;
    String setMin;

    public getActivityByContext(Context context, String str, Bundle bundle) {
        this.setMax = context;
        this.setMin = str;
        this.getMin = bundle;
    }

    public final void length() {
        FirebaseAnalytics.getInstance(this.setMax).logEvent(this.setMin, this.getMin);
    }
}
