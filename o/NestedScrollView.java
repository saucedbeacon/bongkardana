package o;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import com.facebook.litho.annotations.Event;
import java.lang.ref.WeakReference;
import javax.annotation.Nullable;

@Event
public final class NestedScrollView {
    public AccessibilityEvent getMin;
    public setOnCancelListener length;
    public View setMin;

    public final class SavedState extends createNodeForChild {
        private boolean IsOverlapping;
        private final hide<WeakReference<Object>> getMax = new hide<>();
        private final requestChildFocus setMin;

        public SavedState(hide<Object> hide, requestChildFocus requestchildfocus) {
            setMax(hide);
            this.setMin = requestchildfocus;
        }

        public final void getMax(float f) {
            super.getMax(f);
            getMin(f);
        }

        public final float setMin(long j) {
            boolean max = getMax();
            Object length = length(this.getMax.getMax());
            if (length == null) {
                if (max) {
                    return setMax().setMax;
                }
                return this.setMax;
            } else if (!max) {
                return this.setMin.getMin(length);
            } else {
                float f = setMax().setMax;
                getMin(f);
                return f;
            }
        }

        public final void setMax(hide<Object> hide) {
            hide<WeakReference<Object>> hide2 = this.getMax;
            for (int i = 0; i < hide2.setMax.length; i++) {
                hide2.setMax[i] = null;
            }
            hide2.getMin = 0;
            if (hide != null) {
                short s = hide.getMin;
                for (int i2 = 0; i2 < s; i2++) {
                    this.getMax.getMax(hide.getMax(i2), new WeakReference(hide.setMax(i2)));
                }
            }
        }

        public final void getMin(float f) {
            if (!this.IsOverlapping) {
                short s = this.getMax.getMin;
                for (int i = 0; i < s; i++) {
                    hide<WeakReference<Object>> hide = this.getMax;
                    Object length = length((WeakReference) hide.setMax[hide.getMax(i)]);
                    if (length != null) {
                        this.setMin.setMin(length, f);
                    }
                }
            }
        }

        @Nullable
        private static Object length(WeakReference<Object> weakReference) {
            Object obj = weakReference != null ? weakReference.get() : null;
            if (obj == null) {
                return null;
            }
            if (!(obj instanceof Drawable) || ((Drawable) obj).getCallback() != null) {
                return obj;
            }
            weakReference.clear();
            return null;
        }
    }
}
