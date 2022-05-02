package o;

import android.view.View;
import com.facebook.litho.ThreadUtils;

public class NotificationCompat$BadgeIconType implements View.OnFocusChangeListener {
    IconCompat<GnssStatusCompat$ConstellationType> length;

    NotificationCompat$BadgeIconType() {
    }

    public void onFocusChange(View view, boolean z) {
        IconCompat<GnssStatusCompat$ConstellationType> iconCompat = this.length;
        if (iconCompat != null) {
            ThreadUtils.getMax();
            if (getHandler.setMin == null) {
                getHandler.setMin = new GnssStatusCompat$ConstellationType();
            }
            getHandler.setMin.setMin = view;
            getHandler.setMin.setMax = z;
            iconCompat.getMin.IsOverlapping().length(iconCompat, getHandler.setMin);
            getHandler.setMin.setMin = null;
        }
    }
}
