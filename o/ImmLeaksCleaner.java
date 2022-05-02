package o;

import androidx.constraintlayout.solver.SolverVariable;
import java.util.Arrays;
import java.util.Comparator;
import o.ComponentActivity;
import o.registerForActivityResult;

public final class ImmLeaksCleaner extends registerForActivityResult {
    ComponentActivity.AnonymousClass3 IsOverlapping;
    getMin equals = new getMin(this);
    private int hashCode = 0;
    private SolverVariable[] toFloatRange = new SolverVariable[128];
    private int toIntRange = 128;
    private SolverVariable[] values = new SolverVariable[128];

    class getMin implements Comparable {
        SolverVariable getMin;
        ImmLeaksCleaner setMax;

        public getMin(ImmLeaksCleaner immLeaksCleaner) {
            this.setMax = immLeaksCleaner;
        }

        public final boolean getMin(SolverVariable solverVariable, float f) {
            boolean z = true;
            if (this.getMin.setMin) {
                for (int i = 0; i < 9; i++) {
                    float[] fArr = this.getMin.equals;
                    fArr[i] = fArr[i] + (solverVariable.equals[i] * f);
                    if (Math.abs(this.getMin.equals[i]) < 1.0E-4f) {
                        this.getMin.equals[i] = 0.0f;
                    } else {
                        z = false;
                    }
                }
                if (z) {
                    ImmLeaksCleaner.this.setMax(this.getMin);
                }
                return false;
            }
            for (int i2 = 0; i2 < 9; i2++) {
                float f2 = solverVariable.equals[i2];
                if (f2 != 0.0f) {
                    float f3 = f2 * f;
                    if (Math.abs(f3) < 1.0E-4f) {
                        f3 = 0.0f;
                    }
                    this.getMin.equals[i2] = f3;
                } else {
                    this.getMin.equals[i2] = 0.0f;
                }
            }
            return true;
        }

        public final boolean getMin() {
            for (int i = 8; i >= 0; i--) {
                float f = this.getMin.equals[i];
                if (f > 0.0f) {
                    return false;
                }
                if (f < 0.0f) {
                    return true;
                }
            }
            return false;
        }

        public final boolean getMax(SolverVariable solverVariable) {
            int i = 8;
            while (i >= 0) {
                float f = solverVariable.equals[i];
                float f2 = this.getMin.equals[i];
                if (f2 == f) {
                    i--;
                } else if (f2 < f) {
                    return true;
                } else {
                    return false;
                }
            }
            return false;
        }

        public final int compareTo(Object obj) {
            return this.getMin.getMin - ((SolverVariable) obj).getMin;
        }

        public final String toString() {
            String str = "[ ";
            if (this.getMin != null) {
                for (int i = 0; i < 9; i++) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str);
                    sb.append(this.getMin.equals[i]);
                    sb.append(" ");
                    str = sb.toString();
                }
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append("] ");
            sb2.append(this.getMin);
            return sb2.toString();
        }
    }

    public final void setMin() {
        this.hashCode = 0;
        this.setMin = 0.0f;
    }

    public ImmLeaksCleaner(ComponentActivity.AnonymousClass3 r3) {
        super(r3);
        this.IsOverlapping = r3;
    }

    public final boolean setMax() {
        return this.hashCode == 0;
    }

    public final SolverVariable setMin(boolean[] zArr) {
        int i = -1;
        for (int i2 = 0; i2 < this.hashCode; i2++) {
            SolverVariable solverVariable = this.toFloatRange[i2];
            if (!zArr[solverVariable.getMin]) {
                this.equals.getMin = solverVariable;
                if (i == -1) {
                    if (!this.equals.getMin()) {
                    }
                } else if (!this.equals.getMax(this.toFloatRange[i])) {
                }
                i = i2;
            }
        }
        if (i == -1) {
            return null;
        }
        return this.toFloatRange[i];
    }

    public final void getMin(SolverVariable solverVariable) {
        this.equals.getMin = solverVariable;
        Arrays.fill(this.equals.getMin.equals, 0.0f);
        solverVariable.equals[solverVariable.setMax] = 1.0f;
        setMin(solverVariable);
    }

    private final void setMin(SolverVariable solverVariable) {
        int i;
        int i2 = this.hashCode + 1;
        SolverVariable[] solverVariableArr = this.toFloatRange;
        if (i2 > solverVariableArr.length) {
            SolverVariable[] solverVariableArr2 = (SolverVariable[]) Arrays.copyOf(solverVariableArr, solverVariableArr.length * 2);
            this.toFloatRange = solverVariableArr2;
            this.values = (SolverVariable[]) Arrays.copyOf(solverVariableArr2, solverVariableArr2.length * 2);
        }
        SolverVariable[] solverVariableArr3 = this.toFloatRange;
        int i3 = this.hashCode;
        solverVariableArr3[i3] = solverVariable;
        int i4 = i3 + 1;
        this.hashCode = i4;
        if (i4 > 1 && solverVariableArr3[i4 - 1].getMin > solverVariable.getMin) {
            int i5 = 0;
            while (true) {
                i = this.hashCode;
                if (i5 >= i) {
                    break;
                }
                this.values[i5] = this.toFloatRange[i5];
                i5++;
            }
            Arrays.sort(this.values, 0, i, new Comparator<SolverVariable>() {
                public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
                    return ((SolverVariable) obj).getMin - ((SolverVariable) obj2).getMin;
                }
            });
            for (int i6 = 0; i6 < this.hashCode; i6++) {
                this.toFloatRange[i6] = this.values[i6];
            }
        }
        solverVariable.setMin = true;
        solverVariable.length(this);
    }

    /* access modifiers changed from: package-private */
    public final void setMax(SolverVariable solverVariable) {
        int i = 0;
        while (i < this.hashCode) {
            if (this.toFloatRange[i] == solverVariable) {
                while (true) {
                    int i2 = this.hashCode;
                    if (i < i2 - 1) {
                        SolverVariable[] solverVariableArr = this.toFloatRange;
                        int i3 = i + 1;
                        solverVariableArr[i] = solverVariableArr[i3];
                        i = i3;
                    } else {
                        this.hashCode = i2 - 1;
                        solverVariable.setMin = false;
                        return;
                    }
                }
            } else {
                i++;
            }
        }
    }

    public final void getMin(reportFullyDrawn reportfullydrawn, registerForActivityResult registerforactivityresult, boolean z) {
        SolverVariable solverVariable = registerforactivityresult.getMin;
        if (solverVariable != null) {
            registerForActivityResult.getMin getmin = registerforactivityresult.length;
            int min = getmin.getMin();
            for (int i = 0; i < min; i++) {
                SolverVariable max = getmin.getMax(i);
                float length = getmin.length(i);
                this.equals.getMin = max;
                if (this.equals.getMin(solverVariable, length)) {
                    setMin(max);
                }
                this.setMin += registerforactivityresult.setMin * length;
            }
            setMax(solverVariable);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("");
        sb.append(" goal -> (");
        sb.append(this.setMin);
        sb.append(") : ");
        String obj = sb.toString();
        for (int i = 0; i < this.hashCode; i++) {
            this.equals.getMin = this.toFloatRange[i];
            StringBuilder sb2 = new StringBuilder();
            sb2.append(obj);
            sb2.append(this.equals);
            sb2.append(" ");
            obj = sb2.toString();
        }
        return obj;
    }
}
