package o;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import com.github.mikephil.charting.data.BubbleEntry;
import java.util.List;

public final class setShowsDialog extends getShowsDialog {
    private float[] getMax = new float[4];
    protected getValue getMin;
    private float[] length = new float[2];
    private float[] setMin = new float[3];

    public final void setMax() {
    }

    public final void setMin(Canvas canvas) {
    }

    public setShowsDialog(getValue getvalue, setDrawerShadow setdrawershadow, setTargetFragment settargetfragment) {
        super(setdrawershadow, settargetfragment);
        this.getMin = getvalue;
        this.toFloatRange.setStyle(Paint.Style.FILL);
        this.IsOverlapping.setStyle(Paint.Style.STROKE);
        this.IsOverlapping.setStrokeWidth(getTargetFragment.setMax(1.5f));
    }

    public final void getMax(Canvas canvas) {
        for (EmojiButton emojiButton : this.getMin.getBubbleData().toIntRange()) {
            if (emojiButton.b() && emojiButton.ICustomTabsCallback() > 0) {
                getActivity transformer = this.getMin.getTransformer(emojiButton.getCause());
                float length2 = this.equals.length();
                this.isInside.getMax(this.getMin, emojiButton);
                float[] fArr = this.getMax;
                fArr[0] = 0.0f;
                fArr[2] = 1.0f;
                transformer.length(fArr);
                boolean FastBitmap$CoordinateSystem = emojiButton.FastBitmap$CoordinateSystem();
                float[] fArr2 = this.getMax;
                float min = Math.min(Math.abs(this.invokeSuspend.toFloatRange() - this.invokeSuspend.toIntRange()), Math.abs(fArr2[2] - fArr2[0]));
                for (int i = this.isInside.setMin; i <= this.isInside.length + this.isInside.setMin; i++) {
                    BubbleEntry bubbleEntry = (BubbleEntry) emojiButton.toIntRange(i);
                    this.length[0] = bubbleEntry.length();
                    this.length[1] = bubbleEntry.getMin() * length2;
                    transformer.length(this.length);
                    float f = bubbleEntry.length;
                    float IsOverlapping = emojiButton.IsOverlapping();
                    if (FastBitmap$CoordinateSystem) {
                        if (IsOverlapping == 0.0f) {
                            f = 1.0f;
                        } else {
                            f = (float) Math.sqrt((double) (f / IsOverlapping));
                        }
                    }
                    float f2 = (f * min) / 2.0f;
                    if (this.invokeSuspend.toIntRange(this.length[1] + f2) && this.invokeSuspend.equals(this.length[1] - f2) && this.invokeSuspend.toFloatRange(this.length[0] + f2)) {
                        if (!this.invokeSuspend.isInside(this.length[0] - f2)) {
                            break;
                        }
                        this.toFloatRange.setColor(emojiButton.setMax((int) bubbleEntry.length()));
                        float[] fArr3 = this.length;
                        canvas.drawCircle(fArr3[0], fArr3[1], f2, this.toFloatRange);
                    } else {
                        Canvas canvas2 = canvas;
                    }
                }
            }
            Canvas canvas3 = canvas;
        }
    }

