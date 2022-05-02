package o;

import androidx.constraintlayout.solver.SolverVariable;
import androidx.constraintlayout.solver.widgets.ConstraintAnchor;
import java.util.Arrays;
import java.util.HashMap;
import o.ComponentActivity;

public final class reportFullyDrawn {
    public static long Mean$Arithmetic = 0;
    public static boolean getMax = true;
    public static boolean getMin = true;
    private static int invoke = 1000;
    public static long invokeSuspend = 0;
    public static boolean isInside = false;
    public static boolean length = true;
    public static boolean setMax = false;
    public static boolean setMin = true;
    public static ComponentActivity.AnonymousClass5 values;
    int FastBitmap$CoordinateSystem;
    private length Grayscale$Algorithm;
    private int ICustomTabsCallback;
    registerForActivityResult[] IsOverlapping;
    private int b;
    private int create;
    int equals;
    private boolean[] getCause;
    int hashCode;
    private int onMessageChannelReady;
    private SolverVariable[] onNavigationEvent;
    private length onRelationshipValidationResult;
    public boolean toDoubleRange;
    public boolean toFloatRange;
    public boolean toIntRange;
    public final ComponentActivity.AnonymousClass3 toString;
    private HashMap<String, SolverVariable> valueOf;

    interface length {
        void getMin(SolverVariable solverVariable);

        SolverVariable length();

        void length(length length);

        boolean setMax();

        SolverVariable setMin(boolean[] zArr);

        void setMin();
    }

    class setMax extends registerForActivityResult {
        public setMax(ComponentActivity.AnonymousClass3 r2) {
            this.length = new ActivityResult(this, r2);
        }
    }

    public reportFullyDrawn() {
        this.toIntRange = false;
        this.equals = 0;
        this.valueOf = null;
        this.create = 32;
        this.b = 32;
        this.IsOverlapping = null;
        this.toFloatRange = false;
        this.toDoubleRange = false;
        this.getCause = new boolean[32];
        this.FastBitmap$CoordinateSystem = 1;
        this.hashCode = 0;
        this.ICustomTabsCallback = 32;
        this.onNavigationEvent = new SolverVariable[invoke];
        this.onMessageChannelReady = 0;
        this.IsOverlapping = new registerForActivityResult[32];
        equals();
        ComponentActivity.AnonymousClass3 r0 = new Object() {
            SolverVariable[] getMax = new SolverVariable[32];
            AnonymousClass4.setMin<registerForActivityResult> getMin = new AnonymousClass4.getMax();
            AnonymousClass4.setMin<SolverVariable> length = new AnonymousClass4.getMax();
            AnonymousClass4.setMin<registerForActivityResult> setMin = new AnonymousClass4.getMax();
        };
        this.toString = r0;
        this.Grayscale$Algorithm = new ImmLeaksCleaner(r0);
        if (isInside) {
            this.onRelationshipValidationResult = new setMax(this.toString);
        } else {
            this.onRelationshipValidationResult = new registerForActivityResult(this.toString);
        }
    }

    public static void getMax(ComponentActivity.AnonymousClass5 r0) {
        values = r0;
    }

    public static ComponentActivity.AnonymousClass5 getMin() {
        return values;
    }

    private void toFloatRange() {
        int i = this.create * 2;
        this.create = i;
        this.IsOverlapping = (registerForActivityResult[]) Arrays.copyOf(this.IsOverlapping, i);
        ComponentActivity.AnonymousClass3 r0 = this.toString;
        r0.getMax = (SolverVariable[]) Arrays.copyOf(r0.getMax, this.create);
        int i2 = this.create;
        this.getCause = new boolean[i2];
        this.b = i2;
        this.ICustomTabsCallback = i2;
        ComponentActivity.AnonymousClass5 r02 = values;
        if (r02 != null) {
            r02.getMin++;
            ComponentActivity.AnonymousClass5 r03 = values;
            r03.toString = Math.max(r03.toString, (long) this.create);
            ComponentActivity.AnonymousClass5 r04 = values;
            r04.onNavigationEvent = r04.toString;
        }
    }

