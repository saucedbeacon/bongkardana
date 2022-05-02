package androidx.constraintlayout.solver.widgets;

import androidx.constraintlayout.solver.SolverVariable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import o.AnimatorRes;
import o.Dimension;
import o.codename;

public final class ConstraintAnchor {
    public SolverVariable IsOverlapping;
    public int equals = 0;
    public final Type getMax;
    public int getMin;
    public int isInside = -1;
    public HashSet<ConstraintAnchor> length = null;
    public final ConstraintWidget setMax;
    public boolean setMin;
    public ConstraintAnchor toIntRange;

    public enum Type {
        NONE,
        LEFT,
        TOP,
        RIGHT,
        BOTTOM,
        BASELINE,
        CENTER,
        CENTER_X,
        CENTER_Y
    }

    public final void setMin(int i, ArrayList<Dimension> arrayList, Dimension dimension) {
        HashSet<ConstraintAnchor> hashSet = this.length;
        if (hashSet != null) {
            Iterator<ConstraintAnchor> it = hashSet.iterator();
            while (it.hasNext()) {
                codename.getMin(it.next().setMax, i, arrayList, dimension);
            }
        }
    }

    public final boolean getMax() {
        HashSet<ConstraintAnchor> hashSet = this.length;
        if (hashSet != null && hashSet.size() > 0) {
            return true;
        }
        return false;
    }

    public final boolean length() {
        HashSet<ConstraintAnchor> hashSet = this.length;
        if (hashSet == null) {
            return false;
        }
        Iterator<ConstraintAnchor> it = hashSet.iterator();
        while (it.hasNext()) {
            if (it.next().equals().isInside()) {
                return true;
            }
        }
        return false;
    }

    public final boolean setMax() {
        return this.setMin;
    }

    public ConstraintAnchor(ConstraintWidget constraintWidget, Type type) {
        this.setMax = constraintWidget;
        this.getMax = type;
    }

    public final int getMin() {
        ConstraintAnchor constraintAnchor;
        if (this.setMax.areNotificationsEnabled == 8) {
            return 0;
        }
        if (this.isInside < 0 || (constraintAnchor = this.toIntRange) == null || constraintAnchor.setMax.areNotificationsEnabled != 8) {
            return this.equals;
        }
        return this.isInside;
    }

    public final void setMin() {
        HashSet<ConstraintAnchor> hashSet;
        ConstraintAnchor constraintAnchor = this.toIntRange;
        if (!(constraintAnchor == null || (hashSet = constraintAnchor.length) == null)) {
            hashSet.remove(this);
            if (this.toIntRange.length.size() == 0) {
                this.toIntRange.length = null;
            }
        }
        this.length = null;
        this.toIntRange = null;
        this.equals = 0;
        this.isInside = -1;
        this.setMin = false;
        this.getMin = 0;
    }

    public final boolean length(ConstraintAnchor constraintAnchor, int i, int i2, boolean z) {
        if (constraintAnchor == null) {
            setMin();
            return true;
        } else if (!z && !setMin(constraintAnchor)) {
            return false;
        } else {
            this.toIntRange = constraintAnchor;
            if (constraintAnchor.length == null) {
                constraintAnchor.length = new HashSet<>();
            }
            HashSet<ConstraintAnchor> hashSet = this.toIntRange.length;
            if (hashSet != null) {
                hashSet.add(this);
            }
            if (i > 0) {
                this.equals = i;
            } else {
                this.equals = 0;
            }
            this.isInside = i2;
            return true;
        }
    }

    public final boolean setMin(ConstraintAnchor constraintAnchor, int i) {
        return length(constraintAnchor, i, -1, false);
    }

    public final boolean isInside() {
        return this.toIntRange != null;
    }

    /* renamed from: androidx.constraintlayout.solver.widgets.ConstraintAnchor$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] setMin;

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
                setMin = r0
                androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.CENTER     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = setMin     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.LEFT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = setMin     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.RIGHT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = setMin     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.TOP     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = setMin     // Catch:{ NoSuchFieldError -> 0x003e }
                androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.BOTTOM     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = setMin     // Catch:{ NoSuchFieldError -> 0x0049 }
                androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.BASELINE     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = setMin     // Catch:{ NoSuchFieldError -> 0x0054 }
                androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.CENTER_X     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = setMin     // Catch:{ NoSuchFieldError -> 0x0060 }
                androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.CENTER_Y     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = setMin     // Catch:{ NoSuchFieldError -> 0x006c }
                androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.NONE     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.solver.widgets.ConstraintAnchor.AnonymousClass1.<clinit>():void");
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.setMax.ITrustedWebActivityService);
        sb.append(":");
        sb.append(this.getMax.toString());
        return sb.toString();
    }

    public final ConstraintAnchor equals() {
        switch (AnonymousClass1.setMin[this.getMax.ordinal()]) {
            case 1:
            case 6:
            case 7:
            case 8:
            case 9:
                return null;
            case 2:
                return this.setMax.ICustomTabsCallback$Stub$Proxy;
            case 3:
                return this.setMax.ICustomTabsCallback$Default;
            case 4:
                return this.setMax.getInterfaceDescriptor;
            case 5:
                return this.setMax.setDefaultImpl;
            default:
                throw new AssertionError(this.getMax.name());
        }
    }

    public final boolean setMin(ConstraintAnchor constraintAnchor) {
        boolean z = false;
        if (constraintAnchor == null) {
            return false;
        }
        Type type = constraintAnchor.getMax;
        Type type2 = this.getMax;
        if (type != type2) {
            switch (AnonymousClass1.setMin[this.getMax.ordinal()]) {
                case 1:
                    if (type == Type.BASELINE || type == Type.CENTER_X || type == Type.CENTER_Y) {
                        return false;
                    }
                    return true;
                case 2:
                case 3:
                    boolean z2 = type == Type.LEFT || type == Type.RIGHT;
                    if (!(constraintAnchor.setMax instanceof AnimatorRes)) {
                        return z2;
                    }
                    if (z2 || type == Type.CENTER_X) {
                        z = true;
                    }
                    return z;
                case 4:
                case 5:
                    boolean z3 = type == Type.TOP || type == Type.BOTTOM;
                    if (!(constraintAnchor.setMax instanceof AnimatorRes)) {
                        return z3;
                    }
                    if (z3 || type == Type.CENTER_Y) {
                        z = true;
                    }
                    return z;
                case 6:
                case 7:
                case 8:
                case 9:
                    return false;
                default:
                    throw new AssertionError(this.getMax.name());
            }
        } else if (type2 != Type.BASELINE || (constraintAnchor.setMax.onRelationshipValidationResult() && this.setMax.onRelationshipValidationResult())) {
            return true;
        } else {
            return false;
        }
    }
}
