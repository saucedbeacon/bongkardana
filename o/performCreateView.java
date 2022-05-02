package o;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import com.github.mikephil.charting.data.CandleEntry;
import java.util.List;

public final class performCreateView extends onGetLayoutInflater {
    private float[] getMax = new float[8];
    private float[] getMin = new float[4];
    private float[] hashCode = new float[4];
    private float[] length = new float[4];
    protected EmojiCompat$LoadState setMax;
    private float[] setMin = new float[4];

    public final void setMax() {
    }

    public final void setMin(Canvas canvas) {
    }

    public performCreateView(EmojiCompat$LoadState emojiCompat$LoadState, setDrawerShadow setdrawershadow, setTargetFragment settargetfragment) {
        super(setdrawershadow, settargetfragment);
        this.setMax = emojiCompat$LoadState;
    }

    public final void getMax(Canvas canvas) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        for (getMaxEmojiCount getmaxemojicount : this.setMax.getCandleData().toIntRange()) {
            if (getmaxemojicount.b()) {
                getActivity transformer = this.setMax.getTransformer(getmaxemojicount.getCause());
                float length2 = this.equals.length();
                float IsOverlapping = getmaxemojicount.IsOverlapping();
                boolean FastBitmap$CoordinateSystem = getmaxemojicount.FastBitmap$CoordinateSystem();
                this.isInside.getMax(this.setMax, getmaxemojicount);
                this.toFloatRange.setStrokeWidth(getmaxemojicount.extraCallback());
                for (int i6 = this.isInside.setMin; i6 <= this.isInside.length + this.isInside.setMin; i6++) {
                    CandleEntry candleEntry = (CandleEntry) getmaxemojicount.toIntRange(i6);
                    if (candleEntry != null) {
                        float length3 = candleEntry.length();
                        float f = candleEntry.length;
                        float f2 = candleEntry.getMin;
                        float f3 = candleEntry.setMax;
                        float f4 = candleEntry.setMin;
                        if (FastBitmap$CoordinateSystem) {
                            float[] fArr = this.getMax;
                            fArr[0] = length3;
                            fArr[2] = length3;
                            fArr[4] = length3;
                            fArr[6] = length3;
                            if (f > f2) {
                                fArr[1] = f3 * length2;
                                fArr[3] = f * length2;
                                fArr[5] = f4 * length2;
                                fArr[7] = f2 * length2;
                            } else if (f < f2) {
                                fArr[1] = f3 * length2;
                                fArr[3] = f2 * length2;
                                fArr[5] = f4 * length2;
                                fArr[7] = f * length2;
                            } else {
                                fArr[1] = f3 * length2;
                                fArr[3] = f * length2;
                                fArr[5] = f4 * length2;
                                fArr[7] = fArr[3];
                            }
                            transformer.length(this.getMax);
                            if (!getmaxemojicount.ICustomTabsService()) {
                                Paint paint = this.toFloatRange;
                                if (getmaxemojicount.ICustomTabsCallback$Default() == 1122867) {
                                    i2 = getmaxemojicount.setMax(i6);
                                } else {
                                    i2 = getmaxemojicount.ICustomTabsCallback$Default();
                                }
                                paint.setColor(i2);
                            } else if (f > f2) {
                                Paint paint2 = this.toFloatRange;
                                if (getmaxemojicount.asInterface() == 1122867) {
                                    i5 = getmaxemojicount.setMax(i6);
                                } else {
                                    i5 = getmaxemojicount.asInterface();
                                }
                                paint2.setColor(i5);
                            } else if (f < f2) {
                                Paint paint3 = this.toFloatRange;
                                if (getmaxemojicount.onTransact() == 1122867) {
                                    i4 = getmaxemojicount.setMax(i6);
                                } else {
                                    i4 = getmaxemojicount.onTransact();
                                }
                                paint3.setColor(i4);
                            } else {
                                Paint paint4 = this.toFloatRange;
                                if (getmaxemojicount.ICustomTabsCallback$Stub() == 1122867) {
                                    i3 = getmaxemojicount.setMax(i6);
                                } else {
                                    i3 = getmaxemojicount.ICustomTabsCallback$Stub();
                                }
                                paint4.setColor(i3);
                            }
                            this.toFloatRange.setStyle(Paint.Style.STROKE);
                            canvas.drawLines(this.getMax, this.toFloatRange);
                            float[] fArr2 = this.setMin;
                            fArr2[0] = (length3 - 0.5f) + IsOverlapping;
                            fArr2[1] = f2 * length2;
                            fArr2[2] = (length3 + 0.5f) - IsOverlapping;
                            fArr2[3] = f * length2;
                            transformer.length(fArr2);
                            if (f > f2) {
                                if (getmaxemojicount.asInterface() == 1122867) {
                                    this.toFloatRange.setColor(getmaxemojicount.setMax(i6));
                                } else {
                                    this.toFloatRange.setColor(getmaxemojicount.asInterface());
                                }
                                this.toFloatRange.setStyle(getmaxemojicount.setDefaultImpl());
                                float[] fArr3 = this.setMin;
                                canvas.drawRect(fArr3[0], fArr3[3], fArr3[2], fArr3[1], this.toFloatRange);
                            } else if (f < f2) {
                                if (getmaxemojicount.onTransact() == 1122867) {
                                    this.toFloatRange.setColor(getmaxemojicount.setMax(i6));
                                } else {
                                    this.toFloatRange.setColor(getmaxemojicount.onTransact());
                                }
                                this.toFloatRange.setStyle(getmaxemojicount.asBinder());
                                float[] fArr4 = this.setMin;
                                canvas.drawRect(fArr4[0], fArr4[1], fArr4[2], fArr4[3], this.toFloatRange);
                            } else {
                                if (getmaxemojicount.ICustomTabsCallback$Stub() == 1122867) {
                                    this.toFloatRange.setColor(getmaxemojicount.setMax(i6));
                                } else {
                                    this.toFloatRange.setColor(getmaxemojicount.ICustomTabsCallback$Stub());
                                }
                                float[] fArr5 = this.setMin;
                                canvas.drawLine(fArr5[0], fArr5[1], fArr5[2], fArr5[3], this.toFloatRange);
                            }
                        } else {
                            Canvas canvas2 = canvas;
                            float[] fArr6 = this.length;
                            fArr6[0] = length3;
                            fArr6[1] = f3 * length2;
                            fArr6[2] = length3;
                            fArr6[3] = f4 * length2;
                            float[] fArr7 = this.getMin;
                            fArr7[0] = (length3 - 0.5f) + IsOverlapping;
                            float f5 = f * length2;
                            fArr7[1] = f5;
                            fArr7[2] = length3;
                            fArr7[3] = f5;
                            float[] fArr8 = this.hashCode;
                            fArr8[0] = (0.5f + length3) - IsOverlapping;
                            float f6 = f2 * length2;
                            fArr8[1] = f6;
                            fArr8[2] = length3;
                            fArr8[3] = f6;
                            transformer.length(fArr6);
                            transformer.length(this.getMin);
                            transformer.length(this.hashCode);
                            if (f > f2) {
                                if (getmaxemojicount.asInterface() == 1122867) {
                                    i = getmaxemojicount.setMax(i6);
                                } else {
                                    i = getmaxemojicount.asInterface();
                                }
                            } else if (f < f2) {
                                if (getmaxemojicount.onTransact() == 1122867) {
                                    i = getmaxemojicount.setMax(i6);
                                } else {
                                    i = getmaxemojicount.onTransact();
                                }
                            } else if (getmaxemojicount.ICustomTabsCallback$Stub() == 1122867) {
                                i = getmaxemojicount.setMax(i6);
                            } else {
                                i = getmaxemojicount.ICustomTabsCallback$Stub();
                            }
                            this.toFloatRange.setColor(i);
                            float[] fArr9 = this.length;
                            Canvas canvas3 = canvas;
                            canvas3.drawLine(fArr9[0], fArr9[1], fArr9[2], fArr9[3], this.toFloatRange);
                            float[] fArr10 = this.getMin;
                            canvas3.drawLine(fArr10[0], fArr10[1], fArr10[2], fArr10[3], this.toFloatRange);
                            float[] fArr11 = this.hashCode;
                            canvas3.drawLine(fArr11[0], fArr11[1], fArr11[2], fArr11[3], this.toFloatRange);
                        }
                    } else {
                        Canvas canvas4 = canvas;
                    }
                }
            }
            Canvas canvas5 = canvas;
        }
    }

    public final void setMax(Canvas canvas) {
        if (length((setValue) this.setMax)) {
            List intRange = this.setMax.getCandleData().toIntRange();
            for (int i = 0; i < intRange.size(); i++) {
                getMaxEmojiCount getmaxemojicount = (getMaxEmojiCount) intRange.get(i);
                if (!getMin(getmaxemojicount) || getmaxemojicount.ICustomTabsCallback() <= 0) {
                    Canvas canvas2 = canvas;
                } else {
                    length((EmojiAppCompatTextView) getmaxemojicount);
                    getActivity transformer = this.setMax.getTransformer(getmaxemojicount.getCause());
                    this.isInside.getMax(this.setMax, getmaxemojicount);
                    float[] min = transformer.getMin(getmaxemojicount, this.equals.getMin(), this.equals.length(), this.isInside.setMin, this.isInside.getMin);
                    float max = getTargetFragment.setMax(5.0f);
                    closeDrawers floatRange = getmaxemojicount.toFloatRange();
                    setArguments max2 = setArguments.setMax(getmaxemojicount.onNavigationEvent());
                    max2.length = getTargetFragment.setMax(max2.length);
                    max2.getMin = getTargetFragment.setMax(max2.getMin);
                    for (int i2 = 0; i2 < min.length; i2 += 2) {
                        float f = min[i2];
                        float f2 = min[i2 + 1];
                        if (!this.invokeSuspend.isInside(f)) {
                            break;
                        }
                        if (!this.invokeSuspend.toFloatRange(f) || !this.invokeSuspend.IsOverlapping(f2)) {
                            Canvas canvas3 = canvas;
                        } else {
                            int i3 = i2 / 2;
                            CandleEntry candleEntry = (CandleEntry) getmaxemojicount.toIntRange(this.isInside.setMin + i3);
                            if (getmaxemojicount.Mean$Arithmetic()) {
                                this.toString.setColor(getmaxemojicount.getMin(i3));
                                canvas.drawText(floatRange.getMin(candleEntry.setMax), f, f2 - max, this.toString);
                            } else {
                                Canvas canvas4 = canvas;
                            }
                            if (candleEntry.equals != null && getmaxemojicount.create()) {
                                Drawable drawable = candleEntry.equals;
                                getTargetFragment.setMax(canvas, drawable, (int) (f + max2.length), (int) (f2 + max2.getMin), drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
                            }
                        }
                    }
                    Canvas canvas5 = canvas;
                    setArguments.setMin(max2);
                }
            }
        }
    }

    public final void setMax(Canvas canvas, addFocusables[] addfocusablesArr) {
        getDrawerViewAbsoluteGravity candleData = this.setMax.getCandleData();
        for (addFocusables addfocusables : addfocusablesArr) {
            getMaxEmojiCount getmaxemojicount = (getMaxEmojiCount) candleData.setMin(addfocusables.equals);
            if (getmaxemojicount != null && getmaxemojicount.toIntRange()) {
                CandleEntry candleEntry = (CandleEntry) getmaxemojicount.length(addfocusables.setMax, addfocusables.getMin);
                if (setMax(candleEntry, getmaxemojicount)) {
                    isStateSaved max = this.setMax.getTransformer(getmaxemojicount.getCause()).getMax(candleEntry.length(), ((candleEntry.setMin * this.equals.length()) + (candleEntry.setMax * this.equals.length())) / 2.0f);
                    addfocusables.isInside = (float) max.length;
                    addfocusables.IsOverlapping = (float) max.getMin;
                    getMin(canvas, (float) max.length, (float) max.getMin, getmaxemojicount);
                }
            }
        }
    }
}
