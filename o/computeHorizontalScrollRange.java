package o;

import android.animation.StateListAnimator;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.annotation.DrawableRes;
import com.facebook.yoga.YogaDirection;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.Nullable;

public final class computeHorizontalScrollRange {
    public YogaDirection equals;
    public final AtomicInteger getMax = new AtomicInteger(0);
    public onPerformActionForVirtualView<? extends Drawable> getMin;
    @DrawableRes
    public int isInside;
    Rect length;
    public getVirtualViewAt setMax;
    public Rect setMin;
    @Nullable
    public StateListAnimator toIntRange;

    computeHorizontalScrollRange() {
    }

    public final void length(int i, int i2, int i3, int i4) {
        int max = dispatchOnCancelled.setMax(i);
        if (i != max) {
            onCanceled oncanceled = new onCanceled(i, max, 1);
            onCancelLoad.setMax(1484947790, oncanceled);
            onCancelLoad.getMin(1484947790, oncanceled);
        }
        if (this.length == null) {
            Rect isInside2 = NotificationCompatSideChannelService.isInside();
            this.length = isInside2;
            isInside2.set(i, i2, i3, i4);
            return;
        }
        throw new IllegalStateException("Padding already initialized for this ViewNodeInfo.");
    }

    /* access modifiers changed from: package-private */
    public final boolean getMax() {
        return this.length != null;
    }

    public final void length(sendAccessibilityEvent sendaccessibilityevent, int i, int i2, int i3, int i4) {
        if (sendaccessibilityevent.ICustomTabsCallback()) {
            int cause = sendaccessibilityevent.getCause();
            int b = sendaccessibilityevent.b();
            int create = sendaccessibilityevent.create();
            int onNavigationEvent = sendaccessibilityevent.onNavigationEvent();
            if (cause != 0 || b != 0 || create != 0 || onNavigationEvent != 0) {
                if (this.setMin == null) {
                    Rect isInside2 = NotificationCompatSideChannelService.isInside();
                    this.setMin = isInside2;
                    isInside2.set(i - cause, i2 - b, i3 + create, i4 + onNavigationEvent);
                    return;
                }
                throw new IllegalStateException("ExpandedTouchBounds already initialized for this ViewNodeInfo.");
            }
        }
    }

    public final boolean setMin(computeHorizontalScrollRange computehorizontalscrollrange) {
        if (this == computehorizontalscrollrange) {
            return true;
        }
        return computehorizontalscrollrange != null && !onPerformActionForVirtualView.setMax(this.getMin, computehorizontalscrollrange.getMin) && getVirtualViewAt.getMin(this.setMax, computehorizontalscrollrange.setMax) && processorFinished.length(this.length, computehorizontalscrollrange.length) && processorFinished.length(this.setMin, computehorizontalscrollrange.setMin) && processorFinished.length(this.equals, computehorizontalscrollrange.equals) && this.isInside == computehorizontalscrollrange.isInside && processorFinished.length(this.toIntRange, computehorizontalscrollrange.toIntRange);
    }

    public final void length() {
        int decrementAndGet = this.getMax.decrementAndGet();
        if (decrementAndGet < 0) {
            throw new IllegalStateException("Trying to release a recycled ViewNodeInfo.");
        } else if (decrementAndGet <= 0 && !keyToDirection.ICustomTabsCallback$Default) {
            this.getMin = null;
            this.setMax = null;
            this.equals = YogaDirection.INHERIT;
            this.toIntRange = null;
            Rect rect = this.length;
            if (rect != null) {
                NotificationCompatSideChannelService.setMax(rect);
                this.length = null;
            }
            Rect rect2 = this.setMin;
            if (rect2 != null) {
                NotificationCompatSideChannelService.setMax(rect2);
                this.setMin = null;
            }
            NotificationCompatSideChannelService.setMax(this);
        }
    }
}
