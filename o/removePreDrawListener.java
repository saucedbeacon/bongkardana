package o;

import com.crashlytics.android.answers.Answers;
import com.crashlytics.android.answers.CustomEvent;
import o.CoordinatorLayout;

final class removePreDrawListener implements CoordinatorLayout.Behavior {
    private final Answers getMax;

    removePreDrawListener(Answers answers) {
        this.getMax = answers;
    }

    public final void length(onAttachedToLayoutParams onattachedtolayoutparams) {
        try {
            Answers answers = this.getMax;
            CustomEvent customEvent = new CustomEvent(onattachedtolayoutparams.getMin);
            for (String next : onattachedtolayoutparams.getMax.keySet()) {
                Object obj = onattachedtolayoutparams.getMax.get(next);
                if (obj instanceof String) {
                    customEvent.putCustomAttribute(next, (String) obj);
                } else if (obj instanceof Number) {
                    customEvent.putCustomAttribute(next, (Number) obj);
                }
            }
            answers.logCustom(customEvent);
        } catch (Throwable unused) {
        }
    }
}
