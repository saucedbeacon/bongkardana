package o;

import androidx.constraintlayout.solver.SolverVariable;
import java.util.ArrayList;
import o.ComponentActivity;
import o.reportFullyDrawn;

public class registerForActivityResult implements reportFullyDrawn.length {
    boolean getMax = false;
    SolverVariable getMin = null;
    boolean isInside = false;
    public getMin length;
    ArrayList<SolverVariable> setMax = new ArrayList<>();
    public float setMin = 0.0f;

    public interface getMin {
        float getMax(SolverVariable solverVariable);

        SolverVariable getMax(int i);

        void getMax(float f);

        void getMax(SolverVariable solverVariable, float f, boolean z);

        int getMin();

        float length(int i);

        void length(SolverVariable solverVariable, float f);

        void setMax();

        boolean setMax(SolverVariable solverVariable);

        float setMin(SolverVariable solverVariable, boolean z);

        float setMin(registerForActivityResult registerforactivityresult, boolean z);

        void setMin();
    }

    public registerForActivityResult() {
    }

    public registerForActivityResult(ComponentActivity.AnonymousClass3 r3) {
        this.length = new getActivityResultRegistry(this, r3);
    }

    /* access modifiers changed from: package-private */
    public final boolean getMax() {
        SolverVariable solverVariable = this.getMin;
        if (solverVariable != null) {
            return solverVariable.toFloatRange == SolverVariable.Type.UNRESTRICTED || this.setMin >= 0.0f;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public final boolean getMax(SolverVariable solverVariable) {
        return this.length.setMax(solverVariable);
    }

    public final registerForActivityResult length(SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.setMin = (float) i;
        }
        if (!z) {
            this.length.length(solverVariable, -1.0f);
            this.length.length(solverVariable2, 1.0f);
            this.length.length(solverVariable3, 1.0f);
        } else {
            this.length.length(solverVariable, 1.0f);
            this.length.length(solverVariable2, -1.0f);
            this.length.length(solverVariable3, -1.0f);
        }
        return this;
    }

    public final registerForActivityResult setMin(SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.setMin = (float) i;
        }
        if (!z) {
            this.length.length(solverVariable, -1.0f);
            this.length.length(solverVariable2, 1.0f);
            this.length.length(solverVariable3, -1.0f);
        } else {
            this.length.length(solverVariable, 1.0f);
            this.length.length(solverVariable2, -1.0f);
            this.length.length(solverVariable3, 1.0f);
        }
        return this;
    }

    public final registerForActivityResult getMin(reportFullyDrawn reportfullydrawn, int i) {
        this.length.length(reportfullydrawn.setMax(i), 1.0f);
        this.length.length(reportfullydrawn.setMax(i), -1.0f);
        return this;
    }

    public final registerForActivityResult setMax(SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, SolverVariable solverVariable4, float f) {
        this.length.length(solverVariable, -1.0f);
        this.length.length(solverVariable2, 1.0f);
        this.length.length(solverVariable3, f);
        this.length.length(solverVariable4, -f);
        return this;
    }

    public final registerForActivityResult setMin(SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, SolverVariable solverVariable4, float f) {
        this.length.length(solverVariable3, 0.5f);
        this.length.length(solverVariable4, 0.5f);
        this.length.length(solverVariable, -0.5f);
        this.length.length(solverVariable2, -0.5f);
        this.setMin = -f;
        return this;
    }

    private static boolean setMax(SolverVariable solverVariable) {
        return solverVariable.hashCode <= 1;
    }

    /* access modifiers changed from: package-private */
    public final void length(SolverVariable solverVariable) {
        SolverVariable solverVariable2 = this.getMin;
        if (solverVariable2 != null) {
            this.length.length(solverVariable2, -1.0f);
            this.getMin.length = -1;
            this.getMin = null;
        }
        float min = this.length.setMin(solverVariable, true) * -1.0f;
        this.getMin = solverVariable;
        if (min != 1.0f) {
            this.setMin /= min;
            this.length.getMax(min);
        }
    }

    public boolean setMax() {
        return this.getMin == null && this.setMin == 0.0f && this.length.getMin() == 0;
    }

    public void getMin(reportFullyDrawn reportfullydrawn, registerForActivityResult registerforactivityresult, boolean z) {
        this.setMin += registerforactivityresult.setMin * this.length.setMin(registerforactivityresult, z);
        if (z) {
            registerforactivityresult.getMin.setMin(this);
        }
        if (reportFullyDrawn.length && this.getMin != null && this.length.getMin() == 0) {
            this.isInside = true;
            reportfullydrawn.toIntRange = true;
        }
    }

