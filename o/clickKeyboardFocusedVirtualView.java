package o;

import o.sendEventForVirtualView;

public final class clickKeyboardFocusedVirtualView implements onVirtualViewKeyboardFocusChanged {
    long IsOverlapping = Long.MIN_VALUE;
    final sendEventForVirtualView.length getMax = new sendEventForVirtualView.length() {
        public final void getMax(long j) {
            clickKeyboardFocusedVirtualView clickkeyboardfocusedvirtualview = clickKeyboardFocusedVirtualView.this;
            clickkeyboardfocusedvirtualview.setMin = false;
            if (clickkeyboardfocusedvirtualview.getMin) {
                if (clickkeyboardfocusedvirtualview.IsOverlapping != j) {
                    clickkeyboardfocusedvirtualview.length.setMax(j);
                    clickkeyboardfocusedvirtualview.IsOverlapping = j;
                }
                if (clickkeyboardfocusedvirtualview.getMin && !clickkeyboardfocusedvirtualview.setMin) {
                    clickkeyboardfocusedvirtualview.setMax.getMax(clickkeyboardfocusedvirtualview.getMax);
                    clickkeyboardfocusedvirtualview.setMin = true;
                }
            }
        }
    };
    boolean getMin = false;
    updateHoveredVirtualView length;
    final sendEventForVirtualView setMax = guessPreviouslyFocusedRect.setMax();
    boolean setMin = false;

    public final void length() {
        if (this.length == null) {
            throw new RuntimeException("Must set a binding graph first.");
        } else if (!this.getMin) {
            this.getMin = true;
            if (!this.setMin) {
                this.setMax.getMax(this.getMax);
                this.setMin = true;
            }
        } else {
            throw new RuntimeException("Tried to start but was already running.");
        }
    }

    public final void getMin() {
        if (this.getMin) {
            this.getMin = false;
            this.setMax.length(this.getMax);
            this.setMin = false;
            return;
        }
        throw new RuntimeException("Tried to stop but wasn't running.");
    }
}
