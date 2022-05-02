package o;

import androidx.constraintlayout.solver.SolverVariable;
import java.util.Arrays;
import o.ComponentActivity;
import o.registerForActivityResult;

public final class ActivityResult implements registerForActivityResult.getMin {
    private static float equals = 0.001f;
    private final int FastBitmap$CoordinateSystem = -1;
    int IsOverlapping = 0;
    int[] getMax = new int[16];
    int[] getMin = new int[16];
    int[] isInside = new int[16];
    int[] length = new int[16];
    float[] setMax = new float[16];
    int[] setMin = new int[16];
    private int toDoubleRange = 16;
    int toFloatRange = -1;
    protected final ComponentActivity.AnonymousClass3 toIntRange;
    private int toString = 16;
    private final registerForActivityResult values;

    ActivityResult(registerForActivityResult registerforactivityresult, ComponentActivity.AnonymousClass3 r5) {
        this.values = registerforactivityresult;
        this.toIntRange = r5;
        setMax();
    }

    public final int getMin() {
        return this.IsOverlapping;
    }

    public final SolverVariable getMax(int i) {
        int i2 = this.IsOverlapping;
        if (i2 == 0) {
            return null;
        }
        int i3 = this.toFloatRange;
        int i4 = 0;
        while (i4 < i2) {
            if (i4 != i || i3 == -1) {
                i3 = this.isInside[i3];
                if (i3 == -1) {
                    break;
                }
                i4++;
            } else {
                return this.toIntRange.getMax[this.length[i3]];
            }
        }
        return null;
    }

    public final float length(int i) {
        int i2 = this.IsOverlapping;
        int i3 = this.toFloatRange;
        for (int i4 = 0; i4 < i2; i4++) {
            if (i4 == i) {
                return this.setMax[i3];
            }
            i3 = this.isInside[i3];
            if (i3 == -1) {
                return 0.0f;
            }
        }
        return 0.0f;
    }

    public final boolean setMax(SolverVariable solverVariable) {
        return setMin(solverVariable) != -1;
    }

    private int setMin(SolverVariable solverVariable) {
        if (!(this.IsOverlapping == 0 || solverVariable == null)) {
            int i = solverVariable.getMin;
            int i2 = this.getMin[i % this.toString];
            if (i2 == -1) {
                return -1;
            }
            if (this.length[i2] == i) {
                return i2;
            }
            while (true) {
                int[] iArr = this.setMin;
                if (iArr[i2] == -1 || this.length[iArr[i2]] == i) {
                    int[] iArr2 = this.setMin;
                } else {
                    i2 = iArr[i2];
                }
            }
            int[] iArr22 = this.setMin;
            if (iArr22[i2] != -1 && this.length[iArr22[i2]] == i) {
                return iArr22[i2];
            }
        }
        return -1;
    }

    public final float getMax(SolverVariable solverVariable) {
        int min = setMin(solverVariable);
        if (min != -1) {
            return this.setMax[min];
        }
        return 0.0f;
    }

