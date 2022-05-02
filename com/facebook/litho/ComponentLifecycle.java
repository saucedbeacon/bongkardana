package com.facebook.litho;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Nullable;
import com.facebook.infer.annotation.ThreadSafe;
import com.facebook.yoga.YogaBaselineFunction;
import com.facebook.yoga.YogaMeasureFunction;
import com.facebook.yoga.YogaMeasureMode;
import com.facebook.yoga.YogaNode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.concurrent.GuardedBy;
import o.IconCompat;
import o.NotificationCompat$GroupAlertBehavior;
import o.NotificationCompat$StreamType;
import o.NotificationCompatSideChannelService;
import o.PermissionInfoCompat$ProtectionFlags;
import o.ViewCompat$ScrollAxis;
import o.callbackFailAsync;
import o.computeVerticalScrollExtent;
import o.computeVerticalScrollRange;
import o.enqueueWork;
import o.ensureProcessorRunningLocked;
import o.isSmoothScrollingEnabled;
import o.isStopped;
import o.keyToDirection;
import o.onFontRetrievalFailed;
import o.onSizeChanged;
import o.sendAccessibilityEvent;
import o.setNestedScrollingEnabled;
import o.setPositiveButtonIcon;
import o.update;

public abstract class ComponentLifecycle implements callbackFailAsync {
    public static final int Grayscale$Algorithm = "__internalOnErrorHandler".hashCode();
    private static final YogaBaselineFunction getMax = new YogaBaselineFunction() {
        public final float baseline(YogaNode yogaNode, float f, float f2) {
            sendAccessibilityEvent sendaccessibilityevent = (sendAccessibilityEvent) yogaNode.toFloatRange;
            if (sendaccessibilityevent.setMax.size() != 0) {
                sendaccessibilityevent.setMax.get(0);
            }
            return (float) isStopped.length((int) f2);
        }
    };
    private static final AtomicInteger length = new AtomicInteger();
    @GuardedBy("sTypeIdByComponentType")
    private static final Map<Object, Integer> setMax = new HashMap();
    private static final YogaMeasureFunction setMin = new YogaMeasureFunction() {
        private final setPositiveButtonIcon.setMax<isSmoothScrollingEnabled> getMin = new setPositiveButtonIcon.setMax<>(2);

        @SuppressLint({"WrongCall"})
        public final long measure(YogaNode yogaNode, float f, YogaMeasureMode yogaMeasureMode, float f2, YogaMeasureMode yogaMeasureMode2) {
            PermissionInfoCompat$ProtectionFlags permissionInfoCompat$ProtectionFlags;
            int i;
            int i2;
            sendAccessibilityEvent sendaccessibilityevent = (sendAccessibilityEvent) yogaNode.toFloatRange;
            isStopped isstopped = null;
            if (sendaccessibilityevent.invoke()) {
                permissionInfoCompat$ProtectionFlags = sendaccessibilityevent.onPostMessage;
            } else {
                permissionInfoCompat$ProtectionFlags = null;
            }
            if (sendaccessibilityevent.setMax.size() != 0) {
                isstopped = sendaccessibilityevent.setMax.get(0);
            }
            NotificationCompat$StreamType.setMin();
            int length = SizeSpec.length(f, yogaMeasureMode);
            int length2 = SizeSpec.length(f2, yogaMeasureMode2);
            sendaccessibilityevent.getMax(length);
            sendaccessibilityevent.getMin(length2);
            if (isStopped.IsOverlapping(isstopped) || sendaccessibilityevent.ICustomTabsCallback$Stub()) {
                ensureProcessorRunningLocked ensureprocessorrunninglocked = sendaccessibilityevent.getMax;
                if (ensureprocessorrunninglocked.length()) {
                    ensureprocessorrunninglocked = sendaccessibilityevent.onMessageChannelReady().getMax;
                }
                sendAccessibilityEvent min = LayoutState.setMin(ensureprocessorrunninglocked, sendaccessibilityevent, length, length2);
                int max = min.setMax();
                i = min.setMin();
                i2 = max;
            } else if (permissionInfoCompat$ProtectionFlags != null && permissionInfoCompat$ProtectionFlags.isInside == length && permissionInfoCompat$ProtectionFlags.FastBitmap$CoordinateSystem == length2) {
                i2 = (int) permissionInfoCompat$ProtectionFlags.equals;
                i = (int) permissionInfoCompat$ProtectionFlags.toFloatRange;
            } else {
                isSmoothScrollingEnabled max2 = this.getMin.getMax();
                if (max2 == null) {
                    max2 = new isSmoothScrollingEnabled();
                }
                max2.setMax = Integer.MIN_VALUE;
                max2.length = Integer.MIN_VALUE;
                try {
                    throw new IllegalStateException("You must override onMeasure() if you return true in canMeasure(), ComponentLifecycle is: ".concat(String.valueOf(isstopped)));
                } catch (Throwable th) {
                    this.getMin.getMin(max2);
                    throw th;
                }
            }
            float f3 = (float) i2;
            sendaccessibilityevent.length(f3);
            float f4 = (float) i;
            sendaccessibilityevent.getMax(f4);
            return ((long) Float.floatToRawIntBits(f4)) | (((long) Float.floatToRawIntBits(f3)) << 32);
        }
    };
    public final int invokeSuspend;

