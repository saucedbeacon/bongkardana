package o;

import android.content.Context;
import android.provider.Settings;
import androidx.annotation.Nullable;
import com.facebook.litho.Transition;
import java.util.ArrayList;
import java.util.List;

public final class computeVerticalScrollRange {
    computeVerticalScrollRange() {
    }

    static void getMax(pageScroll pagescroll, Transition transition, requestChildFocus requestchildfocus, Transition.getMin getmin) {
        int i = 0;
        if (transition instanceof smoothScrollTo) {
            ArrayList<Transition> arrayList = ((smoothScrollTo) transition).setMax;
            int size = arrayList.size();
            while (i < size) {
                getMax(pagescroll, arrayList.get(i), requestchildfocus, getmin);
                i++;
            }
        } else if (transition instanceof Transition.isInside) {
            Transition.isInside isinside = (Transition.isInside) transition;
            if (isinside.length(pagescroll) && isinside.getMax(requestchildfocus)) {
                getmin.setMax = true;
                if (isinside.setMin()) {
                    getmin.getMin = isinside;
                }
            }
        } else if (transition instanceof Transition.getMax) {
            ArrayList<Transition.isInside> min = ((Transition.getMax) transition).getMin();
            int size2 = min.size();
            while (i < size2) {
                getMax(pagescroll, min.get(i), requestchildfocus, getmin);
                i++;
            }
        } else {
            throw new RuntimeException("Unhandled transition type: ".concat(String.valueOf(transition)));
        }
    }

    public static boolean setMax(Context context) {
        if (!keyToDirection.setMax) {
            return false;
        }
        if (!keyToDirection.equals) {
            return true;
        }
        if (!keyToDirection.length) {
            return false;
        }
        float f = Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f);
        if (keyToDirection.valueOf || f != 0.0f) {
            return true;
        }
        return false;
    }

    public static void getMin(Transition transition, List<Transition> list, @Nullable String str) {
        if (transition instanceof Transition.getMax) {
            list.addAll(((Transition.getMax) transition).getMin());
        } else if (transition != null) {
            list.add(transition);
        } else {
            StringBuilder sb = new StringBuilder("[");
            sb.append(str);
            sb.append("] Adding null to transition list is not allowed.");
            throw new IllegalStateException(sb.toString());
        }
    }

    static boolean length(@Nullable Transition transition) {
        if (transition == null) {
            return false;
        }
        if (transition instanceof smoothScrollTo) {
            ArrayList<Transition> arrayList = ((smoothScrollTo) transition).setMax;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (length(arrayList.get(i))) {
                    return true;
                }
            }
        } else if (transition instanceof Transition.isInside) {
            Transition.ComponentTargetType componentTargetType = ((Transition.isInside) transition).setMin.getMin.setMax;
            if (componentTargetType == Transition.ComponentTargetType.ALL || componentTargetType == Transition.ComponentTargetType.AUTO_LAYOUT) {
                return true;
            }
        } else if (transition instanceof Transition.getMax) {
            ArrayList<Transition.isInside> min = ((Transition.getMax) transition).getMin();
            int size2 = min.size();
            for (int i2 = 0; i2 < size2; i2++) {
                if (length(min.get(i2))) {
                    return true;
                }
            }
        } else {
            throw new RuntimeException("Unhandled transition type: ".concat(String.valueOf(transition)));
        }
        return false;
    }
}
