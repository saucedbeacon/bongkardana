package o;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import com.github.mikephil.charting.data.Entry;
import java.util.List;

public final class getMinimumMaxLifecycleState extends onGetLayoutInflater {
    protected setFilters length;
    float[] setMin = new float[2];

    public final void setMax() {
    }

    public final void setMin(Canvas canvas) {
    }

    public getMinimumMaxLifecycleState(setFilters setfilters, setDrawerShadow setdrawershadow, setTargetFragment settargetfragment) {
        super(setdrawershadow, settargetfragment);
        this.length = setfilters;
    }

    public final void getMax(Canvas canvas) {
        for (EmojiExtractEditText emojiExtractEditText : this.length.getScatterData().toIntRange()) {
            if (emojiExtractEditText.b() && emojiExtractEditText.ICustomTabsCallback() > 0) {
                setTargetFragment settargetfragment = this.invokeSuspend;
                getActivity transformer = this.length.getTransformer(emojiExtractEditText.getCause());
                float length2 = this.equals.length();
                if (emojiExtractEditText.FastBitmap$CoordinateSystem() != null) {
                    int min = (int) Math.min(Math.ceil((double) (((float) emojiExtractEditText.ICustomTabsCallback()) * this.equals.getMin())), (double) ((float) emojiExtractEditText.ICustomTabsCallback()));
                    for (int i = 0; i < min; i++) {
                        Entry intRange = emojiExtractEditText.toIntRange(i);
                        this.setMin[0] = intRange.length();
                        this.setMin[1] = intRange.getMin() * length2;
                        transformer.length(this.setMin);
                        if (!settargetfragment.isInside(this.setMin[0])) {
                            break;
                        }
                        if (settargetfragment.toFloatRange(this.setMin[0]) && settargetfragment.IsOverlapping(this.setMin[1])) {
                            this.toFloatRange.setColor(emojiExtractEditText.setMax(i / 2));
                        }
                    }
                }
            }
        }
    }

    public final void setMax(Canvas canvas) {
        if (length((setValue) this.length)) {
            List intRange = this.length.getScatterData().toIntRange();
            for (int i = 0; i < this.length.getScatterData().setMin(); i++) {
                EmojiExtractEditText emojiExtractEditText = (EmojiExtractEditText) intRange.get(i);
                if (!getMin(emojiExtractEditText) || emojiExtractEditText.ICustomTabsCallback() <= 0) {
                    Canvas canvas2 = canvas;
                } else {
                    length((EmojiAppCompatTextView) emojiExtractEditText);
                    this.isInside.getMax(this.length, emojiExtractEditText);
                    float[] min = this.length.getTransformer(emojiExtractEditText.getCause()).setMin(emojiExtractEditText, this.equals.getMin(), this.equals.length(), this.isInside.setMin, this.isInside.getMin);
                    float max = getTargetFragment.setMax(emojiExtractEditText.IsOverlapping());
                    closeDrawers floatRange = emojiExtractEditText.toFloatRange();
                    setArguments max2 = setArguments.setMax(emojiExtractEditText.onNavigationEvent());
                    max2.length = getTargetFragment.setMax(max2.length);
                    max2.getMin = getTargetFragment.setMax(max2.getMin);
                    int i2 = 0;
                    while (i2 < min.length && this.invokeSuspend.isInside(min[i2])) {
                        if (this.invokeSuspend.toFloatRange(min[i2])) {
                            int i3 = i2 + 1;
                            if (this.invokeSuspend.IsOverlapping(min[i3])) {
                                int i4 = i2 / 2;
                                Entry intRange2 = emojiExtractEditText.toIntRange(this.isInside.setMin + i4);
                                if (emojiExtractEditText.Mean$Arithmetic()) {
                                    this.toString.setColor(emojiExtractEditText.getMin(i4 + this.isInside.setMin));
                                    canvas.drawText(floatRange.getMin(intRange2.getMin()), min[i2], min[i3] - max, this.toString);
                                } else {
                                    Canvas canvas3 = canvas;
                                }
                                if (intRange2.equals != null && emojiExtractEditText.create()) {
                                    Drawable drawable = intRange2.equals;
                                    getTargetFragment.setMax(canvas, drawable, (int) (min[i2] + max2.length), (int) (min[i3] + max2.getMin), drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
                                }
                                i2 += 2;
                            }
                        }
                        Canvas canvas4 = canvas;
                        i2 += 2;
                    }
                    Canvas canvas5 = canvas;
                    setArguments.setMin(max2);
                }
            }
        }
    }

    public final void setMax(Canvas canvas, addFocusables[] addfocusablesArr) {
        moveDrawerToOffset scatterData = this.length.getScatterData();
        for (addFocusables addfocusables : addfocusablesArr) {
            EmojiExtractEditText emojiExtractEditText = (EmojiExtractEditText) scatterData.setMin(addfocusables.equals);
            if (emojiExtractEditText != null && emojiExtractEditText.toIntRange()) {
                Entry length2 = emojiExtractEditText.length(addfocusables.setMax, addfocusables.getMin);
                if (setMax(length2, emojiExtractEditText)) {
                    isStateSaved max = this.length.getTransformer(emojiExtractEditText.getCause()).getMax(length2.length(), length2.getMin() * this.equals.length());
                    addfocusables.isInside = (float) max.length;
                    addfocusables.IsOverlapping = (float) max.getMin;
                    getMin(canvas, (float) max.length, (float) max.getMin, emojiExtractEditText);
                }
            }
        }
    }
}
