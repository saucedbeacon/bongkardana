package o;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import com.github.mikephil.charting.charts.RadarChart;
import com.github.mikephil.charting.data.RadarEntry;
import java.util.Iterator;

public final class prepareDialog extends onDismiss {
    protected Paint getMax;
    protected Paint getMin;
    protected Path length = new Path();
    protected RadarChart setMax;
    protected Path setMin = new Path();

    public final void setMax() {
    }

    public prepareDialog(RadarChart radarChart, setDrawerShadow setdrawershadow, setTargetFragment settargetfragment) {
        super(setdrawershadow, settargetfragment);
        this.setMax = radarChart;
        this.IsOverlapping = new Paint(1);
        this.IsOverlapping.setStyle(Paint.Style.STROKE);
        this.IsOverlapping.setStrokeWidth(2.0f);
        this.IsOverlapping.setColor(Color.rgb(255, 187, 115));
        Paint paint = new Paint(1);
        this.getMax = paint;
        paint.setStyle(Paint.Style.STROKE);
        this.getMin = new Paint(1);
    }

    public final void getMax(Canvas canvas) {
        Iterator it;
        Canvas canvas2 = canvas;
        gravityToString gravitytostring = (gravityToString) this.setMax.getData();
        int ICustomTabsCallback = ((EmojiExtractTextLayout) gravitytostring.FastBitmap$CoordinateSystem()).ICustomTabsCallback();
        Iterator it2 = gravitytostring.toIntRange().iterator();
        while (it2.hasNext()) {
            EmojiExtractTextLayout emojiExtractTextLayout = (EmojiExtractTextLayout) it2.next();
            if (emojiExtractTextLayout.b()) {
                float min = this.equals.getMin();
                float length2 = this.equals.length();
                float sliceAngle = this.setMax.getSliceAngle();
                float factor = this.setMax.getFactor();
                setArguments centerOffsets = this.setMax.getCenterOffsets();
                setArguments max = setArguments.getMax(0.0f, 0.0f);
                Path path = this.setMin;
                path.reset();
                int i = 0;
                boolean z = false;
                while (i < emojiExtractTextLayout.ICustomTabsCallback()) {
                    this.toFloatRange.setColor(emojiExtractTextLayout.setMax(i));
                    Iterator it3 = it2;
                    getTargetFragment.setMax(centerOffsets, (((RadarEntry) emojiExtractTextLayout.toIntRange(i)).getMin() - this.setMax.getYChartMin()) * factor * length2, (((float) i) * sliceAngle * min) + this.setMax.getRotationAngle(), max);
                    if (!Float.isNaN(max.length)) {
                        if (!z) {
                            path.moveTo(max.length, max.getMin);
                            z = true;
                        } else {
                            path.lineTo(max.length, max.getMin);
                        }
                    }
                    i++;
                    it2 = it3;
                }
                it = it2;
                if (emojiExtractTextLayout.ICustomTabsCallback() > ICustomTabsCallback) {
                    path.lineTo(centerOffsets.length, centerOffsets.getMin);
                }
                path.close();
                if (emojiExtractTextLayout.newSessionWithExtras()) {
                    Drawable extraCommand = emojiExtractTextLayout.extraCommand();
                    if (extraCommand != null) {
                        getMax(canvas2, path, extraCommand);
                    } else {
                        getMin(canvas2, path, emojiExtractTextLayout.newSession(), emojiExtractTextLayout.warmup());
                    }
                }
                this.toFloatRange.setStrokeWidth(emojiExtractTextLayout.mayLaunchUrl());
                this.toFloatRange.setStyle(Paint.Style.STROKE);
                if (!emojiExtractTextLayout.newSessionWithExtras() || emojiExtractTextLayout.warmup() < 255) {
                    canvas2.drawPath(path, this.toFloatRange);
                }
                setArguments.setMin(centerOffsets);
                setArguments.setMin(max);
            } else {
                it = it2;
            }
            it2 = it;
        }
    }