    public final String toString() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder();
        sb.append(hashCode());
        sb.append(" { ");
        String obj = sb.toString();
        int i = this.IsOverlapping;
        for (int i2 = 0; i2 < i; i2++) {
            SolverVariable max = getMax(i2);
            if (max != null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(obj);
                sb2.append(max);
                sb2.append(" = ");
                sb2.append(length(i2));
                sb2.append(" ");
                String obj2 = sb2.toString();
                int min = setMin(max);
                StringBuilder sb3 = new StringBuilder();
                sb3.append(obj2);
                sb3.append("[p: ");
                String obj3 = sb3.toString();
                if (this.getMax[min] != -1) {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(obj3);
                    sb4.append(this.toIntRange.getMax[this.length[this.getMax[min]]]);
                    str = sb4.toString();
                } else {
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append(obj3);
                    sb5.append("none");
                    str = sb5.toString();
                }
                StringBuilder sb6 = new StringBuilder();
                sb6.append(str);
                sb6.append(", n: ");
                String obj4 = sb6.toString();
                if (this.isInside[min] != -1) {
                    StringBuilder sb7 = new StringBuilder();
                    sb7.append(obj4);
                    sb7.append(this.toIntRange.getMax[this.length[this.isInside[min]]]);
                    str2 = sb7.toString();
                } else {
                    StringBuilder sb8 = new StringBuilder();
                    sb8.append(obj4);
                    sb8.append("none");
                    str2 = sb8.toString();
                }
                StringBuilder sb9 = new StringBuilder();
                sb9.append(str2);
                sb9.append("]");
                obj = sb9.toString();
            }
        }
        StringBuilder sb10 = new StringBuilder();
        sb10.append(obj);
        sb10.append(" }");
        return sb10.toString();
    }

    public final void setMax() {
        int i = this.IsOverlapping;
        for (int i2 = 0; i2 < i; i2++) {
            SolverVariable max = getMax(i2);
            if (max != null) {
                max.setMin(this.values);
            }
        }
        for (int i3 = 0; i3 < this.toDoubleRange; i3++) {
            this.length[i3] = -1;
            this.setMin[i3] = -1;
        }
        for (int i4 = 0; i4 < this.toString; i4++) {
            this.getMin[i4] = -1;
        }
        this.IsOverlapping = 0;
        this.toFloatRange = -1;
    }

    private void setMax(SolverVariable solverVariable, int i) {
        int[] iArr;
        int i2 = solverVariable.getMin % this.toString;
        int[] iArr2 = this.getMin;
        int i3 = iArr2[i2];
        if (i3 == -1) {
            iArr2[i2] = i;
        } else {
            while (true) {
                iArr = this.setMin;
                if (iArr[i3] == -1) {
                    break;
                }
                i3 = iArr[i3];
            }
            iArr[i3] = i;
        }
        this.setMin[i] = -1;
    }

    private void length(SolverVariable solverVariable) {
        int i = solverVariable.getMin % this.toString;
        int i2 = this.getMin[i];
        if (i2 != -1) {
            int i3 = solverVariable.getMin;
            if (this.length[i2] == i3) {
                int[] iArr = this.getMin;
                int[] iArr2 = this.setMin;
                iArr[i] = iArr2[i2];
                iArr2[i2] = -1;
                return;
            }
            while (true) {
                int[] iArr3 = this.setMin;
                if (iArr3[i2] == -1 || this.length[iArr3[i2]] == i3) {
                    int[] iArr4 = this.setMin;
                    int i4 = iArr4[i2];
                } else {
                    i2 = iArr3[i2];
                }
            }
            int[] iArr42 = this.setMin;
            int i42 = iArr42[i2];
            if (i42 != -1 && this.length[i42] == i3) {
                iArr42[i2] = iArr42[i42];
                iArr42[i42] = -1;
            }
        }
    }

    private void setMin(int i, SolverVariable solverVariable, float f) {
        this.length[i] = solverVariable.getMin;
        this.setMax[i] = f;
        this.getMax[i] = -1;
        this.isInside[i] = -1;
        solverVariable.length(this.values);
        solverVariable.hashCode++;
        this.IsOverlapping++;
    }

    public final void length(SolverVariable solverVariable, float f) {
        float f2 = equals;
        if (f <= (-f2) || f >= f2) {
            int i = 0;
            if (this.IsOverlapping == 0) {
                setMin(0, solverVariable, f);
                setMax(solverVariable, 0);
                this.toFloatRange = 0;
                return;
            }
            int min = setMin(solverVariable);
            if (min != -1) {
                this.setMax[min] = f;
                return;
            }
            int i2 = this.IsOverlapping + 1;
            int i3 = this.toDoubleRange;
            if (i2 >= i3) {
                int i4 = i3 * 2;
                this.length = Arrays.copyOf(this.length, i4);
                this.setMax = Arrays.copyOf(this.setMax, i4);
                this.getMax = Arrays.copyOf(this.getMax, i4);
                this.isInside = Arrays.copyOf(this.isInside, i4);
                this.setMin = Arrays.copyOf(this.setMin, i4);
                for (int i5 = this.toDoubleRange; i5 < i4; i5++) {
                    this.length[i5] = -1;
                    this.setMin[i5] = -1;
                }
                this.toDoubleRange = i4;
            }
            int i6 = this.IsOverlapping;
            int i7 = this.toFloatRange;
            int i8 = 0;
            int i9 = -1;
            while (i8 < i6) {
                if (this.length[i7] != solverVariable.getMin) {
                    if (this.length[i7] < solverVariable.getMin) {
                        i9 = i7;
                    }
                    i7 = this.isInside[i7];
                    if (i7 == -1) {
                        break;
                    }
                    i8++;
                } else {
                    this.setMax[i7] = f;
                    return;
                }
            }
            while (true) {
                if (i >= this.toDoubleRange) {
                    i = -1;
                    break;
                } else if (this.length[i] == -1) {
                    break;
                } else {
                    i++;
                }
            }
            setMin(i, solverVariable, f);
            if (i9 != -1) {
                this.getMax[i] = i9;
                int[] iArr = this.isInside;
                iArr[i] = iArr[i9];
                iArr[i9] = i;
            } else {
                this.getMax[i] = -1;
                if (this.IsOverlapping > 0) {
                    this.isInside[i] = this.toFloatRange;
                    this.toFloatRange = i;
                } else {
                    this.isInside[i] = -1;
                }
            }
            int[] iArr2 = this.isInside;
            if (iArr2[i] != -1) {
                this.getMax[iArr2[i]] = i;
            }
            setMax(solverVariable, i);
            return;
        }
        setMin(solverVariable, true);
    }

    public final float setMin(SolverVariable solverVariable, boolean z) {
        int min = setMin(solverVariable);
        if (min == -1) {
            return 0.0f;
        }
        length(solverVariable);
        float f = this.setMax[min];
        if (this.toFloatRange == min) {
            this.toFloatRange = this.isInside[min];
        }
        this.length[min] = -1;
        int[] iArr = this.getMax;
        if (iArr[min] != -1) {
            int[] iArr2 = this.isInside;
            iArr2[iArr[min]] = iArr2[min];
        }
        int[] iArr3 = this.isInside;
        if (iArr3[min] != -1) {
            int[] iArr4 = this.getMax;
            iArr4[iArr3[min]] = iArr4[min];
        }
        this.IsOverlapping--;
        solverVariable.hashCode--;
        if (z) {
            solverVariable.setMin(this.values);
        }
        return f;
    }

    public final void getMax(SolverVariable solverVariable, float f, boolean z) {
        float f2 = equals;
        if (f <= (-f2) || f >= f2) {
            int min = setMin(solverVariable);
            if (min == -1) {
                length(solverVariable, f);
                return;
            }
            float[] fArr = this.setMax;
            fArr[min] = fArr[min] + f;
            float f3 = fArr[min];
            float f4 = equals;
            if (f3 > (-f4) && fArr[min] < f4) {
                fArr[min] = 0.0f;
                setMin(solverVariable, z);
            }
        }
    }

    public final float setMin(registerForActivityResult registerforactivityresult, boolean z) {
        int min = setMin(registerforactivityresult.getMin);
        float f = min != -1 ? this.setMax[min] : 0.0f;
        setMin(registerforactivityresult.getMin, z);
        ActivityResult activityResult = (ActivityResult) registerforactivityresult.length;
        int i = activityResult.IsOverlapping;
        int i2 = 0;
        int i3 = 0;
        while (i2 < i) {
            if (activityResult.length[i3] != -1) {
                getMax(this.toIntRange.getMax[activityResult.length[i3]], activityResult.setMax[i3] * f, z);
                i2++;
            }
            i3++;
        }
        return f;
    }

    public final void setMin() {
        int i = this.IsOverlapping;
        int i2 = this.toFloatRange;
        int i3 = 0;
        while (i3 < i) {
            float[] fArr = this.setMax;
            fArr[i2] = fArr[i2] * -1.0f;
            i2 = this.isInside[i2];
            if (i2 != -1) {
                i3++;
            } else {
                return;
            }
        }
    }

    public final void getMax(float f) {
        int i = this.IsOverlapping;
        int i2 = this.toFloatRange;
        int i3 = 0;
        while (i3 < i) {
            float[] fArr = this.setMax;
            fArr[i2] = fArr[i2] / f;
            i2 = this.isInside[i2];
            if (i2 != -1) {
                i3++;
            } else {
                return;
            }
        }
    }
}
