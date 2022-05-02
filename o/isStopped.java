package o;

import android.util.SparseIntArray;
import androidx.annotation.GuardedBy;
import androidx.annotation.VisibleForTesting;
import com.facebook.infer.annotation.ThreadConfined;
import com.facebook.litho.ComponentLifecycle;
import com.facebook.litho.ComponentsLogger;
import com.facebook.litho.LayoutState;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.Nullable;
import o.NotificationCompatSideChannelService;
import o.onSizeChanged;

public abstract class isStopped extends ComponentLifecycle implements Cloneable, BuildCompat$PrereleaseSdkCheck, FontResourcesParserCompat$FetchStrategy<isStopped> {
    public static final AtomicInteger length = new AtomicInteger(1);
    @ThreadConfined("ANY")
    @Nullable
    public ensureProcessorRunningLocked FastBitmap$CoordinateSystem;
    @GuardedBy("this")
    AtomicBoolean IsOverlapping;
    @Nullable
    public sendAccessibilityEvent Mean$Arithmetic;
    @Nullable
    private Set<String> b;
    protected boolean equals;
    boolean getMax;
    @Nullable
    private SparseIntArray getMin;
    public boolean hashCode;
    @Nullable
    public List<onSizeChanged.length> invoke;
    @Nullable
    String isInside;
    public int setMax;
    @Nullable
    public String setMin;
    @Nullable
    public setInterruptIfStopped toDoubleRange;
    public String toFloatRange;
    boolean toIntRange;
    @Nullable
    public IconCompat<onFontRetrievalFailed> toString;
    public final String valueOf;
    @GuardedBy("this")
    @ThreadConfined("ANY")
    @Nullable
    public ConcurrentHashMap<Long, sendAccessibilityEvent> values;

    public static abstract class setMax<T extends setMax<T>> extends getMin<T> {
    }

    @Deprecated
    public final callbackFailAsync IsOverlapping() {
        return this;
    }

    public boolean length() {
        return false;
    }

    public isStopped(String str) {
        this(str, (byte) 0);
    }

    private isStopped(String str, byte b2) {
        super((byte) 0);
        this.getMax = keyToDirection.mayLaunchUrl;
        this.setMax = length.getAndIncrement();
        this.IsOverlapping = new AtomicBoolean();
        this.hashCode = false;
        this.valueOf = str;
    }

    /* renamed from: getMin */
    public boolean length(isStopped isstopped) {
        if (this == isstopped) {
            return true;
        }
        if (isstopped == null || getClass() != isstopped.getClass()) {
            return false;
        }
        if (this.setMax == isstopped.setMax) {
            return true;
        }
        return NotificationCompatSideChannelService.NotificationSideChannelStub.getMax(this, isstopped);
    }

    public final void getMin(ensureProcessorRunningLocked ensureprocessorrunninglocked) {
        this.FastBitmap$CoordinateSystem = ensureprocessorrunninglocked;
        sendAccessibilityEvent sendaccessibilityevent = this.Mean$Arithmetic;
        if (sendaccessibilityevent != null) {
            if (ensureprocessorrunninglocked.setMin != sendaccessibilityevent.getMax.setMin && ensureprocessorrunninglocked.getMin != null) {
                ComponentsLogger.LogLevel logLevel = ComponentsLogger.LogLevel.ERROR;
            }
        }
    }