    public final void setMax(Canvas canvas) {
        float f;
        float f2;
        float f3;
        int i;
        closeDrawers closedrawers;
        float f4;
        float f5;
        float min = this.equals.getMin();
        float length2 = this.equals.length();
        float sliceAngle = this.setMax.getSliceAngle();
        float factor = this.setMax.getFactor();
        setArguments centerOffsets = this.setMax.getCenterOffsets();
        setArguments max = setArguments.getMax(0.0f, 0.0f);
        setArguments max2 = setArguments.getMax(0.0f, 0.0f);
        float max3 = getTargetFragment.setMax(5.0f);
        int i2 = 0;
        while (i2 < ((gravityToString) this.setMax.getData()).setMin()) {
            EmojiExtractTextLayout emojiExtractTextLayout = (EmojiExtractTextLayout) ((gravityToString) this.setMax.getData()).setMin(i2);
            if (getMin(emojiExtractTextLayout)) {
                length((EmojiAppCompatTextView) emojiExtractTextLayout);
                closeDrawers floatRange = emojiExtractTextLayout.toFloatRange();
                setArguments max4 = setArguments.setMax(emojiExtractTextLayout.onNavigationEvent());
                max4.length = getTargetFragment.setMax(max4.length);
                max4.getMin = getTargetFragment.setMax(max4.getMin);
                int i3 = 0;
                while (i3 < emojiExtractTextLayout.ICustomTabsCallback()) {
                    RadarEntry radarEntry = (RadarEntry) emojiExtractTextLayout.toIntRange(i3);
                    int i4 = i2;
                    float f6 = ((float) i3) * sliceAngle * min;
                    float f7 = min;
                    getTargetFragment.setMax(centerOffsets, (radarEntry.getMin() - this.setMax.getYChartMin()) * factor * length2, this.setMax.getRotationAngle() + f6, max);
                    if (emojiExtractTextLayout.Mean$Arithmetic()) {
                        String min2 = floatRange.getMin(radarEntry.getMin());
                        float f8 = max.length;
                        f5 = sliceAngle;
                        float f9 = max.getMin - max3;
                        f4 = max3;
                        closedrawers = floatRange;
                        this.toString.setColor(emojiExtractTextLayout.getMin(i3));
                        canvas.drawText(min2, f8, f9, this.toString);
                    } else {
                        f5 = sliceAngle;
                        f4 = max3;
                        closedrawers = floatRange;
                        Canvas canvas2 = canvas;
                    }
                    if (radarEntry.equals != null && emojiExtractTextLayout.create()) {
                        Drawable drawable = radarEntry.equals;
                        getTargetFragment.setMax(centerOffsets, (radarEntry.getMin() * factor * length2) + max4.getMin, f6 + this.setMax.getRotationAngle(), max2);
                        max2.getMin += max4.length;
                        getTargetFragment.setMax(canvas, drawable, (int) max2.length, (int) max2.getMin, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
                    }
                    i3++;
                    i2 = i4;
                    min = f7;
                    sliceAngle = f5;
                    max3 = f4;
                    floatRange = closedrawers;
                }
                Canvas canvas3 = canvas;
                f3 = min;
                f2 = sliceAngle;
                f = max3;
                i = i2;
                setArguments.setMin(max4);
            } else {
                Canvas canvas4 = canvas;
                f3 = min;
                f2 = sliceAngle;
                f = max3;
                i = i2;
            }
            i2 = i + 1;
            min = f3;
            sliceAngle = f2;
            max3 = f;
        }
        setArguments.setMin(centerOffsets);
        setArguments.setMin(max);
        setArguments.setMin(max2);
    }

    public final void setMax(Canvas canvas, addFocusables[] addfocusablesArr) {
        float f;
        float f2;
        Canvas canvas2 = canvas;
        addFocusables[] addfocusablesArr2 = addfocusablesArr;
        float sliceAngle = this.setMax.getSliceAngle();
        float factor = this.setMax.getFactor();
        setArguments centerOffsets = this.setMax.getCenterOffsets();
        setArguments max = setArguments.getMax(0.0f, 0.0f);
        gravityToString gravitytostring = (gravityToString) this.setMax.getData();
        int length2 = addfocusablesArr2.length;
        int i = 0;
        int i2 = 0;
        while (i2 < length2) {
            addFocusables addfocusables = addfocusablesArr2[i2];
            EmojiExtractTextLayout emojiExtractTextLayout = (EmojiExtractTextLayout) gravitytostring.setMin(addfocusables.equals);
            if (emojiExtractTextLayout != null && emojiExtractTextLayout.toIntRange()) {
                RadarEntry radarEntry = (RadarEntry) emojiExtractTextLayout.toIntRange((int) addfocusables.setMax);
                if (setMax(radarEntry, emojiExtractTextLayout)) {
                    getTargetFragment.setMax(centerOffsets, (radarEntry.getMin() - this.setMax.getYChartMin()) * factor * this.equals.length(), (addfocusables.setMax * sliceAngle * this.equals.getMin()) + this.setMax.getRotationAngle(), max);
                    float f3 = max.length;
                    float f4 = max.getMin;
                    addfocusables.isInside = f3;
                    addfocusables.IsOverlapping = f4;
                    getMin(canvas2, max.length, max.getMin, emojiExtractTextLayout);
                    if (emojiExtractTextLayout.IsOverlapping() && !Float.isNaN(max.length) && !Float.isNaN(max.getMin)) {
                        int extraCallback = emojiExtractTextLayout.extraCallback();
                        if (extraCallback == 1122867) {
                            extraCallback = emojiExtractTextLayout.setMax(i);
                        }
                        if (emojiExtractTextLayout.ICustomTabsCallback$Stub() < 255) {
                            extraCallback = getId.setMin(extraCallback, emojiExtractTextLayout.ICustomTabsCallback$Stub());
                        }
                        float onTransact = emojiExtractTextLayout.onTransact();
                        float asInterface = emojiExtractTextLayout.asInterface();
                        int FastBitmap$CoordinateSystem = emojiExtractTextLayout.FastBitmap$CoordinateSystem();
                        float ICustomTabsCallback$Default = emojiExtractTextLayout.ICustomTabsCallback$Default();
                        canvas.save();
                        float max2 = getTargetFragment.setMax(asInterface);
                        float max3 = getTargetFragment.setMax(onTransact);
                        if (FastBitmap$CoordinateSystem != 1122867) {
                            Path path = this.length;
                            path.reset();
                            f2 = sliceAngle;
                            f = factor;
                            path.addCircle(max.length, max.getMin, max2, Path.Direction.CW);
                            if (max3 > 0.0f) {
                                path.addCircle(max.length, max.getMin, max3, Path.Direction.CCW);
                            }
                            this.getMin.setColor(FastBitmap$CoordinateSystem);
                            this.getMin.setStyle(Paint.Style.FILL);
                            canvas2.drawPath(path, this.getMin);
                        } else {
                            f2 = sliceAngle;
                            f = factor;
                        }
                        if (extraCallback != 1122867) {
                            this.getMin.setColor(extraCallback);
                            this.getMin.setStyle(Paint.Style.STROKE);
                            this.getMin.setStrokeWidth(getTargetFragment.setMax(ICustomTabsCallback$Default));
                            canvas2.drawCircle(max.length, max.getMin, max2, this.getMin);
                        }
                        canvas.restore();
                        i2++;
                        addfocusablesArr2 = addfocusablesArr;
                        sliceAngle = f2;
                        factor = f;
                        i = 0;
                    }
                }
            }
            f2 = sliceAngle;
            f = factor;
            i2++;
            addfocusablesArr2 = addfocusablesArr;
            sliceAngle = f2;
            factor = f;
            i = 0;
        }
        setArguments.setMin(centerOffsets);
        setArguments.setMin(max);
    }

    public final void setMin(Canvas canvas) {
        float sliceAngle = this.setMax.getSliceAngle();
        float factor = this.setMax.getFactor();
        float rotationAngle = this.setMax.getRotationAngle();
        setArguments centerOffsets = this.setMax.getCenterOffsets();
        this.getMax.setStrokeWidth(this.setMax.getWebLineWidth());
        this.getMax.setColor(this.setMax.getWebColor());
        this.getMax.setAlpha(this.setMax.getWebAlpha());
        int skipWebLineCount = this.setMax.getSkipWebLineCount() + 1;
        int ICustomTabsCallback = ((EmojiExtractTextLayout) ((gravityToString) this.setMax.getData()).FastBitmap$CoordinateSystem()).ICustomTabsCallback();
        setArguments max = setArguments.getMax(0.0f, 0.0f);
        for (int i = 0; i < ICustomTabsCallback; i += skipWebLineCount) {
            getTargetFragment.setMax(centerOffsets, this.setMax.getYRange() * factor, (((float) i) * sliceAngle) + rotationAngle, max);
            canvas.drawLine(centerOffsets.length, centerOffsets.getMin, max.length, max.getMin, this.getMax);
        }
        setArguments.setMin(max);
        this.getMax.setStrokeWidth(this.setMax.getWebLineWidthInner());
        this.getMax.setColor(this.setMax.getWebColorInner());
        this.getMax.setAlpha(this.setMax.getWebAlpha());
        int i2 = this.setMax.getYAxis().isInside;
        setArguments max2 = setArguments.getMax(0.0f, 0.0f);
        setArguments max3 = setArguments.getMax(0.0f, 0.0f);
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = 0;
            while (i4 < ((gravityToString) this.setMax.getData()).isInside()) {
                float yChartMin = (this.setMax.getYAxis().toIntRange[i3] - this.setMax.getYChartMin()) * factor;
                getTargetFragment.setMax(centerOffsets, yChartMin, (((float) i4) * sliceAngle) + rotationAngle, max2);
                i4++;
                getTargetFragment.setMax(centerOffsets, yChartMin, (((float) i4) * sliceAngle) + rotationAngle, max3);
                canvas.drawLine(max2.length, max2.getMin, max3.length, max3.getMin, this.getMax);
            }
        }
        setArguments.setMin(max2);
        setArguments.setMin(max3);
    }
}
