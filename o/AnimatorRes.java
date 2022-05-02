package o;

import androidx.constraintlayout.solver.SolverVariable;
import androidx.constraintlayout.solver.widgets.ConstraintAnchor;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import java.util.HashMap;

public final class AnimatorRes extends ConstraintWidget {
    public int MediaBrowserCompat$ItemReceiver;
    public boolean MediaBrowserCompat$MediaItem;
    private int MediaBrowserCompat$SearchResultReceiver;
    protected int getMin = -1;
    public ConstraintAnchor length = this.setDefaultImpl;
    protected float setMax = -1.0f;
    protected int setMin = -1;

    public final boolean getMax() {
        return true;
    }

    public AnimatorRes() {
        this.MediaBrowserCompat$ItemReceiver = 0;
        this.MediaBrowserCompat$SearchResultReceiver = 0;
        this.mayLaunchUrl.clear();
        this.mayLaunchUrl.add(this.length);
        int length2 = this.newSession.length;
        for (int i = 0; i < length2; i++) {
            this.newSession[i] = this.length;
        }
    }

    public final void setMax(ConstraintWidget constraintWidget, HashMap<ConstraintWidget, ConstraintWidget> hashMap) {
        super.setMax(constraintWidget, hashMap);
        AnimatorRes animatorRes = (AnimatorRes) constraintWidget;
        this.setMax = animatorRes.setMax;
        this.setMin = animatorRes.setMin;
        this.getMin = animatorRes.getMin;
        hashCode(animatorRes.MediaBrowserCompat$ItemReceiver);
    }

    public final void hashCode(int i) {
        if (this.MediaBrowserCompat$ItemReceiver != i) {
            this.MediaBrowserCompat$ItemReceiver = i;
            this.mayLaunchUrl.clear();
            if (this.MediaBrowserCompat$ItemReceiver == 1) {
                this.length = this.ICustomTabsCallback$Default;
            } else {
                this.length = this.setDefaultImpl;
            }
            this.mayLaunchUrl.add(this.length);
            int length2 = this.newSession.length;
            for (int i2 = 0; i2 < length2; i2++) {
                this.newSession[i2] = this.length;
            }
        }
    }