    public final void setMax(reportFullyDrawn reportfullydrawn, SolverVariable solverVariable, boolean z) {
        if (solverVariable.isInside) {
            this.setMin += solverVariable.getMax * this.length.getMax(solverVariable);
            this.length.setMin(solverVariable, z);
            if (z) {
                solverVariable.setMin(this);
            }
            if (reportFullyDrawn.length && solverVariable != null && this.length.getMin() == 0) {
                this.isInside = true;
                reportfullydrawn.toIntRange = true;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final SolverVariable getMax(boolean[] zArr, SolverVariable solverVariable) {
        int min = this.length.getMin();
        SolverVariable solverVariable2 = null;
        float f = 0.0f;
        for (int i = 0; i < min; i++) {
            float length2 = this.length.length(i);
            if (length2 < 0.0f) {
                SolverVariable max = this.length.getMax(i);
                if ((zArr == null || !zArr[max.getMin]) && max != solverVariable && ((max.toFloatRange == SolverVariable.Type.SLACK || max.toFloatRange == SolverVariable.Type.ERROR) && length2 < f)) {
                    f = length2;
                    solverVariable2 = max;
                }
            }
        }
        return solverVariable2;
    }

    public SolverVariable setMin(boolean[] zArr) {
        return getMax(zArr, (SolverVariable) null);
    }

    public void setMin() {
        this.length.setMax();
        this.getMin = null;
        this.setMin = 0.0f;
    }

    public final void length(reportFullyDrawn.length length2) {
        if (length2 instanceof registerForActivityResult) {
            registerForActivityResult registerforactivityresult = (registerForActivityResult) length2;
            this.getMin = null;
            this.length.setMax();
            for (int i = 0; i < registerforactivityresult.length.getMin(); i++) {
                this.length.getMax(registerforactivityresult.length.getMax(i), registerforactivityresult.length.length(i), true);
            }
        }
    }

    public void getMin(SolverVariable solverVariable) {
        float f = 1.0f;
        if (solverVariable.setMax != 1) {
            if (solverVariable.setMax == 2) {
                f = 1000.0f;
            } else if (solverVariable.setMax == 3) {
                f = 1000000.0f;
            } else if (solverVariable.setMax == 4) {
                f = 1.0E9f;
            } else if (solverVariable.setMax == 5) {
                f = 1.0E12f;
            }
        }
        this.length.length(solverVariable, f);
    }

    public final SolverVariable length() {
        return this.getMin;
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00ce  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
            r9 = this;
            androidx.constraintlayout.solver.SolverVariable r0 = r9.getMin
            java.lang.String r1 = ""
            if (r0 != 0) goto L_0x0018
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            java.lang.String r1 = "0"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            goto L_0x0029
        L_0x0018:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            androidx.constraintlayout.solver.SolverVariable r1 = r9.getMin
            r0.append(r1)
            java.lang.String r0 = r0.toString()
        L_0x0029:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = " = "
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            float r1 = r9.setMin
            r2 = 0
            r3 = 1
            r4 = 0
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 == 0) goto L_0x0056
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            float r0 = r9.setMin
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r1 = 1
            goto L_0x0057
        L_0x0056:
            r1 = 0
        L_0x0057:
            o.registerForActivityResult$getMin r5 = r9.length
            int r5 = r5.getMin()
        L_0x005d:
            if (r2 >= r5) goto L_0x00ea
            o.registerForActivityResult$getMin r6 = r9.length
            androidx.constraintlayout.solver.SolverVariable r6 = r6.getMax((int) r2)
            if (r6 == 0) goto L_0x00e6
            o.registerForActivityResult$getMin r7 = r9.length
            float r7 = r7.length(r2)
            int r8 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r8 == 0) goto L_0x00e6
            java.lang.String r6 = r6.toString()
            r8 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r1 != 0) goto L_0x008f
            int r1 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r1 >= 0) goto L_0x00b8
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = "- "
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            goto L_0x00b6
        L_0x008f:
            int r1 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r1 <= 0) goto L_0x00a5
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = " + "
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            goto L_0x00b8
        L_0x00a5:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = " - "
            r1.append(r0)
            java.lang.String r0 = r1.toString()
        L_0x00b6:
            float r7 = r7 * r8
        L_0x00b8:
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x00ce
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = r1.toString()
            goto L_0x00e5
        L_0x00ce:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = " "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = r1.toString()
        L_0x00e5:
            r1 = 1
        L_0x00e6:
            int r2 = r2 + 1
            goto L_0x005d
        L_0x00ea:
            if (r1 != 0) goto L_0x00fd
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = "0.0"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
        L_0x00fd:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.registerForActivityResult.toString():java.lang.String");
    }

    /* access modifiers changed from: package-private */
    public final boolean getMin() {
        int min = this.length.getMin();
        SolverVariable solverVariable = null;
        boolean z = false;
        SolverVariable solverVariable2 = null;
        float f = 0.0f;
        boolean z2 = false;
        float f2 = 0.0f;
        boolean z3 = false;
        for (int i = 0; i < min; i++) {
            float length2 = this.length.length(i);
            SolverVariable max = this.length.getMax(i);
            if (max.toFloatRange == SolverVariable.Type.UNRESTRICTED) {
                if (solverVariable == null) {
                    z2 = setMax(max);
                } else if (f > length2) {
                    z2 = setMax(max);
                } else if (!z2 && setMax(max)) {
                    f = length2;
                    solverVariable = max;
                    z2 = true;
                }
                f = length2;
                solverVariable = max;
            } else if (solverVariable == null && length2 < 0.0f) {
                if (solverVariable2 == null) {
                    z3 = setMax(max);
                } else if (f2 > length2) {
                    z3 = setMax(max);
                } else if (!z3 && setMax(max)) {
                    f2 = length2;
                    solverVariable2 = max;
                    z3 = true;
                }
                f2 = length2;
                solverVariable2 = max;
            }
        }
        if (solverVariable == null) {
            solverVariable = solverVariable2;
        }
        if (solverVariable == null) {
            z = true;
        } else {
            length(solverVariable);
        }
        if (this.length.getMin() == 0) {
            this.isInside = true;
        }
        return z;
    }
}
