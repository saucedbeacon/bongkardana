package com.yarolegovich.discretescrollview;

import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

public enum Direction {
    START {
        public final int applyTo(int i) {
            int max = dispatchOnCancelled.setMax(i);
            if (i != max) {
                onCanceled oncanceled = new onCanceled(i, max, 1);
                onCancelLoad.setMax(-969992170, oncanceled);
                onCancelLoad.getMin(-969992170, oncanceled);
            }
            return i * -1;
        }

        public final boolean sameAs(int i) {
            return i < 0;
        }
    },
    END {
        public final int applyTo(int i) {
            return i;
        }

        public final boolean sameAs(int i) {
            return i > 0;
        }
    };

    public abstract int applyTo(int i);

    public abstract boolean sameAs(int i);

    public static Direction fromDelta(int i) {
        return i > 0 ? END : START;
    }
}