    public final synchronized void setMin() {
        if (!this.hashCode) {
            this.hashCode = true;
        } else {
            throw new IllegalStateException("Duplicate layout of a component: ".concat(String.valueOf(this)));
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean setMax() {
        return this.toIntRange;
    }

    private int equals(isStopped isstopped) {
        if (this.getMin == null) {
            this.getMin = new SparseIntArray();
        }
        int i = isstopped.invokeSuspend;
        int i2 = this.getMin.get(i, 0);
        this.getMin.put(i, i2 + 1);
        return i2;
    }

    public final isStopped getMax() {
        try {
            isStopped isstopped = (isStopped) super.clone();
            if (this.getMax) {
                isstopped.toFloatRange = null;
            }
            isstopped.hashCode = false;
            isstopped.toIntRange = false;
            isstopped.IsOverlapping = new AtomicBoolean();
            isstopped.FastBitmap$CoordinateSystem = null;
            isstopped.getMin = null;
            isstopped.b = null;
            return isstopped;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public static boolean setMin(@Nullable isStopped isstopped) {
        return isstopped instanceof ConnectivityManagerCompat$RestrictBackgroundStatus;
    }

    private static boolean toFloatRange(@Nullable isStopped isstopped) {
        return isstopped != null && isstopped.equals() == ComponentLifecycle.MountType.NONE;
    }

    public static boolean setMax(@Nullable isStopped isstopped) {
        return (isstopped == null || isstopped.equals() == ComponentLifecycle.MountType.NONE) ? false : true;
    }

    public static boolean length(@Nullable isStopped isstopped) {
        return isstopped != null && isstopped.equals() == ComponentLifecycle.MountType.VIEW;
    }

    public static boolean getMax(@Nullable isStopped isstopped) {
        toFloatRange(isstopped);
        return false;
    }

    public static boolean IsOverlapping(@Nullable isStopped isstopped) {
        sendAccessibilityEvent sendaccessibilityevent;
        getMax(isstopped);
        if (isstopped == null) {
            return false;
        }
        ConcurrentHashMap<Long, sendAccessibilityEvent> concurrentHashMap = isstopped.values;
        if (concurrentHashMap == null) {
            sendaccessibilityevent = null;
        } else {
            sendaccessibilityevent = concurrentHashMap.get(Long.valueOf(Thread.currentThread().getId()));
        }
        return sendaccessibilityevent != null;
    }

    @VisibleForTesting(otherwise = 3)
    public final void setMin(ensureProcessorRunningLocked ensureprocessorrunninglocked) {
        setMin(ensureprocessorrunninglocked, false);
    }

    /* access modifiers changed from: protected */
    @VisibleForTesting(otherwise = 3)
    public final void setMin(ensureProcessorRunningLocked ensureprocessorrunninglocked, boolean z) {
        if ((keyToDirection.getMax || keyToDirection.FastBitmap$CoordinateSystem) && (!this.getMax || this.toFloatRange == null)) {
            this.toFloatRange = length(ensureprocessorrunninglocked);
            getActionList getactionlist = ensureprocessorrunninglocked.toFloatRange;
            if (!this.getMax && getactionlist != null) {
                getactionlist.setMin(this);
                getactionlist.length.add(this.toFloatRange);
            }
        }
        getMin(ensureProcessorRunningLocked.getMin(ensureprocessorrunninglocked, this));
        toIntRange(ensureprocessorrunninglocked);
        this.equals = setFillViewport.getMax(ensureprocessorrunninglocked, this);
        isStopped isstopped = ensureprocessorrunninglocked.IsOverlapping;
        if (isstopped != null && z) {
            this.equals = isstopped.equals;
        }
        AtomicBoolean atomicBoolean = this.IsOverlapping;
        if (atomicBoolean != null) {
            atomicBoolean.set(true);
        }
    }

    private void toIntRange(ensureProcessorRunningLocked ensureprocessorrunninglocked) {
        if (keyToDirection.toFloatRange && this.toString == null) {
            BuildCompat$PrereleaseSdkCheck buildCompat$PrereleaseSdkCheck = ensureprocessorrunninglocked.IsOverlapping;
            if (buildCompat$PrereleaseSdkCheck == null) {
                buildCompat$PrereleaseSdkCheck = new setMin((byte) 0);
            }
            this.toString = new IconCompat<>(buildCompat$PrereleaseSdkCheck, Grayscale$Algorithm, new Object[]{ensureprocessorrunninglocked});
        }
    }

    public static abstract class getMin<T extends getMin<T>> {
        protected dispatchNestedFling getMax;
        @Nullable
        private ensureProcessorRunningLocked getMin;
        private isStopped setMin;

        public final void setMax(ensureProcessorRunningLocked ensureprocessorrunninglocked, isStopped isstopped) {
            this.getMax = new dispatchNestedFling(ensureprocessorrunninglocked);
            this.setMin = isstopped;
            this.getMin = ensureprocessorrunninglocked;
            isstopped.getMax = ensureprocessorrunninglocked.length();
            isStopped isstopped2 = this.getMin.IsOverlapping;
            if (isstopped2 != null) {
                String unused = this.setMin.setMin = isstopped2.toFloatRange;
            }
        }

        public void setMin() {
            this.getMin = null;
            this.setMin = null;
            this.getMax = null;
        }
    }

    static class setMin implements BuildCompat$PrereleaseSdkCheck {
        private setMin() {
        }

        /* synthetic */ setMin(byte b) {
            this();
        }

        public final callbackFailAsync IsOverlapping() {
            return new callbackFailAsync() {
                @Nullable
                public final Object length(IconCompat iconCompat, Object obj) {
                    if (iconCompat.setMax != ComponentLifecycle.Grayscale$Algorithm) {
                        return null;
                    }
                    throw new RuntimeException(((onFontRetrievalFailed) obj).getMax);
                }
            };
        }
    }

    private String getMax(isStopped isstopped, String str) {
        String str2 = this.toFloatRange;
        StringBuilder sb = new StringBuilder(str2.length() + str.length() + 1);
        sb.append(str2);
        sb.append(',');
        sb.append(str);
        String obj = sb.toString();
        getActionList getactionlist = this.FastBitmap$CoordinateSystem.toFloatRange;
        if (getactionlist == null) {
            return obj;
        }
        if (this.getMax) {
            if (isstopped.toIntRange) {
                if (this.b == null) {
                    this.b = new HashSet();
                }
                if (!this.b.contains(obj)) {
                    this.b.add(obj);
                    equals(isstopped);
                    return obj;
                } else if (this.FastBitmap$CoordinateSystem.getMin != null) {
                    ComponentsLogger.LogLevel logLevel = ComponentsLogger.LogLevel.WARNING;
                }
            }
            int equals2 = equals(isstopped);
            if (equals2 == 0) {
                return obj;
            }
            return NotificationCompat$NotificationVisibility.getMin(obj, equals2);
        } else if (!getactionlist.getMax(obj)) {
            return obj;
        } else {
            if (isstopped.toIntRange && this.FastBitmap$CoordinateSystem.getMin != null) {
                ComponentsLogger.LogLevel logLevel2 = ComponentsLogger.LogLevel.WARNING;
            }
            return NotificationCompat$NotificationVisibility.getMin(obj, equals(isstopped));
        }
    }

    public final void isInside() {
        sendAccessibilityEvent sendaccessibilityevent;
        ConcurrentHashMap<Long, sendAccessibilityEvent> concurrentHashMap = this.values;
        if (concurrentHashMap == null) {
            sendaccessibilityevent = null;
        } else {
            sendaccessibilityevent = concurrentHashMap.get(Long.valueOf(Thread.currentThread().getId()));
        }
        if (sendaccessibilityevent != null) {
            LayoutState.getMax(sendaccessibilityevent, true);
            this.values.remove(Long.valueOf(Thread.currentThread().getId()));
        }
    }

    private String length(ensureProcessorRunningLocked ensureprocessorrunninglocked) {
        isStopped isstopped = ensureprocessorrunninglocked.IsOverlapping;
        if (this.isInside == null && !this.toIntRange) {
            this.isInside = Integer.toString(this.invokeSuspend);
        }
        String str = this.isInside;
        if (isstopped == null) {
            return str;
        }
        if (isstopped.toFloatRange != null) {
            return isstopped.getMax(this, str);
        }
        if (ensureprocessorrunninglocked.getMin != null) {
            ComponentsLogger.LogLevel logLevel = ComponentsLogger.LogLevel.ERROR;
        }
        return "null".concat(String.valueOf(str));
    }
}
