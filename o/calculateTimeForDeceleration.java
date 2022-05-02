package o;

import android.app.Activity;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.exoplayer2.DefaultLoadControl;

public final class calculateTimeForDeceleration {
    public calculateTimeForDeceleration(final convertFocusDirectionToLayoutDirection convertfocusdirectiontolayoutdirection, Activity activity) {
        activity.getWindow().getDecorView().setOnTouchListener(new View.OnTouchListener() {
            private long IsOverlapping = -1;
            private final int equals = 100;
            private long getMin = -1;
            private final int isInside = DefaultLoadControl.DEFAULT_BUFFER_FOR_PLAYBACK_MS;
            private int setMax = 0;
            private long setMin = -1;
            private final int toFloatRange = 1000;
            private boolean toIntRange = false;

            public final boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getPointerCount() > 2) {
                    this.setMin = -1;
                    this.getMin = -1;
                    this.setMax = 0;
                    this.IsOverlapping = -1;
                    this.toIntRange = false;
                    return false;
                }
                int actionMasked = motionEvent.getActionMasked();
                if (actionMasked == 0) {
                    this.setMin = System.currentTimeMillis();
                } else if (actionMasked != 1) {
                    if (actionMasked != 5) {
                        if (actionMasked == 6) {
                            if (this.toIntRange) {
                                this.setMin = System.currentTimeMillis();
                            } else {
                                this.setMin = -1;
                                this.getMin = -1;
                                this.setMax = 0;
                                this.IsOverlapping = -1;
                                this.toIntRange = false;
                            }
                        }
                    } else if (System.currentTimeMillis() - this.setMin < 100) {
                        if (System.currentTimeMillis() - this.IsOverlapping > 1000) {
                            this.setMin = -1;
                            this.getMin = -1;
                            this.setMax = 0;
                            this.IsOverlapping = -1;
                            this.toIntRange = false;
                        }
                        this.getMin = System.currentTimeMillis();
                        this.toIntRange = true;
                    } else {
                        this.setMin = -1;
                        this.getMin = -1;
                        this.setMax = 0;
                        this.IsOverlapping = -1;
                        this.toIntRange = false;
                    }
                } else if (System.currentTimeMillis() - this.setMin < 100) {
                    if (System.currentTimeMillis() - this.getMin >= 2500) {
                        if (this.setMax == 3) {
                            convertfocusdirectiontolayoutdirection.getMin("$ab_gesture1");
                            this.setMin = -1;
                            this.getMin = -1;
                            this.setMax = 0;
                            this.IsOverlapping = -1;
                            this.toIntRange = false;
                        }
                        this.setMax = 0;
                    } else {
                        this.IsOverlapping = System.currentTimeMillis();
                        int i = this.setMax;
                        if (i < 4) {
                            this.setMax = i + 1;
                        } else {
                            if (i == 4) {
                                convertfocusdirectiontolayoutdirection.getMin("$ab_gesture2");
                            }
                            this.setMin = -1;
                            this.getMin = -1;
                            this.setMax = 0;
                            this.IsOverlapping = -1;
                            this.toIntRange = false;
                        }
                    }
                }
                return false;
            }
        });
    }
}
