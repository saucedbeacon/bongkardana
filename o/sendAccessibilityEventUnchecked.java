package o;

import android.view.View;
import android.view.ViewParent;
import androidx.core.view.ViewCompat;
import androidx.viewpager.widget.ViewPager;
import com.facebook.litho.ComponentTree;
import com.facebook.litho.LithoView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.List;

public final class sendAccessibilityEventUnchecked {
    private final ComponentTree getMin;
    public List<length> setMin = new ArrayList(2);

    public sendAccessibilityEventUnchecked(ComponentTree componentTree) {
        this.getMin = componentTree;
    }

    public final void setMax(LithoView lithoView) {
        if (this.getMin.isInside()) {
            for (ViewParent parent = lithoView.getParent(); parent != null; parent = parent.getParent()) {
                if (parent instanceof ViewPager) {
                    final ViewPager viewPager = (ViewPager) parent;
                    final length length2 = new length(this.getMin, viewPager, (byte) 0);
                    try {
                        viewPager.addOnPageChangeListener(length2);
                    } catch (ConcurrentModificationException unused) {
                        ViewCompat.getMax((View) viewPager, (Runnable) new Runnable() {
                            public final void run() {
                                viewPager.addOnPageChangeListener(length2);
                            }
                        });
                    }
                    this.setMin.add(length2);
                }
            }
        }
    }

    public static class length extends ViewPager.IsOverlapping {
        private final WeakReference<ComponentTree> setMax;
        private final WeakReference<ViewPager> setMin;

        /* synthetic */ length(ComponentTree componentTree, ViewPager viewPager, byte b) {
            this(componentTree, viewPager);
        }

        private length(ComponentTree componentTree, ViewPager viewPager) {
            this.setMax = new WeakReference<>(componentTree);
            this.setMin = new WeakReference<>(viewPager);
        }

        public final void onPageScrolled(int i, float f, int i2) {
            ComponentTree componentTree = this.setMax.get();
            if (componentTree != null) {
                componentTree.getMax();
            }
        }

        public static /* synthetic */ void setMin(length length) {
            final ViewPager viewPager = length.setMin.get();
            if (viewPager != null) {
                ViewCompat.getMax((View) viewPager, (Runnable) new Runnable() {
                    public final void run() {
                        viewPager.removeOnPageChangeListener(length.this);
                    }
                });
            }
        }
    }
}
