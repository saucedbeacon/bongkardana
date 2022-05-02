package o;

import android.content.Context;
import android.content.Intent;
import id.dana.tracker.TrackerKey;

public abstract class addNotifyListener<T> implements pathIsInAppScope {
    private Intent getMin;
    private Context length;

    /* access modifiers changed from: protected */
    public Intent length(Intent intent) {
        return intent;
    }

    /* access modifiers changed from: protected */
    public Class<T> length() {
        return null;
    }

    public void setMin(T t) {
    }

    public addNotifyListener(Context context) {
        this.length = context;
        this.getMin = new Intent(context, length());
    }

    public addNotifyListener(Context context, T t) {
        this.length = context;
        setMin(t);
        this.getMin = new Intent(context, length());
    }

    /* access modifiers changed from: protected */
    public final void getMax() {
        this.getMin.putExtra("source", TrackerKey.SourceType.PROMOTION);
        this.length.startActivity(length(this.getMin));
    }
}