    public enum MountType {
        NONE,
        DRAWABLE,
        VIEW
    }

    protected static int length(int i) {
        return i;
    }

    /* access modifiers changed from: protected */
    public void getMax(Object obj) {
    }

    /* access modifiers changed from: protected */
    public void getMin(Object obj) {
    }

    /* access modifiers changed from: protected */
    public void setMax(Object obj) {
    }

    /* access modifiers changed from: protected */
    public void setMin(NotificationCompat$GroupAlertBehavior notificationCompat$GroupAlertBehavior) {
    }

    /* access modifiers changed from: protected */
    public boolean toFloatRange() {
        return false;
    }

    @ThreadSafe
    public int values() {
        return 3;
    }

    ComponentLifecycle() {
        this((byte) 0);
    }

    public ComponentLifecycle(byte b) {
        Class<?> cls = getClass();
        synchronized (setMax) {
            if (!setMax.containsKey(cls)) {
                setMax.put(cls, Integer.valueOf(length.incrementAndGet()));
            }
            this.invokeSuspend = setMax.get(cls).intValue();
        }
    }

    @ThreadSafe(enableChecks = false)
    public final Object setMin(Context context) {
        NotificationCompat$StreamType.setMin();
        return getMax(context);
    }

    public final void setMin(Object obj) {
        setMax(obj);
    }

    public final sendAccessibilityEvent setMax(ensureProcessorRunningLocked ensureprocessorrunninglocked, boolean z) {
        sendAccessibilityEvent sendaccessibilityevent;
        isStopped isstopped = (isStopped) this;
        sendAccessibilityEvent sendaccessibilityevent2 = isstopped.Mean$Arithmetic;
        isStopped isstopped2 = null;
        isstopped.Mean$Arithmetic = null;
        if (sendaccessibilityevent2 != null) {
            return sendaccessibilityevent2;
        }
        boolean z2 = true;
        boolean z3 = isStopped.IsOverlapping(isstopped) && !z;
        ensureprocessorrunninglocked.toDoubleRange = ensureprocessorrunninglocked.toDoubleRange;
        NotificationCompat$StreamType.setMin();
        if (z3) {
            try {
                sendaccessibilityevent = NotificationCompatSideChannelService.getMin(ensureprocessorrunninglocked);
                computeVerticalScrollExtent computeverticalscrollextent = ensureprocessorrunninglocked.toDoubleRange;
                sendaccessibilityevent.setMin = true;
                sendaccessibilityevent.asBinder = computeverticalscrollextent == null ? null : computeVerticalScrollExtent.setMin(computeverticalscrollextent);
            } catch (Throwable th) {
                throw new getMax(isstopped, th);
            }
        } else if (isstopped.length()) {
            computeVerticalScrollExtent computeverticalscrollextent2 = isstopped.FastBitmap$CoordinateSystem.toDoubleRange;
            ensureprocessorrunninglocked.toDoubleRange = computeverticalscrollextent2 == null ? null : computeVerticalScrollExtent.setMin(computeverticalscrollextent2);
            sendaccessibilityevent = (sendAccessibilityEvent) isstopped.setMax(ensureprocessorrunninglocked);
        } else {
            isStopped length2 = length(ensureprocessorrunninglocked);
            if (length2 != null) {
                if (length2.setMax > 0) {
                    sendaccessibilityevent = ensureprocessorrunninglocked.getMax(length2);
                }
            }
            sendaccessibilityevent = null;
        }
        if (sendaccessibilityevent == null || sendaccessibilityevent == ensureProcessorRunningLocked.length) {
            return ensureProcessorRunningLocked.length;
        }
        setInterruptIfStopped setinterruptifstopped = isstopped.toDoubleRange;
        if (setinterruptifstopped != null) {
            if (!z3) {
                isStopped.getMax(isstopped);
            }
            setinterruptifstopped.length(ensureprocessorrunninglocked, sendaccessibilityevent);
        }
        if (sendaccessibilityevent.setMax.size() != 0) {
            isstopped2 = sendaccessibilityevent.setMax.get(0);
        }
        if (isstopped2 == null) {
            if (keyToDirection.warmup) {
                sendaccessibilityevent.setMin(getMax);
            }
            if (z3) {
                YogaMeasureFunction yogaMeasureFunction = setMin;
                YogaNode yogaNode = sendaccessibilityevent.length;
                yogaNode.length = yogaMeasureFunction;
                long j = yogaNode.getMin;
                if (yogaMeasureFunction == null) {
                    z2 = false;
                }
                YogaNode.jni_YGNodeSetHasMeasureFunc(j, z2);
            }
        }
        sendaccessibilityevent.getMin(isstopped);
        computeVerticalScrollRange.setMax(ensureprocessorrunninglocked.setMin);
        if (isstopped.invoke != null && !isstopped.invoke.isEmpty()) {
            List<onSizeChanged.length> list = isstopped.invoke;
            if (sendaccessibilityevent.asInterface == null) {
                sendaccessibilityevent.asInterface = new ArrayList<>(list.size());
            }
            sendaccessibilityevent.asInterface.addAll(list);
        }
        return sendaccessibilityevent;
    }