    private void equals() {
        int i = 0;
        if (isInside) {
            while (i < this.hashCode) {
                registerForActivityResult registerforactivityresult = this.IsOverlapping[i];
                if (registerforactivityresult != null) {
                    this.toString.getMin.getMin(registerforactivityresult);
                }
                this.IsOverlapping[i] = null;
                i++;
            }
            return;
        }
        while (i < this.hashCode) {
            registerForActivityResult registerforactivityresult2 = this.IsOverlapping[i];
            if (registerforactivityresult2 != null) {
                this.toString.setMin.getMin(registerforactivityresult2);
            }
            this.IsOverlapping[i] = null;
            i++;
        }
    }

    public final void getMax() {
        for (SolverVariable solverVariable : this.toString.getMax) {
            if (solverVariable != null) {
                solverVariable.setMax();
            }
        }
        this.toString.length.getMin(this.onNavigationEvent, this.onMessageChannelReady);
        this.onMessageChannelReady = 0;
        Arrays.fill(this.toString.getMax, (Object) null);
        HashMap<String, SolverVariable> hashMap = this.valueOf;
        if (hashMap != null) {
            hashMap.clear();
        }
        this.equals = 0;
        this.Grayscale$Algorithm.setMin();
        this.FastBitmap$CoordinateSystem = 1;
        for (int i = 0; i < this.hashCode; i++) {
            registerForActivityResult[] registerforactivityresultArr = this.IsOverlapping;
            if (registerforactivityresultArr[i] != null) {
                registerforactivityresultArr[i].getMax = false;
            }
        }
        equals();
        this.hashCode = 0;
        if (isInside) {
            this.onRelationshipValidationResult = new setMax(this.toString);
        } else {
            this.onRelationshipValidationResult = new registerForActivityResult(this.toString);
        }
    }

    public final SolverVariable getMin(Object obj) {
        SolverVariable solverVariable = null;
        if (obj == null) {
            return null;
        }
        if (this.FastBitmap$CoordinateSystem + 1 >= this.b) {
            toFloatRange();
        }
        if (obj instanceof ConstraintAnchor) {
            ConstraintAnchor constraintAnchor = (ConstraintAnchor) obj;
            solverVariable = constraintAnchor.IsOverlapping;
            if (solverVariable == null) {
                if (constraintAnchor.IsOverlapping == null) {
                    constraintAnchor.IsOverlapping = new SolverVariable(SolverVariable.Type.UNRESTRICTED);
                } else {
                    constraintAnchor.IsOverlapping.setMax();
                }
                solverVariable = constraintAnchor.IsOverlapping;
            }
            if (solverVariable.getMin == -1 || solverVariable.getMin > this.equals || this.toString.getMax[solverVariable.getMin] == null) {
                if (solverVariable.getMin != -1) {
                    solverVariable.setMax();
                }
                int i = this.equals + 1;
                this.equals = i;
                this.FastBitmap$CoordinateSystem++;
                solverVariable.getMin = i;
                solverVariable.toFloatRange = SolverVariable.Type.UNRESTRICTED;
                this.toString.getMax[this.equals] = solverVariable;
            }
        }
        return solverVariable;
    }

    public final registerForActivityResult length() {
        registerForActivityResult registerforactivityresult;
        if (isInside) {
            registerforactivityresult = this.toString.getMin.length();
            if (registerforactivityresult == null) {
                registerforactivityresult = new setMax(this.toString);
                invokeSuspend++;
            } else {
                registerforactivityresult.getMin = null;
                registerforactivityresult.length.setMax();
                registerforactivityresult.setMin = 0.0f;
                registerforactivityresult.isInside = false;
            }
        } else {
            registerforactivityresult = this.toString.setMin.length();
            if (registerforactivityresult == null) {
                registerforactivityresult = new registerForActivityResult(this.toString);
                Mean$Arithmetic++;
            } else {
                registerforactivityresult.getMin = null;
                registerforactivityresult.length.setMax();
                registerforactivityresult.setMin = 0.0f;
                registerforactivityresult.isInside = false;
            }
        }
        SolverVariable.setMin();
        return registerforactivityresult;
    }

    public final SolverVariable setMax() {
        ComponentActivity.AnonymousClass5 r0 = values;
        if (r0 != null) {
            r0.toDoubleRange++;
        }
        if (this.FastBitmap$CoordinateSystem + 1 >= this.b) {
            toFloatRange();
        }
        SolverVariable min = setMin(SolverVariable.Type.SLACK);
        int i = this.equals + 1;
        this.equals = i;
        this.FastBitmap$CoordinateSystem++;
        min.getMin = i;
        this.toString.getMax[this.equals] = min;
        return min;
    }

