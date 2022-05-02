package o;

import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.Entry;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o.EmojiAppCompatTextView;

public abstract class checkDrawerViewAbsoluteGravity<T extends EmojiAppCompatTextView<? extends Entry>> {
    protected float IsOverlapping;
    protected float equals;
    protected float getMin;
    protected float isInside;
    protected float length;
    protected float setMax;
    protected float setMin;
    protected List<T> toFloatRange;
    protected float toIntRange;

    public checkDrawerViewAbsoluteGravity() {
        this.setMin = -3.4028235E38f;
        this.setMax = Float.MAX_VALUE;
        this.length = -3.4028235E38f;
        this.getMin = Float.MAX_VALUE;
        this.IsOverlapping = -3.4028235E38f;
        this.equals = Float.MAX_VALUE;
        this.isInside = -3.4028235E38f;
        this.toIntRange = Float.MAX_VALUE;
        this.toFloatRange = new ArrayList();
    }

    public checkDrawerViewAbsoluteGravity(List<T> list) {
        this.setMin = -3.4028235E38f;
        this.setMax = Float.MAX_VALUE;
        this.length = -3.4028235E38f;
        this.getMin = Float.MAX_VALUE;
        this.IsOverlapping = -3.4028235E38f;
        this.equals = Float.MAX_VALUE;
        this.isInside = -3.4028235E38f;
        this.toIntRange = Float.MAX_VALUE;
        this.toFloatRange = list;
        length();
    }

    public void length() {
        getMax();
    }

    public final void getMin(float f, float f2) {
        for (T max : this.toFloatRange) {
            max.setMax(f, f2);
        }
        getMax();
    }