    @ThreadSafe(enableChecks = false)
    private isStopped length(ensureProcessorRunningLocked ensureprocessorrunninglocked) {
        isStopped.getMax((isStopped) this);
        try {
            return getMax(ensureprocessorrunninglocked);
        } catch (Exception e) {
            getMax(ensureprocessorrunninglocked, e);
            return null;
        }
    }

    private static void getMax(ensureProcessorRunningLocked ensureprocessorrunninglocked, Exception exc) {
        if (keyToDirection.toFloatRange) {
            onFontRetrievalFailed onfontretrievalfailed = new onFontRetrievalFailed();
            onfontretrievalfailed.getMax = exc;
            IconCompat<onFontRetrievalFailed> iconCompat = ensureprocessorrunninglocked.IsOverlapping.toString;
            if (iconCompat != null) {
                iconCompat.setMax(onfontretrievalfailed);
            }
        } else if (exc instanceof RuntimeException) {
            throw ((RuntimeException) exc);
        } else {
            throw new RuntimeException(exc);
        }
    }

    /* access modifiers changed from: protected */
    public isStopped getMax(ensureProcessorRunningLocked ensureprocessorrunninglocked) {
        if (keyToDirection.onMessageChannelReady) {
            return setNestedScrollingEnabled.getMin();
        }
        return enqueueWork.length(ensureprocessorrunninglocked).length();
    }

    public NotificationCompat$GroupAlertBehavior setMax(ensureProcessorRunningLocked ensureprocessorrunninglocked) {
        return setMax(ensureprocessorrunninglocked, false);
    }

    /* access modifiers changed from: protected */
    public Object getMax(Context context) {
        throw new RuntimeException("Trying to mount a MountSpec that doesn't implement @OnCreateMountContent");
    }

    public final ViewCompat$ScrollAxis toIntRange() {
        return new update(getClass().getSimpleName(), values());
    }

    public MountType equals() {
        return MountType.NONE;
    }

    @Nullable
    public final Object length(IconCompat iconCompat, Object obj) {
        if (!keyToDirection.toFloatRange || iconCompat.setMax != Grayscale$Algorithm) {
            return null;
        }
        ((isStopped) this).toString.setMax((onFontRetrievalFailed) obj);
        return null;
    }

    public final boolean setMax(isStopped isstopped, isStopped isstopped2) {
        if (toFloatRange()) {
            return getMax(isstopped, isstopped2);
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean getMax(isStopped isstopped, isStopped isstopped2) {
        return !isstopped.length(isstopped2);
    }

    static boolean FastBitmap$CoordinateSystem() {
        boolean z = keyToDirection.ICustomTabsCallback$Stub$Proxy;
        return false;
    }

    static class getMax extends RuntimeException {
        getMax(isStopped isstopped, Throwable th) {
            super(isstopped.valueOf);
            initCause(th);
            setStackTrace(new StackTraceElement[0]);
        }
    }

    public final void getMin(ensureProcessorRunningLocked ensureprocessorrunninglocked, Object obj) {
        ensureprocessorrunninglocked.toIntRange = "mount";
        NotificationCompat$StreamType.setMin();
        try {
            getMin(obj);
        } catch (Exception e) {
            ensureprocessorrunninglocked.toIntRange = null;
            getMax(ensureprocessorrunninglocked, e);
        }
        ensureprocessorrunninglocked.toIntRange = null;
        return;
    }

    public final void setMax(ensureProcessorRunningLocked ensureprocessorrunninglocked, Object obj) {
        ensureprocessorrunninglocked.toIntRange = "bind";
        NotificationCompat$StreamType.setMin();
        getMax(obj);
        ensureprocessorrunninglocked.toIntRange = null;
    }
}
