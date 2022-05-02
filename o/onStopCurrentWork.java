package o;

import android.view.View;
import com.facebook.litho.ThreadUtils;

public class onStopCurrentWork implements View.OnClickListener {
    IconCompat<FrameMetricsAggregator$MetricType> length;

    onStopCurrentWork() {
    }

    public void onClick(View view) {
        IconCompat<FrameMetricsAggregator$MetricType> iconCompat = this.length;
        if (iconCompat != null) {
            ThreadUtils.getMax();
            if (getHandler.setMax == null) {
                getHandler.setMax = new FrameMetricsAggregator$MetricType();
            }
            getHandler.setMax.setMax = view;
            iconCompat.getMin.IsOverlapping().length(iconCompat, getHandler.setMax);
            getHandler.setMax.setMax = null;
        }
    }
}
