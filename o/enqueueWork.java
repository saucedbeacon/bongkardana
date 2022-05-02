package o;

import com.facebook.litho.annotations.Prop;
import com.facebook.yoga.YogaAlign;
import com.facebook.yoga.YogaFlexDirection;
import com.facebook.yoga.YogaJustify;
import com.facebook.yoga.YogaWrap;
import java.util.List;
import javax.annotation.Nullable;
import o.isStopped;
import o.setPositiveButtonIcon;

public final class enqueueWork extends isStopped {
    /* access modifiers changed from: private */
    public static final setPositiveButtonIcon.setMax<setMax> onMessageChannelReady = new setPositiveButtonIcon.setMax<>(2);
    @Prop(optional = true)
    private boolean ICustomTabsCallback;
    @Prop(optional = true)
    @Nullable
    private YogaWrap b;
    @Prop(optional = true)
    @Nullable
    private YogaAlign create;
    @Prop(optional = true)
    @Nullable
    private YogaJustify getCause;
    @Prop(optional = true)
    @Nullable
    List<isStopped> getMin;
    @Prop(optional = true)
    @Nullable
    private YogaAlign onNavigationEvent;

    public final isStopped getMax(ensureProcessorRunningLocked ensureprocessorrunninglocked) {
        return this;
    }

    /* access modifiers changed from: protected */
    public final boolean length() {
        return true;
    }

    public final /* synthetic */ boolean length(Object obj) {
        return length((isStopped) obj);
    }

    private enqueueWork() {
        super("Column");
    }

    public final boolean getMin(isStopped isstopped) {
        if (this == isstopped) {
            return true;
        }
        if (isstopped == null || getClass() != isstopped.getClass()) {
            return false;
        }
        enqueueWork enqueuework = (enqueueWork) isstopped;
        if (this.setMax == enqueuework.setMax) {
            return true;
        }
        List<isStopped> list = this.getMin;
        if (list != null) {
            if (enqueuework.getMin == null || list.size() != enqueuework.getMin.size()) {
                return false;
            }
            int size = this.getMin.size();
            for (int i = 0; i < size; i++) {
                if (!this.getMin.get(i).length(enqueuework.getMin.get(i))) {
                    return false;
                }
            }
        } else if (enqueuework.getMin != null) {
            return false;
        }
        YogaAlign yogaAlign = this.create;
        if (yogaAlign == null ? enqueuework.create != null : !yogaAlign.equals(enqueuework.create)) {
            return false;
        }
        YogaAlign yogaAlign2 = this.onNavigationEvent;
        if (yogaAlign2 == null ? enqueuework.onNavigationEvent != null : !yogaAlign2.equals(enqueuework.onNavigationEvent)) {
            return false;
        }
        YogaJustify yogaJustify = this.getCause;
        if (yogaJustify == null ? enqueuework.getCause == null : yogaJustify.equals(enqueuework.getCause)) {
            return this.ICustomTabsCallback == enqueuework.ICustomTabsCallback;
        }
        return false;
    }

    public static class setMax extends isStopped.setMax<setMax> {
        enqueueWork getMin;
        ensureProcessorRunningLocked length;

        /* access modifiers changed from: package-private */
        public final void setMax(ensureProcessorRunningLocked ensureprocessorrunninglocked, enqueueWork enqueuework) {
            super.setMax(ensureprocessorrunninglocked, enqueuework);
            this.getMin = enqueuework;
            this.length = ensureprocessorrunninglocked;
        }

        public final enqueueWork length() {
            enqueueWork enqueuework = this.getMin;
            super.setMin();
            this.getMin = null;
            this.length = null;
            enqueueWork.onMessageChannelReady.getMin(this);
            return enqueuework;
        }

        /* access modifiers changed from: protected */
        public final void setMin() {
            super.setMin();
            this.getMin = null;
            this.length = null;
            enqueueWork.onMessageChannelReady.getMin(this);
        }
    }

    public static setMax length(ensureProcessorRunningLocked ensureprocessorrunninglocked) {
        setMax max = onMessageChannelReady.getMax();
        if (max == null) {
            max = new setMax();
        }
        max.setMax(ensureprocessorrunninglocked, new enqueueWork());
        return max;
    }

    public final NotificationCompat$GroupAlertBehavior setMax(ensureProcessorRunningLocked ensureprocessorrunninglocked) {
        sendAccessibilityEvent min = NotificationCompatSideChannelService.getMin(ensureprocessorrunninglocked);
        boolean z = false;
        ensureprocessorrunninglocked.setMin(min, 0, 0);
        sendAccessibilityEvent max = min.getMax(this.ICustomTabsCallback ? YogaFlexDirection.COLUMN_REVERSE : YogaFlexDirection.COLUMN);
        YogaAlign yogaAlign = this.create;
        if (yogaAlign != null) {
            max.getMin(yogaAlign);
        }
        YogaAlign yogaAlign2 = this.onNavigationEvent;
        if (yogaAlign2 != null) {
            max.setMin(yogaAlign2);
        }
        YogaJustify yogaJustify = this.getCause;
        if (yogaJustify != null) {
            max.length(yogaJustify);
        }
        YogaWrap yogaWrap = this.b;
        if (yogaWrap != null) {
            max.length(yogaWrap);
        }
        if (this.getMin != null) {
            if (setFillViewport.setMax(this)) {
                z = onOverScrolled.getMin(ensureprocessorrunninglocked, this.getMin, max);
            }
            if (!z) {
                for (isStopped max2 : this.getMin) {
                    max.setMax(max2);
                }
            }
        }
        return max;
    }
}
