package o;

import android.graphics.Canvas;
import com.github.mikephil.charting.charts.RadarChart;
import com.github.mikephil.charting.components.XAxis;

public class getViewLifecycleOwnerLiveData extends getViewLifecycleOwner {
    private RadarChart values;

    public final void setMin(Canvas canvas) {
    }

    public getViewLifecycleOwnerLiveData(setTargetFragment settargetfragment, XAxis xAxis, RadarChart radarChart) {
        super(settargetfragment, xAxis, (getActivity) null);
        this.values = radarChart;
    }

    public final void getMax(Canvas canvas) {
        if (this.IsOverlapping.create() && this.IsOverlapping.length()) {
            float b = this.IsOverlapping.b();
            setArguments max = setArguments.getMax(0.5f, 0.25f);
            this.getMax.setTypeface(this.IsOverlapping.getCause());
            this.getMax.setTextSize(this.IsOverlapping.onNavigationEvent());
            this.getMax.setColor(this.IsOverlapping.ICustomTabsCallback());
            float sliceAngle = this.values.getSliceAngle();
            float factor = this.values.getFactor();
            setArguments centerOffsets = this.values.getCenterOffsets();
            setArguments max2 = setArguments.getMax(0.0f, 0.0f);
            for (int i = 0; i < ((EmojiExtractTextLayout) ((gravityToString) this.values.getData()).FastBitmap$CoordinateSystem()).ICustomTabsCallback(); i++) {
                float f = (float) i;
                String min = this.IsOverlapping.invoke().getMin(f);
                getTargetFragment.setMax(centerOffsets, (this.values.getYRange() * factor) + (((float) this.IsOverlapping.setDefaultImpl) / 2.0f), ((f * sliceAngle) + this.values.getRotationAngle()) % 360.0f, max2);
                setMin(canvas, min, max2.length, max2.getMin - (((float) this.IsOverlapping.ICustomTabsCallback$Stub$Proxy) / 2.0f), max, b);
            }
            setArguments.setMin(centerOffsets);
            setArguments.setMin(max2);
            setArguments.setMin(max);
        }
    }
}
