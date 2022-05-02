package o;

import android.text.TextUtils;
import o.Blur;

public final class BlurFactor implements getTypeface {
    private final getTypefaceByCat length;
    private getPerformanceTracker setMin;

    public BlurFactor(getTypefaceByCat gettypefacebycat, getPerformanceTracker getperformancetracker) {
        this.length = gettypefacebycat;
        if (getperformancetracker != null) {
            this.setMin = getperformancetracker;
        }
    }

    public final void getMax() {
        if (this.length != null) {
            if (getMin()) {
                BlurProcess.setMax(this.length.setMax.setMin);
                BlurProcess.toIntRange();
                getMin(this.length.setMax.setMin);
                isInside();
                String max = BlurProcess.setMax();
                getPerformanceTracker getperformancetracker = this.setMin;
                if (getperformancetracker != null) {
                    getperformancetracker.updateUtdIdTimeStamp(max);
                }
            } else {
                BlurProcess.setMax(this.length.setMax.setMax);
                BlurProcess.toIntRange();
            }
            if (this.length.setMax.getMax != null) {
                BlurProcess.setMin(this.length.setMax.getMax);
            }
        }
    }

    public final void setMax() {
        if (this.length != null) {
            if (getMin()) {
                BlurProcess.setMax(this.length.setMax.setMin);
            }
            if (toIntRange()) {
                BlurProcess.getMin(this.length.setMax.getMax, this.length.setMax.setMin, this.length.setMax.IsOverlapping);
            }
        }
    }

    public final void length() {
        if (this.length != null && getMin()) {
            getMin(this.length.setMax.setMin);
            isInside();
        }
    }

    public final void setMin() {
        BlurProcess.getMin();
        getPerformanceTracker getperformancetracker = this.setMin;
        if (getperformancetracker != null) {
            String newUtdidWithTimestamp = getperformancetracker.getNewUtdidWithTimestamp();
            getPerformanceTracker getperformancetracker2 = this.setMin;
            if (getperformancetracker2 != null) {
                getperformancetracker2.updateUtdIdTimeStamp(newUtdidWithTimestamp);
                return;
            }
            return;
        }
        updateActionSheetContent.e(getClass().getSimpleName(), "Can't update utdid, device info is null");
    }

    private void getMin(String str) {
        if (!BlurProcess.setMax.equals(str)) {
            Blur.getMax getmax = new Blur.getMax(this.length.setMax.getMax);
            getmax.length = str;
            BlurProcess.length(new Blur(getmax, (byte) 0));
        }
    }

    private boolean getMin() {
        return this.length.setMax.getMax != null && !TextUtils.isEmpty(this.length.setMax.setMin);
    }

    private boolean toIntRange() {
        return getMin() && !TextUtils.isEmpty(this.length.setMax.IsOverlapping);
    }

    private void isInside() {
        if (toIntRange()) {
            Blur.getMax getmax = new Blur.getMax(this.length.setMax.getMax);
            getmax.length = this.length.setMax.setMin;
            getmax.getMin = this.length.setMax.IsOverlapping;
            BlurProcess.setMax(new Blur(getmax, (byte) 0));
        }
    }
}
