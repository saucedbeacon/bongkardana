package o;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import o.sendEventForVirtualView;

public final class TextViewCompat$AutoSizeTextType extends scrollTo {
    private int IsOverlapping = 0;
    private int equals = 0;
    private final HashSet<AbsSavedState> getMax = new HashSet<>();
    private final List<AbsSavedState> getMin;
    /* access modifiers changed from: private */
    public boolean isInside = false;
    private final int length;
    private final fling setMax;
    private final sendEventForVirtualView.length setMin;
    private boolean toFloatRange = false;
    private dispatchHoverEvent toIntRange;

    public TextViewCompat$AutoSizeTextType(int i, List<AbsSavedState> list) {
        this.length = i;
        this.getMin = list;
        if (!list.isEmpty()) {
            this.setMax = new fling() {
                public final boolean getMax(AbsSavedState absSavedState) {
                    return true;
                }

                public final void getMin(AbsSavedState absSavedState) {
                }

                public final void length(AbsSavedState absSavedState) {
                }

                public final void setMin(AbsSavedState absSavedState) {
                    TextViewCompat$AutoSizeTextType.getMin(TextViewCompat$AutoSizeTextType.this, absSavedState);
                }

                public final void setMax(AbsSavedState absSavedState) {
                    TextViewCompat$AutoSizeTextType.getMin(TextViewCompat$AutoSizeTextType.this, absSavedState);
                }
            };
            if (this.length == 0) {
                this.setMin = null;
            } else {
                this.setMin = new sendEventForVirtualView.length() {
                    public final void getMax(long j) {
                        if (TextViewCompat$AutoSizeTextType.this.isInside) {
                            TextViewCompat$AutoSizeTextType.this.toFloatRange();
                        }
                    }
                };
            }
        } else {
            throw new IllegalArgumentException("Empty binding parallel");
        }
    }

    public final void setMax(dispatchHoverEvent dispatchhoverevent) {
        if (!this.toFloatRange) {
            this.toFloatRange = true;
            this.toIntRange = dispatchhoverevent;
            if (!length()) {
                getMin();
                return;
            }
            isInside();
            this.isInside = true;
            for (AbsSavedState max : this.getMin) {
                max.getMax(this.setMax);
            }
            if (this.length == 0) {
                int size = this.getMin.size();
                for (int i = 0; i < size; i++) {
                    this.getMin.get(i).setMax(this.toIntRange);
                }
                this.IsOverlapping = this.getMin.size();
                return;
            }
            int size2 = this.getMin.size();
            for (int i2 = 1; i2 < size2; i2++) {
                this.getMin.get(i2).getMax();
            }
            toFloatRange();
            return;
        }
        throw new RuntimeException("Starting binding multiple times");
    }

    /* access modifiers changed from: package-private */
    public final void toFloatRange() {
        this.getMin.get(this.IsOverlapping).setMax(this.toIntRange);
        int i = this.IsOverlapping + 1;
        this.IsOverlapping = i;
        if (i < this.getMin.size()) {
            guessPreviouslyFocusedRect.setMax().setMax(this.setMin, (long) this.length);
        }
    }

    public final void setMin() {
        if (this.isInside) {
            this.isInside = false;
            this.toIntRange = null;
            int size = this.getMin.size();
            for (int i = 0; i < size; i++) {
                AbsSavedState absSavedState = this.getMin.get(i);
                if (absSavedState.setMax()) {
                    absSavedState.setMin();
                }
            }
        }
    }

    public final boolean setMax() {
        return this.isInside;
    }

    public final void setMin(ArrayList<describeContents> arrayList) {
        int size = this.getMin.size();
        for (int i = 0; i < size; i++) {
            this.getMin.get(i).setMin(arrayList);
        }
    }

    public final void getMax() {
        equals();
        int size = this.getMin.size();
        for (int i = 0; i < size; i++) {
            this.getMin.get(i).getMax();
        }
    }

    static /* synthetic */ void getMin(TextViewCompat$AutoSizeTextType textViewCompat$AutoSizeTextType, AbsSavedState absSavedState) {
        if (!textViewCompat$AutoSizeTextType.getMax.contains(absSavedState)) {
            textViewCompat$AutoSizeTextType.getMax.add(absSavedState);
            textViewCompat$AutoSizeTextType.equals++;
            absSavedState.setMax(textViewCompat$AutoSizeTextType.setMax);
            if (textViewCompat$AutoSizeTextType.equals >= textViewCompat$AutoSizeTextType.getMin.size()) {
                textViewCompat$AutoSizeTextType.isInside = false;
                textViewCompat$AutoSizeTextType.toIntRange();
                return;
            }
            return;
        }
        throw new RuntimeException("Binding unexpectedly completed twice");
    }
}
