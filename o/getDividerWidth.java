package o;

import android.view.View;

public abstract class getDividerWidth implements View.OnClickListener {
    private static final Runnable getMax = drawDividersVertical.getMax;
    /* access modifiers changed from: package-private */
    public static boolean setMax = true;

    public abstract void setMax(View view);

    public final void onClick(View view) {
        if (setMax) {
            setMax = false;
            view.post(getMax);
            setMax(view);
        }
    }
}
