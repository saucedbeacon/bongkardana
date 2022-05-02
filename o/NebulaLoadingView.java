package o;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

public class NebulaLoadingView implements View.OnTouchListener {
    private final GestureDetector length;

    public void length() {
    }

    public NebulaLoadingView(Context context) {
        this.length = new GestureDetector(context, new getMax(this, (byte) 0));
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        return this.length.onTouchEvent(motionEvent);
    }

    final class getMax extends GestureDetector.SimpleOnGestureListener {
        public final boolean onDown(MotionEvent motionEvent) {
            return true;
        }

        private getMax() {
        }

        /* synthetic */ getMax(NebulaLoadingView nebulaLoadingView, byte b) {
            this();
        }

        public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            try {
                float y = motionEvent2.getY() - motionEvent.getY();
                float x = motionEvent2.getX() - motionEvent.getX();
                if (Math.abs(x) > Math.abs(y) && Math.abs(x) > 100.0f && Math.abs(f) > 100.0f) {
                    return true;
                }
                if (Math.abs(y) > 100.0f && Math.abs(f2) > 100.0f) {
                    if (y <= 0.0f) {
                        return true;
                    }
                    NebulaLoadingView.this.length();
                    return true;
                }
                return false;
            } catch (Exception unused) {
            }
        }
    }
}
