package o;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

public abstract class createFragmentContainer extends onDestroyView {
    protected Paint IsOverlapping;
    protected setDrawerShadow equals;
    protected Paint toFloatRange;
    protected Paint toIntRange = new Paint(4);
    protected Paint toString;

    public abstract void getMax(Canvas canvas);

    public abstract void setMax();

    public abstract void setMax(Canvas canvas);

    public abstract void setMax(Canvas canvas, addFocusables[] addfocusablesArr);

    public abstract void setMin(Canvas canvas);

    public createFragmentContainer(setDrawerShadow setdrawershadow, setTargetFragment settargetfragment) {
        super(settargetfragment);
        this.equals = setdrawershadow;
        Paint paint = new Paint(1);
        this.toFloatRange = paint;
        paint.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint(1);
        this.toString = paint2;
        paint2.setColor(Color.rgb(63, 63, 63));
        this.toString.setTextAlign(Paint.Align.CENTER);
        this.toString.setTextSize(getTargetFragment.setMax(9.0f));
        Paint paint3 = new Paint(1);
        this.IsOverlapping = paint3;
        paint3.setStyle(Paint.Style.STROKE);
        this.IsOverlapping.setStrokeWidth(2.0f);
        this.IsOverlapping.setColor(Color.rgb(255, 187, 115));
    }

    /* access modifiers changed from: protected */
    public boolean length(setValue setvalue) {
        return ((float) setvalue.getData().isInside()) < ((float) setvalue.getMaxVisibleCount()) * this.invokeSuspend.getMin;
    }

    /* access modifiers changed from: protected */
    public final void length(EmojiAppCompatTextView emojiAppCompatTextView) {
        this.toString.setTypeface(emojiAppCompatTextView.values());
        this.toString.setTextSize(emojiAppCompatTextView.toDoubleRange());
    }
}
