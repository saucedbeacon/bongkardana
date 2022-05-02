package o;

import android.content.ContentResolver;
import android.database.ContentObserver;

final class setCancelVisible implements setShowRedPoint {
    private final ContentResolver getMax;
    private final ContentObserver setMin;

    public setCancelVisible(ContentResolver contentResolver, ContentObserver contentObserver) {
        this.getMax = contentResolver;
        this.setMin = contentObserver;
    }

    public final void getMin() {
        this.getMax.unregisterContentObserver(this.setMin);
    }
}
