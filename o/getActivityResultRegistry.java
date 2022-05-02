package o;

import androidx.constraintlayout.solver.SolverVariable;
import java.util.Arrays;
import o.ComponentActivity;
import o.registerForActivityResult;

public final class getActivityResultRegistry implements registerForActivityResult.getMin {
    private static float hashCode = 0.001f;
    private float[] IsOverlapping = new float[8];
    private int equals = -1;
    private int getMax = 8;
    private final registerForActivityResult getMin;
    private int isInside = -1;
    protected final ComponentActivity.AnonymousClass3 length;
    int setMax = 0;
    private SolverVariable setMin = null;
    private int[] toFloatRange = new int[8];
    private int[] toIntRange = new int[8];
    private boolean values = false;

    getActivityResultRegistry(registerForActivityResult registerforactivityresult, ComponentActivity.AnonymousClass3 r5) {
        this.getMin = registerforactivityresult;
        this.length = r5;
    }

    public final void length(SolverVariable solverVariable, float f) {
        if (f == 0.0f) {
            setMin(solverVariable, true);
            return;
        }
        int i = this.isInside;
        if (i == -1) {
            this.isInside = 0;
            this.IsOverlapping[0] = f;
            this.toIntRange[0] = solverVariable.getMin;
            this.toFloatRange[this.isInside] = -1;
            solverVariable.hashCode++;
            solverVariable.length(this.getMin);
            this.setMax++;
            if (!this.values) {
                int i2 = this.equals + 1;
                this.equals = i2;
                int[] iArr = this.toIntRange;
                if (i2 >= iArr.length) {
                    this.values = true;
                    this.equals = iArr.length - 1;
                    return;
                }
                return;
            }
            return;
        }
        int i3 = 0;
        int i4 = -1;
        while (i != -1 && i3 < this.setMax) {
            if (this.toIntRange[i] == solverVariable.getMin) {
                this.IsOverlapping[i] = f;
                return;
            }
            if (this.toIntRange[i] < solverVariable.getMin) {
                i4 = i;
            }
            i = this.toFloatRange[i];
            i3++;
        }
        int i5 = this.equals;
        int i6 = i5 + 1;
        if (this.values) {
            int[] iArr2 = this.toIntRange;
            if (iArr2[i5] != -1) {
                i5 = iArr2.length;
            }
        } else {
            i5 = i6;
        }
        int[] iArr3 = this.toIntRange;
        if (i5 >= iArr3.length && this.setMax < iArr3.length) {
            int i7 = 0;
            while (true) {
                int[] iArr4 = this.toIntRange;
                if (i7 >= iArr4.length) {
                    break;
                } else if (iArr4[i7] == -1) {
                    i5 = i7;
                    break;
                } else {
                    i7++;
                }
            }
        }
        int[] iArr5 = this.toIntRange;
        if (i5 >= iArr5.length) {
            i5 = iArr5.length;
            int i8 = this.getMax * 2;
            this.getMax = i8;
            this.values = false;
            this.equals = i5 - 1;
            this.IsOverlapping = Arrays.copyOf(this.IsOverlapping, i8);
            this.toIntRange = Arrays.copyOf(this.toIntRange, this.getMax);
            this.toFloatRange = Arrays.copyOf(this.toFloatRange, this.getMax);
        }
        this.toIntRange[i5] = solverVariable.getMin;
        this.IsOverlapping[i5] = f;
        if (i4 != -1) {
            int[] iArr6 = this.toFloatRange;
            iArr6[i5] = iArr6[i4];
            iArr6[i4] = i5;
        } else {
            this.toFloatRange[i5] = this.isInside;
            this.isInside = i5;
        }
        solverVariable.hashCode++;
        solverVariable.length(this.getMin);
        this.setMax++;
        if (!this.values) {
            this.equals++;
        }
        if (this.setMax >= this.toIntRange.length) {
            this.values = true;
        }
        int i9 = this.equals;
        int[] iArr7 = this.toIntRange;
        if (i9 >= iArr7.length) {
            this.values = true;
            this.equals = iArr7.length - 1;
        }
    }

