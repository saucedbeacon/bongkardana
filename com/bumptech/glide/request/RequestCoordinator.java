package com.bumptech.glide.request;

import o.getResolvedLayoutParams;

public interface RequestCoordinator {
    void IsOverlapping(getResolvedLayoutParams getresolvedlayoutparams);

    boolean getMin(getResolvedLayoutParams getresolvedlayoutparams);

    void length(getResolvedLayoutParams getresolvedlayoutparams);

    boolean setMax(getResolvedLayoutParams getresolvedlayoutparams);

    boolean setMin(getResolvedLayoutParams getresolvedlayoutparams);

    RequestCoordinator toFloatRange();

    boolean toIntRange();

    public enum RequestState {
        RUNNING(false),
        PAUSED(false),
        CLEARED(false),
        SUCCESS(true),
        FAILED(true);
        
        private final boolean isComplete;

        private RequestState(boolean z) {
            this.isComplete = z;
        }

        public final boolean isComplete() {
            return this.isComplete;
        }
    }
}
