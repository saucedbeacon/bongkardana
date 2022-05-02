package o;

import android.content.Context;
import android.content.Intent;
import id.dana.service.ServicesActivity;

public final class getUCMPackageName extends addNotifyListener<ServicesActivity> {
    private String getMax;
    private boolean setMax;

    public getUCMPackageName(Context context, String str, boolean z) {
        super(context);
        this.getMax = str;
        this.setMax = z;
    }

    /* access modifiers changed from: protected */
    public final Class<ServicesActivity> length() {
        return ServicesActivity.class;
    }

    /* access modifiers changed from: protected */
    public final Intent length(Intent intent) {
        if (this.setMax) {
            intent.putExtra(ServicesActivity.FILTER_SERVICES, this.getMax);
            intent.putExtra(ServicesActivity.FILTER_BY, "name");
        }
        return intent;
    }

    public final void getMin() {
        getMax();
    }
}