    public final void getMax(SolverVariable solverVariable, float f, boolean z) {
        float f2 = hashCode;
        if (f <= (-f2) || f >= f2) {
            int i = this.isInside;
            if (i == -1) {
                this.isInside = 0;
                this.IsOverlapping[0] = f;
                this.toIntRange[0] = solverVariable.getMin;
                this.toFloatRange[this.isInside] = -1;
                solverVariable.hashCode++;
                solverVariable.length(this.getMin);
                this.setMax++;
                if (!this.values) {
                    int i2 = this.equals + 1;
                    this.equals = i2;
                    int[] iArr = this.toIntRange;
                    if (i2 >= iArr.length) {
                        this.values = true;
                        this.equals = iArr.length - 1;
                        return;
                    }
                    return;
                }
                return;
            }
            int i3 = 0;
            int i4 = -1;
            while (i != -1 && i3 < this.setMax) {
                if (this.toIntRange[i] == solverVariable.getMin) {
                    float f3 = this.IsOverlapping[i] + f;
                    float f4 = hashCode;
                    if (f3 > (-f4) && f3 < f4) {
                        f3 = 0.0f;
                    }
                    this.IsOverlapping[i] = f3;
                    if (f3 == 0.0f) {
                        if (i == this.isInside) {
                            this.isInside = this.toFloatRange[i];
                        } else {
                            int[] iArr2 = this.toFloatRange;
                            iArr2[i4] = iArr2[i];
                        }
                        if (z) {
                            solverVariable.setMin(this.getMin);
                        }
                        if (this.values) {
                            this.equals = i;
                        }
                        solverVariable.hashCode--;
                        this.setMax--;
                        return;
                    }
                    return;
                }
                if (this.toIntRange[i] < solverVariable.getMin) {
                    i4 = i;
                }
                i = this.toFloatRange[i];
                i3++;
            }
            int i5 = this.equals;
            int i6 = i5 + 1;
            if (this.values) {
                int[] iArr3 = this.toIntRange;
                if (iArr3[i5] != -1) {
                    i5 = iArr3.length;
                }
            } else {
                i5 = i6;
            }
            int[] iArr4 = this.toIntRange;
            if (i5 >= iArr4.length && this.setMax < iArr4.length) {
                int i7 = 0;
                while (true) {
                    int[] iArr5 = this.toIntRange;
                    if (i7 >= iArr5.length) {
                        break;
                    } else if (iArr5[i7] == -1) {
                        i5 = i7;
                        break;
                    } else {
                        i7++;
                    }
                }
            }
            int[] iArr6 = this.toIntRange;
            if (i5 >= iArr6.length) {
                i5 = iArr6.length;
                int i8 = this.getMax * 2;
                this.getMax = i8;
                this.values = false;
                this.equals = i5 - 1;
                this.IsOverlapping = Arrays.copyOf(this.IsOverlapping, i8);
                this.toIntRange = Arrays.copyOf(this.toIntRange, this.getMax);
                this.toFloatRange = Arrays.copyOf(this.toFloatRange, this.getMax);
            }
            this.toIntRange[i5] = solverVariable.getMin;
            this.IsOverlapping[i5] = f;
            if (i4 != -1) {
                int[] iArr7 = this.toFloatRange;
                iArr7[i5] = iArr7[i4];
                iArr7[i4] = i5;
            } else {
                this.toFloatRange[i5] = this.isInside;
                this.isInside = i5;
            }
            solverVariable.hashCode++;
            solverVariable.length(this.getMin);
            this.setMax++;
            if (!this.values) {
                this.equals++;
            }
            int i9 = this.equals;
            int[] iArr8 = this.toIntRange;
            if (i9 >= iArr8.length) {
                this.values = true;
                this.equals = iArr8.length - 1;
            }
        }
    }

    public final float setMin(registerForActivityResult registerforactivityresult, boolean z) {
        float max = getMax(registerforactivityresult.getMin);
        setMin(registerforactivityresult.getMin, z);
        registerForActivityResult.getMin getmin = registerforactivityresult.length;
        int min = getmin.getMin();
        for (int i = 0; i < min; i++) {
            SolverVariable max2 = getmin.getMax(i);
            getMax(max2, getmin.getMax(max2) * max, z);
        }
        return max;
    }

