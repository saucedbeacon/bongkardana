package o;

import android.annotation.SuppressLint;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AnimationUtils;
import com.github.mikephil.charting.charts.PieRadarChartBase;
import com.github.mikephil.charting.listener.ChartTouchListener;
import java.util.ArrayList;

public final class dismissInternal extends ChartTouchListener<PieRadarChartBase<?>> {
    private ArrayList<getMax> IsOverlapping = new ArrayList<>();
    private float equals = 0.0f;
    private float isInside = 0.0f;
    private setArguments toFloatRange = setArguments.getMax(0.0f, 0.0f);
    private long toIntRange = 0;

    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        return true;
    }

    public dismissInternal(PieRadarChartBase<?> pieRadarChartBase) {
        super(pieRadarChartBase);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        float f;
        if (!this.length.onTouchEvent(motionEvent) && ((PieRadarChartBase) this.getMax).isRotationEnabled()) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int action = motionEvent.getAction();
            if (action == 0) {
                getMin();
                this.equals = 0.0f;
                this.IsOverlapping.clear();
                if (((PieRadarChartBase) this.getMax).isDragDecelerationEnabled()) {
                    setMin(x, y);
                }
                this.isInside = ((PieRadarChartBase) this.getMax).getAngleForPoint(x, y) - ((PieRadarChartBase) this.getMax).getRawRotationAngle();
                this.toFloatRange.length = x;
                this.toFloatRange.getMin = y;
            } else if (action == 1) {
                if (((PieRadarChartBase) this.getMax).isDragDecelerationEnabled()) {
                    this.equals = 0.0f;
                    setMin(x, y);
                    if (this.IsOverlapping.isEmpty()) {
                        f = 0.0f;
                    } else {
                        getMax getmax = this.IsOverlapping.get(0);
                        ArrayList<getMax> arrayList = this.IsOverlapping;
                        getMax getmax2 = arrayList.get(arrayList.size() - 1);
                        getMax getmax3 = getmax;
                        for (int size = this.IsOverlapping.size() - 1; size >= 0; size--) {
                            getmax3 = this.IsOverlapping.get(size);
                            if (getmax3.getMax != getmax2.getMax) {
                                break;
                            }
                        }
                        float f2 = ((float) (getmax2.length - getmax.length)) / 1000.0f;
                        if (f2 == 0.0f) {
                            f2 = 0.1f;
                        }
                        boolean z = getmax2.getMax >= getmax3.getMax;
                        if (((double) Math.abs(getmax2.getMax - getmax3.getMax)) > 270.0d) {
                            z = !z;
                        }
                        if (((double) (getmax2.getMax - getmax.getMax)) > 180.0d) {
                            double d = (double) getmax.getMax;
                            Double.isNaN(d);
                            getmax.getMax = (float) (d + 360.0d);
                        } else if (((double) (getmax.getMax - getmax2.getMax)) > 180.0d) {
                            double d2 = (double) getmax2.getMax;
                            Double.isNaN(d2);
                            getmax2.getMax = (float) (d2 + 360.0d);
                        }
                        f = Math.abs((getmax2.getMax - getmax.getMax) / f2);
                        if (!z) {
                            f = -f;
                        }
                    }
                    this.equals = f;
                    if (f != 0.0f) {
                        this.toIntRange = AnimationUtils.currentAnimationTimeMillis();
                        getTargetFragment.getMin((View) this.getMax);
                    }
                }
                ((PieRadarChartBase) this.getMax).enableScroll();
                this.setMax = 0;
                setMax();
            } else if (action == 2) {
                if (((PieRadarChartBase) this.getMax).isDragDecelerationEnabled()) {
                    setMin(x, y);
                }
                if (this.setMax == 0) {
                    float f3 = x - this.toFloatRange.length;
                    float f4 = y - this.toFloatRange.getMin;
                    if (((float) Math.sqrt((double) ((f3 * f3) + (f4 * f4)))) > getTargetFragment.setMax(8.0f)) {
                        this.getMin = ChartTouchListener.ChartGesture.ROTATE;
                        this.setMax = 6;
                        ((PieRadarChartBase) this.getMax).disableScroll();
                        setMax();
                    }
                }
                if (this.setMax == 6) {
                    ((PieRadarChartBase) this.getMax).setRotationAngle(((PieRadarChartBase) this.getMax).getAngleForPoint(x, y) - this.isInside);
                    ((PieRadarChartBase) this.getMax).invalidate();
                }
                setMax();
            }
        }
        return true;
    }

    public final void onLongPress(MotionEvent motionEvent) {
        this.getMin = ChartTouchListener.ChartGesture.LONG_PRESS;
        ((PieRadarChartBase) this.getMax).getOnChartGestureListener();
    }

    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        this.getMin = ChartTouchListener.ChartGesture.SINGLE_TAP;
        ((PieRadarChartBase) this.getMax).getOnChartGestureListener();
        if (!((PieRadarChartBase) this.getMax).isHighlightPerTapEnabled()) {
            return false;
        }
        setMin(((PieRadarChartBase) this.getMax).getHighlightByTouchPoint(motionEvent.getX(), motionEvent.getY()));
        return true;
    }

    private void setMin(float f, float f2) {
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        this.IsOverlapping.add(new getMax(currentAnimationTimeMillis, ((PieRadarChartBase) this.getMax).getAngleForPoint(f, f2)));
        for (int size = this.IsOverlapping.size(); size - 2 > 0 && currentAnimationTimeMillis - this.IsOverlapping.get(0).length > 1000; size--) {
            this.IsOverlapping.remove(0);
        }
    }

    public final void length() {
        if (this.equals != 0.0f) {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.equals *= ((PieRadarChartBase) this.getMax).getDragDecelerationFrictionCoef();
            ((PieRadarChartBase) this.getMax).setRotationAngle(((PieRadarChartBase) this.getMax).getRotationAngle() + (this.equals * (((float) (currentAnimationTimeMillis - this.toIntRange)) / 1000.0f)));
            this.toIntRange = currentAnimationTimeMillis;
            if (((double) Math.abs(this.equals)) >= 0.001d) {
                getTargetFragment.getMin((View) this.getMax);
            } else {
                this.equals = 0.0f;
            }
        }
    }

    class getMax {
        public float getMax;
        public long length;

        public getMax(long j, float f) {
            this.length = j;
            this.getMax = f;
        }
    }
}
