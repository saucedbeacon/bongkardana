package androidx.constraintlayout.solver.widgets;

import androidx.constraintlayout.solver.SolverVariable;
import androidx.constraintlayout.solver.widgets.ConstraintAnchor;
import androidx.constraintlayout.solver.widgets.analyzer.WidgetRun;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import o.AnimRes;
import o.AnimatorRes;
import o.ArrayRes;
import o.BinderThread;
import o.CallSuper;
import o.ComponentActivity;
import o.DimenRes;
import o.reportFullyDrawn;
import o.unit;

public class ConstraintWidget {
    public static float onExtraCallback = 0.5f;
    public boolean[] FastBitmap$CoordinateSystem = {true, true};
    public int Grayscale$Algorithm = 0;
    public float ICustomTabsCallback = 1.0f;
    public ConstraintAnchor ICustomTabsCallback$Default = new ConstraintAnchor(this, ConstraintAnchor.Type.LEFT);
    public boolean ICustomTabsCallback$Stub = false;
    public ConstraintAnchor ICustomTabsCallback$Stub$Proxy = new ConstraintAnchor(this, ConstraintAnchor.Type.RIGHT);
    ConstraintAnchor ICustomTabsService = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER_X);
    protected int ICustomTabsService$Default;
    public int ICustomTabsService$Stub;
    public int ICustomTabsService$Stub$Proxy;
    boolean INotificationSideChannel;
    boolean INotificationSideChannel$Default;
    boolean INotificationSideChannel$Stub;
    public int INotificationSideChannel$Stub$Proxy;
    int IPostMessageService;
    protected int IPostMessageService$Default;
    public int IPostMessageService$Stub;
    protected int IPostMessageService$Stub$Proxy;
    protected int ITrustedWebActivityCallback;
    public float ITrustedWebActivityCallback$Default;
    public float ITrustedWebActivityCallback$Stub;
    public Object ITrustedWebActivityCallback$Stub$Proxy;
    public String ITrustedWebActivityService;
    boolean ITrustedWebActivityService$Default;
    boolean ITrustedWebActivityService$Stub;
    boolean ITrustedWebActivityService$Stub$Proxy;
    public float[] IconCompatParcelizer;
    public CallSuper IsOverlapping;
    public int Mean$Arithmetic = 0;
    public ConstraintWidget[] MediaBrowserCompat$CustomActionResultReceiver;
    private boolean MediaBrowserCompat$ItemReceiver = false;
    private int MediaBrowserCompat$MediaItem;
    public int MediaBrowserCompat$MediaItem$Flags;
    private boolean[] MediaBrowserCompat$SearchResultReceiver;
    public int MediaDescriptionCompat;
    private String MediaMetadataCompat$BitmapKey;
    ConstraintWidget RemoteActionCompatParcelizer;
    public int areNotificationsEnabled;
    public int asBinder = 0;
    public int asInterface = 0;
    public boolean b;
    boolean cancel;
    public int cancelAll;
    int cancelNotification;
    public float create = 1.0f;
    public unit equals = null;
    public float extraCallback = 0.0f;
    float extraCallbackWithResult = 1.0f;
    public DimensionBehaviour[] extraCommand;
    int getActiveNotifications;
    public int getCause = 0;
    public ConstraintAnchor getDefaultImpl = new ConstraintAnchor(this, ConstraintAnchor.Type.BASELINE);
    public ConstraintAnchor getInterfaceDescriptor = new ConstraintAnchor(this, ConstraintAnchor.Type.BOTTOM);
    public boolean getMax = false;
    private boolean getMin = false;
    int getSmallIconBitmap;
    boolean getSmallIconId;
    boolean hashCode = false;
    public int invoke = 0;
    public int invokeSuspend = 0;
    public CallSuper isInside;
    private boolean length = false;
    protected ArrayList<ConstraintAnchor> mayLaunchUrl;
    public ConstraintAnchor[] newSession;
    ConstraintAnchor newSessionWithExtras = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER_Y);
    boolean notify;
    int notifyNotificationWithChannel;
    public int[] onMessageChannelReady = {Integer.MAX_VALUE, Integer.MAX_VALUE};
    public int onNavigationEvent = 0;
    int onPostMessage = -1;
    public boolean onRelationshipValidationResult;
    public boolean onTransact;
    public int postMessage;
    public ConstraintWidget[] read;
    int receiveFile;
    public ConstraintWidget requestPostMessageChannel;
    public int requestPostMessageChannelWithExtras;
    public ConstraintAnchor setDefaultImpl = new ConstraintAnchor(this, ConstraintAnchor.Type.TOP);
    private boolean setMax = true;
    private boolean setMin = false;
    public int toDoubleRange = -1;
    public DimenRes toFloatRange = null;
    public WidgetRun[] toIntRange = new WidgetRun[2];
    public int toString = -1;
    public float updateVisuals;
    public int validateRelationship;
    public int[] valueOf = new int[2];
    public boolean values = true;
    public ConstraintAnchor warmup;
    ConstraintWidget write;

    public enum DimensionBehaviour {
        FIXED,
        WRAP_CONTENT,
        MATCH_CONSTRAINT,
        MATCH_PARENT
    }

    public final void d_() {
        ConstraintAnchor constraintAnchor = this.ICustomTabsCallback$Default;
        constraintAnchor.getMin = 0;
        constraintAnchor.setMin = true;
        this.ICustomTabsService$Stub$Proxy = 0;
    }

    public final void equals() {
        ConstraintAnchor constraintAnchor = this.setDefaultImpl;
        constraintAnchor.getMin = 0;
        constraintAnchor.setMin = true;
        this.ICustomTabsService$Stub = 0;
    }

    public final void getMax(int i, int i2) {
        ConstraintAnchor constraintAnchor = this.ICustomTabsCallback$Default;
        constraintAnchor.getMin = i;
        constraintAnchor.setMin = true;
        ConstraintAnchor constraintAnchor2 = this.ICustomTabsCallback$Stub$Proxy;
        constraintAnchor2.getMin = i2;
        constraintAnchor2.setMin = true;
        this.ICustomTabsService$Stub$Proxy = i;
        this.requestPostMessageChannelWithExtras = i2 - i;
        this.length = true;
    }

    public final void setMin(int i, int i2) {
        ConstraintAnchor constraintAnchor = this.setDefaultImpl;
        constraintAnchor.getMin = i;
        constraintAnchor.setMin = true;
        ConstraintAnchor constraintAnchor2 = this.getInterfaceDescriptor;
        constraintAnchor2.getMin = i2;
        constraintAnchor2.setMin = true;
        this.ICustomTabsService$Stub = i;
        this.postMessage = i2 - i;
        if (this.ICustomTabsCallback$Stub) {
            ConstraintAnchor constraintAnchor3 = this.getDefaultImpl;
            constraintAnchor3.getMin = i + this.IPostMessageService$Stub;
            constraintAnchor3.setMin = true;
        }
        this.setMin = true;
    }

    public final void setMax(int i) {
        if (this.ICustomTabsCallback$Stub) {
            int i2 = i - this.IPostMessageService$Stub;
            this.ICustomTabsService$Stub = i2;
            ConstraintAnchor constraintAnchor = this.setDefaultImpl;
            constraintAnchor.getMin = i2;
            constraintAnchor.setMin = true;
            ConstraintAnchor constraintAnchor2 = this.getInterfaceDescriptor;
            constraintAnchor2.getMin = this.postMessage + i2;
            constraintAnchor2.setMin = true;
            ConstraintAnchor constraintAnchor3 = this.getDefaultImpl;
            constraintAnchor3.getMin = i;
            constraintAnchor3.setMin = true;
            this.setMin = true;
        }
    }

    public boolean getMin() {
        if (!this.length) {
            return this.ICustomTabsCallback$Default.setMax() && this.ICustomTabsCallback$Stub$Proxy.setMax();
        }
        return true;
    }

    public boolean setMin() {
        if (!this.setMin) {
            return this.setDefaultImpl.setMax() && this.getInterfaceDescriptor.setMax();
        }
        return true;
    }

    public final void e_() {
        this.length = false;
        this.setMin = false;
        int size = this.mayLaunchUrl.size();
        for (int i = 0; i < size; i++) {
            ConstraintAnchor constraintAnchor = this.mayLaunchUrl.get(i);
            constraintAnchor.setMin = false;
            constraintAnchor.getMin = 0;
        }
    }

    private boolean length() {
        int size = this.mayLaunchUrl.size();
        for (int i = 0; i < size; i++) {
            if (this.mayLaunchUrl.get(i).getMax()) {
                return true;
            }
        }
        return false;
    }

    public final boolean getMin(int i) {
        if (i == 0) {
            return (this.ICustomTabsCallback$Default.toIntRange != null ? 1 : 0) + (this.ICustomTabsCallback$Stub$Proxy.toIntRange != null ? 1 : 0) < 2;
        }
        return ((this.setDefaultImpl.toIntRange != null ? 1 : 0) + (this.getInterfaceDescriptor.toIntRange != null ? 1 : 0)) + (this.getDefaultImpl.toIntRange != null ? 1 : 0) < 2;
    }

    public final boolean FastBitmap$CoordinateSystem() {
        return this.MediaBrowserCompat$ItemReceiver;
    }

    public final void toDoubleRange() {
        this.MediaBrowserCompat$ItemReceiver = true;
    }

    public final boolean values() {
        return this.onTransact;
    }

    public final void length(int i, boolean z) {
        this.MediaBrowserCompat$SearchResultReceiver[i] = z;
    }

    public final boolean Grayscale$Algorithm() {
        return this.values && this.areNotificationsEnabled != 8;
    }

    public void valueOf() {
        this.ICustomTabsCallback$Default.setMin();
        this.setDefaultImpl.setMin();
        this.ICustomTabsCallback$Stub$Proxy.setMin();
        this.getInterfaceDescriptor.setMin();
        this.getDefaultImpl.setMin();
        this.ICustomTabsService.setMin();
        this.newSessionWithExtras.setMin();
        this.warmup.setMin();
        this.requestPostMessageChannel = null;
        this.extraCallback = 0.0f;
        this.requestPostMessageChannelWithExtras = 0;
        this.postMessage = 0;
        this.updateVisuals = 0.0f;
        this.validateRelationship = -1;
        this.ICustomTabsService$Stub$Proxy = 0;
        this.ICustomTabsService$Stub = 0;
        this.ICustomTabsService$Default = 0;
        this.ITrustedWebActivityCallback = 0;
        this.IPostMessageService$Stub = 0;
        this.IPostMessageService$Default = 0;
        this.IPostMessageService$Stub$Proxy = 0;
        float f = onExtraCallback;
        this.ITrustedWebActivityCallback$Default = f;
        this.ITrustedWebActivityCallback$Stub = f;
        this.extraCommand[0] = DimensionBehaviour.FIXED;
        this.extraCommand[1] = DimensionBehaviour.FIXED;
        this.ITrustedWebActivityCallback$Stub$Proxy = null;
        this.MediaBrowserCompat$MediaItem = 0;
        this.areNotificationsEnabled = 0;
        this.MediaMetadataCompat$BitmapKey = null;
        this.notify = false;
        this.ITrustedWebActivityService$Default = false;
        this.cancelAll = 0;
        this.INotificationSideChannel$Stub$Proxy = 0;
        this.INotificationSideChannel$Default = false;
        this.INotificationSideChannel$Stub = false;
        float[] fArr = this.IconCompatParcelizer;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.toDoubleRange = -1;
        this.toString = -1;
        int[] iArr = this.onMessageChannelReady;
        iArr[0] = Integer.MAX_VALUE;
        iArr[1] = Integer.MAX_VALUE;
        this.Mean$Arithmetic = 0;
        this.invoke = 0;
        this.ICustomTabsCallback = 1.0f;
        this.create = 1.0f;
        this.Grayscale$Algorithm = Integer.MAX_VALUE;
        this.getCause = Integer.MAX_VALUE;
        this.invokeSuspend = 0;
        this.onNavigationEvent = 0;
        this.hashCode = false;
        this.onPostMessage = -1;
        this.extraCallbackWithResult = 1.0f;
        this.cancel = false;
        boolean[] zArr = this.FastBitmap$CoordinateSystem;
        zArr[0] = true;
        zArr[1] = true;
        this.MediaBrowserCompat$ItemReceiver = false;
        boolean[] zArr2 = this.MediaBrowserCompat$SearchResultReceiver;
        zArr2[0] = false;
        zArr2[1] = false;
        this.values = true;
    }

    public final boolean invokeSuspend() {
        return this.extraCommand[0] == DimensionBehaviour.MATCH_CONSTRAINT && this.extraCommand[1] == DimensionBehaviour.MATCH_CONSTRAINT;
    }

    public ConstraintWidget() {
        ConstraintAnchor constraintAnchor = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER);
        this.warmup = constraintAnchor;
        this.newSession = new ConstraintAnchor[]{this.ICustomTabsCallback$Default, this.ICustomTabsCallback$Stub$Proxy, this.setDefaultImpl, this.getInterfaceDescriptor, this.getDefaultImpl, constraintAnchor};
        this.mayLaunchUrl = new ArrayList<>();
        this.MediaBrowserCompat$SearchResultReceiver = new boolean[2];
        this.extraCommand = new DimensionBehaviour[]{DimensionBehaviour.FIXED, DimensionBehaviour.FIXED};
        this.requestPostMessageChannel = null;
        this.requestPostMessageChannelWithExtras = 0;
        this.postMessage = 0;
        this.updateVisuals = 0.0f;
        this.validateRelationship = -1;
        this.ICustomTabsService$Stub$Proxy = 0;
        this.ICustomTabsService$Stub = 0;
        this.receiveFile = 0;
        this.IPostMessageService = 0;
        this.ICustomTabsService$Default = 0;
        this.ITrustedWebActivityCallback = 0;
        this.IPostMessageService$Stub = 0;
        float f = onExtraCallback;
        this.ITrustedWebActivityCallback$Default = f;
        this.ITrustedWebActivityCallback$Stub = f;
        this.MediaBrowserCompat$MediaItem = 0;
        this.areNotificationsEnabled = 0;
        this.ITrustedWebActivityService = null;
        this.MediaMetadataCompat$BitmapKey = null;
        this.cancel = false;
        this.cancelAll = 0;
        this.INotificationSideChannel$Stub$Proxy = 0;
        this.IconCompatParcelizer = new float[]{-1.0f, -1.0f};
        this.read = new ConstraintWidget[]{null, null};
        this.MediaBrowserCompat$CustomActionResultReceiver = new ConstraintWidget[]{null, null};
        this.write = null;
        this.RemoteActionCompatParcelizer = null;
        this.MediaBrowserCompat$MediaItem$Flags = -1;
        this.MediaDescriptionCompat = -1;
        this.mayLaunchUrl.add(this.ICustomTabsCallback$Default);
        this.mayLaunchUrl.add(this.setDefaultImpl);
        this.mayLaunchUrl.add(this.ICustomTabsCallback$Stub$Proxy);
        this.mayLaunchUrl.add(this.getInterfaceDescriptor);
        this.mayLaunchUrl.add(this.ICustomTabsService);
        this.mayLaunchUrl.add(this.newSessionWithExtras);
        this.mayLaunchUrl.add(this.warmup);
        this.mayLaunchUrl.add(this.getDefaultImpl);
    }

    public final void invoke() {
        if (this.toFloatRange == null) {
            this.toFloatRange = new DimenRes(this);
        }
        if (this.equals == null) {
            this.equals = new unit(this);
        }
    }

    public void setMin(ComponentActivity.AnonymousClass3 r3) {
        ConstraintAnchor constraintAnchor = this.ICustomTabsCallback$Default;
        if (constraintAnchor.IsOverlapping == null) {
            constraintAnchor.IsOverlapping = new SolverVariable(SolverVariable.Type.UNRESTRICTED);
        } else {
            constraintAnchor.IsOverlapping.setMax();
        }
        ConstraintAnchor constraintAnchor2 = this.setDefaultImpl;
        if (constraintAnchor2.IsOverlapping == null) {
            constraintAnchor2.IsOverlapping = new SolverVariable(SolverVariable.Type.UNRESTRICTED);
        } else {
            constraintAnchor2.IsOverlapping.setMax();
        }
        ConstraintAnchor constraintAnchor3 = this.ICustomTabsCallback$Stub$Proxy;
        if (constraintAnchor3.IsOverlapping == null) {
            constraintAnchor3.IsOverlapping = new SolverVariable(SolverVariable.Type.UNRESTRICTED);
        } else {
            constraintAnchor3.IsOverlapping.setMax();
        }
        ConstraintAnchor constraintAnchor4 = this.getInterfaceDescriptor;
        if (constraintAnchor4.IsOverlapping == null) {
            constraintAnchor4.IsOverlapping = new SolverVariable(SolverVariable.Type.UNRESTRICTED);
        } else {
            constraintAnchor4.IsOverlapping.setMax();
        }
        ConstraintAnchor constraintAnchor5 = this.getDefaultImpl;
        if (constraintAnchor5.IsOverlapping == null) {
            constraintAnchor5.IsOverlapping = new SolverVariable(SolverVariable.Type.UNRESTRICTED);
        } else {
            constraintAnchor5.IsOverlapping.setMax();
        }
        ConstraintAnchor constraintAnchor6 = this.warmup;
        if (constraintAnchor6.IsOverlapping == null) {
            constraintAnchor6.IsOverlapping = new SolverVariable(SolverVariable.Type.UNRESTRICTED);
        } else {
            constraintAnchor6.IsOverlapping.setMax();
        }
        ConstraintAnchor constraintAnchor7 = this.ICustomTabsService;
        if (constraintAnchor7.IsOverlapping == null) {
            constraintAnchor7.IsOverlapping = new SolverVariable(SolverVariable.Type.UNRESTRICTED);
        } else {
            constraintAnchor7.IsOverlapping.setMax();
        }
        ConstraintAnchor constraintAnchor8 = this.newSessionWithExtras;
        if (constraintAnchor8.IsOverlapping == null) {
            constraintAnchor8.IsOverlapping = new SolverVariable(SolverVariable.Type.UNRESTRICTED);
        } else {
            constraintAnchor8.IsOverlapping.setMax();
        }
    }

    public final void setMin(reportFullyDrawn reportfullydrawn) {
        reportfullydrawn.getMin((Object) this.ICustomTabsCallback$Default);
        reportfullydrawn.getMin((Object) this.setDefaultImpl);
        reportfullydrawn.getMin((Object) this.ICustomTabsCallback$Stub$Proxy);
        reportfullydrawn.getMin((Object) this.getInterfaceDescriptor);
        if (this.IPostMessageService$Stub > 0) {
            reportfullydrawn.getMin((Object) this.getDefaultImpl);
        }
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        String str2 = "";
        if (this.MediaMetadataCompat$BitmapKey != null) {
            StringBuilder sb2 = new StringBuilder("type: ");
            sb2.append(this.MediaMetadataCompat$BitmapKey);
            sb2.append(" ");
            str = sb2.toString();
        } else {
            str = str2;
        }
        sb.append(str);
        if (this.ITrustedWebActivityService != null) {
            StringBuilder sb3 = new StringBuilder("id: ");
            sb3.append(this.ITrustedWebActivityService);
            sb3.append(" ");
            str2 = sb3.toString();
        }
        sb.append(str2);
        sb.append("(");
        sb.append(this.ICustomTabsService$Stub$Proxy);
        sb.append(", ");
        sb.append(this.ICustomTabsService$Stub);
        sb.append(") - (");
        sb.append(this.requestPostMessageChannelWithExtras);
        sb.append(" x ");
        sb.append(this.postMessage);
        sb.append(")");
        return sb.toString();
    }

    public final int Mean$Arithmetic() {
        ConstraintWidget constraintWidget = this.requestPostMessageChannel;
        if (constraintWidget == null || !(constraintWidget instanceof AnimRes)) {
            return this.ICustomTabsService$Stub$Proxy;
        }
        return ((AnimRes) constraintWidget).MediaBrowserCompat$ItemReceiver + this.ICustomTabsService$Stub$Proxy;
    }

    public final int onNavigationEvent() {
        ConstraintWidget constraintWidget = this.requestPostMessageChannel;
        if (constraintWidget == null || !(constraintWidget instanceof AnimRes)) {
            return this.ICustomTabsService$Stub;
        }
        return ((AnimRes) constraintWidget).MediaMetadataCompat$TextKey + this.ICustomTabsService$Stub;
    }

    public final int ICustomTabsCallback() {
        return this.IPostMessageService$Default;
    }

    public final int b() {
        return this.IPostMessageService$Stub$Proxy;
    }

    public final int create() {
        return Mean$Arithmetic() + this.requestPostMessageChannelWithExtras;
    }

    public final int getCause() {
        return onNavigationEvent() + this.postMessage;
    }

    public final boolean onRelationshipValidationResult() {
        return this.ICustomTabsCallback$Stub;
    }

    public final void length(int i) {
        this.ICustomTabsService$Stub$Proxy = i;
    }

    public final void setMin(int i) {
        this.ICustomTabsService$Stub = i;
    }

    public final void setMax(int i, int i2) {
        this.ICustomTabsService$Stub$Proxy = i;
        this.ICustomTabsService$Stub = i2;
    }

    public final void getMax(int i) {
        this.requestPostMessageChannelWithExtras = i;
        int i2 = this.IPostMessageService$Default;
        if (i < i2) {
            this.requestPostMessageChannelWithExtras = i2;
        }
    }

    public final void toFloatRange(int i) {
        this.postMessage = i;
        int i2 = this.IPostMessageService$Stub$Proxy;
        if (i < i2) {
            this.postMessage = i2;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void getMax(java.lang.String r9) {
        /*
            r8 = this;
            r0 = 0
            if (r9 == 0) goto L_0x008e
            int r1 = r9.length()
            if (r1 != 0) goto L_0x000b
            goto L_0x008e
        L_0x000b:
            r1 = -1
            int r2 = r9.length()
            r3 = 44
            int r3 = r9.indexOf(r3)
            r4 = 0
            r5 = 1
            if (r3 <= 0) goto L_0x0037
            int r6 = r2 + -1
            if (r3 >= r6) goto L_0x0037
            java.lang.String r6 = r9.substring(r4, r3)
            java.lang.String r7 = "W"
            boolean r7 = r6.equalsIgnoreCase(r7)
            if (r7 == 0) goto L_0x002c
            r1 = 0
            goto L_0x0035
        L_0x002c:
            java.lang.String r4 = "H"
            boolean r4 = r6.equalsIgnoreCase(r4)
            if (r4 == 0) goto L_0x0035
            r1 = 1
        L_0x0035:
            int r4 = r3 + 1
        L_0x0037:
            r3 = 58
            int r3 = r9.indexOf(r3)
            if (r3 < 0) goto L_0x0075
            int r2 = r2 - r5
            if (r3 >= r2) goto L_0x0075
            java.lang.String r2 = r9.substring(r4, r3)
            int r3 = r3 + r5
            java.lang.String r9 = r9.substring(r3)
            int r3 = r2.length()
            if (r3 <= 0) goto L_0x0084
            int r3 = r9.length()
            if (r3 <= 0) goto L_0x0084
            float r2 = java.lang.Float.parseFloat(r2)     // Catch:{ NumberFormatException -> 0x0084 }
            float r9 = java.lang.Float.parseFloat(r9)     // Catch:{ NumberFormatException -> 0x0084 }
            int r3 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r3 <= 0) goto L_0x0084
            int r3 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r3 <= 0) goto L_0x0084
            if (r1 != r5) goto L_0x006f
            float r9 = r9 / r2
            float r9 = java.lang.Math.abs(r9)     // Catch:{ NumberFormatException -> 0x0084 }
            goto L_0x0085
        L_0x006f:
            float r2 = r2 / r9
            float r9 = java.lang.Math.abs(r2)     // Catch:{ NumberFormatException -> 0x0084 }
            goto L_0x0085
        L_0x0075:
            java.lang.String r9 = r9.substring(r4)
            int r2 = r9.length()
            if (r2 <= 0) goto L_0x0084
            float r9 = java.lang.Float.parseFloat(r9)     // Catch:{ NumberFormatException -> 0x0084 }
            goto L_0x0085
        L_0x0084:
            r9 = 0
        L_0x0085:
            int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x008d
            r8.updateVisuals = r9
            r8.validateRelationship = r1
        L_0x008d:
            return
        L_0x008e:
            r8.updateVisuals = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.solver.widgets.ConstraintWidget.getMax(java.lang.String):void");
    }

    public final int onPostMessage() {
        return this.validateRelationship;
    }

    public final void toIntRange(int i) {
        if (i < 0) {
            this.IPostMessageService$Default = 0;
        } else {
            this.IPostMessageService$Default = i;
        }
    }

    public final void isInside(int i) {
        if (i < 0) {
            this.IPostMessageService$Stub$Proxy = 0;
        } else {
            this.IPostMessageService$Stub$Proxy = i;
        }
    }

    public final void getMin(int i, int i2) {
        this.ICustomTabsService$Stub$Proxy = i;
        int i3 = i2 - i;
        this.requestPostMessageChannelWithExtras = i3;
        int i4 = this.IPostMessageService$Default;
        if (i3 < i4) {
            this.requestPostMessageChannelWithExtras = i4;
        }
    }

    public final void length(int i, int i2) {
        this.ICustomTabsService$Stub = i;
        int i3 = i2 - i;
        this.postMessage = i3;
        int i4 = this.IPostMessageService$Stub$Proxy;
        if (i3 < i4) {
            this.postMessage = i4;
        }
    }

    public boolean getMax() {
        return this.areNotificationsEnabled != 8;
    }

    public final void setMax(ConstraintAnchor.Type type, ConstraintWidget constraintWidget, ConstraintAnchor.Type type2, int i) {
        boolean z;
        if (type == ConstraintAnchor.Type.CENTER) {
            if (type2 == ConstraintAnchor.Type.CENTER) {
                ConstraintAnchor max = setMax(ConstraintAnchor.Type.LEFT);
                ConstraintAnchor max2 = setMax(ConstraintAnchor.Type.RIGHT);
                ConstraintAnchor max3 = setMax(ConstraintAnchor.Type.TOP);
                ConstraintAnchor max4 = setMax(ConstraintAnchor.Type.BOTTOM);
                boolean z2 = true;
                if ((max == null || !max.isInside()) && (max2 == null || !max2.isInside())) {
                    setMax(ConstraintAnchor.Type.LEFT, constraintWidget, ConstraintAnchor.Type.LEFT, 0);
                    setMax(ConstraintAnchor.Type.RIGHT, constraintWidget, ConstraintAnchor.Type.RIGHT, 0);
                    z = true;
                } else {
                    z = false;
                }
                if ((max3 == null || !max3.isInside()) && (max4 == null || !max4.isInside())) {
                    setMax(ConstraintAnchor.Type.TOP, constraintWidget, ConstraintAnchor.Type.TOP, 0);
                    setMax(ConstraintAnchor.Type.BOTTOM, constraintWidget, ConstraintAnchor.Type.BOTTOM, 0);
                } else {
                    z2 = false;
                }
                if (z && z2) {
                    setMax(ConstraintAnchor.Type.CENTER).setMin(constraintWidget.setMax(ConstraintAnchor.Type.CENTER), 0);
                } else if (z) {
                    setMax(ConstraintAnchor.Type.CENTER_X).setMin(constraintWidget.setMax(ConstraintAnchor.Type.CENTER_X), 0);
                } else if (z2) {
                    setMax(ConstraintAnchor.Type.CENTER_Y).setMin(constraintWidget.setMax(ConstraintAnchor.Type.CENTER_Y), 0);
                }
            } else if (type2 == ConstraintAnchor.Type.LEFT || type2 == ConstraintAnchor.Type.RIGHT) {
                setMax(ConstraintAnchor.Type.LEFT, constraintWidget, type2, 0);
                setMax(ConstraintAnchor.Type.RIGHT, constraintWidget, type2, 0);
                setMax(ConstraintAnchor.Type.CENTER).setMin(constraintWidget.setMax(type2), 0);
            } else if (type2 == ConstraintAnchor.Type.TOP || type2 == ConstraintAnchor.Type.BOTTOM) {
                setMax(ConstraintAnchor.Type.TOP, constraintWidget, type2, 0);
                setMax(ConstraintAnchor.Type.BOTTOM, constraintWidget, type2, 0);
                setMax(ConstraintAnchor.Type.CENTER).setMin(constraintWidget.setMax(type2), 0);
            }
        } else if (type == ConstraintAnchor.Type.CENTER_X && (type2 == ConstraintAnchor.Type.LEFT || type2 == ConstraintAnchor.Type.RIGHT)) {
            ConstraintAnchor max5 = setMax(ConstraintAnchor.Type.LEFT);
            ConstraintAnchor max6 = constraintWidget.setMax(type2);
            ConstraintAnchor max7 = setMax(ConstraintAnchor.Type.RIGHT);
            max5.setMin(max6, 0);
            max7.setMin(max6, 0);
            setMax(ConstraintAnchor.Type.CENTER_X).setMin(max6, 0);
        } else if (type == ConstraintAnchor.Type.CENTER_Y && (type2 == ConstraintAnchor.Type.TOP || type2 == ConstraintAnchor.Type.BOTTOM)) {
            ConstraintAnchor max8 = constraintWidget.setMax(type2);
            setMax(ConstraintAnchor.Type.TOP).setMin(max8, 0);
            setMax(ConstraintAnchor.Type.BOTTOM).setMin(max8, 0);
            setMax(ConstraintAnchor.Type.CENTER_Y).setMin(max8, 0);
        } else if (type == ConstraintAnchor.Type.CENTER_X && type2 == ConstraintAnchor.Type.CENTER_X) {
            setMax(ConstraintAnchor.Type.LEFT).setMin(constraintWidget.setMax(ConstraintAnchor.Type.LEFT), 0);
            setMax(ConstraintAnchor.Type.RIGHT).setMin(constraintWidget.setMax(ConstraintAnchor.Type.RIGHT), 0);
            setMax(ConstraintAnchor.Type.CENTER_X).setMin(constraintWidget.setMax(type2), 0);
        } else if (type == ConstraintAnchor.Type.CENTER_Y && type2 == ConstraintAnchor.Type.CENTER_Y) {
            setMax(ConstraintAnchor.Type.TOP).setMin(constraintWidget.setMax(ConstraintAnchor.Type.TOP), 0);
            setMax(ConstraintAnchor.Type.BOTTOM).setMin(constraintWidget.setMax(ConstraintAnchor.Type.BOTTOM), 0);
            setMax(ConstraintAnchor.Type.CENTER_Y).setMin(constraintWidget.setMax(type2), 0);
        } else {
            ConstraintAnchor max9 = setMax(type);
            ConstraintAnchor max10 = constraintWidget.setMax(type2);
            if (max9.setMin(max10)) {
                if (type == ConstraintAnchor.Type.BASELINE) {
                    ConstraintAnchor max11 = setMax(ConstraintAnchor.Type.TOP);
                    ConstraintAnchor max12 = setMax(ConstraintAnchor.Type.BOTTOM);
                    if (max11 != null) {
                        max11.setMin();
                    }
                    if (max12 != null) {
                        max12.setMin();
                    }
                    i = 0;
                } else if (type == ConstraintAnchor.Type.TOP || type == ConstraintAnchor.Type.BOTTOM) {
                    ConstraintAnchor max13 = setMax(ConstraintAnchor.Type.BASELINE);
                    if (max13 != null) {
                        max13.setMin();
                    }
                    ConstraintAnchor max14 = setMax(ConstraintAnchor.Type.CENTER);
                    if (max14.toIntRange != max10) {
                        max14.setMin();
                    }
                    ConstraintAnchor equals2 = setMax(type).equals();
                    ConstraintAnchor max15 = setMax(ConstraintAnchor.Type.CENTER_Y);
                    if (max15.isInside()) {
                        equals2.setMin();
                        max15.setMin();
                    }
                } else if (type == ConstraintAnchor.Type.LEFT || type == ConstraintAnchor.Type.RIGHT) {
                    ConstraintAnchor max16 = setMax(ConstraintAnchor.Type.CENTER);
                    if (max16.toIntRange != max10) {
                        max16.setMin();
                    }
                    ConstraintAnchor equals3 = setMax(type).equals();
                    ConstraintAnchor max17 = setMax(ConstraintAnchor.Type.CENTER_X);
                    if (max17.isInside()) {
                        equals3.setMin();
                        max17.setMin();
                    }
                }
                max9.setMin(max10, i);
            }
        }
    }

    public final void extraCallbackWithResult() {
        int size = this.mayLaunchUrl.size();
        for (int i = 0; i < size; i++) {
            this.mayLaunchUrl.get(i).setMin();
        }
    }

    public ConstraintAnchor setMax(ConstraintAnchor.Type type) {
        switch (AnonymousClass1.setMin[type.ordinal()]) {
            case 1:
                return this.ICustomTabsCallback$Default;
            case 2:
                return this.setDefaultImpl;
            case 3:
                return this.ICustomTabsCallback$Stub$Proxy;
            case 4:
                return this.getInterfaceDescriptor;
            case 5:
                return this.getDefaultImpl;
            case 6:
                return this.warmup;
            case 7:
                return this.ICustomTabsService;
            case 8:
                return this.newSessionWithExtras;
            case 9:
                return null;
            default:
                throw new AssertionError(type.name());
        }
    }

    public final boolean extraCallback() {
        if (this.ICustomTabsCallback$Default.toIntRange == null || this.ICustomTabsCallback$Default.toIntRange.toIntRange != this.ICustomTabsCallback$Default) {
            return this.ICustomTabsCallback$Stub$Proxy.toIntRange != null && this.ICustomTabsCallback$Stub$Proxy.toIntRange.toIntRange == this.ICustomTabsCallback$Stub$Proxy;
        }
        return true;
    }

    public final ConstraintWidget IsOverlapping(int i) {
        ConstraintAnchor constraintAnchor;
        ConstraintAnchor constraintAnchor2;
        if (i == 0) {
            if (this.ICustomTabsCallback$Default.toIntRange == null || this.ICustomTabsCallback$Default.toIntRange.toIntRange != (constraintAnchor2 = this.ICustomTabsCallback$Default)) {
                return null;
            }
            return constraintAnchor2.toIntRange.setMax;
        } else if (i == 1 && this.setDefaultImpl.toIntRange != null && this.setDefaultImpl.toIntRange.toIntRange == (constraintAnchor = this.setDefaultImpl)) {
            return constraintAnchor.toIntRange.setMax;
        } else {
            return null;
        }
    }

    public final ConstraintWidget equals(int i) {
        ConstraintAnchor constraintAnchor;
        ConstraintAnchor constraintAnchor2;
        if (i == 0) {
            if (this.ICustomTabsCallback$Stub$Proxy.toIntRange == null || this.ICustomTabsCallback$Stub$Proxy.toIntRange.toIntRange != (constraintAnchor2 = this.ICustomTabsCallback$Stub$Proxy)) {
                return null;
            }
            return constraintAnchor2.toIntRange.setMax;
        } else if (i == 1 && this.getInterfaceDescriptor.toIntRange != null && this.getInterfaceDescriptor.toIntRange.toIntRange == (constraintAnchor = this.getInterfaceDescriptor)) {
            return constraintAnchor.toIntRange.setMax;
        } else {
            return null;
        }
    }

    public final boolean onMessageChannelReady() {
        if (this.setDefaultImpl.toIntRange == null || this.setDefaultImpl.toIntRange.toIntRange != this.setDefaultImpl) {
            return this.getInterfaceDescriptor.toIntRange != null && this.getInterfaceDescriptor.toIntRange.toIntRange == this.getInterfaceDescriptor;
        }
        return true;
    }

    private boolean hashCode(int i) {
        int i2 = i * 2;
        if (this.newSession[i2].toIntRange == null) {
            return false;
        }
        ConstraintAnchor constraintAnchor = this.newSession[i2].toIntRange.toIntRange;
        ConstraintAnchor[] constraintAnchorArr = this.newSession;
        if (constraintAnchor == constraintAnchorArr[i2]) {
            return false;
        }
        int i3 = i2 + 1;
        return constraintAnchorArr[i3].toIntRange != null && this.newSession[i3].toIntRange.toIntRange == this.newSession[i3];
    }

    /* JADX WARNING: Removed duplicated region for block: B:255:0x0430  */
    /* JADX WARNING: Removed duplicated region for block: B:256:0x0433  */
    /* JADX WARNING: Removed duplicated region for block: B:258:0x0437  */
    /* JADX WARNING: Removed duplicated region for block: B:259:0x043a  */
    /* JADX WARNING: Removed duplicated region for block: B:271:0x046c  */
    /* JADX WARNING: Removed duplicated region for block: B:280:0x04a2  */
    /* JADX WARNING: Removed duplicated region for block: B:302:0x055e  */
    /* JADX WARNING: Removed duplicated region for block: B:312:0x05a7  */
    /* JADX WARNING: Removed duplicated region for block: B:315:0x05b9  */
    /* JADX WARNING: Removed duplicated region for block: B:316:0x05bb  */
    /* JADX WARNING: Removed duplicated region for block: B:320:0x05c2  */
    /* JADX WARNING: Removed duplicated region for block: B:353:0x064b  */
    /* JADX WARNING: Removed duplicated region for block: B:354:0x064e  */
    /* JADX WARNING: Removed duplicated region for block: B:356:0x068e  */
    /* JADX WARNING: Removed duplicated region for block: B:359:0x0696  */
    /* JADX WARNING: Removed duplicated region for block: B:363:0x06cb  */
    /* JADX WARNING: Removed duplicated region for block: B:366:0x06d5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setMin(o.reportFullyDrawn r51, boolean r52) {
        /*
            r50 = this;
            r15 = r50
            r14 = r51
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r15.ICustomTabsCallback$Default
            androidx.constraintlayout.solver.SolverVariable r13 = r14.getMin((java.lang.Object) r0)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r15.ICustomTabsCallback$Stub$Proxy
            androidx.constraintlayout.solver.SolverVariable r12 = r14.getMin((java.lang.Object) r0)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r15.setDefaultImpl
            androidx.constraintlayout.solver.SolverVariable r11 = r14.getMin((java.lang.Object) r0)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r15.getInterfaceDescriptor
            androidx.constraintlayout.solver.SolverVariable r10 = r14.getMin((java.lang.Object) r0)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r15.getDefaultImpl
            androidx.constraintlayout.solver.SolverVariable r9 = r14.getMin((java.lang.Object) r0)
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r15.requestPostMessageChannel
            r8 = 1
            r7 = 0
            if (r0 == 0) goto L_0x0049
            if (r0 == 0) goto L_0x0034
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r0.extraCommand
            r0 = r0[r7]
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r1 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r0 != r1) goto L_0x0034
            r0 = 1
            goto L_0x0035
        L_0x0034:
            r0 = 0
        L_0x0035:
            androidx.constraintlayout.solver.widgets.ConstraintWidget r1 = r15.requestPostMessageChannel
            if (r1 == 0) goto L_0x0043
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r1 = r1.extraCommand
            r1 = r1[r8]
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r2 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r1 != r2) goto L_0x0043
            r1 = 1
            goto L_0x0044
        L_0x0043:
            r1 = 0
        L_0x0044:
            r29 = r0
            r28 = r1
            goto L_0x004d
        L_0x0049:
            r28 = 0
            r29 = 0
        L_0x004d:
            int r0 = r15.areNotificationsEnabled
            r6 = 8
            if (r0 != r6) goto L_0x0064
            boolean r0 = r50.length()
            if (r0 != 0) goto L_0x0064
            boolean[] r0 = r15.MediaBrowserCompat$SearchResultReceiver
            boolean r1 = r0[r7]
            if (r1 != 0) goto L_0x0064
            boolean r0 = r0[r8]
            if (r0 != 0) goto L_0x0064
            return
        L_0x0064:
            boolean r0 = r15.length
            r5 = 5
            if (r0 != 0) goto L_0x006d
            boolean r0 = r15.setMin
            if (r0 == 0) goto L_0x00ec
        L_0x006d:
            boolean r0 = r15.length
            if (r0 == 0) goto L_0x009e
            int r0 = r15.ICustomTabsService$Stub$Proxy
            r14.setMin(r13, r0)
            int r0 = r15.ICustomTabsService$Stub$Proxy
            int r1 = r15.requestPostMessageChannelWithExtras
            int r0 = r0 + r1
            r14.setMin(r12, r0)
            if (r29 == 0) goto L_0x009e
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r15.requestPostMessageChannel
            if (r0 == 0) goto L_0x009e
            boolean r1 = r15.setMax
            if (r1 == 0) goto L_0x0095
            o.AnimRes r0 = (o.AnimRes) r0
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r1 = r15.ICustomTabsCallback$Default
            r0.setMin(r1)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r1 = r15.ICustomTabsCallback$Stub$Proxy
            r0.getMin((androidx.constraintlayout.solver.widgets.ConstraintAnchor) r1)
            goto L_0x009e
        L_0x0095:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r0.ICustomTabsCallback$Stub$Proxy
            androidx.constraintlayout.solver.SolverVariable r0 = r14.getMin((java.lang.Object) r0)
            r14.setMin((androidx.constraintlayout.solver.SolverVariable) r0, (androidx.constraintlayout.solver.SolverVariable) r12, (int) r7, (int) r5)
        L_0x009e:
            boolean r0 = r15.setMin
            if (r0 == 0) goto L_0x00df
            int r0 = r15.ICustomTabsService$Stub
            r14.setMin(r11, r0)
            int r0 = r15.ICustomTabsService$Stub
            int r1 = r15.postMessage
            int r0 = r0 + r1
            r14.setMin(r10, r0)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r15.getDefaultImpl
            boolean r0 = r0.getMax()
            if (r0 == 0) goto L_0x00bf
            int r0 = r15.ICustomTabsService$Stub
            int r1 = r15.IPostMessageService$Stub
            int r0 = r0 + r1
            r14.setMin(r9, r0)
        L_0x00bf:
            if (r28 == 0) goto L_0x00df
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r15.requestPostMessageChannel
            if (r0 == 0) goto L_0x00df
            boolean r1 = r15.setMax
            if (r1 == 0) goto L_0x00d6
            o.AnimRes r0 = (o.AnimRes) r0
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r1 = r15.setDefaultImpl
            r0.setMin(r1)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r1 = r15.getInterfaceDescriptor
            r0.setMax((androidx.constraintlayout.solver.widgets.ConstraintAnchor) r1)
            goto L_0x00df
        L_0x00d6:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r0.getInterfaceDescriptor
            androidx.constraintlayout.solver.SolverVariable r0 = r14.getMin((java.lang.Object) r0)
            r14.setMin((androidx.constraintlayout.solver.SolverVariable) r0, (androidx.constraintlayout.solver.SolverVariable) r10, (int) r7, (int) r5)
        L_0x00df:
            boolean r0 = r15.length
            if (r0 == 0) goto L_0x00ec
            boolean r0 = r15.setMin
            if (r0 == 0) goto L_0x00ec
            r15.length = r7
            r15.setMin = r7
            return
        L_0x00ec:
            o.ComponentActivity$5 r0 = o.reportFullyDrawn.values
            r1 = 1
            if (r0 == 0) goto L_0x00f9
            o.ComponentActivity$5 r0 = o.reportFullyDrawn.values
            long r3 = r0.onRelationshipValidationResult
            long r3 = r3 + r1
            r0.onRelationshipValidationResult = r3
        L_0x00f9:
            if (r52 == 0) goto L_0x0194
            o.DimenRes r0 = r15.toFloatRange
            if (r0 == 0) goto L_0x0194
            o.unit r3 = r15.equals
            if (r3 == 0) goto L_0x0194
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = r0.hashCode
            boolean r0 = r0.toFloatRange
            if (r0 == 0) goto L_0x0194
            o.DimenRes r0 = r15.toFloatRange
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = r0.FastBitmap$CoordinateSystem
            boolean r0 = r0.toFloatRange
            if (r0 == 0) goto L_0x0194
            o.unit r0 = r15.equals
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = r0.hashCode
            boolean r0 = r0.toFloatRange
            if (r0 == 0) goto L_0x0194
            o.unit r0 = r15.equals
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = r0.FastBitmap$CoordinateSystem
            boolean r0 = r0.toFloatRange
            if (r0 == 0) goto L_0x0194
            o.ComponentActivity$5 r0 = o.reportFullyDrawn.values
            if (r0 == 0) goto L_0x012c
            o.ComponentActivity$5 r0 = o.reportFullyDrawn.values
            long r3 = r0.Grayscale$Algorithm
            long r3 = r3 + r1
            r0.Grayscale$Algorithm = r3
        L_0x012c:
            o.DimenRes r0 = r15.toFloatRange
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = r0.hashCode
            int r0 = r0.isInside
            r14.setMin(r13, r0)
            o.DimenRes r0 = r15.toFloatRange
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = r0.FastBitmap$CoordinateSystem
            int r0 = r0.isInside
            r14.setMin(r12, r0)
            o.unit r0 = r15.equals
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = r0.hashCode
            int r0 = r0.isInside
            r14.setMin(r11, r0)
            o.unit r0 = r15.equals
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = r0.FastBitmap$CoordinateSystem
            int r0 = r0.isInside
            r14.setMin(r10, r0)
            o.unit r0 = r15.equals
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = r0.setMin
            int r0 = r0.isInside
            r14.setMin(r9, r0)
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r15.requestPostMessageChannel
            if (r0 == 0) goto L_0x018f
            if (r29 == 0) goto L_0x0176
            boolean[] r0 = r15.FastBitmap$CoordinateSystem
            boolean r0 = r0[r7]
            if (r0 == 0) goto L_0x0176
            boolean r0 = r50.extraCallback()
            if (r0 != 0) goto L_0x0176
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r15.requestPostMessageChannel
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r0.ICustomTabsCallback$Stub$Proxy
            androidx.constraintlayout.solver.SolverVariable r0 = r14.getMin((java.lang.Object) r0)
            r14.setMin((androidx.constraintlayout.solver.SolverVariable) r0, (androidx.constraintlayout.solver.SolverVariable) r12, (int) r7, (int) r6)
        L_0x0176:
            if (r28 == 0) goto L_0x018f
            boolean[] r0 = r15.FastBitmap$CoordinateSystem
            boolean r0 = r0[r8]
            if (r0 == 0) goto L_0x018f
            boolean r0 = r50.onMessageChannelReady()
            if (r0 != 0) goto L_0x018f
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r15.requestPostMessageChannel
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r0.getInterfaceDescriptor
            androidx.constraintlayout.solver.SolverVariable r0 = r14.getMin((java.lang.Object) r0)
            r14.setMin((androidx.constraintlayout.solver.SolverVariable) r0, (androidx.constraintlayout.solver.SolverVariable) r10, (int) r7, (int) r6)
        L_0x018f:
            r15.length = r7
            r15.setMin = r7
            return
        L_0x0194:
            o.ComponentActivity$5 r0 = o.reportFullyDrawn.values
            if (r0 == 0) goto L_0x019f
            o.ComponentActivity$5 r0 = o.reportFullyDrawn.values
            long r3 = r0.Mean$Arithmetic
            long r3 = r3 + r1
            r0.Mean$Arithmetic = r3
        L_0x019f:
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r15.requestPostMessageChannel
            r4 = 2
            if (r0 == 0) goto L_0x0261
            boolean r0 = r15.hashCode(r7)
            if (r0 == 0) goto L_0x01db
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r15.requestPostMessageChannel
            o.AnimRes r0 = (o.AnimRes) r0
            int r1 = r0.MediaMetadataCompat$BitmapKey
            int r1 = r1 + r8
            o.IntentSenderRequest[] r2 = r0.RatingCompat
            int r2 = r2.length
            if (r1 < r2) goto L_0x01c5
            o.IntentSenderRequest[] r1 = r0.RatingCompat
            o.IntentSenderRequest[] r2 = r0.RatingCompat
            int r2 = r2.length
            int r2 = r2 * 2
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r2)
            o.IntentSenderRequest[] r1 = (o.IntentSenderRequest[]) r1
            r0.RatingCompat = r1
        L_0x01c5:
            o.IntentSenderRequest[] r1 = r0.RatingCompat
            int r2 = r0.MediaMetadataCompat$BitmapKey
            o.IntentSenderRequest r3 = new o.IntentSenderRequest
            boolean r5 = r0.toFloatRange()
            r3.<init>(r15, r7, r5)
            r1[r2] = r3
            int r1 = r0.MediaMetadataCompat$BitmapKey
            int r1 = r1 + r8
            r0.MediaMetadataCompat$BitmapKey = r1
            r0 = 1
            goto L_0x01df
        L_0x01db:
            boolean r0 = r50.extraCallback()
        L_0x01df:
            boolean r1 = r15.hashCode(r8)
            if (r1 == 0) goto L_0x0216
            androidx.constraintlayout.solver.widgets.ConstraintWidget r1 = r15.requestPostMessageChannel
            o.AnimRes r1 = (o.AnimRes) r1
            int r2 = r1.MediaMetadataCompat
            int r2 = r2 + r8
            o.IntentSenderRequest[] r3 = r1.IMediaControllerCallback
            int r3 = r3.length
            if (r2 < r3) goto L_0x0200
            o.IntentSenderRequest[] r2 = r1.IMediaControllerCallback
            o.IntentSenderRequest[] r3 = r1.IMediaControllerCallback
            int r3 = r3.length
            int r3 = r3 * 2
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r3)
            o.IntentSenderRequest[] r2 = (o.IntentSenderRequest[]) r2
            r1.IMediaControllerCallback = r2
        L_0x0200:
            o.IntentSenderRequest[] r2 = r1.IMediaControllerCallback
            int r3 = r1.MediaMetadataCompat
            o.IntentSenderRequest r5 = new o.IntentSenderRequest
            boolean r4 = r1.toFloatRange()
            r5.<init>(r15, r8, r4)
            r2[r3] = r5
            int r2 = r1.MediaMetadataCompat
            int r2 = r2 + r8
            r1.MediaMetadataCompat = r2
            r1 = 1
            goto L_0x021a
        L_0x0216:
            boolean r1 = r50.onMessageChannelReady()
        L_0x021a:
            if (r0 != 0) goto L_0x0239
            if (r29 == 0) goto L_0x0239
            int r2 = r15.areNotificationsEnabled
            if (r2 == r6) goto L_0x0239
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r2 = r15.ICustomTabsCallback$Default
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r2 = r2.toIntRange
            if (r2 != 0) goto L_0x0239
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r2 = r15.ICustomTabsCallback$Stub$Proxy
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r2 = r2.toIntRange
            if (r2 != 0) goto L_0x0239
            androidx.constraintlayout.solver.widgets.ConstraintWidget r2 = r15.requestPostMessageChannel
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r2 = r2.ICustomTabsCallback$Stub$Proxy
            androidx.constraintlayout.solver.SolverVariable r2 = r14.getMin((java.lang.Object) r2)
            r14.setMin((androidx.constraintlayout.solver.SolverVariable) r2, (androidx.constraintlayout.solver.SolverVariable) r12, (int) r7, (int) r8)
        L_0x0239:
            if (r1 != 0) goto L_0x025c
            if (r28 == 0) goto L_0x025c
            int r2 = r15.areNotificationsEnabled
            if (r2 == r6) goto L_0x025c
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r2 = r15.setDefaultImpl
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r2 = r2.toIntRange
            if (r2 != 0) goto L_0x025c
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r2 = r15.getInterfaceDescriptor
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r2 = r2.toIntRange
            if (r2 != 0) goto L_0x025c
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r2 = r15.getDefaultImpl
            if (r2 != 0) goto L_0x025c
            androidx.constraintlayout.solver.widgets.ConstraintWidget r2 = r15.requestPostMessageChannel
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r2 = r2.getInterfaceDescriptor
            androidx.constraintlayout.solver.SolverVariable r2 = r14.getMin((java.lang.Object) r2)
            r14.setMin((androidx.constraintlayout.solver.SolverVariable) r2, (androidx.constraintlayout.solver.SolverVariable) r10, (int) r7, (int) r8)
        L_0x025c:
            r31 = r0
            r30 = r1
            goto L_0x0265
        L_0x0261:
            r30 = 0
            r31 = 0
        L_0x0265:
            int r0 = r15.requestPostMessageChannelWithExtras
            int r1 = r15.IPostMessageService$Default
            if (r0 >= r1) goto L_0x026c
            r0 = r1
        L_0x026c:
            int r1 = r15.postMessage
            int r2 = r15.IPostMessageService$Stub$Proxy
            if (r1 >= r2) goto L_0x0273
            r1 = r2
        L_0x0273:
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r2 = r15.extraCommand
            r2 = r2[r7]
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r3 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r2 == r3) goto L_0x027d
            r2 = 1
            goto L_0x027e
        L_0x027d:
            r2 = 0
        L_0x027e:
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r3 = r15.extraCommand
            r3 = r3[r8]
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r4 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r3 == r4) goto L_0x0288
            r3 = 1
            goto L_0x0289
        L_0x0288:
            r3 = 0
        L_0x0289:
            int r4 = r15.validateRelationship
            r15.onPostMessage = r4
            float r4 = r15.updateVisuals
            r15.extraCallbackWithResult = r4
            int r5 = r15.Mean$Arithmetic
            int r8 = r15.invoke
            r19 = 0
            r20 = 4
            int r4 = (r4 > r19 ? 1 : (r4 == r19 ? 0 : -1))
            if (r4 <= 0) goto L_0x03f5
            int r4 = r15.areNotificationsEnabled
            if (r4 == r6) goto L_0x03f5
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r4 = r15.extraCommand
            r19 = 0
            r4 = r4[r19]
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r6 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            r7 = 3
            if (r4 != r6) goto L_0x02af
            if (r5 != 0) goto L_0x02af
            r5 = 3
        L_0x02af:
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r4 = r15.extraCommand
            r6 = 1
            r4 = r4[r6]
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r6 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r4 != r6) goto L_0x02bb
            if (r8 != 0) goto L_0x02bb
            r8 = 3
        L_0x02bb:
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r4 = r15.extraCommand
            r6 = 0
            r4 = r4[r6]
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r6 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            r23 = 1065353216(0x3f800000, float:1.0)
            if (r4 != r6) goto L_0x0396
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r4 = r15.extraCommand
            r6 = 1
            r4 = r4[r6]
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r6 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r4 != r6) goto L_0x0396
            if (r5 != r7) goto L_0x0396
            if (r8 != r7) goto L_0x0396
            int r4 = r15.onPostMessage
            r6 = -1
            if (r4 != r6) goto L_0x02f1
            if (r2 == 0) goto L_0x02e0
            if (r3 != 0) goto L_0x02e0
            r4 = 0
            r15.onPostMessage = r4
            goto L_0x02f1
        L_0x02e0:
            if (r2 != 0) goto L_0x02f1
            if (r3 == 0) goto L_0x02f1
            r2 = 1
            r15.onPostMessage = r2
            int r2 = r15.validateRelationship
            if (r2 != r6) goto L_0x02f1
            float r2 = r15.extraCallbackWithResult
            float r2 = r23 / r2
            r15.extraCallbackWithResult = r2
        L_0x02f1:
            int r2 = r15.onPostMessage
            if (r2 != 0) goto L_0x0309
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r2 = r15.setDefaultImpl
            boolean r2 = r2.isInside()
            if (r2 == 0) goto L_0x0305
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r2 = r15.getInterfaceDescriptor
            boolean r2 = r2.isInside()
            if (r2 != 0) goto L_0x0309
        L_0x0305:
            r2 = 1
            r15.onPostMessage = r2
            goto L_0x0321
        L_0x0309:
            r2 = 1
            int r3 = r15.onPostMessage
            if (r3 != r2) goto L_0x0321
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r2 = r15.ICustomTabsCallback$Default
            boolean r2 = r2.isInside()
            if (r2 == 0) goto L_0x031e
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r2 = r15.ICustomTabsCallback$Stub$Proxy
            boolean r2 = r2.isInside()
            if (r2 != 0) goto L_0x0321
        L_0x031e:
            r2 = 0
            r15.onPostMessage = r2
        L_0x0321:
            int r2 = r15.onPostMessage
            r3 = -1
            if (r2 != r3) goto L_0x0373
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r2 = r15.setDefaultImpl
            boolean r2 = r2.isInside()
            if (r2 == 0) goto L_0x0346
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r2 = r15.getInterfaceDescriptor
            boolean r2 = r2.isInside()
            if (r2 == 0) goto L_0x0346
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r2 = r15.ICustomTabsCallback$Default
            boolean r2 = r2.isInside()
            if (r2 == 0) goto L_0x0346
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r2 = r15.ICustomTabsCallback$Stub$Proxy
            boolean r2 = r2.isInside()
            if (r2 != 0) goto L_0x0373
        L_0x0346:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r2 = r15.setDefaultImpl
            boolean r2 = r2.isInside()
            if (r2 == 0) goto L_0x035a
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r2 = r15.getInterfaceDescriptor
            boolean r2 = r2.isInside()
            if (r2 == 0) goto L_0x035a
            r2 = 0
            r15.onPostMessage = r2
            goto L_0x0373
        L_0x035a:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r2 = r15.ICustomTabsCallback$Default
            boolean r2 = r2.isInside()
            if (r2 == 0) goto L_0x0373
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r2 = r15.ICustomTabsCallback$Stub$Proxy
            boolean r2 = r2.isInside()
            if (r2 == 0) goto L_0x0373
            float r2 = r15.extraCallbackWithResult
            float r2 = r23 / r2
            r15.extraCallbackWithResult = r2
            r2 = 1
            r15.onPostMessage = r2
        L_0x0373:
            int r2 = r15.onPostMessage
            r3 = -1
            if (r2 != r3) goto L_0x03ed
            int r2 = r15.invokeSuspend
            if (r2 <= 0) goto L_0x0384
            int r2 = r15.onNavigationEvent
            if (r2 != 0) goto L_0x0384
            r2 = 0
            r15.onPostMessage = r2
            goto L_0x03ed
        L_0x0384:
            int r2 = r15.invokeSuspend
            if (r2 != 0) goto L_0x03ed
            int r2 = r15.onNavigationEvent
            if (r2 <= 0) goto L_0x03ed
            float r2 = r15.extraCallbackWithResult
            float r2 = r23 / r2
            r15.extraCallbackWithResult = r2
            r2 = 1
            r15.onPostMessage = r2
            goto L_0x03ed
        L_0x0396:
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r2 = r15.extraCommand
            r3 = 0
            r2 = r2[r3]
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r4 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r2 != r4) goto L_0x03bc
            if (r5 != r7) goto L_0x03bc
            r15.onPostMessage = r3
            float r0 = r15.extraCallbackWithResult
            int r2 = r15.postMessage
            float r2 = (float) r2
            float r0 = r0 * r2
            int r0 = (int) r0
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r2 = r15.extraCommand
            r3 = 1
            r2 = r2[r3]
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r4 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r2 == r4) goto L_0x03ed
            r32 = r1
            r33 = r8
            r8 = 0
            r34 = 4
            goto L_0x03fc
        L_0x03bc:
            r3 = 1
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r2 = r15.extraCommand
            r2 = r2[r3]
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r4 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r2 != r4) goto L_0x03ed
            if (r8 != r7) goto L_0x03ed
            r15.onPostMessage = r3
            int r1 = r15.validateRelationship
            r2 = -1
            if (r1 != r2) goto L_0x03d4
            float r1 = r15.extraCallbackWithResult
            float r1 = r23 / r1
            r15.extraCallbackWithResult = r1
        L_0x03d4:
            float r1 = r15.extraCallbackWithResult
            int r2 = r15.requestPostMessageChannelWithExtras
            float r2 = (float) r2
            float r1 = r1 * r2
            int r1 = (int) r1
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r2 = r15.extraCommand
            r3 = 0
            r2 = r2[r3]
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r3 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r2 == r3) goto L_0x03ed
            r32 = r1
            r34 = r5
            r8 = 0
            r33 = 4
            goto L_0x03fc
        L_0x03ed:
            r32 = r1
            r34 = r5
            r33 = r8
            r8 = 1
            goto L_0x03fc
        L_0x03f5:
            r32 = r1
            r34 = r5
            r33 = r8
            r8 = 0
        L_0x03fc:
            int[] r1 = r15.valueOf
            r2 = 0
            r1[r2] = r34
            r2 = 1
            r1[r2] = r33
            r15.hashCode = r8
            if (r8 == 0) goto L_0x0412
            int r1 = r15.onPostMessage
            r2 = -1
            if (r1 == 0) goto L_0x040f
            if (r1 != r2) goto L_0x0413
        L_0x040f:
            r20 = 1
            goto L_0x0415
        L_0x0412:
            r2 = -1
        L_0x0413:
            r20 = 0
        L_0x0415:
            if (r8 == 0) goto L_0x0421
            int r1 = r15.onPostMessage
            r3 = 1
            if (r1 == r3) goto L_0x041e
            if (r1 != r2) goto L_0x0421
        L_0x041e:
            r35 = 1
            goto L_0x0423
        L_0x0421:
            r35 = 0
        L_0x0423:
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r1 = r15.extraCommand
            r2 = 0
            r1 = r1[r2]
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r2 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r1 != r2) goto L_0x0433
            boolean r1 = r15 instanceof o.AnimRes
            if (r1 == 0) goto L_0x0433
            r22 = 1
            goto L_0x0435
        L_0x0433:
            r22 = 0
        L_0x0435:
            if (r22 == 0) goto L_0x043a
            r23 = 0
            goto L_0x043c
        L_0x043a:
            r23 = r0
        L_0x043c:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r15.warmup
            boolean r0 = r0.isInside()
            r1 = 1
            r36 = r0 ^ 1
            boolean[] r0 = r15.MediaBrowserCompat$SearchResultReceiver
            r2 = 0
            boolean r27 = r0[r2]
            boolean r37 = r0[r1]
            int r0 = r15.toDoubleRange
            r38 = 0
            r4 = 2
            if (r0 == r4) goto L_0x053c
            boolean r0 = r15.length
            if (r0 != 0) goto L_0x053c
            if (r52 == 0) goto L_0x04a2
            o.DimenRes r0 = r15.toFloatRange
            if (r0 == 0) goto L_0x04a2
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = r0.hashCode
            boolean r0 = r0.toFloatRange
            if (r0 == 0) goto L_0x04a2
            o.DimenRes r0 = r15.toFloatRange
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = r0.FastBitmap$CoordinateSystem
            boolean r0 = r0.toFloatRange
            if (r0 != 0) goto L_0x046c
            goto L_0x04a2
        L_0x046c:
            if (r52 == 0) goto L_0x053c
            o.DimenRes r0 = r15.toFloatRange
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = r0.hashCode
            int r0 = r0.isInside
            r14.setMin(r13, r0)
            o.DimenRes r0 = r15.toFloatRange
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = r0.FastBitmap$CoordinateSystem
            int r0 = r0.isInside
            r14.setMin(r12, r0)
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r15.requestPostMessageChannel
            if (r0 == 0) goto L_0x053c
            if (r29 == 0) goto L_0x053c
            boolean[] r0 = r15.FastBitmap$CoordinateSystem
            r1 = 0
            boolean r0 = r0[r1]
            if (r0 == 0) goto L_0x053c
            boolean r0 = r50.extraCallback()
            if (r0 != 0) goto L_0x053c
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r15.requestPostMessageChannel
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r0.ICustomTabsCallback$Stub$Proxy
            androidx.constraintlayout.solver.SolverVariable r0 = r14.getMin((java.lang.Object) r0)
            r6 = 8
            r14.setMin((androidx.constraintlayout.solver.SolverVariable) r0, (androidx.constraintlayout.solver.SolverVariable) r12, (int) r1, (int) r6)
            goto L_0x053c
        L_0x04a2:
            r6 = 8
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r15.requestPostMessageChannel
            if (r0 == 0) goto L_0x04b0
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r0.ICustomTabsCallback$Stub$Proxy
            androidx.constraintlayout.solver.SolverVariable r0 = r14.getMin((java.lang.Object) r0)
            r7 = r0
            goto L_0x04b2
        L_0x04b0:
            r7 = r38
        L_0x04b2:
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r15.requestPostMessageChannel
            if (r0 == 0) goto L_0x04bf
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r0.ICustomTabsCallback$Default
            androidx.constraintlayout.solver.SolverVariable r0 = r14.getMin((java.lang.Object) r0)
            r17 = r0
            goto L_0x04c1
        L_0x04bf:
            r17 = r38
        L_0x04c1:
            boolean[] r0 = r15.FastBitmap$CoordinateSystem
            r19 = 0
            boolean r5 = r0[r19]
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r15.extraCommand
            r21 = r0[r19]
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r3 = r15.ICustomTabsCallback$Default
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r1 = r15.ICustomTabsCallback$Stub$Proxy
            int r2 = r15.ICustomTabsService$Stub$Proxy
            r40 = r2
            int r2 = r15.IPostMessageService$Default
            int[] r4 = r15.onMessageChannelReady
            r42 = r4[r19]
            float r4 = r15.ITrustedWebActivityCallback$Default
            r18 = 1
            r0 = r0[r18]
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r6 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r0 != r6) goto L_0x04e6
            r44 = 1
            goto L_0x04e8
        L_0x04e6:
            r44 = 0
        L_0x04e8:
            int r0 = r15.invokeSuspend
            r24 = r0
            int r0 = r15.Grayscale$Algorithm
            r25 = r0
            float r0 = r15.ICustomTabsCallback
            r26 = r0
            r0 = r50
            r45 = r1
            r1 = r51
            r39 = r40
            r40 = r2
            r2 = 1
            r46 = r3
            r3 = r29
            r41 = r4
            r6 = 2
            r4 = r28
            r6 = r17
            r43 = r8
            r8 = r21
            r47 = r9
            r9 = r22
            r48 = r10
            r10 = r46
            r49 = r11
            r11 = r45
            r45 = r12
            r12 = r39
            r39 = r13
            r13 = r23
            r14 = r40
            r15 = r42
            r16 = r41
            r17 = r20
            r18 = r44
            r19 = r31
            r20 = r30
            r21 = r27
            r22 = r34
            r23 = r33
            r27 = r36
            r0.setMax(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            goto L_0x0548
        L_0x053c:
            r43 = r8
            r47 = r9
            r48 = r10
            r49 = r11
            r45 = r12
            r39 = r13
        L_0x0548:
            r15 = r50
            if (r52 == 0) goto L_0x05a7
            o.unit r0 = r15.equals
            if (r0 == 0) goto L_0x05a7
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = r0.hashCode
            boolean r0 = r0.toFloatRange
            if (r0 == 0) goto L_0x05a7
            o.unit r0 = r15.equals
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = r0.FastBitmap$CoordinateSystem
            boolean r0 = r0.toFloatRange
            if (r0 == 0) goto L_0x05a7
            o.unit r0 = r15.equals
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = r0.hashCode
            int r0 = r0.isInside
            r14 = r51
            r13 = r49
            r14.setMin(r13, r0)
            o.unit r0 = r15.equals
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = r0.FastBitmap$CoordinateSystem
            int r0 = r0.isInside
            r12 = r48
            r14.setMin(r12, r0)
            o.unit r0 = r15.equals
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r0 = r0.setMin
            int r0 = r0.isInside
            r1 = r47
            r14.setMin(r1, r0)
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r15.requestPostMessageChannel
            if (r0 == 0) goto L_0x05a1
            if (r30 != 0) goto L_0x05a1
            if (r28 == 0) goto L_0x05a1
            boolean[] r2 = r15.FastBitmap$CoordinateSystem
            r11 = 1
            boolean r2 = r2[r11]
            if (r2 == 0) goto L_0x059d
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r0.getInterfaceDescriptor
            androidx.constraintlayout.solver.SolverVariable r0 = r14.getMin((java.lang.Object) r0)
            r2 = 8
            r10 = 0
            r14.setMin((androidx.constraintlayout.solver.SolverVariable) r0, (androidx.constraintlayout.solver.SolverVariable) r12, (int) r10, (int) r2)
            goto L_0x05a5
        L_0x059d:
            r2 = 8
            r10 = 0
            goto L_0x05a5
        L_0x05a1:
            r2 = 8
            r10 = 0
            r11 = 1
        L_0x05a5:
            r8 = 0
            goto L_0x05b4
        L_0x05a7:
            r14 = r51
            r1 = r47
            r12 = r48
            r13 = r49
            r2 = 8
            r10 = 0
            r11 = 1
            r8 = 1
        L_0x05b4:
            int r0 = r15.toString
            r3 = 2
            if (r0 != r3) goto L_0x05bb
            r7 = 0
            goto L_0x05bc
        L_0x05bb:
            r7 = r8
        L_0x05bc:
            if (r7 == 0) goto L_0x068e
            boolean r0 = r15.setMin
            if (r0 != 0) goto L_0x068e
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r15.extraCommand
            r0 = r0[r11]
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r3 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r0 != r3) goto L_0x05d0
            boolean r0 = r15 instanceof o.AnimRes
            if (r0 == 0) goto L_0x05d0
            r9 = 1
            goto L_0x05d1
        L_0x05d0:
            r9 = 0
        L_0x05d1:
            if (r9 == 0) goto L_0x05d5
            r32 = 0
        L_0x05d5:
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r15.requestPostMessageChannel
            if (r0 == 0) goto L_0x05e1
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r0.getInterfaceDescriptor
            androidx.constraintlayout.solver.SolverVariable r0 = r14.getMin((java.lang.Object) r0)
            r7 = r0
            goto L_0x05e3
        L_0x05e1:
            r7 = r38
        L_0x05e3:
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r15.requestPostMessageChannel
            if (r0 == 0) goto L_0x05ef
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r0.setDefaultImpl
            androidx.constraintlayout.solver.SolverVariable r0 = r14.getMin((java.lang.Object) r0)
            r6 = r0
            goto L_0x05f1
        L_0x05ef:
            r6 = r38
        L_0x05f1:
            int r0 = r15.IPostMessageService$Stub
            if (r0 > 0) goto L_0x05f9
            int r0 = r15.areNotificationsEnabled
            if (r0 != r2) goto L_0x062b
        L_0x05f9:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r15.getDefaultImpl
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r0.toIntRange
            if (r0 == 0) goto L_0x061e
            int r0 = r15.IPostMessageService$Stub
            r14.getMax(r1, r13, r0, r2)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r15.getDefaultImpl
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r0.toIntRange
            androidx.constraintlayout.solver.SolverVariable r0 = r14.getMin((java.lang.Object) r0)
            r14.getMax(r1, r0, r10, r2)
            if (r28 == 0) goto L_0x061b
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r15.getInterfaceDescriptor
            androidx.constraintlayout.solver.SolverVariable r0 = r14.getMin((java.lang.Object) r0)
            r1 = 5
            r14.setMin((androidx.constraintlayout.solver.SolverVariable) r7, (androidx.constraintlayout.solver.SolverVariable) r0, (int) r10, (int) r1)
        L_0x061b:
            r27 = 0
            goto L_0x062d
        L_0x061e:
            int r0 = r15.areNotificationsEnabled
            if (r0 != r2) goto L_0x0626
            r14.getMax(r1, r13, r10, r2)
            goto L_0x062b
        L_0x0626:
            int r0 = r15.IPostMessageService$Stub
            r14.getMax(r1, r13, r0, r2)
        L_0x062b:
            r27 = r36
        L_0x062d:
            boolean[] r0 = r15.FastBitmap$CoordinateSystem
            boolean r5 = r0[r11]
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r15.extraCommand
            r8 = r0[r11]
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r4 = r15.setDefaultImpl
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r3 = r15.getInterfaceDescriptor
            int r1 = r15.ICustomTabsService$Stub
            int r2 = r15.IPostMessageService$Stub$Proxy
            int[] r10 = r15.onMessageChannelReady
            r16 = r10[r11]
            float r10 = r15.ITrustedWebActivityCallback$Stub
            r17 = 0
            r0 = r0[r17]
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r11 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r0 != r11) goto L_0x064e
            r18 = 1
            goto L_0x0650
        L_0x064e:
            r18 = 0
        L_0x0650:
            int r0 = r15.onNavigationEvent
            r24 = r0
            int r0 = r15.getCause
            r25 = r0
            float r0 = r15.create
            r26 = r0
            r0 = r50
            r19 = r1
            r1 = r51
            r20 = r2
            r2 = 0
            r11 = r3
            r3 = r28
            r21 = r4
            r4 = r29
            r17 = r10
            r10 = r21
            r28 = r12
            r12 = r19
            r29 = r13
            r13 = r32
            r14 = r20
            r15 = r16
            r16 = r17
            r17 = r35
            r19 = r30
            r20 = r31
            r21 = r37
            r22 = r33
            r23 = r34
            r0.setMax(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            goto L_0x0692
        L_0x068e:
            r28 = r12
            r29 = r13
        L_0x0692:
            r0 = r50
            if (r43 == 0) goto L_0x06cb
            int r1 = r0.onPostMessage
            r2 = 1
            if (r1 != r2) goto L_0x06b3
            float r6 = r0.extraCallbackWithResult
            o.registerForActivityResult r7 = r51.length()
            r1 = r7
            r2 = r28
            r3 = r29
            r4 = r45
            r5 = r39
            r1.setMax(r2, r3, r4, r5, r6)
            r8 = r51
            r8.getMin((o.registerForActivityResult) r7)
            goto L_0x06cd
        L_0x06b3:
            r8 = r51
            float r6 = r0.extraCallbackWithResult
            o.registerForActivityResult r7 = r51.length()
            r1 = r7
            r2 = r45
            r3 = r39
            r4 = r28
            r5 = r29
            r1.setMax(r2, r3, r4, r5, r6)
            r8.getMin((o.registerForActivityResult) r7)
            goto L_0x06cd
        L_0x06cb:
            r8 = r51
        L_0x06cd:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r1 = r0.warmup
            boolean r1 = r1.isInside()
            if (r1 == 0) goto L_0x0776
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r1 = r0.warmup
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r1 = r1.toIntRange
            androidx.constraintlayout.solver.widgets.ConstraintWidget r1 = r1.setMax
            float r2 = r0.extraCallback
            r3 = 1119092736(0x42b40000, float:90.0)
            float r2 = r2 + r3
            double r2 = (double) r2
            double r2 = java.lang.Math.toRadians(r2)
            float r2 = (float) r2
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r3 = r0.warmup
            int r3 = r3.getMin()
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r4 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.LEFT
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r4 = r0.setMax((androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type) r4)
            androidx.constraintlayout.solver.SolverVariable r10 = r8.getMin((java.lang.Object) r4)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r4 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.TOP
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r4 = r0.setMax((androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type) r4)
            androidx.constraintlayout.solver.SolverVariable r12 = r8.getMin((java.lang.Object) r4)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r4 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.RIGHT
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r4 = r0.setMax((androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type) r4)
            androidx.constraintlayout.solver.SolverVariable r4 = r8.getMin((java.lang.Object) r4)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r5 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.BOTTOM
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r5 = r0.setMax((androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type) r5)
            androidx.constraintlayout.solver.SolverVariable r13 = r8.getMin((java.lang.Object) r5)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r5 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.LEFT
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r5 = r1.setMax((androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type) r5)
            androidx.constraintlayout.solver.SolverVariable r5 = r8.getMin((java.lang.Object) r5)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r6 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.TOP
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r6 = r1.setMax((androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type) r6)
            androidx.constraintlayout.solver.SolverVariable r14 = r8.getMin((java.lang.Object) r6)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r6 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.RIGHT
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r6 = r1.setMax((androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type) r6)
            androidx.constraintlayout.solver.SolverVariable r6 = r8.getMin((java.lang.Object) r6)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r7 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.BOTTOM
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r1 = r1.setMax((androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type) r7)
            androidx.constraintlayout.solver.SolverVariable r15 = r8.getMin((java.lang.Object) r1)
            o.registerForActivityResult r1 = r51.length()
            r52 = r6
            double r6 = (double) r2
            double r16 = java.lang.Math.sin(r6)
            double r2 = (double) r3
            java.lang.Double.isNaN(r2)
            r18 = r4
            r19 = r5
            double r4 = r16 * r2
            float r4 = (float) r4
            r11 = r1
            r16 = r4
            r11.setMin(r12, r13, r14, r15, r16)
            r8.getMin((o.registerForActivityResult) r1)
            o.registerForActivityResult r1 = r51.length()
            double r4 = java.lang.Math.cos(r6)
            java.lang.Double.isNaN(r2)
            double r4 = r4 * r2
            float r14 = (float) r4
            r9 = r1
            r11 = r18
            r12 = r19
            r13 = r52
            r9.setMin(r10, r11, r12, r13, r14)
            r8.getMin((o.registerForActivityResult) r1)
        L_0x0776:
            r1 = 0
            r0.length = r1
            r0.setMin = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.solver.widgets.ConstraintWidget.setMin(o.reportFullyDrawn, boolean):void");
    }

    public final boolean asBinder() {
        return (this instanceof BinderThread) || (this instanceof AnimatorRes);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:234:0x042a, code lost:
        if ((r2 instanceof o.OnBackPressedDispatcher$LifecycleOnBackPressedCancellable) != false) goto L_0x042f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x01e2 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x02f5  */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x02f9  */
    /* JADX WARNING: Removed duplicated region for block: B:212:0x03be  */
    /* JADX WARNING: Removed duplicated region for block: B:220:0x03fd  */
    /* JADX WARNING: Removed duplicated region for block: B:225:0x0417 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:226:0x0418  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:320:0x051f A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:350:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00e3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void setMax(o.reportFullyDrawn r37, boolean r38, boolean r39, boolean r40, boolean r41, androidx.constraintlayout.solver.SolverVariable r42, androidx.constraintlayout.solver.SolverVariable r43, androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour r44, boolean r45, androidx.constraintlayout.solver.widgets.ConstraintAnchor r46, androidx.constraintlayout.solver.widgets.ConstraintAnchor r47, int r48, int r49, int r50, int r51, float r52, boolean r53, boolean r54, boolean r55, boolean r56, boolean r57, int r58, int r59, int r60, int r61, float r62, boolean r63) {
        /*
            r36 = this;
            r0 = r36
            r10 = r37
            r11 = r42
            r12 = r43
            r13 = r46
            r14 = r47
            r15 = r50
            r1 = r51
            r2 = r59
            r3 = r60
            r4 = r61
            androidx.constraintlayout.solver.SolverVariable r9 = r10.getMin((java.lang.Object) r13)
            androidx.constraintlayout.solver.SolverVariable r8 = r10.getMin((java.lang.Object) r14)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r5 = r13.toIntRange
            androidx.constraintlayout.solver.SolverVariable r7 = r10.getMin((java.lang.Object) r5)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r5 = r14.toIntRange
            androidx.constraintlayout.solver.SolverVariable r6 = r10.getMin((java.lang.Object) r5)
            o.ComponentActivity$5 r5 = o.reportFullyDrawn.getMin()
            if (r5 == 0) goto L_0x003c
            o.ComponentActivity$5 r5 = o.reportFullyDrawn.getMin()
            long r11 = r5.create
            r16 = 1
            long r11 = r11 + r16
            r5.create = r11
        L_0x003c:
            boolean r11 = r46.isInside()
            boolean r12 = r47.isInside()
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r5 = r0.warmup
            boolean r16 = r5.isInside()
            if (r11 == 0) goto L_0x004f
            r18 = 1
            goto L_0x0051
        L_0x004f:
            r18 = 0
        L_0x0051:
            if (r12 == 0) goto L_0x0055
            int r18 = r18 + 1
        L_0x0055:
            if (r16 == 0) goto L_0x0059
            int r18 = r18 + 1
        L_0x0059:
            r19 = r18
            if (r53 == 0) goto L_0x0060
            r20 = 3
            goto L_0x0062
        L_0x0060:
            r20 = r58
        L_0x0062:
            int[] r21 = androidx.constraintlayout.solver.widgets.ConstraintWidget.AnonymousClass1.length
            int r22 = r44.ordinal()
            r5 = r21[r22]
            r2 = 2
            r14 = 1
            if (r5 == r14) goto L_0x0082
            if (r5 == r2) goto L_0x0082
            r14 = 3
            if (r5 == r14) goto L_0x0082
            r14 = 4
            if (r5 == r14) goto L_0x007b
            r5 = r20
        L_0x0078:
            r20 = 0
            goto L_0x0086
        L_0x007b:
            r5 = r20
            if (r5 == r14) goto L_0x0078
            r20 = 1
            goto L_0x0086
        L_0x0082:
            r5 = r20
            r14 = 4
            goto L_0x0078
        L_0x0086:
            int r14 = r0.areNotificationsEnabled
            r2 = 8
            if (r14 != r2) goto L_0x0090
            r14 = 0
            r20 = 0
            goto L_0x0092
        L_0x0090:
            r14 = r49
        L_0x0092:
            if (r63 == 0) goto L_0x00b0
            if (r11 != 0) goto L_0x00a0
            if (r12 != 0) goto L_0x00a0
            if (r16 != 0) goto L_0x00a0
            r2 = r48
            r10.setMin(r9, r2)
            goto L_0x00b0
        L_0x00a0:
            if (r11 == 0) goto L_0x00b0
            if (r12 != 0) goto L_0x00b0
            int r2 = r46.getMin()
            r22 = r6
            r6 = 8
            r10.getMax(r9, r7, r2, r6)
            goto L_0x00b4
        L_0x00b0:
            r22 = r6
            r6 = 8
        L_0x00b4:
            if (r20 != 0) goto L_0x00e3
            if (r45 == 0) goto L_0x00cd
            r2 = 0
            r6 = 3
            r10.getMax(r8, r9, r2, r6)
            r14 = 8
            if (r15 <= 0) goto L_0x00c4
            r10.setMin((androidx.constraintlayout.solver.SolverVariable) r8, (androidx.constraintlayout.solver.SolverVariable) r9, (int) r15, (int) r14)
        L_0x00c4:
            r2 = 2147483647(0x7fffffff, float:NaN)
            if (r1 >= r2) goto L_0x00d3
            r10.getMin(r8, r9, r1, r14)
            goto L_0x00d3
        L_0x00cd:
            r1 = 8
            r6 = 3
            r10.getMax(r8, r9, r14, r1)
        L_0x00d3:
            r24 = r5
            r2 = r7
            r14 = r8
            r1 = r19
            r15 = r22
            r19 = r41
        L_0x00dd:
            r22 = r20
            r20 = r3
            goto L_0x01e0
        L_0x00e3:
            r1 = r19
            r2 = 2
            r6 = 3
            if (r1 == r2) goto L_0x010d
            if (r53 != 0) goto L_0x010d
            r2 = 1
            if (r5 == r2) goto L_0x00f0
            if (r5 != 0) goto L_0x010d
        L_0x00f0:
            int r2 = java.lang.Math.max(r3, r14)
            if (r4 <= 0) goto L_0x00fa
            int r2 = java.lang.Math.min(r4, r2)
        L_0x00fa:
            r14 = 8
            r10.getMax(r8, r9, r2, r14)
            r19 = r41
            r20 = r3
            r24 = r5
            r2 = r7
            r14 = r8
            r15 = r22
            r22 = 0
            goto L_0x01e0
        L_0x010d:
            r2 = -2
            if (r3 != r2) goto L_0x0111
            r3 = r14
        L_0x0111:
            if (r4 != r2) goto L_0x0115
            r2 = r14
            goto L_0x0116
        L_0x0115:
            r2 = r4
        L_0x0116:
            if (r14 <= 0) goto L_0x011c
            r4 = 1
            if (r5 == r4) goto L_0x011c
            r14 = 0
        L_0x011c:
            if (r3 <= 0) goto L_0x0127
            r4 = 8
            r10.setMin((androidx.constraintlayout.solver.SolverVariable) r8, (androidx.constraintlayout.solver.SolverVariable) r9, (int) r3, (int) r4)
            int r14 = java.lang.Math.max(r14, r3)
        L_0x0127:
            if (r2 <= 0) goto L_0x0140
            if (r39 == 0) goto L_0x0130
            r4 = 1
            if (r5 != r4) goto L_0x0130
            r4 = 0
            goto L_0x0131
        L_0x0130:
            r4 = 1
        L_0x0131:
            if (r4 == 0) goto L_0x0139
            r4 = 8
            r10.getMin(r8, r9, r2, r4)
            goto L_0x013b
        L_0x0139:
            r4 = 8
        L_0x013b:
            int r14 = java.lang.Math.min(r14, r2)
            goto L_0x0142
        L_0x0140:
            r4 = 8
        L_0x0142:
            r6 = 1
            if (r5 != r6) goto L_0x0167
            if (r39 == 0) goto L_0x014b
            r10.getMax(r8, r9, r14, r4)
            goto L_0x015c
        L_0x014b:
            if (r55 == 0) goto L_0x0155
            r6 = 5
            r10.getMax(r8, r9, r14, r6)
            r10.getMin(r8, r9, r14, r4)
            goto L_0x015c
        L_0x0155:
            r6 = 5
            r10.getMax(r8, r9, r14, r6)
            r10.getMin(r8, r9, r14, r4)
        L_0x015c:
            r19 = r41
            r4 = r2
            r24 = r5
            r2 = r7
            r14 = r8
            r15 = r22
            goto L_0x00dd
        L_0x0167:
            r14 = 2
            if (r5 != r14) goto L_0x01ce
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r4 = r13.getMax
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r6 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.TOP
            if (r4 == r6) goto L_0x0190
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r4 = r13.getMax
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r6 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.BOTTOM
            if (r4 != r6) goto L_0x0177
            goto L_0x0190
        L_0x0177:
            androidx.constraintlayout.solver.widgets.ConstraintWidget r4 = r0.requestPostMessageChannel
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r6 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.LEFT
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r4 = r4.setMax((androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type) r6)
            androidx.constraintlayout.solver.SolverVariable r4 = r10.getMin((java.lang.Object) r4)
            androidx.constraintlayout.solver.widgets.ConstraintWidget r6 = r0.requestPostMessageChannel
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r14 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.RIGHT
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r6 = r6.setMax((androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type) r14)
            androidx.constraintlayout.solver.SolverVariable r6 = r10.getMin((java.lang.Object) r6)
            goto L_0x01a8
        L_0x0190:
            androidx.constraintlayout.solver.widgets.ConstraintWidget r4 = r0.requestPostMessageChannel
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r6 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.TOP
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r4 = r4.setMax((androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type) r6)
            androidx.constraintlayout.solver.SolverVariable r4 = r10.getMin((java.lang.Object) r4)
            androidx.constraintlayout.solver.widgets.ConstraintWidget r6 = r0.requestPostMessageChannel
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r14 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.BOTTOM
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r6 = r6.setMax((androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type) r14)
            androidx.constraintlayout.solver.SolverVariable r6 = r10.getMin((java.lang.Object) r6)
        L_0x01a8:
            r14 = r4
            o.registerForActivityResult r4 = r37.length()
            r19 = r3
            r3 = r4
            r4 = r8
            r24 = r5
            r15 = 0
            r5 = r9
            r15 = r22
            r45 = r2
            r2 = r7
            r7 = r14
            r14 = r8
            r8 = r62
            o.registerForActivityResult r3 = r3.setMax(r4, r5, r6, r7, r8)
            r10.getMin((o.registerForActivityResult) r3)
            r4 = r45
            r20 = r19
            r22 = 0
            r19 = r41
            goto L_0x01e0
        L_0x01ce:
            r45 = r2
            r19 = r3
            r24 = r5
            r2 = r7
            r14 = r8
            r15 = r22
            r4 = r45
            r22 = r20
            r20 = r19
            r19 = 1
        L_0x01e0:
            if (r63 == 0) goto L_0x0514
            if (r55 == 0) goto L_0x01e6
            goto L_0x0514
        L_0x01e6:
            if (r11 != 0) goto L_0x01ec
            if (r12 != 0) goto L_0x01ec
            if (r16 == 0) goto L_0x04df
        L_0x01ec:
            if (r11 == 0) goto L_0x01f0
            if (r12 == 0) goto L_0x04df
        L_0x01f0:
            if (r11 != 0) goto L_0x0223
            if (r12 == 0) goto L_0x0223
            int r1 = r47.getMin()
            int r1 = -r1
            r2 = 8
            r10.getMax(r14, r15, r1, r2)
            if (r39 == 0) goto L_0x04df
            boolean r1 = r0.getMin
            if (r1 == 0) goto L_0x021a
            boolean r1 = r9.isInside
            if (r1 == 0) goto L_0x021a
            androidx.constraintlayout.solver.widgets.ConstraintWidget r1 = r0.requestPostMessageChannel
            if (r1 == 0) goto L_0x021a
            o.AnimRes r1 = (o.AnimRes) r1
            if (r38 == 0) goto L_0x0215
            r1.getMax((androidx.constraintlayout.solver.widgets.ConstraintAnchor) r13)
            goto L_0x04df
        L_0x0215:
            r1.setMin(r13)
            goto L_0x04df
        L_0x021a:
            r8 = r42
            r1 = 5
            r2 = 0
            r10.setMin((androidx.constraintlayout.solver.SolverVariable) r9, (androidx.constraintlayout.solver.SolverVariable) r8, (int) r2, (int) r1)
            goto L_0x04df
        L_0x0223:
            r8 = r42
            if (r11 == 0) goto L_0x04df
            if (r12 == 0) goto L_0x04df
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r1 = r13.toIntRange
            androidx.constraintlayout.solver.widgets.ConstraintWidget r11 = r1.setMax
            r7 = r47
            r12 = 4
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r1 = r7.toIntRange
            androidx.constraintlayout.solver.widgets.ConstraintWidget r6 = r1.setMax
            androidx.constraintlayout.solver.widgets.ConstraintWidget r5 = r0.requestPostMessageChannel
            r16 = 6
            if (r22 == 0) goto L_0x035b
            r3 = r24
            if (r3 != 0) goto L_0x02a1
            if (r4 != 0) goto L_0x0268
            if (r20 != 0) goto L_0x0268
            boolean r1 = r2.isInside
            if (r1 == 0) goto L_0x025c
            boolean r1 = r15.isInside
            if (r1 == 0) goto L_0x025c
            int r1 = r46.getMin()
            r4 = 8
            r10.getMax(r9, r2, r1, r4)
            int r1 = r47.getMin()
            int r1 = -r1
            r10.getMax(r14, r15, r1, r4)
            return
        L_0x025c:
            r4 = 8
            r1 = 0
            r21 = 1
            r23 = 0
            r24 = 8
            r26 = 8
            goto L_0x0273
        L_0x0268:
            r4 = 8
            r1 = 1
            r21 = 0
            r23 = 1
            r24 = 5
            r26 = 5
        L_0x0273:
            boolean r4 = r11 instanceof o.OnBackPressedDispatcher$LifecycleOnBackPressedCancellable
            if (r4 != 0) goto L_0x028d
            boolean r4 = r6 instanceof o.OnBackPressedDispatcher$LifecycleOnBackPressedCancellable
            if (r4 == 0) goto L_0x027c
            goto L_0x028d
        L_0x027c:
            r4 = r43
            r17 = r23
            r28 = r26
            r12 = 1
            r27 = 6
            r23 = r1
            r26 = r24
            r1 = 5
            r24 = r21
            goto L_0x029d
        L_0x028d:
            r4 = r43
            r17 = r23
            r26 = r24
            r12 = 1
            r27 = 6
            r28 = 4
            r23 = r1
            r24 = r21
            r1 = 5
        L_0x029d:
            r21 = 8
            goto L_0x03af
        L_0x02a1:
            r1 = 1
            r21 = 8
            if (r3 != r1) goto L_0x02b4
            r4 = r43
            r1 = 5
            r12 = 1
            r17 = 1
            r23 = 1
            r24 = 0
            r26 = 8
            goto L_0x03ab
        L_0x02b4:
            r1 = 3
            if (r3 != r1) goto L_0x0352
            int r1 = r0.onPostMessage
            r12 = -1
            if (r1 != r12) goto L_0x02e4
            if (r56 == 0) goto L_0x02d2
            r4 = r43
            r1 = 5
            r12 = 1
            r17 = 1
            r23 = 1
            r24 = 1
            r26 = 8
            if (r39 == 0) goto L_0x02cf
            r27 = 5
            goto L_0x02e0
        L_0x02cf:
            r27 = 4
            goto L_0x02e0
        L_0x02d2:
            r4 = r43
            r1 = 5
            r12 = 1
            r17 = 1
            r23 = 1
            r24 = 1
            r26 = 8
            r27 = 8
        L_0x02e0:
            r28 = 5
            goto L_0x03af
        L_0x02e4:
            if (r53 == 0) goto L_0x030c
            r1 = r59
            r12 = 2
            if (r1 == r12) goto L_0x02f1
            r12 = 1
            if (r1 != r12) goto L_0x02ef
            goto L_0x02f2
        L_0x02ef:
            r1 = 0
            goto L_0x02f3
        L_0x02f1:
            r12 = 1
        L_0x02f2:
            r1 = 1
        L_0x02f3:
            if (r1 != 0) goto L_0x02f9
            r1 = 8
            r4 = 5
            goto L_0x02fb
        L_0x02f9:
            r1 = 5
            r4 = 4
        L_0x02fb:
            r26 = r1
            r28 = r4
            r1 = 5
            r17 = 1
            r23 = 1
            r24 = 1
            r27 = 6
            r4 = r43
            goto L_0x03af
        L_0x030c:
            r12 = 1
            if (r4 <= 0) goto L_0x031d
            r4 = r43
            r1 = 5
            r17 = 1
            r23 = 1
            r24 = 1
            r26 = 5
            r27 = 6
            goto L_0x02e0
        L_0x031d:
            if (r4 != 0) goto L_0x0348
            if (r20 != 0) goto L_0x0348
            if (r56 != 0) goto L_0x0334
            r4 = r43
            r1 = 5
            r17 = 1
            r23 = 1
            r24 = 1
            r26 = 5
            r27 = 6
            r28 = 8
            goto L_0x03af
        L_0x0334:
            if (r11 == r5) goto L_0x033a
            if (r6 == r5) goto L_0x033a
            r1 = 4
            goto L_0x033b
        L_0x033a:
            r1 = 5
        L_0x033b:
            r4 = r43
            r26 = r1
            r1 = 5
            r17 = 1
            r23 = 1
            r24 = 1
            goto L_0x03ab
        L_0x0348:
            r4 = r43
            r1 = 5
            r17 = 1
            r23 = 1
            r24 = 1
            goto L_0x03a9
        L_0x0352:
            r12 = 1
            r4 = r43
            r1 = 5
            r17 = 0
            r23 = 0
            goto L_0x03a7
        L_0x035b:
            r3 = r24
            r12 = 1
            r21 = 8
            boolean r1 = r2.isInside
            if (r1 == 0) goto L_0x03a0
            boolean r1 = r15.isInside
            if (r1 == 0) goto L_0x03a0
            int r1 = r46.getMin()
            int r3 = r47.getMin()
            r4 = 8
            r53 = r37
            r54 = r9
            r55 = r2
            r56 = r1
            r57 = r52
            r58 = r15
            r59 = r14
            r60 = r3
            r61 = r4
            r53.getMin(r54, r55, r56, r57, r58, r59, r60, r61)
            if (r39 == 0) goto L_0x039f
            if (r19 == 0) goto L_0x039f
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r1 = r7.toIntRange
            if (r1 == 0) goto L_0x0396
            int r5 = r47.getMin()
            r4 = r43
            goto L_0x0399
        L_0x0396:
            r4 = r43
            r5 = 0
        L_0x0399:
            if (r15 == r4) goto L_0x039f
            r1 = 5
            r10.setMin((androidx.constraintlayout.solver.SolverVariable) r4, (androidx.constraintlayout.solver.SolverVariable) r14, (int) r5, (int) r1)
        L_0x039f:
            return
        L_0x03a0:
            r4 = r43
            r1 = 5
            r17 = 1
            r23 = 1
        L_0x03a7:
            r24 = 0
        L_0x03a9:
            r26 = 5
        L_0x03ab:
            r27 = 6
            r28 = 4
        L_0x03af:
            if (r17 == 0) goto L_0x03ba
            if (r2 != r15) goto L_0x03ba
            if (r11 == r5) goto L_0x03ba
            r17 = 0
            r29 = 0
            goto L_0x03bc
        L_0x03ba:
            r29 = 1
        L_0x03bc:
            if (r23 == 0) goto L_0x03fd
            if (r22 != 0) goto L_0x03d1
            if (r54 != 0) goto L_0x03d1
            if (r56 != 0) goto L_0x03d1
            if (r2 != r8) goto L_0x03d1
            if (r15 != r4) goto L_0x03d1
            r23 = 0
            r26 = 8
            r27 = 8
            r29 = 0
            goto L_0x03d3
        L_0x03d1:
            r23 = r39
        L_0x03d3:
            int r30 = r46.getMin()
            int r31 = r47.getMin()
            r12 = 3
            r25 = 5
            r1 = r37
            r48 = r2
            r12 = 8
            r2 = r9
            r32 = r3
            r3 = r48
            r4 = r30
            r33 = r5
            r5 = r52
            r34 = r6
            r6 = r15
            r7 = r14
            r8 = r31
            r35 = r9
            r9 = r27
            r1.getMin(r2, r3, r4, r5, r6, r7, r8, r9)
            goto L_0x040b
        L_0x03fd:
            r48 = r2
            r32 = r3
            r33 = r5
            r34 = r6
            r35 = r9
            r12 = 8
            r23 = r39
        L_0x040b:
            r5 = r29
            int r1 = r0.areNotificationsEnabled
            if (r1 != r12) goto L_0x0418
            boolean r1 = r47.getMax()
            if (r1 != 0) goto L_0x0418
            return
        L_0x0418:
            r1 = r48
            if (r17 == 0) goto L_0x0449
            if (r23 == 0) goto L_0x0431
            if (r1 == r15) goto L_0x0431
            if (r22 != 0) goto L_0x0431
            boolean r2 = r11 instanceof o.OnBackPressedDispatcher$LifecycleOnBackPressedCancellable
            if (r2 != 0) goto L_0x042d
            r2 = r34
            boolean r3 = r2 instanceof o.OnBackPressedDispatcher$LifecycleOnBackPressedCancellable
            if (r3 == 0) goto L_0x0433
            goto L_0x042f
        L_0x042d:
            r2 = r34
        L_0x042f:
            r3 = 6
            goto L_0x0435
        L_0x0431:
            r2 = r34
        L_0x0433:
            r3 = r26
        L_0x0435:
            int r4 = r46.getMin()
            r6 = r35
            r10.setMin((androidx.constraintlayout.solver.SolverVariable) r6, (androidx.constraintlayout.solver.SolverVariable) r1, (int) r4, (int) r3)
            int r4 = r47.getMin()
            int r4 = -r4
            r10.getMin(r14, r15, r4, r3)
            r26 = r3
            goto L_0x044d
        L_0x0449:
            r2 = r34
            r6 = r35
        L_0x044d:
            if (r23 == 0) goto L_0x045d
            if (r57 == 0) goto L_0x045d
            boolean r3 = r11 instanceof o.OnBackPressedDispatcher$LifecycleOnBackPressedCancellable
            if (r3 != 0) goto L_0x045d
            boolean r3 = r2 instanceof o.OnBackPressedDispatcher$LifecycleOnBackPressedCancellable
            if (r3 != 0) goto L_0x045d
            r3 = 6
            r4 = 6
            r5 = 1
            goto L_0x0461
        L_0x045d:
            r3 = r26
            r4 = r28
        L_0x0461:
            if (r5 == 0) goto L_0x04b3
            if (r24 == 0) goto L_0x0491
            if (r56 == 0) goto L_0x0469
            if (r40 == 0) goto L_0x0491
        L_0x0469:
            r5 = r33
            if (r11 == r5) goto L_0x0472
            if (r2 != r5) goto L_0x0470
            goto L_0x0472
        L_0x0470:
            r16 = r4
        L_0x0472:
            boolean r7 = r11 instanceof o.AnimatorRes
            if (r7 != 0) goto L_0x047a
            boolean r7 = r2 instanceof o.AnimatorRes
            if (r7 == 0) goto L_0x047c
        L_0x047a:
            r16 = 5
        L_0x047c:
            boolean r7 = r11 instanceof o.OnBackPressedDispatcher$LifecycleOnBackPressedCancellable
            if (r7 != 0) goto L_0x0484
            boolean r7 = r2 instanceof o.OnBackPressedDispatcher$LifecycleOnBackPressedCancellable
            if (r7 == 0) goto L_0x0486
        L_0x0484:
            r16 = 5
        L_0x0486:
            if (r56 == 0) goto L_0x048a
            r7 = 5
            goto L_0x048c
        L_0x048a:
            r7 = r16
        L_0x048c:
            int r4 = java.lang.Math.max(r7, r4)
            goto L_0x0493
        L_0x0491:
            r5 = r33
        L_0x0493:
            if (r23 == 0) goto L_0x04a4
            int r3 = java.lang.Math.min(r3, r4)
            if (r53 == 0) goto L_0x04a3
            if (r56 != 0) goto L_0x04a3
            if (r11 == r5) goto L_0x04a1
            if (r2 != r5) goto L_0x04a3
        L_0x04a1:
            r4 = 4
            goto L_0x04a4
        L_0x04a3:
            r4 = r3
        L_0x04a4:
            int r2 = r46.getMin()
            r10.getMax(r6, r1, r2, r4)
            int r2 = r47.getMin()
            int r2 = -r2
            r10.getMax(r14, r15, r2, r4)
        L_0x04b3:
            if (r23 == 0) goto L_0x04c5
            r2 = r42
            if (r2 != r1) goto L_0x04be
            int r5 = r46.getMin()
            goto L_0x04bf
        L_0x04be:
            r5 = 0
        L_0x04bf:
            if (r1 == r2) goto L_0x04c5
            r1 = 5
            r10.setMin((androidx.constraintlayout.solver.SolverVariable) r6, (androidx.constraintlayout.solver.SolverVariable) r2, (int) r5, (int) r1)
        L_0x04c5:
            if (r23 == 0) goto L_0x04e1
            if (r22 == 0) goto L_0x04e1
            if (r50 != 0) goto L_0x04e1
            if (r20 != 0) goto L_0x04e1
            if (r22 == 0) goto L_0x04d9
            r5 = r32
            r1 = 3
            if (r5 != r1) goto L_0x04d9
            r1 = 0
            r10.setMin((androidx.constraintlayout.solver.SolverVariable) r14, (androidx.constraintlayout.solver.SolverVariable) r6, (int) r1, (int) r12)
            goto L_0x04e1
        L_0x04d9:
            r1 = 0
            r2 = 5
            r10.setMin((androidx.constraintlayout.solver.SolverVariable) r14, (androidx.constraintlayout.solver.SolverVariable) r6, (int) r1, (int) r2)
            goto L_0x04e1
        L_0x04df:
            r23 = r39
        L_0x04e1:
            if (r23 == 0) goto L_0x0513
            if (r19 == 0) goto L_0x0513
            r1 = r47
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r2 = r1.toIntRange
            if (r2 == 0) goto L_0x04f2
            int r5 = r47.getMin()
            r3 = r43
            goto L_0x04f5
        L_0x04f2:
            r3 = r43
            r5 = 0
        L_0x04f5:
            if (r15 == r3) goto L_0x0513
            boolean r2 = r0.getMin
            if (r2 == 0) goto L_0x050f
            boolean r2 = r14.isInside
            if (r2 == 0) goto L_0x050f
            androidx.constraintlayout.solver.widgets.ConstraintWidget r2 = r0.requestPostMessageChannel
            if (r2 == 0) goto L_0x050f
            o.AnimRes r2 = (o.AnimRes) r2
            if (r38 == 0) goto L_0x050b
            r2.getMin((androidx.constraintlayout.solver.widgets.ConstraintAnchor) r1)
            return
        L_0x050b:
            r2.setMax((androidx.constraintlayout.solver.widgets.ConstraintAnchor) r1)
            return
        L_0x050f:
            r1 = 5
            r10.setMin((androidx.constraintlayout.solver.SolverVariable) r3, (androidx.constraintlayout.solver.SolverVariable) r14, (int) r5, (int) r1)
        L_0x0513:
            return
        L_0x0514:
            r2 = r42
            r3 = r43
            r6 = r9
            r4 = 2
            r5 = 1
            r12 = 8
            if (r1 >= r4) goto L_0x0563
            if (r39 == 0) goto L_0x0563
            if (r19 == 0) goto L_0x0563
            r1 = 0
            r10.setMin((androidx.constraintlayout.solver.SolverVariable) r6, (androidx.constraintlayout.solver.SolverVariable) r2, (int) r1, (int) r12)
            if (r38 != 0) goto L_0x0532
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r1 = r0.getDefaultImpl
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r1 = r1.toIntRange
            if (r1 != 0) goto L_0x0530
            goto L_0x0532
        L_0x0530:
            r1 = 0
            goto L_0x0533
        L_0x0532:
            r1 = 1
        L_0x0533:
            if (r38 != 0) goto L_0x055c
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r2 = r0.getDefaultImpl
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r2 = r2.toIntRange
            if (r2 == 0) goto L_0x055c
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r1 = r0.getDefaultImpl
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r1 = r1.toIntRange
            androidx.constraintlayout.solver.widgets.ConstraintWidget r1 = r1.setMax
            float r2 = r1.updateVisuals
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L_0x055a
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r2 = r1.extraCommand
            r4 = 0
            r2 = r2[r4]
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r4 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r2 != r4) goto L_0x055a
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r1 = r1.extraCommand
            r1 = r1[r5]
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r2 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r1 != r2) goto L_0x055a
            goto L_0x055d
        L_0x055a:
            r5 = 0
            goto L_0x055d
        L_0x055c:
            r5 = r1
        L_0x055d:
            if (r5 == 0) goto L_0x0563
            r1 = 0
            r10.setMin((androidx.constraintlayout.solver.SolverVariable) r3, (androidx.constraintlayout.solver.SolverVariable) r14, (int) r1, (int) r12)
        L_0x0563:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.solver.widgets.ConstraintWidget.setMax(o.reportFullyDrawn, boolean, boolean, boolean, boolean, androidx.constraintlayout.solver.SolverVariable, androidx.constraintlayout.solver.SolverVariable, androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour, boolean, androidx.constraintlayout.solver.widgets.ConstraintAnchor, androidx.constraintlayout.solver.widgets.ConstraintAnchor, int, int, int, int, float, boolean, boolean, boolean, boolean, boolean, int, int, int, int, float, boolean):void");
    }

    /* renamed from: androidx.constraintlayout.solver.widgets.ConstraintWidget$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] length;
        static final /* synthetic */ int[] setMin;

        /* JADX WARNING: Can't wrap try/catch for region: R(29:0|(2:1|2)|3|(2:5|6)|7|9|10|11|(2:13|14)|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Can't wrap try/catch for region: R(31:0|1|2|3|(2:5|6)|7|9|10|11|13|14|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Can't wrap try/catch for region: R(32:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0044 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x004e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0058 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0062 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x006d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0083 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x008f */
        static {
            /*
                androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r0 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                length = r0
                r1 = 1
                androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r2 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.FIXED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = length     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r3 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = length     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r4 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_PARENT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                r3 = 4
                int[] r4 = length     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r5 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type[] r4 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                setMin = r4
                androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r5 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.LEFT     // Catch:{ NoSuchFieldError -> 0x0044 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0044 }
                r4[r5] = r1     // Catch:{ NoSuchFieldError -> 0x0044 }
            L_0x0044:
                int[] r1 = setMin     // Catch:{ NoSuchFieldError -> 0x004e }
                androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r4 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.TOP     // Catch:{ NoSuchFieldError -> 0x004e }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x004e }
                r1[r4] = r0     // Catch:{ NoSuchFieldError -> 0x004e }
            L_0x004e:
                int[] r0 = setMin     // Catch:{ NoSuchFieldError -> 0x0058 }
                androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.RIGHT     // Catch:{ NoSuchFieldError -> 0x0058 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0058 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0058 }
            L_0x0058:
                int[] r0 = setMin     // Catch:{ NoSuchFieldError -> 0x0062 }
                androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.BOTTOM     // Catch:{ NoSuchFieldError -> 0x0062 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0062 }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x0062 }
            L_0x0062:
                int[] r0 = setMin     // Catch:{ NoSuchFieldError -> 0x006d }
                androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.BASELINE     // Catch:{ NoSuchFieldError -> 0x006d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006d }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006d }
            L_0x006d:
                int[] r0 = setMin     // Catch:{ NoSuchFieldError -> 0x0078 }
                androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.CENTER     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = setMin     // Catch:{ NoSuchFieldError -> 0x0083 }
                androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.CENTER_X     // Catch:{ NoSuchFieldError -> 0x0083 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0083 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0083 }
            L_0x0083:
                int[] r0 = setMin     // Catch:{ NoSuchFieldError -> 0x008f }
                androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.CENTER_Y     // Catch:{ NoSuchFieldError -> 0x008f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x008f }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x008f }
            L_0x008f:
                int[] r0 = setMin     // Catch:{ NoSuchFieldError -> 0x009b }
                androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.NONE     // Catch:{ NoSuchFieldError -> 0x009b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009b }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x009b }
            L_0x009b:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.solver.widgets.ConstraintWidget.AnonymousClass1.<clinit>():void");
        }
    }

    public void length(boolean z) {
        int i;
        int i2;
        unit unit;
        DimenRes dimenRes;
        int max = reportFullyDrawn.getMax((Object) this.ICustomTabsCallback$Default);
        int max2 = reportFullyDrawn.getMax((Object) this.setDefaultImpl);
        int max3 = reportFullyDrawn.getMax((Object) this.ICustomTabsCallback$Stub$Proxy);
        int max4 = reportFullyDrawn.getMax((Object) this.getInterfaceDescriptor);
        if (z && (dimenRes = this.toFloatRange) != null && dimenRes.hashCode.toFloatRange && this.toFloatRange.FastBitmap$CoordinateSystem.toFloatRange) {
            max = this.toFloatRange.hashCode.isInside;
            max3 = this.toFloatRange.FastBitmap$CoordinateSystem.isInside;
        }
        if (z && (unit = this.equals) != null && unit.hashCode.toFloatRange && this.equals.FastBitmap$CoordinateSystem.toFloatRange) {
            max2 = this.equals.hashCode.isInside;
            max4 = this.equals.FastBitmap$CoordinateSystem.isInside;
        }
        int i3 = max4 - max2;
        if (max3 - max < 0 || i3 < 0 || max == Integer.MIN_VALUE || max == Integer.MAX_VALUE || max2 == Integer.MIN_VALUE || max2 == Integer.MAX_VALUE || max3 == Integer.MIN_VALUE || max3 == Integer.MAX_VALUE || max4 == Integer.MIN_VALUE || max4 == Integer.MAX_VALUE) {
            max = 0;
            max2 = 0;
            max3 = 0;
            max4 = 0;
        }
        int i4 = max3 - max;
        int i5 = max4 - max2;
        this.ICustomTabsService$Stub$Proxy = max;
        this.ICustomTabsService$Stub = max2;
        if (this.areNotificationsEnabled == 8) {
            this.requestPostMessageChannelWithExtras = 0;
            this.postMessage = 0;
            return;
        }
        if (this.extraCommand[0] == DimensionBehaviour.FIXED && i4 < (i2 = this.requestPostMessageChannelWithExtras)) {
            i4 = i2;
        }
        if (this.extraCommand[1] == DimensionBehaviour.FIXED && i5 < (i = this.postMessage)) {
            i5 = i;
        }
        this.requestPostMessageChannelWithExtras = i4;
        this.postMessage = i5;
        int i6 = this.IPostMessageService$Stub$Proxy;
        if (i5 < i6) {
            this.postMessage = i6;
        }
        int i7 = this.requestPostMessageChannelWithExtras;
        int i8 = this.IPostMessageService$Default;
        if (i7 < i8) {
            this.requestPostMessageChannelWithExtras = i8;
        }
    }

    public void setMax(ConstraintWidget constraintWidget, HashMap<ConstraintWidget, ConstraintWidget> hashMap) {
        this.toDoubleRange = constraintWidget.toDoubleRange;
        this.toString = constraintWidget.toString;
        this.Mean$Arithmetic = constraintWidget.Mean$Arithmetic;
        this.invoke = constraintWidget.invoke;
        int[] iArr = this.valueOf;
        int[] iArr2 = constraintWidget.valueOf;
        iArr[0] = iArr2[0];
        iArr[1] = iArr2[1];
        this.invokeSuspend = constraintWidget.invokeSuspend;
        this.Grayscale$Algorithm = constraintWidget.Grayscale$Algorithm;
        this.onNavigationEvent = constraintWidget.onNavigationEvent;
        this.getCause = constraintWidget.getCause;
        this.create = constraintWidget.create;
        this.b = constraintWidget.b;
        this.onRelationshipValidationResult = constraintWidget.onRelationshipValidationResult;
        this.onPostMessage = constraintWidget.onPostMessage;
        this.extraCallbackWithResult = constraintWidget.extraCallbackWithResult;
        int[] iArr3 = constraintWidget.onMessageChannelReady;
        this.onMessageChannelReady = Arrays.copyOf(iArr3, iArr3.length);
        this.extraCallback = constraintWidget.extraCallback;
        this.ICustomTabsCallback$Stub = constraintWidget.ICustomTabsCallback$Stub;
        this.onTransact = constraintWidget.onTransact;
        this.ICustomTabsCallback$Default.setMin();
        this.setDefaultImpl.setMin();
        this.ICustomTabsCallback$Stub$Proxy.setMin();
        this.getInterfaceDescriptor.setMin();
        this.getDefaultImpl.setMin();
        this.ICustomTabsService.setMin();
        this.newSessionWithExtras.setMin();
        this.warmup.setMin();
        this.extraCommand = (DimensionBehaviour[]) Arrays.copyOf(this.extraCommand, 2);
        ConstraintWidget constraintWidget2 = null;
        this.requestPostMessageChannel = this.requestPostMessageChannel == null ? null : hashMap.get(constraintWidget.requestPostMessageChannel);
        this.requestPostMessageChannelWithExtras = constraintWidget.requestPostMessageChannelWithExtras;
        this.postMessage = constraintWidget.postMessage;
        this.updateVisuals = constraintWidget.updateVisuals;
        this.validateRelationship = constraintWidget.validateRelationship;
        this.ICustomTabsService$Stub$Proxy = constraintWidget.ICustomTabsService$Stub$Proxy;
        this.ICustomTabsService$Stub = constraintWidget.ICustomTabsService$Stub;
        this.receiveFile = constraintWidget.receiveFile;
        this.IPostMessageService = constraintWidget.IPostMessageService;
        this.ICustomTabsService$Default = constraintWidget.ICustomTabsService$Default;
        this.ITrustedWebActivityCallback = constraintWidget.ITrustedWebActivityCallback;
        this.IPostMessageService$Stub = constraintWidget.IPostMessageService$Stub;
        this.IPostMessageService$Default = constraintWidget.IPostMessageService$Default;
        this.IPostMessageService$Stub$Proxy = constraintWidget.IPostMessageService$Stub$Proxy;
        this.ITrustedWebActivityCallback$Default = constraintWidget.ITrustedWebActivityCallback$Default;
        this.ITrustedWebActivityCallback$Stub = constraintWidget.ITrustedWebActivityCallback$Stub;
        this.ITrustedWebActivityCallback$Stub$Proxy = constraintWidget.ITrustedWebActivityCallback$Stub$Proxy;
        this.MediaBrowserCompat$MediaItem = constraintWidget.MediaBrowserCompat$MediaItem;
        this.areNotificationsEnabled = constraintWidget.areNotificationsEnabled;
        this.ITrustedWebActivityService = constraintWidget.ITrustedWebActivityService;
        this.MediaMetadataCompat$BitmapKey = constraintWidget.MediaMetadataCompat$BitmapKey;
        this.getActiveNotifications = constraintWidget.getActiveNotifications;
        this.getSmallIconBitmap = constraintWidget.getSmallIconBitmap;
        this.notifyNotificationWithChannel = constraintWidget.notifyNotificationWithChannel;
        this.cancelNotification = constraintWidget.cancelNotification;
        this.getSmallIconId = constraintWidget.getSmallIconId;
        this.ITrustedWebActivityService$Stub = constraintWidget.ITrustedWebActivityService$Stub;
        this.ITrustedWebActivityService$Stub$Proxy = constraintWidget.ITrustedWebActivityService$Stub$Proxy;
        this.INotificationSideChannel = constraintWidget.INotificationSideChannel;
        this.notify = constraintWidget.notify;
        this.ITrustedWebActivityService$Default = constraintWidget.ITrustedWebActivityService$Default;
        this.cancelAll = constraintWidget.cancelAll;
        this.INotificationSideChannel$Stub$Proxy = constraintWidget.INotificationSideChannel$Stub$Proxy;
        this.INotificationSideChannel$Default = constraintWidget.INotificationSideChannel$Default;
        this.INotificationSideChannel$Stub = constraintWidget.INotificationSideChannel$Stub;
        float[] fArr = this.IconCompatParcelizer;
        float[] fArr2 = constraintWidget.IconCompatParcelizer;
        fArr[0] = fArr2[0];
        fArr[1] = fArr2[1];
        ConstraintWidget[] constraintWidgetArr = this.read;
        ConstraintWidget[] constraintWidgetArr2 = constraintWidget.read;
        constraintWidgetArr[0] = constraintWidgetArr2[0];
        constraintWidgetArr[1] = constraintWidgetArr2[1];
        ConstraintWidget[] constraintWidgetArr3 = this.MediaBrowserCompat$CustomActionResultReceiver;
        ConstraintWidget[] constraintWidgetArr4 = constraintWidget.MediaBrowserCompat$CustomActionResultReceiver;
        constraintWidgetArr3[0] = constraintWidgetArr4[0];
        constraintWidgetArr3[1] = constraintWidgetArr4[1];
        ConstraintWidget constraintWidget3 = constraintWidget.write;
        this.write = constraintWidget3 == null ? null : hashMap.get(constraintWidget3);
        ConstraintWidget constraintWidget4 = constraintWidget.RemoteActionCompatParcelizer;
        if (constraintWidget4 != null) {
            constraintWidget2 = hashMap.get(constraintWidget4);
        }
        this.RemoteActionCompatParcelizer = constraintWidget2;
    }

    public void getMax(boolean z, boolean z2) {
        int i;
        int i2;
        boolean IsOverlapping2 = z & this.toFloatRange.IsOverlapping();
        boolean IsOverlapping3 = z2 & this.equals.IsOverlapping();
        int i3 = this.toFloatRange.hashCode.isInside;
        int i4 = this.equals.hashCode.isInside;
        int i5 = this.toFloatRange.FastBitmap$CoordinateSystem.isInside;
        int i6 = this.equals.FastBitmap$CoordinateSystem.isInside;
        int i7 = i6 - i4;
        if (i5 - i3 < 0 || i7 < 0 || i3 == Integer.MIN_VALUE || i3 == Integer.MAX_VALUE || i4 == Integer.MIN_VALUE || i4 == Integer.MAX_VALUE || i5 == Integer.MIN_VALUE || i5 == Integer.MAX_VALUE || i6 == Integer.MIN_VALUE || i6 == Integer.MAX_VALUE) {
            i3 = 0;
            i4 = 0;
            i5 = 0;
            i6 = 0;
        }
        int i8 = i5 - i3;
        int i9 = i6 - i4;
        if (IsOverlapping2) {
            this.ICustomTabsService$Stub$Proxy = i3;
        }
        if (IsOverlapping3) {
            this.ICustomTabsService$Stub = i4;
        }
        if (this.areNotificationsEnabled == 8) {
            this.requestPostMessageChannelWithExtras = 0;
            this.postMessage = 0;
            return;
        }
        if (IsOverlapping2) {
            if (this.extraCommand[0] == DimensionBehaviour.FIXED && i8 < (i2 = this.requestPostMessageChannelWithExtras)) {
                i8 = i2;
            }
            this.requestPostMessageChannelWithExtras = i8;
            int i10 = this.IPostMessageService$Default;
            if (i8 < i10) {
                this.requestPostMessageChannelWithExtras = i10;
            }
        }
        if (IsOverlapping3) {
            if (this.extraCommand[1] == DimensionBehaviour.FIXED && i9 < (i = this.postMessage)) {
                i9 = i;
            }
            this.postMessage = i9;
            int i11 = this.IPostMessageService$Stub$Proxy;
            if (i9 < i11) {
                this.postMessage = i11;
            }
        }
    }

    public final void getMin(AnimRes animRes, reportFullyDrawn reportfullydrawn, HashSet<ConstraintWidget> hashSet, int i, boolean z) {
        if (z) {
            if (hashSet.contains(this)) {
                ArrayRes.getMin(animRes, reportfullydrawn, this);
                hashSet.remove(this);
                setMin(reportfullydrawn, animRes.FastBitmap$CoordinateSystem(64));
            } else {
                return;
            }
        }
        if (i == 0) {
            HashSet<ConstraintAnchor> hashSet2 = this.ICustomTabsCallback$Default.length;
            if (hashSet2 != null) {
                Iterator<ConstraintAnchor> it = hashSet2.iterator();
                while (it.hasNext()) {
                    it.next().setMax.getMin(animRes, reportfullydrawn, hashSet, i, true);
                }
            }
            HashSet<ConstraintAnchor> hashSet3 = this.ICustomTabsCallback$Stub$Proxy.length;
            if (hashSet3 != null) {
                Iterator<ConstraintAnchor> it2 = hashSet3.iterator();
                while (it2.hasNext()) {
                    it2.next().setMax.getMin(animRes, reportfullydrawn, hashSet, i, true);
                }
                return;
            }
            return;
        }
        HashSet<ConstraintAnchor> hashSet4 = this.setDefaultImpl.length;
        if (hashSet4 != null) {
            Iterator<ConstraintAnchor> it3 = hashSet4.iterator();
            while (it3.hasNext()) {
                it3.next().setMax.getMin(animRes, reportfullydrawn, hashSet, i, true);
            }
        }
        HashSet<ConstraintAnchor> hashSet5 = this.getInterfaceDescriptor.length;
        if (hashSet5 != null) {
            Iterator<ConstraintAnchor> it4 = hashSet5.iterator();
            while (it4.hasNext()) {
                it4.next().setMax.getMin(animRes, reportfullydrawn, hashSet, i, true);
            }
        }
        HashSet<ConstraintAnchor> hashSet6 = this.getDefaultImpl.length;
        if (hashSet6 != null) {
            Iterator<ConstraintAnchor> it5 = hashSet6.iterator();
            while (it5.hasNext()) {
                it5.next().setMax.getMin(animRes, reportfullydrawn, hashSet, i, true);
            }
        }
    }
}