    public final SolverVariable setMax(int i) {
        ComponentActivity.AnonymousClass5 r0 = values;
        if (r0 != null) {
            r0.hashCode++;
        }
        if (this.FastBitmap$CoordinateSystem + 1 >= this.b) {
            toFloatRange();
        }
        SolverVariable min = setMin(SolverVariable.Type.ERROR);
        int i2 = this.equals + 1;
        this.equals = i2;
        this.FastBitmap$CoordinateSystem++;
        min.getMin = i2;
        min.setMax = i;
        this.toString.getMax[this.equals] = min;
        this.Grayscale$Algorithm.getMin(min);
        return min;
    }

    private SolverVariable setMin(SolverVariable.Type type) {
        SolverVariable length2 = this.toString.length.length();
        if (length2 == null) {
            length2 = new SolverVariable(type);
            length2.toFloatRange = type;
        } else {
            length2.setMax();
            length2.toFloatRange = type;
        }
        int i = this.onMessageChannelReady;
        int i2 = invoke;
        if (i >= i2) {
            int i3 = i2 * 2;
            invoke = i3;
            this.onNavigationEvent = (SolverVariable[]) Arrays.copyOf(this.onNavigationEvent, i3);
        }
        SolverVariable[] solverVariableArr = this.onNavigationEvent;
        int i4 = this.onMessageChannelReady;
        this.onMessageChannelReady = i4 + 1;
        solverVariableArr[i4] = length2;
        return length2;
    }

    public static int getMax(Object obj) {
        SolverVariable solverVariable = ((ConstraintAnchor) obj).IsOverlapping;
        if (solverVariable != null) {
            return (int) (solverVariable.getMax + 0.5f);
        }
        return 0;
    }

