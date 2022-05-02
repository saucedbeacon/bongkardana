package com.alibaba.griver.ui.ant.listview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.alibaba.griver.ui.R;

public class AUCornerListView extends AUListView {

    /* renamed from: a  reason: collision with root package name */
    private int f10561a = R.drawable.griver_ui_pop_list_corner_round;
    private int b = R.drawable.griver_ui_pop_list_corner_round_top;
    private int c = R.drawable.griver_ui_pop_list_corner_round_bottom;
    private int d = R.drawable.griver_ui_pop_list_corner_shape;
    private boolean e = false;
    private boolean f = false;

    public AUCornerListView(Context context) {
        super(context);
    }

    public AUCornerListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AUCornerListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            a(pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY()));
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    private void a(int i) {
        if (i == -1) {
            return;
        }
        if (i != getFirstVisiblePosition() || this.f) {
            if (i != getLastVisiblePosition() || this.e) {
                setSelector(this.d);
            } else {
                setSelector(this.c);
            }
        } else if (i == getAdapter().getCount() - 1) {
            setSelector(this.f10561a);
        } else {
            setSelector(this.b);
        }
    }

    public void updateHeadState(boolean z) {
        this.f = z;
    }

    public void updateFootState(boolean z) {
        this.e = z;
    }
}