    /* renamed from: o.AnimatorRes$2  reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] getMax;

        /* JADX WARNING: Can't wrap try/catch for region: R(18:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|(3:17|18|20)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type[] r0 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                getMax = r0
                androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.LEFT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = getMax     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.RIGHT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = getMax     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.TOP     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = getMax     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.BOTTOM     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = getMax     // Catch:{ NoSuchFieldError -> 0x003e }
                androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.BASELINE     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = getMax     // Catch:{ NoSuchFieldError -> 0x0049 }
                androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.CENTER     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = getMax     // Catch:{ NoSuchFieldError -> 0x0054 }
                androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.CENTER_X     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = getMax     // Catch:{ NoSuchFieldError -> 0x0060 }
                androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.CENTER_Y     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = getMax     // Catch:{ NoSuchFieldError -> 0x006c }
                androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.NONE     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o.AnimatorRes.AnonymousClass2.<clinit>():void");
        }
    }

    public final ConstraintAnchor setMax(ConstraintAnchor.Type type) {
        switch (AnonymousClass2.getMax[type.ordinal()]) {
            case 1:
            case 2:
                if (this.MediaBrowserCompat$ItemReceiver == 1) {
                    return this.length;
                }
                break;
            case 3:
            case 4:
                if (this.MediaBrowserCompat$ItemReceiver == 0) {
                    return this.length;
                }
                break;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return null;
        }
        throw new AssertionError(type.name());
    }

    public final void getMax(float f) {
        if (f > -1.0f) {
            this.setMax = f;
            this.setMin = -1;
            this.getMin = -1;
        }
    }

    public final void values(int i) {
        if (i >= 0) {
            this.setMax = -1.0f;
            this.setMin = i;
            this.getMin = -1;
        }
    }

    public final void toString(int i) {
        if (i >= 0) {
            this.setMax = -1.0f;
            this.setMin = -1;
            this.getMin = i;
        }
    }

    public final float setMax() {
        return this.setMax;
    }

    public final int length() {
        return this.setMin;
    }

    public final int isInside() {
        return this.getMin;
    }

    public final boolean getMin() {
        return this.MediaBrowserCompat$MediaItem;
    }

    public final boolean setMin() {
        return this.MediaBrowserCompat$MediaItem;
    }

    public final void setMin(reportFullyDrawn reportfullydrawn, boolean z) {
        int i;
        AnimRes animRes = (AnimRes) this.requestPostMessageChannel;
        if (animRes != null) {
            ConstraintAnchor max = animRes.setMax(ConstraintAnchor.Type.LEFT);
            ConstraintAnchor max2 = animRes.setMax(ConstraintAnchor.Type.RIGHT);
            boolean z2 = true;
            boolean z3 = this.requestPostMessageChannel != null && this.requestPostMessageChannel.extraCommand[0] == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
            if (this.MediaBrowserCompat$ItemReceiver == 0) {
                max = animRes.setMax(ConstraintAnchor.Type.TOP);
                max2 = animRes.setMax(ConstraintAnchor.Type.BOTTOM);
                if (this.requestPostMessageChannel == null || this.requestPostMessageChannel.extraCommand[1] != ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
                    z2 = false;
                }
                z3 = z2;
            }
            if (this.MediaBrowserCompat$MediaItem && this.length.setMax()) {
                SolverVariable min = reportfullydrawn.getMin((Object) this.length);
                ConstraintAnchor constraintAnchor = this.length;
                if (!constraintAnchor.setMin) {
                    i = 0;
                } else {
                    i = constraintAnchor.getMin;
                }
                reportfullydrawn.setMin(min, i);
                if (this.setMin != -1) {
                    if (z3) {
                        reportfullydrawn.setMin(reportfullydrawn.getMin((Object) max2), min, 0, 5);
                    }
                } else if (this.getMin != -1 && z3) {
                    SolverVariable min2 = reportfullydrawn.getMin((Object) max2);
                    reportfullydrawn.setMin(min, reportfullydrawn.getMin((Object) max), 0, 5);
                    reportfullydrawn.setMin(min2, min, 0, 5);
                }
                this.MediaBrowserCompat$MediaItem = false;
            } else if (this.setMin != -1) {
                SolverVariable min3 = reportfullydrawn.getMin((Object) this.length);
                reportfullydrawn.getMax(min3, reportfullydrawn.getMin((Object) max), this.setMin, 8);
                if (z3) {
                    reportfullydrawn.setMin(reportfullydrawn.getMin((Object) max2), min3, 0, 5);
                }
            } else if (this.getMin != -1) {
                SolverVariable min4 = reportfullydrawn.getMin((Object) this.length);
                SolverVariable min5 = reportfullydrawn.getMin((Object) max2);
                reportfullydrawn.getMax(min4, min5, -this.getMin, 8);
                if (z3) {
                    reportfullydrawn.setMin(min4, reportfullydrawn.getMin((Object) max), 0, 5);
                    reportfullydrawn.setMin(min5, min4, 0, 5);
                }
            } else if (this.setMax != -1.0f) {
                reportfullydrawn.getMin(reportFullyDrawn.setMin(reportfullydrawn, reportfullydrawn.getMin((Object) this.length), reportfullydrawn.getMin((Object) max2), this.setMax));
            }
        }
    }

    public final void length(boolean z) {
        int i;
        int i2;
        if (this.requestPostMessageChannel != null) {
            int max = reportFullyDrawn.getMax((Object) this.length);
            if (this.MediaBrowserCompat$ItemReceiver == 1) {
                length(max);
                setMin(0);
                ConstraintWidget constraintWidget = this.requestPostMessageChannel;
                if (constraintWidget.areNotificationsEnabled == 8) {
                    i2 = 0;
                } else {
                    i2 = constraintWidget.postMessage;
                }
                toFloatRange(i2);
                getMax(0);
                return;
            }
            length(0);
            setMin(max);
            ConstraintWidget constraintWidget2 = this.requestPostMessageChannel;
            if (constraintWidget2.areNotificationsEnabled == 8) {
                i = 0;
            } else {
                i = constraintWidget2.requestPostMessageChannelWithExtras;
            }
            getMax(i);
            toFloatRange(0);
        }
    }
}