    public final void setMin() throws Exception {
        float f;
        boolean z;
        long j;
        boolean z2;
        ComponentActivity.AnonymousClass5 r1 = values;
        long j2 = 1;
        if (r1 != null) {
            r1.setMin++;
        }
        if (this.Grayscale$Algorithm.setMax()) {
            IsOverlapping();
            return;
        }
        int i = 1;
        if (this.toFloatRange || this.toDoubleRange) {
            ComponentActivity.AnonymousClass5 r12 = values;
            if (r12 != null) {
                r12.valueOf++;
            }
            int i2 = 0;
            while (true) {
                if (i2 >= this.hashCode) {
                    z2 = true;
                    break;
                } else if (!this.IsOverlapping[i2].isInside) {
                    z2 = false;
                    break;
                } else {
                    i2++;
                }
            }
            if (z2) {
                ComponentActivity.AnonymousClass5 r13 = values;
                if (r13 != null) {
                    r13.invokeSuspend++;
                }
                IsOverlapping();
                return;
            }
        }
        length length2 = this.Grayscale$Algorithm;
        ComponentActivity.AnonymousClass5 r6 = values;
        if (r6 != null) {
            r6.invoke++;
            ComponentActivity.AnonymousClass5 r62 = values;
            r62.getCause = Math.max(r62.getCause, (long) this.FastBitmap$CoordinateSystem);
            ComponentActivity.AnonymousClass5 r63 = values;
            r63.b = Math.max(r63.b, (long) this.hashCode);
        }
        int i3 = 0;
        while (true) {
            f = 0.0f;
            if (i3 < this.hashCode) {
                if (this.IsOverlapping[i3].getMin.toFloatRange != SolverVariable.Type.UNRESTRICTED && this.IsOverlapping[i3].setMin < 0.0f) {
                    z = true;
                    break;
                }
                i3++;
            } else {
                z = false;
                break;
            }
        }
        if (z) {
            boolean z3 = false;
            int i4 = 0;
            while (!z3) {
                ComponentActivity.AnonymousClass5 r9 = values;
                if (r9 != null) {
                    r9.values += j2;
                }
                i4 += i;
                float f2 = Float.MAX_VALUE;
                int i5 = 0;
                int i6 = -1;
                int i7 = -1;
                int i8 = 0;
                while (i5 < this.hashCode) {
                    registerForActivityResult registerforactivityresult = this.IsOverlapping[i5];
                    if (registerforactivityresult.getMin.toFloatRange != SolverVariable.Type.UNRESTRICTED && !registerforactivityresult.isInside && registerforactivityresult.setMin < f) {
                        int i9 = 9;
                        if (getMax) {
                            int min = registerforactivityresult.length.getMin();
                            int i10 = 0;
                            while (i10 < min) {
                                SolverVariable max = registerforactivityresult.length.getMax(i10);
                                float max2 = registerforactivityresult.length.getMax(max);
                                if (max2 > f) {
                                    int i11 = 0;
                                    while (i11 < i9) {
                                        float f3 = max.toIntRange[i11] / max2;
                                        if ((f3 < f2 && i11 == i8) || i11 > i8) {
                                            i7 = max.getMin;
                                            f2 = f3;
                                            i8 = i11;
                                            i6 = i5;
                                        }
                                        i11++;
                                        i9 = 9;
                                    }
                                }
                                i10++;
                                i9 = 9;
                                f = 0.0f;
                            }
                        } else {
                            for (int i12 = 1; i12 < this.FastBitmap$CoordinateSystem; i12++) {
                                SolverVariable solverVariable = this.toString.getMax[i12];
                                float max3 = registerforactivityresult.length.getMax(solverVariable);
                                if (max3 > 0.0f) {
                                    for (int i13 = 0; i13 < 9; i13++) {
                                        float f4 = solverVariable.toIntRange[i13] / max3;
                                        if ((f4 < f2 && i13 == i8) || i13 > i8) {
                                            i7 = i12;
                                            f2 = f4;
                                            i8 = i13;
                                            i6 = i5;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    i5++;
                    f = 0.0f;
                }
                if (i6 != -1) {
                    registerForActivityResult registerforactivityresult2 = this.IsOverlapping[i6];
                    registerforactivityresult2.getMin.length = -1;
                    ComponentActivity.AnonymousClass5 r2 = values;
                    if (r2 != null) {
                        j = 1;
                        r2.IsOverlapping++;
                    } else {
                        j = 1;
                    }
                    registerforactivityresult2.length(this.toString.getMax[i7]);
                    registerforactivityresult2.getMin.length = i6;
                    registerforactivityresult2.getMin.length(this, registerforactivityresult2);
                } else {
                    j = 1;
                    z3 = true;
                }
                if (i4 > this.FastBitmap$CoordinateSystem / 2) {
                    z3 = true;
                }
                j2 = j;
                i = 1;
                f = 0.0f;
            }
        }
        getMax(length2);
        IsOverlapping();
    }

    /* JADX WARNING: Removed duplicated region for block: B:93:0x0188 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0189  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void getMin(o.registerForActivityResult r14) {
        /*
            r13 = this;
            if (r14 != 0) goto L_0x0003
            return
        L_0x0003:
            o.ComponentActivity$5 r0 = values
            r1 = 1
            if (r0 == 0) goto L_0x0019
            long r3 = r0.equals
            long r3 = r3 + r1
            r0.equals = r3
            boolean r0 = r14.isInside
            if (r0 == 0) goto L_0x0019
            o.ComponentActivity$5 r0 = values
            long r3 = r0.toFloatRange
            long r3 = r3 + r1
            r0.toFloatRange = r3
        L_0x0019:
            int r0 = r13.hashCode
            r3 = 1
            int r0 = r0 + r3
            int r4 = r13.ICustomTabsCallback
            if (r0 >= r4) goto L_0x0028
            int r0 = r13.FastBitmap$CoordinateSystem
            int r0 = r0 + r3
            int r4 = r13.b
            if (r0 < r4) goto L_0x002b
        L_0x0028:
            r13.toFloatRange()
        L_0x002b:
            boolean r0 = r14.isInside
            r4 = 0
            if (r0 != 0) goto L_0x018a
            o.registerForActivityResult[] r0 = r13.IsOverlapping
            int r0 = r0.length
            r5 = -1
            if (r0 == 0) goto L_0x00e0
            r0 = 0
        L_0x0037:
            if (r0 != 0) goto L_0x00cc
            o.registerForActivityResult$getMin r6 = r14.length
            int r6 = r6.getMin()
            r7 = 0
        L_0x0040:
            if (r7 >= r6) goto L_0x005c
            o.registerForActivityResult$getMin r8 = r14.length
            androidx.constraintlayout.solver.SolverVariable r8 = r8.getMax((int) r7)
            int r9 = r8.length
            if (r9 != r5) goto L_0x0054
            boolean r9 = r8.isInside
            if (r9 != 0) goto L_0x0054
            boolean r9 = r8.toString
            if (r9 == 0) goto L_0x0059
        L_0x0054:
            java.util.ArrayList<androidx.constraintlayout.solver.SolverVariable> r9 = r14.setMax
            r9.add(r8)
        L_0x0059:
            int r7 = r7 + 1
            goto L_0x0040
        L_0x005c:
            java.util.ArrayList<androidx.constraintlayout.solver.SolverVariable> r6 = r14.setMax
            int r6 = r6.size()
            if (r6 <= 0) goto L_0x00c9
            r7 = 0
        L_0x0065:
            if (r7 >= r6) goto L_0x00c2
            java.util.ArrayList<androidx.constraintlayout.solver.SolverVariable> r8 = r14.setMax
            java.lang.Object r8 = r8.get(r7)
            androidx.constraintlayout.solver.SolverVariable r8 = (androidx.constraintlayout.solver.SolverVariable) r8
            boolean r9 = r8.isInside
            if (r9 == 0) goto L_0x0077
            r14.setMax(r13, r8, r3)
            goto L_0x00bf
        L_0x0077:
            boolean r9 = r8.toString
            if (r9 == 0) goto L_0x00b6
            boolean r9 = r8.toString
            if (r9 == 0) goto L_0x00bf
            o.registerForActivityResult$getMin r9 = r14.length
            float r9 = r9.getMax((androidx.constraintlayout.solver.SolverVariable) r8)
            float r10 = r14.setMin
            float r11 = r8.toDoubleRange
            float r11 = r11 * r9
            float r10 = r10 + r11
            r14.setMin = r10
            o.registerForActivityResult$getMin r10 = r14.length
            r10.setMin((androidx.constraintlayout.solver.SolverVariable) r8, (boolean) r3)
            r8.setMin(r14)
            o.registerForActivityResult$getMin r10 = r14.length
            o.ComponentActivity$3 r11 = r13.toString
            androidx.constraintlayout.solver.SolverVariable[] r11 = r11.getMax
            int r12 = r8.values
            r11 = r11[r12]
            r10.getMax(r11, r9, r3)
            boolean r9 = length
            if (r9 == 0) goto L_0x00bf
            if (r8 == 0) goto L_0x00bf
            o.registerForActivityResult$getMin r8 = r14.length
            int r8 = r8.getMin()
            if (r8 != 0) goto L_0x00bf
            r14.isInside = r3
            r13.toIntRange = r3
            goto L_0x00bf
        L_0x00b6:
            o.registerForActivityResult[] r9 = r13.IsOverlapping
            int r8 = r8.length
            r8 = r9[r8]
            r14.getMin(r13, r8, r3)
        L_0x00bf:
            int r7 = r7 + 1
            goto L_0x0065
        L_0x00c2:
            java.util.ArrayList<androidx.constraintlayout.solver.SolverVariable> r6 = r14.setMax
            r6.clear()
            goto L_0x0037
        L_0x00c9:
            r0 = 1
            goto L_0x0037
        L_0x00cc:
            boolean r0 = length
            if (r0 == 0) goto L_0x00e0
            androidx.constraintlayout.solver.SolverVariable r0 = r14.getMin
            if (r0 == 0) goto L_0x00e0
            o.registerForActivityResult$getMin r0 = r14.length
            int r0 = r0.getMin()
            if (r0 != 0) goto L_0x00e0
            r14.isInside = r3
            r13.toIntRange = r3
        L_0x00e0:
            boolean r0 = r14.setMax()
            if (r0 == 0) goto L_0x00e7
            return
        L_0x00e7:
            float r0 = r14.setMin
            r6 = 0
            int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r0 >= 0) goto L_0x00fb
            float r0 = r14.setMin
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r0 = r0 * r6
            r14.setMin = r0
            o.registerForActivityResult$getMin r0 = r14.length
            r0.setMin()
        L_0x00fb:
            boolean r0 = r14.getMin()
            if (r0 == 0) goto L_0x0181
            o.ComponentActivity$5 r0 = values
            if (r0 == 0) goto L_0x010a
            long r6 = r0.FastBitmap$CoordinateSystem
            long r6 = r6 + r1
            r0.FastBitmap$CoordinateSystem = r6
        L_0x010a:
            int r0 = r13.FastBitmap$CoordinateSystem
            int r0 = r0 + r3
            int r6 = r13.b
            if (r0 < r6) goto L_0x0114
            r13.toFloatRange()
        L_0x0114:
            androidx.constraintlayout.solver.SolverVariable$Type r0 = androidx.constraintlayout.solver.SolverVariable.Type.SLACK
            androidx.constraintlayout.solver.SolverVariable r0 = r13.setMin(r0)
            int r6 = r13.equals
            int r6 = r6 + r3
            r13.equals = r6
            int r7 = r13.FastBitmap$CoordinateSystem
            int r7 = r7 + r3
            r13.FastBitmap$CoordinateSystem = r7
            r0.getMin = r6
            o.ComponentActivity$3 r6 = r13.toString
            androidx.constraintlayout.solver.SolverVariable[] r6 = r6.getMax
            int r7 = r13.equals
            r6[r7] = r0
            r14.getMin = r0
            int r6 = r13.hashCode
            r13.length(r14)
            int r7 = r13.hashCode
            int r6 = r6 + r3
            if (r7 != r6) goto L_0x0181
            o.reportFullyDrawn$length r4 = r13.onRelationshipValidationResult
            r4.length(r14)
            o.reportFullyDrawn$length r4 = r13.onRelationshipValidationResult
            r13.getMax((o.reportFullyDrawn.length) r4)
            int r4 = r0.length
            if (r4 != r5) goto L_0x0182
            androidx.constraintlayout.solver.SolverVariable r4 = r14.getMin
            if (r4 != r0) goto L_0x015f
            r4 = 0
            androidx.constraintlayout.solver.SolverVariable r0 = r14.getMax(r4, r0)
            if (r0 == 0) goto L_0x015f
            o.ComponentActivity$5 r4 = values
            if (r4 == 0) goto L_0x015c
            long r5 = r4.IsOverlapping
            long r5 = r5 + r1
            r4.IsOverlapping = r5
        L_0x015c:
            r14.length((androidx.constraintlayout.solver.SolverVariable) r0)
        L_0x015f:
            boolean r0 = r14.isInside
            if (r0 != 0) goto L_0x0168
            androidx.constraintlayout.solver.SolverVariable r0 = r14.getMin
            r0.length(r13, r14)
        L_0x0168:
            boolean r0 = isInside
            if (r0 == 0) goto L_0x0174
            o.ComponentActivity$3 r0 = r13.toString
            o.ComponentActivity$4$setMin<o.registerForActivityResult> r0 = r0.getMin
            r0.getMin(r14)
            goto L_0x017b
        L_0x0174:
            o.ComponentActivity$3 r0 = r13.toString
            o.ComponentActivity$4$setMin<o.registerForActivityResult> r0 = r0.setMin
            r0.getMin(r14)
        L_0x017b:
            int r0 = r13.hashCode
            int r0 = r0 - r3
            r13.hashCode = r0
            goto L_0x0182
        L_0x0181:
            r3 = 0
        L_0x0182:
            boolean r0 = r14.getMax()
            if (r0 != 0) goto L_0x0189
            return
        L_0x0189:
            r4 = r3
        L_0x018a:
            if (r4 != 0) goto L_0x018f
            r13.length(r14)
        L_0x018f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.reportFullyDrawn.getMin(o.registerForActivityResult):void");
    }

    private final void length(registerForActivityResult registerforactivityresult) {
        int i;
        if (!length || !registerforactivityresult.isInside) {
            this.IsOverlapping[this.hashCode] = registerforactivityresult;
            registerforactivityresult.getMin.length = this.hashCode;
            this.hashCode++;
            registerforactivityresult.getMin.length(this, registerforactivityresult);
        } else {
            registerforactivityresult.getMin.getMax(this, registerforactivityresult.setMin);
        }
        if (length && this.toIntRange) {
            int i2 = 0;
            while (i2 < this.hashCode) {
                if (this.IsOverlapping[i2] == null) {
                    System.out.println("WTF");
                }
                registerForActivityResult[] registerforactivityresultArr = this.IsOverlapping;
                if (registerforactivityresultArr[i2] != null && registerforactivityresultArr[i2].isInside) {
                    registerForActivityResult registerforactivityresult2 = this.IsOverlapping[i2];
                    registerforactivityresult2.getMin.getMax(this, registerforactivityresult2.setMin);
                    if (isInside) {
                        this.toString.getMin.getMin(registerforactivityresult2);
                    } else {
                        this.toString.setMin.getMin(registerforactivityresult2);
                    }
                    this.IsOverlapping[i2] = null;
                    int i3 = i2 + 1;
                    int i4 = i3;
                    while (true) {
                        i = this.hashCode;
                        if (i3 >= i) {
                            break;
                        }
                        registerForActivityResult[] registerforactivityresultArr2 = this.IsOverlapping;
                        int i5 = i3 - 1;
                        registerforactivityresultArr2[i5] = registerforactivityresultArr2[i3];
                        if (registerforactivityresultArr2[i5].getMin.length == i3) {
                            this.IsOverlapping[i5].getMin.length = i5;
                        }
                        i4 = i3;
                        i3++;
                    }
                    if (i4 < i) {
                        this.IsOverlapping[i4] = null;
                    }
                    this.hashCode--;
                    i2--;
                }
                i2++;
            }
            this.toIntRange = false;
        }
    }

    private final int getMax(length length2) {
        ComponentActivity.AnonymousClass5 r0 = values;
        if (r0 != null) {
            r0.isInside++;
        }
        for (int i = 0; i < this.FastBitmap$CoordinateSystem; i++) {
            this.getCause[i] = false;
        }
        boolean z = false;
        int i2 = 0;
        while (!z) {
            ComponentActivity.AnonymousClass5 r6 = values;
            if (r6 != null) {
                r6.toIntRange++;
            }
            i2++;
            if (i2 >= this.FastBitmap$CoordinateSystem * 2) {
                return i2;
            }
            if (length2.length() != null) {
                this.getCause[length2.length().getMin] = true;
            }
            SolverVariable min = length2.setMin(this.getCause);
            if (min != null) {
                if (this.getCause[min.getMin]) {
                    return i2;
                }
                this.getCause[min.getMin] = true;
            }
            if (min != null) {
                float f = Float.MAX_VALUE;
                int i3 = -1;
                for (int i4 = 0; i4 < this.hashCode; i4++) {
                    registerForActivityResult registerforactivityresult = this.IsOverlapping[i4];
                    if (registerforactivityresult.getMin.toFloatRange != SolverVariable.Type.UNRESTRICTED && !registerforactivityresult.isInside && registerforactivityresult.getMax(min)) {
                        float max = registerforactivityresult.length.getMax(min);
                        if (max < 0.0f) {
                            float f2 = (-registerforactivityresult.setMin) / max;
                            if (f2 < f) {
                                i3 = i4;
                                f = f2;
                            }
                        }
                    }
                }
                if (i3 >= 0) {
                    registerForActivityResult registerforactivityresult2 = this.IsOverlapping[i3];
                    registerforactivityresult2.getMin.length = -1;
                    ComponentActivity.AnonymousClass5 r8 = values;
                    if (r8 != null) {
                        r8.IsOverlapping++;
                    }
                    registerforactivityresult2.length(min);
                    registerforactivityresult2.getMin.length = i3;
                    registerforactivityresult2.getMin.length(this, registerforactivityresult2);
                }
            } else {
                z = true;
            }
        }
        return i2;
    }

    private void IsOverlapping() {
        for (int i = 0; i < this.hashCode; i++) {
            registerForActivityResult registerforactivityresult = this.IsOverlapping[i];
            registerforactivityresult.getMin.getMax = registerforactivityresult.setMin;
        }
    }

    public final void setMin(SolverVariable solverVariable, SolverVariable solverVariable2, int i, int i2) {
        registerForActivityResult length2 = length();
        SolverVariable max = setMax();
        max.setMax = 0;
        length2.length(solverVariable, solverVariable2, max, i);
        if (i2 != 8) {
            length2.length.length(setMax(i2), (float) ((int) (length2.length.getMax(max) * -1.0f)));
        }
        getMin(length2);
    }

    public final void getMin(SolverVariable solverVariable, SolverVariable solverVariable2, int i, int i2) {
        registerForActivityResult length2 = length();
        SolverVariable max = setMax();
        max.setMax = 0;
        length2.setMin(solverVariable, solverVariable2, max, i);
        if (i2 != 8) {
            length2.length.length(setMax(i2), (float) ((int) (length2.length.getMax(max) * -1.0f)));
        }
        getMin(length2);
    }

    public final void getMin(SolverVariable solverVariable, SolverVariable solverVariable2, int i, float f, SolverVariable solverVariable3, SolverVariable solverVariable4, int i2, int i3) {
        registerForActivityResult length2 = length();
        if (solverVariable2 == solverVariable3) {
            length2.length.length(solverVariable, 1.0f);
            length2.length.length(solverVariable4, 1.0f);
            length2.length.length(solverVariable2, -2.0f);
        } else if (f == 0.5f) {
            length2.length.length(solverVariable, 1.0f);
            length2.length.length(solverVariable2, -1.0f);
            length2.length.length(solverVariable3, -1.0f);
            length2.length.length(solverVariable4, 1.0f);
            if (i > 0 || i2 > 0) {
                length2.setMin = (float) ((-i) + i2);
            }
        } else if (f <= 0.0f) {
            length2.length.length(solverVariable, -1.0f);
            length2.length.length(solverVariable2, 1.0f);
            length2.setMin = (float) i;
        } else if (f >= 1.0f) {
            length2.length.length(solverVariable4, -1.0f);
            length2.length.length(solverVariable3, 1.0f);
            length2.setMin = (float) (-i2);
        } else {
            float f2 = 1.0f - f;
            length2.length.length(solverVariable, f2 * 1.0f);
            length2.length.length(solverVariable2, f2 * -1.0f);
            length2.length.length(solverVariable3, -1.0f * f);
            length2.length.length(solverVariable4, 1.0f * f);
            if (i > 0 || i2 > 0) {
                length2.setMin = (((float) (-i)) * f2) + (((float) i2) * f);
            }
        }
        if (i3 != 8) {
            length2.getMin(this, i3);
        }
        getMin(length2);
    }

    public final registerForActivityResult getMax(SolverVariable solverVariable, SolverVariable solverVariable2, int i, int i2) {
        if (!getMin || i2 != 8 || !solverVariable2.isInside || solverVariable.length != -1) {
            registerForActivityResult length2 = length();
            boolean z = false;
            if (i != 0) {
                if (i < 0) {
                    i *= -1;
                    z = true;
                }
                length2.setMin = (float) i;
            }
            if (!z) {
                length2.length.length(solverVariable, -1.0f);
                length2.length.length(solverVariable2, 1.0f);
            } else {
                length2.length.length(solverVariable, 1.0f);
                length2.length.length(solverVariable2, -1.0f);
            }
            if (i2 != 8) {
                length2.getMin(this, i2);
            }
            getMin(length2);
            return length2;
        }
        solverVariable.getMax(this, solverVariable2.getMax + ((float) i));
        return null;
    }

    public final void setMin(SolverVariable solverVariable, int i) {
        if (!getMin || solverVariable.length != -1) {
            int i2 = solverVariable.length;
            if (solverVariable.length != -1) {
                registerForActivityResult registerforactivityresult = this.IsOverlapping[i2];
                if (registerforactivityresult.isInside) {
                    registerforactivityresult.setMin = (float) i;
                } else if (registerforactivityresult.length.getMin() == 0) {
                    registerforactivityresult.isInside = true;
                    registerforactivityresult.setMin = (float) i;
                } else {
                    registerForActivityResult length2 = length();
                    if (i < 0) {
                        length2.setMin = (float) (i * -1);
                        length2.length.length(solverVariable, 1.0f);
                    } else {
                        length2.setMin = (float) i;
                        length2.length.length(solverVariable, -1.0f);
                    }
                    getMin(length2);
                }
            } else {
                registerForActivityResult length3 = length();
                length3.getMin = solverVariable;
                float f = (float) i;
                solverVariable.getMax = f;
                length3.setMin = f;
                length3.isInside = true;
                getMin(length3);
            }
        } else {
            float f2 = (float) i;
            solverVariable.getMax(this, f2);
            for (int i3 = 0; i3 < this.equals + 1; i3++) {
                SolverVariable solverVariable2 = this.toString.getMax[i3];
                if (solverVariable2 != null && solverVariable2.toString && solverVariable2.values == solverVariable.getMin) {
                    solverVariable2.getMax(this, solverVariable2.toDoubleRange + f2);
                }
            }
        }
    }

    public static registerForActivityResult setMin(reportFullyDrawn reportfullydrawn, SolverVariable solverVariable, SolverVariable solverVariable2, float f) {
        registerForActivityResult length2 = reportfullydrawn.length();
        length2.length.length(solverVariable, -1.0f);
        length2.length.length(solverVariable2, f);
        return length2;
    }
}