    public final void setMax(Canvas canvas) {
        List list;
        List list2;
        getDrawerViewOffset bubbleData = this.getMin.getBubbleData();
        if (bubbleData != null && length((setValue) this.getMin)) {
            List intRange = bubbleData.toIntRange();
            float max = (float) getTargetFragment.setMax(this.toString, "1");
            int i = 0;
            while (i < intRange.size()) {
                EmojiButton emojiButton = (EmojiButton) intRange.get(i);
                if (!getMin(emojiButton) || emojiButton.ICustomTabsCallback() <= 0) {
                    Canvas canvas2 = canvas;
                    list = intRange;
                } else {
                    length((EmojiAppCompatTextView) emojiButton);
                    float max2 = Math.max(0.0f, Math.min(1.0f, this.equals.getMin()));
                    float length2 = this.equals.length();
                    this.isInside.getMax(this.getMin, emojiButton);
                    float[] length3 = this.getMin.getTransformer(emojiButton.getCause()).length(emojiButton, length2, this.isInside.setMin, this.isInside.getMin);
                    if (max2 == 1.0f) {
                        max2 = length2;
                    }
                    closeDrawers floatRange = emojiButton.toFloatRange();
                    setArguments max3 = setArguments.setMax(emojiButton.onNavigationEvent());
                    max3.length = getTargetFragment.setMax(max3.length);
                    max3.getMin = getTargetFragment.setMax(max3.getMin);
                    int i2 = 0;
                    while (i2 < length3.length) {
                        int i3 = i2 / 2;
                        int min = emojiButton.getMin(this.isInside.setMin + i3);
                        int argb = Color.argb(Math.round(255.0f * max2), Color.red(min), Color.green(min), Color.blue(min));
                        float f = length3[i2];
                        float f2 = length3[i2 + 1];
                        if (!this.invokeSuspend.isInside(f)) {
                            break;
                        }
                        if (!this.invokeSuspend.toFloatRange(f) || !this.invokeSuspend.IsOverlapping(f2)) {
                            Canvas canvas3 = canvas;
                            list2 = intRange;
                        } else {
                            BubbleEntry bubbleEntry = (BubbleEntry) emojiButton.toIntRange(i3 + this.isInside.setMin);
                            if (emojiButton.Mean$Arithmetic()) {
                                list2 = intRange;
                                this.toString.setColor(argb);
                                Canvas canvas4 = canvas;
                                canvas4.drawText(floatRange.getMin(bubbleEntry.length), f, f2 + (0.5f * max), this.toString);
                            } else {
                                Canvas canvas5 = canvas;
                                list2 = intRange;
                            }
                            if (bubbleEntry.equals != null && emojiButton.create()) {
                                Drawable drawable = bubbleEntry.equals;
                                getTargetFragment.setMax(canvas, drawable, (int) (f + max3.length), (int) (f2 + max3.getMin), drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
                            }
                        }
                        i2 += 2;
                        intRange = list2;
                    }
                    Canvas canvas6 = canvas;
                    list = intRange;
                    setArguments.setMin(max3);
                }
                i++;
                intRange = list;
            }
        }
    }

    public final void setMax(Canvas canvas, addFocusables[] addfocusablesArr) {
        getDrawerViewOffset bubbleData = this.getMin.getBubbleData();
        float length2 = this.equals.length();
        for (addFocusables addfocusables : addfocusablesArr) {
            EmojiButton emojiButton = (EmojiButton) bubbleData.setMin(addfocusables.equals);
            if (emojiButton != null && emojiButton.toIntRange()) {
                BubbleEntry bubbleEntry = (BubbleEntry) emojiButton.length(addfocusables.setMax, addfocusables.getMin);
                if (bubbleEntry.getMin() == addfocusables.getMin && setMax(bubbleEntry, emojiButton)) {
                    getActivity transformer = this.getMin.getTransformer(emojiButton.getCause());
                    float[] fArr = this.getMax;
                    fArr[0] = 0.0f;
                    fArr[2] = 1.0f;
                    transformer.length(fArr);
                    boolean FastBitmap$CoordinateSystem = emojiButton.FastBitmap$CoordinateSystem();
                    float[] fArr2 = this.getMax;
                    float min = Math.min(Math.abs(this.invokeSuspend.toFloatRange() - this.invokeSuspend.toIntRange()), Math.abs(fArr2[2] - fArr2[0]));
                    this.length[0] = bubbleEntry.length();
                    this.length[1] = bubbleEntry.getMin() * length2;
                    transformer.length(this.length);
                    float[] fArr3 = this.length;
                    float f = fArr3[0];
                    float f2 = fArr3[1];
                    addfocusables.isInside = f;
                    addfocusables.IsOverlapping = f2;
                    float f3 = bubbleEntry.length;
                    float IsOverlapping = emojiButton.IsOverlapping();
                    if (FastBitmap$CoordinateSystem) {
                        if (IsOverlapping == 0.0f) {
                            f3 = 1.0f;
                        } else {
                            f3 = (float) Math.sqrt((double) (f3 / IsOverlapping));
                        }
                    }
                    float f4 = (min * f3) / 2.0f;
                    if (this.invokeSuspend.toIntRange(this.length[1] + f4) && this.invokeSuspend.equals(this.length[1] - f4) && this.invokeSuspend.toFloatRange(this.length[0] + f4)) {
                        if (this.invokeSuspend.isInside(this.length[0] - f4)) {
                            int max = emojiButton.setMax((int) bubbleEntry.length());
                            Color.RGBToHSV(Color.red(max), Color.green(max), Color.blue(max), this.setMin);
                            float[] fArr4 = this.setMin;
                            fArr4[2] = fArr4[2] * 0.5f;
                            this.IsOverlapping.setColor(Color.HSVToColor(Color.alpha(max), this.setMin));
                            this.IsOverlapping.setStrokeWidth(emojiButton.extraCallback());
                            float[] fArr5 = this.length;
                            canvas.drawCircle(fArr5[0], fArr5[1], f4, this.IsOverlapping);
                        } else {
                            return;
                        }
                    }
                }
            }
            Canvas canvas2 = canvas;
        }
    }
}
