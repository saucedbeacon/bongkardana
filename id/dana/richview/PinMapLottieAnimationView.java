package id.dana.richview;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.airbnb.lottie.LottieAnimationView;
import o.resetInternal;

public class PinMapLottieAnimationView extends LottieAnimationView {
    private int getMax;
    private int getMin;
    private int setMax;
    private int setMin;

    public PinMapLottieAnimationView(Context context) {
        super(context);
    }

    public PinMapLottieAnimationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        length(attributeSet);
    }

    public PinMapLottieAnimationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        length(attributeSet);
    }

    private void length(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, resetInternal.getMin.PlaybackStateCompat$State);
            this.getMax = obtainStyledAttributes.getInteger(1, 0);
            this.getMin = obtainStyledAttributes.getInt(0, 0);
            this.setMax = obtainStyledAttributes.getInt(3, 0);
            this.setMin = obtainStyledAttributes.getInt(2, 0);
        }
    }

    public int getPullOutMinFrame() {
        return this.getMax;
    }

    public void setPullOutMinFrame(int i) {
        this.getMax = i;
    }

    public int getPullOutMaxFrame() {
        return this.getMin;
    }

    public void setPullOutMaxFrame(int i) {
        this.getMin = i;
    }

    public int getPutDownMinFrame() {
        return this.setMax;
    }

    public void setPutDownMinFrame(int i) {
        this.setMax = i;
    }

    public int getPutDownMaxFrame() {
        return this.setMin;
    }

    public void setPutDownMaxFrame(int i) {
        this.setMin = i;
    }

    public boolean isPutDownPinMap() {
        return (getMaxFrame() == ((float) getPullOutMaxFrame()) || getMinFrame() == ((float) getPullOutMinFrame())) ? false : true;
    }

    public void pullOutPinMap() {
        if (isPutDownPinMap()) {
            setMinFrame(getPullOutMinFrame());
            setMaxFrame(getPullOutMaxFrame());
            playAnimation();
        }
    }

    public void putDownPinMap() {
        setMinFrame(getPutDownMinFrame());
        setMaxFrame(getPutDownMaxFrame());
        playAnimation();
    }
}
