package o;

import com.facebook.litho.Transition;
import java.util.ArrayList;
import java.util.List;

public abstract class smoothScrollTo extends Transition {
    final ArrayList<Transition> setMax = new ArrayList<>();

    /* access modifiers changed from: package-private */
    public abstract AbsSavedState length(List<AbsSavedState> list);

    <T extends Transition> smoothScrollTo(List<T> list) {
        for (int i = 0; i < list.size(); i++) {
            Transition transition = (Transition) list.get(i);
            if (transition instanceof Transition.getMax) {
                ArrayList<Transition.isInside> min = ((Transition.getMax) transition).getMin();
                if (min.size() > 1) {
                    this.setMax.add(new hasNestedScrollingParent(min));
                } else {
                    this.setMax.add(min.get(0));
                }
            } else if (transition != null) {
                this.setMax.add(transition);
            } else {
                throw new IllegalStateException("Null element is not allowed in transition set");
            }
        }
    }
}
