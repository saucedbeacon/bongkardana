package o;

import android.app.Activity;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.PopupWindow;

public final class getSeletedItem extends PopupWindow implements ViewTreeObserver.OnGlobalLayoutListener {
    public length getMin;
    public Activity length;
    private View setMax;
    private int setMin;

    public interface length {
        void setMin(int i);
    }

    public getSeletedItem(Activity activity) {
        super(activity);
        this.length = activity;
        View view = new View(activity);
        this.setMax = view;
        setContentView(view);
        this.setMax.getViewTreeObserver().addOnGlobalLayoutListener(this);
        setBackgroundDrawable(new ColorDrawable(0));
        setWidth(0);
        setHeight(-1);
        setSoftInputMode(16);
        setInputMethodMode(1);
    }

    public final void onGlobalLayout() {
        Rect rect = new Rect();
        this.setMax.getWindowVisibleDisplayFrame(rect);
        if (rect.bottom > this.setMin) {
            this.setMin = rect.bottom;
        }
        int i = this.setMin - rect.bottom;
        length length2 = this.getMin;
        if (length2 != null) {
            length2.setMin(i);
        }
    }
}