    /* access modifiers changed from: protected */
    public void getMax() {
        EmojiAppCompatTextView emojiAppCompatTextView;
        EmojiAppCompatTextView emojiAppCompatTextView2;
        List<T> list = this.toFloatRange;
        if (list != null) {
            this.setMin = -3.4028235E38f;
            this.setMax = Float.MAX_VALUE;
            this.length = -3.4028235E38f;
            this.getMin = Float.MAX_VALUE;
            for (T t : list) {
                if (this.setMin < t.onPostMessage()) {
                    this.setMin = t.onPostMessage();
                }
                if (this.setMax > t.onRelationshipValidationResult()) {
                    this.setMax = t.onRelationshipValidationResult();
                }
                if (this.length < t.onMessageChannelReady()) {
                    this.length = t.onMessageChannelReady();
                }
                if (this.getMin > t.extraCallbackWithResult()) {
                    this.getMin = t.extraCallbackWithResult();
                }
                if (t.getCause() == YAxis.AxisDependency.LEFT) {
                    if (this.IsOverlapping < t.onPostMessage()) {
                        this.IsOverlapping = t.onPostMessage();
                    }
                    if (this.equals > t.onRelationshipValidationResult()) {
                        this.equals = t.onRelationshipValidationResult();
                    }
                } else {
                    if (this.isInside < t.onPostMessage()) {
                        this.isInside = t.onPostMessage();
                    }
                    if (this.toIntRange > t.onRelationshipValidationResult()) {
                        this.toIntRange = t.onRelationshipValidationResult();
                    }
                }
            }
            this.IsOverlapping = -3.4028235E38f;
            this.equals = Float.MAX_VALUE;
            this.isInside = -3.4028235E38f;
            this.toIntRange = Float.MAX_VALUE;
            Iterator<T> it = this.toFloatRange.iterator();
            while (true) {
                emojiAppCompatTextView = null;
                if (!it.hasNext()) {
                    emojiAppCompatTextView2 = null;
                    break;
                }
                emojiAppCompatTextView2 = (EmojiAppCompatTextView) it.next();
                if (emojiAppCompatTextView2.getCause() == YAxis.AxisDependency.LEFT) {
                    break;
                }
            }
            if (emojiAppCompatTextView2 != null) {
                this.IsOverlapping = emojiAppCompatTextView2.onPostMessage();
                this.equals = emojiAppCompatTextView2.onRelationshipValidationResult();
                for (T t2 : this.toFloatRange) {
                    if (t2.getCause() == YAxis.AxisDependency.LEFT) {
                        if (t2.onRelationshipValidationResult() < this.equals) {
                            this.equals = t2.onRelationshipValidationResult();
                        }
                        if (t2.onPostMessage() > this.IsOverlapping) {
                            this.IsOverlapping = t2.onPostMessage();
                        }
                    }
                }
            }
            Iterator<T> it2 = this.toFloatRange.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                EmojiAppCompatTextView emojiAppCompatTextView3 = (EmojiAppCompatTextView) it2.next();
                if (emojiAppCompatTextView3.getCause() == YAxis.AxisDependency.RIGHT) {
                    emojiAppCompatTextView = emojiAppCompatTextView3;
                    break;
                }
            }
            if (emojiAppCompatTextView != null) {
                this.isInside = emojiAppCompatTextView.onPostMessage();
                this.toIntRange = emojiAppCompatTextView.onRelationshipValidationResult();
                for (T t3 : this.toFloatRange) {
                    if (t3.getCause() == YAxis.AxisDependency.RIGHT) {
                        if (t3.onRelationshipValidationResult() < this.toIntRange) {
                            this.toIntRange = t3.onRelationshipValidationResult();
                        }
                        if (t3.onPostMessage() > this.isInside) {
                            this.isInside = t3.onPostMessage();
                        }
                    }
                }
            }
        }
    }

    public final int setMin() {
        List<T> list = this.toFloatRange;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public final float setMax() {
        return this.setMax;
    }

    public final float length(YAxis.AxisDependency axisDependency) {
        if (axisDependency == YAxis.AxisDependency.LEFT) {
            float f = this.equals;
            return f == Float.MAX_VALUE ? this.toIntRange : f;
        }
        float f2 = this.toIntRange;
        return f2 == Float.MAX_VALUE ? this.equals : f2;
    }

    public final float getMin() {
        return this.setMin;
    }

    public final float getMin(YAxis.AxisDependency axisDependency) {
        if (axisDependency == YAxis.AxisDependency.LEFT) {
            float f = this.IsOverlapping;
            return f == -3.4028235E38f ? this.isInside : f;
        }
        float f2 = this.isInside;
        return f2 == -3.4028235E38f ? this.IsOverlapping : f2;
    }

    public final float toFloatRange() {
        return this.getMin;
    }

    public final float equals() {
        return this.length;
    }

    public final List<T> toIntRange() {
        return this.toFloatRange;
    }

    public T setMin(int i) {
        List<T> list = this.toFloatRange;
        if (list == null || i < 0 || i >= list.size()) {
            return null;
        }
        return (EmojiAppCompatTextView) this.toFloatRange.get(i);
    }

    public final T length(Entry entry) {
        if (entry == null) {
            return null;
        }
        for (int i = 0; i < this.toFloatRange.size(); i++) {
            T t = (EmojiAppCompatTextView) this.toFloatRange.get(i);
            for (int i2 = 0; i2 < t.ICustomTabsCallback(); i2++) {
                if (entry.getMax(t.length(entry.length(), entry.getMin()))) {
                    return t;
                }
            }
        }
        return null;
    }

    public final void IsOverlapping() {
        List<T> list = this.toFloatRange;
        if (list != null) {
            list.clear();
        }
        length();
    }

    public final int isInside() {
        int i = 0;
        for (T ICustomTabsCallback : this.toFloatRange) {
            i += ICustomTabsCallback.ICustomTabsCallback();
        }
        return i;
    }

    public final T FastBitmap$CoordinateSystem() {
        List<T> list = this.toFloatRange;
        if (list == null || list.isEmpty()) {
            return null;
        }
        T t = (EmojiAppCompatTextView) this.toFloatRange.get(0);
        for (T t2 : this.toFloatRange) {
            if (t2.ICustomTabsCallback() > t.ICustomTabsCallback()) {
                t = t2;
            }
        }
        return t;
    }

    public Entry setMax(addFocusables addfocusables) {
        if (addfocusables.equals >= this.toFloatRange.size()) {
            return null;
        }
        return ((EmojiAppCompatTextView) this.toFloatRange.get(addfocusables.equals)).length(addfocusables.setMax, addfocusables.getMin);
    }
}