    public final float setMin(SolverVariable solverVariable, boolean z) {
        if (this.setMin == solverVariable) {
            this.setMin = null;
        }
        int i = this.isInside;
        if (i == -1) {
            return 0.0f;
        }
        int i2 = 0;
        int i3 = -1;
        while (i != -1 && i2 < this.setMax) {
            if (this.toIntRange[i] == solverVariable.getMin) {
                if (i == this.isInside) {
                    this.isInside = this.toFloatRange[i];
                } else {
                    int[] iArr = this.toFloatRange;
                    iArr[i3] = iArr[i];
                }
                if (z) {
                    solverVariable.setMin(this.getMin);
                }
                solverVariable.hashCode--;
                this.setMax--;
                this.toIntRange[i] = -1;
                if (this.values) {
                    this.equals = i;
                }
                return this.IsOverlapping[i];
            }
            i2++;
            i3 = i;
            i = this.toFloatRange[i];
        }
        return 0.0f;
    }

    public final void setMax() {
        int i = this.isInside;
        int i2 = 0;
        while (i != -1 && i2 < this.setMax) {
            SolverVariable solverVariable = this.length.getMax[this.toIntRange[i]];
            if (solverVariable != null) {
                solverVariable.setMin(this.getMin);
            }
            i = this.toFloatRange[i];
            i2++;
        }
        this.isInside = -1;
        this.equals = -1;
        this.values = false;
        this.setMax = 0;
    }

    public final boolean setMax(SolverVariable solverVariable) {
        int i = this.isInside;
        if (i == -1) {
            return false;
        }
        int i2 = 0;
        while (i != -1 && i2 < this.setMax) {
            if (this.toIntRange[i] == solverVariable.getMin) {
                return true;
            }
            i = this.toFloatRange[i];
            i2++;
        }
        return false;
    }

    public final void setMin() {
        int i = this.isInside;
        int i2 = 0;
        while (i != -1 && i2 < this.setMax) {
            float[] fArr = this.IsOverlapping;
            fArr[i] = fArr[i] * -1.0f;
            i = this.toFloatRange[i];
            i2++;
        }
    }

    public final void getMax(float f) {
        int i = this.isInside;
        int i2 = 0;
        while (i != -1 && i2 < this.setMax) {
            float[] fArr = this.IsOverlapping;
            fArr[i] = fArr[i] / f;
            i = this.toFloatRange[i];
            i2++;
        }
    }

    public final int getMin() {
        return this.setMax;
    }

    public final SolverVariable getMax(int i) {
        int i2 = this.isInside;
        int i3 = 0;
        while (i2 != -1 && i3 < this.setMax) {
            if (i3 == i) {
                return this.length.getMax[this.toIntRange[i2]];
            }
            i2 = this.toFloatRange[i2];
            i3++;
        }
        return null;
    }

    public final float length(int i) {
        int i2 = this.isInside;
        int i3 = 0;
        while (i2 != -1 && i3 < this.setMax) {
            if (i3 == i) {
                return this.IsOverlapping[i2];
            }
            i2 = this.toFloatRange[i2];
            i3++;
        }
        return 0.0f;
    }

    public final float getMax(SolverVariable solverVariable) {
        int i = this.isInside;
        int i2 = 0;
        while (i != -1 && i2 < this.setMax) {
            if (this.toIntRange[i] == solverVariable.getMin) {
                return this.IsOverlapping[i];
            }
            i = this.toFloatRange[i];
            i2++;
        }
        return 0.0f;
    }

    public final String toString() {
        int i = this.isInside;
        String str = "";
        int i2 = 0;
        while (i != -1 && i2 < this.setMax) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" -> ");
            String obj = sb.toString();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(obj);
            sb2.append(this.IsOverlapping[i]);
            sb2.append(" : ");
            String obj2 = sb2.toString();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(obj2);
            sb3.append(this.length.getMax[this.toIntRange[i]]);
            str = sb3.toString();
            i = this.toFloatRange[i];
            i2++;
        }
        return str;
    }
}
